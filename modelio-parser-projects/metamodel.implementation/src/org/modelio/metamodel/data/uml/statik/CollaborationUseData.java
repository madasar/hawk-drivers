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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.BindingData;
import org.modelio.metamodel.data.uml.statik.CollaborationData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.statik.CollaborationUseImpl;
import org.modelio.metamodel.uml.statik.CollaborationUse;
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

@objid ("0004d404-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CollaborationUse.class, factory=CollaborationUseData.Metadata.ObjectFactory.class)
public class CollaborationUseData extends ModelElementData {
    @objid ("fe76784e-47ed-4664-af32-a6e2a61b38a6")
    @SmaMetaAssociation(metaName="Type", typeDataClass=CollaborationData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("a01a9a19-71a7-4691-b88b-fe14468a4b2f")
    @SmaMetaAssociation(metaName="NRepresented", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.NRepresentedSmDependency.class)
     SmObjectImpl mNRepresented;

    @objid ("644f1c7f-d073-429d-8ed4-1537eabcb4ff")
    @SmaMetaAssociation(metaName="ORepresented", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ORepresentedSmDependency.class)
     SmObjectImpl mORepresented;

    @objid ("876d922d-ac93-4cc4-895c-c40513296a94")
    @SmaMetaAssociation(metaName="RoleBinding", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RoleBindingSmDependency.class, component = true)
     List<SmObjectImpl> mRoleBinding = null;

    @objid ("d94fb1a0-b594-48b1-b353-e2b2932c2e5b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00332b7e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("da2da082-6b43-44bb-a59e-16e647adf21e")
        private static SmClass smClass = null;

        @objid ("20722bc8-46bf-477c-8419-6c78f08c6c4f")
        private static SmDependency TypeDep = null;

        @objid ("a7a43c44-5100-47f7-8a67-07237735ac1f")
        private static SmDependency NRepresentedDep = null;

        @objid ("35ad2d47-af1d-4832-8bf6-bfadd46e18b5")
        private static SmDependency ORepresentedDep = null;

        @objid ("197d774c-b814-4135-a2b4-d96a3a2f1235")
        private static SmDependency RoleBindingDep = null;

        @objid ("aacdec2f-48fb-4833-bb2e-1f42e9f243bd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CollaborationUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1f28b0a7-3745-4c8c-b796-da266154f961")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("3fe5090e-bf97-46a3-aa48-74040ace6f7f")
        public static SmDependency NRepresentedDep() {
            if (NRepresentedDep == null) {
            	NRepresentedDep = classof().getDependencyDef("NRepresented");
            }
            return NRepresentedDep;
        }

        @objid ("32298605-a77a-4d82-8376-6b392392026a")
        public static SmDependency ORepresentedDep() {
            if (ORepresentedDep == null) {
            	ORepresentedDep = classof().getDependencyDef("ORepresented");
            }
            return ORepresentedDep;
        }

        @objid ("2543b7cb-58b0-4b99-94ba-53fac79c06bd")
        public static SmDependency RoleBindingDep() {
            if (RoleBindingDep == null) {
            	RoleBindingDep = classof().getDependencyDef("RoleBinding");
            }
            return RoleBindingDep;
        }

        @objid ("d421be9c-2e24-4980-8621-8a9697753b84")
        public static SmDependency getRoleBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RoleBindingDep;
        }

        @objid ("065a1084-44bb-4a22-8492-7e06fb534890")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("614ffadc-01f9-4155-8c0c-2b183ec03142")
        public static SmDependency getORepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ORepresentedDep;
        }

        @objid ("711bc639-5b06-4c0d-a029-db7e07e54b8e")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("9fd174e5-273e-4f9b-a4eb-710356ae41f5")
        public static SmDependency getNRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NRepresentedDep;
        }

        @objid ("00336b16-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9fadd6b8-427b-4b8c-a787-5ea719b3ae88")
            public ISmObjectData createData() {
                return new CollaborationUseData();
            }

            @objid ("511fdc7e-323c-4919-ac7a-e111d936ec82")
            public SmObjectImpl createImpl() {
                return new CollaborationUseImpl();
            }

        }

        @objid ("0033cca0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("33975adb-b739-4c96-8038-1b9108638aba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mType;
            }

            @objid ("8b25e5e0-0188-4535-9ff2-2121aff1ebbd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mType = value;
            }

            @objid ("229161d6-6916-45e9-8857-e53dd05e70b8")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.OccurrenceDep();
            }

        }

        @objid ("00344004-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NRepresentedSmDependency extends SmSingleDependency {
            @objid ("8b14cf3d-778e-479a-903c-4778c9f32378")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mNRepresented;
            }

            @objid ("936c30d1-3d1c-495a-a993-825cf234d439")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mNRepresented = value;
            }

            @objid ("87de66e4-e4b1-45f5-bcfe-f30c2494450d")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedCollaborationUseDep();
            }

        }

        @objid ("0034b6ba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ORepresentedSmDependency extends SmSingleDependency {
            @objid ("9fa9fb87-40d8-48f4-823d-5599ff923826")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mORepresented;
            }

            @objid ("27ddca1c-2a41-4850-ab26-7560df18ae8c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mORepresented = value;
            }

            @objid ("f41df1da-407e-496a-b703-5ed9263cdf07")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedCollaborationUseDep();
            }

        }

        @objid ("00352c44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RoleBindingSmDependency extends SmMultipleDependency {
            @objid ("3b7c3606-4f6f-481b-a5fb-13f3ec4f77a6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CollaborationUseData)data).mRoleBinding != null)? ((CollaborationUseData)data).mRoleBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("d2132a03-d022-4258-9b92-355e1dd9c70e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CollaborationUseData) data).mRoleBinding = new ArrayList<>(initialCapacity);
                return ((CollaborationUseData) data).mRoleBinding;
            }

            @objid ("74ddabb0-ac4a-4168-9903-68ad4a594fa0")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.OwnerDep();
            }

        }

    }

}
