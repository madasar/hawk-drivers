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
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * Service methods to work with 'links', e.g. Generalizations, Dependencies...
 * <p>
 * Each link has a generic 'source' and 'target', that can represent several MDependencies. In most cases, the source is also the composition owner.
 * </p>
 */
@objid ("003b72ac-d2e6-1097-bcec-001ec947cd2a")
public interface ILinkTool extends ILinkExpert, ILinkMdaExpert, ICompoundExpert, ILinkManipulator {
    /**
     * Tells whether or not this metaclass is considered as a link.
     * @param metaclass the metaclass to test.
     * @return true if this metaclass is a link.
     */
    @objid ("0005821e-de02-1097-bcec-001ec947cd2a")
    boolean isLink(MClass metaclass);

}
