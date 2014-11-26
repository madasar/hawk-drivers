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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0055e47a-c4bf-1fd8-97fe-001ec947cd2a")
public class TransitionImpl extends ModelElementImpl implements Transition {
    @objid ("1d2f3d48-6282-49b1-a675-69f5c457def3")
    @Override
    public String getEffect() {
        return (String) getAttVal(TransitionData.Metadata.EffectAtt());
    }

    @objid ("b2bce6aa-83ea-466b-a2f9-3faeefaff3df")
    @Override
    public void setEffect(String value) {
        setAttVal(TransitionData.Metadata.EffectAtt(), value);
    }

    @objid ("f38b97fe-f39d-41cb-8f76-935b0d73f397")
    @Override
    public String getReceivedEvents() {
        return (String) getAttVal(TransitionData.Metadata.ReceivedEventsAtt());
    }

    @objid ("6e960f66-d2df-4af6-b107-d50de09910fc")
    @Override
    public void setReceivedEvents(String value) {
        setAttVal(TransitionData.Metadata.ReceivedEventsAtt(), value);
    }

    @objid ("a21ff64c-6250-401c-9ffe-812b6a631569")
    @Override
    public String getSentEvents() {
        return (String) getAttVal(TransitionData.Metadata.SentEventsAtt());
    }

    @objid ("600f037d-0d7d-4c97-900e-b166304b12f0")
    @Override
    public void setSentEvents(String value) {
        setAttVal(TransitionData.Metadata.SentEventsAtt(), value);
    }

    @objid ("e3932bb4-9986-4e2c-97b2-70ae931fbe2e")
    @Override
    public String getGuard() {
        return (String) getAttVal(TransitionData.Metadata.GuardAtt());
    }

    @objid ("c969d6cd-fe0f-4b1f-a778-c93cdcc67619")
    @Override
    public void setGuard(String value) {
        setAttVal(TransitionData.Metadata.GuardAtt(), value);
    }

    @objid ("4fb69bfc-3ca2-418b-b4fd-932e48310004")
    @Override
    public String getPostCondition() {
        return (String) getAttVal(TransitionData.Metadata.PostConditionAtt());
    }

    @objid ("15bdec14-db5b-4a99-95d7-cda6759969a0")
    @Override
    public void setPostCondition(String value) {
        setAttVal(TransitionData.Metadata.PostConditionAtt(), value);
    }

    @objid ("7659a5f8-bed3-46d2-a424-29e41e696eb5")
    @Override
    public Operation getProcessed() {
        return (Operation) getDepVal(TransitionData.Metadata.ProcessedDep());
    }

    @objid ("19927316-0563-4814-ae1f-2c1800c989d6")
    @Override
    public void setProcessed(Operation value) {
        appendDepVal(TransitionData.Metadata.ProcessedDep(), (SmObjectImpl)value);
    }

    @objid ("672908a6-1b64-4e77-85b4-cff75ade1575")
    @Override
    public Event getTrigger() {
        return (Event) getDepVal(TransitionData.Metadata.TriggerDep());
    }

    @objid ("f922a0db-9cd7-49a2-9d4f-bda194b998b4")
    @Override
    public void setTrigger(Event value) {
        appendDepVal(TransitionData.Metadata.TriggerDep(), (SmObjectImpl)value);
    }

    @objid ("ce77005c-037c-4c1a-a130-8aa665f8b98f")
    @Override
    public Behavior getBehaviorEffect() {
        return (Behavior) getDepVal(TransitionData.Metadata.BehaviorEffectDep());
    }

    @objid ("cbe4464a-910f-499b-86b2-2ef0c88f90c6")
    @Override
    public void setBehaviorEffect(Behavior value) {
        appendDepVal(TransitionData.Metadata.BehaviorEffectDep(), (SmObjectImpl)value);
    }

    @objid ("741f07db-39e1-4cd7-9def-b28d66d70d5f")
    @Override
    public StateVertex getTarget() {
        return (StateVertex) getDepVal(TransitionData.Metadata.TargetDep());
    }

    @objid ("09c5a57b-a579-49f5-ac6c-d7404876ed7b")
    @Override
    public void setTarget(StateVertex value) {
        appendDepVal(TransitionData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("b8da279c-49ae-4a47-a01e-197082b56dfc")
    @Override
    public StateVertex getSource() {
        return (StateVertex) getDepVal(TransitionData.Metadata.SourceDep());
    }

    @objid ("08e0ddb4-a9d0-4079-9a66-fbe8e5299bda")
    @Override
    public void setSource(StateVertex value) {
        appendDepVal(TransitionData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("aa28b934-8137-403a-9587-44f17c656de0")
    @Override
    public Signal getEffects() {
        return (Signal) getDepVal(TransitionData.Metadata.EffectsDep());
    }

    @objid ("1f6fc4d5-273e-4606-8399-ac8cc6cdcda4")
    @Override
    public void setEffects(Signal value) {
        appendDepVal(TransitionData.Metadata.EffectsDep(), (SmObjectImpl)value);
    }

    @objid ("bc1ba6e9-e808-4782-b4ca-74696126c168")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TransitionData.Metadata.SourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c8aebf59-694e-4125-bcd1-2f5f8e075857")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TransitionData.Metadata.SourceDep());
        if (obj != null)
          return new SmDepVal(TransitionData.Metadata.SourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2b8be5cc-1724-4c50-a649-14e103d0b98b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTransition(this);
        else
          return null;
    }

}
