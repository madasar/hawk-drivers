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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.EntryPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ExitPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ConnectionPointReferenceImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
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

@objid ("004e9526-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ConnectionPointReference.class, factory=ConnectionPointReferenceData.Metadata.ObjectFactory.class)
public class ConnectionPointReferenceData extends StateVertexData {
    @objid ("473aa9ae-f5f6-46c8-9e9a-bf582200d928")
    @SmaMetaAssociation(metaName="Exit", typeDataClass=ExitPointPseudoStateData.class, min=0, max=1, smAssociationClass=Metadata.ExitSmDependency.class, partof = true)
     SmObjectImpl mExit;

    @objid ("80f8f6a5-917f-4d65-9aa3-a4edce96f1f6")
    @SmaMetaAssociation(metaName="Entry", typeDataClass=EntryPointPseudoStateData.class, min=0, max=1, smAssociationClass=Metadata.EntrySmDependency.class, partof = true)
     SmObjectImpl mEntry;

    @objid ("c821498f-6cce-461e-8349-04a4a1d906c2")
    @SmaMetaAssociation(metaName="OwnerState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStateSmDependency.class)
     SmObjectImpl mOwnerState;

    @objid ("41d6f59f-83f8-4322-b1bf-84f329e8642a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0094ba38-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9bfb205f-97c2-4fa5-80b4-554420d549ca")
        private static SmClass smClass = null;

        @objid ("381ac5fd-0fde-416b-b445-8d5a50453feb")
        private static SmDependency ExitDep = null;

        @objid ("41a9f03f-5be4-4375-94fd-388c26626a7d")
        private static SmDependency EntryDep = null;

        @objid ("4f81be1c-fa86-4e8b-9903-3290a1a769e6")
        private static SmDependency OwnerStateDep = null;

        @objid ("f3da5be9-b439-44d9-b90e-e03436041eb9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectionPointReferenceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8183ebb0-911d-40c2-bbbf-0e37802808ba")
        public static SmDependency ExitDep() {
            if (ExitDep == null) {
            	ExitDep = classof().getDependencyDef("Exit");
            }
            return ExitDep;
        }

        @objid ("7683b960-735a-4f3f-a555-ca1e27ee6c5f")
        public static SmDependency EntryDep() {
            if (EntryDep == null) {
            	EntryDep = classof().getDependencyDef("Entry");
            }
            return EntryDep;
        }

        @objid ("cf33114f-f69a-4519-8b0d-9dcec1c8fe17")
        public static SmDependency OwnerStateDep() {
            if (OwnerStateDep == null) {
            	OwnerStateDep = classof().getDependencyDef("OwnerState");
            }
            return OwnerStateDep;
        }

        @objid ("e8d23b79-5226-42a6-a4a9-fff05c1a42a0")
        public static SmDependency getEntryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryDep;
        }

        @objid ("ceadcf48-69c8-412a-80a6-072f41ddbda6")
        public static SmDependency getExitDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitDep;
        }

        @objid ("e1f75812-f14e-4890-b8d9-24b568e9f982")
        public static SmDependency getOwnerStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStateDep;
        }

        @objid ("8425ca89-8a32-4765-a4d9-e2582eda4387")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0095112c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a3c981e3-4da2-49ce-8366-5af07621b1b5")
            public ISmObjectData createData() {
                return new ConnectionPointReferenceData();
            }

            @objid ("2d05af32-03df-42ec-84ad-d403465588c3")
            public SmObjectImpl createImpl() {
                return new ConnectionPointReferenceImpl();
            }

        }

        @objid ("00958b70-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EntrySmDependency extends SmSingleDependency {
            @objid ("01ec7f00-8198-42b1-ba00-c02c586aa761")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mEntry;
            }

            @objid ("0391d3d2-0be7-42f0-b045-bdb65a6f7b7c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mEntry = value;
            }

            @objid ("fe141edc-1ed9-4207-a843-c0c4b9e5928a")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.ConnectionDep();
            }

        }

        @objid ("00961d2e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExitSmDependency extends SmSingleDependency {
            @objid ("6e150d44-5262-4037-8025-89671b56ce0c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mExit;
            }

            @objid ("898a4057-6faa-4f2d-834c-c2bc5ee3a879")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mExit = value;
            }

            @objid ("d390cae3-7356-4873-885d-816c58a3a439")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ConnectionDep();
            }

        }

        @objid ("0096ac4e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerStateSmDependency extends SmSingleDependency {
            @objid ("aa043943-8cfe-4f00-9b41-6d0a3f31f671")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mOwnerState;
            }

            @objid ("69c1f20e-2d40-4a58-b94b-f8a19c73709d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mOwnerState = value;
            }

            @objid ("ea160d52-c5ce-4f33-a716-d9b2a68f3e07")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.ConnectionDep();
            }

        }

    }

}
