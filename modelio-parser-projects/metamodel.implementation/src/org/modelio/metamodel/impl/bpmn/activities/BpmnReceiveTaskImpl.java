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
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.data.bpmn.activities.BpmnReceiveTaskData;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0081a92a-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnReceiveTaskImpl extends BpmnTaskImpl implements BpmnReceiveTask {
    @objid ("d55eaa48-fb05-4e72-8710-29275daa9b26")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnReceiveTaskData.Metadata.ImplementationAtt());
    }

    @objid ("5137f626-44e8-4f6c-a593-1a265d6227e0")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnReceiveTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("3ba4eba8-01a7-450c-96da-6e1da3372be3")
    @Override
    public boolean isInstanciate() {
        return (Boolean) getAttVal(BpmnReceiveTaskData.Metadata.InstanciateAtt());
    }

    @objid ("1826a55b-3d17-4245-893a-f041b6b2df29")
    @Override
    public void setInstanciate(boolean value) {
        setAttVal(BpmnReceiveTaskData.Metadata.InstanciateAtt(), value);
    }

    @objid ("6e1a9ade-087e-4363-b4ae-8167b67ee615")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnReceiveTaskData.Metadata.MessageRefDep());
    }

    @objid ("2ec3e14b-d4fd-44e1-a7b7-0db3be0c5013")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("cd4b6b7c-7a85-4c37-906f-fe4c216132dd")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnReceiveTaskData.Metadata.OperationRefDep());
    }

    @objid ("ccaa43b3-81bc-44b1-8477-28915865bade")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("0c73e8a2-be20-48cc-b4d9-982b19008f3f")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnReceiveTaskData.Metadata.CalledOperationDep());
    }

    @objid ("587d314a-1c53-4ccf-affe-5106447dfd38")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("67595954-6d9e-4936-95e2-0dbcffb892a9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("15e3ca92-951f-4f1e-8550-fd92e29b4cf6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ab3aeb74-8951-4313-8672-9435d76b67e0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnReceiveTask(this);
        else
          return null;
    }

}
