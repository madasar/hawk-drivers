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
                                    

package org.modelio.metamodel.experts.links.impl.creation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("0de67fd3-1b60-477a-8010-9e5e68bea8af")
public class SatisfyCreationExpert extends DefaultLinkExpert {
    @objid ("178f2bea-3140-4877-a1e2-c9a84e222f5d")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof ModelElement) &&
               (toElement instanceof Requirement);
    }

    @objid ("4c50ecd5-a3b7-403b-8275-a616cb2e130f")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(ModelElement.class)) &&
               toMetaclass.hasBase(Metamodel.getMClass(Requirement.class));
    }

    @objid ("f5389ff7-d39b-4687-93b9-3f370b043583")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof ModelElement);
    }

    @objid ("c8d8807b-1773-4ee1-b0ed-20f50eadabc7")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(ModelElement.class));
    }

}
