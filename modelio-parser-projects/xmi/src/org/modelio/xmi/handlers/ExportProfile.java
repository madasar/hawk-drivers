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
                                    

package org.modelio.xmi.handlers;

import java.util.List;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.progress.IProgressService;
//import org.modelio.app.core.navigate.IModelioNavigationService;
//import org.modelio.app.project.core.services.IProjectService;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MStatus;
import org.modelio.xmi.generation.GenerationProperties;
//import org.modelio.xmi.gui.SwtWizardExportProfile;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * @author ebrosse
 */
@objid ("089d4d3c-a60b-4bab-8045-a80237e4fa3b")
public class ExportProfile {
   
    @objid ("ac58d913-caf4-4105-99be-19b5703c46d8")
     Profile selectedProfile = null;

  //  @objid ("b0f35dc9-3434-4c42-b2b9-fd805f4db521")
    @Execute
   /* public void execute(@Named(IServiceConstants.ACTIVE_SHELL) final Shell activeShell, IProgressService progressService, IProjectService projectService, IMModelServices modelServices, IModelioNavigationService navigationService) {
        
        GenerationProperties genProp = GenerationProperties.getInstance();
        genProp.initialize(modelServices);
        genProp.setTimeDisplayerActivated(false);
        genProp.setSelectedPackage(this.selectedProfile);
        genProp.setNavigationServices(navigationService);
        
       // SwtWizardExportProfile dialog = new SwtWizardExportProfile(activeShell, progressService, projectService);
       // dialog.setSelectedElt(this.selectedProfile);
       // dialog.open();
    }*/

    @objid ("9421d2b7-89e4-4a45-9c30-8dbda32ff794")
    @CanExecute
    public boolean isEnabled(@Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        if (selection.size() == 1){         
            if (selection.getFirstElement() instanceof Profile){
                this.selectedProfile = (Profile) selection.getFirstElement();
                final MStatus status =  this.selectedProfile.getStatus();
                return (status.isModifiable());
            }
        }
        return false;
    }

    /**
     * This methods authorizes a command to be displayed in a defined context. The commands are displayed, by default,
     * depending on the kind of metaclass on which the command has been launched.
     * @param selectedElements the selection
     * @return <code>true</code> to display the command, <code>false</code> to hide it.
     */
    @objid ("b3ee6b89-33ca-4f8f-83eb-804114fd2826")
    public static boolean isVisible(List<MObject> selectedElements) {
        return ((! selectedElements.isEmpty())
                && (selectedElements.size() == 1)
                     && (selectedElements.get(0) instanceof Profile));
    }

}
