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
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("47e72af4-a985-4ffe-b3cb-5ce4902244f8")
public class RefineCreationExpert extends DefaultLinkExpert {
    @objid ("9ce952e0-8e3e-43b1-87ad-a7639faa0160")
    @Override
    public boolean canLink(MClass link, final MObject fromElement, final MObject toElement) {
        if ((fromElement instanceof Activity) ||
            (fromElement instanceof Operation) ||
            (fromElement instanceof BusinessRule)) {
            if (toElement instanceof BusinessRule) {
                return true;
            }
        }
        if ((fromElement instanceof ModelElement) ||
            (fromElement instanceof Requirement)) {
            return (toElement instanceof Requirement);
        }
        return false;
    }

    @objid ("dd718042-7db2-4d06-858d-c2d4b0d91d79")
    @Override
    public boolean canLink(MClass link, final MClass fromMetaclass, final MClass toMetaclass) {
        if (fromMetaclass.hasBase(Metamodel.getMClass(ModelElement.class)))
            return toMetaclass.hasBase(Metamodel.getMClass(Requirement.class)) || toMetaclass.hasBase(Metamodel.getMClass(BusinessRule.class));
        return false;
    }

    @objid ("0a332aca-748c-4e28-8d36-756b017cc087")
    @Override
    public boolean canSource(MObject link, final MObject fromElement) {
        return fromElement instanceof ModelElement;
    }

    @objid ("4baeb6cd-e9f5-43dd-9a61-fc539560d46f")
    @Override
    public boolean canSource(MClass link, final MClass fromMetaclass) {
        return fromMetaclass.hasBase(Metamodel.getMClass(ModelElement.class));
    }

}
