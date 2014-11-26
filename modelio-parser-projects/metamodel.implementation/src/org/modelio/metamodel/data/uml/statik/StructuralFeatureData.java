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
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.impl.uml.statik.StructuralFeatureImpl;
import org.modelio.metamodel.uml.statik.KindOfAccess;
import org.modelio.metamodel.uml.statik.StructuralFeature;
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

@objid ("001f7f70-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StructuralFeature.class, factory=StructuralFeatureData.Metadata.ObjectFactory.class)
public class StructuralFeatureData extends FeatureData {
    @objid ("d579577c-7822-4085-9581-0377558fb317")
    @SmaMetaAttribute(metaName="Changeable", type=KindOfAccess.class, smAttributeClass=Metadata.ChangeableSmAttribute.class)
     Object mChangeable = KindOfAccess.READWRITE;

    @objid ("67ae92f1-ec78-44f1-ae97-47b9220f9f11")
    @SmaMetaAttribute(metaName="IsDerived", type=Boolean.class, smAttributeClass=Metadata.IsDerivedSmAttribute.class)
     Object mIsDerived = false;

    @objid ("ad3d54cb-309b-4685-9d15-60c4036848c5")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("af33a649-2608-4e16-a1fd-540514c885fe")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("4c72ff34-951e-4ae3-84c4-6ae66c9fabe6")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("de46f2dd-2a36-4c3e-bcc5-340898716e4c")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("da6cb727-ca9c-48e4-873b-87afd5a63e31")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("bf7dc67c-ad4a-4436-afe1-fc2850eec905")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050fc6c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7744a093-a816-43ad-b38d-08acf75c481a")
        private static SmClass smClass = null;

        @objid ("4bfe686a-670c-4199-97e7-290c99746f7a")
        private static SmAttribute ChangeableAtt = null;

        @objid ("796c2ae3-527d-4862-b146-4a6f95c48669")
        private static SmAttribute IsDerivedAtt = null;

        @objid ("497bda35-d5f0-4cae-8472-1b26f7253d49")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("677a4af7-feeb-4e9c-862d-86cb027d3471")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("79c5c011-67bc-4708-8b88-e0422f38ce81")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("9909241d-958d-473c-919e-c57991252017")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("bf12b4de-c332-4913-a447-d851b0d10301")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("5121f41b-4918-4cb0-8eab-1dbe23211ac1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StructuralFeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5357be5e-9556-460d-9f93-bcda512a79e7")
        public static SmAttribute ChangeableAtt() {
            if (ChangeableAtt == null) {
            	ChangeableAtt = classof().getAttributeDef("Changeable");
            }
            return ChangeableAtt;
        }

        @objid ("dea37b2d-883d-48cc-8c66-aa9dd74ab41d")
        public static SmAttribute IsDerivedAtt() {
            if (IsDerivedAtt == null) {
            	IsDerivedAtt = classof().getAttributeDef("IsDerived");
            }
            return IsDerivedAtt;
        }

        @objid ("30020c9e-e4b1-44c4-b91b-ea4970a83017")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("ca896012-d7e0-4e3d-8298-3712c64749cd")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("dc2bf1c6-22b7-412f-b64f-148cc7b11800")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("125d76f7-25f3-4e3e-bb60-3cc37ee24400")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("96d73633-6cf9-44ab-86de-64e5ae882444")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("00670ee7-fc55-4f9a-bea4-cd5b581ecf1e")
        public static SmAttribute getIsDerivedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDerivedAtt;
        }

        @objid ("63884fff-2eb3-4e8d-b34b-7b68026b4e3e")
        public static SmAttribute getChangeableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChangeableAtt;
        }

        @objid ("5f2bfe85-177b-4eca-ab34-f7035dcf0806")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("89990183-13d8-46b6-bbb8-4fbd49ee874d")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("35d5d28f-2f20-4023-a3db-d942aa0b0c22")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("ab2a3b54-6eb7-4360-93b7-f501cb32d92c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1cfb352e-3f38-4ccb-81be-0db48d4de5c2")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("4ac16131-5277-4267-bd3b-2d1e1a0e655c")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("00513d94-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("888b6703-b2cc-467a-b149-1b8cfb20ebdb")
            public ISmObjectData createData() {
                return new StructuralFeatureData();
            }

            @objid ("b3eeaf88-2b26-4ad6-95e8-af5c8041befd")
            public SmObjectImpl createImpl() {
                return new StructuralFeatureImpl();
            }

        }

        @objid ("00519f96-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ChangeableSmAttribute extends SmAttribute {
            @objid ("4f95f368-2f65-4b4a-98a2-34f38f2d2a51")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mChangeable;
            }

            @objid ("b7e1a01d-1de5-420f-bd2e-2a8ba117b1ff")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mChangeable = value;
            }

        }

        @objid ("0052065c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsDerivedSmAttribute extends SmAttribute {
            @objid ("0117da00-9c3e-44cf-89c6-ee86367fb16b")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsDerived;
            }

            @objid ("517a7643-d861-40e3-8bc0-3c3e1f38089e")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsDerived = value;
            }

        }

        @objid ("00526840-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("cc0cf538-c464-4a30-9099-8a4e5b3c70f4")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsOrdered;
            }

            @objid ("3b9f0272-9685-47fe-bc69-bac9bb6ced89")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsOrdered = value;
            }

        }

        @objid ("0052ca06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("86555fbc-4fde-419b-8acc-12503fc55ec3")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsUnique;
            }

            @objid ("a851383d-1754-4f13-ba44-e34fa445b3a8")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsUnique = value;
            }

        }

        @objid ("00532dc0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("de88ec62-f914-48c8-911a-b22ebbd2b1ce")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mMultiplicityMin;
            }

            @objid ("5d3f9a10-468a-46f3-8742-f930efda71e0")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mMultiplicityMin = value;
            }

        }

        @objid ("0053922e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("885a58bf-f79a-45c1-87de-609f84b5cb7d")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mMultiplicityMax;
            }

            @objid ("c045b594-0dad-41ad-834a-1670de8a491f")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mMultiplicityMax = value;
            }

        }

        @objid ("0053f854-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("25edf6fb-1852-42b1-8af6-fadcde2c70f0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StructuralFeatureData)data).mRealizedInformationFlow != null)? ((StructuralFeatureData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("d8b7bbdd-18b7-4370-99bd-100ee47af6e6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StructuralFeatureData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((StructuralFeatureData) data).mRealizedInformationFlow;
            }

            @objid ("9890e2be-181a-4a46-b7b2-349f63b726a7")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingFeatureDep();
            }

        }

    }

}
