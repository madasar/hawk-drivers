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
                                    

package org.modelio.vcore.session.impl.cache;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.model.MObjectCache;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectDataCache;
import org.modelio.vcore.smkernel.SmObjectImpl;

/**
 * Cache for already loaded objects in a modeling session.
 * <p>
 * Also caches in memory {@link ISmObjectData} and maintains the deleted objects list.
 */
@objid ("9c73fce8-354d-11e2-985b-001ec947ccaf")
public class CacheManager extends MObjectCache implements ISmObjectDataCache {
    @objid ("0195cecd-bed3-4fb9-89ae-8b857071f78e")
    private List<SmObjectImpl> deletedObjects = null;

    @objid ("bee76f3e-82d9-4af3-a6d5-a957d6bef951")
    private final Map<UUID, ISmObjectData> dataCache;

    /**
     * Creates a new cache.
     */
    @objid ("9c73fcee-354d-11e2-985b-001ec947ccaf")
    public CacheManager() {
        super();
        this.deletedObjects = new ArrayList<>();
        this.dataCache = new ConcurrentHashMap<>(1000, 0.85f, 1);
        
        MemoryManager.get().addManagedCache(this.dataCache);
    }

    /**
     * Add an object to the cache.
     * @param obj the object to add
     * @throws org.modelio.vcore.model.DuplicateObjectException if another object with the same identifier is already in the cache.
     */
    @objid ("9c73fcef-354d-11e2-985b-001ec947ccaf")
    @Override
    public void addToCache(SmObjectImpl obj) throws DuplicateObjectException {
        // Look for a duplicate object whatever its MClass is.
        final UUID oid = obj.getUuid();
        final ISmObjectData oldData = getCachedData(oid);
        if (oldData!= null && oldData != obj.getData()) {
            SmObjectImpl oldObj = findById(oldData.getClassOf(), oid);
            throw new DuplicateObjectException(oid, oldObj, obj);
        }
        
        // Add to cache
        super.addToCache(obj);
    }

    /**
     * Register a deleted object.
     * @param obj a deleted object
     */
    @objid ("9c73fcf0-354d-11e2-985b-001ec947ccaf")
    public final void addToDeleted(SmObjectImpl obj) {
        this.deletedObjects.add(obj);
    }

    /**
     * Clear the deleted objects list.
     */
    @objid ("9c73fcf1-354d-11e2-985b-001ec947ccaf")
    public void clearDeletedObjects() {
        for (SmObjectImpl  deleted: this.deletedObjects)
            removeFromCache(deleted);
        
        this.deletedObjects.clear();
    }

    /**
     * Get the deleted objects.
     * @return the deleted objects.
     */
    @objid ("9c73fcf5-354d-11e2-985b-001ec947ccaf")
    public List<SmObjectImpl> getDeletedObjects() {
        return this.deletedObjects;
    }

    @objid ("9c73fcf6-354d-11e2-985b-001ec947ccaf")
    @Override
    public void removeFromCache(SmObjectImpl obj) {
        super.removeFromCache(obj);
        this.dataCache.remove(obj.getUuid());
    }

    /**
     * Remove a deleted object.
     * @param obj a not deleted anymore object.
     */
    @objid ("9c73fcf7-354d-11e2-985b-001ec947ccaf")
    public void removeFromDeleted(SmObjectImpl obj) {
        this.deletedObjects.remove(obj);
    }

    @objid ("9c73fcfb-354d-11e2-985b-001ec947ccaf")
    @Override
    public ISmObjectData getCachedData(final UUID uid) {
        return this.dataCache.get(uid);
    }

    @objid ("9c73fcfc-354d-11e2-985b-001ec947ccaf")
    @Override
    public void putDataToCache(final ISmObjectData data) {
        this.dataCache.put(data.getUuid(), data);
    }

    /**
     * To be called when this cache manager is not used anymore.
     * <p>
     * Release the cache manager resources.
     */
    @objid ("94392bef-04cf-497c-9731-3dec28723976")
    public void dispose() {
        MemoryManager.get().removeManagedCache(this.dataCache);
    }

    @objid ("2a4d3b63-1d29-45c6-8362-3da4c76fb3f1")
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        
        dispose();
    }

}
