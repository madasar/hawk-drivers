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
package org.modelio.metamodel.impl.bpmn.flows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007c0b32-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMessageImpl extends BpmnRootElementImpl implements BpmnMessage {
    @objid ("16deedf9-b7ba-4e63-849f-288f959802d9")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(BpmnMessageData.Metadata.TypeDep());
    }

    @objid ("4811b903-b116-4eef-b2e3-7c520122ce69")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(BpmnMessageData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("6dbe45f4-c90f-47e7-a9c4-a5c9c740104a")
    @Override
    public EList<BpmnOperation> getOutputMessage() {
        return new SmList<>(this, BpmnMessageData.Metadata.OutputMessageDep());
    }

    @objid ("b7e1eb68-e6fd-4683-8a2f-84776df46e00")
    @Override
    public <T extends BpmnOperation> List<T> getOutputMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnOperation element : getOutputMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fab5d0b0-5f2a-4acf-85d1-c607aba2a056")
    @Override
    public BpmnItemDefinition getItemRef() {
        return (BpmnItemDefinition) getDepVal(BpmnMessageData.Metadata.ItemRefDep());
    }

    @objid ("1eb75067-d9fd-45f4-b9af-78feb4dce741")
    @Override
    public void setItemRef(BpmnItemDefinition value) {
        appendDepVal(BpmnMessageData.Metadata.ItemRefDep(), (SmObjectImpl)value);
    }

    @objid ("ebcb0d82-e39a-4763-804a-cae36b25b79d")
    @Override
    public State getInState() {
        return (State) getDepVal(BpmnMessageData.Metadata.InStateDep());
    }

    @objid ("9d9aa013-bb10-4020-a388-7fe30ff23ee7")
    @Override
    public void setInState(State value) {
        appendDepVal(BpmnMessageData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("785fe284-1850-48ce-a4ea-5b3706eda151")
    @Override
    public EList<BpmnMessageEventDefinition> getEventDefinition() {
        return new SmList<>(this, BpmnMessageData.Metadata.EventDefinitionDep());
    }

    @objid ("6c418c95-5e2f-42eb-860b-4c056b04d3af")
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

    @objid ("03f2859e-642c-4222-b72f-9f1b82d8808b")
    @Override
    public EList<BpmnSendTask> getSender() {
        return new SmList<>(this, BpmnMessageData.Metadata.SenderDep());
    }

    @objid ("a64d57cc-2418-483b-a669-ebb6af29f3f6")
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

    @objid ("89744efd-ad83-4e37-b66b-2a946ad09a28")
    @Override
    public EList<BpmnOperation> getInputMessage() {
        return new SmList<>(this, BpmnMessageData.Metadata.InputMessageDep());
    }

    @objid ("7569460c-8549-43f6-8750-a93a2cc581d5")
    @Override
    public <T extends BpmnOperation> List<T> getInputMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnOperation element : getInputMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("591a74c6-d49e-4574-806f-68231a64abd6")
    @Override
    public EList<BpmnReceiveTask> getReceiver() {
        return new SmList<>(this, BpmnMessageData.Metadata.ReceiverDep());
    }

    @objid ("0229633f-58df-4eb7-a970-dc2a1255ac33")
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

    @objid ("62718e85-7942-48f0-9d18-0083811d6f5e")
    @Override
    public EList<BpmnMessageFlow> getMessageFlow() {
        return new SmList<>(this, BpmnMessageData.Metadata.MessageFlowDep());
    }

    @objid ("3f4aa0bd-0a46-43be-a19d-3a30ca124d1e")
    @Override
    public <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessageFlow element : getMessageFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a44c5c9b-5a15-4201-bcd7-8d8ac3e3869e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f48ca461-fed9-4f1c-968a-70315519873f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("b74db708-4cad-4059-808e-e94474427de2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessage(this);
        else
          return null;
    }

}
