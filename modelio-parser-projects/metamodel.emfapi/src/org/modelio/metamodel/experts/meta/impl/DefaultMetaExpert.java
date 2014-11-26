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
                                    

package org.modelio.metamodel.experts.meta.impl;

import java.util.HashSet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.experts.meta.IMetaExpert;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Default creation expert that uses the {@link MetamodelRules} to answer.
 */
@objid ("002ff54e-e14c-1097-bcec-001ec947cd2a")
public class DefaultMetaExpert implements IMetaExpert {
    @objid ("006c2a78-e60a-1097-bcec-001ec947cd2a")
    private static final MetamodelRules RULES = new MetamodelRules();

    @objid ("0016513e-e4d5-1097-bcec-001ec947cd2a")
    @Override
    public boolean canCompose(final MObject owner, final MObject composed, final String dep) {
        return canCompose(owner.getMClass(), composed.getMClass(), dep);
    }

    @objid ("0016f1a2-e4d5-1097-bcec-001ec947cd2a")
    @Override
    public boolean canCompose(final MObject owner, final MClass composed, final String dep) {
        return canCompose(owner.getMClass(), composed, dep);
    }

    @objid ("001745ee-e4d5-1097-bcec-001ec947cd2a")
    @Override
    public boolean canCompose(final MClass owner, final MClass composed, String dep) {
        SmClass smClass = (SmClass) owner;
        SmDependency smDep = smClass.getDependencyDef(dep);
        if (smDep != null) {
            return (smDep.isComposition() || smDep.isSharedComposition()) && ((SmClass) smDep.getTarget()).hasBase(composed)
                    && RULES.canCreate(composed, owner);
        } else {
            return RULES.canCreate(composed, owner);
        }
    }

    @objid ("0017ba88-e4d5-1097-bcec-001ec947cd2a")
    @Override
    public boolean canDep(MObject source, MClass target, String dep) {
        return canDep(source.getMClass(), target, dep);
    }

    @objid ("0017f570-e4d5-1097-bcec-001ec947cd2a")
    @Override
    public boolean canDep(MClass source, MClass target, String dep) {
        MDependency mDep = source.getDependency(dep);
        return (mDep != null && ((SmClass) mDep.getTarget()).hasBase(target));
    }

    @objid ("00182c84-e4d5-1097-bcec-001ec947cd2a")
    @Override
    public boolean canDep(MObject source, MObject target, String dep) {
        return canDep(source.getMClass(), target.getMClass(), dep);
    }

    /**
     * This class contains the metamodel knowledge of the {@link DefaultCreationExpert}.
     * <p>
     * A CreationExpert tool can answer the following questions:
     * <ol>
     * <li>can I create an object X under an Y object ?</li>
     * <li>can I create a link D from an X to an Y</li>
     * <li>can I start a link D from an X</li>
     * </ol>
     * where X, Y and D are metaclass names.
     * </p>
     * <p>
     * Example:<br/>
     * <tt>CreationExpert.canLink(IAssociation.class, IClass.class, IClass.class)</tt> => returns true
     * </p>
     */
    @objid ("006c17b8-e60a-1097-bcec-001ec947cd2a")
    static class MetamodelRules {
        @objid ("006c21cc-e60a-1097-bcec-001ec947cd2a")
        private final HashSet<String> rules = new HashSet<>();

        /**
         * Returns whether the childMetaclass can be created as a child of the parentMetaclass.
         * @param childMetaclass the child
         * @param parentMetaclass the parent
         * @return true if the creation is possible, false otherwise.
         */
        @objid ("006c3acc-e60a-1097-bcec-001ec947cd2a")
        public boolean canCreate(MClass childMetaclass, MClass parentMetaclass) {
            return this.rules.contains(parentMetaclass.getName() + childMetaclass.getName());
        }

        @objid ("006c417a-e60a-1097-bcec-001ec947cd2a")
        MetamodelRules() {
            registerUmlNodes();
            registerBpmnNodes();
        }

