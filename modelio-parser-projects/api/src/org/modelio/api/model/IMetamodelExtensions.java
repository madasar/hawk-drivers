/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * This interface is used to get the module extensions.<br>
 * It's not possible to add or update such extensions using this
 * class.
 * <p>
 * The known extensions are the following:
 * <ul>
 * <li>Stereotypes ({@link Stereotype})</li>
 * <li>Tag types ({@link TagType})</li>
 * <li>Note types ({@link NoteType})</li>
 * <li>RichNote types ({@link ExternDocumentType})</li>
 * </ul>
 * </p>
 * <p>
 * Also provides i18n for all those extensions.
 * </p>
 */
@objid ("01f40d58-0000-7337-0000-000000000000")
public interface IMetamodelExtensions {
    @objid ("c9bfbcad-113b-11e2-8ccf-002564c97630")
    List<Stereotype> findStereotypes(String stereotypeName, MClass metaclass);

    @objid ("c9c21e0c-113b-11e2-8ccf-002564c97630")
    Stereotype getStereotype(String stereotypeName, MClass metaclass);

    @objid ("c9c21e12-113b-11e2-8ccf-002564c97630")
    List<Stereotype> findStereotypes(String moduleName, String stereotypeName, MClass metaclass);

    @objid ("c9c21e1b-113b-11e2-8ccf-002564c97630")
    Stereotype getStereotype(String moduleName, String stereotypeName, MClass metaclass);

    @objid ("c9c21e22-113b-11e2-8ccf-002564c97630")
    List<NoteType> findNoteTypes(String noteTypeName, MClass metaclass);

    @objid ("c9c21e2a-113b-11e2-8ccf-002564c97630")
    NoteType getNoteType(String moduleName, String noteTypeName, MClass metaclass);

    @objid ("c9c21e31-113b-11e2-8ccf-002564c97630")
    List<NoteType> findNoteTypes(String moduleName, String noteTypeName, MClass metaclass);

    @objid ("c9c21e3a-113b-11e2-8ccf-002564c97630")
    NoteType getNoteType(Stereotype stereotype, String noteTypeName);

    @objid ("c9c21e3e-113b-11e2-8ccf-002564c97630")
    List<ExternDocumentType> findExternDocumentTypes(String externDocumentTypeName, MClass metaclass);

    @objid ("c9c21e46-113b-11e2-8ccf-002564c97630")
    List<ExternDocumentType> findExternDocumentTypes(String moduleName, String externDocumentTypeName, MClass metaclass);

    @objid ("c9c21e4f-113b-11e2-8ccf-002564c97630")
    ExternDocumentType getExternDocumentType(String moduleName, String externDocumentTypeName, MClass metaclass);

    @objid ("c9c21e56-113b-11e2-8ccf-002564c97630")
    ExternDocumentType getExternDocumentType(Stereotype stereotype, String externDocumentTypeName);

    @objid ("c9c21e5a-113b-11e2-8ccf-002564c97630")
    List<TagType> findTagTypes(String tagTypeName, MClass metaclass);

    @objid ("c9c21e62-113b-11e2-8ccf-002564c97630")
    List<TagType> findTagTypes(String moduleName, String tagTypeName, MClass metaclass);

    @objid ("c9c21e6b-113b-11e2-8ccf-002564c97630")
    TagType getTagType(String moduleName, String tagTypeName, MClass metaclass);

    @objid ("c9c21e72-113b-11e2-8ccf-002564c97630")
    TagType getTagType(Stereotype stereotype, String tagTypeName);

    @objid ("e9eb2474-7f9e-4e1e-ac78-cf4a8940140b")
    String getLabel(Stereotype stereotype);

    @objid ("08da7b03-374a-4537-ae78-b8422694c7ec")
    String getLabel(TagType tagType);

    @objid ("624668bd-4c5f-411a-bd36-d6d025ee3c32")
    String getLabel(NoteType noteType);

    @objid ("d276e9e7-2ba2-4892-84fc-a7684047e267")
    String getLabel(ExternDocumentType docType);

}
