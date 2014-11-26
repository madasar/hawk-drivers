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
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.MultiInstanceBehavior;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00811ea6-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMultiInstanceLoopCharacteristicsImpl extends BpmnLoopCharacteristicsImpl implements BpmnMultiInstanceLoopCharacteristics {
    @objid ("399ad937-a1c3-4f0f-8a0c-e26a3666be38")
    @Override
    public boolean isIsSequencial() {
        return (Boolean) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.IsSequencialAtt());
    }

    @objid ("6c2d67c6-4a1d-499e-a05b-869e62feed0b")
    @Override
    public void setIsSequencial(boolean value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.IsSequencialAtt(), value);
    }

    @objid ("80d8995f-790a-482a-a6d4-2e5325e8828a")
    @Override
    public MultiInstanceBehavior getBehavior() {
        return (MultiInstanceBehavior) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.BehaviorAtt());
    }

    @objid ("05305954-9345-422f-a1f6-ba9e2f25260a")
    @Override
    public void setBehavior(MultiInstanceBehavior value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.BehaviorAtt(), value);
    }

    @objid ("cd1c7090-cfe7-44ba-9a34-5eb5ef328394")
    @Override
    public String getLoopCardinality() {
        return (String) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopCardinalityAtt());
    }

    @objid ("31f5e89d-fb45-4f7b-b9d1-1d6e55904bbc")
    @Override
    public void setLoopCardinality(String value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopCardinalityAtt(), value);
    }

    @objid ("10c0ad1c-3255-4568-bf2c-69d4e921bbba")
    @Override
    public String getCompletionCondition() {
        return (String) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionConditionAtt());
    }

    @objid ("b5af1413-5cc2-44e3-ba57-3260aa8e57c3")
    @Override
    public void setCompletionCondition(String value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionConditionAtt(), value);
    }

    @objid ("0d41ea39-5a5d-4dfb-ab08-0f806ba04737")
    @Override
    public BpmnDataInput getLoopDataInput() {
        return (BpmnDataInput) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep());
    }

    @objid ("7802ba6c-defb-4be5-bb5d-464893eb8ad7")
    @Override
    public void setLoopDataInput(BpmnDataInput value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep(), (SmObjectImpl)value);
    }

    @objid ("9f66b14e-392b-47cb-b047-ede68fbc9f10")
    @Override
    public BpmnDataOutput getLoopDataOutputRef() {
        return (BpmnDataOutput) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep());
    }

    @objid ("b97e1cd4-a605-46ed-a572-c6f9faed0360")
    @Override
    public void setLoopDataOutputRef(BpmnDataOutput value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep(), (SmObjectImpl)value);
    }

    @objid ("ad5236cc-f95c-4209-8ccd-eb90bc3a6962")
    @Override
    public BpmnEventDefinition getCompletionEventRef() {
        return (BpmnEventDefinition) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep());
    }

    @objid ("cb6eb38c-89ea-448b-8a6a-85024e5f771d")
    @Override
    public void setCompletionEventRef(BpmnEventDefinition value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep(), (SmObjectImpl)value);
    }

    @objid ("e6984df6-97ce-45ae-9242-fd8f6f06c5af")
    @Override
    public EList<BpmnComplexBehaviorDefinition> getComplexBehaviorDefinition() {
        return new SmList<>(this, BpmnMultiInstanceLoopCharacteristicsData.Metadata.ComplexBehaviorDefinitionDep());
    }

    @objid ("43f11a78-5d09-4578-bd60-2bcf6745158c")
    @Override
    public <T extends BpmnComplexBehaviorDefinition> List<T> getComplexBehaviorDefinition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnComplexBehaviorDefinition element : getComplexBehaviorDefinition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cb563d99-6c59-4e50-b379-3270af1974e4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a09bbe33-90ef-4059-a290-6bde5f998a7d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("45369895-d5a7-4a47-b669-f62f13a69d54")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMultiInstanceLoopCharacteristics(this);
        else
          return null;
    }

}
