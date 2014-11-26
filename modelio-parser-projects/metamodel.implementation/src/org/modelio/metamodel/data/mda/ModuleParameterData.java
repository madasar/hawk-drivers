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
package org.modelio.metamodel.data.mda;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.mda.ModuleComponentData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.mda.ModuleParameterImpl;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleParameterType;
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

@objid ("00653042-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ModuleParameter.class, factory=ModuleParameterData.Metadata.ObjectFactory.class)
public class ModuleParameterData extends ModelElementData {
    @objid ("fa3284f2-ec3b-4a44-bd2f-b109f4f4f3b8")
    @SmaMetaAttribute(metaName="SetName", type=String.class, smAttributeClass=Metadata.SetNameSmAttribute.class)
     Object mSetName = "";

    @objid ("5d6cd65b-c9c2-4bf7-aadc-1a328f5222e0")
    @SmaMetaAttribute(metaName="AssociatedType", type=ModuleParameterType.class, smAttributeClass=Metadata.AssociatedTypeSmAttribute.class)
     Object mAssociatedType = ModuleParameterType.TYPE_PARAM_STRING;

    @objid ("20241472-4452-4518-987c-2e7a7079e490")
    @SmaMetaAttribute(metaName="IsUserRead", type=Boolean.class, smAttributeClass=Metadata.IsUserReadSmAttribute.class, einoexternalize=true)
     Object mIsUserRead = true;

    @objid ("04955330-6e54-441a-849e-81b946d60b56")
    @SmaMetaAttribute(metaName="IsUserWrite", type=Boolean.class, smAttributeClass=Metadata.IsUserWriteSmAttribute.class, einoexternalize=true)
     Object mIsUserWrite = true;

    @objid ("c5de99ab-3c2e-40b6-9847-51d019aca795")
    @SmaMetaAttribute(metaName="IsApiRead", type=Boolean.class, smAttributeClass=Metadata.IsApiReadSmAttribute.class, einoexternalize=true)
     Object mIsApiRead = true;

    @objid ("56f64d82-0049-4e89-9978-5693d0212dd2")
    @SmaMetaAttribute(metaName="IsApiWrite", type=Boolean.class, smAttributeClass=Metadata.IsApiWriteSmAttribute.class, einoexternalize=true)
     Object mIsApiWrite = true;

    @objid ("3be4207d-41ba-4710-a7f3-650ac498158b")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("d452c364-13ff-41c4-96b5-892bf2b08dc3")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModuleComponentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("64079208-be14-49a2-ab2e-3fc9409d828b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0047be2c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d442794f-9663-4a2d-9315-230f8c3d8453")
        private static SmClass smClass = null;

        @objid ("fd2a68fd-33aa-44fa-a686-cd383933b500")
        private static SmAttribute SetNameAtt = null;

        @objid ("e16296bd-1ec3-4782-8a1a-c7d715e4088b")
        private static SmAttribute AssociatedTypeAtt = null;

        @objid ("8a78dc1d-f9a3-49fd-bc83-a4bf93211654")
        private static SmAttribute IsUserReadAtt = null;

        @objid ("efd52220-df21-414a-8abc-1f1f5c778857")
        private static SmAttribute IsUserWriteAtt = null;

        @objid ("b15f90be-fe74-412e-8063-0af9dd1366d6")
        private static SmAttribute IsApiReadAtt = null;

        @objid ("bc8f4b2a-9cfd-48ee-9a12-d68ec3ffe3e4")
        private static SmAttribute IsApiWriteAtt = null;

        @objid ("4a056755-7273-433d-834b-8286e84d4c5f")
        private static SmDependency TypeDep = null;

        @objid ("b4af7f9d-cf35-40d7-b5e3-dad21ec1b6fa")
        private static SmDependency OwnerDep = null;

        @objid ("f5c03592-4f30-48b9-9602-3b84a5235493")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModuleParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("60a43cb1-f1fe-412c-b908-2c2600c278e6")
        public static SmAttribute SetNameAtt() {
            if (SetNameAtt == null) {
            	SetNameAtt = classof().getAttributeDef("SetName");
            }
            return SetNameAtt;
        }

        @objid ("bf44b43a-8394-461b-8b3e-aa7515db67af")
        public static SmAttribute AssociatedTypeAtt() {
            if (AssociatedTypeAtt == null) {
            	AssociatedTypeAtt = classof().getAttributeDef("AssociatedType");
            }
            return AssociatedTypeAtt;
        }

        @objid ("289ed50f-953b-4b5e-997d-4df4b803a973")
        public static SmAttribute IsUserReadAtt() {
            if (IsUserReadAtt == null) {
            	IsUserReadAtt = classof().getAttributeDef("IsUserRead");
            }
            return IsUserReadAtt;
        }

        @objid ("fbd6951b-a28c-463b-8060-daece0eee7b8")
        public static SmAttribute IsUserWriteAtt() {
            if (IsUserWriteAtt == null) {
            	IsUserWriteAtt = classof().getAttributeDef("IsUserWrite");
            }
            return IsUserWriteAtt;
        }

        @objid ("deb6eb9a-cb89-4720-8995-446b9e729e5e")
        public static SmAttribute IsApiReadAtt() {
            if (IsApiReadAtt == null) {
            	IsApiReadAtt = classof().getAttributeDef("IsApiRead");
            }
            return IsApiReadAtt;
        }

        @objid ("f45720d2-43c3-459d-ac02-a7334dd04b0d")
        public static SmAttribute IsApiWriteAtt() {
            if (IsApiWriteAtt == null) {
            	IsApiWriteAtt = classof().getAttributeDef("IsApiWrite");
            }
            return IsApiWriteAtt;
        }

        @objid ("9e206f63-6432-4ed0-a58b-4690fafcb758")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("77d5cefc-54d2-4fbe-b4be-68bfaf6db2ff")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("599ae253-00bd-4055-a4db-2d181a5c1713")
        public static SmAttribute getIsUserWriteAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUserWriteAtt;
        }

        @objid ("115a2e1d-0e94-48e5-a0ee-a92f7c5cbded")
        public static SmAttribute getSetNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SetNameAtt;
        }

        @objid ("825e92f9-0ced-4aaa-9af1-d614d95af002")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("07377fa0-2663-4496-aacd-d9986e900e39")
        public static SmAttribute getIsUserReadAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUserReadAtt;
        }

        @objid ("ae992849-beb0-4968-8de8-29cd93619b38")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b6807618-5194-44eb-86ce-fe222a982006")
        public static SmAttribute getIsApiReadAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsApiReadAtt;
        }

        @objid ("7781b69a-4011-4ce6-9d17-b25346bb914f")
        public static SmAttribute getAssociatedTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociatedTypeAtt;
        }

        @objid ("e87a75d1-1455-4e5f-a444-06befd2885d3")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("be49e9f8-a0c8-447a-80b6-e3f056eadfc0")
        public static SmAttribute getIsApiWriteAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsApiWriteAtt;
        }

        @objid ("0047fe1e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ef95c070-3278-4d6f-b931-17b31af1f927")
            public ISmObjectData createData() {
                return new ModuleParameterData();
            }

            @objid ("7f6aa736-b8e1-4dc0-87ac-83d245256ca6")
            public SmObjectImpl createImpl() {
                return new ModuleParameterImpl();
            }

        }

        @objid ("00485ecc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SetNameSmAttribute extends SmAttribute {
            @objid ("fa67b27f-6f2c-407b-93f0-d28f59f947c9")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mSetName;
            }

            @objid ("d029786f-bfdc-49a0-a71b-d9ca2e0a033f")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mSetName = value;
            }

        }

        @objid ("0048be62-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AssociatedTypeSmAttribute extends SmAttribute {
            @objid ("1dfb7fbf-b197-4039-a156-201eb3371c13")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mAssociatedType;
            }

            @objid ("e782a01c-35c8-44e6-9cc7-18f152d7a7a8")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mAssociatedType = value;
            }

        }

        @objid ("004a603c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("f53cb528-0501-4be3-930f-2d748a95f4d1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mOwner;
            }

            @objid ("b08d0882-3487-4aa9-921a-e663613e058d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModuleParameterData) data).mOwner = value;
            }

            @objid ("a023027f-0fea-4b42-a88a-ace58f28546c")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.ModuleParameterDep();
            }

        }

        @objid ("004aeb92-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("3333fd18-986f-4d3b-abac-0f422bec2d57")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mType;
            }

            @objid ("07f57404-9d36-42b9-b653-e1095affdbcb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModuleParameterData) data).mType = value;
            }

            @objid ("f4c8da65-77af-4630-bd1e-208b8c38c211")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceConfigParamDep();
            }

        }

        @objid ("cf091b60-f120-11e1-b078-001ec947ccaf")
        public static class IsUserReadSmAttribute extends SmAttribute {
            @objid ("aadc141c-8b94-4593-9507-cb3afa8aa427")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsUserRead;
            }

            @objid ("17635d48-9ad6-419d-9e07-9878adfc51e3")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsUserRead = value;
            }

        }

        @objid ("cf2a7c08-f120-11e1-b078-001ec947ccaf")
        public static class IsUserWriteSmAttribute extends SmAttribute {
            @objid ("dde056cb-5fa8-4cd1-8fbe-d13c831c31f0")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsUserWrite;
            }

            @objid ("95dbe76e-9a46-4d96-98cf-85e4e7125798")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsUserWrite = value;
            }

        }

        @objid ("cf2a7c18-f120-11e1-b078-001ec947ccaf")
        public static class IsApiReadSmAttribute extends SmAttribute {
            @objid ("ede33bce-1610-4d54-803f-89516e7ca5ec")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsApiRead;
            }

            @objid ("57b10135-b309-4f51-8c57-ae7621e04dec")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsApiRead = value;
            }

        }

        @objid ("cf2a7c28-f120-11e1-b078-001ec947ccaf")
        public static class IsApiWriteSmAttribute extends SmAttribute {
            @objid ("ae882cd8-c3fb-45ef-8273-d4c5416990ea")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsApiWrite;
            }

            @objid ("21caef59-fbcc-4ed4-ad06-697811fc3971")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsApiWrite = value;
            }

        }

    }

}
