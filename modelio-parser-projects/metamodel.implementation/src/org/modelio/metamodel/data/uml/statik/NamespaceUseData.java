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
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.statik.NamespaceUseImpl;
import org.modelio.metamodel.uml.statik.NamespaceUse;
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

@objid ("0012ad86-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NamespaceUse.class, factory=NamespaceUseData.Metadata.ObjectFactory.class)
public class NamespaceUseData extends ElementData {
    @objid ("361bf275-39f3-42bf-8d75-9895611ea304")
    @SmaMetaAssociation(metaName="User", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.UserSmDependency.class, partof = true)
     SmObjectImpl mUser;

    @objid ("5bb3f749-ee2e-40cb-bbf7-d250eb74c41d")
    @SmaMetaAssociation(metaName="Used", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.UsedSmDependency.class, partof = true)
     SmObjectImpl mUsed;

    @objid ("f0eaac18-f1a8-4670-8803-43c14822d8c0")
    @SmaMetaAssociation(metaName="Cause", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.CauseSmDependency.class, partof = true)
     List<SmObjectImpl> mCause = null;

    @objid ("36851bd0-3048-421d-b0d1-a1b1370ad267")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0048f54e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4f886d7a-286e-4861-b89c-c99d5cd2f0ab")
        private static SmClass smClass = null;

        @objid ("9ac00cf0-c005-4c2c-aedf-f8ee7dc58573")
        private static SmDependency UserDep = null;

        @objid ("b440bc41-994a-476a-bcde-cda61f7911f4")
        private static SmDependency UsedDep = null;

        @objid ("f75c5869-cacd-45e4-9609-b330dff53fc4")
        private static SmDependency CauseDep = null;

        @objid ("1096e126-5539-40bf-8f5d-d3c31641a17e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NamespaceUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("145e72fb-312e-4760-95ff-15fc59d435a4")
        public static SmDependency UserDep() {
            if (UserDep == null) {
            	UserDep = classof().getDependencyDef("User");
            }
            return UserDep;
        }

        @objid ("46ccd7f7-3518-4606-959a-b6b094d3687d")
        public static SmDependency UsedDep() {
            if (UsedDep == null) {
            	UsedDep = classof().getDependencyDef("Used");
            }
            return UsedDep;
        }

        @objid ("c5a09508-4f73-48b9-8e74-e1165d475a77")
        public static SmDependency CauseDep() {
            if (CauseDep == null) {
            	CauseDep = classof().getDependencyDef("Cause");
            }
            return CauseDep;
        }

        @objid ("75150bc5-1de1-4006-8054-11e719ca4e7b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8fe7fdc5-742e-44bb-af39-6c7b2b689db0")
        public static SmDependency getUsedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedDep;
        }

        @objid ("1a3ce261-94d1-405e-a0cc-c520c6150fdd")
        public static SmDependency getUserDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserDep;
        }

        @objid ("95e4129e-958f-4849-973c-4318032461c5")
        public static SmDependency getCauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CauseDep;
        }

        @objid ("0049355e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8d702fff-4dce-4ed3-8032-28534a5f91e0")
            public ISmObjectData createData() {
                return new NamespaceUseData();
            }

            @objid ("64e0f336-cc21-4701-9b82-f895c76c2dcd")
            public SmObjectImpl createImpl() {
                return new NamespaceUseImpl();
            }

        }

        @objid ("004996a2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UsedSmDependency extends SmSingleDependency {
            @objid ("a273cca1-30ca-4282-9423-a58944046808")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NamespaceUseData) data).mUsed;
            }

            @objid ("9cd0ecd5-c972-40e8-9ae6-faf6f172d864")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NamespaceUseData) data).mUsed = value;
            }

            @objid ("738a3c0c-9c98-492f-8a3f-e355108de831")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.UserNsuDep();
            }

        }

        @objid ("004a09f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UserSmDependency extends SmSingleDependency {
            @objid ("ed32e849-bb35-475d-a751-7e7ca443121b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NamespaceUseData) data).mUser;
            }

            @objid ("f4184b5a-c61f-4b41-8fa6-cbd2f4940b68")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NamespaceUseData) data).mUser = value;
            }

            @objid ("7953e079-7e3c-435c-9959-2d7b2eba1a6e")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.UsedNsuDep();
            }

        }

        @objid ("004a7cde-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CauseSmDependency extends SmMultipleDependency {
            @objid ("14834eeb-7f5a-47e3-9a49-204588a7156a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NamespaceUseData)data).mCause != null)? ((NamespaceUseData)data).mCause:SmMultipleDependency.EMPTY;
            }

            @objid ("1adf8173-ef63-490b-a1bd-220b9d42604b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NamespaceUseData) data).mCause = new ArrayList<>(initialCapacity);
                return ((NamespaceUseData) data).mCause;
            }

            @objid ("fd95e46f-a03d-40aa-b697-a5dafa345242")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.CausingDep();
            }

        }

    }

}
