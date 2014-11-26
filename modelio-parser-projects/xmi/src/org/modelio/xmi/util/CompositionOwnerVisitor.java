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
                                    

package org.modelio.xmi.util;

import java.util.HashMap;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.Term;
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
import org.modelio.metamodel.uml.behavior.stateMachineModel.AbstractPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ChoicePseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.DeepHistoryPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ForkPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InitialPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JoinPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JunctionPseudoState;
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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Visitor of composition relationship
 * @author ebrosse
 */
@objid ("e728bd38-07d1-47e5-83c6-a09d700f7536")
public class CompositionOwnerVisitor {
    @objid ("505113fa-6266-4e87-a3ef-d2678830362e")
     MObject theParent = null;

    @objid ("1ae5e621-bf1f-47d3-9e49-a436df52cf44")
    private HashMap<MObject, MObject> ownershipMap = null;

    @objid ("67992bf6-7d70-4559-9372-4816e06da6e3")
    private CompositionOwnerSelector selector = null;

    @objid ("b11d8f7b-6cfe-4c8a-a9b2-943d5f76b4a6")
    public CompositionOwnerVisitor() {
        this.ownershipMap = new HashMap<>();
        this.selector = new CompositionOwnerSelector();
    }

    @objid ("df5cf3c7-e675-4a2e-ae21-a9f83af70aef")
    public MObject getCompositionOwner(MObject theChild) {
        this.theParent = this.ownershipMap.get(theChild);
        if (this.theParent == null){ 
            this.selector.launchVisit(theChild);
            this.ownershipMap.put(theChild, this.theParent);
        }
        return this.theParent;
    }

    @objid ("9c7f617a-64bf-4061-8fbc-7f47961963bd")
    private class CompositionOwnerSelector extends DefaultModelVisitor {
        @objid ("33db4dec-a3ba-4b0f-bbb2-1473f14890bc")
        public void launchVisit(MObject theChild) {
            theChild.accept(this);
        }

        @objid ("c9f95234-968b-44cf-9adb-a9f4ce0a1d9c")
        @Override
        public Object visitAbstractDiagram(AbstractDiagram child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAbstractDiagram(child);
            }
            return null;
        }

