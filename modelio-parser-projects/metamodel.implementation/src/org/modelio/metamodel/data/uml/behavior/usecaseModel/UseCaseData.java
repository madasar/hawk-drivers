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
package org.modelio.metamodel.data.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.ExtensionPointData;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseDependencyData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.UseCaseImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
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

@objid ("0058d388-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=UseCase.class, factory=UseCaseData.Metadata.ObjectFactory.class, cmsnode=true)
public class UseCaseData extends GeneralClassData {
    @objid ("1155c589-6883-4031-97ab-8aed1a07190d")
    @SmaMetaAssociation(metaName="Used", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.UsedSmDependency.class, component = true)
     List<SmObjectImpl> mUsed = null;

    @objid ("9dde90db-2dd6-415f-811d-94f14f56998b")
    @SmaMetaAssociation(metaName="OwnedExtension", typeDataClass=ExtensionPointData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedExtensionSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedExtension = null;

    @objid ("84fb6470-efc3-43c0-a8f1-3703113b37b1")
    @SmaMetaAssociation(metaName="User", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.UserSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mUser = null;

    @objid ("bbc7c71b-8b33-4910-8b65-827734ddc6be")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f01fa-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e7efbce3-a72b-4e01-addb-1dc01c201ced")
        private static SmClass smClass = null;

        @objid ("56734995-2b37-4712-8f0c-fac4dae27ace")
        private static SmDependency UsedDep = null;

        @objid ("7f858ac8-8212-4ffa-99c3-82b39a104505")
        private static SmDependency OwnedExtensionDep = null;

        @objid ("1839c5b2-2e17-4177-b1ab-958d85685588")
        private static SmDependency UserDep = null;

        @objid ("b44d73f3-7087-4837-89c7-3db87f369b89")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9d3b454e-95f6-4130-872b-9c7dd798b5b9")
        public static SmDependency UsedDep() {
            if (UsedDep == null) {
            	UsedDep = classof().getDependencyDef("Used");
            }
            return UsedDep;
        }

        @objid ("b295457e-6540-422e-ad8c-0843113f0a20")
        public static SmDependency OwnedExtensionDep() {
            if (OwnedExtensionDep == null) {
            	OwnedExtensionDep = classof().getDependencyDef("OwnedExtension");
            }
            return OwnedExtensionDep;
        }

        @objid ("dfdab875-05cc-4edf-bde3-91b963964145")
        public static SmDependency UserDep() {
            if (UserDep == null) {
            	UserDep = classof().getDependencyDef("User");
            }
            return UserDep;
        }

        @objid ("af96deca-7633-4855-9b18-c0e487df4881")
        public static SmDependency getUserDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserDep;
        }

        @objid ("cfc2459f-3a78-4a66-a6b2-3a7c0d240765")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a3667d3d-ee5d-4150-80d0-089ef59b6a44")
        public static SmDependency getOwnedExtensionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedExtensionDep;
        }

        @objid ("0fed75b0-ed37-4025-a91c-93875756a703")
        public static SmDependency getUsedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedDep;
        }

        @objid ("004f42aa-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cdf30283-c1df-4088-95a3-e41b69e8fd77")
            public ISmObjectData createData() {
                return new UseCaseData();
            }

            @objid ("35e0767e-53c8-4271-bd4c-3bf2503ce569")
            public SmObjectImpl createImpl() {
                return new UseCaseImpl();
            }

        }

        @objid ("004fa678-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedExtensionSmDependency extends SmMultipleDependency {
            @objid ("e597c488-3ded-44af-93ba-5fb9197ff591")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mOwnedExtension != null)? ((UseCaseData)data).mOwnedExtension:SmMultipleDependency.EMPTY;
            }

            @objid ("1b88549c-b923-4286-9525-2f42f52d6cc1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mOwnedExtension = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mOwnedExtension;
            }

            @objid ("0e24ac3e-aef3-4e5c-88d1-2ac2d2378b32")
            @Override
            public SmDependency getSymetric() {
                return ExtensionPointData.Metadata.OwnerDep();
            }

        }

        @objid ("00500938-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UsedSmDependency extends SmMultipleDependency {
            @objid ("7b9642e5-92bc-4182-962e-ffc2c777efce")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mUsed != null)? ((UseCaseData)data).mUsed:SmMultipleDependency.EMPTY;
            }

            @objid ("01a3ec42-580d-4619-85b7-74c7d7b017ef")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mUsed = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mUsed;
            }

            @objid ("50dba7ac-dc8c-42f4-b6d9-9ad03a72e95f")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.OriginDep();
            }

        }

        @objid ("00506c0c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UserSmDependency extends SmMultipleDependency {
            @objid ("c83d3585-f2e7-40b6-a470-3cf3fdf71d9f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mUser != null)? ((UseCaseData)data).mUser:SmMultipleDependency.EMPTY;
            }

            @objid ("f7b49d2d-1c8e-432c-9e2c-cf455413507b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mUser = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mUser;
            }

            @objid ("ebd6280a-7ae4-407a-9c25-b7237fc65663")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.TargetDep();
            }

        }

    }

}
