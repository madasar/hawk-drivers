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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnSequenceFlowDataAssociationImpl;
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

@objid ("00057d32-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnSequenceFlowDataAssociation.class, factory=BpmnSequenceFlowDataAssociationData.Metadata.ObjectFactory.class)
public class BpmnSequenceFlowDataAssociationData extends BpmnBaseElementData {
    @objid ("032f20c7-bae6-4d4b-a560-7d9694c3a9e4")
    @SmaMetaAssociation(metaName="Connected", typeDataClass=BpmnSequenceFlowData.class, min=1, max=1, smAssociationClass=Metadata.ConnectedSmDependency.class, partof = true)
     SmObjectImpl mConnected;

    @objid ("6b7b6de2-f54c-4ab4-a714-82792aef9442")
    @SmaMetaAssociation(metaName="DataAssociation", typeDataClass=BpmnDataAssociationData.class, min=2, max=2, smAssociationClass=Metadata.DataAssociationSmDependency.class, partof = true)
     List<SmObjectImpl> mDataAssociation = null;

    @objid ("13fc2b20-4817-446e-bd23-4815d704f4be")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00478df8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2cae9efd-75fe-4939-83e7-20950bd2d5db")
        private static SmClass smClass = null;

        @objid ("fedef83c-eed2-4fbe-b15f-862f3209170d")
        private static SmDependency ConnectedDep = null;

        @objid ("2678cbbd-68dc-4d5c-aaef-68b7a3b7972a")
        private static SmDependency DataAssociationDep = null;

        @objid ("82e4376e-9c2c-4e79-9c50-3cb2cb33a0c7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSequenceFlowDataAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("34e983a6-395f-4429-a650-e5df1e3f931a")
        public static SmDependency ConnectedDep() {
            if (ConnectedDep == null) {
            	ConnectedDep = classof().getDependencyDef("Connected");
            }
            return ConnectedDep;
        }

        @objid ("5bbe6894-9bda-4020-bddb-5f63fcad3a20")
        public static SmDependency DataAssociationDep() {
            if (DataAssociationDep == null) {
            	DataAssociationDep = classof().getDependencyDef("DataAssociation");
            }
            return DataAssociationDep;
        }

        @objid ("4e2d7036-ac29-4986-9516-536682488074")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c4a5f47f-e8d4-4c91-a9ee-1c814c4ae2a2")
        public static SmDependency getDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataAssociationDep;
        }

        @objid ("4aa0b1dd-0890-478a-8e90-e5783ac7a727")
        public static SmDependency getConnectedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectedDep;
        }

        @objid ("0047ced0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fd667599-b03d-4bd8-91b8-acb7af24389d")
            public ISmObjectData createData() {
                return new BpmnSequenceFlowDataAssociationData();
            }

            @objid ("eb8f3de8-4c90-47f0-b0ee-0ece69b5cba2")
            public SmObjectImpl createImpl() {
                return new BpmnSequenceFlowDataAssociationImpl();
            }

        }

        @objid ("004830f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DataAssociationSmDependency extends SmMultipleDependency {
            @objid ("e2e4e3a3-4276-43a2-a985-1c226ff33a44")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSequenceFlowDataAssociationData)data).mDataAssociation != null)? ((BpmnSequenceFlowDataAssociationData)data).mDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("b256ec7b-e47e-401a-a18b-7e9cefe830b5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSequenceFlowDataAssociationData) data).mDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnSequenceFlowDataAssociationData) data).mDataAssociation;
            }

            @objid ("c7ef8603-d8fe-4c29-9302-26ad28c022b7")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.VisualShortCutDep();
            }

        }

        @objid ("00489356-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConnectedSmDependency extends SmSingleDependency {
            @objid ("c53c2771-585d-4959-a96e-79ba2cf98b4d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowDataAssociationData) data).mConnected;
            }

            @objid ("37322afa-ae15-4c2a-83e9-a9d9e623bc78")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowDataAssociationData) data).mConnected = value;
            }

            @objid ("bc4ef3f4-f120-47a3-b264-88f8053d44a3")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.ConnectorDep();
            }

        }

    }

}
