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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9c222e7f-c6b2-4122-bbb3-6341f1d7adec")
public class DeriveCreationExpert extends DefaultLinkExpert {
    @objid ("9dc906c1-06d0-43bd-ad66-b01927857693")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        if ((fromElement instanceof UseCase) ||
            (fromElement instanceof Requirement))
            return (toElement instanceof Requirement);
        return false;
    }

    @objid ("94bcbbe3-bba4-439f-93f1-00f32aac1d2e")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        if ((fromMetaclass.hasBase(Metamodel.getMClass(UseCase.class))) ||
            (fromMetaclass.hasBase(Metamodel.getMClass(Requirement.class))))
            return toMetaclass.hasBase(Metamodel.getMClass(Requirement.class));
        return false;
    }

    @objid ("23517b88-8fbc-44f5-b1e0-46b0aae29cc3")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return (fromElement instanceof UseCase) ||
               (fromElement instanceof Requirement);
    }

    @objid ("1aa08770-62d3-4017-bb89-f025779cb044")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return ((fromMetaclass.hasBase(Metamodel.getMClass(UseCase.class))) || (fromMetaclass.hasBase(Metamodel.getMClass(Requirement.class))));
    }

}
