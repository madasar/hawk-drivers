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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.flows;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("007be7e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessage extends BpmnRootElement {
    @objid ("105aa092-713a-4855-929a-28221fb083ff")
    GeneralClass getType();

    @objid ("be994c32-9a9f-44c9-abd1-02852554a1b3")
    void setType(GeneralClass value);

    @objid ("ea145c6d-0b00-4614-9760-91f2219dedbf")
    EList<BpmnOperation> getOutputMessage();

    @objid ("f51eeccb-8e41-40fb-bbfc-fa65b5035f73")
    <T extends BpmnOperation> List<T> getOutputMessage(java.lang.Class<T> filterClass);

    @objid ("933d0e8b-1055-4f6b-ab0d-437d4ed06dd4")
    BpmnItemDefinition getItemRef();

    @objid ("a722e080-832a-4281-8ef0-ec0a597e4815")
    void setItemRef(BpmnItemDefinition value);

    @objid ("cfb382e6-f04a-4917-8652-fed3516d4a2e")
    State getInState();

    @objid ("c6a3f5db-226b-4691-9513-66f13237788a")
    void setInState(State value);

    @objid ("9f9ab478-2b9c-4b2b-a486-5d291cf8cb38")
    EList<BpmnMessageEventDefinition> getEventDefinition();

    @objid ("d6f494a8-899c-495f-8ddf-94c93d8cbc11")
    <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass);

    @objid ("64c08e05-94ce-4567-acd6-d6b759d13570")
    EList<BpmnSendTask> getSender();

    @objid ("337ec4bb-a459-4274-a6b0-fb4745d65570")
    <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("fd13ae1e-fdb0-4b61-aa18-6909a3e652cd")
    EList<BpmnOperation> getInputMessage();

    @objid ("8d47a95c-4069-4edc-9d0a-7282dd1ad946")
    <T extends BpmnOperation> List<T> getInputMessage(java.lang.Class<T> filterClass);

    @objid ("46823f87-0a0e-49f9-b754-911932d7b36d")
    EList<BpmnReceiveTask> getReceiver();

    @objid ("55ed0375-5d29-4e66-96e0-9e35dcd3fe92")
    <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass);

    @objid ("f7045f5a-9c70-4a6c-967b-fae53987e962")
    EList<BpmnMessageFlow> getMessageFlow();

    @objid ("8b3360c7-b8da-4c1d-9064-c7a083578eb5")
    <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass);

}
