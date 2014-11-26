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
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ExitPointPseudoStateData;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
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

@objid ("004feeee-c4bf-1fd8-97fe-001ec947cd2a")
public class ExitPointPseudoStateImpl extends AbstractPseudoStateImpl implements ExitPointPseudoState {
    @objid ("40e13ad0-c779-4434-bc81-09d941028873")
    @Override
    public State getExitOf() {
        return (State) getDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep());
    }

    @objid ("775fc21c-eb98-4007-b6cc-f82288e38213")
    @Override
    public void setExitOf(State value) {
        appendDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep(), (SmObjectImpl)value);
    }

    @objid ("158ae0b2-57bd-4d98-9148-b45b0b20d42e")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, ExitPointPseudoStateData.Metadata.ConnectionDep());
    }

    @objid ("6d082dcd-3dd0-4ad5-9c23-7ce4fbc9efc2")
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

    @objid ("26040a4f-81bf-44b6-bd90-9e9f8abecc0d")
    @Override
    public StateMachine getExitOfMachine() {
        return (StateMachine) getDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep());
    }

    @objid ("b5eb3548-388c-4bca-9b38-75ad9878fb55")
    @Override
    public void setExitOfMachine(StateMachine value) {
        appendDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep(), (SmObjectImpl)value);
    }

    @objid ("21b67ee9-3de3-47e6-9062-4e5a88701880")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1d576241-8971-4d66-83b7-45c7ad4c6b39")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep());
        if (obj != null)
          return new SmDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep());
        if (obj != null)
          return new SmDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f0602400-d800-4897-a3f8-04598c8bae36")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExitPointPseudoState(this);
        else
          return null;
    }

}
