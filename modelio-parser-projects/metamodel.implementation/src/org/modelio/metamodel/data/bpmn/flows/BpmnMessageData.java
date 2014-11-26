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
package org.modelio.metamodel.data.bpmn.flows;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.data.bpmn.activities.BpmnReceiveTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnSendTaskData;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.bpmn.events.BpmnMessageEventDefinitionData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageFlowData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageImpl;
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

@objid ("007c30f8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnMessage.class, factory=BpmnMessageData.Metadata.ObjectFactory.class)
public class BpmnMessageData extends BpmnRootElementData {
    @objid ("30570503-65ff-4a44-a6d2-7629531a3b1b")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("0a95f172-de44-417b-a61d-e009fd20ec6f")
    @SmaMetaAssociation(metaName="OutputMessage", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.OutputMessageSmDependency.class)
     List<SmObjectImpl> mOutputMessage = null;

    @objid ("907aa53d-f988-4dde-8820-d32381815fdd")
    @SmaMetaAssociation(metaName="ItemRef", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ItemRefSmDependency.class, partof = true)
     SmObjectImpl mItemRef;

    @objid ("10f6f43a-546b-471f-ba66-9efc6cf68054")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("1266ac3f-8a01-42c6-b93c-7136c053cefb")
    @SmaMetaAssociation(metaName="EventDefinition", typeDataClass=BpmnMessageEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionSmDependency.class)
     List<SmObjectImpl> mEventDefinition = null;

    @objid ("420864b3-4466-4922-af35-daefa7496264")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("ce45f78f-1fb7-4cdd-88f2-5790aa67d160")
    @SmaMetaAssociation(metaName="InputMessage", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.InputMessageSmDependency.class)
     List<SmObjectImpl> mInputMessage = null;

    @objid ("1e1a1f8e-d75c-4a2a-ad4e-b2371b8ecaa2")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("3b66551a-c432-4465-b3e2-c10145024982")
    @SmaMetaAssociation(metaName="MessageFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.MessageFlowSmDependency.class)
     List<SmObjectImpl> mMessageFlow = null;

    @objid ("63fbec45-9123-4c4d-9050-7fc245ad0c9c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001e4ca4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("931c92bd-2935-411d-93e3-b141499df3a6")
        private static SmClass smClass = null;

        @objid ("7abdec78-939e-47d8-8539-b63b264eb3c4")
        private static SmDependency TypeDep = null;

        @objid ("01f6da5e-fb96-4ded-82bb-6f867dc0dd2f")
        private static SmDependency OutputMessageDep = null;

        @objid ("7a1617f9-4ecf-44b3-98e9-7b2953a2637b")
        private static SmDependency ItemRefDep = null;

        @objid ("46297385-023d-4620-bd10-1db752d8e016")
        private static SmDependency InStateDep = null;

        @objid ("fc3efe4e-a4a0-4a5d-bdf8-4d5f4a5dde0d")
        private static SmDependency EventDefinitionDep = null;

        @objid ("1f95eb98-86d1-43db-9d4f-30a0e0d3f313")
        private static SmDependency SenderDep = null;

        @objid ("b95b05a2-b852-4117-ab5f-60e25ae5cd93")
        private static SmDependency InputMessageDep = null;

        @objid ("2edbc7d4-f89e-4522-8109-57c75fa076fd")
        private static SmDependency ReceiverDep = null;

        @objid ("35d7d191-2c24-40d2-b369-9b781ab4a6cf")
        private static SmDependency MessageFlowDep = null;

        @objid ("06ab2b01-161a-402b-a15f-bafa0c2e9875")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("89f75256-f386-4122-997d-8e8356284969")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("bfe76ca6-9791-467c-b5fe-33f2714f7874")
        public static SmDependency OutputMessageDep() {
            if (OutputMessageDep == null) {
            	OutputMessageDep = classof().getDependencyDef("OutputMessage");
            }
            return OutputMessageDep;
        }

        @objid ("af3b9887-56fa-4e6a-bca1-94040ef0fa34")
        public static SmDependency ItemRefDep() {
            if (ItemRefDep == null) {
            	ItemRefDep = classof().getDependencyDef("ItemRef");
            }
            return ItemRefDep;
        }

        @objid ("ebb8744d-e7e4-464e-93e3-0246e083336a")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("3ac395fa-b154-4adc-9b0b-6e83272e3482")
        public static SmDependency EventDefinitionDep() {
            if (EventDefinitionDep == null) {
            	EventDefinitionDep = classof().getDependencyDef("EventDefinition");
            }
            return EventDefinitionDep;
        }

        @objid ("5d99bd9d-93ec-4f71-b0a8-2f833bb93d78")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("d236531c-1178-4d96-9f9d-18d6cd415caa")
        public static SmDependency InputMessageDep() {
            if (InputMessageDep == null) {
            	InputMessageDep = classof().getDependencyDef("InputMessage");
            }
            return InputMessageDep;
        }

        @objid ("43d19065-af38-41a4-a680-779b15e52211")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("ee5f533e-4c36-4103-af39-ee919aeccb11")
        public static SmDependency MessageFlowDep() {
            if (MessageFlowDep == null) {
            	MessageFlowDep = classof().getDependencyDef("MessageFlow");
            }
            return MessageFlowDep;
        }

        @objid ("dd8a5a49-78f6-4e3e-9450-91e9df58979c")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("bc2bdf71-7a99-4ef5-9473-1250145f8f7d")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("c75945fb-5e02-4bd9-9636-b16fab3f4053")
        public static SmDependency getItemRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemRefDep;
        }

        @objid ("6812cd57-5f55-43d6-bcfb-c2bb4ef8d562")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("ef8beeed-a7b8-4fcc-a167-23abbffb97b4")
        public static SmDependency getOutputMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputMessageDep;
        }

        @objid ("00789724-9ab9-450c-a537-1378fd405428")
        public static SmDependency getEventDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionDep;
        }

        @objid ("2b0e1e50-a686-4de8-939e-673dce648986")
        public static SmDependency getMessageFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageFlowDep;
        }

        @objid ("743559fb-60d6-439a-8e4e-28b1c3183610")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("4b604dcb-abcb-4644-9760-0cc4919a53d1")
        public static SmDependency getInputMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputMessageDep;
        }

        @objid ("0f015e56-f6f9-4e26-9629-2bbc9b066af0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001e8de0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9bb6a22d-1049-4a55-9fea-ee4527f0bf09")
            public ISmObjectData createData() {
                return new BpmnMessageData();
            }

            @objid ("6eaaae22-0adb-4620-8cf9-e4a8b14ad541")
            public SmObjectImpl createImpl() {
                return new BpmnMessageImpl();
            }

        }

        @objid ("001ef140-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemRefSmDependency extends SmSingleDependency {
            @objid ("9afdc92d-e3f2-4b11-a9a5-c02ee7e51e3d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mItemRef;
            }

            @objid ("5e1cfba9-94d2-46b2-85fb-f00ebfdc7fe4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mItemRef = value;
            }

            @objid ("157c3e80-628a-458b-a422-05a99be8975c")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedMessageDep();
            }

        }

        @objid ("001f659e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("d3c3785b-2926-4bd3-9083-d3563a84366f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mSender != null)? ((BpmnMessageData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("94784661-acd6-4e69-8d50-0f4dddd8ef3e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mSender = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mSender;
            }

            @objid ("1a3d11b2-4672-4eb2-ae4f-572ba0148855")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.MessageRefDep();
            }

        }

        @objid ("001fd376-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("dcf2ae75-2eff-4a4c-8aad-9ade58914c8f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mReceiver != null)? ((BpmnMessageData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("bbb9c8f9-fb39-4ed6-b8d4-c63410d8e27e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mReceiver;
            }

            @objid ("f0ce9b43-16b7-477f-97da-a92f1a8d9858")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.MessageRefDep();
            }

        }

        @objid ("002038ca-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionSmDependency extends SmMultipleDependency {
            @objid ("510e66a0-8151-415d-a904-37d3ad513f80")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mEventDefinition != null)? ((BpmnMessageData)data).mEventDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("6bad9a8f-e000-4751-b730-55f8f782ca5a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mEventDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mEventDefinition;
            }

            @objid ("69ce9909-84ee-4674-923d-f5bd92392b69")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageEventDefinitionData.Metadata.MessageRefDep();
            }

        }

        @objid ("00209d56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MessageFlowSmDependency extends SmMultipleDependency {
            @objid ("f5a2e721-6ed9-435e-abbb-7ad704ad3f5a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mMessageFlow != null)? ((BpmnMessageData)data).mMessageFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("de52a299-2feb-40c9-bb46-4147ac9cca5a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mMessageFlow = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mMessageFlow;
            }

            @objid ("9c3b0786-6a82-4bec-ae09-ff060e4ba275")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.MessageRefDep();
            }

        }

        @objid ("0021089a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InputMessageSmDependency extends SmMultipleDependency {
            @objid ("400ce36a-3581-4977-8e8f-b654cb0cb47e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mInputMessage != null)? ((BpmnMessageData)data).mInputMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("4f02c116-779a-45e1-89f6-47c274f89c27")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mInputMessage = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mInputMessage;
            }

            @objid ("38f476e6-0306-4f45-97e4-493556204324")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.InMessageRefDep();
            }

        }

        @objid ("00216f1a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputMessageSmDependency extends SmMultipleDependency {
            @objid ("464b0d13-ee23-479b-b3ba-a4074d698aad")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mOutputMessage != null)? ((BpmnMessageData)data).mOutputMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("f7f1d485-e7c6-4415-8694-4b2de17f53b7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mOutputMessage = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mOutputMessage;
            }

            @objid ("535384a1-6d48-499c-adf2-68c510037b9c")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.OutMessageRefDep();
            }

        }

        @objid ("0021d52c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("00dae02c-56d5-4eff-a5df-d982eecbf549")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mType;
            }

            @objid ("cdf50672-0b44-40db-92f8-bafcdf95f482")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mType = value;
            }

            @objid ("90bfb368-a29c-483b-bfd4-7565eb97f8a7")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnMessageRefsDep();
            }

        }

        @objid ("00225056-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("f1ba0297-d4bb-418b-a9dc-d64d43113bdb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mInState;
            }

            @objid ("20edfcde-cca3-4c5e-8e77-c6acd95401f9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mInState = value;
            }

            @objid ("cddc7018-7791-499e-9326-aa8156820942")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfBpmnMessageDep();
            }

        }

    }

}
