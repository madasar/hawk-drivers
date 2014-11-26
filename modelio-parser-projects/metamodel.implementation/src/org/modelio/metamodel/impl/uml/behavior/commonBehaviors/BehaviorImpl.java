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
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0040c504-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BehaviorImpl extends ModelElementImpl implements Behavior {
    @objid ("d17a525d-26ce-4372-a3e4-007d3c13c3af")
    @Override
    public boolean isIsReentrant() {
        return (Boolean) getAttVal(BehaviorData.Metadata.IsReentrantAtt());
    }

    @objid ("4afdcf57-0eef-4e90-9b27-ba83d55599d8")
    @Override
    public void setIsReentrant(boolean value) {
        setAttVal(BehaviorData.Metadata.IsReentrantAtt(), value);
    }

    @objid ("3ecc91c0-acd6-4faf-b363-e84d8b8717d1")
    @Override
    public EList<BpmnCallActivity> getBpmnCaller() {
        return new SmList<>(this, BehaviorData.Metadata.BpmnCallerDep());
    }

    @objid ("df44a987-701c-48b8-8e40-b8b93604a246")
    @Override
    public <T extends BpmnCallActivity> List<T> getBpmnCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnCallActivity element : getBpmnCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("84e1d7fb-3c44-4062-9ca6-ed14b32215c1")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(BehaviorData.Metadata.OwnerDep());
    }

    @objid ("6ec92a26-ee3a-4d3c-8bea-ba5e16bbcd80")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(BehaviorData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("04e44090-fb5a-451f-85d5-b0db2fb23bb4")
    @Override
    public EList<BehaviorParameter> getParameter() {
        return new SmList<>(this, BehaviorData.Metadata.ParameterDep());
    }

    @objid ("9a27f8ed-4a8c-45db-a85d-b7a2dc197511")
    @Override
    public <T extends BehaviorParameter> List<T> getParameter(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BehaviorParameter element : getParameter()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("afd0da30-f2a1-455e-be02-58d70757d34f")
    @Override
    public Operation getOwnerOperation() {
        return (Operation) getDepVal(BehaviorData.Metadata.OwnerOperationDep());
    }

    @objid ("786002e2-90df-4507-ab68-b1bb212b75f0")
    @Override
    public void setOwnerOperation(Operation value) {
        appendDepVal(BehaviorData.Metadata.OwnerOperationDep(), (SmObjectImpl)value);
    }

    @objid ("0a4e4653-924b-4a53-8e2c-a932cd8cd35a")
    @Override
    public EList<Collaboration> getOwnedCollaboration() {
        return new SmList<>(this, BehaviorData.Metadata.OwnedCollaborationDep());
    }

    @objid ("cbe5f1f0-9587-4804-be55-825908efa508")
    @Override
    public <T extends Collaboration> List<T> getOwnedCollaboration(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Collaboration element : getOwnedCollaboration()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e4d97c7e-c51d-4c42-8092-ee7265b8d321")
    @Override
    public EList<CallBehaviorAction> getCaller() {
        return new SmList<>(this, BehaviorData.Metadata.CallerDep());
    }

    @objid ("64cf4689-c853-4598-a6e4-447582cebdad")
    @Override
    public <T extends CallBehaviorAction> List<T> getCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CallBehaviorAction element : getCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a3012f30-00bf-42b8-a1e6-592ac4e93b20")
    @Override
    public EList<Event> getEComponent() {
        return new SmList<>(this, BehaviorData.Metadata.EComponentDep());
    }

    @objid ("5332808f-9a3e-4e4e-9f5e-837e4d912ac6")
    @Override
    public <T extends Event> List<T> getEComponent(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Event element : getEComponent()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ebc8b1b5-ddc2-4b58-960f-a79094d193c0")
    @Override
    public EList<Transition> getEffectOf() {
        return new SmList<>(this, BehaviorData.Metadata.EffectOfDep());
    }

    @objid ("b4789b93-de3f-4ca1-982e-3570862ef3bc")
    @Override
    public <T extends Transition> List<T> getEffectOf(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getEffectOf()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1e8aae85-561b-47bb-8f19-e13e7a1df6eb")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorData.Metadata.OwnerOperationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("62a3513c-c934-4e76-8f8d-5a5dd3a1f8b3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BehaviorData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BehaviorData.Metadata.OwnerOperationDep());
        if (obj != null)
          return new SmDepVal(BehaviorData.Metadata.OwnerOperationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("01b87626-3eb6-4ddb-87e3-b0b8b7c34bd8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBehavior(this);
        else
          return null;
    }

}
