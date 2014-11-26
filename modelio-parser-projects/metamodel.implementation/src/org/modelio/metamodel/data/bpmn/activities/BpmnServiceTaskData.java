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
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnServiceTaskImpl;
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

@objid ("00836ee0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnServiceTask.class, factory=BpmnServiceTaskData.Metadata.ObjectFactory.class)
public class BpmnServiceTaskData extends BpmnTaskData {
    @objid ("15e570cb-6506-4aa3-aeca-a50aacdd5872")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("c6dcdbd6-1229-462a-b0c6-ffcecf3db7fa")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("5d7e9d50-ae24-4c9c-9c3e-1c6494529962")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("22eb9b1c-06e7-4b1b-a90d-cd08a2a31cd3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00636668-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("55b2e259-4ba2-4dd6-b29f-35d09663de65")
        private static SmClass smClass = null;

        @objid ("b688151a-a9b0-46c1-be8f-cc7a96c9bc21")
        private static SmAttribute ImplementationAtt = null;

        @objid ("216c6bc6-6af4-411f-b77d-4c27f4823c27")
        private static SmDependency CalledOperationDep = null;

        @objid ("154f4888-f2cc-44a9-a6db-3bb5969737d9")
        private static SmDependency OperationRefDep = null;

        @objid ("8bf0b01e-40fa-411f-b4fe-f4adabee1b40")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnServiceTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9a94dfac-cd9c-4e6c-9a6b-3d27c5d7cc20")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("6520d6ef-6b68-454f-86ae-bbb26e29d126")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("113a81e5-0f3a-476c-b755-b0f75daa8dda")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("ced8a5e5-c617-4ec0-89bd-ed21afe341e3")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("7f727f33-b56c-4113-a11d-5c4352de08e5")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("23c9c5ba-a9e4-47f5-8e45-cc7904c70937")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("e509e766-f833-46e3-ac7f-dbb1715fa38a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0063a6dc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("eeb65a7c-82fb-4c4a-b626-b50ea905cf39")
            public ISmObjectData createData() {
                return new BpmnServiceTaskData();
            }

            @objid ("7426623c-ccf8-4194-809a-3893881df2cc")
            public SmObjectImpl createImpl() {
                return new BpmnServiceTaskImpl();
            }

        }

        @objid ("006407b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("121c2c6a-50ea-4ffb-ad56-8c05539b3ed7")
            public Object getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mImplementation;
            }

            @objid ("a57f1bb5-d028-4427-91cf-fe9b3440c79d")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnServiceTaskData) data).mImplementation = value;
            }

        }

        @objid ("00646914-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("16c2058d-c324-4361-8368-6f443f73eae9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mOperationRef;
            }

            @objid ("a9463927-ddcb-4cea-a922-530fb4c1f9aa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnServiceTaskData) data).mOperationRef = value;
            }

            @objid ("f6e89dba-3bf9-4198-880f-c01ce70e9358")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.CallerDep();
            }

        }

        @objid ("0064dce6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("dfbf5baf-7f32-449c-9d48-4c15caf64939")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mCalledOperation;
            }

            @objid ("2ebcafba-800e-4838-96d3-0385e44c2a13")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnServiceTaskData) data).mCalledOperation = value;
            }

            @objid ("69b31ff2-32bf-4cfe-9fbe-ba5eb34c1889")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerServiceTaskDep();
            }

        }

    }

}
