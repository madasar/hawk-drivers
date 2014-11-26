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
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeImpl;
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

@objid ("007a05d0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnFlowNode.class, factory=BpmnFlowNodeData.Metadata.ObjectFactory.class)
public abstract class BpmnFlowNodeData extends BpmnFlowElementData {
    @objid ("58307873-74a5-4110-af87-a62cdb989a0f")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=BpmnSequenceFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("e3ea3926-20f4-4d9d-9ada-b74af256d2c4")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceSmDependency.class, component = true)
     List<SmObjectImpl> mResource = null;

    @objid ("ef27e2c1-36a4-4dd4-a38f-0038d6ee6c79")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=BpmnSequenceFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("8d128744-7ff2-4fe2-826a-0df7af4e5ac4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0067c136-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("65d20975-9624-4f07-add5-0ea16cd396a8")
        private static SmClass smClass = null;

        @objid ("ccec9f05-69b1-4788-8c87-bd117a7571a6")
        private static SmDependency OutgoingDep = null;

        @objid ("2fdacbc7-1d7a-4133-b121-54fd0fb7d9a6")
        private static SmDependency ResourceDep = null;

        @objid ("c73d4e12-5dd3-4c66-9f36-55aae7ce2382")
        private static SmDependency IncomingDep = null;

        @objid ("37ca650c-2cbc-4437-a7c0-033268ffe86f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnFlowNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0a4fa657-58f9-49b5-9b5f-dc73846318a2")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("11c02558-9995-496f-93f1-493982c9a56f")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("ad14020c-abec-4ae3-8e26-20560a69875d")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("71fef785-7afd-4d13-a863-d219bd050250")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("1d29dbb2-bcb5-4f00-a783-b702d55b9bac")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e660e5bc-38f9-4e43-842f-4fa3b0f519f6")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("d8e9b75c-24ac-4c01-ac08-2488ee2c225e")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("00680240-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f348180b-4cfd-478d-a053-c909717f7334")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("7dccbeb4-4114-49dd-88f4-616f4fc17af3")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00686546-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmMultipleDependency {
            @objid ("ebc57531-4825-4877-a2c4-776d147fd7fb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mResource != null)? ((BpmnFlowNodeData)data).mResource:SmMultipleDependency.EMPTY;
            }

            @objid ("ada1a1f2-6eb3-44df-97d3-2bbefc46b1ca")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mResource = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mResource;
            }

            @objid ("f8c014a3-0e0a-402c-925b-e7dd71b5b4e1")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.AnnotatedDep();
            }

        }

        @objid ("0068c810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("790014e8-ebcb-4e78-b1f1-198993125192")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mOutgoing != null)? ((BpmnFlowNodeData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("6b95a40a-e26c-4bdc-9bd2-8662d5631ff9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mOutgoing;
            }

            @objid ("7e595acb-6a94-465f-9077-f3fe25dbe0b1")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.SourceRefDep();
            }

        }

        @objid ("00692ba2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("ad0a5468-237b-4b1c-bedd-61feb78cd751")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mIncoming != null)? ((BpmnFlowNodeData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("ee6e1b46-e7ec-41e5-960e-6ea2e34e6d1a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mIncoming;
            }

            @objid ("d795bd12-2349-4475-be69-4e74df79a1ba")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.TargetRefDep();
            }

        }

    }

}
