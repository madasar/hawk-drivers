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
package org.modelio.metamodel.data.uml.informationFlow;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityEdgeData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.NaryLinkData;
import org.modelio.metamodel.data.uml.statik.StructuralFeatureData;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowImpl;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
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

@objid ("0063bfb4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InformationFlow.class, factory=InformationFlowData.Metadata.ObjectFactory.class)
public class InformationFlowData extends ModelElementData {
    @objid ("c2ea1ae4-6792-4299-882c-62b773b9219b")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("d85354b6-53ab-4755-8788-5532a8cb96d4")
    @SmaMetaAssociation(metaName="InformationSource", typeDataClass=ModelElementData.class, min=1, max=-1, smAssociationClass=Metadata.InformationSourceSmDependency.class, partof = true)
     List<SmObjectImpl> mInformationSource = null;

    @objid ("cc320318-7ec4-4a18-9344-c823e4324b80")
    @SmaMetaAssociation(metaName="InformationTarget", typeDataClass=ModelElementData.class, min=1, max=-1, smAssociationClass=Metadata.InformationTargetSmDependency.class, partof = true)
     List<SmObjectImpl> mInformationTarget = null;

    @objid ("74c97cf7-76f5-4bb0-be56-0bbdfc9534c5")
    @SmaMetaAssociation(metaName="RealizingActivityEdge", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingActivityEdgeSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingActivityEdge = null;

    @objid ("9978cc18-4ad2-46cc-a863-a3dcc94572f8")
    @SmaMetaAssociation(metaName="RealizingCommunicationMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingCommunicationMessageSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingCommunicationMessage = null;

    @objid ("fc443b3b-04db-4b1e-8ad7-f317b1546772")
    @SmaMetaAssociation(metaName="RealizingFeature", typeDataClass=StructuralFeatureData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingFeatureSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingFeature = null;

    @objid ("107f82b8-7428-470e-8a2e-7c7b78e393de")
    @SmaMetaAssociation(metaName="RealizingLink", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingLinkSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingLink = null;

    @objid ("827f66ee-0527-4094-9076-a18835f42bd4")
    @SmaMetaAssociation(metaName="RealizingMessage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingMessageSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingMessage = null;

    @objid ("411e4095-f63a-4dc3-9e20-924dec6d9848")
    @SmaMetaAssociation(metaName="RealizingNaryLink", typeDataClass=NaryLinkData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingNaryLinkSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingNaryLink = null;

    @objid ("2160115e-49b1-49c4-8e0a-a5222a274638")
    @SmaMetaAssociation(metaName="Conveyed", typeDataClass=ClassifierData.class, min=1, max=-1, smAssociationClass=Metadata.ConveyedSmDependency.class, partof = true)
     List<SmObjectImpl> mConveyed = null;

    @objid ("54af0230-5af4-48f4-818d-6effeb02bcbf")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class, partof = true)
     SmObjectImpl mChannel;

    @objid ("ed10ab68-b7c3-4adf-b32f-b7ee62f0f43c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006afae0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6fd00308-f461-4d30-9bb5-b43e8b49de77")
        private static SmClass smClass = null;

        @objid ("f0c32ce0-8c74-42cd-8c44-0b85e3794fea")
        private static SmDependency OwnerDep = null;

        @objid ("34ec7b99-d950-4738-95c2-a5c239123b3a")
        private static SmDependency InformationSourceDep = null;

        @objid ("61dab56d-415b-4158-8b97-8fc19d3cd89c")
        private static SmDependency InformationTargetDep = null;

        @objid ("6eee4f76-3423-4f01-a23c-9ba63a03b3a5")
        private static SmDependency RealizingActivityEdgeDep = null;

        @objid ("1a166553-9670-4ab1-9725-8f5f13526e70")
        private static SmDependency RealizingCommunicationMessageDep = null;

        @objid ("d8312273-9962-456e-bb9e-e04be9802463")
        private static SmDependency RealizingFeatureDep = null;

        @objid ("25e476bc-e793-4d0b-80ed-8c9d28ffc7ff")
        private static SmDependency RealizingLinkDep = null;

        @objid ("fe01bfbd-77da-4d59-be76-9d59ce653e15")
        private static SmDependency RealizingMessageDep = null;

        @objid ("b02d6bce-4839-4760-a6cb-94f246db1e47")
        private static SmDependency RealizingNaryLinkDep = null;

        @objid ("3ecf1b49-4486-4382-b524-e87d9c43ccff")
        private static SmDependency ConveyedDep = null;

        @objid ("2a76da8e-9a02-4b8f-bcc9-49530cbac048")
        private static SmDependency ChannelDep = null;

        @objid ("be85f72d-062d-4fa8-be97-d2c0569f4030")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InformationFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("faed52fb-0eb5-4733-a407-bd6ed4052d6e")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("3ff04a7f-743a-4340-b5ce-ccff0250ac0e")
        public static SmDependency InformationSourceDep() {
            if (InformationSourceDep == null) {
            	InformationSourceDep = classof().getDependencyDef("InformationSource");
            }
            return InformationSourceDep;
        }

        @objid ("c72ad6f5-493e-4591-be6c-99ff57c04d61")
        public static SmDependency InformationTargetDep() {
            if (InformationTargetDep == null) {
            	InformationTargetDep = classof().getDependencyDef("InformationTarget");
            }
            return InformationTargetDep;
        }

        @objid ("b314357c-6ba2-49fb-8892-dd26ef35839c")
        public static SmDependency RealizingActivityEdgeDep() {
            if (RealizingActivityEdgeDep == null) {
            	RealizingActivityEdgeDep = classof().getDependencyDef("RealizingActivityEdge");
            }
            return RealizingActivityEdgeDep;
        }

        @objid ("0580b41a-ee76-4b17-b798-195819db36b7")
        public static SmDependency RealizingCommunicationMessageDep() {
            if (RealizingCommunicationMessageDep == null) {
            	RealizingCommunicationMessageDep = classof().getDependencyDef("RealizingCommunicationMessage");
            }
            return RealizingCommunicationMessageDep;
        }

        @objid ("1bdbdb93-0715-432e-9cfd-284d8dafb0fc")
        public static SmDependency RealizingFeatureDep() {
            if (RealizingFeatureDep == null) {
            	RealizingFeatureDep = classof().getDependencyDef("RealizingFeature");
            }
            return RealizingFeatureDep;
        }

        @objid ("9318aed1-956c-4e11-b762-af2887a2428f")
        public static SmDependency RealizingLinkDep() {
            if (RealizingLinkDep == null) {
            	RealizingLinkDep = classof().getDependencyDef("RealizingLink");
            }
            return RealizingLinkDep;
        }

        @objid ("823797b7-a23a-441f-873a-8bf96b8f5353")
        public static SmDependency RealizingMessageDep() {
            if (RealizingMessageDep == null) {
            	RealizingMessageDep = classof().getDependencyDef("RealizingMessage");
            }
            return RealizingMessageDep;
        }

        @objid ("a9af6789-72f2-4e54-82fd-385231568ce4")
        public static SmDependency RealizingNaryLinkDep() {
            if (RealizingNaryLinkDep == null) {
            	RealizingNaryLinkDep = classof().getDependencyDef("RealizingNaryLink");
            }
            return RealizingNaryLinkDep;
        }

        @objid ("2842521a-8428-407c-a7e9-4b776b056a45")
        public static SmDependency ConveyedDep() {
            if (ConveyedDep == null) {
            	ConveyedDep = classof().getDependencyDef("Conveyed");
            }
            return ConveyedDep;
        }

        @objid ("8215b219-bada-41dc-8faf-325f4b777e3a")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("93a4714c-fafb-47ec-b87f-c0e0a175fbb6")
        public static SmDependency getInformationTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InformationTargetDep;
        }

        @objid ("2710fe63-b8ef-442a-8a57-e0bd0ec2514f")
        public static SmDependency getRealizingMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingMessageDep;
        }

        @objid ("e81b6648-fa9c-4a9b-9275-cf8b2368443b")
        public static SmDependency getConveyedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConveyedDep;
        }

        @objid ("ac139cde-b54b-45c1-add2-c4e52db2cfe8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6ab47150-bbde-49ba-97cf-d6439a64d155")
        public static SmDependency getRealizingActivityEdgeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingActivityEdgeDep;
        }

        @objid ("31987821-6404-47c3-8f8b-8d5da1b3619b")
        public static SmDependency getRealizingCommunicationMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingCommunicationMessageDep;
        }

        @objid ("4411c4c9-b03e-4fd3-85de-282f516a4c42")
        public static SmDependency getRealizingNaryLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingNaryLinkDep;
        }

        @objid ("7e0b295f-3939-4f7f-b5ee-22c13d61a0ca")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("699ad670-c2e9-48af-92b8-21784e72c32e")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("0451e0cc-2960-4ee2-b71d-af73d60f4430")
        public static SmDependency getInformationSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InformationSourceDep;
        }

        @objid ("389c3852-0a57-49eb-9050-bdc53c9fca17")
        public static SmDependency getRealizingLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingLinkDep;
        }

        @objid ("09508a4c-eff8-4e02-b5d3-4d32a7e8f658")
        public static SmDependency getRealizingFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingFeatureDep;
        }

        @objid ("006b3c30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("55585229-6218-4514-8787-399e14f3b7bd")
            public ISmObjectData createData() {
                return new InformationFlowData();
            }

            @objid ("5ca9b0bd-e873-41c6-be17-be67b5c02799")
            public SmObjectImpl createImpl() {
                return new InformationFlowImpl();
            }

        }

        @objid ("006ba0c6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingLinkSmDependency extends SmMultipleDependency {
            @objid ("35d99e26-8e33-4814-8a38-1b567da98417")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingLink != null)? ((InformationFlowData)data).mRealizingLink:SmMultipleDependency.EMPTY;
            }

            @objid ("21c55091-0dc2-468c-a984-4991749af426")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingLink = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingLink;
            }

            @objid ("6cd00dac-6b2d-471a-ac78-639907f555b6")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006c0372-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingFeatureSmDependency extends SmMultipleDependency {
            @objid ("bf02b3cd-0f61-4d2c-bd7b-44cc3b94dbeb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingFeature != null)? ((InformationFlowData)data).mRealizingFeature:SmMultipleDependency.EMPTY;
            }

            @objid ("1c2466f4-4398-4731-9668-148ccdc1b99e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingFeature = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingFeature;
            }

            @objid ("412926a7-4663-461d-8698-f2b7324e6e16")
            @Override
            public SmDependency getSymetric() {
                return StructuralFeatureData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006d4caa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingActivityEdgeSmDependency extends SmMultipleDependency {
            @objid ("52d0ba67-7dcb-4780-944b-3a59cf55257b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingActivityEdge != null)? ((InformationFlowData)data).mRealizingActivityEdge:SmMultipleDependency.EMPTY;
            }

            @objid ("dd345f72-7dc3-4b0c-a400-ca6696bdfd11")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingActivityEdge = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingActivityEdge;
            }

            @objid ("d20d8a01-144a-4a94-b169-073e0feaa4a2")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006dc00e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingMessageSmDependency extends SmMultipleDependency {
            @objid ("5a904b09-6d0a-4ccb-8c4a-2f27f1cd1cf2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingMessage != null)? ((InformationFlowData)data).mRealizingMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("b16a1ce9-5db9-4fba-94e1-b2a233d75c73")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingMessage = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingMessage;
            }

            @objid ("6514ef47-3744-4cc5-b2ad-2168156a1d4d")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006e2ddc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConveyedSmDependency extends SmMultipleDependency {
            @objid ("2c7bb6d5-0ef8-48a4-9b06-5ccc69c18129")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mConveyed != null)? ((InformationFlowData)data).mConveyed:SmMultipleDependency.EMPTY;
            }

            @objid ("81e9d59f-d50a-4a20-ab22-9ac1790dc601")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mConveyed = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mConveyed;
            }

            @objid ("0dd427d0-9fd9-45f8-9e66-ad4c28cf2752")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.ConveyerDep();
            }

        }

        @objid ("006e947a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InformationTargetSmDependency extends SmMultipleDependency {
            @objid ("4407b107-a3eb-4fa9-b692-c038e6934393")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mInformationTarget != null)? ((InformationFlowData)data).mInformationTarget:SmMultipleDependency.EMPTY;
            }

            @objid ("ea28364b-7424-4a0d-acfa-0d9494e9cf84")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mInformationTarget = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mInformationTarget;
            }

            @objid ("93b4548a-0b65-449f-ac4a-d11f5e6b2080")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ReceivedInfoDep();
            }

        }

        @objid ("006efa0a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InformationSourceSmDependency extends SmMultipleDependency {
            @objid ("2c86545c-e7bd-48ed-960b-2c589c8f7350")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mInformationSource != null)? ((InformationFlowData)data).mInformationSource:SmMultipleDependency.EMPTY;
            }

            @objid ("b90d2aa7-887e-4c5d-b3ff-66b86359b425")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mInformationSource = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mInformationSource;
            }

            @objid ("719e226d-ae03-469d-aed4-b5dca4d67082")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.SentInfoDep();
            }

        }

        @objid ("006f676a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("3f95b189-4da4-46f0-b73d-4ba1872a7d24")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InformationFlowData) data).mOwner;
            }

            @objid ("397b9287-205d-4fe1-ae6a-33bd94dd061d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InformationFlowData) data).mOwner = value;
            }

            @objid ("33f74148-88c4-4aa9-b3a4-ceef3c2ef375")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedInformationFlowDep();
            }

        }

        @objid ("006fe096-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingCommunicationMessageSmDependency extends SmMultipleDependency {
            @objid ("79fabf9e-73dc-445e-bcfc-81ab7dd0cb82")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingCommunicationMessage != null)? ((InformationFlowData)data).mRealizingCommunicationMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("6e1ed006-bc90-4738-a1fd-9b4f96ed1610")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingCommunicationMessage = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingCommunicationMessage;
            }

            @objid ("2e42efb6-1868-44cb-ae84-78b7ecb7b5c6")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("00704798-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("c950f04e-5b69-4278-8e85-1c2a54c8767b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InformationFlowData) data).mChannel;
            }

            @objid ("037c161d-894d-430e-bc9b-a73ea3f91af6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InformationFlowData) data).mChannel = value;
            }

            @objid ("4834b6e4-f609-4fa0-a32a-687491fd0f6d")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.SentDep();
            }

        }

        @objid ("0070139a-17f2-10a1-88a0-001ec947cd2a")
        public static class RealizingNaryLinkSmDependency extends SmMultipleDependency {
            @objid ("75e2d1be-da4f-44a9-977b-c133170938a2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingNaryLink != null)? ((InformationFlowData)data).mRealizingNaryLink:SmMultipleDependency.EMPTY;
            }

            @objid ("a5db6849-34f2-4e7a-a34d-ef40972595a0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingNaryLink = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingNaryLink;
            }

            @objid ("a26affba-c6f1-4de9-8e06-4111a39ddb70")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.RealizedInformationFlowDep();
            }

        }

    }

}
