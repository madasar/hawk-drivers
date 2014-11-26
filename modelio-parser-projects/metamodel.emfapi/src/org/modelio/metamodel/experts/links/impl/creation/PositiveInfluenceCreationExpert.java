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
import org.modelio.metamodel.analyst.Goal;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("aac2ce86-f4d2-4b00-8212-253f983ed2fc")
public class PositiveInfluenceCreationExpert extends DefaultLinkExpert {
    @objid ("d3015b9c-8f65-4428-8587-12a66458e5a5")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof Goal) &&
               (toElement instanceof Goal);
    }

    @objid ("f130aa8f-301e-4b6c-81de-6d42b287c2ab")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Goal.class)) &&
               toMetaclass.hasBase(Metamodel.getMClass(Goal.class));
    }

    @objid ("237b97ee-59d1-4139-8f32-7695c3fb6545")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof Goal);
    }

    @objid ("304fa88a-64b4-477e-b27e-c1e5f4e193aa")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Goal.class));
    }

}
