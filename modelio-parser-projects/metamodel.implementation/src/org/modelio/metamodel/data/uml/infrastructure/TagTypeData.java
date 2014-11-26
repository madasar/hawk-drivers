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
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.data.uml.infrastructure.TaggedValueData;
import org.modelio.metamodel.impl.uml.infrastructure.TagTypeImpl;
import org.modelio.metamodel.uml.infrastructure.TagType;
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

@objid ("008fbe34-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TagType.class, factory=TagTypeData.Metadata.ObjectFactory.class)
public class TagTypeData extends ModelElementData {
    @objid ("734964e9-ae65-408c-8090-dc4945e6a8be")
    @SmaMetaAttribute(metaName="ParamNumber", type=String.class, smAttributeClass=Metadata.ParamNumberSmAttribute.class)
     Object mParamNumber = "1";

    @objid ("9c52dcfa-796c-4ba6-bedf-6b2a75bda3d4")
    @SmaMetaAttribute(metaName="IsQualified", type=Boolean.class, smAttributeClass=Metadata.IsQualifiedSmAttribute.class)
     Object mIsQualified = false;

    @objid ("2336405c-e96a-45eb-9439-36adba029a13")
    @SmaMetaAttribute(metaName="BelongToPrototype", type=Boolean.class, smAttributeClass=Metadata.BelongToPrototypeSmAttribute.class)
     Object mBelongToPrototype = false;

    @objid ("240f9991-2d5e-47cb-aa8f-5f6dcfd4e912")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("a5a152b9-bd08-4c38-9dba-b874ea1e257f")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("3b267552-90f0-4803-baef-9486b535037d")
    @SmaMetaAssociation(metaName="TagOccurence", typeDataClass=TaggedValueData.class, min=0, max=-1, smAssociationClass=Metadata.TagOccurenceSmDependency.class, istodelete = true, performanceRisk = true)
     List<SmObjectImpl> mTagOccurence = null;

    @objid ("84e4046d-94c2-40cc-bee0-360b235c35d0")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("86affef0-2c14-42d9-941e-2b598e932c37")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("5df1b8e9-bd08-43f0-9a4f-89ad057448c6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("009058a8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ae1c7103-e928-4538-b87a-d23587801e6f")
        private static SmClass smClass = null;

        @objid ("791598fb-d1a2-42b6-a2e4-379334355152")
        private static SmAttribute ParamNumberAtt = null;

        @objid ("dac90f4f-ca1d-4f5d-bd6f-b4c77a6b5703")
        private static SmAttribute IsQualifiedAtt = null;

        @objid ("a7c4f2dd-8269-4ce8-8380-c3595622c290")
        private static SmAttribute BelongToPrototypeAtt = null;

        @objid ("b151308c-5d85-46c9-87eb-fb496e422e07")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("5a028bde-625b-40ef-8622-c61de16f49b2")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("dabe18cc-ac8f-47e2-8881-9ee3c9a42136")
        private static SmDependency TagOccurenceDep = null;

        @objid ("53e6f8f7-da16-459d-96b8-d923f7540179")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("c2b7aedd-35b1-4b42-b0cb-b3d1284cacf8")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("0ac73dc9-df7d-4b7b-9ecb-d3015fd5d141")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TagTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("db222930-aba8-45d1-b5cc-22959f7acc4d")
        public static SmAttribute ParamNumberAtt() {
            if (ParamNumberAtt == null) {
            	ParamNumberAtt = classof().getAttributeDef("ParamNumber");
            }
            return ParamNumberAtt;
        }

        @objid ("0b5a2373-0a29-45be-a4a0-24c52a2575c6")
        public static SmAttribute IsQualifiedAtt() {
            if (IsQualifiedAtt == null) {
            	IsQualifiedAtt = classof().getAttributeDef("IsQualified");
            }
            return IsQualifiedAtt;
        }

        @objid ("06d8d47f-d3b9-490a-88e4-280406e72066")
        public static SmAttribute BelongToPrototypeAtt() {
            if (BelongToPrototypeAtt == null) {
            	BelongToPrototypeAtt = classof().getAttributeDef("BelongToPrototype");
            }
            return BelongToPrototypeAtt;
        }

        @objid ("af5e8346-a6d9-4806-b009-30931ed538bc")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("c4119519-5208-401d-86cd-3dcdb1420e54")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("903c4b5c-45d9-468d-819d-5bb0a87cd074")
        public static SmDependency TagOccurenceDep() {
            if (TagOccurenceDep == null) {
            	TagOccurenceDep = classof().getDependencyDef("TagOccurence");
            }
            return TagOccurenceDep;
        }

        @objid ("04e77d1b-d49a-4d22-bc0a-7059f2ab2e7e")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("a8af1362-2a7c-4533-9570-7ca79defbe60")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("1f045344-b2f7-4ab6-9d2b-d1f2cc5c19bd")
        public static SmAttribute getBelongToPrototypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BelongToPrototypeAtt;
        }

        @objid ("345ef366-b893-466a-aa4f-6c1bacf44bb6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ec72d2c2-1056-4657-ae81-02109f5c53d1")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("43f1fc6f-2779-4c62-9029-c3420f6430a6")
        public static SmAttribute getIsQualifiedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsQualifiedAtt;
        }

        @objid ("2aa4b946-3deb-405d-9d19-8c1eb5ce44e3")
        public static SmAttribute getParamNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParamNumberAtt;
        }

        @objid ("8939d44b-3652-4407-8b09-0415b41b24e3")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("b45e76a3-8460-4da1-ac95-553715f4c9d8")
        public static SmDependency getTagOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TagOccurenceDep;
        }

        @objid ("a42b7be5-73f6-4169-b044-a951401d9074")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("897872f9-bb89-452f-81ac-9ccc0c2338eb")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("00909872-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("443d1d46-219a-4288-8b35-60042daa2459")
            public ISmObjectData createData() {
                return new TagTypeData();
            }

            @objid ("3187c51e-f87e-47b5-bc21-1bbff324ddd7")
            public SmObjectImpl createImpl() {
                return new TagTypeImpl();
            }

        }

        @objid ("0090f9a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParamNumberSmAttribute extends SmAttribute {
            @objid ("ceadd157-c476-4466-a7dd-2ac6475aed1a")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mParamNumber;
            }

            @objid ("c472a5ea-40bb-4044-83f8-98184b366d4c")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mParamNumber = value;
            }

        }

        @objid ("009159f6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsQualifiedSmAttribute extends SmAttribute {
            @objid ("fee16278-b5f0-4716-8551-c2bf580f3c49")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mIsQualified;
            }

            @objid ("182fe5ec-6d9d-4b98-ac6a-fe688161997f")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mIsQualified = value;
            }

        }

        @objid ("0091bb62-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BelongToPrototypeSmAttribute extends SmAttribute {
            @objid ("58dd2e59-fa29-4437-be90-49c25735a658")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mBelongToPrototype;
            }

            @objid ("272bf583-d64b-46f5-b739-b867ab3156c2")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mBelongToPrototype = value;
            }

        }

        @objid ("00921ce2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("65241cad-7788-4b73-8819-99bd4ead4877")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mIsHidden;
            }

            @objid ("cc50838d-f541-4e95-b0ea-b153a66cdc5c")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mIsHidden = value;
            }

        }

        @objid ("0092e3b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TagOccurenceSmDependency extends SmMultipleDependency {
            @objid ("52a363de-9175-43df-87a4-e17d24256e93")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TagTypeData)data).mTagOccurence != null)? ((TagTypeData)data).mTagOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("9279f2f6-7c30-4bf3-b422-19d70e7e8a37")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TagTypeData) data).mTagOccurence = new ArrayList<>(initialCapacity);
                return ((TagTypeData) data).mTagOccurence;
            }

            @objid ("aef23e39-9d04-47b7-9b47-d76b7d8a58b2")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.DefinitionDep();
            }

        }

        @objid ("0093ae54-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("f123817a-fd60-487e-92b9-e402a34f3251")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagTypeData) data).mOwnerStereotype;
            }

            @objid ("5dfadd5c-df3b-4b68-8a56-c7887aa355a7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagTypeData) data).mOwnerStereotype = value;
            }

            @objid ("60fbcfd6-4795-42e2-887a-1e57b77ee58a")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedTagTypeDep();
            }

        }

        @objid ("009425be-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("d1b38167-3408-4d9c-9f74-afc4847e959b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagTypeData) data).mOwnerReference;
            }

            @objid ("62edbf0b-e650-4d12-b681-73417752d75e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagTypeData) data).mOwnerReference = value;
            }

            @objid ("336c00b9-e24a-4885-94de-d53f9471d3f3")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedTagTypeDep();
            }

        }

        @objid ("62574d27-779b-404c-8c05-c71e9541cb47")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("a8fbbfe0-2c85-4ea3-9c51-cc731a195f34")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mLabelKey;
            }

            @objid ("153e9697-9900-41d5-a2c1-6745640306d1")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mLabelKey = value;
            }

        }

    }

}
