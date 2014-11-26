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
import org.modelio.metamodel.analyst.Term;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("88109802-1344-42f2-a2a7-b4450b9a91db")
public class KindOfCreationExpert extends DefaultLinkExpert {
    @objid ("db43ff20-3b4c-493d-86a2-2e45f48e9b40")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return ((fromElement instanceof Term) && (toElement instanceof Term));
    }

    @objid ("f7135599-8434-45fd-8c0d-e87e66e6b709")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return (fromMetaclass.hasBase(Metamodel.getMClass(Term.class)) && toMetaclass.hasBase(Metamodel.getMClass(Term.class)));
    }

    @objid ("9a6c7eef-e446-4efc-a09e-e345243f92b2")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof Term);
    }

    @objid ("3e8454ee-6685-44c8-9156-2c2984a6ecbe")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Term.class));
    }

}
