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

@objid ("48cf6ad7-abb4-4aa2-b08b-1d3fd25e2cf9")
public class HomonymCreationExpert extends DefaultLinkExpert {
    @objid ("3dfeb92c-1304-4722-94c3-4214b8b6fc40")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof Term) && (toElement instanceof Term);
    }

    @objid ("26aecd4b-ab5d-456b-982d-86c420df87d0")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Term.class)) && toMetaclass.hasBase(Metamodel.getMClass(Term.class));
    }

    @objid ("f632b06b-2467-407e-8b7c-034c7f3665a3")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof Term);
    }

    @objid ("6be6a91d-9c5d-464a-9e47-167acb300cc8")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Term.class));
    }

}
