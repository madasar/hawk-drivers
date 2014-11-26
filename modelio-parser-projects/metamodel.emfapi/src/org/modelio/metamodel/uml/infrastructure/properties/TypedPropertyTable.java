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
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;

@objid ("006a7cb4-ec87-1098-b22e-001ec947cd2a")
public interface TypedPropertyTable extends PropertyTable {
    /**
     * Get a property value.
     * @param prop a property.
     * @return its value
     */
    @objid ("054ae888-2834-11e2-bf07-001ec947ccaf")
    String getProperty(PropertyDefinition prop);

    /**
     * Set a property value.
     * @param prop a property.
     * @param value its value.
     */
    @objid ("054ae88c-2834-11e2-bf07-001ec947ccaf")
    void setProperty(PropertyDefinition prop, String value);

    @objid ("4b48163b-3f89-4342-885f-f19d74bc162a")
    PropertyTableDefinition getType();

    @objid ("4cea4c28-6d62-40e1-b18a-3a4bb9f5d619")
    void setType(PropertyTableDefinition value);

}
