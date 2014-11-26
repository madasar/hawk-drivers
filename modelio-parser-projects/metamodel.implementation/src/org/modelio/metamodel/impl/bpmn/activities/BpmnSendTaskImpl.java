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
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.data.bpmn.activities.BpmnSendTaskData;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0082b734-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSendTaskImpl extends BpmnTaskImpl implements BpmnSendTask {
    @objid ("07ddba69-8d03-4ac7-88e6-a2efd5dc4543")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnSendTaskData.Metadata.ImplementationAtt());
    }

    @objid ("0bc04080-719d-44e0-b456-7774acf4e858")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnSendTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("1d2d45b4-65bc-44be-b228-d5d24ea8bd14")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnSendTaskData.Metadata.MessageRefDep());
    }

    @objid ("d3909456-1f50-463c-afa9-3be7ae0ac5f9")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnSendTaskData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("e5ccd3ac-2ad5-41eb-a8a2-56bfdd1ebb4b")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnSendTaskData.Metadata.OperationRefDep());
    }

    @objid ("2c8d7c64-d5d8-475f-8d82-20b4ce0a0a6d")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnSendTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("d4e431bc-6ed1-4039-b83a-47798f7cc09d")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnSendTaskData.Metadata.CalledOperationDep());
    }

    @objid ("45fd19c9-8e05-4faf-ba53-6fb4617db266")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnSendTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("17fb346e-2bf6-46cd-aeb1-7cd0d8bebd70")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("cd7ca611-c331-4a91-ba87-d1e7dc7f7254")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d8762818-396c-4859-82b8-e74eaa5a56d6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSendTask(this);
        else
          return null;
    }

}
