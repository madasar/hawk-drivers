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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.ParameterEffectKind;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.PassingMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00180e5c-c4bf-1fd8-97fe-001ec947cd2a")
public class ParameterImpl extends ModelElementImpl implements Parameter {
    @objid ("ea65622d-4b7a-491b-b701-78ee9f0b807f")
    @Override
    public PassingMode getParameterPassing() {
        return (PassingMode) getAttVal(ParameterData.Metadata.ParameterPassingAtt());
    }

    @objid ("b081f8e3-d9f8-4f8f-a057-0af01b3d047c")
    @Override
    public void setParameterPassing(PassingMode value) {
        setAttVal(ParameterData.Metadata.ParameterPassingAtt(), value);
    }

    @objid ("4bddd880-ced1-498f-9a7b-dff4e20dc3a2")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(ParameterData.Metadata.MultiplicityMinAtt());
    }

    @objid ("bea1ae9f-6638-4d52-ab5e-2c2a269fe6ac")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(ParameterData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("b0189c5f-6d0a-4983-b2f7-4c0198888069")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(ParameterData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("26980dce-8c31-40a7-a165-eec0f0db4282")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(ParameterData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("484741e8-6aa7-4095-9a60-899d1dbafe3e")
    @Override
    public String getTypeConstraint() {
        return (String) getAttVal(ParameterData.Metadata.TypeConstraintAtt());
    }

    @objid ("f86b0bb7-3d9e-4601-b37d-397c5c74c60e")
    @Override
    public void setTypeConstraint(String value) {
        setAttVal(ParameterData.Metadata.TypeConstraintAtt(), value);
    }

    @objid ("35c1fd17-d8e7-4790-8fbf-2d07acaa9fd1")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(ParameterData.Metadata.DefaultValueAtt());
    }

    @objid ("e3573baf-c236-4926-b034-245d5f6f596d")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(ParameterData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("2e7f200c-cf69-4871-b343-58739fcca259")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsOrderedAtt());
    }

    @objid ("41366ee3-d98e-4a3b-9540-d850ce864ef1")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(ParameterData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("c6b7114b-c8de-44ad-a69e-ea49d4a8015d")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsUniqueAtt());
    }

    @objid ("b86da292-b500-4fe4-9b23-6e210e24a4de")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(ParameterData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("479aec1c-6692-4a3f-aac6-b731e0e9ffdd")
    @Override
    public boolean isIsException() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsExceptionAtt());
    }

    @objid ("954b1a81-c24c-41c4-a928-02bb66235c20")
    @Override
    public void setIsException(boolean value) {
        setAttVal(ParameterData.Metadata.IsExceptionAtt(), value);
    }

    @objid ("234b9c89-79f5-47ff-95e0-4d18ba97e6f7")
    @Override
    public boolean isIsStream() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsStreamAtt());
    }

    @objid ("fd2d61fd-7557-4fe3-91b1-7040582b83d6")
    @Override
    public void setIsStream(boolean value) {
        setAttVal(ParameterData.Metadata.IsStreamAtt(), value);
    }

    @objid ("a3efd7b8-b915-4776-b191-52b7ac8c6c23")
    @Override
    public ParameterEffectKind getEffect() {
        return (ParameterEffectKind) getAttVal(ParameterData.Metadata.EffectAtt());
    }

    @objid ("599378f1-c0d3-4b3d-b149-73c2338274e2")
    @Override
    public void setEffect(ParameterEffectKind value) {
        setAttVal(ParameterData.Metadata.EffectAtt(), value);
    }

    @objid ("290db4c5-306a-4336-85bb-dfb8cbc27adc")
    @Override
    public EList<BpmnDataInput> getBpmnRepresentingDataInput() {
        return new SmList<>(this, ParameterData.Metadata.BpmnRepresentingDataInputDep());
    }

    @objid ("5c4990e4-d13d-4ed4-ab78-8c025c7bc269")
    @Override
    public <T extends BpmnDataInput> List<T> getBpmnRepresentingDataInput(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataInput element : getBpmnRepresentingDataInput()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6265299e-5e96-4014-a372-d588bf3ae845")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ParameterData.Metadata.TypeDep());
    }

    @objid ("ee08f27e-cf6c-4f27-bcb5-5a32273c5d63")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("2d4c1df4-ea17-4cdf-a15e-39c67a6c3777")
    @Override
    public Operation getComposed() {
        return (Operation) getDepVal(ParameterData.Metadata.ComposedDep());
    }

    @objid ("5926fe97-62f7-45da-a36b-a62779206321")
    @Override
    public void setComposed(Operation value) {
        appendDepVal(ParameterData.Metadata.ComposedDep(), (SmObjectImpl)value);
    }

    @objid ("b8b2e1dc-4b13-4556-b610-e91bdb9800ee")
    @Override
    public EList<Pin> getMatching() {
        return new SmList<>(this, ParameterData.Metadata.MatchingDep());
    }

    @objid ("9a558919-079a-43f0-93e5-c521bc1e3e05")
    @Override
    public <T extends Pin> List<T> getMatching(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Pin element : getMatching()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("06b9fd1a-f9bb-48bc-9277-125804cc834f")
    @Override
    public EList<BpmnDataOutput> getBpmnRepresentingDataOutput() {
        return new SmList<>(this, ParameterData.Metadata.BpmnRepresentingDataOutputDep());
    }

    @objid ("aa6d5eb2-d2f8-460f-9089-a5a598005b68")
    @Override
    public <T extends BpmnDataOutput> List<T> getBpmnRepresentingDataOutput(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataOutput element : getBpmnRepresentingDataOutput()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("69e9523c-6d39-4a85-b4a0-29a78832178f")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, ParameterData.Metadata.SRepresentationDep());
    }

    @objid ("417a4513-9e09-4168-8a39-19d315fa4ae0")
    @Override
    public <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Signal element : getSRepresentation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("af736525-a929-44bf-915d-4ef7eabc2ccf")
    @Override
    public Operation getReturned() {
        return (Operation) getDepVal(ParameterData.Metadata.ReturnedDep());
    }

    @objid ("cec03192-e8a2-4c94-b3d0-aead3e7f8f85")
    @Override
    public void setReturned(Operation value) {
        appendDepVal(ParameterData.Metadata.ReturnedDep(), (SmObjectImpl)value);
    }

    @objid ("3f4903ef-aa7e-4595-a724-b8275f2df994")
    @Override
    public EList<BehaviorParameter> getBehaviorParam() {
        return new SmList<>(this, ParameterData.Metadata.BehaviorParamDep());
    }

    @objid ("5b07ac1b-3b75-4a76-abaa-b58f2c3e8c27")
    @Override
    public <T extends BehaviorParameter> List<T> getBehaviorParam(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BehaviorParameter element : getBehaviorParam()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("db7c5349-bf3a-48eb-8677-1f80ceeecb60")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ParameterData.Metadata.ComposedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ParameterData.Metadata.ReturnedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7e5d4947-23f6-41f0-872f-7ae7e0cbc046")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ParameterData.Metadata.ComposedDep());
        if (obj != null)
          return new SmDepVal(ParameterData.Metadata.ComposedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ParameterData.Metadata.ReturnedDep());
        if (obj != null)
          return new SmDepVal(ParameterData.Metadata.ReturnedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a2f30986-4485-4683-b132-76ec90c91466")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitParameter(this);
        else
          return null;
    }

}
