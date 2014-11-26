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
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.data.uml.infrastructure.NoteData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.impl.uml.infrastructure.NoteTypeImpl;
import org.modelio.metamodel.uml.infrastructure.NoteType;
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

@objid ("008c3692-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NoteType.class, factory=NoteTypeData.Metadata.ObjectFactory.class)
public class NoteTypeData extends ModelElementData {
    @objid ("2ba4da86-6c9c-4dde-bc90-dfeee7958dd9")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("e15326de-7baa-41f9-8278-4d1ea5544772")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("d96f0356-449f-450b-a779-9a0f2a9e88e1")
    @SmaMetaAttribute(metaName="MimeType", type=String.class, smAttributeClass=Metadata.MimeTypeSmAttribute.class)
     Object mMimeType = "";

    @objid ("5a0c7060-6b55-4ca9-ba26-37c4bc33b280")
    @SmaMetaAssociation(metaName="Element", typeDataClass=NoteData.class, min=0, max=-1, smAssociationClass=Metadata.ElementSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mElement = null;

    @objid ("1ca6ffb0-020c-490b-a81c-86b179fd4608")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("96e28ace-df91-4b84-9b85-fb484a83bbb5")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("6f813ea2-2776-4884-894b-18fc86a33017")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0038da56-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("03728845-76d5-49a4-ac07-31a6eff46bb4")
        private static SmClass smClass = null;

        @objid ("9c9d81be-0945-4771-950d-450a71618118")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("60fc60bc-1bc9-4822-9968-c68d0f09430b")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("0bd0bc32-e255-4824-b634-ed28397f9f82")
        private static SmAttribute MimeTypeAtt = null;

        @objid ("0c51c81e-d68e-44d8-aefe-d884f6b8cdfe")
        private static SmDependency ElementDep = null;

        @objid ("2539bb87-04b5-42ba-8afa-a07cc18463ff")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("89ef72b9-e669-4a09-b294-464d6f5856d7")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("3e393e49-c9d0-4fa9-a89f-9e8a3019be9e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NoteTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("94592d59-9be0-4ae4-80fc-015ddcf2a438")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("859d3f9f-f179-4950-8bd2-c9222217fab0")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("1a14626c-a841-4b76-9c77-1cfb4e1b946e")
        public static SmAttribute MimeTypeAtt() {
            if (MimeTypeAtt == null) {
            	MimeTypeAtt = classof().getAttributeDef("MimeType");
            }
            return MimeTypeAtt;
        }

        @objid ("3d8ac67a-a703-459c-8352-7554c50bb2c4")
        public static SmDependency ElementDep() {
            if (ElementDep == null) {
            	ElementDep = classof().getDependencyDef("Element");
            }
            return ElementDep;
        }

        @objid ("82b6e1da-6f60-49ce-be04-2743d424c62b")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("09addc88-0a37-4ddc-bf7f-9e6bce479176")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("93dd08e0-737b-4490-be0e-02067ce99eaf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d2a275e4-1895-4536-a375-798abdf68c98")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("3ec8e470-cc42-430a-8170-28176d197a37")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("bc2b8640-3632-4b57-8ef0-9ba71d442d7f")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("218f09b9-e061-42a7-b4f6-e1ef70997c14")
        public static SmDependency getElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ElementDep;
        }

        @objid ("76040dd8-ccac-4c03-bc18-e1f9052dafaf")
        public static SmAttribute getMimeTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MimeTypeAtt;
        }

        @objid ("230b2ea8-1bf8-4ad2-a667-dcaa167fb3fb")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("00391b74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("deed80ef-2a3f-40cd-83d7-191e71d36d6a")
            public ISmObjectData createData() {
                return new NoteTypeData();
            }

            @objid ("b41311c6-bdf6-4ff7-ad0b-7d5a168599aa")
            public SmObjectImpl createImpl() {
                return new NoteTypeImpl();
            }

        }

        @objid ("00397f74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("728d5a54-d623-4e4a-977c-25e07514752b")
            public Object getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mIsHidden;
            }

            @objid ("aaf530ba-e152-40f8-9fd0-f59864f4622e")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteTypeData) data).mIsHidden = value;
            }

        }

        @objid ("003a44f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ElementSmDependency extends SmMultipleDependency {
            @objid ("684bfca8-2416-4baf-a44a-7d99be91849a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NoteTypeData)data).mElement != null)? ((NoteTypeData)data).mElement:SmMultipleDependency.EMPTY;
            }

            @objid ("ebfff4a9-3466-4f55-9b7b-4f69b2d152b2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NoteTypeData) data).mElement = new ArrayList<>(initialCapacity);
                return ((NoteTypeData) data).mElement;
            }

            @objid ("adc87815-dc36-49f2-bd0a-3eb7dd4fa804")
            @Override
            public SmDependency getSymetric() {
                return NoteData.Metadata.ModelDep();
            }

        }

        @objid ("003b0f7e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("03431ca2-278f-4094-85b8-6588f30a6af0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mOwnerStereotype;
            }

            @objid ("16cfc526-9bca-4148-9353-6c8998758841")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteTypeData) data).mOwnerStereotype = value;
            }

            @objid ("7fa43861-cfc9-4b5f-8635-740bde25185f")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedNoteTypeDep();
            }

        }

        @objid ("003b8f30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("63fea3ce-3f32-4a8c-a1bd-c4dc65b58da8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mOwnerReference;
            }

            @objid ("7f090322-8965-4403-825f-96e22fca4c79")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteTypeData) data).mOwnerReference = value;
            }

            @objid ("b7a729e9-2e4e-44f6-b9b1-a8cf15b83bbd")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedNoteTypeDep();
            }

        }

        @objid ("c390fed3-62cb-4e00-a1f6-4531f4b32172")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("ff403f3f-a758-40b3-8da9-15ba8f0ea9cf")
            public Object getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mLabelKey;
            }

            @objid ("dd52e4e9-d490-4b33-b526-c59df8503d80")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteTypeData) data).mLabelKey = value;
            }

        }

        @objid ("d3b69813-78de-4f13-94fd-14251d21ddb7")
        public static class MimeTypeSmAttribute extends SmAttribute {
            @objid ("0bae084b-e146-46a4-af14-0763c425f156")
            public Object getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mMimeType;
            }

            @objid ("76ad8202-d1f2-424f-a998-7f803f8da455")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteTypeData) data).mMimeType = value;
            }

        }

    }

}
