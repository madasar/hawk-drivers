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

@objid ("df0d2bad-e64f-4058-bb4e-044d14df807c")
public class NegativeInfluenceCreationExpert extends DefaultLinkExpert {
    @objid ("fe30276b-8b17-43ec-9fb1-5ab3d1010f91")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof Goal) &&
               (toElement instanceof Goal);
    }

    @objid ("b28521f3-ffe2-4e58-b860-e0164bda8451")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Goal.class)) &&
               toMetaclass.hasBase(Metamodel.getMClass(Goal.class));
    }

    @objid ("9072ae34-6a6f-4d18-bb74-d958c80f9844")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof Goal);
    }

    @objid ("831aa715-8d9f-4732-9ebd-5189f75d9663")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Goal.class));
    }

}
