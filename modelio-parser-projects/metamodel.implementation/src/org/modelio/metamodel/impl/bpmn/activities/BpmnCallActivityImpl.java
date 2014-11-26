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
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.data.bpmn.activities.BpmnCallActivityData;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007f281c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnCallActivityImpl extends BpmnActivityImpl implements BpmnCallActivity {
    @objid ("97ab6cfa-1c6b-4f4d-86ba-33d1b54fc3eb")
    @Override
    public BpmnTask getCalledGlobalTask() {
        return (BpmnTask) getDepVal(BpmnCallActivityData.Metadata.CalledGlobalTaskDep());
    }

    @objid ("915144ef-5417-419b-8195-987090184fd2")
    @Override
    public void setCalledGlobalTask(BpmnTask value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledGlobalTaskDep(), (SmObjectImpl)value);
    }

    @objid ("a0bf196e-ff2d-4bb2-88e6-516de81ca731")
    @Override
    public BpmnProcess getCalledProcess() {
        return (BpmnProcess) getDepVal(BpmnCallActivityData.Metadata.CalledProcessDep());
    }

    @objid ("affe5808-f1f8-4be8-87fb-58542e865aa0")
    @Override
    public void setCalledProcess(BpmnProcess value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledProcessDep(), (SmObjectImpl)value);
    }

    @objid ("0528743e-f5f1-458c-82a6-b5d422613952")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnCallActivityData.Metadata.CalledOperationDep());
    }

    @objid ("39c537b9-3752-49e3-a1eb-daa2a82b0942")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("d78e4e08-e4e5-453a-8a6c-af3e50d6cfed")
    @Override
    public Behavior getCalledBehavior() {
        return (Behavior) getDepVal(BpmnCallActivityData.Metadata.CalledBehaviorDep());
    }

    @objid ("b6218233-2197-4c0b-9f44-3278ce30efcc")
    @Override
    public void setCalledBehavior(Behavior value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledBehaviorDep(), (SmObjectImpl)value);
    }

    @objid ("0fbf1448-0094-438e-8f93-b443eb777911")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("47a61023-3121-4ac2-8eaf-f200ff4787e4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("151319ab-aa38-43c5-b35b-47785c32ac90")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCallActivity(this);
        else
          return null;
    }

}
