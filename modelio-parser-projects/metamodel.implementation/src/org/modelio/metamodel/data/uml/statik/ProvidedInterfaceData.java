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
import org.modelio.metamodel.data.uml.statik.InterfaceData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.data.uml.statik.NaryLinkEndData;
import org.modelio.metamodel.data.uml.statik.PortData;
import org.modelio.metamodel.impl.uml.statik.ProvidedInterfaceImpl;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
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

@objid ("001a1ddc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ProvidedInterface.class, factory=ProvidedInterfaceData.Metadata.ObjectFactory.class)
public class ProvidedInterfaceData extends ModelElementData {
    @objid ("5dad5670-a4bf-4b2b-a1be-188fcd6503a1")
    @SmaMetaAssociation(metaName="ProvidedElement", typeDataClass=InterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidedElementSmDependency.class, partof = true)
     List<SmObjectImpl> mProvidedElement = null;

    @objid ("875c5d8c-172e-4612-9a0a-67b717f42288")
    @SmaMetaAssociation(metaName="Providing", typeDataClass=PortData.class, min=1, max=1, smAssociationClass=Metadata.ProvidingSmDependency.class)
     SmObjectImpl mProviding;

    @objid ("ba90f136-5a35-49c2-89a4-dd4bc1da550d")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.ConsumerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mConsumer = null;

    @objid ("ca807108-fedd-43a1-8785-1d1a8a375459")
    @SmaMetaAssociation(metaName="NaryConsumer", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryConsumerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mNaryConsumer = null;

    @objid ("061119df-df01-42b5-a21f-64e2d2b87ead")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003b9138-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f53fc64a-ce87-4490-a8a7-63dc22a15209")
        private static SmClass smClass = null;

        @objid ("cf01db65-1528-4960-bfe5-443451e61154")
        private static SmDependency ProvidedElementDep = null;

        @objid ("5788c349-d4f7-4663-b0df-d2335e1a1629")
        private static SmDependency ProvidingDep = null;

        @objid ("6d40d15d-9e74-433a-aa0c-ff8b5181854e")
        private static SmDependency ConsumerDep = null;

        @objid ("31b30a61-66ad-49ea-be3a-23630007ff5c")
        private static SmDependency NaryConsumerDep = null;

        @objid ("5419593a-2b62-457c-9022-1dd912167559")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProvidedInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5adf77d1-28bb-4e10-a3fc-114dce55f232")
        public static SmDependency ProvidedElementDep() {
            if (ProvidedElementDep == null) {
            	ProvidedElementDep = classof().getDependencyDef("ProvidedElement");
            }
            return ProvidedElementDep;
        }

        @objid ("11a95ec1-18f7-42d3-8ab8-9e385056037c")
        public static SmDependency ProvidingDep() {
            if (ProvidingDep == null) {
            	ProvidingDep = classof().getDependencyDef("Providing");
            }
            return ProvidingDep;
        }

        @objid ("328fdbf7-890a-47ca-a8e0-fe8de0b9cbbe")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("a73a4752-c8c4-48d3-92e0-318158c050f8")
        public static SmDependency NaryConsumerDep() {
            if (NaryConsumerDep == null) {
            	NaryConsumerDep = classof().getDependencyDef("NaryConsumer");
            }
            return NaryConsumerDep;
        }

        @objid ("4de044d4-c083-4883-a45f-2ca92ec772cd")
        public static SmDependency getProvidingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidingDep;
        }

        @objid ("f47afdce-2345-4e79-8f60-e1646f6e7ea2")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("330fd26e-9fdd-4955-b1e8-7305aab63980")
        public static SmDependency getProvidedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidedElementDep;
        }

        @objid ("7ec5e6ba-9fd9-46f8-b869-79aede93b115")
        public static SmDependency getNaryConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryConsumerDep;
        }

        @objid ("8abe871e-dd87-4dc4-a53f-267b34be796f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003bd198-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cd11d531-7c82-462c-a6e1-dd00774ec93e")
            public ISmObjectData createData() {
                return new ProvidedInterfaceData();
            }

            @objid ("3f45cc89-032b-4155-b389-7beb8644f766")
            public SmObjectImpl createImpl() {
                return new ProvidedInterfaceImpl();
            }

        }

        @objid ("003c32d2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProvidedElementSmDependency extends SmMultipleDependency {
            @objid ("35b221b1-cb89-4c86-9f9f-f7db09413eba")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mProvidedElement != null)? ((ProvidedInterfaceData)data).mProvidedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("5f93799d-48e7-4d9b-991d-7c91ed93f4db")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mProvidedElement = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mProvidedElement;
            }

            @objid ("088ea737-ae05-4482-87ec-57c741e40742")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.ProvidingDep();
            }

        }

        @objid ("003c9434-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProvidingSmDependency extends SmSingleDependency {
            @objid ("13907625-aa57-4c43-9dfb-87620d4f307f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProvidedInterfaceData) data).mProviding;
            }

            @objid ("811f6462-85bf-491f-ad6b-d4725239a34f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProvidedInterfaceData) data).mProviding = value;
            }

            @objid ("f3c33b60-fc9e-4c59-80b5-db1af1cc8136")
            @Override
            public SmDependency getSymetric() {
                return PortData.Metadata.ProvidedDep();
            }

        }

        @objid ("003d073e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConsumerSmDependency extends SmMultipleDependency {
            @objid ("0441d13f-ce16-4aa0-81f6-3d3a41b125d5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mConsumer != null)? ((ProvidedInterfaceData)data).mConsumer:SmMultipleDependency.EMPTY;
            }

            @objid ("9ba7bdc3-7f49-4196-a6ad-c5f1df98fb6a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mConsumer = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mConsumer;
            }

            @objid ("a7f07aec-258c-48ac-b84f-70812d9c3143")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ProviderDep();
            }

        }

        @objid ("002be698-17f3-10a1-88a0-001ec947cd2a")
        public static class NaryConsumerSmDependency extends SmMultipleDependency {
            @objid ("d9740e30-c4ae-423f-a8be-f7e3017c0ae8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mNaryConsumer != null)? ((ProvidedInterfaceData)data).mNaryConsumer:SmMultipleDependency.EMPTY;
            }

            @objid ("6cc653cf-361d-4897-b433-bad956455800")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mNaryConsumer = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mNaryConsumer;
            }

            @objid ("3c58b112-d98b-448c-bb3a-a1d2be600503")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.ProviderDep();
            }

        }

    }

}
