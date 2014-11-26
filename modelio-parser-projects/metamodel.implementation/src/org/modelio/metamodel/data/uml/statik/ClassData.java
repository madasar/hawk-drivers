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
import org.modelio.metamodel.data.uml.statik.ClassAssociationData;
import org.modelio.metamodel.impl.uml.statik.ClassImpl;
import org.modelio.metamodel.uml.statik.Class;
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

@objid ("00027d80-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Class.class, factory=ClassData.Metadata.ObjectFactory.class, cmsnode=true)
public class ClassData extends GeneralClassData {
    @objid ("9dbfca85-02d8-45ef-8e9d-e75927e4014d")
    @SmaMetaAttribute(metaName="IsActive", type=Boolean.class, smAttributeClass=Metadata.IsActiveSmAttribute.class)
     Object mIsActive = false;

    @objid ("9a4336ba-fc2e-4e27-a09a-67413a1dcd3f")
    @SmaMetaAttribute(metaName="IsMain", type=Boolean.class, smAttributeClass=Metadata.IsMainSmAttribute.class)
     Object mIsMain = false;

    @objid ("858303f1-d379-4908-91df-19926d929ad0")
    @SmaMetaAssociation(metaName="LinkToAssociation", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToAssociationSmDependency.class, istodelete = true)
     SmObjectImpl mLinkToAssociation;

    @objid ("4d41bd73-05d9-4b6d-a414-d9a3ca36b91f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0088a950-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("79ec8817-dbec-4847-8626-b7ed5749a7ac")
        private static SmClass smClass = null;

        @objid ("1905d01f-745f-4226-96e2-e7fa58f91b4c")
        private static SmAttribute IsActiveAtt = null;

        @objid ("4e541fde-56ac-4b04-8479-ab08c5d81bb6")
        private static SmAttribute IsMainAtt = null;

        @objid ("ce73e21b-57c6-4a23-a206-d74aa9a74105")
        private static SmDependency LinkToAssociationDep = null;

        @objid ("a0cb5c55-410f-4af9-8355-d5c473f6a3f2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fa70a8fa-e79e-42bf-a184-0fc8b2c1a085")
        public static SmAttribute IsActiveAtt() {
            if (IsActiveAtt == null) {
            	IsActiveAtt = classof().getAttributeDef("IsActive");
            }
            return IsActiveAtt;
        }

        @objid ("00b78748-03ae-4790-bc12-2aad482ceb9c")
        public static SmAttribute IsMainAtt() {
            if (IsMainAtt == null) {
            	IsMainAtt = classof().getAttributeDef("IsMain");
            }
            return IsMainAtt;
        }

        @objid ("b60847ad-ca7b-4372-9424-693f4892ac04")
        public static SmDependency LinkToAssociationDep() {
            if (LinkToAssociationDep == null) {
            	LinkToAssociationDep = classof().getDependencyDef("LinkToAssociation");
            }
            return LinkToAssociationDep;
        }

        @objid ("46b1d73d-6616-4cfb-b4e6-50416423a7a7")
        public static SmAttribute getIsMainAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMainAtt;
        }

        @objid ("1d0dcff4-57b3-47c7-a990-c51d930d1e36")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("70a0e0e7-38ed-4383-8f01-dcd9ffa28c38")
        public static SmDependency getLinkToAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToAssociationDep;
        }

        @objid ("93a9a996-3dfa-4415-a5b2-44a799273183")
        public static SmAttribute getIsActiveAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsActiveAtt;
        }

        @objid ("0088eaaa-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("47578843-f0a9-4f4d-9089-98b5fc4b4668")
            public ISmObjectData createData() {
                return new ClassData();
            }

            @objid ("57dd2db5-18db-4ee5-9e5f-b0abed79dedc")
            public SmObjectImpl createImpl() {
                return new ClassImpl();
            }

        }

        @objid ("00894bd0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsActiveSmAttribute extends SmAttribute {
            @objid ("ac0ffcfc-03e0-4974-9615-0bf5d6cbe5bb")
            public Object getValue(ISmObjectData data) {
                return ((ClassData) data).mIsActive;
            }

            @objid ("11dfb813-0a6c-42b1-a5f4-601ec94a3f04")
            public void setValue(ISmObjectData data, Object value) {
                ((ClassData) data).mIsActive = value;
            }

        }

        @objid ("0089ac92-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsMainSmAttribute extends SmAttribute {
            @objid ("8d017a82-aaec-4aa7-885a-d8cb40db1a71")
            public Object getValue(ISmObjectData data) {
                return ((ClassData) data).mIsMain;
            }

            @objid ("b4547ec1-1da9-45cf-9f10-17821f100ae5")
            public void setValue(ISmObjectData data, Object value) {
                ((ClassData) data).mIsMain = value;
            }

        }

        @objid ("008a138a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LinkToAssociationSmDependency extends SmSingleDependency {
            @objid ("9ddb0a1d-9e94-43ad-bead-8d23aca033d7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassData) data).mLinkToAssociation;
            }

            @objid ("79830bda-44a8-4b81-a73f-6cc805ae1113")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassData) data).mLinkToAssociation = value;
            }

            @objid ("5bf9147e-e1d9-4604-93d6-265fd7654e0c")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.ClassPartDep();
            }

        }

    }

}
