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

import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.diagrams.ActivityDiagram;
import org.modelio.metamodel.diagrams.BehaviorDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.stateMachineModel.AbstractPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
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
import org.modelio.xmi.generation.GenerationProperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class checks if a given element is in the export scope
 * @author ebrosse
 */
@objid ("c2865693-321e-4c26-90e7-8bebf3be9c6e")
public class ScopeChecker {
    @objid ("73476a35-3820-42dd-b30b-f504b55292a3")
    private HashMap<MObject, Boolean> scopeMap = null;

    @objid ("dd6c53e1-3663-4643-b046-54d58cfed6c3")
    private Boolean theResult = null;

    @objid ("02b28fc1-2e8c-4075-9fef-9d2ea0320908")
    private Element localRoot = null;

    @objid ("5451ace7-a0e6-4531-b6eb-6d9a38e941f1")
    private ScopeSelector selector = null;

    @objid ("6298ca39-0c93-4608-80fb-aaf2f6d1057c")
    public ScopeChecker(Element localRoot) {
        this.localRoot = localRoot;
        this.scopeMap = new HashMap<>();
        this.selector = new ScopeSelector();
    }

    @objid ("ec15003f-db01-4ed9-a67f-c9f5ce9c2630")
    public boolean contains(MObject eltToTest) {
        if (eltToTest == null) {
            this.setTheResult(false);
        } else {
            this.setTheResult(this.scopeMap.get(eltToTest));
            if (this.getTheResult() == null) {
                if (! ModelUtils.mustBeExported(eltToTest)){
                    this.setTheResult(false);
                }else{
                    this.selector.launchVisit(eltToTest);
                }
                this.scopeMap.put(eltToTest, this.getTheResult());
            }
        }
        return this.getTheResult();
    }

    @objid ("ab05839d-2ada-4e85-97b8-1f183387ba1f")
    public Boolean getTheResult() {
        return this.theResult;
    }

    @objid ("227ad76c-5ab4-49f3-856a-4d82103d4533")
    public void setTheResult(Boolean theResult) {
        this.theResult = theResult;
    }

    @objid ("0fbc91e8-7e3c-4438-a5d8-2776eee9f31a")
    private class ScopeSelector extends DefaultModelVisitor {
        @objid ("cae5f082-156b-4451-9e30-c2ba84cdd31e")
        public void launchVisit(MObject eltToTest) {
            eltToTest.accept(this);
        }

        @objid ("4f37699b-c102-46ad-ab13-933223fbb0d3")
        @Override
        public Object visitAssociation(Association eltToTest) {
            for (AssociationEnd assocEnd : eltToTest.getEnd()) {
                if (!contains(assocEnd.getOwner()))
                    break;
            }
            return null;
        }

