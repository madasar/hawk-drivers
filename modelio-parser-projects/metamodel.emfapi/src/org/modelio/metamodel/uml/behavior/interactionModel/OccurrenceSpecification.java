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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;

@objid ("004a586c-c4bf-1fd8-97fe-001ec947cd2a")
public interface OccurrenceSpecification extends InteractionFragment {
    @objid ("1f8a7ca5-9330-4280-9afe-a2dbab475ea2")
    EList<GeneralOrdering> getToAfter();

    @objid ("9d176c7d-e8b9-4afc-95e2-4a49c95f7eb7")
    <T extends GeneralOrdering> List<T> getToAfter(java.lang.Class<T> filterClass);

    @objid ("2c68d33a-81c1-406c-9805-d79c72fdecc5")
    EList<GeneralOrdering> getToBefore();

    @objid ("c1803360-e6d7-4539-b6fb-2290eca7088a")
    <T extends GeneralOrdering> List<T> getToBefore(java.lang.Class<T> filterClass);

}
