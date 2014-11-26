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
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.AttributeLinkData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.uml.statik.AttributeImpl;
import org.modelio.metamodel.uml.statik.Attribute;
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

@objid ("009851b6-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Attribute.class, factory=AttributeData.Metadata.ObjectFactory.class)
public class AttributeData extends StructuralFeatureData {
    @objid ("a06a19da-992d-45f9-8b69-3e043d9b2a19")
    @SmaMetaAttribute(metaName="TypeConstraint", type=String.class, smAttributeClass=Metadata.TypeConstraintSmAttribute.class)
     Object mTypeConstraint = "";

    @objid ("2ed93555-555c-4d45-9aab-535565d78f3a")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("e8dddb5d-1aae-4b60-b726-930f451dec83")
    @SmaMetaAttribute(metaName="TargetIsClass", type=Boolean.class, smAttributeClass=Metadata.TargetIsClassSmAttribute.class)
     Object mTargetIsClass = false;

    @objid ("5ca56d09-fd85-406c-a273-8c55bfee603b")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("abaccf75-5e9d-4902-b20c-47fdc443a407")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("66600eda-ae0a-468e-b189-e658b017b88b")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=AttributeLinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("3480c982-60a6-4ab4-b731-ad5fc8639d6b")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("f2785535-483b-4fcb-8d05-c1fc9f639d8a")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("4a0113e4-7160-4823-bd0e-2f1d899f9000")
    @SmaMetaAssociation(metaName="Qualified", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.QualifiedSmDependency.class)
     SmObjectImpl mQualified;

    @objid ("304be69c-98e7-4b41-9c8d-5a5f1f8b214a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00570a9e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("746d55c5-0a9f-40e4-8ab9-7e6ac5de4cd4")
        private static SmClass smClass = null;

        @objid ("4e4fab4a-f349-4e68-a663-ebec4db752a6")
        private static SmAttribute TypeConstraintAtt = null;

        @objid ("302582af-4a14-4c84-8da6-3ae65d34f6b0")
        private static SmAttribute ValueAtt = null;

        @objid ("6aa9301c-9146-42fa-814f-0e958778dc53")
        private static SmAttribute TargetIsClassAtt = null;

        @objid ("11fabf56-092a-4746-bafe-ea5eca112957")
        private static SmDependency TypeDep = null;

        @objid ("63009b23-ed7c-43b0-8d85-55919c886cdc")
        private static SmDependency OwnerDep = null;

        @objid ("a0e592d7-8923-4715-b2cc-3cc9ac5a2447")
        private static SmDependency OccurenceDep = null;

        @objid ("a17686bf-03a0-498f-9341-1048faf312b7")
        private static SmDependency RepresentingItemDep = null;

        @objid ("b9aaa6d6-40fb-4327-bf1b-a25ef6704a3f")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("6e2b7689-7c70-4b9e-a26f-f3930033ab81")
        private static SmDependency QualifiedDep = null;

        @objid ("228172b6-542f-4864-ae18-a63a2b077244")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AttributeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("16ca427d-4c46-4301-9b69-12288921c1c8")
        public static SmAttribute TypeConstraintAtt() {
            if (TypeConstraintAtt == null) {
            	TypeConstraintAtt = classof().getAttributeDef("TypeConstraint");
            }
            return TypeConstraintAtt;
        }

        @objid ("c8297d32-6c74-4c70-bfda-9b53619f74a2")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("7888901e-be35-4b9d-b440-0e0a35f68034")
        public static SmAttribute TargetIsClassAtt() {
            if (TargetIsClassAtt == null) {
            	TargetIsClassAtt = classof().getAttributeDef("TargetIsClass");
            }
            return TargetIsClassAtt;
        }

        @objid ("1ff62e0f-6cb1-465e-8654-f6a35acb06bd")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("331b4f79-d09c-4e49-81c4-1eb856b8d1d2")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("96c0449c-2fbc-43d2-9b4a-3b90fb347482")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("54a93349-7661-4806-8802-f36db6861358")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("3434738c-59df-4bda-b326-efe0c55ab930")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("4bc5bdc8-2c81-4a88-8d1b-2018c1b5c070")
        public static SmDependency QualifiedDep() {
            if (QualifiedDep == null) {
            	QualifiedDep = classof().getDependencyDef("Qualified");
            }
            return QualifiedDep;
        }

        @objid ("24ce99bd-2c48-455d-80d0-d02f6fd6942c")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("4cb60a7c-978f-4562-bf9d-78e49ef9408e")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("e976f975-8b3a-4956-8a37-76df19c9e09c")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("b5b4f415-a987-48df-aeb7-d9d798983d5e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("29ec94c4-1bc9-4f70-8c25-f6f845038019")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("176dc52f-94c9-45bd-a49d-1b0ec5e8af41")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("e2cd81cf-263c-4f9d-8543-6d6c9535df66")
        public static SmDependency getQualifiedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifiedDep;
        }

        @objid ("4cb14bdf-1878-4977-a2a5-55da62c28597")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("2c0a78e3-44f4-4f36-88ab-e8917c7a6c4c")
        public static SmAttribute getTargetIsClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetIsClassAtt;
        }

        @objid ("912e02d2-cc1d-4916-8bf5-e6fe213c2f37")
        public static SmAttribute getTypeConstraintAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeConstraintAtt;
        }

        @objid ("00574c0c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a3ddfd6f-d8ef-4166-aa3a-a78588cabf6d")
            public ISmObjectData createData() {
                return new AttributeData();
            }

            @objid ("a3f24445-def5-4629-87d8-56c971a33330")
            public SmObjectImpl createImpl() {
                return new AttributeImpl();
            }

        }

        @objid ("0057ace2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeConstraintSmAttribute extends SmAttribute {
            @objid ("cac8ceda-c7d9-436a-957e-5ea26cb24bf0")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mTypeConstraint;
            }

            @objid ("7a49694d-f1eb-4d74-80af-08d998c55ea0")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mTypeConstraint = value;
            }

        }

        @objid ("00580f48-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("db97275d-837c-4dc4-9117-9d5f9f9d1baa")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mValue;
            }

            @objid ("ded7eceb-e3b0-46e2-996d-294cfc200b1e")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mValue = value;
            }

        }

        @objid ("00587104-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetIsClassSmAttribute extends SmAttribute {
            @objid ("e2858770-eac6-44c4-b5a1-78b1db3f94e5")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mTargetIsClass;
            }

            @objid ("8ac752ce-8864-4621-9fcb-f1ac399e1766")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mTargetIsClass = value;
            }

        }

        @objid ("0058d568-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("b0194f7d-bcee-4764-a236-5ff9ad08e0c2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mOccurence != null)? ((AttributeData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("c4f79b0a-edab-4f14-b9bd-9f6db5691fb2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mOccurence;
            }

            @objid ("5b0730e0-43a2-4304-9954-281cc451b89e")
            @Override
            public SmDependency getSymetric() {
                return AttributeLinkData.Metadata.BaseDep();
            }

        }

        @objid ("00593d3c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class QualifiedSmDependency extends SmSingleDependency {
            @objid ("4436a979-3b57-4a41-bd78-673bb3d06272")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mQualified;
            }

            @objid ("4fc57f19-c300-417f-9631-979d00ee824a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mQualified = value;
            }

            @objid ("29b22212-3446-46e9-91bd-c610c9013fec")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.QualifierDep();
            }

        }

        @objid ("0059b4ec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("fa5c626d-e953-4c0b-9cd2-4e34d9d34f17")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mType;
            }

            @objid ("ffbf28e2-5538-4a20-bd8f-b8002dc77865")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mType = value;
            }

            @objid ("1035ac61-6deb-4391-8b71-022811e598cf")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.ObjectDep();
            }

        }

        @objid ("005a2c10-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("1bf01040-b6ce-4e97-9044-380b813f2929")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mRepresentingObjectNode != null)? ((AttributeData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("1cd7094d-1240-4e6d-babf-a7680a1f254b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mRepresentingObjectNode;
            }

            @objid ("ff369ba7-deae-4fbd-b374-4018f317d4b7")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedAttributeDep();
            }

        }

        @objid ("005a9416-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("8983231f-bdd8-49d8-8a9e-8f40daa47277")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mRepresentingItem != null)? ((AttributeData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("57e3a283-5ad4-4780-8b8e-f56c63421a6d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mRepresentingItem;
            }

            @objid ("db8447b9-56fb-4b3f-942b-2460924e438c")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedAttributeDep();
            }

        }

        @objid ("005afb04-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("d95d68e0-e5c7-43b8-8119-bccc7ad3b75d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mOwner;
            }

            @objid ("56334057-c9e1-4b5b-b39d-704ff80cad0f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mOwner = value;
            }

            @objid ("8405a029-c736-4d6d-887b-a1eee1495451")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedAttributeDep();
            }

        }

    }

}
