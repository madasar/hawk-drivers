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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.model.namer.StandardNamer;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.factory.ElementNotUniqueException;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.factory.ModelFactory;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vbasic.log.Log;
import org.modelio.vcore.session.UnknownMetaclassException;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Implementation of {@link IMModelServices}.
 */
@objid ("0078f866-030f-1035-9f91-001ec947cd2a")
public class MModelServices implements IMModelServices {
    @objid ("00790234-030f-1035-9f91-001ec947cd2a")
    private final IElementNamer elementNamer = new StandardNamer();

    @objid ("007915b2-030f-1035-9f91-001ec947cd2a")
    private GProject project;

    @objid ("007930ce-030f-1035-9f91-001ec947cd2a")
    public MModelServices(GProject project) {
        this.project = project;
    }

    @objid ("00794488-030f-1035-9f91-001ec947cd2a")
    @Deprecated
    @Override
    public IModelFactory getModelFactory(MObject referent) {
        return getModelFactory();
    }

    @objid ("00796594-030f-1035-9f91-001ec947cd2a")
    public IModelFactory getModelFactory() {
        return ModelFactory.getFactory(this.project.getSession());
    }

    @objid ("00799014-030f-1035-9f91-001ec947cd2a")
    @Override
    public IElementNamer getElementNamer() {
        return this.elementNamer;
    }

    @objid ("0079b6f2-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<MObject> findElements(String mpath) {
        List<MObject> results = new ArrayList<>();
        for (IProjectFragment fragment : this.project.getFragments()) {
            results.addAll(findElements(fragment, mpath));
        }
        return results;
    }

