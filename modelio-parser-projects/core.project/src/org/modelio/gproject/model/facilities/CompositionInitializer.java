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
                                    

package org.modelio.gproject.model.facilities;

import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.api.MTools;
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
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
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
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
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
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
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
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
import org.modelio.metamodel.uml.statik.Artifact;
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
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.uml.statik.NaryAssociation;
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
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Composition initializer service.
 * <p>
 * Use it to move an element under another one.
 */
@objid ("01f40498-0000-6d48-0000-000000000000")
public class CompositionInitializer extends DefaultModelVisitor {
    @objid ("00152bce-f750-1090-8d81-001ec947cd2a")
    protected SmDependency smDep;

    @objid ("0015334e-f750-1090-8d81-001ec947cd2a")
    protected final SmObjectImpl parent;

    /**
     * Instantiate a composition initializer.
     * @param parent the new composition parent where elements will be initialized.
     */
    @objid ("01f40498-0000-7682-0000-000000000000")
    public CompositionInitializer(final SmObjectImpl parent) {
        this.parent = parent;
    }

    /**
     * Attach the given element to the parent element.
     * @param obj the element to attach
     * @param dep optional, the metamodel dependency to use to attach the element.
     * @return <code>true</code> if the object was successfully attached, <code>false</code> if it
     * is impossible to attach the element to the parent.
     */
    @objid ("01f40498-0000-778a-0000-000000000000")
    public boolean execute(final SmObjectImpl obj, final SmDependency dep) {
        this.smDep = dep;
        return (boolean) obj.accept(this);
    }

