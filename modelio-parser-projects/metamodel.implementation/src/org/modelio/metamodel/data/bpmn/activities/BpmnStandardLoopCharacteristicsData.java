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
import org.modelio.metamodel.bpmn.activities.BpmnStandardLoopCharacteristics;
import org.modelio.metamodel.impl.bpmn.activities.BpmnStandardLoopCharacteristicsImpl;
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

@objid ("0083ff36-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnStandardLoopCharacteristics.class, factory=BpmnStandardLoopCharacteristicsData.Metadata.ObjectFactory.class)
public class BpmnStandardLoopCharacteristicsData extends BpmnLoopCharacteristicsData {
    @objid ("2f86088b-c14f-4a14-b364-a49185c8de66")
    @SmaMetaAttribute(metaName="TestBefore", type=Boolean.class, smAttributeClass=Metadata.TestBeforeSmAttribute.class)
     Object mTestBefore = false;

    @objid ("e6f3748c-2470-4e6f-9988-1c97499f268b")
    @SmaMetaAttribute(metaName="LoopCondition", type=String.class, smAttributeClass=Metadata.LoopConditionSmAttribute.class)
     Object mLoopCondition = "";

    @objid ("45720e8d-8953-485f-ac5f-ebe93e14918e")
    @SmaMetaAttribute(metaName="LoopMaximum", type=String.class, smAttributeClass=Metadata.LoopMaximumSmAttribute.class)
     Object mLoopMaximum = "";

    @objid ("505f6736-e7b3-4a8e-8b1b-9fa555e1b158")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0058fc1e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d617c6c0-6b5e-4cab-8691-0fb19f258ab9")
        private static SmClass smClass = null;

        @objid ("5d5a1050-c04c-4caa-8716-12650e93bd11")
        private static SmAttribute TestBeforeAtt = null;

        @objid ("f37fa1a9-817f-4db5-873d-58c09634e9dc")
        private static SmAttribute LoopConditionAtt = null;

        @objid ("dbbcc80e-2a66-4925-a1b8-77148ebddea0")
        private static SmAttribute LoopMaximumAtt = null;

        @objid ("10632e72-dba2-4915-a061-64bd597768fc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnStandardLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("73d095c2-2424-4b25-83be-7fa2ac61aa1b")
        public static SmAttribute TestBeforeAtt() {
            if (TestBeforeAtt == null) {
            	TestBeforeAtt = classof().getAttributeDef("TestBefore");
            }
            return TestBeforeAtt;
        }

        @objid ("badf7aff-4c2d-4441-a77f-4a4b3fa07d4c")
        public static SmAttribute LoopConditionAtt() {
            if (LoopConditionAtt == null) {
            	LoopConditionAtt = classof().getAttributeDef("LoopCondition");
            }
            return LoopConditionAtt;
        }

        @objid ("d2388e4a-58aa-44a8-af80-dc28ba2bdf4f")
        public static SmAttribute LoopMaximumAtt() {
            if (LoopMaximumAtt == null) {
            	LoopMaximumAtt = classof().getAttributeDef("LoopMaximum");
            }
            return LoopMaximumAtt;
        }

        @objid ("9b1380f5-7b53-4bef-af9e-d840f8b38eb7")
        public static SmAttribute getTestBeforeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestBeforeAtt;
        }

        @objid ("a8c4091c-2b55-4415-801c-947c06e30ff7")
        public static SmAttribute getLoopConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopConditionAtt;
        }

        @objid ("643ba02f-cfbc-41ed-b283-be7e96dd99bd")
        public static SmAttribute getLoopMaximumAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopMaximumAtt;
        }

        @objid ("815bba0d-3c69-4326-aa2c-18282b7d8e91")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00593d82-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9e0468be-cd14-4e91-9e62-eb7be0c68743")
            public ISmObjectData createData() {
                return new BpmnStandardLoopCharacteristicsData();
            }

            @objid ("32e06cf5-9c34-4762-8522-2294b20e8aa4")
            public SmObjectImpl createImpl() {
                return new BpmnStandardLoopCharacteristicsImpl();
            }

        }

        @objid ("00599e6c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TestBeforeSmAttribute extends SmAttribute {
            @objid ("10fb81a1-41b0-41ec-9851-247e1850115a")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mTestBefore;
            }

            @objid ("1c924b77-81dc-4114-a90c-ec2442f798c9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mTestBefore = value;
            }

        }

        @objid ("005a0a6e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopConditionSmAttribute extends SmAttribute {
            @objid ("6943512a-964a-426c-842d-52aab2901dda")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mLoopCondition;
            }

            @objid ("5f88e887-88d9-444a-9457-3b60f6841c79")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mLoopCondition = value;
            }

        }

        @objid ("005a6c3e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopMaximumSmAttribute extends SmAttribute {
            @objid ("24f2f1b5-391f-4b59-96a3-655b20a9bb0f")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mLoopMaximum;
            }

            @objid ("d63b52a8-ef00-4726-935f-6d65fb37640d")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mLoopMaximum = value;
            }

        }

    }

}
