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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.data.uml.statik.ConnectorEndData;
import org.modelio.metamodel.data.uml.statik.NaryConnectorData;
import org.modelio.metamodel.impl.uml.statik.BindingImpl;
import org.modelio.metamodel.uml.statik.Binding;
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

@objid ("0001ce8a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Binding.class, factory=BindingData.Metadata.ObjectFactory.class)
public class BindingData extends ModelElementData {
    @objid ("863d426c-0021-4b03-a510-494ac6057349")
    @SmaMetaAssociation(metaName="ConnectorEndRole", typeDataClass=ConnectorEndData.class, min=0, max=1, smAssociationClass=Metadata.ConnectorEndRoleSmDependency.class, partof = true)
     SmObjectImpl mConnectorEndRole;

    @objid ("e8a32326-5acd-4720-a08f-0560f09a6a40")
    @SmaMetaAssociation(metaName="ConnectorRole", typeDataClass=NaryConnectorData.class, min=0, max=1, smAssociationClass=Metadata.ConnectorRoleSmDependency.class, partof = true)
     SmObjectImpl mConnectorRole;

    @objid ("548f78a3-d5d9-4451-ad8e-5168b1bfdec3")
    @SmaMetaAssociation(metaName="Role", typeDataClass=BindableInstanceData.class, min=0, max=1, smAssociationClass=Metadata.RoleSmDependency.class, partof = true)
     SmObjectImpl mRole;

    @objid ("f14d54bc-985e-4b4b-894c-b495887bc10c")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("333318fb-c6dd-448b-97b5-14fe7c333a24")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=CollaborationUseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("6d7cfd4d-272c-493d-a662-0e2b01a2f003")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0068f63c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7cd8e9a9-5ab2-4970-b1aa-bad8fc14482e")
        private static SmClass smClass = null;

        @objid ("2fcb00e3-17c3-46c4-9fdf-d118cd29eabf")
        private static SmDependency ConnectorEndRoleDep = null;

        @objid ("bc9dcef6-da8a-4b1e-8766-bae402149505")
        private static SmDependency ConnectorRoleDep = null;

        @objid ("efb236b2-3359-4ff7-acc9-1122f4a8d4ad")
        private static SmDependency RoleDep = null;

        @objid ("63d96cc4-007f-41d1-a062-2447b38c69fa")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("fdb1e524-aa9a-494c-abbc-1083b73e96ff")
        private static SmDependency OwnerDep = null;

        @objid ("0b41a0dd-0eab-473a-9047-22f4ecb45459")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c372ee37-a459-467c-9a42-7f62d3e98e7e")
        public static SmDependency ConnectorEndRoleDep() {
            if (ConnectorEndRoleDep == null) {
            	ConnectorEndRoleDep = classof().getDependencyDef("ConnectorEndRole");
            }
            return ConnectorEndRoleDep;
        }

        @objid ("7d34b0cb-7f2f-4b97-9c14-483f8e254abb")
        public static SmDependency ConnectorRoleDep() {
            if (ConnectorRoleDep == null) {
            	ConnectorRoleDep = classof().getDependencyDef("ConnectorRole");
            }
            return ConnectorRoleDep;
        }

        @objid ("4dd6eafe-1afd-4a54-88e8-971672bb6205")
        public static SmDependency RoleDep() {
            if (RoleDep == null) {
            	RoleDep = classof().getDependencyDef("Role");
            }
            return RoleDep;
        }

        @objid ("68e16f92-f4d9-4cd7-bc4a-7774ec885aee")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("f6f40434-ecf2-425b-a79a-95997ca43075")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("0a16f1b0-c3f2-40c5-9f7c-3448f68c7632")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("06e9dd36-ce02-4e8e-9435-94924fedfed2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f9862029-8637-4c11-a8ba-2cc022e74536")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("e1802377-7c54-49a6-b294-1f0897490cc7")
        public static SmDependency getConnectorEndRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorEndRoleDep;
        }

        @objid ("d91f0441-6e43-418e-821a-9834574bbd43")
        public static SmDependency getConnectorRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorRoleDep;
        }

        @objid ("3e47c25c-0334-4291-b1b7-5a56c1e612da")
        public static SmDependency getRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RoleDep;
        }

        @objid ("00693750-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dd6096f6-d2dd-49bd-98d7-c4e19a8acd18")
            public ISmObjectData createData() {
                return new BindingData();
            }

            @objid ("fa24cce4-e41e-4c23-9dcd-eeb6f7f17f68")
            public SmObjectImpl createImpl() {
                return new BindingImpl();
            }

        }

        @objid ("006999b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("d8396c8a-46a9-422b-8a9b-cad870deac65")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mRepresentedFeature;
            }

            @objid ("53368bd3-7ee9-492a-a74d-2d0b4f3c785e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mRepresentedFeature = value;
            }

            @objid ("413f65c8-2366-4687-bae5-5b426f96b307")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentsDep();
            }

        }

        @objid ("006a0dba-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("3154dcc5-ab4b-432d-a30c-2bbef9c5669c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mOwner;
            }

            @objid ("863df6b7-049e-4b56-9fc8-46e1a271be8b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mOwner = value;
            }

            @objid ("5e76b20b-c5ac-42f7-ab2f-ecfde85f28ba")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.RoleBindingDep();
            }

        }

        @objid ("006a825e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ConnectorRoleSmDependency extends SmSingleDependency {
            @objid ("93e5cc1c-5dfe-4a4e-b2fc-fae98cb7eff6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mConnectorRole;
            }

            @objid ("efdfe866-7bdd-4e8b-9b07-863d175c26c2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mConnectorRole = value;
            }

            @objid ("4490289d-8648-4b50-9d9f-7026a825116c")
            @Override
            public SmDependency getSymetric() {
                return NaryConnectorData.Metadata.RepresentationDep();
            }

        }

        @objid ("006af75c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RoleSmDependency extends SmSingleDependency {
            @objid ("80467809-9d65-4cb0-8756-4cd161bb56cd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mRole;
            }

            @objid ("9a962d74-6b4f-4182-b0a2-d680306b6b4f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mRole = value;
            }

            @objid ("2069fa26-e105-402a-89f7-60e9295c5fa0")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.RepresentationDep();
            }

        }

        @objid ("006b6fe8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ConnectorEndRoleSmDependency extends SmSingleDependency {
            @objid ("f81f3293-ae86-4e9c-93a9-7c16e4e80552")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mConnectorEndRole;
            }

            @objid ("21788b07-6156-4c73-b48c-a3e7aa8691b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mConnectorEndRole = value;
            }

            @objid ("51b67b8f-acb8-4753-a7d7-399f59369a32")
            @Override
            public SmDependency getSymetric() {
                return ConnectorEndData.Metadata.RepresentationDep();
            }

        }

    }

}
