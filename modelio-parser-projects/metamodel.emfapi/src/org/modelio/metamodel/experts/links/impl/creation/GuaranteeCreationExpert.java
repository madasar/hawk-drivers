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
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("bff5be77-2398-48fa-b5e5-3f32e391319c")
public class GuaranteeCreationExpert extends DefaultLinkExpert {
    @objid ("b1bc19af-14f4-44dc-9f7d-b8333c3b0040")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof Requirement) &&
               (toElement instanceof Goal);
    }

    @objid ("b6028a5d-4ac0-4779-aac3-e9bd1efbfb7c")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Requirement.class)) &&
               toMetaclass.hasBase(Metamodel.getMClass(Goal.class));
    }

    @objid ("72d79e18-ebf4-41ed-9500-a30c41547382")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof Requirement);
    }

    @objid ("b8fddf77-5dcc-4fe7-ae3c-02b3ad8afc18")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Requirement.class));
    }

}
