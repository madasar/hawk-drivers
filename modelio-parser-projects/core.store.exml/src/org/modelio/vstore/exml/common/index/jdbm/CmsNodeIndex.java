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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jdbm.InverseHashView;
import jdbm.PrimaryHashMap;
import jdbm.RecordManager;
import jdbm.helper.StoreReference;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vstore.exml.common.index.ICmsNodeIndex;
import org.modelio.vstore.exml.common.model.ObjId;

/**
 * JDBM based implementation of {@link ICmsNodeIndex}.
 */
@objid ("e1ee6207-5c83-11e1-863f-001ec947ccaf")
public class CmsNodeIndex implements ICmsNodeIndex {
    /**
     * 'model object -> CMS node' index.
     * <p>
     * Also serve as global object index.
     * The key is a model object and the value the CMS node
     * it is stored into. A CMS node is stored into itself.
     */
    @objid ("d55273fe-7f1a-11e1-ba70-001ec947ccaf")
    private Map<MClass, PrimaryHashMap<UUID,ObjectIndexValue>> objectsIndex;

    /**
     * Child CMS node -> parent CMS node index.
     */
    @objid ("d554d64c-7f1a-11e1-ba70-001ec947ccaf")
    private PrimaryHashMap<ObjId,ObjId> parentIndex;

    @objid ("d554d652-7f1a-11e1-ba70-001ec947ccaf")
    private InverseHashView<ObjId,ObjId> inverseParent;

    @objid ("d554d657-7f1a-11e1-ba70-001ec947ccaf")
    private PrimaryHashMap<ObjId,StoreReference<Collection<ObjId>>> cmsNodeContent;

    @objid ("d554d65c-7f1a-11e1-ba70-001ec947ccaf")
    private RecordManager db;

    /**
     * Initialize the index.
     * @param db the JDBM database string the index.
     */
    @objid ("e1ee620c-5c83-11e1-863f-001ec947ccaf")
    public CmsNodeIndex(final RecordManager db) {
        this.db = db;
        this.parentIndex = db.hashMap("parentIndex", ObjIdSerializer.instance, ObjIdSerializer.instance);
        
        this.objectsIndex = new HashMap<>();
        for (SmClass cls : SmClass.getRegisteredClasses()) {
            PrimaryHashMap<UUID, ObjectIndexValue> idx = db.hashMap("objectsIndex."+cls.getName(), UuidSerializer.instance, ObjectIndexValueSerializer.instance);
            this.objectsIndex.put(cls, idx);
        }
        
        this.cmsNodeContent = db.hashMap("cmsNodeContent", ObjIdSerializer.instance);
        
        initReverseIndexes();
        
        //dumpIndex(db);
    }

    @objid ("e1ee620e-5c83-11e1-863f-001ec947ccaf")
    @Override
    public void addCmsNode(final ObjId id) throws IOException {
        getObjectIndex(id).put(id.id, new ObjectIndexValue(id.name, id));
    }

    @objid ("e1ee620d-5c83-11e1-863f-001ec947ccaf")
    @Override
    public void addObject(final ObjId cmsNodeId, final ObjId objectId) throws IOException {
        getObjectIndex(objectId).put(objectId.id, new ObjectIndexValue(objectId.name, cmsNodeId));
        addCmsNodeContent(cmsNodeId, objectId);
    }

    @objid ("e1ee61ff-5c83-11e1-863f-001ec947ccaf")
    @Override
    public Collection<UUID> getByMClass(final SmClass cls) {
        return this.objectsIndex.get(cls).keySet();
    }

    @objid ("e1ee6212-5c83-11e1-863f-001ec947ccaf")
    @Override
    public ObjId getCmsNodeOf(final ObjId id) throws IOException {
        final ObjectIndexValue idxValue = getObjectIndex(id).find(id.id);
        if (idxValue == null)
            return null;
        else
            return idxValue.cmsNodeId;
    }

    @objid ("e7ff26c9-55ba-11e2-81b0-001ec947ccaf")
    @Override
    public String getName(ObjId id) throws IOException {
        final ObjectIndexValue idxValue = getObjectIndex(id).find(id.id);
        if (idxValue == null)
            return null;
        else
            return idxValue.name;
    }

    @objid ("e1ee620f-5c83-11e1-863f-001ec947ccaf")
    @Override
    public ObjId getParentNodeOf(final ObjId id) throws IOException {
        return this.parentIndex.find(id);
    }

    @objid ("82d690c7-5ca7-11e1-863f-001ec947ccaf")
    @Override
    public boolean isEmpty() {
        // JDBM has a inefficient implementation of isEmpty() that iterates the whole map.
        return ! this.cmsNodeContent.entrySet().iterator().hasNext();
        //return this.cmsNodeContent.isEmpty();
    }

