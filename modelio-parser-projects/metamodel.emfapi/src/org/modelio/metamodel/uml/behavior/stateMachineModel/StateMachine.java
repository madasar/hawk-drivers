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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

@objid ("005404fc-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateMachine extends Behavior {
    @objid ("766eaf0a-2ef1-49ed-b67d-85c9339f17e0")
    KindOfStateMachine getKind();

    @objid ("14f36c2f-31e6-465a-bb16-40036d4d7e0c")
    void setKind(KindOfStateMachine value);

    @objid ("b65facdd-fad8-47f1-9d12-38c6360d69b7")
    Region getTop();

    @objid ("805d719b-da03-4628-8e75-da623b3c95c0")
    void setTop(Region value);

    @objid ("3caa2ef9-d583-4f1c-91b9-c6dc6dd0c43f")
    EList<State> getSubmachineState();

    @objid ("10d7bc10-cc65-4d09-8c1c-9b77452ff379")
    <T extends State> List<T> getSubmachineState(java.lang.Class<T> filterClass);

    @objid ("b7dba46d-0bf9-4f7f-a730-eecd1aab03f6")
    EList<EntryPointPseudoState> getEntryPoint();

    @objid ("a054d5c6-341e-439a-85ef-147d54813483")
    <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass);

    @objid ("26e4dddc-1d9a-4c5b-8a06-a2089878a6cd")
    EList<ExitPointPseudoState> getExitPoint();

    @objid ("5ee21dd2-68a2-465f-ba2e-b061b11432d3")
    <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass);

}
