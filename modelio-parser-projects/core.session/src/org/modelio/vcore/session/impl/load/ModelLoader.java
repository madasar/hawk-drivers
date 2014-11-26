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
                                    

package org.modelio.vcore.session.impl.load;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.session.api.IAccessManager;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.session.impl.cache.CacheManager;
import org.modelio.vcore.session.impl.storage.IModelLoader;
import org.modelio.vcore.smkernel.IMetaOf;
import org.modelio.vcore.smkernel.IRStatus;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmLiveId;
import org.modelio.vcore.smkernel.SmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.SmStatusFactory;
import org.modelio.vcore.smkernel.StatusState;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Implementation of {@link IModelLoader} given to the {@link IRepository repositories}.
 * <p>
 * Each repository has its own model loader.
 */
@objid ("00480c06-4fda-1f32-b43f-001ec947cd2a")
class ModelLoader implements IModelLoader {
    @objid ("004824f2-4fda-1f32-b43f-001ec947cd2a")
    private final short kid;

    @objid ("00482c0e-4fda-1f32-b43f-001ec947cd2a")
    private final byte rid;

    @objid ("332badcb-0250-4199-bae6-31586bd76683")
    private final IMetaOf metaOf;

    @objid ("211865fb-f3b5-48d0-9b88-ec564db06f8b")
    private final CoreSession session;

    @objid ("afbe581e-1ef6-4aec-b981-8279d6a1fc19")
    private final IRepository shellRepository;

    @objid ("15f1eb7f-ea0b-4445-9940-f54704e7c4ce")
    protected final CacheManager cacheManager;

    @objid ("14564e84-dc91-4737-9b53-f8738de1e89c")
    private final DependencyLoader depLoader = new DependencyLoader();

    @objid ("9effc52a-7498-40c4-836f-f2888c098c7c")
    private final IAccessManager accessManager;

    @objid ("33e6ddbe-7c62-45b5-85c7-6bd5f45f14e3")
    private final ModelLoaderMetaObject loadingMetaOf;

    @objid ("1b6d5b0b-e9d6-444b-a000-035fd3ee701f")
    private final IModelLoader accessManagerModelLoader;

    @objid ("ba42cfc7-82a8-438b-a4b0-e6d0d89001c5")
    private Collection<SmObjectImpl> toInitialize = new HashSet<>();

    @objid ("400a67a0-35b1-40f9-961d-20b1b7cc0920")
    private Collection<ISmObjectData> loadedData = new ArrayList<>();

    @objid ("4a4b689e-8cbb-4b66-b372-68fff49a990e")
    private final Collection<IModelLoader> pool;

    @objid ("00483fd2-4fda-1f32-b43f-001ec947cd2a")
    public ModelLoader(ModelLoaderConfiguration loaderConfig, Collection<IModelLoader> pool) {
        this.pool = pool;
        this.kid = loaderConfig.getKid();
        this.rid = loaderConfig.getRid();
        this.session = loaderConfig.getSession();
        this.metaOf = this.session.getMetaObject();
        this.shellRepository = loaderConfig.getShellRepository();
        this.cacheManager = loaderConfig.getCacheManager();
        this.accessManager = loaderConfig.getAccessManager();
        this.loadingMetaOf = new ModelLoaderMetaObject();
        this.accessManagerModelLoader = new AccessManagerModelLoader(this);
    }

    @objid ("f6c04912-3948-11e2-920a-001ec947ccaf")
    @Override
    public final void close() {
        doClose();
        
        this.loadingMetaOf.endLoading();
        this.pool.add(this);
    }

