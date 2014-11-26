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
package org.modelio.metamodel.data.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneSetData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneImpl;
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

@objid ("0074d240-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnLane.class, factory=BpmnLaneData.Metadata.ObjectFactory.class)
public class BpmnLaneData extends BpmnBaseElementData {
    @objid ("89a8215f-cd04-4773-8b78-fe6ab61bea61")
    @SmaMetaAssociation(metaName="ChildLaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=1, smAssociationClass=Metadata.ChildLaneSetSmDependency.class, component = true)
     SmObjectImpl mChildLaneSet;

    @objid ("7e04f5f4-24f2-48b0-9576-e1f16557acbc")
    @SmaMetaAssociation(metaName="PartitionElement", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.PartitionElementSmDependency.class, partof = true)
     SmObjectImpl mPartitionElement;

    @objid ("36829ba5-dc24-4b9a-a5f6-c17f68175a1e")
    @SmaMetaAssociation(metaName="FlowElementRef", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementRefSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mFlowElementRef = null;

    @objid ("5a61e1f7-fc30-4aab-b4b4-cf1867137f8a")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=1, max=1, smAssociationClass=Metadata.LaneSetSmDependency.class)
     SmObjectImpl mLaneSet;

    @objid ("2f0a712e-0894-452e-a5dc-bf31fd48524b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004af650-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d53279bb-9d95-4dcd-9512-921c8e0d12a1")
        private static SmClass smClass = null;

        @objid ("1f19815a-81d2-47fa-b91c-2519eabb4767")
        private static SmDependency ChildLaneSetDep = null;

        @objid ("723412ec-69b1-4386-97c7-829fe2d93c9f")
        private static SmDependency PartitionElementDep = null;

        @objid ("d07d7add-8f44-40b1-9101-8ed6f22fe691")
        private static SmDependency FlowElementRefDep = null;

        @objid ("ef5f667e-016c-47fc-a666-c26b2ff63cfe")
        private static SmDependency LaneSetDep = null;

        @objid ("cf1d62eb-184d-4efe-86e5-9dd444459e87")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLaneData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e4d991dc-cd15-4b6c-8da1-7b8a739a5746")
        public static SmDependency ChildLaneSetDep() {
            if (ChildLaneSetDep == null) {
            	ChildLaneSetDep = classof().getDependencyDef("ChildLaneSet");
            }
            return ChildLaneSetDep;
        }

        @objid ("b3c4566e-4d38-4f52-a326-8944f4fb8f13")
        public static SmDependency PartitionElementDep() {
            if (PartitionElementDep == null) {
            	PartitionElementDep = classof().getDependencyDef("PartitionElement");
            }
            return PartitionElementDep;
        }

        @objid ("5ffca03f-c765-4f61-8916-03669a668fd6")
        public static SmDependency FlowElementRefDep() {
            if (FlowElementRefDep == null) {
            	FlowElementRefDep = classof().getDependencyDef("FlowElementRef");
            }
            return FlowElementRefDep;
        }

        @objid ("eed2b7d0-996a-43ac-82f2-7c6c43989c28")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("ba9a8675-ddb8-40c8-b96b-0275223ea566")
        public static SmDependency getFlowElementRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementRefDep;
        }

        @objid ("4f0c98f2-2af9-4a73-bb2d-be58bbad7ea7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e5ad1a68-1ffb-4f5e-8b93-3fd8478b5a18")
        public static SmDependency getPartitionElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PartitionElementDep;
        }

        @objid ("49bf8bdc-dd65-4e77-9b93-de286ea950fe")
        public static SmDependency getChildLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChildLaneSetDep;
        }

        @objid ("e1c22d4d-0512-4706-8e2e-1d8bb377671c")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("004b3688-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3285907e-dd17-428d-8251-49a57354d205")
            public ISmObjectData createData() {
                return new BpmnLaneData();
            }

            @objid ("f6ef34bb-6b2b-4429-87f6-4fa96f6ee39c")
            public SmObjectImpl createImpl() {
                return new BpmnLaneImpl();
            }

        }

        @objid ("004b97d6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ChildLaneSetSmDependency extends SmSingleDependency {
            @objid ("982a2f10-2b40-4fb6-9816-643bbc5b4ba6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mChildLaneSet;
            }

            @objid ("39a72484-12aa-49a5-8b06-e2c4864465dc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mChildLaneSet = value;
            }

            @objid ("823a1be2-4813-452c-a2f6-c59112f45248")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.ParentLaneDep();
            }

        }

        @objid ("004c0b30-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PartitionElementSmDependency extends SmSingleDependency {
            @objid ("c0407531-390b-4723-81c3-5de937198c84")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mPartitionElement;
            }

            @objid ("d1669e69-ef4d-4e3d-a2cb-7a7385431829")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mPartitionElement = value;
            }

            @objid ("74ae379f-2838-45b5-916f-b5207f329cb8")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.BpmnLaneRefsDep();
            }

        }

        @objid ("004c7f0c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FlowElementRefSmDependency extends SmMultipleDependency {
            @objid ("4d77b019-e807-41b2-bea4-49f9c59fecc0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLaneData)data).mFlowElementRef != null)? ((BpmnLaneData)data).mFlowElementRef:SmMultipleDependency.EMPTY;
            }

            @objid ("111d9fb1-37b6-4ba0-9dfa-8bdf1ca96094")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLaneData) data).mFlowElementRef = new ArrayList<>(initialCapacity);
                return ((BpmnLaneData) data).mFlowElementRef;
            }

            @objid ("59d235f2-8660-435e-bb1d-8351ca83fa86")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.LaneDep();
            }

        }

        @objid ("004cf220-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmSingleDependency {
            @objid ("04ac59eb-50e2-4c50-855e-b37052c7615e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mLaneSet;
            }

            @objid ("06e5274f-b30b-4dee-9305-42216a89e0f8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mLaneSet = value;
            }

            @objid ("3065f0b3-50b3-4ba2-961a-dbece1a7264c")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.LaneDep();
            }

        }

    }

}
