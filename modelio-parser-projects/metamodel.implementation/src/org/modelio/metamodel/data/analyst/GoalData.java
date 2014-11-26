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
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.data.analyst.GoalContainerData;
import org.modelio.metamodel.impl.analyst.GoalImpl;
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

@objid ("e8d12951-1ab0-47fa-a43b-bfbe216ceb44")
@SmaMetaClass(mmClass=Goal.class, factory=GoalData.Metadata.ObjectFactory.class, cmsnode=true)
public class GoalData extends AnalystElementData {
    @objid ("ec4adec4-09c8-4a70-abeb-073c63bd3962")
    @SmaMetaAssociation(metaName="SubGoal", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.SubGoalSmDependency.class, component = true)
     List<SmObjectImpl> mSubGoal = null;

    @objid ("bd2087c3-c38e-4ec5-a5e4-2451745b2e42")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GoalContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("6b158845-9400-4406-87df-d15e5b405050")
    @SmaMetaAssociation(metaName="ParentGoal", typeDataClass=GoalData.class, min=0, max=1, smAssociationClass=Metadata.ParentGoalSmDependency.class)
     SmObjectImpl mParentGoal;

    @objid ("2c379725-f175-462f-aa54-2ca88a83e641")
    @SmaMetaAssociation(metaName="LastGoalVersion", typeDataClass=GoalData.class, min=0, max=1, smAssociationClass=Metadata.LastGoalVersionSmDependency.class)
     SmObjectImpl mLastGoalVersion;

    @objid ("f3e7b304-f848-45e3-9892-db1fc2138e4b")
    @SmaMetaAssociation(metaName="ArchivedGoalVersion", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedGoalVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedGoalVersion = null;

    @objid ("2646e9fb-79ea-4c0d-be03-109230a923ff")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("5e744ed9-032b-413d-9224-56a38b7d43ef")
    public static class Metadata {
        @objid ("3910c7f7-61d8-4cb8-89ad-89c09d5dba5a")
        private static SmClass smClass = null;

        @objid ("7dd05e4e-01e8-4c6f-8eb3-ab058e00174d")
        private static SmDependency SubGoalDep = null;

        @objid ("ed009514-6db1-495f-8415-c807aeb0a4d3")
        private static SmDependency OwnerContainerDep = null;

        @objid ("50096b4a-2b93-4a2a-a22d-faa6d7f52c07")
        private static SmDependency ParentGoalDep = null;

        @objid ("ab386625-80f0-4011-869e-83d84d0887a6")
        private static SmDependency LastGoalVersionDep = null;

        @objid ("409b6ee8-8fca-4c80-afad-75d2d4c9ff79")
        private static SmDependency ArchivedGoalVersionDep = null;

        @objid ("abd5d3c4-4002-4c3d-89f1-23c8ed7d3214")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GoalData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6bc22f9b-c767-47c4-8856-e1103a68c428")
        public static SmDependency SubGoalDep() {
            if (SubGoalDep == null) {
            	SubGoalDep = classof().getDependencyDef("SubGoal");
            }
            return SubGoalDep;
        }

        @objid ("1c394b6e-3c57-479c-b9b4-8d90ac38b438")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("8591b6e2-4286-47bf-b492-0ba35eb35e7a")
        public static SmDependency ParentGoalDep() {
            if (ParentGoalDep == null) {
            	ParentGoalDep = classof().getDependencyDef("ParentGoal");
            }
            return ParentGoalDep;
        }

        @objid ("90e8bc2b-cdbf-4ec5-8277-066059680530")
        public static SmDependency LastGoalVersionDep() {
            if (LastGoalVersionDep == null) {
            	LastGoalVersionDep = classof().getDependencyDef("LastGoalVersion");
            }
            return LastGoalVersionDep;
        }

        @objid ("2584ebe1-e589-4df8-a7e1-2709664c517b")
        public static SmDependency ArchivedGoalVersionDep() {
            if (ArchivedGoalVersionDep == null) {
            	ArchivedGoalVersionDep = classof().getDependencyDef("ArchivedGoalVersion");
            }
            return ArchivedGoalVersionDep;
        }

        @objid ("ed0c4914-dbd5-44fa-837e-b8935b60343d")
        public static SmDependency getArchivedGoalVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedGoalVersionDep;
        }

        @objid ("47708b23-0819-4ce9-9d01-028c964ab8a7")
        public static SmDependency getParentGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentGoalDep;
        }

