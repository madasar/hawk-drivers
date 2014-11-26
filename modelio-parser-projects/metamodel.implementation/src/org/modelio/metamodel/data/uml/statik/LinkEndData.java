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
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.data.uml.statik.LinkData;
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.statik.LinkEndImpl;
import org.modelio.metamodel.uml.statik.LinkEnd;
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

@objid ("001037c2-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=LinkEnd.class, factory=LinkEndData.Metadata.ObjectFactory.class)
public class LinkEndData extends ModelElementData {
    @objid ("3791f452-db09-4b19-943e-069243c6677a")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("77eab278-f41c-479a-8e45-56aac156277c")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("7974ebbb-188d-4456-9698-b207914c2287")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("81bdd73c-bf8b-477f-885b-66769ce663bf")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("7be7e629-9ee9-4728-9683-35b1b98a6454")
    @SmaMetaAssociation(metaName="Link", typeDataClass=LinkData.class, min=0, max=1, smAssociationClass=Metadata.LinkSmDependency.class, sharedComponent = true)
     SmObjectImpl mLink;

    @objid ("5cbc188f-fb39-49e7-8d01-0e85cd3b9cb1")
    @SmaMetaAssociation(metaName="Target", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("82e45a52-337d-4e1c-b69d-eb689aad8873")
    @SmaMetaAssociation(metaName="OppositeOwner", typeDataClass=LinkEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeOwnerSmDependency.class)
     SmObjectImpl mOppositeOwner;

    @objid ("e16ecc07-caaa-4ee4-80e4-aacfe485b465")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("2d1cf31c-cf8e-4e72-b9f5-783a615b2772")
    @SmaMetaAssociation(metaName="Model", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("019215b9-af27-4f4e-ab7d-f4cf85ee8e85")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=RequiredInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ConsumerSmDependency.class, partof = true)
     SmObjectImpl mConsumer;

    @objid ("1feba286-ed30-45a7-994e-ebc7bb5c8a49")
    @SmaMetaAssociation(metaName="Opposite", typeDataClass=LinkEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeSmDependency.class, sharedComponent = true)
     SmObjectImpl mOpposite;

    @objid ("6148a40e-41c6-49e4-8f57-481284bc30ad")
    @SmaMetaAssociation(metaName="Source", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.SourceSmDependency.class, partof = true)
     SmObjectImpl mSource;

    @objid ("e99cc526-347d-4ddb-b20a-219e46b470da")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=ProvidedInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ProviderSmDependency.class, partof = true)
     SmObjectImpl mProvider;

    @objid ("a1105c6b-7beb-480b-b286-39d70c6bb8be")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0079d614-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("20ae167f-f801-4b7a-9471-8ac25c8b3edc")
        private static SmClass smClass = null;

        @objid ("69ea4106-53f4-4a7a-a930-15d6572aa145")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("2f494133-607e-42ee-a32a-8507c3076565")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("d5a252d2-8586-4962-a9a3-b4ac73f9e051")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("bd05a7e4-2572-467c-992e-2421534d06b5")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("ac9c7aae-f3a6-4af7-a82e-e35a910fba13")
        private static SmDependency LinkDep = null;

        @objid ("63adca5c-6a8a-4d87-a6c2-23084798ad27")
        private static SmDependency TargetDep = null;

        @objid ("e648e91a-112c-407b-984c-e6cd7585cf25")
        private static SmDependency OppositeOwnerDep = null;

        @objid ("60f4f982-f98c-4894-8d97-a8a081d485c1")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("6a27e8c5-233f-46c4-8fae-d0efb1533060")
        private static SmDependency ModelDep = null;

        @objid ("4654630f-8ca8-47b8-860e-07866574a552")
        private static SmDependency ConsumerDep = null;

        @objid ("93da0dca-e4b6-4f73-b338-58bb2d3adfb7")
        private static SmDependency OppositeDep = null;

        @objid ("39d8a3c3-62ab-45d2-8351-56fdc393801e")
        private static SmDependency SourceDep = null;

        @objid ("942dedc8-a67b-41e4-841c-502b30736a18")
        private static SmDependency ProviderDep = null;

        @objid ("eb2046d2-ab95-4daa-842d-5a8ffb8b485b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LinkEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("18c51cc7-67c0-4cee-8d2a-ba101f10a3d3")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("305710e5-8d51-4d98-946d-caf38c931838")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("0e9413ed-e505-46a0-af50-794c3bea8bfc")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("e70f1705-46d7-4828-a3a9-b9572c3f8ad7")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("719e9cb4-24c6-4321-968c-4ada011048b5")
        public static SmDependency LinkDep() {
            if (LinkDep == null) {
            	LinkDep = classof().getDependencyDef("Link");
            }
            return LinkDep;
        }

        @objid ("3845882c-4a1d-4950-be7d-96122a1ab021")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("e73bf009-96a7-43d5-b63c-5a0a1f056d29")
        public static SmDependency OppositeOwnerDep() {
            if (OppositeOwnerDep == null) {
            	OppositeOwnerDep = classof().getDependencyDef("OppositeOwner");
            }
            return OppositeOwnerDep;
        }

        @objid ("1249f641-07e6-4388-8764-bb5db5d1c3b1")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("ab07c7b1-b54f-4ccd-b1d5-52761484ffb8")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("761fed45-ba64-415e-bbcd-7acbd1a2b117")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("14306144-50d1-4b0d-bf64-e9199e7bef27")
        public static SmDependency OppositeDep() {
            if (OppositeDep == null) {
            	OppositeDep = classof().getDependencyDef("Opposite");
            }
            return OppositeDep;
        }

        @objid ("161c8c9b-fdb6-42c6-81f6-bdb4c212e306")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("ae1698ac-b30c-46ea-89b4-bab2427afa36")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("f4f57c43-7b75-4083-b524-3cbd9029739f")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("94b9e40a-122b-448a-8151-d560b3f2d7a4")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("35413fcd-7cd7-4253-8099-bc7d480ba296")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("972cf307-42be-4754-a360-faebda41272f")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("0799bf8a-1b68-4854-a00d-20046dfac637")
        public static SmDependency getLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkDep;
        }

        @objid ("70ce3373-d368-42e3-b9df-1da188ddd079")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("e99e438e-8652-4b37-9051-187c5189fa6d")
        public static SmDependency getOppositeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeDep;
        }

        @objid ("e0987db6-10db-42b9-b071-76d0a24d6d21")
        public static SmDependency getOppositeOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeOwnerDep;
        }

        @objid ("3c449e20-351d-4a0b-87ce-dd3694451e18")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("189efb5a-1373-4d6b-beb7-75b98b54228c")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("ca200d8d-abcd-4a85-8243-dd77106b5b9c")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("ad04f86d-7284-49ee-8a9a-bc9d27aa40c3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("69e1e905-3add-4102-9f8b-962f786c684f")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("af2f0171-3701-4c07-af57-1e0e73cbeed2")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("007a2af6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2efcf391-2290-4acc-874e-b599dd887263")
            public ISmObjectData createData() {
                return new LinkEndData();
            }

            @objid ("19cd54b1-f466-4f5e-b96c-47e92d93b7de")
            public SmObjectImpl createImpl() {
                return new LinkEndImpl();
            }

        }

        @objid ("007b16fa-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("18023146-3c6d-4222-a703-0e9cedc89fb0")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mIsOrdered;
            }

            @objid ("162f6179-8529-45a2-83a8-452d444aa089")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mIsOrdered = value;
            }

        }

        @objid ("007b8158-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("aacadada-8912-4e9d-a783-93a69ad7fef0")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mIsUnique;
            }

            @objid ("bf59d656-ca05-4a87-a9eb-a798ce2e9d0a")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mIsUnique = value;
            }

        }

        @objid ("007be396-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("4e64793d-ac51-4793-89d0-3aec3cccdfd4")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mMultiplicityMax;
            }

            @objid ("23a009a8-ada3-4644-979a-211285f47531")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mMultiplicityMax = value;
            }

        }

        @objid ("007c4516-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("d128d2f4-23b2-46b2-b045-1674451e59cb")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mMultiplicityMin;
            }

            @objid ("a91161e2-060c-4a8e-b13b-515a0d1e1221")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mMultiplicityMin = value;
            }

        }

        @objid ("007caa7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConsumerSmDependency extends SmSingleDependency {
            @objid ("c64dd059-f25b-4a06-a70a-96a308142f19")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mConsumer;
            }

            @objid ("d57dbcec-637f-44a3-889c-c6dce55cf0a8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mConsumer = value;
            }

            @objid ("9b387a99-1fa3-4aba-9325-01fb81d73a33")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.ProviderDep();
            }

        }

        @objid ("007d9786-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("ff7169d2-9bd9-42c2-80e4-c868f5899695")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mModel;
            }

            @objid ("f62d71bf-da30-4c72-8ab7-dd257a3bb7a1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mModel = value;
            }

            @objid ("f7ddb5d7-47d6-490d-9d98-7242c6489241")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OccurenceDep();
            }

        }

        @objid ("007e1c10-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProviderSmDependency extends SmSingleDependency {
            @objid ("9301afe2-7003-43a1-9f9d-d20fc1685bc8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mProvider;
            }

            @objid ("846c19c6-de18-45b2-a9cd-ff6d443ebf97")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mProvider = value;
            }

            @objid ("f1a3ca24-60fa-412e-83e7-19cfdc7791fe")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ConsumerDep();
            }

        }

        @objid ("007f0526-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("9268e0ab-dddb-4f32-8243-fdec2ba10077")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LinkEndData)data).mRealizedInformationFlow != null)? ((LinkEndData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("6347a34a-710a-40e4-91e3-3c1b03db1a3a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LinkEndData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((LinkEndData) data).mRealizedInformationFlow;
            }

            @objid ("864d5740-199f-42fd-9bcf-817a8f9de5ea")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingLinkDep();
            }

        }

        @objid ("0030b858-18c8-1080-943a-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("9fa2faa4-86c8-4203-a09c-7930589dfa67")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mSource;
            }

            @objid ("fdcaebb6-b91d-4a86-9d18-24fa596cdc17")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mSource = value;
            }

            @objid ("f9ce8148-eb9c-4c65-9c35-38358e9ec60c")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnedEndDep();
            }

        }

        @objid ("0032eac4-18c8-1080-943a-001ec947cd2a")
        public static class OppositeSmDependency extends SmSingleDependency {
            @objid ("5e8357d2-2b3f-43b5-bc7f-44708e6e7991")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mOpposite;
            }

            @objid ("f4909458-57de-4ad6-b6bd-eb99de2ca729")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mOpposite = value;
            }

            @objid ("8e6ee55c-7bd8-4ec1-85e9-7c7d2c60652e")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.OppositeOwnerDep();
            }

        }

        @objid ("00339c62-18c8-1080-943a-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("1b016372-ec5a-4c14-88ef-17b06f07b676")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mTarget;
            }

            @objid ("1313f176-ec33-4c71-a985-604fe47ad4f0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mTarget = value;
            }

            @objid ("accd6cb5-cbb1-4e41-ba70-21301aade9cb")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.TargetingEndDep();
            }

        }

        @objid ("00934572-7aa2-10a2-abe4-001ec947cd2a")
        public static class OppositeOwnerSmDependency extends SmSingleDependency {
            @objid ("9cbfaeff-add7-4e14-8660-da9d6099dc89")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mOppositeOwner;
            }

            @objid ("f87eac1e-6cbf-4fbe-a667-d3c2504f9260")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mOppositeOwner = value;
            }

            @objid ("7053fa35-a374-44f2-876b-5b587ab755e0")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.OppositeDep();
            }

        }

        @objid ("bdd20b30-8417-4bd1-8e9c-0b4efa7811d6")
        public static class LinkSmDependency extends SmSingleDependency {
            @objid ("12f9c091-14d8-4c57-94a8-5bb6b61d7994")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mLink;
            }

            @objid ("8afe8995-80b2-4ca4-8435-185fdbcf489f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mLink = value;
            }

            @objid ("43288a4c-8496-495a-8f91-154fdcdc3269")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.LinkEndDep();
            }

        }

    }

}
