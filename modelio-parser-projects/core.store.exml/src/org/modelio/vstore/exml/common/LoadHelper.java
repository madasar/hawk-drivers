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
                                    

package org.modelio.vstore.exml.common;

import java.io.IOException;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.log.Log;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.model.GetAbsoluteSymbol;
import org.modelio.vcore.model.MObjectCache;
import org.modelio.vcore.session.impl.storage.IModelLoader;
import org.modelio.vcore.smkernel.IRStatus;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vstore.exml.common.model.IllegalReferenceException;
import org.modelio.vstore.exml.common.model.ObjId;

/**
 * {@link ILoadHelper} implementation.
 */
@objid ("ab96a3a8-2e6d-11e2-8aaa-001ec947ccaf")
public class LoadHelper implements ILoadHelper {
    @objid ("6784127e-2e7b-11e2-8aaa-001ec947ccaf")
    protected boolean loadReadWrite;

    @objid ("730051ba-4077-4c7d-8905-1a23ec79e2bf")
    private MObjectCache loadCache;

    @objid ("202e4da2-99e2-4041-90a2-446e3f7afafe")
    private IExmlBase exmlBase;

    @objid ("1d8fdab5-122c-11e2-816a-001ec947ccaf")
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private static Enum<?> getEnumValue(final String attValue, final Class<?> attType) {
        return Enum.valueOf((Class<? extends Enum>)attType, attValue.toUpperCase());
    }

    @objid ("678412b0-2e7b-11e2-8aaa-001ec947ccaf")
    private static void reportProblem(final SmObjectImpl obj, final String msg) {
        if (Log.ENABLED) Log.warning("EXML loading problem on "+obj.getClassOf().getName()+" "+obj.getUuid()+": "+msg);
    }

    @objid ("1d8fdabc-122c-11e2-816a-001ec947ccaf")
    private void setObjectName(IModelLoader modelLoader, SmObjectImpl newObject, final ObjId id) {
        String name = null;
        try {
            name = this.exmlBase.getCmsNodeIndex().getName(id);
        } catch (IOException e) {
            this.exmlBase.setIndexesDamaged(e);
        }
        
        if (name == null)
            name = id.name;
        
        SmAttribute nameAtt = newObject.getClassOf().getAttributeDef("Name");
        if (nameAtt == null)
            nameAtt = newObject.getClassOf().getAttributeDef("name");
        
        if (nameAtt != null)
            modelLoader.loadAttribute(newObject, nameAtt, name);
    }

    /**
     * Initialize the loading helper.
     * @param exmlBase the EXML repository
     * @param loadReadWrite <code>true</code> if the repository is read/write, <code>false</code> if read only.
     */
    @objid ("67841280-2e7b-11e2-8aaa-001ec947ccaf")
    public LoadHelper(IExmlBase exmlBase, boolean loadReadWrite) {
        this.exmlBase = exmlBase;
        this.loadCache = exmlBase.getLoadCache();
        this.loadReadWrite = loadReadWrite;
    }

    @objid ("67841285-2e7b-11e2-8aaa-001ec947ccaf")
    @Override
    public final SmObjectImpl createObject(IModelLoader modelLoader, final ObjId id) throws DuplicateObjectException {
        SmObjectImpl newObject = modelLoader.createLoadedObject(id.classof, id.id);
        
        // Add new object to the loaded objects cache
        this.loadCache.putToCache(newObject);
        
        // Object flags will be initialized by readATT(...)
        return newObject;
    }

    @objid ("6784129c-2e7b-11e2-8aaa-001ec947ccaf")
    @Override
    public final SmObjectImpl getRefObject(IModelLoader modelLoader, final ObjId id, final ObjId pid) throws IllegalReferenceException, DuplicateObjectException {
        if (!this.exmlBase.isStored(id))
            return getForeignObject(modelLoader, id);
        return createStubObject(modelLoader, id, pid);
    }

    @objid ("678412b7-2e7b-11e2-8aaa-001ec947ccaf")
    @Override
    public ExmlStorageHandler createStorageHandler(SmObjectImpl cmsNode, boolean isNodeLoaded) {
        return this.exmlBase.createStorageHandler(cmsNode, isNodeLoaded);
    }

