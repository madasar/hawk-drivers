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
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.informationFlow.InformationItemData;
import org.modelio.metamodel.data.uml.infrastructure.SubstitutionData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
import org.modelio.metamodel.data.uml.statik.ComponentRealizationData;
import org.modelio.metamodel.data.uml.statik.NaryAssociationEndData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.RaisedExceptionData;
import org.modelio.metamodel.impl.uml.statik.ClassifierImpl;
import org.modelio.metamodel.uml.statik.Classifier;
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

@objid ("0003c640-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Classifier.class, factory=ClassifierData.Metadata.ObjectFactory.class)
public abstract class ClassifierData extends NameSpaceData {
    @objid ("7deb8453-c160-4464-9954-ff3396be67f2")
    @SmaMetaAssociation(metaName="OwnedOperation", typeDataClass=OperationData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedOperationSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedOperation = null;

    @objid ("839b0a21-9582-4027-9960-e0bad650c980")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=InformationItemData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("22e199ac-4909-4e1e-98da-dec814a4b0d3")
    @SmaMetaAssociation(metaName="Substitued", typeDataClass=SubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.SubstituedSmDependency.class, component = true)
     List<SmObjectImpl> mSubstitued = null;

    @objid ("1d07e5ca-238b-4503-9987-1512235946a2")
    @SmaMetaAssociation(metaName="OwnedAttribute", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedAttributeSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedAttribute = null;

    @objid ("f8620f8f-aab9-45d4-b9b8-b3d6dd19377d")
    @SmaMetaAssociation(metaName="OwnedNaryEnd", typeDataClass=NaryAssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNaryEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNaryEnd = null;

    @objid ("cec035ac-e450-4b2a-956d-5902de287fb6")
    @SmaMetaAssociation(metaName="Conveyer", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ConveyerSmDependency.class)
     List<SmObjectImpl> mConveyer = null;

    @objid ("ff5e5827-df5c-4322-a704-9798c50b2b19")
    @SmaMetaAssociation(metaName="SubstitutingSubstitution", typeDataClass=SubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.SubstitutingSubstitutionSmDependency.class)
     List<SmObjectImpl> mSubstitutingSubstitution = null;

    @objid ("2c80a5b0-b5b5-483f-9a58-8c34265e5276")
    @SmaMetaAssociation(metaName="TargetingEnd", typeDataClass=AssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.TargetingEndSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTargetingEnd = null;

    @objid ("4421e9fa-47ac-4709-ab9f-83b965a71978")
    @SmaMetaAssociation(metaName="OwnedEnd", typeDataClass=AssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedEnd = null;

    @objid ("3a089486-fc8c-4cfb-a6ca-e64a2f217108")
    @SmaMetaAssociation(metaName="BpmnRepresents", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentsSmDependency.class)
     List<SmObjectImpl> mBpmnRepresents = null;

    @objid ("7fb66442-9b66-49d1-a114-14e71c227872")
    @SmaMetaAssociation(metaName="Throwing", typeDataClass=RaisedExceptionData.class, min=0, max=-1, smAssociationClass=Metadata.ThrowingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mThrowing = null;

    @objid ("b932c1f2-ddca-4865-91c8-0d18b40777c2")
    @SmaMetaAssociation(metaName="InternalStructure", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.InternalStructureSmDependency.class, component = true)
     List<SmObjectImpl> mInternalStructure = null;

    @objid ("9c5e447b-dba4-497a-88c2-b9ea298ce056")
    @SmaMetaAssociation(metaName="RealizedComponent", typeDataClass=ComponentRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedComponentSmDependency.class, istodelete = true)
     List<SmObjectImpl> mRealizedComponent = null;

    @objid ("432eb098-3f08-4a3e-9dea-aa7479f6332c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0049e79c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5614deeb-82f5-4f5e-8b97-f819600ce95f")
        private static SmClass smClass = null;

        @objid ("3d372b92-cdee-4ad9-bf68-ebfa86965468")
        private static SmDependency OwnedOperationDep = null;

        @objid ("cc859891-6906-4ce0-a92e-bfe1f0b25ca4")
        private static SmDependency RepresentationDep = null;

        @objid ("06c06d03-2569-459b-8fb9-733614f94190")
        private static SmDependency SubstituedDep = null;

        @objid ("90ca09e5-f637-447c-9270-dc814b3f1e4e")
        private static SmDependency OwnedAttributeDep = null;

        @objid ("6f19235f-face-4673-a91c-2f816396068d")
        private static SmDependency OwnedNaryEndDep = null;

        @objid ("61f99f1b-19ce-4138-b068-0a28e6200fc7")
        private static SmDependency ConveyerDep = null;

        @objid ("6edb7b30-9c4e-43ff-a5ec-379f57411375")
        private static SmDependency SubstitutingSubstitutionDep = null;

        @objid ("263eea2a-17f8-4551-b6ad-6a46f688896d")
        private static SmDependency TargetingEndDep = null;

        @objid ("eca3e6f0-58bf-4636-afaa-cba26fdf031a")
        private static SmDependency OwnedEndDep = null;

        @objid ("d6d5324e-3201-4394-9c94-63670cb93e07")
        private static SmDependency BpmnRepresentsDep = null;

        @objid ("241e209c-d82c-4616-a68a-2e60a7f31569")
        private static SmDependency ThrowingDep = null;

        @objid ("32e58d46-f732-4ea8-9971-4f439998b475")
        private static SmDependency InternalStructureDep = null;

        @objid ("9962f382-3689-43cf-83f0-15c04f940008")
        private static SmDependency RealizedComponentDep = null;

        @objid ("338779d6-2290-400a-b173-62a182baaedd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassifierData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("edeb143d-8101-4b73-9c44-b931d924fb4f")
        public static SmDependency OwnedOperationDep() {
            if (OwnedOperationDep == null) {
            	OwnedOperationDep = classof().getDependencyDef("OwnedOperation");
            }
            return OwnedOperationDep;
        }

        @objid ("d3aabd73-a439-4fd3-99ff-6284e200fa2a")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("fcbfe983-5d95-4a40-aa37-556055384cf2")
        public static SmDependency SubstituedDep() {
            if (SubstituedDep == null) {
            	SubstituedDep = classof().getDependencyDef("Substitued");
            }
            return SubstituedDep;
        }

        @objid ("b5c24e8f-2121-44fc-acc8-441d6956a338")
        public static SmDependency OwnedAttributeDep() {
            if (OwnedAttributeDep == null) {
            	OwnedAttributeDep = classof().getDependencyDef("OwnedAttribute");
            }
            return OwnedAttributeDep;
        }

        @objid ("3499f2c4-1016-4b63-9a69-f36d70af2847")
        public static SmDependency OwnedNaryEndDep() {
            if (OwnedNaryEndDep == null) {
            	OwnedNaryEndDep = classof().getDependencyDef("OwnedNaryEnd");
            }
            return OwnedNaryEndDep;
        }

        @objid ("987f7c1f-766a-4cd3-a0ef-448a40e17416")
        public static SmDependency ConveyerDep() {
            if (ConveyerDep == null) {
            	ConveyerDep = classof().getDependencyDef("Conveyer");
            }
            return ConveyerDep;
        }

        @objid ("ff994a8f-e5f7-4381-94be-8b2e7354e7e0")
        public static SmDependency SubstitutingSubstitutionDep() {
            if (SubstitutingSubstitutionDep == null) {
            	SubstitutingSubstitutionDep = classof().getDependencyDef("SubstitutingSubstitution");
            }
            return SubstitutingSubstitutionDep;
        }

        @objid ("852a0343-fcb6-42a0-86dc-ba0b75c24594")
        public static SmDependency TargetingEndDep() {
            if (TargetingEndDep == null) {
            	TargetingEndDep = classof().getDependencyDef("TargetingEnd");
            }
            return TargetingEndDep;
        }

        @objid ("68eafecd-6e3c-4e0a-a720-6c99f7d5a33f")
        public static SmDependency OwnedEndDep() {
            if (OwnedEndDep == null) {
            	OwnedEndDep = classof().getDependencyDef("OwnedEnd");
            }
            return OwnedEndDep;
        }

        @objid ("8e6c3869-6812-4398-b93a-d7056f7ddd65")
        public static SmDependency BpmnRepresentsDep() {
            if (BpmnRepresentsDep == null) {
            	BpmnRepresentsDep = classof().getDependencyDef("BpmnRepresents");
            }
            return BpmnRepresentsDep;
        }

        @objid ("6db1d0a7-12ca-4816-be2a-5d21bdd2b53b")
        public static SmDependency ThrowingDep() {
            if (ThrowingDep == null) {
            	ThrowingDep = classof().getDependencyDef("Throwing");
            }
            return ThrowingDep;
        }

        @objid ("26e02e32-b680-4f21-9068-7e0ad53ad692")
        public static SmDependency InternalStructureDep() {
            if (InternalStructureDep == null) {
            	InternalStructureDep = classof().getDependencyDef("InternalStructure");
            }
            return InternalStructureDep;
        }

        @objid ("224be8e5-b5af-448a-9fc5-787f03722990")
        public static SmDependency RealizedComponentDep() {
            if (RealizedComponentDep == null) {
            	RealizedComponentDep = classof().getDependencyDef("RealizedComponent");
            }
            return RealizedComponentDep;
        }

        @objid ("004a28ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("82aac9c9-63f4-4c89-985f-81483c9620e1")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("9f43d646-c01c-49d0-9f97-3b768b531c3d")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004a8e18-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InternalStructureSmDependency extends SmMultipleDependency {
            @objid ("da39da9e-b929-4ab9-b745-a731a0f7182e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mInternalStructure != null)? ((ClassifierData)data).mInternalStructure:SmMultipleDependency.EMPTY;
            }

            @objid ("53feecc1-ff79-4c69-b7fd-c2fede207d3d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mInternalStructure = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mInternalStructure;
            }

            @objid ("3139cbbc-f398-4895-a46d-bff415d96468")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.InternalOwnerDep();
            }

        }

        @objid ("004af39e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ThrowingSmDependency extends SmMultipleDependency {
            @objid ("c4c26c8b-b050-476b-8905-73f929c3f005")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mThrowing != null)? ((ClassifierData)data).mThrowing:SmMultipleDependency.EMPTY;
            }

            @objid ("e0b4d042-04e3-4c17-9286-ddcb995b950e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mThrowing = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mThrowing;
            }

            @objid ("85070fd1-0d2b-40af-ab31-ba11d148cb93")
            @Override
            public SmDependency getSymetric() {
                return RaisedExceptionData.Metadata.ThrownTypeDep();
            }

        }

        @objid ("004b597e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubstituedSmDependency extends SmMultipleDependency {
            @objid ("5e530d8e-ad68-4e42-83f9-a9e87b53778f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mSubstitued != null)? ((ClassifierData)data).mSubstitued:SmMultipleDependency.EMPTY;
            }

            @objid ("15ef3f9e-783a-4caf-9d6a-a3932131092e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mSubstitued = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mSubstitued;
            }

            @objid ("d8cd4ae8-acd3-40e9-9086-978ee5d6a13b")
            @Override
            public SmDependency getSymetric() {
                return SubstitutionData.Metadata.SubstitutingClassifierDep();
            }

        }

        @objid ("004bbeaa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubstitutingSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("8b887560-b584-43e0-9c2a-00c12bd104ad")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mSubstitutingSubstitution != null)? ((ClassifierData)data).mSubstitutingSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("e2b97e32-d079-4e2b-ad14-df7b35ea72f3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mSubstitutingSubstitution = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mSubstitutingSubstitution;
            }

            @objid ("63233a71-ba8c-4308-a2f8-f7d8de8ae84c")
            @Override
            public SmDependency getSymetric() {
                return SubstitutionData.Metadata.ContractDep();
            }

        }

        @objid ("004c2278-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("c310f299-f26b-4bd6-85ec-b4e47163adf8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mRepresentation != null)? ((ClassifierData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("d8b10042-7ac6-4cc4-bcc7-a526dddc12d1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mRepresentation;
            }

            @objid ("88cc5592-46ba-4260-8fa1-79d77f686c0a")
            @Override
            public SmDependency getSymetric() {
                return InformationItemData.Metadata.RepresentedDep();
            }

        }

        @objid ("004c86dc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConveyerSmDependency extends SmMultipleDependency {
            @objid ("af51e52d-8b16-44f6-9a0f-bcb9ad8878b6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mConveyer != null)? ((ClassifierData)data).mConveyer:SmMultipleDependency.EMPTY;
            }

            @objid ("50705738-46ac-4ab1-a222-b54e1dfe1d06")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mConveyer = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mConveyer;
            }

            @objid ("dbb99cb2-82b1-4ad0-b61f-41de866349a6")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.ConveyedDep();
            }

        }

        @objid ("004cec08-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentsSmDependency extends SmMultipleDependency {
            @objid ("d183362a-3fee-4b07-8004-1b80a7e1da6c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mBpmnRepresents != null)? ((ClassifierData)data).mBpmnRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("9f14569d-dbb8-48e5-8cda-0719f5779b28")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mBpmnRepresents = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mBpmnRepresents;
            }

            @objid ("1baace1b-f57f-45ac-b3c5-2948cf721399")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.TypeDep();
            }

        }

        @objid ("004d51b6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedOperationSmDependency extends SmMultipleDependency {
            @objid ("dc268b46-e85c-42ab-bbec-457bbcf8caf2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedOperation != null)? ((ClassifierData)data).mOwnedOperation:SmMultipleDependency.EMPTY;
            }

            @objid ("9669b392-0f4c-4066-8fc7-e5ddd4a265ac")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedOperation = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedOperation;
            }

            @objid ("d98508fa-16d1-46ba-bec1-22682f426f6b")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnerDep();
            }

        }

        @objid ("004db890-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedEndSmDependency extends SmMultipleDependency {
            @objid ("63659269-0d7f-435a-ad0c-9f83d3b9eb8a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedEnd != null)? ((ClassifierData)data).mOwnedEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("07e69857-3208-4ec1-acae-6987a209c142")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedEnd;
            }

            @objid ("7fb17deb-877c-49cd-9c74-396d82667590")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.SourceDep();
            }

        }

        @objid ("004e1fb0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedAttributeSmDependency extends SmMultipleDependency {
            @objid ("2523cf1c-325b-4d05-9251-fd3940cf7e41")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedAttribute != null)? ((ClassifierData)data).mOwnedAttribute:SmMultipleDependency.EMPTY;
            }

            @objid ("15904de6-19f0-4781-b48a-734f8f3085b8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedAttribute = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedAttribute;
            }

            @objid ("5ae1a934-f3da-438c-8b5c-98a86fdc0435")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.OwnerDep();
            }

        }

        @objid ("004e87f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedNaryEndSmDependency extends SmMultipleDependency {
            @objid ("e983ff1d-83d7-46c7-96f5-06e89849c530")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedNaryEnd != null)? ((ClassifierData)data).mOwnedNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("42b41a6d-3989-4639-8c15-1c82d1db53c3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedNaryEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedNaryEnd;
            }

            @objid ("c99fc51a-2e77-4a3d-9eb0-62ecdfe89cb0")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationEndData.Metadata.OwnerDep();
            }

        }

        @objid ("004ef0c0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetingEndSmDependency extends SmMultipleDependency {
            @objid ("b076d7af-e9c0-4fe0-8a8f-332fe1347ad5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mTargetingEnd != null)? ((ClassifierData)data).mTargetingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("55a94c11-6170-4adb-b5bd-2a511db77d9e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mTargetingEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mTargetingEnd;
            }

            @objid ("b3ee7aee-f25d-4e91-b45f-e128922a4f1f")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.TargetDep();
            }

        }

        @objid ("00bb462d-f4d4-4c21-aa02-c96dbea0ecd5")
        public static class RealizedComponentSmDependency extends SmMultipleDependency {
            @objid ("40637de4-3404-4e5b-93f5-07f3a7e46698")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mRealizedComponent != null)? ((ClassifierData)data).mRealizedComponent:SmMultipleDependency.EMPTY;
            }

            @objid ("fba516ff-e62a-4b47-bca2-5077e8ac5460")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mRealizedComponent = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mRealizedComponent;
            }

            @objid ("5f2b1243-d4cb-4023-89eb-832f95e36221")
            @Override
            public SmDependency getSymetric() {
                return ComponentRealizationData.Metadata.RealizingClassifierDep();
            }

        }

    }

}
