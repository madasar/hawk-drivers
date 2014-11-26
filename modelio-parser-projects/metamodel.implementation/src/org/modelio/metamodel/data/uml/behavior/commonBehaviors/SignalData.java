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
package org.modelio.metamodel.data.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.AcceptSignalActionData;
import org.modelio.metamodel.data.uml.behavior.activityModel.SendSignalActionData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.informationFlow.DataFlowData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
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

@objid ("0042606c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Signal.class, factory=SignalData.Metadata.ObjectFactory.class, cmsnode=true)
public class SignalData extends GeneralClassData {
    @objid ("52eed044-a87f-4bb5-a2a6-6ded51fdc991")
    @SmaMetaAttribute(metaName="IsEvent", type=Boolean.class, smAttributeClass=Metadata.IsEventSmAttribute.class)
     Object mIsEvent = false;

    @objid ("d16a968c-3050-4140-836a-4d4ac8b4cc78")
    @SmaMetaAttribute(metaName="IsException", type=Boolean.class, smAttributeClass=Metadata.IsExceptionSmAttribute.class)
     Object mIsException = false;

    @objid ("d86e3dfd-02b9-49e0-9365-24f27dd174a9")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=SendSignalActionData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("9d6164fa-51b5-4fc9-af1f-81d1b70938ac")
    @SmaMetaAssociation(metaName="Usage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.UsageSmDependency.class)
     List<SmObjectImpl> mUsage = null;

    @objid ("f8fd34e8-1784-4c92-a4c6-5b1cef78781a")
    @SmaMetaAssociation(metaName="Sends", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.SendsSmDependency.class)
     List<SmObjectImpl> mSends = null;

    @objid ("82142a7f-70fc-4644-9c99-3f044f86f6a9")
    @SmaMetaAssociation(metaName="PBase", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.PBaseSmDependency.class, partof = true)
     SmObjectImpl mPBase;

    @objid ("2817202f-d810-4364-ac87-f686318ebbeb")
    @SmaMetaAssociation(metaName="OBase", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.OBaseSmDependency.class, partof = true)
     SmObjectImpl mOBase;

    @objid ("d3373da7-af45-4dc7-a3b8-25d88de95527")
    @SmaMetaAssociation(metaName="CommunicationUsage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.CommunicationUsageSmDependency.class)
     List<SmObjectImpl> mCommunicationUsage = null;

    @objid ("df690f00-d9db-41a8-802d-0aae41c7df2d")
    @SmaMetaAssociation(metaName="DOccurence", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.DOccurenceSmDependency.class)
     List<SmObjectImpl> mDOccurence = null;

    @objid ("7e63685a-0f78-4314-b5c5-13a4e7ee135f")
    @SmaMetaAssociation(metaName="EOccurence", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.EOccurenceSmDependency.class)
     List<SmObjectImpl> mEOccurence = null;

    @objid ("9c4ab684-51bc-4357-9b2f-da1e2450abf8")
    @SmaMetaAssociation(metaName="Base", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("79785996-d476-475e-9dc7-947386fc0322")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=AcceptSignalActionData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("1c5adf78-6a95-4682-9a43-472499759cff")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006db992-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("203b8e31-b84c-4b0e-8e57-9320dd6c5bf4")
        private static SmClass smClass = null;

        @objid ("7f908764-70f7-433d-9b6f-8ffa1d179e04")
        private static SmAttribute IsEventAtt = null;

        @objid ("44a5e4c8-7be6-448f-a2e2-1e6920b26b5e")
        private static SmAttribute IsExceptionAtt = null;

        @objid ("ecc2e380-9bb2-41b7-b395-59a71ab38122")
        private static SmDependency SenderDep = null;

        @objid ("4a6a469e-c57d-4516-b312-8e581a3b3521")
        private static SmDependency UsageDep = null;

        @objid ("b3384950-b2bd-4bcf-ba05-490ab4b1d2ff")
        private static SmDependency SendsDep = null;

        @objid ("a53f867b-92a7-46f5-90be-4842dfc02a39")
        private static SmDependency PBaseDep = null;

        @objid ("4b9cfb16-9727-463a-9d86-5d92c3b1141c")
        private static SmDependency OBaseDep = null;

        @objid ("23cc9aac-8b18-40d5-8af8-c09617b0c44d")
        private static SmDependency CommunicationUsageDep = null;

        @objid ("df97bf9b-0936-4c3d-bad2-0e117b213a99")
        private static SmDependency DOccurenceDep = null;

        @objid ("4f19e60c-02d0-4a45-8694-0bb7898c9972")
        private static SmDependency EOccurenceDep = null;

        @objid ("b272cd0d-663b-440b-aecd-7d954aa52a5e")
        private static SmDependency BaseDep = null;

        @objid ("6ef302fd-bb02-4038-be66-a3cc7d2a22ef")
        private static SmDependency ReceiverDep = null;

        @objid ("6005747f-54b2-453a-baaa-2b811dff3312")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SignalData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("20d32d3f-d953-4745-bdda-a51d844761b2")
        public static SmAttribute IsEventAtt() {
            if (IsEventAtt == null) {
            	IsEventAtt = classof().getAttributeDef("IsEvent");
            }
            return IsEventAtt;
        }

        @objid ("2047e33e-500b-462f-9fc1-2d5c27c92d28")
        public static SmAttribute IsExceptionAtt() {
            if (IsExceptionAtt == null) {
            	IsExceptionAtt = classof().getAttributeDef("IsException");
            }
            return IsExceptionAtt;
        }

        @objid ("3439ac65-fa98-4061-85a4-7005a84c3a81")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("68f78cf8-fa1f-497f-82e7-cdc81a28e988")
        public static SmDependency UsageDep() {
            if (UsageDep == null) {
            	UsageDep = classof().getDependencyDef("Usage");
            }
            return UsageDep;
        }

        @objid ("b95844db-ac40-4511-9028-ffe9ed23aaef")
        public static SmDependency SendsDep() {
            if (SendsDep == null) {
            	SendsDep = classof().getDependencyDef("Sends");
            }
            return SendsDep;
        }

        @objid ("f05cceb5-c660-499a-af9c-6d731c0a2122")
        public static SmDependency PBaseDep() {
            if (PBaseDep == null) {
            	PBaseDep = classof().getDependencyDef("PBase");
            }
            return PBaseDep;
        }

        @objid ("c44a187f-ba58-46e2-bca9-56581e630aa0")
        public static SmDependency OBaseDep() {
            if (OBaseDep == null) {
            	OBaseDep = classof().getDependencyDef("OBase");
            }
            return OBaseDep;
        }

        @objid ("7274a2b8-9b98-4fc2-9a51-592da5de4339")
        public static SmDependency CommunicationUsageDep() {
            if (CommunicationUsageDep == null) {
            	CommunicationUsageDep = classof().getDependencyDef("CommunicationUsage");
            }
            return CommunicationUsageDep;
        }

        @objid ("439cc3bc-acf8-4ced-9474-d09216ae9f94")
        public static SmDependency DOccurenceDep() {
            if (DOccurenceDep == null) {
            	DOccurenceDep = classof().getDependencyDef("DOccurence");
            }
            return DOccurenceDep;
        }

        @objid ("f35d7823-50cb-4d0c-b6c0-5968b860c00a")
        public static SmDependency EOccurenceDep() {
            if (EOccurenceDep == null) {
            	EOccurenceDep = classof().getDependencyDef("EOccurence");
            }
            return EOccurenceDep;
        }

        @objid ("b887c49f-7a47-4164-8e38-7ea9681477d9")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("aa0be26c-cd17-4494-85e1-ecc217d24b9d")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("23e1b912-8e8f-413c-b424-139e9afe04ff")
        public static SmDependency getSendsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SendsDep;
        }

        @objid ("f89e45bc-f2f0-46ba-a1c1-c6e522b83b17")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("14aa18ba-ba0c-4c93-97aa-ed2b583c971b")
        public static SmDependency getUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsageDep;
        }

        @objid ("cf9c450d-3eae-4a63-ac77-31e97dabf8c5")
        public static SmDependency getDOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DOccurenceDep;
        }

        @objid ("43bb1e1e-8433-45b9-8b84-0c55b30e8065")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("0bfe7c95-ab66-4ab3-b625-5b455fe4c609")
        public static SmDependency getOBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OBaseDep;
        }

        @objid ("7bca2978-45e5-4cda-95ab-f53371ae74bd")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("ff2c856c-2670-45fd-aa71-02339b45e341")
        public static SmDependency getCommunicationUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CommunicationUsageDep;
        }

        @objid ("21e5ab6b-a6a3-4f84-9253-1214e7a9e6ed")
        public static SmAttribute getIsEventAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsEventAtt;
        }

        @objid ("074b3b51-d673-4ff1-837f-95f860e4e6b6")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("4999e044-1e5d-474d-8597-a06318647774")
        public static SmDependency getEOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EOccurenceDep;
        }

        @objid ("e0125c0f-64d1-49e4-97f5-5d60258606bd")
        public static SmDependency getPBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PBaseDep;
        }

        @objid ("09acba7a-1f63-4be1-b02c-65c9a91db600")
        public static SmAttribute getIsExceptionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExceptionAtt;
        }

        @objid ("006dfbdc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("048a7a97-ea81-4d3f-b6b6-1eb67d131304")
            public ISmObjectData createData() {
                return new SignalData();
            }

            @objid ("4b667880-c40b-488f-b997-0ed40e363a6a")
            public SmObjectImpl createImpl() {
                return new SignalImpl();
            }

        }

        @objid ("006e5dc0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsEventSmAttribute extends SmAttribute {
            @objid ("52b8a331-d639-4eba-95c5-8252eba3a9f4")
            public Object getValue(ISmObjectData data) {
                return ((SignalData) data).mIsEvent;
            }

            @objid ("f3bd23d4-d1cf-4994-84ee-cf728b9011b7")
            public void setValue(ISmObjectData data, Object value) {
                ((SignalData) data).mIsEvent = value;
            }

        }

        @objid ("006ec0a8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExceptionSmAttribute extends SmAttribute {
            @objid ("913a9c68-7c50-45bd-ac18-72c9a06b696d")
            public Object getValue(ISmObjectData data) {
                return ((SignalData) data).mIsException;
            }

            @objid ("8417609f-c7f8-4476-82b1-3beea39b1388")
            public void setValue(ISmObjectData data, Object value) {
                ((SignalData) data).mIsException = value;
            }

        }

        @objid ("006f26ba-c4c2-1fd8-97fe-001ec947cd2a")
        public static class EOccurenceSmDependency extends SmMultipleDependency {
            @objid ("72dc22fc-b910-455e-94c9-eb99fb6052c5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mEOccurence != null)? ((SignalData)data).mEOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("24fb2a2b-9aa5-4468-a4e9-4837ef33d512")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mEOccurence = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mEOccurence;
            }

            @objid ("afd164af-261a-475b-a443-71eec0bf09e0")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.ModelDep();
            }

        }

        @objid ("006f8b00-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SendsSmDependency extends SmMultipleDependency {
            @objid ("f045450c-8f71-41a7-a6b4-636fa3c10b17")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mSends != null)? ((SignalData)data).mSends:SmMultipleDependency.EMPTY;
            }

            @objid ("08888f01-0552-4979-ae0a-b32bf69727e9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mSends = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mSends;
            }

            @objid ("d8133272-47dc-46e8-9b93-d8ac69fe7a02")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.EffectsDep();
            }

        }

        @objid ("006fefd2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class PBaseSmDependency extends SmSingleDependency {
            @objid ("20d40646-e8cd-454c-8ace-8517629d0c13")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mPBase;
            }

            @objid ("44b2b57d-22c7-4418-b445-dd2600b249fc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mPBase = value;
            }

            @objid ("34478ce2-e477-4606-97cf-1ee900417c93")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.SRepresentationDep();
            }

        }

        @objid ("00706714-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OBaseSmDependency extends SmSingleDependency {
            @objid ("353f7ce4-1932-4cbc-ad65-8b56a638d9a6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mOBase;
            }

            @objid ("e28053c6-b56f-47a7-ada8-884642f2e1b0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mOBase = value;
            }

            @objid ("b1214cdf-fa63-4e3f-b756-e591b86c3688")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.SRepresentationDep();
            }

        }

        @objid ("0070de1a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("bf4d6be7-15b2-4bcc-9fa1-5daa986e8b1f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mBase;
            }

            @objid ("53a19291-38b7-4f01-83cb-7cff620c7a3c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mBase = value;
            }

            @objid ("7955a9cd-2892-474d-befe-0e5a7d598988")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.SRepresentationDep();
            }

        }

        @objid ("007156a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DOccurenceSmDependency extends SmMultipleDependency {
            @objid ("76864d1d-5fe9-4d02-adb5-474bf0b1bdff")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mDOccurence != null)? ((SignalData)data).mDOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("0f3442dd-2f8d-4acf-a563-bc1186c650f7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mDOccurence = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mDOccurence;
            }

            @objid ("5f3f1a67-3957-4951-bcbe-37b1aba50602")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.SModelDep();
            }

        }

        @objid ("00723652-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("22b4b101-b90f-456f-ae54-f590cc9110be")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mSender != null)? ((SignalData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("92b72418-0814-46a7-8ae4-28e0845a3c6a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mSender = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mSender;
            }

            @objid ("b59ac1d6-c718-48bf-8ab3-1948441dbeca")
            @Override
            public SmDependency getSymetric() {
                return SendSignalActionData.Metadata.SentDep();
            }

        }

        @objid ("00729e58-c4c2-1fd8-97fe-001ec947cd2a")
        public static class UsageSmDependency extends SmMultipleDependency {
            @objid ("e30820ff-0374-4456-860a-63a49d3e3e99")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mUsage != null)? ((SignalData)data).mUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("8b450f35-89e9-46f0-ad25-3f359f90ea52")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mUsage = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mUsage;
            }

            @objid ("152851c6-0751-44ed-b7b2-4a1d56719a99")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.SignalSignatureDep();
            }

        }

        @objid ("007307e4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("86c1fd07-afa5-4a7f-83fd-cfb95c0a855b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mReceiver != null)? ((SignalData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("d87ad5ae-6116-4966-b832-34edac345db8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mReceiver;
            }

            @objid ("ce28d325-2d68-4d94-ae0e-1ac68b617bdd")
            @Override
            public SmDependency getSymetric() {
                return AcceptSignalActionData.Metadata.AcceptedDep();
            }

        }

        @objid ("00737198-c4c2-1fd8-97fe-001ec947cd2a")
        public static class CommunicationUsageSmDependency extends SmMultipleDependency {
            @objid ("1564842e-80b2-41e2-a9bf-afeff2b699ca")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mCommunicationUsage != null)? ((SignalData)data).mCommunicationUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("101331ac-9d93-4f83-ac3a-019a8be18132")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mCommunicationUsage = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mCommunicationUsage;
            }

            @objid ("f18449e3-5fb7-491a-9928-9c666abe3fea")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.SignalSignatureDep();
            }

        }

    }

}
