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
                                    

package org.modelio.vstore.exml.local.loader.sax;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.session.impl.storage.IModelLoader;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vstore.exml.common.ExmlStorageHandler;
import org.modelio.vstore.exml.common.ILoadHelper;
import org.modelio.vstore.exml.common.model.ExmlTags;
import org.modelio.vstore.exml.common.model.IllegalReferenceException;
import org.modelio.vstore.exml.common.model.ObjId;
import org.modelio.vstore.exml.common.model.ObjRef;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;

/**
 * EXML file parse data model.
 */
@objid ("2af7925b-3faf-11e2-87cb-001ec947ccaf")
@SuppressWarnings("static-method")
class DataModel implements ExmlTags {
    /**
     * Read file format version
     */
    @objid ("2af79262-3faf-11e2-87cb-001ec947ccaf")
    private int version;

    @objid ("2af7925e-3faf-11e2-87cb-001ec947ccaf")
     ExmlStorageHandler nodeStorageHandler;

    @objid ("2af7925f-3faf-11e2-87cb-001ec947ccaf")
     ILoadHelper loadHelper;

    @objid ("2af79261-3faf-11e2-87cb-001ec947ccaf")
     IModelLoader modelLoader;

    @objid ("2af79264-3faf-11e2-87cb-001ec947ccaf")
    private IObjectDataModel currentModel;

    @objid ("2af79265-3faf-11e2-87cb-001ec947ccaf")
    private Deque<IObjectDataModel> objStack;

    @objid ("2af79268-3faf-11e2-87cb-001ec947ccaf")
    private Locator locator;

    @objid ("2af79269-3faf-11e2-87cb-001ec947ccaf")
    private SmObjectImpl rootObject;

    @objid ("2af79278-3faf-11e2-87cb-001ec947ccaf")
     static final List<SmObjectImpl> EMPTY_DEP = Collections.emptyList();

    @objid ("ddf3cc53-407a-11e2-87cb-001ec947ccaf")
     IDependencyContentHook depContentHook;

    /**
     * initialize the loader
     * @param loadCache the cache of this repository already loaded objects
     * @param loadHelper a load helper
     */
    @objid ("2af7926a-3faf-11e2-87cb-001ec947ccaf")
    public DataModel(ILoadHelper loadHelper) {
        this.nodeStorageHandler = null;
        this.loadHelper = loadHelper;
        this.modelLoader = null;
        this.objStack = new ArrayDeque<>(30);
        this.depContentHook = null;
    }

    /**
     * @return the current data model.
     */
    @objid ("2af7926f-3faf-11e2-87cb-001ec947ccaf")
    public IObjectDataModel getCurrent() {
        return this.currentModel;
    }

    /**
     * @return the CMS node root.
     */
    @objid ("2af9f4b5-3faf-11e2-87cb-001ec947ccaf")
    public SmObjectImpl getRootObject() {
        return this.rootObject;
    }

    /**
     * Init object flags after having read all attributes.
     */
    @objid ("2af9f4cb-3faf-11e2-87cb-001ec947ccaf")
    public void initObjectFlags() {
        this.loadHelper.initObjectFlags(this.modelLoader, this.currentModel.getObject());
    }

    /**
     * Reset the data model to its initial state.
     */
    @objid ("2af9f4d5-3faf-11e2-87cb-001ec947ccaf")
    public void reset() {
        this.locator = null;
        this.objStack.clear();
        this.currentModel = null;
        this.rootObject = null;
    }

    @objid ("2af792ac-3faf-11e2-87cb-001ec947ccaf")
    void addDepForeignObj(ObjId objid) {
        if (objid != null) {
            SmObjectImpl obj = this.loadHelper.getObject(objid);
            if (obj == null)
                obj = this.loadHelper.getForeignObject(this.modelLoader, objid);
        
            if (obj != null)
                getCurrent().addToDep (obj);
        }
    }

    @objid ("2af9f4ac-3faf-11e2-87cb-001ec947ccaf")
    void addDepId(final ObjId refid) throws IllegalReferenceException, DuplicateObjectException {
        if (refid != null) {
            SmObjectImpl obj = this.loadHelper.getObject(refid);
            if (obj == null)
                obj = this.loadHelper.getRefObject(this.modelLoader,refid, refid);
        
            getCurrent().addToDep (obj);
        }
    }

    @objid ("2af792a9-3faf-11e2-87cb-001ec947ccaf")
    void addDepRefObj(ObjRef ref) throws IllegalReferenceException, DuplicateObjectException {
        SmObjectImpl obj = this.loadHelper.getObject(ref.id);
        
        if (obj == null && this.version==1 && !this.loadHelper.isStored(ref.id))
            obj = this.loadHelper.getForeignObject(this.modelLoader, ref.id);
        
        if (obj == null)
            obj = this.loadHelper.getRefObject(this.modelLoader,ref.id, ref.pid);
        
        this.currentModel.addToDep (obj);
    }

    @objid ("2af9f4a8-3faf-11e2-87cb-001ec947ccaf")
    void addExtDepId(final ObjId refid) throws IllegalReferenceException, DuplicateObjectException {
        if (refid != null) {
            SmObjectImpl ref = this.loadHelper.getObject(refid);
        
            if (ref == null && this.version==1 && !this.loadHelper.isStored(refid))
                ref = this.loadHelper.getForeignObject(this.modelLoader, refid);
        
            if (ref == null)
                ref = this.loadHelper.getRefObject(this.modelLoader, refid, refid);
        
            getCurrent().addToDep (ref);
        }
    }

