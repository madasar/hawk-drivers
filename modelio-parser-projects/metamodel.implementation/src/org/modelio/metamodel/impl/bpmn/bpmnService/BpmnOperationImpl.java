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
package org.modelio.metamodel.impl.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000d7c30-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnOperationImpl extends BpmnBaseElementImpl implements BpmnOperation {
    @objid ("c5f45ce2-d6b7-4eaa-920f-9344e6a5a3bd")
    @Override
    public EList<BpmnSendTask> getSender() {
        return new SmList<>(this, BpmnOperationData.Metadata.SenderDep());
    }

    @objid ("80de0f1a-0fdc-4cd8-8c94-51c733e9b0b5")
    @Override
    public <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnSendTask element : getSender()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3a4f036e-d567-4b7e-8c28-698117b8be91")
    @Override
    public BpmnMessage getInMessageRef() {
        return (BpmnMessage) getDepVal(BpmnOperationData.Metadata.InMessageRefDep());
    }

    @objid ("49236ab7-88ae-4f3a-b8a8-00a5efade40e")
    @Override
    public void setInMessageRef(BpmnMessage value) {
        appendDepVal(BpmnOperationData.Metadata.InMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("bccb100a-a2b9-4292-9401-f5cbd63453c9")
    @Override
    public EList<BpmnServiceTask> getCaller() {
        return new SmList<>(this, BpmnOperationData.Metadata.CallerDep());
    }

    @objid ("8fbee56e-1c72-469a-86c9-a57fb836b4cf")
    @Override
    public <T extends BpmnServiceTask> List<T> getCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnServiceTask element : getCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a1c57210-86b8-4f55-9073-9ae2d24c9908")
    @Override
    public BpmnMessage getOutMessageRef() {
        return (BpmnMessage) getDepVal(BpmnOperationData.Metadata.OutMessageRefDep());
    }

    @objid ("45a4c498-26c1-448b-9ce7-264ae6ab0e4c")
    @Override
    public void setOutMessageRef(BpmnMessage value) {
        appendDepVal(BpmnOperationData.Metadata.OutMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("0da633df-e257-4fd3-88b7-d3c8d457fd30")
    @Override
    public EList<BpmnMessageEventDefinition> getEventDefinition() {
        return new SmList<>(this, BpmnOperationData.Metadata.EventDefinitionDep());
    }

    @objid ("d169fa5f-5360-451d-85f0-523178ec7910")
    @Override
    public <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessageEventDefinition element : getEventDefinition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4157b008-e9be-46f6-a76d-e19d8eeca728")
    @Override
    public Operation getImplementationRef() {
        return (Operation) getDepVal(BpmnOperationData.Metadata.ImplementationRefDep());
    }

    @objid ("31ee60e4-3ab1-415c-9dbf-93f05550961a")
    @Override
    public void setImplementationRef(Operation value) {
        appendDepVal(BpmnOperationData.Metadata.ImplementationRefDep(), (SmObjectImpl)value);
    }

    @objid ("e82367a7-46ac-49bf-8bf9-309cbf184a2c")
    @Override
    public BpmnInterface getBpmnInterfaceRef() {
        return (BpmnInterface) getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
    }

    @objid ("1a023223-3757-4709-ba86-ab3e4f75b5c2")
    @Override
    public void setBpmnInterfaceRef(BpmnInterface value) {
        appendDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep(), (SmObjectImpl)value);
    }

    @objid ("590349bd-2dc0-4abb-a23f-5c4de3c579f5")
    @Override
    public EList<BpmnReceiveTask> getReceiver() {
        return new SmList<>(this, BpmnOperationData.Metadata.ReceiverDep());
    }

    @objid ("2b845fe5-0fc6-47ac-80bb-e9ee21bf458f")
    @Override
    public <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnReceiveTask element : getReceiver()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2c547777-8d66-495b-9bb8-29cd6cca9d8a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("989c8b68-a942-4ec3-96d0-1036f02586e7")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
        if (obj != null)
          return new SmDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("27e0f044-e251-4b5f-8b71-1bebe2510c4a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnOperation(this);
        else
          return null;
    }

}
