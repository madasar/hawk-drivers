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
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.EntryPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ExitPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.RegionData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateMachineImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
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

@objid ("00546122-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StateMachine.class, factory=StateMachineData.Metadata.ObjectFactory.class, cmsnode=true)
public class StateMachineData extends BehaviorData {
    @objid ("b11bb09c-f066-4a7a-898f-02392f3b0155")
    @SmaMetaAttribute(metaName="Kind", type=KindOfStateMachine.class, smAttributeClass=Metadata.KindSmAttribute.class)
     Object mKind = KindOfStateMachine.DYNAMIC;

    @objid ("b7a669a4-0547-4389-903c-22eedec670ed")
    @SmaMetaAssociation(metaName="Top", typeDataClass=RegionData.class, min=1, max=1, smAssociationClass=Metadata.TopSmDependency.class, component = true)
     SmObjectImpl mTop;

    @objid ("b0fd4e61-c3c1-4ba3-b7d8-8776dd17f678")
    @SmaMetaAssociation(metaName="SubmachineState", typeDataClass=StateData.class, min=0, max=-1, smAssociationClass=Metadata.SubmachineStateSmDependency.class)
     List<SmObjectImpl> mSubmachineState = null;

    @objid ("756ebccb-8ba5-41f6-9b2a-de74903fd86a")
    @SmaMetaAssociation(metaName="EntryPoint", typeDataClass=EntryPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointSmDependency.class, component = true)
     List<SmObjectImpl> mEntryPoint = null;

    @objid ("4e910e82-bb23-42e8-905e-e13745dbea16")
    @SmaMetaAssociation(metaName="ExitPoint", typeDataClass=ExitPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.ExitPointSmDependency.class, component = true)
     List<SmObjectImpl> mExitPoint = null;

    @objid ("3c122cb5-b7ab-4b8f-9967-10c597a395f4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050353e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bdb4023b-bc76-4698-97ef-ef47e2c21555")
        private static SmClass smClass = null;

        @objid ("f7b0c02f-2539-428d-8063-6eb7c48c4c68")
        private static SmAttribute KindAtt = null;

        @objid ("0bc0760e-d9d3-4dad-8d73-22c1dbe95de0")
        private static SmDependency TopDep = null;

        @objid ("cfed471f-dcec-4246-a630-d05cf622878d")
        private static SmDependency SubmachineStateDep = null;

        @objid ("50aa5b61-0541-4cfd-aac7-288f5a93a6cd")
        private static SmDependency EntryPointDep = null;

        @objid ("518e44bb-715b-4743-86a8-e07a7e5aebc0")
        private static SmDependency ExitPointDep = null;

        @objid ("61314aca-98a8-4cba-a084-6cca73ccad5f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateMachineData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d5214b86-832b-4883-98d1-f5e68784124d")
        public static SmAttribute KindAtt() {
            if (KindAtt == null) {
            	KindAtt = classof().getAttributeDef("Kind");
            }
            return KindAtt;
        }

        @objid ("052c5063-7b17-467a-88bb-cf5b8289d9b3")
        public static SmDependency TopDep() {
            if (TopDep == null) {
            	TopDep = classof().getDependencyDef("Top");
            }
            return TopDep;
        }

        @objid ("ab9e6d2b-8a76-4b61-891c-3b6b4351e01b")
        public static SmDependency SubmachineStateDep() {
            if (SubmachineStateDep == null) {
            	SubmachineStateDep = classof().getDependencyDef("SubmachineState");
            }
            return SubmachineStateDep;
        }

        @objid ("ff3028e8-57cb-4777-8a0b-f90050154025")
        public static SmDependency EntryPointDep() {
            if (EntryPointDep == null) {
            	EntryPointDep = classof().getDependencyDef("EntryPoint");
            }
            return EntryPointDep;
        }

        @objid ("e9c1100a-46e9-40d3-a736-5fc842b73e55")
        public static SmDependency ExitPointDep() {
            if (ExitPointDep == null) {
            	ExitPointDep = classof().getDependencyDef("ExitPoint");
            }
            return ExitPointDep;
        }

        @objid ("8b775d52-e6e9-43b7-898f-9e1eaf2381d1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5b7afe41-6c4e-471d-a1df-6d055f407027")
        public static SmDependency getTopDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TopDep;
        }

        @objid ("3fa3c527-b5a8-4c00-812a-9776f4b9da77")
        public static SmDependency getSubmachineStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubmachineStateDep;
        }

        @objid ("151c6b39-1a9a-4f74-a7c7-15ad8e8e8ef2")
        public static SmDependency getExitPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitPointDep;
        }

        @objid ("af3d8d15-b667-4fb0-90cd-f18bb285b02c")
        public static SmDependency getEntryPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointDep;
        }

        @objid ("eaec7928-d70f-4ef5-b2bc-56b32c65fba5")
        public static SmAttribute getKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindAtt;
        }

        @objid ("005075ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e4e98593-8a5c-44f2-95f5-5b8b90c37c96")
            public ISmObjectData createData() {
                return new StateMachineData();
            }

            @objid ("e7f622e0-897f-476f-8233-06b03488ef18")
            public SmObjectImpl createImpl() {
                return new StateMachineImpl();
            }

        }

        @objid ("0050e0d8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class KindSmAttribute extends SmAttribute {
            @objid ("f8d63524-437d-4d33-8ff4-f4598b6ad92d")
            public Object getValue(ISmObjectData data) {
                return ((StateMachineData) data).mKind;
            }

            @objid ("41b2f3a8-7bcd-4e86-9b29-12ca204a76ff")
            public void setValue(ISmObjectData data, Object value) {
                ((StateMachineData) data).mKind = value;
            }

        }

        @objid ("00514596-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TopSmDependency extends SmSingleDependency {
            @objid ("9bc7c7b3-4445-4f62-9141-df59898c7fe1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateMachineData) data).mTop;
            }

            @objid ("053cab7e-675d-48e1-b588-131ce51c2eb1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateMachineData) data).mTop = value;
            }

            @objid ("ddaad941-f855-4e95-9f46-1962fe4ba33f")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.RepresentedDep();
            }

        }

        @objid ("0051bc92-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubmachineStateSmDependency extends SmMultipleDependency {
            @objid ("b93397e1-929b-4827-ab20-ea8d1a87042d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mSubmachineState != null)? ((StateMachineData)data).mSubmachineState:SmMultipleDependency.EMPTY;
            }

            @objid ("0a8881b5-44bf-46c5-8fc5-c23328f7401d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mSubmachineState = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mSubmachineState;
            }

            @objid ("550c073b-52c9-4a85-a5c9-4fc9c6ed415d")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.SubMachineDep();
            }

        }

        @objid ("005221e6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryPointSmDependency extends SmMultipleDependency {
            @objid ("6f0489e3-791c-4f6e-920c-86d2d21ffd55")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mEntryPoint != null)? ((StateMachineData)data).mEntryPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("6985d01d-7dc5-4aab-862e-15ec00efaf99")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mEntryPoint = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mEntryPoint;
            }

            @objid ("6b7b4518-14e2-4c07-a64b-cd57edd493f2")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.EntryOfMachineDep();
            }

        }

        @objid ("005285fa-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitPointSmDependency extends SmMultipleDependency {
            @objid ("4d6a57cf-44e9-45c4-a033-1d9a7ff6974d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mExitPoint != null)? ((StateMachineData)data).mExitPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("c3115b40-3890-4bdf-92bc-fbc2e7538027")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mExitPoint = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mExitPoint;
            }

            @objid ("7f28dca0-bcfc-47c0-aee0-a0e03c98b1cf")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ExitOfMachineDep();
            }

        }

    }

}
