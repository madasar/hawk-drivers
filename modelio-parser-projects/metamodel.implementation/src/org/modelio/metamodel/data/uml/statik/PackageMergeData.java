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
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.uml.statik.PackageMergeImpl;
import org.modelio.metamodel.uml.statik.PackageMerge;
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

@objid ("00177474-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=PackageMerge.class, factory=PackageMergeData.Metadata.ObjectFactory.class)
public class PackageMergeData extends ModelElementData {
    @objid ("ed7715f5-efb9-4706-b549-8ac0eccd407b")
    @SmaMetaAssociation(metaName="MergedPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.MergedPackageSmDependency.class, partof = true)
     SmObjectImpl mMergedPackage;

    @objid ("787cc343-17ed-4e08-9b41-4d059b603a32")
    @SmaMetaAssociation(metaName="ReceivingPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ReceivingPackageSmDependency.class)
     SmObjectImpl mReceivingPackage;

    @objid ("5f8bbc08-2f71-46f3-91b2-1efa2b9abc10")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00698020-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b141f2a8-4e0d-4855-9d46-70631dce50ea")
        private static SmClass smClass = null;

        @objid ("3a3e7c3e-5f33-4e87-b16a-20bb713dfef9")
        private static SmDependency MergedPackageDep = null;

        @objid ("93870025-8422-45a0-9dd9-39f3775b8d99")
        private static SmDependency ReceivingPackageDep = null;

        @objid ("0981aecd-f613-4f7d-9ade-3ceef81f0acc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageMergeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("af122175-9375-4d7f-9308-94bcc8fefcb8")
        public static SmDependency MergedPackageDep() {
            if (MergedPackageDep == null) {
            	MergedPackageDep = classof().getDependencyDef("MergedPackage");
            }
            return MergedPackageDep;
        }

        @objid ("6aa31cb6-d112-4046-bb70-c1ff0c4f9502")
        public static SmDependency ReceivingPackageDep() {
            if (ReceivingPackageDep == null) {
            	ReceivingPackageDep = classof().getDependencyDef("ReceivingPackage");
            }
            return ReceivingPackageDep;
        }

        @objid ("cfe3efbd-8cb5-4abd-a3f0-3ed31e10cd06")
        public static SmDependency getMergedPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MergedPackageDep;
        }

        @objid ("7bd8668f-e8a6-4b35-9f62-0bc054842667")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1903470c-8bac-4b25-a1b5-b2c67e2cf613")
        public static SmDependency getReceivingPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivingPackageDep;
        }

        @objid ("0069c1ac-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("df6d1ac5-c5eb-4f06-8779-f6471622b25a")
            public ISmObjectData createData() {
                return new PackageMergeData();
            }

            @objid ("09ec6444-054a-4fc5-8a03-6e178d9890f2")
            public SmObjectImpl createImpl() {
                return new PackageMergeImpl();
            }

        }

        @objid ("006a2426-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivingPackageSmDependency extends SmSingleDependency {
            @objid ("792723bd-366d-493a-bc4d-72bd2ec4869e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageMergeData) data).mReceivingPackage;
            }

            @objid ("0ff99c9d-8e28-441c-b005-ada2a7e2b344")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageMergeData) data).mReceivingPackage = value;
            }

            @objid ("6021433a-1d29-4e1d-a7e3-188e5855ba06")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.MergeDep();
            }

        }

        @objid ("006a9870-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MergedPackageSmDependency extends SmSingleDependency {
            @objid ("3b4096d5-e832-41e3-ad55-6ddc1ce7ce5b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageMergeData) data).mMergedPackage;
            }

            @objid ("56ade63a-342d-49e9-84be-9da1b74c1d71")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageMergeData) data).mMergedPackage = value;
            }

            @objid ("00e0b4cb-9b76-4a8e-ae42-8ad04b13766c")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.ReceivingMergeDep();
            }

        }

    }

}
