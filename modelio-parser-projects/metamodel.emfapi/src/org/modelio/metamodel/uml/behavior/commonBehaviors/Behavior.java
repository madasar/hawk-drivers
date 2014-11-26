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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00409570-c4bf-1fd8-97fe-001ec947cd2a")
public interface Behavior extends ModelElement {
    @objid ("119f941e-f97a-4296-9a44-7a233cbd7292")
    boolean isIsReentrant();

    @objid ("9481a773-e81b-4012-942c-f5ab958bb600")
    void setIsReentrant(boolean value);

    @objid ("44fb7fe0-dc58-4c44-9e5d-935666daeedd")
    EList<BpmnCallActivity> getBpmnCaller();

    @objid ("a3e87287-7f06-4760-b97c-94ca2639a643")
    <T extends BpmnCallActivity> List<T> getBpmnCaller(java.lang.Class<T> filterClass);

    @objid ("f30325e0-0939-4c73-a694-e0a2f082705d")
    NameSpace getOwner();

    @objid ("4ea0ae80-e311-423b-b51d-0a55b4b46d56")
    void setOwner(NameSpace value);

    @objid ("34b5e054-0ff0-4de0-aa73-139325ac1ce6")
    EList<BehaviorParameter> getParameter();

    @objid ("00ba11f2-b5d8-4f45-8ca2-5fbd9331e5d6")
    <T extends BehaviorParameter> List<T> getParameter(java.lang.Class<T> filterClass);

    @objid ("8cbd9abb-1c5b-4160-8dae-5bc3ec7ca8a0")
    Operation getOwnerOperation();

    @objid ("b8e6886d-93a9-47ea-91a6-71f72f371daf")
    void setOwnerOperation(Operation value);

    @objid ("37746880-b442-4728-bd23-10b8999027ce")
    EList<Collaboration> getOwnedCollaboration();

    @objid ("cc8d6ce4-2846-4247-85e7-49b85d9a6438")
    <T extends Collaboration> List<T> getOwnedCollaboration(java.lang.Class<T> filterClass);

    @objid ("70c5e9df-7b50-47ec-8c20-8147399e33ed")
    EList<CallBehaviorAction> getCaller();

    @objid ("a5a048eb-3dc6-419b-947a-aa38b7fe77ad")
    <T extends CallBehaviorAction> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("b7a98266-fef1-4025-a4d7-c43c8deb7200")
    EList<Event> getEComponent();

    @objid ("e8f1bc64-26d3-4a63-b31e-4de007f9e9d7")
    <T extends Event> List<T> getEComponent(java.lang.Class<T> filterClass);

    @objid ("25117a4f-8e1f-45ba-b099-affe18d64795")
    EList<Transition> getEffectOf();

    @objid ("5186ca79-9dde-4a06-b19d-55765dedec4a")
    <T extends Transition> List<T> getEffectOf(java.lang.Class<T> filterClass);

}
