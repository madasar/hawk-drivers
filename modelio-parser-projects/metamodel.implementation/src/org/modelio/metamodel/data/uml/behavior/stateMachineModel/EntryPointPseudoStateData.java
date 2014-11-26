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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ConnectionPointReferenceData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateMachineData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.EntryPointPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
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

@objid ("004f999e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=EntryPointPseudoState.class, factory=EntryPointPseudoStateData.Metadata.ObjectFactory.class)
public class EntryPointPseudoStateData extends AbstractPseudoStateData {
    @objid ("a5988a5f-77ae-4e04-b096-c62834cbe76a")
    @SmaMetaAssociation(metaName="EntryOf", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.EntryOfSmDependency.class)
     SmObjectImpl mEntryOf;

    @objid ("45d56608-aa11-47c0-9105-15f8d56f1aa4")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class)
     List<SmObjectImpl> mConnection = null;

    @objid ("d7eae3b9-25fd-43d7-9e55-db6089350390")
    @SmaMetaAssociation(metaName="EntryOfMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.EntryOfMachineSmDependency.class)
     SmObjectImpl mEntryOfMachine;

    @objid ("2051e1dd-33a8-4508-94d1-6295f90d352a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002f1e76-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8ab7317c-f475-4c43-baa1-ae217a9ec446")
        private static SmClass smClass = null;

        @objid ("25161645-f8da-476e-8343-8831364550f6")
        private static SmDependency EntryOfDep = null;

        @objid ("613f4fef-481e-4c55-b6d5-eff5e10aca25")
        private static SmDependency ConnectionDep = null;

        @objid ("7b1ea432-3531-4325-8aea-53461d695848")
        private static SmDependency EntryOfMachineDep = null;

        @objid ("2f876fb4-f581-40a5-96ec-873122992c28")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EntryPointPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ea4c6ec8-12cb-44e4-9b14-bc76e82f12e5")
        public static SmDependency EntryOfDep() {
            if (EntryOfDep == null) {
            	EntryOfDep = classof().getDependencyDef("EntryOf");
            }
            return EntryOfDep;
        }

        @objid ("228ef174-c0eb-4aab-b51a-428f67f3eca1")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("83ead05c-419e-44b1-b935-d25de7abf105")
        public static SmDependency EntryOfMachineDep() {
            if (EntryOfMachineDep == null) {
            	EntryOfMachineDep = classof().getDependencyDef("EntryOfMachine");
            }
            return EntryOfMachineDep;
        }

        @objid ("b0b1bd0a-a6c7-4873-8020-a3835052f037")
        public static SmDependency getEntryOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryOfDep;
        }

        @objid ("f7f0bd11-2228-4c65-8b36-a7a4474637fd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8f42fde2-4f91-4a73-98e3-4a02b5cc0d9c")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("3ebe7b92-db66-44a5-8fc6-73e20519f895")
        public static SmDependency getEntryOfMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryOfMachineDep;
        }

        @objid ("002f5f44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d9f9d55e-b676-45d7-8d10-dae31c8d6e80")
            public ISmObjectData createData() {
                return new EntryPointPseudoStateData();
            }

            @objid ("ce9112c7-2435-4892-8c67-40451d25dc62")
            public SmObjectImpl createImpl() {
                return new EntryPointPseudoStateImpl();
            }

        }

        @objid ("002fc362-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("e24e6da5-465c-444c-b3e0-70bf03c45bb9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EntryPointPseudoStateData)data).mConnection != null)? ((EntryPointPseudoStateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("ecbd17bf-3cbb-4b8d-b97e-ba73ad6f105f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EntryPointPseudoStateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((EntryPointPseudoStateData) data).mConnection;
            }

            @objid ("1f25a784-8d02-4359-9a67-95a416f163ac")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.EntryDep();
            }

        }

        @objid ("0030279e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryOfSmDependency extends SmSingleDependency {
            @objid ("a864db1c-e557-4a96-958a-3643d2fb4685")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EntryPointPseudoStateData) data).mEntryOf;
            }

            @objid ("fc3df6f4-ec61-49a1-afbf-00e1a1591bd3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EntryPointPseudoStateData) data).mEntryOf = value;
            }

            @objid ("44e362b4-adbf-4323-a0e8-0ce0bb593090")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.EntryPointDep();
            }

        }

        @objid ("00309eb8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryOfMachineSmDependency extends SmSingleDependency {
            @objid ("9f644ba6-719e-40e8-b4c2-a3e8012232ef")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EntryPointPseudoStateData) data).mEntryOfMachine;
            }

            @objid ("949164b3-3e91-4e7c-9415-f4dd1b86bd89")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EntryPointPseudoStateData) data).mEntryOfMachine = value;
            }

            @objid ("9b19c322-2c93-46f5-894f-d3c43a213838")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.EntryPointDep();
            }

        }

    }

}
