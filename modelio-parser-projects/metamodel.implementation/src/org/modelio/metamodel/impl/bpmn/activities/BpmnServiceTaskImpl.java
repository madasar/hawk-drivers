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
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.data.bpmn.activities.BpmnServiceTaskData;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00833fec-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnServiceTaskImpl extends BpmnTaskImpl implements BpmnServiceTask {
    @objid ("f4166573-9e0a-42e8-b540-2bf9c1db648e")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnServiceTaskData.Metadata.ImplementationAtt());
    }

    @objid ("d89b44ca-88e5-4fb0-9c24-b96b943d0fcb")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnServiceTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("10ccda12-1d43-4953-befc-e38827bd01fe")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnServiceTaskData.Metadata.CalledOperationDep());
    }

    @objid ("ebadbb99-91e5-494e-9423-4559ff790d44")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnServiceTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("5f2b6d2b-fe05-41a7-811c-29affccd4aeb")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnServiceTaskData.Metadata.OperationRefDep());
    }

    @objid ("b295f9ca-1dac-4b13-9318-884faced4401")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnServiceTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("fc3098e0-eb30-4a19-a0be-5405e1dddaef")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("0752b4a5-1af3-49f6-84a5-d1695502ad6e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("209089e6-707b-4aec-b866-e940613ad44b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnServiceTask(this);
        else
          return null;
    }

}
