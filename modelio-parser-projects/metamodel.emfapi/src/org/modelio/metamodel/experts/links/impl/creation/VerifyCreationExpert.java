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

@objid ("35a1c8b7-0a6f-4715-aba5-7583891353f0")
public class VerifyCreationExpert extends DefaultLinkExpert {
    @objid ("b8b774f1-6ede-486f-8b44-642ca1743c62")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof ModelElement) &&
               (toElement instanceof Requirement);
    }

    @objid ("a5e5552c-020f-4173-91dd-e2feb19d4966")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(ModelElement.class)) &&
               toMetaclass.hasBase(Metamodel.getMClass(Requirement.class));
    }

    @objid ("3d7ca32e-3071-40d5-bd5b-d9aed5b4e9b0")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof ModelElement);
    }

    @objid ("40786a3f-2ef2-4c5c-8404-e2730b386fde")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(ModelElement.class));
    }

}
