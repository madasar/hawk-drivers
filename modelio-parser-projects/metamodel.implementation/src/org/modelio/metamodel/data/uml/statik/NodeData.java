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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ArtifactData;
import org.modelio.metamodel.impl.uml.statik.NodeImpl;
import org.modelio.metamodel.uml.statik.Node;
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

@objid ("0013d4f4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Node.class, factory=NodeData.Metadata.ObjectFactory.class, cmsnode=true)
public class NodeData extends ClassifierData {
    @objid ("683f0ddc-2a26-441b-9ea6-14076acf7755")
    @SmaMetaAssociation(metaName="Resident", typeDataClass=ArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ResidentSmDependency.class, partof = true)
     List<SmObjectImpl> mResident = null;

    @objid ("bbb0e43b-24dd-4dea-b4cf-26aec0c746a3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0087b2c0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("297f92a6-74fd-4a06-ae24-86e56fb415c3")
        private static SmClass smClass = null;

        @objid ("2f55cda6-ee86-4292-bfa0-3216090545fe")
        private static SmDependency ResidentDep = null;

        @objid ("f0910921-8b76-45ab-ae2c-d1c76c036263")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0236c8e9-986a-478d-a69f-bbd0b6f6d306")
        public static SmDependency ResidentDep() {
            if (ResidentDep == null) {
            	ResidentDep = classof().getDependencyDef("Resident");
            }
            return ResidentDep;
        }

        @objid ("3df9ecb8-8afd-49c1-8c4f-3f991fa60bc6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1f0122cd-103e-44da-9509-1620cbc60225")
        public static SmDependency getResidentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResidentDep;
        }

        @objid ("0087f492-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79091c46-0b3b-47a9-b5bb-8db50e5a00ba")
            public ISmObjectData createData() {
                return new NodeData();
            }

            @objid ("daeb7c81-b5e1-4e4e-afeb-cf7f01589137")
            public SmObjectImpl createImpl() {
                return new NodeImpl();
            }

        }

        @objid ("00885766-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResidentSmDependency extends SmMultipleDependency {
            @objid ("1c393eae-8584-45fe-8898-495456458559")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NodeData)data).mResident != null)? ((NodeData)data).mResident:SmMultipleDependency.EMPTY;
            }

            @objid ("9166ce38-ad60-4427-b41b-9806a5e6752d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NodeData) data).mResident = new ArrayList<>(initialCapacity);
                return ((NodeData) data).mResident;
            }

            @objid ("ffb61f2b-81e7-4b2f-ad47-a8752a074bec")
            @Override
            public SmDependency getSymetric() {
                return ArtifactData.Metadata.DeploymentLocationDep();
            }

        }

    }

}
