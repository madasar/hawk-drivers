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
import org.modelio.metamodel.uml.infrastructure.Element;
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
 * This class is the thread profile imports
 * @author ebrosse
 */
@objid ("0cfa068d-d9f8-4ce9-9839-e549860fca07")
public class ImportProfileThread extends AbstractXMIThread implements IRunnableWithProgress {
    @objid ("4a5e057e-d48f-408a-8293-a1232d113452")
    private ImportServices service = null;

    @objid ("a6e97366-7f4e-4953-8c66-b86cfb8123ca")
    private final Element root;

    /**
     * @param shell The current shell
     * @param progressBar The progress bar of the XMI dialog
     * @param root The profile owner
     */
    @objid ("4204aa46-e72f-4c8c-8e1b-ec15ec924ccd")
    public ImportProfileThread(final Shell shell, final Element root) {
        super();
        XMILogs.getInstance().setLogFile(ReverseProperties.getInstance().getFilePath());
        XMILogs.getInstance().setEmpty(true);
        this.service = new ImportServices();
        this.shell = shell;
        this.root = root;
    }

    @objid ("3678a6c6-e3ee-4401-9277-f01a1623fe6b")
    @Override
    public void run(IProgressMonitor localMonitor) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        Resource resource = null;      
      //  revProp.setReportModel(ReportManager.getNewReport());
        localMonitor.setTaskName(Xmi.I18N
                .getString("progressBar.content.import.XMIFileLoading"));
        
        try {
        
            resource = this.service.getResource(new File(revProp.getFilePath()));
        
            if (resource != null){
                this.error = this.service.importEcoreProfile(resource, this.root, localMonitor, this.shell);
                localMonitor.done();
            }
            
        } catch (AbortProcessException e) {
            cancelation();
            revProp.setRollback(true);
        } catch (Exception e) {
        
            catchException(e.getMessage(), Xmi.I18N.getString("error.import.invalidModel"));
        
            if (resource != null){ 
                File file = new File(resource.getURI().toFileString());
                if (file.exists())
                    file.delete();
            }
        
            Xmi.LOG.error(e);   
            localMonitor.done();
            
        }finally {
            
            if (resource != null)
                resource.unload();
            
            TotalImportMap.getInstance().clear();
            PartialImportMap.getInstance().clear();
        
        }
    }

    @objid ("a2a0e553-1030-4891-8660-7fbfa34c42bd")
    private void catchException(final String messageException, final String msgTitle) {
        this.shell.getDisplay().asyncExec(new Runnable() {
            @Override
            public void run() {
        
                MessageBox messageBox = new MessageBox(ImportProfileThread.this.shell, SWT.ICON_ERROR);
        
                if (messageException != null)
                    messageBox.setMessage(messageException);
        
                messageBox.setText(msgTitle);
                messageBox.open();
        
            }
        });
        
        if (messageException != null)
            Xmi.LOG.error(messageException);  
        
        ReverseProperties.getInstance().setRollback(true);
    }

}
