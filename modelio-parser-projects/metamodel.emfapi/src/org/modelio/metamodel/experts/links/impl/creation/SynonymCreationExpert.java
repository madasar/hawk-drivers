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

@objid ("312ef855-5429-40d5-8557-0cbdd56e490c")
public class SynonymCreationExpert extends DefaultLinkExpert {
    @objid ("f99ed98b-b991-44ef-abb7-18a0308954bf")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof Term) && (toElement instanceof Term);
    }

    @objid ("a76328a7-02a8-476f-a0dc-e38f23ae4504")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Term.class)) && toMetaclass.hasBase(Metamodel.getMClass(Term.class));
    }

    @objid ("b7d2bdbd-656a-47d1-a6a6-e53cfce9d6e0")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof Term);
    }

    @objid ("e03fd1ae-e517-493c-9632-ce82a3577ee7")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Term.class));
    }

}
