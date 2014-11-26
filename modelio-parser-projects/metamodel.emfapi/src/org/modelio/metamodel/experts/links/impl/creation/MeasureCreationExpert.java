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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("27cfdd34-4686-44c2-8db3-0396f01d2c36")
public class MeasureCreationExpert extends DefaultLinkExpert {
    @objid ("cbd4de82-ea64-4d2f-b81c-e8533447cc85")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof ModelElement) &&
               (toElement instanceof Goal);
    }

    @objid ("a5363157-93e2-4df8-9190-da24dbf2fd8b")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(ModelElement.class)) &&
               toMetaclass.hasBase(Metamodel.getMClass(Goal.class));
    }

    @objid ("bee6fa98-1f2a-415c-87dc-df08077baa53")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof ModelElement);
    }

    @objid ("f3980d82-451d-4fb4-a222-8982a9d4b091")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(ModelElement.class));
    }

}
