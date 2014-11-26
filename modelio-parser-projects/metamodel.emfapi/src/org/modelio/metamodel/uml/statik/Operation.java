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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
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
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;

@objid ("001449ac-c4bf-1fd8-97fe-001ec947cd2a")
public interface Operation extends BehavioralFeature {
    @objid ("3fd3fb17-be1a-475f-b7b8-cb9d56bca51a")
    boolean isConcurrency();

    @objid ("6ae6382d-1f15-4384-9a2d-632f82735918")
    void setConcurrency(boolean value);

    @objid ("dc8fc026-5220-423a-b861-b2adf56e5276")
    boolean isFinal();

    @objid ("1c3a9e86-f8ea-41ea-b122-229056dc5360")
    void setFinal(boolean value);

    @objid ("96f727a5-174a-4d41-93b6-27c9fbf8220b")
    MethodPassingMode getPassing();

    @objid ("0640dc99-f328-452b-82dc-d18200c3572b")
    void setPassing(MethodPassingMode value);

    @objid ("aed8b3a4-95de-4206-90f9-96c330ca4ebf")
    EList<ElementImport> getOwnedImport();

    @objid ("58646926-0373-4ff2-bff0-b0aaf9c90f32")
    <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass);

    @objid ("d23a3f60-6dc2-4ec8-b144-d896a2570f80")
    EList<RaisedException> getThrown();

    @objid ("68703f93-59e7-4ff7-902e-d2c74bbba05d")
    <T extends RaisedException> List<T> getThrown(java.lang.Class<T> filterClass);

    @objid ("827ef159-ea74-4aa9-92ee-e49dfa3e27ec")
    EList<BpmnReceiveTask> getCallerReceiveTask();

    @objid ("98768a5c-a9d2-4398-a9d2-8962eafd225e")
    <T extends BpmnReceiveTask> List<T> getCallerReceiveTask(java.lang.Class<T> filterClass);

    @objid ("3a69ba75-06e1-4557-b2dc-5532ce152599")
    EList<Operation> getRedefinition();

    @objid ("6aeb28b3-5d6b-41a4-831f-25c4583c44e6")
    <T extends Operation> List<T> getRedefinition(java.lang.Class<T> filterClass);

    @objid ("176ca2dd-2f48-4795-8103-e05a19402464")
    EList<Collaboration> getExample();

    @objid ("94461843-602c-43cd-9f10-9e1c9e67f2e6")
    <T extends Collaboration> List<T> getExample(java.lang.Class<T> filterClass);

    @objid ("248eafb3-4314-4be1-a510-199bcb37eb08")
    EList<Signal> getSRepresentation();

    @objid ("134f6959-837f-4f66-bf58-f66defcba1fe")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("e4627abd-f3bb-4a4c-916f-e431f37395be")
    EList<Behavior> getOwnedBehavior();

    @objid ("3723d7ff-9caf-48d4-acb2-030c7f025019")
    <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass);

    @objid ("0f396d00-98eb-462c-81fe-7420e8c6ebd4")
    EList<BpmnOperation> getBpmnOperationRef();

    @objid ("8f25d179-8013-4c53-9255-34a539693714")
    <T extends BpmnOperation> List<T> getBpmnOperationRef(java.lang.Class<T> filterClass);

    @objid ("9e2cb79e-a6b6-4ef8-8b44-759a1ba24f39")
    EList<BpmnSendTask> getCallerSendTask();

    @objid ("98645ba9-7286-4456-9561-a88d83887a4a")
    <T extends BpmnSendTask> List<T> getCallerSendTask(java.lang.Class<T> filterClass);

    @objid ("ed2c0baa-cbda-42d8-b612-90d7c4fb215d")
    EList<Parameter> getIO();

    @objid ("69425746-55a3-4bc1-aa97-4192f3f86a4c")
    <T extends Parameter> List<T> getIO(java.lang.Class<T> filterClass);

    @objid ("a669938f-c356-4dfc-afd9-705c19c6fbea")
    EList<TemplateBinding> getTemplateInstanciation();

    @objid ("d08b7c7f-144f-4800-a340-382cbc12bc00")
    <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass);

    @objid ("7826c990-4464-4bc5-b9fd-30e5bd5554d5")
    Classifier getOwner();

    @objid ("9986ecd1-b872-4d88-8010-f04e1f76e2ad")
    void setOwner(Classifier value);

    @objid ("39a129bf-3c64-445c-8ea3-633ac15d5c6d")
    EList<PackageImport> getOwnedPackageImport();

    @objid ("94173cda-ff5c-40dc-8d31-13198037aa43")
    <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass);

    @objid ("db6c9413-16fb-4234-94b5-ad4b4d8fd22a")
    Parameter getReturn();

    @objid ("0eaae848-4721-4d17-8731-e0e3b0417c05")
    void setReturn(Parameter value);

    @objid ("34826b8d-c7ff-4b5d-8a87-7dadc5ffc342")
    EList<TemplateBinding> getInstanciatingBinding();

    @objid ("d4246933-9295-471a-bf26-dc3d07b2d45e")
    <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass);

    @objid ("1cf93c8c-9538-487d-9280-875b28ed94e7")
    EList<Message> getUsage();

    @objid ("380f42bf-e3e8-44a8-bfc7-999253bed0ba")
    <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass);

    @objid ("c27f7f62-42ea-4cc9-a460-1b29d0e9a1c5")
    EList<TemplateParameter> getTemplate();

    @objid ("afc1b5cd-5e5d-4991-a42f-da30e17fc0cc")
    <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass);

    @objid ("a2edab75-64fd-429f-91de-e8a07dd80a9f")
    EList<BpmnServiceTask> getCallerServiceTask();

    @objid ("8f75acdb-9f10-4c59-818f-85d56b71b766")
    <T extends BpmnServiceTask> List<T> getCallerServiceTask(java.lang.Class<T> filterClass);

    @objid ("da3a24ba-5137-42dd-87ce-4a3189361ad3")
    EList<Event> getOccurence();

    @objid ("a2057489-5a07-447c-afff-e716aec382fc")
    <T extends Event> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("3210c34c-b97d-452f-9b57-457090af5022")
    EList<Transition> getInvoker();

    @objid ("84bd97a4-e899-4997-b67a-80a6cfcd7bc1")
    <T extends Transition> List<T> getInvoker(java.lang.Class<T> filterClass);

    @objid ("76fef8fc-9ddf-4895-8347-d6bc1d8e9b4a")
    EList<CommunicationMessage> getCommunicationUsage();

    @objid ("b0957124-394d-44ba-b13d-e3284dd0c389")
    <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass);

    @objid ("21bad404-1bec-486b-bd7a-5297119cedc8")
    EList<CollaborationUse> getOwnedCollaborationUse();

    @objid ("d6ba7d3b-9f95-4355-9533-6aa2259e391e")
    <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass);

    @objid ("0830e409-7992-48a6-ad55-0b06a501cd65")
    Operation getRedefines();

    @objid ("aea6c046-abf0-42d9-ae28-6eb5515e2f2c")
    void setRedefines(Operation value);

    @objid ("0d16f99a-d981-4e4c-a648-d1bec0a5a74e")
    EList<BpmnCallActivity> getCaller();

    @objid ("8221c89a-9091-4c2d-99d3-0a790663d4ab")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("00bb1762-655b-4537-903b-abf056324e4b")
    EList<CallOperationAction> getCallingAction();

    @objid ("4f40feeb-a974-4cb8-afd7-32203f644a70")
    <T extends CallOperationAction> List<T> getCallingAction(java.lang.Class<T> filterClass);

    @objid ("f93b21c5-c146-4929-bb62-d102b868eb5f")
    EList<AcceptCallEventAction> getEntryPointAction();

    @objid ("2bf1d695-7c2b-4cfb-b9a5-72a0544a398c")
    <T extends AcceptCallEventAction> List<T> getEntryPointAction(java.lang.Class<T> filterClass);

}
