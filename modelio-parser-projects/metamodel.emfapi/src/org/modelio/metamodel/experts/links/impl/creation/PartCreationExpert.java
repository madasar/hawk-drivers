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

@objid ("0de4d782-d564-4821-8eb9-d1279bb1fc8e")
public class PartCreationExpert extends DefaultLinkExpert {
    @objid ("335fe2e3-d411-47e5-bd6e-b591f39be457")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        return ((fromElement instanceof Goal) &&
                (toElement instanceof Goal)) ||
               ((fromElement instanceof Requirement) &&
                (toElement instanceof Requirement));
    }

    @objid ("afc1df3a-16f5-4418-819d-e4537542ddea")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        return (fromMetaclass.hasBase(Metamodel.getMClass(Requirement.class)) && toMetaclass.hasBase(Metamodel.getMClass(Requirement.class))) ||
               (fromMetaclass.hasBase(Metamodel.getMClass(Goal.class)) && toMetaclass.hasBase(Metamodel.getMClass(Goal.class)));
    }

    @objid ("e6f5f70b-ecac-46f9-963d-469a0dd8c97b")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return ((fromElement instanceof Goal)) ||
               ((fromElement instanceof Requirement));
    }

    @objid ("546d0d4f-b10b-4069-830b-ac4a325056b6")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(Requirement.class)) ||
               fromMetaclass.hasBase(Metamodel.getMClass(Goal.class));
    }

}