        /**
         * Parenting rules are defined as X.Y which means that an 'Y' instance can be created under an 'X' instance. Note that
         * parenting rules do not take the metamodel inheritance tree into account
         */
        @objid ("006c4ab2-e60a-1097-bcec-001ec947cd2a")
        private void registerUmlNodes() {
            // AcceptCallEventAction
            addRule("AcceptCallEventAction", "Constraint");
            addRule("AcceptCallEventAction", "MatrixDefinition");
            addRule("AcceptCallEventAction", "Note");
            addRule("AcceptCallEventAction", "ExternDocument");
            addRule("AcceptCallEventAction", "OutputPin");
            
            // AcceptChangeEventAction
            addRule("AcceptChangeEventAction", "Constraint");
            addRule("AcceptChangeEventAction", "MatrixDefinition");
            addRule("AcceptChangeEventAction", "Note");
            addRule("AcceptChangeEventAction", "ExternDocument");
            addRule("AcceptChangeEventAction", "OutputPin");
            
            // AcceptSignalAction
            addRule("AcceptSignalAction", "Constraint ");
            addRule("AcceptSignalAction", "Note");
            addRule("AcceptSignalAction", "ExternDocument");
            addRule("AcceptSignalAction", "OutputPin");
            
            // AcceptTimeEventAction
            addRule("AcceptTimeEventAction", "Constraint");
            addRule("AcceptTimeEventAction", "MatrixDefinition");
            addRule("AcceptTimeEventAction", "Note");
            addRule("AcceptTimeEventAction", "ExternDocument");
            addRule("AcceptTimeEventAction", "OutputPin");
            
            // Activity
            addRule("Activity", "AcceptCallEventAction");
            addRule("Activity", "AcceptChangeEventAction");
            addRule("Activity", "AcceptSignalAction");
            addRule("Activity", "AcceptTimeEventAction");
            addRule("Activity", "ActivityFinalNode");
            addRule("Activity", "ActivityParameterNode");
            addRule("Activity", "ActivityPartition");
            addRule("Activity", "CallBehaviorAction");
            addRule("Activity", "CallOperationAction");
            addRule("Activity", "CentralBufferNode");
            addRule("Activity", "ConditionalNode");
            addRule("Activity", "Constraint");
            addRule("Activity", "MatrixDefinition");
            addRule("Activity", "DataStoreNode");
            addRule("Activity", "DecisionMergeNode");
            addRule("Activity", "FlowFinalNode");
            addRule("Activity", "FlowFinalNode");
            addRule("Activity", "ForkJoinNode");
            addRule("Activity", "InitialNode");
            addRule("Activity", "InstanceNode");
            addRule("Activity", "InterruptibleActivityRegion");
            addRule("Activity", "LoopNode");
            addRule("Activity", "Note");
            addRule("Activity", "ExternDocument");
            addRule("Activity", "OpaqueAction");
            addRule("Activity", "SendSignalAction");
            addRule("Activity", "StructuredActivityNode");
            addRule("Activity", "ExpansionRegion");
            addRule("Activity", "ActivityDiagram");
            
            // ActivityFinalNode
            addRule("ActivityFinalNode", "Constraint");
            addRule("ActivityFinalNode", "MatrixDefinition");
            addRule("ActivityFinalNode", "Note");
            addRule("ActivityFinalNode", "ExternDocument");
            
            // ActivityParameterNode
            addRule("ActivityParameterNode", "Constraint");
            addRule("ActivityParameterNode", "MatrixDefinition");
            addRule("ActivityParameterNode", "Note");
            addRule("ActivityParameterNode", "ExternDocument");
            
            // ActivityPartition
            addRule("ActivityPartition", "AcceptCallEventAction");
            addRule("ActivityPartition", "AcceptChangeEventAction");
            addRule("ActivityPartition", "AcceptSignalAction");
            addRule("ActivityPartition", "AcceptTimeEventAction");
            addRule("ActivityPartition", "ActivityFinalNode");
            addRule("ActivityPartition", "ActivityPartition");
            addRule("ActivityPartition", "CallBehaviorAction");
            addRule("ActivityPartition", "CallOperationAction");
            addRule("ActivityPartition", "CentralBufferNode");
            addRule("ActivityPartition", "ConditionalNode");
            addRule("ActivityPartition", "Constraint");
            addRule("ActivityPartition", "MatrixDefinition");
            addRule("ActivityPartition", "DataStoreNode");
            addRule("ActivityPartition", "DecisionMergeNode");
            addRule("ActivityPartition", "FlowFinalNode");
            addRule("ActivityPartition", "FlowFinalNode");
            addRule("ActivityPartition", "ForkJoinNode");
            addRule("ActivityPartition", "InitialNode");
            addRule("ActivityPartition", "InstanceNode");
            addRule("ActivityPartition", "InterruptibleActivityRegion");
            addRule("ActivityPartition", "LoopNode");
            addRule("ActivityPartition", "Note");
            addRule("ActivityPartition", "ExternDocument");
            addRule("ActivityPartition", "OpaqueAction");
            addRule("ActivityPartition", "SendSignalAction");
            addRule("ActivityPartition", "StructuredActivityNode");
            addRule("ActivityPartition", "ExpansionRegion");
            
            // Actor
            addRule("Actor", "Activity");
            addRule("Actor", "AssociationEnd");
            addRule("Actor", "Attribute");
            addRule("Actor", "BindableInstance");
            addRule("Actor", "Collaboration");
            addRule("Actor", "CollaborationUse");
            addRule("Actor", "CommunicationInteraction");
            addRule("Actor", "Constraint");
            addRule("Actor", "MatrixDefinition");
            addRule("Actor", "DataFlow");
            addRule("Actor", "ElementImport");
            addRule("Actor", "Generalization");
            addRule("Actor", "Instance");
            addRule("Actor", "Interaction");
            addRule("Actor", "Note");
            addRule("Actor", "ExternDocument");
            addRule("Actor", "Operation");
            addRule("Actor", "PackageImport");
            
            // AnalystProject
            addRule("AnalystProject", "BusinessRuleContainer");
            addRule("AnalystProject", "Dictionary");
            addRule("AnalystProject", "GoalContainer");
            addRule("AnalystProject", "RequirementContainer");
            
            // Artifact
            addRule("Artifact", "Artifact");
            addRule("Artifact", "Attribute");
            addRule("Artifact", "BindableInstance");
            addRule("Artifact", "Constraint");
            addRule("Artifact", "MatrixDefinition");
            addRule("Artifact", "DataFlow");
            addRule("Artifact", "ElementImport");
            addRule("Artifact", "Generalization");
            addRule("Artifact", "Instance");
            addRule("Artifact", "Manifestation");
            addRule("Artifact", "Note");
            addRule("Artifact", "ExternDocument");
            addRule("Artifact", "Operation");
            addRule("Artifact", "PackageImport");
            addRule("Artifact", "Port");
            addRule("Artifact", "TaggedValue");
            addRule("Artifact", "TemplateBinding");
            addRule("Artifact", "TemplateParameter");
            addRule("Artifact", "Usage");
            addRule("Artifact", "DeploymentDiagram");
            addRule("Artifact", "ObjectDiagram");
            
            // AssociationEnd
            addRule("AssociationEnd", "AssociationEnd");
            addRule("AssociationEnd", "Attribute");
            addRule("AssociationEnd", "Constraint");
            addRule("AssociationEnd", "MatrixDefinition");
            addRule("AssociationEnd", "Note");
            addRule("AssociationEnd", "ExternDocument");
            addRule("AssociationEnd", "TaggedValue");
            addRule("AssociationEnd", "Usage");
            
            // Attribute
            addRule("Attribute", "Constraint");
            addRule("Attribute", "MatrixDefinition");
            addRule("Attribute", "Note");
            addRule("Attribute", "ExternDocument");
            addRule("Attribute", "TaggedValue");
            addRule("Attribute", "Usage");
            
            // AttributeLink
            addRule("AttributeLink", "Constraint");
            addRule("AttributeLink", "MatrixDefinition");
            addRule("AttributeLink", "Note");
            addRule("AttributeLink", "ExternDocument");
            addRule("AttributeLink", "Usage");
            
            // BindableInstance
            addRule("BindableInstance", "AttributeLink");
            addRule("BindableInstance", "BindableInstance");
            addRule("BindableInstance", "Constraint");
            addRule("BindableInstance", "MatrixDefinition");
            addRule("BindableInstance", "Note");
            addRule("BindableInstance", "ExternDocument");
            addRule("BindableInstance", "Port");
            addRule("BindableInstance", "TaggedValue");
            addRule("BindableInstance", "Usage");
            addRule("BindableInstance", "ObjectDiagram");
            
            // Binding
            addRule("Binding", "Constraint");
            addRule("Binding", "MatrixDefinition");
            addRule("Binding", "Note");
            addRule("Binding", "ExternDocument");
            addRule("Binding", "TaggedValue");
            
            // BusinessRule
            addRule("BusinessRule", "Constraint");
            addRule("BusinessRule", "MatrixDefinition");
            addRule("BusinessRule", "Note");
            addRule("BusinessRule", "ExternDocument");
            addRule("BusinessRule", "PropertyValueSet");
            addRule("BusinessRule", "BusinessRule");
            
            // BusinessRuleContainer
            addRule("BusinessRuleContainer", "Constraint");
            addRule("BusinessRuleContainer", "MatrixDefinition");
            addRule("BusinessRuleContainer", "Note");
            addRule("BusinessRuleContainer", "ExternDocument");
            addRule("BusinessRuleContainer", "BusinessRule");
            addRule("BusinessRuleContainer", "BusinessRuleContainer");
            addRule("BusinessRuleContainer", "StaticDiagram");
            
            // CallBehaviorAction
            addRule("CallBehaviorAction", "Constraint");
            addRule("CallBehaviorAction", "MatrixDefinition");
            addRule("CallBehaviorAction", "InputPin");
            addRule("CallBehaviorAction", "ValuePin");
            addRule("CallBehaviorAction", "Note");
            addRule("CallBehaviorAction", "ExternDocument");
            addRule("CallBehaviorAction", "OutputPin");
            
            // CallOperationAction
            addRule("CallOperationAction", "Constraint");
            addRule("CallOperationAction", "MatrixDefinition");
            addRule("CallOperationAction", "InputPin");
            addRule("CallOperationAction", "ValuePin");
            addRule("CallOperationAction", "Note");
            addRule("CallOperationAction", "ExternDocument");
            addRule("CallOperationAction", "OutputPin");
            
            // CentralBufferNode
            addRule("CentralBufferNode", "Constraint");
            addRule("CentralBufferNode", "MatrixDefinition");
            addRule("CentralBufferNode", "Note");
            addRule("CentralBufferNode", "ExternDocument");
            
            // ChoicePseudoState
            addRule("ChoicePseudoState", "Constraint");
            addRule("ChoicePseudoState", "MatrixDefinition");
            addRule("ChoicePseudoState", "Note");
            addRule("ChoicePseudoState", "ExternDocument");
            
            // Class
            addRule("Class", "Activity");
            addRule("Class", "Actor");
            addRule("Class", "AssociationEnd");
            addRule("Class", "Attribute");
            addRule("Class", "BindableInstance");
            addRule("Class", "Class");
            addRule("Class", "Collaboration");
            addRule("Class", "CollaborationUse");
            addRule("Class", "CommunicationInteraction");
            addRule("Class", "Component");
            addRule("Class", "Constraint");
            addRule("Class", "MatrixDefinition");
            addRule("Class", "DataFlow");
            addRule("Class", "DataType");
            addRule("Class", "ElementImport");
            addRule("Class", "Enumeration");
            addRule("Class", "Generalization");
            addRule("Class", "InformationItem");
            addRule("Class", "Instance");
            addRule("Class", "Interaction");
            addRule("Class", "Interface");
            addRule("Class", "InterfaceRealization");
            addRule("Class", "Note");
            addRule("Class", "ExternDocument");
            addRule("Class", "Operation");
            addRule("Class", "PackageImport");
            addRule("Class", "Port");
            addRule("Class", "Signal");
            addRule("Class", "StateMachine");
            addRule("Class", "TaggedValue");
            addRule("Class", "TemplateBinding");
            addRule("Class", "TemplateParameter");
            addRule("Class", "Usage");
            addRule("Class", "UseCase");
            addRule("Class", "BpmnBehavior");
            addRule("Class", "ClassDiagram");
            addRule("Class", "StaticDiagram");
            addRule("Class", "CompositeStructureDiagram");
            addRule("Class", "DeploymentDiagram");
            addRule("Class", "ObjectDiagram");
            addRule("Class", "UseCaseDiagram");
            
            // Clause
            addRule("Clause", "AcceptCallEventAction");
            addRule("Clause", "AcceptChangeEventAction");
            addRule("Clause", "AcceptSignalAction");
            addRule("Clause", "AcceptTimeEventAction");
            addRule("Clause", "ActivityFinalNode");
            addRule("Clause", "CallBehaviorAction");
            addRule("Clause", "CallOperationAction");
            addRule("Clause", "CentralBufferNode");
            addRule("Clause", "ConditionalNode");
            addRule("Clause", "Constraint");
            addRule("Clause", "MatrixDefinition");
            addRule("Clause", "DataStoreNode");
            addRule("Clause", "DecisionMergeNode");
            addRule("Clause", "FlowFinalNode");
            addRule("Clause", "FlowFinalNode");
            addRule("Clause", "ForkJoinNode");
            addRule("Clause", "InitialNode");
            addRule("Clause", "InstanceNode");
            addRule("Clause", "InterruptibleActivityRegion");
            addRule("Clause", "LoopNode");
            addRule("Clause", "Note");
            addRule("Clause", "ExternDocument");
            addRule("Clause", "OpaqueAction");
            addRule("Clause", "SendSignalAction");
            addRule("Clause", "StructuredActivityNode");
            addRule("Clause", "ExpansionRegion");
            
            // Collaboration
            addRule("Collaboration", "Activity");
            addRule("Collaboration", "BindableInstance");
            addRule("Collaboration", "CollaborationUse");
            addRule("Collaboration", "CommunicationInteraction");
            addRule("Collaboration", "Constraint");
            addRule("Collaboration", "MatrixDefinition");
            addRule("Collaboration", "ElementImport");
            addRule("Collaboration", "Generalization");
            addRule("Collaboration", "InformationItem");
            addRule("Collaboration", "Interaction");
            addRule("Collaboration", "InterfaceRealization");
            addRule("Collaboration", "Note");
            addRule("Collaboration", "ExternDocument");
            addRule("Collaboration", "PackageImport");
            addRule("Collaboration", "TaggedValue");
            addRule("Collaboration", "TemplateBinding");
            addRule("Collaboration", "TemplateParameter");
            addRule("Collaboration", "Usage");
            addRule("Collaboration", "BpmnBehavior");
            addRule("Collaboration", "CompositeStructureDiagram");
            addRule("Collaboration", "ObjectDiagram");
            
            // CollaborationUse
            addRule("CollaborationUse", "Constraint");
            addRule("CollaborationUse", "MatrixDefinition");
            addRule("CollaborationUse", "Note");
            addRule("CollaborationUse", "ExternDocument");
            addRule("CollaborationUse", "TaggedValue");
            addRule("CollaborationUse", "Usage");
            
            // CombinedFragment
            addRule("CombinedFragment", "Constraint");
            addRule("CombinedFragment", "MatrixDefinition");
            addRule("CombinedFragment", "InteractionOperand");
            addRule("CombinedFragment", "Note");
            addRule("CombinedFragment", "ExternDocument");
            
            // CommunicationInteraction
            addRule("CommunicationInteraction", "CommunicationNode");
            addRule("CommunicationInteraction", "Constraint");
            addRule("CommunicationInteraction", "MatrixDefinition");
            addRule("CommunicationInteraction", "Note");
            addRule("CommunicationInteraction", "ExternDocument");
            addRule("CommunicationInteraction", "CommunicationDiagram");
            
            // CommunicationChannel
            addRule("CommunicationChannel", "Constraint");
            addRule("CommunicationChannel", "MatrixDefinition");
            addRule("CommunicationChannel", "Note");
            addRule("CommunicationChannel", "ExternDocument");
            addRule("CommunicationChannel", "CommunicationMessage");
            
            // CommunicationMessage
            addRule("CommunicationMessage", "Constraint");
            addRule("CommunicationMessage", "MatrixDefinition");
            addRule("CommunicationMessage", "Note");
            addRule("CommunicationMessage", "ExternDocument");
            
            // CommunicationNode
            addRule("CommunicationNode", "Constraint");
            addRule("CommunicationNode", "MatrixDefinition");
            addRule("CommunicationNode", "Note");
            addRule("CommunicationNode", "ExternDocument");
            
            // Component
            addRule("Component", "Activity");
            addRule("Component", "Actor");
            addRule("Component", "Artifact");
            addRule("Component", "Attribute");
            addRule("Component", "BindableInstance");
            addRule("Component", "Class");
            addRule("Component", "Collaboration");
            addRule("Component", "CollaborationUse");
            addRule("Component", "CommunicationInteraction");
            addRule("Component", "Component");
            addRule("Component", "Constraint");
            addRule("Component", "MatrixDefinition");
            addRule("Component", "DataFlow");
            addRule("Component", "DataType");
            addRule("Component", "ElementImport");
            addRule("Component", "Enumeration");
            addRule("Component", "Generalization");
            addRule("Component", "InformationItem");
            addRule("Component", "Instance");
            addRule("Component", "Interaction");
            addRule("Component", "Interface");
            addRule("Component", "InterfaceRealization");
            addRule("Component", "Node");
            addRule("Component", "Note");
            addRule("Component", "ExternDocument");
            addRule("Component", "Operation");
            addRule("Component", "Package");
            addRule("Component", "PackageImport");
            addRule("Component", "Port");
            addRule("Component", "Signal");
            addRule("Component", "StateMachine");
            addRule("Component", "TaggedValue");
            addRule("Component", "TemplateBinding");
            addRule("Component", "TemplateParameter");
            addRule("Component", "Usage");
            addRule("Component", "UseCase");
            addRule("Component", "BpmnBehavior");
            addRule("Component", "ClassDiagram");
            addRule("Component", "StaticDiagram");
            addRule("Component", "DeploymentDiagram");
            addRule("Component", "ObjectDiagram");
            addRule("Component", "UseCaseDiagram");
            
            // ConditionalNode
            addRule("ConditionalNode", "Clause");
            addRule("ConditionalNode", "Constraint");
            addRule("ConditionalNode", "MatrixDefinition");
            addRule("ConditionalNode", "InputPin");
            addRule("ConditionalNode", "Note");
            addRule("ConditionalNode", "ExternDocument");
            addRule("ConditionalNode", "OutputPin");
            addRule("ConditionalNode", "ValuePin");
            
            // ConnectionPointReference
            addRule("ConnectionPointReference", "Constraint");
            addRule("ConnectionPointReference", "MatrixDefinition");
            addRule("ConnectionPointReference", "Note");
            addRule("ConnectionPointReference", "ExternDocument");
            
            // ConnectorEnd
            addRule("ConnectorEnd", "ConnectorEnd");
            addRule("ConnectorEnd", "Constraint");
            addRule("ConnectorEnd", "MatrixDefinition");
            addRule("ConnectorEnd", "Note");
            addRule("ConnectorEnd", "ExternDocument");
            
            // Constraint
            addRule("Constraint", "Constraint");
            addRule("Constraint", "MatrixDefinition");
            addRule("Constraint", "Note");
            addRule("Constraint", "ExternDocument");
            
            // ControlFlow
            addRule("ControlFlow", "Constraint");
            addRule("ControlFlow", "MatrixDefinition");
            addRule("ControlFlow", "InformationFlow");
            addRule("ControlFlow", "Note");
            addRule("ControlFlow", "ExternDocument");
            
            // DataFlow
            addRule("DataFlow", "Constraint");
            addRule("DataFlow", "MatrixDefinition");
            addRule("DataFlow", "Note");
            addRule("DataFlow", "ExternDocument");
            addRule("DataFlow", "Stereotype");
            addRule("DataFlow", "TaggedValue");
            addRule("DataFlow", "Usage");
            
            // DataStoreNode
            addRule("DataStoreNode", "Constraint");
            addRule("DataStoreNode", "MatrixDefinition");
            addRule("DataStoreNode", "Note");
            addRule("DataStoreNode", "ExternDocument");
            
            // DataType
            addRule("DataType", "AssociationEnd");
            addRule("DataType", "Attribute");
            addRule("DataType", "BindableInstance");
            addRule("DataType", "Constraint");
            addRule("DataType", "MatrixDefinition");
            addRule("DataType", "ElementImport");
            addRule("DataType", "Generalization");
            addRule("DataType", "Instance");
            addRule("DataType", "Note");
            addRule("DataType", "ExternDocument");
            addRule("DataType", "Operation");
            addRule("DataType", "PackageImport");
            addRule("DataType", "Stereotype");
            addRule("DataType", "TaggedValue");
            addRule("DataType", "TemplateBinding");
            addRule("DataType", "TemplateParameter");
            addRule("DataType", "Usage");
            
            // DecisionMergeNode
            addRule("DecisionMergeNode", "Constraint");
            addRule("DecisionMergeNode", "MatrixDefinition");
            addRule("DecisionMergeNode", "Note");
            addRule("DecisionMergeNode", "ExternDocument");
            
            // DeepHistoryPseudoState
            addRule("DeepHistoryPseudoState", "Constraint");
            addRule("DeepHistoryPseudoState", "MatrixDefinition");
            addRule("DeepHistoryPseudoState", "Note");
            addRule("DeepHistoryPseudoState", "ExternDocument");
            
            // Dependency
            addRule("Dependency", "Constraint");
            addRule("Dependency", "MatrixDefinition");
            addRule("Dependency", "InformationFlow");
            addRule("Dependency", "Note");
            addRule("Dependency", "ExternDocument");
            
            // DiagramSet
            addRule("DiagramSet", "DiagramSet");
            
            // Dictionary
            addRule("Dictionary", "Constraint");
            addRule("Dictionary", "MatrixDefinition");
            addRule("Dictionary", "Dictionary");
            addRule("Dictionary", "Note");
            addRule("Dictionary", "ExternDocument");
            addRule("Dictionary", "Term");
            addRule("Dictionary", "StaticDiagram");
            
            // ElementImport
            addRule("ElementImport", "Constraint");
            addRule("ElementImport", "MatrixDefinition");
            addRule("ElementImport", "Note");
            addRule("ElementImport", "ExternDocument");
            
            // ElementRealization
            addRule("ElementRealization", "Constraint");
            addRule("ElementRealization", "MatrixDefinition");
            addRule("ElementRealization", "Note");
            addRule("ElementRealization", "ExternDocument");
            
            // EntryPointPseudoState
            addRule("EntryPointPseudoState", "Constraint");
            addRule("EntryPointPseudoState", "MatrixDefinition");
            addRule("EntryPointPseudoState", "Note");
            addRule("EntryPointPseudoState", "ExternDocument");
            
            // EnumeratedPropertyType
            addRule("EnumeratedPropertyType", "Constraint");
            addRule("EnumeratedPropertyType", "MatrixDefinition");
            addRule("EnumeratedPropertyType", "Note");
            addRule("EnumeratedPropertyType", "ExternDocument");
            addRule("EnumeratedPropertyType", "PropertyEnumerationLitteral");
            
            // Enumeration
            addRule("Enumeration", "AssociationEnd");
            addRule("Enumeration", "Attribute");
            addRule("Enumeration", "Class");
            addRule("Enumeration", "Constraint");
            addRule("Enumeration", "MatrixDefinition");
            addRule("Enumeration", "DataType");
            addRule("Enumeration", "ElementImport");
            addRule("Enumeration", "Enumeration");
            addRule("Enumeration", "EnumerationLiteral");
            addRule("Enumeration", "Interface");
            addRule("Enumeration", "InterfaceRealization");
            addRule("Enumeration", "Note");
            addRule("Enumeration", "ExternDocument");
            addRule("Enumeration", "Operation");
            addRule("Enumeration", "PackageImport");
            addRule("Enumeration", "Stereotype");
            addRule("Enumeration", "TaggedValue");
            addRule("Enumeration", "TemplateBinding");
            addRule("Enumeration", "TemplateParameter");
            addRule("Enumeration", "Usage");
            
            // EnumerationLiteral
            addRule("EnumerationLiteral", "Constraint");
            addRule("EnumerationLiteral", "MatrixDefinition");
            addRule("EnumerationLiteral", "Note");
            addRule("EnumerationLiteral", "ExternDocument");
            addRule("EnumerationLiteral", "Usage");
            
            // Event
            addRule("Event", "Constraint");
            addRule("Event", "MatrixDefinition");
            addRule("Event", "Note");
            addRule("Event", "ExternDocument");
            addRule("Event", "Stereotype");
            addRule("Event", "TaggedValue");
            addRule("Event", "Usage");
            
            // ExpansionRegion
            addRule("ExpansionRegion", "AcceptCallEventAction");
            addRule("ExpansionRegion", "AcceptChangeEventAction");
            addRule("ExpansionRegion", "AcceptSignalAction");
            addRule("ExpansionRegion", "AcceptTimeEventAction");
            addRule("ExpansionRegion", "ActivityFinalNode");
            addRule("ExpansionRegion", "CallBehaviorAction");
            addRule("ExpansionRegion", "CallOperationAction");
            addRule("ExpansionRegion", "CentralBufferNode");
            addRule("ExpansionRegion", "ConditionalNode");
            addRule("ExpansionRegion", "Constraint");
            addRule("ExpansionRegion", "MatrixDefinition");
            addRule("ExpansionRegion", "DataStoreNode");
            addRule("ExpansionRegion", "DecisionMergeNode");
            addRule("ExpansionRegion", "FlowFinalNode");
            addRule("ExpansionRegion", "FlowFinalNode");
            addRule("ExpansionRegion", "ForkJoinNode");
            addRule("ExpansionRegion", "InitialNode");
            addRule("ExpansionRegion", "InstanceNode");
            addRule("ExpansionRegion", "InterruptibleActivityRegion");
            addRule("ExpansionRegion", "LoopNode");
            addRule("ExpansionRegion", "Note");
            addRule("ExpansionRegion", "ExternDocument");
            addRule("ExpansionRegion", "OpaqueAction");
            addRule("ExpansionRegion", "SendSignalAction");
            addRule("ExpansionRegion", "StructuredActivityNode");
            addRule("ExpansionRegion", "ExpansionNode");
            addRule("ExpansionRegion", "ExpansionRegion");
            
            // ExpansionNode
            addRule("ExpansionNode", "Constraint");
            addRule("ExpansionNode", "MatrixDefinition");
            addRule("ExpansionNode", "Note");
            addRule("ExpansionNode", "ExternDocument");
            
            // ExecutionOccurenceSpecification
            addRule("ExecutionOccurenceSpecification", "Constraint");
            addRule("ExecutionOccurenceSpecification", "MatrixDefinition");
            addRule("ExecutionOccurenceSpecification", "Note");
            addRule("ExecutionOccurenceSpecification", "ExternDocument");
            
            // ExecutionSpecification
            addRule("ExecutionSpecification", "Constraint");
            addRule("ExecutionSpecification", "MatrixDefinition");
            addRule("ExecutionSpecification", "Note");
            addRule("ExecutionSpecification", "ExternDocument");
            
            // ExitPointPseudoState
            addRule("ExitPointPseudoState", "Constraint");
            addRule("ExitPointPseudoState", "MatrixDefinition");
            addRule("ExitPointPseudoState", "Note");
            addRule("ExitPointPseudoState", "ExternDocument");
            
            // ExtensionPoint
            addRule("ExtensionPoint", "Constraint");
            addRule("ExtensionPoint", "MatrixDefinition");
            addRule("ExtensionPoint", "Note");
            addRule("ExtensionPoint", "ExternDocument");
            
            // FinalState
            addRule("FinalState", "Constraint");
            addRule("FinalState", "MatrixDefinition");
            addRule("FinalState", "Note");
            addRule("FinalState", "ExternDocument");
            
            // FlowFinalNode
            addRule("FlowFinalNode", "Constraint");
            addRule("FlowFinalNode", "MatrixDefinition");
            addRule("FlowFinalNode", "Note");
            addRule("FlowFinalNode", "ExternDocument");
            
            // ForkJoinNode
            addRule("ForkJoinNode", "Constraint");
            addRule("ForkJoinNode", "MatrixDefinition");
            addRule("ForkJoinNode", "Note");
            addRule("ForkJoinNode", "ExternDocument");
            
            // ForkPseudoState
            addRule("ForkPseudoState", "Constraint");
            addRule("ForkPseudoState", "MatrixDefinition");
            addRule("ForkPseudoState", "Note");
            addRule("ForkPseudoState", "ExternDocument");
            
            // Gate
            addRule("Gate", "Constraint");
            addRule("Gate", "MatrixDefinition");
            addRule("Gate", "Note");
            addRule("Gate", "ExternDocument");
            
            // Generalization
            addRule("Generalization", "Constraint");
            addRule("Generalization", "MatrixDefinition");
            addRule("Generalization", "Note");
            addRule("Generalization", "ExternDocument");
            
            // GenericAnalystElement
            addRule("GenericAnalystElement", "Constraint");
            addRule("GenericAnalystElement", "MatrixDefinition");
            addRule("GenericAnalystElement", "Note");
            addRule("GenericAnalystElement", "ExternDocument");
            addRule("GenericAnalystElement", "PropertyValueSet");
            addRule("GenericAnalystElement", "GenericAnalystElement");
            
            // GenericAnalystContainer
            addRule("GenericAnalystContainer", "Constraint");
            addRule("GenericAnalystContainer", "MatrixDefinition");
            addRule("GenericAnalystContainer", "Note");
            addRule("GenericAnalystContainer", "ExternDocument");
            addRule("GenericAnalystContainer", "GenericAnalystElement");
            addRule("GenericAnalystContainer", "GenericAnalystContainer");
            
            // Goal
            addRule("Goal", "Constraint");
            addRule("Goal", "MatrixDefinition");
            addRule("Goal", "Note");
            addRule("Goal", "ExternDocument");
            addRule("Goal", "PropertyValueSet");
            addRule("Goal", "Goal");
            
            // GoalContainer
            addRule("GoalContainer", "Constraint");
            addRule("GoalContainer", "MatrixDefinition");
            addRule("GoalContainer", "Note");
            addRule("GoalContainer", "ExternDocument");
            addRule("GoalContainer", "Goal");
            addRule("GoalContainer", "GoalContainer");
            addRule("GoalContainer", "StaticDiagram");
            
            // InformationItem
            addRule("InformationItem", "Constraint");
            addRule("InformationItem", "MatrixDefinition");
            addRule("InformationItem", "Note");
            addRule("InformationItem", "ExternDocument");
            
            // InitialNode
            addRule("InitialNode", "Constraint");
            addRule("InitialNode", "MatrixDefinition");
            addRule("InitialNode", "Note");
            addRule("InitialNode", "ExternDocument");
            
            // InitialPseudoState
            addRule("InitialPseudoState", "Constraint");
            addRule("InitialPseudoState", "MatrixDefinition");
            addRule("InitialPseudoState", "Note");
            addRule("InitialPseudoState", "ExternDocument");
            
            // InputPin
            addRule("InputPin", "Constraint");
            addRule("InputPin", "MatrixDefinition");
            addRule("InputPin", "Note");
            addRule("InputPin", "ExternDocument");
            
            // Instance
            addRule("Instance", "AttributeLink");
            addRule("Instance", "BindableInstance");
            addRule("Instance", "Constraint");
            addRule("Instance", "MatrixDefinition");
            addRule("Instance", "LinkEnd");
            addRule("Instance", "Note");
            addRule("Instance", "ExternDocument");
            addRule("Instance", "Port");
            addRule("Instance", "Stereotype");
            addRule("Instance", "TaggedValue");
            addRule("Instance", "Usage");
            addRule("Instance", "ObjectDiagram");
            
            // InstanceNode
            addRule("InstanceNode", "Constraint");
            addRule("InstanceNode", "MatrixDefinition");
            addRule("InstanceNode", "Note");
            addRule("InstanceNode", "ExternDocument");
            
            // Interaction
            addRule("Interaction", "CombinedFragment");
            addRule("Interaction", "Constraint");
            addRule("Interaction", "MatrixDefinition");
            addRule("Interaction", "Gate");
            addRule("Interaction", "InteractionUse");
            addRule("Interaction", "Lifeline");
            addRule("Interaction", "Note");
            addRule("Interaction", "ExternDocument");
            addRule("Interaction", "PartDecomposition");
            addRule("Interaction", "SequenceDiagram");
            
            // InteractionOperand
            addRule("InteractionOperand", "CombinedFragment");
            addRule("InteractionOperand", "Constraint");
            addRule("InteractionOperand", "MatrixDefinition");
            addRule("InteractionOperand", "InteractionUse");
            addRule("InteractionOperand", "Note");
            addRule("InteractionOperand", "ExternDocument");
            
            // InteractionUse
            addRule("InteractionUse", "Constraint");
            addRule("InteractionUse", "MatrixDefinition");
            addRule("InteractionUse", "Note");
            addRule("InteractionUse", "ExternDocument");
            addRule("InteractionUse", "Gate");
            
            // Interface
            addRule("Interface", "Activity");
            addRule("Interface", "AssociationEnd");
            addRule("Interface", "Attribute");
            addRule("Interface", "Class");
            addRule("Interface", "Collaboration");
            addRule("Interface", "CommunicationInteraction");
            addRule("Interface", "Constraint");
            addRule("Interface", "MatrixDefinition");
            addRule("Interface", "DataFlow");
            addRule("Interface", "DataType");
            addRule("Interface", "ElementImport");
            addRule("Interface", "Enumeration");
            addRule("Interface", "Generalization");
            addRule("Interface", "InformationItem");
            addRule("Interface", "Instance");
            addRule("Interface", "Interaction");
            addRule("Interface", "Interface");
            addRule("Interface", "Note");
            addRule("Interface", "ExternDocument");
            addRule("Interface", "Operation");
            addRule("Interface", "PackageImport");
            addRule("Interface", "Signal");
            addRule("Interface", "StateMachine");
            addRule("Interface", "Stereotype");
            addRule("Interface", "TaggedValue");
            addRule("Interface", "TemplateBinding");
            addRule("Interface", "TemplateParameter");
            addRule("Interface", "Usage");
            addRule("Interface", "UseCase");
            addRule("Interface", "BpmnBehavior");
            addRule("Interface", "ClassDiagram");
            addRule("Interface", "StaticDiagram");
            addRule("Interface", "UseCaseDiagram");
            
            // InterfaceRealization
            addRule("InterfaceRealization", "Constraint");
            addRule("InterfaceRealization", "MatrixDefinition");
            addRule("InterfaceRealization", "Note");
            addRule("InterfaceRealization", "ExternDocument");
            
            // InternalTransition
            addRule("InternalTransition", "Constraint");
            addRule("InternalTransition", "MatrixDefinition");
            addRule("InternalTransition", "Note");
            addRule("InternalTransition", "ExternDocument");
            addRule("InternalTransition", "Usage");
            
            // InterruptibleActivityRegion
            addRule("InterruptibleActivityRegion", "AcceptCallEventAction");
            addRule("InterruptibleActivityRegion", "AcceptChangeEventAction");
            addRule("InterruptibleActivityRegion", "AcceptSignalAction");
            addRule("InterruptibleActivityRegion", "AcceptTimeEventAction");
            addRule("InterruptibleActivityRegion", "ActivityFinalNode");
            addRule("InterruptibleActivityRegion", "CallBehaviorAction");
            addRule("InterruptibleActivityRegion", "CallOperationAction");
            addRule("InterruptibleActivityRegion", "CentralBufferNode");
            addRule("InterruptibleActivityRegion", "ConditionalNode");
            addRule("InterruptibleActivityRegion", "Constraint");
            addRule("InterruptibleActivityRegion", "MatrixDefinition");
            addRule("InterruptibleActivityRegion", "DataStoreNode");
            addRule("InterruptibleActivityRegion", "DecisionMergeNode");
            addRule("InterruptibleActivityRegion", "FlowFinalNode");
            addRule("InterruptibleActivityRegion", "FlowFinalNode");
            addRule("InterruptibleActivityRegion", "ForkJoinNode");
            addRule("InterruptibleActivityRegion", "InitialNode");
            addRule("InterruptibleActivityRegion", "InstanceNode");
            addRule("InterruptibleActivityRegion", "InterruptibleActivityRegion");
            addRule("InterruptibleActivityRegion", "LoopNode");
            addRule("InterruptibleActivityRegion", "Note");
            addRule("InterruptibleActivityRegion", "ExternDocument");
            addRule("InterruptibleActivityRegion", "OpaqueAction");
            addRule("InterruptibleActivityRegion", "SendSignalAction");
            addRule("InterruptibleActivityRegion", "StructuredActivityNode");
            addRule("InterruptibleActivityRegion", "ExpansionRegion");
            
            // JoinPseudoState
            addRule("JoinPseudoState", "Constraint");
            addRule("JoinPseudoState", "MatrixDefinition");
            addRule("JoinPseudoState", "Note");
            addRule("JoinPseudoState", "ExternDocument");
            
            // JunctionPseudoState
            addRule("JunctionPseudoState", "Constraint");
            addRule("JunctionPseudoState", "MatrixDefinition");
            addRule("JunctionPseudoState", "Note");
            addRule("JunctionPseudoState", "ExternDocument");
            
            // Lifeline
            addRule("Lifeline", "Constraint");
            addRule("Lifeline", "MatrixDefinition");
            addRule("Lifeline", "ExecutionOccurenceSpecification");
            addRule("Lifeline", "ExecutionSpecification");
            addRule("Lifeline", "Note");
            addRule("Lifeline", "ExternDocument");
            addRule("Lifeline", "PartDecomposition");
            addRule("Lifeline", "StateInvariant");
            
            // LinkEnd
            addRule("LinkEnd", "Constraint");
            addRule("LinkEnd", "MatrixDefinition");
            addRule("LinkEnd", "LinkEnd");
            addRule("LinkEnd", "Note");
            addRule("LinkEnd", "ExternDocument");
            
            // LocalNote
            addRule("LocalNote", "Constraint");
            addRule("LocalNote", "MatrixDefinition");
            addRule("LocalNote", "Note");
            addRule("LocalNote", "ExternDocument");
            
            // LocalTaggedValue
            addRule("LocalTaggedValue", "Constraint");
            addRule("LocalTaggedValue", "MatrixDefinition");
            addRule("LocalTaggedValue", "Note");
            addRule("LocalTaggedValue", "ExternDocument");
            
            // LoopNode
            addRule("LoopNode", "AcceptCallEventAction");
            addRule("LoopNode", "AcceptChangeEventAction");
            addRule("LoopNode", "AcceptSignalAction");
            addRule("LoopNode", "AcceptTimeEventAction");
            addRule("LoopNode", "ActivityFinalNode");
            addRule("LoopNode", "CallBehaviorAction");
            addRule("LoopNode", "CallOperationAction");
            addRule("LoopNode", "CentralBufferNode");
            addRule("LoopNode", "ConditionalNode");
            addRule("LoopNode", "Constraint");
            addRule("LoopNode", "MatrixDefinition");
            addRule("LoopNode", "DataStoreNode");
            addRule("LoopNode", "DecisionMergeNode");
            addRule("LoopNode", "FlowFinalNode");
            addRule("LoopNode", "FlowFinalNode");
            addRule("LoopNode", "ForkJoinNode");
            addRule("LoopNode", "InitialNode");
            addRule("LoopNode", "InputPin");
            addRule("LoopNode", "ValuePin");
            addRule("LoopNode", "InstanceNode");
            addRule("LoopNode", "InterruptibleActivityRegion");
            addRule("LoopNode", "LoopNode");
            addRule("LoopNode", "Note");
            addRule("LoopNode", "ExternDocument");
            addRule("LoopNode", "OpaqueAction");
            addRule("LoopNode", "OutputPin");
            addRule("LoopNode", "SendSignalAction");
            addRule("LoopNode", "StructuredActivityNode");
            addRule("LoopNode", "ExpansionRegion");
            
            // Manifestation
            addRule("Manifestation", "Constraint");
            addRule("Manifestation", "MatrixDefinition");
            addRule("Manifestation", "Note");
            addRule("Manifestation", "ExternDocument");
            addRule("Manifestation", "Stereotype");
            addRule("Manifestation", "TaggedValue");
            
            // MatrixDefinition
            addRule("MatrixDefinition", "QueryDefinition");
            addRule("Manifestation", "MatrixValueDefinition");
            
            // Message
            addRule("Message", "Constraint");
            addRule("Message", "MatrixDefinition");
            addRule("Message", "InformationFlow");
            addRule("Message", "Note");
            addRule("Message", "ExternDocument");
            
            // MessageFlow
            addRule("MessageFlow", "InformationFlow");
            
            // MetaclassReference
            addRule("MetaclassReference", "Constraint");
            addRule("MetaclassReference", "ExternDocument");
            addRule("MetaclassReference", "ExternDocumentType");
            addRule("MetaclassReference", "MatrixDefinition");
            addRule("MetaclassReference", "Note");
            addRule("MetaclassReference", "NoteType");
            addRule("MetaclassReference", "TagType");
            
            // ModelElement
            addRule("ModelElement", "Constraint");
            addRule("ModelElement", "MatrixDefinition");
            addRule("ModelElement", "ElementRealization");
            addRule("ModelElement", "LocalNote");
            addRule("ModelElement", "LocalTaggedValue");
            addRule("ModelElement", "Note");
            addRule("ModelElement", "ExternDocument");
            addRule("ModelElement", "MatrixDefinition");
            
            // ModuleComponent
            addRule("ModuleComponent", "Profile");
            
            // Node
            addRule("Node", "AssociationEnd");
            addRule("Node", "Attribute");
            addRule("Node", "BindableInstance");
            addRule("Node", "CollaborationUse");
            addRule("Node", "CommunicationInteraction");
            addRule("Node", "Constraint");
            addRule("Node", "MatrixDefinition");
            addRule("Node", "DataFlow");
            addRule("Node", "ElementImport");
            addRule("Node", "Generalization");
            addRule("Node", "InformationItem");
            addRule("Node", "Instance");
            addRule("Node", "Node");
            addRule("Node", "ExternDocument");
            addRule("Node", "Note");
            addRule("Node", "Operation");
            addRule("Node", "PackageImport");
            addRule("Node", "Port");
            addRule("Node", "StateMachine");
            addRule("Node", "Stereotype");
            addRule("Node", "TaggedValue");
            addRule("Node", "TemplateBinding");
            addRule("Node", "TemplateParameter");
            addRule("Node", "Usage");
            addRule("Node", "CompositeStructureDiagram");
            addRule("Node", "DeploymentDiagram");
            addRule("Node", "ObjectDiagram");
            
            // Note
            addRule("Note", "Constraint");
            addRule("Note", "MatrixDefinition");
            addRule("Note", "Note");
            addRule("Note", "ExternDocument");
            
            // ObjectFlow
            addRule("ObjectFlow", "Constraint");
            addRule("ObjectFlow", "MatrixDefinition");
            addRule("ObjectFlow", "InformationFlow");
            addRule("ObjectFlow", "Note");
            addRule("ObjectFlow", "ExternDocument");
            
            // ObjectNode
            addRule("ObjectNode", "Constraint");
            addRule("ObjectNode", "MatrixDefinition");
            addRule("ObjectNode", "Note");
            addRule("ObjectNode", "ExternDocument");
            
            // OpaqueAction
            addRule("OpaqueAction", "Constraint");
            addRule("OpaqueAction", "MatrixDefinition");
            addRule("OpaqueAction", "InputPin");
            addRule("OpaqueAction", "ValuePin");
            addRule("OpaqueAction", "Note");
            addRule("OpaqueAction", "ExternDocument");
            addRule("OpaqueAction", "OutputPin");
            
            // Operation
            addRule("Operation", "Activity");
            addRule("Operation", "Collaboration");
            addRule("Operation", "CollaborationUse");
            addRule("Operation", "CommunicationInteraction");
            addRule("Operation", "Constraint");
            addRule("Operation", "MatrixDefinition");
            addRule("Operation", "ElementImport");
            addRule("Operation", "Interaction");
            addRule("Operation", "Note");
            addRule("Operation", "ExternDocument");
            addRule("Operation", "PackageImport");
            addRule("Operation", "Parameter");
            addRule("Operation", "RaisedException");
            addRule("Operation", "StateMachine");
            addRule("Operation", "Stereotype");
            addRule("Operation", "TaggedValue");
            addRule("Operation", "TemplateBinding");
            addRule("Operation", "TemplateParameter");
            addRule("Operation", "Usage");
            addRule("Operation", "BpmnBehavior");
            
            // OutputPin
            addRule("OutputPin", "Constraint");
            addRule("OutputPin", "MatrixDefinition");
            addRule("OutputPin", "Note");
            addRule("OutputPin", "ExternDocument");
            
            // Package
            addRule("Package", "Activity");
            addRule("Package", "Actor");
            addRule("Package", "Artifact");
            addRule("Package", "Class");
            addRule("Package", "Collaboration");
            addRule("Package", "CommunicationInteraction");
            addRule("Package", "Component");
            addRule("Package", "Constraint");
            addRule("Package", "MatrixDefinition");
            addRule("Package", "DataFlow");
            addRule("Package", "DataType");
            addRule("Package", "ElementImport");
            addRule("Package", "Enumeration");
            addRule("Package", "InformationItem");
            addRule("Package", "Instance");
            addRule("Package", "Interaction");
            addRule("Package", "Interface");
            addRule("Package", "Node");
            addRule("Package", "Note");
            addRule("Package", "ExternDocument");
            addRule("Package", "Package");
            addRule("Package", "PackageImport");
            addRule("Package", "PackageMerge");
            addRule("Package", "Signal");
            addRule("Package", "StateMachine");
            addRule("Package", "Stereotype");
            addRule("Package", "TaggedValue");
            addRule("Package", "TemplateBinding");
            addRule("Package", "TemplateParameter");
            addRule("Package", "Usage");
            addRule("Package", "UseCase");
            addRule("Package", "BpmnBehavior");
            addRule("Package", "ClassDiagram");
            addRule("Package", "StaticDiagram");
            addRule("Package", "DeploymentDiagram");
            addRule("Package", "ObjectDiagram");
            addRule("Package", "UseCaseDiagram");
            
            // PackageImport
            addRule("PackageImport", "Constraint");
            addRule("PackageImport", "MatrixDefinition");
            addRule("PackageImport", "Note");
            addRule("PackageImport", "ExternDocument");
            
            // PackageMerge
            addRule("PackageMerge", "Constraint");
            addRule("PackageMerge", "MatrixDefinition");
            addRule("PackageMerge", "Note");
            addRule("PackageMerge", "ExternDocument");
            addRule("PackageMerge", "Stereotype");
            addRule("PackageMerge", "TaggedValue");
            
            // Parameter
            addRule("Parameter", "Constraint");
            addRule("Parameter", "MatrixDefinition");
            addRule("Parameter", "Note");
            addRule("Parameter", "ExternDocument");
            addRule("Parameter", "Stereotype");
            addRule("Parameter", "TaggedValue");
            addRule("Parameter", "Usage");
            
            // Port
            addRule("Port", "ConnectorEnd");
            addRule("Port", "Constraint");
            addRule("Port", "MatrixDefinition");
            addRule("Port", "Note");
            addRule("Port", "ExternDocument");
            addRule("Port", "ProvidedInterface");
            addRule("Port", "RequiredInterface");
            addRule("Port", "Stereotype");
            addRule("Port", "TaggedValue");
            addRule("Port", "Usage");
            
            // Profile
            addRule("Profile", "MetaclassReference");
            addRule("Profile", "Stereotype");
            
            // Project
            addRule("Project", "Constraint");
            addRule("Project", "MatrixDefinition");
            addRule("Project", "Note");
            addRule("Project", "ExternDocument");
            addRule("Project", "Package");
            
            // Property
            addRule("Property", "Constraint");
            addRule("Property", "MatrixDefinition");
            addRule("Property", "Note");
            addRule("Property", "ExternDocument");
            
            // PropertyContainer
            addRule("PropertyContainer", "Constraint");
            addRule("PropertyContainer", "MatrixDefinition");
            addRule("PropertyContainer", "Note");
            addRule("PropertyContainer", "ExternDocument");
            addRule("PropertyContainer", "PropertyTableDefinition");
            addRule("PropertyContainer", "PropertyType");
            addRule("PropertyContainer", "EnumeratedPropertyType");
            
            // PropertyEnumerationLitteral
            addRule("PropertyEnumerationLitteral", "Constraint");
            addRule("PropertyEnumerationLitteral", "MatrixDefinition");
            addRule("PropertyEnumerationLitteral", "Note");
            addRule("PropertyEnumerationLitteral", "ExternDocument");
            
            // PropertyDefinition
            addRule("PropertyDefinition", "Constraint");
            addRule("PropertyDefinition", "MatrixDefinition");
            addRule("PropertyDefinition", "Note");
            addRule("PropertyDefinition", "ExternDocument");
            
            // PropertyTableDefinition
            addRule("PropertyTableDefinition", "Constraint");
            addRule("PropertyTableDefinition", "MatrixDefinition");
            addRule("PropertyTableDefinition", "Note");
            addRule("PropertyTableDefinition", "ExternDocument");
            addRule("PropertyTableDefinition", "PropertyDefinition");
            
            // PropertyType
            addRule("PropertyType", "Constraint");
            addRule("PropertyType", "MatrixDefinition");
            addRule("PropertyType", "Note");
            addRule("PropertyType", "ExternDocument");
            
            // ProvidedInterface
            addRule("ProvidedInterface", "Constraint");
            addRule("ProvidedInterface", "MatrixDefinition");
            addRule("ProvidedInterface", "Note");
            addRule("ProvidedInterface", "ExternDocument");
            
            // RaisedException
            addRule("RaisedException", "Constraint");
            addRule("RaisedException", "MatrixDefinition");
            addRule("RaisedException", "Note");
            addRule("RaisedException", "ExternDocument");
            
            // Region
            addRule("Region", "ChoicePseudoState");
            addRule("Region", "Constraint");
            addRule("Region", "MatrixDefinition");
            addRule("Region", "DeepHistoryPseudoState");
            addRule("Region", "FinalState");
            addRule("Region", "ForkPseudoState");
            addRule("Region", "InitialPseudoState");
            addRule("Region", "JoinPseudoState");
            addRule("Region", "JunctionPseudoState");
            addRule("Region", "Note");
            addRule("Region", "ExternDocument");
            addRule("Region", "ShallowHistoryPseudoState");
            addRule("Region", "State");
            addRule("Region", "Stereotype");
            addRule("Region", "TaggedValue");
            addRule("Region", "TerminatePseudoState");
            addRule("Region", "Transition");
            addRule("Region", "Usage");
            
            // RequiredInterface
            addRule("RequiredInterface", "Constraint");
            addRule("RequiredInterface", "MatrixDefinition");
            addRule("RequiredInterface", "Note");
            addRule("RequiredInterface", "ExternDocument");
            
            // Requirement
            addRule("Requirement", "Constraint");
            addRule("Requirement", "MatrixDefinition");
            addRule("Requirement", "Note");
            addRule("Requirement", "ExternDocument");
            addRule("Requirement", "PropertyValueSet");
            addRule("Requirement", "Requirement");
            
            // RequirementContainer
            addRule("RequirementContainer", "Constraint");
            addRule("RequirementContainer", "MatrixDefinition");
            addRule("RequirementContainer", "Note");
            addRule("RequirementContainer", "ExternDocument");
            addRule("RequirementContainer", "Requirement");
            addRule("RequirementContainer", "RequirementContainer");
            addRule("RequirementContainer", "StaticDiagram");
            
            // SendSignalAction
            addRule("SendSignalAction", "Constraint");
            addRule("SendSignalAction", "MatrixDefinition");
            addRule("SendSignalAction", "InputPin");
            addRule("SendSignalAction", "Note");
            addRule("SendSignalAction", "ExternDocument");
            addRule("SendSignalAction", "ValuePin");
            
            // ShallowHistoryPseudoState
            addRule("ShallowHistoryPseudoState", "Constraint");
            addRule("ShallowHistoryPseudoState", "MatrixDefinition");
            addRule("ShallowHistoryPseudoState", "Note");
            addRule("ShallowHistoryPseudoState", "ExternDocument");
            
            // Signal
            addRule("Signal", "AssociationEnd");
            addRule("Signal", "Attribute");
            addRule("Signal", "Collaboration");
            addRule("Signal", "CollaborationUse");
            addRule("Signal", "CommunicationInteraction");
            addRule("Signal", "Constraint");
            addRule("Signal", "MatrixDefinition");
            addRule("Signal", "DataType");
            addRule("Signal", "ElementImport");
            addRule("Signal", "Enumeration");
            addRule("Signal", "Generalization");
            addRule("Signal", "Note");
            addRule("Signal", "ExternDocument");
            addRule("Signal", "Operation");
            addRule("Signal", "PackageImport");
            addRule("Signal", "Port");
            addRule("Signal", "StateMachine");
            addRule("Signal", "Stereotype");
            addRule("Signal", "TaggedValue");
            addRule("Signal", "TemplateBinding");
            addRule("Signal", "TemplateParameter");
            addRule("Signal", "Usage");
            
            // State
            addRule("State", "ConnectionPointReference");
            addRule("State", "Constraint");
            addRule("State", "MatrixDefinition");
            addRule("State", "EntryPointPseudoState");
            addRule("State", "ExitPointPseudoState");
            addRule("State", "InternalTransition");
            addRule("State", "Note");
            addRule("State", "ExternDocument");
            addRule("State", "Region");
            addRule("State", "Stereotype");
            addRule("State", "TaggedValue");
            addRule("State", "Transition");
            addRule("State", "Usage");
            
            // StateInvariant
            addRule("StateInvariant", "Constraint");
            addRule("StateInvariant", "MatrixDefinition");
            addRule("StateInvariant", "Note");
            addRule("StateInvariant", "ExternDocument");
            
            // StateMachine
            addRule("StateMachine", "EntryPointPseudoState");
            addRule("StateMachine", "ExitPointPseudoState");
            addRule("StateMachine", "Region");
            addRule("StateMachine", "StateMachineDiagram");
            addRule("StateMachine", "Event");
            
            // StaticDiagram
            addRule("StaticDiagram", "Constraint");
            addRule("StaticDiagram", "MatrixDefinition");
            addRule("StaticDiagram", "Note");
            addRule("StaticDiagram", "ExternDocument");
            
            // Stereotype
            addRule("Stereotype", "Constraint");
            addRule("Stereotype", "ExternDocument");
            addRule("Stereotype", "ExternDocumentType");
            addRule("Stereotype", "MatrixDefinition");
            addRule("Stereotype", "Note");
            addRule("Stereotype", "NoteType");
            addRule("Stereotype", "TagType");
            
            // StructuredActivityNode
            addRule("StructuredActivityNode", "AcceptCallEventAction");
            addRule("StructuredActivityNode", "AcceptChangeEventAction");
            addRule("StructuredActivityNode", "AcceptSignalAction");
            addRule("StructuredActivityNode", "AcceptTimeEventAction");
            addRule("StructuredActivityNode", "ActivityFinalNode");
            addRule("StructuredActivityNode", "CallBehaviorAction");
            addRule("StructuredActivityNode", "CallOperationAction");
            addRule("StructuredActivityNode", "CentralBufferNode");
            addRule("StructuredActivityNode", "ConditionalNode");
            addRule("StructuredActivityNode", "Constraint");
            addRule("StructuredActivityNode", "MatrixDefinition");
            addRule("StructuredActivityNode", "DataStoreNode");
            addRule("StructuredActivityNode", "DecisionMergeNode");
            addRule("StructuredActivityNode", "FlowFinalNode");
            addRule("StructuredActivityNode", "FlowFinalNode");
            addRule("StructuredActivityNode", "ForkJoinNode");
            addRule("StructuredActivityNode", "InitialNode");
            addRule("StructuredActivityNode", "InputPin");
            addRule("StructuredActivityNode", "ValuePin");
            addRule("StructuredActivityNode", "InstanceNode");
            addRule("StructuredActivityNode", "InterruptibleActivityRegion");
            addRule("StructuredActivityNode", "LoopNode");
            addRule("StructuredActivityNode", "Note");
            addRule("StructuredActivityNode", "ExternDocument");
            addRule("StructuredActivityNode", "OpaqueAction");
            addRule("StructuredActivityNode", "OutputPin");
            addRule("StructuredActivityNode", "SendSignalAction");
            addRule("StructuredActivityNode", "StructuredActivityNode");
            addRule("StructuredActivityNode", "ExpansionRegion");
            
            // TaggedValue
            addRule("TaggedValue", "Constraint");
            addRule("TaggedValue", "MatrixDefinition");
            addRule("TaggedValue", "Note");
            addRule("TaggedValue", "ExternDocument");
            
            // TemplateBinding
            addRule("TemplateBinding", "Constraint");
            addRule("TemplateBinding", "MatrixDefinition");
            addRule("TemplateBinding", "Note");
            addRule("TemplateBinding", "ExternDocument");
            addRule("TemplateBinding", "Stereotype");
            addRule("TemplateBinding", "TaggedValue");
            addRule("TemplateBinding", "TemplateParameterSubstitution");
            addRule("TemplateBinding", "Usage");
            
            // TemplateParameter
            addRule("TemplateParameter", "Artifact");
            addRule("TemplateParameter", "Attribute");
            addRule("TemplateParameter", "BindableInstance");
            addRule("TemplateParameter", "Class");
            addRule("TemplateParameter", "Collaboration");
            addRule("TemplateParameter", "Component");
            addRule("TemplateParameter", "Constraint");
            addRule("TemplateParameter", "MatrixDefinition");
            addRule("TemplateParameter", "DataType");
            addRule("TemplateParameter", "Enumeration");
            addRule("TemplateParameter", "Instance");
            addRule("TemplateParameter", "Interface");
            addRule("TemplateParameter", "Node");
            addRule("TemplateParameter", "Note");
            addRule("TemplateParameter", "ExternDocument");
            addRule("TemplateParameter", "Operation");
            addRule("TemplateParameter", "Package");
            addRule("TemplateParameter", "Port");
            addRule("TemplateParameter", "Signal");
            addRule("TemplateParameter", "StateMachine");
            addRule("TemplateParameter", "Stereotype");
            addRule("TemplateParameter", "TaggedValue");
            addRule("TemplateParameter", "Usage");
            
            // TemplateParameterSubstitution
            addRule("TemplateParameterSubstitution", "Constraint");
            addRule("TemplateParameterSubstitution", "MatrixDefinition");
            addRule("TemplateParameterSubstitution", "Note");
            addRule("TemplateParameterSubstitution", "ExternDocument");
            addRule("TemplateParameterSubstitution", "Stereotype");
            addRule("TemplateParameterSubstitution", "TaggedValue");
            
            // Term
            addRule("Term", "Constraint");
            addRule("Term", "MatrixDefinition");
            addRule("Term", "Note");
            addRule("Term", "ExternDocument");
            
            // TerminatePseudoState
            addRule("TerminatePseudoState", "Constraint");
            addRule("TerminatePseudoState", "MatrixDefinition");
            addRule("TerminatePseudoState", "Note");
            addRule("TerminatePseudoState", "ExternDocument");
            
            // Transition
            addRule("Transition", "Constraint");
            addRule("Transition", "MatrixDefinition");
            addRule("Transition", "Note");
            addRule("Transition", "ExternDocument");
            addRule("Transition", "Stereotype");
            addRule("Transition", "TaggedValue");
            addRule("Transition", "Usage");
            
            // Usage
            addRule("Usage", "Constraint");
            addRule("Usage", "MatrixDefinition");
            addRule("Usage", "Note");
            addRule("Usage", "ExternDocument");
            
            // UseCase
            addRule("UseCase", "Activity");
            addRule("UseCase", "AssociationEnd");
            addRule("UseCase", "Attribute");
            addRule("UseCase", "BindableInstance");
            addRule("UseCase", "Collaboration");
            addRule("UseCase", "CollaborationUse");
            addRule("UseCase", "CommunicationInteraction");
            addRule("UseCase", "Constraint");
            addRule("UseCase", "MatrixDefinition");
            addRule("UseCase", "DataFlow");
            addRule("UseCase", "ElementImport");
            addRule("UseCase", "ExtensionPoint");
            addRule("UseCase", "Generalization");
            addRule("UseCase", "Interaction");
            addRule("UseCase", "Note");
            addRule("UseCase", "ExternDocument");
            addRule("UseCase", "Operation");
            addRule("UseCase", "PackageImport");
            addRule("UseCase", "StateMachine");
            addRule("UseCase", "Stereotype");
            addRule("UseCase", "TaggedValue");
            addRule("UseCase", "TemplateBinding");
            addRule("UseCase", "TemplateParameter");
            addRule("UseCase", "Usage");
            addRule("UseCase", "UseCaseDependency");
            addRule("UseCase", "UseCaseDiagram");
            
            // UseCaseDependency
            addRule("UseCaseDependency", "Constraint");
            addRule("UseCaseDependency", "MatrixDefinition");
            addRule("UseCaseDependency", "Note");
            addRule("UseCaseDependency", "ExternDocument");
            
            // ValuePin
            addRule("ValuePin", "Constraint");
            addRule("ValuePin", "MatrixDefinition");
            addRule("ValuePin", "Note");
            addRule("ValuePin", "ExternDocument");
        }

