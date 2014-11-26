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
                                    

package org.modelio.metamodel.experts.links;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Link manipulation tools to get or set model link source and target.
 */
@objid ("3bc8a472-8cd8-4769-8954-30a508ac8523")
public interface ILinkManipulator {
    /**
     * Get a model link source
     * @param aLink a model link.
     * @return the link source
     */
    @objid ("2d8fd297-ce24-4748-87f8-6ade693cebb0")
    MObject getSource(MObject aLink);

    /**
     * Get a model link target.
     * @param aLink a model link.
     * @return the link target.
     */
    @objid ("d8697327-cbe0-498a-a20d-6f4c2e8432ff")
    MObject getTarget(MObject aLink);

    /**
     * Change a model link source.
     * @param link a model link.
     * @param oldSource the old source.
     * @param newSource the new source.
     * @throws java.lang.IllegalArgumentException if the new destination is illegal or the link is not  a model link.
     */
    @objid ("279ac9ec-7fc1-4282-a601-0a410e726676")
    void setSource(MObject link, MObject oldSource, MObject newSource) throws IllegalArgumentException;

    /**
     * Change a model link target.
     * @param link a model link.
     * @param oldTarget the old target.
     * @param newTarget the new target.
     * @throws java.lang.IllegalArgumentException if the new destination is illegal or the link is not  a model link.
     */
    @objid ("a1e8779c-83e3-42a5-bd4e-0a3435e7c694")
    void setTarget(MObject link, MObject oldTarget, MObject newTarget) throws IllegalArgumentException;

}
