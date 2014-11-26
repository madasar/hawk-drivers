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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Goal;

@objid ("37c1a4e9-5d7e-4442-9d86-e66dd60b684c")
public interface GoalContainer extends AnalystContainer {
    @objid ("cb081a73-287e-4b19-911e-2ed708e6daad")
    EList<Goal> getOwnedGoal();

    @objid ("55177c39-9bd8-4771-808e-33a6c83eed67")
    <T extends Goal> List<T> getOwnedGoal(java.lang.Class<T> filterClass);

    @objid ("d024386b-401a-4a75-b2ff-867578035186")
    GoalContainer getOwnerContainer();

    @objid ("86f04197-d0a9-481e-9876-d998169827aa")
    void setOwnerContainer(GoalContainer value);

    @objid ("b0ccfc9f-24b9-464e-97d2-9e1cb5276387")
    EList<GoalContainer> getOwnedContainer();

    @objid ("096f2bfb-12e1-4aa3-a316-b16f860c53bb")
    <T extends GoalContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("da6bb78d-ac5f-4ef1-817b-8c4e1e347719")
    AnalystProject getOwnerProject();

    @objid ("84402a45-2b07-451e-aff4-0411f826fd01")
    void setOwnerProject(AnalystProject value);

}