        @objid ("138fac07-c27f-40b6-af7d-a4d1d232d3ad")
        public static SmDependency getLastGoalVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastGoalVersionDep;
        }

        @objid ("3c9505f5-891f-4284-a88d-bcd097d43c11")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("b618d83a-4b51-4450-8fb1-4daf485dcfd1")
        public static SmDependency getSubGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubGoalDep;
        }

        @objid ("f056a1bd-6e78-498a-9551-a916187e8806")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0acdee9a-9cd3-4b6f-8c85-ffd3bad19cdb")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("409b6388-8d57-4349-8ec2-8860abb629c6")
            public ISmObjectData createData() {
                return new GoalData();
            }

            @objid ("baf4d720-4622-4af9-8055-8abcd021a926")
            public SmObjectImpl createImpl() {
                return new GoalImpl();
            }

        }

        @objid ("92a1be87-c6ac-45f9-8990-1f178ac7aaac")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("fe252d18-8080-4b7e-b10a-a2c50052546c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mOwnerContainer;
            }

            @objid ("b44da011-c643-423e-a4f9-c5909aaff1c3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mOwnerContainer = value;
            }

            @objid ("80c647ac-773c-4e57-a526-be7c002474a6")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnedGoalDep();
            }

        }

        @objid ("d84c6795-9fc0-43be-97fc-a4fba6b4738b")
        public static class ParentGoalSmDependency extends SmSingleDependency {
            @objid ("10e473b0-8435-4976-a7ba-08ffbccc5218")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mParentGoal;
            }

            @objid ("9515d162-ca7a-4dab-957a-f2e2e8b1b9ab")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mParentGoal = value;
            }

            @objid ("5986f2ed-a35c-4dbc-8095-3261ed291550")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.SubGoalDep();
            }

        }

        @objid ("0f92e307-bc8c-401e-9d37-ab23d953326a")
        public static class SubGoalSmDependency extends SmMultipleDependency {
            @objid ("616d2a9a-23e9-4fb6-9d56-9835feaba047")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalData)data).mSubGoal != null)? ((GoalData)data).mSubGoal:SmMultipleDependency.EMPTY;
            }

            @objid ("0a2a2bf6-2920-447a-a6e1-1ac0cd57482e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalData) data).mSubGoal = new ArrayList<>(initialCapacity);
                return ((GoalData) data).mSubGoal;
            }

            @objid ("00387c76-97b9-4dfa-a655-537f6412b296")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.ParentGoalDep();
            }

        }

        @objid ("9e4bdc62-c678-47ae-afc5-5b8e36fece04")
        public static class LastGoalVersionSmDependency extends SmSingleDependency {
            @objid ("cdc871e6-4620-4cea-8d4d-1e0f687c200c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mLastGoalVersion;
            }

            @objid ("143b8111-7b2d-455f-aa1a-02e79c4bc2d4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mLastGoalVersion = value;
            }

            @objid ("b858c98e-418d-4247-9ad1-0ffa548c76c4")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.ArchivedGoalVersionDep();
            }

        }

        @objid ("f6dd9f71-3798-482a-947b-1a05165b1f7e")
        public static class ArchivedGoalVersionSmDependency extends SmMultipleDependency {
            @objid ("94d506bc-2f2e-46c6-9dfd-b85f8b0429c4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalData)data).mArchivedGoalVersion != null)? ((GoalData)data).mArchivedGoalVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("a0976bec-435e-48e4-87c9-a27398ddb9f2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalData) data).mArchivedGoalVersion = new ArrayList<>(initialCapacity);
                return ((GoalData) data).mArchivedGoalVersion;
            }

            @objid ("079f3e58-dff3-4853-b9c2-0f58bb888598")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.LastGoalVersionDep();
            }

        }

    }

}
