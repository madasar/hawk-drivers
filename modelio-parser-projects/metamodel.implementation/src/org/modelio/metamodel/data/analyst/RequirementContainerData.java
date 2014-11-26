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
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.RequirementData;
import org.modelio.metamodel.impl.analyst.RequirementContainerImpl;
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

@objid ("3ae27d60-636c-4129-aaed-34265d379087")
@SmaMetaClass(mmClass=RequirementContainer.class, factory=RequirementContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class RequirementContainerData extends AnalystContainerData {
    @objid ("6b33ee7c-dae6-4948-8816-3fb73a108edc")
    @SmaMetaAssociation(metaName="OwnedRequirement", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRequirementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRequirement = null;

    @objid ("a2263516-c630-4a16-b33c-aebfe79f80b7")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=RequirementContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("44110b2c-5beb-4e50-acb8-3484f2cdbfbf")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=RequirementContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("6a8c577d-913e-4279-91ac-a7395303f1be")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("317fecb5-7c0c-4a05-80b3-a546826edb56")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("528dce26-56e4-47cd-93e2-650a832a447b")
    public static class Metadata {
        @objid ("e4c6052e-2b52-4ce5-9225-048a7634269e")
        private static SmClass smClass = null;

        @objid ("f3625afa-7e53-481d-8644-abf482d2201b")
        private static SmDependency OwnedRequirementDep = null;

        @objid ("d8b65f63-52d2-48dd-8d25-40a8e04c492a")
        private static SmDependency OwnerContainerDep = null;

        @objid ("a7a13646-6783-4e93-bf4f-64424a6e5f25")
        private static SmDependency OwnedContainerDep = null;

        @objid ("21cca018-8779-4722-a342-865b4142f1f5")
        private static SmDependency OwnerProjectDep = null;

        @objid ("7aa65353-392a-4228-aa24-98602a80ac4c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequirementContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("00e314d6-e09f-487d-b8c8-8d08ac0cc044")
        public static SmDependency OwnedRequirementDep() {
            if (OwnedRequirementDep == null) {
            	OwnedRequirementDep = classof().getDependencyDef("OwnedRequirement");
            }
            return OwnedRequirementDep;
        }

        @objid ("432bb82f-9aa0-46cc-9191-7943156ea260")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("f809b5f1-12c8-412d-8450-a0604f0160e2")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("a7f43d3d-2bbe-4420-900c-6730ed2397ff")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("3aa03df5-0cc3-4a24-9ca7-8c6f86f5f7ea")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("e772aa49-3869-41a5-9a9a-c60fdb10ba3b")
        public static SmDependency getOwnedRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRequirementDep;
        }

        @objid ("789e3626-e9eb-4055-809a-fb33331ff44a")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("d6a1efe2-0084-4d31-b4cf-108bec6b1b2d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9eb95ecd-70b1-423a-841f-8f200f75a53c")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("07ce1ca0-a488-42bb-a7cf-4eeb4f1ff33e")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c74e3db7-f94c-4fd6-ada7-db5147b7d99f")
            public ISmObjectData createData() {
                return new RequirementContainerData();
            }

            @objid ("6db07b4c-6fdc-46ad-a742-8d9b4dfa4924")
            public SmObjectImpl createImpl() {
                return new RequirementContainerImpl();
            }

        }

        @objid ("f1c82696-4fcd-4b1b-b5c0-d18f2f74a598")
        public static class OwnedRequirementSmDependency extends SmMultipleDependency {
            @objid ("d1879a45-7e5d-476e-a447-f50e30bcc2e1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementContainerData)data).mOwnedRequirement != null)? ((RequirementContainerData)data).mOwnedRequirement:SmMultipleDependency.EMPTY;
            }

            @objid ("314c5605-6876-433d-b4c0-bc34da769c29")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementContainerData) data).mOwnedRequirement = new ArrayList<>(initialCapacity);
                return ((RequirementContainerData) data).mOwnedRequirement;
            }

            @objid ("8af945f3-3a23-424e-9768-11b785453864")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("c5897d15-00b0-4e45-bb22-aebcb970058a")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("adc8ebfa-4f21-4aae-972f-def1079f5278")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementContainerData) data).mOwnerContainer;
            }

            @objid ("dc1a4f06-5c34-4c93-b183-876657782791")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementContainerData) data).mOwnerContainer = value;
            }

            @objid ("4152b208-a811-463a-8170-badea1e8f815")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("330d97fb-2196-4371-91a5-ab6af7e69c7a")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("cfa4642c-9abf-4cab-b154-ad5220748a7d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementContainerData)data).mOwnedContainer != null)? ((RequirementContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("392b297b-1d59-484b-b17e-82504d26cb02")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((RequirementContainerData) data).mOwnedContainer;
            }

            @objid ("2ac64380-cbf1-47ba-8bc4-61b48f29c26e")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("42ad14b7-d56e-4447-9f4e-e75140745b73")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("4d91b6e5-5d26-4684-bd69-e73474d54ea7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementContainerData) data).mOwnerProject;
            }

            @objid ("75fc9c23-d1e6-4b84-86af-ad7e426dbe4d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementContainerData) data).mOwnerProject = value;
            }

            @objid ("d227f0f6-8002-4605-be05-199c94c5189a")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.RequirementRootDep();
            }

        }

    }

}