        @objid ("3c45f98a-7f5e-42e9-8555-0377d4a454b7")
        @Override
        public Object visitAssociationEnd(AssociationEnd eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("a9fe5d01-8651-40f4-bf17-9d11277156c7")
        @Override
        public Object visitAttribute(Attribute eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("510a512e-9662-47dc-9705-da62ef36ad74")
        @Override
        public Object visitBehavior(Behavior eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("f92c8c65-53ed-4622-9abe-e22b90d02f35")
        @Override
        public Object visitBindableInstance(BindableInstance eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("50363bc8-d56d-47a3-a510-cfc60b4ebdf2")
        @Override
        public Object visitBinding(Binding eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("4fd9d361-11ad-4273-93ed-3cf51f941344")
        @Override
        public Object visitClassAssociation(ClassAssociation eltToTest) {
            if (contains(eltToTest.getAssociationPart()))
                contains(eltToTest.getClassPart());
            return null;
        }

        @objid ("75e2e0f6-7939-4a4f-8703-6ceb27d7dc63")
        @Override
        public Object visitCollaborationUse(CollaborationUse eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("c4a54dba-7b92-44eb-bcc2-0ecb2db885ec")
        @Override
        public Object visitConnectionPointReference(ConnectionPointReference eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("71d90d2a-368e-4f96-bf3e-2e2276c1887e")
        @Override
        public Object visitConnector(Connector eltToTest) {
            for (LinkEnd linkEnd : eltToTest.getLinkEnd()) {
                if (!contains(linkEnd.getOwner()))
                    break;
            }
            return null;
        }

        @objid ("3747bce3-9be6-495c-8302-3d9074d61785")
        @Override
        public Object visitConnectorEnd(ConnectorEnd eltToTest) {
            contains(eltToTest.getOwner());
            
            if (getTheResult()) {
                contains(eltToTest.getOpposite().getOwner());               
            }
            return null;
        }

        @objid ("3369a4bd-089d-469e-87c8-6b580fd1721d")
        @Override
        public Object visitConstraint(Constraint eltToTest) {
            for (ModelElement constrainedElement : eltToTest
                    .getConstrainedElement()) {
                if (!contains(constrainedElement))
                    break;
            }
            return null;
        }

        @objid ("e4c1fab8-a492-4042-a8c9-4f7a634911e1")
        @Override
        public Object visitDataFlow(DataFlow eltToTest) {
            if (contains(eltToTest.getDestination()))
                contains(eltToTest.getOrigin());
            return null;
        }

        @objid ("24c929a9-76eb-403c-aa5c-6a3afffc91df")
        @Override
        public Object visitDependency(Dependency eltToTest) {
            if (contains(eltToTest.getDependsOn()))
                contains(eltToTest.getImpacted());
            return null;
        }

        @objid ("83bb744c-db83-4bc3-a5a7-a70a1b5260e6")
        @Override
        public Object visitElement(Element eltToTest) {
            throw new NotFoundException("Element of type "
                    + eltToTest.getClass()
                    + " has no implementation done in scope filter.");
        }

        @objid ("ab6fba2a-8cbf-47c1-821a-af05b6436e48")
        @Override
        public Object visitElementImport(ElementImport eltToTest) {
            if (contains(eltToTest.getImportedElement()))
                contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("41a9f2db-0837-425c-926d-dcbb9b595ca7")
        @Override
        public Object visitEnumerationLiteral(EnumerationLiteral eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("a50be1f5-42ca-4394-b935-b5f27edc67eb")
        @Override
        public Object visitExtensionPoint(ExtensionPoint eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("e1271735-fc5a-4a5e-b13f-3d103ee4dccf")
        @Override
        public Object visitFeature(Feature eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("daec559d-f3af-4d18-8134-396f130d6226")
        @Override
        public Object visitGeneralization(Generalization eltToTest) {
            if (contains(eltToTest.getSubType()))
                contains(eltToTest.getSuperType());
            return null;
        }

        @objid ("d47af5b0-5a9a-4622-a272-b399e7218140")
        @Override
        public Object visitInformationFlow(InformationFlow eltToTest) {
            contains(eltToTest.getOwner());
            return null;
        }

        @objid ("caff9179-9fad-4f7e-9ded-4fb131d7c3bd")
        @Override
        public Object visitInformationItem(InformationItem eltToTest) {
            contains(eltToTest.getOwner());
            return null;
        }

        @objid ("b3acec2c-8c81-469e-bf73-7a16b08f694d")
        @Override
        public Object visitInteractionFragment(InteractionFragment eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("a8d49ddc-4dc2-4d3f-8683-a36fb1e29ec4")
        @Override
        public Object visitInterfaceRealization(InterfaceRealization eltToTest) {
            if (contains(eltToTest.getImplemented()))
                contains(eltToTest.getImplementer());
            return null;
        }

        @objid ("3f063a0b-56fc-4899-8733-9d963f94b57b")
        @Override
        public Object visitLifeline(Lifeline eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("9ebfc2ba-7f61-4725-b966-48f62c5a8198")
        @Override
        public Object visitLink(Link eltToTest) {
            for (LinkEnd linkEnd : eltToTest.getLinkEnd()) {
                if (!contains(linkEnd.getOwner()))
                    break;
            }
            return null;
        }

        @objid ("ff9120e4-68c2-4e6c-a813-830bd3574729")
        @Override
        public Object visitLinkEnd(LinkEnd eltToTest) {
            contains(eltToTest.getOwner());
            
            if (getTheResult()) {
                if (!contains(eltToTest.getOpposite().getOwner()))
                    return null;
            }
            return null;
        }

        @objid ("15b20f15-1ca4-463a-9807-f811d37076a1")
        @Override
        public Object visitManifestation(Manifestation eltToTest) {
            if (contains(eltToTest.getUtilizedElement()))
                contains(eltToTest.getOwner());
            return null;
        }

        @objid ("a11118e4-2531-481b-a7d4-457c2bb86806")
        @Override
        public Object visitMessage(Message eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("e37142c6-821d-4724-81c5-462d50fe222d")
        @Override
        public Object visitModelTree(ModelTree eltToTest) {
            if (eltToTest == null)
                setTheResult(false);
            else if (eltToTest.equals(ScopeChecker.this.localRoot))
                setTheResult(true);
            else{
                contains(eltToTest.getCompositionOwner());
            }
            return null;
        }

        @objid ("dbed6c3b-1dd6-4681-818a-df69e47f2592")
        @Override
        public Object visitNote(Note eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("c16ed6c0-a80e-46be-9c3d-bc757ba19827")
        @Override
        public Object visitOperation(Operation eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("feb93109-c02a-49b7-b94d-3d3fd9bf816a")
        @Override
        public Object visitPackageImport(PackageImport eltToTest) {
            if (contains(eltToTest.getImportedPackage()))
                contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("3eb6e9ea-d085-43df-a7dc-54fc2041756e")
        @Override
        public Object visitPackageMerge(PackageMerge eltToTest) {
            if (contains(eltToTest.getMergedPackage()))
                contains(eltToTest.getReceivingPackage());
            return null;
        }

        @objid ("4f7cbb80-5c4c-459f-9071-42aa8c33a671")
        @Override
        public Object visitParameter(Parameter eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("17a240cd-af35-4a79-86ae-03e26d64f702")
        @Override
        public Object visitProvidedInterface(ProvidedInterface eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("2d7dfc10-0752-44aa-9276-bcca39717f39")
        @Override
        public Object visitRaisedException(RaisedException eltToTest) {
            if (contains(eltToTest.getThrownType()))
                contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("c53af3f5-a528-4ce8-87dc-8bbc0e1616de")
        @Override
        public Object visitRegion(Region eltToTest) {
            if (eltToTest.getParent() != null)
                contains(eltToTest.getParent());
            else 
                contains(eltToTest.getRepresented());
            return null;
        }

        @objid ("75cec8db-7ba8-407a-9676-43b343dfc079")
        @Override
        public Object visitRequirement(Requirement eltToTest) {
            setTheResult(false);
            return null;
        }

        @objid ("7db9672a-debe-4183-9935-b0da5fbddfcb")
        @Override
        public Object visitRequirementContainer(RequirementContainer eltToTest) {
            setTheResult(false);
            return null;
        }

        @objid ("976e7154-1b06-44e8-a475-d46a47380664")
        @Override
        public Object visitRequiredInterface(RequiredInterface eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("9bfbbd62-8399-4e09-ba9f-2c001a338743")
        @Override
        public Object visitStereotype(Stereotype eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("2141fad9-d3b1-4432-bdef-e16699b79461")
        @Override
        public Object visitSubstitution(Substitution eltToTest) {
            if (contains(eltToTest.getContract()))
                contains(eltToTest.getSubstitutingClassifier());
            return null;
        }

        @objid ("edf7c276-be89-4c10-b6d9-11a3c18a0cfb")
        @Override
        public Object visitTaggedValue(TaggedValue eltToTest) {
            contains(eltToTest.getAnnoted());
            return null;
        }

        @objid ("d716fdbc-692e-45e4-9d50-8c95dc4753af")
        @Override
        public Object visitTemplateParameter(TemplateParameter eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("dd361a20-b654-4ab8-8117-b6549af403b9")
        @Override
        public Object visitUseCaseDependency(UseCaseDependency eltToTest) {
            if (contains(eltToTest.getTarget()))
                contains(eltToTest.getOrigin());
            return null;
        }

        @objid ("a8f2653e-24a1-476e-9f9c-e0b75d6c3d02")
        @Override
        public Object visitAttributeLink(AttributeLink eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("2473d57b-ef6d-44bf-8ed4-ab7147904f8f")
        @Override
        public Object visitInstance(Instance eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("dd90eb06-ede6-4ce7-b33f-4433f07ac167")
        @Override
        public Object visitPort(Port eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("56792fec-1976-47ce-9334-bf3088214478")
        @Override
        public Object visitActivityEdge(ActivityEdge eltToTest) {
            if (contains(eltToTest.getSource()))
                contains(eltToTest.getTarget());
            return null;
        }

        @objid ("a71c1733-21e1-4d39-b18f-33e5943a466e")
        @Override
        public Object visitActivityGroup(ActivityGroup eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("c7214b50-3068-4662-b998-de3ac3345a59")
        @Override
        public Object visitActivityNode(ActivityNode eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("682c4ccd-8e60-4974-839a-ef3a03753c17")
        @Override
        public Object visitActivityPartition(ActivityPartition eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("e3eea8fa-54de-49f6-9ad6-8aaa4ea5ae1a")
        @Override
        public Object visitClause(Clause eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("c7b4840e-58f5-4b44-a2fb-eb3af0ca611f")
        @Override
        public Object visitAbstractPseudoState(AbstractPseudoState eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("aabfd2a1-b487-46fd-87b2-af3828e91e6c")
        @Override
        public Object visitFinalState(FinalState eltToTest) {
            contains(eltToTest.getParent());
            return null;
        }

        @objid ("b26ba5e7-ffd8-4ee9-9c01-03e01c80440d")
        @Override
        public Object visitState(State eltToTest) {
            contains(eltToTest.getParent());
            return null;
        }

        @objid ("84740e4a-9ec1-4e2c-bacb-903633a8167f")
        @Override
        public Object visitTransition(Transition eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("9f2595b4-7d7d-4b10-b48b-81b70969160d")
        @Override
        public Object visitInternalTransition(InternalTransition eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("a6fcc478-ee38-4c65-bb1c-77326a08e03e")
        @Override
        public Object visitEvent(Event eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("0b750ab2-142f-49de-b242-7af446b9a843")
        @Override
        public Object visitTerm(Term eltToTest) {
            setTheResult(false);
            return null;
        }

        @objid ("0b967dd9-3b84-426d-b10c-6c3200f0d24c")
        @Override
        public Object visitActivityDiagram(ActivityDiagram eltToTest) {
            setTheResult(false);
            return null;
        }

        @objid ("bf0f3973-2c53-41a1-a6bf-f21379914a1c")
        @Override
        public Object visitBehaviorDiagram(BehaviorDiagram eltToTest) {
            setTheResult(false);
            return null;
        }

        @objid ("14355513-8d9c-48cb-b5ca-8d902411cd57")
        @Override
        public Object visitPropertyTableDefinition(PropertyTableDefinition eltToTest) {
            setTheResult(false);
            return null;
        }

        @objid ("81e5bf5d-747a-4091-8798-1b92af989ea6")
        @Override
        public Object visitStaticDiagram(StaticDiagram eltToTest) {
            setTheResult(false);
            return null;
        }

        @objid ("938a716a-8366-4888-84da-1c0be1c3aebc")
        @Override
        public Object visitTemplateBinding(TemplateBinding eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("53cad87b-0c7a-43b0-b9ea-3e7971985b5c")
        @Override
        public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("3279fc42-3857-4406-a928-f8607f372a88")
        @Override
        public Object visitProfile(Profile eltToTest) {
            Package root = GenerationProperties.getInstance().getSelectedPackage();
            
            if  (root instanceof Profile) {
                setTheResult(((eltToTest).getName().contains(root.getName()))
                        && (((eltToTest).getCompositionOwner()).equals(root.getCompositionOwner())));             
            }else                
                setTheResult(true);
            return null;
        }

        @objid ("cfeb3d0b-a844-48a3-8124-46be3f094eb8")
        @Override
        public Object visitAnalystProject(final AnalystProject eltToTest) {
            setTheResult(true);
            return null;
        }

        @objid ("861e253d-e385-4e8b-afe9-124ac4fb2627")
        @Override
        public Object visitDataType(final DataType eltToTest) {
            if (ModelioPrimitiveTypeMapper.isPredefinedType(eltToTest))
                setTheResult(false);
            else{
                contains(eltToTest.getCompositionOwner());
            }
            return null;
        }

        @objid ("46265bdb-ccee-4ce7-801e-74f7612972cf")
        @Override
        public Object visitProject(final Project eltToTest) {
            if (GenerationProperties.getInstance().getLibraryRoots().contains(eltToTest)){
                setTheResult(true);
                GenerationProperties.getInstance().addExportedLibrary(eltToTest);
            }else
                setTheResult(false);
            return null;
        }

        @objid ("8cf6f46b-692c-4ef4-a113-96a1a7cb8781")
        @Override
        public Object visitStateVertex(final StateVertex eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("2cda6705-c376-4fd2-aa95-12b33f845d0e")
        @Override
        public Object visitExceptionHandler(ExceptionHandler eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("dc4849e3-0f8d-4486-ba28-14daf8e78e01")
        @Override
        public Object visitExpansionNode(ExpansionNode eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("e585081f-8804-4ec7-a539-e3d5e8364bad")
        @Override
        public Object visitExpansionRegion(ExpansionRegion eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("0a5c1c21-f445-4748-ac7b-d7b52237a570")
        @Override
        public Object visitNaryAssociationEnd(NaryAssociationEnd eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

        @objid ("ffbbc3db-b8a2-4963-af71-cfb08083821e")
        @Override
        public Object visitNaryAssociation(NaryAssociation eltToTest) {
            for (NaryAssociationEnd assocEnd : eltToTest.getNaryEnd()) {
                if (!contains(assocEnd.getOwner()))
                    break;
            }
            return null;
        }

        @objid ("951c78b6-c128-48ef-a614-a3ecf884bc74")
        @Override
        public Object visitModelElement(ModelElement eltToTest) {
            contains(eltToTest.getCompositionOwner());
            return null;
        }

    }

}
