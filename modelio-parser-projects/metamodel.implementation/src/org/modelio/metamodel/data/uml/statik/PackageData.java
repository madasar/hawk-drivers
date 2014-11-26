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
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.mda.ProjectData;
import org.modelio.metamodel.data.uml.statik.PackageImportData;
import org.modelio.metamodel.data.uml.statik.PackageMergeData;
import org.modelio.metamodel.impl.uml.statik.PackageImpl;
import org.modelio.metamodel.uml.statik.Package;
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

@objid ("0015b9f4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Package.class, factory=PackageData.Metadata.ObjectFactory.class, cmsnode=true)
public class PackageData extends NameSpaceData {
    @objid ("0cdcbe79-f82c-499a-92a9-6a4e7c3bbff8")
    @SmaMetaAttribute(metaName="IsInstantiable", type=Boolean.class, smAttributeClass=Metadata.IsInstantiableSmAttribute.class)
     Object mIsInstantiable = false;

    @objid ("e1699e7e-dd9a-44ce-b0a7-0636a1ee1cce")
    @SmaMetaAssociation(metaName="BpmnRepresents", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentsSmDependency.class)
     List<SmObjectImpl> mBpmnRepresents = null;

    @objid ("50e58640-cf92-4b16-b2a3-dcc46ffd8769")
    @SmaMetaAssociation(metaName="ReceivingMerge", typeDataClass=PackageMergeData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivingMergeSmDependency.class, istodelete = true)
     List<SmObjectImpl> mReceivingMerge = null;

    @objid ("e4edc80a-145c-4646-b51c-99a83904f157")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ProjectData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class)
     SmObjectImpl mRepresented;

    @objid ("c6e33480-e323-4108-b8d5-73bb0d2bd50e")
    @SmaMetaAssociation(metaName="Merge", typeDataClass=PackageMergeData.class, min=0, max=-1, smAssociationClass=Metadata.MergeSmDependency.class, component = true)
     List<SmObjectImpl> mMerge = null;

    @objid ("97f77a60-c93e-437b-87f2-68ae302e2f37")
    @SmaMetaAssociation(metaName="PackageImporting", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.PackageImportingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mPackageImporting = null;

    @objid ("0ee6308f-7943-43ec-ba7d-065b304445f8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007fbb56-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ca3a357e-974b-4ad3-912d-e72ba37b71b5")
        private static SmClass smClass = null;

        @objid ("d3746c6a-9400-4a00-a18e-a5a3395cee88")
        private static SmAttribute IsInstantiableAtt = null;

        @objid ("6fd9654d-1f3c-4141-afd7-6b45a6f4f34b")
        private static SmDependency BpmnRepresentsDep = null;

        @objid ("ea5fa955-acd5-44dc-9200-305b6e6ac728")
        private static SmDependency ReceivingMergeDep = null;

        @objid ("d59dccba-40ed-4ec8-87ab-24b4335b7c4d")
        private static SmDependency RepresentedDep = null;

        @objid ("b6e43b36-33a7-4541-9443-57dc9bc6dadb")
        private static SmDependency MergeDep = null;

        @objid ("86dc3ef2-5b96-4b8f-b5d0-4590a8363de1")
        private static SmDependency PackageImportingDep = null;

        @objid ("42cb8be7-f2a2-42cb-ae20-d5f70fe5d084")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2222fd2a-4418-42b7-99f3-9e420d6fed24")
        public static SmAttribute IsInstantiableAtt() {
            if (IsInstantiableAtt == null) {
            	IsInstantiableAtt = classof().getAttributeDef("IsInstantiable");
            }
            return IsInstantiableAtt;
        }

        @objid ("5fcb69e5-c8a4-463d-add3-d306a9660399")
        public static SmDependency BpmnRepresentsDep() {
            if (BpmnRepresentsDep == null) {
            	BpmnRepresentsDep = classof().getDependencyDef("BpmnRepresents");
            }
            return BpmnRepresentsDep;
        }

        @objid ("44533759-8b61-4fef-81d5-255ddc2b6756")
        public static SmDependency ReceivingMergeDep() {
            if (ReceivingMergeDep == null) {
            	ReceivingMergeDep = classof().getDependencyDef("ReceivingMerge");
            }
            return ReceivingMergeDep;
        }

        @objid ("04430a30-acc8-4a2d-a6d6-727d3a52002b")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("d53be21d-fd25-4aef-8fa9-93d4fe808d0e")
        public static SmDependency MergeDep() {
            if (MergeDep == null) {
            	MergeDep = classof().getDependencyDef("Merge");
            }
            return MergeDep;
        }

        @objid ("715f7689-b628-40bb-9cbe-d3eea8f63e13")
        public static SmDependency PackageImportingDep() {
            if (PackageImportingDep == null) {
            	PackageImportingDep = classof().getDependencyDef("PackageImporting");
            }
            return PackageImportingDep;
        }

        @objid ("8a846275-09f5-4ef3-be66-6e852a9b28a7")
        public static SmDependency getMergeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MergeDep;
        }

        @objid ("6c14ff2e-de62-42e8-87ad-625d01cc41e5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("66efca70-2f9c-413e-bdf4-004ce324020d")
        public static SmDependency getPackageImportingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PackageImportingDep;
        }

        @objid ("8b1a147f-efc1-4935-8348-2065d8b54ac8")
        public static SmAttribute getIsInstantiableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsInstantiableAtt;
        }

        @objid ("8000fcb9-7e05-4d4e-a3f1-4ca7c04a5e2c")
        public static SmDependency getBpmnRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentsDep;
        }

        @objid ("f2343369-100c-47fc-b6c8-7a4011289a1f")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("5554e9a5-b46a-43c7-9685-c05ca6e5b0c7")
        public static SmDependency getReceivingMergeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivingMergeDep;
        }

        @objid ("007ffc9c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("68cd71b0-6c47-4f98-a77b-c35a9c069c25")
            public ISmObjectData createData() {
                return new PackageData();
            }

            @objid ("49c78656-3eb3-4a27-bd69-cb4c81bdd0df")
            public SmObjectImpl createImpl() {
                return new PackageImpl();
            }

        }

        @objid ("008061be-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsInstantiableSmAttribute extends SmAttribute {
            @objid ("c86436f7-d860-41b7-b246-12af81492db2")
            public Object getValue(ISmObjectData data) {
                return ((PackageData) data).mIsInstantiable;
            }

            @objid ("e2aec1da-f9d0-47c0-9843-3d9b2f8c4849")
            public void setValue(ISmObjectData data, Object value) {
                ((PackageData) data).mIsInstantiable = value;
            }

        }

        @objid ("0080c546-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MergeSmDependency extends SmMultipleDependency {
            @objid ("754dbd1a-b6e6-413c-8c56-771211b401e2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mMerge != null)? ((PackageData)data).mMerge:SmMultipleDependency.EMPTY;
            }

            @objid ("d219b8ff-fa06-443d-b225-7ed6d461766f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mMerge = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mMerge;
            }

            @objid ("5ee6cf64-2695-43fd-bfbc-c041d760bb63")
            @Override
            public SmDependency getSymetric() {
                return PackageMergeData.Metadata.ReceivingPackageDep();
            }

        }

        @objid ("008128e2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PackageImportingSmDependency extends SmMultipleDependency {
            @objid ("48d00a2f-d86b-4d99-bd0f-576f1b3c9025")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mPackageImporting != null)? ((PackageData)data).mPackageImporting:SmMultipleDependency.EMPTY;
            }

            @objid ("67e00130-a384-4130-a96e-7fc6e3e982da")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mPackageImporting = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mPackageImporting;
            }

            @objid ("16aa19a4-e972-4fb4-b1a6-150db82444de")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportedPackageDep();
            }

        }

        @objid ("00818ee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivingMergeSmDependency extends SmMultipleDependency {
            @objid ("bf15a3e6-a8b1-4f10-8603-6c57a1b364fc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mReceivingMerge != null)? ((PackageData)data).mReceivingMerge:SmMultipleDependency.EMPTY;
            }

            @objid ("bb1d3fe6-2abb-429b-a51b-cb80b3252385")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mReceivingMerge = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mReceivingMerge;
            }

            @objid ("e0aa90ee-5f74-4d4c-a5cc-4f0a2c051378")
            @Override
            public SmDependency getSymetric() {
                return PackageMergeData.Metadata.MergedPackageDep();
            }

        }

        @objid ("0081f2a4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("00f4f4f0-fb35-492c-a4d0-557ec7eca93a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageData) data).mRepresented;
            }

            @objid ("1ff0c3c8-df30-4fd3-9458-47908da5ba51")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageData) data).mRepresented = value;
            }

            @objid ("2160c8bc-f007-4c72-ae34-27caac964fdc")
            @Override
            public SmDependency getSymetric() {
                return ProjectData.Metadata.ModelDep();
            }

        }

        @objid ("00826a4a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentsSmDependency extends SmMultipleDependency {
            @objid ("c0770a53-e55e-46e0-b676-97076c21a8c4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mBpmnRepresents != null)? ((PackageData)data).mBpmnRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("94e4d5a6-cfcf-4868-b661-f37ba80a772c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mBpmnRepresents = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mBpmnRepresents;
            }

            @objid ("f7d84326-a5f2-4d5f-9d43-4410c9894d6d")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.PackageRefDep();
            }

        }

    }

}
