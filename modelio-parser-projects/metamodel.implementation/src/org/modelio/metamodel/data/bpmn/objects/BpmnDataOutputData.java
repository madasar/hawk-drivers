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
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.data.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.data.bpmn.events.BpmnCatchEventData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataOutputImpl;
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

@objid ("00061d64-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataOutput.class, factory=BpmnDataOutputData.Metadata.ObjectFactory.class)
public class BpmnDataOutputData extends BpmnItemAwareElementData {
    @objid ("6309d358-ed52-480a-b3cf-c75d2e3c4d34")
    @SmaMetaAssociation(metaName="RepresentedParameter", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedParameter;

    @objid ("e6350d4e-01fe-4278-89b1-fa1848ee8918")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("3ba0e7ad-fbfd-4220-a0cd-101f10263a29")
    @SmaMetaAssociation(metaName="Catched", typeDataClass=BpmnCatchEventData.class, min=0, max=1, smAssociationClass=Metadata.CatchedSmDependency.class)
     SmObjectImpl mCatched;

    @objid ("aba7195c-8169-4083-b8a6-b3b8739c05be")
    @SmaMetaAssociation(metaName="OwnerLoopCharacteristics", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.OwnerLoopCharacteristicsSmDependency.class)
     SmObjectImpl mOwnerLoopCharacteristics;

    @objid ("412110d2-ccad-41cb-990b-ee5e5ecffe53")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0031b10e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("22ed05fa-4f5e-4fde-8ec9-1fe906224f02")
        private static SmClass smClass = null;

        @objid ("2d2561f2-410b-42f0-a3e9-10f65d3a9f08")
        private static SmDependency RepresentedParameterDep = null;

        @objid ("3f0bb9d8-b965-44c1-a239-a4dddacdd362")
        private static SmDependency OwnerActivityDep = null;

        @objid ("c5806d27-e57d-4cf0-a3ee-9e2a8489bd8e")
        private static SmDependency CatchedDep = null;

        @objid ("17084704-1dcc-4d8e-9c08-d8164fd92a35")
        private static SmDependency OwnerLoopCharacteristicsDep = null;

        @objid ("3f37ed5b-83d3-4793-9a04-5aa9a9e9fed7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataOutputData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a908d020-9749-4a8c-a3d9-c7f9bc6b4992")
        public static SmDependency RepresentedParameterDep() {
            if (RepresentedParameterDep == null) {
            	RepresentedParameterDep = classof().getDependencyDef("RepresentedParameter");
            }
            return RepresentedParameterDep;
        }

        @objid ("69c8ef5c-158c-41e8-95cf-dff39fcb8cd4")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("288afafc-5a31-4389-87ea-d4fbece488f7")
        public static SmDependency CatchedDep() {
            if (CatchedDep == null) {
            	CatchedDep = classof().getDependencyDef("Catched");
            }
            return CatchedDep;
        }

        @objid ("1a0ada8d-c5ae-4f38-a31b-0f8db4ecccae")
        public static SmDependency OwnerLoopCharacteristicsDep() {
            if (OwnerLoopCharacteristicsDep == null) {
            	OwnerLoopCharacteristicsDep = classof().getDependencyDef("OwnerLoopCharacteristics");
            }
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("9d6192f7-1856-47fa-ac51-87ac88773126")
        public static SmDependency getOwnerLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("fb659abd-6c55-44f9-a77c-06fb64e1217c")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("007eba30-44eb-46b5-b776-595bc66ce8b0")
        public static SmDependency getRepresentedParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedParameterDep;
        }

        @objid ("0b111a75-89de-4b95-9740-34ddd64b7c4c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("06e6cfc5-1665-44ab-a19a-dcffc22df351")
        public static SmDependency getCatchedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CatchedDep;
        }

        @objid ("0031f25e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0f43413f-a9fd-46b7-ae27-0b14552c2d88")
            public ISmObjectData createData() {
                return new BpmnDataOutputData();
            }

            @objid ("3c5b8584-dbb4-4dd6-8e23-5374a67393c1")
            public SmObjectImpl createImpl() {
                return new BpmnDataOutputImpl();
            }

        }

        @objid ("003259ce-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedParameterSmDependency extends SmSingleDependency {
            @objid ("131de360-a820-4a15-a725-e150cd9c00ca")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mRepresentedParameter;
            }

            @objid ("c1456816-dc59-4861-a80c-615d94d2c598")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mRepresentedParameter = value;
            }

            @objid ("06cd06bb-a4f4-4232-a542-514f07d7065d")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BpmnRepresentingDataOutputDep();
            }

        }

        @objid ("0032d020-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("27385985-b639-45e0-b835-8e34582fc9ba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mOwnerActivity;
            }

            @objid ("48cf69ab-4d24-4450-a6ca-2b17f07d4600")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mOwnerActivity = value;
            }

            @objid ("0467f90e-d2b1-4dae-9a29-9b0618cceba2")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.OutputSpecificationDep();
            }

        }

        @objid ("0033507c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CatchedSmDependency extends SmSingleDependency {
            @objid ("f05587b0-2a18-4f52-b2fc-1fd57959643f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mCatched;
            }

            @objid ("fa7ad759-b51b-412d-9227-8379c3615db5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mCatched = value;
            }

            @objid ("3350f52e-6baf-42c7-96e3-d317425f65b8")
            @Override
            public SmDependency getSymetric() {
                return BpmnCatchEventData.Metadata.DataOutputDep();
            }

        }

        @objid ("0033c764-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerLoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("43468297-5232-4a77-b8ee-0cae56520da3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mOwnerLoopCharacteristics;
            }

            @objid ("30676c54-521b-48f6-988f-e9a4d352ed73")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mOwnerLoopCharacteristics = value;
            }

            @objid ("0944b9c7-eb39-436a-a257-b70ef7740104")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep();
            }

        }

    }

}
