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
                                    

package org.modelio.xmi.generation;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.Usage;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
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
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.ProfileUtils;

@objid ("e28712e4-f756-46ad-b854-1024ca4de784")
public class OwnershipMetamodelVisitor extends DefaultModelVisitor {
    @objid ("896c7beb-11a5-4ca1-b207-2df931145b17")
    private IParseModelBehavior behavior = null;

    @objid ("123d9448-a138-4c54-9261-d6e5bc0bb118")
    public OwnershipMetamodelVisitor() {
    }

    @objid ("94abadc4-b8aa-4c47-bdd5-6b4b3ff6b538")
    public OwnershipMetamodelVisitor(IParseModelBehavior behavior) {
        this.behavior = behavior;
    }

    @objid ("9bf4632f-71ef-4dd2-a616-54527ec9436a")
    @Override
    public Object visitAbstractDiagram(final AbstractDiagram param) {
        // Object lObject = super.visitAbstractDiagram(param);
        // // getrepresented() not supported... (Element)
        // return lObject;
        return null;
    }

    @objid ("75c720f7-741b-4707-8220-acf8fb98ce6a")
    @Override
    public Object visitAbstractPseudoState(final AbstractPseudoState param) {
        return super.visitAbstractPseudoState(param);
    }

    @objid ("3c12883a-b512-425b-9f70-4c7a3db3c174")
    @Override
    public Object visitAbstraction(final Abstraction param) {
        this.behavior.visitAbstraction(param);
        return super.visitAbstraction(param);
    }

    @objid ("f52a9df2-7629-46e6-844f-c3a030dd5fe3")
    @Override
    public Object visitAcceptCallEventAction(final AcceptCallEventAction param) {
        this.behavior.visitAcceptCallEventAction(param);
        return super.visitAcceptCallEventAction(param);
    }

    @objid ("b56c48ef-0ca7-4f40-9f61-bb8fd0f3d5b7")
    @Override
    public Object visitAcceptChangeEventAction(final AcceptChangeEventAction param) {
        this.behavior.visitAcceptChangeEventAction(param);
        return super.visitAcceptChangeEventAction(param);
    }

    @objid ("ce75d45f-50c5-4c24-99ff-fc3f0c90721c")
    @Override
    public Object visitAcceptSignalAction(final AcceptSignalAction param) {
        this.behavior.visitAcceptSignalAction(param);
        return super.visitAcceptSignalAction(param);
    }

    @objid ("8d27e498-cf2a-42f9-83eb-7373d92976e6")
    @Override
    public Object visitAcceptTimeEventAction(final AcceptTimeEventAction param) {
        this.behavior.visitAcceptTimeEventAction(param);
        return super.visitAcceptTimeEventAction(param);
    }

