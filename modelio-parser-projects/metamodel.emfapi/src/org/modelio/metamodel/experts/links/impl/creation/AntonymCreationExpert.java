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

@objid ("a71952f8-9a7a-4897-aab5-8693c08b143c")
public class AntonymCreationExpert extends DefaultLinkExpert {
    @objid ("89516ce7-cbd4-4bcb-afa4-1368bd0199de")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof Term) && (toElement instanceof Term);
    }

    @objid ("dda17e89-e1aa-46d1-81d9-19010bf3a195")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Term.class)) && toMetaclass.hasBase(Metamodel.getMClass(Term.class));
    }

    @objid ("875363ec-701d-4976-a13a-40057b9bb500")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof Term);
    }

    @objid ("acc06291-f153-48f3-a72b-3d8d6c49f3cd")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Term.class));
    }

}
