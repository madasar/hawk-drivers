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
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnInterfaceData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.data.mda.ModuleParameterData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ExceptionHandlerData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.uml.statik.GeneralClassImpl;
import org.modelio.metamodel.uml.statik.GeneralClass;
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

@objid ("000c3550-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=GeneralClass.class, factory=GeneralClassData.Metadata.ObjectFactory.class)
public abstract class GeneralClassData extends ClassifierData {
    @objid ("7732b4c3-e4d3-4a4e-8338-a6c65bdfb80e")
    @SmaMetaAttribute(metaName="IsElementary", type=Boolean.class, smAttributeClass=Metadata.IsElementarySmAttribute.class)
     Object mIsElementary = false;

    @objid ("6f54de1c-94b3-4648-81dc-2f1ae9e5427d")
    @SmaMetaAssociation(metaName="BpmnInterfaceRefs", typeDataClass=BpmnInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnInterfaceRefsSmDependency.class)
     List<SmObjectImpl> mBpmnInterfaceRefs = null;

    @objid ("7bf6de77-f392-45f6-8b41-704e42032105")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=ParameterData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurence = null;

    @objid ("a8a39c70-bf34-4809-a7a9-28247fb67ba2")
    @SmaMetaAssociation(metaName="ExceptionInput", typeDataClass=ExceptionHandlerData.class, min=1, max=1, smAssociationClass=Metadata.ExceptionInputSmDependency.class)
     SmObjectImpl mExceptionInput;

    @objid ("06d8f03e-dcc7-41ef-90c3-d9cc9b226e3f")
    @SmaMetaAssociation(metaName="Object", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.ObjectSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mObject = null;

    @objid ("a17878c6-3e2f-4bde-971f-c6a2c8971405")
    @SmaMetaAssociation(metaName="BpmnMessageRefs", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnMessageRefsSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mBpmnMessageRefs = null;

    @objid ("05971434-4536-4055-b029-67e4b5cf5de5")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("0a16df66-c81e-4db4-8776-dccd3f7f89c8")
    @SmaMetaAssociation(metaName="BpmnItemDefinitionRefs", typeDataClass=BpmnItemDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnItemDefinitionRefsSmDependency.class)
     List<SmObjectImpl> mBpmnItemDefinitionRefs = null;

    @objid ("8586f19f-1aa2-4f9d-a53f-cfdb03574058")
    @SmaMetaAssociation(metaName="OccurenceObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceObjectNodeSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurenceObjectNode = null;

    @objid ("c2c98f47-eade-40ad-81df-69ad374e8f5b")
    @SmaMetaAssociation(metaName="BpmnItemAwareRefs", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnItemAwareRefsSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mBpmnItemAwareRefs = null;

    @objid ("957eccf9-16a5-49ca-929f-0018435bc306")
    @SmaMetaAssociation(metaName="OccurenceConfigParam", typeDataClass=ModuleParameterData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceConfigParamSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurenceConfigParam = null;

    @objid ("4215e227-cc31-469a-b73e-2bd2468d9fc7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00598ce2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ecb6fa1b-6f12-45e7-a4e2-51f662356f2e")
        private static SmClass smClass = null;

        @objid ("10ff0896-841b-487e-ba14-2ef329f3caa6")
        private static SmAttribute IsElementaryAtt = null;

        @objid ("917e5f62-94a6-4db6-8324-cc1aaa54a48c")
        private static SmDependency BpmnInterfaceRefsDep = null;

        @objid ("2ff2c810-82cf-4db6-b04c-a23b650d166e")
        private static SmDependency OccurenceDep = null;

        @objid ("efb26c83-f9ea-42d1-9c88-f3005e0f5184")
        private static SmDependency ExceptionInputDep = null;

        @objid ("025b296f-f44c-4743-acec-bdb4c6240768")
        private static SmDependency ObjectDep = null;

        @objid ("b1716182-9dbf-47d7-ba22-24fcae8894e3")
        private static SmDependency BpmnMessageRefsDep = null;

        @objid ("12a87328-8050-44af-973f-0f8615335072")
        private static SmDependency SRepresentationDep = null;

        @objid ("ea2d3f95-e371-4135-ac30-155dae0284e3")
        private static SmDependency BpmnItemDefinitionRefsDep = null;

        @objid ("be6803f7-45c7-4f94-8575-8a3034a5fe82")
        private static SmDependency OccurenceObjectNodeDep = null;

        @objid ("2eab87cd-dbba-4dab-a3f6-b758a277db47")
        private static SmDependency BpmnItemAwareRefsDep = null;

        @objid ("d485dcd1-d03a-4aff-9697-c9e6c9fa2ccd")
        private static SmDependency OccurenceConfigParamDep = null;

        @objid ("93bd7d93-d2cc-4ebd-8023-285fea67cb24")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralClassData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("14d82303-ef01-420e-8925-b00d930db5ba")
        public static SmAttribute IsElementaryAtt() {
            if (IsElementaryAtt == null) {
            	IsElementaryAtt = classof().getAttributeDef("IsElementary");
            }
            return IsElementaryAtt;
        }

        @objid ("1e7ed5d8-2fad-4c5d-adab-2dd07967d5fb")
        public static SmDependency BpmnInterfaceRefsDep() {
            if (BpmnInterfaceRefsDep == null) {
            	BpmnInterfaceRefsDep = classof().getDependencyDef("BpmnInterfaceRefs");
            }
            return BpmnInterfaceRefsDep;
        }

        @objid ("a842cd1a-2bfc-49e2-b60e-c4ef4cac3336")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("f9608474-16a3-4cf1-9989-83b9db333553")
        public static SmDependency ExceptionInputDep() {
            if (ExceptionInputDep == null) {
            	ExceptionInputDep = classof().getDependencyDef("ExceptionInput");
            }
            return ExceptionInputDep;
        }

        @objid ("829f6f7a-12f3-4b55-af7b-d254611c932b")
        public static SmDependency ObjectDep() {
            if (ObjectDep == null) {
            	ObjectDep = classof().getDependencyDef("Object");
            }
            return ObjectDep;
        }

        @objid ("7ee4d59a-5349-432f-a093-32c36f673b82")
        public static SmDependency BpmnMessageRefsDep() {
            if (BpmnMessageRefsDep == null) {
            	BpmnMessageRefsDep = classof().getDependencyDef("BpmnMessageRefs");
            }
            return BpmnMessageRefsDep;
        }

        @objid ("a5546214-3527-411f-926d-3d4c63119e12")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("ef8df5ad-74ff-4c56-812f-b42eb5e8ad60")
        public static SmDependency BpmnItemDefinitionRefsDep() {
            if (BpmnItemDefinitionRefsDep == null) {
            	BpmnItemDefinitionRefsDep = classof().getDependencyDef("BpmnItemDefinitionRefs");
            }
            return BpmnItemDefinitionRefsDep;
        }

        @objid ("520f9294-e248-4db6-babf-b058cd311da7")
        public static SmDependency OccurenceObjectNodeDep() {
            if (OccurenceObjectNodeDep == null) {
            	OccurenceObjectNodeDep = classof().getDependencyDef("OccurenceObjectNode");
            }
            return OccurenceObjectNodeDep;
        }

        @objid ("da601c14-cc91-44c4-84ae-968c3e9e8c04")
        public static SmDependency BpmnItemAwareRefsDep() {
            if (BpmnItemAwareRefsDep == null) {
            	BpmnItemAwareRefsDep = classof().getDependencyDef("BpmnItemAwareRefs");
            }
            return BpmnItemAwareRefsDep;
        }

        @objid ("1748827c-6aac-47b7-9e48-3d24b23f57eb")
        public static SmDependency OccurenceConfigParamDep() {
            if (OccurenceConfigParamDep == null) {
            	OccurenceConfigParamDep = classof().getDependencyDef("OccurenceConfigParam");
            }
            return OccurenceConfigParamDep;
        }

        @objid ("4f479920-8529-4341-aec8-7bbb97ed253e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3fb0c183-b811-4494-ae7f-8f420af024ff")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("e096d6d9-b30a-414e-a7ca-dc22241a6c29")
        public static SmDependency getBpmnItemAwareRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnItemAwareRefsDep;
        }

        @objid ("6ade51ea-b6f7-4064-b176-f20f243b0203")
        public static SmDependency getBpmnItemDefinitionRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnItemDefinitionRefsDep;
        }

        @objid ("1526d90e-2f6a-439d-9b95-680d9195decf")
        public static SmDependency getObjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ObjectDep;
        }

        @objid ("8159f511-6e18-415d-8279-1b226c0b6cc8")
        public static SmDependency getBpmnMessageRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnMessageRefsDep;
        }

        @objid ("cd8a9252-20f3-4d93-be03-663e9374b3c9")
        public static SmAttribute getIsElementaryAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsElementaryAtt;
        }

        @objid ("61c06c18-433a-4202-9c70-95b81ef37b24")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("e64707d9-c330-434d-95c8-0b0aba387352")
        public static SmDependency getBpmnInterfaceRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnInterfaceRefsDep;
        }

        @objid ("230c104c-ec8e-4437-a3b3-2e4228581645")
        public static SmDependency getOccurenceObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceObjectNodeDep;
        }

        @objid ("ddf96473-6a2b-4e24-b300-a4a06320c2d1")
        public static SmDependency getExceptionInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionInputDep;
        }

        @objid ("37f7f213-de75-41e9-a949-c736b68f0d21")
        public static SmDependency getOccurenceConfigParamDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceConfigParamDep;
        }

        @objid ("0059cd56-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e95deb81-cad4-487e-b985-702c28eb0167")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("e9116d9a-5333-4b29-889d-e05de333c51b")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("005a2f26-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsElementarySmAttribute extends SmAttribute {
            @objid ("4743c4b2-5112-42dd-95e2-f05a923c5109")
            public Object getValue(ISmObjectData data) {
                return ((GeneralClassData) data).mIsElementary;
            }

            @objid ("1d34a511-1f2a-4bf5-a3e6-c15f6bcd143e")
            public void setValue(ISmObjectData data, Object value) {
                ((GeneralClassData) data).mIsElementary = value;
            }

        }

        @objid ("005a98ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("cd51de72-b534-4b87-a73b-598fb31038a1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurence != null)? ((GeneralClassData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("ec0c1725-4bc2-47b2-a659-8f5ee45df73e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurence;
            }

            @objid ("bef16caf-6b97-431a-b0dd-2268e2ccded0")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.TypeDep();
            }

        }

        @objid ("005afb22-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectSmDependency extends SmMultipleDependency {
            @objid ("6e27b75b-4c03-466d-b0c2-f20b09ad5f26")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mObject != null)? ((GeneralClassData)data).mObject:SmMultipleDependency.EMPTY;
            }

            @objid ("f339b3d8-e971-4bfc-93ff-143a7d8228cf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mObject = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mObject;
            }

            @objid ("774ab727-4159-4fd5-83f4-d339e513e3d9")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.TypeDep();
            }

        }

        @objid ("005b5d9c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("1c35e229-69b3-497b-ab06-a70a4b85dec1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mSRepresentation != null)? ((GeneralClassData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("377b5440-9694-44ed-89b7-232132442045")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mSRepresentation;
            }

            @objid ("de672210-38db-4059-b3b9-f4e45ce36a3a")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.BaseDep();
            }

        }

        @objid ("005bc246-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("c1f94cf7-4cad-46f3-94a5-a1c233046956")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurenceObjectNode != null)? ((GeneralClassData)data).mOccurenceObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("9ed8de00-2b27-4986-8c69-6b661aad3504")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurenceObjectNode = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurenceObjectNode;
            }

            @objid ("6d3b4d36-0d1d-4768-b9a9-dd51d5576a49")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.TypeDep();
            }

        }

        @objid ("005c2678-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceConfigParamSmDependency extends SmMultipleDependency {
            @objid ("696040c9-d61c-44c2-8adf-dcdd7a911d7a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurenceConfigParam != null)? ((GeneralClassData)data).mOccurenceConfigParam:SmMultipleDependency.EMPTY;
            }

            @objid ("5e909fb9-275d-418f-aa4b-6f43a3822af7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurenceConfigParam = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurenceConfigParam;
            }

            @objid ("a2c35844-eb53-4d4a-9b70-b2fb755b9f3a")
            @Override
            public SmDependency getSymetric() {
                return ModuleParameterData.Metadata.TypeDep();
            }

        }

        @objid ("005c8adc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExceptionInputSmDependency extends SmSingleDependency {
            @objid ("09d09259-0902-4b07-9df7-c87dd316128c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralClassData) data).mExceptionInput;
            }

            @objid ("53e3bffb-fe0d-499f-98ef-c64bcfd0cb05")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralClassData) data).mExceptionInput = value;
            }

            @objid ("d7734d3a-bd94-49c6-8264-1a8fbff08212")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ExceptionTypeDep();
            }

        }

        @objid ("005d0296-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnItemDefinitionRefsSmDependency extends SmMultipleDependency {
            @objid ("c52f9edf-b33a-49bb-8862-61fa5d15ac5b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnItemDefinitionRefs != null)? ((GeneralClassData)data).mBpmnItemDefinitionRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("3efb08ae-7d99-4bce-8c26-8b951104264b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnItemDefinitionRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnItemDefinitionRefs;
            }

            @objid ("992d704f-8a30-4b5a-94b7-8e9a3c89c59d")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.StructureRefDep();
            }

        }

        @objid ("005d67fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnInterfaceRefsSmDependency extends SmMultipleDependency {
            @objid ("1a3f508b-92ba-4b4a-b2e6-b6c6f78e2dc6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnInterfaceRefs != null)? ((GeneralClassData)data).mBpmnInterfaceRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("810589da-7b87-4031-a699-07c25a263d39")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnInterfaceRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnInterfaceRefs;
            }

            @objid ("6b8d6955-2602-4581-b072-ce29698673d1")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.ImplementationRefDep();
            }

        }

        @objid ("005dcd84-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnItemAwareRefsSmDependency extends SmMultipleDependency {
            @objid ("4c9b3669-4ac6-4387-aae3-c6d356025366")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnItemAwareRefs != null)? ((GeneralClassData)data).mBpmnItemAwareRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("c406dbb8-2cbf-47aa-852c-4666fed02ac6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnItemAwareRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnItemAwareRefs;
            }

            @objid ("7ba9ab8e-28df-4cc2-b4c9-8aecf7f03eb8")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.TypeDep();
            }

        }

        @objid ("005e360c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnMessageRefsSmDependency extends SmMultipleDependency {
            @objid ("cf830764-d1ab-420c-894e-acdcaf8dba63")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnMessageRefs != null)? ((GeneralClassData)data).mBpmnMessageRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("d83a0735-8350-4808-8611-a5aeb88fa89d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnMessageRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnMessageRefs;
            }

            @objid ("6ab9754d-33c5-43d0-af02-39614f27d4de")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.TypeDep();
            }

        }

    }

}
