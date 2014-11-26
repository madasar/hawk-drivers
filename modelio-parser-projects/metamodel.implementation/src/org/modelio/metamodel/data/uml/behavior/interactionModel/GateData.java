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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.CombinedFragmentData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionUseData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GateImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
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

@objid ("00459ffc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Gate.class, factory=GateData.Metadata.ObjectFactory.class)
public class GateData extends MessageEndData {
    @objid ("c2aca373-83f0-44e4-8999-ce79b832f191")
    @SmaMetaAssociation(metaName="OwnerUse", typeDataClass=InteractionUseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerUseSmDependency.class)
     SmObjectImpl mOwnerUse;

    @objid ("44e47a32-0952-491a-9201-35b4192aec51")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.ActualSmDependency.class)
     List<SmObjectImpl> mActual = null;

    @objid ("9278c0eb-69cb-496c-bb1e-327b1a13505a")
    @SmaMetaAssociation(metaName="OwnerInteraction", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerInteractionSmDependency.class)
     SmObjectImpl mOwnerInteraction;

    @objid ("6d0c07e4-bf62-4bea-97e2-1a55639e20e4")
    @SmaMetaAssociation(metaName="OwnerFragment", typeDataClass=CombinedFragmentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerFragmentSmDependency.class)
     SmObjectImpl mOwnerFragment;

    @objid ("4004313d-65d5-4e7f-b900-a8bbff96edfd")
    @SmaMetaAssociation(metaName="Formal", typeDataClass=GateData.class, min=0, max=1, smAssociationClass=Metadata.FormalSmDependency.class, partof = true)
     SmObjectImpl mFormal;

    @objid ("47b95d62-e72c-436d-bf72-2a96b8a48a66")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0084f6de-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c8e7d2b6-3a48-4ed1-89be-0cd2e2d6eb09")
        private static SmClass smClass = null;

        @objid ("f3a9cf67-8963-46c8-84d4-c71ebb64ee6f")
        private static SmDependency OwnerUseDep = null;

        @objid ("852a9082-89fe-48cd-bcf4-f179708c8aba")
        private static SmDependency ActualDep = null;

        @objid ("1897d97b-2ee1-48bd-b856-04fd5189aca7")
        private static SmDependency OwnerInteractionDep = null;

        @objid ("670f580a-db13-4a30-aa05-ded3869b3835")
        private static SmDependency OwnerFragmentDep = null;

        @objid ("b890afb8-1bfe-40b0-a8bf-7e4fbef0858a")
        private static SmDependency FormalDep = null;

        @objid ("c2cdfb84-0e8a-46df-8b61-d19f9003d4f2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a11f52cc-1d69-47e2-a87a-a31fbf5b3659")
        public static SmDependency OwnerUseDep() {
            if (OwnerUseDep == null) {
            	OwnerUseDep = classof().getDependencyDef("OwnerUse");
            }
            return OwnerUseDep;
        }

        @objid ("9884fe5a-fecf-4716-a01e-0f91b517eb66")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("ab50a2b7-2595-4a65-a5e5-e51e25cefacb")
        public static SmDependency OwnerInteractionDep() {
            if (OwnerInteractionDep == null) {
            	OwnerInteractionDep = classof().getDependencyDef("OwnerInteraction");
            }
            return OwnerInteractionDep;
        }

        @objid ("1c0261f1-07c8-46c9-b212-368bf0e9e45c")
        public static SmDependency OwnerFragmentDep() {
            if (OwnerFragmentDep == null) {
            	OwnerFragmentDep = classof().getDependencyDef("OwnerFragment");
            }
            return OwnerFragmentDep;
        }

        @objid ("56d3feab-3e3b-446a-b417-84873c70afda")
        public static SmDependency FormalDep() {
            if (FormalDep == null) {
            	FormalDep = classof().getDependencyDef("Formal");
            }
            return FormalDep;
        }

        @objid ("7de65540-4981-4c92-8819-d4424a692475")
        public static SmDependency getOwnerInteractionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerInteractionDep;
        }

        @objid ("9d0e2be4-2917-4004-b7d2-52d97f978ff6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1e1da286-3811-44ae-a476-a94cc7875f0b")
        public static SmDependency getFormalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalDep;
        }

        @objid ("b3c86dfe-ac28-4832-8022-ed901420d77a")
        public static SmDependency getOwnerFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerFragmentDep;
        }

        @objid ("f1c8a52e-615e-4c5a-9606-1944fb208480")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("66242953-629c-47cc-b2ed-1ca98275d60d")
        public static SmDependency getOwnerUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerUseDep;
        }

        @objid ("008537fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4faa8240-2e7c-4286-ae33-6bebd9e49395")
            public ISmObjectData createData() {
                return new GateData();
            }

            @objid ("fe22fa14-0c3d-4626-bb33-9ce89f570874")
            public SmObjectImpl createImpl() {
                return new GateImpl();
            }

        }

        @objid ("00859b0c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerFragmentSmDependency extends SmSingleDependency {
            @objid ("5649d7c9-e258-4f9e-a3ab-ee3838176cda")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerFragment;
            }

            @objid ("57e81639-017a-40af-8db4-96d4d0478e1b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerFragment = value;
            }

            @objid ("2c009293-fb07-4573-89cf-14554e385055")
            @Override
            public SmDependency getSymetric() {
                return CombinedFragmentData.Metadata.FragmentGateDep();
            }

        }

        @objid ("00860f7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class FormalSmDependency extends SmSingleDependency {
            @objid ("d32e1e5d-a70f-451d-a857-e54f2c153283")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mFormal;
            }

            @objid ("c14df1ec-8164-45c2-94c0-a36eca85f25f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mFormal = value;
            }

            @objid ("42b4c576-ea72-4f93-b9ff-ca28d51405ca")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.ActualDep();
            }

        }

        @objid ("00868620-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmMultipleDependency {
            @objid ("64a7ef4f-22fb-4f9a-af9f-86887e3703e5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GateData)data).mActual != null)? ((GateData)data).mActual:SmMultipleDependency.EMPTY;
            }

            @objid ("38bbede7-09a9-477e-a221-2a243665efdf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GateData) data).mActual = new ArrayList<>(initialCapacity);
                return ((GateData) data).mActual;
            }

            @objid ("c21fbed8-4051-4af3-bf55-ae6ec94aa7d1")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.FormalDep();
            }

        }

        @objid ("0086e99e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerInteractionSmDependency extends SmSingleDependency {
            @objid ("dcdb1a69-9562-4cd7-9ca6-08ff8b35e548")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerInteraction;
            }

            @objid ("44307434-68d1-4882-8cf8-59022a9e3e83")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerInteraction = value;
            }

            @objid ("44c52e7e-8e6b-48ea-a846-cf9aab41536b")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.FormalGateDep();
            }

        }

        @objid ("00875f8c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerUseSmDependency extends SmSingleDependency {
            @objid ("e7672e4f-2039-4d91-ab67-dd1855ebb34e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerUse;
            }

            @objid ("46e1fa85-79eb-4c1a-8376-3c0fd11bd645")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerUse = value;
            }

            @objid ("6d32d910-0bc4-4a5d-99ec-cdbc443c9d88")
            @Override
            public SmDependency getSymetric() {
                return InteractionUseData.Metadata.ActualGateDep();
            }

        }

    }

}
