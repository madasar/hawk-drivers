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
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.GoalData;
import org.modelio.metamodel.impl.analyst.GoalContainerImpl;
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

@objid ("16f29540-3b49-4c2f-851d-a2d366fbab74")
@SmaMetaClass(mmClass=GoalContainer.class, factory=GoalContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class GoalContainerData extends AnalystContainerData {
    @objid ("1a342e85-dd1a-4786-8c3e-290f8610dda6")
    @SmaMetaAssociation(metaName="OwnedGoal", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedGoalSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedGoal = null;

    @objid ("1c4555c0-46e5-4e02-8499-ca0af106e210")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GoalContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("7208e59e-dd8b-49b0-9772-721d405417e5")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=GoalContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("894a3f2a-ff9e-4693-a109-9d3025d680ce")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("3445277a-b54d-41eb-8afe-e7c2ad756c1a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("b726a173-e683-4024-82f5-fb9cf9ec2787")
    public static class Metadata {
        @objid ("30734eca-b275-473d-9c04-d1f37ece1f0c")
        private static SmClass smClass = null;

        @objid ("aa961367-49fa-4491-90ac-043fa70c0a4f")
        private static SmDependency OwnedGoalDep = null;

        @objid ("4f7ff352-39f7-451a-9fae-a61d1fdc0fcc")
        private static SmDependency OwnerContainerDep = null;

        @objid ("0b684ee9-15a7-4c40-bc8e-83911f2f7595")
        private static SmDependency OwnedContainerDep = null;

        @objid ("06e6d008-0ce6-448b-b0f0-6a13da9c6e9a")
        private static SmDependency OwnerProjectDep = null;

        @objid ("29bc09a3-4e63-4353-9574-1780620b51cf")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GoalContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2954ccf6-eb73-4109-9a53-29aa0acdbf44")
        public static SmDependency OwnedGoalDep() {
            if (OwnedGoalDep == null) {
            	OwnedGoalDep = classof().getDependencyDef("OwnedGoal");
            }
            return OwnedGoalDep;
        }

        @objid ("007626be-9147-4a15-86a6-9b49ac0bb20e")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("bedfb5d1-006b-4283-94d8-dc3fb3b53247")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("f34260c4-0737-4218-b6c9-514737cd2751")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("f6925e2a-e5c7-48a9-aae6-76011cfb0bdc")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("62b6fd2c-d75b-4234-894d-d6972fe89281")
        public static SmDependency getOwnedGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedGoalDep;
        }

        @objid ("ccc88c86-4595-40b1-a21f-b5e828366bad")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c925383e-d024-49b0-b7fb-01f7f2ea8321")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("2c47f343-b3e2-4289-ba90-1d87c194012e")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("82c1966e-dd5d-46c7-8a86-b49b89d360c6")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8b7df7b8-8d5e-4dfe-989c-e3dff4d43956")
            public ISmObjectData createData() {
                return new GoalContainerData();
            }

            @objid ("802f0159-f14d-48b1-b29e-c2040b868538")
            public SmObjectImpl createImpl() {
                return new GoalContainerImpl();
            }

        }

        @objid ("0d4cd347-046e-4635-bc3c-50fce1f4e17d")
        public static class OwnedGoalSmDependency extends SmMultipleDependency {
            @objid ("849c2b2b-7442-4d56-9035-535ebc6bd9fa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalContainerData)data).mOwnedGoal != null)? ((GoalContainerData)data).mOwnedGoal:SmMultipleDependency.EMPTY;
            }

            @objid ("7e29f4c1-bc79-4e5c-bd10-2a2032f8f9fa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalContainerData) data).mOwnedGoal = new ArrayList<>(initialCapacity);
                return ((GoalContainerData) data).mOwnedGoal;
            }

            @objid ("1a94bbce-d6b7-410d-ba45-e69042e8dc1d")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("932a9100-f806-4031-a72a-cb0c9e2c06bd")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("8db94350-8070-48dc-ad6a-a1096de1d3d0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalContainerData) data).mOwnerContainer;
            }

            @objid ("af4fdfcb-4ee4-4f8c-a350-00a98c72b62e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalContainerData) data).mOwnerContainer = value;
            }

            @objid ("7591288d-0d8d-4a33-a67c-101e1202d7cb")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("c9f9aee3-5b94-40c4-bbf8-b89e6cb27e14")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("d4c15914-0c43-4c84-8ceb-7fb3c2142e59")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalContainerData)data).mOwnedContainer != null)? ((GoalContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("22ae2b2f-17c1-4c34-871c-790ef959ce20")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((GoalContainerData) data).mOwnedContainer;
            }

            @objid ("b0da062b-6837-4d0e-a8ee-c8b25030bed4")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("e868d39d-9d8b-427a-8309-1b428f86fc4f")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("a3971e03-9cd2-40c2-b6d9-1dd14985cde2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalContainerData) data).mOwnerProject;
            }

            @objid ("c358b8a1-79b0-49a1-bc1e-6d38bd6a6a59")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalContainerData) data).mOwnerProject = value;
            }

            @objid ("e4862fd7-52d4-4ded-af1e-c0b85aac548b")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.GoalRootDep();
            }

        }

    }

}
