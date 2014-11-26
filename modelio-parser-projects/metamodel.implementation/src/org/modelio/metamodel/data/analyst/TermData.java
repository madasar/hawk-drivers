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
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.data.analyst.DictionaryData;
import org.modelio.metamodel.impl.analyst.TermImpl;
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

@objid ("0062a7fa-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Term.class, factory=TermData.Metadata.ObjectFactory.class, cmsnode=true)
public class TermData extends AnalystElementData {
    @objid ("05dbe2e2-e0f8-4534-a5ae-799d0a63084c")
    @SmaMetaAssociation(metaName="OwnerDictionary", typeDataClass=DictionaryData.class, min=0, max=1, smAssociationClass=Metadata.OwnerDictionarySmDependency.class)
     SmObjectImpl mOwnerDictionary;

    @objid ("22954ef6-2403-41cd-af03-3f3d416e83ca")
    @SmaMetaAssociation(metaName="ArchivedTermVersion", typeDataClass=TermData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedTermVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedTermVersion = null;

    @objid ("b0f32928-1e13-4654-911b-d67abf8c2584")
    @SmaMetaAssociation(metaName="LastTermVersion", typeDataClass=TermData.class, min=0, max=1, smAssociationClass=Metadata.LastTermVersionSmDependency.class)
     SmObjectImpl mLastTermVersion;

    @objid ("6251c18b-aa8b-4387-bdd8-c0651d0251b4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078ee66-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("22d3264a-f62a-4028-b91c-1db23f6dfd3d")
        private static SmClass smClass = null;

        @objid ("7c3379fc-2656-4c69-b125-b8b4c6a3cdd9")
        private static SmDependency OwnerDictionaryDep = null;

        @objid ("375c61a1-bc23-4ee3-a69b-52e7eb906988")
        private static SmDependency ArchivedTermVersionDep = null;

        @objid ("234cf31d-9750-4a03-9fa8-0a07c2eb4e9e")
        private static SmDependency LastTermVersionDep = null;

        @objid ("0fad7b39-2d8a-46a4-baf5-1ed2fdfbcfc5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TermData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("db746e18-2a60-4a57-8966-c98a80b0edf2")
        public static SmDependency OwnerDictionaryDep() {
            if (OwnerDictionaryDep == null) {
            	OwnerDictionaryDep = classof().getDependencyDef("OwnerDictionary");
            }
            return OwnerDictionaryDep;
        }

        @objid ("8721dcdb-a77d-42d8-b24a-bd7fb60496da")
        public static SmDependency ArchivedTermVersionDep() {
            if (ArchivedTermVersionDep == null) {
            	ArchivedTermVersionDep = classof().getDependencyDef("ArchivedTermVersion");
            }
            return ArchivedTermVersionDep;
        }

        @objid ("00645723-d339-4a05-a15f-d9f4aa3245f1")
        public static SmDependency LastTermVersionDep() {
            if (LastTermVersionDep == null) {
            	LastTermVersionDep = classof().getDependencyDef("LastTermVersion");
            }
            return LastTermVersionDep;
        }

        @objid ("39abae5b-344a-45e6-bf60-3573bae8afd8")
        public static SmDependency getArchivedTermVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedTermVersionDep;
        }

        @objid ("1598093c-574a-44e7-8855-2b1c7dd71249")
        public static SmDependency getOwnerDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDictionaryDep;
        }

        @objid ("fb5ae3dc-a4d2-4302-9d01-2546df8377dd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a89e6ab7-ce8d-425d-b7d1-0363f7a618bb")
        public static SmDependency getLastTermVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastTermVersionDep;
        }

        @objid ("00792ef8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bb9bdd8c-03ea-4fe0-8fdb-2381157b5d25")
            public ISmObjectData createData() {
                return new TermData();
            }

            @objid ("d6719cad-0400-4c4e-8bb6-ca21b7220d56")
            public SmObjectImpl createImpl() {
                return new TermImpl();
            }

        }

        @objid ("18a5e5d5-88af-42b2-bba3-87f60b5b8886")
        public static class OwnerDictionarySmDependency extends SmSingleDependency {
            @objid ("52c67aab-ca82-4fec-8261-a412145cb8c5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TermData) data).mOwnerDictionary;
            }

            @objid ("0b572378-d1c2-42b5-84f4-742979abade9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TermData) data).mOwnerDictionary = value;
            }

            @objid ("75c57d68-eb08-4ffe-9969-cb680b29f720")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnedTermDep();
            }

        }

        @objid ("f2695892-cb3d-40cb-941f-6cde079025c0")
        public static class ArchivedTermVersionSmDependency extends SmMultipleDependency {
            @objid ("15a3e5be-2ee4-451f-ba71-76c3ac2a7f04")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TermData)data).mArchivedTermVersion != null)? ((TermData)data).mArchivedTermVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("0c143d76-8ce1-441a-8184-faf16e2eaded")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TermData) data).mArchivedTermVersion = new ArrayList<>(initialCapacity);
                return ((TermData) data).mArchivedTermVersion;
            }

            @objid ("19de4384-5860-41d7-8dbe-14aba5fb7c84")
            @Override
            public SmDependency getSymetric() {
                return TermData.Metadata.LastTermVersionDep();
            }

        }

        @objid ("9c016646-3a75-447e-b074-7a3517958d82")
        public static class LastTermVersionSmDependency extends SmSingleDependency {
            @objid ("516a4481-e711-4f63-a69a-4e48cfa0ecf2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TermData) data).mLastTermVersion;
            }

            @objid ("5738fd80-a07c-428c-bc1f-7b3eefe0d18b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TermData) data).mLastTermVersion = value;
            }

            @objid ("9e51c4fa-0f9c-4ce7-8e0f-a4a8248c5d8f")
            @Override
            public SmDependency getSymetric() {
                return TermData.Metadata.ArchivedTermVersionDep();
            }

        }

    }

}
