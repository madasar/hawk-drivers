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
                                    

package org.modelio.metamodel.experts.links.impl.ends;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.visitors.DefaultModelVisitor;

/**
 * Get link target visitor.
 */
@objid ("39f4fbe3-28b7-48e8-9c99-93f9147560ce")
public class GetTargetVisitor extends DefaultModelVisitor {
    /**
     * Constructor
     */
    @objid ("ac18ca11-e6bf-486c-9e27-a7feea2cdecf")
    public GetTargetVisitor() {
    }

    @objid ("345736c4-aa9e-43d9-9ed8-f865e1f5a581")
    @Override
    public Object visitActivityEdge(ActivityEdge theActivityEdge) {
        return theActivityEdge.getTarget();
    }

    @objid ("cc552411-0bdf-469d-a16b-b0cf84911c52")
    @Override
    public Object visitAssociationEnd(AssociationEnd theAssociationEnd) {
        if (theAssociationEnd.isNavigable()) {
            return theAssociationEnd.getTarget();
        } else {
            return theAssociationEnd.getOpposite().getSource();
        }
    }

    @objid ("209d0d8e-c72d-46ef-bcd3-0c24beb445bc")
    @Override
    public Object visitBinding(Binding theBinding) {
        return theBinding.getRepresentedFeature();
    }

    @objid ("d97a0af4-f0bd-4048-8cbe-2b5f59ff0f58")
    @Override
    public Object visitClassAssociation(final ClassAssociation theClassAssociation) {
        return theClassAssociation.getClassPart();
    }

    @objid ("26fa1bda-e402-47a0-9fa3-4b51d6efc5b1")
    @Override
    public Object visitDataFlow(DataFlow theDataFlow) {
        return theDataFlow.getDestination();
    }

    @objid ("7c6ebbbd-d012-479e-b435-fe6cfa3f2e02")
    @Override
    public Object visitDependency(Dependency theDependency) {
        return theDependency.getDependsOn();
    }

    @objid ("549d556f-0b08-472d-b620-e661e656126d")
    @Override
    public Object visitElementImport(ElementImport theElementImport) {
        return theElementImport.getImportedElement();
    }

    @objid ("fed22678-9d70-48bc-adb3-5b0b15fe00ee")
    @Override
    public Object visitExceptionHandler(final ExceptionHandler theExceptionHandler) {
        return theExceptionHandler.getExceptionInput();
    }

    @objid ("f09c8179-21ac-4989-8120-6e84c97746ce")
    @Override
    public Object visitGeneralization(Generalization theGeneralization) {
        return theGeneralization.getSuperType();
    }

    @objid ("b1471040-12ee-463c-b5b6-be7f114d6746")
    @Override
    public Object visitInformationFlow(InformationFlow theInformationFlow) {
        final List<ModelElement> ret = theInformationFlow.getInformationTarget();
        if (ret.isEmpty()) {
            return null;
        } else if (ret.size() == 1) {
            return ret.get(0);
        } else {
            throw new UnsupportedOperationException(theInformationFlow + " has " + ret.size() + " targets.");
        }
    }

