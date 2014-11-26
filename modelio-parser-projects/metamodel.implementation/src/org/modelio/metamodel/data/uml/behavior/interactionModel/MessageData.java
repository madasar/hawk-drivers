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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageEndData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageKind;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
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

@objid ("004999e0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Message.class, factory=MessageData.Metadata.ObjectFactory.class)
public class MessageData extends ModelElementData {
    @objid ("25f75436-8584-4813-b678-dba85cbb1a8e")
    @SmaMetaAttribute(metaName="Argument", type=String.class, smAttributeClass=Metadata.ArgumentSmAttribute.class)
     Object mArgument = "";

    @objid ("bb26e26e-e287-4b1f-8076-6aea86af4411")
    @SmaMetaAttribute(metaName="KindOfMessage", type=MessageKind.class, smAttributeClass=Metadata.KindOfMessageSmAttribute.class)
     Object mKindOfMessage = MessageKind.UNKNOWNKIND;

    @objid ("9123287d-df76-4ddc-b7c9-7a060bd5e713")
    @SmaMetaAttribute(metaName="SortOfMessage", type=MessageSort.class, smAttributeClass=Metadata.SortOfMessageSmAttribute.class)
     Object mSortOfMessage = MessageSort.SYNCCALL;

    @objid ("6ace9aff-1b8b-470b-9e20-7d8219c9ce27")
    @SmaMetaAssociation(metaName="SignalSignature", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SignalSignatureSmDependency.class, partof = true)
     SmObjectImpl mSignalSignature;

    @objid ("74dc1b94-b392-4e6a-9ea9-a53c20a75f52")
    @SmaMetaAssociation(metaName="ReceiveEvent", typeDataClass=MessageEndData.class, min=0, max=1, smAssociationClass=Metadata.ReceiveEventSmDependency.class, partof = true)
     SmObjectImpl mReceiveEvent;

    @objid ("dd8ef175-698c-44c3-b5c0-4918df182438")
    @SmaMetaAssociation(metaName="SendEvent", typeDataClass=MessageEndData.class, min=0, max=1, smAssociationClass=Metadata.SendEventSmDependency.class)
     SmObjectImpl mSendEvent;

    @objid ("a39a5d6e-196d-4cb2-a078-c9a6cedf5ea6")
    @SmaMetaAssociation(metaName="Invoked", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InvokedSmDependency.class, partof = true)
     SmObjectImpl mInvoked;

    @objid ("11acaa28-bd87-47c9-b9ea-1318baaae5cb")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("915f05e1-72d0-4069-8626-2dd4b32b8df0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008865da-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5a356c97-0691-4fdf-8987-b5d1fb32ede7")
        private static SmClass smClass = null;

        @objid ("97407e55-949f-4005-9cdf-17da7ca4df06")
        private static SmAttribute ArgumentAtt = null;

        @objid ("20a1e36d-72b8-456d-8e99-17e2cc9303e0")
        private static SmAttribute KindOfMessageAtt = null;

        @objid ("5c64d36b-2f0e-4f01-96a1-308d5e1c0912")
        private static SmAttribute SortOfMessageAtt = null;

        @objid ("0db1fe35-bcf6-4d0f-9e8f-b7da8a2edc73")
        private static SmDependency SignalSignatureDep = null;

        @objid ("425e03e8-ce1d-4fc9-81e9-8927b5b94c51")
        private static SmDependency ReceiveEventDep = null;

        @objid ("04bcce07-6cfb-43d8-a538-1a11bbe7a2e4")
        private static SmDependency SendEventDep = null;

        @objid ("eb0bc686-726b-4876-bdea-38af340479a9")
        private static SmDependency InvokedDep = null;

        @objid ("d1a2b9fc-2f6a-44a7-ae1f-f0fffee67e40")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("f6c5c504-1eeb-422f-b2e1-13f03687aace")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a25630b0-6bbe-470e-aa0b-32a11fd0c474")
        public static SmAttribute ArgumentAtt() {
            if (ArgumentAtt == null) {
            	ArgumentAtt = classof().getAttributeDef("Argument");
            }
            return ArgumentAtt;
        }

        @objid ("2494b192-7f3b-4b57-886f-4f1bd7532278")
        public static SmAttribute KindOfMessageAtt() {
            if (KindOfMessageAtt == null) {
            	KindOfMessageAtt = classof().getAttributeDef("KindOfMessage");
            }
            return KindOfMessageAtt;
        }

        @objid ("baa75a40-c753-4076-93c6-924e94f49255")
        public static SmAttribute SortOfMessageAtt() {
            if (SortOfMessageAtt == null) {
            	SortOfMessageAtt = classof().getAttributeDef("SortOfMessage");
            }
            return SortOfMessageAtt;
        }

        @objid ("90bdc8b6-e383-4a91-8f41-bb0b68e96626")
        public static SmDependency SignalSignatureDep() {
            if (SignalSignatureDep == null) {
            	SignalSignatureDep = classof().getDependencyDef("SignalSignature");
            }
            return SignalSignatureDep;
        }

        @objid ("56c1a3ae-2482-4c1b-88ff-dcbed5646ab8")
        public static SmDependency ReceiveEventDep() {
            if (ReceiveEventDep == null) {
            	ReceiveEventDep = classof().getDependencyDef("ReceiveEvent");
            }
            return ReceiveEventDep;
        }

        @objid ("ff28b409-e41c-46ad-812d-8a4d8125ed35")
        public static SmDependency SendEventDep() {
            if (SendEventDep == null) {
            	SendEventDep = classof().getDependencyDef("SendEvent");
            }
            return SendEventDep;
        }

        @objid ("f3dd95dc-90a0-47e3-93b3-38eede81cf00")
        public static SmDependency InvokedDep() {
            if (InvokedDep == null) {
            	InvokedDep = classof().getDependencyDef("Invoked");
            }
            return InvokedDep;
        }

        @objid ("ce87803e-e344-47f9-a719-0500bacc2e8a")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("63e7b30f-db3c-441b-9ecb-0f6ed73de6a7")
        public static SmDependency getInvokedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokedDep;
        }

        @objid ("bfdec801-3be4-42b3-aff5-58d7868a0a41")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("70223609-33f9-4bd2-bd6f-a0dda784a5dc")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("0eae437b-49b7-42ca-83f4-9b9d52001bc7")
        public static SmAttribute getSortOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SortOfMessageAtt;
        }

        @objid ("1c525a11-a1a2-464e-be5a-b478c636112b")
        public static SmDependency getSignalSignatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SignalSignatureDep;
        }

        @objid ("86299d4c-347e-4f36-b6c8-a1a523df8514")
        public static SmAttribute getKindOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindOfMessageAtt;
        }

        @objid ("d94f9a29-8bbd-43f5-93e7-5bffe8f48f70")
        public static SmDependency getReceiveEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiveEventDep;
        }

        @objid ("25f118e8-05a6-4c61-9ab2-4f57f9651f9f")
        public static SmAttribute getArgumentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArgumentAtt;
        }

        @objid ("9096392b-b5a0-4051-993c-61c5aa17cc6b")
        public static SmDependency getSendEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SendEventDep;
        }

        @objid ("0088a676-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f7c483b1-7828-4c16-9ffb-8ee5991056b9")
            public ISmObjectData createData() {
                return new MessageData();
            }

            @objid ("1bec7174-94a5-47ea-b457-43872e6caded")
            public SmObjectImpl createImpl() {
                return new MessageImpl();
            }

        }

        @objid ("00891ebc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ArgumentSmAttribute extends SmAttribute {
            @objid ("46e27b73-3386-43c2-8ea5-fe6a4b1b432d")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mArgument;
            }

            @objid ("a26f7eaa-0c0c-4d81-8730-6b227bf72ac2")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mArgument = value;
            }

        }

        @objid ("00899afe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class KindOfMessageSmAttribute extends SmAttribute {
            @objid ("a6fc4c5b-2cb6-45d8-a8e1-ed3ab0b7e3e8")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mKindOfMessage;
            }

            @objid ("a7b3ed52-c378-4c07-9250-a9809d9ecfc4")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mKindOfMessage = value;
            }

        }

        @objid ("008a147a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SortOfMessageSmAttribute extends SmAttribute {
            @objid ("58a36e86-7ac5-4627-859b-5b549de28d6a")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mSortOfMessage;
            }

            @objid ("f197ef56-ce15-4ba4-8d34-76d9055226e9")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mSortOfMessage = value;
            }

        }

        @objid ("008a92f6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InvokedSmDependency extends SmSingleDependency {
            @objid ("16ab2294-a4ac-4db1-b3bc-08eba39106d1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mInvoked;
            }

            @objid ("5f74ca05-d326-4f4b-8f3a-6107bda8817b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mInvoked = value;
            }

            @objid ("e1ca9d59-06e4-4246-bb51-5df346077b74")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.UsageDep();
            }

        }

        @objid ("008b236a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("8085a474-c68d-43e8-8c44-66386d4dd53b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MessageData)data).mRealizedInformationFlow != null)? ((MessageData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("73ba3a16-d4f9-43c5-8674-655a9238464b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MessageData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((MessageData) data).mRealizedInformationFlow;
            }

            @objid ("d44b165f-35ad-4d51-aefa-c52e2b8ef45b")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingMessageDep();
            }

        }

        @objid ("008ba2ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceiveEventSmDependency extends SmSingleDependency {
            @objid ("6e1981e1-4ec9-4790-85ec-92d77e1ad170")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mReceiveEvent;
            }

            @objid ("f13dbf72-16aa-4160-928a-d67004c03381")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mReceiveEvent = value;
            }

            @objid ("f66e2f20-76d8-4bc2-a00f-07b5bd7b6404")
            @Override
            public SmDependency getSymetric() {
                return MessageEndData.Metadata.ReceivedMessageDep();
            }

        }

        @objid ("008c343a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SendEventSmDependency extends SmSingleDependency {
            @objid ("e193e372-e7b5-4691-a6cd-15228c29760b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mSendEvent;
            }

            @objid ("687c0860-10db-486e-995d-7be5367a0fa0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mSendEvent = value;
            }

            @objid ("5c8d6451-da65-471a-a187-1823886ae8ad")
            @Override
            public SmDependency getSymetric() {
                return MessageEndData.Metadata.SentMessageDep();
            }

        }

        @objid ("008cca9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SignalSignatureSmDependency extends SmSingleDependency {
            @objid ("229a0ea0-5403-49ed-8225-f5dc63e31407")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mSignalSignature;
            }

            @objid ("ce14e219-85f3-4998-8369-56757434c892")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mSignalSignature = value;
            }

            @objid ("0699c461-30c4-4fe0-8a5e-692555b60e15")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.UsageDep();
            }

        }

    }

}
