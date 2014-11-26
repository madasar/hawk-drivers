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
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;

@objid ("008d239a-c4be-1fd8-97fe-001ec947cd2a")
public interface Stereotype extends ModelElement {
    @objid ("27dde74f-c802-420a-8472-e6f2e9d112a7")
    ModuleComponent getModule();

    @objid ("f242de32-4adf-4d68-8e6e-584f53eef431")
    String getImage();

    @objid ("2173a174-09e4-4e9e-a8a6-8328f39e5720")
    void setImage(String value);

    @objid ("b20e444e-6c08-4a2c-b1c2-8ea5911e0c8a")
    String getIcon();

    @objid ("390d8725-e361-4e75-b10a-a35aead3b71b")
    void setIcon(String value);

    @objid ("85da5255-75f5-44ed-8a15-9be65b300b81")
    boolean isIsHidden();

    @objid ("9f2bb863-2a08-40ed-926c-a77ff6710743")
    void setIsHidden(boolean value);

    @objid ("de70c5f4-e1c1-439c-85c1-4c6543473c69")
    String getLabelKey();

    @objid ("c9a1be5c-f3c0-4d89-8dfc-4d300307918b")
    void setLabelKey(String value);

    @objid ("5c0200cb-20c6-4c93-8f20-4d111daddd9a")
    String getBaseClassName();

    @objid ("1af9dcfe-214b-4fa5-8db2-d6f41666e2c3")
    void setBaseClassName(String value);

    @objid ("6b683226-f0ca-450a-8264-c8a044e42caf")
    PropertyTableDefinition getDefinedTable();

    @objid ("6b02dc0e-98a9-4f43-a15a-ed3f31d39306")
    void setDefinedTable(PropertyTableDefinition value);

    @objid ("bda9071f-54fc-48c0-8970-a1ce239226a3")
    EList<ModelElement> getExtendedElement();

    @objid ("cf9e0647-0e4d-4327-9d9f-af5f08293452")
    <T extends ModelElement> List<T> getExtendedElement(java.lang.Class<T> filterClass);

    @objid ("a2c7a9a3-ef52-4dd7-a6fd-7198db9b154d")
    EList<ExternDocumentType> getDefinedExternDocumentType();

    @objid ("7f8b1327-eaaa-49b3-8338-935513dae5a0")
    <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass);

    @objid ("8da8d9e6-b092-4bcf-8c15-d16518103906")
    Profile getOwner();

    @objid ("b0fc4733-6457-4d01-aa76-e5a87202399c")
    void setOwner(Profile value);

    @objid ("baae4669-8958-4822-aa0c-aba8e5bc4f28")
    Stereotype getParent();

    @objid ("74ecd34a-9611-4312-af17-bf8923c9bd9e")
    void setParent(Stereotype value);

    @objid ("999dd2de-ce35-46da-9537-faf9ce7cf666")
    EList<TagType> getDefinedTagType();

    @objid ("e56f5699-bf1d-4cc1-b30c-fa80b5dea96b")
    <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass);

    @objid ("65b41c32-f888-4e5e-b98f-6cf7cbe3c25c")
    EList<Stereotype> getChild();

    @objid ("42b9576d-0b24-4c4f-b6bf-0cd027021b81")
    <T extends Stereotype> List<T> getChild(java.lang.Class<T> filterClass);

    @objid ("20d3c039-a1bd-44f9-a593-25b4635b306a")
    EList<NoteType> getDefinedNoteType();

    @objid ("5655bd19-c04e-4e82-986c-13ec972149be")
    <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass);

}
