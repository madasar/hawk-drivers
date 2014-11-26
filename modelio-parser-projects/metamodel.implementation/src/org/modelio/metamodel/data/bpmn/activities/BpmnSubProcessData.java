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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneSetData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnArtifactData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSubProcessImpl;
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

@objid ("008489ba-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnSubProcess.class, factory=BpmnSubProcessData.Metadata.ObjectFactory.class)
public class BpmnSubProcessData extends BpmnActivityData {
    @objid ("658ff37b-4b24-48a0-aacb-30b6e24fd18c")
    @SmaMetaAttribute(metaName="TriggeredByEvent", type=Boolean.class, smAttributeClass=Metadata.TriggeredByEventSmAttribute.class)
     Object mTriggeredByEvent = false;

    @objid ("adef4b33-e09d-459c-9978-612ae822e226")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("d3c08219-8994-4871-94f0-c71e47adc270")
    @SmaMetaAssociation(metaName="FlowElement", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementSmDependency.class, component = true)
     List<SmObjectImpl> mFlowElement = null;

    @objid ("06252271-7f37-4402-8342-1e8a42ac214a")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSetSmDependency.class, component = true)
     List<SmObjectImpl> mLaneSet = null;

    @objid ("9a69215d-15d2-49cc-ac5b-7b4a7a7a12e4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005454b6-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c3bd02b0-4f67-48c2-a29d-b380aa13a3fe")
        private static SmClass smClass = null;

        @objid ("71220e9b-d85e-4705-be20-10b21e8fe184")
        private static SmAttribute TriggeredByEventAtt = null;

        @objid ("6f826bd3-40c6-4244-8f0a-bd477ec9b0a7")
        private static SmDependency ArtifactDep = null;

        @objid ("4f3f38a7-e041-4f85-bdb8-1f83ef936070")
        private static SmDependency FlowElementDep = null;

        @objid ("48189ab8-8248-4fee-96f5-f01cae17f667")
        private static SmDependency LaneSetDep = null;

        @objid ("91955f6d-2e7a-4810-8c42-4f13dc4e6823")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSubProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("517e6be0-7f46-4456-89e9-8be83b74314c")
        public static SmAttribute TriggeredByEventAtt() {
            if (TriggeredByEventAtt == null) {
            	TriggeredByEventAtt = classof().getAttributeDef("TriggeredByEvent");
            }
            return TriggeredByEventAtt;
        }

        @objid ("c4f4e042-221f-40f2-bcab-2e5f06d69e5e")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("f3bbea6b-062b-4a01-bbe4-fc792fe78957")
        public static SmDependency FlowElementDep() {
            if (FlowElementDep == null) {
            	FlowElementDep = classof().getDependencyDef("FlowElement");
            }
            return FlowElementDep;
        }

        @objid ("fd8f29e6-c387-4a4c-9151-6c661aac6732")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("07d0c617-a1e8-4a6e-9072-30ce68daf120")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0b759150-5fd1-425f-851f-c480ede870cd")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("82888651-892c-424b-992d-8d0e206662d2")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("36673b2a-0c8b-4a4e-b6ad-baa789e9033b")
        public static SmAttribute getTriggeredByEventAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggeredByEventAtt;
        }

        @objid ("0fd0f949-862c-4a34-931e-2aa2b5946d31")
        public static SmDependency getFlowElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementDep;
        }

        @objid ("005496e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("74455c85-c8ed-4502-91f8-a6cfbae0e31c")
            public ISmObjectData createData() {
                return new BpmnSubProcessData();
            }

            @objid ("c2454668-d29c-4261-8565-1dca9cebbaaf")
            public SmObjectImpl createImpl() {
                return new BpmnSubProcessImpl();
            }

        }

        @objid ("0054f862-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TriggeredByEventSmAttribute extends SmAttribute {
            @objid ("7ce576b9-4657-4848-aa86-421ca138cb8a")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSubProcessData) data).mTriggeredByEvent;
            }

            @objid ("ff0960e4-24c0-4d62-b5e3-829bcbf18987")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSubProcessData) data).mTriggeredByEvent = value;
            }

        }

        @objid ("00555ab4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class FlowElementSmDependency extends SmMultipleDependency {
            @objid ("15fd98d0-3be6-4832-adaa-ef5ed2ff45ab")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mFlowElement != null)? ((BpmnSubProcessData)data).mFlowElement:SmMultipleDependency.EMPTY;
            }

            @objid ("61c6caa5-d63f-4f67-8036-6b4cc99a4d8a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mFlowElement = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mFlowElement;
            }

            @objid ("54e97309-43f8-4960-9167-ec6399ed2285")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.SubProcessDep();
            }

        }

        @objid ("0055c292-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("daf2d904-531e-47fb-89f4-c52174627569")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mArtifact != null)? ((BpmnSubProcessData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("8070d984-59d0-49c2-8937-b96ac2ac234a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mArtifact;
            }

            @objid ("6ee2e0dc-7a2e-4dae-b6bd-abb0faa3ac98")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.SubProcessDep();
            }

        }

        @objid ("00562660-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmMultipleDependency {
            @objid ("f4998d5c-ec07-49c2-b434-900a24433684")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mLaneSet != null)? ((BpmnSubProcessData)data).mLaneSet:SmMultipleDependency.EMPTY;
            }

            @objid ("bcb33669-4f70-4867-a308-1a027e241784")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mLaneSet = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mLaneSet;
            }

            @objid ("a2fb1ddb-cad8-41bf-a831-b3b3f567ff12")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.SubProcessDep();
            }

        }

    }

}
