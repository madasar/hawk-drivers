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
import org.modelio.metamodel.impl.uml.statik.RequiredInterfaceImpl;
import org.modelio.metamodel.uml.statik.RequiredInterface;
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

@objid ("001be5d6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=RequiredInterface.class, factory=RequiredInterfaceData.Metadata.ObjectFactory.class)
public class RequiredInterfaceData extends ModelElementData {
    @objid ("6a0654e8-3432-475a-8747-58a0341186db")
    @SmaMetaAssociation(metaName="RequiredElement", typeDataClass=InterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredElementSmDependency.class, partof = true)
     List<SmObjectImpl> mRequiredElement = null;

    @objid ("86dc1280-1fd2-45bc-ae36-d081f3bcb264")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.ProviderSmDependency.class, istodelete = true)
     List<SmObjectImpl> mProvider = null;

    @objid ("c146e933-28c3-4873-b2dc-111df8294335")
    @SmaMetaAssociation(metaName="Requiring", typeDataClass=PortData.class, min=1, max=1, smAssociationClass=Metadata.RequiringSmDependency.class)
     SmObjectImpl mRequiring;

    @objid ("8354208e-3b38-4b68-9981-556adce771e9")
    @SmaMetaAssociation(metaName="NaryProvider", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryProviderSmDependency.class, istodelete = true)
     List<SmObjectImpl> mNaryProvider = null;

    @objid ("8aeb942b-544b-46e8-b180-276c7ff6b634")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("009297a8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("58197fb5-8807-4e5c-ac75-50cb5db12391")
        private static SmClass smClass = null;

        @objid ("5efa933b-d81f-45ac-ac3d-d4bf9d35f9b7")
        private static SmDependency RequiredElementDep = null;

        @objid ("da92b924-b5aa-405e-b530-95a41b5790e3")
        private static SmDependency ProviderDep = null;

        @objid ("eaeed027-cd86-4ecd-bf9e-da3ca0b68493")
        private static SmDependency RequiringDep = null;

        @objid ("1766315a-a6fb-47b9-b3b6-9c030b74a9d6")
        private static SmDependency NaryProviderDep = null;

        @objid ("b81a56cd-c8e4-418d-9af0-b3fbbd41c89a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequiredInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9bb75f17-eee8-4395-8aaa-9e431e322af6")
        public static SmDependency RequiredElementDep() {
            if (RequiredElementDep == null) {
            	RequiredElementDep = classof().getDependencyDef("RequiredElement");
            }
            return RequiredElementDep;
        }

        @objid ("6b746163-dd12-4fa5-9e60-f39e1a67b3c5")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("a31c6a85-aba7-442b-831f-66e4e464bef7")
        public static SmDependency RequiringDep() {
            if (RequiringDep == null) {
            	RequiringDep = classof().getDependencyDef("Requiring");
            }
            return RequiringDep;
        }

        @objid ("fdca874a-0b31-4996-b9ec-f987ec3408f2")
        public static SmDependency NaryProviderDep() {
            if (NaryProviderDep == null) {
            	NaryProviderDep = classof().getDependencyDef("NaryProvider");
            }
            return NaryProviderDep;
        }

        @objid ("0c13d2f0-06b4-499c-b2f0-0191325eb9a5")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("79bb8812-d336-4bfc-a07a-478d8152eff6")
        public static SmDependency getNaryProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryProviderDep;
        }

        @objid ("c867219e-b5c2-452e-a9ec-285f779f4a4c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1c0811dd-5b35-450b-aec6-d7598a888cf2")
        public static SmDependency getRequiredElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredElementDep;
        }

        @objid ("5f9e2ddb-b250-4574-b87f-83b5043d2de4")
        public static SmDependency getRequiringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiringDep;
        }

        @objid ("0092e532-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79b54773-e4f1-4f13-a65c-6e21346d12ed")
            public ISmObjectData createData() {
                return new RequiredInterfaceData();
            }

            @objid ("a3372660-6a40-4442-90fb-0134c18f13e4")
            public SmObjectImpl createImpl() {
                return new RequiredInterfaceImpl();
            }

        }

        @objid ("00935a6c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredElementSmDependency extends SmMultipleDependency {
            @objid ("c2ded669-9588-432f-91b6-748471d46370")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mRequiredElement != null)? ((RequiredInterfaceData)data).mRequiredElement:SmMultipleDependency.EMPTY;
            }

            @objid ("e76fc85f-ccd1-49ab-9251-76a945df37ec")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mRequiredElement = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mRequiredElement;
            }

            @objid ("dc6c04f5-b681-4b39-a3ca-1809faddff90")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.RequiringDep();
            }

        }

        @objid ("0093c97a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProviderSmDependency extends SmMultipleDependency {
            @objid ("afbd0935-9097-4af3-bdf9-1e5159e4da72")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mProvider != null)? ((RequiredInterfaceData)data).mProvider:SmMultipleDependency.EMPTY;
            }

            @objid ("44af73ff-0f4d-44ac-a8c2-ac832f763eef")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mProvider = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mProvider;
            }

            @objid ("8cebfa58-63c2-4c3d-8f67-aa395c38d10f")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ConsumerDep();
            }

        }

        @objid ("00943b8a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiringSmDependency extends SmSingleDependency {
            @objid ("677d799d-df68-43dc-9b81-98526d4acde2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequiredInterfaceData) data).mRequiring;
            }

            @objid ("e952ef87-568e-48e1-ab48-49618a461f30")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequiredInterfaceData) data).mRequiring = value;
            }

            @objid ("7fa16a48-3882-4ef8-9f34-95401fcd7d4f")
            @Override
            public SmDependency getSymetric() {
                return PortData.Metadata.RequiredDep();
            }

        }

        @objid ("006a9a14-17f3-10a1-88a0-001ec947cd2a")
        public static class NaryProviderSmDependency extends SmMultipleDependency {
            @objid ("d00d1e91-a9f0-4217-a45f-a7c749f57818")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mNaryProvider != null)? ((RequiredInterfaceData)data).mNaryProvider:SmMultipleDependency.EMPTY;
            }

            @objid ("ac911974-3013-4d5a-a591-1affccbd348b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mNaryProvider = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mNaryProvider;
            }

            @objid ("9365fa38-7c76-4b0a-83a8-a49365c3997d")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.ConsumerDep();
            }

        }

    }

}
