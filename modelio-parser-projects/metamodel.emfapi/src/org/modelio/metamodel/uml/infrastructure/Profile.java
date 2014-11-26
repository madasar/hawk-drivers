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
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Package;

@objid ("008c74a4-c4be-1fd8-97fe-001ec947cd2a")
public interface Profile extends Package {
    @objid ("bd11d967-56c0-44de-8529-57da74ab48f8")
    String getJCode();

    @objid ("dfcae7f1-6015-47f5-9e77-c546d054f57c")
    void setJCode(String value);

    @objid ("3c69c2c4-ab52-4f43-aaac-f731cf24cac4")
    EList<Stereotype> getDefinedStereotype();

    @objid ("5624fee1-8837-4cfa-acdd-e0f09e4220c7")
    <T extends Stereotype> List<T> getDefinedStereotype(java.lang.Class<T> filterClass);

    @objid ("1376e172-9878-4f3a-9577-33702e184b23")
    ModuleComponent getOwnerModule();

    @objid ("30a73e67-ce07-4183-995d-e325cb61b77e")
    void setOwnerModule(ModuleComponent value);

    @objid ("20e5fd04-d03f-4309-abce-2653b2326144")
    EList<MetaclassReference> getOwnedReference();

    @objid ("fd2761ac-84bd-4a90-9e73-4cf04011ce7c")
    <T extends MetaclassReference> List<T> getOwnedReference(java.lang.Class<T> filterClass);

}
