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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnUserTask;
import org.modelio.metamodel.data.bpmn.activities.BpmnUserTaskData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0086559c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnUserTaskImpl extends BpmnTaskImpl implements BpmnUserTask {
    @objid ("48839771-fd4e-47db-83dc-b2ea00d5ce02")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnUserTaskData.Metadata.ImplementationAtt());
    }

    @objid ("b59c11a0-72a0-4c63-aa31-f19303ef410c")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnUserTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("45f96bd9-f757-4b8d-9e26-99bdb4e9ac3e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d029a63e-b116-4c78-9992-4d4be473caba")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2c4477da-44d5-480d-b736-53d7ca53e47d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnUserTask(this);
        else
          return null;
    }

}
