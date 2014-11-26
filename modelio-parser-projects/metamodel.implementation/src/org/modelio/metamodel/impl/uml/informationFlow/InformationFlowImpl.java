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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.informationFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.StructuralFeature;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("006399b2-c4bf-1fd8-97fe-001ec947cd2a")
public class InformationFlowImpl extends ModelElementImpl implements InformationFlow {
    @objid ("38933c9c-d69b-454f-a48e-16b521c9903e")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(InformationFlowData.Metadata.OwnerDep());
    }

    @objid ("f7fe0038-a05f-42f6-b0c6-d81c08646500")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(InformationFlowData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("e991c72b-7300-41ec-9513-21848daac52d")
    @Override
    public EList<ModelElement> getInformationSource() {
        return new SmList<>(this, InformationFlowData.Metadata.InformationSourceDep());
    }

    @objid ("bb7360f4-8a24-4e8f-8535-3a68fc0c587b")
    @Override
    public <T extends ModelElement> List<T> getInformationSource(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelElement element : getInformationSource()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3fa0e828-a28f-4e15-baae-d1cf82e72231")
    @Override
    public EList<ModelElement> getInformationTarget() {
        return new SmList<>(this, InformationFlowData.Metadata.InformationTargetDep());
    }

    @objid ("04e0f6a3-85b4-4bdd-be0c-89f70b67651b")
    @Override
    public <T extends ModelElement> List<T> getInformationTarget(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelElement element : getInformationTarget()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2913d730-e700-4f11-850d-5ab69cd47320")
    @Override
    public EList<ActivityEdge> getRealizingActivityEdge() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingActivityEdgeDep());
    }

    @objid ("f33bb704-c0d4-4785-8400-f32a136600ee")
    @Override
    public <T extends ActivityEdge> List<T> getRealizingActivityEdge(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityEdge element : getRealizingActivityEdge()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9e16b465-6b88-48ce-8260-f6ac42ab290a")
    @Override
    public EList<CommunicationMessage> getRealizingCommunicationMessage() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingCommunicationMessageDep());
    }

    @objid ("76001212-e5a5-4571-9edf-6fbb3d2383d4")
    @Override
    public <T extends CommunicationMessage> List<T> getRealizingCommunicationMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationMessage element : getRealizingCommunicationMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1b1bb775-5a63-4695-83ff-00f37b536c4d")
    @Override
    public EList<StructuralFeature> getRealizingFeature() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingFeatureDep());
    }

    @objid ("1e468fdf-0581-494f-bde7-fffa23f80d27")
    @Override
    public <T extends StructuralFeature> List<T> getRealizingFeature(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final StructuralFeature element : getRealizingFeature()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("15128cf9-299d-475d-859a-769cc4252200")
    @Override
    public EList<LinkEnd> getRealizingLink() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingLinkDep());
    }

    @objid ("a36e8a2c-ae6e-422f-adc9-dc08cf54293f")
    @Override
    public <T extends LinkEnd> List<T> getRealizingLink(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getRealizingLink()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a62a3a80-ca4d-4c14-b50c-ab3c3c14ade3")
    @Override
    public EList<Message> getRealizingMessage() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingMessageDep());
    }

    @objid ("0e7b86f8-8baf-4786-b8c3-b5dca7ff2085")
    @Override
    public <T extends Message> List<T> getRealizingMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Message element : getRealizingMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9c764ced-403e-44b7-9089-4324bb15ddd8")
    @Override
    public EList<NaryLink> getRealizingNaryLink() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingNaryLinkDep());
    }

    @objid ("0a2fdd5c-15f5-44ef-ae78-99613c1b3db4")
    @Override
    public <T extends NaryLink> List<T> getRealizingNaryLink(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryLink element : getRealizingNaryLink()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("53df0f94-7366-4edc-80dc-ee0010b34782")
    @Override
    public EList<Classifier> getConveyed() {
        return new SmList<>(this, InformationFlowData.Metadata.ConveyedDep());
    }

    @objid ("85cd595d-0f4f-4f26-a124-14061a78f7ac")
    @Override
    public <T extends Classifier> List<T> getConveyed(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Classifier element : getConveyed()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("34792685-e065-4c35-b259-b833d09e8bc5")
    @Override
    public AssociationEnd getChannel() {
        return (AssociationEnd) getDepVal(InformationFlowData.Metadata.ChannelDep());
    }

    @objid ("64f86520-20b8-4630-a36a-a27ce3f67b8d")
    @Override
    public void setChannel(AssociationEnd value) {
        appendDepVal(InformationFlowData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("62b66106-f18c-4bec-ae26-ceb460df49fd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InformationFlowData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("98d1f826-7c3b-40db-9a75-5c2e7b623ea0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InformationFlowData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(InformationFlowData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("3163c3d3-3ad8-49cb-aa4c-b102e917aef2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInformationFlow(this);
        else
          return null;
    }

}
