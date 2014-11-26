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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.data.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.data.bpmn.events.BpmnThrowEventData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataInputImpl;
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

@objid ("0006c016-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataInput.class, factory=BpmnDataInputData.Metadata.ObjectFactory.class)
public class BpmnDataInputData extends BpmnItemAwareElementData {
    @objid ("aaf8bb89-248e-4478-b668-958a1e74cd1c")
    @SmaMetaAssociation(metaName="RepresentedParameter", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedParameter;

    @objid ("136b383e-cc9b-48a8-aba1-2b79d7914ab9")
    @SmaMetaAssociation(metaName="OwnerLoopCharacteristics", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.OwnerLoopCharacteristicsSmDependency.class)
     SmObjectImpl mOwnerLoopCharacteristics;

    @objid ("fb36d09b-c092-4f32-9653-17e3f9449e06")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("bacf95df-e6f5-41df-a853-a6ace0fe2901")
    @SmaMetaAssociation(metaName="OwnerThrowEvent", typeDataClass=BpmnThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.OwnerThrowEventSmDependency.class)
     SmObjectImpl mOwnerThrowEvent;

    @objid ("bdace748-559e-4f30-a0af-9556c1d6b6d4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005f8b92-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4d6c74a6-792b-4f67-82ca-6e1495ecf5fd")
        private static SmClass smClass = null;

        @objid ("d8b24272-895c-4afb-8e6d-58d01e478403")
        private static SmDependency RepresentedParameterDep = null;

        @objid ("9e7b090d-650b-4c6c-a828-8eec89f28b86")
        private static SmDependency OwnerLoopCharacteristicsDep = null;

        @objid ("6451a4f3-4c8c-40b0-b687-cd104beacbeb")
        private static SmDependency OwnerActivityDep = null;

        @objid ("4be859fd-4945-4a4e-87b1-ac28129d9f28")
        private static SmDependency OwnerThrowEventDep = null;

        @objid ("5f80e6ec-360c-426f-8b50-6205ea53718d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataInputData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b8ebd547-534f-4688-97bc-0957b350bad1")
        public static SmDependency RepresentedParameterDep() {
            if (RepresentedParameterDep == null) {
            	RepresentedParameterDep = classof().getDependencyDef("RepresentedParameter");
            }
            return RepresentedParameterDep;
        }

        @objid ("ffa29207-9ac4-4345-8b25-9ac43ebc2306")
        public static SmDependency OwnerLoopCharacteristicsDep() {
            if (OwnerLoopCharacteristicsDep == null) {
            	OwnerLoopCharacteristicsDep = classof().getDependencyDef("OwnerLoopCharacteristics");
            }
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("53bee3d7-227b-4bfa-8c53-bfc5b1ec5a35")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("055bd5da-2fe0-4f85-8ac5-243d8026f522")
        public static SmDependency OwnerThrowEventDep() {
            if (OwnerThrowEventDep == null) {
            	OwnerThrowEventDep = classof().getDependencyDef("OwnerThrowEvent");
            }
            return OwnerThrowEventDep;
        }

        @objid ("96acb693-810b-4b4d-b027-1ff3cbc09801")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("ef7ac018-d9da-41bc-990e-854752208685")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("56bc64f5-d1eb-48fb-a6bb-0cf5c7ff6cb4")
        public static SmDependency getOwnerLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("7c8e9323-cc65-44cb-b589-fcbcdd3c99e5")
        public static SmDependency getOwnerThrowEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerThrowEventDep;
        }

        @objid ("d7ce0e5f-9d4c-4a74-a7c3-88858ef727db")
        public static SmDependency getRepresentedParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedParameterDep;
        }

        @objid ("005fcbb6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4361d985-7e15-48bf-bb87-7c19b178a904")
            public ISmObjectData createData() {
                return new BpmnDataInputData();
            }

            @objid ("77d30a15-a8f5-4f06-8ac2-5d113b28260b")
            public SmObjectImpl createImpl() {
                return new BpmnDataInputImpl();
            }

        }

        @objid ("00602d36-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedParameterSmDependency extends SmSingleDependency {
            @objid ("9f0700b6-074e-48ee-97d5-24a6076b414e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mRepresentedParameter;
            }

            @objid ("6b1a22ce-b5f6-4cb9-8665-b54b232ebb5c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mRepresentedParameter = value;
            }

            @objid ("a9a94c34-d095-41d4-af64-0893c9136284")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BpmnRepresentingDataInputDep();
            }

        }

        @objid ("0060a388-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerLoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("2ed9ba37-b100-4f18-8652-5e2a450734b4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerLoopCharacteristics;
            }

            @objid ("c731c351-3813-43a8-947e-7b744f66959e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerLoopCharacteristics = value;
            }

            @objid ("27b28865-dfca-4b54-843f-7a76cfe4f983")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep();
            }

        }

        @objid ("006118ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("07bb6b76-ed48-44da-97f7-03f10965841a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerActivity;
            }

            @objid ("e4e42323-d9d0-4f12-8e52-511a61118e0c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerActivity = value;
            }

            @objid ("34d48860-2807-4e7c-bb3c-167dd3117602")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.InputSpecificationDep();
            }

        }

        @objid ("00618cda-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerThrowEventSmDependency extends SmSingleDependency {
            @objid ("6d056d70-8fd0-40f6-bdec-f0ee2a7d009a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerThrowEvent;
            }

            @objid ("94c1d9c7-d36e-4759-aea2-4036e7eac650")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerThrowEvent = value;
            }

            @objid ("c718f306-054d-4bd6-a80d-e566f8d10036")
            @Override
            public SmDependency getSymetric() {
                return BpmnThrowEventData.Metadata.DataInputDep();
            }

        }

    }

}
