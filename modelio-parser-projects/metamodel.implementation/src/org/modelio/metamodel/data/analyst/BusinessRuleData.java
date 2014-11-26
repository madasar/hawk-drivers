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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.data.analyst.BusinessRuleContainerData;
import org.modelio.metamodel.impl.analyst.BusinessRuleImpl;
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

@objid ("4da7b9f3-596c-4989-b28e-a35e40d48073")
@SmaMetaClass(mmClass=BusinessRule.class, factory=BusinessRuleData.Metadata.ObjectFactory.class, cmsnode=true)
public class BusinessRuleData extends AnalystElementData {
    @objid ("765b2a36-1788-429e-b716-3ad655ff4ff5")
    @SmaMetaAssociation(metaName="SubRule", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.SubRuleSmDependency.class, component = true)
     List<SmObjectImpl> mSubRule = null;

    @objid ("24a7be2d-025c-4348-8286-1460903a9880")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("2edb35d3-6239-457c-ac7c-9299e969a9c1")
    @SmaMetaAssociation(metaName="ParentRule", typeDataClass=BusinessRuleData.class, min=0, max=1, smAssociationClass=Metadata.ParentRuleSmDependency.class)
     SmObjectImpl mParentRule;

    @objid ("227e18e6-79ba-4927-8cca-0e0fa003010e")
    @SmaMetaAssociation(metaName="LastRuleVersion", typeDataClass=BusinessRuleData.class, min=0, max=1, smAssociationClass=Metadata.LastRuleVersionSmDependency.class)
     SmObjectImpl mLastRuleVersion;

    @objid ("17d66d33-220b-4803-a1d4-3cc00449c35c")
    @SmaMetaAssociation(metaName="ArchivedRuleVersion", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedRuleVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedRuleVersion = null;

    @objid ("7b6a33bb-b6ab-4421-91cf-22b50aa89ae7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("785300db-57ee-4e9e-8380-59b5550f902c")
    public static class Metadata {
        @objid ("10bda137-c434-4c7b-80f1-d06b5476803c")
        private static SmClass smClass = null;

        @objid ("a8d8982c-cc6a-48bc-a35c-812781726c22")
        private static SmDependency SubRuleDep = null;

        @objid ("13bc43b0-8872-461f-8a1f-0e456d7e0545")
        private static SmDependency OwnerContainerDep = null;

        @objid ("1d677f0e-2e15-452b-9910-9ba9f9929463")
        private static SmDependency ParentRuleDep = null;

        @objid ("8ce5a1ac-6b63-472b-97c4-facca5a5d1df")
        private static SmDependency LastRuleVersionDep = null;

        @objid ("f649e5c3-7815-4cbd-9058-5f0641ffab2a")
        private static SmDependency ArchivedRuleVersionDep = null;

        @objid ("9683c3ae-8394-408a-9909-70e84351852b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BusinessRuleData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f3f22917-e2ca-4647-baf7-72d3b3884e59")
        public static SmDependency SubRuleDep() {
            if (SubRuleDep == null) {
            	SubRuleDep = classof().getDependencyDef("SubRule");
            }
            return SubRuleDep;
        }

        @objid ("f47f3aa4-2e7d-4310-994a-ae83166828c1")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("4fbd5cc7-735e-4407-9593-4d39dff25749")
        public static SmDependency ParentRuleDep() {
            if (ParentRuleDep == null) {
            	ParentRuleDep = classof().getDependencyDef("ParentRule");
            }
            return ParentRuleDep;
        }

        @objid ("7162a28c-03f2-4ea8-9bad-80cef169fc88")
        public static SmDependency LastRuleVersionDep() {
            if (LastRuleVersionDep == null) {
            	LastRuleVersionDep = classof().getDependencyDef("LastRuleVersion");
            }
            return LastRuleVersionDep;
        }

        @objid ("7f987ecc-d2aa-4cf8-88a6-f7c6425a599a")
        public static SmDependency ArchivedRuleVersionDep() {
            if (ArchivedRuleVersionDep == null) {
            	ArchivedRuleVersionDep = classof().getDependencyDef("ArchivedRuleVersion");
            }
            return ArchivedRuleVersionDep;
        }

        @objid ("5fa203e3-f00f-4489-8b64-561d66bc93a8")
        public static SmDependency getLastRuleVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastRuleVersionDep;
        }

        @objid ("94f2c49d-bef2-41df-b3eb-33f0772c82a3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9cebb6a6-7d3e-4bbd-a0e1-2722e1a89b23")
        public static SmDependency getSubRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubRuleDep;
        }

        @objid ("4f70b63d-8498-47bc-b62f-cb6b6ec024d3")
        public static SmDependency getParentRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentRuleDep;
        }

