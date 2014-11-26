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

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.uml.statik.ElementImport;
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
import org.modelio.metamodel.uml.statik.NaryConnectorEnd;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Visitor to change model link target.
 * <p>
 * Usage :
 * <li> set {@link #newDest}
 * <li> set {@link #oldDest}
 * <li> Call {@link MObject#accept(org.modelio.vcore.smkernel.mapi.MVisitor)}.
 */
@objid ("9c1d2f2b-1682-4b77-a039-86ee78d143e9")
public class ChangeDestinationVisitor extends DefaultModelVisitor {
    /**
     * New target
     */
    @objid ("5112e9fc-f215-4d9d-815d-3c99c918bcd2")
    public MObject newDest;

    /**
     * Old target
     */
    @objid ("e4583e1b-c6ea-4fbf-a6ce-2040e89aac54")
    public MObject oldDest;

    @objid ("5f03ee71-7b28-4ae4-9568-fb8a19f5a0a2")
    @Override
    public Object visitActivityEdge(ActivityEdge theActivityEdge) {
        theActivityEdge.setTarget((ActivityNode) this.newDest);
        return null;
    }

    @objid ("410de8f6-d373-4390-8382-cc8f9ff68007")
    @Override
    public Object visitAssociationEnd(AssociationEnd theAssociationEnd) {
        if (theAssociationEnd.isNavigable()) {
            theAssociationEnd.setTarget((Classifier) this.newDest, true);
        } else {
            theAssociationEnd.getOpposite().setSource((Classifier) this.newDest, true);
        }
        return null;
    }

    @objid ("fb23814d-37c6-49d7-a9f0-c36d89558a55")
    @Override
    public Object visitBinding(Binding theBinding) {
        theBinding.setRepresentedFeature((ModelElement) this.newDest);
        return null;
    }

    @objid ("bc6cda1c-7603-4e27-bba2-dacc3429e716")
    @Override
    public Object visitBpmnDataAssociation(final BpmnDataAssociation theBpmnDataAssociation) {
        if (this.newDest instanceof BpmnActivity) {
        
            if (theBpmnDataAssociation.getSourceRef() == null) {
                return null;
            }
        
            theBpmnDataAssociation.setEndingActivity((BpmnActivity) this.newDest);
            theBpmnDataAssociation.setEndingEvent((BpmnCatchEvent) null);
            theBpmnDataAssociation.setTargetRef(null);
        
            theBpmnDataAssociation.setStartingEvent(null);
        } else if (this.newDest instanceof BpmnCatchEvent) {
        
            if (theBpmnDataAssociation.getSourceRef() == null) {
                return null;
            }
        
            theBpmnDataAssociation.setEndingEvent((BpmnCatchEvent) this.newDest);
            theBpmnDataAssociation.setTargetRef(null);
            theBpmnDataAssociation.setEndingActivity(null);
        } else if (this.newDest instanceof BpmnItemAwareElement) {
        
            if (theBpmnDataAssociation.getStartingActivity() == null && theBpmnDataAssociation.getStartingEvent() == null) {
                return null;
            }
        
            theBpmnDataAssociation.setTargetRef((BpmnItemAwareElement) this.newDest);
            theBpmnDataAssociation.setEndingEvent(null);
            theBpmnDataAssociation.setEndingActivity(null);
        }
        return null;
    }

    @objid ("0e2eb7ec-c7c3-4322-90c1-b8d550038fb4")
    @Override
    public Object visitBpmnMessageFlow(final BpmnMessageFlow theBpmnMessageFlow) {
        if (this.newDest instanceof BpmnParticipant || this.newDest instanceof BpmnEvent
                || this.newDest instanceof BpmnActivity || this.newDest instanceof BpmnLane || this.newDest instanceof BpmnTask) {
            theBpmnMessageFlow.setTargetRef((BpmnBaseElement) this.newDest);
        }
        return null;
    }

    @objid ("ddc3b4c6-7dea-4db0-bbb4-131ba5d6b3b1")
    @Override
    public Object visitBpmnSequenceFlow(final BpmnSequenceFlow theBpmnSequenceFlow) {
        if (this.newDest instanceof BpmnFlowNode) {
            theBpmnSequenceFlow.setTargetRef((BpmnFlowNode) this.newDest);
        }
        return null;
    }

    @objid ("c32fa4d6-50de-4fb4-a112-ab4e602fb1d3")
    @Override
    public Object visitClassAssociation(final ClassAssociation theClassAssociation) {
        theClassAssociation.setClassPart((Class) this.newDest);
        return null;
    }

    @objid ("4d8d8034-aa9f-4e52-a177-391b4cedfd30")
    @Override
    public Object visitDataFlow(DataFlow theDataFlow) {
        theDataFlow.setDestination((NameSpace) this.newDest);
        return null;
    }

    @objid ("8c5c3865-4c37-4fae-946b-d2610f1faaf5")
    @Override
    public Object visitDependency(Dependency theDependency) {
        theDependency.setDependsOn((ModelElement) this.newDest);
        return null;
    }

    @objid ("6009d320-b18c-40b9-a7b7-10762dcb3d5c")
    @Override
    public Object visitElementImport(ElementImport theElementImport) {
        theElementImport.setImportedElement((NameSpace) this.newDest);
        return null;
    }

    @objid ("587cf4d1-ae66-471f-817e-1162024d0b34")
    @Override
    public Object visitExceptionHandler(final ExceptionHandler theExceptionHandler) {
        theExceptionHandler.setExceptionInput((InputPin) this.newDest);
        return null;
    }

    @objid ("efb1020c-8920-4dd2-a270-cda3409d00a8")
    @Override
    public Object visitGeneralization(Generalization theGeneralization) {
        theGeneralization.setSuperType((NameSpace) this.newDest);
        return null;
    }

    @objid ("0a4c141a-a19a-4635-a78f-057b1ebbf495")
    @Override
    public Object visitInformationFlow(InformationFlow theInformationFlow) {
        theInformationFlow.getInformationTarget().clear();
        
        theInformationFlow.getInformationTarget().add((ModelElement) this.newDest);
        return null;
    }

    @objid ("77c91030-091f-4950-9b67-fc98acf2f715")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization theInterfaceRealization) {
        theInterfaceRealization.setImplemented((Interface) this.newDest);
        return null;
    }

    @objid ("cfd75ab0-26bb-46b5-a662-a277343c4660")
    @Override
    public Object visitLinkEnd(LinkEnd theLinkEnd) {
        if (theLinkEnd.isNavigable()) {
            theLinkEnd.setTarget((Instance) this.newDest, true);
        } else {
            theLinkEnd.getOpposite().setSource((Instance) this.newDest, true);
        }
        return null;
    }

    @objid ("a7a61918-7ac7-4b39-b1d8-bb30ffaf3cb8")
    @Override
    public Object visitManifestation(Manifestation theManifestation) {
        theManifestation.setUtilizedElement((ModelElement) this.newDest);
        return null;
    }

    @objid ("73dd2e9d-9f6b-489d-b2e0-144d0f4aabd2")
    @Override
    public Object visitMessage(Message theMessage) {
        theMessage.setReceiveEvent((MessageEnd) this.newDest);
        return null;
    }

    @objid ("5de5c109-f2c0-4559-a3f7-25738942572d")
    @Override
    public Object visitModelElement(ModelElement theModelElement) {
        throw new IllegalArgumentException(theModelElement + " is not a link element.");
    }

    @objid ("bc1aabcf-ab73-4f0c-960b-870f1b4bcb9c")
    @Override
    public Object visitNamespaceUse(NamespaceUse theNamespaceUse) {
        theNamespaceUse.setUsed((NameSpace) this.newDest);
        return null;
    }

    @objid ("9f5c8b8a-66e3-4a38-83d7-f6538d677445")
    @Override
    public Object visitPackageImport(PackageImport thePackageImport) {
        thePackageImport.setImportedPackage((Package) this.newDest);
        return null;
    }

    @objid ("a0ace94c-6973-4e2a-8998-d3edd2e0d008")
    @Override
    public Object visitPackageMerge(PackageMerge thePackageMerge) {
        thePackageMerge.setMergedPackage((Package) this.newDest);
        return null;
    }

    @objid ("702d4776-b716-4110-8a89-4eeef9b32386")
    @Override
    public Object visitProvidedInterface(final ProvidedInterface theProvidedInterface) {
        if (this.newDest == null) {
            setTarget(theProvidedInterface, null);
            return null;
        }
        if (this.newDest instanceof NaryConnectorEnd) {
            setTarget(theProvidedInterface, (NaryConnectorEnd) this.newDest);
            return null;
        } else {
            // Not supported
            throw new IllegalArgumentException(this.newDest + " is not a supported target for " + theProvidedInterface+". Use a NaryConnectorEnd.");
        }
    }

    @objid ("d2e1a0ce-174f-47e0-9327-a7805a99c274")
    @Override
    public Object visitRaisedException(RaisedException theRaisedException) {
        theRaisedException.setThrownType((Classifier) this.newDest);
        return null;
    }

    @objid ("1e272b9d-2f3b-46b5-959e-a8dd15b9c10d")
    @Override
    public Object visitRequiredInterface(final RequiredInterface theRequiredInterface) {
        if (this.newDest == null) {
            setTarget(theRequiredInterface, null);
            return null;
        }
        if (this.newDest instanceof NaryConnectorEnd) {
            setTarget(theRequiredInterface, (NaryConnectorEnd) this.newDest);
            return null;
        } else {
            // Not supported
            throw new IllegalArgumentException(this.newDest + " is not a supported target for " + theRequiredInterface+". Use a NaryConnectorEnd.");
        }
    }

    @objid ("090e108f-5843-4a1d-bbc4-cc7a2f00d509")
    @Override
    public Object visitTemplateBinding(TemplateBinding theTemplateBinding) {
        if (this.newDest instanceof NameSpace) {
            theTemplateBinding.setInstanciatedTemplate((NameSpace) this.newDest);
        } else if (this.newDest instanceof Operation) {
            theTemplateBinding.setInstanciatedTemplateOperation((Operation) this.newDest);
        } else {
            throw new ClassCastException();
        }
        return null;
    }

    @objid ("76800565-f403-447d-9a23-e0d97d474850")
    @Override
    public Object visitTransition(Transition theTransition) {
        theTransition.setTarget((StateVertex) this.newDest);
        return null;
    }

    @objid ("4c224b98-3fce-4c2b-9b23-94941ce9cf4b")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency theUseCaseDependency) {
        theUseCaseDependency.setTarget((UseCase) this.newDest);
        return null;
    }

    @objid ("9c745908-af67-45c2-835b-1036e2c3e174")
    private void removeTarget(final RequiredInterface el) {
        for (LinkEnd end : new ArrayList<>(el.getProvider())) {
            final Link l = end.getLink();
            if (l != null) {
                l.delete();
            } else {
                end.delete();
            }
        }
        
        for (NaryLinkEnd end : new ArrayList<>(el.getNaryProvider())) {
            final NaryLink l = end.getNaryLink();
            if (l != null && l.getNaryLinkEnd().size() <= 2)
                l.delete();
            else
                end.delete();
        }
    }

    @objid ("4d6ec699-7ae6-48fa-82ce-42141801f054")
    private void setTarget(final RequiredInterface el, final NaryConnectorEnd target) {
        if (el.getProvider().contains(target)) {
            return;
        }
        
        removeTarget(el);
        
        if (target != null) {
            el.getNaryProvider().add(target);
        }
    }

    @objid ("2c2b3a5a-d058-441d-a149-05f871190334")
    private void removeTarget(final ProvidedInterface el) {
        for (LinkEnd end : new ArrayList<>(el.getConsumer())) {
            final Link l = end.getLink();
            if (l != null) {
                l.delete();
            } else {
                end.delete();
            }
        }
        
        for (NaryLinkEnd end : new ArrayList<>(el.getNaryConsumer())) {
            final NaryLink l = end.getNaryLink();
            if (l != null && l.getNaryLinkEnd().size() <= 2)
                l.delete();
            else
                end.delete();
        }
    }

    @objid ("03589f43-a243-45db-adb1-25ad9920a016")
    private void setTarget(final ProvidedInterface el, final NaryConnectorEnd target) {
        if (el.getNaryConsumer().contains(target)) {
            return;
        }
        
        removeTarget(el);
        
        if (target != null) {
            el.getNaryConsumer().add(target);
        }
    }

    @objid ("6fe02b4b-fcf8-4d9f-92d2-ff02a37cbdda")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd theNaryAssociationEnd) {
        theNaryAssociationEnd.setNaryAssociation((NaryAssociation) this.newDest);
        return null;
    }

    @objid ("0445a030-76b5-421b-a54c-f7d035c64188")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd theNaryLinkEnd) {
        theNaryLinkEnd.setNaryLink((NaryLink) this.newDest);
        return null;
    }

    @objid ("25ef46aa-e230-434b-b53c-be66a079df57")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel theChannel) {
        theChannel.setEnd((CommunicationNode) this.newDest);
        return null;
    }

    @objid ("58e9bf8e-99aa-4369-808c-16b729ca88e6")
    @Override
    public Object visitComponentRealization(ComponentRealization obj) {
        obj.setAbstraction((Component) this.newDest);
        return null;
    }

    @objid ("d8cbaa07-ae04-45c7-9633-3d9997e4302b")
    @Override
    public Object visitSubstitution(Substitution obj) {
        obj.setContract((Classifier) this.newDest);
        return null;
    }

}
