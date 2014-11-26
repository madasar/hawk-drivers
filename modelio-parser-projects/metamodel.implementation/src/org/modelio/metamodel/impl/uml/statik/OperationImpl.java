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
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.MethodPassingMode;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0014913c-c4bf-1fd8-97fe-001ec947cd2a")
public class OperationImpl extends BehavioralFeatureImpl implements Operation {
    @objid ("214b058f-7755-43f9-b6f5-5b6a35c5fa56")
    @Override
    public boolean isConcurrency() {
        return (Boolean) getAttVal(OperationData.Metadata.ConcurrencyAtt());
    }

    @objid ("a3145b30-34b8-4077-a385-156ffa03e00d")
    @Override
    public void setConcurrency(boolean value) {
        setAttVal(OperationData.Metadata.ConcurrencyAtt(), value);
    }

    @objid ("839b824f-053d-4c4e-b09c-3c2c00e3f117")
    @Override
    public boolean isFinal() {
        return (Boolean) getAttVal(OperationData.Metadata.FinalAtt());
    }

    @objid ("0f1a4117-b01a-4115-9b4c-a8c60a569267")
    @Override
    public void setFinal(boolean value) {
        setAttVal(OperationData.Metadata.FinalAtt(), value);
    }

    @objid ("3f05bc21-063d-4e8d-a8f7-91a1db06d7a1")
    @Override
    public MethodPassingMode getPassing() {
        return (MethodPassingMode) getAttVal(OperationData.Metadata.PassingAtt());
    }

    @objid ("97b5aca7-6c58-42ae-9992-5b058f237e6c")
    @Override
    public void setPassing(MethodPassingMode value) {
        setAttVal(OperationData.Metadata.PassingAtt(), value);
    }

    @objid ("efcb7e7a-9087-40b3-90f5-93a7132849cf")
    @Override
    public EList<ElementImport> getOwnedImport() {
        return new SmList<>(this, OperationData.Metadata.OwnedImportDep());
    }

    @objid ("0951baaa-5120-4d8f-973e-4e23b5bebfd5")
    @Override
    public <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ElementImport element : getOwnedImport()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("658e9983-61f1-4a02-9ea2-1cab1fe2b3df")
    @Override
    public EList<RaisedException> getThrown() {
        return new SmList<>(this, OperationData.Metadata.ThrownDep());
    }

