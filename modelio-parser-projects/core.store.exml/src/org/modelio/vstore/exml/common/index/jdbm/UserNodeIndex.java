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
                                    

package org.modelio.vstore.exml.common.index.jdbm;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jdbm.PrimaryHashMap;
import jdbm.RecordManager;
import jdbm.SecondaryKeyExtractor;
import jdbm.helper.StoreReference;
import org.modelio.vstore.exml.common.index.IUserNodeIndex;
import org.modelio.vstore.exml.common.model.ObjId;

/**
 * JDBM based implementation of {@link IUserNodeIndex}.
 */
@objid ("e1ee6208-5c83-11e1-863f-001ec947ccaf")
public class UserNodeIndex implements IUserNodeIndex {
    @objid ("f32593c4-1f6e-497d-98fc-c1de22cb22c6")
    private Map<ObjId , Iterable<ObjId>> usersInverse;

    @objid ("28578571-ada8-4ded-9f9f-6b40754a8aa0")
    private Map<ObjId , Iterable<ObjId>> foreignInverse;

    @objid ("d55011a2-7f1a-11e1-ba70-001ec947ccaf")
    private PrimaryHashMap<ObjId,StoreReference<Collection<ObjId>>> users;

    @objid ("d55011a9-7f1a-11e1-ba70-001ec947ccaf")
    private RecordManager db;

    @objid ("f1c503a7-92d7-11e1-be7e-001ec947ccaf")
    private PrimaryHashMap<ObjId,StoreReference<Collection<ObjId>>> foreignUsers;

    /**
     * Initialize the index.
     * @param db the JDBM database.
     */
    @objid ("e1ee6203-5c83-11e1-863f-001ec947ccaf")
    public UserNodeIndex(final RecordManager db) {
        this.db = db;
        this.users = db.hashMap("users", ObjIdSerializer.instance);
        this.foreignUsers = db.hashMap("foreign", ObjIdSerializer.instance);
        initReverseIndexes();
    }

    @objid ("e1ee6204-5c83-11e1-863f-001ec947ccaf")
    @Override
    public Collection<ObjId> getUsers(final ObjId cmsNodeId) {
        try {
            StoreReference<Collection<ObjId>> usersRef = this.users.get(cmsNodeId);
            if (usersRef == null)
                return Collections.emptyList();
            else
                return usersRef.get(this.db, ObjIdCollectionSerializer.instance);
        } catch (NullPointerException e) {
            dumpUsers(System.err);
            throw e;
        }
    }

    @objid ("e1ee6205-5c83-11e1-863f-001ec947ccaf")
    @Override
    public void addUsed(final ObjId userNodeId, final ObjId usedNodeId) throws IOException {
        addTo(this.users, usedNodeId, userNodeId);
    }

    @objid ("e1ee6206-5c83-11e1-863f-001ec947ccaf")
    @Override
    public void remove(final ObjId toRemove) throws IOException {
        //Remove from the used list
        Iterable<ObjId> used = this.usersInverse.get(toRemove);
        if (used != null) for (ObjId id : used) {
            removeFrom(this.users, id, toRemove);
        }
        
        //Remove from the foreign used list
        used = this.foreignInverse.get(toRemove);
        if (used != null) for (ObjId id : used) {
            removeFrom(this.foreignUsers, id, toRemove);
        }
        
        /*StoreReference<Collection<ObjId>> ref = users.remove(toRemove);
        if (ref != null)
            ref.remove(db);*/
    }

