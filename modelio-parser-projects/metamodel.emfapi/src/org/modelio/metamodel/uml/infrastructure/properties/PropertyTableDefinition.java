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
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;

@objid ("00669770-ec87-1098-b22e-001ec947cd2a")
public interface PropertyTableDefinition extends ModelElement {
    @objid ("e3de3d95-4fe9-41e5-b791-1bd9bbc5822c")
    PropertyContainer getOwner();

    @objid ("8c73b176-8496-4056-9144-6d23d4d53833")
    void setOwner(PropertyContainer value);

    @objid ("4c552e58-2671-4d4f-b0b8-703f03d1ab9c")
    EList<TypedPropertyTable> getTypedTable();

    @objid ("03a73b11-d9d1-4af9-8b7d-a8d062c31579")
    <T extends TypedPropertyTable> List<T> getTypedTable(java.lang.Class<T> filterClass);

    @objid ("d1caec71-b8e5-44fa-8785-3a7831648690")
    MetaclassReference getOwnerReference();

    @objid ("198887ca-0159-4cce-a34f-be4961ebc21c")
    void setOwnerReference(MetaclassReference value);

    @objid ("e67fa7ba-c328-4af9-a94c-2b722104b985")
    Stereotype getOwnerStereotype();

    @objid ("25a530b7-17fb-4a61-a483-30454bbed9f9")
    void setOwnerStereotype(Stereotype value);

    @objid ("f7bf73e2-5840-4887-a0ae-b1ca48fa84f1")
    EList<PropertyDefinition> getOwned();

    @objid ("b2e1c94e-e5e6-433c-b2ef-63526cd16aa8")
    <T extends PropertyDefinition> List<T> getOwned(java.lang.Class<T> filterClass);

}
