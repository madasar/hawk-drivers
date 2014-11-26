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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ExitPointPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
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

@objid ("00501928-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExitPointPseudoState.class, factory=ExitPointPseudoStateData.Metadata.ObjectFactory.class)
public class ExitPointPseudoStateData extends AbstractPseudoStateData {
    @objid ("88a20799-5fdd-4fe9-a2ff-0037896c9ea8")
    @SmaMetaAssociation(metaName="ExitOf", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.ExitOfSmDependency.class)
     SmObjectImpl mExitOf;

    @objid ("438b9293-ec89-42e6-93bc-e2e3fa202380")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class)
     List<SmObjectImpl> mConnection = null;

    @objid ("850283a4-684e-425c-984c-11f0195c1144")
    @SmaMetaAssociation(metaName="ExitOfMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.ExitOfMachineSmDependency.class)
     SmObjectImpl mExitOfMachine;

    @objid ("18283d1b-a427-41ab-8845-2405a630e585")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00886fbc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9a9a257d-e213-424c-a392-fed3cbb595d2")
        private static SmClass smClass = null;

        @objid ("b636c59b-bce0-4045-92a5-be46b4e5c6a7")
        private static SmDependency ExitOfDep = null;

        @objid ("0214eff8-1429-41eb-9928-a7a5e42cea92")
        private static SmDependency ConnectionDep = null;

        @objid ("e86f2ca4-2b67-4bfc-a967-051b5ebafd99")
        private static SmDependency ExitOfMachineDep = null;

        @objid ("3ebf549e-cebf-4adc-a928-2b0fccb28fdf")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExitPointPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a3a55845-60c8-4631-b919-733de96bd84c")
        public static SmDependency ExitOfDep() {
            if (ExitOfDep == null) {
            	ExitOfDep = classof().getDependencyDef("ExitOf");
            }
            return ExitOfDep;
        }

        @objid ("4421b437-7322-404c-a297-eb6df8dafd0e")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("2a9706f5-5407-4432-bf2d-a36454f19d6e")
        public static SmDependency ExitOfMachineDep() {
            if (ExitOfMachineDep == null) {
            	ExitOfMachineDep = classof().getDependencyDef("ExitOfMachine");
            }
            return ExitOfMachineDep;
        }

        @objid ("931be9c2-b9a8-443f-baee-321ffa790374")
        public static SmDependency getExitOfMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitOfMachineDep;
        }

        @objid ("ff1dbeab-1858-46fe-aaea-551792cbf73b")
        public static SmDependency getExitOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitOfDep;
        }

        @objid ("d36a4da9-5943-4bdc-9ae6-aa2a79a98e1f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("61b501b5-df6f-422c-9af1-76d1483c2e70")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("0088c160-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fd1ea663-a5bb-44e9-aafb-943521d65749")
            public ISmObjectData createData() {
                return new ExitPointPseudoStateData();
            }

            @objid ("04e95d28-8890-4fa7-bd77-cee7f2971649")
            public SmObjectImpl createImpl() {
                return new ExitPointPseudoStateImpl();
            }

        }

        @objid ("00893618-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("4fd7a2f5-b23c-4ead-b4ea-846183b47b82")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExitPointPseudoStateData)data).mConnection != null)? ((ExitPointPseudoStateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("bb163cea-71b0-4c8d-9171-0a86a278520f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExitPointPseudoStateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((ExitPointPseudoStateData) data).mConnection;
            }

            @objid ("947cf29c-024f-48a8-b1bc-320b1b39ef63")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.ExitDep();
            }

        }

        @objid ("0089aaf8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitOfSmDependency extends SmSingleDependency {
            @objid ("1f03e682-9e9d-4c48-9ed3-129f9f079527")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExitPointPseudoStateData) data).mExitOf;
            }

            @objid ("85832e51-897b-432e-b623-68782a73c8aa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExitPointPseudoStateData) data).mExitOf = value;
            }

            @objid ("9171a24e-6df5-4fc4-a86e-0d4c7ff2e222")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.ExitPointDep();
            }

        }

        @objid ("008a33a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitOfMachineSmDependency extends SmSingleDependency {
            @objid ("4a469cbc-177d-4ed9-818a-62d184878ce6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExitPointPseudoStateData) data).mExitOfMachine;
            }

            @objid ("f4b2672d-e59a-487f-86f4-1d053da49e0c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExitPointPseudoStateData) data).mExitOfMachine = value;
            }

            @objid ("0c4a008a-7542-4869-ba92-91760f4c20d4")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.ExitPointDep();
            }

        }

    }

}
