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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.impl.uml.statik.GeneralClassImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0042379a-c4bf-1fd8-97fe-001ec947cd2a")
public class SignalImpl extends GeneralClassImpl implements Signal {
    @objid ("a471fcb5-e589-4333-b097-01175d41ef34")
    @Override
    public boolean isIsEvent() {
        return (Boolean) getAttVal(SignalData.Metadata.IsEventAtt());
    }

    @objid ("30538f4c-3734-4722-a33d-8b5e671fe44b")
    @Override
    public void setIsEvent(boolean value) {
        setAttVal(SignalData.Metadata.IsEventAtt(), value);
    }

    @objid ("2c1fa3d0-af44-4780-98c6-315ef29e4d59")
    @Override
    public boolean isIsException() {
        return (Boolean) getAttVal(SignalData.Metadata.IsExceptionAtt());
    }

    @objid ("b7234331-0d95-44f9-8784-a1ab9412fac4")
    @Override
    public void setIsException(boolean value) {
        setAttVal(SignalData.Metadata.IsExceptionAtt(), value);
    }

    @objid ("beb2b30e-0cd3-4893-8f18-c9940f88ef82")
    @Override
    public EList<SendSignalAction> getSender() {
        return new SmList<>(this, SignalData.Metadata.SenderDep());
    }

    @objid ("2a9f087b-5eec-4163-954f-f1f97b4c904b")
    @Override
    public <T extends SendSignalAction> List<T> getSender(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final SendSignalAction element : getSender()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1084f309-ed41-4c5c-9093-1ec47e324541")
    @Override
    public EList<Message> getUsage() {
        return new SmList<>(this, SignalData.Metadata.UsageDep());
    }

    @objid ("37ba48a6-9ddc-44e1-a53c-91055a7ba340")
    @Override
    public <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Message element : getUsage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2f78cc43-c33d-4365-9a2d-5ef00521da6b")
    @Override
    public EList<Transition> getSends() {
        return new SmList<>(this, SignalData.Metadata.SendsDep());
    }

    @objid ("ed55c6ba-2d47-461b-b990-b42a893c0abf")
    @Override
    public <T extends Transition> List<T> getSends(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getSends()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("56431aa1-1e86-4060-b587-4bc0ffd555be")
    @Override
    public Parameter getPBase() {
        return (Parameter) getDepVal(SignalData.Metadata.PBaseDep());
    }

    @objid ("2d0125be-bf7c-4c08-a577-4d356fc40f26")
    @Override
    public void setPBase(Parameter value) {
        appendDepVal(SignalData.Metadata.PBaseDep(), (SmObjectImpl)value);
    }

    @objid ("073ed38c-fe94-417e-90cd-80072d2089db")
    @Override
    public Operation getOBase() {
        return (Operation) getDepVal(SignalData.Metadata.OBaseDep());
    }

    @objid ("58fd6ba1-6783-4885-a948-6c533fe372a4")
    @Override
    public void setOBase(Operation value) {
        appendDepVal(SignalData.Metadata.OBaseDep(), (SmObjectImpl)value);
    }

    @objid ("d2723b34-a988-4ca7-91b7-b19934b5d44a")
    @Override
    public EList<CommunicationMessage> getCommunicationUsage() {
        return new SmList<>(this, SignalData.Metadata.CommunicationUsageDep());
    }

    @objid ("e38056de-e9c5-4978-90ad-f85985ea9ef0")
    @Override
    public <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationMessage element : getCommunicationUsage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("57a84401-6e1f-4760-8497-8b2d132f5236")
    @Override
    public EList<DataFlow> getDOccurence() {
        return new SmList<>(this, SignalData.Metadata.DOccurenceDep());
    }

    @objid ("a7cc3e64-5349-44fd-8d74-9a7edf7719ee")
    @Override
    public <T extends DataFlow> List<T> getDOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DataFlow element : getDOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6956c23f-5832-4491-a6df-61327f2a935b")
    @Override
    public EList<Event> getEOccurence() {
        return new SmList<>(this, SignalData.Metadata.EOccurenceDep());
    }

    @objid ("a3006678-2c26-4a53-a9e8-47595c0bed54")
    @Override
    public <T extends Event> List<T> getEOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Event element : getEOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ba08fdf0-3f08-4dc5-81dc-69f4d8936dd1")
    @Override
    public GeneralClass getBase() {
        return (GeneralClass) getDepVal(SignalData.Metadata.BaseDep());
    }

    @objid ("eb6802d2-a42a-4abc-bd36-cde99ff675c4")
    @Override
    public void setBase(GeneralClass value) {
        appendDepVal(SignalData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("6844a8a2-ba8d-452e-b8ea-1808623ae1da")
    @Override
    public EList<AcceptSignalAction> getReceiver() {
        return new SmList<>(this, SignalData.Metadata.ReceiverDep());
    }

    @objid ("df5a52fb-5afb-4ac3-965e-24929520f42d")
    @Override
    public <T extends AcceptSignalAction> List<T> getReceiver(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AcceptSignalAction element : getReceiver()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("07d9528c-50a0-4f13-8f0f-5e233a59ff18")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("4772df99-8568-431d-b8e2-6c3ff9b8cd1d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("abc63b79-0406-4e0d-9023-d9ea4b15125f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitSignal(this);
        else
          return null;
    }

}