        @objid ("006c472e-e60a-1097-bcec-001ec947cd2a")
        private void registerBpmnNodes() {
            // BpmnCollaboration
            addRule("BpmnCollaboration", "BpmnMessageFlow");
            addRule("BpmnCollaboration", "BpmnArtifact");
            addRule("BpmnCollaboration", "BpmnAssociation");
            addRule("BpmnCollaboration", "BpmnGroup");
            addRule("BpmnCollaboration", "BpmnParticipant");
            addRule("BpmnCollaboration", "Note");
            addRule("BpmnCollaboration", "ExternDocument");
            
            // BpmnLane
            addRule("BpmnLane", "BpmnLaneSet");
            addRule("BpmnLane", "Note");
            addRule("BpmnLane", "ExternDocument");
            
            // BpmnLaneSet
            addRule("BpmnLaneSet", "BpmnLane");
            addRule("BpmnLaneSet", "Note");
            addRule("BpmnLaneSet", "ExternDocument");
            
            // BpmnProcess
            addRule("BpmnProcess", "BpmnLaneSet");
            addRule("BpmnProcess", "Note");
            addRule("BpmnProcess", "ExternDocument");
            addRule("BpmnProcess", "BpmnResourceRole");
            addRule("BpmnProcess", "BpmnArtifact");
            addRule("BpmnProcess", "BpmnAssociation");
            addRule("BpmnProcess", "BpmnGroup");
            addRule("BpmnProcess", "BpmnFlowElement");
            addRule("BpmnProcess", "BpmnFlowNode");
            addRule("BpmnProcess", "BpmnActivity");
            addRule("BpmnProcess", "BpmnCallActivity");
            addRule("BpmnProcess", "BpmnSubProcess");
            addRule("BpmnProcess", "BpmnAdHocSubProcess");
            addRule("BpmnProcess", "BpmnTransaction");
            addRule("BpmnProcess", "BpmnTask");
            addRule("BpmnProcess", "BpmnManualTask");
            addRule("BpmnProcess", "BpmnServiceTask");
            addRule("BpmnProcess", "BpmnSendTask");
            addRule("BpmnProcess", "BpmnBusinessRuleTask");
            addRule("BpmnProcess", "BpmnUserTask");
            addRule("BpmnProcess", "BpmnReceiveTask");
            addRule("BpmnProcess", "BpmnScriptTask");
            addRule("BpmnProcess", "BpmnEvent");
            addRule("BpmnProcess", "BpmnCatchEvent");
            addRule("BpmnProcess", "BpmnBoundaryEvent");
            addRule("BpmnProcess", "BpmnIntermediateCatchEvent");
            addRule("BpmnProcess", "BpmnStartEvent");
            addRule("BpmnProcess", "BpmnThrowEvent");
            addRule("BpmnProcess", "BpmnEndEvent");
            addRule("BpmnProcess", "BpmnIntermediateThrowEvent");
            addRule("BpmnProcess", "BpmnImplicitThrowEvent");
            addRule("BpmnProcess", "BpmnGateway");
            addRule("BpmnProcess", "BpmnComplexGateway");
            addRule("BpmnProcess", "BpmnEventBasedGateway");
            addRule("BpmnProcess", "BpmnExclusiveGateway");
            addRule("BpmnProcess", "BpmnInclusiveGateway");
            addRule("BpmnProcess", "BpmnParallelGateway");
            addRule("BpmnProcess", "BpmnItemAwareElement");
            addRule("BpmnProcess", "BpmnDataOutput");
            addRule("BpmnProcess", "BpmnDataStore");
            addRule("BpmnProcess", "BpmnDataObject");
            addRule("BpmnProcess", "BpmnDataInput");
            addRule("BpmnProcess", "BpmnSequenceFlow");
            addRule("BpmnProcess", "BpmnProcessCollaborationDiagram");
            
            // BpmnFlowNode
            addRule("BpmnFlowNode", "BpmnResourceRole");
            addRule("BpmnFlowNode", "Note");
            addRule("BpmnFlowNode", "ExternDocument");
            
            // BpmnActivity
            addRule("BpmnActivity", "BpmnResourceRole");
            addRule("BpmnActivity", "Note");
            addRule("BpmnActivity", "ExternDocument");
            
            // BpmnCallActivity
            addRule("BpmnCallActivity", "BpmnResourceRole");
            addRule("BpmnCallActivity", "Note");
            addRule("BpmnCallActivity", "ExternDocument");
            
            // BpmnSubProcess
            addRule("BpmnSubProcess", "BpmnResourceRole");
            addRule("BpmnSubProcess", "Note");
            addRule("BpmnSubProcess", "BpmnSubProcessDiagram");
            
            // BpmnAdHocSubProcess
            addRule("BpmnAdHocSubProcess", "BpmnResourceRole");
            addRule("BpmnAdHocSubProcess", "Note");
            addRule("BpmnAdHocSubProcess", "ExternDocument");
            
            // BpmnTransaction
            addRule("BpmnTransaction", "BpmnResourceRole");
            addRule("BpmnTransaction", "Note");
            addRule("BpmnTransaction", "ExternDocument");
            
            // BpmnTask
            addRule("BpmnTask", "BpmnResourceRole");
            addRule("BpmnTask", "Note");
            addRule("BpmnTask", "ExternDocument");
            
            // BpmnManualTask
            addRule("BpmnManualTask", "BpmnResourceRole");
            addRule("BpmnManualTask", "Note");
            addRule("BpmnManualTask", "ExternDocument");
            
            // BpmnServiceTask
            addRule("BpmnServiceTask", "BpmnResourceRole");
            addRule("BpmnServiceTask", "Note");
            addRule("BpmnServiceTask", "ExternDocument");
            
            // BpmnSendTask
            addRule("BpmnSendTask", "BpmnResourceRole");
            addRule("BpmnSendTask", "Note");
            addRule("BpmnSendTask", "ExternDocument");
            
            // BpmnBusinessRuleTask
            addRule("BpmnBusinessRuleTask", "BpmnResourceRole");
            addRule("BpmnBusinessRuleTask", "Note");
            addRule("BpmnBusinessRuleTask", "ExternDocument");
            
            // BpmnUserTask
            addRule("BpmnUserTask", "BpmnResourceRole");
            addRule("BpmnUserTask", "Note");
            addRule("BpmnUserTask", "ExternDocument");
            
            // BpmnReceiveTask
            addRule("BpmnReceiveTask", "BpmnResourceRole");
            addRule("BpmnReceiveTask", "Note");
            addRule("BpmnReceiveTask", "ExternDocument");
            
            // BpmnScriptTask
            addRule("BpmnScriptTask", "BpmnResourceRole");
            addRule("BpmnScriptTask", "Note");
            addRule("BpmnScriptTask", "ExternDocument");
            
            // BpmnEvent
            addRule("BpmnEvent", "BpmnResourceRole");
            addRule("BpmnEvent", "Note");
            addRule("BpmnEvent", "ExternDocument");
            
            // BpmnCatchEvent
            addRule("BpmnCatchEvent", "BpmnResourceRole");
            addRule("BpmnCatchEvent", "Note");
            addRule("BpmnCatchEvent", "ExternDocument");
            
            // BpmnBoundaryEvent
            addRule("BpmnBoundaryEvent", "BpmnResourceRole");
            addRule("BpmnBoundaryEvent", "Note");
            addRule("BpmnBoundaryEvent", "ExternDocument");
            
            // BpmnIntermediateCatchEvent
            addRule("BpmnIntermediateCatchEvent", "BpmnResourceRole");
            addRule("BpmnIntermediateCatchEvent", "Note");
            addRule("BpmnIntermediateCatchEvent", "ExternDocument");
            
            // BpmnStartEvent
            addRule("BpmnStartEvent", "BpmnResourceRole");
            addRule("BpmnStartEvent", "Note");
            addRule("BpmnStartEvent", "ExternDocument");
            
            // BpmnThrowEvent
            addRule("BpmnThrowEvent", "BpmnResourceRole");
            addRule("BpmnThrowEvent", "Note");
            addRule("BpmnThrowEvent", "ExternDocument");
            
            // BpmnEndEvent
            addRule("BpmnEndEvent", "BpmnResourceRole");
            addRule("BpmnEndEvent", "Note");
            addRule("BpmnEndEvent", "ExternDocument");
            
            // BpmnIntermediateThrowEvent
            addRule("BpmnIntermediateThrowEvent", "BpmnResourceRole");
            addRule("BpmnIntermediateThrowEvent", "Note");
            addRule("BpmnIntermediateThrowEvent", "ExternDocument");
            
            // BpmnImplicitThrowEvent
            addRule("BpmnImplicitThrowEvent", "BpmnResourceRole");
            addRule("BpmnImplicitThrowEvent", "Note");
            addRule("BpmnImplicitThrowEvent", "ExternDocument");
            
            // BpmnGateway
            addRule("BpmnGateway", "BpmnResourceRole");
            addRule("BpmnGateway", "Note");
            addRule("BpmnGateway", "ExternDocument");
            
            // BpmnComplexGateway
            addRule("BpmnComplexGateway", "BpmnResourceRole");
            addRule("BpmnComplexGateway", "Note");
            addRule("BpmnComplexGateway", "ExternDocument");
            
            // BpmnEventBasedGateway
            addRule("BpmnEventBasedGateway", "BpmnResourceRole");
            addRule("BpmnEventBasedGateway", "Note");
            addRule("BpmnEventBasedGateway", "ExternDocument");
            
            // BpmnExclusiveGateway
            addRule("BpmnExclusiveGateway", "BpmnResourceRole");
            addRule("BpmnExclusiveGateway", "Note");
            addRule("BpmnExclusiveGateway", "ExternDocument ");
            
            // BpmnInclusiveGateway
            addRule("BpmnInclusiveGateway", "BpmnResourceRole");
            addRule("BpmnInclusiveGateway", "Note");
            addRule("BpmnInclusiveGateway", "ExternDocument");
            
            // BpmnParallelGateway
            addRule("BpmnParallelGateway", "BpmnResourceRole");
            addRule("BpmnParallelGateway", "Note");
            addRule("BpmnParallelGateway", "ExternDocument");
            
            // BpmnBehavior
            addRule("BpmnBehavior", "BpmnRootElement");
            addRule("BpmnBehavior", "BpmnCollaboration");
            addRule("BpmnBehavior", "BpmnProcess");
            addRule("BpmnBehavior", "BpmnMessage");
            addRule("BpmnBehavior", "BpmnEndPoint");
            addRule("BpmnBehavior", "BpmnItemDefinition");
            addRule("BpmnBehavior", "BpmnResource");
            addRule("BpmnBehavior", "BpmnInterface");
            addRule("BpmnBehavior", "Note");
            addRule("BpmnBehavior", "ExternDocument");
            
            // BpmnSequenceFlow
            addRule("BpmnSequenceFlow", "BpmnSequenceFlowDataAssociation");
            addRule("BpmnSequenceFlow", "Note");
            addRule("BpmnSequenceFlow", "ExternDocument");
            
            // BpmnActivity
            addRule("BpmnActivity", "BpmnDataInput");
            addRule("BpmnActivity", "Note");
            addRule("BpmnActivity", "ExternDocument");
            
            // BpmnCallActivity
            addRule("BpmnCallActivity", "BpmnDataInput");
            addRule("BpmnCallActivity", "Note");
            addRule("BpmnCallActivity", "ExternDocument");
            
            // BpmnSubProcess
            addRule("BpmnSubProcess", "BpmnDataInput");
            addRule("BpmnSubProcess", "Note");
            addRule("BpmnSubProcess", "ExternDocument");
            
            // BpmnAdHocSubProcess
            addRule("BpmnAdHocSubProcess", "BpmnDataInput");
            addRule("BpmnAdHocSubProcess", "Note");
            addRule("BpmnAdHocSubProcess", "ExternDocument");
            
            // BpmnTransaction
            addRule("BpmnTransaction", "BpmnDataInput");
            addRule("BpmnTransaction", "Note");
            addRule("BpmnTransaction", "ExternDocument");
            
            // BpmnTask
            addRule("BpmnTask", "BpmnDataInput");
            addRule("BpmnTask", "Note");
            addRule("BpmnTask", "ExternDocument");
            
            // BpmnManualTask
            addRule("BpmnManualTask", "BpmnDataInput");
            addRule("BpmnManualTask", "Note");
            addRule("BpmnManualTask", "ExternDocument");
            
            // BpmnServiceTask
            addRule("BpmnServiceTask", "BpmnDataInput");
            addRule("BpmnServiceTask", "Note");
            addRule("BpmnServiceTask", "ExternDocument");
            
            // BpmnSendTask
            addRule("BpmnSendTask", "BpmnDataInput");
            addRule("BpmnSendTask", "Note");
            addRule("BpmnSendTask", "ExternDocument");
            
            // BpmnBusinessRuleTask
            addRule("BpmnBusinessRuleTask", "BpmnDataInput");
            addRule("BpmnBusinessRuleTask", "Note");
            addRule("BpmnBusinessRuleTask", "ExternDocument");
            
            // BpmnUserTask
            addRule("BpmnUserTask", "BpmnDataInput");
            addRule("BpmnUserTask", "Note");
            addRule("BpmnUserTask", "ExternDocument");
            
            // BpmnReceiveTask
            addRule("BpmnReceiveTask", "BpmnDataInput");
            addRule("BpmnReceiveTask", "Note");
            addRule("BpmnReceiveTask", "ExternDocument");
            
            // BpmnScriptTask
            addRule("BpmnScriptTask", "BpmnDataInput");
            addRule("BpmnScriptTask", "Note");
            addRule("BpmnScriptTask", "ExternDocument");
            
            // BpmnActivity
            addRule("BpmnActivity", "BpmnDataOutput");
            
            // BpmnCallActivity
            addRule("BpmnCallActivity", "BpmnDataOutput");
            
            // BpmnSubProcess
            addRule("BpmnSubProcess", "BpmnDataOutput");
            
            // BpmnAdHocSubProcess
            addRule("BpmnAdHocSubProcess", "BpmnDataOutput");
            
            // BpmnTransaction
            addRule("BpmnTransaction", "BpmnDataOutput");
            
            // BpmnTask
            addRule("BpmnTask", "BpmnDataOutput");
            
            // BpmnManualTask
            addRule("BpmnManualTask", "BpmnDataOutput");
            
            // BpmnServiceTask
            addRule("BpmnServiceTask", "BpmnDataOutput");
            
            // BpmnSendTask
            addRule("BpmnSendTask", "BpmnDataOutput");
            
            // BpmnBusinessRuleTask
            addRule("BpmnBusinessRuleTask", "BpmnDataOutput");
            
            // BpmnUserTask
            addRule("BpmnUserTask", "BpmnDataOutput");
            
            // BpmnReceiveTask
            addRule("BpmnReceiveTask", "BpmnDataOutput");
            
            // BpmnScriptTask
            addRule("BpmnScriptTask", "BpmnDataOutput");
            
            // BpmnActivity
            addRule("BpmnActivity", "BpmnDataAssociation");
            
            // BpmnCallActivity
            addRule("BpmnCallActivity", "BpmnDataAssociation");
            
            // BpmnSubProcess
            addRule("BpmnSubProcess", "BpmnDataAssociation");
            
            // BpmnAdHocSubProcess
            addRule("BpmnAdHocSubProcess", "BpmnDataAssociation");
            
            // BpmnTransaction
            addRule("BpmnTransaction", "BpmnDataAssociation");
            
            // BpmnTask
            addRule("BpmnTask", "BpmnDataAssociation");
            
            // BpmnManualTask
            addRule("BpmnManualTask", "BpmnDataAssociation");
            
            // BpmnServiceTask
            addRule("BpmnServiceTask", "BpmnDataAssociation");
            
            // BpmnSendTask
            addRule("BpmnSendTask", "BpmnDataAssociation");
            
            // BpmnBusinessRuleTask
            addRule("BpmnBusinessRuleTask", "BpmnDataAssociation");
            
            // BpmnUserTask
            addRule("BpmnUserTask", "BpmnDataAssociation");
            
            // BpmnReceiveTask
            addRule("BpmnReceiveTask", "BpmnDataAssociation");
            
            // BpmnScriptTask
            addRule("BpmnScriptTask", "BpmnDataAssociation");
            
            // BpmnActivity
            addRule("BpmnActivity", "BpmnDataAssociation");
            
            // BpmnCallActivity
            addRule("BpmnCallActivity", "BpmnDataAssociation");
            
            // BpmnSubProcess
            addRule("BpmnSubProcess", "BpmnDataAssociation");
            
            // BpmnAdHocSubProcess
            addRule("BpmnAdHocSubProcess", "BpmnDataAssociation");
            
            // BpmnTransaction
            addRule("BpmnTransaction", "BpmnDataAssociation");
            
            // BpmnTask
            addRule("BpmnTask", "BpmnDataAssociation");
            
            // BpmnManualTask
            addRule("BpmnManualTask", "BpmnDataAssociation");
            
            // BpmnServiceTask
            addRule("BpmnServiceTask", "BpmnDataAssociation");
            
            // BpmnSendTask
            addRule("BpmnSendTask", "BpmnDataAssociation");
            
            // BpmnBusinessRuleTask
            addRule("BpmnBusinessRuleTask", "BpmnDataAssociation");
            
            // BpmnUserTask
            addRule("BpmnUserTask", "BpmnDataAssociation");
            
            // BpmnReceiveTask
            addRule("BpmnReceiveTask", "BpmnDataAssociation");
            
            // BpmnScriptTask
            addRule("BpmnScriptTask", "BpmnDataAssociation");
            
            // BpmnActivity
            addRule("BpmnActivity", "BpmnLoopCharacteristics");
            addRule("BpmnActivity", "BpmnStandardLoopCharacteristics");
            addRule("BpmnActivity", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnCallActivity
            addRule("BpmnCallActivity", "BpmnLoopCharacteristics");
            addRule("BpmnCallActivity", "BpmnStandardLoopCharacteristics");
            addRule("BpmnCallActivity", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnSubProcess
            addRule("BpmnSubProcess", "BpmnLoopCharacteristics");
            addRule("BpmnSubProcess", "BpmnStandardLoopCharacteristics");
            addRule("BpmnSubProcess", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnAdHocSubProcess
            addRule("BpmnAdHocSubProcess", "BpmnLoopCharacteristics");
            addRule("BpmnAdHocSubProcess", "BpmnStandardLoopCharacteristics");
            addRule("BpmnAdHocSubProcess", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnTransaction
            addRule("BpmnTransaction", "BpmnLoopCharacteristics");
            addRule("BpmnTransaction", "BpmnStandardLoopCharacteristics");
            addRule("BpmnTransaction", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnTask
            addRule("BpmnTask", "BpmnLoopCharacteristics");
            addRule("BpmnTask", "BpmnStandardLoopCharacteristics");
            addRule("BpmnTask", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnManualTask
            addRule("BpmnManualTask", "BpmnLoopCharacteristics");
            addRule("BpmnManualTask", "BpmnStandardLoopCharacteristics");
            addRule("BpmnManualTask", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnServiceTask
            addRule("BpmnServiceTask", "BpmnLoopCharacteristics");
            addRule("BpmnServiceTask", "BpmnStandardLoopCharacteristics");
            addRule("BpmnServiceTask", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnSendTask
            addRule("BpmnSendTask", "BpmnLoopCharacteristics");
            addRule("BpmnSendTask", "BpmnStandardLoopCharacteristics");
            addRule("BpmnSendTask", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnBusinessRuleTask
            addRule("BpmnBusinessRuleTask", "BpmnLoopCharacteristics");
            addRule("BpmnBusinessRuleTask", "BpmnStandardLoopCharacteristics");
            addRule("BpmnBusinessRuleTask", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnUserTask
            addRule("BpmnUserTask", "BpmnLoopCharacteristics");
            addRule("BpmnUserTask", "BpmnStandardLoopCharacteristics");
            addRule("BpmnUserTask", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnReceiveTask
            addRule("BpmnReceiveTask", "BpmnLoopCharacteristics");
            addRule("BpmnReceiveTask", "BpmnStandardLoopCharacteristics");
            addRule("BpmnReceiveTask", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnScriptTask
            addRule("BpmnScriptTask", "BpmnLoopCharacteristics");
            addRule("BpmnScriptTask", "BpmnStandardLoopCharacteristics");
            addRule("BpmnScriptTask", "BpmnMultiInstanceLoopCharacteristics");
            
            // BpmnComplexBehaviorDefinition
            addRule("BpmnComplexBehaviorDefinition", "BpmnImplicitThrowEvent");
            
            // BpmnMultiInstanceLoopCharacteristics
            addRule("BpmnMultiInstanceLoopCharacteristics", "BpmnDataInput");
            
            // BpmnMultiInstanceLoopCharacteristics
            addRule("BpmnMultiInstanceLoopCharacteristics", "BpmnDataOutput");
            
            // BpmnMultiInstanceLoopCharacteristics
            addRule("BpmnMultiInstanceLoopCharacteristics", "BpmnComplexBehaviorDefinition");
            
            // BpmnSubProcess
            addRule("BpmnSubProcess", "BpmnFlowElement");
            addRule("BpmnSubProcess", "BpmnFlowNode");
            addRule("BpmnSubProcess", "BpmnActivity");
            addRule("BpmnSubProcess", "BpmnCallActivity");
            addRule("BpmnSubProcess", "BpmnSubProcess");
            addRule("BpmnSubProcess", "BpmnAdHocSubProcess");
            addRule("BpmnSubProcess", "BpmnTransaction");
            addRule("BpmnSubProcess", "BpmnTask");
            addRule("BpmnSubProcess", "BpmnManualTask");
            addRule("BpmnSubProcess", "BpmnServiceTask");
            addRule("BpmnSubProcess", "BpmnSendTask");
            addRule("BpmnSubProcess", "BpmnBusinessRuleTask");
            addRule("BpmnSubProcess", "BpmnUserTask");
            addRule("BpmnSubProcess", "BpmnReceiveTask");
            addRule("BpmnSubProcess", "BpmnScriptTask");
            addRule("BpmnSubProcess", "BpmnEvent");
            addRule("BpmnSubProcess", "BpmnCatchEvent");
            addRule("BpmnSubProcess", "BpmnBoundaryEvent");
            addRule("BpmnSubProcess", "BpmnIntermediateCatchEvent");
            addRule("BpmnSubProcess", "BpmnStartEvent");
            addRule("BpmnSubProcess", "BpmnThrowEvent");
            addRule("BpmnSubProcess", "BpmnEndEvent");
            addRule("BpmnSubProcess", "BpmnIntermediateThrowEvent");
            addRule("BpmnSubProcess", "BpmnImplicitThrowEvent");
            addRule("BpmnSubProcess", "BpmnGateway");
            addRule("BpmnSubProcess", "BpmnComplexGateway");
            addRule("BpmnSubProcess", "BpmnEventBasedGateway");
            addRule("BpmnSubProcess", "BpmnExclusiveGateway");
            addRule("BpmnSubProcess", "BpmnInclusiveGateway");
            addRule("BpmnSubProcess", "BpmnParallelGateway");
            addRule("BpmnSubProcess", "BpmnItemAwareElement");
            addRule("BpmnSubProcess", "BpmnDataOutput");
            addRule("BpmnSubProcess", "BpmnDataStore");
            addRule("BpmnSubProcess", "BpmnDataObject");
            addRule("BpmnSubProcess", "BpmnDataInput");
            addRule("BpmnSubProcess", "BpmnSequenceFlow");
            addRule("BpmnSubProcess", "Note");
            addRule("BpmnSubProcess", "ExternDocument");
            
            // BpmnAdHocSubProcess
            addRule("BpmnAdHocSubProcess", "BpmnFlowElement");
            addRule("BpmnAdHocSubProcess", "BpmnFlowNode");
            addRule("BpmnAdHocSubProcess", "BpmnActivity");
            addRule("BpmnAdHocSubProcess", "BpmnCallActivity");
            addRule("BpmnAdHocSubProcess", "BpmnSubProcess");
            addRule("BpmnAdHocSubProcess", "BpmnAdHocSubProcess");
            addRule("BpmnAdHocSubProcess", "BpmnTransaction");
            addRule("BpmnAdHocSubProcess", "BpmnTask");
            addRule("BpmnAdHocSubProcess", "BpmnManualTask");
            addRule("BpmnAdHocSubProcess", "BpmnServiceTask");
            addRule("BpmnAdHocSubProcess", "BpmnSendTask");
            addRule("BpmnAdHocSubProcess", "BpmnBusinessRuleTask");
            addRule("BpmnAdHocSubProcess", "BpmnUserTask");
            addRule("BpmnAdHocSubProcess", "BpmnReceiveTask");
            addRule("BpmnAdHocSubProcess", "BpmnScriptTask");
            addRule("BpmnAdHocSubProcess", "BpmnEvent");
            addRule("BpmnAdHocSubProcess", "BpmnCatchEvent");
            addRule("BpmnAdHocSubProcess", "BpmnBoundaryEvent");
            addRule("BpmnAdHocSubProcess", "BpmnIntermediateCatchEvent");
            addRule("BpmnAdHocSubProcess", "BpmnStartEvent");
            addRule("BpmnAdHocSubProcess", "BpmnThrowEvent");
            addRule("BpmnAdHocSubProcess", "BpmnEndEvent");
            addRule("BpmnAdHocSubProcess", "BpmnIntermediateThrowEvent");
            addRule("BpmnAdHocSubProcess", "BpmnImplicitThrowEvent");
            addRule("BpmnAdHocSubProcess", "BpmnGateway");
            addRule("BpmnAdHocSubProcess", "BpmnComplexGateway");
            addRule("BpmnAdHocSubProcess", "BpmnEventBasedGateway");
            addRule("BpmnAdHocSubProcess", "BpmnExclusiveGateway");
            addRule("BpmnAdHocSubProcess", "BpmnInclusiveGateway");
            addRule("BpmnAdHocSubProcess", "BpmnParallelGateway");
            addRule("BpmnAdHocSubProcess", "BpmnItemAwareElement");
            addRule("BpmnAdHocSubProcess", "BpmnDataOutput");
            addRule("BpmnAdHocSubProcess", "BpmnDataStore");
            addRule("BpmnAdHocSubProcess", "BpmnDataObject");
            addRule("BpmnAdHocSubProcess", "BpmnDataInput");
            addRule("BpmnAdHocSubProcess", "BpmnSequenceFlow");
            addRule("BpmnAdHocSubProcess", "Note");
            addRule("BpmnAdHocSubProcess", "ExternDocument");
            
            // BpmnTransaction
            addRule("BpmnTransaction", "BpmnFlowElement");
            addRule("BpmnTransaction", "BpmnFlowNode");
            addRule("BpmnTransaction", "BpmnActivity");
            addRule("BpmnTransaction", "BpmnCallActivity");
            addRule("BpmnTransaction", "BpmnSubProcess");
            addRule("BpmnTransaction", "BpmnAdHocSubProcess");
            addRule("BpmnTransaction", "BpmnTransaction");
            addRule("BpmnTransaction", "BpmnTask");
            addRule("BpmnTransaction", "BpmnManualTask");
            addRule("BpmnTransaction", "BpmnServiceTask");
            addRule("BpmnTransaction", "BpmnSendTask");
            addRule("BpmnTransaction", "BpmnBusinessRuleTask");
            addRule("BpmnTransaction", "BpmnUserTask");
            addRule("BpmnTransaction", "BpmnReceiveTask");
            addRule("BpmnTransaction", "BpmnScriptTask");
            addRule("BpmnTransaction", "BpmnEvent");
            addRule("BpmnTransaction", "BpmnCatchEvent");
            addRule("BpmnTransaction", "BpmnBoundaryEvent");
            addRule("BpmnTransaction", "BpmnIntermediateCatchEvent");
            addRule("BpmnTransaction", "BpmnStartEvent");
            addRule("BpmnTransaction", "BpmnThrowEvent");
            addRule("BpmnTransaction", "BpmnEndEvent");
            addRule("BpmnTransaction", "BpmnIntermediateThrowEvent");
            addRule("BpmnTransaction", "BpmnImplicitThrowEvent");
            addRule("BpmnTransaction", "BpmnGateway");
            addRule("BpmnTransaction", "BpmnComplexGateway");
            addRule("BpmnTransaction", "BpmnEventBasedGateway");
            addRule("BpmnTransaction", "BpmnExclusiveGateway");
            addRule("BpmnTransaction", "BpmnInclusiveGateway");
            addRule("BpmnTransaction", "BpmnParallelGateway");
            addRule("BpmnTransaction", "BpmnItemAwareElement");
            addRule("BpmnTransaction", "BpmnDataOutput");
            addRule("BpmnTransaction", "BpmnDataStore");
            addRule("BpmnTransaction", "BpmnDataObject");
            addRule("BpmnTransaction", "BpmnDataInput");
            addRule("BpmnTransaction", "BpmnSequenceFlow");
            addRule("BpmnTransaction", "Note");
            addRule("BpmnTransaction", "ExternDocument");
            
            // BpmnSubProcess
            addRule("BpmnSubProcess", "BpmnArtifact");
            addRule("BpmnSubProcess", "BpmnAssociation");
            addRule("BpmnSubProcess", "BpmnGroup");
            addRule("BpmnSubProcess", "Note");
            addRule("BpmnSubProcess", "ExternDocument");
            
            // BpmnAdHocSubProcess
            addRule("BpmnAdHocSubProcess", "BpmnArtifact");
            addRule("BpmnAdHocSubProcess", "BpmnAssociation");
            addRule("BpmnAdHocSubProcess", "BpmnGroup");
            addRule("BpmnAdHocSubProcess", "ExternDocument");
            
            // BpmnTransaction
            addRule("BpmnTransaction", "BpmnArtifact");
            addRule("BpmnTransaction", "BpmnAssociation");
            addRule("BpmnTransaction", "BpmnGroup");
            addRule("BpmnTransaction", "ExternDocument");
            
            // BpmnCatchEvent
            addRule("BpmnCatchEvent", "BpmnDataOutput");
            addRule("BpmnCatchEvent", "ExternDocument");
            
            // BpmnBoundaryEvent
            addRule("BpmnBoundaryEvent", "BpmnDataOutput");
            addRule("BpmnBoundaryEvent", "Note");
            addRule("BpmnBoundaryEvent", "ExternDocument");
            
            // BpmnIntermediateCatchEvent
            addRule("BpmnIntermediateCatchEvent", "BpmnDataOutput");
            addRule("BpmnIntermediateCatchEvent", "Note");
            addRule("BpmnIntermediateCatchEvent", "ExternDocument");
            
            // BpmnStartEvent
            addRule("BpmnStartEvent", "BpmnDataOutput");
            addRule("BpmnStartEvent", "Note");
            addRule("BpmnStartEvent", "ExternDocument");
            
            // BpmnCatchEvent
            addRule("BpmnCatchEvent", "BpmnDataAssociation");
            addRule("BpmnCatchEvent", "Note");
            addRule("BpmnCatchEvent", "ExternDocument");
            
            // BpmnBoundaryEvent
            addRule("BpmnBoundaryEvent", "BpmnDataAssociation");
            addRule("BpmnBoundaryEvent", "Note");
            addRule("BpmnBoundaryEvent", "ExternDocument");
            
            // BpmnIntermediateCatchEvent
            addRule("BpmnIntermediateCatchEvent", "BpmnDataAssociation");
            addRule("BpmnIntermediateCatchEvent", "Note");
            addRule("BpmnIntermediateCatchEvent", "ExternDocument");
            
            // BpmnStartEvent
            addRule("BpmnStartEvent", "BpmnDataAssociation");
            addRule("BpmnStartEvent", "Note");
            addRule("BpmnStartEvent", "ExternDocument");
            
            // BpmnEvent
            addRule("BpmnEvent", "BpmnEventDefinition");
            addRule("BpmnEvent", "BpmnCancelEventDefinition");
            addRule("BpmnEvent", "BpmnEscalationEventDefinition");
            addRule("BpmnEvent", "BpmnConditionalEventDefinition");
            addRule("BpmnEvent", "BpmnCompensateEventDefinition");
            addRule("BpmnEvent", "BpmnErrorEventDefinition");
            addRule("BpmnEvent", "BpmnSignalEventDefinition");
            addRule("BpmnEvent", "BpmnLinkEventDefinition");
            addRule("BpmnEvent", "BpmnTerminateEventDefinition");
            addRule("BpmnEvent", "BpmnMessageEventDefinition");
            addRule("BpmnEvent", "BpmnTimerEventDefinition");
            addRule("BpmnEvent", "Note");
            addRule("BpmnEvent", "ExternDocument");
            
            // BpmnCatchEvent
            addRule("BpmnCatchEvent", "BpmnEventDefinition");
            addRule("BpmnCatchEvent", "BpmnCancelEventDefinition");
            addRule("BpmnCatchEvent", "BpmnEscalationEventDefinition");
            addRule("BpmnCatchEvent", "BpmnConditionalEventDefinition");
            addRule("BpmnCatchEvent", "BpmnCompensateEventDefinition");
            addRule("BpmnCatchEvent", "BpmnErrorEventDefinition");
            addRule("BpmnCatchEvent", "BpmnSignalEventDefinition");
            addRule("BpmnCatchEvent", "BpmnLinkEventDefinition");
            addRule("BpmnCatchEvent", "BpmnTerminateEventDefinition");
            addRule("BpmnCatchEvent", "BpmnMessageEventDefinition");
            addRule("BpmnCatchEvent", "BpmnTimerEventDefinition");
            addRule("BpmnCatchEvent", "Note");
            addRule("BpmnCatchEvent", "ExternDocument");
            
            // BpmnBoundaryEvent
            addRule("BpmnBoundaryEvent", "BpmnEventDefinition");
            addRule("BpmnBoundaryEvent", "BpmnCancelEventDefinition");
            addRule("BpmnBoundaryEvent", "BpmnEscalationEventDefinition");
            addRule("BpmnBoundaryEvent", "BpmnConditionalEventDefinition");
            addRule("BpmnBoundaryEvent", "BpmnCompensateEventDefinition");
            addRule("BpmnBoundaryEvent", "BpmnErrorEventDefinition");
            addRule("BpmnBoundaryEvent", "BpmnSignalEventDefinition");
            addRule("BpmnBoundaryEvent", "BpmnLinkEventDefinition");
            addRule("BpmnBoundaryEvent", "BpmnTerminateEventDefinition");
            addRule("BpmnBoundaryEvent", "BpmnMessageEventDefinition");
            addRule("BpmnBoundaryEvent", "BpmnTimerEventDefinition");
            addRule("BpmnBoundaryEvent", "Note");
            addRule("BpmnBoundaryEvent", "ExternDocument");
            
            // BpmnIntermediateCatchEvent
            addRule("BpmnIntermediateCatchEvent", "BpmnEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "BpmnCancelEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "BpmnEscalationEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "BpmnConditionalEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "BpmnCompensateEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "BpmnErrorEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "BpmnSignalEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "BpmnLinkEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "BpmnTerminateEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "BpmnMessageEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "BpmnTimerEventDefinition");
            addRule("BpmnIntermediateCatchEvent", "Note");
            addRule("BpmnIntermediateCatchEvent", "ExternDocument");
            
            // BpmnStartEvent
            addRule("BpmnStartEvent", "BpmnEventDefinition");
            addRule("BpmnStartEvent", "BpmnCancelEventDefinition");
            addRule("BpmnStartEvent", "BpmnEscalationEventDefinition");
            addRule("BpmnStartEvent", "BpmnConditionalEventDefinition");
            addRule("BpmnStartEvent", "BpmnCompensateEventDefinition");
            addRule("BpmnStartEvent", "BpmnErrorEventDefinition");
            addRule("BpmnStartEvent", "BpmnSignalEventDefinition");
            addRule("BpmnStartEvent", "BpmnLinkEventDefinition");
            addRule("BpmnStartEvent", "BpmnTerminateEventDefinition");
            addRule("BpmnStartEvent", "BpmnMessageEventDefinition");
            addRule("BpmnStartEvent", "BpmnTimerEventDefinition");
            addRule("BpmnStartEvent", "Note");
            addRule("BpmnStartEvent", "ExternDocument");
            
            // BpmnThrowEvent
            addRule("BpmnThrowEvent", "BpmnEventDefinition");
            addRule("BpmnThrowEvent", "BpmnCancelEventDefinition");
            addRule("BpmnThrowEvent", "BpmnEscalationEventDefinition");
            addRule("BpmnThrowEvent", "BpmnConditionalEventDefinition");
            addRule("BpmnThrowEvent", "BpmnCompensateEventDefinition");
            addRule("BpmnThrowEvent", "BpmnErrorEventDefinition");
            addRule("BpmnThrowEvent", "BpmnSignalEventDefinition");
            addRule("BpmnThrowEvent", "BpmnLinkEventDefinition");
            addRule("BpmnThrowEvent", "BpmnTerminateEventDefinition");
            addRule("BpmnThrowEvent", "BpmnMessageEventDefinition");
            addRule("BpmnThrowEvent", "BpmnTimerEventDefinition");
            addRule("BpmnThrowEvent", "Note");
            addRule("BpmnThrowEvent", "ExternDocument");
            
            // BpmnEndEvent
            addRule("BpmnEndEvent", "BpmnEventDefinition");
            addRule("BpmnEndEvent", "BpmnCancelEventDefinition");
            addRule("BpmnEndEvent", "BpmnEscalationEventDefinition");
            addRule("BpmnEndEvent", "BpmnConditionalEventDefinition");
            addRule("BpmnEndEvent", "BpmnCompensateEventDefinition");
            addRule("BpmnEndEvent", "BpmnErrorEventDefinition");
            addRule("BpmnEndEvent", "BpmnSignalEventDefinition");
            addRule("BpmnEndEvent", "BpmnLinkEventDefinition");
            addRule("BpmnEndEvent", "BpmnTerminateEventDefinition");
            addRule("BpmnEndEvent", "BpmnMessageEventDefinition");
            addRule("BpmnEndEvent", "BpmnTimerEventDefinition");
            addRule("BpmnEndEvent", "Note");
            
            // BpmnIntermediateThrowEvent
            addRule("BpmnIntermediateThrowEvent", "BpmnEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "BpmnCancelEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "BpmnEscalationEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "BpmnConditionalEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "BpmnCompensateEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "BpmnErrorEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "BpmnSignalEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "BpmnLinkEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "BpmnTerminateEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "BpmnMessageEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "BpmnTimerEventDefinition");
            addRule("BpmnIntermediateThrowEvent", "Note");
            addRule("BpmnIntermediateThrowEvent", "ExternDocument");
            
            // BpmnImplicitThrowEvent
            addRule("BpmnImplicitThrowEvent", "BpmnEventDefinition");
            addRule("BpmnImplicitThrowEvent", "BpmnCancelEventDefinition");
            addRule("BpmnImplicitThrowEvent", "BpmnEscalationEventDefinition");
            addRule("BpmnImplicitThrowEvent", "BpmnConditionalEventDefinition");
            addRule("BpmnImplicitThrowEvent", "BpmnCompensateEventDefinition");
            addRule("BpmnImplicitThrowEvent", "BpmnErrorEventDefinition");
            addRule("BpmnImplicitThrowEvent", "BpmnSignalEventDefinition");
            addRule("BpmnImplicitThrowEvent", "BpmnLinkEventDefinition");
            addRule("BpmnImplicitThrowEvent", "BpmnTerminateEventDefinition");
            addRule("BpmnImplicitThrowEvent", "BpmnMessageEventDefinition");
            addRule("BpmnImplicitThrowEvent", "BpmnTimerEventDefinition");
            addRule("BpmnImplicitThrowEvent", "Note");
            addRule("BpmnImplicitThrowEvent", "ExternDocument");
            
            // BpmnThrowEvent
            addRule("BpmnThrowEvent", "BpmnDataInput");
            addRule("BpmnThrowEvent", "Note");
            addRule("BpmnThrowEvent", "ExternDocument");
            
            // BpmnEndEvent
            addRule("BpmnEndEvent", "BpmnDataInput");
            addRule("BpmnEndEvent", "Note");
            addRule("BpmnEndEvent", "ExternDocument");
            
            // BpmnIntermediateThrowEvent
            addRule("BpmnIntermediateThrowEvent", "BpmnDataInput");
            addRule("BpmnIntermediateThrowEvent", "Note");
            addRule("BpmnIntermediateThrowEvent", "ExternDocument");
            
            // BpmnImplicitThrowEvent
            addRule("BpmnImplicitThrowEvent", "BpmnDataInput");
            addRule("BpmnIntermediateThrowEvent", "Note");
            addRule("BpmnIntermediateThrowEvent", "ExternDocument");
            
            // BpmnThrowEvent
            addRule("BpmnThrowEvent", "BpmnDataAssociation");
            addRule("BpmnThrowEvent", "Note");
            addRule("BpmnThrowEvent", "ExternDocument");
            
            // BpmnEndEvent
            addRule("BpmnEndEvent", "BpmnDataAssociation");
            addRule("BpmnEndEvent", "Note");
            
            // BpmnIntermediateThrowEvent
            addRule("BpmnIntermediateThrowEvent", "BpmnDataAssociation");
            addRule("BpmnIntermediateThrowEvent", "Note");
            addRule("BpmnIntermediateThrowEvent", "ExternDocument");
            
            // BpmnImplicitThrowEvent
            addRule("BpmnImplicitThrowEvent", "BpmnDataAssociation");
            addRule("BpmnImplicitThrowEvent", "Note");
            addRule("BpmnImplicitThrowEvent", "ExternDocument");
            
            // BpmnItemAwareElement
            addRule("BpmnItemAwareElement", "BpmnDataState");
            addRule("BpmnItemAwareElement", "Note");
            addRule("BpmnItemAwareElement", "ExternDocument");
            
            // BpmnDataOutput
            addRule("BpmnDataOutput", "BpmnDataState");
            addRule("BpmnDataOutput", "Note");
            addRule("BpmnDataOutput", "ExternDocument");
            
            // BpmnDataStore
            addRule("BpmnDataStore", "BpmnDataState");
            addRule("BpmnDataStore", "Note");
            addRule("BpmnDataStore", "ExternDocument");
            
            // BpmnDataObject
            addRule("BpmnDataObject", "BpmnDataState");
            addRule("BpmnDataObject", "Note");
            addRule("BpmnDataObject", "ExternDocument");
            
            // BpmnDataInput
            addRule("BpmnDataInput", "BpmnDataState");
            addRule("BpmnDataInput", "Note");
            addRule("BpmnDataInput", "ExternDocument");
            
            // BpmnResource
            addRule("BpmnResource", "BpmnResourceParameter");
            addRule("BpmnResource", "Note");
            addRule("BpmnResource", "ExternDocument");
            
            // BpmnResourceRole
            addRule("BpmnResourceRole", "BpmnResourceParameterBinding");
            addRule("BpmnResourceRole", "Note");
            addRule("BpmnResourceRole", "ExternDocument");
            
            // BpmnInterface
            addRule("BpmnInterface", "BpmnOperation");
            addRule("BpmnInterface", "Note");
        }

        @objid ("006c246a-e60a-1097-bcec-001ec947cd2a")
        private void addRule(String mcD, String mcX) {
            assert (isKnown(mcD)) : "CreationExpert: Invalid link metaclass " + mcD;
            assert (mcX.equals("any") || isKnown(mcX)) : "CreationExpert: Invalid source metaclass " + mcX;
            this.rules.add(mcD + mcX);
        }

        /**
         * Returns whether this metaclass is known or not.
         * @param metaclass the sought metaclass.
         * @return true if there is a class corresponding to that name.
         */
        @objid ("006c250a-e60a-1097-bcec-001ec947cd2a")
        private static boolean isKnown(String metaclass) {
            try {
                Metamodel.getMClass(metaclass);
                return true;
            } catch (IllegalArgumentException e) {
                return false;
            }
        }

    }

}
