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
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;

@objid ("006e6798-ec87-1098-b22e-001ec947cd2a")
public interface PropertyType extends ModelElement {
    @objid ("aad8b9a9-9a0c-43ea-bf81-051ab22aca99")
    PropertyBaseType getBaseType();

    @objid ("4fb485f2-342f-4664-8c78-325f326ecc2b")
    void setBaseType(PropertyBaseType value);

    @objid ("00aefead-6012-4172-8de9-319691d1ce1f")
    PropertyContainer getAnalystOwner();

    @objid ("3c40b2ce-37d2-4634-8d80-60a600699bc9")
    void setAnalystOwner(PropertyContainer value);

    @objid ("8554348b-c1b8-4318-976a-b28a8fcce78e")
    EList<PropertyDefinition> getTyped();

    @objid ("8adbdce5-1c31-467d-aac9-5f4804ca66bc")
    <T extends PropertyDefinition> List<T> getTyped(java.lang.Class<T> filterClass);

    @objid ("f0af3094-eeed-4caa-b4f0-8a071ca7ce4c")
    ModuleComponent getModuleOwner();

    @objid ("3726a3f7-3595-43fc-9ba4-0da9d3da12e8")
    void setModuleOwner(ModuleComponent value);

}
