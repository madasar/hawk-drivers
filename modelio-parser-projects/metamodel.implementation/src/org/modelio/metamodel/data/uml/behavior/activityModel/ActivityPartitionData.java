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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityNodeData;
import org.modelio.metamodel.data.uml.behavior.activityModel.MessageFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityPartitionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
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

@objid ("002a3320-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityPartition.class, factory=ActivityPartitionData.Metadata.ObjectFactory.class)
public class ActivityPartitionData extends ActivityGroupData {
    @objid ("ca4f01e5-3402-45ed-97ba-25970d433bee")
    @SmaMetaAttribute(metaName="IsDimension", type=Boolean.class, smAttributeClass=Metadata.IsDimensionSmAttribute.class)
     Object mIsDimension = false;

    @objid ("19f5598b-d7a4-4866-86df-5a0a41431e1e")
    @SmaMetaAttribute(metaName="IsExternal", type=Boolean.class, smAttributeClass=Metadata.IsExternalSmAttribute.class)
     Object mIsExternal = false;

    @objid ("a761747b-1070-4306-ac06-93391ced9f16")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("4d96b243-df1a-4694-8298-935e71553b40")
    @SmaMetaAssociation(metaName="ContainedNode", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.ContainedNodeSmDependency.class, component = true)
     List<SmObjectImpl> mContainedNode = null;

    @objid ("9067cc02-a97a-4467-a4dd-8097fbd695ec")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=MessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("7c00d57a-8058-4982-b0f0-1e5d914b7731")
    @SmaMetaAssociation(metaName="SuperPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.SuperPartitionSmDependency.class)
     SmObjectImpl mSuperPartition;

    @objid ("59a7d6be-5192-47bb-abe2-42ec6b7493ee")
    @SmaMetaAssociation(metaName="SubPartition", typeDataClass=ActivityPartitionData.class, min=0, max=-1, smAssociationClass=Metadata.SubPartitionSmDependency.class, component = true)
     List<SmObjectImpl> mSubPartition = null;

    @objid ("3086ff2f-912e-4fe6-9bbc-d675ffb4eb9f")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=MessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class)
     List<SmObjectImpl> mIncoming = null;

    @objid ("520a64cc-2372-4bb5-a074-52d880ec96f6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005f8ffc-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b47899a7-d60d-4501-a340-7feb7f729002")
        private static SmClass smClass = null;

        @objid ("613b0f22-c057-481e-b676-3260d0d53977")
        private static SmAttribute IsDimensionAtt = null;

        @objid ("ea79d87e-5e25-43ad-b6e8-5f3685db3974")
        private static SmAttribute IsExternalAtt = null;

        @objid ("37f1b3ee-5176-4c8e-941b-556678db53dd")
        private static SmDependency RepresentedDep = null;

        @objid ("fd583065-5454-488f-bde4-8dc10abaf00d")
        private static SmDependency ContainedNodeDep = null;

        @objid ("b3ca6c9d-d80f-4c75-8f8a-22b9a342a7c6")
        private static SmDependency OutgoingDep = null;

        @objid ("191d64c7-00b9-4917-860a-8a91311f1bc3")
        private static SmDependency SuperPartitionDep = null;

        @objid ("e2f9f41c-d044-4c48-b9f7-f3c44c2a328b")
        private static SmDependency SubPartitionDep = null;

        @objid ("16314c35-ecb0-4a83-957e-e27d4d327531")
        private static SmDependency IncomingDep = null;

        @objid ("af9f7866-31ca-4b0e-ad63-5b02f2c2d27d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityPartitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9e543ded-847a-4524-b076-345bef75cbec")
        public static SmAttribute IsDimensionAtt() {
            if (IsDimensionAtt == null) {
            	IsDimensionAtt = classof().getAttributeDef("IsDimension");
            }
            return IsDimensionAtt;
        }

        @objid ("8c7dcde7-075b-4486-8203-d69de5d88bc9")
        public static SmAttribute IsExternalAtt() {
            if (IsExternalAtt == null) {
            	IsExternalAtt = classof().getAttributeDef("IsExternal");
            }
            return IsExternalAtt;
        }

        @objid ("5ffdcb65-b1a9-41cd-bf85-d4e4f2eb40c3")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("ce51f562-a32b-43ba-8cb9-3f33823fad5b")
        public static SmDependency ContainedNodeDep() {
            if (ContainedNodeDep == null) {
            	ContainedNodeDep = classof().getDependencyDef("ContainedNode");
            }
            return ContainedNodeDep;
        }

        @objid ("3885f3f2-b996-4ae5-bb26-c8391883ebec")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("61db6d7a-17f2-42a1-988e-082344af0dfe")
        public static SmDependency SuperPartitionDep() {
            if (SuperPartitionDep == null) {
            	SuperPartitionDep = classof().getDependencyDef("SuperPartition");
            }
            return SuperPartitionDep;
        }

        @objid ("0952b25c-3e5f-4a83-8a4e-aaafb54ffc0e")
        public static SmDependency SubPartitionDep() {
            if (SubPartitionDep == null) {
            	SubPartitionDep = classof().getDependencyDef("SubPartition");
            }
            return SubPartitionDep;
        }

        @objid ("e11125c2-21d7-4c38-8e93-9f42bc95e017")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("558d0de7-4bfc-4eaa-9317-4e9d49a2029c")
        public static SmAttribute getIsExternalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExternalAtt;
        }

        @objid ("a4645b3c-c71e-4bc2-8757-51fceafe0adc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9cab299f-ba91-4fff-8fe8-4fcb43d557b5")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("6ec0a3d5-adef-46d3-a735-497ced096ab7")
        public static SmAttribute getIsDimensionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDimensionAtt;
        }

        @objid ("0b7379f2-02f7-422d-a07d-c3d9c66007b6")
        public static SmDependency getContainedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainedNodeDep;
        }

        @objid ("ac383d33-d5d3-4248-bf7b-991415f2d090")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("39ac559b-a780-430a-9263-e90d757a900d")
        public static SmDependency getSuperPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SuperPartitionDep;
        }

        @objid ("bb707c8b-a1dc-4c1f-822a-7cf16fa8dbf1")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("0123027f-8c94-4c8d-b2c1-89ee93c2de85")
        public static SmDependency getSubPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubPartitionDep;
        }

        @objid ("005fd200-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1cefe569-db15-424f-aeea-71ea07d489b8")
            public ISmObjectData createData() {
                return new ActivityPartitionData();
            }

            @objid ("bef55160-b7a0-468c-a309-e93449abdca1")
            public SmObjectImpl createImpl() {
                return new ActivityPartitionImpl();
            }

        }

        @objid ("006034f2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsDimensionSmAttribute extends SmAttribute {
            @objid ("92c59ab1-19e2-4b4e-8c5f-5077bf353267")
            public Object getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mIsDimension;
            }

            @objid ("a500a072-9da5-483d-ac48-7dc629bde492")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityPartitionData) data).mIsDimension = value;
            }

        }

        @objid ("00609956-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExternalSmAttribute extends SmAttribute {
            @objid ("baf89743-e5d9-4b4f-8b6f-66520dd0a573")
            public Object getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mIsExternal;
            }

            @objid ("af1e44b8-8fd5-4542-8379-db495f21ec68")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityPartitionData) data).mIsExternal = value;
            }

        }

        @objid ("0060fe82-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("71041076-0944-436f-93f4-dbfec2ef183b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mOutgoing != null)? ((ActivityPartitionData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("57688732-8cfb-43ef-8047-27c4439ca001")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mOutgoing;
            }

            @objid ("0fbd4457-0b45-44a9-abfb-cccc42085740")
            @Override
            public SmDependency getSymetric() {
                return MessageFlowData.Metadata.SourcePartitionDep();
            }

        }

        @objid ("00616304-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("d4149c65-35b5-49db-a271-24d2d377f1f9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mIncoming != null)? ((ActivityPartitionData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("54014669-e148-4532-84eb-42729388ff07")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mIncoming;
            }

            @objid ("80cbca45-20cd-4f29-bed0-5157cb985dcc")
            @Override
            public SmDependency getSymetric() {
                return MessageFlowData.Metadata.TargetPartitionDep();
            }

        }

        @objid ("0061cace-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("33d8ed95-5ab3-49b7-b825-6a887664607e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mRepresented;
            }

            @objid ("cb26dd7e-06d9-4b0a-bd3b-7062f75cf680")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityPartitionData) data).mRepresented = value;
            }

            @objid ("408ebe62-36f3-4114-b4ae-a25f4c6ac647")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingPartitionDep();
            }

        }

        @objid ("0062431e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubPartitionSmDependency extends SmMultipleDependency {
            @objid ("d3900e2e-69f2-40eb-b83c-34489a1fc4ce")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mSubPartition != null)? ((ActivityPartitionData)data).mSubPartition:SmMultipleDependency.EMPTY;
            }

            @objid ("3ac5f93b-2856-4f67-89c6-06bae98991b8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mSubPartition = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mSubPartition;
            }

            @objid ("871fe23b-cb7f-4f63-b4f0-cb633762b253")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.SuperPartitionDep();
            }

        }

        @objid ("0062a9c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SuperPartitionSmDependency extends SmSingleDependency {
            @objid ("59daf2c0-204a-4089-9c9b-0b08540ef9b7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mSuperPartition;
            }

            @objid ("2e4b869c-9bf7-4c80-aa7c-fbe355e93e7b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityPartitionData) data).mSuperPartition = value;
            }

            @objid ("46794625-925e-40e2-b8e7-7ca2c698a9da")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.SubPartitionDep();
            }

        }

        @objid ("006323a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ContainedNodeSmDependency extends SmMultipleDependency {
            @objid ("919e61a3-150a-4cea-8c05-e24325d80630")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mContainedNode != null)? ((ActivityPartitionData)data).mContainedNode:SmMultipleDependency.EMPTY;
            }

            @objid ("33b09fbb-836c-4531-a4c7-1cbab3f36545")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mContainedNode = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mContainedNode;
            }

            @objid ("05a40be2-474f-475e-a363-298c143b6ac1")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerPartitionDep();
            }

        }

    }

}
