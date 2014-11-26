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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("008538a6-c4be-1fd8-97fe-001ec947cd2a")
public interface Constraint extends ModelElement {
    @objid ("856222e5-5dc2-44ce-8d9b-26e56d992f3f")
    String getBaseClass();

    @objid ("0b1938c0-b3af-43a3-af34-00910e3589e4")
    void setBaseClass(String value);

    @objid ("2c168381-3fe4-4b0e-945a-c9af9734af89")
    String getBody();

    @objid ("dd62fc0c-92d5-4276-b154-2fc1f7e60234")
    void setBody(String value);

    @objid ("457dc99e-a8fc-4827-9d00-22e7992ef2df")
    String getLanguage();

    @objid ("6aa11e41-070e-4e70-a151-7883e7d33e0b")
    void setLanguage(String value);

    @objid ("60c52ef3-de0d-4b83-8486-db74b5a589d2")
    EList<ModelElement> getConstrainedElement();

    @objid ("eb8d3e8b-da5c-4641-9ca9-77f7a57b22f0")
    <T extends ModelElement> List<T> getConstrainedElement(java.lang.Class<T> filterClass);

}