    @objid ("7fd63fc4-ada2-4145-930b-99f5d611c938")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization theInterfaceRealization) {
        return theInterfaceRealization.getImplemented();
    }

    @objid ("808686dd-bafa-4a8d-a42b-baedbf49f28b")
    @Override
    public Object visitLinkEnd(LinkEnd theLinkEnd) {
        if (theLinkEnd.isNavigable()) {
            return theLinkEnd.getTarget();
        } else {
            return theLinkEnd.getOpposite().getSource();
        }
    }

    @objid ("0c19a8e6-78ab-44f0-acbf-9e8007dc4631")
    @Override
    public Object visitManifestation(Manifestation theManifestation) {
        return theManifestation.getUtilizedElement();
    }

    @objid ("ac529193-1675-46d3-a403-141147efc886")
    @Override
    public Object visitMessage(Message theMessage) {
        return theMessage.getReceiveEvent();
    }

    @objid ("aafaa511-476e-4706-adab-66e05e2dcd73")
    @Override
    public Object visitModelElement(ModelElement theModelElement) {
        throw new IllegalArgumentException(theModelElement + " is not a link element.");
    }

    @objid ("5350b265-31d0-4f23-9b2a-f16120489621")
    @Override
    public Object visitNamespaceUse(NamespaceUse theNamespaceUse) {
        return theNamespaceUse.getUsed();
    }

    @objid ("5885a3d6-ac3a-4e4f-8f15-852924286c4a")
    @Override
    public Object visitPackageImport(PackageImport thePackageImport) {
        return thePackageImport.getImportedPackage();
    }

    @objid ("a2144599-0941-4991-8ceb-795839e5897e")
    @Override
    public Object visitPackageMerge(PackageMerge thePackageMerge) {
        return thePackageMerge.getMergedPackage();
    }

    @objid ("72b02764-044c-40d3-a6b7-93ec6b945c66")
    @Override
    public Object visitRaisedException(RaisedException theRaisedException) {
        return theRaisedException.getThrownType();
    }

    @objid ("994086ab-7ebe-477c-9442-56bdbabb30d2")
    @Override
    public Object visitTemplateBinding(TemplateBinding theTemplateBinding) {
        final ModelElement ret = theTemplateBinding.getInstanciatedTemplate();
        if (ret == null) {
            return theTemplateBinding.getInstanciatedTemplateOperation();
        }
        return ret;
    }

    @objid ("d57fdd63-6b6a-4327-9ae9-d7f7fbcea074")
    @Override
    public Object visitTransition(Transition theTransition) {
        return theTransition.getTarget();
    }

    @objid ("a263ad4a-a816-4b9b-97f3-4a91ab13137d")
    @Override
    public Object visitUseCaseDependency(final UseCaseDependency theUseCaseDependency) {
        return theUseCaseDependency.getTarget();
    }

    @objid ("cc9a348e-9e7f-4d3b-af13-0701a485f6f2")
    @Override
    public Object visitBpmnSequenceFlow(final BpmnSequenceFlow theBpmnSequenceFlow) {
        return theBpmnSequenceFlow.getTargetRef();
    }

    @objid ("159be546-405e-424e-9c87-7aad23de43f4")
    @Override
    public Object visitBpmnMessageFlow(final BpmnMessageFlow theBpmnMessageFlow) {
        return theBpmnMessageFlow.getTargetRef();
    }

    @objid ("69211455-b9b5-44be-8a79-d644e56c383a")
    @Override
    public Object visitBpmnDataAssociation(final BpmnDataAssociation theBpmnDataAssociation) {
        if (theBpmnDataAssociation.getTargetRef() != null) {
            return theBpmnDataAssociation.getTargetRef();
        }
        
        if (theBpmnDataAssociation.getEndingActivity() != null) {
            return theBpmnDataAssociation.getEndingActivity();
        }
        
        if (theBpmnDataAssociation.getStartingActivity() != null) {
            return theBpmnDataAssociation.getStartingActivity();
        }
        
        if (theBpmnDataAssociation.getStartingEvent() != null) {
            return theBpmnDataAssociation.getStartingEvent();
        }
        return null;
    }

    @objid ("253a634c-3958-49c0-8553-cc8c2b7db34b")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd theNaryAssociationEnd) {
        return theNaryAssociationEnd.getOwner();
    }

    @objid ("7228b87d-649e-4102-8523-f4e7b051f5c3")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd theNaryLinkEnd) {
        return theNaryLinkEnd.getSource();
    }

    @objid ("fda99b92-d2c7-4957-8c05-10239ae23725")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel theChannel) {
        return theChannel.getEnd();
    }

    @objid ("a40e0318-433c-4fee-8a7a-88f0807fe325")
    @Override
    public Object visitComponentRealization(ComponentRealization obj) {
        return obj.getAbstraction();
    }

    @objid ("0d0d1c4c-51d1-4074-880b-ae71c022f5e6")
    @Override
    public Object visitSubstitution(Substitution obj) {
        return obj.getContract();
    }

}
