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
                                    

package org.modelio.vstore.exml.common.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Represents an object reference with its identifier and its CMS node identifier.
 */
@objid ("fd26ba08-5986-11e1-991a-001ec947ccaf")
public class ObjRef {
    /**
     * Object identifier.
     */
    @objid ("fd21f5c0-5986-11e1-991a-001ec947ccaf")
    public ObjId id;

    /**
     * Containing CMS node identifier.
     * <p>
     * Same as {@link #id} if the object is a CMS node itself.
     */
    @objid ("fd21f5e1-5986-11e1-991a-001ec947ccaf")
    public ObjId pid;

    /**
     * Constructor.
     */
    @objid ("fd245749-5986-11e1-991a-001ec947ccaf")
    public ObjRef() {
    }

}
