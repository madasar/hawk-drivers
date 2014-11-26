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
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentTypeData;
import org.modelio.metamodel.data.uml.infrastructure.NoteTypeData;
import org.modelio.metamodel.data.uml.infrastructure.ProfileData;
import org.modelio.metamodel.data.uml.infrastructure.TagTypeData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.MetaclassReferenceImpl;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
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

@objid ("0091fc9e-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=MetaclassReference.class, factory=MetaclassReferenceData.Metadata.ObjectFactory.class, cmsnode=true)
public class MetaclassReferenceData extends ElementData {
    @objid ("a6b215b1-3775-49c9-b1e7-74fae7daeb16")
    @SmaMetaAttribute(metaName="ReferencedClassName", type=String.class, smAttributeClass=Metadata.ReferencedClassNameSmAttribute.class)
     Object mReferencedClassName = "";

    @objid ("2788fa16-d9b2-48c5-beac-ee601354680b")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     SmObjectImpl mDefinedTable;

    @objid ("2eedc7de-46ec-4d30-a5cf-b4a299f08a15")
    @SmaMetaAssociation(metaName="DefinedNoteType", typeDataClass=NoteTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedNoteTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedNoteType = null;

    @objid ("fdee9a44-0c4d-45fc-8b31-ad7848e1fac9")
    @SmaMetaAssociation(metaName="DefinedExternDocumentType", typeDataClass=ExternDocumentTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedExternDocumentTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedExternDocumentType = null;

    @objid ("d785c2c9-5284-4d62-ac78-bd029e53b8e3")
    @SmaMetaAssociation(metaName="OwnerProfile", typeDataClass=ProfileData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProfileSmDependency.class)
     SmObjectImpl mOwnerProfile;

    @objid ("5ee0b922-4ada-4b1b-acc6-899ba648d197")
    @SmaMetaAssociation(metaName="DefinedTagType", typeDataClass=TagTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTagTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTagType = null;

    @objid ("2ffd824e-587c-476c-93ae-cb4ad7f0be25")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00637770-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d5bd319b-a34c-4fe4-9734-2ec232b4c1be")
        private static SmClass smClass = null;

        @objid ("7301e651-6d9a-43c2-ab49-76d301b9c1d6")
        private static SmAttribute ReferencedClassNameAtt = null;

        @objid ("5c2c0a29-77cb-4f29-b76a-bf27a6dfd5d1")
        private static SmDependency DefinedTableDep = null;

        @objid ("4e080495-70e4-4d57-898b-b8ac2969187b")
        private static SmDependency DefinedNoteTypeDep = null;

        @objid ("9a2bd3d1-2af1-41d2-a6c8-00fde1262c63")
        private static SmDependency DefinedExternDocumentTypeDep = null;

        @objid ("029b659a-e061-47bc-a9d9-1ea276bf90b8")
        private static SmDependency OwnerProfileDep = null;

        @objid ("edb2be4d-374c-433d-a766-535f8161c7db")
        private static SmDependency DefinedTagTypeDep = null;

        @objid ("65353299-16d6-4fe7-b368-d69fad820664")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MetaclassReferenceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5bc80bf7-a14f-4d17-802a-1c267e3af07d")
        public static SmAttribute ReferencedClassNameAtt() {
            if (ReferencedClassNameAtt == null) {
            	ReferencedClassNameAtt = classof().getAttributeDef("ReferencedClassName");
            }
            return ReferencedClassNameAtt;
        }

        @objid ("71161dce-2e5d-4235-86f3-00509785ee83")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("f2e86b14-d495-456f-90d3-3bf7f4936bb8")
        public static SmDependency DefinedNoteTypeDep() {
            if (DefinedNoteTypeDep == null) {
            	DefinedNoteTypeDep = classof().getDependencyDef("DefinedNoteType");
            }
            return DefinedNoteTypeDep;
        }

        @objid ("1dcd4078-50e3-4e32-abc2-ba79918c2cfd")
        public static SmDependency DefinedExternDocumentTypeDep() {
            if (DefinedExternDocumentTypeDep == null) {
            	DefinedExternDocumentTypeDep = classof().getDependencyDef("DefinedExternDocumentType");
            }
            return DefinedExternDocumentTypeDep;
        }

        @objid ("acce5485-b82b-4e2f-9256-4ee23a891ac8")
        public static SmDependency OwnerProfileDep() {
            if (OwnerProfileDep == null) {
            	OwnerProfileDep = classof().getDependencyDef("OwnerProfile");
            }
            return OwnerProfileDep;
        }

        @objid ("81d58041-c1eb-4516-9eb4-a74e0ac6275c")
        public static SmDependency DefinedTagTypeDep() {
            if (DefinedTagTypeDep == null) {
            	DefinedTagTypeDep = classof().getDependencyDef("DefinedTagType");
            }
            return DefinedTagTypeDep;
        }

        @objid ("1fba77e5-096d-4390-b05c-ecee1814cd17")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("774f3bfb-38ea-4e51-9cc8-01f40fd006fe")
        public static SmDependency getDefinedNoteTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedNoteTypeDep;
        }

        @objid ("8b3f1110-edf1-4a5c-a272-c60ba9d4c877")
        public static SmDependency getDefinedExternDocumentTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedExternDocumentTypeDep;
        }

        @objid ("ffe0b071-c24e-4fe6-877e-39629b61e8c6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("01305d2d-8bef-4246-bdd8-fec543792b7d")
        public static SmDependency getOwnerProfileDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProfileDep;
        }

        @objid ("d376c04d-3b44-4904-97bb-53e8c2d24b84")
        public static SmAttribute getReferencedClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencedClassNameAtt;
        }

        @objid ("7cc574a1-6c3b-4417-b01b-1079fcebbac3")
        public static SmDependency getDefinedTagTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTagTypeDep;
        }

        @objid ("0063b88e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e610e216-bbf4-4c87-97e7-05ddc22dfc79")
            public ISmObjectData createData() {
                return new MetaclassReferenceData();
            }

            @objid ("3f01c60e-3822-4281-a134-2404005dd0e9")
            public SmObjectImpl createImpl() {
                return new MetaclassReferenceImpl();
            }

        }

        @objid ("0064254e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ReferencedClassNameSmAttribute extends SmAttribute {
            @objid ("1de8f9b5-6e5c-4d3a-90a8-431fe1be2a88")
            public Object getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mReferencedClassName;
            }

            @objid ("b1f3ea56-d6ea-453b-919e-aebb7bcad751")
            public void setValue(ISmObjectData data, Object value) {
                ((MetaclassReferenceData) data).mReferencedClassName = value;
            }

        }

        @objid ("00648926-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerProfileSmDependency extends SmSingleDependency {
            @objid ("10c69478-3df0-4f7b-91d7-a8455fe0607a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mOwnerProfile;
            }

            @objid ("f6cd28ba-2cd9-40f7-a667-f152d1344ee0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MetaclassReferenceData) data).mOwnerProfile = value;
            }

            @objid ("fb1e4f86-92a8-42a3-b671-05a5997eb2d3")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.OwnedReferenceDep();
            }

        }

        @objid ("0064fdca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedTagTypeSmDependency extends SmMultipleDependency {
            @objid ("4384b21d-0216-4613-9103-d6b2f12988cf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedTagType != null)? ((MetaclassReferenceData)data).mDefinedTagType:SmMultipleDependency.EMPTY;
            }

            @objid ("206dda65-8bc5-4937-a62b-1b16ed951f3c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedTagType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedTagType;
            }

            @objid ("e3d809b7-bd52-4351-a2a5-704386f3481a")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("00656256-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedNoteTypeSmDependency extends SmMultipleDependency {
            @objid ("536422ef-531a-4d60-aece-f49b232b0d84")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedNoteType != null)? ((MetaclassReferenceData)data).mDefinedNoteType:SmMultipleDependency.EMPTY;
            }

            @objid ("11baab7b-d21c-4cd1-a807-fa235ed94586")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedNoteType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedNoteType;
            }

            @objid ("fb76dbe6-5870-4e7a-81ab-d13ff5802602")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("0065c67e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedExternDocumentTypeSmDependency extends SmMultipleDependency {
            @objid ("58ad0d58-6be7-4b99-bd8d-9484dfae562a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedExternDocumentType != null)? ((MetaclassReferenceData)data).mDefinedExternDocumentType:SmMultipleDependency.EMPTY;
            }

            @objid ("6fe52576-a02b-4a8e-a54e-c23e59a734e3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedExternDocumentType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedExternDocumentType;
            }

            @objid ("822d2c6b-5329-490a-bc07-c01810af98c3")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("00968c5a-ec96-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmSingleDependency {
            @objid ("75e04c74-af7f-4e1d-8191-c1780f12c180")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mDefinedTable;
            }

            @objid ("6277e180-9695-4bc6-bda3-8e346d9d0296")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MetaclassReferenceData) data).mDefinedTable = value;
            }

            @objid ("53dbfbdf-c513-4154-b83b-fa8dd2699945")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerReferenceDep();
            }

        }

    }

}