    @objid ("2af79273-3faf-11e2-87cb-001ec947ccaf")
    SmClass convertObsoleteClass(String xclassof) {
        if ("Module".equals(xclassof))
            return SmClass.getClass("ModuleComponent");
        return null;
    }

    @objid ("2af9f4be-3faf-11e2-87cb-001ec947ccaf")
    Locator getLocator() {
        return this.locator;
    }

    @objid ("2af9f4dc-3faf-11e2-87cb-001ec947ccaf")
    int getVersion() {
        return this.version;
    }

    @objid ("2af9f4c2-3faf-11e2-87cb-001ec947ccaf")
    void loadAtt(String attName, String string) {
        this.loadHelper.doLoadAtt(this.modelLoader, this.currentModel.getObject(), attName, string);
    }

    @objid ("2af792af-3faf-11e2-87cb-001ec947ccaf")
    void myassert(boolean b) throws AssertionError {
        if (! b) {
            final SAXParseException cause = new SAXParseException("assertion failed", getLocator());
            throw new AssertionError(cause.getMessage(), cause);
        }
    }

    @objid ("2af792b2-3faf-11e2-87cb-001ec947ccaf")
    void myassert(boolean b, String msg) {
        if (! b) {
            final SAXParseException cause = new SAXParseException(msg, getLocator());
            throw new AssertionError(cause.getMessage(), cause);
        }
    }

    /**
     * Pop an object model from the stack.
     * @return the removed object model.
     */
    @objid ("2af9f4c6-3faf-11e2-87cb-001ec947ccaf")
    IObjectDataModel pop() {
        IObjectDataModel previous = this.objStack.pop();
        this.currentModel = this.objStack.peek();
        return previous;
    }

    @objid ("2af9f4b9-3faf-11e2-87cb-001ec947ccaf")
    final SmObjectImpl pushObject(ObjId objid) throws SAXParseException {
        if (this.rootObject == null) {
            return pushRootOBJECT(objid);
        } else {
            boolean isNew = false;
            SmObjectImpl obj = this.loadHelper.getObject(objid);
        
            if (obj != null) {
                // Already loaded from this repository
                isNew = ! ((ExmlStorageHandler)obj.getRepositoryObject()).isLoaded();
                this.currentModel = new ObjectDataModel(this, obj, isNew);
            } else if (this.loadHelper.isStored(objid)) {
                // Not loaded but present in repository
                try {
                    obj = this.loadHelper.createObject(this.modelLoader, objid);
                    obj.setRepositoryObject(this.nodeStorageHandler);
                    isNew = true;
                    this.currentModel = new ObjectDataModel(this, obj, isNew);
                } catch (DuplicateObjectException e) {
                    throw new SAXParseException(e.getLocalizedMessage(), getLocator(), e);
                    //this.currentModel = new DummyObjectDataModel(obj);
                }
            } else {
                // Comes from another repository.
                // This can happen only for object that are saved in more than 1 EXML file
                // (Association, Link, Constraint)
                // It should never happen for other objects.
                obj = this.loadHelper.getForeignObject(this.modelLoader, objid);
                this.currentModel = new DummyObjectDataModel(obj);
            }
        
            this.objStack.push(this.currentModel);
        
            return obj;
        }
    }

    @objid ("2af9f4b0-3faf-11e2-87cb-001ec947ccaf")
    private final SmObjectImpl pushRootOBJECT(ObjId objid) throws SAXParseException {
        if (objid == null) 
            return null;
        
        boolean isNew = false;
        SmObjectImpl obj = this.loadHelper.getObject(objid);
        
        if (obj != null) {
            assert (obj.getClassOf().isCmsNode());
            
            this.nodeStorageHandler = (ExmlStorageHandler) (obj.getRepositoryObject());
            this.nodeStorageHandler.setLoaded(true);
        } else {
            try {
                obj = this.loadHelper.createObject(this.modelLoader, objid);
            } catch (DuplicateObjectException e) {
                throw new SAXParseException(e.getLocalizedMessage(), getLocator(), e);
            }
        
            assert (obj.getClassOf().isCmsNode());
            
            this.nodeStorageHandler = this.loadHelper.createStorageHandler(obj, true);
            obj.setRepositoryObject(this.nodeStorageHandler);
            isNew = true;
        }
        
        this.currentModel = new ObjectDataModel(this, obj, isNew);
        this.objStack.push(this.currentModel);
        this.rootObject = obj;
        return obj;
    }

    /**
     * Initialize the document locator.
     * @param aLocator a SAX locator.
     */
    @objid ("2af9f4cd-3faf-11e2-87cb-001ec947ccaf")
    void setDocumentLocator(Locator aLocator) {
        this.locator = aLocator;
    }

    /**
     * initialize the model loader.
     * @param modelLoader a model loader.
     */
    @objid ("2af9f4d1-3faf-11e2-87cb-001ec947ccaf")
    public final void setModelLoader(IModelLoader modelLoader) {
        this.modelLoader = modelLoader;
    }

    /**
     * Set the file format version.
     * @param v the file format version.
     */
    @objid ("2af9f4d8-3faf-11e2-87cb-001ec947ccaf")
    void setVersion(int v) {
        this.version = v;
    }

    /**
     * Set a hook that can modify the content of a dependency.
     * @param depContentHook a dependency content hook. May be <code>null</code>.
     */
    @objid ("ddf3cc54-407a-11e2-87cb-001ec947ccaf")
    public void setDependencyContentHook(IDependencyContentHook depContentHook) {
        this.depContentHook = depContentHook;
    }

}
