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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.BindingData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.statik.BindableInstanceImpl;
import org.modelio.metamodel.uml.statik.BindableInstance;
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

@objid ("00011508-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BindableInstance.class, factory=BindableInstanceData.Metadata.ObjectFactory.class)
public class BindableInstanceData extends InstanceData {
    @objid ("20d12cd6-999f-42b0-9f64-3b61afef2215")
    @SmaMetaAssociation(metaName="Cluster", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.ClusterSmDependency.class)
     SmObjectImpl mCluster;

    @objid ("fe4ec0c7-082f-42a1-af15-baf5cd8fa075")
    @SmaMetaAssociation(metaName="InternalOwner", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.InternalOwnerSmDependency.class)
     SmObjectImpl mInternalOwner;

    @objid ("c5a82792-85f7-4206-81f2-4dfc034d47ad")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("c6892eb7-4ebe-4cdf-a3b3-35af480d872c")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("70fea399-90b0-4717-ac3c-32c0ba7187cf")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b43fe-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("79d9d47f-d36d-46d0-9f29-6983e61b495e")
        private static SmClass smClass = null;

        @objid ("a50769f9-16f0-4a76-b683-691c177367b3")
        private static SmDependency ClusterDep = null;

        @objid ("e3a19ed4-94be-484a-bf9c-00d1363bc7a6")
        private static SmDependency InternalOwnerDep = null;

        @objid ("7179d6f5-1416-4d2c-8e36-05e1c87c94d2")
        private static SmDependency RepresentationDep = null;

        @objid ("80d80688-d95d-4b87-a17e-1cb7444d02a5")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("c7e94b37-52ca-4d6c-85c9-01a32565a2a3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BindableInstanceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1a252011-eb05-493c-abe0-6c217a627d1c")
        public static SmDependency ClusterDep() {
            if (ClusterDep == null) {
            	ClusterDep = classof().getDependencyDef("Cluster");
            }
            return ClusterDep;
        }

        @objid ("f2e59402-eb88-46a7-ae29-39b0ce852071")
        public static SmDependency InternalOwnerDep() {
            if (InternalOwnerDep == null) {
            	InternalOwnerDep = classof().getDependencyDef("InternalOwner");
            }
            return InternalOwnerDep;
        }

        @objid ("64bcbeb6-cb7c-4deb-ba24-4672168d3907")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("f94e1756-a8a9-4c9e-9609-4c63e9dc0dbb")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("8b72c6c5-0e61-4793-aa69-c040ea38c9d2")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("800d9392-53a0-43ec-b262-3a5fc9a6207c")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("40575f68-24fa-44ff-a60a-26d3ec13782b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b7833ced-8288-4376-b9ca-a69cbc627b59")
        public static SmDependency getInternalOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalOwnerDep;
        }

        @objid ("868bc7cf-3757-42ae-8413-e88e06cb102a")
        public static SmDependency getClusterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClusterDep;
        }

        @objid ("008b85ee-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c4155141-3098-48e7-be40-ce2a4e01a2fe")
            public ISmObjectData createData() {
                return new BindableInstanceData();
            }

            @objid ("246029d0-60d1-4d2d-8c94-792c3832aa8a")
            public SmObjectImpl createImpl() {
                return new BindableInstanceImpl();
            }

        }

        @objid ("008be93a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ClusterSmDependency extends SmSingleDependency {
            @objid ("7e0b802c-cac1-4a42-b364-87438f6372be")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mCluster;
            }

            @objid ("3b8cff04-0cd0-4606-9368-e59c523f91fe")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mCluster = value;
            }

            @objid ("516091b5-3683-4153-887a-ad0d31f57b44")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.PartDep();
            }

        }

        @objid ("008c5e06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InternalOwnerSmDependency extends SmSingleDependency {
            @objid ("4b387050-b311-4472-a4ab-7370eec5b96a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mInternalOwner;
            }

            @objid ("e496c4f3-4a62-4153-a1c9-457d11276012")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mInternalOwner = value;
            }

            @objid ("1a7778b3-3f6e-428e-86ae-2f68b632048b")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.InternalStructureDep();
            }

        }

        @objid ("008cd5a2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("0f02339d-23e8-48ef-aca4-b097f40ccc4a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BindableInstanceData)data).mRepresentation != null)? ((BindableInstanceData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("67f67d0f-9899-4514-aed7-d9a1a42a26a2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BindableInstanceData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((BindableInstanceData) data).mRepresentation;
            }

            @objid ("de0a4820-914f-4ddd-bb69-450c5935f878")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.RoleDep();
            }

        }

        @objid ("008d3934-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("6625af27-fcd6-42ab-a194-b74f2724aa59")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mRepresentedFeature;
            }

            @objid ("f1dd9b47-81f6-476d-8cc2-ffcd84b94b03")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mRepresentedFeature = value;
            }

            @objid ("ba5afb77-3aa3-4f5b-86a2-d817627e0a16")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingInstanceDep();
            }

        }

    }

}