    @objid ("8ac1cc77-a2a6-4d8d-8d05-b2d583608351")
    @Override
    public <T extends RaisedException> List<T> getThrown(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RaisedException element : getThrown()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0c60ff7d-ca1d-4deb-8415-ab5d730fab89")
    @Override
    public EList<BpmnReceiveTask> getCallerReceiveTask() {
        return new SmList<>(this, OperationData.Metadata.CallerReceiveTaskDep());
    }

    @objid ("881b67aa-3666-4fe2-8732-8e3533ab2db8")
    @Override
    public <T extends BpmnReceiveTask> List<T> getCallerReceiveTask(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnReceiveTask element : getCallerReceiveTask()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("37eaa984-63be-4bb9-b69b-1d01a1f35515")
    @Override
    public EList<Operation> getRedefinition() {
        return new SmList<>(this, OperationData.Metadata.RedefinitionDep());
    }

    @objid ("bebf0c4a-23ba-4efd-a77f-0b59f72487bd")
    @Override
    public <T extends Operation> List<T> getRedefinition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Operation element : getRedefinition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f7605bd5-1323-43a3-afe7-5c1b9563bcdd")
    @Override
    public EList<Collaboration> getExample() {
        return new SmList<>(this, OperationData.Metadata.ExampleDep());
    }

    @objid ("0ba3b14d-9aa5-4ad2-9f3a-424f8656f769")
    @Override
    public <T extends Collaboration> List<T> getExample(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Collaboration element : getExample()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1349ea30-48fe-4def-8b22-f0eb99584937")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, OperationData.Metadata.SRepresentationDep());
    }

    @objid ("cc9550aa-672e-4bf1-9332-dc411973100e")
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

    @objid ("3c0d91a7-ad79-4491-a1a8-2be556223ee6")
    @Override
    public EList<Behavior> getOwnedBehavior() {
        return new SmList<>(this, OperationData.Metadata.OwnedBehaviorDep());
    }

    @objid ("b4aa5098-2a4d-44c8-9f64-ae5102363fd8")
    @Override
    public <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Behavior element : getOwnedBehavior()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c78d272a-cecc-4f56-8c07-ca21c04b8940")
    @Override
    public EList<BpmnOperation> getBpmnOperationRef() {
        return new SmList<>(this, OperationData.Metadata.BpmnOperationRefDep());
    }

    @objid ("de8906dc-02bc-4ad4-855f-1aff412562cb")
    @Override
    public <T extends BpmnOperation> List<T> getBpmnOperationRef(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnOperation element : getBpmnOperationRef()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c1c96ae3-0706-4ed9-8814-a6dc4b02724a")
    @Override
    public EList<BpmnSendTask> getCallerSendTask() {
        return new SmList<>(this, OperationData.Metadata.CallerSendTaskDep());
    }

    @objid ("b1a20766-98fd-4368-a4e0-a018a2b89250")
    @Override
    public <T extends BpmnSendTask> List<T> getCallerSendTask(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnSendTask element : getCallerSendTask()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("394b4c64-be90-485d-a023-66dd2b7e90bf")
    @Override
    public EList<Parameter> getIO() {
        return new SmList<>(this, OperationData.Metadata.IODep());
    }

    @objid ("972732e2-3bd9-4e67-b2fa-6d5087e10222")
    @Override
    public <T extends Parameter> List<T> getIO(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Parameter element : getIO()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ec407e2b-0c16-44bd-8cf8-7e61a3b445c4")
    @Override
    public EList<TemplateBinding> getTemplateInstanciation() {
        return new SmList<>(this, OperationData.Metadata.TemplateInstanciationDep());
    }

    @objid ("99d8deff-cd36-4d7e-9eed-b207f62933f7")
    @Override
    public <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateBinding element : getTemplateInstanciation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c66a5005-a20b-40f2-92da-919436505ccb")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(OperationData.Metadata.OwnerDep());
    }

    @objid ("1bdf8faa-158e-4e8d-80b5-c28e2588aff9")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(OperationData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("b326266a-4fba-4690-93e0-85b4c18b3495")
    @Override
    public EList<PackageImport> getOwnedPackageImport() {
        return new SmList<>(this, OperationData.Metadata.OwnedPackageImportDep());
    }

    @objid ("fff5ae5e-c602-4fc3-9565-593e7e285241")
    @Override
    public <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PackageImport element : getOwnedPackageImport()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("31fd4b1b-12b3-4de7-aab8-0bf8fb3fcb25")
    @Override
    public Parameter getReturn() {
        return (Parameter) getDepVal(OperationData.Metadata.ReturnDep());
    }

    @objid ("4fe2a712-56f3-4611-b793-90f3d0fb2ebb")
    @Override
    public void setReturn(Parameter value) {
        appendDepVal(OperationData.Metadata.ReturnDep(), (SmObjectImpl)value);
    }

    @objid ("8c595d73-f000-49c9-998c-021fe1d0023d")
    @Override
    public EList<TemplateBinding> getInstanciatingBinding() {
        return new SmList<>(this, OperationData.Metadata.InstanciatingBindingDep());
    }

    @objid ("901b1469-cd06-4ae9-bcd1-07f77ee4afc1")
    @Override
    public <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateBinding element : getInstanciatingBinding()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f95d8df5-06b9-4b93-8b63-6db1c2aed90c")
    @Override
    public EList<Message> getUsage() {
        return new SmList<>(this, OperationData.Metadata.UsageDep());
    }

    @objid ("6869b849-7573-4f61-8e5d-92a391eb0681")
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

    @objid ("bc51299e-b818-486b-b307-ed27182b731d")
    @Override
    public EList<TemplateParameter> getTemplate() {
        return new SmList<>(this, OperationData.Metadata.TemplateDep());
    }

    @objid ("5a064423-844a-4c83-a3b1-ecfc7664ba5a")
    @Override
    public <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameter element : getTemplate()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7acf3263-fd4a-411d-ac1c-70b4f6712244")
    @Override
    public EList<BpmnServiceTask> getCallerServiceTask() {
        return new SmList<>(this, OperationData.Metadata.CallerServiceTaskDep());
    }

    @objid ("47f59ee9-2894-4689-8273-073a35b63d37")
    @Override
    public <T extends BpmnServiceTask> List<T> getCallerServiceTask(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnServiceTask element : getCallerServiceTask()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fb4c0a6b-8ab7-460e-9c49-3a6be98a4d26")
    @Override
    public EList<Event> getOccurence() {
        return new SmList<>(this, OperationData.Metadata.OccurenceDep());
    }

    @objid ("416acdbc-dce8-4af7-81f2-d7cf26d6f1ad")
    @Override
    public <T extends Event> List<T> getOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Event element : getOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("59974d65-1b65-40ec-9380-c61b59a4e902")
    @Override
    public EList<Transition> getInvoker() {
        return new SmList<>(this, OperationData.Metadata.InvokerDep());
    }

    @objid ("39b89243-3959-4619-b561-50f91037796f")
    @Override
    public <T extends Transition> List<T> getInvoker(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getInvoker()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("41390b60-8cfb-4adc-bb8b-c409577bfd5c")
    @Override
    public EList<CommunicationMessage> getCommunicationUsage() {
        return new SmList<>(this, OperationData.Metadata.CommunicationUsageDep());
    }

    @objid ("34682b5c-86f4-45ab-b4cf-7550a8620380")
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

    @objid ("f63be2c5-63a5-41fa-b428-2e7173111be5")
    @Override
    public EList<CollaborationUse> getOwnedCollaborationUse() {
        return new SmList<>(this, OperationData.Metadata.OwnedCollaborationUseDep());
    }

    @objid ("f41a6870-913e-482a-a8bc-10181cd7ff1d")
    @Override
    public <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CollaborationUse element : getOwnedCollaborationUse()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3dd12dec-2f7e-476c-9053-52b602fe7fda")
    @Override
    public Operation getRedefines() {
        return (Operation) getDepVal(OperationData.Metadata.RedefinesDep());
    }

    @objid ("e9e537b8-0aef-466b-a517-7f7b9ecbbd06")
    @Override
    public void setRedefines(Operation value) {
        appendDepVal(OperationData.Metadata.RedefinesDep(), (SmObjectImpl)value);
    }

    @objid ("16411d4e-e6cd-4c67-bfba-845e845b8e6e")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, OperationData.Metadata.CallerDep());
    }

    @objid ("0db2b097-7d01-4420-8865-eb5eb4291d47")
    @Override
    public <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnCallActivity element : getCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("20f96b2c-8aa7-47ce-89f2-b368ab6c0c2b")
    @Override
    public EList<CallOperationAction> getCallingAction() {
        return new SmList<>(this, OperationData.Metadata.CallingActionDep());
    }

    @objid ("af70def0-b9bc-45ff-9ef4-9facb9712b58")
    @Override
    public <T extends CallOperationAction> List<T> getCallingAction(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CallOperationAction element : getCallingAction()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d8d71e61-8dcc-4fbb-8f0a-d9e90aaae67b")
    @Override
    public EList<AcceptCallEventAction> getEntryPointAction() {
        return new SmList<>(this, OperationData.Metadata.EntryPointActionDep());
    }

    @objid ("5212cbaa-f312-45da-9330-b4c37d37ddeb")
    @Override
    public <T extends AcceptCallEventAction> List<T> getEntryPointAction(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AcceptCallEventAction element : getEntryPointAction()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b495cc60-63fd-453b-97a3-681dcc897ec5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OperationData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("461234ba-57ff-4ca2-a657-069c43c38737")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OperationData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(OperationData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("30c321d9-c89b-473b-90b7-55b2e1410de7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitOperation(this);
        else
          return null;
    }

}
