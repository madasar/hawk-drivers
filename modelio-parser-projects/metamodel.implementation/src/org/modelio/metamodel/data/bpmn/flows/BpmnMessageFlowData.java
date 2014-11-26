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
package org.modelio.metamodel.data.bpmn.flows;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnCollaborationData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageFlowImpl;
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

@objid ("007cb096-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnMessageFlow.class, factory=BpmnMessageFlowData.Metadata.ObjectFactory.class)
public class BpmnMessageFlowData extends BpmnBaseElementData {
    @objid ("caee3aba-5d1f-404b-ab36-94e8233bf074")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("3342d611-736c-4d59-8abd-de5878af0e40")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("5003057d-5888-424d-8f6e-217465265d53")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("0ffcb417-e078-470c-bc6e-ce09d4135a37")
    @SmaMetaAssociation(metaName="Collaboration", typeDataClass=BpmnCollaborationData.class, min=1, max=1, smAssociationClass=Metadata.CollaborationSmDependency.class)
     SmObjectImpl mCollaboration;

    @objid ("f816db24-d3d0-46c8-99fa-40f5ca1a51d2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0006b17a-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3fccc260-f4cf-4e40-8bdd-256f2a599517")
        private static SmClass smClass = null;

        @objid ("ec7d4906-b814-4151-a249-f0b500f52f40")
        private static SmDependency MessageRefDep = null;

        @objid ("17f12743-2eec-44d1-b66b-e404bfd0db4f")
        private static SmDependency SourceRefDep = null;

        @objid ("4cd92149-e4ff-4b8d-a831-471f9da65a62")
        private static SmDependency TargetRefDep = null;

        @objid ("0d357153-99e3-491a-aba1-b946b1abfe6c")
        private static SmDependency CollaborationDep = null;

        @objid ("76d3ec07-2c92-4a60-897a-356a127dfc1c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f4a7642b-a9c1-4f63-88c5-d426721022a0")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("22182f1d-4534-4aff-974c-41408ec96575")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("cf3b5736-5e18-4560-9aa3-c6ea4c3fa4a6")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("abe85a0b-3bd1-46e5-9c2f-a99c5862e7bd")
        public static SmDependency CollaborationDep() {
            if (CollaborationDep == null) {
            	CollaborationDep = classof().getDependencyDef("Collaboration");
            }
            return CollaborationDep;
        }

        @objid ("926700ef-8bc7-4044-a453-fc9ba9a0334f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("46ffa012-1923-4f2a-83e9-ae059fc4fcd0")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("19e060f6-7208-4057-b0e3-e4719d08dc95")
        public static SmDependency getCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CollaborationDep;
        }

        @objid ("9ee265e5-1476-461e-b529-808940f5ee06")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("a3e0ae6d-f69d-4f53-8d14-4c35066d0641")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("0006f27a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5ce2cd34-6909-4ffc-b97b-31b22d37d2b7")
            public ISmObjectData createData() {
                return new BpmnMessageFlowData();
            }

            @objid ("39eb9eba-5748-4bb0-ba0e-87365d5df225")
            public SmObjectImpl createImpl() {
                return new BpmnMessageFlowImpl();
            }

        }

        @objid ("000754e0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("26a43996-3667-4884-9b6a-640f99c295c2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mMessageRef;
            }

            @objid ("c18f9721-ccc8-4c5d-bdc2-98d8651aebcd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mMessageRef = value;
            }

            @objid ("77af50fa-e908-431b-a737-01ec4321c562")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.MessageFlowDep();
            }

        }

        @objid ("0007c902-c4c6-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("ec22d9bf-79f1-441b-b4e2-0c154daa386c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mSourceRef;
            }

            @objid ("0b5ea8d9-3b9a-42f9-8b8d-546814e524c5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mSourceRef = value;
            }

            @objid ("3426c612-ec81-4778-972b-9082c38ce3de")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.OutgoingFlowDep();
            }

        }

        @objid ("00083d24-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("1a560fdf-b4f9-470e-b1b4-5716dafae3d0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mTargetRef;
            }

            @objid ("36334f23-a5df-4ecf-a171-f8296f65fb49")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mTargetRef = value;
            }

            @objid ("6adb1331-f5ad-4c7d-a248-5ffbdd408622")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.IncomingFlowDep();
            }

        }

        @objid ("0008b1aa-c4c6-1fd8-97fe-001ec947cd2a")
        public static class CollaborationSmDependency extends SmSingleDependency {
            @objid ("6641f2a1-99ce-4dad-acb5-8f296631da0f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mCollaboration;
            }

            @objid ("2a5ba597-a137-420a-a867-f9caadb4a56f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mCollaboration = value;
            }

            @objid ("b1a39687-77b0-479e-88db-1890e07fbf37")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.MessageFlowDep();
            }

        }

    }

}