    @objid ("00488578-4fda-1f32-b43f-001ec947cd2a")
    @Override
    public SmObjectImpl createLoadedObject(final SmClass classof, final UUID id) throws DuplicateObjectException {
        SmObjectImpl ret = null;
        boolean shellFound = false;
        final ISmObjectData data;
        
        if (this.rid != this.shellRepository.getRepositoryId()) {
            // First look for a shell object
            ret = this.shellRepository.findById(classof, id);
        }
        
        if (ret != null) {
            // Detach object from shell repository/
            // This removes the shell flag as well.
            shellFound = true;
            ret.getRepositoryObject().detach(ret);
            data = ret.getData();
        } else {
            // Instantiate object
            data = classof.getObjectFactory().createData();
            ret = classof.getObjectFactory().createImpl();
            ret.initData(data);
        } 
        
        // set the meta object to the loading meta object
        data.setMetaOf(this.loadingMetaOf);
        
        long liveId = SmLiveId.make(this.kid, this.rid, classof.getId());
        ret.init(id, liveId);
        
        // Reinitialize status with default values
        SmStatusFactory.resetRStatus(data);
        SmStatusFactory.resetPStatus(data);
        
        if (!shellFound)
            this.cacheManager.addToCache(ret);
        
        addObjToInitialize(ret);
        addLoadedData(data);
        return ret;
    }

    @objid ("f6bde6b8-3948-11e2-920a-001ec947ccaf")
    @Override
    public SmObjectImpl createLoadedObject(SmClass metaclass, UUID uuid, SmObjectData d) throws DuplicateObjectException {
        SmObjectImpl ret = null;
        boolean shellFound = false;
        
        if (this.rid != this.shellRepository.getRepositoryId()) {
            // First look for a shell object
            ret = this.shellRepository.findById(metaclass, uuid);
        }
        
        if (ret != null) {
            // Detach object from shell repository/
            // This removes the shell flag as well.
            ret.getRepositoryObject().detach(ret);
            shellFound = true;
        } else {
            // Instantiate object
            ret = metaclass.getObjectFactory().createImpl();
        } 
        
        long liveId = SmLiveId.make(this.kid, this.rid, metaclass.getId());
        ret.initData(d); // change the data to the loaded one
        ret.init(uuid, liveId); // reinit
        
        d.setMetaOf(this.loadingMetaOf);
        
        // Reinitialize status with default values
        SmStatusFactory.resetRStatus(d);
        
        if (!shellFound)
            this.cacheManager.addToCache(ret);
        
        addLoadedData(d);
        addObjToInitialize(ret);
        return ret;
    }

    @objid ("db852b11-4868-11e2-91c9-001ec947ccaf")
    @Override
    public ISmObjectData createObjectData(SmObjectImpl obj) {
        SmClass cls = obj.getClassOf();
        ISmObjectData data = cls.getObjectFactory().createData();
        
        obj.initData(data);
        data.init(obj.getUuid(), obj.getLiveId());
        data.setMetaOf(this.metaOf);
        return data;
    }

    @objid ("7ddc3a38-1c43-11e2-8eb9-001ec947ccaf")
    @Override
    public IMetaOf getMetaOf() {
        return this.metaOf;
    }

    @objid ("5251473c-064d-11e2-9eb7-001ec947ccaf")
    @Override
    public void loadAttribute(SmObjectImpl obj, SmAttribute att, Object newValue) {
        assert (newValue != null) : obj + "." + att.getName() + " = null";
        
        ISmObjectData data = obj.getData();
        addLoadedData(data);
        att.setValue(data, newValue);
        
        if (att == SmObjectData.Metadata.statusAtt()) {
            addObjToInitialize(obj);
        }
    }

    @objid ("524ee4e9-064d-11e2-9eb7-001ec947ccaf")
    @Override
    public void loadDependency(SmObjectImpl obj, SmDependency dep, List<SmObjectImpl> newContent) {
        addLoadedData(obj.getData());
        this.depLoader.execute(obj, dep, newContent);
    }

