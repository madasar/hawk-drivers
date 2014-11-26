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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vstore.exml.common.model.ObjId;

/**
 * Interface for the node uses indexes.
 */
@objid ("de5a4021-5c79-11e1-863f-001ec947ccaf")
public interface IUserNodeIndex {
    /**
     * Remove a CMS node from the indexes.
     * @param id
     * @throws IOException
     */
    @objid ("32337f90-5c7b-11e1-863f-001ec947ccaf")
    void remove(final ObjId id) throws IOException;

    /**
     * Add a used node.
     * @param userNodeId the user CMS node
     * @param usedNodeId the used CMS node.
     * @throws java.io.IOException in case of IO failure.
     */
    @objid ("32337f93-5c7b-11e1-863f-001ec947ccaf")
    void addUsed(final ObjId userNodeId, final ObjId usedNodeId) throws IOException;

    /**
     * Get the CMS nodes using the given CMS node.
     * @param cmsNodeId a CMS node ID.
     * @return The ID of all CMS nodes using it.
     */
    @objid ("32337f98-5c7b-11e1-863f-001ec947ccaf")
    Collection<ObjId> getUsers(final ObjId cmsNodeId);

    /**
     * Get the CMS nodes using the given foreign object.
     * <p>
     * The foreign object comes from another repository, may not be a CMS node,
     * and the foreign repository may not know the CMS node concept.
     * @param foreignObjId The foreign object ID.
     * @return All CMS nodes using this object.
     */
    @objid ("f08a4ec7-92d7-11e1-be7e-001ec947ccaf")
    Collection<ObjId> getForeignUsers(final ObjId foreignObjId);

    /**
     * Add a foreign object used by a CMS node.
     * <p>
     * The foreign object comes from another repository, may not be a CMS node,
     * and the foreign repository may not know the CMS node concept.
     * @param userNodeId the user CMS node ID.
     * @param usedForeignId the used foreign object ID.
     * @throws java.io.IOException in case of IO failure.
     */
    @objid ("f08a4ece-92d7-11e1-be7e-001ec947ccaf")
    void addUsedForeignObj(final ObjId userNodeId, final ObjId usedForeignId) throws IOException;

}
