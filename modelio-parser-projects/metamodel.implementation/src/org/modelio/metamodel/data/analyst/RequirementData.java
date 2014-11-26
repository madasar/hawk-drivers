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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.data.analyst.RequirementContainerData;
import org.modelio.metamodel.impl.analyst.RequirementImpl;
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

@objid ("cdb4e302-697f-4730-9228-27f71f3c6d4d")
@SmaMetaClass(mmClass=Requirement.class, factory=RequirementData.Metadata.ObjectFactory.class, cmsnode=true)
public class RequirementData extends AnalystElementData {
    @objid ("d43f77ba-e2eb-4b33-b44c-58d025c3c34e")
    @SmaMetaAssociation(metaName="SubRequirement", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.SubRequirementSmDependency.class, component = true)
     List<SmObjectImpl> mSubRequirement = null;

    @objid ("8ff5f460-21e0-4625-b770-f0ea6ffaaefa")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=RequirementContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("168444be-feab-49c6-b829-25fe6c0832db")
    @SmaMetaAssociation(metaName="ParentRequirement", typeDataClass=RequirementData.class, min=0, max=1, smAssociationClass=Metadata.ParentRequirementSmDependency.class)
     SmObjectImpl mParentRequirement;

    @objid ("bc02def1-b1bd-44ee-b510-9c2a4095b7b1")
    @SmaMetaAssociation(metaName="ArchivedRequirementVersion", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedRequirementVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedRequirementVersion = null;

    @objid ("8abd144e-8fee-4961-b73f-857a81c87b26")
    @SmaMetaAssociation(metaName="LastRequirementVersion", typeDataClass=RequirementData.class, min=0, max=1, smAssociationClass=Metadata.LastRequirementVersionSmDependency.class)
     SmObjectImpl mLastRequirementVersion;

    @objid ("6b45af04-15a7-4327-9c89-395799745602")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("59115fc6-ae77-4d6e-8459-548c5891e205")
    public static class Metadata {
        @objid ("0c809abf-84c5-4baa-8ad0-8fd4c8d16e07")
        private static SmClass smClass = null;

        @objid ("9888d9d8-2db3-4c4e-9946-4db653770b83")
        private static SmDependency SubRequirementDep = null;

        @objid ("5d925b13-a60d-49a5-a9ad-61a9c0cfa5c3")
        private static SmDependency OwnerContainerDep = null;

        @objid ("92610031-2fcb-4f61-a689-1940a17cdf44")
        private static SmDependency ParentRequirementDep = null;

        @objid ("46a00756-3fe6-4c27-a8d0-564a964303d2")
        private static SmDependency ArchivedRequirementVersionDep = null;

        @objid ("ba973588-edf9-4510-90a7-cfb8c0a5b3b0")
        private static SmDependency LastRequirementVersionDep = null;

        @objid ("88f0670a-ff1c-492d-aadb-f41d183ae937")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequirementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1c9acb9b-6712-4058-b3ca-b9afa9313acc")
        public static SmDependency SubRequirementDep() {
            if (SubRequirementDep == null) {
            	SubRequirementDep = classof().getDependencyDef("SubRequirement");
            }
            return SubRequirementDep;
        }

        @objid ("b55b5294-7647-476b-9e9d-1e18b30aaf4a")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("823522ad-ef00-458e-a43a-010f1d6cefa3")
        public static SmDependency ParentRequirementDep() {
            if (ParentRequirementDep == null) {
            	ParentRequirementDep = classof().getDependencyDef("ParentRequirement");
            }
            return ParentRequirementDep;
        }

        @objid ("b0c258dc-9a88-4530-86e7-45c702c5d49b")
        public static SmDependency ArchivedRequirementVersionDep() {
            if (ArchivedRequirementVersionDep == null) {
            	ArchivedRequirementVersionDep = classof().getDependencyDef("ArchivedRequirementVersion");
            }
            return ArchivedRequirementVersionDep;
        }

        @objid ("7763082c-9e3d-45a0-9001-eebb1d0eb1dd")
        public static SmDependency LastRequirementVersionDep() {
            if (LastRequirementVersionDep == null) {
            	LastRequirementVersionDep = classof().getDependencyDef("LastRequirementVersion");
            }
            return LastRequirementVersionDep;
        }

        @objid ("1b56b84f-6900-4416-b72d-41a451b12b49")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("242fae2e-898d-4594-9996-92a3f82eb6a2")
        public static SmDependency getLastRequirementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastRequirementVersionDep;
        }

        @objid ("739c61f1-79e9-4ce2-97d5-968689c23ba2")
        public static SmDependency getParentRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentRequirementDep;
        }

