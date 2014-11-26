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
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.TermData;
import org.modelio.metamodel.impl.analyst.DictionaryImpl;
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

@objid ("005be7bc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Dictionary.class, factory=DictionaryData.Metadata.ObjectFactory.class, cmsnode=true)
public class DictionaryData extends AnalystContainerData {
    @objid ("21e3dab1-8f38-46a1-b00f-2b07a03bd304")
    @SmaMetaAssociation(metaName="OwnedDictionary", typeDataClass=DictionaryData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedDictionarySmDependency.class, component = true)
     List<SmObjectImpl> mOwnedDictionary = null;

    @objid ("98d8dc72-bec2-4f79-a402-bb8099e461d2")
    @SmaMetaAssociation(metaName="OwnerDictionary", typeDataClass=DictionaryData.class, min=0, max=1, smAssociationClass=Metadata.OwnerDictionarySmDependency.class)
     SmObjectImpl mOwnerDictionary;

    @objid ("a58a01bf-c164-4511-984d-895f1569a4fc")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("d420255a-e6d0-4b4e-a4a7-71239cf9ccdb")
    @SmaMetaAssociation(metaName="OwnedTerm", typeDataClass=TermData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedTermSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedTerm = null;

    @objid ("5d8b974a-5273-40cd-8c7a-b456be790da2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0081b7f8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("93803ffb-8a7c-4012-9be9-7fbc8b915a26")
        private static SmClass smClass = null;

        @objid ("14c9794d-0c81-4858-ab43-9fa3d9678a60")
        private static SmDependency OwnedDictionaryDep = null;

        @objid ("1a12688b-da4e-40cd-bd7e-b6f20b0f0b00")
        private static SmDependency OwnerDictionaryDep = null;

        @objid ("9ebff2be-2e62-4e92-af47-c2ba42e6ad2c")
        private static SmDependency OwnerProjectDep = null;

        @objid ("c673ded9-3d19-4840-99a5-df5e406e3b3c")
        private static SmDependency OwnedTermDep = null;

        @objid ("8cce7844-7e55-4117-a706-0e5fd58907e0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DictionaryData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("88984ac2-3d8f-4f94-9bdd-3818de4d9b50")
        public static SmDependency OwnedDictionaryDep() {
            if (OwnedDictionaryDep == null) {
            	OwnedDictionaryDep = classof().getDependencyDef("OwnedDictionary");
            }
            return OwnedDictionaryDep;
        }

        @objid ("a5a5496a-ada5-4fda-8bca-7deaef5f4a7b")
        public static SmDependency OwnerDictionaryDep() {
            if (OwnerDictionaryDep == null) {
            	OwnerDictionaryDep = classof().getDependencyDef("OwnerDictionary");
            }
            return OwnerDictionaryDep;
        }

        @objid ("04e9c793-b2c4-4c45-ae69-5b5a055d454f")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("1641d91b-2721-46ce-a066-da0184600e08")
        public static SmDependency OwnedTermDep() {
            if (OwnedTermDep == null) {
            	OwnedTermDep = classof().getDependencyDef("OwnedTerm");
            }
            return OwnedTermDep;
        }

        @objid ("94063334-05bf-47e6-aadd-2809c7ca1ccf")
        public static SmDependency getOwnerDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDictionaryDep;
        }

        @objid ("5cdb0ac0-1897-4d8b-848d-5a5cf68f5a77")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("9bcc56df-866e-4d95-a49f-6b165b2670a6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("69de8a73-3bd1-4924-9e3f-c60e3b194ff1")
        public static SmDependency getOwnedTermDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedTermDep;
        }

        @objid ("3984b8ee-07d5-41fb-9457-7c019cdc6301")
        public static SmDependency getOwnedDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDictionaryDep;
        }

        @objid ("0081f84e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e0864e10-5fbc-402e-bddb-8e0a99dde6bc")
            public ISmObjectData createData() {
                return new DictionaryData();
            }

            @objid ("e7e502c4-2da0-42ed-8d91-f0cb597f000f")
            public SmObjectImpl createImpl() {
                return new DictionaryImpl();
            }

        }

        @objid ("08c7dafc-6d39-439b-ad42-f68c1a95b402")
        public static class OwnedDictionarySmDependency extends SmMultipleDependency {
            @objid ("1a775bc4-2d9c-4223-adae-57c4f6d335e8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DictionaryData)data).mOwnedDictionary != null)? ((DictionaryData)data).mOwnedDictionary:SmMultipleDependency.EMPTY;
            }

            @objid ("692be422-837e-40bf-a9af-8c72e9fb6bcb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DictionaryData) data).mOwnedDictionary = new ArrayList<>(initialCapacity);
                return ((DictionaryData) data).mOwnedDictionary;
            }

            @objid ("43acfa94-4f17-41d0-8da1-7ea6e958d749")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnerDictionaryDep();
            }

        }

        @objid ("a1fb7aa6-9ccc-4afb-a391-41088931d3bb")
        public static class OwnerDictionarySmDependency extends SmSingleDependency {
            @objid ("30f5539a-b4b9-413d-a576-19e833497d20")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DictionaryData) data).mOwnerDictionary;
            }

            @objid ("eec6058f-e562-4940-9314-c153476c39cd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DictionaryData) data).mOwnerDictionary = value;
            }

            @objid ("c67cd334-5dd0-4a6f-b062-ef4ee2b81b23")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnedDictionaryDep();
            }

        }

        @objid ("d76aebd1-35ee-4bd6-b519-b941b14b33b5")
        public static class OwnedTermSmDependency extends SmMultipleDependency {
            @objid ("bd1922ac-529b-4ef7-99ac-40980a5e1a73")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DictionaryData)data).mOwnedTerm != null)? ((DictionaryData)data).mOwnedTerm:SmMultipleDependency.EMPTY;
            }

            @objid ("a48bbb06-b3b1-4442-82fb-ae51b6499666")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DictionaryData) data).mOwnedTerm = new ArrayList<>(initialCapacity);
                return ((DictionaryData) data).mOwnedTerm;
            }

            @objid ("d548d74b-54a1-4362-935a-7a16d69b6536")
            @Override
            public SmDependency getSymetric() {
                return TermData.Metadata.OwnerDictionaryDep();
            }

        }

        @objid ("be55b810-47b3-4534-b494-ef9bca486e4d")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("ed2bb46e-304f-4014-96db-b9efce1f6969")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DictionaryData) data).mOwnerProject;
            }

            @objid ("eb5b0f9c-d893-4691-b5f8-ed0b6855b7ee")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DictionaryData) data).mOwnerProject = value;
            }

            @objid ("02aa9e1e-b3bb-47b5-a75f-113d98ed3934")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.DictionaryRootDep();
            }

        }

    }

}
