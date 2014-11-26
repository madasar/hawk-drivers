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
                                    

package org.modelio.gproject.model;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.metamodel.factory.ElementNotUniqueException;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.session.UnknownMetaclassException;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

@objid ("00833f7e-030f-1035-9f91-001ec947cd2a")
public interface IMModelServices {
    /**
     * Get the model object creation factory.
     * @param referent unused
     * @return the model factory.
     * @deprecated use {@link #getModelFactory()}
     */
    @objid ("00834898-030f-1035-9f91-001ec947cd2a")
    @Deprecated
    IModelFactory getModelFactory(MObject referent);

    /**
     * Get the model object creation factory.
     * @return the model factory.
     */
    @objid ("0083559a-030f-1035-9f91-001ec947cd2a")
    IModelFactory getModelFactory();

    @objid ("008361e8-030f-1035-9f91-001ec947cd2a")
    IElementNamer getElementNamer();

    @objid ("0083699a-030f-1035-9f91-001ec947cd2a")
    List<MObject> findElements(String mpath);

    @objid ("008386aa-030f-1035-9f91-001ec947cd2a")
    MObject getElement(String mpath) throws ElementNotUniqueException;

    @objid ("0083955a-030f-1035-9f91-001ec947cd2a")
    List<MObject> findElements(IProjectFragment searchRoot, String mpath);

    @objid ("0083b724-030f-1035-9f91-001ec947cd2a")
    MObject getElement(IProjectFragment searchRoot, String mpath) throws ElementNotUniqueException;

    @objid ("0083cce6-030f-1035-9f91-001ec947cd2a")
    List<MObject> findElements(MObject searchRoot, String mpath);

    @objid ("0083eed8-030f-1035-9f91-001ec947cd2a")
    MObject getElement(MObject searchRoot, String mpath) throws ElementNotUniqueException;

    @objid ("00840648-030f-1035-9f91-001ec947cd2a")
    <T extends MObject> List<T> findElements(IProjectFragment searchRoot, String mpath, Class<T> metaclass);

    @objid ("00843e88-030f-1035-9f91-001ec947cd2a")
    <T extends MObject> T getElement(IProjectFragment searchRoot, String mpath, Class<T> metaclass) throws ElementNotUniqueException;

    @objid ("00846aca-030f-1035-9f91-001ec947cd2a")
    <T extends MObject> List<T> findElements(MObject searchRoot, String mpath, Class<T> metaclass);

    @objid ("0084a328-030f-1035-9f91-001ec947cd2a")
    <T extends MObject> T getElement(MObject searchRoot, String mpath, Class<T> metaclass) throws ElementNotUniqueException;

    @objid ("0084cdbc-030f-1035-9f91-001ec947cd2a")
    List<Stereotype> findStereotypes(String stereotypeName, MClass metaclass);

    @objid ("008506c4-030f-1035-9f91-001ec947cd2a")
    Stereotype getStereotype(String stereotypeName, MClass metaclass) throws ElementNotUniqueException;

    @objid ("0085345a-030f-1035-9f91-001ec947cd2a")
    List<Stereotype> findStereotypes(String moduleName, String stereotypeName, MClass metaclass);

    @objid ("0085756e-030f-1035-9f91-001ec947cd2a")
    Stereotype getStereotype(String moduleName, String stereotypeName, MClass metaclass) throws ElementNotUniqueException;

    @objid ("0085a7c8-030f-1035-9f91-001ec947cd2a")
    List<NoteType> findNoteTypes(String noteTypeName, MClass metaclass);

    @objid ("0085e42c-030f-1035-9f91-001ec947cd2a")
    NoteType getNoteType(String moduleName, String noteTypeName, MClass metaclass) throws ElementNotUniqueException;

    @objid ("008618ca-030f-1035-9f91-001ec947cd2a")
    List<NoteType> findNoteTypes(String moduleName, String noteTypeName, MClass metaclass);

    @objid ("00865f06-030f-1035-9f91-001ec947cd2a")
    NoteType getNoteType(Stereotype stereotype, String noteTypeName) throws ElementNotUniqueException;

    @objid ("00868e22-030f-1035-9f91-001ec947cd2a")
    List<ExternDocumentType> findExternDocumentTypes(String externDocumentTypeName, MClass metaclass);

    @objid ("0086c98c-030f-1035-9f91-001ec947cd2a")
    List<ExternDocumentType> findExternDocumentTypes(String moduleName, String externDocumentTypeName, MClass metaclass);

    @objid ("00870aaa-030f-1035-9f91-001ec947cd2a")
    ExternDocumentType getExternDocumentType(String moduleName, String externDocumentTypeName, MClass metaclass) throws ElementNotUniqueException;

    @objid ("008744ca-030f-1035-9f91-001ec947cd2a")
    ExternDocumentType getExternDocumentType(Stereotype stereotype, String externDocumentTypeName) throws ElementNotUniqueException;

    @objid ("008773a0-030f-1035-9f91-001ec947cd2a")
    List<TagType> findTagTypes(String tagTypeName, MClass metaclass);

    @objid ("0087b040-030f-1035-9f91-001ec947cd2a")
    List<TagType> findTagTypes(String moduleName, String tagTypeName, MClass metaclass);

    @objid ("0087f366-030f-1035-9f91-001ec947cd2a")
    TagType getTagType(String moduleName, String tagTypeName, MClass metaclass) throws ElementNotUniqueException;

    @objid ("00882e1c-030f-1035-9f91-001ec947cd2a")
    TagType getTagType(Stereotype stereotype, String tagTypeName) throws ElementNotUniqueException;

    @objid ("00885fe0-030f-1035-9f91-001ec947cd2a")
    String getCompositionPath(MObject mObject);

    @objid ("1126bf84-1772-11e2-aa0d-002564c97630")
    Collection<? extends MObject> findByAtt(MClass cls, final String att, Object val);

    @objid ("112d284e-1772-11e2-aa0d-002564c97630")
    Collection<? extends MObject> findByClass(MClass cls);

    @objid ("112d4f62-1772-11e2-aa0d-002564c97630")
    MObject findById(MClass cls, final UUID siteIdentifier);

    @objid ("112d9d82-1772-11e2-aa0d-002564c97630")
    MObject findByRef(MRef ref) throws UnknownMetaclassException;

    @objid ("10019844-0a1f-42a1-8bdc-7d83bbaf6271")
    IElementConfigurator getElementConfigurer();

    /**
     * Get the model object creation factory.
     * Get the model object creation factory.
     * @param fragment unused
     * @return the model factory.
     * @deprecated use {@link #getModelFactory()}
     */
    @objid ("0ac14c72-68d5-4ff3-8bb1-a38d14a9f086")
    @Deprecated
    IModelFactory getModelFactory(IProjectFragment fragment);

}
