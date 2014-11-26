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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.GenericAnalystElementData;
import org.modelio.metamodel.impl.analyst.GenericAnalystContainerImpl;
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

@objid ("43cf5c62-f20f-4e47-9153-5f4bd63429ba")
@SmaMetaClass(mmClass=GenericAnalystContainer.class, factory=GenericAnalystContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class GenericAnalystContainerData extends AnalystContainerData {
    @objid ("fe6b69f5-f24d-4789-b351-77aa7ae7a945")
    @SmaMetaAssociation(metaName="OwnedElement", typeDataClass=GenericAnalystElementData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedElementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedElement = null;

    @objid ("aa7422df-997b-43ae-b111-03c4f2e4a4d0")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GenericAnalystContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("9421f374-e3b6-41f7-a578-3c0d4e082c2b")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=GenericAnalystContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("82b22b9c-dfca-422c-9c78-8c45c1f00945")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("69a210dd-8d16-474f-a13a-aff8784915a9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("3f50658d-b4c2-4005-a892-25d992f61952")
    public static class Metadata {
        @objid ("01b188ca-96bc-4f55-bf32-5ec68e58ca19")
        private static SmClass smClass = null;

        @objid ("7ee4e27d-ef95-418c-aadf-179b29f9c3fc")
        private static SmDependency OwnedElementDep = null;

        @objid ("00ac30e2-e1af-46c1-b0ea-340de966e344")
        private static SmDependency OwnerContainerDep = null;

        @objid ("ff6864fc-dd2e-43b4-8c89-89d093b58b18")
        private static SmDependency OwnedContainerDep = null;

        @objid ("9ebac4cf-f22e-47d3-b0a5-86dfbb96399e")
        private static SmDependency OwnerProjectDep = null;

        @objid ("1e86912b-faae-4ea4-b4ea-e420bff779db")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GenericAnalystContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ce67fd1b-d7b2-4aec-a3fb-dacb4c4e277b")
        public static SmDependency OwnedElementDep() {
            if (OwnedElementDep == null) {
            	OwnedElementDep = classof().getDependencyDef("OwnedElement");
            }
            return OwnedElementDep;
        }

        @objid ("1cf5004f-b88c-4741-bd73-37956d5b5143")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("a5d8654f-979b-42df-b386-007bdb95191a")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("524371b9-9cdc-458d-adb1-b478fc0c2557")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("c82f3823-1091-4917-ad2a-fd131225a709")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("5a5b88a7-7a8d-4774-b813-3e7c3d5cb516")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("af731638-36ba-4288-9994-041b01044aaf")
        public static SmDependency getOwnedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedElementDep;
        }

        @objid ("a70e9acf-bd7c-4a87-8d57-6e8fd0a25819")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("9276c08f-4a41-4aab-a7e8-0dd23a479b2a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b3ad03bd-c265-4035-940c-986d2cc05988")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("aa793c6e-a87c-4ae1-9776-7e74b4646cd1")
            public ISmObjectData createData() {
                return new GenericAnalystContainerData();
            }

            @objid ("ee63282d-1aa5-4f2a-9658-6ad13b6c7e7d")
            public SmObjectImpl createImpl() {
                return new GenericAnalystContainerImpl();
            }

        }

        @objid ("51eec192-d7f1-444b-993b-2abfdf9665b8")
        public static class OwnedElementSmDependency extends SmMultipleDependency {
            @objid ("4b950e19-1193-4c24-b152-2711a1b4b545")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystContainerData)data).mOwnedElement != null)? ((GenericAnalystContainerData)data).mOwnedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("52662799-1c9a-4410-aea5-f81340e3426a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystContainerData) data).mOwnedElement = new ArrayList<>(initialCapacity);
                return ((GenericAnalystContainerData) data).mOwnedElement;
            }

            @objid ("0e049107-63bc-4b68-92b2-4b24828c219a")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("4912e901-4e5e-40ee-b39a-02fd11638615")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("6e0b7988-a546-4fdd-b190-8d935db8cde9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystContainerData) data).mOwnerContainer;
            }

            @objid ("218f9b4d-8fab-4771-84be-d64f94e8a4fc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystContainerData) data).mOwnerContainer = value;
            }

            @objid ("e28e5ea5-e996-4a3e-afe9-f3fbfd5514d8")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("aeece048-e7eb-4929-afa8-5365f90209f4")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("96933696-1793-4fba-9e0b-c52a1a702c47")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystContainerData)data).mOwnedContainer != null)? ((GenericAnalystContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("f22e4c5a-0b10-4b46-8e16-2c121453ed2d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((GenericAnalystContainerData) data).mOwnedContainer;
            }

            @objid ("f2b17cd3-5909-4714-b049-b3e21be8c4c5")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("0932ae70-e3fd-4f73-94fb-ae6c1c77bf0a")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("bc1c5247-a6ec-4c4c-a0e5-f613233bab01")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystContainerData) data).mOwnerProject;
            }

            @objid ("87818069-4d76-4b84-ab89-6ca1e0a982e1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystContainerData) data).mOwnerProject = value;
            }

            @objid ("52221da6-110e-4efa-89a9-f045bd801386")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.GenericRootDep();
            }

        }

    }

}
