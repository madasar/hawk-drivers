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
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationInteractionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationNodeImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
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

@objid ("005adeee-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CommunicationNode.class, factory=CommunicationNodeData.Metadata.ObjectFactory.class)
public class CommunicationNodeData extends ModelElementData {
    @objid ("404fe92d-506e-4a61-b0bf-5b35150312fd")
    @SmaMetaAttribute(metaName="Selector", type=String.class, smAttributeClass=Metadata.SelectorSmAttribute.class)
     Object mSelector = "";

    @objid ("aee5ffbc-5827-44bf-875e-f2f7758d0b9d")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=CommunicationInteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("b9cfa9b9-33d2-46a5-af02-25642d61925a")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("5ce22e93-7089-44d8-bd54-ed96fd1c60cc")
    @SmaMetaAssociation(metaName="Started", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.StartedSmDependency.class, component = true, istodelete = true)
     List<SmObjectImpl> mStarted = null;

    @objid ("b5756346-8943-4f1e-bf79-fc1a1c15fe0f")
    @SmaMetaAssociation(metaName="Ended", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.EndedSmDependency.class, istodelete = true)
     List<SmObjectImpl> mEnded = null;

    @objid ("ad6d0975-9281-4729-92e9-cb1d9428607a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050be1e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b9190925-8c65-4677-8c37-1a8fd5289353")
        private static SmClass smClass = null;

        @objid ("5c2e31a3-758f-48c6-bce7-e5734914dd9d")
        private static SmAttribute SelectorAtt = null;

        @objid ("d9f3888e-c814-413d-9c6b-619a904d025a")
        private static SmDependency OwnerDep = null;

        @objid ("47bfbc04-d8e9-4656-a9e8-45fb83bc0119")
        private static SmDependency RepresentedDep = null;

        @objid ("5f0a11df-8734-4e5b-addd-bd33348df088")
        private static SmDependency StartedDep = null;

        @objid ("3e992438-e1bc-4733-a679-871d2ad55450")
        private static SmDependency EndedDep = null;

        @objid ("1b664f33-19f9-4253-925b-5e99e7a1286e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0214cc2f-55b8-4a50-a97b-cb6fff9ab77c")
        public static SmAttribute SelectorAtt() {
            if (SelectorAtt == null) {
            	SelectorAtt = classof().getAttributeDef("Selector");
            }
            return SelectorAtt;
        }

        @objid ("b7d8a3c4-a9e4-4d25-865c-5fd786c4fb2a")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("b134544d-280a-4035-bd92-ac420c43bab4")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("f6791126-2468-48f4-b1ea-626e0ec27ad9")
        public static SmDependency StartedDep() {
            if (StartedDep == null) {
            	StartedDep = classof().getDependencyDef("Started");
            }
            return StartedDep;
        }

        @objid ("32e248ad-c3ee-4f7a-82af-5e831cd9c1ec")
        public static SmDependency EndedDep() {
            if (EndedDep == null) {
            	EndedDep = classof().getDependencyDef("Ended");
            }
            return EndedDep;
        }

        @objid ("512f45a3-aa39-4da9-a163-0a091b3a253e")
        public static SmDependency getEndedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndedDep;
        }

        @objid ("a34ab515-ef1f-478d-96dd-a010fd5d7898")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("8c0a9f97-9609-4f07-aa67-d77108c6b352")
        public static SmDependency getStartedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartedDep;
        }

        @objid ("62d1e037-ac90-4594-8c70-22ef77fb35d3")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("6adfb525-cd70-4ee4-b507-960c8bc8f4a7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dcceb668-0d10-4e56-883d-d28829df7ab0")
        public static SmAttribute getSelectorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectorAtt;
        }

        @objid ("0050ff00-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79cc422d-ee4c-47a5-ad5d-580c24ded05d")
            public ISmObjectData createData() {
                return new CommunicationNodeData();
            }

            @objid ("949ea785-7777-4c40-8d12-0ea1ef26209e")
            public SmObjectImpl createImpl() {
                return new CommunicationNodeImpl();
            }

        }

        @objid ("005160ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SelectorSmAttribute extends SmAttribute {
            @objid ("b01b4fda-c43e-45d6-ad14-878296fd7bc5")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mSelector;
            }

            @objid ("59240679-e5d3-4724-9997-0ca392d77ade")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationNodeData) data).mSelector = value;
            }

        }

        @objid ("0051d042-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("85c33773-6afc-489a-a35a-da4c547e5937")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mOwner;
            }

            @objid ("2f6e6bf9-0c76-4ec5-bf43-efbfbe897a8d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationNodeData) data).mOwner = value;
            }

            @objid ("f89ba8ff-3909-4706-86a7-daac0a64dbea")
            @Override
            public SmDependency getSymetric() {
                return CommunicationInteractionData.Metadata.OwnedDep();
            }

        }

        @objid ("00524cd4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("4246003a-6f3d-43c9-a815-17ad8e4357e7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mRepresented;
            }

            @objid ("ed0e4c80-4000-49d7-bf21-b622c6327c81")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationNodeData) data).mRepresented = value;
            }

            @objid ("485f1219-451e-4909-a234-f1f4daf6833a")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentedCommunicationNodeDep();
            }

        }

        @objid ("0052c1f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartedSmDependency extends SmMultipleDependency {
            @objid ("41c06e92-1c17-4198-a2ec-666453129fa0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationNodeData)data).mStarted != null)? ((CommunicationNodeData)data).mStarted:SmMultipleDependency.EMPTY;
            }

            @objid ("36ee4ce9-a40b-4248-ba77-a67f215557eb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationNodeData) data).mStarted = new ArrayList<>(initialCapacity);
                return ((CommunicationNodeData) data).mStarted;
            }

            @objid ("fa882c37-9b6c-4410-9851-4583e7676a1e")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.StartDep();
            }

        }

        @objid ("00532820-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndedSmDependency extends SmMultipleDependency {
            @objid ("6377d9c2-9a99-4d86-a890-d18fa01a2ad8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationNodeData)data).mEnded != null)? ((CommunicationNodeData)data).mEnded:SmMultipleDependency.EMPTY;
            }

            @objid ("63fc20fb-f1fe-4c4e-a45d-3ecb306ee711")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationNodeData) data).mEnded = new ArrayList<>(initialCapacity);
                return ((CommunicationNodeData) data).mEnded;
            }

            @objid ("bb94a054-1af6-48da-8fd5-ba76ff36819f")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.EndDep();
            }

        }

    }

}
