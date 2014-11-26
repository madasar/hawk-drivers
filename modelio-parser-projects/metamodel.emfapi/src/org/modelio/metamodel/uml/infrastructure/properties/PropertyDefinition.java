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
package org.modelio.metamodel.uml.infrastructure.properties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;

@objid ("00640c80-ec87-1098-b22e-001ec947cd2a")
public interface PropertyDefinition extends ModelElement {
    @objid ("b9c96be7-78b5-405c-8ad1-a7f5164961db")
    boolean isIsEditable();

    @objid ("d5c384e1-cad2-43ce-917b-4b6412619e06")
    void setIsEditable(boolean value);

    @objid ("ea3bebfe-68f3-47e7-9cff-8a1e2177d643")
    String getDefaultValue();

    @objid ("1db4e9b2-cebe-4f4c-bb8e-078602030c88")
    void setDefaultValue(String value);

    @objid ("be37dd63-480d-4223-bf01-169a3c79e998")
    PropertyType getType();

    @objid ("040702c4-22f2-473f-9e85-93eb90822b4c")
    void setType(PropertyType value);

    @objid ("5209c684-afbd-44e7-b2fe-c6ef27b52b41")
    PropertyTableDefinition getOwner();

    @objid ("b3767410-ced7-4d89-96f3-86e1cd364d0a")
    void setOwner(PropertyTableDefinition value);

}
