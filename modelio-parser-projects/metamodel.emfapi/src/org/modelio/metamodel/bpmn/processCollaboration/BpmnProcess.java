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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcessType;
import org.modelio.metamodel.bpmn.processCollaboration.OptionalBoolean;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;

@objid ("00762104-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnProcess extends BpmnRootElement {
    @objid ("63510a39-6e8e-418e-916b-2fc3818b34cb")
    BpmnProcessType getProcessType();

    @objid ("ea04ca93-8275-4e9a-8374-b6cbbcc6358b")
    void setProcessType(BpmnProcessType value);

    @objid ("43a58b9b-5bb1-4103-b354-7ffa9aa4ac89")
    boolean isIsClosed();

    @objid ("324d8d3f-94f0-4d9f-a530-160816795aa3")
    void setIsClosed(boolean value);

    @objid ("daa0c04c-1edf-4eb9-b383-7fbb91191e9f")
    OptionalBoolean getIsExecutable();

    @objid ("14ebadb3-3060-4aff-a81e-49f1db444748")
    void setIsExecutable(OptionalBoolean value);

    @objid ("8f2c31f1-54ac-4aaa-8524-89914ecb1026")
    EList<BpmnCallActivity> getCaller();

    @objid ("2bdaaa39-702e-4d43-a66d-58c3ebca54a8")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("6fc284fb-ef62-40ee-bb9b-b2ed873a26b8")
    EList<BpmnProcess> getSupports();

    @objid ("50e08869-ede7-4e6a-ae8a-2bda938f8372")
    <T extends BpmnProcess> List<T> getSupports(java.lang.Class<T> filterClass);

    @objid ("48bb23e2-f1ba-410b-b69d-e7efaad80c06")
    EList<BpmnArtifact> getArtifact();

    @objid ("a0d7b1af-9901-4728-ba98-97445be5047c")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("44dcb150-d029-41db-827e-b73b3965a67f")
    EList<BpmnLaneSet> getLaneSet();

    @objid ("9a5ce9ed-dceb-40c0-bcc1-2bc088be5fce")
    <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass);

    @objid ("1f86769f-6675-41a9-8675-62cb436814cf")
    EList<BpmnProcess> getSupported();

    @objid ("5f05871a-6d93-4380-92ee-87b147027fef")
    <T extends BpmnProcess> List<T> getSupported(java.lang.Class<T> filterClass);

    @objid ("1323a776-ec89-492a-beb4-5c07fab05117")
    BpmnParticipant getParticipant();

    @objid ("35b1e7cd-4ba3-448a-b6fa-b9e07bca490d")
    void setParticipant(BpmnParticipant value);

    @objid ("5a6211bb-f1e4-4613-862f-1372cd523734")
    EList<BpmnFlowElement> getFlowElement();

    @objid ("f2fbf809-9c1d-418f-abcd-c040d29a6ec2")
    <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass);

    @objid ("48fa6106-1844-4f64-b087-55fdfbbb7798")
    EList<BpmnResourceRole> getResource();

    @objid ("53cfbf2e-dc6a-45a3-a966-7ec0317efdfd")
    <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass);

}
