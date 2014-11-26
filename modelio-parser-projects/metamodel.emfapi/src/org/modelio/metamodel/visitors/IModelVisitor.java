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
                                    

package org.modelio.metamodel.visitors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnAdHocSubProcess;
import org.modelio.metamodel.bpmn.activities.BpmnBusinessRuleTask;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnManualTask;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnScriptTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.activities.BpmnStandardLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.activities.BpmnTransaction;
import org.modelio.metamodel.bpmn.activities.BpmnUserTask;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnProcessCollaborationDiagram;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnSubProcessDiagram;
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnCancelEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnConditionalEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnEndEvent;
import org.modelio.metamodel.bpmn.events.BpmnErrorEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnEscalationEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.bpmn.events.BpmnIntermediateCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnIntermediateThrowEvent;
import org.modelio.metamodel.bpmn.events.BpmnLinkEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnSignalEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnStartEvent;
import org.modelio.metamodel.bpmn.events.BpmnTerminateEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.events.BpmnTimerEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnParallelGateway;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnDataStore;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ActivityDiagram;
import org.modelio.metamodel.diagrams.BehaviorDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.diagrams.CommunicationDiagram;
import org.modelio.metamodel.diagrams.CompositeStructureDiagram;
import org.modelio.metamodel.diagrams.DeploymentDiagram;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.diagrams.ObjectDiagram;
import org.modelio.metamodel.diagrams.SequenceDiagram;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.diagrams.UseCaseDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptChangeEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptTimeEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityFinalNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityParameterNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.CallAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
import org.modelio.metamodel.uml.behavior.activityModel.CentralBufferNode;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.uml.behavior.activityModel.ControlFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ControlNode;
import org.modelio.metamodel.uml.behavior.activityModel.DataStoreNode;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionMergeNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.metamodel.uml.behavior.activityModel.FinalNode;
import org.modelio.metamodel.uml.behavior.activityModel.FlowFinalNode;
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
import org.modelio.metamodel.uml.behavior.activityModel.InitialNode;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.activityModel.InstanceNode;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.behavior.activityModel.LoopNode;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ValuePin;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.OpaqueBehavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.DurationConstraint;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.metamodel.uml.behavior.interactionModel.TerminateSpecification;
import org.modelio.metamodel.uml.behavior.stateMachineModel.AbstractPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ChoicePseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.DeepHistoryPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ForkPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InitialPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JoinPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JunctionPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ShallowHistoryPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.TerminatePseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.Abstraction;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.Usage;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.LocalPropertyTable;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BehavioralFeature;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.ElementRealization;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.NaryConnector;
import org.modelio.metamodel.uml.statik.NaryConnectorEnd;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.uml.statik.StructuralFeature;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.vcore.smkernel.mapi.MVisitor;

@objid ("000a4862-4f2c-1032-829a-001ec947cd2a")
public interface IModelVisitor extends MVisitor {
    @objid ("dfbf6bff-8103-498d-8460-a4f557c9a756")
    Object visitAbstraction(Abstraction obj);

    @objid ("bc982185-38f3-48a1-98de-7f53f1c04d36")
    Object visitConstraint(Constraint obj);

    @objid ("85d31cad-91a2-45d1-a8d0-ec137ecc152c")
    Object visitDependency(Dependency obj);

    @objid ("990534ec-fd06-4a93-8a0e-fda7a747a6d9")
    Object visitElement(Element obj);

    @objid ("a1e04cb0-05c6-4cdb-a45f-a7f23f6b06ee")
    Object visitModelElement(ModelElement obj);

    @objid ("d437f8d2-ce42-4d62-8306-044d0557be73")
    Object visitModelTree(ModelTree obj);

    @objid ("9d2b576d-a1a4-48f0-96f2-07a82aa3fcdd")
    Object visitNote(Note obj);

    @objid ("31508e92-aea0-46a9-b447-97fcb5a71374")
    Object visitNoteType(NoteType obj);

    @objid ("950f34e6-7989-4059-9033-b4763812f294")
    Object visitProfile(Profile obj);

    @objid ("d5e6fc93-6ac3-4ab9-80a7-ad1b7d609acd")
    Object visitStereotype(Stereotype obj);

    @objid ("cf016e5a-f2c2-4a5a-9245-250ae8ad7349")
    Object visitSubstitution(Substitution obj);

    @objid ("9e7b767e-10da-432d-88ca-f923856aa3fd")
    Object visitTagParameter(TagParameter obj);

    @objid ("13221f0c-3ba7-4c2d-89c2-6e9b310a23ab")
    Object visitTagType(TagType obj);

    @objid ("af1ef6a6-db49-45d4-a00c-99445276e344")
    Object visitTaggedValue(TaggedValue obj);

    @objid ("76e72b92-3a03-4c81-8781-58b82a171823")
    Object visitUsage(Usage obj);

    @objid ("9fe1890e-14b7-484f-bfab-52adb4ea3587")
    Object visitMetaclassReference(MetaclassReference obj);

    @objid ("e7b900ce-488b-44cd-bb22-396fda1d2d71")
    Object visitExternDocument(ExternDocument obj);

    @objid ("73a4d1f4-501a-46de-8858-3ccc0fe85834")
    Object visitExternDocumentType(ExternDocumentType obj);

