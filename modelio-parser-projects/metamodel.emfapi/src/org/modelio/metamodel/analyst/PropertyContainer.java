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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;

@objid ("0062d8ba-c4bf-1fd8-97fe-001ec947cd2a")
public interface PropertyContainer extends ModelElement {
    @objid ("d30e85f5-c70a-4361-86d6-cb193a68a75b")
    EList<PropertyTableDefinition> getDefinedTable();

    @objid ("a40589ea-ebea-4b47-b4bf-d322673b6cf1")
    <T extends PropertyTableDefinition> List<T> getDefinedTable(java.lang.Class<T> filterClass);

    @objid ("42f3beaf-3a40-4974-bdc5-89df0c3bef12")
    AnalystProject getOwnerProject();

    @objid ("852b8b4c-8190-4150-acc0-aa8ca12750bb")
    void setOwnerProject(AnalystProject value);

    @objid ("af6b5a87-cf5b-4b6b-9a2e-79c89d2e9d7c")
    EList<PropertyType> getDefinedType();

    @objid ("27524d48-cc2e-4cd2-bfa0-07d6b0882f6c")
    <T extends PropertyType> List<T> getDefinedType(java.lang.Class<T> filterClass);

}