        @objid ("0606a929-5b7c-4ec3-92bc-d90c4f8e644d")
        public static SmDependency getArchivedRuleVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedRuleVersionDep;
        }

        @objid ("288081da-5760-4d4d-b44a-48c257aaf2f1")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("89f134e8-1104-4a8f-8f98-c2c2fc658691")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5c21b77a-58cd-46c9-847a-2d1d84aad728")
            public ISmObjectData createData() {
                return new BusinessRuleData();
            }

            @objid ("447fec86-675f-4465-97b0-a78f5f5b5da1")
            public SmObjectImpl createImpl() {
                return new BusinessRuleImpl();
            }

        }

        @objid ("415085fe-8305-48ba-823b-cfe61e2be578")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("5907b835-d49f-4736-a679-317b34508e65")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mOwnerContainer;
            }

            @objid ("4c7f9a4b-e715-443d-b5e0-3ef344cf2ac0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mOwnerContainer = value;
            }

            @objid ("d6d2be84-f28e-47eb-9349-8cff762bd27d")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnedRuleDep();
            }

        }

        @objid ("3405a99c-020c-4223-8372-bc73f519d55a")
        public static class ParentRuleSmDependency extends SmSingleDependency {
            @objid ("587bddc7-e4cb-4ae5-8c6f-0554e81f23a3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mParentRule;
            }

            @objid ("ec0fcc9a-0c85-4ba4-a812-3505951e1bbb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mParentRule = value;
            }

            @objid ("624dfad5-a145-45de-880c-c61946fc59d5")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.SubRuleDep();
            }

        }

        @objid ("8e4029b8-e2ad-418a-90b7-315612b06ca9")
        public static class SubRuleSmDependency extends SmMultipleDependency {
            @objid ("656273c4-d639-4371-b2d7-a61a9b7bd2b1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleData)data).mSubRule != null)? ((BusinessRuleData)data).mSubRule:SmMultipleDependency.EMPTY;
            }

            @objid ("b6fcd90d-08c2-4fbe-a425-e2070f55cb2e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleData) data).mSubRule = new ArrayList<>(initialCapacity);
                return ((BusinessRuleData) data).mSubRule;
            }

            @objid ("bdd1a132-9501-4081-8445-7c6a1e5d3777")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.ParentRuleDep();
            }

        }

        @objid ("26ffe0fa-f31b-47dd-bb85-368e627f5526")
        public static class LastRuleVersionSmDependency extends SmSingleDependency {
            @objid ("4ca3787f-e491-4ef3-b770-dec1c9cce7ce")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mLastRuleVersion;
            }

            @objid ("25adab6d-e09f-40ab-87a4-74f4dadeb40a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mLastRuleVersion = value;
            }

            @objid ("bbe8b57d-cf31-4907-b566-8aa0c29a8a87")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.ArchivedRuleVersionDep();
            }

        }

        @objid ("d272e18f-a535-4f50-b622-5d7b4bf7659a")
        public static class ArchivedRuleVersionSmDependency extends SmMultipleDependency {
            @objid ("dbfeb791-5c55-44d9-b914-a97843041a6c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleData)data).mArchivedRuleVersion != null)? ((BusinessRuleData)data).mArchivedRuleVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("ddd7e497-153f-4276-92d5-c15379126e20")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleData) data).mArchivedRuleVersion = new ArrayList<>(initialCapacity);
                return ((BusinessRuleData) data).mArchivedRuleVersion;
            }

            @objid ("74234a37-3de7-489b-bdf6-c99f8fd37f8c")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.LastRuleVersionDep();
            }

        }

    }

}