    @objid ("ecdb3d51-ed26-45c5-b31a-370111b2b8f3")
    Object visitEnumeratedPropertyType(EnumeratedPropertyType obj);

    @objid ("6bea1617-e267-430d-b545-cb1cb03f51e9")
    Object visitLocalPropertyTable(LocalPropertyTable obj);

    @objid ("2ecd5bb0-07ba-4aee-8659-17671e4818a8")
    Object visitPropertyDefinition(PropertyDefinition obj);

    @objid ("500cdc31-c87d-425a-a7eb-91043fd7308e")
    Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj);

    @objid ("64d2eed3-5cc5-4292-8754-7d67d0f896f7")
    Object visitPropertyTable(PropertyTable obj);

    @objid ("496e0393-8cfa-4cbd-ba50-4311f967a10e")
    Object visitPropertyTableDefinition(PropertyTableDefinition obj);

    @objid ("c3e1bb44-ac78-4e83-8b4e-877b3f9f3191")
    Object visitPropertyType(PropertyType obj);

    @objid ("e31dbc12-21aa-4abe-8698-24c48a334998")
    Object visitTypedPropertyTable(TypedPropertyTable obj);

    @objid ("ff08ae7a-83f9-4266-af46-6debbdf539d2")
    Object visitMatrixDefinition(MatrixDefinition obj);

    @objid ("4d40d382-d559-4f50-919b-af03609d3ce7")
    Object visitQueryDefinition(QueryDefinition obj);

    @objid ("e3400a07-1fcd-4247-8019-76c4a21a9d10")
    Object visitMatrixValueDefinition(MatrixValueDefinition obj);

    @objid ("2a6c3d2a-7116-4add-9940-e9f163838964")
    Object visitExternProcessor(ExternProcessor obj);

    @objid ("243190cc-51ad-4e78-b6e7-d406b893c0d5")
    Object visitArtifact(Artifact obj);

    @objid ("83c1c464-a9ee-4f1a-bfdd-7d1f700d2b03")
    Object visitAssociationEnd(AssociationEnd obj);

    @objid ("98cdc496-35b9-41c9-be31-6f09af035dcf")
    Object visitAttribute(Attribute obj);

    @objid ("59babe20-c71a-46a8-8257-eb999b53bfa5")
    Object visitAttributeLink(AttributeLink obj);

    @objid ("a88e17af-66b9-4ec2-bd3a-cb140d384724")
    Object visitBindableInstance(BindableInstance obj);

    @objid ("d4e7b6a5-75e3-4ee8-b6cc-1efcfaf86857")
    Object visitBinding(Binding obj);

    @objid ("bfe37797-b524-4fb0-976b-7e1882325fb2")
    Object visitClass(Class obj);

    @objid ("4a8050a4-0e14-40e0-9069-a36847a4913a")
    Object visitClassAssociation(ClassAssociation obj);

    @objid ("6e9e3711-27c2-49e3-9513-1ec262387568")
    Object visitClassifier(Classifier obj);

    @objid ("29ae8158-493b-455a-8b85-60febcf42713")
    Object visitCollaboration(Collaboration obj);

    @objid ("95d6060a-a0dd-40b8-bfa2-3132240fb136")
    Object visitCollaborationUse(CollaborationUse obj);

    @objid ("ad1ed5ba-55f5-4383-b422-11ae284c765a")
    Object visitComponent(Component obj);

    @objid ("1e645e79-dbce-433a-91dc-786e9136dde7")
    Object visitComponentRealization(ComponentRealization obj);

    @objid ("6d281315-9b31-4614-85a0-ca632e5e705f")
    Object visitNaryConnector(NaryConnector obj);

    @objid ("44198d7a-b68a-4cb8-8d83-e99db5ae63b6")
    Object visitConnectorEnd(ConnectorEnd obj);

    @objid ("a532dce7-ddca-40ad-a99e-3da255572855")
    Object visitDataType(DataType obj);

    @objid ("37680bc7-6943-46bf-9699-0438a8b44b62")
    Object visitElementImport(ElementImport obj);

    @objid ("b56597d1-5719-4b00-99e3-e85eaaefc6f2")
    Object visitElementRealization(ElementRealization obj);

    @objid ("11bfaef7-d98d-4ebc-a3bf-ecec38778f20")
    Object visitEnumeration(Enumeration obj);

    @objid ("a00e188b-8d08-4557-b74e-2bfe89040d6d")
    Object visitEnumerationLiteral(EnumerationLiteral obj);

    @objid ("c933bd03-cc97-4c05-b42f-5347d5687194")
    Object visitFeature(Feature obj);

    @objid ("d5bea7d5-a4af-4bbb-858d-7c2b71d9aabd")
    Object visitGeneralClass(GeneralClass obj);

    @objid ("34d477e7-ccfa-4895-b453-c12797e999b9")
    Object visitGeneralization(Generalization obj);

    @objid ("f6921e37-8ccb-4612-a761-c50a13ff3e91")
    Object visitInstance(Instance obj);

    @objid ("75e99c39-bd30-45c2-a4c4-a77f19b7b7d5")
    Object visitInterface(Interface obj);

    @objid ("0fe7c76e-1606-459e-aaa9-7ff1955b4576")
    Object visitInterfaceRealization(InterfaceRealization obj);

    @objid ("2e468dbf-835a-46cf-a91d-5ff65ac02142")
    Object visitLinkEnd(LinkEnd obj);

    @objid ("54780b11-0cb6-4692-a81a-770b44dd31de")
    Object visitManifestation(Manifestation obj);

    @objid ("43795079-0328-4111-9fff-7161abf58caf")
    Object visitNameSpace(NameSpace obj);

    @objid ("b797fa63-7234-43cd-8b6d-2814bde19376")
    Object visitNamespaceUse(NamespaceUse obj);

    @objid ("6f443f3e-b9c0-44d6-a1f4-05f4b0045ec4")
    Object visitNode(Node obj);

    @objid ("b20e3018-afee-41f5-9458-dd11969ccd1c")
    Object visitOperation(Operation obj);

    @objid ("ae5f0b68-cc63-429b-bb69-89a065d23744")
    Object visitPackage(Package obj);

    @objid ("05a44e3b-5dbf-42d6-921e-77700953a81d")
    Object visitPackageImport(PackageImport obj);

    @objid ("870418d9-0741-41b1-9c3d-fcdc215de22e")
    Object visitPackageMerge(PackageMerge obj);

    @objid ("78f8e2d2-a739-4642-8456-2999e0c80966")
    Object visitParameter(Parameter obj);

    @objid ("6b4e64ba-332d-49c2-8910-5b4bc8b05634")
    Object visitPort(Port obj);

    @objid ("77fc0e78-519c-43a7-b35c-8f6c89888da2")
    Object visitProvidedInterface(ProvidedInterface obj);

    @objid ("e1094150-c41e-4080-af4c-4598cdbfb56d")
    Object visitRaisedException(RaisedException obj);

    @objid ("d551c717-4fee-481f-b984-de7a4beae5a4")
    Object visitRequiredInterface(RequiredInterface obj);

    @objid ("443d928f-4ffa-4d63-b51e-b4371d2462b8")
    Object visitTemplateBinding(TemplateBinding obj);

    @objid ("d5435cd0-63fb-42fc-9264-db7bb3fc2991")
    Object visitTemplateParameter(TemplateParameter obj);

    @objid ("1848fa2e-2e42-4753-8e05-a9e3be499569")
    Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj);

    @objid ("04063974-283a-4105-8864-8ae9f8dd529b")
    Object visitStructuralFeature(StructuralFeature obj);

    @objid ("e192244a-ad78-40d6-bec1-bb342fc8b598")
    Object visitBehavioralFeature(BehavioralFeature obj);

    @objid ("1e761dc5-c687-43c0-8cf5-2ccfd9fdbb58")
    Object visitNaryAssociationEnd(NaryAssociationEnd obj);

    @objid ("d2693e6b-0e74-4806-bfd7-494689de03dc")
    Object visitNaryAssociation(NaryAssociation obj);

    @objid ("e30dbaa7-a4c7-47eb-843b-177d2b3366ca")
    Object visitNaryLink(NaryLink obj);

    @objid ("08247ade-4f61-43ba-abe5-745687fbd8f0")
    Object visitNaryLinkEnd(NaryLinkEnd obj);

    @objid ("016c3527-cc54-4051-b333-e7eb85344637")
    Object visitNaryConnectorEnd(NaryConnectorEnd obj);

    @objid ("30b3ac7a-4a3c-45d7-9ca6-836ee5624977")
    Object visitAssociation(Association obj);

    @objid ("a11cb8f4-7a17-4499-b905-5953f798eacd")
    Object visitLink(Link obj);

    @objid ("8e5c8c6f-1e8b-4fd0-a866-bd1ba1a25bbe")
    Object visitConnector(Connector obj);

    @objid ("9646f6b2-0240-4d7c-a7c5-687ce17b3395")
    Object visitAcceptCallEventAction(AcceptCallEventAction obj);

    @objid ("e6e825c2-48b4-4250-a7b8-5c6b0a236fc2")
    Object visitAcceptChangeEventAction(AcceptChangeEventAction obj);

    @objid ("ebdcecfc-549b-4cfe-b95c-16d7c8aad064")
    Object visitAcceptSignalAction(AcceptSignalAction obj);

    @objid ("e5e62b14-cd55-4f08-b315-96d6a2c9f12c")
    Object visitAcceptTimeEventAction(AcceptTimeEventAction obj);

    @objid ("c05f6d9c-3ba7-4cee-b61a-5d24d0001812")
    Object visitActivity(Activity obj);

    @objid ("4d771bcd-1506-45fd-aa10-74b623fa23ab")
    Object visitActivityAction(ActivityAction obj);

    @objid ("450110ff-bf9f-4dae-86e1-60f3e013e3a4")
    Object visitActivityEdge(ActivityEdge obj);

    @objid ("f504b3d1-fa18-494f-90c1-36b6b0399e9f")
    Object visitActivityFinalNode(ActivityFinalNode obj);

    @objid ("25ff639d-2b55-4167-86cf-b5b65efdd499")
    Object visitActivityGroup(ActivityGroup obj);

    @objid ("601703a6-2df9-4556-afa8-9e1cefab8314")
    Object visitActivityNode(ActivityNode obj);

    @objid ("695b7210-2f5c-4bf7-978b-27d929dde85e")
    Object visitActivityParameterNode(ActivityParameterNode obj);

    @objid ("eb0df006-e168-4590-9dac-7d039e4dbb41")
    Object visitActivityPartition(ActivityPartition obj);

    @objid ("81fc9272-530b-440a-ae1f-aacee0ed4598")
    Object visitCallAction(CallAction obj);

    @objid ("f06de8a7-a9fc-412f-b24a-c4ad17a9c6b0")
    Object visitCallBehaviorAction(CallBehaviorAction obj);

    @objid ("03ad74c5-138d-42a7-9e83-953f9bdcdee9")
    Object visitCallOperationAction(CallOperationAction obj);

    @objid ("65ecd2f9-4fc9-4542-8862-1c894bf5a13d")
    Object visitCentralBufferNode(CentralBufferNode obj);

    @objid ("ba3100a7-11fe-4175-9406-c2c5461fed59")
    Object visitClause(Clause obj);

    @objid ("ad589924-55c0-45ae-888c-856b37fa1b94")
    Object visitConditionalNode(ConditionalNode obj);

    @objid ("cca5b2ff-f997-48cf-9394-1b26ba6b56d9")
    Object visitControlFlow(ControlFlow obj);

    @objid ("4365fa45-052e-4bd1-846e-2a11aa329879")
    Object visitControlNode(ControlNode obj);

    @objid ("25e7bb21-061b-4386-ac59-f80db29e77bf")
    Object visitDataStoreNode(DataStoreNode obj);

    @objid ("9373ff04-0477-450a-b561-e7db86a6a1d1")
    Object visitDecisionMergeNode(DecisionMergeNode obj);

    @objid ("8b56cee8-4641-480d-a9ef-4b027c983afa")
    Object visitExceptionHandler(ExceptionHandler obj);

    @objid ("b18c3bf4-224d-4844-b310-789ec3450ed6")
    Object visitExpansionNode(ExpansionNode obj);

    @objid ("42457310-b5c1-4e2e-8a66-9a2278abce48")
    Object visitExpansionRegion(ExpansionRegion obj);

    @objid ("6305e314-c59d-4661-9443-7b62136ff4c8")
    Object visitFinalNode(FinalNode obj);

    @objid ("5f898f67-1bb7-44d4-ad8c-0c04cc6db67b")
    Object visitFlowFinalNode(FlowFinalNode obj);

    @objid ("6d23cbb9-256a-4172-8f04-a10d31c442f4")
    Object visitForkJoinNode(ForkJoinNode obj);

    @objid ("6d590d03-d14d-4585-a2f7-bfa2d727d1ec")
    Object visitInitialNode(InitialNode obj);

    @objid ("7cfc715f-e7ac-435b-898e-26931ce82d66")
    Object visitInputPin(InputPin obj);

    @objid ("be15e21e-2d36-41e2-a735-3995e6ea2ec2")
    Object visitInstanceNode(InstanceNode obj);

    @objid ("97fbb128-976a-4928-8da2-ee803c10b247")
    Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj);

    @objid ("6d3ceca4-5aee-4a15-bb99-21057dc0ad17")
    Object visitLoopNode(LoopNode obj);

    @objid ("115c949f-83ed-4d1f-9cf6-7b5d892f42d8")
    Object visitMessageFlow(MessageFlow obj);

    @objid ("1be5e501-3edf-44ad-8fc9-da0dd01bbaf3")
    Object visitObjectFlow(ObjectFlow obj);

    @objid ("72988f85-31e2-4a4e-be28-7eee4b137ec9")
    Object visitObjectNode(ObjectNode obj);

    @objid ("640c0c07-8687-4dd7-86c2-cac67bafc6f3")
    Object visitOpaqueAction(OpaqueAction obj);

    @objid ("085d34e8-2fca-400d-8ced-25ae9d6c8baf")
    Object visitOutputPin(OutputPin obj);

    @objid ("ba4fcf90-6499-458d-a7fd-fe420334c736")
    Object visitPin(Pin obj);

    @objid ("5bd219e7-1c90-42fc-bb75-f656b2ef7f08")
    Object visitSendSignalAction(SendSignalAction obj);

    @objid ("5bf22b3f-04ed-4706-8d2a-8d29a8170dac")
    Object visitStructuredActivityNode(StructuredActivityNode obj);

    @objid ("5fd0dbb5-ea8a-4864-90cf-5fe46929a61c")
    Object visitValuePin(ValuePin obj);

    @objid ("2d10f9ab-8b8a-43d9-9ec6-2333927d9089")
    Object visitBehavior(Behavior obj);

    @objid ("63776263-731a-47b6-ae20-90c0223296ab")
    Object visitBehaviorParameter(BehaviorParameter obj);

    @objid ("e019f50c-2f57-4ffe-a287-9d9ba7cb933e")
    Object visitOpaqueBehavior(OpaqueBehavior obj);

    @objid ("8fecf86d-60c4-44d1-9306-17e2a9b96383")
    Object visitSignal(Signal obj);

    @objid ("5e95df57-563a-4c5e-9f16-521722bbf9bc")
    Object visitEvent(Event obj);

    @objid ("0b7a4ed2-51a6-4c4e-806a-02985c9c1ab7")
    Object visitCombinedFragment(CombinedFragment obj);

    @objid ("fd9a63ab-b549-41f6-a1db-acea90d349bb")
    Object visitDurationConstraint(DurationConstraint obj);

    @objid ("ad9b0f57-4f83-448d-8f2c-c32f9e296477")
    Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj);

    @objid ("cbec8160-e4f2-4414-817f-8cb843ce0d09")
    Object visitExecutionSpecification(ExecutionSpecification obj);

    @objid ("5e7185e4-7844-4450-bca3-ecafa287ccdb")
    Object visitGate(Gate obj);

    @objid ("03dfd0a2-129f-4014-aa0c-c4090c35bbf2")
    Object visitGeneralOrdering(GeneralOrdering obj);

    @objid ("2b40b88b-93de-43e3-8da8-37fd64b1dbf9")
    Object visitInteraction(Interaction obj);

    @objid ("0f302089-c160-4b46-9916-34ae78ccba83")
    Object visitInteractionFragment(InteractionFragment obj);

    @objid ("6b8e668d-f292-402e-8f10-c16ceb4c8a31")
    Object visitInteractionOperand(InteractionOperand obj);

    @objid ("2b7bba38-8180-417f-b908-d03671b8b67b")
    Object visitInteractionUse(InteractionUse obj);

    @objid ("79134352-d89f-4953-a814-69387d9c1260")
    Object visitLifeline(Lifeline obj);

    @objid ("ea7684e1-d8b5-4823-bbf0-b8b6779cc620")
    Object visitMessage(Message obj);

    @objid ("9e2d24c1-94c1-423b-b98d-c5f7208fb19e")
    Object visitMessageEnd(MessageEnd obj);

    @objid ("0cd997c1-42ea-4a90-801c-f77fffb84609")
    Object visitOccurrenceSpecification(OccurrenceSpecification obj);

    @objid ("83c4123a-8efe-4d51-8fd5-1a1b7006ef29")
    Object visitPartDecomposition(PartDecomposition obj);

    @objid ("d289a535-90ff-4d04-bcd6-ceec3f3ca24c")
    Object visitStateInvariant(StateInvariant obj);

    @objid ("0de85c14-d747-4615-bd53-79fd87c481cd")
    Object visitTerminateSpecification(TerminateSpecification obj);

    @objid ("cd7f5560-1d99-4397-9b52-83de4025f194")
    Object visitAbstractPseudoState(AbstractPseudoState obj);

    @objid ("53b4ff1e-1b58-4f23-9dac-bd297887ae23")
    Object visitChoicePseudoState(ChoicePseudoState obj);

    @objid ("0cfa8948-afb2-4fe7-a662-51cb7ec1cee2")
    Object visitConnectionPointReference(ConnectionPointReference obj);

    @objid ("9e7294d4-3e04-4463-a538-5ba718e7c5fb")
    Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj);

    @objid ("bf5a2214-4683-43e1-967d-2f93b7dd3685")
    Object visitEntryPointPseudoState(EntryPointPseudoState obj);

    @objid ("229aee61-53d2-4bca-95c9-148b98d0336f")
    Object visitExitPointPseudoState(ExitPointPseudoState obj);

    @objid ("42345bd9-2ab8-4ad5-a2e8-1d476e94af9f")
    Object visitForkPseudoState(ForkPseudoState obj);

    @objid ("26524cff-06de-4756-ac65-08b7ec9fb114")
    Object visitInitialPseudoState(InitialPseudoState obj);

    @objid ("aed6cc7a-4303-40f5-8836-bd5c1c06002d")
    Object visitInternalTransition(InternalTransition obj);

    @objid ("aa8677d6-3e2c-4a90-8ad5-d34e63c2e6b7")
    Object visitJoinPseudoState(JoinPseudoState obj);

    @objid ("32403a03-d551-4502-93d6-52e001bfc461")
    Object visitJunctionPseudoState(JunctionPseudoState obj);

    @objid ("fed535ea-28a7-4aff-967c-40a8fbd1c0b3")
    Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj);

    @objid ("d82b6eb7-954b-4232-843f-c755eda72eaa")
    Object visitState(State obj);

    @objid ("5b9fab3c-8158-4f76-be3b-54829c7dac7e")
    Object visitStateMachine(StateMachine obj);

    @objid ("4c65d8ec-5ea6-48d9-98c3-c01eef557caa")
    Object visitStateVertex(StateVertex obj);

    @objid ("3c1d5a5d-d192-4616-b540-5b4656d32c21")
    Object visitTerminatePseudoState(TerminatePseudoState obj);

    @objid ("7b6e7cd3-d29a-4422-a0da-1a4aa40cdc9e")
    Object visitTransition(Transition obj);

    @objid ("06220feb-7932-4a56-8ebe-a49ed28e671c")
    Object visitFinalState(FinalState obj);

    @objid ("1fc3cc0f-7fa8-4e08-b2b8-dc0e923fbd64")
    Object visitRegion(Region obj);

    @objid ("e0d8e440-19a5-490a-977a-2051211708da")
    Object visitActor(Actor obj);

    @objid ("eb68be16-2a34-4dfa-a87a-1857eda641f5")
    Object visitUseCase(UseCase obj);

    @objid ("480d4318-c938-4dfe-9bdd-bffa454e847e")
    Object visitUseCaseDependency(UseCaseDependency obj);

    @objid ("eb594464-7803-4f44-9ecf-61ef2d0a3702")
    Object visitExtensionPoint(ExtensionPoint obj);

    @objid ("40186c88-6f82-4bb5-9c30-6d31d7eb1667")
    Object visitAnalystItem(AnalystItem obj);

    @objid ("1f3938a2-07eb-4621-8a1c-a62a1d070c1d")
    Object visitAnalystElement(AnalystElement obj);

    @objid ("f596f33d-47e3-4f24-9190-b3352f8ad635")
    Object visitAnalystContainer(AnalystContainer obj);

    @objid ("3aa205c8-f008-4ea2-880a-cb2905c1d6a1")
    Object visitAnalystProject(AnalystProject obj);

    @objid ("13701c53-78c4-419b-b2f8-e0011a1cfc13")
    Object visitAnalystPropertyTable(AnalystPropertyTable obj);

    @objid ("63a653ff-a28e-481a-bbf9-12cd37c8d089")
    Object visitBusinessRule(BusinessRule obj);

    @objid ("739d61df-4e06-4b01-ad03-df54745b76cb")
    Object visitBusinessRuleContainer(BusinessRuleContainer obj);

    @objid ("3af5f23c-2d53-4f14-8a8b-304b432f6ab9")
    Object visitDictionary(Dictionary obj);

    @objid ("4da3a0f0-5d32-4c90-b992-06cebe8fcffb")
    Object visitGoal(Goal obj);

    @objid ("1163ecfa-b07c-400f-9ef9-2aa477643465")
    Object visitGoalContainer(GoalContainer obj);

    @objid ("c8280974-6582-4170-bb18-5090aed84e6c")
    Object visitPropertyContainer(PropertyContainer obj);

    @objid ("897f2025-befd-416d-974b-d1d0f867876e")
    Object visitRequirement(Requirement obj);

    @objid ("d8f7faac-7232-45b9-ad6e-d7358592279d")
    Object visitRequirementContainer(RequirementContainer obj);

    @objid ("3bdcdc6e-fd96-4698-a80d-f357203cb531")
    Object visitTerm(Term obj);

    @objid ("c9780519-926f-4907-b212-08514f246fdf")
    Object visitGenericAnalystContainer(GenericAnalystContainer obj);

    @objid ("fa76ae54-581b-4d25-8a52-1601b0a34bb0")
    Object visitGenericAnalystElement(GenericAnalystElement obj);

    @objid ("e7d22f72-8bed-47d3-b769-24fffb62955b")
    Object visitInformationFlow(InformationFlow obj);

    @objid ("9a684d79-b80d-44eb-b623-f976e7c73056")
    Object visitInformationItem(InformationItem obj);

    @objid ("c23bb83b-6e6f-4704-9c18-3df75a893fa8")
    Object visitDataFlow(DataFlow obj);

    @objid ("7fe29c2e-b505-475a-ac46-019812363818")
    Object visitCommunicationInteraction(CommunicationInteraction obj);

    @objid ("1f5f176a-4985-4289-8c68-3801911fc716")
    Object visitCommunicationNode(CommunicationNode obj);

    @objid ("4f2ae732-97f6-462c-94a6-0f093d064cf7")
    Object visitCommunicationMessage(CommunicationMessage obj);

    @objid ("e17a7784-572a-4f49-8e25-a48deb3d795c")
    Object visitCommunicationChannel(CommunicationChannel obj);

    @objid ("ecd03220-f62e-40fa-a7a5-679e38ce057d")
    Object visitBpmnCollaboration(BpmnCollaboration obj);

    @objid ("2300d005-9d0f-48de-98fb-6ee09be562c1")
    Object visitBpmnLane(BpmnLane obj);

    @objid ("b3357e03-6b4f-480c-93e3-74be05ac7936")
    Object visitBpmnLaneSet(BpmnLaneSet obj);

    @objid ("94ef100e-7632-4fd2-a55b-5d006d59ec4b")
    Object visitBpmnParticipant(BpmnParticipant obj);

    @objid ("a893da19-3952-4260-8ece-935180abedd2")
    Object visitBpmnProcess(BpmnProcess obj);

    @objid ("d4f61c39-2cb4-4c42-88aa-742772a3a6c2")
    Object visitBpmnAssociation(BpmnAssociation obj);

    @objid ("b2c5b31a-3e7d-46ae-9567-e7b52d252860")
    Object visitBpmnBaseElement(BpmnBaseElement obj);

    @objid ("e13a5a8f-445b-4fd6-94f2-95462a8cf873")
    Object visitBpmnArtifact(BpmnArtifact obj);

    @objid ("6f0da242-8a12-4989-8416-08eafd8f21d8")
    Object visitBpmnFlowElement(BpmnFlowElement obj);

    @objid ("ec1262e8-5677-421b-ad01-8e1f8a12826d")
    Object visitBpmnFlowNode(BpmnFlowNode obj);

    @objid ("f12dd3d5-c362-4b54-be0b-e39dbe03ee13")
    Object visitBpmnGroup(BpmnGroup obj);

    @objid ("8cf74329-6a92-45ca-a26c-2d7ab00f7f46")
    Object visitBpmnRootElement(BpmnRootElement obj);

    @objid ("8992c0dc-34fd-4621-b5e7-51a7006eafbe")
    Object visitBpmnBehavior(BpmnBehavior obj);

    @objid ("eaa4a50d-68ec-4227-bba1-40ae1cfb9cf5")
    Object visitBpmnMessage(BpmnMessage obj);

    @objid ("96a0e3c4-f190-49bf-965c-dfec9e1cef00")
    Object visitBpmnMessageFlow(BpmnMessageFlow obj);

    @objid ("d32a0c35-1e64-4da3-8370-d1b6582014a7")
    Object visitBpmnSequenceFlow(BpmnSequenceFlow obj);

    @objid ("c52b40f3-3f16-44e7-b787-7de464036d0a")
    Object visitBpmnActivity(BpmnActivity obj);

    @objid ("b7133696-c680-423f-a908-be0e8780946d")
    Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj);

    @objid ("03e8669f-7e0e-4990-b4dd-e240aa8e33e1")
    Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj);

    @objid ("83b59a59-31e4-4aed-9871-141d745cd394")
    Object visitBpmnCallActivity(BpmnCallActivity obj);

    @objid ("17dba11f-e1a0-44d2-b94d-a35438e99b65")
    Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj);

    @objid ("b8887284-6727-4290-b837-a27ddf8761a4")
    Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj);

    @objid ("1df89902-f29c-4a48-9d85-b2b40df9e5d2")
    Object visitBpmnManualTask(BpmnManualTask obj);

    @objid ("8a3fcac9-41a5-4a75-ad9a-7736cf2dddae")
    Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj);

    @objid ("8c114e62-bbaf-47fd-b1d4-c24c83051ede")
    Object visitBpmnReceiveTask(BpmnReceiveTask obj);

    @objid ("6bc592fe-8a58-4c6d-8547-b7f6000c5236")
    Object visitBpmnScriptTask(BpmnScriptTask obj);

    @objid ("2af4b9b8-fd4b-47c8-8c88-d8cf452477ce")
    Object visitBpmnSendTask(BpmnSendTask obj);

    @objid ("23d4128f-aae7-4e92-943f-e44f2d67e320")
    Object visitBpmnServiceTask(BpmnServiceTask obj);

    @objid ("6a712562-51f8-411e-b1f9-62046480362a")
    Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj);

    @objid ("ded6483f-a78e-4c85-9d69-61f87fd8133c")
    Object visitBpmnSubProcess(BpmnSubProcess obj);

    @objid ("bf640ded-827b-421b-a377-fdf5318c4310")
    Object visitBpmnTask(BpmnTask obj);

    @objid ("8b4796c0-785b-4998-be65-76b4d0ad0142")
    Object visitBpmnTransaction(BpmnTransaction obj);

    @objid ("94c56952-a311-48aa-87b0-45b4e855917b")
    Object visitBpmnUserTask(BpmnUserTask obj);

    @objid ("e731e0c4-c5cd-4628-bf90-99952e840a55")
    Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj);

    @objid ("7d607bd7-512d-4d67-83e3-16a6518c5d58")
    Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj);

    @objid ("ff2aa75b-11df-4f73-9b90-646f71eda4b4")
    Object visitBpmnCatchEvent(BpmnCatchEvent obj);

    @objid ("113897eb-ae7a-4e95-a203-33cb404467b1")
    Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj);

    @objid ("0cd060be-3a7a-4ead-9c96-4a1b434ef2be")
    Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj);

    @objid ("f88a38d2-af65-4e07-896f-bcc88cadcce7")
    Object visitBpmnEndEvent(BpmnEndEvent obj);

    @objid ("4e92c8f1-9f06-451a-b960-4cffe0a16607")
    Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj);

    @objid ("be52aa83-039a-4cd9-81be-62d67d7d68aa")
    Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj);

    @objid ("6fadcf83-0151-4b40-8860-dbc988e81e29")
    Object visitBpmnEvent(BpmnEvent obj);

    @objid ("247fcd04-9cc9-4b45-acba-6ca0b5f4dcd7")
    Object visitBpmnEventDefinition(BpmnEventDefinition obj);

    @objid ("4f17db42-f9af-4baf-bdbc-b863b03cbefc")
    Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj);

    @objid ("c0696152-b06c-48a9-8c45-f96907414492")
    Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj);

    @objid ("32446591-efc1-4c66-a203-5a7578e1f915")
    Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj);

    @objid ("6c97f767-cf64-4c16-9b34-753962b9c7ec")
    Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj);

    @objid ("75ba55c0-95c1-40aa-9000-01fe2f158637")
    Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj);

    @objid ("1835c0b1-c7b9-472e-a8bb-84e1339622e4")
    Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj);

    @objid ("8ce4139a-f37f-49a8-a03e-5091cf44a048")
    Object visitBpmnStartEvent(BpmnStartEvent obj);

    @objid ("c04e5b5b-a4f8-4b27-95c3-85c59beac342")
    Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj);

    @objid ("6484e973-2e6f-467a-bd6e-b690cfe20c85")
    Object visitBpmnThrowEvent(BpmnThrowEvent obj);

    @objid ("3b28c04a-575b-4a4a-8de5-d3d4aaef172a")
    Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj);

    @objid ("bf5858b0-7839-4498-b9f2-3adfbbe6ca2d")
    Object visitBpmnComplexGateway(BpmnComplexGateway obj);

    @objid ("79789deb-1733-48a6-8681-9137cb1b9b60")
    Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj);

    @objid ("eb278f08-e04f-44cc-a599-6e885f2ba79f")
    Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj);

    @objid ("1d9194c4-81ef-455a-8789-842957ec01ce")
    Object visitBpmnGateway(BpmnGateway obj);

    @objid ("4451a726-d93e-4439-99a7-ca2caacf7b3c")
    Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj);

    @objid ("2731e315-3c6e-4df3-b2a8-58ec0be54bd5")
    Object visitBpmnParallelGateway(BpmnParallelGateway obj);

    @objid ("3fdaa9c9-5d9a-4d0e-ae31-17045140f25c")
    Object visitBpmnDataObject(BpmnDataObject obj);

    @objid ("63805e74-f732-48e2-b961-eeb7356e791a")
    Object visitBpmnDataStore(BpmnDataStore obj);

    @objid ("1c8b5d73-4c70-4239-9473-cbe39290f1ba")
    Object visitBpmnDataAssociation(BpmnDataAssociation obj);

    @objid ("45e86379-7bb2-4e8f-a28c-07a070c3c7a5")
    Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj);

    @objid ("1424b1b5-be7c-4e69-b8aa-c9100a99ee22")
    Object visitBpmnDataOutput(BpmnDataOutput obj);

    @objid ("406a5f9a-7f53-4dd6-8ee5-67d7167447bd")
    Object visitBpmnDataInput(BpmnDataInput obj);

    @objid ("c5c97f1b-68e9-440f-a34e-f612440ac853")
    Object visitBpmnItemAwareElement(BpmnItemAwareElement obj);

    @objid ("56e9b18d-93f5-4ada-bd9b-7b63cb9fd57e")
    Object visitBpmnItemDefinition(BpmnItemDefinition obj);

    @objid ("6c8dc82f-012f-49cc-a737-ff5f63e6247b")
    Object visitBpmnDataState(BpmnDataState obj);

    @objid ("1173ef42-a617-40d7-b9a7-4c21ec8247dc")
    Object visitBpmnResource(BpmnResource obj);

    @objid ("4acfd0fd-b6a6-4877-bc11-6316a6b8eda3")
    Object visitBpmnResourceParameter(BpmnResourceParameter obj);

    @objid ("c5dd3735-1c6e-48dc-a0c9-1e94268580f3")
    Object visitBpmnResourceRole(BpmnResourceRole obj);

    @objid ("3969d6bc-eae4-4259-8e89-2de98cba0583")
    Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj);

    @objid ("410e7258-b707-48e3-b954-d7a6a447fe58")
    Object visitBpmnOperation(BpmnOperation obj);

    @objid ("5c113308-851f-4be5-8660-3e6a98f7113d")
    Object visitBpmnInterface(BpmnInterface obj);

    @objid ("8d50e41d-b0b6-4b81-9f67-a5087f1002e1")
    Object visitBpmnEndPoint(BpmnEndPoint obj);

    @objid ("5f6b8748-6a86-4bfe-a2a1-d1d83bf0bcd5")
    Object visitAbstractDiagram(AbstractDiagram obj);

    @objid ("bd1c0302-8b18-457a-9d41-af1c22cabb3e")
    Object visitActivityDiagram(ActivityDiagram obj);

    @objid ("f2013cbb-c0b1-47a1-a22d-fee9f9ad7486")
    Object visitBehaviorDiagram(BehaviorDiagram obj);

    @objid ("7e66f007-52f5-4d6b-84cb-902c38b32a64")
    Object visitClassDiagram(ClassDiagram obj);

    @objid ("2222cdd1-01b8-4f6d-bd6d-a2d90cbb4843")
    Object visitCommunicationDiagram(CommunicationDiagram obj);

    @objid ("5bd435b0-131e-4fc9-9ada-2d62c5bca0b9")
    Object visitDeploymentDiagram(DeploymentDiagram obj);

    @objid ("f67fe1a6-0f3e-406e-a956-78b451246f83")
    Object visitDiagramSet(DiagramSet obj);

    @objid ("15f81849-df06-40a8-9736-d2698f0e73a3")
    Object visitSequenceDiagram(SequenceDiagram obj);

    @objid ("b447a525-b89f-4ba9-b1a3-51e77bccff83")
    Object visitStateMachineDiagram(StateMachineDiagram obj);

    @objid ("76fe88a5-7ac3-4288-953d-3801ec4569de")
    Object visitStaticDiagram(StaticDiagram obj);

    @objid ("f9f63095-4eaa-45d1-b5c9-c9693a71b411")
    Object visitUseCaseDiagram(UseCaseDiagram obj);

    @objid ("ba180eb2-accb-4447-a1d2-62f5bc314d16")
    Object visitObjectDiagram(ObjectDiagram obj);

    @objid ("e69c1f27-f6cd-4e97-81a4-235cefd01de7")
    Object visitCompositeStructureDiagram(CompositeStructureDiagram obj);

    @objid ("9d8b5f50-5023-410a-8014-70ed22ae859d")
    Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj);

    @objid ("a781f6ea-a784-409a-aa24-427ad0cbf370")
    Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj);

    @objid ("0e45323b-2724-45e4-8baf-33c187537dfc")
    Object visitModuleParameter(ModuleParameter obj);

    @objid ("54fa8723-9f9e-4673-a819-81ffab0d42fd")
    Object visitModuleComponent(ModuleComponent obj);

    @objid ("f5b405f2-b8d3-4815-8745-5f45e82ae23e")
    Object visitProject(Project obj);

}
