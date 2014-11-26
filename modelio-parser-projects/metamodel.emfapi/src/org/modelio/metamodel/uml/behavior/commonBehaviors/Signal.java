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
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("00421152-c4bf-1fd8-97fe-001ec947cd2a")
public interface Signal extends GeneralClass {
    @objid ("bff39a5f-2444-4690-a187-330fa1a5d074")
    boolean isIsEvent();

    @objid ("82ace7e2-9220-47f6-9130-a8803c81b933")
    void setIsEvent(boolean value);

    @objid ("0bf3e8c7-30ec-4127-85d7-cb2b5adeff53")
    boolean isIsException();

    @objid ("6be0fdd1-4766-467c-9764-314064340eec")
    void setIsException(boolean value);

    @objid ("6485ea13-8c87-4afa-a010-ccd15d900681")
    EList<SendSignalAction> getSender();

    @objid ("613cc937-e8be-4e78-865f-ac5755251880")
    <T extends SendSignalAction> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("a1efed53-a499-46df-8df5-c1a7d4eefc2f")
    EList<Message> getUsage();

    @objid ("1b7b907d-2441-436f-905f-85933258f8e3")
    <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass);

    @objid ("d9dfacc0-2f37-4e8f-958e-3dd58477c678")
    EList<Transition> getSends();

    @objid ("0bbeb780-6ea4-499e-83ad-c2290c4bc68a")
    <T extends Transition> List<T> getSends(java.lang.Class<T> filterClass);

    @objid ("2048c73f-b948-4715-9b3a-890dc92c90fb")
    Parameter getPBase();

    @objid ("7fa7f1cb-13ba-4f70-a5a8-dca973277f30")
    void setPBase(Parameter value);

    @objid ("295ea4c3-8662-4313-ae02-ffdc288a58ac")
    Operation getOBase();

    @objid ("9992b3a5-97b3-40ca-8b64-c8ea5db28e0c")
    void setOBase(Operation value);

    @objid ("6e686632-548f-4a25-b6ed-22d6b36bfc55")
    EList<CommunicationMessage> getCommunicationUsage();

    @objid ("eae9a6f9-9e19-4e41-844e-0a4d8e927553")
    <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass);

    @objid ("b18e0faf-154d-4ff7-8ce1-425ad91e23ae")
    EList<DataFlow> getDOccurence();

    @objid ("baeed585-e96a-4dbd-8851-b4c4a7d56c99")
    <T extends DataFlow> List<T> getDOccurence(java.lang.Class<T> filterClass);

    @objid ("a2189687-7c26-479c-a642-ff17c7df4500")
    EList<Event> getEOccurence();

    @objid ("10c9f5e7-ff1a-466b-a848-e6648acd1dfd")
    <T extends Event> List<T> getEOccurence(java.lang.Class<T> filterClass);

    @objid ("627e03b7-3218-43b8-9441-a9c7aa68905b")
    GeneralClass getBase();

    @objid ("644863bc-d0e3-4392-a071-0c5c6cf405ff")
    void setBase(GeneralClass value);

    @objid ("4eb384bd-9edf-4172-a49c-9f5ef21024c4")
    EList<AcceptSignalAction> getReceiver();

    @objid ("ffb10eb0-ea8f-446d-b563-dae2a9dd4b1f")
    <T extends AcceptSignalAction> List<T> getReceiver(java.lang.Class<T> filterClass);

}