        @objid ("57871e35-a427-4101-b82e-333700c850bd")
        @Override
        public Object visitAbstractPseudoState(AbstractPseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getParent();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAbstractPseudoState(child);
            }
            return null;
        }

        @objid ("d2797fb3-5717-4511-8840-6dd57422684e")
        @Override
        public Object visitAbstraction(Abstraction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAbstraction(child);
            }
            return null;
        }

        @objid ("1b2188ac-b6a1-4ceb-a2f8-395d84755781")
        @Override
        public Object visitAcceptCallEventAction(AcceptCallEventAction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAcceptCallEventAction(child);
            }
            return null;
        }

        @objid ("f33ece6f-a4be-47d2-8a3e-e8e591e1f8c2")
        @Override
        public Object visitAcceptChangeEventAction(AcceptChangeEventAction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAcceptChangeEventAction(child);
            }
            return null;
        }

        @objid ("6cbb9d17-f62c-40a4-aa7b-9ef2398f947d")
        @Override
        public Object visitAcceptSignalAction(AcceptSignalAction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAcceptSignalAction(child);
            }
            return null;
        }

        @objid ("4a15b521-d49c-4046-8229-6901c65ac011")
        @Override
        public Object visitAcceptTimeEventAction(AcceptTimeEventAction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAcceptTimeEventAction(child);
            }
            return null;
        }

        @objid ("eb769d48-ac9f-47df-876a-04debb84548e")
        @Override
        public Object visitActivity(Activity child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitActivity(child);
            }
            return null;
        }

        @objid ("57505f19-9751-4cf3-bfbc-24d9feb95d18")
        @Override
        public Object visitActivityAction(ActivityAction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitActivityAction(child);
            }
            return null;
        }

        @objid ("49324852-9d6c-4363-bbfb-ac80d499d685")
        @Override
        public Object visitActivityEdge(ActivityEdge child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getSource();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitActivityEdge(child);
            }
            return null;
        }

        @objid ("f826bbb2-0813-4e62-9b00-6fdc6196c556")
        @Override
        public Object visitActivityFinalNode(ActivityFinalNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitActivityFinalNode(child);
            }
            return null;
        }

        @objid ("599ad6fe-7f37-4d4c-a766-11b5e2ab965f")
        @Override
        public Object visitActivityGroup(ActivityGroup child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getInActivity();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitActivityGroup(child);
            }
            return null;
        }

        @objid ("b6dbbd5a-f1b6-4b9e-a852-e28f42c9f7e7")
        @Override
        public Object visitActivityNode(ActivityNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwnerClause();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwnerNode();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwnerPartition();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitActivityNode(child);
            }
            return null;
        }

        @objid ("ea1b4547-7b4c-4ace-b0bc-e5ddcfb2377a")
        @Override
        public Object visitActivityParameterNode(ActivityParameterNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitActivityParameterNode(child);
            }
            return null;
        }

        @objid ("87a192ba-6c1f-499c-9893-17d0b855d10a")
        @Override
        public Object visitActivityPartition(ActivityPartition child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getSuperPartition();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitActivityPartition(child);
            }
            return null;
        }

        @objid ("1c168328-f741-48cb-ab99-76fa302f9ae1")
        @Override
        public Object visitActor(Actor child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitActor(child);
            }
            return null;
        }

        @objid ("0a631e58-b510-442f-be90-6e414d5d1c74")
        @Override
        public Object visitArtifact(Artifact child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitArtifact(child);
            }
            return null;
        }

        @objid ("468bcccf-a496-407a-bef9-421de13b87cd")
        @Override
        public Object visitAssociation(Association child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAssociation(child);
            }
            return null;
        }

        @objid ("e46f2bce-d1b4-446d-b07d-400e36a9debb")
        @Override
        public Object visitAssociationEnd(AssociationEnd child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAssociationEnd(child);
            }
            return null;
        }

        @objid ("40399047-eb8f-466a-91e6-1f89b7fe677f")
        @Override
        public Object visitAttribute(Attribute child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getQualified();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAttribute(child);
            }
            return null;
        }

        @objid ("32c5081e-585e-4c9f-bb18-2d36a5d8c6a5")
        @Override
        public Object visitAttributeLink(AttributeLink child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getAttributed();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitAttributeLink(child);
            }
            return null;
        }

        @objid ("8833f1b1-b444-4fa7-86d0-c6fed08a468e")
        @Override
        public Object visitBehavior(Behavior child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwnerOperation();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitBehavior(child);}
            return null;
        }

        @objid ("412f1f01-9a18-44c6-9889-25331b44e21b")
        @Override
        public Object visitBehaviorParameter(BehaviorParameter child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitBehaviorParameter(child);
            }
            return null;
        }

        @objid ("28b83303-3e8f-4a95-820d-7b35bdffca8e")
        @Override
        public Object visitBindableInstance(BindableInstance child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getCluster();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getInternalOwner();
            }
            
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitBindableInstance(child);
            }
            return null;
        }

        @objid ("e7a7abd8-f1f9-472a-a36c-376258c346df")
        @Override
        public Object visitBinding(Binding child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitBinding(child);
            }
            return null;
        }

        @objid ("f72e229c-bde2-4cc4-bdce-f946897e9f5e")
        @Override
        public Object visitCallAction(CallAction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCallAction(child);
            }
            return null;
        }

        @objid ("18b340f2-beaa-4e07-91f3-71b4e4e0a775")
        @Override
        public Object visitCallBehaviorAction(CallBehaviorAction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCallBehaviorAction(child);
            }
            return null;
        }

        @objid ("2cf57bbf-61cd-4853-8c48-cb931846eb4a")
        @Override
        public Object visitCallOperationAction(CallOperationAction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCallOperationAction(child);
            }
            return null;
        }

        @objid ("5db4b302-e670-400c-820d-eadde69ead0f")
        @Override
        public Object visitCentralBufferNode(CentralBufferNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCentralBufferNode(child);
            }
            return null;
        }

        @objid ("7ab27352-2f9c-4892-8676-297be3bd5547")
        @Override
        public Object visitChoicePseudoState(ChoicePseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitChoicePseudoState(child);
            }
            return null;
        }

        @objid ("3f567e19-1c81-4eea-aa25-10cfd6d2852f")
        @Override
        public Object visitClass(Class child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitClass(child);
            }
            return null;
        }

        @objid ("73fccfba-9931-4e44-9d39-aec46bacb70b")
        @Override
        public Object visitClassAssociation(ClassAssociation child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getAssociationPart();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitClassAssociation(child);
            }
            return null;
        }

        @objid ("1c139dc4-6aae-42ee-8bc5-03c138b5d65c")
        @Override
        public Object visitClassifier(Classifier child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitClassifier(child);
            }
            return null;
        }

        @objid ("5f16bf77-661d-41ab-adb9-acdf6cdc7d0b")
        @Override
        public Object visitClause(Clause child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitClause(child);
            }
            return null;
        }

        @objid ("f1428d44-39b0-4798-8fba-ea569154d817")
        @Override
        public Object visitCollaboration(Collaboration child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getBRepresented();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getORepresented();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCollaboration(child);
            }
            return null;
        }

        @objid ("6dc9591b-9f93-4719-8218-6dc64b822a00")
        @Override
        public Object visitCollaborationUse(CollaborationUse child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getNRepresented();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getORepresented();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCollaborationUse(child);}
            return null;
        }

        @objid ("a50392f3-8f00-404f-a90b-f941c60e435b")
        @Override
        public Object visitCombinedFragment(CombinedFragment child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCombinedFragment(child);
            }
            return null;
        }

        @objid ("31111c17-f6d3-4309-9fb3-6428df5275e8")
        @Override
        public Object visitCommunicationChannel(CommunicationChannel child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getStart();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCommunicationChannel(child);
            }
            return null;
        }

        @objid ("fd9fcfac-84d9-4574-a684-cc4e1ae5e2a5")
        @Override
        public Object visitCommunicationInteraction(CommunicationInteraction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCommunicationInteraction(child);
            }
            return null;
        }

        @objid ("60ca1001-3244-4356-af32-95920043061b")
        @Override
        public Object visitCommunicationMessage(CommunicationMessage child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getChannel();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getInvertedChannel();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCommunicationMessage(child);
            }
            return null;
        }

        @objid ("f2b5bed6-a43d-4e02-8141-4ec91e48a91e")
        @Override
        public Object visitCommunicationNode(CommunicationNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitCommunicationNode(child);
            }
            return null;
        }

        @objid ("7c4d1c83-ca28-47a0-bda2-4c12ce85c6c9")
        @Override
        public Object visitComponent(Component child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitComponent(child);
            }
            return null;
        }

        @objid ("c4cf25b5-7666-46e7-a96f-ea7c25c46e8c")
        @Override
        public Object visitConditionalNode(ConditionalNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitConditionalNode(child);
            }
            return null;
        }

        @objid ("99c45376-1e5d-481b-bba4-b3bf749d5c2f")
        @Override
        public Object visitConnectionPointReference(ConnectionPointReference child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwnerState();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitConnectionPointReference(child);
            }
            return null;
        }

        @objid ("8de74519-8c71-4d42-9dd1-5819177c06c5")
        @Override
        public Object visitConnector(Connector child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitConnector(child);
            }
            return null;
        }

        @objid ("e0b1f59b-b601-4a5f-be17-eb645b188660")
        @Override
        public Object visitConnectorEnd(ConnectorEnd child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitConnectorEnd(child);
            }
            return null;
        }

        @objid ("7205c6f4-d3b2-49ef-843e-3bd34cf920a8")
        @Override
        public Object visitConstraint(Constraint child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitConstraint(child);
            }
            return null;
        }

        @objid ("15340f35-55cb-4f11-8809-377e29a5490a")
        @Override
        public Object visitControlFlow(ControlFlow child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitControlFlow(child);
            }
            return null;
        }

        @objid ("41027761-53c7-45df-a3eb-5303eac612ed")
        @Override
        public Object visitControlNode(ControlNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitControlNode(child);
            }
            return null;
        }

        @objid ("15a62ea3-a6a6-4e14-81c0-82b8e71a7d84")
        @Override
        public Object visitDataFlow(DataFlow child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitDataFlow(child);
            }
            return null;
        }

        @objid ("b3af99ee-a062-4125-9fa1-b1c1a03a1a03")
        @Override
        public Object visitDataStoreNode(DataStoreNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitDataStoreNode(child);
            }
            return null;
        }

        @objid ("48fe7e4e-c97e-4375-846e-aa395ff34ab8")
        @Override
        public Object visitDataType(DataType child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitDataType(child);
            }
            return null;
        }

        @objid ("cbd6fcae-7cae-4fd8-92fe-e63a38a5a6c7")
        @Override
        public Object visitDecisionMergeNode(DecisionMergeNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitDecisionMergeNode(child);
            }
            return null;
        }

        @objid ("f95eeb92-c7db-4ca8-b2d0-75ae89ae67d5")
        @Override
        public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitDeepHistoryPseudoState(child);
            }
            return null;
        }

        @objid ("17941223-8da8-43f6-9048-0f347eb3427c")
        @Override
        public Object visitDependency(Dependency child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getImpacted();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitDependency(child);
            }
            return null;
        }

        @objid ("467bef10-f626-4ffb-9ae6-12f3a0879090")
        @Override
        public Object visitDictionary(Dictionary child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitDictionary(child);
            }
            return null;
        }

        @objid ("a3252578-991f-4166-aa39-25529f0def78")
        @Override
        public Object visitDurationConstraint(DurationConstraint child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitDurationConstraint(child);
            }
            return null;
        }

        @objid ("aa1dbabb-594c-4a42-9b23-8d4fdc27517a")
        @Override
        public Object visitElement(Element child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitElement(child);
            }
            return null;
        }

        @objid ("08df95f1-c03d-4deb-a190-3eef927f7279")
        @Override
        public Object visitElementImport(ElementImport child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getImportingNameSpace();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getImportingOperation();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitElementImport(child);
            }
            return null;
        }

        @objid ("b49f8b10-0cbf-4b10-9693-8ba66a07081c")
        @Override
        public Object visitElementRealization(ElementRealization child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitElementRealization(child);
            }
            return null;
        }

        @objid ("20b84f39-6fea-4bdb-95af-03f3b5aa7de9")
        @Override
        public Object visitEntryPointPseudoState(EntryPointPseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getEntryOf();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getEntryOfMachine();
            }
            
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitEntryPointPseudoState(child);
            }
            return null;
        }

        @objid ("5900384d-703f-430f-9cc9-fed64b820605")
        @Override
        public Object visitEnumeratedPropertyType(EnumeratedPropertyType child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitEnumeratedPropertyType(child);
            }
            return null;
        }

        @objid ("7654c367-705d-4c19-a4fb-e5acf4493c7f")
        @Override
        public Object visitEnumeration(Enumeration child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitEnumeration(child);
            }
            return null;
        }

        @objid ("880f2f67-39f8-4960-bd46-afdc80a07601")
        @Override
        public Object visitEnumerationLiteral(EnumerationLiteral child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getValuated();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitEnumerationLiteral(child);
            }
            return null;
        }

        @objid ("f19dbc2f-492f-49e3-923c-42b03286db0c")
        @Override
        public Object visitEvent(Event child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getComposed();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitEvent(child);
            }
            return null;
        }

        @objid ("c52a3527-f212-490f-bdb5-ca40e40a19ed")
        @Override
        public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitExecutionOccurenceSpecification(child);
            }
            return null;
        }

        @objid ("df2028c0-035c-4671-9f4a-8a594a6c71fa")
        @Override
        public Object visitExecutionSpecification(ExecutionSpecification child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitExecutionSpecification(child);
            }
            return null;
        }

        @objid ("66772827-4153-4e64-a77c-5c261921e1de")
        @Override
        public Object visitExitPointPseudoState(ExitPointPseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getExitOf();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getExitOfMachine();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitExitPointPseudoState(child);
            }
            return null;
        }

        @objid ("aa8759f4-7662-49ff-84d0-084999fae0f8")
        @Override
        public Object visitExtensionPoint(ExtensionPoint child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitExtensionPoint(child);
            }
            return null;
        }

        @objid ("ddd9abd3-f90b-48bb-94e4-cc70aae50711")
        @Override
        public Object visitFeature(Feature child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getCompositionOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitFeature(child);
            }
            return null;
        }

        @objid ("d7494b54-e025-4220-aeae-383856f323b8")
        @Override
        public Object visitFinalNode(FinalNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitFinalNode(child);
            }
            return null;
        }

        @objid ("33091902-7454-4592-a828-1a4d9e62a9d8")
        @Override
        public Object visitFlowFinalNode(FlowFinalNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitFlowFinalNode(child);
            }
            return null;
        }

        @objid ("a5aab385-8fcc-48b8-a0db-be3dd690c17d")
        @Override
        public Object visitForkJoinNode(ForkJoinNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitForkJoinNode(child);
            }
            return null;
        }

        @objid ("37c16e84-a7f4-4f98-976e-38f06d54dc36")
        @Override
        public Object visitForkPseudoState(ForkPseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitForkPseudoState(child);
            }
            return null;
        }

        @objid ("c593d38a-5804-4c28-8bc2-3652af89ee2b")
        @Override
        public Object visitGate(Gate child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwnerFragment();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwnerInteraction();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwnerUse();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitGate(child);
            }
            return null;
        }

        @objid ("b36da865-f182-4a99-8ce4-c5c0a5b0e765")
        @Override
        public Object visitGeneralClass(GeneralClass child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitGeneralClass(child);
            }
            return null;
        }

        @objid ("e7b769f2-0499-404b-a470-95f162d056c9")
        @Override
        public Object visitGeneralOrdering(GeneralOrdering child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getBefore();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitGeneralOrdering(child);
            }
            return null;
        }

        @objid ("eb40c586-8228-4d2a-a15a-2444dfd28e58")
        @Override
        public Object visitGeneralization(Generalization child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getSubType();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitGeneralization(child);
            }
            return null;
        }

        @objid ("1e7c4370-64ff-43b8-bdd9-94fb9c681351")
        @Override
        public Object visitInformationFlow(InformationFlow child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInformationFlow(child);
            }
            return null;
        }

        @objid ("cd7d1991-9a4e-415c-99eb-3b7272b567a5")
        @Override
        public Object visitInformationItem(InformationItem child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInformationItem(child);
            }
            return null;
        }

        @objid ("15628b40-5296-4656-b0a9-9e6232fe6dad")
        @Override
        public Object visitInitialNode(InitialNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInitialNode(child);
            }
            return null;
        }

        @objid ("dc29ecff-529c-4757-8a25-dbc595f9fe2d")
        @Override
        public Object visitInitialPseudoState(InitialPseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInitialPseudoState(child);
            }
            return null;
        }

        @objid ("b7d4f247-5896-46aa-a9a5-839a503d94dc")
        @Override
        public Object visitInputPin(InputPin child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getInputing();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInputPin(child);
            }
            return null;
        }

        @objid ("cdc816be-9869-4005-a128-49e0b290f122")
        @Override
        public Object visitInstance(Instance child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInstance(child);
            }
            return null;
        }

        @objid ("d55a5002-632d-4953-b975-687ca47d2a65")
        @Override
        public Object visitInstanceNode(InstanceNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInstanceNode(child);
            }
            return null;
        }

        @objid ("ac3a97f1-f055-47d7-ac99-923c451e85e9")
        @Override
        public Object visitInteraction(Interaction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInteraction(child);
            }
            return null;
        }

        @objid ("59d06b8a-4535-490b-9131-86804a07a129")
        @Override
        public Object visitInteractionFragment(InteractionFragment child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getEnclosingInteraction();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getEnclosingOperand();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInteractionFragment(child);
            }
            return null;
        }

        @objid ("d949c16c-6d4f-4fff-a7f1-d00af5ce0afa")
        @Override
        public Object visitInteractionOperand(InteractionOperand child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwnerFragment();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInteractionOperand(child);
            }
            return null;
        }

        @objid ("eb458697-5cfb-44cb-b926-0ae702df0496")
        @Override
        public Object visitInteractionUse(InteractionUse child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInteractionUse(child);
            }
            return null;
        }

        @objid ("b007c983-f945-4917-a7de-d6f43edc4794")
        @Override
        public Object visitInterface(Interface child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInterface(child);
            }
            return null;
        }

        @objid ("55f3a028-90fd-4ba3-8ada-9f3031a68c92")
        @Override
        public Object visitInterfaceRealization(InterfaceRealization child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getImplementer();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInterfaceRealization(child);
            }
            return null;
        }

        @objid ("98c47a4b-6160-4dc3-b6a6-1f6bd56cbc9d")
        @Override
        public Object visitInternalTransition(InternalTransition child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getSComposed();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInternalTransition(child);
            }
            return null;
        }

        @objid ("6fa1472b-d811-4ee8-ba57-10e854fa7839")
        @Override
        public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitInterruptibleActivityRegion(child);
            }
            return null;
        }

        @objid ("c73e05d0-1e31-40dd-a940-748cf0081e4e")
        @Override
        public Object visitJoinPseudoState(JoinPseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitJoinPseudoState(child);
            }
            return null;
        }

        @objid ("924b6426-5b01-4ba5-8a4d-d222804e9963")
        @Override
        public Object visitJunctionPseudoState(JunctionPseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitJunctionPseudoState(child);
            }
            return null;
        }

        @objid ("3dbfda9a-dcd7-4e6b-aded-000a9e671289")
        @Override
        public Object visitLifeline(Lifeline child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitLifeline(child);
            }
            return null;
        }

        @objid ("f048e10f-2a3b-4a4a-8614-807cdce44fdf")
        @Override
        public Object visitLink(Link child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitLink(child);
            }
            return null;
        }

        @objid ("bbe5e80d-8aa2-41cc-a74b-2243d9be9eb9")
        @Override
        public Object visitLinkEnd(LinkEnd child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getLink();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitLinkEnd(child);
            }
            return null;
        }

        @objid ("0129f757-e084-4c2e-9a2d-8f861157ee8f")
        @Override
        public Object visitLoopNode(LoopNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitLoopNode(child);
            }
            return null;
        }

        @objid ("fa0cd265-93b4-4694-a2f1-5113dc8a5c9e")
        @Override
        public Object visitManifestation(Manifestation child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitManifestation(child);
            }
            return null;
        }

        @objid ("4842fefa-3cba-4856-9a0e-f38442d1cf43")
        @Override
        public Object visitMessage(Message child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getSendEvent();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitMessage(child);
            }
            return null;
        }

        @objid ("38b97d8e-3438-4584-bdfb-619c678779ca")
        @Override
        public Object visitMessageEnd(MessageEnd child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitMessageEnd(child);
            }
            return null;
        }

        @objid ("1ced87fe-f6d1-4aeb-ab75-c9a9369a49e3")
        @Override
        public Object visitMessageFlow(MessageFlow child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getSourcePartition();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitMessageFlow(child);
            }
            return null;
        }

        @objid ("4cfeab28-cd83-46bb-b436-85086645957c")
        @Override
        public Object visitModelElement(ModelElement child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwnerTemplateParameter();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitModelElement(child);
            }
            return null;
        }

        @objid ("d27dda54-0191-4404-9057-5aad90c20544")
        @Override
        public Object visitModelTree(ModelTree child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitModelTree(child);
            }
            return null;
        }

        @objid ("5a1e5067-a462-4d8c-a0b7-2634c7054bd7")
        @Override
        public Object visitNameSpace(NameSpace child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitNameSpace(child);
            }
            return null;
        }

        @objid ("636980d0-e261-45b7-bc3c-cd8d6982cb06")
        @Override
        public Object visitNamespaceUse(NamespaceUse child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitNamespaceUse(child);
            }
            return null;
        }

        @objid ("809fdb8d-adde-44cf-ade0-bcb30852db84")
        @Override
        public Object visitNode(Node child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitNode(child);
            }
            return null;
        }

        @objid ("778cd2c3-2ea6-4a99-83a8-f579ec4f04c0")
        @Override
        public Object visitNote(Note child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getSubject();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitNote(child);
            }
            return null;
        }

        @objid ("11c7dc8f-e078-4616-806a-659c71424d0f")
        @Override
        public Object visitNoteType(NoteType child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitNoteType(child);
            }
            return null;
        }

        @objid ("c65af2bd-3538-4b00-9435-47c51f80e6ee")
        @Override
        public Object visitObjectFlow(ObjectFlow child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitObjectFlow(child);
            }
            return null;
        }

        @objid ("73fa720b-da15-46fd-8e41-ed6945c7df59")
        @Override
        public Object visitObjectNode(ObjectNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitObjectNode(child);
            }
            return null;
        }

        @objid ("8de348dc-0a21-47d0-aeb3-ca82215ca7cd")
        @Override
        public Object visitOccurrenceSpecification(OccurrenceSpecification child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitOccurrenceSpecification(child);
            }
            return null;
        }

        @objid ("bdca478c-2a6b-4255-b962-ace2523975e7")
        @Override
        public Object visitOpaqueAction(OpaqueAction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitOpaqueAction(child);
            }
            return null;
        }

        @objid ("942e1397-d1ee-4f66-a4fc-116a2cd76a79")
        @Override
        public Object visitOpaqueBehavior(OpaqueBehavior child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitOpaqueBehavior(child);
            }
            return null;
        }

        @objid ("07cb2199-683f-4fff-9356-24d88b31a142")
        @Override
        public Object visitOperation(Operation child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitOperation(child);
            }
            return null;
        }

        @objid ("2a54e0b8-848e-4086-b80b-f2bd14cebac1")
        @Override
        public Object visitOutputPin(OutputPin child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOutputing();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitOutputPin(child);
            }
            return null;
        }

        @objid ("49042608-e3bf-454d-a047-95eab0c7d8db")
        @Override
        public Object visitPackage(Package child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitPackage(child);
            }
            return null;
        }

        @objid ("7724612e-ee26-4d4d-bca3-5fb8fae94251")
        @Override
        public Object visitPackageImport(PackageImport child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getImportingNameSpace();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getImportingOperation();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitPackageImport(child);
            }
            return null;
        }

        @objid ("1a0d0ae9-82eb-4083-a1f3-c189ee1e2c2b")
        @Override
        public Object visitPackageMerge(PackageMerge child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getReceivingPackage();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitPackageMerge(child);
            }
            return null;
        }

        @objid ("d5e3e659-4530-4261-924c-d145eadb4b4e")
        @Override
        public Object visitParameter(Parameter child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getComposed();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getReturned();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitParameter(child);
            }
            return null;
        }

        @objid ("e84dd042-04e5-42a7-a144-f143125f6d28")
        @Override
        public Object visitPartDecomposition(PartDecomposition child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitPartDecomposition(child);
            }
            return null;
        }

        @objid ("b22c5a90-211a-4bd9-a94c-974fbe285925")
        @Override
        public Object visitPin(Pin child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitPin(child);
            }
            return null;
        }

        @objid ("3fd6fb13-2154-40c4-a02c-88a0017f3a21")
        @Override
        public Object visitPort(Port child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitPort(child);
            }
            return null;
        }

        @objid ("580e2bb5-b4ae-4c8e-be38-5f61e0d0dcb1")
        @Override
        public Object visitProject(Project child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitProject(child);
            }
            return null;
        }

        @objid ("619bcc00-a7a2-4c9e-8520-67d0ac567fa7")
        @Override
        public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitPropertyEnumerationLitteral(child);
            }
            return null;
        }

        @objid ("119a9480-5a05-4e56-9196-f7c0231aa6cd")
        @Override
        public Object visitPropertyType(PropertyType child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getCompositionOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitPropertyType(child);
            }
            return null;
        }

        @objid ("4b10e276-fd2e-4e58-8653-f5b94e7cd7ab")
        @Override
        public Object visitProvidedInterface(ProvidedInterface child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getProviding();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitProvidedInterface(child);
            }
            return null;
        }

        @objid ("376c8b35-9f9a-40ba-b9a7-457d9bda0b0c")
        @Override
        public Object visitRaisedException(RaisedException child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getThrower();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitRaisedException(child);
            }
            return null;
        }

        @objid ("38b205b0-c7d5-42ef-87fb-b9b79c5f1fa0")
        @Override
        public Object visitRequiredInterface(RequiredInterface child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getRequiring();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitRequiredInterface(child);
            }
            return null;
        }

        @objid ("f7bdc673-89be-4e63-ae91-a67d297d20c6")
        @Override
        public Object visitRequirement(Requirement child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitRequirement(child);
            }
            return null;
        }

        @objid ("f5c62c17-d813-4851-94a9-324a339f32c2")
        @Override
        public Object visitSendSignalAction(SendSignalAction child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitSendSignalAction(child);
            }
            return null;
        }

        @objid ("2a98acaf-8d8c-41da-9a9d-27e800d9eb6f")
        @Override
        public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitShallowHistoryPseudoState(child);
            }
            return null;
        }

        @objid ("e9bb7b2c-6a46-4ecc-b44c-5ab0c1c4b41b")
        @Override
        public Object visitSignal(Signal child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitSignal(child);
            }
            return null;
        }

        @objid ("ae67956e-b2b2-4893-9889-1f18c26454f7")
        @Override
        public Object visitState(State child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getParent();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitState(child);
            }
            return null;
        }

        @objid ("a3c1de70-5d49-44b1-b66b-76cb58d91281")
        @Override
        public Object visitStateInvariant(StateInvariant child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitStateInvariant(child);
            }
            return null;
        }

        @objid ("df1f864b-2b53-42fa-ba37-005ec331e7d2")
        @Override
        public Object visitStateMachine(StateMachine child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitStateMachine(child);
            }
            return null;
        }

        @objid ("480a7814-2f8c-4570-9bc9-525526529807")
        @Override
        public Object visitStateVertex(StateVertex child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitStateVertex(child);
            }
            return null;
        }

        @objid ("4a478665-ad62-4b73-80b6-161106ea5620")
        @Override
        public Object visitStereotype(Stereotype child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitStereotype(child);
            }
            return null;
        }

        @objid ("0f8a9af0-6394-4b59-8ea1-a7355a3b55b2")
        @Override
        public Object visitStructuredActivityNode(StructuredActivityNode child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitStructuredActivityNode(child);
            }
            return null;
        }

        @objid ("761badbb-8225-4af7-93ed-d728bd0d1221")
        @Override
        public Object visitSubstitution(Substitution child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getSubstitutingClassifier();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitSubstitution(child);
            }
            return null;
        }

        @objid ("6615255a-8e3b-4346-af37-f37204fa2609")
        @Override
        public Object visitTagParameter(TagParameter child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getAnnoted();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getQualified();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitTagParameter(child);
            }
            return null;
        }

        @objid ("3d4c93ac-30df-43a4-99fd-c975f712a543")
        @Override
        public Object visitTagType(TagType child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitTagType(child);
            }
            return null;
        }

        @objid ("f565a398-cec9-4d19-a207-efc10862128d")
        @Override
        public Object visitTaggedValue(TaggedValue child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getAnnoted();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitTaggedValue(child);
            }
            return null;
        }

        @objid ("d757d1b4-972d-4682-ba0e-f08b6ab61a20")
        @Override
        public Object visitTemplateBinding(TemplateBinding child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getBoundElement();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getBoundOperation();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitTemplateBinding(child);
            }
            return null;
        }

        @objid ("ba1532f2-9fb4-4fad-82b4-b982f2247edb")
        @Override
        public Object visitTemplateParameter(TemplateParameter child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getParameterized();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getParameterizedOperation();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitTemplateParameter(child);
            }
            return null;
        }

        @objid ("e7d037d8-cbc0-46d5-aeb2-b27a129944c8")
        @Override
        public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getOwner();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitTemplateParameterSubstitution(child);
            }
            return null;
        }

        @objid ("45d3d153-9815-49f5-a8f4-d0a58183e101")
        @Override
        public Object visitTerm(Term child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitTerm(child);
            }
            return null;
        }

        @objid ("ba7b503d-0583-4e23-8a6b-d4e4a8162c6c")
        @Override
        public Object visitTerminatePseudoState(TerminatePseudoState child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitTerminatePseudoState(child);
            }
            return null;
        }

        @objid ("d9dcf97f-bfd4-49ce-bb9f-856035f5741f")
        @Override
        public Object visitTransition(Transition child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                CompositionOwnerVisitor.this.theParent = child.getSource();
            }
            
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitTransition(child);
            }
            return null;
        }

        @objid ("db6baa09-4640-4be0-a951-8782fb528c4b")
        @Override
        public Object visitUsage(Usage child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitUsage(child);
            }
            return null;
        }

        @objid ("25b108a4-cd03-46ef-b35a-6bf03f75490c")
        @Override
        public Object visitUseCase(UseCase child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitUseCase(child);
            }
            return null;
        }

        @objid ("5e143b86-d775-4dec-8f10-fbe63887aba0")
        @Override
        public Object visitUseCaseDependency(UseCaseDependency child) {
            if (CompositionOwnerVisitor.this.theParent == null){
                super.visitUseCaseDependency(child);
            }
            return null;
        }

        @objid ("b260cb46-e4dd-419b-b2c7-359f20c0e8a0")
        public CompositionOwnerSelector() {
            super();
        }

    }

}