    @objid ("01f40498-0000-72ea-0000-000000000000")
    @Override
    public Object visitActivityEdge(ActivityEdge theActivityEdge) {
        if (this.parent instanceof ActivityNode) {
            theActivityEdge.setSource((ActivityNode) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-72fa-0000-000000000000")
    @Override
    public Object visitActivityGroup(ActivityGroup theActivityGroup) {
        if (this.parent instanceof Activity) {
            theActivityGroup.setInActivity((Activity) this.parent);
            return true;
        } else {
            return visitModelElement(theActivityGroup);
        }
    }

    @objid ("01f40498-0000-7302-0000-000000000000")
    @Override
    public Object visitActivityNode(ActivityNode theActivityNode) {
        if (this.parent instanceof Activity) {
            theActivityNode.setOwner((Activity) this.parent);
            return true;
        } else if (this.parent instanceof StructuredActivityNode) {
            theActivityNode.setOwnerNode((StructuredActivityNode) this.parent);
            return true;
        } else if (this.parent instanceof Clause) {
            theActivityNode.setOwnerClause((Clause) this.parent);
            return true;
        } else if (this.parent instanceof ActivityPartition) {
            theActivityNode.setOwnerPartition((ActivityPartition) this.parent);
            return true;
        } else {
            return visitModelElement(theActivityNode);
        }
    }

    @objid ("01f40498-0000-7312-0000-000000000000")
    @Override
    public Object visitActivityPartition(ActivityPartition theActivityPartition) {
        if (this.parent instanceof ActivityPartition) {
            theActivityPartition.setSuperPartition((ActivityPartition) this.parent);
            return true;
        } else {
            return visitActivityGroup(theActivityPartition);
        }
    }

    @objid ("01f40498-0000-6f22-0000-000000000000")
    @Override
    public Object visitAssociationEnd(AssociationEnd theAssociationEnd) {
        if (this.parent instanceof Classifier) {
            theAssociationEnd.setSource((Classifier) this.parent, true);
            return true;
        } else if (this.parent instanceof AssociationEnd) {
            theAssociationEnd.setOpposite((AssociationEnd) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6f32-0000-000000000000")
    @Override
    public Object visitAttributeLink(AttributeLink theAttributeLink) {
        if (this.parent instanceof Instance) {
            theAttributeLink.setAttributed((Instance) this.parent);
            return true;
        }
        return false;
    }

    @objid ("b11f01c0-dc0d-11dd-84d5-001ec947ccaf")
    @Override
    public Object visitAttribute(Attribute theAttribute) {
        if (this.parent instanceof AssociationEnd) {
            theAttribute.setQualified((AssociationEnd) this.parent);
            return true;
        } else if (this.parent instanceof Classifier) {
            theAttribute.setOwner((Classifier) this.parent);
            return true;
        } else {
            return visitFeature(theAttribute);
        }
    }

    @objid ("01f40498-0000-73f2-0000-000000000000")
    @Override
    public Object visitBehavior(Behavior theBehavior) {
        if (this.parent instanceof NameSpace) {
            theBehavior.setOwner((NameSpace) this.parent);
            return true;
        } else if (this.parent instanceof Operation) {
            theBehavior.setOwnerOperation((Operation) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-73fa-0000-000000000000")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter theBehaviorParameter) {
        if (this.parent instanceof Behavior) {
            theBehaviorParameter.setOwner((Behavior) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6f3a-0000-000000000000")
    @Override
    public Object visitBindableInstance(BindableInstance theBindableInstance) {
        if (this.parent instanceof Instance) {
            theBindableInstance.setCluster((Instance) this.parent);
            return true;
        } else if (this.parent instanceof Classifier) {
            theBindableInstance.setInternalOwner((Classifier) this.parent);
            return true;
        } else if (this.parent instanceof Collaboration) {
            theBindableInstance.setOwner((NameSpace) this.parent);
            return true;
        } else {
            // Bypass visitInstance() and jump directly to ModelElement
            return visitModelElement(theBindableInstance);
        }
    }

    @objid ("17a71fe4-de37-11dd-a2cc-001ec947ccaf")
    @Override
    public Object visitBinding(Binding theBinding) {
        if (this.parent instanceof CollaborationUse) {
            theBinding.setOwner((CollaborationUse) this.parent);
            return true;
        } else {
            return visitModelElement(theBinding);
        }
    }

    @objid ("01f40498-0000-6f52-0000-000000000000")
    @Override
    public Object visitClassAssociation(ClassAssociation theClassAssociation) {
        if (this.parent instanceof NaryAssociation) {
            theClassAssociation.setNaryAssociationPart((NaryAssociation) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-7342-0000-000000000000")
    @Override
    public Object visitClause(Clause theClause) {
        if (this.parent instanceof ConditionalNode) {
            theClause.setOwner((ConditionalNode) this.parent);
            return true;
        } else {
            return visitModelElement(theClause);
        }
    }

    @objid ("01f40498-0000-6f62-0000-000000000000")
    @Override
    public Object visitCollaboration(Collaboration theCollaboration) {
        // Under Modelio, a collaboration belongs to a UseCase,
        // a Class, a Package, a Collaboration or an Operation.
        
        if (this.parent instanceof Operation) {
            theCollaboration.setORepresented((Operation) this.parent);
            return true;
        } else if (this.parent instanceof Behavior) {
            theCollaboration.setBRepresented((Behavior) this.parent);
            return true;
        } else if (this.parent instanceof Actor || this.parent instanceof Class || this.parent instanceof Collaboration
                || this.parent instanceof Interface || this.parent instanceof Package || this.parent instanceof Signal
                || this.parent instanceof UseCase) {
            theCollaboration.setOwner((ModelTree) this.parent);
            return true;
        } else {
            return visitModelElement(theCollaboration);
        }
    }

    @objid ("1944599d-c5df-11dd-93b6-0014222a9f79")
    @Override
    public Object visitCollaborationUse(CollaborationUse theCollaborationUse) {
        // Under Modelio, a collaboration belongs to a UseCase,
        // a Class, a Package, a Collaboration or an Operation.
        
        if (this.parent instanceof Operation) {
            theCollaborationUse.setORepresented((Operation) this.parent);
            return true;
        } else if (this.parent instanceof Class || this.parent instanceof Collaboration || this.parent instanceof Component
                || this.parent instanceof Node || this.parent instanceof Signal || this.parent instanceof UseCase
                || this.parent instanceof Actor) {
            theCollaborationUse.setNRepresented((NameSpace) this.parent);
            return true;
        } else {
            return visitModelElement(theCollaborationUse);
        }
    }

    @objid ("01f40498-0000-7572-0000-000000000000")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage theCommunicationMessage) {
        if (this.parent instanceof CommunicationChannel) {
            theCommunicationMessage.setChannel((CommunicationChannel) this.parent);
            return true;
        } else {
            return visitModelElement(theCommunicationMessage);
        }
    }

    @objid ("01f40498-0000-7562-0000-000000000000")
    @Override
    public Object visitCommunicationNode(CommunicationNode theCommunicationNode) {
        if (this.parent instanceof CommunicationInteraction) {
            theCommunicationNode.setOwner((CommunicationInteraction) this.parent);
            return true;
        } else {
            return visitModelElement(theCommunicationNode);
        }
    }

    @objid ("106b5f56-67de-11de-ad13-0014222a9f79")
    @Override
    public Object visitModuleParameter(ModuleParameter theConfigParam) {
        if (this.parent instanceof ModuleComponent) {
            theConfigParam.setOwner((ModuleComponent) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-74b2-0000-000000000000")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference theConnectionPointReference) {
        if (this.parent instanceof State) {
            theConnectionPointReference.setOwnerState((State) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6e72-0000-000000000000")
    @Override
    public Object visitConstraint(Constraint theConstraint) {
        if (this.parent instanceof ModelElement) {
            theConstraint.getConstrainedElement().add((ModelElement) this.parent);
            return true;
        } else {
            return visitModelElement(theConstraint);
        }
    }

    @objid ("01f40498-0000-70f2-0000-000000000000")
    @Override
    public Object visitDataFlow(DataFlow theDataFlow) {
        if (this.parent instanceof NameSpace) {
            theDataFlow.setOwner((NameSpace) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6e7a-0000-000000000000")
    @Override
    public Object visitDependency(Dependency theDependency) {
        if (this.parent instanceof ModelElement) {
            theDependency.setImpacted((ModelElement) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-7072-0000-000000000000")
    @Override
    public Object visitDictionary(Dictionary theDictionary) {
        if (this.parent instanceof Dictionary) {
            theDictionary.setOwnerDictionary((Dictionary) this.parent);
            return true;
        } else if (this.parent instanceof AnalystProject) {
            theDictionary.setOwnerProject((AnalystProject) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6e82-0000-000000000000")
    @Override
    public Object visitElement(Element theElement) {
        // do nothing
        return false;
    }

    @objid ("01f40498-0000-6f92-0000-000000000000")
    @Override
    public Object visitElementImport(ElementImport theElementImport) {
        if (this.parent instanceof NameSpace) {
            theElementImport.setImportingNameSpace((NameSpace) this.parent);
            return true;
        } else if (this.parent instanceof Operation) {
            theElementImport.setImportingOperation((Operation) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6faa-0000-000000000000")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral theEnumerationLiteral) {
        if (this.parent instanceof Enumeration) {
            theEnumerationLiteral.setValuated((Enumeration) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-7412-0000-000000000000")
    @Override
    public Object visitEvent(Event theEvent) {
        if (this.parent instanceof Behavior) {
            theEvent.setComposed((Behavior) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-7552-0000-000000000000")
    @Override
    public Object visitExtensionPoint(ExtensionPoint theExtensionPoint) {
        if (this.parent instanceof UseCase) {
            theExtensionPoint.setOwner((UseCase) this.parent);
            return true;
        } else {
            return visitModelElement(theExtensionPoint);
        }
    }

    @objid ("01f40498-0000-6fb2-0000-000000000000")
    @Override
    public Object visitFeature(Feature theFeature) {
        return visitModelElement(theFeature);
    }

    @objid ("01f40498-0000-743a-0000-000000000000")
    @Override
    public Object visitGate(Gate theGate) {
        if (this.parent instanceof Interaction) {
            theGate.setOwnerInteraction((Interaction) this.parent);
            return true;
        } else if (this.parent instanceof CombinedFragment) {
            theGate.setOwnerFragment((CombinedFragment) this.parent);
            return true;
        } else if (this.parent instanceof InteractionUse) {
            theGate.setOwnerUse((InteractionUse) this.parent);
            return true;
        } else {
            // Skip InteractionFragment::initComposed()
            return visitModelElement(theGate);
        }
    }

    @objid ("01f40498-0000-6fc2-0000-000000000000")
    @Override
    public Object visitGeneralization(Generalization theGeneralization) {
        if (this.parent instanceof NameSpace) {
            theGeneralization.setSubType((NameSpace) this.parent);
            return true;
        } else {
            return visitModelElement(theGeneralization);
        }
    }

    @objid ("adcbecd8-139b-11de-8798-0014222a9f79")
    @Override
    public Object visitInformationFlow(InformationFlow theInformationFlow) {
        if (this.parent instanceof NameSpace) {
            theInformationFlow.setOwner((NameSpace) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-738a-0000-000000000000")
    @Override
    public Object visitInputPin(InputPin theInputPin) {
        if (this.parent instanceof ActivityAction) {
            theInputPin.setInputing((ActivityAction) this.parent);
            return true;
        } else {
            // Skip inheritance to ActivityNode
            return visitModelElement(theInputPin);
        }
    }

    @objid ("01f40498-0000-6fca-0000-000000000000")
    @Override
    public Object visitInstance(Instance theInstance) {
        if (this.parent instanceof NameSpace) {
            theInstance.setOwner((NameSpace) this.parent);
            return true;
        } else {
            return visitModelElement(theInstance);
        }
    }

    @objid ("01f40498-0000-7452-0000-000000000000")
    @Override
    public Object visitInteractionFragment(InteractionFragment theInteractionFragment) {
        if (this.parent instanceof Interaction) {
            theInteractionFragment.setEnclosingInteraction((Interaction) this.parent);
            return true;
        } else if (this.parent instanceof InteractionOperand) {
            theInteractionFragment.setEnclosingOperand((InteractionOperand) this.parent);
            return true;
        } else {
            return visitModelElement(theInteractionFragment);
        }
    }

    @objid ("01f40498-0000-745a-0000-000000000000")
    @Override
    public Object visitInteractionOperand(InteractionOperand theInteractionOperand) {
        if (this.parent instanceof CombinedFragment) {
            theInteractionOperand.setOwnerFragment((CombinedFragment) this.parent);
            return true;
        } else {
            // Skip InteractionFragment
            return visitModelElement(theInteractionOperand);
        }
    }

    @objid ("01f40498-0000-6fda-0000-000000000000")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization theInterfaceRealization) {
        if (this.parent instanceof NameSpace) {
            theInterfaceRealization.setImplementer((NameSpace) this.parent);
            return true;
        } else {
            return visitModelElement(theInterfaceRealization);
        }
    }

    @objid ("01f40498-0000-74e2-0000-000000000000")
    @Override
    public Object visitInternalTransition(InternalTransition theInternalTransition) {
        if (this.parent instanceof State) {
            theInternalTransition.setSComposed((State) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-746a-0000-000000000000")
    @Override
    public Object visitLifeline(Lifeline theLifeline) {
        if (this.parent instanceof Interaction) {
            theLifeline.setOwner((Interaction) this.parent);
            return true;
        } else {
            return visitModelElement(theLifeline);
        }
    }

    @objid ("01f40498-0000-6fea-0000-000000000000")
    @Override
    public Object visitLinkEnd(LinkEnd theLinkEnd) {
        if (this.parent instanceof Instance) {
            theLinkEnd.setSource((Instance) this.parent);
            return true;
        } else if (this.parent instanceof LinkEnd) {
            theLinkEnd.setOpposite((LinkEnd) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6ff2-0000-000000000000")
    @Override
    public Object visitManifestation(Manifestation theManifestation) {
        if (this.parent instanceof Artifact) {
            theManifestation.setOwner((Artifact) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-7472-0000-000000000000")
    @Override
    public Object visitMessage(Message theMessage) {
        if (this.parent instanceof MessageEnd) {
            theMessage.setSendEvent((MessageEnd) this.parent);
            return true;
        }
        return false;
    }

    @objid ("a2416152-67dd-11de-ad13-0014222a9f79")
    @Override
    public Object visitMetaclassReference(MetaclassReference theMetaclassReference) {
        if (this.parent instanceof Profile) {
            theMetaclassReference.setOwnerProfile((Profile) this.parent);
            return true;
        }
        return false;
    }

    @objid ("176c0e63-e0f8-11de-bda3-001ec947ccaf")
    @Override
    public Object visitModelElement(ModelElement theModelElement) {
        if (this.parent instanceof TemplateParameter) {
            theModelElement.setOwnerTemplateParameter((TemplateParameter) this.parent);
            return true;
        } else {
            return visitElement(theModelElement);
        }
    }

    @objid ("01f40498-0000-6eba-0000-000000000000")
    @Override
    public Object visitModelTree(ModelTree theModelTree) {
        if (this.parent instanceof TemplateParameter) {
            // TemplateParameter case must be before ModelTree because it is a ModelTree
            theModelTree.setOwnerTemplateParameter((TemplateParameter) this.parent);
            return true;
        } else if (this.parent instanceof ModelTree) {
            theModelTree.setOwner((ModelTree) this.parent);
            return true;
        } else if (this.parent instanceof Project) {
            // If parent is the project, add to the root package
            Project project = (Project) this.parent;
            Package rootPackage = project.getModel();
            if (rootPackage != null) {
                theModelTree.setOwner(rootPackage);
                return true;
            }
        } else {
            return visitModelElement(theModelTree);
        }
        return false;
    }

    @objid ("417390b7-9ec3-11de-9e1f-001ec947ccaf")
    @Override
    public Object visitModuleComponent(ModuleComponent theModule) {
        return visitComponent(theModule);
    }

    @objid ("01f40498-0000-7002-0000-000000000000")
    @Override
    public Object visitNamespaceUse(NamespaceUse theNamespaceUse) {
        if (this.parent instanceof NameSpace) {
            theNamespaceUse.setUser((NameSpace) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6ec2-0000-000000000000")
    @Override
    public Object visitNote(Note theNote) {
        theNote.setSubject((ModelElement) this.parent);
        return true;
    }

    @objid ("e4278e11-67dd-11de-ad13-0014222a9f79")
    @Override
    public Object visitNoteType(NoteType theNoteType) {
        if (this.parent instanceof MetaclassReference) {
            theNoteType.setOwnerReference((MetaclassReference) this.parent);
            return true;
        } else if (this.parent instanceof Stereotype) {
            theNoteType.setOwnerStereotype((Stereotype) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-73d2-0000-000000000000")
    @Override
    public Object visitOutputPin(OutputPin theOutputPin) {
        if (this.parent instanceof ActivityAction) {
            theOutputPin.setOutputing((ActivityAction) this.parent);
            return true;
        } else {
            // Skip inheritance to ObjectNode
            return visitModelElement(theOutputPin);
        }
    }

    @objid ("01f40498-0000-701a-0000-000000000000")
    @Override
    public Object visitPackage(Package thePackage) {
        // TemplateParameter case must be before ModelTree because it is a ModelTree
        if (this.parent instanceof TemplateParameter) {
            thePackage.setOwnerTemplateParameter((TemplateParameter) this.parent);
            return true;
        } else if (this.parent instanceof ModelTree) {
            thePackage.setOwner((ModelTree) this.parent);
            return true;
        } else {
            return visitModelTree(thePackage);
        }
    }

    @objid ("01f40498-0000-7022-0000-000000000000")
    @Override
    public Object visitPackageImport(PackageImport thePackageImport) {
        if (this.parent instanceof NameSpace) {
            thePackageImport.setImportingNameSpace((NameSpace) this.parent);
            return true;
        } else if (this.parent instanceof Operation) {
            thePackageImport.setImportingOperation((Operation) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-702a-0000-000000000000")
    @Override
    public Object visitPackageMerge(PackageMerge thePackageMerge) {
        if (this.parent instanceof Package) {
            thePackageMerge.setReceivingPackage((Package) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-7032-0000-000000000000")
    @Override
    public Object visitParameter(Parameter theParameter) {
        if (this.parent instanceof Operation) {
            if (this.smDep == null) {
                this.smDep = (SmDependency) MTools.getMetaTool().getDefaultCompositionDep(this.parent, theParameter);
            }
            if ("Returned".equals(this.smDep.getName()) || "Return".equals(this.smDep.getName())) {
                theParameter.setReturned((Operation) this.parent);
                return true;
            } else {
                theParameter.setComposed((Operation) this.parent);
                return true;
            }
        }
        return false;
    }

    @objid ("01f40498-0000-748a-0000-000000000000")
    @Override
    public Object visitPartDecomposition(PartDecomposition thePartDecomposition) {
        if (this.parent instanceof Lifeline) {
            thePartDecomposition.setDecomposed((Lifeline) this.parent);
            return true;
        }
        return false;
    }

    @objid ("15fcfb58-67db-11de-ad13-0014222a9f79")
    @Override
    public Object visitProfile(Profile theProfile) {
        if (this.parent instanceof ModuleComponent) {
            theProfile.setOwnerModule((ModuleComponent) this.parent);
            return true;
        } else {
            return visitPackage(theProfile);
        }
    }

    @objid ("01f40498-0000-6ed2-0000-000000000000")
    @Override
    public Object visitProject(Project theProject) {
        return visitModelElement(theProject);
    }

    @objid ("01f40498-0000-708a-0000-000000000000")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition theProperty) {
        if (this.parent instanceof PropertyTableDefinition) {
            theProperty.setOwner((PropertyTableDefinition) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-7092-0000-000000000000")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral thePropertyEnumerationLitteral) {
        if (this.parent instanceof EnumeratedPropertyType) {
            thePropertyEnumerationLitteral.setOwner((EnumeratedPropertyType) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-709a-0000-000000000000")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition thePropertyTableDefinition) {
        if (this.parent instanceof PropertyContainer) {
            thePropertyTableDefinition.setOwner((PropertyContainer) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-70a2-0000-000000000000")
    @Override
    public Object visitPropertyType(PropertyType thePropertyType) {
        if (this.parent instanceof PropertyContainer) {
            thePropertyType.setAnalystOwner((PropertyContainer) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-70b2-0000-000000000000")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable theTypedPropertyTable) {
        if (this.parent instanceof ModelElement) {
            theTypedPropertyTable.setOwner((AnalystContainer) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-7042-0000-000000000000")
    @Override
    public Object visitProvidedInterface(ProvidedInterface theProvidedInterface) {
        if (this.parent instanceof Port) {
            theProvidedInterface.setProviding((Port) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-704a-0000-000000000000")
    @Override
    public Object visitRaisedException(RaisedException theRaisedException) {
        if (this.parent instanceof Operation) {
            theRaisedException.setThrower((Operation) this.parent);
            return true;
        }
        return false;
    }

    @objid ("52baa235-a4de-11dd-81f5-001ec947ccaf")
    @Override
    public Object visitRegion(Region theRegion) {
        if (this.parent instanceof State) {
            theRegion.setParent((State) this.parent);
            return true;
        } else if (this.parent instanceof StateMachine) {
            // When appending to the state machine, the region is the top region.
            StateMachine machine = (StateMachine) this.parent;
            Region topState = machine.getTop();
            if (topState == null) {
                theRegion.setRepresented((StateMachine) this.parent);
                return true;
            }
        }
        return false;
    }

    @objid ("01f40498-0000-7052-0000-000000000000")
    @Override
    public Object visitRequiredInterface(RequiredInterface theRequiredInterface) {
        if (this.parent instanceof Port) {
            theRequiredInterface.setRequiring((Port) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-70ba-0000-000000000000")
    @Override
    public Object visitRequirement(Requirement theRequirementElement) {
        if (this.parent instanceof RequirementContainer) {
            theRequirementElement.setOwnerContainer((RequirementContainer) this.parent);
            AnalystPropertiesHelper.synchronizeAnalystProperties((RequirementContainer) this.parent, Collections.singletonList((AnalystElement)theRequirementElement));
            return true;
        }
        if (this.parent instanceof Requirement) {
            theRequirementElement.setParentRequirement((Requirement) this.parent);
            AnalystPropertiesHelper.synchronizeAnalystProperties((Requirement) this.parent, Collections.singletonList((AnalystElement)theRequirementElement));
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-70c2-0000-000000000000")
    @Override
    public Object visitRequirementContainer(RequirementContainer theRequirementContainer) {
        if (this.parent instanceof RequirementContainer) {
            theRequirementContainer.setOwnerContainer((RequirementContainer) this.parent);
            return true;
        } else if (this.parent instanceof AnalystProject) {
            theRequirementContainer.setOwnerProject((AnalystProject) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-70ca-0000-000000000000")
    @Override
    public Object visitBusinessRule(BusinessRule theBusinessRuleElement) {
        if (this.parent instanceof BusinessRuleContainer) {
            theBusinessRuleElement.setOwnerContainer((BusinessRuleContainer) this.parent);
            AnalystPropertiesHelper.synchronizeAnalystProperties((BusinessRuleContainer) this.parent, Collections.singletonList((AnalystElement)theBusinessRuleElement));
            return true;
        }
        if (this.parent instanceof BusinessRule) {
            theBusinessRuleElement.setParentRule((BusinessRule) this.parent);
            AnalystPropertiesHelper.synchronizeAnalystProperties((BusinessRule) this.parent, Collections.singletonList((AnalystElement)theBusinessRuleElement));
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-70d2-0000-000000000000")
    @Override
    public Object visitAnalystProject(AnalystProject theAnalystProject) {
        return visitModelElement(theAnalystProject);
    }

    @objid ("01f40498-0000-751a-0000-000000000000")
    @Override
    public Object visitStateVertex(StateVertex theStateVertex) {
        if (this.parent instanceof Region) {
            theStateVertex.setParent((Region) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6eda-0000-000000000000")
    @Override
    public Object visitStereotype(Stereotype theStereotype) {
        if (this.parent instanceof Profile) {
            theStereotype.setOwner((Profile) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6f0a-0000-000000000000")
    @Override
    public Object visitSubstitution(Substitution theSubstitution) {
        if (this.parent instanceof Classifier) {
            theSubstitution.setSubstitutingClassifier((Classifier) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6ee2-0000-000000000000")
    @Override
    public Object visitTagParameter(TagParameter theTagParameter) {
        if (this.parent instanceof TaggedValue) {
            theTagParameter.setAnnoted((TaggedValue) this.parent);
            return true;
        }
        return false;
    }

    @objid ("e387d14c-67dd-11de-ad13-0014222a9f79")
    @Override
    public Object visitTagType(TagType theTagType) {
        if (this.parent instanceof MetaclassReference) {
            theTagType.setOwnerReference((MetaclassReference) this.parent);
            return true;
        } else if (this.parent instanceof Stereotype) {
            theTagType.setOwnerStereotype((Stereotype) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-6ef2-0000-000000000000")
    @Override
    public Object visitTaggedValue(TaggedValue theTaggedValue) {
        // CMA 27/05/2005: Notes are now ModelElement
        // if (parent.getMClass().hasBase (NoteClass ()))
        // res = theTaggedValue.appendDepVal (TaggedValueTxTAnnotedNote (), parent);
        // else
        theTaggedValue.setAnnoted((ModelElement) this.parent);
        return true;
    }

    @objid ("01f40498-0000-705a-0000-000000000000")
    @Override
    public Object visitTemplateBinding(TemplateBinding theTemplateBinding) {
        if (this.parent instanceof NameSpace) {
            theTemplateBinding.setBoundElement((NameSpace) this.parent);
            return true;
        } else if (this.parent instanceof Operation) {
            theTemplateBinding.setBoundOperation((Operation) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-7062-0000-000000000000")
    @Override
    public Object visitTemplateParameter(TemplateParameter theTemplateParameter) {
        if (this.parent instanceof NameSpace) {
            theTemplateParameter.setParameterized((NameSpace) this.parent);
            return true;
        } else if (this.parent instanceof Operation) {
            theTemplateParameter.setParameterizedOperation((Operation) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-752a-0000-000000000000")
    @Override
    public Object visitTransition(Transition theTransition) {
        if (this.parent instanceof StateVertex) {
            theTransition.setSource((StateVertex) this.parent);
            return true;
        }
        return false;
    }

    @objid ("01f40498-0000-754a-0000-000000000000")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency theUseCaseDependency) {
        if (this.parent instanceof UseCase) {
            theUseCaseDependency.setOrigin((UseCase) this.parent);
            return true;
        }
        return false;
    }

    @objid ("17a0fe38-ec00-11df-9f13-001111ead0dd")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution theTemplateParameterSubstitution) {
        if (this.parent instanceof TemplateBinding) {
            theTemplateParameterSubstitution.setOwner((TemplateBinding) this.parent);
            return true;
        }
        return false;
    }

    @objid ("ecb9a050-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState theEntryPointPseudoState) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof State) {
            theEntryPointPseudoState.setEntryOf((State) this.parent);
            return true;
        } else if (this.parent instanceof StateMachine) {
            theEntryPointPseudoState.setEntryOfMachine((StateMachine) this.parent);
            return true;
        } else {
            return visitAbstractPseudoState(theEntryPointPseudoState);
        }
    }

    @objid ("ecbe64fe-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState theExitPointPseudoState) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof State) {
            theExitPointPseudoState.setExitOf((State) this.parent);
            return true;
        } else if (this.parent instanceof StateMachine) {
            theExitPointPseudoState.setExitOfMachine((StateMachine) this.parent);
            return true;
        } else {
            return visitAbstractPseudoState(theExitPointPseudoState);
        }
    }

    @objid ("ecc58c03-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering theGeneralOrdering) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof OccurrenceSpecification) {
            theGeneralOrdering.setBefore((OccurrenceSpecification) this.parent);
            return true;
        } else {
            return visitElement(theGeneralOrdering);
        }
    }

    @objid ("ecdb0112-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitMessageFlow(MessageFlow theMessageFlow) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof ActivityPartition) {
            theMessageFlow.setSourcePartition((ActivityPartition) this.parent);
            return true;
        } else {
            return visitActivityEdge(theMessageFlow);
        }
    }

    @objid ("ecf07621-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitPropertyContainer(PropertyContainer thePropertyContainer) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof AnalystProject) {
            thePropertyContainer.setOwnerProject((AnalystProject) this.parent);
            return true;
        } else {
            return visitModelElement(thePropertyContainer);
        }
    }

    @objid ("ed0f748c-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitExpansionNode(ExpansionNode theExpansionNode) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof ExpansionRegion) {
            theExpansionNode.setRegionAsInput((ExpansionRegion) this.parent);
            return true;
        } else if (this.parent instanceof ExpansionRegion) {
            theExpansionNode.setRegionAsOutput((ExpansionRegion) this.parent);
            return true;
        } else {
            return visitObjectNode(theExpansionNode);
        }
    }

    @objid ("ed0f7493-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitExceptionHandler(ExceptionHandler theExceptionHandler) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof ActivityAction) {
            theExceptionHandler.setProtectedNode((ActivityAction) this.parent);
            return true;
        } else {
            return visitModelElement(theExceptionHandler);
        }
    }

    @objid ("ed14393d-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact theBpmnArtifact) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnCollaboration) {
            theBpmnArtifact.setCollaboration((BpmnCollaboration) this.parent);
            return true;
        } else if (this.parent instanceof BpmnSubProcess) {
            theBpmnArtifact.setSubProcess((BpmnSubProcess) this.parent);
            return true;
        } else if (this.parent instanceof BpmnProcess) {
            theBpmnArtifact.setProcess((BpmnProcess) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnArtifact);
        }
    }

    @objid ("ed1b6041-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition theBpmnComplexBehaviorDefinition) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnMultiInstanceLoopCharacteristics) {
            theBpmnComplexBehaviorDefinition.setOwner((BpmnMultiInstanceLoopCharacteristics) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnComplexBehaviorDefinition);
        }
    }

    @objid ("ed1dc296-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation theBpmnDataAssociation) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnActivity) {
            theBpmnDataAssociation.setStartingActivity((BpmnActivity) this.parent);
            return true;
        } else if (this.parent instanceof BpmnThrowEvent) {
            theBpmnDataAssociation.setStartingEvent((BpmnThrowEvent) this.parent);
            return true;
        } else if (this.parent instanceof BpmnActivity) {
            theBpmnDataAssociation.setEndingActivity((BpmnActivity) this.parent);
            return true;
        } else if (this.parent instanceof BpmnCatchEvent) {
            theBpmnDataAssociation.setEndingEvent((BpmnCatchEvent) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnDataAssociation);
        }
    }

    @objid ("ed2024ed-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput theBpmnDataInput) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnMultiInstanceLoopCharacteristics) {
            theBpmnDataInput.setOwnerLoopCharacteristics((BpmnMultiInstanceLoopCharacteristics) this.parent);
            return true;
        } else if (this.parent instanceof BpmnActivity) {
            theBpmnDataInput.setOwnerActivity((BpmnActivity) this.parent);
            return true;
        } else if (this.parent instanceof BpmnThrowEvent) {
            theBpmnDataInput.setOwnerThrowEvent((BpmnThrowEvent) this.parent);
            return true;
        } else {
            return visitBpmnItemAwareElement(theBpmnDataInput);
        }
    }

    @objid ("ed228745-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput theBpmnDataOutput) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnActivity) {
            theBpmnDataOutput.setOwnerActivity((BpmnActivity) this.parent);
            return true;
        } else if (this.parent instanceof BpmnCatchEvent) {
            theBpmnDataOutput.setCatched((BpmnCatchEvent) this.parent);
            return true;
        } else if (this.parent instanceof BpmnMultiInstanceLoopCharacteristics) {
            theBpmnDataOutput.setOwnerLoopCharacteristics((BpmnMultiInstanceLoopCharacteristics) this.parent);
            return true;
        } else {
            return visitBpmnItemAwareElement(theBpmnDataOutput);
        }
    }

    @objid ("ed22874b-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnDataState(BpmnDataState theBpmnDataState) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnItemAwareElement) {
            theBpmnDataState.setItem((BpmnItemAwareElement) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnDataState);
        }
    }

    @objid ("ed29ae49-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition theBpmnEventDefinition) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnEvent) {
            theBpmnEventDefinition.setDefined((BpmnEvent) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnEventDefinition);
        }
    }

    @objid ("ed2c10a0-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement theBpmnFlowElement) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnSubProcess) {
            theBpmnFlowElement.setSubProcess((BpmnSubProcess) this.parent);
            return true;
        } else if (this.parent instanceof BpmnProcess) {
            theBpmnFlowElement.setContainer((BpmnProcess) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnFlowElement);
        }
    }

    @objid ("ed2e72f9-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent theBpmnImplicitThrowEvent) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnComplexBehaviorDefinition) {
            theBpmnImplicitThrowEvent.setOwner((BpmnComplexBehaviorDefinition) this.parent);
            return true;
        } else {
            return visitBpmnThrowEvent(theBpmnImplicitThrowEvent);
        }
    }

    @objid ("ed3337a5-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnLane(BpmnLane theBpmnLane) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnLaneSet) {
            theBpmnLane.setLaneSet((BpmnLaneSet) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnLane);
        }
    }

    @objid ("ed3599fd-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet theBpmnLaneSet) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnProcess) {
            theBpmnLaneSet.setProcess((BpmnProcess) this.parent);
            return true;
        } else if (this.parent instanceof BpmnLane) {
            theBpmnLaneSet.setParentLane((BpmnLane) this.parent);
            return true;
        } else if (this.parent instanceof BpmnSubProcess) {
            theBpmnLaneSet.setSubProcess((BpmnSubProcess) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnLaneSet);
        }
    }

    @objid ("ed37fc53-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics theBpmnLoopCharacteristics) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnActivity) {
            theBpmnLoopCharacteristics.setOwnerActivity((BpmnActivity) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnLoopCharacteristics);
        }
    }

    @objid ("ed3a5eaa-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow theBpmnMessageFlow) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnCollaboration) {
            theBpmnMessageFlow.setCollaboration((BpmnCollaboration) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnMessageFlow);
        }
    }

    @objid ("ed3cc102-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnOperation(BpmnOperation theBpmnOperation) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnInterface) {
            theBpmnOperation.setBpmnInterfaceRef((BpmnInterface) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnOperation);
        }
    }

    @objid ("ed3f2359-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant theBpmnParticipant) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnCollaboration) {
            theBpmnParticipant.setContainer((BpmnCollaboration) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnParticipant);
        }
    }

    @objid ("ed4185b1-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter theBpmnResourceParameter) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnResource) {
            theBpmnResourceParameter.setResource((BpmnResource) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnResourceParameter);
        }
    }

    @objid ("ed43e806-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding theBpmnResourceParameterBinding) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnResourceRole) {
            theBpmnResourceParameterBinding.setResourceRole((BpmnResourceRole) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnResourceParameterBinding);
        }
    }

    @objid ("ed43e80d-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole theBpmnResourceRole) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnProcess) {
            theBpmnResourceRole.setProcess((BpmnProcess) this.parent);
            return true;
        } else if (this.parent instanceof BpmnFlowNode) {
            theBpmnResourceRole.setAnnotated((BpmnFlowNode) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnResourceRole);
        }
    }

    @objid ("ed464a5d-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement theBpmnRootElement) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnBehavior) {
            theBpmnRootElement.setOwner((BpmnBehavior) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnRootElement);
        }
    }

    @objid ("ed48acb4-1a73-11e0-9cf7-001ec947ccaf")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation theBpmnSequenceFlowDataAssociation) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof BpmnSequenceFlow) {
            theBpmnSequenceFlowDataAssociation.setConnected((BpmnSequenceFlow) this.parent);
            return true;
        } else {
            return visitBpmnBaseElement(theBpmnSequenceFlowDataAssociation);
        }
    }

    @objid ("1303d13f-2b02-11e0-80c5-001ec947ccaf")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram theAbstractDiagram) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof ModelElement) {
            theAbstractDiagram.setOrigin((ModelElement) this.parent);
            return true;
        } else {
            return visitModelElement(theAbstractDiagram);
        }
    }

    @objid ("fa7d67ea-2d47-11e0-80c5-001ec947ccaf")
    @Override
    public Object visitDiagramSet(DiagramSet theDiagramSet) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof DiagramSet) {
            theDiagramSet.setParent((DiagramSet) this.parent);
            return true;
        } else if (this.parent instanceof Project) {
            theDiagramSet.setOwner((Project) this.parent);
            return true;
        } else {
            return visitModelElement(theDiagramSet);
        }
    }

    @objid ("c18e27d2-fe4b-11e0-9dc6-001ec947ccaf")
    @Override
    public Object visitExternDocument(ExternDocument theExternDocument) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof ModelElement) {
            theExternDocument.setSubject((ModelElement) this.parent);
            return true;
        } else {
            return visitModelElement(theExternDocument);
        }
    }

    @objid ("ad07d2ed-0572-11e1-8525-001ec947ccaf")
    @Override
    public Object visitExternDocumentType(ExternDocumentType theExternDocumentType) {
        // CODE GENERATED from modelio.binaries.mmServices.facilities.CompositionInitializer.Generate CompositionInitializer macro
        // Remove these 2 comment lines before manually modifying the code.
        
        if (this.parent instanceof Stereotype) {
            theExternDocumentType.setOwnerStereotype((Stereotype) this.parent);
            return true;
        } else if (this.parent instanceof MetaclassReference) {
            theExternDocumentType.setOwnerReference((MetaclassReference) this.parent);
            return true;
        } else {
            return visitModelElement(theExternDocumentType);
        }
    }

    @objid ("00169252-f750-1090-8d81-001ec947cd2a")
    @Override
    public Object visitOperation(Operation theOperation) {
        if (this.parent instanceof Classifier) {
            theOperation.setOwner((Classifier) this.parent);
            return true;
        } else {
            return visitFeature(theOperation);
        }
    }

    @objid ("70a7e846-408d-4517-82a3-d921edaf9861")
    @Override
    public Object visitGoalContainer(GoalContainer theGoalContainer) {
        if (this.parent instanceof GoalContainer) {
            theGoalContainer.setOwnerContainer((GoalContainer) this.parent);
            return true;
        } else if (this.parent instanceof AnalystProject) {
            theGoalContainer.setOwnerProject((AnalystProject) this.parent);
            return true;
        }
        return false;
    }

    @objid ("50d50891-7297-4914-857e-a14cb3faf6b3")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer theBusinessRuleContainer) {
        if (this.parent instanceof BusinessRuleContainer) {
            theBusinessRuleContainer.setOwnerContainer((BusinessRuleContainer) this.parent);
            return true;
        } else if (this.parent instanceof AnalystProject) {
            theBusinessRuleContainer.setOwnerProject((AnalystProject) this.parent);
            return true;
        }
        return false;
    }

    @objid ("a6320245-9805-4b78-b48b-e6e4f57c1ee9")
    @Override
    public Object visitGoal(Goal theGoalElement) {
        if (this.parent instanceof GoalContainer) {
            theGoalElement.setOwnerContainer((GoalContainer) this.parent);
            AnalystPropertiesHelper.synchronizeAnalystProperties((GoalContainer) this.parent, Collections.singletonList((AnalystElement)theGoalElement));
            return true;
        }
        if (this.parent instanceof Goal) {
            theGoalElement.setParentGoal((Goal) this.parent);
            AnalystPropertiesHelper.synchronizeAnalystProperties((Goal) this.parent, Collections.singletonList((AnalystElement)theGoalElement));
            return true;
        }
        return false;
    }

    @objid ("54a12604-d3bd-4db1-99c5-98e709f7dc97")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable theTable) {
        if (this.parent instanceof AnalystItem) {
            theTable.setAnalystOwner((AnalystItem) this.parent);
            return true;
        }
        return false;
    }

    @objid ("fddc53a8-e5dd-4fda-b2f5-bcf1c37fa305")
    @Override
    public Object visitTerm(Term theTerm) {
        if (this.parent instanceof Dictionary) {
            theTerm.setOwnerDictionary((Dictionary) this.parent);
            AnalystPropertiesHelper.synchronizeAnalystProperties((Dictionary) this.parent, Collections.singletonList((AnalystElement)theTerm));
            return true;
        }
        return false;
    }

    @objid ("e2c58ea3-ce75-47ea-8a4d-32cabb1f69a0")
    @Override
    public Object visitMatrixDefinition(MatrixDefinition theMatrixDefinition) {
        if (this.parent instanceof ModelElement) {
            theMatrixDefinition.setOwner((ModelElement) this.parent);
            return true;
        }
        return false;
    }

    @objid ("765abde3-4c2e-4382-ac68-39b290fff330")
    @Override
    public Object visitQueryDefinition(QueryDefinition theQueryDefinition) {
        if (this.parent instanceof MatrixDefinition) {
            if (this.smDep == null) {
                this.smDep = (SmDependency) MTools.getMetaTool().getDefaultCompositionDep(this.parent, theQueryDefinition);
            }
            if ("LinesDefinition".equals(this.smDep.getName()) || "OwnerAsLine".equals(this.smDep.getName())) {
                theQueryDefinition.setOwnerAsLine((MatrixDefinition) this.parent);
                return true;
            } else if ("ColumnsDefinition".equals(this.smDep.getName()) || "OwnerAsCol".equals(this.smDep.getName())) {
                theQueryDefinition.setOwnerAsCol((MatrixDefinition) this.parent);
                return true;
            } else {
                theQueryDefinition.setOwnerAsDepth((MatrixDefinition) this.parent);
                return true;
            }
        }
        return false;
    }

    @objid ("1dc6d18a-51a6-4e09-9ff7-bb98d0d6a00d")
    @Override
    public Object visitMatrixValueDefinition(MatrixValueDefinition theMatrixValueDefinition) {
        if (this.parent instanceof MatrixDefinition) {
            theMatrixValueDefinition.setMatrix((MatrixDefinition) this.parent);
            return true;
        }
        return false;
    }

    @objid ("194c46b1-2fdf-4c18-9d70-20cb8f31f4a1")
    @Override
    public Object visitGenericAnalystElement(GenericAnalystElement theGenericElement) {
        if (this.parent instanceof GenericAnalystContainer) {
            theGenericElement.setOwnerContainer((GenericAnalystContainer) this.parent);
            AnalystPropertiesHelper.synchronizeAnalystProperties((GenericAnalystContainer) this.parent, Collections.singletonList((AnalystElement)theGenericElement));
            return true;
        }
        if (this.parent instanceof GenericAnalystElement) {
            theGenericElement.setParentElement((GenericAnalystElement) this.parent);
            AnalystPropertiesHelper.synchronizeAnalystProperties((GenericAnalystElement) this.parent, Collections.singletonList((AnalystElement)theGenericElement));
            return true;
        }
        return false;
    }

    @objid ("b1b95308-f76e-4dee-9275-4cf9ce19fc95")
    @Override
    public Object visitGenericAnalystContainer(GenericAnalystContainer theGenericContainer) {
        if (this.parent instanceof GenericAnalystContainer) {
            theGenericContainer.setOwnerContainer((GenericAnalystContainer) this.parent);
            return true;
        } else if (this.parent instanceof AnalystProject) {
            theGenericContainer.setOwnerProject((AnalystProject) this.parent);
            return true;
        }
        return false;
    }

}
