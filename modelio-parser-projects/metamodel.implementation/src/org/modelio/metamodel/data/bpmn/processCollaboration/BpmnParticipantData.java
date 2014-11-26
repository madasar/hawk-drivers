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
package org.modelio.metamodel.data.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnEndPointData;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnInterfaceData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnCollaborationData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnParticipantImpl;
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

@objid ("0075e3f6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnParticipant.class, factory=BpmnParticipantData.Metadata.ObjectFactory.class)
public class BpmnParticipantData extends BpmnBaseElementData {
    @objid ("2cd1786f-4da1-44a5-b2c8-67216099160e")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=Integer.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = 0;

    @objid ("ddf87de8-90e7-49da-a0be-fc54ee6b820a")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=Integer.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = 0;

    @objid ("d4649fa2-bb89-4bcc-9406-5f7d14761362")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class, partof = true)
     SmObjectImpl mProcess;

    @objid ("1a2a19d7-b6b2-4f01-9e72-b3cb01d9e5ca")
    @SmaMetaAssociation(metaName="Container", typeDataClass=BpmnCollaborationData.class, min=1, max=1, smAssociationClass=Metadata.ContainerSmDependency.class)
     SmObjectImpl mContainer;

    @objid ("5889e871-096b-4a33-ba88-1e480471eec4")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("cff9be99-e037-4a9d-beef-ac0d4801abbf")
    @SmaMetaAssociation(metaName="EndPointRefs", typeDataClass=BpmnEndPointData.class, min=0, max=-1, smAssociationClass=Metadata.EndPointRefsSmDependency.class, partof = true)
     List<SmObjectImpl> mEndPointRefs = null;

    @objid ("c8bc1bb7-5b4b-4c52-98bc-1064842240f5")
    @SmaMetaAssociation(metaName="InterfaceRefs", typeDataClass=BpmnInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.InterfaceRefsSmDependency.class, partof = true)
     List<SmObjectImpl> mInterfaceRefs = null;

    @objid ("973a3066-01b9-4b77-b2b0-b173413d69fc")
    @SmaMetaAssociation(metaName="PackageRef", typeDataClass=PackageData.class, min=0, max=1, smAssociationClass=Metadata.PackageRefSmDependency.class, partof = true)
     SmObjectImpl mPackageRef;

    @objid ("f8a9cb6e-5795-4dbb-999d-a4f04312b38b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001a41a4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2a4927b1-fb0c-4102-a75a-54273fd1ac8e")
        private static SmClass smClass = null;

        @objid ("edb28013-064d-40ab-94d2-b5dcb3199893")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("86d64c14-1267-43fc-a987-d940a0e32b8d")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("086a11f6-2a84-453b-841a-8cf7fb6a222f")
        private static SmDependency ProcessDep = null;

        @objid ("8075b861-819c-4838-9e55-0ac56db5f13a")
        private static SmDependency ContainerDep = null;

        @objid ("52fed5e0-29ec-4255-8de9-ceac5c5b033a")
        private static SmDependency TypeDep = null;

        @objid ("87188682-6d80-41bf-8c14-14f5cadea866")
        private static SmDependency EndPointRefsDep = null;

        @objid ("1f9d828e-11cd-45b4-85df-2371ffe94e5f")
        private static SmDependency InterfaceRefsDep = null;

        @objid ("779e9cb5-ba0f-451a-acb9-994c84c4e3ad")
        private static SmDependency PackageRefDep = null;

        @objid ("eb8139ef-8c92-4415-b814-cf926f9d10fe")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnParticipantData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cff4cb28-8a9f-4fbd-aa56-1d7c9f2a7ff9")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("d34bfd5c-6a4b-409c-893d-a0bf11c3b1e7")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("ab7829a1-b14d-4cb7-a751-16a83469c1ac")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("fda802aa-b733-4b68-b728-df1b55daad5c")
        public static SmDependency ContainerDep() {
            if (ContainerDep == null) {
            	ContainerDep = classof().getDependencyDef("Container");
            }
            return ContainerDep;
        }

        @objid ("836ebe35-b865-4dee-9a30-3a52ed20e17c")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("6957c583-8a3c-4196-9c24-add64c4c65f0")
        public static SmDependency EndPointRefsDep() {
            if (EndPointRefsDep == null) {
            	EndPointRefsDep = classof().getDependencyDef("EndPointRefs");
            }
            return EndPointRefsDep;
        }

        @objid ("1756ac06-ce94-47b7-80b8-d7f07b56cffa")
        public static SmDependency InterfaceRefsDep() {
            if (InterfaceRefsDep == null) {
            	InterfaceRefsDep = classof().getDependencyDef("InterfaceRefs");
            }
            return InterfaceRefsDep;
        }

        @objid ("3e1f57b2-d55b-4732-8e2c-346b78317ca7")
        public static SmDependency PackageRefDep() {
            if (PackageRefDep == null) {
            	PackageRefDep = classof().getDependencyDef("PackageRef");
            }
            return PackageRefDep;
        }

        @objid ("f05bbf1f-8da8-4863-9979-525cef4e3bf4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a08d7135-617e-46f2-b4c3-53d046600f9b")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("81100dde-408f-415e-87f1-39f4f89a05dd")
        public static SmDependency getPackageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PackageRefDep;
        }

        @objid ("e303d62c-83e1-4bf6-b359-6fbb90d48a49")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("ac02fe09-a843-4153-abac-93aebc688534")
        public static SmDependency getInterfaceRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterfaceRefsDep;
        }

        @objid ("db10d8a9-35f9-4d72-83d1-fa2f9441135f")
        public static SmDependency getContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainerDep;
        }

        @objid ("855d093d-212f-4179-a7d8-533ed11b0acd")
        public static SmDependency getEndPointRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndPointRefsDep;
        }

        @objid ("fd365ac5-9155-4206-98b8-8008db5bf919")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("1f73fb92-0722-4670-8536-808dc3b58774")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("001a8286-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("081af597-5baf-4840-9c40-ae716d806c83")
            public ISmObjectData createData() {
                return new BpmnParticipantData();
            }

            @objid ("95f9bbfd-6d3d-4c05-8358-659d4bbb621b")
            public SmObjectImpl createImpl() {
                return new BpmnParticipantImpl();
            }

        }

        @objid ("001aee7e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("831ec230-4a23-497a-a92a-64531d8ecaf2")
            public Object getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mMultiplicityMin;
            }

            @objid ("e630c1f3-3422-4814-88ad-2bed3fbe1370")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnParticipantData) data).mMultiplicityMin = value;
            }

        }

        @objid ("001b50ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("0f296831-c88e-4044-bd24-e748878ea956")
            public Object getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mMultiplicityMax;
            }

            @objid ("f53e7f16-0202-4409-ad0a-4d3a15029298")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnParticipantData) data).mMultiplicityMax = value;
            }

        }

        @objid ("001bb598-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("018d2e22-74bd-414f-93d0-c9bcad058a6a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mType;
            }

            @objid ("c0033871-8907-4bc4-8045-d6374250dcc0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mType = value;
            }

            @objid ("b86a4720-b056-4af4-99cc-218eeae3d309")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.BpmnRepresentsDep();
            }

        }

        @objid ("001c2b9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PackageRefSmDependency extends SmSingleDependency {
            @objid ("acf11ba2-69cb-4c76-b775-8f4374c5f5a2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mPackageRef;
            }

            @objid ("c09b50ae-5edc-4986-aa26-205d2740b54d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mPackageRef = value;
            }

            @objid ("47c81917-9967-4b69-a14f-ddfc3d0a6281")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.BpmnRepresentsDep();
            }

        }

        @objid ("001ca1d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("b6204d4f-e9e1-4866-918d-6bd1a75cad38")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mProcess;
            }

            @objid ("541e462a-7436-4585-9a5f-267bed29a406")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mProcess = value;
            }

            @objid ("12273eff-f9eb-42d0-9535-76d978f6224c")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ParticipantDep();
            }

        }

        @objid ("001d18f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InterfaceRefsSmDependency extends SmMultipleDependency {
            @objid ("eaa716d0-1e02-429f-aa34-121246855afa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnParticipantData)data).mInterfaceRefs != null)? ((BpmnParticipantData)data).mInterfaceRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("a0685e7a-3843-4ab1-995e-b8f3c9fac6a2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnParticipantData) data).mInterfaceRefs = new ArrayList<>(initialCapacity);
                return ((BpmnParticipantData) data).mInterfaceRefs;
            }

            @objid ("ccf3c5a5-5b12-4ce4-86f9-41083955a1b9")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.ParticipantRefDep();
            }

        }

        @objid ("001d8170-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EndPointRefsSmDependency extends SmMultipleDependency {
            @objid ("b0158c86-b2f5-4b53-970e-8c5a1d0f9155")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnParticipantData)data).mEndPointRefs != null)? ((BpmnParticipantData)data).mEndPointRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("0dfe22eb-cb30-4e88-afe2-a74e078bb472")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnParticipantData) data).mEndPointRefs = new ArrayList<>(initialCapacity);
                return ((BpmnParticipantData) data).mEndPointRefs;
            }

            @objid ("8e9e55d5-c229-4c23-a6ca-2d518c6f1177")
            @Override
            public SmDependency getSymetric() {
                return BpmnEndPointData.Metadata.ParticipantRefsDep();
            }

        }

        @objid ("001de836-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ContainerSmDependency extends SmSingleDependency {
            @objid ("66501e0c-bce3-42b2-aacb-7135819b02b1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mContainer;
            }

            @objid ("033efe22-7223-4de5-ac82-34566fc901b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mContainer = value;
            }

            @objid ("ccffb1db-f324-44c1-a487-5f0e8af5d2ef")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.ParticipantsDep();
            }

        }

    }

}
