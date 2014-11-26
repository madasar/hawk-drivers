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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcessType;
import org.modelio.metamodel.bpmn.processCollaboration.OptionalBoolean;
import org.modelio.metamodel.data.bpmn.activities.BpmnCallActivityData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneSetData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnArtifactData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnProcessImpl;
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

@objid ("00768e50-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnProcess.class, factory=BpmnProcessData.Metadata.ObjectFactory.class)
public class BpmnProcessData extends BpmnRootElementData {
    @objid ("3fd8b78f-fdad-48f5-a384-1569f2cd3795")
    @SmaMetaAttribute(metaName="ProcessType", type=BpmnProcessType.class, smAttributeClass=Metadata.ProcessTypeSmAttribute.class)
     Object mProcessType = BpmnProcessType.NONEPROCESS;

    @objid ("34b64c79-b683-42f3-8e81-78daa6b8eb55")
    @SmaMetaAttribute(metaName="IsClosed", type=Boolean.class, smAttributeClass=Metadata.IsClosedSmAttribute.class)
     Object mIsClosed = false;

    @objid ("58b61a90-aaeb-4394-8918-49f7d4d2e343")
    @SmaMetaAttribute(metaName="IsExecutable", type=OptionalBoolean.class, smAttributeClass=Metadata.IsExecutableSmAttribute.class)
     Object mIsExecutable = OptionalBoolean.OUNDEFINED;

    @objid ("0314980f-c0ed-444b-8f3d-80533c774ac1")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("d0b72d53-a5c5-4386-8a5f-a6384afcd8ad")
    @SmaMetaAssociation(metaName="Supports", typeDataClass=BpmnProcessData.class, min=0, max=-1, smAssociationClass=Metadata.SupportsSmDependency.class, partof = true)
     List<SmObjectImpl> mSupports = null;

    @objid ("4bf8db3e-fdb0-415a-a398-08b4e7a2732c")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("0ba77178-253a-449e-8f5b-a34e63625f05")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSetSmDependency.class, component = true)
     List<SmObjectImpl> mLaneSet = null;

    @objid ("f4316a4b-831c-4c5f-aee8-760c4c86dead")
    @SmaMetaAssociation(metaName="Supported", typeDataClass=BpmnProcessData.class, min=0, max=-1, smAssociationClass=Metadata.SupportedSmDependency.class)
     List<SmObjectImpl> mSupported = null;

    @objid ("4b8ab835-4db3-4741-b887-f3e3682e3ed5")
    @SmaMetaAssociation(metaName="Participant", typeDataClass=BpmnParticipantData.class, min=0, max=1, smAssociationClass=Metadata.ParticipantSmDependency.class, partof = true)
     SmObjectImpl mParticipant;

    @objid ("3f6b0a1c-a9e2-434c-8cc8-11bb6048ded0")
    @SmaMetaAssociation(metaName="FlowElement", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementSmDependency.class, component = true)
     List<SmObjectImpl> mFlowElement = null;

    @objid ("aa808d25-2658-475d-b90c-8aad6f53d851")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceSmDependency.class, component = true)
     List<SmObjectImpl> mResource = null;

    @objid ("295d4c7a-dd46-4999-ac1d-a37ae754293a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0031a808-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b3932f4e-a830-4faa-9e73-c13c97d34ea1")
        private static SmClass smClass = null;

        @objid ("46802686-a0a5-4686-9f94-e11ddb07babb")
        private static SmAttribute ProcessTypeAtt = null;

        @objid ("79b90379-5a96-48de-a413-d367ebe79cfa")
        private static SmAttribute IsClosedAtt = null;

        @objid ("5f158a24-f6b4-4fb1-a388-8eef308df1bc")
        private static SmAttribute IsExecutableAtt = null;

        @objid ("cd343331-ec1e-4c19-bc08-9af5380d1d52")
        private static SmDependency CallerDep = null;

        @objid ("7972597d-e3b0-4a7e-bf80-851cba9053eb")
        private static SmDependency SupportsDep = null;

        @objid ("ea2feb19-1acf-4c32-aa39-c764f2f35e50")
        private static SmDependency ArtifactDep = null;

        @objid ("331b58ce-fe32-454a-9458-a9f3afb86dc8")
        private static SmDependency LaneSetDep = null;

        @objid ("4cd815a8-ea7e-4ea5-b860-3e9d52a07679")
        private static SmDependency SupportedDep = null;

        @objid ("c9c4e35b-c254-4965-8b39-d2478d0bf270")
        private static SmDependency ParticipantDep = null;

        @objid ("a9866cbd-129c-4336-86b8-0e1882e69ffc")
        private static SmDependency FlowElementDep = null;

        @objid ("a6db629c-f4a1-4357-a0aa-98856cd9b743")
        private static SmDependency ResourceDep = null;

        @objid ("50bc52ef-c358-4a0b-a98c-82193adf786b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3a71c29c-6b06-478a-887e-75cf3310c54c")
        public static SmAttribute ProcessTypeAtt() {
            if (ProcessTypeAtt == null) {
            	ProcessTypeAtt = classof().getAttributeDef("ProcessType");
            }
            return ProcessTypeAtt;
        }

        @objid ("9a906fcd-8205-4167-9c31-ecdfeff7dbd4")
        public static SmAttribute IsClosedAtt() {
            if (IsClosedAtt == null) {
            	IsClosedAtt = classof().getAttributeDef("IsClosed");
            }
            return IsClosedAtt;
        }

        @objid ("a3c8c1f5-5cde-4c53-8ec5-cedde0040642")
        public static SmAttribute IsExecutableAtt() {
            if (IsExecutableAtt == null) {
            	IsExecutableAtt = classof().getAttributeDef("IsExecutable");
            }
            return IsExecutableAtt;
        }

        @objid ("d9220e3f-cdca-4fee-bcdf-095879437359")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("01e8e688-323e-464c-aab5-7a41aa511b63")
        public static SmDependency SupportsDep() {
            if (SupportsDep == null) {
            	SupportsDep = classof().getDependencyDef("Supports");
            }
            return SupportsDep;
        }

        @objid ("284755ac-6879-49bd-b0a8-855baa61c313")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("616bf96d-3060-4762-b7bb-4b7c6a92a60e")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("0cbf6109-18ae-4e52-9a46-df401ffb6950")
        public static SmDependency SupportedDep() {
            if (SupportedDep == null) {
            	SupportedDep = classof().getDependencyDef("Supported");
            }
            return SupportedDep;
        }

        @objid ("a90c7611-dfbf-44fb-9ad3-443994826cb0")
        public static SmDependency ParticipantDep() {
            if (ParticipantDep == null) {
            	ParticipantDep = classof().getDependencyDef("Participant");
            }
            return ParticipantDep;
        }

        @objid ("43b4b235-a3b4-4907-9a26-add14c491698")
        public static SmDependency FlowElementDep() {
            if (FlowElementDep == null) {
            	FlowElementDep = classof().getDependencyDef("FlowElement");
            }
            return FlowElementDep;
        }

        @objid ("08f940da-8baf-43e9-8cf3-f51c380d17d1")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("0bd18a83-6c4d-4374-8dfb-c1c80eefc40b")
        public static SmDependency getParticipantDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantDep;
        }

        @objid ("edd9f153-42a8-47fe-bca7-f23f292ca0e8")
        public static SmDependency getSupportedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SupportedDep;
        }

        @objid ("2395d145-75fa-4c39-8ea1-756f54c8704c")
        public static SmDependency getSupportsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SupportsDep;
        }

        @objid ("2ebf0237-656e-464c-890a-f6f8ade1c852")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("0c4571c4-710d-400d-8957-8e5eb745a604")
        public static SmDependency getFlowElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementDep;
        }

        @objid ("d24c0d75-85ae-4a23-b16e-b5bda5af1408")
        public static SmAttribute getIsExecutableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExecutableAtt;
        }

        @objid ("62fc64ac-8067-4da0-9e28-d45adae9c545")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("36362aed-2db5-471e-b82f-a40423e58d98")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("bf70d569-7129-42aa-8eff-98ccd4f7700b")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("5f1dd159-fc4e-4951-a25a-a2f5d80966d7")
        public static SmAttribute getIsClosedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClosedAtt;
        }

        @objid ("d1d7526d-e311-4c4f-b336-35077c3b5ce2")
        public static SmAttribute getProcessTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessTypeAtt;
        }

        @objid ("9e3f658b-6a55-4655-86f0-68bf1757d359")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("0031f3d0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0704af0f-c86a-40f7-8790-39883fb227d5")
            public ISmObjectData createData() {
                return new BpmnProcessData();
            }

            @objid ("bb7690c4-1576-4167-956f-9bfef1052c02")
            public SmObjectImpl createImpl() {
                return new BpmnProcessImpl();
            }

        }

        @objid ("0032648c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessTypeSmAttribute extends SmAttribute {
            @objid ("af48fead-fecc-47cb-8015-42d87cc80a19")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mProcessType;
            }

            @objid ("cc244a3f-a7f3-41dc-8206-ed6240ebe512")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mProcessType = value;
            }

        }

        @objid ("0032d55c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsClosedSmAttribute extends SmAttribute {
            @objid ("283836c8-f4ba-4830-b152-b2ea9a044409")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mIsClosed;
            }

            @objid ("df35efca-df41-4622-b282-06117b4a8301")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mIsClosed = value;
            }

        }

        @objid ("003344ec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExecutableSmAttribute extends SmAttribute {
            @objid ("3f80ea02-3e6e-452c-9e3f-c7c1a8164d02")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mIsExecutable;
            }

            @objid ("b29fe54d-b9ac-4af4-b0b1-052116b07129")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mIsExecutable = value;
            }

        }

        @objid ("0033b756-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SupportsSmDependency extends SmMultipleDependency {
            @objid ("ae3f8b9c-e66c-471a-9f16-bd25074737c8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mSupports != null)? ((BpmnProcessData)data).mSupports:SmMultipleDependency.EMPTY;
            }

            @objid ("f9e91dbe-6add-4c3f-8999-ab04fd9c8d23")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mSupports = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mSupports;
            }

            @objid ("a7a15738-a23e-401e-a0fe-0657d417ac88")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.SupportedDep();
            }

        }

        @objid ("003427f4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmMultipleDependency {
            @objid ("65db9822-357d-4c43-a66a-eb490345d0c2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mLaneSet != null)? ((BpmnProcessData)data).mLaneSet:SmMultipleDependency.EMPTY;
            }

            @objid ("c31fd0c4-db66-47d6-bfdc-0c958b86d2b6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mLaneSet = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mLaneSet;
            }

            @objid ("233989bb-2d94-4040-8154-743d76359cd5")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.ProcessDep();
            }

        }

        @objid ("0034981a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParticipantSmDependency extends SmSingleDependency {
            @objid ("15cf5f2a-b98a-4a1a-9a2b-f26820ae9d0f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mParticipant;
            }

            @objid ("88ba46c7-2ff0-4247-a1a8-cd31801497df")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnProcessData) data).mParticipant = value;
            }

            @objid ("835d1dae-65df-42bc-abe8-a81f0cf531c0")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.ProcessDep();
            }

        }

        @objid ("00351fe2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmMultipleDependency {
            @objid ("0bf3cf3d-5fe5-4b2e-9571-6ee034477d96")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mResource != null)? ((BpmnProcessData)data).mResource:SmMultipleDependency.EMPTY;
            }

            @objid ("8c81cae8-7137-4841-bd9d-af850788751f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mResource = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mResource;
            }

            @objid ("8c4cb603-24ce-4389-ae9d-9a576b49521b")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ProcessDep();
            }

        }

        @objid ("003590bc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("ec6d1070-d170-4f5b-b003-102650a56c06")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mArtifact != null)? ((BpmnProcessData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("faac9dbb-7a18-4a8f-9b0a-607de0e75661")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mArtifact;
            }

            @objid ("21d409bb-5943-4400-9f64-27d5a3619a36")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.ProcessDep();
            }

        }

        @objid ("0036038a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class FlowElementSmDependency extends SmMultipleDependency {
            @objid ("5d862e63-b60f-4abe-a12d-fa8c77121480")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mFlowElement != null)? ((BpmnProcessData)data).mFlowElement:SmMultipleDependency.EMPTY;
            }

            @objid ("d8ecba79-fedb-4012-91b3-3ea976b16e8f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mFlowElement = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mFlowElement;
            }

            @objid ("34ff49f5-6eba-47da-82a5-7da4d3b8984b")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.ContainerDep();
            }

        }

        @objid ("00367644-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SupportedSmDependency extends SmMultipleDependency {
            @objid ("ddbc68a9-0817-4eeb-a8f1-01338fdbbcdd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mSupported != null)? ((BpmnProcessData)data).mSupported:SmMultipleDependency.EMPTY;
            }

            @objid ("8e025ff1-7ca2-4372-9d71-12f2b2331eb5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mSupported = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mSupported;
            }

            @objid ("e022bcd2-b895-4241-b49f-345946f9d778")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.SupportsDep();
            }

        }

        @objid ("0036e962-c4c2-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("9fb66459-ef92-4e54-9e05-c5f2924c05d3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mCaller != null)? ((BpmnProcessData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("b5700755-2136-4fcd-a8d0-31cdef8cb87a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mCaller;
            }

            @objid ("e445ee62-ae63-47e7-82f7-e1601f4f3b02")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledProcessDep();
            }

        }

    }

}