    @objid ("678412a6-2e7b-11e2-8aaa-001ec947ccaf")
    @Override
    public final void doLoadAtt(IModelLoader modelLoader, final SmObjectImpl obj, final String xattName, String attValue) {
        SmAttribute att = obj.getClassOf().getAttributeDef (xattName);
        if (att == null) {
            // TODO: Report an error
        } else {
            final Class<?> attType = att.getType();
            if (attValue == null) {
                // TODO report something ??
            } else if (attType == UUID.class) {
                // Identifier is already set, don't read it twice and don't reidentify elements.
            } else if (attType == String.class) {
                modelLoader.loadAttribute(obj, att, attValue);
            } else if (attValue.isEmpty()) {
                // No value given, problem
            } else if (attType == Integer.class) {
                modelLoader.loadAttribute(obj, att, Integer.valueOf(attValue));
            } else if (attType == Long.class) {
                modelLoader.loadAttribute(obj, att, Long.valueOf(attValue));
            } else if (attType == Float.class) {
                modelLoader.loadAttribute(obj, att, Float.valueOf(attValue));
            } else if (attType == Double.class) {
                modelLoader.loadAttribute(obj, att, Double.valueOf(attValue));
            } else if (attType == Boolean.class) {
                modelLoader.loadAttribute(obj, att, Boolean.valueOf(attValue));
            } else if (attType.isEnum()) {
                // att is an enum
                if (attValue.isEmpty()) {
                    reportProblem( obj, "Empty value for "+attType.getSimpleName()+" "+att.getName()+" attribute.");
                } else {
                    try {
                        modelLoader.loadAttribute(obj, att, getEnumValue(attValue, attType));
                    } catch (IllegalArgumentException ex) {
                        reportProblem( obj, "Illegal value for "+attType.getSimpleName()+" "+att.getName()+" attribute:"+ex.getLocalizedMessage());
                    }
                }
            } else {
                // Unknown type
                //this.modelLoader.loadAttribute(data, att, attValueBuilder);
                reportProblem( obj, "Unknown type:"+attType.getSimpleName()+" for "+att.getName()+" attribute.");
            }
        }
    }

    @objid ("6784128d-2e7b-11e2-8aaa-001ec947ccaf")
    @Override
    public SmObjectImpl getForeignObject(IModelLoader modelLoader, final ObjId id) {
        return modelLoader.loadForeignObject(id.classof, id.id, id.name);
    }

    @objid ("67841295-2e7b-11e2-8aaa-001ec947ccaf")
    @Override
    public final SmObjectImpl getObject(final ObjId id) {
        SmObjectImpl ret = null;
        
        if (id.id != null)
        {
            ret = this.loadCache.findById(id.classof, id.id);
        
            if (ret!=null && 
                    ret.getClassOf() != id.classof && 
                    !ret.getClassOf().hasBase(id.classof)) 
            {
                Log.error(String.format("LoadHelper.getObject(%s): \"%s\" found is a '%s' and not a '%s' !",
                        id.toString(),
                        GetAbsoluteSymbol.get(ret),
                        ret.getClassOf().getName(), 
                        id.classof.getName()));
                ret = null;
            }
        }
        return ret;
    }

    @objid ("678412be-2e7b-11e2-8aaa-001ec947ccaf")
    @Override
    public boolean isStored(ObjId id) {
        return this.exmlBase.isStored(id);
    }

    /**
     * Initialize the model object status flags.
     * @param modelLoader the model loader to use to initialize flags.
     * @param obj the model object to initialize.
     */
    @objid ("1d8fdac0-122c-11e2-816a-001ec947ccaf")
    @Override
    public void initObjectFlags(IModelLoader modelLoader, SmObjectImpl obj) {
        if (!this.loadReadWrite)
            modelLoader.setRStatus(obj, 0, IRStatus.USERWRITE, 0);
    }

    @objid ("e809ae47-041e-4f20-a858-35f519f89e41")
    public SmObjectImpl createStubObject(IModelLoader modelLoader, final ObjId id, final ObjId pid) throws IllegalReferenceException, DuplicateObjectException {
        SmObjectImpl newObject = modelLoader.createLoadedObject(id.classof, id.id);
        
        // Set the name now
        setObjectName(modelLoader, newObject, id);
        
        if (id.equals(pid)) {
            // reference to A CMS node.
            // Assert the object is a CMS node.
            if (! newObject.getClassOf().isCmsNode())
                throw new IllegalReferenceException("referenced "+newObject+ " is not a CMS node.");
        
            newObject.setRepositoryObject(createStorageHandler(newObject, false));
        } else {
            // Get the storage handler from the parent CMS node
            SmObjectImpl parentNode = getObject(pid);
            if (parentNode == null) {
                // Create ref to the parent CMS node
                parentNode = getRefObject(modelLoader, pid, pid);
            }
        
            newObject.setRepositoryObject( parentNode.getRepositoryObject());
        }
        
        // Set read only if needed
        //initObjectFlags(modelLoader, newObject);
        
        // Add new object to the loaded objects cache
        this.loadCache.putToCache(newObject);
        return newObject;
    }

}
