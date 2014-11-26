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
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("592f9675-33fb-4720-8e32-a671f96cd940")
public interface ICompoundExpert {
    /**
     * Register a stereotyped element creation expert.
     * @param ste The stereotype
     * @param expert The creation expert.
     */
    @objid ("c6d2a21a-8b09-4f64-84ee-4403211e26d8")
    void registerExpert(final Stereotype ste, final ILinkExpert expert);

    /**
     * Remove the creation expert registered for the given stereotype.
     * @param ste The stereotype to forget.
     */
    @objid ("3efe47f1-0eab-4a56-b164-6b47af540e65")
    void unregisterExpert(final Stereotype ste);

}
