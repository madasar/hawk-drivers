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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.data.bpmn.activities.BpmnSubProcessData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneSetImpl;
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

@objid ("00754d60-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnLaneSet.class, factory=BpmnLaneSetData.Metadata.ObjectFactory.class)
public class BpmnLaneSetData extends BpmnBaseElementData {
    @objid ("b5126c40-9867-4d48-802b-eb098f3f6e76")
    @SmaMetaAssociation(metaName="Lane", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSmDependency.class, component = true)
     List<SmObjectImpl> mLane = null;

    @objid ("d4e4a492-1462-4e48-98d5-394a36ff88a6")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("23883440-5dbe-466c-b272-f49058a7ea87")
    @SmaMetaAssociation(metaName="ParentLane", typeDataClass=BpmnLaneData.class, min=0, max=1, smAssociationClass=Metadata.ParentLaneSmDependency.class)
     SmObjectImpl mParentLane;

    @objid ("6b8a8251-f1a1-44e9-82f8-518ca41dba73")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("02b8b6f1-8443-433f-9d1b-e814bb5b2c20")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002eed70-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e4803b4d-671d-4a8a-ac19-13420c9a4e81")
        private static SmClass smClass = null;

        @objid ("a56a5906-05f0-42e9-8b7c-a8ab2e123b99")
        private static SmDependency LaneDep = null;

        @objid ("9205a02b-0ace-4f53-b8c5-aaa9183ae816")
        private static SmDependency ProcessDep = null;

        @objid ("aa6689e3-d109-4dcc-8f16-b393c09d5c02")
        private static SmDependency ParentLaneDep = null;

        @objid ("b6246520-996b-4ad2-9e88-3ad1cb6cf7d8")
        private static SmDependency SubProcessDep = null;

        @objid ("f4a3fbd8-c3cb-46fc-99a1-e4ecd66939b4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLaneSetData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1e0e1b11-5c2f-471a-9ce3-7ff2fd3715dc")
        public static SmDependency LaneDep() {
            if (LaneDep == null) {
            	LaneDep = classof().getDependencyDef("Lane");
            }
            return LaneDep;
        }

        @objid ("e4414c31-fb73-4cd6-8bad-941474b73ce8")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("ace7f7ea-8c9b-4e11-a239-775ea0d52850")
        public static SmDependency ParentLaneDep() {
            if (ParentLaneDep == null) {
            	ParentLaneDep = classof().getDependencyDef("ParentLane");
            }
            return ParentLaneDep;
        }

        @objid ("cbc95a57-5716-48fd-b492-402a615fdbea")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("576cac70-e0f4-4623-ada8-79b7e9adfc0a")
        public static SmDependency getLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneDep;
        }

        @objid ("8005ce9b-dd56-4300-bab8-c55068fe0237")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("c2bbb19c-3c68-4a4c-9cdc-4e523ec7b71a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("15cec2cc-9388-412f-810b-f2b464b64b48")
        public static SmDependency getParentLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentLaneDep;
        }

        @objid ("5eb5335b-64c3-4286-900b-e7f4f81a71a8")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("002f4270-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1a24e7a7-b856-4c68-ae39-a033e52a5537")
            public ISmObjectData createData() {
                return new BpmnLaneSetData();
            }

            @objid ("44fd7c8d-6b1a-405c-8c83-2324ba85cc38")
            public SmObjectImpl createImpl() {
                return new BpmnLaneSetImpl();
            }

        }

        @objid ("002fbb24-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSmDependency extends SmMultipleDependency {
            @objid ("31f7d90a-c0ec-408f-bcbd-b18974ed4783")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLaneSetData)data).mLane != null)? ((BpmnLaneSetData)data).mLane:SmMultipleDependency.EMPTY;
            }

            @objid ("b27245a5-eea7-4909-9911-ac8777071f1d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLaneSetData) data).mLane = new ArrayList<>(initialCapacity);
                return ((BpmnLaneSetData) data).mLane;
            }

            @objid ("6dca7ec0-16a1-4418-a89a-8dc0ac5f4984")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.LaneSetDep();
            }

        }

        @objid ("00302f32-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("43c7462f-c75a-413b-88ad-8c427136bf5d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mProcess;
            }

            @objid ("ef6651e2-197c-4fac-9f5c-29704da9f8cb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mProcess = value;
            }

            @objid ("6b627525-6cce-4a33-a766-191f1515d329")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.LaneSetDep();
            }

        }

        @objid ("0030b09c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParentLaneSmDependency extends SmSingleDependency {
            @objid ("0bf66534-ec94-4977-bd15-272d1bfd8a21")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mParentLane;
            }

            @objid ("f3642c38-f484-4285-a07b-139ba899b632")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mParentLane = value;
            }

            @objid ("8930fba8-ab34-49e5-b2ce-88149c1c1a45")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.ChildLaneSetDep();
            }

        }

        @objid ("00313526-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("6f902b19-ad92-403f-852d-03184441aedb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mSubProcess;
            }

            @objid ("979e2091-37a6-4e9b-b04c-5b507837d340")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mSubProcess = value;
            }

            @objid ("f236c055-7845-4a49-af85-5cecb21f6022")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.LaneSetDep();
            }

        }

    }

}
