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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vstore.exml.common.model.ObjId;

/**
 * Object index entry value.
 * Contains the name of the object and its parent identifier.
 */
@objid ("9998a148-55b4-11e2-81b0-001ec947ccaf")
class ObjectIndexValue {
    @objid ("e7ff26d4-55ba-11e2-81b0-001ec947ccaf")
     String name;

    @objid ("e7ff26d5-55ba-11e2-81b0-001ec947ccaf")
     ObjId cmsNodeId;

    @objid ("e7ff26d6-55ba-11e2-81b0-001ec947ccaf")
    public ObjectIndexValue(String name, ObjId parentId) {
        this.name = name;
        this.cmsNodeId = parentId;
    }

}
