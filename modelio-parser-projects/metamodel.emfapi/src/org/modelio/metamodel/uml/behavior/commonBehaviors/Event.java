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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00428d1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Event extends ModelElement {
    @objid ("77dbe1ec-d7ca-4c17-97df-29695a2c433e")
    String getExpression();

    @objid ("5f1b6722-ed0e-4344-925a-9eded2a70b78")
    void setExpression(String value);

    @objid ("92d6cae4-f8ab-46f6-9540-c2bc7f227fb2")
    EventType getKind();

    @objid ("f7018fce-b798-4655-b7ac-6d85e7d4d09c")
    void setKind(EventType value);

    @objid ("5512e28e-cf9c-49cd-b28e-fc65cbed6f29")
    EList<Transition> getTriggered();

    @objid ("21aed363-c254-40e0-836b-b4ed055fd479")
    <T extends Transition> List<T> getTriggered(java.lang.Class<T> filterClass);

    @objid ("6b58c23c-9aa7-4cad-ab05-a11d2864e320")
    Signal getModel();

    @objid ("b35f9a44-d281-45b1-b58e-5291964b976e")
    void setModel(Signal value);

    @objid ("2fb042b3-c8e1-4de2-a5da-35d6574cfa55")
    EList<State> getOrigin();

    @objid ("56086313-b540-411a-b9bb-b203d5a59bf8")
    <T extends State> List<T> getOrigin(java.lang.Class<T> filterClass);

    @objid ("3f874566-052c-4679-b838-3960426add3c")
    Operation getCalled();

    @objid ("a02587b0-aeaa-4d8e-81a8-6fb86c6d5f86")
    void setCalled(Operation value);

    @objid ("9b717b13-1237-426f-9874-72654517f55b")
    Behavior getComposed();

    @objid ("7a01393d-362a-45bb-907a-b0ba695927df")
    void setComposed(Behavior value);

}
