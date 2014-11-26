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
 * The thread of profile export
 * @author ebrosse
 */
@objid ("6aa5c5a4-ca06-41c6-ac02-d830bcd1e48c")
public class ExportProfileThread extends AbstractXMIThread implements IRunnableWithProgress {
    @objid ("43b56e41-ede1-4883-aa0e-0766520ae69f")
    private ExportServices service = null;

    /**
     * @param shell The current shell
     * @param progressBar The progress bar of the XMI dialog
     */
    @objid ("f0aecaa8-6da3-4471-9a5a-be0f579bd960")
    public ExportProfileThread(Shell shell) {
        super();
        XMILogs.getInstance().setLogFile(GenerationProperties.getInstance().getFilePath());
        XMILogs.getInstance().setEmpty(true);
        this.service = new ExportServices();
        //this.shell = shell;
    }

    @objid ("c7bb0726-259d-4537-994a-7dd02d905150")
    @Override
    public void run(IProgressMonitor localMonitor) {
        String errorMessage = "";
        Resource resource = null;
        GenerationProperties genProp = GenerationProperties.getInstance();

        try {

           // genProp.setReportModel(ReportManager.getNewReport());
            localMonitor.beginTask(Xmi.I18N.getString("progressBar.content.export.XMIFileInit"),
                    this.service.countModelTrees((genProp.getSelectedPackage())) * 2); 

            resource = this.service.createResource(genProp.getFilePath());

            if (resource != null){

                this.error =  this.service.createEcoreProfile(resource, localMonitor);

                if (!this.error){
                    FormatExport versionExport = genProp.getExportVersion();
                    if (!versionExport.equals(FormatExport.EMF300)){
                        XMIFileUtils.changeToUML(genProp.getFilePath(), genProp.getTempFolder());
                    }  
                }

            }

        } catch (AbortProcessException e) {
            cancelation();
        } catch (Exception e) {
            errorMessage = e.getMessage();
            if (errorMessage == null){
                errorMessage = Xmi.I18N.getString("fileChooser.dialog.export.errorMessage");
            }
            Xmi.LOG.error(e);    

        }finally {
            if (resource != null)
                resource.unload();

            TotalExportMap.getInstance().clear();
            PartialExportMap.getInstance().clear();
        }
    }

}
