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
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0054944e-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateVertex extends ModelElement {
    @objid ("2d67aee5-463f-4335-bd8f-48c992fd0cf4")
    EList<Transition> getOutGoing();

    @objid ("18a6c62f-a6d8-4fda-bdcd-9975b34015d3")
    <T extends Transition> List<T> getOutGoing(java.lang.Class<T> filterClass);

    @objid ("67d4baba-0b09-478d-baf0-4db9d848ade5")
    EList<Transition> getIncoming();

    @objid ("73c0cb0f-53fd-4da0-ade3-3b785c6e25f0")
    <T extends Transition> List<T> getIncoming(java.lang.Class<T> filterClass);

    @objid ("353ce245-f7f9-47ba-99df-124191782902")
    Region getParent();

    @objid ("d45daf14-456c-497d-9149-fe9731ae13ae")
    void setParent(Region value);

}
