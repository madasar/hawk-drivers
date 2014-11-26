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
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.uml.statik.PackageImportImpl;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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

@objid ("00169568-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=PackageImport.class, factory=PackageImportData.Metadata.ObjectFactory.class)
public class PackageImportData extends ModelElementData {
    @objid ("d66fd815-3bf2-4d3a-aa0b-7db1d874e456")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PRIVATE;

    @objid ("9de39daa-8e56-478e-af15-44f963edf998")
    @SmaMetaAssociation(metaName="ImportingOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImportingOperationSmDependency.class)
     SmObjectImpl mImportingOperation;

    @objid ("3782e8f8-d817-474f-9039-1e39c49cc8b4")
    @SmaMetaAssociation(metaName="ImportingNameSpace", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImportingNameSpaceSmDependency.class)
     SmObjectImpl mImportingNameSpace;

    @objid ("0c7ed168-a4b8-4174-97d6-29bf026371a8")
    @SmaMetaAssociation(metaName="ImportedPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ImportedPackageSmDependency.class, partof = true)
     SmObjectImpl mImportedPackage;

    @objid ("53bd7628-d9a7-44a4-ab5c-594ce775f585")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004b4f92-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ad3885f1-4d35-4746-9468-3401441f19c7")
        private static SmClass smClass = null;

        @objid ("ccacb25a-f7df-4c1f-a087-53f67762e406")
        private static SmAttribute VisibilityAtt = null;

        @objid ("de6a7e84-b657-44b8-8fb4-434bfb8981fd")
        private static SmDependency ImportingOperationDep = null;

        @objid ("d232f7bb-3637-46d5-8185-b57001914348")
        private static SmDependency ImportingNameSpaceDep = null;

        @objid ("6935cdc6-67d5-4b94-8a06-b241572fb097")
        private static SmDependency ImportedPackageDep = null;

        @objid ("d0dd277b-5154-4ebb-b94b-cf8f54cbed14")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageImportData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("20ef8e8f-5134-4f3b-a76f-ff2ac78a69b2")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("b7fc9cea-e9d2-4820-90c5-53c6a926b183")
        public static SmDependency ImportingOperationDep() {
            if (ImportingOperationDep == null) {
            	ImportingOperationDep = classof().getDependencyDef("ImportingOperation");
            }
            return ImportingOperationDep;
        }

        @objid ("5f654156-a718-4a75-b73a-2a442ace3500")
        public static SmDependency ImportingNameSpaceDep() {
            if (ImportingNameSpaceDep == null) {
            	ImportingNameSpaceDep = classof().getDependencyDef("ImportingNameSpace");
            }
            return ImportingNameSpaceDep;
        }

        @objid ("2fb68a4a-4afc-4e31-8e44-bb378cc8696b")
        public static SmDependency ImportedPackageDep() {
            if (ImportedPackageDep == null) {
            	ImportedPackageDep = classof().getDependencyDef("ImportedPackage");
            }
            return ImportedPackageDep;
        }

        @objid ("17baf38c-ccec-4909-b839-ca72138d24b4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c0a4fc90-bee9-42f7-99e7-8feceac5977a")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("c6f6c755-178f-4197-a210-21031505b9b2")
        public static SmDependency getImportingNameSpaceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingNameSpaceDep;
        }

        @objid ("53a83cf1-9c01-477c-8658-bb4a73464b86")
        public static SmDependency getImportedPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportedPackageDep;
        }

        @objid ("704c58ac-8c52-4bce-831d-1b898e6da99f")
        public static SmDependency getImportingOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingOperationDep;
        }

        @objid ("004b90e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("016fa2a9-e782-4bee-8004-a475dde2ef0b")
            public ISmObjectData createData() {
                return new PackageImportData();
            }

            @objid ("e46f91cd-f622-4b13-a10f-510c7af0eb94")
            public SmObjectImpl createImpl() {
                return new PackageImportImpl();
            }

        }

        @objid ("004bf7da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("da5e803d-cd18-4c0f-ba14-9e5241d29668")
            public Object getValue(ISmObjectData data) {
                return ((PackageImportData) data).mVisibility;
            }

            @objid ("c6be65dd-b1d0-4f29-bc21-2fed6cb77ead")
            public void setValue(ISmObjectData data, Object value) {
                ((PackageImportData) data).mVisibility = value;
            }

        }

        @objid ("004c5b80-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportingNameSpaceSmDependency extends SmSingleDependency {
            @objid ("b142010a-af22-4b0a-ac20-ba9a53347f0a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportingNameSpace;
            }

            @objid ("e5a9ed3a-2cf0-49cf-9441-133f7084d832")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportingNameSpace = value;
            }

            @objid ("47cb35ab-2688-46cd-a6db-06e361c1c3b3")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedPackageImportDep();
            }

        }

        @objid ("004ccfde-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportingOperationSmDependency extends SmSingleDependency {
            @objid ("6bac997d-acd9-4113-b5ac-6c52b8412009")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportingOperation;
            }

            @objid ("0a8494e2-179b-4209-b921-526e1acf8db8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportingOperation = value;
            }

            @objid ("8fe094d8-f381-4e0c-9a2e-ea49e64de52b")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedPackageImportDep();
            }

        }

        @objid ("004d4c16-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportedPackageSmDependency extends SmSingleDependency {
            @objid ("9303e8de-9bb5-4cca-b229-1bd7a0d4a26c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportedPackage;
            }

            @objid ("533ab389-e32d-4a04-bd7a-e6f382304d5c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportedPackage = value;
            }

            @objid ("e41de426-be27-4b0b-93ba-a86e081f195a")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.PackageImportingDep();
            }

        }

    }

}
