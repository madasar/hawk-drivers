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

@objid ("00106c06-4f2c-1032-829a-001ec947cd2a")
public class AbstractModelVisitor implements IModelVisitor {
    @objid ("9e9211d0-b881-43db-ade3-8733c65b88ea")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        	return null;
    }

    @objid ("4ce6c4a0-eac1-4fe1-ad4b-387077cd0819")
    @Override
    public Object visitConstraint(Constraint obj) {
        	return null;
    }

    @objid ("be0d86c4-57e8-4b07-9977-fc357ce27335")
    @Override
    public Object visitDependency(Dependency obj) {
        	return null;
    }

    @objid ("4c462696-9d9c-4ea1-8a01-10e5c3ee789c")
    @Override
    public Object visitElement(Element obj) {
        	return null;
    }

    @objid ("6ea19327-a651-401a-a7ba-3ab9f851444d")
    @Override
    public Object visitModelElement(ModelElement obj) {
        	return null;
    }

    @objid ("2df31d3c-5e03-4445-8691-fa8351e43f3b")
    @Override
    public Object visitModelTree(ModelTree obj) {
        	return null;
    }

    @objid ("ca27798c-5582-4b11-8dde-83b8dea292ed")
    @Override
    public Object visitNote(Note obj) {
        	return null;
    }

    @objid ("d341428f-2eb0-4bec-b16f-100b84d0d0d7")
    @Override
    public Object visitNoteType(NoteType obj) {
        	return null;
    }

    @objid ("1e80055b-cc2e-4ba8-9102-719427bde8fc")
    @Override
    public Object visitProfile(Profile obj) {
        	return null;
    }

    @objid ("e6a676df-b625-4a2f-972d-92fd947d8fb0")
    @Override
    public Object visitStereotype(Stereotype obj) {
        	return null;
    }

    @objid ("7195c21b-747d-4788-9ff6-69a543c3bdf3")
    @Override
    public Object visitSubstitution(Substitution obj) {
        	return null;
    }

    @objid ("f3d81986-1363-4b8f-bed0-f096825788de")
    @Override
    public Object visitTagParameter(TagParameter obj) {
        	return null;
    }

    @objid ("76234298-adb9-4eb9-8e1b-36dd1fbf6aec")
    @Override
    public Object visitTagType(TagType obj) {
        	return null;
    }

    @objid ("bc5b0c60-a4c5-4f8a-9379-26d9d24b43e6")
    @Override
    public Object visitTaggedValue(TaggedValue obj) {
        	return null;
    }

    @objid ("001f7d4f-c7b9-42f7-8dc9-b090c5f99007")
    @Override
    public Object visitUsage(Usage obj) {
        	return null;
    }

    @objid ("580581c7-f283-49f6-b88a-55ac1a12fb6c")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        	return null;
    }

    @objid ("e6a151c1-58d8-49ab-988e-2a064ca40185")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        	return null;
    }

    @objid ("699d8f28-de43-4e0b-b3cd-147994c136a3")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        	return null;
    }

    @objid ("2ffdf0ac-4dfb-4db1-9164-fd6ff3cb02e1")
    @Override
    public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
        	return null;
    }

    @objid ("25529306-720b-4fdd-b2a5-cfccc90ebb36")
    @Override
    public Object visitLocalPropertyTable(LocalPropertyTable obj) {
        	return null;
    }

    @objid ("a444f67d-9e92-4bbb-a411-5a6128c39d5a")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition obj) {
        	return null;
    }

    @objid ("e97e7443-762a-4410-9d3e-088b07b2bf3d")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
        	return null;
    }

    @objid ("313c0c49-8bf1-43cc-b03b-01598072c2da")
    @Override
    public Object visitPropertyTable(PropertyTable obj) {
        	return null;
    }

    @objid ("115f6d2c-3389-4185-862a-923cf2874ce4")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
        	return null;
    }

    @objid ("8a8260e6-9c7f-47e7-86bb-ff8007051501")
    @Override
    public Object visitPropertyType(PropertyType obj) {
        	return null;
    }

    @objid ("245133c7-a6a4-4de9-a3b8-d25e6023db33")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable obj) {
        	return null;
    }

    @objid ("be1bb02d-0442-43f9-8183-eb22af68f7a4")
    @Override
    public Object visitMatrixDefinition(MatrixDefinition obj) {
        	return null;
    }

    @objid ("c6630037-b0b6-4379-a93b-39e48700de4e")
    @Override
    public Object visitQueryDefinition(QueryDefinition obj) {
        	return null;
    }

    @objid ("0c34f7f5-b85f-4207-9897-2b3eded63739")
    @Override
    public Object visitMatrixValueDefinition(MatrixValueDefinition obj) {
        	return null;
    }

    @objid ("2785d163-27e9-4482-823a-10067cecbbef")
    @Override
    public Object visitExternProcessor(ExternProcessor obj) {
        	return null;
    }

    @objid ("d8261cc0-e30c-416a-b6a3-e699460f016a")
    @Override
    public Object visitArtifact(Artifact obj) {
        	return null;
    }

    @objid ("aa79cb4c-59b6-4edb-bba5-20c1b45ee860")
    @Override
    public Object visitAssociationEnd(AssociationEnd obj) {
        	return null;
    }

    @objid ("51f039ee-9891-4d98-a46c-92c9c168fa0c")
    @Override
    public Object visitAttribute(Attribute obj) {
        	return null;
    }

    @objid ("2f18f2a0-c736-4c4b-a8ee-c406370434c6")
    @Override
    public Object visitAttributeLink(AttributeLink obj) {
        	return null;
    }

    @objid ("75bf8af4-8c37-4cdc-8874-7a4105909d40")
    @Override
    public Object visitBindableInstance(BindableInstance obj) {
        	return null;
    }

    @objid ("2618c21c-8258-4028-8bfa-f407f49a4667")
    @Override
    public Object visitBinding(Binding obj) {
        	return null;
    }

    @objid ("0bdf09d5-3bb3-4d30-9aac-b5270194e9e0")
    @Override
    public Object visitClass(Class obj) {
        	return null;
    }

    @objid ("e0e03363-050b-434c-98a9-93338f1dc08c")
    @Override
    public Object visitClassAssociation(ClassAssociation obj) {
        	return null;
    }

    @objid ("7ad7bc92-9f83-4295-8935-b55796d03b36")
    @Override
    public Object visitClassifier(Classifier obj) {
        	return null;
    }

    @objid ("ac75f74b-b7c8-4bd4-b410-061de88193f8")
    @Override
    public Object visitCollaboration(Collaboration obj) {
        	return null;
    }

    @objid ("67fc38a8-b447-4bbd-8309-0ca6f63f431e")
    @Override
    public Object visitCollaborationUse(CollaborationUse obj) {
        	return null;
    }

    @objid ("697b8376-161d-4edb-923a-93c92dcccbc8")
    @Override
    public Object visitComponent(Component obj) {
        	return null;
    }

    @objid ("83873d6d-551f-4823-8332-07cefdc8c1ff")
    @Override
    public Object visitComponentRealization(ComponentRealization obj) {
        	return null;
    }

    @objid ("f9bb8abf-9300-402a-8e62-4d93f7ec3fdc")
    @Override
    public Object visitNaryConnector(NaryConnector obj) {
        	return null;
    }

    @objid ("baffb1ac-15c3-47bc-8510-b783045673cd")
    @Override
    public Object visitConnectorEnd(ConnectorEnd obj) {
        	return null;
    }

    @objid ("dd19fad5-a647-4736-b90e-a3ccec4d4692")
    @Override
    public Object visitDataType(DataType obj) {
        	return null;
    }

    @objid ("bd09ad71-92c3-42bc-8d9b-7b83cfd9ed0b")
    @Override
    public Object visitElementImport(ElementImport obj) {
        	return null;
    }

    @objid ("ffb7cc23-9fbb-41a0-aba5-9f50663db05c")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        	return null;
    }

    @objid ("d0096907-5cdc-4be7-8135-cbe9bd141b48")
    @Override
    public Object visitEnumeration(Enumeration obj) {
        	return null;
    }

    @objid ("5de05754-c1ac-443e-b207-0ea8705fed75")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral obj) {
        	return null;
    }

    @objid ("2b1efb01-04c6-4aaf-8b62-22eaf32e1995")
    @Override
    public Object visitFeature(Feature obj) {
        	return null;
    }

    @objid ("46306589-1f95-40ca-8ef4-ce3c6a59f5af")
    @Override
    public Object visitGeneralClass(GeneralClass obj) {
        	return null;
    }

    @objid ("e3af54d5-ecf7-43a3-a463-bb124de4fd58")
    @Override
    public Object visitGeneralization(Generalization obj) {
        	return null;
    }

    @objid ("e62d7bb5-2163-4938-a9e2-2ca010b0e56c")
    @Override
    public Object visitInstance(Instance obj) {
        	return null;
    }

    @objid ("0c406aa7-96b3-4e44-89ce-33f04d2f6a97")
    @Override
    public Object visitInterface(Interface obj) {
        	return null;
    }

    @objid ("191203e0-4e1a-4211-9826-a80933359e6a")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization obj) {
        	return null;
    }

    @objid ("64bab6ad-9420-4aed-9cd3-34405132a627")
    @Override
    public Object visitLinkEnd(LinkEnd obj) {
        	return null;
    }

    @objid ("78d56d88-5e24-49e6-a90e-d336de9dec71")
    @Override
    public Object visitManifestation(Manifestation obj) {
        	return null;
    }

    @objid ("eb266bb0-7b53-4377-8c98-e76966bf3c73")
    @Override
    public Object visitNameSpace(NameSpace obj) {
        	return null;
    }

    @objid ("7ff2e92b-6580-4ac3-bff4-c70071c02ece")
    @Override
    public Object visitNamespaceUse(NamespaceUse obj) {
        	return null;
    }

    @objid ("8b38ccae-4a9e-4674-9a45-6ca9ec2cf655")
    @Override
    public Object visitNode(Node obj) {
        	return null;
    }

    @objid ("ad10b50f-bdbc-4867-b0ea-76453de22579")
    @Override
    public Object visitOperation(Operation obj) {
        	return null;
    }

    @objid ("b7898852-7735-4b26-a32b-9acb85eda90d")
    @Override
    public Object visitPackage(Package obj) {
        	return null;
    }

    @objid ("25456263-6848-41a7-8787-df7a4f416dd3")
    @Override
    public Object visitPackageImport(PackageImport obj) {
        	return null;
    }

    @objid ("8faaa267-e0ed-473c-8f44-699676ea7a0f")
    @Override
    public Object visitPackageMerge(PackageMerge obj) {
        	return null;
    }

    @objid ("939697d8-f6db-46b5-8ff7-8b437aa6e703")
    @Override
    public Object visitParameter(Parameter obj) {
        	return null;
    }

    @objid ("393541bf-2046-4bd2-b68d-8940cb103761")
    @Override
    public Object visitPort(Port obj) {
        	return null;
    }

    @objid ("de4a4cb1-af57-41ce-8a3f-5d02c12cf01e")
    @Override
    public Object visitProvidedInterface(ProvidedInterface obj) {
        	return null;
    }

    @objid ("ff8da952-04d9-4560-a35f-f3bff6784f74")
    @Override
    public Object visitRaisedException(RaisedException obj) {
        	return null;
    }

    @objid ("1907178a-cf17-4842-b899-8bd39aae5ec7")
    @Override
    public Object visitRequiredInterface(RequiredInterface obj) {
        	return null;
    }

    @objid ("89b6488f-b85d-47c4-b882-b445d25f2efc")
    @Override
    public Object visitTemplateBinding(TemplateBinding obj) {
        	return null;
    }

    @objid ("684f951e-2885-409e-99e4-10ce81408433")
    @Override
    public Object visitTemplateParameter(TemplateParameter obj) {
        	return null;
    }

    @objid ("d223a224-323e-4656-bf3b-ed3fdd8fa653")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
        	return null;
    }

    @objid ("f7dcf94a-5b0f-48ba-97f5-bb0a855d9db8")
    @Override
    public Object visitStructuralFeature(StructuralFeature obj) {
        	return null;
    }

    @objid ("64df6e53-b253-4998-ac87-eaf3c550a307")
    @Override
    public Object visitBehavioralFeature(BehavioralFeature obj) {
        	return null;
    }

    @objid ("d8af19d9-cb1b-4bac-9c09-70218349e878")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
        	return null;
    }

    @objid ("1c23cd47-c3de-4000-84d8-6a115b3a91df")
    @Override
    public Object visitNaryAssociation(NaryAssociation obj) {
        	return null;
    }

    @objid ("f868bed0-5190-451d-b014-0b62247527b3")
    @Override
    public Object visitNaryLink(NaryLink obj) {
        	return null;
    }

    @objid ("81df70fe-a726-4273-9d3e-b0a0dd638e4c")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd obj) {
        	return null;
    }

    @objid ("ffddfc02-537a-4d3b-aecc-20b5b6b5eddb")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
        	return null;
    }

    @objid ("1bf79a05-f2ee-4b1a-94f9-0dc7896def9b")
    @Override
    public Object visitAssociation(Association obj) {
        	return null;
    }

    @objid ("f6bf34f8-ac81-4763-aec4-80bf39937e40")
    @Override
    public Object visitLink(Link obj) {
        	return null;
    }

    @objid ("e096c727-4535-4029-bf0b-542fcd22311d")
    @Override
    public Object visitConnector(Connector obj) {
        	return null;
    }

    @objid ("8724f9d3-7baa-4554-b41d-1790f5d77008")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        	return null;
    }

    @objid ("1d8185f1-d4f6-4b25-9605-84df46ed1a34")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        	return null;
    }

    @objid ("23d28907-16c3-433c-8b99-e167c104514b")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        	return null;
    }

    @objid ("1b5d5881-bbd4-4f52-9e1b-ebc15dfbad80")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        	return null;
    }

    @objid ("d667e1dd-f8e4-4543-a69d-773d6812304d")
    @Override
    public Object visitActivity(Activity obj) {
        	return null;
    }

    @objid ("aeb23bd0-7e35-47c1-b192-61d877a58946")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        	return null;
    }

    @objid ("9c9e3f59-2337-4d87-8d59-c279e9b0272b")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        	return null;
    }

    @objid ("905014d2-f0b4-4e33-9e95-662b8dced6db")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        	return null;
    }

    @objid ("3625fdfd-6b52-437a-bf04-900590706c4b")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        	return null;
    }

    @objid ("1b4ab2c3-a438-431c-9e6f-50874cefe181")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        	return null;
    }

    @objid ("4e3d9c98-cfe4-42f5-a718-7d641c4488da")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        	return null;
    }

    @objid ("fdfb8fe2-1b2b-43e6-9b00-045331a1fe4e")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        	return null;
    }

    @objid ("47aa6b94-5a8c-4fa5-8b06-0ecb4b124af3")
    @Override
    public Object visitCallAction(CallAction obj) {
        	return null;
    }

    @objid ("c40fa86c-6321-4ae6-9b6e-e55703c3a5be")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        	return null;
    }

    @objid ("9eb82588-c162-4633-b0d6-23fc6fc7a9a1")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        	return null;
    }

    @objid ("b2b94f23-8d47-4b53-b6cf-a9c6a2dc932d")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        	return null;
    }

    @objid ("b483ac50-aa5f-4128-90b9-dcc1617eb2b4")
    @Override
    public Object visitClause(Clause obj) {
        	return null;
    }

    @objid ("ace26ebe-795a-4863-bd03-caa997c4f8ab")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        	return null;
    }

    @objid ("139a9df7-16a4-4949-9ab3-fa7e14bcecc3")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        	return null;
    }

    @objid ("061f17e2-36e9-4742-97fd-3b9798a77e7b")
    @Override
    public Object visitControlNode(ControlNode obj) {
        	return null;
    }

    @objid ("c33157af-3ca7-463a-8013-d75eb0be4125")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        	return null;
    }

    @objid ("24ac8cb1-7f62-4ca1-998f-4ffe81d1c1b8")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        	return null;
    }

    @objid ("040caf06-19b5-4c76-a304-e3c3351af22f")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        	return null;
    }

    @objid ("090db197-adeb-42f9-b8e6-b9b14568faa5")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        	return null;
    }

    @objid ("65de83e1-ad1e-4230-9b24-1213f01a10ef")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        	return null;
    }

    @objid ("49f24ba6-a921-4831-9064-48405fcaedac")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        	return null;
    }

    @objid ("cd581057-a73d-4067-974f-2e3f63af411c")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        	return null;
    }

    @objid ("bb1c3c44-0114-463d-a736-5996743a7200")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        	return null;
    }

    @objid ("b6894ad5-4cf9-4a3b-855c-a613be6b831a")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        	return null;
    }

    @objid ("f9fee81b-cf08-41e2-8eb7-4e27d9aaead3")
    @Override
    public Object visitInputPin(InputPin obj) {
        	return null;
    }

    @objid ("49143d6c-c59f-4b8d-bf97-ab5cc8e5c189")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        	return null;
    }

    @objid ("d7ef2a52-1122-4546-8e62-ebc14116df95")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        	return null;
    }

    @objid ("c593ce23-e2f9-4cfd-b91e-d6dea024d32b")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        	return null;
    }

    @objid ("cd18a37f-2921-4b4b-a3a5-f97b3eab359f")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        	return null;
    }

    @objid ("130a0b6c-e342-410c-a92a-1e893f05e58e")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        	return null;
    }

    @objid ("47cc1a25-5227-4c3b-9ee4-2a512d4aead6")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        	return null;
    }

    @objid ("ad9fc589-9f2d-4eaa-b261-4338c7841723")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        	return null;
    }

    @objid ("b2f8ead9-74ab-48b6-a4e9-0b29153a7c9e")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        	return null;
    }

    @objid ("b06fee02-c372-4706-9939-8110654e9abd")
    @Override
    public Object visitPin(Pin obj) {
        	return null;
    }

    @objid ("d0773184-661f-4504-9509-52b18155781c")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        	return null;
    }

    @objid ("9fb53d86-b614-45ad-bc87-19b435b4993b")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        	return null;
    }

    @objid ("0f31e58d-6d87-4427-b976-4f7473aac7bf")
    @Override
    public Object visitValuePin(ValuePin obj) {
        	return null;
    }

    @objid ("b9fb80da-18a1-43b0-9a0a-3a07db32961a")
    @Override
    public Object visitBehavior(Behavior obj) {
        	return null;
    }

    @objid ("54fb5a28-5e7d-46b0-bce0-3ec5fdd92f9a")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        	return null;
    }

    @objid ("e86126a1-aad0-4256-8f85-4c4765535da5")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        	return null;
    }

    @objid ("222dd008-5bd8-4dfe-9d34-2be130b4f106")
    @Override
    public Object visitSignal(Signal obj) {
        	return null;
    }

    @objid ("38e67aba-00e2-4e61-8f12-505c47d1f210")
    @Override
    public Object visitEvent(Event obj) {
        	return null;
    }

    @objid ("0acb4752-5468-4acc-ba85-06b90d5dae07")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        	return null;
    }

    @objid ("200de1d8-5a77-4e02-ac58-25e5c6f071bb")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        	return null;
    }

    @objid ("be1dfaed-34d4-4282-ad24-d0c512636ef1")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        	return null;
    }

    @objid ("02f65127-6eec-49eb-ba05-c5fa58f18736")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        	return null;
    }

    @objid ("857d3154-4363-4338-8738-deb35475cf00")
    @Override
    public Object visitGate(Gate obj) {
        	return null;
    }

    @objid ("8993506f-7749-45fd-8ecb-06c797aaf014")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        	return null;
    }

    @objid ("b8b96cba-8e4a-489c-8ec2-19c0416dfa46")
    @Override
    public Object visitInteraction(Interaction obj) {
        	return null;
    }

    @objid ("d42cdef8-4d74-4f2b-87bf-6b239e3c4d7f")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        	return null;
    }

    @objid ("a5ff712f-88c8-4215-9fbb-63f2a683188a")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        	return null;
    }

    @objid ("63d1fd2d-a431-4ff3-be16-03d41e8e38ba")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        	return null;
    }

    @objid ("42ae31d0-45fb-4bc5-9509-2187d60be232")
    @Override
    public Object visitLifeline(Lifeline obj) {
        	return null;
    }

    @objid ("69dc1180-d9ee-4f9c-9df0-c943a9a861c2")
    @Override
    public Object visitMessage(Message obj) {
        	return null;
    }

    @objid ("88cd9e02-305f-49e6-a6e1-3a01a0986039")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        	return null;
    }

    @objid ("338bda53-7edd-4f37-abd5-b3760a3ce34b")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        	return null;
    }

    @objid ("a2515a5c-7329-483c-9736-3b4fcdedc10b")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        	return null;
    }

    @objid ("bd01d0c5-1eff-433f-b037-5e7dca1ef129")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        	return null;
    }

    @objid ("7c94f1ce-0b4c-41e8-8650-97a1456761b4")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        	return null;
    }

    @objid ("4f2e6f99-19e5-407e-acd5-4b187e418ef8")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        	return null;
    }

    @objid ("240c1889-55a4-4b89-92e6-c0215e995433")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        	return null;
    }

    @objid ("d4665fa8-2bdc-471b-870a-532c6c02c193")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        	return null;
    }

    @objid ("7a0d3a45-7b07-4908-9bb9-54870ba69bac")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        	return null;
    }

    @objid ("9d4d0557-4a0f-4e96-9bcc-3d4bfa2523d3")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        	return null;
    }

    @objid ("d9d40d85-a84a-4684-8f4d-c716515c2367")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        	return null;
    }

    @objid ("05433424-ac73-4787-a285-859f90ff5272")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        	return null;
    }

    @objid ("0fa154af-4eb0-4490-9ec4-88e946121f5a")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        	return null;
    }

    @objid ("fcb7128c-6c98-455d-af92-720bb01d79b5")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        	return null;
    }

    @objid ("7cd28614-e53b-4305-9ea1-d6c2c57b9b5d")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        	return null;
    }

    @objid ("7ad5b908-0b9a-4b75-b76d-b2c2b0bd0074")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        	return null;
    }

    @objid ("0611b8c2-cd25-49b8-8cef-372dda9a30a6")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        	return null;
    }

    @objid ("316b2719-b636-49c3-9807-e7bda061b645")
    @Override
    public Object visitState(State obj) {
        	return null;
    }

    @objid ("9e6eee66-51be-4e2a-a9c4-429c5020946c")
    @Override
    public Object visitStateMachine(StateMachine obj) {
        	return null;
    }

    @objid ("0ae969d3-cfbb-4afc-8071-8a307919b00d")
    @Override
    public Object visitStateVertex(StateVertex obj) {
        	return null;
    }

    @objid ("c40437d5-7d40-43ab-9fea-273471b63539")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        	return null;
    }

    @objid ("eaaf1543-4f88-4d68-9197-c0011428d450")
    @Override
    public Object visitTransition(Transition obj) {
        	return null;
    }

    @objid ("2a66d80a-0bd7-4cad-8a3f-cf2db6210ad3")
    @Override
    public Object visitFinalState(FinalState obj) {
        	return null;
    }

    @objid ("b2f8f9a4-0797-4d06-ab87-9c032908a134")
    @Override
    public Object visitRegion(Region obj) {
        	return null;
    }

    @objid ("3a39c43a-5d53-478e-b436-12537460a07d")
    @Override
    public Object visitActor(Actor obj) {
        	return null;
    }

    @objid ("e3cc1757-4357-4801-b4d7-c8c48adc029a")
    @Override
    public Object visitUseCase(UseCase obj) {
        	return null;
    }

    @objid ("74e1f3f4-d738-4f64-8155-08f83b7ac00b")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency obj) {
        	return null;
    }

    @objid ("acad0871-c282-494b-9f43-d57b326b6f26")
    @Override
    public Object visitExtensionPoint(ExtensionPoint obj) {
        	return null;
    }

    @objid ("c4e33f73-e360-465d-a3f4-ffa43d0d1fc6")
    @Override
    public Object visitAnalystItem(AnalystItem obj) {
        	return null;
    }

    @objid ("105b4128-f704-4e50-979f-a9654ae945c2")
    @Override
    public Object visitAnalystElement(AnalystElement obj) {
        	return null;
    }

    @objid ("86deaadf-4e7d-4b9a-a18b-72dfe7bd280d")
    @Override
    public Object visitAnalystContainer(AnalystContainer obj) {
        	return null;
    }

    @objid ("5136e9c3-afea-451e-b4e5-11df48e92706")
    @Override
    public Object visitAnalystProject(AnalystProject obj) {
        	return null;
    }

    @objid ("711fc6b0-2ef1-4bf1-8b35-06cb87e504b5")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable obj) {
        	return null;
    }

    @objid ("f9b43d08-5828-446f-b70f-7ee67bdebe49")
    @Override
    public Object visitBusinessRule(BusinessRule obj) {
        	return null;
    }

    @objid ("642af823-e12a-4eae-a094-136e74c3fbde")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer obj) {
        	return null;
    }

    @objid ("dda5c73d-baf6-4155-a8a1-a1bd68878ca8")
    @Override
    public Object visitDictionary(Dictionary obj) {
        	return null;
    }

    @objid ("b8493508-e37e-49c8-a7ce-3dafdaa60130")
    @Override
    public Object visitGoal(Goal obj) {
        	return null;
    }

    @objid ("30ce986f-a1cc-4199-b938-d2a64d5a8228")
    @Override
    public Object visitGoalContainer(GoalContainer obj) {
        	return null;
    }

    @objid ("bc8fd4bd-59ce-4f36-9214-0b05fcf3a3c3")
    @Override
    public Object visitPropertyContainer(PropertyContainer obj) {
        	return null;
    }

    @objid ("e9b0d484-54fe-4ead-a3b2-2c50c92cef06")
    @Override
    public Object visitRequirement(Requirement obj) {
        	return null;
    }

    @objid ("3e2c169e-8a59-4b0b-8026-6429112796fd")
    @Override
    public Object visitRequirementContainer(RequirementContainer obj) {
        	return null;
    }

    @objid ("e3c0169a-45ac-4bc9-917f-7a10d0cf80bb")
    @Override
    public Object visitTerm(Term obj) {
        	return null;
    }

    @objid ("6461a137-2061-4326-821d-7ea9730fd3fc")
    @Override
    public Object visitGenericAnalystContainer(GenericAnalystContainer obj) {
        	return null;
    }

    @objid ("9b7cb530-a3c8-4825-b550-8172f4234a37")
    @Override
    public Object visitGenericAnalystElement(GenericAnalystElement obj) {
        	return null;
    }

    @objid ("da177883-6a5a-4777-bafe-42d4d0f62b06")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        	return null;
    }

    @objid ("3f11d034-9a0b-4e68-be06-a82455ed7f4a")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        	return null;
    }

    @objid ("093d1881-e2f8-400b-bd87-a485453ad71a")
    @Override
    public Object visitDataFlow(DataFlow obj) {
        	return null;
    }

    @objid ("6d657679-885d-4a81-b707-ae7597b2a6a8")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        	return null;
    }

    @objid ("18eb1344-db08-4c1a-aec3-72e233282961")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        	return null;
    }

    @objid ("ea48ab33-2cc4-47f6-93aa-09cbe5d9f595")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        	return null;
    }

    @objid ("8bedef17-fbbd-478b-bb87-a18aa0e1e612")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        	return null;
    }

    @objid ("e5ca29c8-4aa7-4171-a77e-b4afa5877ddc")
    @Override
    public Object visitBpmnCollaboration(BpmnCollaboration obj) {
        	return null;
    }

    @objid ("8394d11b-7f27-4b82-8420-83ee3c6c5775")
    @Override
    public Object visitBpmnLane(BpmnLane obj) {
        	return null;
    }

    @objid ("ff433854-87b7-4aab-9a80-ebd27867b954")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet obj) {
        	return null;
    }

    @objid ("60a37caf-1c0a-4697-9460-7b7aa9300db7")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant obj) {
        	return null;
    }

    @objid ("d4d3ae99-cfef-4486-9a85-77cade976688")
    @Override
    public Object visitBpmnProcess(BpmnProcess obj) {
        	return null;
    }

    @objid ("52d71bf2-384c-4cfe-a78c-34fa09c89698")
    @Override
    public Object visitBpmnAssociation(BpmnAssociation obj) {
        	return null;
    }

    @objid ("d4805643-bf92-487e-b3e0-5fe23d6434c0")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement obj) {
        	return null;
    }

    @objid ("1f6975ec-4a6d-473a-9243-7e2c5e1ea716")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact obj) {
        	return null;
    }

    @objid ("21f5204a-bf8f-42fb-898b-3c0546937d1f")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement obj) {
        	return null;
    }

    @objid ("15ad71f3-fb27-4a77-9934-ba15b0640820")
    @Override
    public Object visitBpmnFlowNode(BpmnFlowNode obj) {
        	return null;
    }

    @objid ("de36c7de-7e9d-49f3-b88b-055490b78a84")
    @Override
    public Object visitBpmnGroup(BpmnGroup obj) {
        	return null;
    }

    @objid ("8876ff78-9161-413b-9f47-9a3bc4298c66")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement obj) {
        	return null;
    }

    @objid ("9de0e35d-bfe0-4866-a5dc-fe48d297d655")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior obj) {
        	return null;
    }

    @objid ("e823dc0f-eca9-4140-a170-2622d6f12de9")
    @Override
    public Object visitBpmnMessage(BpmnMessage obj) {
        	return null;
    }

    @objid ("c4f31b14-66b9-4d6e-86e9-a9d01586744e")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
        	return null;
    }

    @objid ("50f7666a-7223-4c18-b861-8e14ee9c9cfc")
    @Override
    public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
        	return null;
    }

    @objid ("9a47790c-cf93-4e1b-a46b-c034a54ecb49")
    @Override
    public Object visitBpmnActivity(BpmnActivity obj) {
        	return null;
    }

    @objid ("12ce30a0-fa0e-4374-a014-515149afe656")
    @Override
    public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
        	return null;
    }

    @objid ("08e297b3-25c9-4ed6-b45f-72f147b03d75")
    @Override
    public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
        	return null;
    }

    @objid ("6cf2e6ec-5cab-4611-8a0a-42ba8cee9a7d")
    @Override
    public Object visitBpmnCallActivity(BpmnCallActivity obj) {
        	return null;
    }

    @objid ("f4639204-1d57-4e08-a2b7-996775cd8db4")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
        	return null;
    }

    @objid ("aa3369f9-63ab-4ecf-b1f2-c47f4042b147")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
        	return null;
    }

    @objid ("f422b3ef-ce92-4231-b058-07dcb0fc18b3")
    @Override
    public Object visitBpmnManualTask(BpmnManualTask obj) {
        	return null;
    }

    @objid ("3e4d8c71-01b4-4917-bed7-935b4d09195a")
    @Override
    public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
        	return null;
    }

    @objid ("920712de-289e-4431-b148-897ff851b778")
    @Override
    public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
        	return null;
    }

    @objid ("3c2901f7-8732-4d15-a83d-a5361658272a")
    @Override
    public Object visitBpmnScriptTask(BpmnScriptTask obj) {
        	return null;
    }

    @objid ("b5cc148d-6cb5-44b1-8013-5fafb614bd99")
    @Override
    public Object visitBpmnSendTask(BpmnSendTask obj) {
        	return null;
    }

    @objid ("8af56684-8a0c-4923-9f7f-0101ede3f7fd")
    @Override
    public Object visitBpmnServiceTask(BpmnServiceTask obj) {
        	return null;
    }

    @objid ("0f4c3b9a-254e-4c15-8501-8ef2147ebc78")
    @Override
    public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
        	return null;
    }

    @objid ("338ca0d4-c406-4619-9ca3-e266252d5b22")
    @Override
    public Object visitBpmnSubProcess(BpmnSubProcess obj) {
        	return null;
    }

    @objid ("13ce69d6-e859-40b2-b6aa-42e8477a553d")
    @Override
    public Object visitBpmnTask(BpmnTask obj) {
        	return null;
    }

    @objid ("30bd4ddc-8ac1-4346-ad49-bd8e23a967a2")
    @Override
    public Object visitBpmnTransaction(BpmnTransaction obj) {
        	return null;
    }

    @objid ("b8da91e3-2278-4f85-a645-fe965182ad46")
    @Override
    public Object visitBpmnUserTask(BpmnUserTask obj) {
        	return null;
    }

    @objid ("8963d8d9-fb04-4f59-80a2-c1da8e0d39b4")
    @Override
    public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
        	return null;
    }

    @objid ("714ce131-e9ba-4952-bbfc-c59f9ea0cdbf")
    @Override
    public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
        	return null;
    }

    @objid ("c4515ff0-a8d8-4a55-a79a-1b806e1ebb71")
    @Override
    public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
        	return null;
    }

    @objid ("3ae8f862-7c04-4243-9fe6-2a09d3b7357d")
    @Override
    public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
        	return null;
    }

    @objid ("53801d12-3dea-4dc5-8529-c25638acdee2")
    @Override
    public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
        	return null;
    }

    @objid ("767195af-f922-44a3-8152-71d185646252")
    @Override
    public Object visitBpmnEndEvent(BpmnEndEvent obj) {
        	return null;
    }

    @objid ("5e62f4b2-8951-493f-8acc-9ff92a0a527d")
    @Override
    public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
        	return null;
    }

    @objid ("4bbd3cdd-8dee-4dd9-9545-f000d82dabd1")
    @Override
    public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
        	return null;
    }

    @objid ("386ebf1d-c8b4-4e4b-8f77-108f13dee689")
    @Override
    public Object visitBpmnEvent(BpmnEvent obj) {
        	return null;
    }

    @objid ("6b21f5f5-f8f7-4221-a116-e8b0d848019b")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
        	return null;
    }

    @objid ("c920c523-45fc-4290-949f-8a488a59c874")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
        	return null;
    }

    @objid ("34d7108e-86ee-4902-9d64-f262b95a1389")
    @Override
    public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
        	return null;
    }

    @objid ("5bdf1cda-d4ef-4b9f-8832-928c7617360d")
    @Override
    public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
        	return null;
    }

    @objid ("c664e084-1ffb-40f1-8640-e66661b48c85")
    @Override
    public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
        	return null;
    }

    @objid ("d2e099da-66e1-4950-ac75-2bb606d5309a")
    @Override
    public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
        	return null;
    }

    @objid ("19514497-586f-4835-a790-817a4561d00a")
    @Override
    public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
        	return null;
    }

    @objid ("0ab1def7-d93a-4439-b772-b9d0bae9236b")
    @Override
    public Object visitBpmnStartEvent(BpmnStartEvent obj) {
        	return null;
    }

    @objid ("33007a9a-4518-45e9-9fc6-94e41bc397a4")
    @Override
    public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
        	return null;
    }

    @objid ("6cffea9d-8ce3-4bb1-8b0f-2de9a6deab66")
    @Override
    public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
        	return null;
    }

    @objid ("faaadb87-78d7-49d1-9f6e-965b6ec41bda")
    @Override
    public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
        	return null;
    }

    @objid ("943392fb-793f-4fc5-981e-b99ed484126a")
    @Override
    public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
        	return null;
    }

    @objid ("4d47b449-84d5-4d04-ad56-c08b52e09eaf")
    @Override
    public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
        	return null;
    }

    @objid ("54c59940-cacb-4495-83e0-8a77fc7f8b43")
    @Override
    public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
        	return null;
    }

    @objid ("5c5abafe-3578-4618-bfa2-d0bc2fbc1b9b")
    @Override
    public Object visitBpmnGateway(BpmnGateway obj) {
        	return null;
    }

    @objid ("450e3193-0e48-40e7-97ba-1322df9a0a81")
    @Override
    public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
        	return null;
    }

    @objid ("0eeac79a-c0bb-4ced-880a-be0bb4ac96b0")
    @Override
    public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
        	return null;
    }

    @objid ("80b3f5fb-5d2f-47a3-938c-83c7a7f01691")
    @Override
    public Object visitBpmnDataObject(BpmnDataObject obj) {
        	return null;
    }

    @objid ("48364030-a6d2-4074-b95d-1d5be831a7f2")
    @Override
    public Object visitBpmnDataStore(BpmnDataStore obj) {
        	return null;
    }

    @objid ("1784bf54-082e-497b-bd80-cd82b45a8293")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
        	return null;
    }

    @objid ("d67d9395-5dc8-49c0-a85f-a6e72f3a8eef")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
        	return null;
    }

    @objid ("9a9d4fe1-3f00-4327-8cbd-8d22fab96d06")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput obj) {
        	return null;
    }

    @objid ("3aafe6de-ce40-4e97-815c-99f2bbcff981")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput obj) {
        	return null;
    }

    @objid ("f5040699-56ba-46da-9cdd-4e91b6be6ee7")
    @Override
    public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
        	return null;
    }

    @objid ("366d14c0-e00c-48b0-9873-e576b0dbc578")
    @Override
    public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
        	return null;
    }

    @objid ("b2736110-3685-4db8-bfe0-5f6d71a994a4")
    @Override
    public Object visitBpmnDataState(BpmnDataState obj) {
        	return null;
    }

    @objid ("7801cde5-c02d-4228-b834-cb6febb51cb8")
    @Override
    public Object visitBpmnResource(BpmnResource obj) {
        	return null;
    }

    @objid ("32d95a15-2c72-4c56-b7eb-f67b63ad13be")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
        	return null;
    }

    @objid ("2defd3bc-1e96-48e8-be9a-71b59f78671e")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole obj) {
        	return null;
    }

    @objid ("9838ea88-ef1c-41b1-baf1-15b97c1ef4c9")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
        	return null;
    }

    @objid ("1c5eff62-1dd8-4bdd-a22c-cae4eddd9be9")
    @Override
    public Object visitBpmnOperation(BpmnOperation obj) {
        	return null;
    }

    @objid ("c904fa01-7b19-47d5-bd4d-251aeee9ee8f")
    @Override
    public Object visitBpmnInterface(BpmnInterface obj) {
        	return null;
    }

    @objid ("626ac2e2-eea8-471d-a9b6-adcf97b4161f")
    @Override
    public Object visitBpmnEndPoint(BpmnEndPoint obj) {
        	return null;
    }

    @objid ("ddfa91d2-4113-44f6-af7e-5d1a243d0818")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram obj) {
        	return null;
    }

    @objid ("e38f2ee7-256b-4a31-a9f9-a1fcc142fbc8")
    @Override
    public Object visitActivityDiagram(ActivityDiagram obj) {
        	return null;
    }

    @objid ("02b8d98f-7ee1-4b95-8e0c-532ee82ab434")
    @Override
    public Object visitBehaviorDiagram(BehaviorDiagram obj) {
        	return null;
    }

    @objid ("705f2c45-b0aa-4b79-952a-46a048f1b8dc")
    @Override
    public Object visitClassDiagram(ClassDiagram obj) {
        	return null;
    }

    @objid ("08f51105-d667-41db-83a9-e765861743c9")
    @Override
    public Object visitCommunicationDiagram(CommunicationDiagram obj) {
        	return null;
    }

    @objid ("42380f76-7647-4264-9fa6-66ba1d0c1756")
    @Override
    public Object visitDeploymentDiagram(DeploymentDiagram obj) {
        	return null;
    }

    @objid ("f2a48871-f34d-4290-95cf-612f7a2cd0ff")
    @Override
    public Object visitDiagramSet(DiagramSet obj) {
        	return null;
    }

    @objid ("8eee7928-93b6-42e4-a580-435b6c3d5ae6")
    @Override
    public Object visitSequenceDiagram(SequenceDiagram obj) {
        	return null;
    }

    @objid ("a20eeef3-ace2-4b93-a082-f16380fc3f23")
    @Override
    public Object visitStateMachineDiagram(StateMachineDiagram obj) {
        	return null;
    }

    @objid ("b583e7e3-3f6e-40fb-b4a1-94d9d7de41fc")
    @Override
    public Object visitStaticDiagram(StaticDiagram obj) {
        	return null;
    }

    @objid ("670371ea-0e45-4acf-a04d-29f74ec83755")
    @Override
    public Object visitUseCaseDiagram(UseCaseDiagram obj) {
        	return null;
    }

    @objid ("a3a5d0bf-88e1-47b4-af0b-64567d388213")
    @Override
    public Object visitObjectDiagram(ObjectDiagram obj) {
        	return null;
    }

    @objid ("4ad980e5-ef1b-449e-8f13-3b22497464eb")
    @Override
    public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
        	return null;
    }

    @objid ("b4927f36-217c-4bd6-8eef-79f3895a11ef")
    @Override
    public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
        	return null;
    }

    @objid ("65ec1402-7162-44a6-9cdd-13bf3f3590eb")
    @Override
    public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
        	return null;
    }

    @objid ("e9fd86a4-2699-4223-a01c-c33300fa42cb")
    @Override
    public Object visitModuleParameter(ModuleParameter obj) {
        	return null;
    }

    @objid ("1695c0e2-b2cb-4e09-9150-5e9c226b5027")
    @Override
    public Object visitModuleComponent(ModuleComponent obj) {
        	return null;
    }

    @objid ("bbd0b951-7915-40c3-ab86-f420ef7617e3")
    @Override
    public Object visitProject(Project obj) {
        	return null;
    }

}
