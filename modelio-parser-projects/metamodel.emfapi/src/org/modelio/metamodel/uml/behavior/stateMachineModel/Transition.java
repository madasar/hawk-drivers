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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("0055b6a8-c4bf-1fd8-97fe-001ec947cd2a")
public interface Transition extends ModelElement {
    @objid ("1ce6922f-c68d-4f24-bb5d-112dbf2b18ba")
    String getEffect();

    @objid ("689f80e0-818d-4aee-b1cf-dba76d0a324f")
    void setEffect(String value);

    @objid ("ce9fba0b-52b4-47be-8945-71d70eafbe25")
    String getReceivedEvents();

    @objid ("73fc8028-b44f-4eb8-943d-10211022bb7f")
    void setReceivedEvents(String value);

    @objid ("b361b481-2b23-4001-83d3-badf7a0f760c")
    String getSentEvents();

    @objid ("1a29fd1e-ace0-4f71-9045-a814e59190cf")
    void setSentEvents(String value);

    @objid ("ca5ca1e3-4709-463f-aa71-398ee16962a3")
    String getGuard();

    @objid ("be716914-6c67-400e-8367-3217b0a5cc37")
    void setGuard(String value);

    @objid ("8e3eb54a-d8aa-42c1-abb5-4da56472f1ab")
    String getPostCondition();

    @objid ("44f5760b-ced4-4100-accc-d14831532c23")
    void setPostCondition(String value);

    @objid ("676663bb-d65d-4095-8cd0-2cea80e649c1")
    Operation getProcessed();

    @objid ("6a4479d7-51c7-4f99-8451-bc019fed9bbd")
    void setProcessed(Operation value);

    @objid ("174065b0-e5c5-49ed-94e5-5d88dbc7d4d8")
    Event getTrigger();

    @objid ("70c4e1c6-ae4b-492a-ab1d-599dcdb3a1b7")
    void setTrigger(Event value);

    @objid ("3be5c3fe-a285-4556-81ce-0c714c09eb75")
    Behavior getBehaviorEffect();

    @objid ("7082b12c-c38e-4498-9f57-73806812ab39")
    void setBehaviorEffect(Behavior value);

    @objid ("dc3140d1-db72-434e-b136-2e03766f6bb1")
    StateVertex getTarget();

    @objid ("9500f96a-164f-4c29-bf91-04a4e04efaf4")
    void setTarget(StateVertex value);

    @objid ("7d9eccd7-44c7-4a4e-9d10-61a23f3fc7a7")
    StateVertex getSource();

    @objid ("c6d25b9e-928f-4139-b204-d7611594352d")
    void setSource(StateVertex value);

    @objid ("ed06e8c6-d4c3-44eb-bf9f-a49a93c75f4f")
    Signal getEffects();

    @objid ("a7e3e7b5-b728-4916-9253-e7992231260a")
    void setEffects(Signal value);

}