    @objid ("e1ee61fd-5c83-11e1-863f-001ec947ccaf")
    @Override
    public boolean isStored(final ObjId id) throws IOException {
        return getObjectIndex(id).find(id.id) != null;
    }

    @objid ("e1ee61fe-5c83-11e1-863f-001ec947ccaf")
    @Override
    public void removeObj(final ObjId id) throws IOException {
        Iterable<ObjId> nodeContent = load(this.cmsNodeContent.get(id));
        if (nodeContent != null) {
            // Remove CMS node elements from the index
            for (ObjId child : nodeContent) {
                Map<UUID, ObjectIndexValue> childIndex = getObjectIndex(child);
                ObjectIndexValue val = childIndex.remove(child.id);
                if (val != null && ! id.equals(val.cmsNodeId)) {
                    // The child has moved to another CMS node, put it back into the index.
                    // perf note: as moving occurs only sometime I prefer removing the element always
                    // and put it back if it was wrong instead of first reading it then delete it.
                    // It spares an index access in most cases.
                    childIndex.put(child.id, val);
                }
                    
            }
            
            // Remove the CMS node content entry
            this.cmsNodeContent.remove(id);
        }
        
        // For non CMS node objects, remove it from the CMS node index
        final ObjectIndexValue idxVal = getObjectIndex(id).find(id.id);
        if (idxVal != null) {
            ObjId cmsParent = idxVal.cmsNodeId;
            removeFromCmsNodeContent(cmsParent, id);
            getObjectIndex(id).remove(id.id);
        }
        
        this.parentIndex.remove(id);
    }

    @objid ("e1ee6210-5c83-11e1-863f-001ec947ccaf")
    @Override
    public void setParent(final ObjId cmsNodeId, final ObjId parentId) throws IOException {
        this.parentIndex.put(cmsNodeId, parentId);
    }

    @objid ("690abc20-4b8b-11e2-91c9-001ec947ccaf")
    private void addCmsNodeContent(ObjId parent, ObjId child) throws IOException {
        StoreReference<Collection<ObjId>> ref = this.cmsNodeContent.get(parent);
        if (ref == null) {
            Collection<ObjId> l = new ArrayList<>(1);
            l.add(child);
            ref = new StoreReference<>(this.db, l, ObjIdCollectionSerializer.instance);
            this.cmsNodeContent.put(parent, ref);
        } else {
            Collection<ObjId> l = load(ref);
            l.add(child);
            this.db.update(ref.getRecId(), l, ObjIdCollectionSerializer.instance);
        }
    }

    @objid ("86140e47-797c-11e1-9633-001ec947ccaf")
    private void dumpIndex() {
        System.out.println(" Dumping CmsNodeIndex:");
        
        for (Entry<MClass, PrimaryHashMap<UUID, ObjectIndexValue>>  entry: this.objectsIndex.entrySet()) {
            System.out.println("  " + entry.getValue().size()+" "+entry.getKey().getName());
        }
        
        System.out.println("  " + this.parentIndex.size()+" elements in parentIndex");
        //System.out.println("  " + this.inverseParent.size()+" elements in inverseParent");
        //System.out.println("  " + this.inverseObjectToNode.size()+" elements in inverseObjectToNode");
    }

    /**
     * @param child @return
     */
    @objid ("690abc29-4b8b-11e2-91c9-001ec947ccaf")
    private PrimaryHashMap<UUID,ObjectIndexValue> getObjectIndex(ObjId child) {
        return this.objectsIndex.get(child.classof);
    }

    @objid ("82d42eb7-5ca7-11e1-863f-001ec947ccaf")
    private void initReverseIndexes() {
        this.inverseParent = SecondaryKeyHelper.inverseHashView(this.parentIndex, "inverseParent", ObjIdIterableSerializer.instance);
    }

    @objid ("82d690cd-5ca7-11e1-863f-001ec947ccaf")
    private Collection<ObjId> load(final StoreReference<Collection<ObjId>> storeReference) {
        if (storeReference==null)
            return null;
        else
            return storeReference.get(this.db, ObjIdCollectionSerializer.instance);
    }

    @objid ("690abc25-4b8b-11e2-91c9-001ec947ccaf")
    private void removeFromCmsNodeContent(ObjId cmsParent, ObjId id) throws IOException {
        StoreReference<Collection<ObjId>> ref = this.cmsNodeContent.get(cmsParent);
        if (ref != null) {
            Collection<ObjId> l = load(ref);
            l.remove(id);
            if (l.isEmpty()) {
                ref.remove(this.db);
                this.cmsNodeContent.remove(cmsParent);
            } else {
                this.db.update(ref.getRecId(), l, ObjIdCollectionSerializer.instance);
            }
        }
    }

}
