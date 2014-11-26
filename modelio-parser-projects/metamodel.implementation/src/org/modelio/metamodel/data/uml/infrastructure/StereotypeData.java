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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.NoteTypeData;
import org.modelio.metamodel.data.uml.infrastructure.ProfileData;
import org.modelio.metamodel.data.uml.infrastructure.TagTypeData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.StereotypeImpl;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
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

@objid ("008d9532-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Stereotype.class, factory=StereotypeData.Metadata.ObjectFactory.class, cmsnode=true)
public class StereotypeData extends ModelElementData {
    @objid ("19c5839b-9c20-42b3-b254-764187f5d5ee")
    @SmaMetaAttribute(metaName="Image", type=String.class, smAttributeClass=Metadata.ImageSmAttribute.class)
     Object mImage = "";

    @objid ("460b6b4a-152d-47d6-ac35-70a082400c55")
    @SmaMetaAttribute(metaName="Icon", type=String.class, smAttributeClass=Metadata.IconSmAttribute.class)
     Object mIcon = "";

    @objid ("b1627cf8-cb5d-4cc0-9704-4c4ecfd0a5d7")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("6ec45236-e99e-4ee3-9b59-283c197528f9")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("71044ad3-8503-42e8-b3ca-40bba51f8f59")
    @SmaMetaAttribute(metaName="BaseClassName", type=String.class, smAttributeClass=Metadata.BaseClassNameSmAttribute.class)
     Object mBaseClassName = "";

    @objid ("8d5c1e96-80f8-45f9-ba6e-a50a5d23ed5f")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     SmObjectImpl mDefinedTable;

    @objid ("f32df9c3-0a74-4496-b3e8-b71f20760c24")
    @SmaMetaAssociation(metaName="ExtendedElement", typeDataClass=ModelElementData.class, min=0, max=-1, smAssociationClass=Metadata.ExtendedElementSmDependency.class)
     List<SmObjectImpl> mExtendedElement = null;

    @objid ("33bc3ff0-33b4-4f1a-b0c1-02882b7baac0")
    @SmaMetaAssociation(metaName="DefinedExternDocumentType", typeDataClass=ExternDocumentTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedExternDocumentTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedExternDocumentType = null;

    @objid ("f1834dd5-69ae-4210-a520-ff6a1e9931e8")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ProfileData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("cb9e2268-e3f8-4950-a32a-c86b9450aa10")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class, partof = true)
     SmObjectImpl mParent;

    @objid ("0915dab2-32ee-4e39-98ea-277eb11b50c5")
    @SmaMetaAssociation(metaName="DefinedTagType", typeDataClass=TagTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTagTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTagType = null;

    @objid ("46af0637-ffce-46a4-9ef8-4f08eceb2c8d")
    @SmaMetaAssociation(metaName="Child", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.ChildSmDependency.class)
     List<SmObjectImpl> mChild = null;

    @objid ("a18180f6-0a18-40bb-97b2-5a6790446383")
    @SmaMetaAssociation(metaName="DefinedNoteType", typeDataClass=NoteTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedNoteTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedNoteType = null;

    @objid ("fff333cc-45e8-47d6-a14b-2511d7bd8fd7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0065bb2a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8300f3ca-1642-44bf-acca-2469c0d41c52")
        private static SmClass smClass = null;

        @objid ("cced2f92-86d0-4809-8ff5-095950fc0fc0")
        private static SmAttribute ImageAtt = null;

        @objid ("ad5c7804-9180-409e-96fd-b5ea3cc3b970")
        private static SmAttribute IconAtt = null;

        @objid ("ef0e5387-050e-4828-b899-d1cde7f38215")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("18c5bd9b-ceb4-4e1f-84af-931d883095e6")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("3bb7edc9-d424-4e1d-8ff7-4b17441407cd")
        private static SmAttribute BaseClassNameAtt = null;

        @objid ("bc591acd-c731-4ec6-bd2f-343c3a2dec74")
        private static SmDependency DefinedTableDep = null;

        @objid ("7ccdb0e9-b576-4a6a-acb9-3f80b602f774")
        private static SmDependency ExtendedElementDep = null;

        @objid ("57d0edb0-15dc-4245-a544-ab5fb7edbce7")
        private static SmDependency DefinedExternDocumentTypeDep = null;

        @objid ("c275d12f-b78f-4261-bfc5-46c398452916")
        private static SmDependency OwnerDep = null;

        @objid ("657275c7-5731-461f-ae10-ea7ec20cd2af")
        private static SmDependency ParentDep = null;

        @objid ("4c64f044-fe08-47e8-be9e-eaca3005cb8c")
        private static SmDependency DefinedTagTypeDep = null;

        @objid ("4fb92466-78b1-4d12-ab2c-84f55ab27819")
        private static SmDependency ChildDep = null;

        @objid ("b61aecc2-a62c-48d0-a158-513eb5636dad")
        private static SmDependency DefinedNoteTypeDep = null;

        @objid ("2fce961e-3b32-4ef4-a481-ce0015fa2733")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StereotypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("95e3f313-ac66-4aeb-804a-399ba0265f10")
        public static SmAttribute ImageAtt() {
            if (ImageAtt == null) {
            	ImageAtt = classof().getAttributeDef("Image");
            }
            return ImageAtt;
        }

        @objid ("1dbecdc6-0d92-4757-abba-c86b2b1390d0")
        public static SmAttribute IconAtt() {
            if (IconAtt == null) {
            	IconAtt = classof().getAttributeDef("Icon");
            }
            return IconAtt;
        }

        @objid ("ce4abf49-743f-4705-b7d3-632c19c58527")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("82a13990-3a51-4af4-bc2c-7352ecf424a0")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("ec19cfae-7bba-4b23-b64a-7c59d141e084")
        public static SmAttribute BaseClassNameAtt() {
            if (BaseClassNameAtt == null) {
            	BaseClassNameAtt = classof().getAttributeDef("BaseClassName");
            }
            return BaseClassNameAtt;
        }

        @objid ("08952be2-563c-4a42-9229-1aad2f47a836")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("acac1be1-f283-4c7d-aca2-8b03c7d098f1")
        public static SmDependency ExtendedElementDep() {
            if (ExtendedElementDep == null) {
            	ExtendedElementDep = classof().getDependencyDef("ExtendedElement");
            }
            return ExtendedElementDep;
        }

        @objid ("db6becbd-c370-48c1-853d-d4e8514189d1")
        public static SmDependency DefinedExternDocumentTypeDep() {
            if (DefinedExternDocumentTypeDep == null) {
            	DefinedExternDocumentTypeDep = classof().getDependencyDef("DefinedExternDocumentType");
            }
            return DefinedExternDocumentTypeDep;
        }

        @objid ("3ec8d601-c23d-44c4-94c7-796b0d605099")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("f578e372-5573-4774-8cb3-aaf45b6358b7")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("e5d77d3b-2e4a-4182-8ef8-a58e66e0d66b")
        public static SmDependency DefinedTagTypeDep() {
            if (DefinedTagTypeDep == null) {
            	DefinedTagTypeDep = classof().getDependencyDef("DefinedTagType");
            }
            return DefinedTagTypeDep;
        }

        @objid ("271d342b-a6ef-47aa-a953-08e6137412db")
        public static SmDependency ChildDep() {
            if (ChildDep == null) {
            	ChildDep = classof().getDependencyDef("Child");
            }
            return ChildDep;
        }

        @objid ("0c9ec276-e84a-42de-82eb-ee17a68ed3c7")
        public static SmDependency DefinedNoteTypeDep() {
            if (DefinedNoteTypeDep == null) {
            	DefinedNoteTypeDep = classof().getDependencyDef("DefinedNoteType");
            }
            return DefinedNoteTypeDep;
        }

        @objid ("101afd05-7136-46c8-bd76-bde0f42d0fcd")
        public static SmDependency getDefinedNoteTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedNoteTypeDep;
        }

        @objid ("82d8ee77-05ed-4879-ab13-1bae04571ebf")
        public static SmDependency getDefinedTagTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTagTypeDep;
        }

        @objid ("a26c85c1-ef3f-4f8a-9c38-6b47e2151c77")
        public static SmDependency getChildDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChildDep;
        }

        @objid ("533297b0-3675-4b94-995e-c7a87c317e63")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("8e27a91d-aabe-4c8e-ae84-b7907ea95f4e")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("2b12eaeb-a0c8-4945-8ec6-f49d8bfe0c11")
        public static SmAttribute getIconAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IconAtt;
        }

        @objid ("e16f6c4f-0937-46c8-b78d-b22c4f5b7e58")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("f502f2d4-7789-4d10-9c11-0b5455715038")
        public static SmAttribute getImageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImageAtt;
        }

        @objid ("998d3bf7-def7-4c41-a7e8-9bdf62435e3f")
        public static SmDependency getDefinedExternDocumentTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedExternDocumentTypeDep;
        }

        @objid ("b8ef473e-82f4-4d92-82fb-fc3224098404")
        public static SmAttribute getBaseClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseClassNameAtt;
        }

        @objid ("31d733ce-094c-4fcd-8126-24365a315ed8")
        public static SmDependency getExtendedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtendedElementDep;
        }

        @objid ("aa0a3bb7-db80-468f-9b3b-ce39f22a1c56")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4762bdd6-ae90-472c-b29a-e3ed1024b36f")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("9b3560b9-369f-4d2e-86f0-6f797bed48fa")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("0065fb3a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4bd4334c-1a89-4563-9519-5b02515d9cce")
            public ISmObjectData createData() {
                return new StereotypeData();
            }

            @objid ("a06a1fed-0f92-467c-b165-b55e52735a2f")
            public SmObjectImpl createImpl() {
                return new StereotypeImpl();
            }

        }

        @objid ("00665bf2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IconSmAttribute extends SmAttribute {
            @objid ("eefe5fd6-1797-4ea1-8b09-a39a71ed63da")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mIcon;
            }

            @objid ("8a587991-95bf-44a7-916a-e4be838dcf71")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mIcon = value;
            }

        }

        @objid ("00671e02-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("eba32716-1e4a-48ae-9301-0a403f3a38dc")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mIsHidden;
            }

            @objid ("6ad9e206-cda1-4600-9493-f8361b950f4c")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mIsHidden = value;
            }

        }

        @objid ("0067e152-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BaseClassNameSmAttribute extends SmAttribute {
            @objid ("83259361-22fd-4d06-85a9-0c09ef1acd19")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mBaseClassName;
            }

            @objid ("ccf692d4-b09c-4402-868b-0c55ccad0b74")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mBaseClassName = value;
            }

        }

        @objid ("00684660-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExtendedElementSmDependency extends SmMultipleDependency {
            @objid ("e04e21d8-9c39-48d7-aa54-1f3cabb7642a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mExtendedElement != null)? ((StereotypeData)data).mExtendedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("03de626b-8359-42fd-a09e-45aa8d79ad5f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mExtendedElement = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mExtendedElement;
            }

            @objid ("fec5faac-8e20-4e93-910a-041899db1186")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ExtensionDep();
            }

        }

        @objid ("0068ab32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("64c33278-2144-473d-b3b2-98225fd5a2c9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mOwner;
            }

            @objid ("1f340717-8cb6-4df5-93a9-4c80366f928f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mOwner = value;
            }

            @objid ("793cde38-42ba-4a3a-8620-bac60ca87b60")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.DefinedStereotypeDep();
            }

        }

        @objid ("006921b6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedTagTypeSmDependency extends SmMultipleDependency {
            @objid ("663957c8-f5bc-431e-8f9d-082427ce03e5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedTagType != null)? ((StereotypeData)data).mDefinedTagType:SmMultipleDependency.EMPTY;
            }

            @objid ("d194ce34-783b-4910-a624-ac3882cf9966")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedTagType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedTagType;
            }

            @objid ("27796847-3fa1-4742-95bc-2b9a5ac2bf71")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006b13fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedNoteTypeSmDependency extends SmMultipleDependency {
            @objid ("383b7396-3250-4464-b28b-ba72bc86aa7c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedNoteType != null)? ((StereotypeData)data).mDefinedNoteType:SmMultipleDependency.EMPTY;
            }

            @objid ("962abbef-1c40-40be-b4e8-7e01899803af")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedNoteType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedNoteType;
            }

            @objid ("3b8fbfff-d2bc-4939-9aa0-e4cb1f2f2c27")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006b8816-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedExternDocumentTypeSmDependency extends SmMultipleDependency {
            @objid ("d7441a9f-b82e-4e60-adc0-03cf6faa3780")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedExternDocumentType != null)? ((StereotypeData)data).mDefinedExternDocumentType:SmMultipleDependency.EMPTY;
            }

            @objid ("5e56968b-6807-48fb-9bac-51b6a3d33dbe")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedExternDocumentType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedExternDocumentType;
            }

            @objid ("9092fd7e-909c-41db-9cb4-172859417d65")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006c679a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ChildSmDependency extends SmMultipleDependency {
            @objid ("6786f56f-f3d9-4bd4-9630-11de6c7d0d6e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mChild != null)? ((StereotypeData)data).mChild:SmMultipleDependency.EMPTY;
            }

            @objid ("6a03cd90-45b4-400f-8cfc-f80daf4961e5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mChild = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mChild;
            }

            @objid ("3b939b95-759b-4428-bf51-ddb42cdb5ea0")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ParentDep();
            }

        }

        @objid ("006cd48c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("cfe8aa5c-b63b-476c-a26f-d2d26ceaa2b5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mParent;
            }

            @objid ("b5799b9f-7adc-41db-8b15-f3a37b9d1e85")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mParent = value;
            }

            @objid ("47c7caca-e51d-4e93-8007-78ab23163c03")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ChildDep();
            }

        }

        @objid ("00826b26-2f94-107d-a05b-001ec947cd2a")
        public static class ImageSmAttribute extends SmAttribute {
            @objid ("e71496c6-0eca-44d7-bc5e-9f2329f89707")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mImage;
            }

            @objid ("882ab081-2c3c-4003-803d-c093af23d929")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mImage = value;
            }

        }

        @objid ("00118848-ec99-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmSingleDependency {
            @objid ("fbb1c311-1037-4ee4-b1c6-aea7206ae3fe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mDefinedTable;
            }

            @objid ("0cc780b4-3eec-4c65-9512-dc32ded71f1c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mDefinedTable = value;
            }

            @objid ("bed1508c-fd3f-4b75-af95-af32457efe7a")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("27ea5633-e9af-4176-a8da-80014b3d98e6")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("68fa2195-747e-4ce5-9b45-0577c27a6b9c")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mLabelKey;
            }

            @objid ("e45a16fa-83c1-47f0-8c10-6e930473c6f2")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mLabelKey = value;
            }

        }

    }

}
