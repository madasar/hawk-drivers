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
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.BusinessRuleData;
import org.modelio.metamodel.impl.analyst.BusinessRuleContainerImpl;
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

@objid ("43bed3c3-3cdf-4dab-9cc1-98967bdd90dc")
@SmaMetaClass(mmClass=BusinessRuleContainer.class, factory=BusinessRuleContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class BusinessRuleContainerData extends AnalystContainerData {
    @objid ("34b127b5-b991-4f20-bb4b-233a629fb723")
    @SmaMetaAssociation(metaName="OwnedRule", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRuleSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRule = null;

    @objid ("8676b728-fc89-4deb-8629-6a676339a3ac")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("50ab84bb-e365-4a50-a994-c376e8a1d9c1")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("040c5704-8f58-4df5-a805-77a7fbb9f558")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("5ffcc4b1-1dbd-4d7e-96a4-e60bda6128f9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("1f0fdee9-10fb-46f9-9676-75528ad7021f")
    public static class Metadata {
        @objid ("52ac93ac-02c6-4ad0-bd5a-f554586c02d2")
        private static SmClass smClass = null;

        @objid ("24a1183e-bb1d-488c-a062-24b04b699c27")
        private static SmDependency OwnedRuleDep = null;

        @objid ("010d385e-de47-418d-af98-10a4f0716eb0")
        private static SmDependency OwnerContainerDep = null;

        @objid ("0c1bef00-707c-48c8-ad1a-b5e6577abe34")
        private static SmDependency OwnedContainerDep = null;

        @objid ("0a5498c5-e6c2-468d-be0d-6993e12c0fc7")
        private static SmDependency OwnerProjectDep = null;

        @objid ("b01a9dcc-7867-4e99-bedd-8a53ebb01cc3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BusinessRuleContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("45b4aad9-483c-49df-8ab5-e60cb6643963")
        public static SmDependency OwnedRuleDep() {
            if (OwnedRuleDep == null) {
            	OwnedRuleDep = classof().getDependencyDef("OwnedRule");
            }
            return OwnedRuleDep;
        }

        @objid ("e9e1ce7b-1d03-410c-994b-fe3b375ed8de")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("25468a9b-5414-4b1d-9ba7-c9b16ce4e18f")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("efe45639-7316-470c-a27c-295afb22e2b2")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("b5c760ac-8a0b-4cf0-8b53-fa6b99250ccb")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("cf0ac041-6eef-4fcd-8d98-3352d58fa010")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("ce6a202e-b5f6-47d0-9a63-10f9808f3206")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("fe89f7ac-dc8f-4a94-a55e-e500fab0f1df")
        public static SmDependency getOwnedRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRuleDep;
        }

        @objid ("b8ef7a7e-28b2-41c9-90ee-cccdc6074dc7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("add7bde6-5e2f-42eb-b11b-f900a0512600")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a8a806ec-b2a7-46a2-8aa8-e8de2513082e")
            public ISmObjectData createData() {
                return new BusinessRuleContainerData();
            }

            @objid ("a56f037a-9300-442f-94ab-b4a9c3734f53")
            public SmObjectImpl createImpl() {
                return new BusinessRuleContainerImpl();
            }

        }

        @objid ("91c3c906-d5c2-407c-bf2e-2e538edb4138")
        public static class OwnedRuleSmDependency extends SmMultipleDependency {
            @objid ("e391ffe6-f8df-4e09-9128-8655f6d0182a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleContainerData)data).mOwnedRule != null)? ((BusinessRuleContainerData)data).mOwnedRule:SmMultipleDependency.EMPTY;
            }

            @objid ("fa49d74f-b15b-4e9a-bd53-320a2c444c20")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleContainerData) data).mOwnedRule = new ArrayList<>(initialCapacity);
                return ((BusinessRuleContainerData) data).mOwnedRule;
            }

            @objid ("99d13686-2a2c-46af-8954-ac3d24710e2d")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("b39f2139-cfab-4468-b932-b76486c1ccfb")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("d64d3268-9317-4c6c-bfd6-f1fd466503e4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleContainerData) data).mOwnerContainer;
            }

            @objid ("49e08b11-279b-40e4-bf16-89629628e48c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleContainerData) data).mOwnerContainer = value;
            }

            @objid ("1e9bc97d-474c-4f09-b1bb-6dc45a0fcc5d")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("958e7f97-3131-4622-a4c3-ce7602658833")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("e0251e24-04ea-46b7-a96d-775490d68a8e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleContainerData)data).mOwnedContainer != null)? ((BusinessRuleContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("4761c241-c60a-48f7-9f7d-7686a702137a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((BusinessRuleContainerData) data).mOwnedContainer;
            }

            @objid ("6ab00e32-f9f4-4323-a0db-773ed32b3dee")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("248d50af-0124-4053-98d9-d30a4503ac33")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("c160ea03-e47c-43c0-bddc-c3a63b068e8b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleContainerData) data).mOwnerProject;
            }

            @objid ("79ec3d0d-74f8-42c0-aec3-2275a8c03b01")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleContainerData) data).mOwnerProject = value;
            }

            @objid ("c0e68c01-0b04-428e-903a-066493c9ea57")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.BusinessRuleRootDep();
            }

        }

    }

}