    @objid ("661ecb11-6987-4c56-ae97-e8fe0ea37d8a")
    @Override
    public Object visitActivity(final Activity param) {
        this.behavior.visitActivity(param);
        Object lObject = super.visitActivity(param);
        for (ActivityGroup i : param.getOwnedGroup()) {
            i.accept(this);
        }
        for (ActivityNode i : param.getOwnedNode()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("f1cabeeb-b7e6-49b2-8f51-821aff6a9149")
    @Override
    public Object visitActivityAction(final ActivityAction param) {
        Object lObject = super.visitActivityAction(param);
        for (InputPin i : param.getInput()) {
            i.accept(this);
        }
        for (OutputPin i : param.getOutput()) {
            i.accept(this);
        }
        
        for (ExceptionHandler i : param.getHandler()){
            i.accept(this);
        }
        return lObject;
    }

    @objid ("cea418a5-3ce3-403e-b838-b7e7a61a47b6")
    @Override
    public Object visitActivityEdge(final ActivityEdge param) {
        return super.visitActivityEdge(param);
    }

    @objid ("6e5ac81c-f828-4c20-b455-9876871fb3c5")
    @Override
    public Object visitActivityFinalNode(final ActivityFinalNode param) {
        this.behavior.visitActivityFinalNode(param);
        return super.visitActivityFinalNode(param);
    }

    @objid ("c506441c-fa2b-4a86-ad0d-2240b5ca6d8a")
    @Override
    public Object visitActivityGroup(final ActivityGroup param) {
        return super.visitActivityGroup(param);
    }

    @objid ("ddda6cef-f9de-4783-83b7-96f7353d57f0")
    @Override
    public Object visitActivityNode(final ActivityNode param) {
        Object lObject = super.visitActivityNode(param);
        for (ActivityEdge i : param.getOutgoing()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("1f7c4dc3-753f-4eee-91e1-4e7ed4162151")
    @Override
    public Object visitActivityParameterNode(final ActivityParameterNode param) {
        this.behavior.visitActivityParameterNode(param);
        return super.visitActivityParameterNode(param);
    }

    @objid ("5cea06f4-595a-416d-a236-4d9cef4ec335")
    @Override
    public Object visitActivityPartition(final ActivityPartition param) {
        this.behavior.visitActivityPartition(param);
        Object lObject = super.visitActivityPartition(param);
        for (ActivityNode i : param.getContainedNode()) {
            i.accept(this);
        }
        for (MessageFlow i : param.getOutgoing()) {
            i.accept(this);
        }
        for (ActivityPartition i : param.getSubPartition()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("09d3d4cf-eda3-4fad-9d65-5bfa42c5d83f")
    @Override
    public Object visitActor(final Actor param) {
        this.behavior.visitActor(param);
        return super.visitActor(param);
    }

    @objid ("dbd67d34-f7f1-4e10-a875-448b096cea00")
    @Override
    public Object visitAnalystProject(final AnalystProject param) {
        // behavior.visitRequirementContainer (param);
        // Object lObject = super.visitRequirementContainer(param);
        // AnalystPropertyTable lDefaultSet = param.getDefaultSet(); if
        // (lDefaultSet != null) { lDefaultSet.accept(this); }
        for( RequirementContainer i :  param.getRequirementRoot()){
            i.accept(this);
        }
        // return lObject;
        return null;
    }

    @objid ("a55203b8-6adc-4018-98fe-09c86a4301ad")
    @Override
    public Object visitArtifact(final Artifact param) {
        this.behavior.visitArtifact(param);
        Object lObject = super.visitArtifact(param);
        for (Manifestation i : param.getUtilized()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("3765c856-a647-4c4b-bd8b-0dd44413688a")
    @Override
    public Object visitAssociation(final Association param) {
        this.behavior.visitAssociation(param);
        Object lObject = super.visitAssociation(param);
        ClassAssociation lLinkToClass = param.getLinkToClass();
        if (lLinkToClass != null) {
            lLinkToClass.accept(this);
        }
        return lObject;
    }

    @objid ("6c9ed13a-4233-4db4-94a8-f423d5e1e06b")
    @Override
    public Object visitAssociationEnd(final AssociationEnd param) {
        this.behavior.visitAssociationEnd(param);
        Object lObject = super.visitAssociationEnd(param);
        for (Attribute i : param.getQualifier()) {
            i.accept(this);
        }
        
        AssociationEnd i = param.getOpposite();
        if ((i != null) && (i.getTarget() == null) && (param.getTarget() != null)){
            i.accept(this);
        }
        return lObject;
    }

    @objid ("16a9189d-dca1-4f61-8dec-90f606edbb61")
    @Override
    public Object visitAttribute(final Attribute param) {
        this.behavior.visitAttribute(param);
        return super.visitAttribute(param);
    }

    @objid ("18c870bd-454e-45ea-b42b-d3ba8d232a9c")
    @Override
    public Object visitAttributeLink(final AttributeLink param) {
        this.behavior.visitAttributeLink (param);
        return super.visitAttributeLink(param);
    }

    @objid ("063c2437-76ba-43bb-9637-c368553430ea")
    @Override
    public Object visitBehavior(final Behavior param) {
        Object lObject = super.visitBehavior(param);
        for (Event i : param.getEComponent()) {
            i.accept(this);
        }
        for (Collaboration i : param.getOwnedCollaboration()) {
            i.accept(this);
        }
        for (BehaviorParameter i : param.getParameter()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("dad9b5df-a055-4c1a-8f9f-8ee7a65aa648")
    @Override
    public Object visitBehaviorParameter(final BehaviorParameter param) {
        this.behavior.visitBehaviorParameter (param);
        return super.visitBehaviorParameter(param);
    }

    @objid ("15e740f2-a9b9-4fe8-a38b-723a0e1aa49c")
    @Override
    public Object visitBindableInstance(final BindableInstance param) {
        this.behavior.visitBindableInstance (param);
        return super.visitBindableInstance(param);
    }

    @objid ("c5129fc3-7871-4970-a2f9-afb3cbdca903")
    @Override
    public Object visitBinding(final Binding param) {
        this.behavior.visitBinding (param);
        return super.visitBinding(param);
    }

    @objid ("b376024a-93b8-4f7b-9af7-8a20eaccdc37")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement param) {
        this.behavior.visitBpmnBaseElement (param);
        return super.visitBpmnBaseElement(param);
    }

    @objid ("53e63708-d97d-4289-8fa1-b8412d529b5f")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior param) {
        this.behavior.visitBpmnBehavior (param);
        return super.visitBpmnBehavior(param);
    }

    @objid ("5d04fc26-b470-4e63-a35d-194df7d3f5c9")
    @Override
    public Object visitCallAction(final CallAction param) {
        return super.visitCallAction(param);
    }

    @objid ("0e357a2b-55b1-4fae-aed0-048ed95c2f8b")
    @Override
    public Object visitCallBehaviorAction(final CallBehaviorAction param) {
        this.behavior.visitCallBehaviorAction(param);
        return super.visitCallBehaviorAction(param);
    }

    @objid ("e28b4bf0-8a64-4e79-9053-117d856eaf4f")
    @Override
    public Object visitCallOperationAction(final CallOperationAction param) {
        this.behavior.visitCallOperationAction(param);
        return super.visitCallOperationAction(param);
    }

    @objid ("f9db095d-0d4e-4c0b-87dd-52d5214e9eb3")
    @Override
    public Object visitCentralBufferNode(final CentralBufferNode param) {
        this.behavior.visitCentralBufferNode(param);
        return super.visitCentralBufferNode(param);
    }

    @objid ("4c3da0f7-8e86-4ee5-8b95-c15380d8f620")
    @Override
    public Object visitChoicePseudoState(final ChoicePseudoState param) {
        this.behavior.visitChoicePseudoState (param);
        return super.visitChoicePseudoState(param);
    }

    @objid ("bc1fa8e0-c04e-4088-b032-030098c149e3")
    @Override
    public Object visitClass(final Class param) {
        this.behavior.visitClass(param);
        return super.visitClass(param);
    }

    @objid ("42d04194-e8d9-47b4-98fb-121cd8761e6e")
    @Override
    public Object visitClassAssociation(final ClassAssociation param) {
        this.behavior.visitClassAssociation(param);
        return super.visitClassAssociation(param);
    }

    @objid ("e3e5a4f0-d4b4-4915-b6d0-5bbf35a965ab")
    @Override
    public Object visitClassifier(final Classifier param) {
        Object lObject = super.visitClassifier(param);
        for (AssociationEnd i : param.getOwnedEnd()) {
            i.accept(this);
        }
        
        for (NaryAssociationEnd i : param.getOwnedNaryEnd()) {
            i.accept(this);
        }
        
        for (Attribute i : param.getOwnedAttribute()) {
            i.accept(this);
        }
        
        for (BindableInstance i : param.getInternalStructure()) {
            if (i instanceof Port)
                ((Port) i).accept(this);
            else    
                i.accept(this);
        }
        for (Feature i : param.getOwnedOperation()) {
            i.accept(this);
        }
        for (Substitution i : param.getSubstitued()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("4be9b46c-7b94-47b0-ab78-0fa596034d90")
    @Override
    public Object visitClause(final Clause param) {
        this.behavior.visitClause(param);
        Object lObject = super.visitClause(param);
        for (ActivityNode i : param.getBody()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("cfa98039-2ca6-45ae-ad7e-5ac404b2cdb5")
    @Override
    public Object visitCollaboration(final Collaboration param) {
        this.behavior.visitCollaboration(param);
        return super.visitCollaboration(param);
    }

    @objid ("4f131884-82fa-4fa0-91df-ec79bf7cb9d8")
    @Override
    public Object visitCollaborationUse(final CollaborationUse param) {
        this.behavior.visitCollaborationUse (param);
        Object lObject = super.visitCollaborationUse(param);
        for (Binding i: param.getRoleBinding()) { i.accept(this); }
        return lObject;
    }

    @objid ("69e41200-8b4d-47cb-bf0c-cb7b7f9b5973")
    @Override
    public Object visitCombinedFragment(final CombinedFragment param) {
        this.behavior.visitCombinedFragment(param);
        Object lObject = super.visitCombinedFragment(param);
        for (Gate i : param.getFragmentGate()) {
            i.accept(this);
        }
        for (InteractionOperand i : param.getOperand()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("a047133c-e482-4bd6-8f23-4d857dd8f467")
    @Override
    public Object visitComponent(final Component param) {
        this.behavior.visitComponent(param);
        Object lObject = super.visitComponent(param);
               
        for (ComponentRealization i : param.getRealization()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("be8524bb-05ad-419f-a718-0715db22590b")
    @Override
    public Object visitConditionalNode(final ConditionalNode param) {
        this.behavior.visitConditionalNode(param);
        Object lObject = super.visitConditionalNode(param);
        for (Clause i : param.getOwnedClause()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("42a80e38-c43d-405e-8c4f-c061524e943b")
    @Override
    public Object visitConnectionPointReference(final ConnectionPointReference param) {
        this.behavior.visitConnectionPointReference (param);
        return super.visitConnectionPointReference(param);
    }

    @objid ("af9e693c-ea75-4d8a-b9b6-8a23dea5bcd3")
    @Override
    public Object visitConnector(final Connector param) {
        this.behavior.visitConnector (param);
        return super.visitConnector(param);
    }

    @objid ("e4afd5d4-19a2-42fb-a935-fcb69b185f73")
    @Override
    public Object visitConnectorEnd(final ConnectorEnd param) {
        this.behavior.visitConnectorEnd (param);
        Object lObject = super.visitConnectorEnd(param);
        
        Link i = param.getLink(); 
        i.accept(this);
        return lObject;
    }

    @objid ("7d856341-5829-4d3a-8c9a-b6a3c1524043")
    @Override
    public Object visitConstraint(final Constraint param) {
        this.behavior.visitConstraint(param);
        return super.visitConstraint(param);
    }

    @objid ("0756117a-cf28-4881-9623-9c6a5b2cccbd")
    @Override
    public Object visitControlFlow(final ControlFlow param) {
        this.behavior.visitControlFlow(param);
        return super.visitControlFlow(param);
    }

    @objid ("a68b807d-03e6-4bbf-92f2-c1d0f06fdb32")
    @Override
    public Object visitControlNode(final ControlNode param) {
        return super.visitControlNode(param);
    }

    @objid ("32a5bd27-51f6-4bad-a2dd-ac4ca7b4aeae")
    @Override
    public Object visitDataFlow(final DataFlow param) {
        // behavior.visitDataFlow (param);
        // Object lObject = super.visitDataFlow(param);
        // return lObject;
        return null;
    }

    @objid ("f1f166bc-2a58-46bf-9a83-e9ce74f82ed9")
    @Override
    public Object visitDataStoreNode(final DataStoreNode param) {
        this.behavior.visitDataStoreNode(param);
        return super.visitDataStoreNode(param);
    }

    @objid ("9f31cc1f-4b1f-4cc7-b8eb-578b40da027a")
    @Override
    public Object visitDataType(final DataType param) {
        this.behavior.visitDataType(param);
        return super.visitDataType(param);
    }

    @objid ("eb77df4f-7a2d-4550-8bcd-93c9dbed859a")
    @Override
    public Object visitDecisionMergeNode(final DecisionMergeNode param) {
        this.behavior.visitDecisionMergeNode(param);
        return super.visitDecisionMergeNode(param);
    }

    @objid ("b7e2c384-ade4-4b2a-998d-758d8287066f")
    @Override
    public Object visitDeepHistoryPseudoState(final DeepHistoryPseudoState param) {
        this.behavior.visitDeepHistoryPseudoState (param);
        return super.visitDeepHistoryPseudoState(param);
    }

    @objid ("7d6943d2-160e-4dd3-ac4a-0562a614531c")
    @Override
    public Object visitDependency(final Dependency param) {
        this.behavior.visitDependency(param);
        return super.visitDependency(param);
    }

    @objid ("1d8c6821-6523-41fc-973a-53fb61f58726")
    @Override
    public Object visitDictionary(final Dictionary param) {
        // behavior.visitDictionary (param);
        // Object lObject = super.visitDictionary(param);
        // AnalystPropertyTable lDefaultSet = param.getDefaultSet(); if
        // (lDefaultSet != null) { lDefaultSet.accept(this); }
        // for (DictionaryElement i: param.getOwned()) { i.accept(this); }
        // return lObject;
        return null;
    }

    @objid ("952f5bf0-2064-447d-b530-608f6470d82b")
    @Override
    public Object visitDurationConstraint(final DurationConstraint param) {
        // behavior.visitDurationConstraint (param);
        // Object lObject = super.visitDurationConstraint(param);
        // return lObject;
        return null;
    }

    @objid ("9377eee5-7627-4d38-92ba-bd250898e4c8")
    @Override
    public Object visitElement(final Element param) {
        Object lObject = super.visitElement(param);
        // getdiagramElement() not supported... (AbstractDiagram)
        // getundefined() not supported... (IViewElement)
        return lObject;
    }

    @objid ("e11dc42c-5653-4cfd-ad9f-5878f6fd2bf4")
    @Override
    public Object visitElementImport(final ElementImport param) {
        this.behavior.visitElementImport(param);
        return super.visitElementImport(param);
    }

    @objid ("2bbc791b-0bcb-43f8-8540-43503522f6ee")
    @Override
    public Object visitElementRealization(final ElementRealization param) {
        this.behavior.visitElementRealization(param);
        return super.visitElementRealization(param);
    }

    @objid ("a7ede841-e56c-4f1e-ba00-4ad0a9c16b57")
    @Override
    public Object visitEntryPointPseudoState(final EntryPointPseudoState param) {
        this.behavior.visitEntryPointPseudoState (param);
        return super.visitEntryPointPseudoState(param);
    }

    @objid ("8a94948d-f45a-46c5-865f-c1300a11c26b")
    @Override
    public Object visitEnumeratedPropertyType(final EnumeratedPropertyType param) {
        // behavior.visitEnumeratedPropertyType (param);
        // Object lObject = super.visitEnumeratedPropertyType(param);
        // for (PropertyEnumerationLitteral i: param.getLitteral()) {
        // i.accept(this); }
        // return lObject;
        return null;
    }

    @objid ("9c9281eb-de49-4311-9a6c-fd3c29469012")
    @Override
    public Object visitEnumeration(final Enumeration param) {
        this.behavior.visitEnumeration(param);
        Object lObject = super.visitEnumeration(param);
        for (EnumerationLiteral i : param.getValue()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("a4db8d35-456d-416b-a1cd-bc44ec924485")
    @Override
    public Object visitEnumerationLiteral(final EnumerationLiteral param) {
        this.behavior.visitEnumerationLiteral(param);
        return super.visitEnumerationLiteral(param);
    }

    @objid ("7d464c11-7fed-426c-aed8-be518f226ce6")
    @Override
    public Object visitEvent(final Event param) {
        this.behavior.visitEvent (param);
        return super.visitEvent(param);
    }

    @objid ("fc2cd640-56f4-4e34-9670-e33b1b253fbe")
    @Override
    public Object visitExceptionHandler(ExceptionHandler param) {
        this.behavior.visitExceptionHandler(param);
        return super.visitExceptionHandler(param);
    }

    @objid ("4d88b7c8-24d9-4d41-8223-7446909ea7ac")
    @Override
    public Object visitExecutionOccurenceSpecification(final ExecutionOccurenceSpecification param) {
        this.behavior.visitExecutionOccurenceSpecification(param);
        return super.visitExecutionOccurenceSpecification(param);
    }

    @objid ("b0976347-99fe-440b-a4d9-6784365983ca")
    @Override
    public Object visitExecutionSpecification(final ExecutionSpecification param) {
        this.behavior.visitExecutionSpecification(param);
        return super.visitExecutionSpecification(param);
    }

    @objid ("772a2b3c-0f50-471d-a714-ada135d7d701")
    @Override
    public Object visitExitPointPseudoState(final ExitPointPseudoState param) {
        this.behavior.visitExitPointPseudoState (param);
        return super.visitExitPointPseudoState(param);
    }

    @objid ("fa4027cd-0876-48f5-965c-bdee6d208846")
    @Override
    public Object visitExpansionNode(ExpansionNode param) {
        this.behavior.visitExpansionNode(param);
        return super.visitExpansionNode(param);
    }

    @objid ("12a3047f-1c9c-4484-8fd5-ed956029a27a")
    @Override
    public Object visitExpansionRegion(ExpansionRegion param) {
        this.behavior.visitExpansionRegion(param);
        Object lObject = super.visitExpansionRegion(param);
        for (ExpansionNode i : param.getInputElement()) {
            i.accept(this);
        }
        
        for (ExpansionNode i : param.getOutputElement()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("237a8dbf-82f3-4aef-908c-84d4b19d89c4")
    @Override
    public Object visitExtensionPoint(final ExtensionPoint param) {
        this.behavior.visitExtensionPoint(param);
        return super.visitExtensionPoint(param);
    }

    @objid ("7b1946a2-c565-4bd1-b569-90f78df8d474")
    @Override
    public Object visitFeature(final Feature param) {
        return super.visitFeature(param);
    }

    @objid ("5c6671ad-8f02-4be0-adae-4b8f5ec30740")
    @Override
    public Object visitFinalNode(final FinalNode param) {
        return super.visitFinalNode(param);
    }

    @objid ("add9533a-ff10-4807-ade1-5e8fcd7a0886")
    @Override
    public Object visitFinalState(final FinalState param) {
        this.behavior.visitFinalState(param);
        return super.visitFinalState(param);
    }

    @objid ("7de1564c-5673-4896-9982-df8decc3c380")
    @Override
    public Object visitFlowFinalNode(final FlowFinalNode param) {
        this.behavior.visitFlowFinalNode(param);
        return super.visitFlowFinalNode(param);
    }

    @objid ("533dac67-6c35-4979-b467-9dae812a585c")
    @Override
    public Object visitForkJoinNode(final ForkJoinNode param) {
        this.behavior.visitForkJoinNode(param);
        return super.visitForkJoinNode(param);
    }

    @objid ("695eab51-ceb8-42d0-b4f3-d0d8d597e992")
    @Override
    public Object visitForkPseudoState(final ForkPseudoState param) {
        this.behavior.visitForkPseudoState (param);
        return super.visitForkPseudoState(param);
    }

    @objid ("85b088a6-9407-420d-9ede-ea3a433f09e1")
    @Override
    public Object visitGate(final Gate param) {
        this.behavior.visitGate(param);
        return super.visitGate(param);
    }

    @objid ("c9952f4b-9f94-443f-b007-3cdf2e8c45ea")
    @Override
    public Object visitGeneralClass(final GeneralClass param) {
        return super.visitGeneralClass(param);
    }

    @objid ("498389de-e1ff-4a2d-a205-64a754bb5328")
    @Override
    public Object visitGeneralOrdering(final GeneralOrdering param) {
        // behavior.visitGeneralOrdering (param);
        // Object lObject = super.visitGeneralOrdering(param);
        // return lObject;
        return null;
    }

    @objid ("fdd4b3d3-4b2d-4b0e-b38c-f42a3391ef4e")
    @Override
    public Object visitGeneralization(final Generalization param) {
        this.behavior.visitGeneralization(param);
        return super.visitGeneralization(param);
    }

    @objid ("44945c4f-fe02-4674-82b1-b9ac39fec6d7")
    @Override
    public Object visitInformationFlow(final InformationFlow param) {
        this.behavior.visitInformationFlow (param);
        return super.visitInformationFlow(param);
    }

    @objid ("1c26e0af-b719-42ad-8f82-4f7557cd0e62")
    @Override
    public Object visitInformationItem(final InformationItem param) {
        this.behavior.visitInformationItem (param);
        return super.visitInformationItem(param);
    }

    @objid ("43a530b5-e2e1-44e5-85e5-74f1a6a3d9f3")
    @Override
    public Object visitInitialNode(final InitialNode param) {
        this.behavior.visitInitialNode(param);
        return super.visitInitialNode(param);
    }

    @objid ("2e07adde-5a9e-4691-8f4d-e7aba2eaac45")
    @Override
    public Object visitInitialPseudoState(final InitialPseudoState param) {
        this.behavior.visitInitialPseudoState (param);
        return super.visitInitialPseudoState(param);
    }

    @objid ("6c0b4e29-ddfb-4328-9dfd-e1a4876951b5")
    @Override
    public Object visitInputPin(final InputPin param) {
        this.behavior.visitInputPin(param);
        return super.visitInputPin(param);
    }

    @objid ("56d84f2f-eb54-45b9-8c20-9f9473d249e0")
    @Override
    public Object visitInstance(final Instance param) {
        this.behavior.visitInstance (param);
        Object lObject = super.visitInstance(param);
        for (BindableInstance i: param.getPart()) { 
            if (i instanceof Port)
                ((Port)i).accept(this);
            else
                i.accept(this);
        }
        
        for (AttributeLink i: param.getSlot()) { 
            i.accept(this);}
        
        for (LinkEnd i: param.getOwnedEnd()) { 
            if (i instanceof ConnectorEnd)
                ((ConnectorEnd)i).accept(this);
            else
                i.accept(this);
        }
        return lObject;
    }

    @objid ("a3335aed-8be0-47d4-988c-a73c9205e027")
    @Override
    public Object visitInstanceNode(final InstanceNode param) {
        this.behavior.visitInstanceNode(param);
        return super.visitInstanceNode(param);
    }

    @objid ("f06c3586-a6ab-4565-94a6-4e6115b18bbd")
    @Override
    public Object visitInteraction(final Interaction param) {
        this.behavior.visitInteraction(param);
        Object lObject = super.visitInteraction(param);
        
        List<InteractionFragment> fragments = AbstractObjingModelNavigation.getOrderedFragments(param);
        
        for (InteractionFragment i : fragments) {
            i.accept(this);
        }
        
        for (Lifeline i : param.getOwnedLine()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("8f72f2c7-babf-456b-ba33-418d80cdf730")
    @Override
    public Object visitInteractionFragment(final InteractionFragment param) {
        return super.visitInteractionFragment(param);
    }

    @objid ("29340155-807c-4983-a183-0945786c49d5")
    @Override
    public Object visitInteractionOperand(final InteractionOperand param) {
        this.behavior.visitInteractionOperand(param);
        Object lObject = super.visitInteractionOperand(param);
        for (InteractionFragment i : param.getFragment()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("a4db0a86-6d8c-4968-ba3f-fd03a624c229")
    @Override
    public Object visitInteractionUse(final InteractionUse param) {
        this.behavior.visitInteractionUse(param);
        Object lObject = super.visitInteractionUse(param);
        for (Gate i : param.getActualGate()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("280513c3-a4a4-4b39-b9e9-970afe13052d")
    @Override
    public Object visitInterface(final Interface param) {
        this.behavior.visitInterface(param);
        return super.visitInterface(param);
    }

    @objid ("673345dc-d6cc-4616-afc6-e8597a61e2fa")
    @Override
    public Object visitInterfaceRealization(final InterfaceRealization param) {
        this.behavior.visitInterfaceRealization(param);
        return super.visitInterfaceRealization(param);
    }

    @objid ("7720cca8-096d-416f-b041-6f7dbd42ae64")
    @Override
    public Object visitInternalTransition(final InternalTransition param) {
        this.behavior.visitInternalTransition(param);
        return super.visitInternalTransition(param);
    }

    @objid ("53a3f630-e767-4186-bd88-2c1937529434")
    @Override
    public Object visitInterruptibleActivityRegion(final InterruptibleActivityRegion param) {
        this.behavior.visitInterruptibleActivityRegion(param);
        return super.visitInterruptibleActivityRegion(param);
    }

    @objid ("65181cfa-201e-4b54-9cb5-c3da555dd542")
    @Override
    public Object visitJoinPseudoState(final JoinPseudoState param) {
        this.behavior.visitJoinPseudoState (param);
        return super.visitJoinPseudoState(param);
    }

    @objid ("a68dea11-a097-4411-9286-dd72eb9f8af6")
    @Override
    public Object visitJunctionPseudoState(final JunctionPseudoState param) {
        this.behavior.visitJunctionPseudoState (param);
        return super.visitJunctionPseudoState(param);
    }

    @objid ("8ab2582d-5881-46d0-b4a2-5c429ee90721")
    @Override
    public Object visitLifeline(final Lifeline param) {
        this.behavior.visitLifeline(param);
        Object lObject = super.visitLifeline(param);
        PartDecomposition lPartDecomposed = param.getDecomposedAs();
        if (lPartDecomposed != null) {
            lPartDecomposed.accept(this);
        }
        return lObject;
    }

    @objid ("baaeb830-250c-4007-9132-03e343b3ab2d")
    @Override
    public Object visitLink(final Link param) {
        this.behavior.visitLink (param);
        return super.visitLink(param);
    }

    @objid ("ebe4ce0b-c1ba-4d28-8b8d-81344b7e06a9")
    @Override
    public Object visitLinkEnd(final LinkEnd param) {
        this.behavior.visitLinkEnd (param);
        Object lObject = super.visitLinkEnd(param);
        
        Link link = param.getLink(); 
        link.accept(this);
        
        LinkEnd i = param.getOpposite();
        if ((i != null) && (i.getTarget() == null) && (param.getTarget() != null)){
            i.accept(this);
        }
        return lObject;
    }

    @objid ("546e82fb-0742-47be-a80b-60a64d17cc94")
    @Override
    public Object visitLoopNode(final LoopNode param) {
        this.behavior.visitLoopNode(param);
        return super.visitLoopNode(param);
    }

    @objid ("c109051b-3c54-4151-8ac5-afd4a52e0f28")
    @Override
    public Object visitManifestation(final Manifestation param) {
        this.behavior.visitManifestation(param);
        return super.visitManifestation(param);
    }

    @objid ("b973d1ae-37c4-40e6-94b8-cd57bb5a81a5")
    @Override
    public Object visitMessage(final Message param) {
        this.behavior.visitMessage (param);
        return super.visitMessage(param);
    }

    @objid ("ff725c0c-4710-4b2f-bdf5-c23331ccf305")
    @Override
    public Object visitMessageEnd(final MessageEnd param) {
        Object lObject = super.visitMessageEnd(param);
        Message lSentMessage = param.getSentMessage();
        if (lSentMessage != null) {
            lSentMessage.accept(this);
        }
        return lObject;
    }

    @objid ("90faa7cb-34f1-4c80-9553-5e41c0141d5d")
    @Override
    public Object visitMessageFlow(final MessageFlow param) {
        // behavior.visitMessageFlow (param);
        // Object lObject = super.visitMessageFlow(param);
        // return lObject;
        return null;
    }

    @objid ("baf58a78-e80c-4bd1-9091-91db03c294da")
    @Override
    public Object visitModelElement(final ModelElement param) {
        Object lObject = super.visitModelElement(param);
        for (Dependency i : param.getDependsOnDependency()) {
            i.accept(this);
        }
        for (Note i : param.getDescriptor()) {
            i.accept(this);
        }
        for (TaggedValue i : param.getTag()) {
            if (AbstractObjingModelNavigation.mustBeExported(i))
                i.accept(this);
        }
        return lObject;
    }

    @objid ("8d0c84b6-6ad4-4430-9961-84eb45299c4c")
    @Override
    public Object visitModelTree(final ModelTree param) {
        Object lObject = super.visitModelTree(param);
        for (ModelTree i : param.getOwnedElement()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("06afed8a-7dca-4aba-ac6a-65155f0c269b")
    @Override
    public Object visitNameSpace(final NameSpace param) {
        Object lObject = super.visitNameSpace(param);
        for (Instance i : param.getDeclared()) {
            i.accept(this);
        }
        for (Behavior i : param.getOwnedBehavior()) {
            if (i instanceof BpmnBehavior){
                ((BpmnBehavior) i).accept(this);
            }else{
                i.accept(this);
            }
        }
        for (CollaborationUse i : param.getOwnedCollaborationUse()) {
            i.accept(this);
        }
        for (DataFlow i : param.getOwnedDataFlow()) {
            i.accept(this);
        }
        for (ElementImport i : param.getOwnedImport()) {
            i.accept(this);
        }
        for (InformationFlow i : param.getOwnedInformationFlow()) {
            i.accept(this);
        }
        for (PackageImport i : param.getOwnedPackageImport()) {
            i.accept(this);
        }
        for (Generalization i : param.getParent()) {
            i.accept(this);
        }
        for (InterfaceRealization i : param.getRealized()) {
            i.accept(this);
        }
        for (TemplateParameter i : param.getTemplate()) {
            i.accept(this);
        }
        for (TemplateBinding i : param.getTemplateInstanciation()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("c85f452c-1f91-41a4-b463-ef1d7c18cf3f")
    @Override
    public Object visitNamespaceUse(final NamespaceUse param) {
        this.behavior.visitNamespaceUse(param);
        return super.visitNamespaceUse(param);
    }

    @objid ("2ed687e9-7df4-4bc5-834a-03932dd0e15d")
    @Override
    public Object visitNode(final Node param) {
        this.behavior.visitNode(param);
        return super.visitNode(param);
    }

    @objid ("5a28d098-e53b-4a9d-b372-60022301c394")
    @Override
    public Object visitNote(final Note param) {
        this.behavior.visitNote(param);
        return super.visitNote(param);
    }

    @objid ("2991fe06-a704-4d76-835e-a770c9191d65")
    @Override
    public Object visitNoteType(final NoteType param) {
        this.behavior.visitNoteType(param);
        Object lObject = super.visitNoteType(param);
        // IPointOfView not supported... (param.getContext)
        return lObject;
    }

    @objid ("1a50e738-7ccd-47da-bb3d-17e7cea17c09")
    @Override
    public Object visitObjectFlow(final ObjectFlow param) {
        this.behavior.visitObjectFlow(param);
        return super.visitObjectFlow(param);
    }

    @objid ("26124ab4-55f0-4f26-a496-d45e7f46ec51")
    @Override
    public Object visitObjectNode(final ObjectNode param) {
        return  super.visitObjectNode(param);
    }

    @objid ("fb99ff55-c775-4430-91db-bbd6f129027f")
    @Override
    public Object visitOccurrenceSpecification(final OccurrenceSpecification param) {
        Object lObject = super.visitOccurrenceSpecification(param);
        for (GeneralOrdering i : param.getToAfter()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("7896b5fc-f06c-4e79-89b1-35a250ecc6e9")
    @Override
    public Object visitOpaqueAction(final OpaqueAction param) {
        this.behavior.visitOpaqueAction(param);
        return super.visitOpaqueAction(param);
    }

    @objid ("c104118d-f18c-40aa-98f4-7d70373dfcd3")
    @Override
    public Object visitOpaqueBehavior(final OpaqueBehavior param) {
        this.behavior.visitOpaqueBehavior (param);
        Object lObject = super.visitOpaqueBehavior(param);
        return lObject;
    }

    @objid ("e5e8dd47-160e-403c-8dd5-d6f22dcd4708")
    @Override
    public Object visitOperation(final Operation param) {
        this.behavior.visitOperation(param);
        Object lObject = super.visitOperation(param);
        for (Collaboration i : param.getExample()) {
            i.accept(this);
        }
        for (Parameter i : param.getIO()) {
            i.accept(this);
        }
        for (Behavior i : param.getOwnedBehavior()) {
            i.accept(this);
        }
        for (CollaborationUse i : param.getOwnedCollaborationUse()) {
            i.accept(this);
        }
        for (ElementImport i : param.getOwnedImport()) {
            i.accept(this);
        }
        for (PackageImport i : param.getOwnedPackageImport()) {
            i.accept(this);
        }
        Parameter lReturn = param.getReturn();
        if (lReturn != null) {
            lReturn.accept(this);
        }
        for (TemplateParameter i : param.getTemplate()) {
            i.accept(this);
        }
        for (TemplateBinding i : param.getTemplateInstanciation()) {
            i.accept(this);
        }
        for (RaisedException i : param.getThrown()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("18de7b85-3755-46c0-8259-44ba9d553148")
    @Override
    public Object visitOutputPin(final OutputPin param) {
        this.behavior.visitOutputPin(param);
        return super.visitOutputPin(param);
    }

    @objid ("10de4c72-6aae-49ad-9642-db643aea1544")
    @Override
    public Object visitPackage(final Package param) {
        this.behavior.visitPackage(param);
        Object lObject = super.visitPackage(param);
        for (PackageMerge i : param.getMerge()) {
            i.accept(this);
        }
        
        //        if (param.equals(ReverseProperties.getInstance().getMModelServices().getModelFactory().getRoot()))
        //            ReverseProperties.getInstance().getMModelServices().getModelFactory().getUmlProject().accept(this);
        // IItem not supported... (param.getPart)
        // getRepresented() not supported... (Project)
        return lObject;
    }

    @objid ("00d6e5f0-a188-477b-9220-34475565889d")
    @Override
    public Object visitPackageImport(final PackageImport param) {
        this.behavior.visitPackageImport(param);
        return super.visitPackageImport(param);
    }

    @objid ("2ec55344-0263-4f13-a3c2-66613d2e2b35")
    @Override
    public Object visitPackageMerge(final PackageMerge param) {
        this.behavior.visitPackageMerge(param);
        return super.visitPackageMerge(param);
    }

    @objid ("fd98457e-cee4-4c1a-b4fc-09ded421f4d0")
    @Override
    public Object visitParameter(final Parameter param) {
        this.behavior.visitParameter(param);
        return super.visitParameter(param);
    }

    @objid ("5f8c6b0e-16af-43e4-af8f-fa0539938946")
    @Override
    public Object visitPartDecomposition(final PartDecomposition param) {
        this.behavior.visitPartDecomposition(param);
        return super.visitPartDecomposition(param);
    }

    @objid ("efd0bdfd-bcc3-4e6e-9a46-4de7581c7ffd")
    @Override
    public Object visitPin(final Pin param) {
        return super.visitPin(param);
    }

    @objid ("d340e14f-dc65-4057-ba55-3b626d6117af")
    @Override
    public Object visitPort(final Port param) {
        this.behavior.visitPort (param);
        Object lObject = super.visitPort(param);
        for (ProvidedInterface i: param.getProvided()) {
            i.accept(this);
        }
        for (RequiredInterface i: param.getRequired()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("2514b18a-6355-47e6-b140-a82b43685ff9")
    @Override
    public Object visitProject(final Project param) {
        //         behavior.visitProject (param);
        Object lObject = super.visitProject(param);
        //         Package lModel = param.getModel(); if (lModel != null) {
        //         lModel.accept(this); 
        //         }
        // // IItem not supported... (param.getRootItem)
        //        AnalystProject lRootRequirement = param.getRootRequirement(); 
        //        if (lRootRequirement != null) {
        //            lRootRequirement.accept(this); }
        return lObject;
        //        return null;
    }

    @objid ("1ccba286-4adc-442d-aaf4-ccb7fd6000bd")
    @Override
    public Object visitPropertyEnumerationLitteral(final PropertyEnumerationLitteral param) {
        // behavior.visitPropertyEnumerationLitteral (param);
        // Object lObject = super.visitPropertyEnumerationLitteral(param);
        // return lObject;
        return null;
    }

    @objid ("a06be698-8bb1-4d31-9980-34ceb5beacb1")
    @Override
    public Object visitPropertyType(final PropertyType param) {
        // behavior.visitPropertyType (param);
        // Object lObject = super.visitPropertyType(param);
        // return lObject;
        return null;
    }

    @objid ("d0196c4f-9588-44b7-8e0c-fa479beb7d1b")
    @Override
    public Object visitProvidedInterface(final ProvidedInterface param) {
        this.behavior.visitProvidedInterface (param);
        return super.visitProvidedInterface(param);
    }

    @objid ("ebecd5c6-b8da-4f74-9db0-50bcac1c25de")
    @Override
    public Object visitRaisedException(final RaisedException param) {
        this.behavior.visitRaisedException(param);
        return super.visitRaisedException(param);
    }

    @objid ("f2c6dabf-511f-4cf6-80f4-a4cf67174ae2")
    @Override
    public Object visitRegion(final Region param) {
        this.behavior.visitRegion(param);
        Object lObject = super.visitRegion(param);
        
        for (StateVertex pseudoState : param.getSub()){
        
            if( pseudoState instanceof FinalState){
                FinalState state = (FinalState) pseudoState;
                state.accept(this);
            }else if( pseudoState instanceof State){
                State state = (State) pseudoState;
                state.accept(this);
            }else if (pseudoState instanceof ConnectionPointReference){
                ConnectionPointReference connectionPointReference = (ConnectionPointReference) pseudoState;
                connectionPointReference.accept(this);
            }else if (pseudoState instanceof AbstractPseudoState){
                AbstractPseudoState abstractPseudoState = (AbstractPseudoState) pseudoState;
                abstractPseudoState.accept(this);
            }
        
        }
        return lObject;
    }

    @objid ("335032f5-ebf6-4aee-96e2-3827c146bfd3")
    @Override
    public Object visitRequiredInterface(final RequiredInterface param) {
        this.behavior.visitRequiredInterface (param);
        return super.visitRequiredInterface(param);
    }

    @objid ("22394634-30d5-49a5-aae1-db22ff07a8f8")
    @Override
    public Object visitRequirement(final Requirement param) {
        this.behavior.visitRequirement (param);
        return super.visitRequirement(param);
    }

    @objid ("4e882ee4-8a12-4512-ad08-93addf49051f")
    @Override
    public Object visitRequirementContainer(final RequirementContainer param) {
        if (ProfileUtils.isAnalystDeployed()){
            this.behavior.visitRequirementContainer (param);
            //         Object lObject = super.visitRequirementContainer(param);
            // AnalystPropertyTable lDefaultSet = param.getDefaultSet(); if
            // (lDefaultSet != null) { lDefaultSet.accept(this); }
            for (Requirement i: param.getOwnedRequirement()) { 
                i.accept(this); 
            }
            for (RequirementContainer i: param.getOwnedContainer()) { 
                i.accept(this); 
            }
        }
        //         return lObject;
        return null;
    }

    @objid ("00202c0a-5353-4c1f-9104-40c1bb12d0dc")
    @Override
    public Object visitSendSignalAction(final SendSignalAction param) {
        this.behavior.visitSendSignalAction(param);
        return super.visitSendSignalAction(param);
    }

    @objid ("8b05049a-e127-4a2d-b0f8-074f19d3456f")
    @Override
    public Object visitShallowHistoryPseudoState(final ShallowHistoryPseudoState param) {
        this.behavior.visitShallowHistoryPseudoState (param);
        return super.visitShallowHistoryPseudoState(param);
    }

    @objid ("bad17ddf-ab7a-49ad-b01f-f0bb1a78efa6")
    @Override
    public Object visitSignal(final Signal param) {
        this.behavior.visitSignal(param);
        return super.visitSignal(param);
    }

    @objid ("747c69f4-a3d5-499e-87cb-f6326da05174")
    @Override
    public Object visitState(final State param) {
        this.behavior.visitState(param);
        Object lObject = super.visitState(param);
        for (ConnectionPointReference i : param.getConnection()) {
            i.accept(this);
        }
        for (InternalTransition i : param.getInternal()) {
            i.accept(this);
        }
        
        for (Region i : param.getOwnedRegion()) {
            i.accept(this);
        }
        
        for(EntryPointPseudoState i : param.getEntryPoint()){
            i.accept(this);
        }
        
        for(ExitPointPseudoState i : param.getExitPoint()){
            i.accept(this);
        }
        return lObject;
    }

    @objid ("b3ce64b6-b5cf-4d31-b661-86e4784adf1f")
    @Override
    public Object visitStateInvariant(final StateInvariant param) {
        this.behavior.visitStateInvariant(param);
        return super.visitStateInvariant(param);
    }

    @objid ("6f36029a-f3e0-4720-b2cc-e5c2827098e5")
    @Override
    public Object visitStateMachine(final StateMachine param) {
        this.behavior.visitStateMachine(param);
        Object lObject = super.visitStateMachine(param);
        
        Region lTop = param.getTop();
        if (lTop != null) {
            lTop.accept(this);
        }
        
        for (Event event : param.getEComponent()){
            event.accept(this);    
        }
        
        for (EntryPointPseudoState entry : param.getEntryPoint()){
            entry.accept(this);
        }
        
        for (ExitPointPseudoState exit : param.getExitPoint()){
            exit.accept(this);
        }
        return lObject;
    }

    @objid ("245cef09-f87b-4889-a13b-f8995ea8de3d")
    @Override
    public Object visitStateVertex(final StateVertex param) {
        Object lObject = super.visitStateVertex(param);
        for (Transition i : param.getOutGoing()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("a0a545b6-3fae-4336-8f81-03fe80fa11ce")
    @Override
    public Object visitStereotype(final Stereotype param) {
        //        behavior.visitStereotype(param);
        //        Object lObject = super.visitStereotype(param);
        //        for (NoteType i: param.getRequiredNote()) { i.accept(this); }
        //        for (TagType i: param.getRequiredTag()) { i.accept(this); }
        //        for (Constraint i: param.getStereotypeConstraint()) {
        //        i.accept(this); }
        // // IPointOfView not supported... (param.getContext)
        //        return lObject;
        return null;
    }

    @objid ("3591f231-cbec-48fc-a101-4138ce499886")
    @Override
    public Object visitStructuredActivityNode(final StructuredActivityNode param) {
        this.behavior.visitStructuredActivityNode(param);
        Object lObject = super.visitStructuredActivityNode(param);
        for (ActivityNode i : param.getBody()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("6c620c84-0876-4463-b949-b13831ce7f9e")
    @Override
    public Object visitSubstitution(final Substitution param) {
        this.behavior.visitSubstitution(param);
        return super.visitSubstitution(param);
    }

    @objid ("bab571ab-faac-4869-8c8f-1fbb4e581db7")
    @Override
    public Object visitTagParameter(final TagParameter param) {
        //        behavior.visitTagParameter (param);
        //        Object lObject = super.visitTagParameter(param);
        //        return lObject;
        return null;
    }

    @objid ("09ae351e-d521-4b66-80d8-a1e22b5e36d7")
    @Override
    public Object visitTagType(final TagType param) {
        this.behavior.visitTagType (param);
        return super.visitTagType(param);
    }

    @objid ("abe32117-dd60-40fc-8aec-e424fb2e8eea")
    @Override
    public Object visitTaggedValue(final TaggedValue param) {
        this.behavior.visitTaggedValue (param);
        return super.visitTaggedValue(param);
    }

    @objid ("2c5a86c2-f31a-4a5e-9fbe-b9706f1def58")
    @Override
    public Object visitTemplateBinding(final TemplateBinding param) {
        this.behavior.visitTemplateBinding (param);
        Object lObject = super.visitTemplateBinding(param);
        for (TemplateParameterSubstitution i:
            param.getParameterSubstitution()) { i.accept(this); }
        return lObject;
    }

    @objid ("81562d7d-5014-4694-9838-21cef557e34b")
    @Override
    public Object visitTemplateParameter(final TemplateParameter param) {
        this.behavior.visitTemplateParameter (param);
        Object lObject = super.visitTemplateParameter(param);
        ModelElement lOwnedParameterElement = param.getOwnedParameterElement(); 
        if (lOwnedParameterElement != null) { 
            lOwnedParameterElement.accept(this); 
        }
        return lObject;
    }

    @objid ("58a65720-1ee0-4f6e-881b-c580f52b7f2c")
    @Override
    public Object visitTemplateParameterSubstitution(final TemplateParameterSubstitution param) {
        this.behavior.visitTemplateParameterSubstitution (param);
        return super.visitTemplateParameterSubstitution(param);
    }

    @objid ("aa5c3b6f-99b9-4ed1-8ca9-7a9aa4b4d197")
    @Override
    public Object visitTerm(final Term param) {
        // behavior.visitTerm (param);
        // Object lObject = super.visitTerm(param);
        // AnalystPropertyTable lProperties = param.getProperties(); if
        // (lProperties != null) { lProperties.accept(this); }
        // return lObject;
        return null;
    }

    @objid ("71cb7de8-f9c2-448c-8ab7-071b12366714")
    @Override
    public Object visitTerminatePseudoState(final TerminatePseudoState param) {
        this.behavior.visitTerminatePseudoState (param);
        return super.visitTerminatePseudoState(param);
    }

    @objid ("50a13f12-2a16-4245-8af8-6eb05762dcfa")
    @Override
    public Object visitTransition(final Transition param) {
        this.behavior.visitTransition(param);
        return super.visitTransition(param);
    }

    @objid ("d482c0be-6e45-458c-b765-3b69f71b0701")
    @Override
    public Object visitUsage(final Usage param) {
        this.behavior.visitUsage(param);
        return super.visitUsage(param);
    }

    @objid ("c0611e9e-cbd0-449a-99a8-a344f2f010b6")
    @Override
    public Object visitUseCase(final UseCase param) {
        this.behavior.visitUseCase(param);
        Object lObject = super.visitUseCase(param);
        for (ExtensionPoint i : param.getOwnedExtension()) {
            i.accept(this);
        }
        return lObject;
    }

    @objid ("a642fa68-3128-4623-bfce-e17285379765")
    @Override
    public Object visitUseCaseDependency(final UseCaseDependency param) {
        this.behavior.visitUseCaseDependency(param);
        return super.visitUseCaseDependency(param);
    }

    @objid ("49c4e125-a9c0-4054-818b-99f76824d21e")
    @Override
    public Object visitValuePin(final ValuePin param) {
        this.behavior.visitValuePin(param);
        return super.visitValuePin(param);
    }

    @objid ("ee327bca-4ebe-4d1a-988b-c834361332b2")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd param) {
        this.behavior.visitNaryAssociationEnd(param);
        return super.visitNaryAssociationEnd(param);
    }

    @objid ("187c89cd-00f4-493e-808f-a92be14e8fe1")
    @Override
    public Object visitNaryAssociation(NaryAssociation param) {
        this.behavior.visitNaryAssociation(param);
        return super.visitNaryAssociation(param);
    }

    @objid ("bc46aba9-95b0-4d70-b2cb-125abe1ca7c1")
    @Override
    public Object visitComponentRealization(final ComponentRealization param) {
        this.behavior.visitComponentRealization(param);
        return super.visitComponentRealization(param);
    }

}
