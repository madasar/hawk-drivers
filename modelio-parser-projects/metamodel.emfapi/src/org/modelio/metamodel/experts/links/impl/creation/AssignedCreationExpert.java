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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * AssignedCreationExpert
 */
@objid ("d13d6b37-06f9-4c33-8289-ebe72e7c706f")
public class AssignedCreationExpert extends DefaultLinkExpert {
    @objid ("ba031b8f-ea1e-4347-826e-49b9a83d0410")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        if ((fromElement instanceof Interface) ||
            (fromElement instanceof Actor) ||
            (fromElement instanceof Package) ||
            (fromElement instanceof BpmnProcess) ||
            (fromElement instanceof BpmnBehavior))
            return (toElement instanceof Goal);
        return false;
    }

    @objid ("45e5e0d8-9882-435b-a553-51e1ee471bf2")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        if ((fromMetaclass.hasBase(Metamodel.getMClass(Interface.class))) ||
            (fromMetaclass.hasBase(Metamodel.getMClass(Actor.class))) ||
            (fromMetaclass.hasBase(Metamodel.getMClass(Package.class))) ||
            (fromMetaclass.hasBase(Metamodel.getMClass(BpmnProcess.class)) ||
            (fromMetaclass.hasBase(Metamodel.getMClass(BpmnBehavior.class)))))
            return toMetaclass.hasBase(Metamodel.getMClass(Goal.class));
        return false;
    }

    @objid ("6fbcca1a-0707-4664-aa1f-77ba0b9caf85")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return ((fromElement instanceof Interface) ||
                (fromElement instanceof Actor) ||
                (fromElement instanceof Package) ||
                (fromElement instanceof BpmnProcess) ||
                (fromElement instanceof BpmnBehavior));
    }

    @objid ("1e7d36e1-3db3-4b2e-a1cf-ec6e40655db5")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return ((fromMetaclass.hasBase(Metamodel.getMClass(Interface.class))) ||
                (fromMetaclass.hasBase(Metamodel.getMClass(Actor.class))) ||
                (fromMetaclass.hasBase(Metamodel.getMClass(Package.class))) ||
                (fromMetaclass.hasBase(Metamodel.getMClass(BpmnProcess.class))) ||
                (fromMetaclass.hasBase(Metamodel.getMClass(BpmnBehavior.class))));
    }

}
