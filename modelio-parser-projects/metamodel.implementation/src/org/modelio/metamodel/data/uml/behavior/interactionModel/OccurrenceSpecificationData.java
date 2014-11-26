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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GeneralOrderingData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.OccurrenceSpecificationImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
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

@objid ("004ab5e6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=OccurrenceSpecification.class, factory=OccurrenceSpecificationData.Metadata.ObjectFactory.class)
public abstract class OccurrenceSpecificationData extends InteractionFragmentData {
    @objid ("874d37a9-2560-43c5-a3fb-b76e50ea0b9c")
    @SmaMetaAssociation(metaName="ToAfter", typeDataClass=GeneralOrderingData.class, min=0, max=-1, smAssociationClass=Metadata.ToAfterSmDependency.class, component = true)
     List<SmObjectImpl> mToAfter = null;

    @objid ("c04d0ecc-8b24-48b7-b8e5-c4dd5848e482")
    @SmaMetaAssociation(metaName="ToBefore", typeDataClass=GeneralOrderingData.class, min=0, max=-1, smAssociationClass=Metadata.ToBeforeSmDependency.class, istodelete = true)
     List<SmObjectImpl> mToBefore = null;

    @objid ("02162584-0601-4899-acc9-ea0ff5813e42")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004edf68-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7798f497-ec01-4ea7-bb44-de5690d665a2")
        private static SmClass smClass = null;

        @objid ("3ff3712d-2a31-4ea3-969f-482e8a3fe7d3")
        private static SmDependency ToAfterDep = null;

        @objid ("07ff8805-fe98-4edd-b1c4-ef79ef738852")
        private static SmDependency ToBeforeDep = null;

        @objid ("4e100ab2-9c45-4b7e-bc1c-2b5e63fab507")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OccurrenceSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4acbc95c-205f-47f7-bda3-0728a1e3c090")
        public static SmDependency ToAfterDep() {
            if (ToAfterDep == null) {
            	ToAfterDep = classof().getDependencyDef("ToAfter");
            }
            return ToAfterDep;
        }

        @objid ("49fd004b-0e9f-41b3-9e44-89d389609bfb")
        public static SmDependency ToBeforeDep() {
            if (ToBeforeDep == null) {
            	ToBeforeDep = classof().getDependencyDef("ToBefore");
            }
            return ToBeforeDep;
        }

        @objid ("f9bc3a16-feb1-48a1-810e-934a41c6027d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("677a8a2c-b8c4-4418-8ab5-00d0cea7c7d4")
        public static SmDependency getToBeforeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ToBeforeDep;
        }

        @objid ("69497f91-ce4d-458d-8eb9-b77f975d4d00")
        public static SmDependency getToAfterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ToAfterDep;
        }

        @objid ("004f202c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cc95a245-81f6-4f07-a43f-0b1a08dbcfc7")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("6166570d-fc1d-41f8-905e-cb181087e9b8")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004f82a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ToBeforeSmDependency extends SmMultipleDependency {
            @objid ("bc67b4e7-2d9e-4a5b-adcd-837876d17397")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OccurrenceSpecificationData)data).mToBefore != null)? ((OccurrenceSpecificationData)data).mToBefore:SmMultipleDependency.EMPTY;
            }

            @objid ("9511a645-1cc0-466a-8bec-c7038f2933c7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OccurrenceSpecificationData) data).mToBefore = new ArrayList<>(initialCapacity);
                return ((OccurrenceSpecificationData) data).mToBefore;
            }

            @objid ("98e37a61-c2db-4854-844e-efa816ec4574")
            @Override
            public SmDependency getSymetric() {
                return GeneralOrderingData.Metadata.AfterDep();
            }

        }

        @objid ("004fe462-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ToAfterSmDependency extends SmMultipleDependency {
            @objid ("1194365d-36fb-4bfa-928f-739cb764233a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OccurrenceSpecificationData)data).mToAfter != null)? ((OccurrenceSpecificationData)data).mToAfter:SmMultipleDependency.EMPTY;
            }

            @objid ("dfebf92a-dd80-4caf-aeea-1880956b8c2a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OccurrenceSpecificationData) data).mToAfter = new ArrayList<>(initialCapacity);
                return ((OccurrenceSpecificationData) data).mToAfter;
            }

            @objid ("8239be63-3f7c-4807-a8fe-bde877af830a")
            @Override
            public SmDependency getSymetric() {
                return GeneralOrderingData.Metadata.BeforeDep();
            }

        }

    }

}
