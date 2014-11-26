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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.EntryPointPseudoStateData;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("004f6fc8-c4bf-1fd8-97fe-001ec947cd2a")
public class EntryPointPseudoStateImpl extends AbstractPseudoStateImpl implements EntryPointPseudoState {
    @objid ("d9259570-57a7-45c6-8c1b-40d5da108dbb")
    @Override
    public State getEntryOf() {
        return (State) getDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep());
    }

    @objid ("042a8c72-e435-41c1-8349-a8d98ee42edf")
    @Override
    public void setEntryOf(State value) {
        appendDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep(), (SmObjectImpl)value);
    }

    @objid ("64422f10-0a95-4e4a-83fd-3ec24f6a3295")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, EntryPointPseudoStateData.Metadata.ConnectionDep());
    }

    @objid ("f3dac5cb-b286-4c9b-9593-d05be403843e")
    @Override
    public <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ConnectionPointReference element : getConnection()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ce98d0f6-a5b2-456f-ae52-9aa95c8dab06")
    @Override
    public StateMachine getEntryOfMachine() {
        return (StateMachine) getDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep());
    }

    @objid ("fc18cfbe-796c-42e5-b485-70d02a2bc73e")
    @Override
    public void setEntryOfMachine(StateMachine value) {
        appendDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep(), (SmObjectImpl)value);
    }

    @objid ("7b2baa30-cb92-4167-8738-cd07d656e5c1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1e9c92b6-139c-4958-8a49-9be43bc86bc3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep());
        if (obj != null)
          return new SmDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep());
        if (obj != null)
          return new SmDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("3ca9cf75-86a6-4604-be11-f7d6229cfd74")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEntryPointPseudoState(this);
        else
          return null;
    }

}