    @objid ("007a06d4-030f-1035-9f91-001ec947cd2a")
    @Override
    public MObject getElement(String mpath) throws ElementNotUniqueException {
        List<MObject> results = findElements(mpath);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(mpath + " is not a unique path");
        }
    }

    @objid ("007a2b3c-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<MObject> findElements(IProjectFragment searchRoot, String mpath) {
        List<MObject> results = new ArrayList<>();
        
        String[] tokens = parse(mpath);
        if (tokens.length > 0) {
            for (MObject child : searchRoot.getRoots()) {
                if (matches(child, tokens[0])) {
                    if (tokens.length == 1) {
                        results.add(child);
                    } else {
                        findElementRecursive(child, tokens, 1, results, null);
                    }
                }
            }
        }
        return results;
    }

    @objid ("007a68ae-030f-1035-9f91-001ec947cd2a")
    @Override
    public MObject getElement(IProjectFragment searchRoot, String mpath) throws ElementNotUniqueException {
        List<MObject> results = findElements(searchRoot, mpath);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(mpath + " is not a unique path in " + searchRoot.getId());
        }
    }

    @objid ("007a91c6-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<MObject> findElements(MObject searchRoot, String mpath) {
        List<MObject> results = new ArrayList<>();
        
        String[] tokens = parse(mpath);
        if (tokens.length > 0) {
            findElementRecursive(searchRoot, tokens, 0, results, null);
        }
        return results;
    }

    @objid ("007ad00a-030f-1035-9f91-001ec947cd2a")
    @Override
    public MObject getElement(MObject searchRoot, String mpath) throws ElementNotUniqueException {
        List<MObject> results = findElements(searchRoot, mpath);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(mpath + " is not a unique path in " + searchRoot.getName());
        }
    }

    @objid ("007afdb4-030f-1035-9f91-001ec947cd2a")
    @SuppressWarnings("unchecked")
    @Override
    public <T extends MObject> List<T> findElements(IProjectFragment searchRoot, String mpath, Class<T> metaclass) {
        List<T> results = new ArrayList<>();
        
        String[] tokens = parse(mpath);
        if (tokens.length > 0) {
            for (MObject child : searchRoot.getRoots()) {
                if (matches(child, tokens[0])) {
                    if (tokens.length == 1) {
                        if (metaclass.isInstance(child)) {
                            results.add(metaclass.cast(child));
                        }
                    } else {
                        findElementRecursive(child, tokens, 1, (List<MObject>) results, metaclass);
                    }
                }
            }
        }
        return results;
    }

    @objid ("007b5b88-030f-1035-9f91-001ec947cd2a")
    @Override
    public <T extends MObject> T getElement(IProjectFragment searchRoot, String mpath, Class<T> metaclass) throws ElementNotUniqueException {
        List<T> results = findElements(searchRoot, mpath, metaclass);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(mpath + " is not a unique path in " + searchRoot.getId());
        }
    }

    @objid ("007b9ad0-030f-1035-9f91-001ec947cd2a")
    @SuppressWarnings("unchecked")
    @Override
    public <T extends MObject> List<T> findElements(MObject searchRoot, String mpath, Class<T> metaclass) {
        List<T> results = new ArrayList<>();
        
        String[] tokens = parse(mpath);
        if (tokens.length > 0) {
            findElementRecursive(searchRoot, tokens, 0, (List<MObject>) results, metaclass);
        }
        return results;
    }

    @objid ("007bf840-030f-1035-9f91-001ec947cd2a")
    @Override
    public <T extends MObject> T getElement(MObject searchRoot, String mpath, Class<T> metaclass) throws ElementNotUniqueException {
        List<T> results = findElements(searchRoot, mpath, metaclass);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(mpath + " is not a unique path in " + searchRoot.getName());
        }
    }

    @objid ("007c356c-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<Stereotype> findStereotypes(String stereotypeName, MClass metaclass) {
        List<Stereotype> ret = new ArrayList<>();
        for (Stereotype ste : getModel().findByClass(Stereotype.class)) {
            try {
                MClass steClass = getBaseClass(ste.getBaseClassName());
                if (metaclass.hasBase(steClass) && matches(ste, stereotypeName)) {
                    ret.add(ste);
                }
            } catch (MetaclassNotFoundException e) {
                reportBadMetaclass(ste, e);
            }
        
        }
        return ret;
    }

    @objid ("007c8cb0-030f-1035-9f91-001ec947cd2a")
    @Override
    public Stereotype getStereotype(String stereotypeName, MClass metaclass) throws ElementNotUniqueException {
        List<Stereotype> results = findStereotypes(stereotypeName, metaclass);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(stereotypeName + " is not a unique Stereotype for " + metaclass.getName());
        }
    }

    @objid ("007cd77e-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<Stereotype> findStereotypes(String moduleName, String stereotypeName, MClass metaclass) {
        List<Stereotype> ret = new ArrayList<>();
        for (ModuleComponent module : getModel().findByClass(ModuleComponent.class)) {
            if (matches(module, moduleName)) {
                for (Profile profile : module.getOwnedProfile()) {
                    for (Stereotype ste : profile.getDefinedStereotype()) {
                        try {
                            MClass steClass = getBaseClass(ste.getBaseClassName());
                            if (metaclass.hasBase(steClass) && matches(ste, stereotypeName)) {
                                ret.add(ste);
                            }
                        } catch (MetaclassNotFoundException e) {
                            reportBadMetaclass(ste, e);
                        }
                    }
                }
            }
        }
        return ret;
    }

    @objid ("007d3552-030f-1035-9f91-001ec947cd2a")
    @Override
    public Stereotype getStereotype(String moduleName, String stereotypeName, MClass metaclass) throws ElementNotUniqueException {
        List<Stereotype> results = findStereotypes(moduleName, stereotypeName, metaclass);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(stereotypeName + " is not a unique Stereotype for " + metaclass.getName() + " in "
                    + moduleName);
        }
    }

    @objid ("007d878c-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<NoteType> findNoteTypes(String noteTypeName, MClass metaclass) {
        List<NoteType> ret = new ArrayList<>();
        for (NoteType noteType : getModel().findByClass(NoteType.class)) {
            MClass steClass = getBaseClass(noteType.getOwnerReference(), noteType.getOwnerStereotype());
            if (steClass != null && metaclass.hasBase(steClass) && matches(noteType, noteTypeName)) {
                ret.add(noteType);
            }
        }
        return ret;
    }

    @objid ("007ddfac-030f-1035-9f91-001ec947cd2a")
    @Override
    public NoteType getNoteType(String moduleName, String noteTypeName, MClass metaclass) throws ElementNotUniqueException {
        List<NoteType> results = findNoteTypes(moduleName, noteTypeName, metaclass);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(noteTypeName + " is not a unique NoteType for " + metaclass.getName() + " in "
                    + moduleName);
        }
    }

    @objid ("007e32ae-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<NoteType> findNoteTypes(String moduleName, String noteTypeName, MClass metaclass) {
        List<NoteType> ret = new ArrayList<>();
        for (MObject o : getModel().findByClass(Metamodel.getMClass(ModuleComponent.class))) {
            ModuleComponent module = (ModuleComponent) o;
            if (matches(module, moduleName)) {
                for (Profile profile : module.getOwnedProfile()) {
                    for (Stereotype ste : profile.getDefinedStereotype()) {
                        try {
                            MClass steClass = getBaseClass(ste.getBaseClassName());
                            if (metaclass.hasBase(steClass)) {
                                for (NoteType noteType : ste.getDefinedNoteType()) {
                                    if (matches(noteType, noteTypeName)) {
                                        ret.add(noteType);
                                    }
                                }
                            }
                        } catch (MetaclassNotFoundException e) {
                            reportBadMetaclass(ste, e);
                        }
                    }
        
                    for (MetaclassReference reference : profile.getOwnedReference()) {
                        try {
                            MClass referenceClass = getBaseClass(reference.getReferencedClassName());
                            if (metaclass.hasBase(referenceClass)) {
                                for (NoteType noteType : reference.getDefinedNoteType()) {
                                    if (matches(noteType, noteTypeName)) {
                                        ret.add(noteType);
                                    }
                                }
                            }
                        } catch (MetaclassNotFoundException e) {
                            reportBadMetaclass(reference, e);
                        }
                    }
                }
            }
        }
        return ret;
    }

    @objid ("007e9370-030f-1035-9f91-001ec947cd2a")
    @Override
    public NoteType getNoteType(Stereotype stereotype, String noteTypeName) throws ElementNotUniqueException {
        List<NoteType> results = new ArrayList<>();
        for (NoteType noteType : stereotype.getDefinedNoteType()) {
            if (matches(noteType, noteTypeName)) {
                results.add(noteType);
            }
        }
        
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(noteTypeName + " is not a unique NoteType in the " + stereotype.getName()
                    + " Stereotype");
        }
    }

    @objid ("007edf10-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<ExternDocumentType> findExternDocumentTypes(String externDocumentTypeName, MClass metaclass) {
        List<ExternDocumentType> ret = new ArrayList<>();
        for (MObject o : getModel().findByClass(Metamodel.getMClass(ExternDocumentType.class))) {
            ExternDocumentType externDocumentType = (ExternDocumentType) o;
            MClass steClass = getBaseClass(externDocumentType.getOwnerReference(), externDocumentType.getOwnerStereotype());
            if (steClass!=null && metaclass.hasBase(steClass) && matches(externDocumentType, externDocumentTypeName)) {
                ret.add(externDocumentType);
            }
        }
        return ret;
    }

    @objid ("007f38de-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<ExternDocumentType> findExternDocumentTypes(String moduleName, String externDocumentTypeName, MClass metaclass) {
        List<ExternDocumentType> ret = new ArrayList<>();
        for (MObject o : getModel().findByClass(Metamodel.getMClass(ModuleComponent.class))) {
            ModuleComponent module = (ModuleComponent) o;
            if (matches(module, moduleName)) {
                for (Profile profile : module.getOwnedProfile()) {
                    for (Stereotype ste : profile.getDefinedStereotype()) {
                        try {
                            MClass steClass = getBaseClass(ste.getBaseClassName());
                            if (metaclass.hasBase(steClass)) {
                                for (ExternDocumentType externDocumentType : ste.getDefinedExternDocumentType()) {
                                    if (matches(externDocumentType, externDocumentTypeName)) {
                                        ret.add(externDocumentType);
                                    }
                                }
                            }
                        } catch (MetaclassNotFoundException e) {
                            reportBadMetaclass(ste, e);
                        }
                    }
        
                    for (MetaclassReference reference : profile.getOwnedReference()) {
                        try {
                            MClass referenceClass = getBaseClass(reference.getReferencedClassName());
                            if (metaclass.hasBase(referenceClass)) {
                                for (ExternDocumentType externDocumentType : reference.getDefinedExternDocumentType()) {
                                    if (matches(externDocumentType, externDocumentTypeName)) {
                                        ret.add(externDocumentType);
                                    }
                                }
                            }
                        } catch (MetaclassNotFoundException e) {
                            reportBadMetaclass(reference, e);
                        }
                    }
                }
            }
        }
        return ret;
    }

    @objid ("007f9838-030f-1035-9f91-001ec947cd2a")
    @Override
    public ExternDocumentType getExternDocumentType(String moduleName, String externDocumentTypeName, MClass metaclass) throws ElementNotUniqueException {
        List<ExternDocumentType> results = findExternDocumentTypes(moduleName, externDocumentTypeName, metaclass);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(externDocumentTypeName + " is not a unique ExternDocumentType for "
                    + metaclass.getName() + " in " + moduleName);
        }
    }

    @objid ("007fecde-030f-1035-9f91-001ec947cd2a")
    @Override
    public ExternDocumentType getExternDocumentType(Stereotype stereotype, String externDocumentTypeName) throws ElementNotUniqueException {
        List<ExternDocumentType> results = new ArrayList<>();
        for (ExternDocumentType externDocumentType : stereotype.getDefinedExternDocumentType()) {
            if (matches(externDocumentType, externDocumentTypeName)) {
                results.add(externDocumentType);
            }
        }
        
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(externDocumentTypeName + " is not a unique ExternDocumentType in the "
                    + stereotype.getName() + " Stereotype");
        }
    }

    @objid ("008039b4-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<TagType> findTagTypes(String tagTypeName, MClass metaclass) {
        List<TagType> ret = new ArrayList<>();
        for (MObject o : getModel().findByClass(Metamodel.getMClass(TagType.class))) {
            TagType tagType = (TagType) o;
            MClass steClass = getBaseClass(tagType.getOwnerReference(), tagType.getOwnerStereotype());
            if (steClass!= null && metaclass.hasBase(steClass) && matches(tagType, tagTypeName)) {
                ret.add(tagType);
            }
        }
        return ret;
    }

    @objid ("008093fa-030f-1035-9f91-001ec947cd2a")
    @Override
    public List<TagType> findTagTypes(String moduleName, String tagTypeName, MClass metaclass) {
        List<TagType> ret = new ArrayList<>();
        for (MObject o : getModel().findByClass(Metamodel.getMClass(ModuleComponent.class))) {
            ModuleComponent module = (ModuleComponent) o;
            if (matches(module, moduleName)) {
                for (Profile profile : module.getOwnedProfile()) {
                    for (Stereotype ste : profile.getDefinedStereotype()) {
                        try {
                            MClass steClass = getBaseClass(ste.getBaseClassName());
                            if (metaclass.hasBase(steClass)) {
                                for (TagType tagType : ste.getDefinedTagType()) {
                                    if (matches(tagType, tagTypeName)) {
                                        ret.add(tagType);
                                    }
                                }
                            }
                        } catch (MetaclassNotFoundException e) {
                            reportBadMetaclass(ste, e);
                        }
                    }
        
                    for (MetaclassReference reference : profile.getOwnedReference()) {
                        try {
                            MClass referenceClass = getBaseClass(reference.getReferencedClassName());
                            if (metaclass.hasBase(referenceClass)) {
                                for (TagType tagType : reference.getDefinedTagType()) {
                                    if (matches(tagType, tagTypeName)) {
                                        ret.add(tagType);
                                    }
                                }
                            }
                        } catch (MetaclassNotFoundException e) {
                            reportBadMetaclass(reference, e);
                        }
                    }
                }
            }
        }
        return ret;
    }

    @objid ("0080f4a8-030f-1035-9f91-001ec947cd2a")
    @Override
    public TagType getTagType(String moduleName, String tagTypeName, MClass metaclass) throws ElementNotUniqueException {
        List<TagType> results = findTagTypes(moduleName, tagTypeName, metaclass);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(tagTypeName + " is not a unique TagType for " + metaclass.getName() + " in " + moduleName);
        }
    }

    @objid ("00814f84-030f-1035-9f91-001ec947cd2a")
    @Override
    public TagType getTagType(Stereotype stereotype, String tagTypeName) throws ElementNotUniqueException {
        List<TagType> results = new ArrayList<>();
        for (TagType tagType : stereotype.getDefinedTagType()) {
            if (matches(tagType, tagTypeName)) {
                results.add(tagType);
            }
        }
        
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new ElementNotUniqueException(tagTypeName + " is not a unique TagType in the " + stereotype.getName()
                    + " Stereotype");
        }
    }

    @objid ("00819d40-030f-1035-9f91-001ec947cd2a")
    private void findElementRecursive(MObject searchRoot, String[] tokens, int tokenIndex, List<MObject> results, Class<? extends org.modelio.vcore.smkernel.mapi.MObject> metaclass) {
        for (SmObjectImpl child : ((SmObjectImpl) searchRoot).getCompositionChildren()) {
            if (matches(child, tokens[tokenIndex])) {
                if (tokens.length - 1 == tokenIndex) {
                    if (metaclass == null || metaclass.isInstance(child)) {
                        results.add(child);
                    }
                } else {
                    findElementRecursive(child, tokens, tokenIndex + 1, results, metaclass);
                }
            }
        }
    }

    @objid ("0081f22c-030f-1035-9f91-001ec947cd2a")
    private static String[] parse(String mpath) {
        String[] tokens = mpath.split("/");
        // TODO Escape chars
        return tokens;
    }

    @objid ("008224b8-030f-1035-9f91-001ec947cd2a")
    private static boolean matches(MObject child, String pattern) {
        String name = child.getName();
        return name.matches(pattern) || name.equals(pattern);
    }

    @objid ("008253de-030f-1035-9f91-001ec947cd2a")
    @Override
    public String getCompositionPath(MObject mObject) {
        String name = mObject.getName();
        
        // TODO escape '/'
        
        SmObjectImpl owner = ((SmObjectImpl) mObject).getCompositionOwner();
        if (owner != null) {
            return getCompositionPath(owner) + "/" + name;
        }
        return name;
    }

    @objid ("00913a16-0eae-1035-9f91-001ec947cd2a")
    public void invalidateProject(Object object) {
        this.project = null;
    }

    @objid ("c3282876-edee-11e1-84b0-002564c97630")
    private static MClass getBaseClass(MetaclassReference classRef, Stereotype ste) {
        if (ste != null) {
            try {
                return getBaseClass(ste.getBaseClassName());
            } catch (MetaclassNotFoundException e) {
                reportBadMetaclass(ste, e);
                return null;
            }
        } else if (classRef != null) {
            try {
                return getBaseClass(classRef.getReferencedClassName());
            } catch (MetaclassNotFoundException e) {
                reportBadMetaclass(ste, e);
                return null;
            }
        }
        return null;
    }

    @objid ("c32b35b7-edee-11e1-84b0-002564c97630")
    private static MClass getBaseClass(String baseName) throws MetaclassNotFoundException {
        MClass smBase = Metamodel.getMClass(baseName);
        
        if (smBase == null) {
            throw new MetaclassNotFoundException(baseName);
        }
        return smBase;
    }

    @objid ("113984af-1772-11e2-aa0d-002564c97630")
    @Override
    public Collection<? extends MObject> findByAtt(MClass cls, String att, Object val) {
        return getModel().findByAtt(cls, att, val);
    }

    @objid ("1139abc3-1772-11e2-aa0d-002564c97630")
    @Override
    public Collection<? extends MObject> findByClass(MClass cls) {
        return getModel().findByClass(cls);
    }

    @objid ("1139d2d6-1772-11e2-aa0d-002564c97630")
    @Override
    public MObject findById(MClass cls, UUID siteIdentifier) {
        return getModel().findById(cls, siteIdentifier);
    }

    @objid ("1139f9e7-1772-11e2-aa0d-002564c97630")
    @Override
    public MObject findByRef(MRef ref) throws UnknownMetaclassException {
        return getModel().findByRef(ref);
    }

    @objid ("841b75ed-2f0f-11e2-8f81-001ec947ccaf")
    private static void reportBadMetaclass(MObject el, MetaclassNotFoundException e) {
        Log.warning(el.toString()+": "+e.getMessage());
    }

    @objid ("84203a74-2f0f-11e2-8f81-001ec947ccaf")
    private IModel getModel() {
        ICoreSession ret = this.project.getSession();
        if (ret == null)
            throw new IllegalStateException("The "+this.project.getName()+"' is not open.");
        return ret.getModel();
    }

    @objid ("b3def6de-0d78-4b7d-8f52-efb2a8a4c340")
    @Override
    public IElementConfigurator getElementConfigurer() {
        return new ElementConfigurator();
    }

    @objid ("9e57272c-583c-4f9a-8493-eb13e90132de")
    @Deprecated
    @Override
    public IModelFactory getModelFactory(IProjectFragment fragment) {
        return getModelFactory();
    }

}
