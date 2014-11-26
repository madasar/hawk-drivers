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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.GoalContainer;

@objid ("27409471-f678-4fe5-b443-f3d418f746a1")
public interface Goal extends AnalystElement {
    @objid ("ed1db523-f505-432e-9be6-e07c1859279c")
    EList<Goal> getSubGoal();

    @objid ("633bf6e3-a79c-4ed1-affd-5743cea043f5")
    <T extends Goal> List<T> getSubGoal(java.lang.Class<T> filterClass);

    @objid ("c85c227d-fd7d-4d2b-95a8-4d1ac8d8bc6f")
    GoalContainer getOwnerContainer();

    @objid ("1c729e29-5805-4173-bb0a-72a00d4a948f")
    void setOwnerContainer(GoalContainer value);

    @objid ("f5d09363-707a-4f51-9895-7dde344c64e3")
    Goal getParentGoal();

    @objid ("69c970c9-3cd0-4b84-a36a-649e69ba3809")
    void setParentGoal(Goal value);

    @objid ("1e9186a0-c6eb-46e1-97a4-fd07e940da21")
    Goal getLastGoalVersion();

    @objid ("526fe449-2d26-4bc0-ac28-cffa1858b74e")
    void setLastGoalVersion(Goal value);

    @objid ("a100989c-b1e2-4e96-8d37-fd8d0179ca47")
    EList<Goal> getArchivedGoalVersion();

    @objid ("0468c4ce-5922-4e63-bc05-795230cf3d1d")
    <T extends Goal> List<T> getArchivedGoalVersion(java.lang.Class<T> filterClass);

}
