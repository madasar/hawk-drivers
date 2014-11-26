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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("cdc8e3d6-6a0f-49c1-9612-c1cded0764d1")
public class ImplementCreationExpert extends DefaultLinkExpert {
    @objid ("ec9c7396-3601-48fc-ac42-a86f09918871")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        if ((fromElement instanceof Class) || (fromElement instanceof BpmnProcess))
            return (toElement instanceof BusinessRule);
        return false;
    }

    @objid ("0b53e617-5dd0-459b-bea4-a80a8473355b")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        if ((fromMetaclass.hasBase(Metamodel.getMClass(Class.class))) ||
            (fromMetaclass.hasBase(Metamodel.getMClass(BpmnProcess.class))))
            return toMetaclass.hasBase(Metamodel.getMClass(BusinessRule.class));
        return false;
    }

    @objid ("db1f5e3f-fb9b-4ae2-86de-46fe6f1cf2ed")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return ((fromElement instanceof Class) || (fromElement instanceof BpmnProcess));
    }

    @objid ("c4a46d46-4d0f-4ff2-a9c5-67381d126d54")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return ((fromMetaclass.hasBase(Metamodel.getMClass(Class.class))) || (fromMetaclass.hasBase(Metamodel.getMClass(BpmnProcess.class))));
    }

}
