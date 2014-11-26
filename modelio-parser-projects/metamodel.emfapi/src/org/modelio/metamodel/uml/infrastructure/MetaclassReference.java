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
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;

@objid ("0091820a-c4be-1fd8-97fe-001ec947cd2a")
public interface MetaclassReference extends Element {
    @objid ("878f583c-a94e-444f-9969-2e020b66626e")
    String getReferencedClassName();

    @objid ("f70a3943-0325-428a-a669-d762665b75cb")
    void setReferencedClassName(String value);

    @objid ("8de7a0c6-9627-4fe0-8393-1b7c21529c70")
    PropertyTableDefinition getDefinedTable();

    @objid ("1d698c71-57e8-4799-8e04-4625469da7dd")
    void setDefinedTable(PropertyTableDefinition value);

    @objid ("05c94415-328d-49e0-a46a-62b626fb92cb")
    EList<NoteType> getDefinedNoteType();

    @objid ("c30029d1-e1fa-494a-9aa3-355ec279c52b")
    <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass);

    @objid ("401398bb-bc61-4fe6-b5ff-40ab06646c69")
    EList<ExternDocumentType> getDefinedExternDocumentType();

    @objid ("8e793a49-649e-4ccb-88f8-604241e29bde")
    <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass);

    @objid ("3f72080b-7b6a-4916-baa0-0d67c72ba96a")
    Profile getOwnerProfile();

    @objid ("909cad0d-c767-4a06-84bb-4e1c7f7a82b5")
    void setOwnerProfile(Profile value);

    @objid ("4a496b27-89f1-4f44-a72f-668eb0b4168b")
    EList<TagType> getDefinedTagType();

    @objid ("fae8033f-ed50-4734-b99a-85d1b4725733")
    <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass);

}
