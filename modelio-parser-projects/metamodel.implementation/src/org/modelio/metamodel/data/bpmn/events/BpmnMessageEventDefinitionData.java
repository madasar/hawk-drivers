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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.impl.bpmn.events.BpmnMessageEventDefinitionImpl;
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

@objid ("00913f52-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnMessageEventDefinition.class, factory=BpmnMessageEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnMessageEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("dcdfab7c-6acf-4164-8d2e-ae8537d3e5ee")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("1fba00ea-81ab-49ca-b9f6-59cf3161d74d")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("149d431f-b3d8-423a-9331-689ec63d2c60")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00863472-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("624dfce6-7d30-4634-9308-8e5f3f0de1a0")
        private static SmClass smClass = null;

        @objid ("ab1cc357-e693-49dc-bc7d-cacc9f079213")
        private static SmDependency MessageRefDep = null;

        @objid ("0cefb7c6-a2f7-44be-a564-8e044ec3be6d")
        private static SmDependency OperationRefDep = null;

        @objid ("d5173252-4bbe-4adb-b0c7-64c1d9a914bd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("59629810-0a86-4a98-8b81-c2ba07ad13a3")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("5c708c14-c44e-45c8-b187-9f30b14afaa6")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("5f008545-5901-41bb-9a1c-4e4ea61ce275")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2b756ac3-2718-4969-b019-8f5c5997b8b8")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("f5c779ad-ae6c-4b20-ac32-0b5b1d3f7b58")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("008677d4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2075620f-96a9-44ab-a4d1-e965a083cb50")
            public ISmObjectData createData() {
                return new BpmnMessageEventDefinitionData();
            }

            @objid ("88757b56-290d-4054-9563-efa1fd7e14bb")
            public SmObjectImpl createImpl() {
                return new BpmnMessageEventDefinitionImpl();
            }

        }

        @objid ("0086d9e0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("ddcbe0ae-36b9-4ee2-931f-a808de3f22d5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageEventDefinitionData) data).mOperationRef;
            }

            @objid ("78857845-0e22-40d0-ade9-1406e86a6a63")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageEventDefinitionData) data).mOperationRef = value;
            }

            @objid ("099ace16-4b59-42a1-a3a7-75f04ede0947")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.EventDefinitionDep();
            }

        }

        @objid ("00874ec0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("94f20aca-aac8-4570-a079-6995fad86731")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageEventDefinitionData) data).mMessageRef;
            }

            @objid ("ddad91ae-2584-4f79-b04e-25c273f29e26")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageEventDefinitionData) data).mMessageRef = value;
            }

            @objid ("ebaa8d24-892d-4192-8e0f-f42bf5e4411a")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.EventDefinitionDep();
            }

        }

    }

}
