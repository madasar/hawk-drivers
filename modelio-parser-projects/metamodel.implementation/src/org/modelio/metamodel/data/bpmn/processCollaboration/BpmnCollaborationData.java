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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageFlowData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnArtifactData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnCollaborationImpl;
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

@objid ("00742fca-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCollaboration.class, factory=BpmnCollaborationData.Metadata.ObjectFactory.class)
public class BpmnCollaborationData extends BpmnRootElementData {
    @objid ("4dc64e18-42b7-4a91-ae68-2bd47c1c3e19")
    @SmaMetaAttribute(metaName="IsClosed", type=Boolean.class, smAttributeClass=Metadata.IsClosedSmAttribute.class)
     Object mIsClosed = false;

    @objid ("86c47433-d876-420c-9c68-1b94eef5da51")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("c43fdd26-13c7-46d7-8445-badc12d6ffe3")
    @SmaMetaAssociation(metaName="MessageFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.MessageFlowSmDependency.class, component = true)
     List<SmObjectImpl> mMessageFlow = null;

    @objid ("a6f687a4-1611-435f-9179-1155d37de155")
    @SmaMetaAssociation(metaName="Participants", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantsSmDependency.class, component = true)
     List<SmObjectImpl> mParticipants = null;

    @objid ("1ed2bb63-7ab9-4193-bc94-0c293efd0229")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ef3d2-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b6ed6c39-a576-4f2c-b2a5-88ff52eb9388")
        private static SmClass smClass = null;

        @objid ("c585dc35-dae8-4f2c-bc70-5835e7643910")
        private static SmAttribute IsClosedAtt = null;

        @objid ("a61b2c2e-5fcd-4eae-982f-301d3031b5d6")
        private static SmDependency ArtifactDep = null;

        @objid ("1cc8de23-e405-4bdf-832a-498130f7f7b9")
        private static SmDependency MessageFlowDep = null;

        @objid ("1efdd18d-5d8b-43a1-8ffd-1ad5990feeb1")
        private static SmDependency ParticipantsDep = null;

        @objid ("ecb1ec32-8968-43f0-98fb-5c247aef2b01")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCollaborationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b238f596-97c6-48d9-b81b-d884fc1d01e1")
        public static SmAttribute IsClosedAtt() {
            if (IsClosedAtt == null) {
            	IsClosedAtt = classof().getAttributeDef("IsClosed");
            }
            return IsClosedAtt;
        }

        @objid ("d2bcebd0-25fa-4dab-8b31-a9c900768b08")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("b691d212-ec80-4d33-b587-f4c705c1cf89")
        public static SmDependency MessageFlowDep() {
            if (MessageFlowDep == null) {
            	MessageFlowDep = classof().getDependencyDef("MessageFlow");
            }
            return MessageFlowDep;
        }

        @objid ("4fd3af4e-849a-4643-a017-27770c7b8c2f")
        public static SmDependency ParticipantsDep() {
            if (ParticipantsDep == null) {
            	ParticipantsDep = classof().getDependencyDef("Participants");
            }
            return ParticipantsDep;
        }

        @objid ("bab44dc2-c0df-4555-b6a2-605cf56e7f64")
        public static SmDependency getParticipantsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantsDep;
        }

        @objid ("1efb457f-0c82-4709-bd68-6fc83a6f8264")
        public static SmAttribute getIsClosedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClosedAtt;
        }

        @objid ("1f2a7cb3-4cb7-441c-9898-2c3cf7a0eb99")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b52e2b91-1f9e-4ee4-b324-d1e61f63ebc6")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("397e75ea-5513-41f4-a864-81e632984d1d")
        public static SmDependency getMessageFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageFlowDep;
        }

        @objid ("003f3f9a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6baf6209-e796-4bb8-8b92-8466da150eae")
            public ISmObjectData createData() {
                return new BpmnCollaborationData();
            }

            @objid ("216a5e34-6c1a-4b63-908a-28e4169973da")
            public SmObjectImpl createImpl() {
                return new BpmnCollaborationImpl();
            }

        }

        @objid ("003facf0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsClosedSmAttribute extends SmAttribute {
            @objid ("63fae7aa-01cf-4bbf-a726-02206157f2c6")
            public Object getValue(ISmObjectData data) {
                return ((BpmnCollaborationData) data).mIsClosed;
            }

            @objid ("870d536a-46d7-4861-98ba-e4d34abe3f35")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnCollaborationData) data).mIsClosed = value;
            }

        }

        @objid ("00401bcc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MessageFlowSmDependency extends SmMultipleDependency {
            @objid ("2508ced3-0d6a-4baa-b8cb-88e8f9f61cb0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mMessageFlow != null)? ((BpmnCollaborationData)data).mMessageFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("0919e471-d0ba-4d26-8ab1-91521d8d5e5f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mMessageFlow = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mMessageFlow;
            }

            @objid ("80dea797-a495-4d70-a7fe-fd2cd43b7c4d")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.CollaborationDep();
            }

        }

        @objid ("00408c10-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("3a18a655-186f-4595-8b57-125b032b5592")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mArtifact != null)? ((BpmnCollaborationData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("16e653d3-4910-4cd2-8a69-b5307bcffd97")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mArtifact;
            }

            @objid ("17219e2f-394b-414e-81d7-cb4d9e2b3d1d")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.CollaborationDep();
            }

        }

        @objid ("0040fb46-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParticipantsSmDependency extends SmMultipleDependency {
            @objid ("c8620b74-8dd4-45ba-b872-a263afa24b62")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mParticipants != null)? ((BpmnCollaborationData)data).mParticipants:SmMultipleDependency.EMPTY;
            }

            @objid ("e553e28a-0c3a-4a13-8cf7-4c3bcbacf077")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mParticipants = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mParticipants;
            }

            @objid ("45d55110-1189-40fc-b8f9-348a226c9b5b")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.ContainerDep();
            }

        }

    }

}
