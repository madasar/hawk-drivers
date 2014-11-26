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
package org.modelio.metamodel.mda;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameterType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("0064e9a2-c4bf-1fd8-97fe-001ec947cd2a")
public interface ModuleParameter extends ModelElement {
    @objid ("61667b19-7771-4571-a6ea-dad04ea442db")
    String getSetName();

    @objid ("0d44ec38-a177-4c54-b9fd-ce4b737ca17e")
    void setSetName(String value);

    @objid ("58e57bf5-38fb-4f01-af96-b81943bf0d43")
    ModuleParameterType getAssociatedType();

    @objid ("0c44be29-40c7-4090-8da8-460833390776")
    void setAssociatedType(ModuleParameterType value);

    @objid ("19e75c49-9c26-4516-9784-6d75e0c25bd1")
    boolean isIsUserRead();

    @objid ("2402d010-2c61-4633-8499-8bce2c590121")
    void setIsUserRead(boolean value);

    @objid ("928355e6-da8b-4d5f-95fa-fdae36181f3a")
    boolean isIsUserWrite();

    @objid ("7617fee4-6460-4c07-a370-89aff1d368ed")
    void setIsUserWrite(boolean value);

    @objid ("eec3261b-5035-4c85-9e66-cc63c780659f")
    boolean isIsApiRead();

    @objid ("c2e0f53a-13ea-4fce-9c19-a19e27482bef")
    void setIsApiRead(boolean value);

    @objid ("252d81e4-6b68-4679-b012-0377d0525b8f")
    boolean isIsApiWrite();

    @objid ("04565189-7510-472d-851e-b473b48286fc")
    void setIsApiWrite(boolean value);

    @objid ("24e815ac-0e9f-4df4-8567-35af5b05794f")
    GeneralClass getType();

    @objid ("f809ae08-9f68-47f6-9ca2-75e4f83d4a19")
    void setType(GeneralClass value);

    @objid ("f3ed7a42-e4e7-43a3-88f9-7e0abf837151")
    ModuleComponent getOwner();

    @objid ("a778c668-b3d1-4938-a742-42bfd4c42340")
    void setOwner(ModuleComponent value);

}
