/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.module.contrib;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.modelio.api.module.commands.IModuleAction;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("b7c1ca90-0e9d-11e0-8636-001ec947cd2a")
public class ModuleActionDelegatingHandler extends AbstractHandler {
    @objid ("b7c1ca91-0e9d-11e0-8636-001ec947cd2a")
    private IModuleAction moduleAction;

    @objid ("b7c1ca95-0e9d-11e0-8636-001ec947cd2a")
    @Override
    @Execute
    public Object execute(ExecutionEvent event) throws ExecutionException {
        this.moduleAction.getCommand().actionPerformed(getSelectedElements(), this.moduleAction.getModule());
        return null;
    }

    @objid ("b7c1ca9b-0e9d-11e0-8636-001ec947cd2a")
    @Override
    @CanExecute
    public boolean isEnabled() {
        List<MObject> selectedElements = getSelectedElements();
        // TODO check this concept of 'readonlytool' ???
        return this.moduleAction.isActiveFor(selectedElements.toArray(new MObject[selectedElements.size()]), false);
    }

    @objid ("b7c42cee-0e9d-11e0-8636-001ec947cd2a")
    private static List<MObject> getSelectedElements() {
        List<MObject> selectedElements = new ArrayList<>();
        // TODO get modelio selection
        // ISelection selection =
        // PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
        // if (selection instanceof IStructuredSelection) {
        // for (Object selectedObject : ((IStructuredSelection) selection).toList()) {
        // if (selectedObject instanceof IAdaptable) {
        // MObject element = (MObject) ((IAdaptable) selectedObject).getAdapter(MObject.class);
        // if (element != null)
        // selectedElements.add(element);
        // }
        // }
        // }
        return selectedElements;
    }

    @objid ("64caee6f-0e2a-11e2-baba-001ec947c8cc")
    public void setModuleAction(IModuleAction moduleAction) {
        this.moduleAction = moduleAction;
    }

}
