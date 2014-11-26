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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.data.bpmn.activities.BpmnSubProcessData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnGroupData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementImpl;
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

@objid ("007984ac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnFlowElement.class, factory=BpmnFlowElementData.Metadata.ObjectFactory.class)
public abstract class BpmnFlowElementData extends BpmnBaseElementData {
    @objid ("dc7d78a1-44f5-4cc3-8446-215c256626f2")
    @SmaMetaAssociation(metaName="Groups", typeDataClass=BpmnGroupData.class, min=0, max=-1, smAssociationClass=Metadata.GroupsSmDependency.class)
     List<SmObjectImpl> mGroups = null;

    @objid ("5520f4f0-cee7-4422-9388-4c5e327bbbd1")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("03ba4966-88b1-4a75-811b-d485f1fa1774")
    @SmaMetaAssociation(metaName="Lane", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSmDependency.class)
     List<SmObjectImpl> mLane = null;

    @objid ("967d6a30-35d8-4cb8-95c9-14511d64306d")
    @SmaMetaAssociation(metaName="Container", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ContainerSmDependency.class)
     SmObjectImpl mContainer;

    @objid ("fca97b9e-6f53-443c-b080-aae3b5a1fd60")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001878c4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("86f04859-4c47-4ecc-a09b-79b9cce7541b")
        private static SmClass smClass = null;

        @objid ("ed41563d-989c-4e5d-ad6a-b4befd417472")
        private static SmDependency GroupsDep = null;

        @objid ("d4cb3653-fc1f-4da4-a4de-d7767a9439c7")
        private static SmDependency SubProcessDep = null;

        @objid ("9ce9e52c-7160-4864-9704-25bb86cccbb0")
        private static SmDependency LaneDep = null;

        @objid ("58e858b5-95e2-4610-ad2f-097b83ddb957")
        private static SmDependency ContainerDep = null;

        @objid ("8c30f5c2-604d-481e-8840-a555aec52483")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnFlowElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d00c8403-5f96-4b69-8737-7a60060ed4ec")
        public static SmDependency GroupsDep() {
            if (GroupsDep == null) {
            	GroupsDep = classof().getDependencyDef("Groups");
            }
            return GroupsDep;
        }

        @objid ("ee3f6e1a-6110-419a-8005-39b1e6f9781d")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("190be7a4-995e-48b2-a9f3-e02abc4c74a4")
        public static SmDependency LaneDep() {
            if (LaneDep == null) {
            	LaneDep = classof().getDependencyDef("Lane");
            }
            return LaneDep;
        }

        @objid ("1c8cb76b-74bf-40dd-baa6-ac44f1a7a126")
        public static SmDependency ContainerDep() {
            if (ContainerDep == null) {
            	ContainerDep = classof().getDependencyDef("Container");
            }
            return ContainerDep;
        }

        @objid ("3e0d886b-2039-4ed9-bd0b-226c51649b39")
        public static SmDependency getGroupsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GroupsDep;
        }

        @objid ("3370051b-2edb-49ce-a3b6-c8fa7fff8eea")
        public static SmDependency getContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainerDep;
        }

        @objid ("d2f6fc77-291a-448e-ad89-639365fd24df")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d8fd5c9b-f605-449d-ad8f-942a9a660cf6")
        public static SmDependency getLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneDep;
        }

        @objid ("18e6a9bb-eaad-4fd6-a4a3-0a5d6de43d33")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("0018c004-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("300fde6d-7661-4a89-8dd6-76f636ff00bf")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("92ddecbb-e5b1-4988-bd4a-73bea78dc052")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00192396-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GroupsSmDependency extends SmMultipleDependency {
            @objid ("2035a961-01a3-4bbd-921d-c2490465a138")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowElementData)data).mGroups != null)? ((BpmnFlowElementData)data).mGroups:SmMultipleDependency.EMPTY;
            }

            @objid ("d0d02ea8-9ff3-46e7-a549-55e160bf537f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowElementData) data).mGroups = new ArrayList<>(initialCapacity);
                return ((BpmnFlowElementData) data).mGroups;
            }

            @objid ("57600be1-6c17-4fde-bfab-757f329cbd8c")
            @Override
            public SmDependency getSymetric() {
                return BpmnGroupData.Metadata.CategorizedDep();
            }

        }

        @objid ("001984c6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("3402a9e0-ba15-4261-8845-ad45d93312d7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnFlowElementData) data).mSubProcess;
            }

            @objid ("7751626b-9dfa-43b2-b8a4-608f071b5ffa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnFlowElementData) data).mSubProcess = value;
            }

            @objid ("a93106fa-ecef-4d0b-b293-132fbc69739a")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.FlowElementDep();
            }

        }

        @objid ("0019ff96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LaneSmDependency extends SmMultipleDependency {
            @objid ("2ba1d330-0bbc-41ca-a28f-7adc81db0154")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowElementData)data).mLane != null)? ((BpmnFlowElementData)data).mLane:SmMultipleDependency.EMPTY;
            }

            @objid ("946fe56c-6392-44e1-ab6d-706cb2719bf7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowElementData) data).mLane = new ArrayList<>(initialCapacity);
                return ((BpmnFlowElementData) data).mLane;
            }

            @objid ("476a49f2-0aef-4262-87ef-a6ca4245fcd7")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.FlowElementRefDep();
            }

        }

        @objid ("001a6238-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ContainerSmDependency extends SmSingleDependency {
            @objid ("cc997367-249a-459c-b356-61a9ec962c45")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnFlowElementData) data).mContainer;
            }

            @objid ("1a9f82ca-b159-4177-bcac-c32a4b8eef8f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnFlowElementData) data).mContainer = value;
            }

            @objid ("cd9fced8-cf2a-443b-a359-f5841e14da04")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.FlowElementDep();
            }

        }

    }

}
