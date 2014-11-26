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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.ArtifactData;
import org.modelio.metamodel.impl.uml.statik.ManifestationImpl;
import org.modelio.metamodel.uml.statik.Manifestation;
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

@objid ("001106d4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Manifestation.class, factory=ManifestationData.Metadata.ObjectFactory.class)
public class ManifestationData extends ModelElementData {
    @objid ("b3b9ae07-56b2-44c7-9911-872701d0ad30")
    @SmaMetaAssociation(metaName="UtilizedElement", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.UtilizedElementSmDependency.class, partof = true)
     SmObjectImpl mUtilizedElement;

    @objid ("96c9e0b5-8ec1-40e9-876f-c63a57c29ca2")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ArtifactData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("e53bc6a9-d3eb-42fd-b277-880bde5da3a5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f44a8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6c804447-95c2-4e7b-888d-9c8e0e60fc88")
        private static SmClass smClass = null;

        @objid ("5f0e795a-2cf3-4b6f-89f8-f6a84f0acc76")
        private static SmDependency UtilizedElementDep = null;

        @objid ("af384f5d-86f9-45a8-a916-099833478397")
        private static SmDependency OwnerDep = null;

        @objid ("84d1f273-18e5-4bad-b772-4bb19abcc102")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ManifestationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e0b90e9a-dba7-461f-888d-55284c923ef3")
        public static SmDependency UtilizedElementDep() {
            if (UtilizedElementDep == null) {
            	UtilizedElementDep = classof().getDependencyDef("UtilizedElement");
            }
            return UtilizedElementDep;
        }

        @objid ("4bc9376b-8a8d-4948-8d46-fc4e7eaf4cb9")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("fb2c042b-44f8-4d13-b772-56d5184a19b9")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("a80f9373-efe9-495e-a531-7770038e88c7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ba8e7b1f-975a-4406-9db3-2b101653af79")
        public static SmDependency getUtilizedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UtilizedElementDep;
        }

        @objid ("004f865c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d355e5b8-0062-45ac-83d8-d9acd3f367b0")
            public ISmObjectData createData() {
                return new ManifestationData();
            }

            @objid ("0e308cd0-e361-4d86-9834-7a42b485a6fe")
            public SmObjectImpl createImpl() {
                return new ManifestationImpl();
            }

        }

        @objid ("004fe87c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("531a1da6-3109-4c26-a3c3-78c4674e847a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ManifestationData) data).mOwner;
            }

            @objid ("b6821ebe-9251-4fb6-bc5e-46a3ac193e93")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ManifestationData) data).mOwner = value;
            }

            @objid ("c1f499ca-76c0-41a6-a096-e7410cf5ae78")
            @Override
            public SmDependency getSymetric() {
                return ArtifactData.Metadata.UtilizedDep();
            }

        }

        @objid ("00505d98-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UtilizedElementSmDependency extends SmSingleDependency {
            @objid ("e1390b80-c8a8-4453-842d-c38224b74e99")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ManifestationData) data).mUtilizedElement;
            }

            @objid ("68e857e6-4fee-419a-ad6e-7c88392123c2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ManifestationData) data).mUtilizedElement = value;
            }

            @objid ("7df09397-4a66-46fc-8bbc-bbf95a31f265")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ManifestingDep();
            }

        }

    }

}
