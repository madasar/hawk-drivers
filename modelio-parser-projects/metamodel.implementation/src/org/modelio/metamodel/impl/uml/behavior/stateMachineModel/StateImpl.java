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
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
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

@objid ("0053a458-c4bf-1fd8-97fe-001ec947cd2a")
public class StateImpl extends StateVertexImpl implements State {
    @objid ("a7eb211e-a07f-4e39-94ed-2d6171579fd9")
    @Override
    public EList<ExitPointPseudoState> getExitPoint() {
        return new SmList<>(this, StateData.Metadata.ExitPointDep());
    }

    @objid ("af3076ca-a046-4138-b686-c8c5e31be31d")
    @Override
    public <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExitPointPseudoState element : getExitPoint()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("918226fd-61d1-4b7b-94bf-4a8559997dad")
    @Override
    public EList<BpmnDataState> getBpmnDataStateRefs() {
        return new SmList<>(this, StateData.Metadata.BpmnDataStateRefsDep());
    }

    @objid ("f8320440-0cc6-4113-acf3-1a96e99835c3")
    @Override
    public <T extends BpmnDataState> List<T> getBpmnDataStateRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataState element : getBpmnDataStateRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cd0eefec-f3b9-4bae-954d-d83ef34d9e97")
    @Override
    public EList<Event> getDeffered() {
        return new SmList<>(this, StateData.Metadata.DefferedDep());
    }

    @objid ("3f1550c2-8d6f-428e-8ed6-3efe769df326")
    @Override
    public <T extends Event> List<T> getDeffered(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Event element : getDeffered()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("76ced5f7-3484-4ee3-a582-1a9c23f1cce3")
    @Override
    public EList<InternalTransition> getInternal() {
        return new SmList<>(this, StateData.Metadata.InternalDep());
    }

    @objid ("c9c3260a-3939-48e1-a731-05e16fb9bbd2")
    @Override
    public <T extends InternalTransition> List<T> getInternal(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InternalTransition element : getInternal()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f655c222-286e-422e-b4b0-76ec40478d1c")
    @Override
    public EList<EntryPointPseudoState> getEntryPoint() {
        return new SmList<>(this, StateData.Metadata.EntryPointDep());
    }

    @objid ("68102604-9103-4adc-88d9-f69ef9f4766b")
    @Override
    public <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final EntryPointPseudoState element : getEntryPoint()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("546cf271-620c-4e8a-9130-004e6858e5a9")
    @Override
    public EList<Region> getOwnedRegion() {
        return new SmList<>(this, StateData.Metadata.OwnedRegionDep());
    }

    @objid ("017db38b-ebe7-4c2f-989f-6889b6e823f2")
    @Override
    public <T extends Region> List<T> getOwnedRegion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Region element : getOwnedRegion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6d9c1a8e-fd5d-47bc-bfbc-96b2a5661833")
    @Override
    public EList<BpmnMessage> getRequiredStateOfBpmnMessage() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfBpmnMessageDep());
    }

    @objid ("31654805-ab3e-4be2-a4f1-3585510fabcf")
    @Override
    public <T extends BpmnMessage> List<T> getRequiredStateOfBpmnMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessage element : getRequiredStateOfBpmnMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3ac533a2-eccc-4ee2-89c4-f8faa30c139c")
    @Override
    public EList<ObjectNode> getRequiredStateOf() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfDep());
    }

    @objid ("6af37d4b-ca5e-4db4-8c66-5a022dc8e3c0")
    @Override
    public <T extends ObjectNode> List<T> getRequiredStateOf(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ObjectNode element : getRequiredStateOf()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a4bedfc4-3702-464e-931d-d00a0c1d67ed")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, StateData.Metadata.ConnectionDep());
    }

    @objid ("e961c0c4-aec2-41b7-b82c-99a45a455522")
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

    @objid ("38194b50-8cae-4e3b-a9d5-17bf6a3b30d6")
    @Override
    public StateMachine getSubMachine() {
        return (StateMachine) getDepVal(StateData.Metadata.SubMachineDep());
    }

    @objid ("d1018c0f-3d96-412d-bd04-3732dee27d3d")
    @Override
    public void setSubMachine(StateMachine value) {
        appendDepVal(StateData.Metadata.SubMachineDep(), (SmObjectImpl)value);
    }

    @objid ("24ef5849-4451-4186-95b4-f8b5bf77c9a5")
    @Override
    public EList<BpmnItemAwareElement> getRequiredStateOfBpmnItem() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfBpmnItemDep());
    }

    @objid ("504e1a21-259a-4e25-b2b1-7748229a7529")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getRequiredStateOfBpmnItem(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getRequiredStateOfBpmnItem()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fb91a72d-f7a8-4717-94aa-e19057ee6729")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("66519d38-e7a0-4c61-8fb4-b9c98a326045")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("39e1a61a-21b1-4d20-bd48-9b5303bb7afa")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitState(this);
        else
          return null;
    }

}
