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
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0056e10e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Region extends ModelElement {
    @objid ("8e80ca00-268f-46f2-beba-ccea77148cff")
    State getParent();

    @objid ("5ca97236-a969-4068-b07c-aed35540c34c")
    void setParent(State value);

    @objid ("c9e74f0a-bf27-4e26-8515-46f411f22f92")
    StateMachine getRepresented();

    @objid ("1ef48ea1-0bad-4077-84ad-1222d9f8982a")
    void setRepresented(StateMachine value);

    @objid ("236751b6-e5f1-4477-8d46-1453eea4d25d")
    EList<StateVertex> getSub();

    @objid ("c743a5c0-b6fc-4513-aec7-a0ae2ba6cadb")
    <T extends StateVertex> List<T> getSub(java.lang.Class<T> filterClass);

}
