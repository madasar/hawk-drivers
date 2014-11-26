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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelTreeImpl;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
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

@objid ("00899130-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ModelTree.class, factory=ModelTreeData.Metadata.ObjectFactory.class)
public abstract class ModelTreeData extends ModelElementData {
    @objid ("36bce730-a5d4-449f-886e-ae969a433ed0")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelTreeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("ab07555b-2e68-41c1-bee2-583ec3abecf1")
    @SmaMetaAssociation(metaName="OwnedElement", typeDataClass=ModelTreeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedElementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedElement = null;

    @objid ("9c6d7120-0a58-4835-8099-a0d62b9da59c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002aecb6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("58dd880d-39a1-473e-aee0-aa47bb3080ae")
        private static SmClass smClass = null;

        @objid ("0789c40b-3bae-44af-bdec-681a74103629")
        private static SmDependency OwnerDep = null;

        @objid ("5559a08e-5569-4f3f-97ed-975fd20bfcd7")
        private static SmDependency OwnedElementDep = null;

        @objid ("7f43fc6e-1fcc-4ab4-a342-b66ec7c2652d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModelTreeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cbead0ac-19a1-4922-a173-637745d2f437")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("6d651681-4744-4c79-ba16-47ac1a6edcbb")
        public static SmDependency OwnedElementDep() {
            if (OwnedElementDep == null) {
            	OwnedElementDep = classof().getDependencyDef("OwnedElement");
            }
            return OwnedElementDep;
        }

        @objid ("5a3367be-3120-4c30-ae03-47cf92fea42c")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("a21e30a2-ec92-4c40-8eed-99d101b7cda2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("56f14e6c-0687-487b-ac11-f01f8c887f49")
        public static SmDependency getOwnedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedElementDep;
        }

        @objid ("002b2e74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("70f4c7e8-23b8-4301-8c55-cded549d0d44")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("e32f847b-8928-4d94-9c94-35927aab9580")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("002b9062-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedElementSmDependency extends SmMultipleDependency {
            @objid ("fa90fa43-aabe-4cd7-b63e-fcaad0f46b1b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelTreeData)data).mOwnedElement != null)? ((ModelTreeData)data).mOwnedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("767cd0f4-0ede-4d3f-aa02-eef69f48ea0f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelTreeData) data).mOwnedElement = new ArrayList<>(initialCapacity);
                return ((ModelTreeData) data).mOwnedElement;
            }

            @objid ("9049eecf-4afc-43ae-bff9-b9710c24f63b")
            @Override
            public SmDependency getSymetric() {
                return ModelTreeData.Metadata.OwnerDep();
            }

        }

        @objid ("002bff3e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("03e6718a-2eb3-4ce2-a950-e22c7ce94f92")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelTreeData) data).mOwner;
            }

            @objid ("f0a0d691-d54c-4a4e-93a9-c7aab857986b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelTreeData) data).mOwner = value;
            }

            @objid ("34f40c12-69d4-4fee-bcc0-8ac2be319734")
            @Override
            public SmDependency getSymetric() {
                return ModelTreeData.Metadata.OwnedElementDep();
            }

        }

    }

}
