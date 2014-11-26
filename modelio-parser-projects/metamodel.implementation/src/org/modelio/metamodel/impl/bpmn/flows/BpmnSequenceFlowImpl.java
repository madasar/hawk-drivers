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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007cfdf8-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSequenceFlowImpl extends BpmnFlowElementImpl implements BpmnSequenceFlow {
    @objid ("9a11c134-bd4f-4691-919e-f7000a444a1d")
    @Override
    public boolean isIsImmediate() {
        return (Boolean) getAttVal(BpmnSequenceFlowData.Metadata.IsImmediateAtt());
    }

    @objid ("921082ca-1bb0-457e-8ae4-588e64537fa7")
    @Override
    public void setIsImmediate(boolean value) {
        setAttVal(BpmnSequenceFlowData.Metadata.IsImmediateAtt(), value);
    }

    @objid ("8d8e2f11-25f2-4d11-8c99-5eb5958ac4ac")
    @Override
    public String getConditionExpression() {
        return (String) getAttVal(BpmnSequenceFlowData.Metadata.ConditionExpressionAtt());
    }

    @objid ("c2144cb0-fc5c-479f-aac4-09853f1f322c")
    @Override
    public void setConditionExpression(String value) {
        setAttVal(BpmnSequenceFlowData.Metadata.ConditionExpressionAtt(), value);
    }

    @objid ("6358ba16-a297-4d66-b012-4de0119e7421")
    @Override
    public BpmnFlowNode getSourceRef() {
        return (BpmnFlowNode) getDepVal(BpmnSequenceFlowData.Metadata.SourceRefDep());
    }

    @objid ("05d0aa91-d5f6-49e5-abfe-d322f150b7fd")
    @Override
    public void setSourceRef(BpmnFlowNode value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("1c95e39f-ce24-442a-81d6-bea806d58b80")
    @Override
    public BpmnFlowNode getTargetRef() {
        return (BpmnFlowNode) getDepVal(BpmnSequenceFlowData.Metadata.TargetRefDep());
    }

    @objid ("8074d4ca-d1f2-4016-a660-7ec6096bc8a7")
    @Override
    public void setTargetRef(BpmnFlowNode value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("121dfbb1-a30e-453f-ae38-a1e9135a98f9")
    @Override
    public BpmnInclusiveGateway getDefaultOfInclusive() {
        return (BpmnInclusiveGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep());
    }

    @objid ("a3057693-1b3c-482a-bcd5-3cdd08e52d6b")
    @Override
    public void setDefaultOfInclusive(BpmnInclusiveGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep(), (SmObjectImpl)value);
    }

    @objid ("33eba53f-95aa-4e7b-ba44-99d3f0a4507e")
    @Override
    public BpmnActivity getDefaultFrom() {
        return (BpmnActivity) getDepVal(BpmnSequenceFlowData.Metadata.DefaultFromDep());
    }

    @objid ("30b237c1-6c25-42d8-95ff-7f1d09ce2aa4")
    @Override
    public void setDefaultFrom(BpmnActivity value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultFromDep(), (SmObjectImpl)value);
    }

    @objid ("c60634e4-7939-44d4-986f-7c77df192541")
    @Override
    public BpmnExclusiveGateway getDefaultOfExclusive() {
        return (BpmnExclusiveGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep());
    }

    @objid ("1039e2db-1f17-4025-8592-60921f868649")
    @Override
    public void setDefaultOfExclusive(BpmnExclusiveGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep(), (SmObjectImpl)value);
    }

    @objid ("9c67ffc3-e1ff-447f-8c6a-94acdffba13f")
    @Override
    public EList<BpmnSequenceFlowDataAssociation> getConnector() {
        return new SmList<>(this, BpmnSequenceFlowData.Metadata.ConnectorDep());
    }

    @objid ("0e6fc6a9-bbae-48ad-bcf2-8ef2227c563d")
    @Override
    public <T extends BpmnSequenceFlowDataAssociation> List<T> getConnector(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnSequenceFlowDataAssociation element : getConnector()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1cbc43b3-abbf-45f3-ae7c-9d94ad813644")
    @Override
    public BpmnComplexGateway getDefaultOfComplex() {
        return (BpmnComplexGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfComplexDep());
    }

    @objid ("9cbe98c5-460d-4f6e-830a-b0845e65d56f")
    @Override
    public void setDefaultOfComplex(BpmnComplexGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfComplexDep(), (SmObjectImpl)value);
    }

    @objid ("bbc191cd-4ed0-477d-8e82-96698e05f901")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("ad0fb5ce-f139-411c-bd3c-135de7702f91")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1910c0c3-e4df-49c3-a675-05b0a49c1c8f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSequenceFlow(this);
        else
          return null;
    }

}
