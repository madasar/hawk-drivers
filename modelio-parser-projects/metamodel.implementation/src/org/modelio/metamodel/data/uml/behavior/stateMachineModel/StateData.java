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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataStateData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ConnectionPointReferenceData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.EntryPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ExitPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.InternalTransitionData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.RegionData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateMachineData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
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

@objid ("0053d27a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=State.class, factory=StateData.Metadata.ObjectFactory.class)
public class StateData extends StateVertexData {
    @objid ("d89ac4ef-bbe4-4ca7-bf4e-f0d81520f607")
    @SmaMetaAssociation(metaName="ExitPoint", typeDataClass=ExitPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.ExitPointSmDependency.class, component = true)
     List<SmObjectImpl> mExitPoint = null;

    @objid ("d3d6bb9c-c45d-4456-807f-8c134e5a6a8e")
    @SmaMetaAssociation(metaName="BpmnDataStateRefs", typeDataClass=BpmnDataStateData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnDataStateRefsSmDependency.class)
     List<SmObjectImpl> mBpmnDataStateRefs = null;

    @objid ("999fe401-4489-4f4d-a964-17bc593ebcba")
    @SmaMetaAssociation(metaName="Deffered", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.DefferedSmDependency.class, partof = true)
     List<SmObjectImpl> mDeffered = null;

    @objid ("28838d66-68db-4a22-b0d7-a7681e7fe799")
    @SmaMetaAssociation(metaName="Internal", typeDataClass=InternalTransitionData.class, min=0, max=-1, smAssociationClass=Metadata.InternalSmDependency.class, component = true)
     List<SmObjectImpl> mInternal = null;

    @objid ("1b0f68c4-9a71-45bb-8cde-8ab0bff75c00")
    @SmaMetaAssociation(metaName="EntryPoint", typeDataClass=EntryPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointSmDependency.class, component = true)
     List<SmObjectImpl> mEntryPoint = null;

    @objid ("029777c3-3d18-45b6-aa41-aee3397d3d81")
    @SmaMetaAssociation(metaName="OwnedRegion", typeDataClass=RegionData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRegionSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRegion = null;

    @objid ("21c7e701-ca30-4125-a87e-e081ba575a58")
    @SmaMetaAssociation(metaName="RequiredStateOfBpmnMessage", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfBpmnMessageSmDependency.class)
     List<SmObjectImpl> mRequiredStateOfBpmnMessage = null;

    @objid ("485a2815-7d75-4b0e-b67e-909b2a05e1af")
    @SmaMetaAssociation(metaName="RequiredStateOf", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfSmDependency.class)
     List<SmObjectImpl> mRequiredStateOf = null;

    @objid ("e0f6be55-ca9a-45db-a886-9fb4e0ee3485")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class, component = true)
     List<SmObjectImpl> mConnection = null;

    @objid ("0e5f33bd-66ad-4d7e-8614-2d2c8815a900")
    @SmaMetaAssociation(metaName="SubMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.SubMachineSmDependency.class, partof = true)
     SmObjectImpl mSubMachine;

    @objid ("cd3b6f2c-4fc0-44c2-acf5-466e1060f36c")
    @SmaMetaAssociation(metaName="RequiredStateOfBpmnItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfBpmnItemSmDependency.class)
     List<SmObjectImpl> mRequiredStateOfBpmnItem = null;

    @objid ("0402a1da-4142-4e1b-be02-379fc0c60704")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00045592-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("153da7d4-f224-4826-93e1-58178258d73f")
        private static SmClass smClass = null;

        @objid ("ca7ff1ea-04fd-461e-b461-c0fc30cd5a2c")
        private static SmDependency ExitPointDep = null;

        @objid ("bd859f92-241c-4e3a-b5f2-e2097069a082")
        private static SmDependency BpmnDataStateRefsDep = null;

        @objid ("8b31b1d0-1505-4793-88dd-8157f1fbe99b")
        private static SmDependency DefferedDep = null;

        @objid ("5fbfd05c-5f37-4862-93d6-2912b505c62c")
        private static SmDependency InternalDep = null;

        @objid ("0e907a7e-4978-432d-abab-934115c01bc5")
        private static SmDependency EntryPointDep = null;

        @objid ("9e74ead6-ec42-4655-8485-c0b83230ea77")
        private static SmDependency OwnedRegionDep = null;

        @objid ("be765374-4b4c-4063-81fa-2f351447efd5")
        private static SmDependency RequiredStateOfBpmnMessageDep = null;

        @objid ("71da5a9b-33fd-4655-b2bf-ff56d9d8f698")
        private static SmDependency RequiredStateOfDep = null;

        @objid ("bd716792-75b3-4de3-96ba-55202eea06a0")
        private static SmDependency ConnectionDep = null;

        @objid ("ab93618d-1796-4ae6-b0dc-dc76066bcad4")
        private static SmDependency SubMachineDep = null;

        @objid ("ea8aa685-2065-4f73-b1cc-31df706dbd49")
        private static SmDependency RequiredStateOfBpmnItemDep = null;

        @objid ("69dc4a0c-89d2-465d-b4fc-b81ce02d33b8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7f25138c-9237-4ad9-a5b8-00fc0246dfb9")
        public static SmDependency ExitPointDep() {
            if (ExitPointDep == null) {
            	ExitPointDep = classof().getDependencyDef("ExitPoint");
            }
            return ExitPointDep;
        }

        @objid ("86e10fcb-3004-431b-989c-20e1bf15db50")
        public static SmDependency BpmnDataStateRefsDep() {
            if (BpmnDataStateRefsDep == null) {
            	BpmnDataStateRefsDep = classof().getDependencyDef("BpmnDataStateRefs");
            }
            return BpmnDataStateRefsDep;
        }

        @objid ("63f18c58-f3cd-452b-aaa2-f2f353cfe2a2")
        public static SmDependency DefferedDep() {
            if (DefferedDep == null) {
            	DefferedDep = classof().getDependencyDef("Deffered");
            }
            return DefferedDep;
        }

        @objid ("de34a648-b985-4529-b316-3b2bdcc9e81a")
        public static SmDependency InternalDep() {
            if (InternalDep == null) {
            	InternalDep = classof().getDependencyDef("Internal");
            }
            return InternalDep;
        }

        @objid ("9d28c37a-3df6-473b-88bb-3255e1697435")
        public static SmDependency EntryPointDep() {
            if (EntryPointDep == null) {
            	EntryPointDep = classof().getDependencyDef("EntryPoint");
            }
            return EntryPointDep;
        }

        @objid ("aaf702bd-f675-4aa5-ba10-40c6e4fd9fe1")
        public static SmDependency OwnedRegionDep() {
            if (OwnedRegionDep == null) {
            	OwnedRegionDep = classof().getDependencyDef("OwnedRegion");
            }
            return OwnedRegionDep;
        }

        @objid ("bc4760c7-00c1-4181-975b-ef89bf6f1c30")
        public static SmDependency RequiredStateOfBpmnMessageDep() {
            if (RequiredStateOfBpmnMessageDep == null) {
            	RequiredStateOfBpmnMessageDep = classof().getDependencyDef("RequiredStateOfBpmnMessage");
            }
            return RequiredStateOfBpmnMessageDep;
        }

        @objid ("db6ce96f-3b1d-46e3-87b0-9bc260b640a9")
        public static SmDependency RequiredStateOfDep() {
            if (RequiredStateOfDep == null) {
            	RequiredStateOfDep = classof().getDependencyDef("RequiredStateOf");
            }
            return RequiredStateOfDep;
        }

        @objid ("c4fd575b-1746-4730-a18f-49e8f698f32b")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("ba84c7cb-7f65-4aa1-ad5b-874034dbd8e8")
        public static SmDependency SubMachineDep() {
            if (SubMachineDep == null) {
            	SubMachineDep = classof().getDependencyDef("SubMachine");
            }
            return SubMachineDep;
        }

        @objid ("f03a3e8f-caf4-4b62-a4d2-4d979832defb")
        public static SmDependency RequiredStateOfBpmnItemDep() {
            if (RequiredStateOfBpmnItemDep == null) {
            	RequiredStateOfBpmnItemDep = classof().getDependencyDef("RequiredStateOfBpmnItem");
            }
            return RequiredStateOfBpmnItemDep;
        }

        @objid ("abe417a4-97da-4636-9e1f-b32e96f25634")
        public static SmDependency getBpmnDataStateRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnDataStateRefsDep;
        }

        @objid ("ecc4db1e-562f-4909-8d78-6dd19ddd7f41")
        public static SmDependency getRequiredStateOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfDep;
        }

        @objid ("f68ee6ec-5d46-4c16-99de-2e209971f251")
        public static SmDependency getExitPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitPointDep;
        }

        @objid ("dc5d12a6-b6a3-4d15-ab96-2410e5c6140f")
        public static SmDependency getRequiredStateOfBpmnMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfBpmnMessageDep;
        }

        @objid ("8e926963-a588-400f-9788-9a77155208ba")
        public static SmDependency getDefferedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefferedDep;
        }

        @objid ("bbcf9b50-813e-4a36-9f14-d73bd42f0798")
        public static SmDependency getOwnedRegionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRegionDep;
        }

        @objid ("6a045550-feaf-424a-aed3-aed7a3d75d87")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9d45822b-295b-4bd5-b1c2-cb657d29dafd")
        public static SmDependency getSubMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubMachineDep;
        }

        @objid ("b5e94af6-ce86-4348-b165-025160aa814e")
        public static SmDependency getInternalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalDep;
        }

        @objid ("94d7812b-a424-4ea8-94a7-ecca24718689")
        public static SmDependency getRequiredStateOfBpmnItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfBpmnItemDep;
        }

        @objid ("71dfc840-9fd3-4df6-80fe-1d1360525c86")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("cd980c1e-a267-4b99-bf23-44c090b6f832")
        public static SmDependency getEntryPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointDep;
        }

        @objid ("000497f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79395be7-4840-4283-8626-b89d492bd28d")
            public ISmObjectData createData() {
                return new StateData();
            }

            @objid ("eee7c691-af23-4f1f-8daa-26372c7d2e1d")
            public SmObjectImpl createImpl() {
                return new StateImpl();
            }

        }

        @objid ("000502b2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("30a1f75a-a916-46ad-a339-84d19fb9e59e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mConnection != null)? ((StateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("984d0493-fb01-4969-8873-9b0c2adb0fd9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((StateData) data).mConnection;
            }

            @objid ("5af05aec-173d-4653-8e1a-65305bed894d")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.OwnerStateDep();
            }

        }

        @objid ("00056748-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefferedSmDependency extends SmMultipleDependency {
            @objid ("6a398baf-1141-4813-a99b-f484a229e3f7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mDeffered != null)? ((StateData)data).mDeffered:SmMultipleDependency.EMPTY;
            }

            @objid ("36f78d45-a286-4f15-92b0-c832913a48a2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mDeffered = new ArrayList<>(initialCapacity);
                return ((StateData) data).mDeffered;
            }

            @objid ("ca71b9e8-0ce5-4bbc-adfa-f69615534a3b")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.OriginDep();
            }

        }

        @objid ("0005caa8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InternalSmDependency extends SmMultipleDependency {
            @objid ("fca72045-c846-495c-a1d9-896d3c635298")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mInternal != null)? ((StateData)data).mInternal:SmMultipleDependency.EMPTY;
            }

            @objid ("e4048913-863b-4d7a-9404-467b070e6bde")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mInternal = new ArrayList<>(initialCapacity);
                return ((StateData) data).mInternal;
            }

            @objid ("3f038db5-1117-4695-b055-d71f069d772e")
            @Override
            public SmDependency getSymetric() {
                return InternalTransitionData.Metadata.SComposedDep();
            }

        }

        @objid ("000630a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedRegionSmDependency extends SmMultipleDependency {
            @objid ("b976a94b-6320-4b57-911b-016b47c437b8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mOwnedRegion != null)? ((StateData)data).mOwnedRegion:SmMultipleDependency.EMPTY;
            }

            @objid ("dd335cd5-b96e-4b35-b65e-f0fd200cff6f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mOwnedRegion = new ArrayList<>(initialCapacity);
                return ((StateData) data).mOwnedRegion;
            }

            @objid ("8747f01f-a318-4ba5-8dc3-874db5f23ae0")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.ParentDep();
            }

        }

        @objid ("000695e6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SubMachineSmDependency extends SmSingleDependency {
            @objid ("be7de6a6-0479-40b7-8035-23f16f80dde8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateData) data).mSubMachine;
            }

            @objid ("4c8d7781-ab6a-4e5b-a0dd-44a94250ac1c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateData) data).mSubMachine = value;
            }

            @objid ("8aac40ca-72f2-4548-a9b3-2e1d96dd28a6")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.SubmachineStateDep();
            }

        }

        @objid ("00070e2c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfSmDependency extends SmMultipleDependency {
            @objid ("8cdd85d9-392f-4ad7-b0f8-5ef9068e2a04")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOf != null)? ((StateData)data).mRequiredStateOf:SmMultipleDependency.EMPTY;
            }

            @objid ("930fe355-b1c3-41f9-ba95-fded779608bc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOf = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOf;
            }

            @objid ("6ac1aad3-ef3e-4381-84d2-9e6df06d47c5")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.InStateDep();
            }

        }

        @objid ("000782da-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EntryPointSmDependency extends SmMultipleDependency {
            @objid ("11ae60dd-0888-46a7-bcdd-fd091f12423d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mEntryPoint != null)? ((StateData)data).mEntryPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("9bd0a1ff-9c07-4c83-b2d1-bcc4fed746f0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mEntryPoint = new ArrayList<>(initialCapacity);
                return ((StateData) data).mEntryPoint;
            }

            @objid ("f5a3644c-037b-4a55-a50e-c4491519a5fa")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.EntryOfDep();
            }

        }

        @objid ("0007ed92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExitPointSmDependency extends SmMultipleDependency {
            @objid ("6b38352b-b1e2-4c5e-8e71-107c65cfbb48")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mExitPoint != null)? ((StateData)data).mExitPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("8406d7e6-492e-4908-93d4-8669e4fb01bf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mExitPoint = new ArrayList<>(initialCapacity);
                return ((StateData) data).mExitPoint;
            }

            @objid ("69ddf3dd-f40c-4e53-977d-76194f767c39")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ExitOfDep();
            }

        }

        @objid ("00085926-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnDataStateRefsSmDependency extends SmMultipleDependency {
            @objid ("afae21b3-cd69-4fe9-be25-8ed9660a7f50")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mBpmnDataStateRefs != null)? ((StateData)data).mBpmnDataStateRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("4c94efeb-22a2-4f26-a424-d765d6473f5b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mBpmnDataStateRefs = new ArrayList<>(initialCapacity);
                return ((StateData) data).mBpmnDataStateRefs;
            }

            @objid ("20e0d257-29f3-44b9-b29b-8db654dc4ffb")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataStateData.Metadata.UmlStateDep();
            }

        }

        @objid ("0008ca96-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfBpmnItemSmDependency extends SmMultipleDependency {
            @objid ("a9227551-9f47-47f4-b930-719986030ff7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOfBpmnItem != null)? ((StateData)data).mRequiredStateOfBpmnItem:SmMultipleDependency.EMPTY;
            }

            @objid ("cf200a14-1a86-4197-b856-15f5e0eae40a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOfBpmnItem = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOfBpmnItem;
            }

            @objid ("4f9a7015-2a1e-4a28-b59d-8b352cb6236a")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.InStateDep();
            }

        }

        @objid ("00093512-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfBpmnMessageSmDependency extends SmMultipleDependency {
            @objid ("4569ee3d-b3a6-4c6e-96fc-ea5d246bbc84")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOfBpmnMessage != null)? ((StateData)data).mRequiredStateOfBpmnMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("a38fff12-8d04-4978-a71d-aaca774dd052")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOfBpmnMessage = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOfBpmnMessage;
            }

            @objid ("7dc9a17e-5e6b-4c26-ba46-35709659bcce")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.InStateDep();
            }

        }

    }

}