    @objid ("bda29931-92d7-11e1-81e9-001ec947ccaf")
    @Override
    public SmObjectImpl loadForeignObject(final SmClass metaclass, final UUID id, final String name) {
        // Find the foreign object
        SmObjectImpl ret = (SmObjectImpl) this.session.getModel().findById(metaclass, id);
        if (ret != null) {
            return ret;
        } else {
            // Foreign object not found, create a shell object
            ISmObjectData data = metaclass.getObjectFactory().createData();
            ret = metaclass.getObjectFactory().createImpl();
            ret.initData(data);
            long liveId = SmLiveId.make(this.kid, this.shellRepository.getRepositoryId(), metaclass.getId());
            ret.init(id, liveId);
        
            // Reinitialize status with default values
            SmStatusFactory.resetRStatus(data);
            SmStatusFactory.resetPStatus(data);
        
            // Set the object as shell
            data.setRFlags(IRStatus.SHELL, StatusState.TRUE);
        
            // Set the meta object as a temporary
            data.setMetaOf(this.loadingMetaOf);
        
            // Set the shell object name
            if (name != null) {
                SmAttribute att = metaclass.getAttributeDef("name");
                if (att == null) {
                    att = metaclass.getAttributeDef("Name");
                }
        
                if (att != null) {
                    loadAttribute(ret, att, name);
                }
            }
        
            // Add in cache
            try {
                this.cacheManager.addToCache(ret);
                this.shellRepository.addObject(ret);
                addObjToInitialize(ret);
                addLoadedData(data);
            } catch (DuplicateObjectException e) {
                // The object has been loaded concurrently
                ret = (SmObjectImpl) this.session.getModel().findById(metaclass, id);
                if (ret == null) {
                    // This should not occur
                    throw new Error(e);
                }
            }
        
        
            return ret;
        }
    }

    @objid ("98353c81-1f8d-4807-a978-e02590582d1e")
    @Override
    public void setPStatus(SmObjectImpl obj, long trueFlags, long falseFlags, long undefFlags) {
        ISmObjectData data = obj.getData();
        data.setPFlags(trueFlags, falseFlags, undefFlags);
        addLoadedData(data);
        addObjToInitialize(obj);
    }

    @objid ("9420091e-1732-453c-a7bc-14d06e0c2e52")
    @Override
    public void setRStatus(SmObjectImpl obj, long trueFlags, long falseFlags, long undefFlags) {
        ISmObjectData data = obj.getData();
        data.setRFlags(trueFlags, falseFlags, undefFlags);
        addLoadedData(data);
        addObjToInitialize(obj);
    }

    @objid ("d285df1c-1ebc-11e2-99fc-001ec947ccaf")
    protected final CoreSession getSession() {
        return this.session;
    }

    @objid ("3fe3101f-1661-4863-8df8-e001452f72b8")
    protected void addLoadedData(ISmObjectData data) {
        if (data.hasAllStatus(IRStatus.LOADING) != StatusState.TRUE) {
            this.loadedData.add(data);
            data.setRFlags(IRStatus.LOADING, StatusState.TRUE);
        }
    }

    @objid ("d7ed84ef-e8f1-4b4e-896a-a910c4f83cb2")
    void initStatus(SmObjectImpl obj) {
        // Allow access manager to modify the object status
        this.accessManager.initStatus(obj, this.accessManagerModelLoader);
        
        // Reset the audit flags, they are not persistent right now
        setRStatus(obj, IRStatus.MASK_AUDIT, StatusState.FALSE);
    }

    @objid ("33430ab9-4097-11e2-87cb-001ec947ccaf")
    private void addObjToInitialize(SmObjectImpl obj) {
        this.toInitialize.add(obj);
    }

    @objid ("3a92a4a9-2972-4102-b376-28febc1bf0ee")
    private void setRStatus(SmObjectImpl obj, long flags, StatusState newState) {
        ISmObjectData data = obj.getData();
        data.setRFlags(flags, newState);
        addLoadedData(data);
        addObjToInitialize(obj);
    }

    @objid ("ddde6f85-63af-497e-9ac6-9bf59a7ab025")
    protected void doClose() {
        if (!this.toInitialize.isEmpty()) {
            // Initialize objects rights
            for (SmObjectImpl obj : this.toInitialize) {
                initStatus(obj);
        
                // Set the meta object
                obj.getData().setMetaOf(this.metaOf);
            }
            
            // Put loaded data to cache
            for (ISmObjectData  d: this.loadedData) {
                this.cacheManager.putDataToCache(d);
                d.setRFlags(IRStatus.LOADING, StatusState.FALSE);
            }
        
            // Clear list
            if (this.toInitialize.size() < 15) {
                this.toInitialize.clear();
                this.loadedData.clear();
            } else {
                this.toInitialize = new HashSet<>(10);
                this.loadedData = new ArrayList<>(10);
            }
        }
    }

    @objid ("e857c9bf-d56e-4f72-bdd4-7e3dad3e82b0")
    @Override
    public void begin() {
        this.loadingMetaOf.beginLoading();
    }

}
