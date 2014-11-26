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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataStateData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementImpl;
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

@objid ("000765a2-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnItemAwareElement.class, factory=BpmnItemAwareElementData.Metadata.ObjectFactory.class)
public abstract class BpmnItemAwareElementData extends BpmnFlowElementData {
    @objid ("b5e74249-1d5e-479a-b02e-6441373b7912")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("0b165023-90ba-4373-9f8a-bfe086466728")
    @SmaMetaAssociation(metaName="TargetOfDataAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.TargetOfDataAssociationSmDependency.class)
     List<SmObjectImpl> mTargetOfDataAssociation = null;

    @objid ("6ada8a4b-9a30-4ae5-b00b-8c5a0d9d9f26")
    @SmaMetaAssociation(metaName="ItemSubjectRef", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ItemSubjectRefSmDependency.class, partof = true)
     SmObjectImpl mItemSubjectRef;

    @objid ("98bc5d29-729b-498d-b659-ff07a395f922")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("1f071075-fca6-4835-879e-2423d668b78a")
    @SmaMetaAssociation(metaName="RepresentedAssociationEnd", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAssociationEndSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAssociationEnd;

    @objid ("8ed90736-96fc-4299-a9aa-8bda2ae6ae89")
    @SmaMetaAssociation(metaName="DataState", typeDataClass=BpmnDataStateData.class, min=0, max=1, smAssociationClass=Metadata.DataStateSmDependency.class, component = true)
     SmObjectImpl mDataState;

    @objid ("7357f9a7-bd32-4f0f-8d6c-1b9f1f51e456")
    @SmaMetaAssociation(metaName="SourceOfDataAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.SourceOfDataAssociationSmDependency.class)
     List<SmObjectImpl> mSourceOfDataAssociation = null;

    @objid ("a489fbe8-ac06-4433-a13d-a64b6386dfef")
    @SmaMetaAssociation(metaName="RepresentedAttribute", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAttributeSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAttribute;

    @objid ("d87bff3d-a601-4974-888a-7e5773c4c6c1")
    @SmaMetaAssociation(metaName="RepresentedInstance", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedInstanceSmDependency.class, partof = true)
     SmObjectImpl mRepresentedInstance;

    @objid ("8728e867-3b76-4287-9ba4-76d8b19a7989")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00342ba0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b8e529cc-0fb7-4674-86c6-b0b127a5c58f")
        private static SmClass smClass = null;

        @objid ("570bff9a-a382-4132-8e2a-5d699e918b2e")
        private static SmDependency TypeDep = null;

        @objid ("f315b695-a692-4afd-9789-b39669f046c9")
        private static SmDependency TargetOfDataAssociationDep = null;

        @objid ("1d5fe03b-81ca-4b48-81f2-303d3ab19a87")
        private static SmDependency ItemSubjectRefDep = null;

        @objid ("aa8b3f89-3b6f-4395-af13-8bad73fc917d")
        private static SmDependency InStateDep = null;

        @objid ("e37f34a8-0f14-4ad8-8564-f498f0d44f40")
        private static SmDependency RepresentedAssociationEndDep = null;

        @objid ("089ac958-c485-4fcb-9eab-cf01cc3ae394")
        private static SmDependency DataStateDep = null;

        @objid ("e67abc5a-8b60-4c87-b3d6-0d7f01ea98aa")
        private static SmDependency SourceOfDataAssociationDep = null;

        @objid ("9579f14d-f552-4eba-a865-cd02f07980c3")
        private static SmDependency RepresentedAttributeDep = null;

        @objid ("07b61743-4dbb-4f5a-9941-38d8d62708fe")
        private static SmDependency RepresentedInstanceDep = null;

        @objid ("13fc2f68-fc9a-4ccd-ac60-aef895ee90d4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnItemAwareElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2261c861-a3a9-4484-a7af-c6447bb6527c")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("c0d83266-6cac-467d-85ae-2c86deef224f")
        public static SmDependency TargetOfDataAssociationDep() {
            if (TargetOfDataAssociationDep == null) {
            	TargetOfDataAssociationDep = classof().getDependencyDef("TargetOfDataAssociation");
            }
            return TargetOfDataAssociationDep;
        }

        @objid ("29074345-a1c9-4f02-8447-4ad1f34ad5f2")
        public static SmDependency ItemSubjectRefDep() {
            if (ItemSubjectRefDep == null) {
            	ItemSubjectRefDep = classof().getDependencyDef("ItemSubjectRef");
            }
            return ItemSubjectRefDep;
        }

        @objid ("b0ecd780-0c1a-42ac-a55a-aa7dad34a48f")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("a3d1e5bd-5f2c-446f-b953-3f53bfdbccc9")
        public static SmDependency RepresentedAssociationEndDep() {
            if (RepresentedAssociationEndDep == null) {
            	RepresentedAssociationEndDep = classof().getDependencyDef("RepresentedAssociationEnd");
            }
            return RepresentedAssociationEndDep;
        }

        @objid ("4c42f15f-a1f0-4701-91ca-62a134d06f21")
        public static SmDependency DataStateDep() {
            if (DataStateDep == null) {
            	DataStateDep = classof().getDependencyDef("DataState");
            }
            return DataStateDep;
        }

        @objid ("6e8455c4-ce0a-463c-aa28-76101e9521c7")
        public static SmDependency SourceOfDataAssociationDep() {
            if (SourceOfDataAssociationDep == null) {
            	SourceOfDataAssociationDep = classof().getDependencyDef("SourceOfDataAssociation");
            }
            return SourceOfDataAssociationDep;
        }

        @objid ("80faeb56-6560-4ead-9e33-a217319bee55")
        public static SmDependency RepresentedAttributeDep() {
            if (RepresentedAttributeDep == null) {
            	RepresentedAttributeDep = classof().getDependencyDef("RepresentedAttribute");
            }
            return RepresentedAttributeDep;
        }

        @objid ("5f95487f-f0df-466f-afdc-ee51037f2906")
        public static SmDependency RepresentedInstanceDep() {
            if (RepresentedInstanceDep == null) {
            	RepresentedInstanceDep = classof().getDependencyDef("RepresentedInstance");
            }
            return RepresentedInstanceDep;
        }

        @objid ("dcf4cec2-8930-4819-b8bb-2b6f3e357394")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f5c6f88b-cb07-42fa-9c53-8488fac27802")
        public static SmDependency getTargetOfDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetOfDataAssociationDep;
        }

        @objid ("60516545-78a4-4940-b4c8-4e638baf96bc")
        public static SmDependency getDataStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataStateDep;
        }

        @objid ("555200e4-dbe9-48d0-be56-ff979b8444c8")
        public static SmDependency getRepresentedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAttributeDep;
        }

        @objid ("404ad5b2-59b1-43d5-9656-35ad920adb33")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("66ff8a5b-3151-4cf5-a288-b3afc93b12c9")
        public static SmDependency getSourceOfDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceOfDataAssociationDep;
        }

        @objid ("7a5ec866-0a66-4630-8bbc-72cabc4ceaa2")
        public static SmDependency getItemSubjectRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemSubjectRefDep;
        }

        @objid ("5797885f-8195-480f-b057-d886f3040986")
        public static SmDependency getRepresentedAssociationEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAssociationEndDep;
        }

        @objid ("d8645861-a467-483c-b328-3af57c6b6d8b")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("6d35fd86-57f5-4b81-8d74-6d02ac636c72")
        public static SmDependency getRepresentedInstanceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedInstanceDep;
        }

        @objid ("00346c78-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a8cb95b1-4d38-4d29-bbc6-3af41948e0f2")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("42ab584e-46f3-4d02-a2b7-06401b2045d2")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0034d352-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemSubjectRefSmDependency extends SmSingleDependency {
            @objid ("fd492857-8756-4fbf-a5b7-4405542b60bc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mItemSubjectRef;
            }

            @objid ("c056f8f9-75f7-4161-b490-f7813d18e017")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mItemSubjectRef = value;
            }

            @objid ("75f1913e-2be2-4721-b9d5-9a5e5b963c03")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedItemDep();
            }

        }

        @objid ("00354864-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataStateSmDependency extends SmSingleDependency {
            @objid ("e7949787-9e65-4ccc-a812-a91589b7dbab")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mDataState;
            }

            @objid ("ac5bebe9-138c-4dd4-b6be-f128e129cdf5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mDataState = value;
            }

            @objid ("710e0ed2-2649-4bc7-bcba-fe2799da3603")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataStateData.Metadata.ItemDep();
            }

        }

        @objid ("0035c7a8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAttributeSmDependency extends SmSingleDependency {
            @objid ("5f63faf7-32a6-41f6-a233-0114e6fd3943")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedAttribute;
            }

            @objid ("4f2403ca-12c7-42fc-bfd8-79c2408725b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedAttribute = value;
            }

            @objid ("59c9376f-fa79-4e15-a7e3-ab4bf0ac440f")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("00363e9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAssociationEndSmDependency extends SmSingleDependency {
            @objid ("79b15d2f-53e4-4039-8e75-07c40ba9083f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedAssociationEnd;
            }

            @objid ("68f6fd95-8955-4ec0-bdb9-19fdeae85c00")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedAssociationEnd = value;
            }

            @objid ("4d32dcce-bd09-4783-b3ff-86c62cf74764")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("0036b4ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedInstanceSmDependency extends SmSingleDependency {
            @objid ("14bdde52-af15-4c55-8fa1-d19f20a5e4db")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedInstance;
            }

            @objid ("1f52dbd9-2d6e-4710-a1ee-c1afe584df6f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedInstance = value;
            }

            @objid ("06192db9-ac81-4582-9f3a-42d5a107c55c")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("00372d1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceOfDataAssociationSmDependency extends SmMultipleDependency {
            @objid ("0cc7f8e9-ef82-47e8-9d9a-d850ee7d99f3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemAwareElementData)data).mSourceOfDataAssociation != null)? ((BpmnItemAwareElementData)data).mSourceOfDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("244653bd-b220-4b50-8b81-352a826ba34b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemAwareElementData) data).mSourceOfDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnItemAwareElementData) data).mSourceOfDataAssociation;
            }

            @objid ("18eff784-7f9f-49c3-a4d5-7e195271595b")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.SourceRefDep();
            }

        }

        @objid ("0037939e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetOfDataAssociationSmDependency extends SmMultipleDependency {
            @objid ("d2825ddc-f2e7-4457-8700-0a4956fffc5d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemAwareElementData)data).mTargetOfDataAssociation != null)? ((BpmnItemAwareElementData)data).mTargetOfDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("f907babf-6f63-45a2-a76e-664c99525b33")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemAwareElementData) data).mTargetOfDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnItemAwareElementData) data).mTargetOfDataAssociation;
            }

            @objid ("32665367-5eca-434d-8e0f-6ec1397f2c81")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.TargetRefDep();
            }

        }

        @objid ("0037f974-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("a649e498-6791-41d0-98af-37e828a5ea0a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mType;
            }

            @objid ("d7e37ac9-b207-4ca6-a5bb-47c2b0cedef0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mType = value;
            }

            @objid ("0b4c855b-a70a-40c9-a940-55984ff2e1c8")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnItemAwareRefsDep();
            }

        }

        @objid ("00387444-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("72535bc7-3b7f-4a28-9dd4-dd8563f11645")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mInState;
            }

            @objid ("332cb284-2f85-44e0-bc8a-38d7c419ffe0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mInState = value;
            }

            @objid ("075ff06a-e6e0-4448-b061-8cc58c53b8e5")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfBpmnItemDep();
            }

        }

    }

}
