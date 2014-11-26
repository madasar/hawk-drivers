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
package org.modelio.metamodel.data.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationMessageImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
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

@objid ("005b5928-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CommunicationMessage.class, factory=CommunicationMessageData.Metadata.ObjectFactory.class)
public class CommunicationMessageData extends ModelElementData {
    @objid ("6b97ee3b-e830-4098-a3c5-f1c13e936c71")
    @SmaMetaAttribute(metaName="Argument", type=String.class, smAttributeClass=Metadata.ArgumentSmAttribute.class)
     Object mArgument = "";

    @objid ("ba8fb4a2-5645-4e33-90b0-bfefefbeb5be")
    @SmaMetaAttribute(metaName="Sequence", type=String.class, smAttributeClass=Metadata.SequenceSmAttribute.class)
     Object mSequence = "";

    @objid ("d413cfa0-2e5b-4771-88db-3983b00112e0")
    @SmaMetaAttribute(metaName="SortOfMessage", type=MessageSort.class, smAttributeClass=Metadata.SortOfMessageSmAttribute.class)
     Object mSortOfMessage = MessageSort.SYNCCALL;

    @objid ("9a5513b4-61d6-43a0-94ac-f040b0ebae54")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("6fbbbe73-5d91-4ceb-b6ce-f63086983059")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class)
     SmObjectImpl mChannel;

    @objid ("aab6dc22-dbf9-47ce-bb1a-46f2286fcde4")
    @SmaMetaAssociation(metaName="InvertedChannel", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.InvertedChannelSmDependency.class)
     SmObjectImpl mInvertedChannel;

    @objid ("388d9c9d-da50-4646-a1f6-4182e0c3e1a1")
    @SmaMetaAssociation(metaName="Invoked", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InvokedSmDependency.class, partof = true)
     SmObjectImpl mInvoked;

    @objid ("b682a883-532c-4c45-894c-1379601f98a6")
    @SmaMetaAssociation(metaName="SignalSignature", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SignalSignatureSmDependency.class, partof = true)
     SmObjectImpl mSignalSignature;

    @objid ("73ae7082-b0e0-4759-a6c5-accb8a4dc164")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0011ffa8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4bdf5314-354a-4900-97f9-9e966f93abf9")
        private static SmClass smClass = null;

        @objid ("026a42c6-4dfc-4965-84b8-aad1d54b4c3e")
        private static SmAttribute ArgumentAtt = null;

        @objid ("5a447a13-0fd1-4c49-88d8-cd02e9158933")
        private static SmAttribute SequenceAtt = null;

        @objid ("58574dc8-6930-4db7-95ee-716366f81fb1")
        private static SmAttribute SortOfMessageAtt = null;

        @objid ("fa28fb97-46cf-4ed1-9b36-2baefa1b3225")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("304208bb-e99c-477e-b1c8-df040f731293")
        private static SmDependency ChannelDep = null;

        @objid ("e00562d7-415a-429d-8279-9e9f50452171")
        private static SmDependency InvertedChannelDep = null;

        @objid ("a3ed23c2-487b-42b6-8588-20c38ee07ddb")
        private static SmDependency InvokedDep = null;

        @objid ("6c6c16a5-0d48-49a9-bcab-d07a3e8a596d")
        private static SmDependency SignalSignatureDep = null;

        @objid ("87765828-1370-4c59-ac53-9329fe5b1b7d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationMessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("443f33c5-0569-4e7d-adf9-2cc5af862d2a")
        public static SmAttribute ArgumentAtt() {
            if (ArgumentAtt == null) {
            	ArgumentAtt = classof().getAttributeDef("Argument");
            }
            return ArgumentAtt;
        }

        @objid ("2b4de12f-9512-4c29-a659-7dea6a385491")
        public static SmAttribute SequenceAtt() {
            if (SequenceAtt == null) {
            	SequenceAtt = classof().getAttributeDef("Sequence");
            }
            return SequenceAtt;
        }

        @objid ("4655f67d-d84b-479f-8539-6a579f755db1")
        public static SmAttribute SortOfMessageAtt() {
            if (SortOfMessageAtt == null) {
            	SortOfMessageAtt = classof().getAttributeDef("SortOfMessage");
            }
            return SortOfMessageAtt;
        }

        @objid ("43ba0ecd-4c94-4178-a7d4-b42c8ae46fa9")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("9b0c3d75-d844-431e-bc41-6a3796932f0a")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("4b8e137a-9bc6-418d-9bb5-833eb3a9e21c")
        public static SmDependency InvertedChannelDep() {
            if (InvertedChannelDep == null) {
            	InvertedChannelDep = classof().getDependencyDef("InvertedChannel");
            }
            return InvertedChannelDep;
        }

        @objid ("727321b0-f9b1-4fcc-89d1-c8da78ca5c0c")
        public static SmDependency InvokedDep() {
            if (InvokedDep == null) {
            	InvokedDep = classof().getDependencyDef("Invoked");
            }
            return InvokedDep;
        }

        @objid ("b7c98440-4378-453e-aad3-fc338f00302a")
        public static SmDependency SignalSignatureDep() {
            if (SignalSignatureDep == null) {
            	SignalSignatureDep = classof().getDependencyDef("SignalSignature");
            }
            return SignalSignatureDep;
        }

        @objid ("6459e734-fc8f-4349-965b-e771ce8f9342")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("bfd4a779-a092-46ba-8acb-c9d87f9bfaea")
        public static SmAttribute getArgumentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArgumentAtt;
        }

        @objid ("7e5c7033-fc69-48a8-9807-1c802b13b279")
        public static SmDependency getSignalSignatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SignalSignatureDep;
        }

        @objid ("a8cdf108-d5f9-4ffc-98e4-d2952a76fb5f")
        public static SmDependency getInvertedChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvertedChannelDep;
        }

        @objid ("62c34eaa-ca27-4785-9b0d-099001694356")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dcc86870-4f64-4f51-bc44-ffdb358c0fa4")
        public static SmDependency getInvokedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokedDep;
        }

        @objid ("9f2dfe88-4143-4a53-a081-3cfe6f9ec48b")
        public static SmAttribute getSortOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SortOfMessageAtt;
        }

        @objid ("5de33484-9493-45f2-8edb-b07ef638e92e")
        public static SmAttribute getSequenceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SequenceAtt;
        }

        @objid ("a21315b6-4ba3-4c4c-91c2-d8e9767821d1")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("00124170-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cec00d37-d043-47cc-a5aa-f8885403fcb7")
            public ISmObjectData createData() {
                return new CommunicationMessageData();
            }

            @objid ("c0530f5a-8230-4538-af11-0713c45cf7c2")
            public SmObjectImpl createImpl() {
                return new CommunicationMessageImpl();
            }

        }

        @objid ("0012a41c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ArgumentSmAttribute extends SmAttribute {
            @objid ("a83baf68-2086-4cb1-99e9-ba8da8311734")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mArgument;
            }

            @objid ("5ea02948-e8d4-44b7-b5b1-1a361cef6365")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mArgument = value;
            }

        }

        @objid ("001306d2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SequenceSmAttribute extends SmAttribute {
            @objid ("9985d317-e141-4ad8-b781-80f34ab0c97b")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSequence;
            }

            @objid ("7694aa6c-3b8b-4c50-9dea-3817a6c765ab")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mSequence = value;
            }

        }

        @objid ("00144146-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SortOfMessageSmAttribute extends SmAttribute {
            @objid ("971beb93-51a5-415e-84cf-c90dc7752cd8")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSortOfMessage;
            }

            @objid ("23d62fc7-0e5d-4fca-a08c-34aec471388f")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mSortOfMessage = value;
            }

        }

        @objid ("0014abae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InvokedSmDependency extends SmSingleDependency {
            @objid ("a541b651-a8e7-4e23-95f7-8d48fa614f5a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mInvoked;
            }

            @objid ("7e70fd7c-13e8-4053-a470-391fc215884c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mInvoked = value;
            }

            @objid ("2166eab4-df05-418b-885d-27e338fa46ad")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CommunicationUsageDep();
            }

        }

        @objid ("0015248a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("11651605-9a71-41e6-91d4-5280a7b12c45")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationMessageData)data).mRealizedInformationFlow != null)? ((CommunicationMessageData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("a7184f21-8eaf-47bd-8292-c8602d6bd906")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationMessageData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((CommunicationMessageData) data).mRealizedInformationFlow;
            }

            @objid ("ff2bab1b-4e69-4693-a9cd-660490a01f44")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingCommunicationMessageDep();
            }

        }

        @objid ("00158b0a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SignalSignatureSmDependency extends SmSingleDependency {
            @objid ("5b649b58-38f9-4b2a-8d10-3460bff645d7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSignalSignature;
            }

            @objid ("f351f612-16f5-4f35-ae81-055b8aa23ac2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mSignalSignature = value;
            }

            @objid ("07957319-a5ef-4ea0-8d28-018cdc4bbda8")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.CommunicationUsageDep();
            }

        }

        @objid ("001605b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("cdbfc6af-7458-43ab-aef6-d267ef56c8cf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mChannel;
            }

            @objid ("8f75ac7e-ced9-4f3c-863c-3226734d4380")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mChannel = value;
            }

            @objid ("509c4ff9-4c95-4239-b5f1-c249f588d1ed")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.StartToEndMessageDep();
            }

        }

        @objid ("d06c71b1-eb32-478d-992a-d0b53482df76")
        public static class InvertedChannelSmDependency extends SmSingleDependency {
            @objid ("134b2dc3-79c8-4c1d-a634-95fb9e6c79a5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mInvertedChannel;
            }

            @objid ("91a229c9-f0a9-4901-8e20-8887fb92e347")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mInvertedChannel = value;
            }

            @objid ("2d086e62-8664-4968-a710-42d3df4e79ca")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.EndToStartMessageDep();
            }

        }

    }

}
