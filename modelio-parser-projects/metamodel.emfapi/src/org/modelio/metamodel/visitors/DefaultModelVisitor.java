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

@objid ("00280eec-4f2c-1032-829a-001ec947cd2a")
public class DefaultModelVisitor implements IModelVisitor {
    @objid ("d52c413d-6889-4a20-a944-67a57934b322")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        	return visitDependency(obj);
    }

    @objid ("6f47854a-8b16-4642-ba0f-cd5e7cb4f5df")
    @Override
    public Object visitConstraint(Constraint obj) {
        	return visitModelElement(obj);
    }

    @objid ("5266c11c-b027-48bc-b077-7ff53798eb2f")
    @Override
    public Object visitDependency(Dependency obj) {
        	return visitModelElement(obj);
    }

    @objid ("906d5b76-e5da-4e74-94da-487f705cd543")
    @Override
    public Object visitElement(Element obj) {
        	return null;
    }

    @objid ("d49fee11-2c9d-4549-a1cc-283df1dc513a")
    @Override
    public Object visitModelElement(ModelElement obj) {
        	return visitElement(obj);
    }

    @objid ("a741d821-84e2-4308-9e83-f528af4b6077")
    @Override
    public Object visitModelTree(ModelTree obj) {
        	return visitModelElement(obj);
    }

    @objid ("b764d3cc-3fe9-4841-b718-e5db70bebce5")
    @Override
    public Object visitNote(Note obj) {
        	return visitModelElement(obj);
    }

    @objid ("b1c714d1-af25-4e7a-9a2e-ca1cc62783d3")
    @Override
    public Object visitNoteType(NoteType obj) {
        	return visitModelElement(obj);
    }

    @objid ("9b65386d-ebbd-4cae-b792-ba6ebfe0ae35")
    @Override
    public Object visitProfile(Profile obj) {
        	return visitPackage(obj);
    }

    @objid ("31779c46-94e1-4e7a-9846-93822f2122f1")
    @Override
    public Object visitStereotype(Stereotype obj) {
        	return visitModelElement(obj);
    }

    @objid ("95d258bb-05a4-441d-9037-15902ef50c89")
    @Override
    public Object visitSubstitution(Substitution obj) {
        	return visitModelElement(obj);
    }

    @objid ("8cedcb0d-63f8-450c-98ec-69e793a398d8")
    @Override
    public Object visitTagParameter(TagParameter obj) {
        	return visitElement(obj);
    }

    @objid ("2feff6e3-987d-4660-959e-bae003bf1d6d")
    @Override
    public Object visitTagType(TagType obj) {
        	return visitModelElement(obj);
    }

    @objid ("b0f8d2c9-4e93-4fd8-a5d1-71a61e8bd8c4")
    @Override
    public Object visitTaggedValue(TaggedValue obj) {
        	return visitModelElement(obj);
    }

    @objid ("dff2183f-cb9d-42d1-959d-0c45597b80b9")
    @Override
    public Object visitUsage(Usage obj) {
        	return visitDependency(obj);
    }

    @objid ("50f78448-f661-40b6-b467-aab1e3b129ba")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        	return visitElement(obj);
    }

    @objid ("9d646131-4284-43a6-b271-debfdcf78afe")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        	return visitModelElement(obj);
    }

    @objid ("b23b2ce2-fa4f-4e62-a88f-202b53b19c67")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        	return visitModelElement(obj);
    }

    @objid ("d3514661-517e-44b1-be84-38402d602ec7")
    @Override
    public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
        	return visitPropertyType(obj);
    }

    @objid ("1acb42de-4840-47ff-bdb0-af3abbeef11b")
    @Override
    public Object visitLocalPropertyTable(LocalPropertyTable obj) {
        	return visitPropertyTable(obj);
    }

    @objid ("fa979103-5e87-4b28-88e3-9dbba0c37ead")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("391703b3-b903-411f-be64-ffabe7b8ed40")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
        	return visitModelElement(obj);
    }

    @objid ("a2814e4f-fdf4-4bdc-a1d9-7a88f17f70a5")
    @Override
    public Object visitPropertyTable(PropertyTable obj) {
        	return visitElement(obj);
    }

    @objid ("c21ab480-39a2-45ea-b142-3ea6d77d93b4")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("78cda3f7-f7cc-40aa-a19a-1afc5b894c10")
    @Override
    public Object visitPropertyType(PropertyType obj) {
        	return visitModelElement(obj);
    }

    @objid ("00acc8e6-dd0e-49ef-a46e-5fe405f18df0")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable obj) {
        	return visitPropertyTable(obj);
    }

    @objid ("60e0235c-7fa6-4e2a-a47e-c72c7fc53c17")
    @Override
    public Object visitMatrixDefinition(MatrixDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("1715877c-7269-485b-990d-688150af7b49")
    @Override
    public Object visitQueryDefinition(QueryDefinition obj) {
        	return visitElement(obj);
    }

    @objid ("c68cdfba-68bc-45f5-9ef7-d5beccc7ab72")
    @Override
    public Object visitMatrixValueDefinition(MatrixValueDefinition obj) {
        	return visitElement(obj);
    }

    @objid ("40ba7824-10ce-4e15-ba8a-83596a6faee0")
    @Override
    public Object visitExternProcessor(ExternProcessor obj) {
        	return visitModelElement(obj);
    }

    @objid ("5130d3c7-4eef-4b75-bdb7-9ae43d8df8a7")
    @Override
    public Object visitArtifact(Artifact obj) {
        	return visitClassifier(obj);
    }

    @objid ("c61cb57a-a62b-4d39-942e-3c462975798c")
    @Override
    public Object visitAssociationEnd(AssociationEnd obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("bd9cce6a-a94c-4369-aa45-6c2701462aa1")
    @Override
    public Object visitAttribute(Attribute obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("09bd70d6-a6c3-4c5f-9a4c-ca6938a180a5")
    @Override
    public Object visitAttributeLink(AttributeLink obj) {
        	return visitModelElement(obj);
    }

    @objid ("a1a798e8-77b2-4182-b0fd-c54b625b666a")
    @Override
    public Object visitBindableInstance(BindableInstance obj) {
        	return visitInstance(obj);
    }

    @objid ("89ed620f-0c32-4c2c-ad0f-9ece1c13013b")
    @Override
    public Object visitBinding(Binding obj) {
        	return visitModelElement(obj);
    }

    @objid ("8f90ea29-ceea-4fdf-8bcb-311354f689af")
    @Override
    public Object visitClass(Class obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("f4c6dee3-48d3-4bb3-93c7-5cee5ee229c3")
    @Override
    public Object visitClassAssociation(ClassAssociation obj) {
        	return visitModelElement(obj);
    }

    @objid ("e71134ca-fb0f-49f7-9bf7-5d872aca706a")
    @Override
    public Object visitClassifier(Classifier obj) {
        	return visitNameSpace(obj);
    }

    @objid ("913dc9a6-f305-4b36-86b9-33f51cb90a2e")
    @Override
    public Object visitCollaboration(Collaboration obj) {
        	return visitNameSpace(obj);
    }

    @objid ("447e87bf-382f-412c-aa85-c22926430189")
    @Override
    public Object visitCollaborationUse(CollaborationUse obj) {
        	return visitModelElement(obj);
    }

    @objid ("bb79ec5c-5d75-4164-b8e8-55c76fdab6e4")
    @Override
    public Object visitComponent(Component obj) {
        	return visitClass(obj);
    }

    @objid ("a52d4eb7-1216-412a-8cb2-22a0c6aa6d61")
    @Override
    public Object visitComponentRealization(ComponentRealization obj) {
        	return visitModelElement(obj);
    }

    @objid ("9a86378a-7613-414c-894d-0a2c01a87f4a")
    @Override
    public Object visitNaryConnector(NaryConnector obj) {
        	return visitNaryLink(obj);
    }

    @objid ("fa1f80e7-73a5-40a1-a921-1ebde8e27088")
    @Override
    public Object visitConnectorEnd(ConnectorEnd obj) {
        	return visitLinkEnd(obj);
    }

    @objid ("e1a0e527-bd3d-405e-a495-d93bf59a103e")
    @Override
    public Object visitDataType(DataType obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("d853fd48-7c77-42db-85a9-44681ad810a3")
    @Override
    public Object visitElementImport(ElementImport obj) {
        	return visitModelElement(obj);
    }

    @objid ("f75a2bf5-a0b3-43d3-839d-fd8c034ba2c3")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        	return visitAbstraction(obj);
    }

    @objid ("86a58355-415f-4baa-93da-f369f0fc1c1a")
    @Override
    public Object visitEnumeration(Enumeration obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("f2136b0f-ff54-4ffa-8fac-12549b79f8e6")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral obj) {
        	return visitModelElement(obj);
    }

    @objid ("3f0b3314-81a3-43ac-ba59-a7278d470a72")
    @Override
    public Object visitFeature(Feature obj) {
        	return visitModelElement(obj);
    }

    @objid ("fa189b99-1424-419f-9d8c-a6dd425e796f")
    @Override
    public Object visitGeneralClass(GeneralClass obj) {
        	return visitClassifier(obj);
    }

    @objid ("9f7b7313-a0ec-45a0-9a7d-f1f6cf809f77")
    @Override
    public Object visitGeneralization(Generalization obj) {
        	return visitModelElement(obj);
    }

    @objid ("622b0383-3916-498a-9dfc-5b59de22915c")
    @Override
    public Object visitInstance(Instance obj) {
        	return visitModelElement(obj);
    }

    @objid ("5ba6fa9a-697c-41bd-a79a-837100c2e75f")
    @Override
    public Object visitInterface(Interface obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("211314a4-30ca-4a80-9adf-399b3cf42b9d")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization obj) {
        	return visitModelElement(obj);
    }

    @objid ("a6590538-8d5a-4cb6-9a17-b7fff91b5277")
    @Override
    public Object visitLinkEnd(LinkEnd obj) {
        	return visitModelElement(obj);
    }

    @objid ("4a21ece0-f58b-454b-b720-cc96cc1565d1")
    @Override
    public Object visitManifestation(Manifestation obj) {
        	return visitModelElement(obj);
    }

    @objid ("93972879-d5e8-4de6-b0b7-9417930c130a")
    @Override
    public Object visitNameSpace(NameSpace obj) {
        	return visitModelTree(obj);
    }

    @objid ("cc4adba0-4d4f-443b-a5ef-9860dff0cbce")
    @Override
    public Object visitNamespaceUse(NamespaceUse obj) {
        	return visitElement(obj);
    }

    @objid ("a9a1a1ab-9601-4174-862b-e62f4b1cf88c")
    @Override
    public Object visitNode(Node obj) {
        	return visitClassifier(obj);
    }

    @objid ("bd348044-41dd-4b96-838c-5290f4f62d83")
    @Override
    public Object visitOperation(Operation obj) {
        	return visitBehavioralFeature(obj);
    }

    @objid ("d94c323c-5ad0-4e6e-bdfa-5d1f8ecf2b75")
    @Override
    public Object visitPackage(Package obj) {
        	return visitNameSpace(obj);
    }

    @objid ("8bd108a0-6ee1-4c47-9a24-06a494f54efd")
    @Override
    public Object visitPackageImport(PackageImport obj) {
        	return visitModelElement(obj);
    }

    @objid ("cdd322c1-82c6-47a8-9e34-94ba8d3bcc77")
    @Override
    public Object visitPackageMerge(PackageMerge obj) {
        	return visitModelElement(obj);
    }

    @objid ("ba33be37-d3bf-4fc6-9b48-5317c8fa3c95")
    @Override
    public Object visitParameter(Parameter obj) {
        	return visitModelElement(obj);
    }

    @objid ("128dd9d8-ca8e-40d6-a980-e724d41b02a2")
    @Override
    public Object visitPort(Port obj) {
        	return visitBindableInstance(obj);
    }

    @objid ("6309aa32-7fa1-462c-be1c-d5d094328062")
    @Override
    public Object visitProvidedInterface(ProvidedInterface obj) {
        	return visitModelElement(obj);
    }

    @objid ("d0633ca7-4ace-41b0-a61e-802e9ef8e60e")
    @Override
    public Object visitRaisedException(RaisedException obj) {
        	return visitModelElement(obj);
    }

    @objid ("c98fec22-6392-43d7-8fc1-c36487e1fd92")
    @Override
    public Object visitRequiredInterface(RequiredInterface obj) {
        	return visitModelElement(obj);
    }

    @objid ("36d5e854-dec0-44bd-9b17-11e4b11ae190")
    @Override
    public Object visitTemplateBinding(TemplateBinding obj) {
        	return visitModelElement(obj);
    }

    @objid ("845e340d-4331-46a3-bd5b-dd8e33ed1db2")
    @Override
    public Object visitTemplateParameter(TemplateParameter obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("b8c33d1d-fdea-4ff8-bc7c-0eab48333fa8")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
        	return visitModelElement(obj);
    }

    @objid ("90dc76e6-c452-4ff4-af5d-bfcf65b293fc")
    @Override
    public Object visitStructuralFeature(StructuralFeature obj) {
        	return visitFeature(obj);
    }

    @objid ("6c202387-81d2-4ff9-b1fa-4baf85449941")
    @Override
    public Object visitBehavioralFeature(BehavioralFeature obj) {
        	return visitFeature(obj);
    }

    @objid ("07fd658c-d4fd-44e4-9002-24ea88479546")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("59ee2533-1614-420a-92b1-2b7ebb33c0e1")
    @Override
    public Object visitNaryAssociation(NaryAssociation obj) {
        	return visitModelElement(obj);
    }

    @objid ("68d0c5c1-efbf-49e4-87ad-34a0eec2001b")
    @Override
    public Object visitNaryLink(NaryLink obj) {
        	return visitModelElement(obj);
    }

    @objid ("95127140-3d67-4ec3-8d92-ff7f0a0e5bc6")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd obj) {
        	return visitModelElement(obj);
    }

    @objid ("e12bf716-7b19-4232-8614-e657e08e216f")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
        	return visitNaryLinkEnd(obj);
    }

    @objid ("1efe3ce6-4afa-48b7-9ca0-c9f2342298d6")
    @Override
    public Object visitAssociation(Association obj) {
        	return visitModelElement(obj);
    }

    @objid ("5f558020-d058-4789-b755-e0fe920bfc02")
    @Override
    public Object visitLink(Link obj) {
        	return visitModelElement(obj);
    }

    @objid ("c1c2f4e8-9b8f-477d-ac81-f18c170408d1")
    @Override
    public Object visitConnector(Connector obj) {
        	return visitLink(obj);
    }

    @objid ("7db7306c-f5d6-4688-a241-a5339c7db578")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("05ee00d8-1567-4c5a-ba27-a0b025870b37")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("27958ce6-e7f8-4a1f-97c4-f2580cd8ea29")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("9fee7629-10ee-423e-ae19-23b824b481f1")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("41c277f0-8a87-4bed-bb6b-19e2f91deba5")
    @Override
    public Object visitActivity(Activity obj) {
        	return visitBehavior(obj);
    }

    @objid ("5a8e334e-177a-4034-aaf1-f369a03edc1c")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        	return visitActivityNode(obj);
    }

    @objid ("18463331-1cc2-4eee-a05f-df7247238768")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        	return visitModelElement(obj);
    }

    @objid ("ade96f3d-a06c-4b0d-9135-6c98f2a844e9")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        	return visitFinalNode(obj);
    }

    @objid ("0f1e37cb-57cf-4dfd-a661-4b0440cc8cb3")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        	return visitModelElement(obj);
    }

    @objid ("797bdc81-0282-4947-b46e-942d0e24f933")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        	return visitModelElement(obj);
    }

    @objid ("6e105c89-c302-4c05-9039-3da6477c844b")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("c7819425-bc05-4a61-aa41-b16a6dea7d04")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        	return visitActivityGroup(obj);
    }

    @objid ("c821f758-8404-4a2b-8ae6-37903faf94d4")
    @Override
    public Object visitCallAction(CallAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("a4b64011-ad42-411e-9f4f-0e84b173c318")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        	return visitCallAction(obj);
    }

    @objid ("9f524ade-d708-4823-8881-af341b0bd23b")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        	return visitCallAction(obj);
    }

    @objid ("c4b7e0e2-8869-4ac5-8c62-1910135b2741")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("4d0a5711-1f57-4c7c-8722-5eb8c26d033f")
    @Override
    public Object visitClause(Clause obj) {
        	return visitModelElement(obj);
    }

    @objid ("71398bce-0c4a-4b03-a96e-4e3a531e6509")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("6d1da135-d634-47b9-b4aa-36ded49fab45")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("01283601-d74e-40c3-a475-00b2d89781cf")
    @Override
    public Object visitControlNode(ControlNode obj) {
        	return visitActivityNode(obj);
    }

    @objid ("9204ad5e-3a4c-4370-a4f0-3c002b17b34d")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        	return visitCentralBufferNode(obj);
    }

    @objid ("c860c9eb-d526-4222-b028-bdb675e1bb80")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("73a0c886-04ef-44e1-aa2f-f7ce5e3ee915")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        	return visitModelElement(obj);
    }

    @objid ("0e25937d-0239-4286-a6fe-8bfe04589677")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("9873290c-e697-4c50-9177-0e4dd0112a22")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("68facf6e-e143-4126-8326-6b16a3d75d8e")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("58b4ab79-4b7d-45b6-b633-1f4f9f5f1627")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        	return visitFinalNode(obj);
    }

    @objid ("01643020-0c83-451d-8b67-b33e64bb7e8a")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("37712273-0e47-4520-ad6d-5db8e11cacf8")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("f528bb97-90e0-4f08-815f-6f3710a15b3a")
    @Override
    public Object visitInputPin(InputPin obj) {
        	return visitPin(obj);
    }

    @objid ("ea6f134f-73a4-4f32-9486-ca32683663ed")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("72fdb8bc-afa4-4447-84aa-15c178b3007b")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        	return visitActivityGroup(obj);
    }

    @objid ("d1f84cc7-5f2e-4b59-9bac-c82ccfbdc70f")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("7686ecaf-9c3b-4f08-83b8-d32c55ae2add")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("be796270-d50f-4a29-b20c-f2d8486d947c")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("60d3f98e-08bd-4972-bd75-1031898592ca")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        	return visitActivityNode(obj);
    }

    @objid ("750e133a-a98f-4021-8588-603ef296ffab")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("7577fbad-afd8-4851-bb91-708a2ea19e99")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        	return visitPin(obj);
    }

    @objid ("32beed1b-1b16-40e2-a46f-03b19ebfea9f")
    @Override
    public Object visitPin(Pin obj) {
        	return visitObjectNode(obj);
    }

    @objid ("958bdf03-6ff0-4a2d-8357-3a2c9b2283df")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("46a023a8-954c-444f-9e01-f4a91158f3f6")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        	return visitActivityAction(obj);
    }

    @objid ("f904f2d1-6966-42ed-af3c-2c63afad90b7")
    @Override
    public Object visitValuePin(ValuePin obj) {
        	return visitInputPin(obj);
    }

    @objid ("18f60f26-c5a4-46cc-b236-e4daf9392076")
    @Override
    public Object visitBehavior(Behavior obj) {
        	return visitModelElement(obj);
    }

    @objid ("a23e3a83-b80a-48fd-90c8-f0deb5a25798")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        	return visitParameter(obj);
    }

    @objid ("da22f4a5-5810-447b-9957-11b9f4f3052c")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        	return visitBehavior(obj);
    }

    @objid ("f3c568f2-72a4-44aa-90de-55227195b355")
    @Override
    public Object visitSignal(Signal obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("9c3f69ed-bfa0-4f2f-8deb-4f0041378850")
    @Override
    public Object visitEvent(Event obj) {
        	return visitModelElement(obj);
    }

    @objid ("1f8bf4c0-ec7a-4083-b815-344c83ffd2ab")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("654ef105-3d90-4da7-9def-1737cbff7914")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        	return visitConstraint(obj);
    }

    @objid ("707641ce-9c59-4522-a929-662034ca1e59")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        	return visitMessageEnd(obj);
    }

    @objid ("76818c14-9805-4ef5-ac14-2a54bd29d7ce")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("397223dd-fa2e-4d68-ba15-d36a32c79370")
    @Override
    public Object visitGate(Gate obj) {
        	return visitMessageEnd(obj);
    }

    @objid ("832edebe-9f32-4359-93b3-00d62d1e8cce")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        	return visitElement(obj);
    }

    @objid ("ea16e44b-8632-438f-b348-d671acf64606")
    @Override
    public Object visitInteraction(Interaction obj) {
        	return visitBehavior(obj);
    }

    @objid ("d79fbd2e-010c-4d11-a975-a85c443f674f")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        	return visitModelElement(obj);
    }

    @objid ("b1b08a1a-68de-48f4-9598-038162cac476")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("9e47a9cb-f2ed-4dc1-aa20-66e06954088c")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("89320787-d4d0-405a-9cf3-d59460397284")
    @Override
    public Object visitLifeline(Lifeline obj) {
        	return visitModelElement(obj);
    }

    @objid ("dccb34ae-ffe3-4715-ba6e-41bb1802f807")
    @Override
    public Object visitMessage(Message obj) {
        	return visitModelElement(obj);
    }

    @objid ("cb56e40f-06d5-499a-9851-e679d2c8ab88")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        	return visitOccurrenceSpecification(obj);
    }

    @objid ("fdc6df11-523b-41de-b374-1d059e390c14")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("3a1179b4-6414-48d3-a601-be1db98897cb")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        	return visitInteractionUse(obj);
    }

    @objid ("1b6ce903-e6b9-434c-9494-f658911dd9e1")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        	return visitOccurrenceSpecification(obj);
    }

    @objid ("d7ee4878-d40d-43e0-b3ff-e50fc48ec077")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        	return visitExecutionOccurenceSpecification(obj);
    }

    @objid ("34fda786-26a8-4ec8-88c5-fa3d078c46eb")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        	return visitStateVertex(obj);
    }

    @objid ("a9dbb915-1dc9-4a12-959d-f06f47fc427f")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("58bf4f94-aa81-4702-871f-3b45f7240570")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        	return visitStateVertex(obj);
    }

    @objid ("81a31758-71c1-4a48-9088-0e25ff5ca573")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("f920f575-7977-4ca1-a13a-9e698d2e2802")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("4d4b69a7-8729-4a27-8c89-0c4c8c54feba")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("6eb9dd0c-a60d-43e2-b96c-3a801da69624")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("39510fd3-07c1-49d7-9363-f501271ccf3d")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("7fd837c6-2b31-49a9-bede-3fcb700d1497")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        	return visitTransition(obj);
    }

    @objid ("182bfd07-22f7-4be3-9d45-5072c8613feb")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("95ff53d0-d2d3-42d4-bff3-402f530d6047")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("232be774-b265-4bbf-8413-5a502744f431")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("6835c3f2-18a3-4514-9af8-285e28834d74")
    @Override
    public Object visitState(State obj) {
        	return visitStateVertex(obj);
    }

    @objid ("fe06dd27-e7a7-43a6-94ca-acb44614fb01")
    @Override
    public Object visitStateMachine(StateMachine obj) {
        	return visitBehavior(obj);
    }

    @objid ("a7111f0d-bcd4-4d51-9124-43e534131bf5")
    @Override
    public Object visitStateVertex(StateVertex obj) {
        	return visitModelElement(obj);
    }

    @objid ("fadac4ec-9076-4821-bf57-a54b320224f9")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("6370b3db-f53c-46c4-b4ea-271429ad8619")
    @Override
    public Object visitTransition(Transition obj) {
        	return visitModelElement(obj);
    }

    @objid ("248d38df-43db-4e99-8d65-43e3b90ced6f")
    @Override
    public Object visitFinalState(FinalState obj) {
        	return visitState(obj);
    }

    @objid ("e57972f4-0b9f-4d3c-820a-2ad29f1d0116")
    @Override
    public Object visitRegion(Region obj) {
        	return visitModelElement(obj);
    }

    @objid ("77500dfd-2746-406b-89e8-62c10f084ee9")
    @Override
    public Object visitActor(Actor obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("1b990cb2-008b-48ce-8ffb-c96fb7deab20")
    @Override
    public Object visitUseCase(UseCase obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("f4fddca6-40b3-44a1-8ef4-f40d665527ec")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency obj) {
        	return visitModelElement(obj);
    }

    @objid ("970dda0b-de31-45c8-a76e-65f26266a051")
    @Override
    public Object visitExtensionPoint(ExtensionPoint obj) {
        	return visitModelElement(obj);
    }

    @objid ("e8c8073e-8d8e-4f7c-8672-432d48f5cccd")
    @Override
    public Object visitAnalystItem(AnalystItem obj) {
        	return visitModelElement(obj);
    }

    @objid ("189e1b48-cb54-4859-8551-cf5a8f95dbff")
    @Override
    public Object visitAnalystElement(AnalystElement obj) {
        	return visitAnalystItem(obj);
    }

    @objid ("4ebe55c6-a23b-4612-883d-0396ded4024c")
    @Override
    public Object visitAnalystContainer(AnalystContainer obj) {
        	return visitAnalystItem(obj);
    }

    @objid ("9b2a770d-3e9c-4d58-9abe-bedce86177e0")
    @Override
    public Object visitAnalystProject(AnalystProject obj) {
        	return visitModelElement(obj);
    }

    @objid ("9d48ec86-0d8e-4e8e-be5a-3abe9f67ef58")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable obj) {
        	return visitTypedPropertyTable(obj);
    }

    @objid ("12c822a0-d9af-4e48-84eb-5793b7393eec")
    @Override
    public Object visitBusinessRule(BusinessRule obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("3cbad2cc-9d6b-45cb-be87-d590d35c2bd0")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("34459405-e511-478e-91e7-b5a1073ec818")
    @Override
    public Object visitDictionary(Dictionary obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("807c1c60-a2e8-436e-aabe-702925c2bdfd")
    @Override
    public Object visitGoal(Goal obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("2e5789fa-4b19-4ed0-9c7f-aba734ab1418")
    @Override
    public Object visitGoalContainer(GoalContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("bdd77e08-f3fb-48e7-b703-0ba76fb17715")
    @Override
    public Object visitPropertyContainer(PropertyContainer obj) {
        	return visitModelElement(obj);
    }

    @objid ("948a308a-1cbe-4c33-8ee4-979408883dbc")
    @Override
    public Object visitRequirement(Requirement obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("c077a84b-222e-4d3a-ba77-917e11172a86")
    @Override
    public Object visitRequirementContainer(RequirementContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("3999a81d-b80c-411d-9994-88762a850ba0")
    @Override
    public Object visitTerm(Term obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("b3c627fc-c2a9-45f8-b271-e2c9000fd1c6")
    @Override
    public Object visitGenericAnalystContainer(GenericAnalystContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("ad71e880-ed61-4aa5-8388-a58562289071")
    @Override
    public Object visitGenericAnalystElement(GenericAnalystElement obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("9c5814e4-c98f-42bb-b0c8-8b0498ee7870")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        	return visitModelElement(obj);
    }

    @objid ("d95cf2a5-363d-4e17-940b-c6133a9f35f7")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        	return visitClassifier(obj);
    }

    @objid ("5c3ec609-f6a9-4825-9613-9ce9bcb0934d")
    @Override
    public Object visitDataFlow(DataFlow obj) {
        	return visitModelElement(obj);
    }

    @objid ("4c7cd38f-85c2-4efe-a4ef-90f19991d42c")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        	return visitBehavior(obj);
    }

    @objid ("2aa9286d-a162-4915-b9c5-9ab2cdfd2b13")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        	return visitModelElement(obj);
    }

    @objid ("d005a3f3-83f5-491b-9d00-a219a824afea")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        	return visitModelElement(obj);
    }

    @objid ("c2d9dac9-534c-4b41-9194-6d53f012d936")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        	return visitModelElement(obj);
    }

    @objid ("2fa2ede4-318e-44f4-819a-48cd1b73141c")
    @Override
    public Object visitBpmnCollaboration(BpmnCollaboration obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("557b2012-022e-41b4-a1e6-83f79b9ff8e2")
    @Override
    public Object visitBpmnLane(BpmnLane obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("9148433b-91e3-4f68-ad16-e170cca70839")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("da2b6c8a-2bed-4d71-9798-2730e48b8e13")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("89b091c8-f023-4f1b-8ac8-b797d17559d0")
    @Override
    public Object visitBpmnProcess(BpmnProcess obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("bd3cf918-bcd1-44bd-8055-b8b029ae7617")
    @Override
    public Object visitBpmnAssociation(BpmnAssociation obj) {
        	return visitBpmnArtifact(obj);
    }

    @objid ("a51ccc45-86be-4f04-94cf-bf6b31221769")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement obj) {
        	return visitModelElement(obj);
    }

    @objid ("cdd76da9-b3f3-429c-9711-4bfbe208e366")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("69d65269-2100-4a9a-8a9b-534b4b8a9120")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("b5c603a0-ba6a-49fd-b5cc-f42fd3d616d5")
    @Override
    public Object visitBpmnFlowNode(BpmnFlowNode obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("9b2a451d-b531-4c22-88e5-eaebfcbbc92c")
    @Override
    public Object visitBpmnGroup(BpmnGroup obj) {
        	return visitBpmnArtifact(obj);
    }

    @objid ("220a0701-7298-4720-a92e-2bac21f36d7d")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("484636c4-bd24-4c06-b8b8-f6b6a22440fe")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior obj) {
        	return visitBehavior(obj);
    }

    @objid ("e8685b49-d597-4014-99ab-f567fec1fe28")
    @Override
    public Object visitBpmnMessage(BpmnMessage obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("fb5667d4-1dbc-4eea-9970-661cfa8de253")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("d4e38b89-9fc8-47da-8532-f11f229b135a")
    @Override
    public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("d117b5fc-1e52-425b-a497-d58f12c01f9b")
    @Override
    public Object visitBpmnActivity(BpmnActivity obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("45ac6cfd-dba7-44d2-b6dc-894b00f9784f")
    @Override
    public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
        	return visitBpmnSubProcess(obj);
    }

    @objid ("cff30380-944e-4449-b21b-389f3f267c0b")
    @Override
    public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("f9fc3d1d-62e6-4c53-baa5-b5d3803dca47")
    @Override
    public Object visitBpmnCallActivity(BpmnCallActivity obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("b5e2cff7-c12b-4042-9aa8-05bfdb856f62")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("c07b6a67-23dc-4d69-b448-cb1c2fa64c4b")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("1e000bab-e922-42c2-abbf-cf5f57a8eed7")
    @Override
    public Object visitBpmnManualTask(BpmnManualTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("1929a6a2-aa68-4530-81cc-3a64612e8884")
    @Override
    public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
        	return visitBpmnLoopCharacteristics(obj);
    }

    @objid ("de5595a4-6e0a-4861-92de-145a58d9dd5a")
    @Override
    public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("1307c833-f1cd-4271-a26c-2082e7202bce")
    @Override
    public Object visitBpmnScriptTask(BpmnScriptTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("31e853ff-2d93-4818-8951-80e17513c4db")
    @Override
    public Object visitBpmnSendTask(BpmnSendTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("d642ac35-9c01-4d82-a6d5-ca2c9e13d99a")
    @Override
    public Object visitBpmnServiceTask(BpmnServiceTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("b7916e71-e5e0-4ca8-a84c-4559f9690157")
    @Override
    public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
        	return visitBpmnLoopCharacteristics(obj);
    }

    @objid ("4a7a5b8f-336d-42a6-87d1-1e2811e21215")
    @Override
    public Object visitBpmnSubProcess(BpmnSubProcess obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("c3c6240a-b4ec-45bb-9839-df51f1eb32fd")
    @Override
    public Object visitBpmnTask(BpmnTask obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("645aa847-4384-4c23-b14c-33894acdbbde")
    @Override
    public Object visitBpmnTransaction(BpmnTransaction obj) {
        	return visitBpmnSubProcess(obj);
    }

    @objid ("a8cbb99f-3332-4b4b-a72a-d6793fe1bf5f")
    @Override
    public Object visitBpmnUserTask(BpmnUserTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("7be46a7a-2e55-4cb6-86cc-378c8e4fd339")
    @Override
    public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("54dc32f8-cf9f-4bd6-8018-d4f86a99b9f8")
    @Override
    public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("1e1a55be-1ec3-4e28-8c91-430fbd712d15")
    @Override
    public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
        	return visitBpmnEvent(obj);
    }

    @objid ("a2f26144-a356-4cbd-bcf2-cd5dc98476b8")
    @Override
    public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("bef4d823-2df9-498f-a365-e6ac28e806dd")
    @Override
    public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("4a2a575e-7f89-4284-93d1-bbf7f055f9f5")
    @Override
    public Object visitBpmnEndEvent(BpmnEndEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("27849c46-2af1-49d9-be6d-a5112ea63353")
    @Override
    public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("fe33a041-0aef-4a26-850c-65306c0d381a")
    @Override
    public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("ba497992-dbdd-4ed8-9ca6-b90a6da58660")
    @Override
    public Object visitBpmnEvent(BpmnEvent obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("71801d99-b16a-4caf-b150-28af7bcb224f")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("8fd42d97-06a2-4c63-9245-b7f550ba0b34")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("bb9a550e-c4f3-4c15-8cfe-95611449a39e")
    @Override
    public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("27c818ca-294d-4130-84b6-dfc64e8a2bd7")
    @Override
    public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("77c3f196-0182-4c83-9377-9ad9b011b976")
    @Override
    public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("9aef3e26-09f6-4700-ac52-69f880f06dba")
    @Override
    public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("7516e18c-274f-4aff-9612-3a2ab21c880b")
    @Override
    public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("15ef98be-d6b3-4560-aa27-11b9e26a1404")
    @Override
    public Object visitBpmnStartEvent(BpmnStartEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("2fed0305-25f4-4297-84ee-51b0eaca95ce")
    @Override
    public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("e9416b62-a69b-41d6-92d6-dcd854c19d30")
    @Override
    public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
        	return visitBpmnEvent(obj);
    }

    @objid ("888386c1-b0ab-429a-94b0-595ef0e5efe4")
    @Override
    public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("a6e9e435-0c23-4bec-82f4-8b6729ba4b6c")
    @Override
    public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("a43e5424-b92a-4eea-9b43-4a45bcef2157")
    @Override
    public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("73a47583-0946-4e5d-a966-ed2cfe41d4ed")
    @Override
    public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("43af583f-3cbd-44cf-8327-4d1cdbf5d0a4")
    @Override
    public Object visitBpmnGateway(BpmnGateway obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("93d2956b-900c-4721-aa70-ede60db6d0c3")
    @Override
    public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("89053928-5338-44f7-845d-6c7a4ec12702")
    @Override
    public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("051d8062-b7b1-4fbc-92d9-a0e1ddf1b153")
    @Override
    public Object visitBpmnDataObject(BpmnDataObject obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("a7dd3d0d-ade0-41af-9528-34aac7440637")
    @Override
    public Object visitBpmnDataStore(BpmnDataStore obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("9132af3a-6c19-40df-bc5a-df39fc82bb4b")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("842a1e54-76f0-4eb4-9be9-15594aed11e2")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("1786e001-1ae1-4c65-a5dc-c2039195fd11")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("78f9b964-0580-47be-8f0c-3b0b243b42b8")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("35eaf045-bc62-4454-8d0c-03a4644a3e8f")
    @Override
    public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("d1c86e4a-b094-48be-bc4a-e78763ba3b5a")
    @Override
    public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("6a6f3dd5-b939-4bae-a023-9b8c9e1cb9ff")
    @Override
    public Object visitBpmnDataState(BpmnDataState obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("877df58f-d353-4086-bf39-400be5bfc8c1")
    @Override
    public Object visitBpmnResource(BpmnResource obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("82798ac9-b811-4ad1-90c3-b1c5455db356")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("08b97797-327c-4a4e-9a1e-5fb3a47cc0bd")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("d67a0238-7ac1-435b-88cd-2c6a81bb129e")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("ffa44c51-f25f-49fa-a437-61c7b04418ce")
    @Override
    public Object visitBpmnOperation(BpmnOperation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("86201095-2685-4f69-86fb-9e6d6f8ebeed")
    @Override
    public Object visitBpmnInterface(BpmnInterface obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("40e710cc-f1cf-481f-8910-6e96c0dfbb87")
    @Override
    public Object visitBpmnEndPoint(BpmnEndPoint obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("f9d7a73d-1970-4a89-8bc3-cbe88f8152ee")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram obj) {
        	return visitModelElement(obj);
    }

    @objid ("fbcaebd3-07af-4326-a375-d533e0bfd4fc")
    @Override
    public Object visitActivityDiagram(ActivityDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("3461990e-8a79-4a8b-b630-81c9b6e61031")
    @Override
    public Object visitBehaviorDiagram(BehaviorDiagram obj) {
        	return visitAbstractDiagram(obj);
    }

    @objid ("9427c17e-ef29-486d-bc61-5ffef4138c65")
    @Override
    public Object visitClassDiagram(ClassDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("91a62ea0-31ac-4c0f-b074-5024902a522f")
    @Override
    public Object visitCommunicationDiagram(CommunicationDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("aba6f665-a7bb-440c-a4fc-64165446f88f")
    @Override
    public Object visitDeploymentDiagram(DeploymentDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("78c1e61e-104b-4b66-aa79-cbdf129fc520")
    @Override
    public Object visitDiagramSet(DiagramSet obj) {
        	return visitModelElement(obj);
    }

    @objid ("fab18de5-ca70-4156-9a81-895aa739f4df")
    @Override
    public Object visitSequenceDiagram(SequenceDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("647a73e8-2c04-4a16-a1ae-07f58a7cda91")
    @Override
    public Object visitStateMachineDiagram(StateMachineDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("f0bec0e9-1540-4a15-be43-47a03dbf1915")
    @Override
    public Object visitStaticDiagram(StaticDiagram obj) {
        	return visitAbstractDiagram(obj);
    }

    @objid ("13790014-3aa9-4948-89dd-72558320575c")
    @Override
    public Object visitUseCaseDiagram(UseCaseDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("a7b7493e-6c3c-4543-a0a1-5b7ddcbb0e61")
    @Override
    public Object visitObjectDiagram(ObjectDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("4fc819a9-4e93-47fd-8ffd-362e1779d949")
    @Override
    public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("5dd4ccd1-d177-4841-9a7d-4b6280e14d78")
    @Override
    public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("0f389b88-5f01-47e6-909c-997bbe751aec")
    @Override
    public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("0d1fe1aa-9373-41d4-ada0-e5afb1beb6e0")
    @Override
    public Object visitModuleParameter(ModuleParameter obj) {
        	return visitModelElement(obj);
    }

    @objid ("c91df004-d08a-4fea-98cd-cdd924820809")
    @Override
    public Object visitModuleComponent(ModuleComponent obj) {
        	return visitComponent(obj);
    }

    @objid ("bd2c09bc-01a7-48d2-905f-7fd435c32c8a")
    @Override
    public Object visitProject(Project obj) {
        	return visitModelElement(obj);
    }

}
