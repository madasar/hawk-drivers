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


package org.modelio.xmi.thread;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.modelio.xmi.api.FormatExport;
import org.modelio.xmi.generation.ExportServices;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.generation.PartialExportMap;
import org.modelio.xmi.generation.TotalExportMap;
//import org.modelio.xmi.gui.report.ReportManager;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.AbortProcessException;
import org.modelio.xmi.util.XMIFileUtils;
import org.modelio.xmi.util.XMILogs;

/**
 * The thread of XMI model export
 * @author ebrosse
 */
@objid ("53dcd90c-35a3-4d31-a25f-32dcbfd24b02")
public class ExportThread extends AbstractXMIThread implements IRunnableWithProgress {
    @objid ("4419a151-4ff9-4837-8b24-8c27518eaf1e")
    private ExportServices service = null;


    @objid ("ff5f0817-5d00-4482-9e76-775d38a9ee6a")
    @Override
    public void run(IProgressMonitor localMonitor) {
        String errorMessage = "";
        Resource resource = null;
        GenerationProperties genProp = GenerationProperties.getInstance();

        //genProp.setReportModel(ReportManager.getNewReport());
        
        localMonitor.beginTask(Xmi.I18N.getString("progressBar.content.export.XMIExport"), 
                this.service.countModelTrees(genProp.getSelectedPackage()) * 2);

        localMonitor.subTask(Xmi.I18N.getString("progressBar.content.export.XMIFileInit"));

        try {
          
            resource = this.service.createResource(genProp.getFilePath());
            
            if (resource != null){
                this.error = this.service.createEcoreModel(resource, localMonitor);
            }

            if (!this.error){
                FormatExport versionExport = genProp.getExportVersion();
                if (!versionExport.equals(FormatExport.EMF300))
                    XMIFileUtils.changeToUML(genProp.getFilePath(), genProp.getTempFolder());                     
            }

        } catch (AbortProcessException e) {
            cancelation();
        } catch (Exception e) {
            errorMessage = e.getMessage();
            if (errorMessage == null){
                errorMessage = Xmi.I18N.getString("fileChooser.dialog.export.errorMessage");
            }

            Xmi.LOG.error(e);
        } finally {
            if (resource != null)
                resource.unload();
            TotalExportMap.getInstance().clear();
            PartialExportMap.getInstance().clear(); 
        }
    }

    /**
     * @param shell the current shell
     * @param progressBar the progress bar of the XMI dialog
     */
    @objid ("6b6bf18c-e2e7-4102-a463-862e6b2743be")
    public ExportThread(Shell shell) {
        super();
        XMILogs.getInstance().setLogFile(GenerationProperties.getInstance().getFilePath());
        XMILogs.getInstance().setEmpty(true);
        this.service = new ExportServices();
        //this.shell = shell;
    }

}