        @objid ("f5031215-29bc-47c7-a9a0-1945f9e92b56")
        public static SmDependency getArchivedRequirementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedRequirementVersionDep;
        }

        @objid ("d88b09c0-cc9f-4dab-a056-efa8b420b813")
        public static SmDependency getSubRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubRequirementDep;
        }

        @objid ("b8984298-c304-4650-a2d0-f395c0f04018")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8fb3c95f-267c-4e60-a366-5d23f93059b6")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cef9eba4-6649-473d-84f8-5c7bb727241d")
            public ISmObjectData createData() {
                return new RequirementData();
            }

            @objid ("9556ea60-530c-470f-bc76-6e483dd49c65")
            public SmObjectImpl createImpl() {
                return new RequirementImpl();
            }

        }

        @objid ("0b16d465-8e0b-4917-97aa-728cfbd9e4db")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("899e053f-666e-4020-a686-170dbdc5374f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mOwnerContainer;
            }

            @objid ("a3b0a8c0-baea-499b-919e-2b3b0a22daaf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mOwnerContainer = value;
            }

            @objid ("9f3f898d-788e-4e60-9daf-6d5be5a101d7")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnedRequirementDep();
            }

        }

        @objid ("015ad436-44bb-4f76-adac-305c1e5dad32")
        public static class SubRequirementSmDependency extends SmMultipleDependency {
            @objid ("2bafddf9-5670-45df-bc59-c1988a97a279")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementData)data).mSubRequirement != null)? ((RequirementData)data).mSubRequirement:SmMultipleDependency.EMPTY;
            }

            @objid ("06dd5aca-7371-4ed7-965f-faf0f59da14d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementData) data).mSubRequirement = new ArrayList<>(initialCapacity);
                return ((RequirementData) data).mSubRequirement;
            }

            @objid ("ef711099-2ef6-4ddf-9c67-3a335e08ced9")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.ParentRequirementDep();
            }

        }

        @objid ("1248b591-50dc-48a8-a038-f96a5e89a40a")
        public static class ParentRequirementSmDependency extends SmSingleDependency {
            @objid ("bb8fa34d-f4de-4aa0-9f81-d85d49ede4a0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mParentRequirement;
            }

            @objid ("a70bbfdb-21e2-4eab-97a0-e1197654454c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mParentRequirement = value;
            }

            @objid ("5a4d1991-7215-45a5-bf59-d874e17a763b")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.SubRequirementDep();
            }

        }

        @objid ("bfc5dc7f-ce0c-4cee-8b52-566b87a02aac")
        public static class ArchivedRequirementVersionSmDependency extends SmMultipleDependency {
            @objid ("946fc498-91c0-4d82-b092-6035237a18d8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementData)data).mArchivedRequirementVersion != null)? ((RequirementData)data).mArchivedRequirementVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("8c09400b-1e65-4c72-988e-6a0df42db97b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementData) data).mArchivedRequirementVersion = new ArrayList<>(initialCapacity);
                return ((RequirementData) data).mArchivedRequirementVersion;
            }

            @objid ("f08a51df-e3ba-46b8-ba7b-0d9fea8a1c77")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.LastRequirementVersionDep();
            }

        }

        @objid ("a8f74006-3f14-4d0c-93c0-8acb2dcda313")
        public static class LastRequirementVersionSmDependency extends SmSingleDependency {
            @objid ("6cc94dd7-d484-42f0-b7fc-27e0ec211ab6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mLastRequirementVersion;
            }

            @objid ("74194c03-76ff-435d-91fc-287542b2c08d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mLastRequirementVersion = value;
            }

            @objid ("1de21318-a4c5-44cc-85bc-0ef94163f0c0")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.ArchivedRequirementVersionDep();
            }

        }

    }

}