    @objid ("82d1cc2d-5ca7-11e1-863f-001ec947ccaf")
    private void initReverseIndexes() {
        SecondaryKeyExtractor<Iterable<ObjId>, ObjId, StoreReference<Collection<ObjId>>> secKeyExtractor = new SecondaryKeyExtractor<Iterable<ObjId>, ObjId, StoreReference<Collection<ObjId>>>() {
        
            @SuppressWarnings("synthetic-access")
            @Override
            public Iterable<ObjId> extractSecondaryKey(ObjId key,
                    StoreReference<Collection<ObjId>> value) {
                return value.get(UserNodeIndex.this.db, ObjIdCollectionSerializer.instance);
            }
        };
        
        this.usersInverse = SecondaryKeyHelper.secondaryHashMapManyToOne("usersInverse", 
                secKeyExtractor , 
                this.users, 
                ObjIdSerializer.instance,
                ObjIdIterableSerializer.instance);
        
        this.foreignInverse = SecondaryKeyHelper.secondaryHashMapManyToOne("foreignInverse", 
                secKeyExtractor , 
                this.foreignUsers, 
                ObjIdSerializer.instance,
                ObjIdIterableSerializer.instance);
    }

    @objid ("82d1cc32-5ca7-11e1-863f-001ec947ccaf")
    private Collection<ObjId> load(final StoreReference<Collection<ObjId>> storeReference) {
        return storeReference.get(this.db, ObjIdCollectionSerializer.instance);
    }

    @objid ("82d1cc3d-5ca7-11e1-863f-001ec947ccaf")
    private void addTo(final Map<ObjId, StoreReference<Collection<ObjId>>> map, final ObjId k, final ObjId v) throws IOException {
        Collection<ObjId> l = null;
        StoreReference<Collection<ObjId>> ref = map.get(k);
        if (ref == null) {
            l = new ArrayList<>(1);
            l.add(v);
            ref = new StoreReference<>(this.db, l, ObjIdCollectionSerializer.instance);
            map.put(k, ref);
        } else {
            l = load(ref);
            l.add(v);
            this.db.update(ref.getRecId(), l, ObjIdCollectionSerializer.instance);
        }
    }

    @objid ("82d42e7d-5ca7-11e1-863f-001ec947ccaf")
    private void removeFrom(final Map<ObjId, StoreReference<Collection<ObjId>>> map, final ObjId k, final ObjId v) throws IOException {
        StoreReference<Collection<ObjId>> ref = map.get(k);
        if (ref != null) {
            Collection<ObjId> l = load(ref);
            l.remove(v);
            this.db.update(ref.getRecId(), l, ObjIdCollectionSerializer.instance);
        }
    }

    @objid ("d4f31703-7f1a-11e1-ba70-001ec947ccaf")
    private void dumpUsers(final PrintStream out) {
        out.println("Users CMS nodes index dump:");
        for (Entry<ObjId, StoreReference<Collection<ObjId>>>  en: this.users.entrySet()) {
            out.println(" - "+en.getKey()+" used by:");
            for (ObjId  user: en.getValue().get(this.db, ObjIdCollectionSerializer.instance)) {
                out.println("   - "+user);
            }
        }
    }

    @objid ("f0072e15-92d7-11e1-be7e-001ec947ccaf")
    @Override
    public Collection<ObjId> getForeignUsers(final ObjId cmsNodeId) {
        try {
            StoreReference<Collection<ObjId>> usersRef = this.foreignUsers.get(cmsNodeId);
            if (usersRef == null)
                return Collections.emptyList();
            else
                return usersRef.get(this.db, ObjIdCollectionSerializer.instance);
        } catch (NullPointerException e) {
            dumpForeignUsers(System.err);
            throw e;
        }
    }

    @objid ("f009906c-92d7-11e1-be7e-001ec947ccaf")
    @Override
    public void addUsedForeignObj(final ObjId cmsNodeId, final ObjId usedForeignId) throws IOException {
        addTo(this.foreignUsers, usedForeignId, cmsNodeId);
    }

    @objid ("f00e551a-92d7-11e1-be7e-001ec947ccaf")
    private void dumpForeignUsers(final PrintStream out) {
        out.println("Foreign user object index dump:");
        for (Entry<ObjId, StoreReference<Collection<ObjId>>>  en: this.foreignUsers.entrySet()) {
            out.println(" - "+en.getKey()+" used by:");
            for (ObjId  user: en.getValue().get(this.db, ObjIdCollectionSerializer.instance)) {
                out.println("   - "+user);
            }
        }
    }

}
