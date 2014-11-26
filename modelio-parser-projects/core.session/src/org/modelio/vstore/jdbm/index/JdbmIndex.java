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
                                    

package org.modelio.vstore.jdbm.index;

import java.io.IOError;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jdbm.PrimaryHashMap;
import jdbm.RecordManager;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MRef;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vstore.jdbm.Helper;

/**
 * Indexes
 */
@objid ("f44e42cc-7dcf-4393-af3b-b5560e8f19a3")
public class JdbmIndex {
    /**
     * Local objects used by a foreign object.
     * <p>
     * Inverse of {@link #users}
     */
    @objid ("70452ef7-032b-4c28-927e-d5f0f2c7ef29")
    private PrimaryHashMap<MRef,Collection<MRef>> users;

    /**
     * Foreign objects used by an object
     */
    @objid ("0dd54394-3dd5-416c-a0cc-833b03df6fd2")
    private Map<MRef , Collection<MRef>> uses;

    /**
     * global object index.
     * The key is a model object and the value the CMS node
     * it is stored into. A CMS node is stored into itself.
     */
    @objid ("99a510e0-9b19-46fa-b8e9-95f0b475bce3")
    private Map<String, Map<UUID,Boolean>> objectsIndex;

    /**
     * Initialize the index.
     * @param db the JDBM database string the index.
     * @throws java.io.IOException in case of I/O error
     */
    @objid ("96390c9e-2b45-4baf-9495-3bd0c689ece1")
    public JdbmIndex(final RecordManager db) throws IOException {
        try {        
            this.objectsIndex = new HashMap<>(SmClass.getRegisteredClasses().size());
            for (SmClass cls : SmClass.getRegisteredClasses()) {
                PrimaryHashMap<UUID, Boolean> idx = db.hashMap("idx.class."+cls.getName(), 
                        UuidSerializer.instance, null);
                this.objectsIndex.put(cls.getName(), idx);
            }
        
            this.users = db.hashMap("idx.users", MRefSerializer.instance, MRefCollectionSerializer.instance);
            this.uses = db.hashMap("idx.uses", MRefSerializer.instance, MRefCollectionSerializer.instance);
        
            
            //dumpIndex(db);
        } catch (IOError e) {
            throw new IOException(e);
        }
    }

    /**
     * Get all instances of a metaclass.
     * @param cls a metaclass
     * @return all stored instances references.
     * @throws java.io.IOError in case of I/O error
     */
    @objid ("8bd10374-024a-40b6-8b43-5c5cc8815ba6")
    public Collection<UUID> getByMClass(final SmClass cls) throws IOError {
        return this.objectsIndex.get(cls.getName()).keySet();
    }

    /**
     * Remove the given object from main indexes.
     * @param id the reference to remove
     * @throws java.io.IOError in case of I/O failure
     */
    @objid ("1ad1908d-044c-494c-84b3-a3c010e4183c")
    public void removeObj(final MRef id) throws IOError {
        this.objectsIndex.get(id.mc).remove(id.uuid);
    }

    @objid ("ab154943-ed63-493c-b128-1a27e253eee5")
    private void addTo(Map<MRef, Collection<MRef>> map, MRef k, Collection<MRef> newUsers) throws IOError {
        Collection<MRef> ref = map.get(k);
        if (ref == null) {
            map.put(k, newUsers);
        } else {
            ref.addAll(newUsers);
            map.put(k, ref);
        }
    }

    @objid ("3353e8c1-cbaa-4e55-8763-f5af93342205")
    private void dumpForeignUsers(final PrintStream out) {
        out.println("Foreign user object index dump:");
        for (Entry<MRef, Collection<MRef>>  en: this.users.entrySet()) {
            out.println(" - "+en.getKey()+" used by:");
            for (MRef  user: en.getValue()) {
                out.println("   - "+user);
            }
        }
    }

    /**
     * Get local objects referring to the given local or foreign object.
     * @param objRef a local or foreign object
     * @return all referred local objects.
     * @throws java.io.IOError in case of I/O error
     */
    @objid ("1b5085e1-54da-4dd0-8360-7c565fe53be1")
    public Collection<MRef> getUserRefs(final MRef objRef) throws IOError {
        try {
            Collection<MRef> objForeign = this.users.get(objRef);
            if (objForeign == null)
                return Collections.emptyList();
            else
                return objForeign;
        } catch (NullPointerException e) {
            dumpForeignUsers(System.err);
            throw e;
        }
    }

    /**
     * Remove the given object from cross reference indexes.
     * @param toRemove the reference to remove
     * @throws java.io.IOError in case of I/O failure
     */
    @objid ("c322d839-3a93-423e-8146-0b5118ff9ce9")
    public void removeCrossRefs(final MRef toRemove) throws IOError {
        Collection<MRef> objUses = this.uses.get(toRemove);
        if (objUses != null) { 
            for (MRef usedObj : objUses) {
                Collection<MRef> usedUsers = this.users.get(usedObj);
                if (usedUsers != null) {
                    usedUsers.remove(toRemove);
                    if (usedUsers.isEmpty())
                        this.users.remove(usedObj);
                    else
                        this.users.put(usedObj, usedUsers);
                }
            }
            this.uses.remove(toRemove);
        }
        
        this.users.remove(toRemove);
    }

    /**
     * Index the given model object.
     * @param obj a model object to index
     * @throws java.io.IOError in case of I/O failure
     */
    @objid ("8acceaec-3e0d-4432-b9ca-93a60e07e55c")
    public void addToMain(SmObjectImpl obj) throws IOError {
        Map<UUID, Boolean> ref = this.objectsIndex.get(obj.getMClass().getName());
        ref.put(obj.getUuid(), Boolean.TRUE);
    }

    /**
     * Add the given model object to cross references indexes.
     * <p>
     * Call {@link #removeCrossRefs(MRef)} first if the object was already in the index.
     * @param obj a model object to index
     * @throws java.io.IOException in case of I/O failure
     */
    @objid ("fbebd766-7189-4ddc-bfa5-d13c8f2e847b")
    public void addCrossRefs(SmObjectImpl obj) throws IOException {
        try {
            MRef objRef = new MRef(obj);
        
            Collection<MRef> newUsers = new ArrayList<>();
            Collection<MRef> newUses = new ArrayList<>();
            
            //Foreign references
            for (SmDependency dep : obj.getClassOf().getAllDepDef()) {
                if (Helper.isPersistent(dep)) {
                    if (!Helper.isPersistent(dep.getSymetric())) {
                        // one way navigable
                        for (SmObjectImpl val : obj.getDepValList(dep)) {
                            MRef valRef = new MRef(val);
                            
                            addTo(this.users, valRef, objRef);
                            newUses.add(valRef);
                        }
                    }
                } else {
                    // This is the opposite role
                    for (SmObjectImpl val : obj.getDepValList(dep)) {
                        MRef valRef = new MRef(val);
                        newUsers.add(valRef);
                        addTo(this.uses, valRef, objRef);
                    }
                }
            }
            
            addTo(this.users, objRef, newUsers);
            addTo(this.uses, objRef, newUses);
        
        } catch (IOError e ) {
            throw new IOException(e);
        }
    }

    @objid ("ebe7c88b-b02c-41b8-9dbe-f6df11c9454f")
    private void addTo(final Map<MRef, Collection<MRef>> map, final MRef k, final MRef v) throws IOError {
        Collection<MRef> l = map.get(k);
        if (l == null) {
            l = new ArrayList<>(1);
            l.add(v);
            map.put(k, l);
        } else {
            l.add(v);
            map.put(k, l);
        }
    }

}
