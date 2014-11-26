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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.statik.AssociationData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.impl.uml.statik.AssociationEndImpl;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("0097b0da-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AssociationEnd.class, factory=AssociationEndData.Metadata.ObjectFactory.class)
public class AssociationEndData extends StructuralFeatureData {
    @objid ("9b06292e-9b46-4b43-9f70-c3aecbf5e2d2")
    @SmaMetaAttribute(metaName="Aggregation", type=AggregationKind.class, smAttributeClass=Metadata.AggregationSmAttribute.class)
     Object mAggregation = AggregationKind.KINDISASSOCIATION;

    @objid ("fd10d3ab-64b3-4c65-982a-b761ac2bb1de")
    @SmaMetaAttribute(metaName="IsChangeable", type=Boolean.class, smAttributeClass=Metadata.IsChangeableSmAttribute.class)
     Object mIsChangeable = true;

    @objid ("1b88bd5d-968a-4cfa-b06b-5c1324fc2ac6")
    @SmaMetaAssociation(metaName="Target", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("0b7ee257-602a-45d0-974c-bbc7adee9653")
    @SmaMetaAssociation(metaName="OppositeOwner", typeDataClass=AssociationEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeOwnerSmDependency.class)
     SmObjectImpl mOppositeOwner;

    @objid ("a6091b3e-f6f8-4719-887a-897cf4b613ff")
    @SmaMetaAssociation(metaName="Source", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class, partof = true)
     SmObjectImpl mSource;

    @objid ("8b2b2c83-310c-4e96-aa20-6a16478c48ac")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("276f745b-a04a-4bce-9ba6-82d9a5b64629")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class)
     List<SmObjectImpl> mSent = null;

    @objid ("581f6de5-924c-4514-9623-a7bb28a23802")
    @SmaMetaAssociation(metaName="Qualifier", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.QualifierSmDependency.class, component = true)
     List<SmObjectImpl> mQualifier = null;

    @objid ("0904fa03-b2ec-4808-aabb-07c3645532b4")
    @SmaMetaAssociation(metaName="Opposite", typeDataClass=AssociationEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeSmDependency.class, sharedComponent = true, partof = true)
     SmObjectImpl mOpposite;

    @objid ("b448db5f-0b30-4b50-9d4a-d8647bdeb7e4")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("0daa2e19-e51c-494d-9ece-9c18f2f0c3d4")
    @SmaMetaAssociation(metaName="Association", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.AssociationSmDependency.class, sharedComponent = true)
     SmObjectImpl mAssociation;

    @objid ("f9c0d832-d4f7-40f2-a10c-53fe9eb0a396")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("e326ee88-9c16-4b8e-8baf-36c5e7f3b1fd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002868d8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ff99c7f7-f68c-4240-9d45-b08f7d0b4311")
        private static SmClass smClass = null;

        @objid ("7df12c28-eac5-4a42-b90d-e0ec35e4b2b9")
        private static SmAttribute AggregationAtt = null;

        @objid ("c7d90198-7279-45a4-b9ce-5c80d373d34c")
        private static SmAttribute IsChangeableAtt = null;

        @objid ("8eb0ad2e-86a1-4929-9b19-7d5aa001180d")
        private static SmDependency TargetDep = null;

        @objid ("54c09c4c-887c-4ef3-a71c-091f36d4b9d9")
        private static SmDependency OppositeOwnerDep = null;

        @objid ("4a168e3d-75c4-4968-974a-3c779735b03b")
        private static SmDependency SourceDep = null;

        @objid ("be7db42b-5686-4490-8b76-46b298caf2b0")
        private static SmDependency OccurenceDep = null;

        @objid ("c7cdd9bb-585e-451e-bb74-e7a173a49d77")
        private static SmDependency SentDep = null;

        @objid ("9b935b3c-d1b7-434a-b4a1-064f7c225bd2")
        private static SmDependency QualifierDep = null;

        @objid ("0fd4079d-97ce-440d-b4df-089da3208fd6")
        private static SmDependency OppositeDep = null;

        @objid ("09b7a4ba-0c4a-4776-b502-c359e5db9433")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("32d26f68-2302-438a-9587-8363549d0a00")
        private static SmDependency AssociationDep = null;

        @objid ("ff83134a-1a5c-4a42-a8d4-2369a3a104b5")
        private static SmDependency RepresentingItemDep = null;

        @objid ("cae039a6-d5c7-4086-9c26-7d815bb32a67")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AssociationEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cb3673ba-21d8-45c0-bc20-3ce70d2d9c99")
        public static SmAttribute AggregationAtt() {
            if (AggregationAtt == null) {
            	AggregationAtt = classof().getAttributeDef("Aggregation");
            }
            return AggregationAtt;
        }

        @objid ("ac1e78ed-9a4d-49fb-be4b-30f6c38d10c7")
        public static SmAttribute IsChangeableAtt() {
            if (IsChangeableAtt == null) {
            	IsChangeableAtt = classof().getAttributeDef("IsChangeable");
            }
            return IsChangeableAtt;
        }

        @objid ("32047308-ae6e-4ea2-ab08-2ca21395e2ce")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("900dfbbe-29c1-42d1-a306-61c43a50e9b0")
        public static SmDependency OppositeOwnerDep() {
            if (OppositeOwnerDep == null) {
            	OppositeOwnerDep = classof().getDependencyDef("OppositeOwner");
            }
            return OppositeOwnerDep;
        }

        @objid ("af69c665-78c0-46b9-a01a-30dc9201e76e")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("5a9e2dbe-7682-4871-9dd4-3d41a69c800e")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("7bb06566-6583-4465-af1d-8e4471486eb0")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("618eb6c4-f6bf-4df0-99d6-cef9bb1379f9")
        public static SmDependency QualifierDep() {
            if (QualifierDep == null) {
            	QualifierDep = classof().getDependencyDef("Qualifier");
            }
            return QualifierDep;
        }

        @objid ("76a61285-5f7e-4bb3-99b3-db70a6bd43bd")
        public static SmDependency OppositeDep() {
            if (OppositeDep == null) {
            	OppositeDep = classof().getDependencyDef("Opposite");
            }
            return OppositeDep;
        }

        @objid ("a4d8f918-24c7-4602-8550-181b611b34d2")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("75668611-a378-4ff7-8fe9-a60a11c44c4e")
        public static SmDependency AssociationDep() {
            if (AssociationDep == null) {
            	AssociationDep = classof().getDependencyDef("Association");
            }
            return AssociationDep;
        }

        @objid ("f67d0cb8-aba7-4ea4-9d42-df2733dd9b47")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("3b0ebfec-4802-4478-b3e0-49422da076f6")
        public static SmAttribute getIsChangeableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsChangeableAtt;
        }

        @objid ("2cef9d48-a3f6-48ca-9d78-8c040f0810bb")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("dde9ae6b-be6a-45b4-9f22-70bc265feeab")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("98128b71-53d5-4f1a-93f6-15374937723c")
        public static SmDependency getOppositeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeDep;
        }

        @objid ("0bd8fbd2-6762-40b0-be1f-856c911b0bc0")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("9e1263af-800c-4b92-9cb4-fe4da841fb06")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("a10a04bb-204b-410c-99ca-17bc340ff133")
        public static SmDependency getQualifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifierDep;
        }

        @objid ("14ca7f20-0cf1-40ac-ab19-d5e2c9f49248")
        public static SmDependency getOppositeOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeOwnerDep;
        }

        @objid ("ba67f26b-f6a0-4796-9bdb-834bf9361e7f")
        public static SmDependency getAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationDep;
        }

        @objid ("6c784c26-e11a-49e0-8c7c-68409364d5ac")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("edad0655-ad3d-4891-9c5a-a09ade3754cd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e2307fdc-e2f4-4fd5-8e68-c3086b461c18")
        public static SmAttribute getAggregationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AggregationAtt;
        }

        @objid ("52cfe090-cfa3-4f41-a084-46bd91958fc4")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("0028b0b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1a7faf2e-f37e-4c34-98e7-cb0238eb9763")
            public ISmObjectData createData() {
                return new AssociationEndData();
            }

            @objid ("1b37e52f-8bb7-4b13-8d8e-16c063930bf7")
            public SmObjectImpl createImpl() {
                return new AssociationEndImpl();
            }

        }

        @objid ("00291350-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AggregationSmAttribute extends SmAttribute {
            @objid ("0884dde1-e1d8-4c91-a338-883d025e6b19")
            public Object getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mAggregation;
            }

            @objid ("e1eaa2dd-8644-4e73-b8fa-6598e9bc4ae7")
            public void setValue(ISmObjectData data, Object value) {
                ((AssociationEndData) data).mAggregation = value;
            }

        }

        @objid ("002a38d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("85636705-8340-4667-8f94-bc7c5d147c1d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mOccurence != null)? ((AssociationEndData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("644f8749-16d7-4df7-8605-49070ebd802f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mOccurence;
            }

            @objid ("891f7de7-67cd-4590-98c1-92d7d5298144")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ModelDep();
            }

        }

        @objid ("002a9c16-c4c5-1fd8-97fe-001ec947cd2a")
        public static class QualifierSmDependency extends SmMultipleDependency {
            @objid ("37cd4af3-48b6-4729-a42a-dca627742a72")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mQualifier != null)? ((AssociationEndData)data).mQualifier:SmMultipleDependency.EMPTY;
            }

            @objid ("f207884f-4629-41c3-adda-7b9f1c2997a7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mQualifier = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mQualifier;
            }

            @objid ("c8919f23-ae54-4889-a295-4973aaaa2e87")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.QualifiedDep();
            }

        }

        @objid ("002aff80-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("f22e5c74-97e4-46b4-8dac-bbf7c0deb1ee")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mRepresentingObjectNode != null)? ((AssociationEndData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("f1712dab-f3e7-4df3-a887-e07469504225")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mRepresentingObjectNode;
            }

            @objid ("deb452ba-71f2-4322-9111-bbd1b4e05687")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedRoleDep();
            }

        }

        @objid ("002b63bc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("cdb8f79c-6c46-4024-bc46-8c24cfa46cd8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mRepresentingItem != null)? ((AssociationEndData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("5bfb0e50-8ea9-4a09-a1db-d8d04e775eaa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mRepresentingItem;
            }

            @objid ("4cfd7118-afb5-4d3b-b4af-ae4d97319d4b")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep();
            }

        }

        @objid ("002c3f26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OppositeSmDependency extends SmSingleDependency {
            @objid ("3d967f28-7548-4e36-8fb3-ec1d316647ae")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mOpposite;
            }

            @objid ("8a7720e0-b299-44b9-bcb6-c9345778afc7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mOpposite = value;
            }

            @objid ("b55dacba-4826-4228-81d9-abff99bd6422")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OppositeOwnerDep();
            }

        }

        @objid ("002cb5d2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("9b1b19a3-d8a5-416a-ac9d-cee679a89a5b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mSent != null)? ((AssociationEndData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("d8db6562-fc37-4a80-8dda-c83dc0734dd4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mSent = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mSent;
            }

            @objid ("d95a24dd-e514-4318-a627-726e7dd8ecee")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.ChannelDep();
            }

        }

        @objid ("002d1c7a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("2db22735-3c64-46da-a912-04c768c5198b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mTarget;
            }

            @objid ("618f1437-e8b3-4994-ba31-76f00bbcdbca")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mTarget = value;
            }

            @objid ("d983c5d1-f9f5-4b4d-a277-ae6ff639608b")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.TargetingEndDep();
            }

        }

        @objid ("00706ed0-18c8-1080-943a-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("8da6fa8e-04dc-4efe-a1eb-aaed322f660a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mSource;
            }

            @objid ("7a1d1d6c-35da-4cfa-b4b2-9fb2a705a83c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mSource = value;
            }

            @objid ("8b5158dd-09a4-4dd5-aa61-48360aa757ea")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedEndDep();
            }

        }

        @objid ("004d5f44-5fb6-1085-8e91-001ec947cd2a")
        public static class OppositeOwnerSmDependency extends SmSingleDependency {
            @objid ("f8ba7a1d-0936-4dce-8a11-14b6102dec99")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mOppositeOwner;
            }

            @objid ("88ca4afb-44bd-42d4-b027-d9963feb9b32")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mOppositeOwner = value;
            }

            @objid ("d7280132-29b2-4249-8638-c0b3d1fc217d")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OppositeDep();
            }

        }

        @objid ("c3f652d3-33d8-11e2-b9f1-002564c97630")
        public static class IsChangeableSmAttribute extends SmAttribute {
            @objid ("39d79442-b4a7-4dd5-a8a4-577025a7b76e")
            public Object getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mIsChangeable;
            }

            @objid ("788db484-46b2-456d-9ec5-c25e35d51929")
            public void setValue(ISmObjectData data, Object value) {
                ((AssociationEndData) data).mIsChangeable = value;
            }

        }

        @objid ("aa940df3-73a7-4e1c-b015-2e219c2646d3")
        public static class AssociationSmDependency extends SmSingleDependency {
            @objid ("e99a8b57-5331-4858-809a-ee30c48fb5c2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mAssociation;
            }

            @objid ("8123a8fd-4f47-4ada-9370-3840b1d0c940")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mAssociation = value;
            }

            @objid ("b25dc43e-4890-445d-8710-a7f56f0040c7")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.EndDep();
            }

        }

    }

}
