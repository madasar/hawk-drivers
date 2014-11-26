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

import java.io.File;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
//import org.modelio.xmi.gui.report.ReportManager;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.ImportServices;
import org.modelio.xmi.reverse.PartialImportMap;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.reverse.TotalImportMap;
import org.modelio.xmi.util.AbortProcessException;
import org.modelio.xmi.util.XMILogs;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class is the Thread of Model import
 * @author ebrosse
 */
@objid ("f3f0d1d9-13b8-4f9a-b742-fd3ab0c9354b")
public class ImportThread extends AbstractXMIThread implements IRunnableWithProgress {
    @objid ("e15f9a74-8712-4430-b29b-3b1c2e147e5c")
    private ImportServices service = null;

    @objid ("e6feaf6c-40da-4908-bc6b-972030312c5b")
    @Override
    public void run(IProgressMonitor localMonitor) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        //revProp.setReportModel(ReportManager.getNewReport());
        localMonitor.setTaskName(Xmi.I18N
                .getString("progressBar.content.import.XMIFileLoading"));
        
        Resource resource = null;
        // loading resource
        try {          
        
            resource = this.service.getResource(new File(revProp.getFilePath()));
        
            if (resource != null){
                this.error = this.service.importEcoreModel(resource, this.shell, localMonitor); 
               
            }
        
        } catch (AbortProcessException e) {
            cancelation();
            ReverseProperties.getInstance().setRollback(true);
        } catch (Exception e) {
            Xmi.LOG.error(e);     
        
            catchException(e.getMessage(), Xmi.I18N.getString("error.import.invalidModel"));
        
            if ((resource != null) && (resource.getURI().toFileString().endsWith(".emf"))){ 
                File file = new File(resource.getURI().toFileString());
                if (file.exists())
                    file.delete();
        
            }
        
        
        } finally {
            localMonitor.done();
            if (resource != null)
                resource.unload();
            TotalImportMap.getInstance().clear();
            PartialImportMap.getInstance().clear();
        }
    }

    /**
     * @param shell The curernt shell
     * @param progressBar The progress bar of the XMI dialog
     */
    @objid ("f63992aa-bc49-4671-82da-82e99f25eb20")
    public ImportThread(Shell shell) {
        super();
        XMILogs.getInstance().setLogFile(ReverseProperties.getInstance().getFilePath());
        XMILogs.getInstance().setEmpty(true);
        this.service = new ImportServices();
        this.shell = shell;
    }

    @objid ("5b1f5e90-6987-4f26-a52b-7f90fed055ee")
    private void catchException(final String messageException, final String titleException) {
        this.shell.getDisplay().asyncExec(new Runnable() {
             @Override
            public void run() {
                MessageBox messageBox = new MessageBox(ImportThread.this.shell , SWT.ICON_ERROR);
        
                if (messageException != null)
                    messageBox.setMessage(messageException);
        
                messageBox.setText(titleException);
                messageBox.open();
        
            }
        });
        
        if (messageException != null)
            Xmi.LOG.error(Xmi.PLUGIN_ID, messageException);     
        
        ReverseProperties.getInstance().setRollback(true);
    }

}
