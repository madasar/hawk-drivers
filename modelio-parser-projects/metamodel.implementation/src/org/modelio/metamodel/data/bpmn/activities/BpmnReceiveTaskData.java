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
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnReceiveTaskImpl;
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

@objid ("0081d3c8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnReceiveTask.class, factory=BpmnReceiveTaskData.Metadata.ObjectFactory.class)
public class BpmnReceiveTaskData extends BpmnTaskData {
    @objid ("cd8ebe57-6039-45ee-9e10-7fe271768745")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("84617d39-66b6-4b4a-b286-96f16bac922b")
    @SmaMetaAttribute(metaName="Instanciate", type=Boolean.class, smAttributeClass=Metadata.InstanciateSmAttribute.class)
     Object mInstanciate = false;

    @objid ("410eca20-2766-46b2-893d-93c45c8aa8c2")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("9d1d4a7c-b4b5-423c-9a98-bdfcaa6c9dce")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("d74bb288-f8b5-4481-b041-be1d09ed4d96")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("6f09c621-2e49-4d22-a9ac-9ac914040aeb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0061ef4a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e3927487-6423-4d8a-8a38-b86b323216c4")
        private static SmClass smClass = null;

        @objid ("38529059-501c-45a7-b08a-b592d534d65f")
        private static SmAttribute ImplementationAtt = null;

        @objid ("7a69abb3-fd9c-4de1-8904-967167f60019")
        private static SmAttribute InstanciateAtt = null;

        @objid ("48207e1d-1a79-4069-8cea-36ad7eebaafb")
        private static SmDependency MessageRefDep = null;

        @objid ("8db62bac-d48a-46bb-943b-1f953ec09267")
        private static SmDependency OperationRefDep = null;

        @objid ("cb8b9165-4566-410e-adf9-3366e0463005")
        private static SmDependency CalledOperationDep = null;

        @objid ("cb830727-20b7-4432-a311-390166948183")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnReceiveTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4d6412d5-7857-47ad-ad95-6a6a59e90c64")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("83ab2a3f-7f66-496a-9a33-c795c0537a8d")
        public static SmAttribute InstanciateAtt() {
            if (InstanciateAtt == null) {
            	InstanciateAtt = classof().getAttributeDef("Instanciate");
            }
            return InstanciateAtt;
        }

        @objid ("61c326c4-560f-4786-9c15-d44d08a8ecef")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("533ed161-514b-4a6f-b095-bba51e984eb1")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("e34a85d4-2d6d-40af-aeb5-3e4b6ddcfece")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("aff3ae83-960d-45da-8775-72fccbee0f5e")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("588b2e50-e22c-4865-949f-bdab5c66e9fc")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("bcdfee16-a5e7-4449-844a-6217e3721623")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("f4fc14f0-dd99-4ba4-8ab7-97e7fb41f73e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f6414e6d-606d-41b0-b2d7-3010f79c5b72")
        public static SmAttribute getInstanciateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciateAtt;
        }

        @objid ("87acba5a-b63c-46d7-be4b-aa2d05e96cc0")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("00622e92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("00ec447a-9491-440e-a9df-eff782061410")
            public ISmObjectData createData() {
                return new BpmnReceiveTaskData();
            }

            @objid ("c53b7557-4194-4fde-a059-8b8cdab6ad79")
            public SmObjectImpl createImpl() {
                return new BpmnReceiveTaskImpl();
            }

        }

        @objid ("00628f54-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("41174841-72f6-4549-b146-44233b694073")
            public Object getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mImplementation;
            }

            @objid ("e9b94d57-33e1-405b-a406-6a0c5f9f10da")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnReceiveTaskData) data).mImplementation = value;
            }

        }

        @objid ("0062f96c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciateSmAttribute extends SmAttribute {
            @objid ("81705506-80f2-4a08-bc8a-a85a12dd2598")
            public Object getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mInstanciate;
            }

            @objid ("8e035864-1919-4126-a02d-11af70fb691b")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnReceiveTaskData) data).mInstanciate = value;
            }

        }

        @objid ("00635d4e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("4ba88b15-d4cd-45a0-a3ec-cc31215f1f1a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mOperationRef;
            }

            @objid ("cbdc2b9e-7778-4c43-bc45-841e16b5a271")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mOperationRef = value;
            }

            @objid ("fd9f1292-e4de-4ba2-937b-468d5c35613a")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.ReceiverDep();
            }

        }

        @objid ("0063d206-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("371ce8cb-8da7-4552-bd7b-6c6184714848")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mMessageRef;
            }

            @objid ("cb1ce630-a144-45dc-a846-1b11c1eb37b0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mMessageRef = value;
            }

            @objid ("9d031974-bc57-439f-be70-9823ef618e2c")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.ReceiverDep();
            }

        }

        @objid ("0064475e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("2e10b5f1-e293-4ae8-80a6-2d5c497f3926")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mCalledOperation;
            }

            @objid ("d72d22bf-60ce-4879-a5a4-9a416cfaffd8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mCalledOperation = value;
            }

            @objid ("c6985eac-4724-4392-b0ea-b894052196b3")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerReceiveTaskDep();
            }

        }

    }

}
