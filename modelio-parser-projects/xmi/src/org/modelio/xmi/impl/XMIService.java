/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  


package org.modelio.xmi.impl;

import java.io.File;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.app.navigation.INavigationService;
import org.modelio.api.model.IUmlModel;
import org.modelio.api.module.IModule;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.api.ExportConfiguration;
import org.modelio.xmi.api.FormatExport;
import org.modelio.xmi.api.IXMIService;
import org.modelio.xmi.api.ImportConfiguration;
import org.modelio.xmi.generation.ExportServices;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.ImportServices;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.util.AbortProcessException;
import org.modelio.xmi.util.XMIFileUtils;
import org.modelio.xmi.util.XMILogs;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class implements the services provided by XMI
 * @author ebrosse
 */
@objid ("f00a8a73-a896-45bb-8fd1-659d9d7ffd45")
public class XMIService implements IXMIService {
    @objid ("41ca83f5-53ac-4f40-8b67-024028290836")
    private ImportServices importService = null;

    @objid ("3b12b4f2-ddf6-4520-b9f6-7185b058b9a3")
    private ExportServices exportService = null;

    @objid ("d6992648-03fe-45e2-8516-e6ac2ac98026")
    private void cancelProcess(Shell shell) {
        if ((shell != null) && (!System.getProperty("os.name").equals("Linux"))) {
            shell.dispose();
        }

        Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("info.import.result_failed"));
    }

    @objid ("c172d488-4dab-4ea0-b7db-e65a4ef210c1")
    private void exportModel(final ExportConfiguration configuration, IProgressMonitor monitor) {
        Shell shell = null;
        GenerationProperties genProp = GenerationProperties.getInstance();
        try {

            String xmiFilePath = configuration.getXmiFile().getAbsolutePath() ;
            genProp.setSelectedPackage(configuration.getEntryPoint());
            genProp.setRoundtripEnabled(configuration.exportedAnotation());

            Resource resource = this.exportService.createResource(xmiFilePath);
            
            if (resource != null) {
                this.exportService.createEcoreModel(resource, monitor);

                if (!configuration.getVersionExport().equals(FormatExport.EMF300))
                    XMIFileUtils.changeToUML(xmiFilePath,genProp.getTempFolder() );

                Xmi.LOG.error(Xmi.I18N.getString("info.export.result_done"));
            }
            
        } catch (AbortProcessException e) {
            cancelProcess(shell);
        } catch (Exception e) {
            cancelProcess(shell);
            Xmi.LOG.error(e);
        } finally {
            XMILogs logs = XMILogs.getInstance();
            logs.saveLog();
        }
    }

    @objid ("3bef3178-045c-4eb1-84ab-13ac13fa4462")
    @Override
    public void exportXMIFile(final ExportConfiguration configuration, IProgressMonitor monitor, IMModelServices mmService) throws Exception {
        if (configuration.getEntryPoint() == null) {
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.nullGivenParameter"));
        } else {
            if (configuration.getXmiFile() != null) {
                initExportService(configuration.getEntryPoint(), mmService, configuration.getXmiFile());              
                exportModel(configuration, monitor);
            } else {
                Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.invalidFilePath"));
            }
        }
    }

    @objid ("708692ba-0a7b-4ac7-8376-015c89fa18b9")
    private boolean importModel(File xmiFile, MObject owner, IProgressMonitor localMonitor) {
        boolean error = false;
        Shell shell = Display.getDefault().getActiveShell();
        try(ITransaction t = GProject.getProject(owner).getSession().getTransactionSupport().createTransaction("Import") ) {

            Resource resource = this.importService.getResource(xmiFile);

            if ((resource != null)) {
                error = this.importService.importEcoreModel(resource, shell, localMonitor);
            }
            t.commit();

        } catch (Exception e) {
            error = true;
            Xmi.LOG.error(Xmi.PLUGIN_ID, e);
        } finally {
            XMILogs logs = XMILogs.getInstance();
            logs.saveLog();
        }
        return error;
    }

    @objid ("52d1a467-d5d9-4bff-ad95-1813be619061")
    private void initExportService(Package entryPoint, IMModelServices mmService, File xmiFile) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        genProp.initialize(mmService);
        genProp.setTimeDisplayerActivated(false);
        genProp.setSelectedPackage(entryPoint);
        genProp.setFilePath(xmiFile);

        if (this.exportService == null)
            this.exportService = new ExportServices();
    }

    @objid ("20b6436b-bd18-4bb7-bfea-c3e94724baa9")
    private void initImportService(IMModelServices mmService) {
        ReverseProperties.getInstance().initialize(mmService);
        if (this.importService == null)
            this.importService = new ImportServices();
    }

    @objid ("2aee3059-41b4-4fb3-b908-cb359d33485d")
    @Override
    public void importXMIModel(final ImportConfiguration configuration, IProgressMonitor monitor, IMModelServices mmService) {
        if ((configuration.getXmiFile() != null) 
                && (configuration.getXmiFile().isFile())) {
            initImportService(mmService);
            ReverseProperties.getInstance().setUMLRoot((Package)configuration.getOwner());
            importModel(configuration.getXmiFile(), configuration.getOwner(), monitor);
        } else {
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.invalidFilePath"));
        }
    }

    @objid ("b3a3e446-0248-4c94-a593-9ca97b3ec5a4")
    @Override
    public void importXMIProfile(final ImportConfiguration configuration, IProgressMonitor monitor, IMModelServices mmService) {
        if(configuration.getOwner() != null && configuration.getOwner() instanceof IModule){
            if (configuration.getXmiFile() != null && configuration.getXmiFile().isFile()) {
                initImportService(mmService);
                importProfile(configuration.getXmiFile(), configuration.getOwner(), monitor );
            } else {
                Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.invalidFilePath"));
            }
        }else{
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.invalidOwner"));

        }
    }

    @objid ("9794308c-aca2-4f51-9bfb-8ae030ae70d8")
    @Override
    public void exportXMIProfile(final ExportConfiguration configuration, IProgressMonitor monitor, IMModelServices mmService) throws Exception {
        if (configuration.getEntryPoint() == null || !(configuration.getEntryPoint() instanceof Profile)) {
            Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.nullGivenParameter"));
        } else {
            if (configuration.getXmiFile() != null) {
                initExportService(configuration.getEntryPoint(), mmService, configuration.getXmiFile());
                exportProfile(configuration, monitor);        
            } else {
                Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("error.invalidFilePath"));
            }
        }
    }

    @objid ("bb172e86-1bb7-4d28-8da3-0ee4eb8b0169")
    private void exportProfile(final ExportConfiguration configuration, IProgressMonitor monitor) {
        Shell shell = null;
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        try {      
            String xmiFilePath = configuration.getXmiFile().getAbsolutePath() ;
            genProp.setSelectedPackage(configuration.getEntryPoint());
            genProp.setRoundtripEnabled(configuration.exportedAnotation());

            Resource resource = this.exportService.createResource(xmiFilePath);

            if (resource != null){
                this.exportService.createEcoreProfile(resource, monitor);

                if (!configuration.getVersionExport().equals(FormatExport.EMF300))
                    XMIFileUtils.changeToUML(xmiFilePath, genProp.getTempFolder());

                Xmi.LOG.error(Xmi.PLUGIN_ID, Xmi.I18N.getString("info.export.result_done"));
            }
        } catch (AbortProcessException e) {
            cancelProcess(shell);
        } catch (Exception e) {
            cancelProcess(shell);
            Xmi.LOG.error(e);
        } finally {
            XMILogs logs = XMILogs.getInstance();
            logs.saveLog();
        }
    }

    @objid ("249d893d-451a-491a-9cbf-64a3dbe2ed94")
    private boolean importProfile(final File xmiFile, final MObject module, IProgressMonitor localMonitor) {
        boolean error = false;

        Shell shell = Display.getDefault().getActiveShell();
        try(ITransaction t = GProject.getProject(module).getSession().getTransactionSupport().createTransaction("Import") ) {

            Resource resource = this.importService.getResource(xmiFile);

            if ((resource != null)) {
                error = this.importService.importEcoreProfile(resource, module, localMonitor, shell);
            }
            t.commit();
        } catch (AbortProcessException e) {
            // cancelProcess(shell);
        } catch (Exception e) {
            error = true;
            // cancelProcess(shell);
            Xmi.LOG.error(e);
        } finally {
            XMILogs logs = XMILogs.getInstance();
            logs.saveLog();
        }
        return error;
    }

}
