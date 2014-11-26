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
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentData;
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentTypeImpl;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
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

@objid ("00937678-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExternDocumentType.class, factory=ExternDocumentTypeData.Metadata.ObjectFactory.class)
public class ExternDocumentTypeData extends ModelElementData {
    @objid ("26a883ee-7c75-4ecf-bf05-e7cd2bdc42d4")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("c50ead6d-4661-4a74-bbbe-8c0e597b8028")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("50142bb9-9364-414f-b477-0eb36591141f")
    @SmaMetaAttribute(metaName="Icon", type=String.class, smAttributeClass=Metadata.IconSmAttribute.class)
     Object mIcon = "";

    @objid ("312014df-d194-443b-86d9-318f3a0e9fb8")
    @SmaMetaAttribute(metaName="Image", type=String.class, smAttributeClass=Metadata.ImageSmAttribute.class)
     Object mImage = "";

    @objid ("a0b79d65-f1d2-4416-a0e3-332d30529975")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("a4f8d9d7-394b-4dc9-88d4-f46c9fb497ae")
    @SmaMetaAssociation(metaName="TypedDoc", typeDataClass=ExternDocumentData.class, min=0, max=-1, smAssociationClass=Metadata.TypedDocSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mTypedDoc = null;

    @objid ("fdf1ea06-11ea-4a31-9cb1-30dea951f369")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("629d9a72-bf62-4e45-a0d3-2c96dc8ec42e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0096f2da-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("871dd09e-b432-4a4a-bd6e-eccaebc94d9a")
        private static SmClass smClass = null;

        @objid ("27a049c5-0b9c-49c8-a0c1-f2db4d3817af")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("093f51d1-6cd6-44d5-9bc8-aeabf6983c0b")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("a17a5fde-b211-45b2-81fb-4da76c3d8d57")
        private static SmAttribute IconAtt = null;

        @objid ("2886a4e5-9520-4214-9c4a-4bf04db44a01")
        private static SmAttribute ImageAtt = null;

        @objid ("8813b37f-411a-47ab-986f-65bd8908a70d")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("28c8acfe-9d95-4157-b7dd-62ce5b8f4fc3")
        private static SmDependency TypedDocDep = null;

        @objid ("08580917-1611-4327-89aa-20e43a12a26c")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("40eac7f7-7494-4bd2-8569-f2a9ea99e90d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternDocumentTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f1279447-13a4-40a9-b10d-a60eaed71b0d")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("542601d1-62b2-41ba-bad6-d77d722559c5")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("b0b65a71-4b00-4bcb-b4d4-75b0f9072d65")
        public static SmAttribute IconAtt() {
            if (IconAtt == null) {
            	IconAtt = classof().getAttributeDef("Icon");
            }
            return IconAtt;
        }

        @objid ("d987e234-3c04-4bde-9307-ffa9c23b87d8")
        public static SmAttribute ImageAtt() {
            if (ImageAtt == null) {
            	ImageAtt = classof().getAttributeDef("Image");
            }
            return ImageAtt;
        }

        @objid ("6511aba3-3bd4-4c1e-b35d-b5a30fd69af0")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("26476a17-8c10-46b8-9090-81305dade3ee")
        public static SmDependency TypedDocDep() {
            if (TypedDocDep == null) {
            	TypedDocDep = classof().getDependencyDef("TypedDoc");
            }
            return TypedDocDep;
        }

        @objid ("47685855-8f71-44f3-9c0c-0c9026699ef7")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("389899f1-482f-40f7-b4f4-f07e48a0646d")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("b529b633-fa31-4038-b27c-6dd1a4df2934")
        public static SmDependency getTypedDocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedDocDep;
        }

        @objid ("e3ba1dd8-613d-4d07-8e0e-0c46e6a30cf1")
        public static SmAttribute getIconAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IconAtt;
        }

        @objid ("49b2d383-367d-4717-8fe9-420b48815455")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("71ab1fef-2207-452e-aefa-ac135e2edca3")
        public static SmAttribute getImageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImageAtt;
        }

        @objid ("ea3b4841-0062-4f08-be2c-7c7b31537a0b")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("383f8315-b6dc-46da-b019-3f41c7e8d337")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d01a6d0e-6449-48ed-b4c9-a9016f357e44")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("009733f8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6cdd0d45-7ab7-411d-bbe8-7a25313bb66a")
            public ISmObjectData createData() {
                return new ExternDocumentTypeData();
            }

            @objid ("457f37d2-7593-4e11-9efb-b5b9175dc491")
            public SmObjectImpl createImpl() {
                return new ExternDocumentTypeImpl();
            }

        }

        @objid ("00979992-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("cf3ee4fb-62a9-47bd-add8-3ff875f49190")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mIsHidden;
            }

            @objid ("dcf9501f-fc88-488f-8c25-dd911f5a18b5")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mIsHidden = value;
            }

        }

        @objid ("00985dfa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IconSmAttribute extends SmAttribute {
            @objid ("f9c91d60-9a4b-44a4-ac53-7808b7646f32")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mIcon;
            }

            @objid ("6ac07652-2284-49cb-9702-4cb673b42814")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mIcon = value;
            }

        }

        @objid ("00002bca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImageSmAttribute extends SmAttribute {
            @objid ("8adcd77c-09b3-4218-93ca-461705dc8588")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mImage;
            }

            @objid ("49a0fe4c-7233-417e-ae99-7460856501cf")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mImage = value;
            }

        }

        @objid ("000091d2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypedDocSmDependency extends SmMultipleDependency {
            @objid ("795c228b-4b05-456c-b10d-c0ec278ec5bb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExternDocumentTypeData)data).mTypedDoc != null)? ((ExternDocumentTypeData)data).mTypedDoc:SmMultipleDependency.EMPTY;
            }

            @objid ("7bf85b6d-914b-43b1-ae14-459197a4dfba")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExternDocumentTypeData) data).mTypedDoc = new ArrayList<>(initialCapacity);
                return ((ExternDocumentTypeData) data).mTypedDoc;
            }

            @objid ("47f19619-ef5d-4d1a-b361-0bc067d93c9e")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentData.Metadata.TypeDep();
            }

        }

        @objid ("00010004-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("171c95ee-ff22-483b-ade1-e29ba49f276d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mOwnerStereotype;
            }

            @objid ("2656f240-048f-4b95-89b2-4f32cb545413")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentTypeData) data).mOwnerStereotype = value;
            }

            @objid ("8de67681-4c55-4444-8346-91c89e79e752")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedExternDocumentTypeDep();
            }

        }

        @objid ("000180a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("608ae87a-3c69-47a6-8940-b753df3b0d25")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mOwnerReference;
            }

            @objid ("685c8615-c9a1-4461-85da-224479028a31")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentTypeData) data).mOwnerReference = value;
            }

            @objid ("6b1b4c39-4f77-4c49-9797-0193ddbb68fa")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedExternDocumentTypeDep();
            }

        }

        @objid ("c5b47be4-961c-46e8-8bc0-b65eb132295f")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("10d73ab1-e79f-4001-9209-d73f796bf28f")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mLabelKey;
            }

            @objid ("fa338ef5-6f2a-4c96-9bc0-30bad2836850")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mLabelKey = value;
            }

        }

    }

}
