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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("00160b66-c4bf-1fd8-97fe-001ec947cd2a")
public interface PackageImport extends ModelElement {
    @objid ("1546190a-9c9c-4f88-85cd-5acf668589c2")
    VisibilityMode getVisibility();

    @objid ("2cd4be1d-35d5-4eac-8b7a-39f84c355512")
    void setVisibility(VisibilityMode value);

    @objid ("85d107ef-fc29-4d5d-b6d4-6c2fb1c8ac0a")
    Operation getImportingOperation();

    @objid ("30fc1814-715e-48f9-a551-a741bcbaec30")
    void setImportingOperation(Operation value);

    @objid ("20bb1660-aaf5-4ffb-a882-f598d14ac204")
    NameSpace getImportingNameSpace();

    @objid ("004705a4-2321-441d-82a4-8ae410b674b3")
    void setImportingNameSpace(NameSpace value);

    @objid ("424e025c-54e4-4b1b-84ed-6b08c84a831d")
    Package getImportedPackage();

    @objid ("73c63479-5f61-4a8f-8a2b-bb42a8e8b3ea")
    void setImportedPackage(Package value);

}
