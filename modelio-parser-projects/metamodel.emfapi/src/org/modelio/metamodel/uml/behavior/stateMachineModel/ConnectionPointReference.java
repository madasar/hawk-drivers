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
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

@objid ("004e3efa-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConnectionPointReference extends StateVertex {
    @objid ("71389258-3f6b-43fc-90bc-ed52784fb229")
    ExitPointPseudoState getExit();

    @objid ("8f5ad486-2ca7-4ed5-a1ff-3b8f97e6fd2b")
    void setExit(ExitPointPseudoState value);

    @objid ("32740103-dca2-49a8-b8cb-93efbdb70127")
    EntryPointPseudoState getEntry();

    @objid ("bfadb0de-a7cd-4850-9e2a-8ed25c042a6c")
    void setEntry(EntryPointPseudoState value);

    @objid ("a836159d-4821-4c25-8939-09bc986e87c3")
    State getOwnerState();

    @objid ("9705d99c-ee05-4884-b14f-dac2e10ef4fe")
    void setOwnerState(State value);

}
