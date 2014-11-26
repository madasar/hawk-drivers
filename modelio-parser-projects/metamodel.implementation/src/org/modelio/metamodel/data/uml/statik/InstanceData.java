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
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationNodeData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AttributeLinkData;
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.NaryLinkEndData;
import org.modelio.metamodel.impl.uml.statik.InstanceImpl;
import org.modelio.metamodel.uml.statik.Instance;
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

@objid ("000dc94c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Instance.class, factory=InstanceData.Metadata.ObjectFactory.class)
public class InstanceData extends ModelElementData {
    @objid ("fa200b05-598d-4919-8838-575e5000bb01")
    @SmaMetaAttribute(metaName="IsConstant", type=Boolean.class, smAttributeClass=Metadata.IsConstantSmAttribute.class)
     Object mIsConstant = false;

    @objid ("97fbedd3-59b8-4ea4-ae4a-0313c01e80f9")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "1";

    @objid ("fc60f72c-dea2-4b1a-812e-e9ef96bac946")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("3a4139f8-5695-4108-8ee6-e89b3327f702")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("0fbc813c-1f66-46c6-b089-4f744fba8563")
    @SmaMetaAssociation(metaName="RepresentedCommunicationNode", typeDataClass=CommunicationNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedCommunicationNodeSmDependency.class)
     List<SmObjectImpl> mRepresentedCommunicationNode = null;

    @objid ("2c9541ef-cbcd-44f4-9130-50891e405969")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("99c47bbf-54d4-49f2-aba8-d41b0f30e887")
    @SmaMetaAssociation(metaName="OwnedEnd", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedEnd = null;

    @objid ("f5c1b376-cc30-4857-9112-3fa214fd04f4")
    @SmaMetaAssociation(metaName="Base", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("56044abd-2fd6-4133-b55b-2ccca95f7923")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("8c9dd9ef-d543-4913-a695-0be4bcd944a4")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("97e745f0-22f4-4f2f-8205-145e06ffad58")
    @SmaMetaAssociation(metaName="OwnedNaryEnd", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNaryEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNaryEnd = null;

    @objid ("f5f8059a-4ab7-42d0-a212-0f58d8e86406")
    @SmaMetaAssociation(metaName="RepresentedLifeLine", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedLifeLineSmDependency.class)
     List<SmObjectImpl> mRepresentedLifeLine = null;

    @objid ("b2c2daa6-6245-4cbb-9681-1beb9e08ed53")
    @SmaMetaAssociation(metaName="Slot", typeDataClass=AttributeLinkData.class, min=0, max=-1, smAssociationClass=Metadata.SlotSmDependency.class, component = true)
     List<SmObjectImpl> mSlot = null;

    @objid ("b4fcc5af-8836-4d99-b096-ebb28361da36")
    @SmaMetaAssociation(metaName="Part", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.PartSmDependency.class, component = true)
     List<SmObjectImpl> mPart = null;

    @objid ("8a066e83-0a09-4988-bb92-f9bc6dc28886")
    @SmaMetaAssociation(metaName="TargetingEnd", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.TargetingEndSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTargetingEnd = null;

    @objid ("bd4b6c9e-a085-4cc5-872b-3ff83c110328")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005abbd0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0c55a391-32d1-446f-b365-a860a106793d")
        private static SmClass smClass = null;

        @objid ("e316f7ef-6e2d-4f84-a332-5f3b5052c5b8")
        private static SmAttribute IsConstantAtt = null;

        @objid ("6b7e3c05-4807-4a14-8571-aad8ab4782f7")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("33962d94-9c95-420b-ac76-91f6276816f9")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("94f19f73-2439-4fa7-b0c0-389f7f362419")
        private static SmAttribute ValueAtt = null;

        @objid ("d20f7452-6dcc-4203-bd3a-241d70f5c47d")
        private static SmDependency RepresentedCommunicationNodeDep = null;

        @objid ("08eefcd0-7289-49a6-8c34-9fb1dedbbfd1")
        private static SmDependency RepresentingItemDep = null;

        @objid ("aba654eb-8b14-440a-bc5b-c72cb5ac575a")
        private static SmDependency OwnedEndDep = null;

        @objid ("27fe258e-4600-482a-b40d-bfc5099745f5")
        private static SmDependency BaseDep = null;

        @objid ("873bd50b-8fb0-478c-8654-b6a21c9f7f97")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("42a80d5e-8d66-4a01-8887-ab15f6a687c5")
        private static SmDependency OwnerDep = null;

        @objid ("313f1670-1512-4de4-9ea3-e821ce98f2bc")
        private static SmDependency OwnedNaryEndDep = null;

        @objid ("df1aebe6-b0ef-457c-94a4-1819adc10288")
        private static SmDependency RepresentedLifeLineDep = null;

        @objid ("75c07f00-4309-4d65-8382-f9dcfa62acdb")
        private static SmDependency SlotDep = null;

        @objid ("11e8a3f2-1795-4ddc-b25d-1d79f3c35a0e")
        private static SmDependency PartDep = null;

        @objid ("9e3df773-872b-424f-93ad-106c32289848")
        private static SmDependency TargetingEndDep = null;

        @objid ("6ea255cc-8195-4043-9525-4f950e9ae34a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InstanceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9e6fed80-9f71-435d-95b2-23c25581cb63")
        public static SmAttribute IsConstantAtt() {
            if (IsConstantAtt == null) {
            	IsConstantAtt = classof().getAttributeDef("IsConstant");
            }
            return IsConstantAtt;
        }

        @objid ("097ea7f0-1b77-4de7-a109-603638dcca93")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("80b85d64-c0f1-4134-9535-de95e32becda")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("b1cbbe23-3e6b-4979-b5c0-52902d8d2afa")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("adccec82-db61-44b3-8b2c-91539e46a6cd")
        public static SmDependency RepresentedCommunicationNodeDep() {
            if (RepresentedCommunicationNodeDep == null) {
            	RepresentedCommunicationNodeDep = classof().getDependencyDef("RepresentedCommunicationNode");
            }
            return RepresentedCommunicationNodeDep;
        }

        @objid ("628663e7-3d28-40a5-9f17-05873fb84694")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("52a3f242-fd62-4b03-88b4-b0d3392bd3b6")
        public static SmDependency OwnedEndDep() {
            if (OwnedEndDep == null) {
            	OwnedEndDep = classof().getDependencyDef("OwnedEnd");
            }
            return OwnedEndDep;
        }

        @objid ("e58d9438-1ffe-4946-a208-83c98ef5c561")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("cb6c19f6-d119-4e4c-ad72-769bbf6e57b0")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("29b1ea91-135f-4fe7-93f2-70cc4cf96281")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("c1601e88-9ecb-4473-b3ef-20f6c69d8bad")
        public static SmDependency OwnedNaryEndDep() {
            if (OwnedNaryEndDep == null) {
            	OwnedNaryEndDep = classof().getDependencyDef("OwnedNaryEnd");
            }
            return OwnedNaryEndDep;
        }

        @objid ("5912255b-ac5e-4ca6-9320-949299a11220")
        public static SmDependency RepresentedLifeLineDep() {
            if (RepresentedLifeLineDep == null) {
            	RepresentedLifeLineDep = classof().getDependencyDef("RepresentedLifeLine");
            }
            return RepresentedLifeLineDep;
        }

        @objid ("5fc9caf5-a8d6-41a8-ac45-32b726bd4bd1")
        public static SmDependency SlotDep() {
            if (SlotDep == null) {
            	SlotDep = classof().getDependencyDef("Slot");
            }
            return SlotDep;
        }

        @objid ("054e6576-1d00-43de-870b-5d9926440024")
        public static SmDependency PartDep() {
            if (PartDep == null) {
            	PartDep = classof().getDependencyDef("Part");
            }
            return PartDep;
        }

        @objid ("81e833cb-bc86-4a59-b2af-a1feb25c1af6")
        public static SmDependency TargetingEndDep() {
            if (TargetingEndDep == null) {
            	TargetingEndDep = classof().getDependencyDef("TargetingEnd");
            }
            return TargetingEndDep;
        }

        @objid ("9f22d75a-c028-45b8-b99a-4a6ecd686a2a")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("c6a0370d-2b47-43c9-ab02-286ae8c182cf")
        public static SmDependency getTargetingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetingEndDep;
        }

        @objid ("c8c4c8fe-e0c8-41ca-bcef-d4aaa897df73")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("e1dc0917-3c33-48c3-a0ad-0c5e004e4a8f")
        public static SmDependency getOwnedNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNaryEndDep;
        }

        @objid ("9b22d8f4-4457-4f10-993c-de517448366a")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("6dd37da0-b787-4bff-9e90-6a3527226c6a")
        public static SmDependency getRepresentedCommunicationNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedCommunicationNodeDep;
        }

        @objid ("2309fad1-66b0-431b-99da-b0cfe8aaab89")
        public static SmDependency getPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PartDep;
        }

        @objid ("2d19ddf8-7487-4572-b42f-8231211fc796")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("3656dd97-5328-4974-95c8-9eab840a1bb8")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("acc5cbda-da0b-4dcc-bf32-9bd55f748db7")
        public static SmDependency getRepresentedLifeLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedLifeLineDep;
        }

        @objid ("d282db37-85ed-4e01-8e51-19852ea7aa08")
        public static SmDependency getOwnedEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedEndDep;
        }

        @objid ("7c511e8c-f483-4525-8839-5f543841df68")
        public static SmDependency getSlotDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SlotDep;
        }

        @objid ("f18288be-9780-4de0-918b-ce570c2d51e4")
        public static SmAttribute getIsConstantAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConstantAtt;
        }

        @objid ("f77d0bcf-214c-446f-9120-9027bb921529")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("3f7b8e21-5eb8-4233-b13e-60d96adc6f29")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1a273caa-af34-478f-ab27-7c834eca2cec")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("005afbfe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9be6f158-582e-4183-bb09-a66a88b9cab2")
            public ISmObjectData createData() {
                return new InstanceData();
            }

            @objid ("01ce0d46-8e43-4361-8762-6d5ae99b479e")
            public SmObjectImpl createImpl() {
                return new InstanceImpl();
            }

        }

        @objid ("005b5d74-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsConstantSmAttribute extends SmAttribute {
            @objid ("7ba98326-ae92-4ff1-86b1-0dce1de83075")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mIsConstant;
            }

            @objid ("f14385c2-2cb3-442e-a112-05f24551db94")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mIsConstant = value;
            }

        }

        @objid ("005bc61a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("fdd9b122-44bc-4c8e-8b0c-ba150340e3f1")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mMultiplicityMin;
            }

            @objid ("cce06d28-b671-424c-aa59-b881716064bc")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mMultiplicityMin = value;
            }

        }

        @objid ("005c2876-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("4c469551-4f5f-4f14-92fd-650b4d1f3b5d")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mMultiplicityMax;
            }

            @objid ("e76492bd-6ba7-451b-987e-cade052a84ce")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mMultiplicityMax = value;
            }

        }

        @objid ("005c894c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("ff0031c3-c8cf-4106-b997-75392e4f53a1")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mValue;
            }

            @objid ("bbe5821f-c9f8-47fc-b069-adcd495c9e82")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mValue = value;
            }

        }

        @objid ("005cee5a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SlotSmDependency extends SmMultipleDependency {
            @objid ("9e895ddb-7e92-4cd8-8a29-286eba22c900")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mSlot != null)? ((InstanceData)data).mSlot:SmMultipleDependency.EMPTY;
            }

            @objid ("5a58ebef-4120-4fb6-981b-9a4926eda4d7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mSlot = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mSlot;
            }

            @objid ("393a9d86-325e-45ba-8707-cbd9e0ae9801")
            @Override
            public SmDependency getSymetric() {
                return AttributeLinkData.Metadata.AttributedDep();
            }

        }

        @objid ("005db5c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("ae71bf24-297b-4731-90f5-2f10cd26a4a7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InstanceData) data).mBase;
            }

            @objid ("0e103141-b475-44af-af03-de881d3b5f1a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InstanceData) data).mBase = value;
            }

            @objid ("4cef0497-5ed2-4805-aa1d-c380ab1c029c")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.RepresentingDep();
            }

        }

        @objid ("005e2c48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("5d2a8cf8-7a7e-400e-8a59-de6b7baf4a51")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InstanceData) data).mOwner;
            }

            @objid ("186cf45d-474b-4775-b7dd-072241498551")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InstanceData) data).mOwner = value;
            }

            @objid ("cafdcf1e-a9c2-41ee-bcaa-743638abede3")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.DeclaredDep();
            }

        }

        @objid ("005ea3da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PartSmDependency extends SmMultipleDependency {
            @objid ("80b0b1bf-dd65-49c6-ad31-9198c35a9e71")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mPart != null)? ((InstanceData)data).mPart:SmMultipleDependency.EMPTY;
            }

            @objid ("a01ccbad-52ec-4c8d-99ae-610ea4a74042")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mPart = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mPart;
            }

            @objid ("1718d2dd-1e3b-4a99-8cb9-e7a1b94a98fb")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.ClusterDep();
            }

        }

        @objid ("005f099c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentedLifeLineSmDependency extends SmMultipleDependency {
            @objid ("dfbfa9d6-02b4-44e3-b096-d3a78512f639")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentedLifeLine != null)? ((InstanceData)data).mRepresentedLifeLine:SmMultipleDependency.EMPTY;
            }

            @objid ("5eca317e-1ab2-4c78-bd3e-ed38c78b2004")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentedLifeLine = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentedLifeLine;
            }

            @objid ("5483c62d-eb7d-419c-8efa-9f7bff8fbe52")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.RepresentedDep();
            }

        }

        @objid ("005f7120-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("23f0e819-ff10-46c9-8c59-49685ffb3ba2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentingObjectNode != null)? ((InstanceData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("772126bc-d37a-4fff-b075-49b3682986f7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentingObjectNode;
            }

            @objid ("26c424ad-3cb1-4a7a-b070-ce02f62770e4")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedDep();
            }

        }

        @objid ("005fd868-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentedCommunicationNodeSmDependency extends SmMultipleDependency {
            @objid ("53238258-bb43-416e-8f7c-48c6ef0633a0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentedCommunicationNode != null)? ((InstanceData)data).mRepresentedCommunicationNode:SmMultipleDependency.EMPTY;
            }

            @objid ("fe3fac49-090b-43f1-b134-42b4850b2557")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentedCommunicationNode = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentedCommunicationNode;
            }

            @objid ("82e2e304-e05a-4c86-91d8-ae8589c9431f")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.RepresentedDep();
            }

        }

        @objid ("006043c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("8eb2d7e0-2c0e-430e-a645-cab067af68b5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentingItem != null)? ((InstanceData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("aa5f180f-dbae-4db8-8aa8-7aa70f24effb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentingItem;
            }

            @objid ("dae89e88-af50-4a41-a2f4-4ee7cd77644a")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedInstanceDep();
            }

        }

        @objid ("00967792-18c8-1080-943a-001ec947cd2a")
        public static class OwnedEndSmDependency extends SmMultipleDependency {
            @objid ("3ee62cd9-56d4-4f39-925d-2d48caa0f7e7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mOwnedEnd != null)? ((InstanceData)data).mOwnedEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("8f77f789-acc5-4a85-b629-6b956e0edf87")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mOwnedEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mOwnedEnd;
            }

            @objid ("67d8fbcd-ce03-4f6e-96c0-f04e10a5d3f4")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.SourceDep();
            }

        }

        @objid ("0000eeca-18c9-1080-943a-001ec947cd2a")
        public static class TargetingEndSmDependency extends SmMultipleDependency {
            @objid ("281cec74-30d5-4d98-86bf-1f886a43bc12")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mTargetingEnd != null)? ((InstanceData)data).mTargetingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("9595a518-92bc-45f0-ba2c-a77b9d96ff79")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mTargetingEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mTargetingEnd;
            }

            @objid ("324d050e-df9e-47ab-8d92-3983c7297bfd")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.TargetDep();
            }

        }

        @objid ("0032b838-17f4-10a1-88a0-001ec947cd2a")
        public static class OwnedNaryEndSmDependency extends SmMultipleDependency {
            @objid ("b44d8131-65c1-4862-965e-be4ed5869f64")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mOwnedNaryEnd != null)? ((InstanceData)data).mOwnedNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("6e8c0932-dc57-4134-afc6-5d9930d4d6a1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mOwnedNaryEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mOwnedNaryEnd;
            }

            @objid ("0d17d310-30c3-4dc5-8266-adefd8fd14d9")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.SourceDep();
            }

        }

    }

}
