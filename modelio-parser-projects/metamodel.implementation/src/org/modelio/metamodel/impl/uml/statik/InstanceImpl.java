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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000d8770-c4bf-1fd8-97fe-001ec947cd2a")
public class InstanceImpl extends ModelElementImpl implements Instance {
    @objid ("40260941-4f46-41a1-91dd-e81fff795bc9")
    @Override
    public boolean isIsConstant() {
        return (Boolean) getAttVal(InstanceData.Metadata.IsConstantAtt());
    }

    @objid ("f4ddf4f7-6eaf-48e2-8a0d-2fc2de364a4b")
    @Override
    public void setIsConstant(boolean value) {
        setAttVal(InstanceData.Metadata.IsConstantAtt(), value);
    }

    @objid ("14ae50e8-380f-488e-a672-1b63fa78d844")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(InstanceData.Metadata.MultiplicityMinAtt());
    }

    @objid ("8930a836-613f-4661-ab2d-9f0b4334c6cb")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(InstanceData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("49ab249f-c996-42cb-bcba-268e4d661182")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(InstanceData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("17d8df9a-6561-424c-ba71-aeba8132598d")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(InstanceData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("20ab697e-c8fe-482a-ac98-c75315acd3f7")
    @Override
    public String getValue() {
        return (String) getAttVal(InstanceData.Metadata.ValueAtt());
    }

    @objid ("3c310c70-8c3c-4324-85ab-bf17059637b9")
    @Override
    public void setValue(String value) {
        setAttVal(InstanceData.Metadata.ValueAtt(), value);
    }

    @objid ("33abb132-b991-4d95-ab25-e6cd40d6ea23")
    @Override
    public EList<CommunicationNode> getRepresentedCommunicationNode() {
        return new SmList<>(this, InstanceData.Metadata.RepresentedCommunicationNodeDep());
    }

    @objid ("ede49eb8-033f-4bb3-8db8-745ba0b2705a")
    @Override
    public <T extends CommunicationNode> List<T> getRepresentedCommunicationNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationNode element : getRepresentedCommunicationNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ad64e716-ef44-4f9a-a72d-15a807e039a9")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, InstanceData.Metadata.RepresentingItemDep());
    }

    @objid ("efb1a215-d112-4455-9a5e-416ed92eeffb")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getRepresentingItem()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b157c98e-cc10-4909-b65a-364086e90158")
    @Override
    public EList<LinkEnd> getOwnedEnd() {
        return new SmList<>(this, InstanceData.Metadata.OwnedEndDep());
    }

    @objid ("5886ca47-f106-4879-984e-f78e2a090fc7")
    @Override
    public <T extends LinkEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getOwnedEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3b80e813-322a-4adc-89ce-9eb6fe67abf2")
    @Override
    public NameSpace getBase() {
        return (NameSpace) getDepVal(InstanceData.Metadata.BaseDep());
    }

    @objid ("d65afb95-b5de-4940-891d-3ed1d43fded9")
    @Override
    public void setBase(NameSpace value) {
        appendDepVal(InstanceData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("d00b89c5-e515-4500-a76e-fb51b9c22bbe")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, InstanceData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("b6d7a473-33ac-4a96-a1b2-2e54c034e48b")
    @Override
    public <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ObjectNode element : getRepresentingObjectNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("27283b2b-d26a-49dc-8f2c-09b89a2bf0e1")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(InstanceData.Metadata.OwnerDep());
    }

    @objid ("ccdf84eb-f8de-42e1-aaf0-0f406a54d56f")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(InstanceData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("c00283ea-6731-4d06-a57c-7be388b8f502")
    @Override
    public EList<NaryLinkEnd> getOwnedNaryEnd() {
        return new SmList<>(this, InstanceData.Metadata.OwnedNaryEndDep());
    }

    @objid ("b5c02cd6-e480-4a8e-9e39-f31162e7d300")
    @Override
    public <T extends NaryLinkEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryLinkEnd element : getOwnedNaryEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8dd9551f-5424-4ebc-86cb-bc49de8c75cf")
    @Override
    public EList<Lifeline> getRepresentedLifeLine() {
        return new SmList<>(this, InstanceData.Metadata.RepresentedLifeLineDep());
    }

    @objid ("23272e3b-861f-4736-a9a1-4cdea1a117b1")
    @Override
    public <T extends Lifeline> List<T> getRepresentedLifeLine(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Lifeline element : getRepresentedLifeLine()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("94b7b5ce-8a31-4c4b-adf8-402e7d7c75db")
    @Override
    public EList<AttributeLink> getSlot() {
        return new SmList<>(this, InstanceData.Metadata.SlotDep());
    }

    @objid ("c61b9dcb-c727-4c0f-9331-281d3e0ea5bc")
    @Override
    public <T extends AttributeLink> List<T> getSlot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AttributeLink element : getSlot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("49c0c481-3407-4179-90fb-79641987b1da")
    @Override
    public EList<BindableInstance> getPart() {
        return new SmList<>(this, InstanceData.Metadata.PartDep());
    }

    @objid ("baee604b-58dc-48e9-b03b-5f81c41f1a43")
    @Override
    public <T extends BindableInstance> List<T> getPart(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BindableInstance element : getPart()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("91039a42-cf87-41d9-87c2-1835cf2b1b07")
    @Override
    public EList<LinkEnd> getTargetingEnd() {
        return new SmList<>(this, InstanceData.Metadata.TargetingEndDep());
    }

    @objid ("b28bd356-57d6-4baa-b698-c9c8984dc7eb")
    @Override
    public <T extends LinkEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getTargetingEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("af6ead56-f7fc-4aec-803e-3d3e3d3bc3dd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InstanceData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("946fdf4c-6470-4f1a-92db-48dcd9d85e55")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InstanceData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(InstanceData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7f5ab191-5605-4922-ba64-6b843a711293")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInstance(this);
        else
          return null;
    }

}
