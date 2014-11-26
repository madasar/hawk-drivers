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
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;

@objid ("0053788e-c4bf-1fd8-97fe-001ec947cd2a")
public interface State extends StateVertex {
    @objid ("679d7a7c-7e0c-4013-bb48-0b7eb8e85ea5")
    EList<ExitPointPseudoState> getExitPoint();

    @objid ("d4eac235-a0bb-4061-9ba7-826c627fd785")
    <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass);

    @objid ("e414490c-7cb8-4613-94c5-a8bd14225f99")
    EList<BpmnDataState> getBpmnDataStateRefs();

    @objid ("de516431-309a-4bf2-bd2d-b4e99d2f7b0b")
    <T extends BpmnDataState> List<T> getBpmnDataStateRefs(java.lang.Class<T> filterClass);

    @objid ("bbe4b4c1-3215-4429-a19a-c51a52b8170b")
    EList<Event> getDeffered();

    @objid ("8d429441-9f46-46f7-8d0e-590ce27851fd")
    <T extends Event> List<T> getDeffered(java.lang.Class<T> filterClass);

    @objid ("6be4f9f5-9607-4002-80dc-6f3e0f0147c6")
    EList<InternalTransition> getInternal();

    @objid ("0843988c-0c53-4fdd-b3ef-6a3f02ee22a2")
    <T extends InternalTransition> List<T> getInternal(java.lang.Class<T> filterClass);

    @objid ("a2395175-c0e7-4f6b-b151-da41747ada07")
    EList<EntryPointPseudoState> getEntryPoint();

    @objid ("a40b49e3-6cb7-424f-b92f-01136d04d733")
    <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass);

    @objid ("ec9776b3-4834-4715-a002-f2c5a616ad7c")
    EList<Region> getOwnedRegion();

    @objid ("7abf2c40-6bbd-4453-9c6e-45ec3f6bd191")
    <T extends Region> List<T> getOwnedRegion(java.lang.Class<T> filterClass);

    @objid ("03fd44d2-ab15-489e-a280-955ea363f333")
    EList<BpmnMessage> getRequiredStateOfBpmnMessage();

    @objid ("4abd81ed-9200-4164-9d9f-95087d513b21")
    <T extends BpmnMessage> List<T> getRequiredStateOfBpmnMessage(java.lang.Class<T> filterClass);

    @objid ("f5e674ec-98a1-45b1-b153-d773d5f501a7")
    EList<ObjectNode> getRequiredStateOf();

    @objid ("f2c391a9-55de-44be-8afa-587f09a1af2a")
    <T extends ObjectNode> List<T> getRequiredStateOf(java.lang.Class<T> filterClass);

    @objid ("d0c858ea-080b-4012-aa66-9d1407f4cf85")
    EList<ConnectionPointReference> getConnection();

    @objid ("c02d3e64-50eb-494a-9f1c-279ed6a305ba")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    @objid ("a0062651-ec63-4435-8f47-e490f3eaff1d")
    StateMachine getSubMachine();

    @objid ("d31337f6-5ccc-4857-897b-5bd7d20196a3")
    void setSubMachine(StateMachine value);

    @objid ("c9ae6ce5-7ef1-4960-86b0-7f87f1c5858b")
    EList<BpmnItemAwareElement> getRequiredStateOfBpmnItem();

    @objid ("a3cdf5b1-454f-46e8-b7a4-0815df1c9125")
    <T extends BpmnItemAwareElement> List<T> getRequiredStateOfBpmnItem(java.lang.Class<T> filterClass);

}
