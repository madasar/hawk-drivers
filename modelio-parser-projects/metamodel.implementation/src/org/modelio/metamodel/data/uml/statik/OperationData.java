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
import org.modelio.metamodel.data.bpmn.activities.BpmnCallActivityData;
import org.modelio.metamodel.data.bpmn.activities.BpmnReceiveTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnSendTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnServiceTaskData;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.uml.behavior.activityModel.AcceptCallEventActionData;
import org.modelio.metamodel.data.uml.behavior.activityModel.CallOperationActionData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.CollaborationData;
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.data.uml.statik.ElementImportData;
import org.modelio.metamodel.data.uml.statik.PackageImportData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.data.uml.statik.RaisedExceptionData;
import org.modelio.metamodel.data.uml.statik.TemplateBindingData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.impl.uml.statik.OperationImpl;
import org.modelio.metamodel.uml.statik.MethodPassingMode;
import org.modelio.metamodel.uml.statik.Operation;
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

@objid ("0014d9d0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Operation.class, factory=OperationData.Metadata.ObjectFactory.class)
public class OperationData extends BehavioralFeatureData {
    @objid ("ddc3d1cc-34bd-4ca7-9077-3af9ef4ccb5f")
    @SmaMetaAttribute(metaName="Concurrency", type=Boolean.class, smAttributeClass=Metadata.ConcurrencySmAttribute.class)
     Object mConcurrency = false;

    @objid ("e7c6da39-fbc6-474d-8486-9649805a844b")
    @SmaMetaAttribute(metaName="Final", type=Boolean.class, smAttributeClass=Metadata.FinalSmAttribute.class)
     Object mFinal = false;

    @objid ("e874d81a-dcc8-425c-92ff-073ff802ca2a")
    @SmaMetaAttribute(metaName="Passing", type=MethodPassingMode.class, smAttributeClass=Metadata.PassingSmAttribute.class)
     Object mPassing = MethodPassingMode.METHODOUT;

    @objid ("4efea3c4-fd7f-4838-b34a-8a66331c4d8a")
    @SmaMetaAssociation(metaName="OwnedImport", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedImport = null;

    @objid ("f7221684-1acf-422d-9b32-c2c6d0feeb50")
    @SmaMetaAssociation(metaName="Thrown", typeDataClass=RaisedExceptionData.class, min=0, max=-1, smAssociationClass=Metadata.ThrownSmDependency.class, component = true)
     List<SmObjectImpl> mThrown = null;

    @objid ("88c92284-d5c9-4a7c-98cc-239494247811")
    @SmaMetaAssociation(metaName="CallerReceiveTask", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerReceiveTaskSmDependency.class)
     List<SmObjectImpl> mCallerReceiveTask = null;

    @objid ("a8907888-c593-44cd-9e59-46137681f260")
    @SmaMetaAssociation(metaName="Redefinition", typeDataClass=OperationData.class, min=0, max=-1, smAssociationClass=Metadata.RedefinitionSmDependency.class)
     List<SmObjectImpl> mRedefinition = null;

    @objid ("233e9c7d-5882-491d-9f05-5d0b0838ed6e")
    @SmaMetaAssociation(metaName="Example", typeDataClass=CollaborationData.class, min=0, max=-1, smAssociationClass=Metadata.ExampleSmDependency.class, component = true)
     List<SmObjectImpl> mExample = null;

    @objid ("f663c91d-d557-4e09-812d-c30b656a3bcc")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("ef861b86-f9af-43de-9a37-8e95d822870f")
    @SmaMetaAssociation(metaName="OwnedBehavior", typeDataClass=BehaviorData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedBehaviorSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedBehavior = null;

    @objid ("cc52b598-e9f3-4a0b-9641-9190d80d92eb")
    @SmaMetaAssociation(metaName="BpmnOperationRef", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnOperationRefSmDependency.class)
     List<SmObjectImpl> mBpmnOperationRef = null;

    @objid ("fdadce50-0d19-41cf-a2cd-596caa624cdd")
    @SmaMetaAssociation(metaName="CallerSendTask", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSendTaskSmDependency.class)
     List<SmObjectImpl> mCallerSendTask = null;

    @objid ("ed6bc400-d0ec-4735-82d7-0f43127535f7")
    @SmaMetaAssociation(metaName="IO", typeDataClass=ParameterData.class, min=0, max=-1, smAssociationClass=Metadata.IOSmDependency.class, component = true)
     List<SmObjectImpl> mIO = null;

    @objid ("7bae992e-2c25-4ed6-b597-b9fbc270bffc")
    @SmaMetaAssociation(metaName="TemplateInstanciation", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateInstanciationSmDependency.class, component = true)
     List<SmObjectImpl> mTemplateInstanciation = null;

    @objid ("5afce1ad-a4ad-4c37-9790-44c967e890fe")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("5ca5664b-e7c0-49e1-875a-8768944f3fc3")
    @SmaMetaAssociation(metaName="OwnedPackageImport", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedPackageImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedPackageImport = null;

    @objid ("efd32501-df0f-434c-85da-4c845a0e5b2b")
    @SmaMetaAssociation(metaName="Return", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.ReturnSmDependency.class, component = true)
     SmObjectImpl mReturn;

    @objid ("5dacc295-ac4d-4a58-8170-0b820d118e8f")
    @SmaMetaAssociation(metaName="InstanciatingBinding", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.InstanciatingBindingSmDependency.class)
     List<SmObjectImpl> mInstanciatingBinding = null;

    @objid ("0d255fb7-fffc-4529-80fc-ba5fe176340a")
    @SmaMetaAssociation(metaName="Usage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.UsageSmDependency.class)
     List<SmObjectImpl> mUsage = null;

    @objid ("3ccd1070-46e1-4d29-a791-b0b93e245e29")
    @SmaMetaAssociation(metaName="Template", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSmDependency.class, component = true)
     List<SmObjectImpl> mTemplate = null;

    @objid ("67c4c15a-444e-4f17-aa9a-e7777afe7778")
    @SmaMetaAssociation(metaName="CallerServiceTask", typeDataClass=BpmnServiceTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerServiceTaskSmDependency.class)
     List<SmObjectImpl> mCallerServiceTask = null;

    @objid ("3cdf72d2-9307-406c-98e6-fefef625b958")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("575947eb-42b6-4d81-b0f7-6c41b8046ec0")
    @SmaMetaAssociation(metaName="Invoker", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.InvokerSmDependency.class)
     List<SmObjectImpl> mInvoker = null;

    @objid ("9c8b7265-53f1-4b1f-977a-4ea2db779a58")
    @SmaMetaAssociation(metaName="CommunicationUsage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.CommunicationUsageSmDependency.class)
     List<SmObjectImpl> mCommunicationUsage = null;

    @objid ("261c4db6-ffd9-4bbc-b247-083ae263f11a")
    @SmaMetaAssociation(metaName="OwnedCollaborationUse", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationUseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaborationUse = null;

    @objid ("55f46cd3-6a21-4983-b517-9de61f779c73")
    @SmaMetaAssociation(metaName="Redefines", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.RedefinesSmDependency.class, partof = true)
     SmObjectImpl mRedefines;

    @objid ("9cd45a37-0bba-4396-9e51-56f32518d862")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("aef52cba-7ef0-4197-9824-c75a53aec981")
    @SmaMetaAssociation(metaName="CallingAction", typeDataClass=CallOperationActionData.class, min=0, max=-1, smAssociationClass=Metadata.CallingActionSmDependency.class)
     List<SmObjectImpl> mCallingAction = null;

    @objid ("45d2d3f2-1b72-4ad6-ae6e-9f1a3fc67ed2")
    @SmaMetaAssociation(metaName="EntryPointAction", typeDataClass=AcceptCallEventActionData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointActionSmDependency.class)
     List<SmObjectImpl> mEntryPointAction = null;

    @objid ("d447ecc7-c60b-49be-8bea-e5076b5a2d72")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00087172-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b1760859-1e3b-4798-b41b-67b1b93e343e")
        private static SmClass smClass = null;

        @objid ("ace0133d-b9f0-4447-bf71-20ccf1ec5d1a")
        private static SmAttribute ConcurrencyAtt = null;

        @objid ("f179d4dd-5251-4b4e-a844-39ed3c95617e")
        private static SmAttribute FinalAtt = null;

        @objid ("9623f8aa-62c0-4d9c-9c2b-0bf785a5e03b")
        private static SmAttribute PassingAtt = null;

        @objid ("0385ea0b-b413-40d0-822a-5b881ca9208f")
        private static SmDependency OwnedImportDep = null;

        @objid ("00ef0b69-f444-4ee8-b7a1-7c6a5fdc93b1")
        private static SmDependency ThrownDep = null;

        @objid ("050d5161-03b3-42e0-9830-479f4bbf42ae")
        private static SmDependency CallerReceiveTaskDep = null;

        @objid ("97731497-6793-46da-bd30-1bcfae3f6d1f")
        private static SmDependency RedefinitionDep = null;

        @objid ("78c513d3-58e6-4464-bb51-1a718b6b6931")
        private static SmDependency ExampleDep = null;

        @objid ("268e0407-8402-486b-beaa-2456701b0c9c")
        private static SmDependency SRepresentationDep = null;

        @objid ("cdb040a7-88ca-40a4-9d9f-4ecca66b8f64")
        private static SmDependency OwnedBehaviorDep = null;

        @objid ("4fa2a9c5-2b8a-43ff-a955-899be64580b4")
        private static SmDependency BpmnOperationRefDep = null;

        @objid ("fc5248d6-9587-4bae-9337-cf623c3373ac")
        private static SmDependency CallerSendTaskDep = null;

        @objid ("d6286933-c003-4548-98d1-f0fd9d4e98be")
        private static SmDependency IODep = null;

        @objid ("d48fed75-b352-40da-b1ec-91c382462dc4")
        private static SmDependency TemplateInstanciationDep = null;

        @objid ("8c0d7d1c-612d-44b9-9598-40559900f20e")
        private static SmDependency OwnerDep = null;

        @objid ("8d909000-d6c4-4970-88f4-590f745e25d9")
        private static SmDependency OwnedPackageImportDep = null;

        @objid ("27414ef2-7987-4962-9d0d-f1d8d0ffacdd")
        private static SmDependency ReturnDep = null;

        @objid ("b8d1c5e3-da81-4605-b4f1-e1f893f57922")
        private static SmDependency InstanciatingBindingDep = null;

        @objid ("8f44708a-ac13-4e54-8e69-f1080daa4ccb")
        private static SmDependency UsageDep = null;

        @objid ("2926a03f-7363-4cb7-b952-dfeb43599245")
        private static SmDependency TemplateDep = null;

        @objid ("04860b36-fd2f-4b9f-a6b8-7dbefb03907d")
        private static SmDependency CallerServiceTaskDep = null;

        @objid ("a5883d21-f16c-4bc7-bfef-1508af964232")
        private static SmDependency OccurenceDep = null;

        @objid ("38e893b7-850d-4187-a4b1-c31c928980d4")
        private static SmDependency InvokerDep = null;

        @objid ("c9edc034-a9b0-41e1-a503-e92f4399fd1a")
        private static SmDependency CommunicationUsageDep = null;

        @objid ("4c755cec-713d-4e56-b8d6-9f8c5eaf318c")
        private static SmDependency OwnedCollaborationUseDep = null;

        @objid ("da1d0c17-9afa-483a-a7fd-f59d6ef7f350")
        private static SmDependency RedefinesDep = null;

        @objid ("149d87f2-df29-4648-9578-3417ddcb338d")
        private static SmDependency CallerDep = null;

        @objid ("cec6c8e8-47c4-42e0-9a8c-7ec4ded27433")
        private static SmDependency CallingActionDep = null;

        @objid ("f96631d2-3a08-4e0f-95fb-7578747f1261")
        private static SmDependency EntryPointActionDep = null;

        @objid ("a0a729c1-69bc-4ccd-84ce-1aadbd1880f9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OperationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6b1b4846-7d1f-42c3-b424-cff1a4fbf021")
        public static SmAttribute ConcurrencyAtt() {
            if (ConcurrencyAtt == null) {
            	ConcurrencyAtt = classof().getAttributeDef("Concurrency");
            }
            return ConcurrencyAtt;
        }

        @objid ("aad58499-e88e-4084-a277-1c2a9303def2")
        public static SmAttribute FinalAtt() {
            if (FinalAtt == null) {
            	FinalAtt = classof().getAttributeDef("Final");
            }
            return FinalAtt;
        }

        @objid ("9cff3b90-f15b-49a6-9d3f-4bded8c167ee")
        public static SmAttribute PassingAtt() {
            if (PassingAtt == null) {
            	PassingAtt = classof().getAttributeDef("Passing");
            }
            return PassingAtt;
        }

        @objid ("878a0f95-ea02-4551-98e6-b32a160bb412")
        public static SmDependency OwnedImportDep() {
            if (OwnedImportDep == null) {
            	OwnedImportDep = classof().getDependencyDef("OwnedImport");
            }
            return OwnedImportDep;
        }

        @objid ("2e1ca848-a5cf-4784-9501-24be3b7f8cbd")
        public static SmDependency ThrownDep() {
            if (ThrownDep == null) {
            	ThrownDep = classof().getDependencyDef("Thrown");
            }
            return ThrownDep;
        }

        @objid ("98c009e9-a5ac-4a30-8214-600ad84bbbd7")
        public static SmDependency CallerReceiveTaskDep() {
            if (CallerReceiveTaskDep == null) {
            	CallerReceiveTaskDep = classof().getDependencyDef("CallerReceiveTask");
            }
            return CallerReceiveTaskDep;
        }

        @objid ("2e72fd8f-6500-46bb-b72b-5bf277e43d29")
        public static SmDependency RedefinitionDep() {
            if (RedefinitionDep == null) {
            	RedefinitionDep = classof().getDependencyDef("Redefinition");
            }
            return RedefinitionDep;
        }

        @objid ("299cf6e5-67b9-4dc1-9efd-85b15236e8b9")
        public static SmDependency ExampleDep() {
            if (ExampleDep == null) {
            	ExampleDep = classof().getDependencyDef("Example");
            }
            return ExampleDep;
        }

        @objid ("7f179ac3-e69c-45c6-abda-74e66804c0f5")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("0799acc7-7a3c-44c1-a900-4230511c1f33")
        public static SmDependency OwnedBehaviorDep() {
            if (OwnedBehaviorDep == null) {
            	OwnedBehaviorDep = classof().getDependencyDef("OwnedBehavior");
            }
            return OwnedBehaviorDep;
        }

        @objid ("0a2191dd-7c76-45c9-8bc0-1b3b88f110e2")
        public static SmDependency BpmnOperationRefDep() {
            if (BpmnOperationRefDep == null) {
            	BpmnOperationRefDep = classof().getDependencyDef("BpmnOperationRef");
            }
            return BpmnOperationRefDep;
        }

        @objid ("3e46ec3f-fea2-4d92-870a-8d6b30063185")
        public static SmDependency CallerSendTaskDep() {
            if (CallerSendTaskDep == null) {
            	CallerSendTaskDep = classof().getDependencyDef("CallerSendTask");
            }
            return CallerSendTaskDep;
        }

        @objid ("2d413721-5661-40ea-b8ed-aca951221a51")
        public static SmDependency IODep() {
            if (IODep == null) {
            	IODep = classof().getDependencyDef("IO");
            }
            return IODep;
        }

        @objid ("fd9c8ca3-9eba-4015-871a-5bd11a1ce5b0")
        public static SmDependency TemplateInstanciationDep() {
            if (TemplateInstanciationDep == null) {
            	TemplateInstanciationDep = classof().getDependencyDef("TemplateInstanciation");
            }
            return TemplateInstanciationDep;
        }

        @objid ("f31832fe-ea0d-4565-abfe-c4d95d56043a")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("065802bb-196f-420c-8675-04f36e3855b9")
        public static SmDependency OwnedPackageImportDep() {
            if (OwnedPackageImportDep == null) {
            	OwnedPackageImportDep = classof().getDependencyDef("OwnedPackageImport");
            }
            return OwnedPackageImportDep;
        }

        @objid ("66d32ace-3c52-4e21-bd17-e33e71ab7ed8")
        public static SmDependency ReturnDep() {
            if (ReturnDep == null) {
            	ReturnDep = classof().getDependencyDef("Return");
            }
            return ReturnDep;
        }

        @objid ("e9b2cee2-989b-4bb0-aac8-e9b2047f8208")
        public static SmDependency InstanciatingBindingDep() {
            if (InstanciatingBindingDep == null) {
            	InstanciatingBindingDep = classof().getDependencyDef("InstanciatingBinding");
            }
            return InstanciatingBindingDep;
        }

        @objid ("bb4939ef-05bc-471d-be5c-88b5b975f9b8")
        public static SmDependency UsageDep() {
            if (UsageDep == null) {
            	UsageDep = classof().getDependencyDef("Usage");
            }
            return UsageDep;
        }

        @objid ("5d8cef5b-5365-444c-bf33-484363550b7a")
        public static SmDependency TemplateDep() {
            if (TemplateDep == null) {
            	TemplateDep = classof().getDependencyDef("Template");
            }
            return TemplateDep;
        }

        @objid ("97969524-1e69-42db-a1eb-df1b4ce32803")
        public static SmDependency CallerServiceTaskDep() {
            if (CallerServiceTaskDep == null) {
            	CallerServiceTaskDep = classof().getDependencyDef("CallerServiceTask");
            }
            return CallerServiceTaskDep;
        }

        @objid ("9c377fc4-f23f-4794-9868-e2a0209a32ab")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("90540a22-597e-4d22-992c-9e1f69249ad2")
        public static SmDependency InvokerDep() {
            if (InvokerDep == null) {
            	InvokerDep = classof().getDependencyDef("Invoker");
            }
            return InvokerDep;
        }

        @objid ("741bc25f-ebed-4184-a400-9080458a3ee1")
        public static SmDependency CommunicationUsageDep() {
            if (CommunicationUsageDep == null) {
            	CommunicationUsageDep = classof().getDependencyDef("CommunicationUsage");
            }
            return CommunicationUsageDep;
        }

        @objid ("e2e1d198-4334-4bb7-8557-822287b08cdd")
        public static SmDependency OwnedCollaborationUseDep() {
            if (OwnedCollaborationUseDep == null) {
            	OwnedCollaborationUseDep = classof().getDependencyDef("OwnedCollaborationUse");
            }
            return OwnedCollaborationUseDep;
        }

        @objid ("106e4f76-e909-4a95-a531-a5219e466fe3")
        public static SmDependency RedefinesDep() {
            if (RedefinesDep == null) {
            	RedefinesDep = classof().getDependencyDef("Redefines");
            }
            return RedefinesDep;
        }

        @objid ("6df4092d-71fa-4601-8da3-fb4b895d42cc")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("ab50a052-4cad-40cc-8cb2-c6eb54d5482a")
        public static SmDependency CallingActionDep() {
            if (CallingActionDep == null) {
            	CallingActionDep = classof().getDependencyDef("CallingAction");
            }
            return CallingActionDep;
        }

        @objid ("f45ed55b-8138-4ac3-b2b0-10e5f529a6f2")
        public static SmDependency EntryPointActionDep() {
            if (EntryPointActionDep == null) {
            	EntryPointActionDep = classof().getDependencyDef("EntryPointAction");
            }
            return EntryPointActionDep;
        }

        @objid ("5488fe50-b515-4e1a-ac5e-7ba023a4aa1b")
        public static SmDependency getRedefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RedefinitionDep;
        }

        @objid ("79b1388d-e942-4e7c-a043-df3888825d93")
        public static SmDependency getOwnedImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedImportDep;
        }

        @objid ("3de482a8-55a8-420b-a93c-bb6fea292262")
        public static SmDependency getCallerServiceTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerServiceTaskDep;
        }

        @objid ("dbf054fb-5efb-4867-9092-6c360d1ab885")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("f947a517-fe44-4f28-9e1d-70fbc0ba59de")
        public static SmDependency getTemplateInstanciationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateInstanciationDep;
        }

        @objid ("0ea9a286-06b0-4f49-89a5-c23ecc2dc0aa")
        public static SmDependency getCommunicationUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CommunicationUsageDep;
        }

        @objid ("cfd0a243-760c-45ed-9163-3396b6e5d7a9")
        public static SmDependency getIODep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IODep;
        }

        @objid ("33c7de6a-5765-47eb-87ee-2120f1ff3d27")
        public static SmAttribute getConcurrencyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConcurrencyAtt;
        }

        @objid ("73e4016c-f460-49b3-af56-59c5791d195d")
        public static SmDependency getUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsageDep;
        }

        @objid ("a062a7f1-04f3-41dd-bdb6-9b489682ccd9")
        public static SmDependency getEntryPointActionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointActionDep;
        }

        @objid ("e523a4ea-85a7-44c8-8923-a14027bb40e6")
        public static SmDependency getTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateDep;
        }

        @objid ("7b5cb286-59e5-4660-a4b2-d7ed462a9452")
        public static SmDependency getReturnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReturnDep;
        }

        @objid ("3f1b619a-2c1d-494d-a652-62b2dab6fb3d")
        public static SmDependency getRedefinesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RedefinesDep;
        }

        @objid ("9476e1c2-1f73-459a-82c3-f0d71bf330f3")
        public static SmAttribute getPassingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PassingAtt;
        }

        @objid ("5a70e0df-e6dd-46a4-adab-c783dcbdbed2")
        public static SmDependency getOwnedPackageImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedPackageImportDep;
        }

        @objid ("564f94b3-675b-45ab-8080-4faa9808ffb6")
        public static SmDependency getBpmnOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnOperationRefDep;
        }

        @objid ("392baaf5-0ec5-4bd9-a1d5-56fc17980fd8")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("8535f8ad-a338-4395-8ea2-b838839a9667")
        public static SmDependency getOwnedBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedBehaviorDep;
        }

        @objid ("c681b0ba-54c3-4290-b8c0-6157a24b45e8")
        public static SmDependency getExampleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExampleDep;
        }

        @objid ("d6b433f5-13b9-4dc8-95ae-e7d1f1fad5f3")
        public static SmDependency getThrownDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrownDep;
        }

        @objid ("f187dbee-ed89-49af-bb59-80a3a263fd3b")
        public static SmDependency getInstanciatingBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatingBindingDep;
        }

        @objid ("8e9a960d-78ae-4843-bf51-b0eabc52153f")
        public static SmDependency getInvokerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokerDep;
        }

        @objid ("97a7f2cc-bac4-4969-924b-3c8e1d5a58d8")
        public static SmDependency getOwnedCollaborationUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationUseDep;
        }

        @objid ("261b2851-080c-44b1-b0de-6fd227900d6e")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("d63e1dd3-156d-4122-8e30-765db154afce")
        public static SmDependency getCallerReceiveTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerReceiveTaskDep;
        }

        @objid ("f5a19476-e394-4ffe-85e5-c1bed8cac839")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("8f4e3e55-8c55-40f8-be46-9ae08402fb10")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f0a4c16a-b37a-4d74-9e73-f27961887444")
        public static SmDependency getCallerSendTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerSendTaskDep;
        }

        @objid ("eea679f5-a98f-4676-9587-a7130e99fbbf")
        public static SmDependency getCallingActionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallingActionDep;
        }

        @objid ("768b0c7b-30ea-45a1-81da-257523737e94")
        public static SmAttribute getFinalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinalAtt;
        }

        @objid ("0008b808-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8955734f-be25-43ba-aef7-51a61750b59c")
            public ISmObjectData createData() {
                return new OperationData();
            }

            @objid ("a1985348-a815-471e-889f-a09526fafce1")
            public SmObjectImpl createImpl() {
                return new OperationImpl();
            }

        }

        @objid ("0009192e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConcurrencySmAttribute extends SmAttribute {
            @objid ("39e30269-1d4c-404f-98f4-3a7098b6168a")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mConcurrency;
            }

            @objid ("0dfaa6d4-db0e-456b-a618-81d24f777c97")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mConcurrency = value;
            }

        }

        @objid ("00097a18-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FinalSmAttribute extends SmAttribute {
            @objid ("c9949087-a76a-4b72-a205-3d1b296ae483")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mFinal;
            }

            @objid ("f5d7a158-eaab-4192-a245-8de71f7df2fb")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mFinal = value;
            }

        }

        @objid ("0009dbca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PassingSmAttribute extends SmAttribute {
            @objid ("4811e3eb-2f5c-4430-9225-31d0686a4a1c")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mPassing;
            }

            @objid ("aafa5446-81a9-4f3d-9b62-85924dd48726")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mPassing = value;
            }

        }

        @objid ("000a5262-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExampleSmDependency extends SmMultipleDependency {
            @objid ("a702184b-d79c-4b28-8758-53244fb86ff7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mExample != null)? ((OperationData)data).mExample:SmMultipleDependency.EMPTY;
            }

            @objid ("6ea3027b-2cf3-4d1f-bf32-b122408b5ff4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mExample = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mExample;
            }

            @objid ("e4b47429-180a-4a23-ab2d-052a4917b61d")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.ORepresentedDep();
            }

        }

        @objid ("000abdba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IOSmDependency extends SmMultipleDependency {
            @objid ("0c007fea-34c2-44d8-bad7-8433079e58cf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mIO != null)? ((OperationData)data).mIO:SmMultipleDependency.EMPTY;
            }

            @objid ("9e558410-e1de-4193-abb2-9633cfecfdb8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mIO = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mIO;
            }

            @objid ("41beba67-d568-4285-a134-1302c55a994a")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.ComposedDep();
            }

        }

        @objid ("000b24b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InstanciatingBindingSmDependency extends SmMultipleDependency {
            @objid ("e21c63f9-8094-46d4-8a17-5fa678309546")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mInstanciatingBinding != null)? ((OperationData)data).mInstanciatingBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("bec4eebb-2ce9-4eef-bada-a60601fa1e27")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mInstanciatingBinding = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mInstanciatingBinding;
            }

            @objid ("e5b1251e-f60c-4374-8f13-e57242a54bb2")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.InstanciatedTemplateOperationDep();
            }

        }

        @objid ("000b89f2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InvokerSmDependency extends SmMultipleDependency {
            @objid ("0ca29ac0-d99f-4a74-b46a-035c59f9a16e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mInvoker != null)? ((OperationData)data).mInvoker:SmMultipleDependency.EMPTY;
            }

            @objid ("82f4108e-8d7d-41a0-9069-100d3df83312")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mInvoker = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mInvoker;
            }

            @objid ("0dce0d64-1a25-4f32-ab35-6569a65083cc")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.ProcessedDep();
            }

        }

        @objid ("000bef3c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("73767efb-cb96-4a8d-b9c7-0acdfe43bbef")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOccurence != null)? ((OperationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("1af96176-1dca-4ffd-a425-5c12f9d039e9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOccurence;
            }

            @objid ("4dd20c83-7438-4d7c-8c38-f5a16968afe3")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.CalledDep();
            }

        }

        @objid ("000c62c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedBehaviorSmDependency extends SmMultipleDependency {
            @objid ("40b654e4-40b1-4828-89a7-b2cf7ae350b9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedBehavior != null)? ((OperationData)data).mOwnedBehavior:SmMultipleDependency.EMPTY;
            }

            @objid ("d5487eb7-52bd-419c-9af1-107cc0f28499")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedBehavior = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedBehavior;
            }

            @objid ("378b96af-41c8-44d7-85cd-593a730d4100")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnerOperationDep();
            }

        }

        @objid ("000cd4ba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationUseSmDependency extends SmMultipleDependency {
            @objid ("309f0c3e-437c-40bf-9923-4a98c17d865c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedCollaborationUse != null)? ((OperationData)data).mOwnedCollaborationUse:SmMultipleDependency.EMPTY;
            }

            @objid ("92955a84-b247-45b7-94c8-b86fd78f4e45")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedCollaborationUse = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedCollaborationUse;
            }

            @objid ("8fb9cfdd-287b-4f00-86bb-ccf08ae913c9")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.ORepresentedDep();
            }

        }

        @objid ("000d3bd0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedImportSmDependency extends SmMultipleDependency {
            @objid ("ae1d58f2-d7b6-4062-8efb-85daa6c52fe3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedImport != null)? ((OperationData)data).mOwnedImport:SmMultipleDependency.EMPTY;
            }

            @objid ("cb6dd65d-4fe1-41f7-885f-fac208353596")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedImport = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedImport;
            }

            @objid ("b911e6b5-1b78-4469-9732-7d155a1fc79e")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportingOperationDep();
            }

        }

        @objid ("000da8fe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedPackageImportSmDependency extends SmMultipleDependency {
            @objid ("d8b89ebc-a013-4b35-8ef3-84c3e890676d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedPackageImport != null)? ((OperationData)data).mOwnedPackageImport:SmMultipleDependency.EMPTY;
            }

            @objid ("d7992ffb-0291-406b-91da-c5a2e28a59b5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedPackageImport = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedPackageImport;
            }

            @objid ("1a64edf5-35cf-46fc-863e-998d26c96914")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportingOperationDep();
            }

        }

        @objid ("000e11ea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RedefinesSmDependency extends SmSingleDependency {
            @objid ("753bf39b-3d4c-4d44-9abf-66df5e603639")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mRedefines;
            }

            @objid ("10ecdb91-6b63-4471-a759-a46b490537b6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mRedefines = value;
            }

            @objid ("09f3e07c-9917-42d3-af68-6ddbdc09d39c")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.RedefinitionDep();
            }

        }

        @objid ("000e98fe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RedefinitionSmDependency extends SmMultipleDependency {
            @objid ("1e03b4cb-642b-4b0f-ac4d-ac49c22f8f32")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mRedefinition != null)? ((OperationData)data).mRedefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("f14584c9-2dc7-4478-b8ec-d682983751c3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mRedefinition = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mRedefinition;
            }

            @objid ("c7afd32b-ca69-42f9-b7f2-f80675617cdc")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.RedefinesDep();
            }

        }

        @objid ("000f0dde-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReturnSmDependency extends SmSingleDependency {
            @objid ("b60b185a-21f2-4799-824e-641bc86f4a57")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mReturn;
            }

            @objid ("e1d2c864-05df-4ffa-be0f-2a79c41328ae")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mReturn = value;
            }

            @objid ("8250033a-c8f8-4d6d-b549-685940ead03a")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.ReturnedDep();
            }

        }

        @objid ("000f8bce-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("f86c06f5-ed04-47e7-84bc-fe5ec34b2623")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mSRepresentation != null)? ((OperationData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("ae6479f4-3f38-4321-b9d4-2f449bd5fe33")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mSRepresentation;
            }

            @objid ("43647b66-1339-43ba-8d68-288eaf4ed7c5")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.OBaseDep();
            }

        }

        @objid ("000ffbea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TemplateSmDependency extends SmMultipleDependency {
            @objid ("2917fdca-df0c-4525-bdfe-6762609b942f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mTemplate != null)? ((OperationData)data).mTemplate:SmMultipleDependency.EMPTY;
            }

            @objid ("bf614782-c924-4048-853a-13487a8e4b44")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mTemplate = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mTemplate;
            }

            @objid ("c3960e5a-b3fb-493f-b69a-b497d151bc18")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterizedOperationDep();
            }

        }

        @objid ("00106882-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TemplateInstanciationSmDependency extends SmMultipleDependency {
            @objid ("1b66b624-8f35-417f-b18d-2009986d95d1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mTemplateInstanciation != null)? ((OperationData)data).mTemplateInstanciation:SmMultipleDependency.EMPTY;
            }

            @objid ("66f4a7c3-be27-4fe2-aef3-effe4dec13b5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mTemplateInstanciation = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mTemplateInstanciation;
            }

            @objid ("3f360d92-0fa6-40a5-8356-70cf30be49e7")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.BoundOperationDep();
            }

        }

        @objid ("0010dfd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ThrownSmDependency extends SmMultipleDependency {
            @objid ("b3f309b8-7743-4b05-9678-fdd808a0eb3b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mThrown != null)? ((OperationData)data).mThrown:SmMultipleDependency.EMPTY;
            }

            @objid ("92f4e34b-5522-4a23-beb6-83d97397567e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mThrown = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mThrown;
            }

            @objid ("cb29c6f7-8242-4763-8d21-facf3753c65a")
            @Override
            public SmDependency getSymetric() {
                return RaisedExceptionData.Metadata.ThrowerDep();
            }

        }

        @objid ("0011639a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class UsageSmDependency extends SmMultipleDependency {
            @objid ("a62ea086-fbb3-49ec-b657-ff96a8dfad12")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mUsage != null)? ((OperationData)data).mUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("c49ba2dc-7e2f-4e42-a5db-ebd4ecb3fd02")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mUsage = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mUsage;
            }

            @objid ("ddc3c076-224b-46c5-91d9-5bf539ec3958")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.InvokedDep();
            }

        }

        @objid ("0011d492-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryPointActionSmDependency extends SmMultipleDependency {
            @objid ("30f65819-1362-466a-8d63-7a048dcf37e9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mEntryPointAction != null)? ((OperationData)data).mEntryPointAction:SmMultipleDependency.EMPTY;
            }

            @objid ("41db2e0d-e9ca-416c-9084-f6534d8873f6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mEntryPointAction = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mEntryPointAction;
            }

            @objid ("8dd0a508-f114-4e64-913c-e2c58d1fffe2")
            @Override
            public SmDependency getSymetric() {
                return AcceptCallEventActionData.Metadata.CalledDep();
            }

        }

        @objid ("0012424c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CommunicationUsageSmDependency extends SmMultipleDependency {
            @objid ("686eb515-eb3a-499d-b791-44690975cdae")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCommunicationUsage != null)? ((OperationData)data).mCommunicationUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("9fb59dd5-4d1b-4c66-8e81-2a400b743a6b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCommunicationUsage = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCommunicationUsage;
            }

            @objid ("a88beaff-a164-4b6d-8f61-83fc7fb3ea8d")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.InvokedDep();
            }

        }

        @objid ("0012b5ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallingActionSmDependency extends SmMultipleDependency {
            @objid ("b76c2122-93c3-4265-90b8-b76e7282cf74")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallingAction != null)? ((OperationData)data).mCallingAction:SmMultipleDependency.EMPTY;
            }

            @objid ("f6de1a87-8377-453d-84a9-5c32c663924d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallingAction = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallingAction;
            }

            @objid ("04da6158-7a9f-4941-b2a0-a98fbb9d0d9c")
            @Override
            public SmDependency getSymetric() {
                return CallOperationActionData.Metadata.CalledDep();
            }

        }

        @objid ("00132540-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("535509dc-f811-452e-a18e-03c9f0cfdbde")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCaller != null)? ((OperationData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("4ef53432-516b-46a0-a8c0-4683caa3f665")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCaller;
            }

            @objid ("9d22b452-505d-4766-a7ea-b8083d7fb847")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledOperationDep();
            }

        }

        @objid ("0013a97a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BpmnOperationRefSmDependency extends SmMultipleDependency {
            @objid ("1818b288-7d5c-443b-a99f-e2cfc9f59c7e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mBpmnOperationRef != null)? ((OperationData)data).mBpmnOperationRef:SmMultipleDependency.EMPTY;
            }

            @objid ("98f7c21d-3128-4015-8373-066377da34e4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mBpmnOperationRef = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mBpmnOperationRef;
            }

            @objid ("4ebf65bb-ae4a-4c70-a242-33d73d289cac")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.ImplementationRefDep();
            }

        }

        @objid ("00142602-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSendTaskSmDependency extends SmMultipleDependency {
            @objid ("ef8eb453-b6cc-4465-8304-eb2acec9cf0c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerSendTask != null)? ((OperationData)data).mCallerSendTask:SmMultipleDependency.EMPTY;
            }

            @objid ("9bebee07-2300-40d8-a16e-3ece062b2d09")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerSendTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerSendTask;
            }

            @objid ("f7f5e956-ec0a-4514-a06f-f050c768733a")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("001497c2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerReceiveTaskSmDependency extends SmMultipleDependency {
            @objid ("4a8feccf-5120-4442-bc36-1e90f5694ee6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerReceiveTask != null)? ((OperationData)data).mCallerReceiveTask:SmMultipleDependency.EMPTY;
            }

            @objid ("66d15bba-053b-453d-bd01-be0dd91b2fc4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerReceiveTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerReceiveTask;
            }

            @objid ("479b9715-a55b-4dab-9c1f-812f9bac1b9a")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("00150e96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerServiceTaskSmDependency extends SmMultipleDependency {
            @objid ("6f765fe1-eca9-42f6-964b-904d3ab02ac9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerServiceTask != null)? ((OperationData)data).mCallerServiceTask:SmMultipleDependency.EMPTY;
            }

            @objid ("ecbcf28e-28af-445b-9806-e840356df7d0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerServiceTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerServiceTask;
            }

            @objid ("82b8b6a6-699d-4ba9-b805-6c9721a7a049")
            @Override
            public SmDependency getSymetric() {
                return BpmnServiceTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("00158074-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("18191771-b428-4182-a58f-37e65482dcb9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mOwner;
            }

            @objid ("52a46f10-7a5e-46f0-ad2c-97bdfb3f3c6f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mOwner = value;
            }

            @objid ("a9d29f0e-bb93-49a5-9553-0c11f6060b08")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedOperationDep();
            }

        }

    }

}
