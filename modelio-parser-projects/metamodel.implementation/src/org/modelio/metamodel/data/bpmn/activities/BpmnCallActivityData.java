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
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.data.bpmn.activities.BpmnTaskData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnCallActivityImpl;
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

@objid ("007f5012-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCallActivity.class, factory=BpmnCallActivityData.Metadata.ObjectFactory.class)
public class BpmnCallActivityData extends BpmnActivityData {
    @objid ("02d78b95-ed5b-4819-991d-6ef3d49ec761")
    @SmaMetaAssociation(metaName="CalledGlobalTask", typeDataClass=BpmnTaskData.class, min=0, max=1, smAssociationClass=Metadata.CalledGlobalTaskSmDependency.class, partof = true)
     SmObjectImpl mCalledGlobalTask;

    @objid ("982cfc03-8f41-47f1-b066-5a37f1e9514a")
    @SmaMetaAssociation(metaName="CalledProcess", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.CalledProcessSmDependency.class, partof = true)
     SmObjectImpl mCalledProcess;

    @objid ("9f826ed8-eee8-4d96-a3f3-57c6bc98e47b")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("b0786933-cdff-4870-9c7b-0fa72e240084")
    @SmaMetaAssociation(metaName="CalledBehavior", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.CalledBehaviorSmDependency.class, partof = true)
     SmObjectImpl mCalledBehavior;

    @objid ("455c9efa-21a4-4f6c-9677-798f76bf9369")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0001e758-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bd123b3a-dee3-435c-bf9a-580a38d04dcf")
        private static SmClass smClass = null;

        @objid ("97c23fe2-b0c3-47bc-a951-e8a3293e6c30")
        private static SmDependency CalledGlobalTaskDep = null;

        @objid ("477712e7-b90c-44c2-8702-80213ff7f557")
        private static SmDependency CalledProcessDep = null;

        @objid ("98ec7211-8747-4bc1-81a9-da7a3e76c35d")
        private static SmDependency CalledOperationDep = null;

        @objid ("83dcc1e8-4965-410c-859a-4fdc02a7a295")
        private static SmDependency CalledBehaviorDep = null;

        @objid ("3870a663-a525-4870-ac98-bc2d0b116373")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCallActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d52037ff-1e63-4451-967c-af429e62c7c5")
        public static SmDependency CalledGlobalTaskDep() {
            if (CalledGlobalTaskDep == null) {
            	CalledGlobalTaskDep = classof().getDependencyDef("CalledGlobalTask");
            }
            return CalledGlobalTaskDep;
        }

        @objid ("f8b1a101-ac22-4988-b3d3-3b2e7aeefc92")
        public static SmDependency CalledProcessDep() {
            if (CalledProcessDep == null) {
            	CalledProcessDep = classof().getDependencyDef("CalledProcess");
            }
            return CalledProcessDep;
        }

        @objid ("b408db9d-8118-49e8-a59a-b421522b5bdc")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("e18725f2-d8cc-4a7c-8bd7-9e76616aa6d6")
        public static SmDependency CalledBehaviorDep() {
            if (CalledBehaviorDep == null) {
            	CalledBehaviorDep = classof().getDependencyDef("CalledBehavior");
            }
            return CalledBehaviorDep;
        }

        @objid ("d80a1760-9d0e-40fe-8e88-cda7dc336cd8")
        public static SmDependency getCalledGlobalTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledGlobalTaskDep;
        }

        @objid ("9bed1dac-ccd0-495f-a272-fd8953d4ed47")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("77394d2b-4139-4481-a50d-133b52b62398")
        public static SmDependency getCalledBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledBehaviorDep;
        }

        @objid ("72364a87-591a-4025-b82d-1944e8bc4b43")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f3eb868c-7cba-4abb-bd21-85376d80c309")
        public static SmDependency getCalledProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledProcessDep;
        }

        @objid ("0002284e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a0b84c20-4f58-45aa-92ac-fea341d9c425")
            public ISmObjectData createData() {
                return new BpmnCallActivityData();
            }

            @objid ("e427240a-925f-4e55-8ba9-1716a97fc90b")
            public SmObjectImpl createImpl() {
                return new BpmnCallActivityImpl();
            }

        }

        @objid ("00028e06-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledGlobalTaskSmDependency extends SmSingleDependency {
            @objid ("73f74dd4-f85f-4832-a42f-44356fc149f9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledGlobalTask;
            }

            @objid ("4b490131-d756-4317-931a-2b3822d88786")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledGlobalTask = value;
            }

            @objid ("678a16dd-8c59-4b3b-8fee-5702a22d3afa")
            @Override
            public SmDependency getSymetric() {
                return BpmnTaskData.Metadata.CallerDep();
            }

        }

        @objid ("0003043a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledProcessSmDependency extends SmSingleDependency {
            @objid ("d7ac3f35-1ce3-46f5-ad8b-65ec92a7e2b7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledProcess;
            }

            @objid ("86a63b45-10f5-42ef-a3f2-600c19e03023")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledProcess = value;
            }

            @objid ("9b714b6c-49f2-4662-aaba-737b41d015c7")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.CallerDep();
            }

        }

        @objid ("0003797e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("4c78bfda-e078-4ae3-bdbb-6e7ee8f11607")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledOperation;
            }

            @objid ("53a3e947-20c2-4e92-9e6c-6b4c42add91b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledOperation = value;
            }

            @objid ("4659dcce-0de8-4b36-944e-4edc0e0e7fbb")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerDep();
            }

        }

        @objid ("0003f0f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledBehaviorSmDependency extends SmSingleDependency {
            @objid ("0dfed355-3bbc-4b22-a314-3d76ad392a5b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledBehavior;
            }

            @objid ("da169a75-6e9d-42c4-b530-0c132d5fe77b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledBehavior = value;
            }

            @objid ("95e6dcbe-fe4e-4f2e-b17b-5a018991e78e")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.BpmnCallerDep();
            }

        }

    }

}
