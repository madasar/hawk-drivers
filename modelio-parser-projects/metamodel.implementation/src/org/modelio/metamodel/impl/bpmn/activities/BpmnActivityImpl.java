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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007d9466-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnActivityImpl extends BpmnFlowNodeImpl implements BpmnActivity {
    @objid ("c34577da-ffa3-4c16-b366-7327a7e0067a")
    @Override
    public boolean isIsForCompensation() {
        return (Boolean) getAttVal(BpmnActivityData.Metadata.IsForCompensationAtt());
    }

    @objid ("f7611850-ae5b-4d42-965d-bd001c1b4239")
    @Override
    public void setIsForCompensation(boolean value) {
        setAttVal(BpmnActivityData.Metadata.IsForCompensationAtt(), value);
    }

    @objid ("7f40e23a-5f3a-4f47-8cc6-e043ce0f9da0")
    @Override
    public int getStartQuantity() {
        return (Integer) getAttVal(BpmnActivityData.Metadata.StartQuantityAtt());
    }

    @objid ("0c537bcc-e14f-488b-b86e-72d87dfac4d9")
    @Override
    public void setStartQuantity(int value) {
        setAttVal(BpmnActivityData.Metadata.StartQuantityAtt(), value);
    }

    @objid ("f38d3000-bcc5-4a96-9323-bbaa1bc576da")
    @Override
    public int getCompletionQuantity() {
        return (Integer) getAttVal(BpmnActivityData.Metadata.CompletionQuantityAtt());
    }

    @objid ("9c7f61a7-b0c0-4ef7-907b-fca99c5bc7ab")
    @Override
    public void setCompletionQuantity(int value) {
        setAttVal(BpmnActivityData.Metadata.CompletionQuantityAtt(), value);
    }

    @objid ("72a71152-fd9c-415d-b6b1-75eda83e6e52")
    @Override
    public EList<BpmnCompensateEventDefinition> getCompensateEventDefinitions() {
        return new SmList<>(this, BpmnActivityData.Metadata.CompensateEventDefinitionsDep());
    }

    @objid ("83ac56a7-a826-4e68-b757-0f2c5ba14b34")
    @Override
    public <T extends BpmnCompensateEventDefinition> List<T> getCompensateEventDefinitions(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnCompensateEventDefinition element : getCompensateEventDefinitions()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("95c38a94-7010-41de-b89a-4a4a8de89c05")
    @Override
    public EList<BpmnDataInput> getInputSpecification() {
        return new SmList<>(this, BpmnActivityData.Metadata.InputSpecificationDep());
    }

    @objid ("436cc89e-a42a-4e39-bf3e-c251880adde8")
    @Override
    public <T extends BpmnDataInput> List<T> getInputSpecification(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataInput element : getInputSpecification()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e4ee41f4-3111-4319-a8d7-2f490ff83bb7")
    @Override
    public EList<BpmnDataAssociation> getDataInputAssociation() {
        return new SmList<>(this, BpmnActivityData.Metadata.DataInputAssociationDep());
    }

    @objid ("520cafcd-ab06-4ea1-ba3e-dcd378282f0b")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getDataInputAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8e11c872-3bfc-453f-bc96-bde76a1103d2")
    @Override
    public EList<BpmnDataOutput> getOutputSpecification() {
        return new SmList<>(this, BpmnActivityData.Metadata.OutputSpecificationDep());
    }

    @objid ("386ecf9f-581e-40ef-bf51-ec620a5a32d6")
    @Override
    public <T extends BpmnDataOutput> List<T> getOutputSpecification(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataOutput element : getOutputSpecification()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e4d6a384-54e5-4980-8334-771d217a3f71")
    @Override
    public BpmnLoopCharacteristics getLoopCharacteristics() {
        return (BpmnLoopCharacteristics) getDepVal(BpmnActivityData.Metadata.LoopCharacteristicsDep());
    }

    @objid ("2e60272d-27e6-41cf-9494-0bb07cda935a")
    @Override
    public void setLoopCharacteristics(BpmnLoopCharacteristics value) {
        appendDepVal(BpmnActivityData.Metadata.LoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("0bbb9656-d9b5-4f7c-b458-945fe3ded6db")
    @Override
    public EList<BpmnBoundaryEvent> getBoundaryEventRef() {
        return new SmList<>(this, BpmnActivityData.Metadata.BoundaryEventRefDep());
    }

    @objid ("4850214f-0602-4760-8ff7-b0d1440843f3")
    @Override
    public <T extends BpmnBoundaryEvent> List<T> getBoundaryEventRef(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnBoundaryEvent element : getBoundaryEventRef()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cc5384b6-7b00-4944-b513-42398d459d85")
    @Override
    public EList<BpmnDataAssociation> getDataOutputAssociation() {
        return new SmList<>(this, BpmnActivityData.Metadata.DataOutputAssociationDep());
    }

    @objid ("706d8b23-6194-4d26-8ecf-2e4d97a19d59")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getDataOutputAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0d2ae8b2-8acc-46bb-b3df-017e648c7650")
    @Override
    public BpmnSequenceFlow getDefaultFlow() {
        return (BpmnSequenceFlow) getDepVal(BpmnActivityData.Metadata.DefaultFlowDep());
    }

    @objid ("b2feed87-6cfb-4486-b296-c6d8e4f3a168")
    @Override
    public void setDefaultFlow(BpmnSequenceFlow value) {
        appendDepVal(BpmnActivityData.Metadata.DefaultFlowDep(), (SmObjectImpl)value);
    }

    @objid ("810dfcc2-c622-48f0-912c-8d1449de2eb3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d51e2a62-0fe7-4213-9366-65cf3d3b5401")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4ad8b34b-7f06-4c3f-9eea-7c6136c8c90c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnActivity(this);
        else
          return null;
    }

}
