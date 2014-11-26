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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;

@objid ("00706656-ec87-1098-b22e-001ec947cd2a")
public interface EnumeratedPropertyType extends PropertyType {
    /**
     * Returns the literal represented by 's' or null if not found
     * @param s @return
     */
    @objid ("980fb52a-eaee-4290-b6b6-bde39e3d8dc7")
    PropertyEnumerationLitteral getLitteral(String s);

    @objid ("d040dbef-649f-48ef-a8d0-a0e250a1e8d5")
    EList<PropertyEnumerationLitteral> getLitteral();

    @objid ("b881c97b-b7d1-4ba5-a684-e19cf82e996d")
    <T extends PropertyEnumerationLitteral> List<T> getLitteral(java.lang.Class<T> filterClass);

}
