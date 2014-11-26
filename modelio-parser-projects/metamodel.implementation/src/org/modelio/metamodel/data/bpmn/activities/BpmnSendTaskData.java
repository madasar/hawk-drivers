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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSendTaskImpl;
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

@objid ("0082e34e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnSendTask.class, factory=BpmnSendTaskData.Metadata.ObjectFactory.class)
public class BpmnSendTaskData extends BpmnTaskData {
    @objid ("b92c269c-2f6d-44f8-ae58-f11e1cc2c20b")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("9de0dcb4-f560-48f2-8400-62e1b3925216")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("742af94f-c05d-4320-a990-c95c85feabff")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("39e62b16-8b95-4275-b12e-543106fbf73f")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("7b7392fe-2782-437a-86c5-91d74f7201ea")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008c7490-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c77980aa-273e-47f0-8739-6cb903f83578")
        private static SmClass smClass = null;

        @objid ("47da8784-ff7a-4a26-b11f-449c60caf57d")
        private static SmAttribute ImplementationAtt = null;

        @objid ("081d1479-2994-4e02-9cd3-97b2bc4b894f")
        private static SmDependency MessageRefDep = null;

        @objid ("7f0dad00-6edc-4f0b-b5d7-38f2341f5d4c")
        private static SmDependency OperationRefDep = null;

        @objid ("104a2420-3481-4b3f-8564-199031b97f52")
        private static SmDependency CalledOperationDep = null;

        @objid ("fa6fa0b2-df90-4151-8fd3-bfda5a48a447")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSendTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9efd6777-8c56-46b5-abde-32a1c9466e45")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("aa215eac-9c05-4091-b86c-0c4efe5204e1")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("8af8eada-c131-4b21-b359-39a8f2c7ae18")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("f32b8498-01fd-4f10-b5e0-f49db022e390")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("f22ba849-7599-4ab0-964c-6cbdd274ca58")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("a2471b1e-a444-422f-a472-22c6d0273210")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("395f6ee5-acee-4a1f-a79f-ef6f78d65180")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("dc62f4c0-f586-498b-955e-59c7cdf9028f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("bf1de34c-54c2-4f57-bfd2-582783767ac2")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("008cb6a8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6dac607f-93c9-4cf4-bddd-20975b315652")
            public ISmObjectData createData() {
                return new BpmnSendTaskData();
            }

            @objid ("7f5dff0d-6f5d-43c5-bf05-a14572ee2071")
            public SmObjectImpl createImpl() {
                return new BpmnSendTaskImpl();
            }

        }

        @objid ("008d1850-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("2e66b19f-2a07-4504-bc3a-508b76981b45")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mImplementation;
            }

            @objid ("b9d02409-44a0-4eb1-a718-f4aed746381f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSendTaskData) data).mImplementation = value;
            }

        }

        @objid ("008d7b1a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("94b679f0-e004-49d9-9f6f-0e770fee5811")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mOperationRef;
            }

            @objid ("ba339536-641e-458d-a931-b6032648e12b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mOperationRef = value;
            }

            @objid ("47c0abd6-609c-4039-a79f-ac4cb27d15a0")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.SenderDep();
            }

        }

        @objid ("008df78e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("1541a57d-bb79-48ea-a8f3-9e390102bbf8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mMessageRef;
            }

            @objid ("1e44bc62-24b1-4c59-8be7-2d567fd4cce6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mMessageRef = value;
            }

            @objid ("ef9c6ab8-9560-4e7e-b933-2c86f53a603c")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.SenderDep();
            }

        }

        @objid ("008e6ea8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("58bf865c-835c-4bab-bb1b-0243fb8153b9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mCalledOperation;
            }

            @objid ("04636557-7a8a-41c8-882f-0b1e63ba28c2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mCalledOperation = value;
            }

            @objid ("3007f65d-ce48-429a-871a-f3956837cb70")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerSendTaskDep();
            }

        }

    }

}
