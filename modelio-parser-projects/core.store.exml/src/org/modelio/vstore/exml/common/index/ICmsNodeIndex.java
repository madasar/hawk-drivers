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
                                    

package org.modelio.vstore.exml.common.index;

import java.io.IOException;
import java.util.Collection;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vstore.exml.common.model.ObjId;

/**
 * CMS nodes composition index.
 * <p>
 * Contains many indexes: <ul>
 * <li> one to get the CMS node of any object
 * <li> one to get the parent CMS node of another CMS node.
 * <li> one to get all CMS nodes of a given metaclass.
 * </ul>
 */
@objid ("d9d85589-5c79-11e1-863f-001ec947ccaf")
public interface ICmsNodeIndex {
    /**
     * Registers 2 CMS nodes parent relationship.
     * @param cmsNodeId the child CMS node.
     * @param parentId the parent CMS node.
     * @throws java.io.IOException in case of I/O error.
     */
    @objid ("32311d3e-5c7b-11e1-863f-001ec947ccaf")
    void setParent(final ObjId cmsNodeId, final ObjId parentId) throws IOException;

    /**
     * Get the parent CMS node of the given CMS node.
     * @param id a CMS node
     * @return its parent CMS node.
     * @throws java.io.IOException in case of I/O error.
     */
    @objid ("32311d43-5c7b-11e1-863f-001ec947ccaf")
    ObjId getParentNodeOf(final ObjId id) throws IOException;

    /**
     * Add a known CMS node.
     * @param id a CMS node ID.
     * @throws java.io.IOException in case of I/O error.
     */
    @objid ("32311d47-5c7b-11e1-863f-001ec947ccaf")
    void addCmsNode(final ObjId id) throws IOException;

    /**
     * Get all model objects of the given class.
     * <p>
     * Does not return child metaclasses nodes.
     * @param cls a metaclass.
     * @return all CMS node IDs.
     */
    @objid ("32311d4a-5c7b-11e1-863f-001ec947ccaf")
    Collection<UUID> getByMClass(final SmClass cls);

    /**
     * Tells whether the given model object is stored in the repository.
     * @throws IOException
     * @param id a model object ID.
     * @return <code>true</code> if the object is in the repository else false.
     */
    @objid ("32311d53-5c7b-11e1-863f-001ec947ccaf")
    boolean isStored(final ObjId id) throws IOException;

    /**
     * Get the CMS node containing the object.
     * <p>
     * If the object is a stored CMS node, return itself.
     * @param id the object to find
     * @return the CMS node ID.
     * @throws java.io.IOException in case of I/O error
     */
    @objid ("32337f87-5c7b-11e1-863f-001ec947ccaf")
    ObjId getCmsNodeOf(final ObjId id) throws IOException;

    /**
     * Register an object contained by a CMS node.
     * @param cmsNodeId ID of the CMS node containing the model object
     * @param objectId the contained object ID.
     * @throws java.io.IOException in case of I/O error
     */
    @objid ("32337f8b-5c7b-11e1-863f-001ec947ccaf")
    void addObject(final ObjId cmsNodeId, final ObjId objectId) throws IOException;

    /**
     * @return <code>true</code> if the index is empty.
     */
    @objid ("82e01a23-5ca7-11e1-863f-001ec947ccaf")
    boolean isEmpty();

    /**
     * Remove the given object from all indexes.
     * @param id the object id
     * @throws java.io.IOException in case of error updating the indexes.
     */
    @objid ("d5b1367a-6231-11e1-b31a-001ec947ccaf")
    void removeObj(final ObjId id) throws IOException;

    /**
     * Get the name of the given model object.
     * @param id the model object identifier.
     * @return the object name.
     * @throws java.io.IOException in case of I/O error
     */
    @objid ("e7f8000f-55ba-11e2-81b0-001ec947ccaf")
    String getName(ObjId id) throws IOException;

}
