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
import org.modelio.metamodel.bpmn.events.BpmnConditionalEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnConditionalEventDefinitionImpl;
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

@objid ("008a5390-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnConditionalEventDefinition.class, factory=BpmnConditionalEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnConditionalEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("56f5a0dd-68e8-4b8c-b3ac-3de569f6eaaf")
    @SmaMetaAttribute(metaName="Condition", type=String.class, smAttributeClass=Metadata.ConditionSmAttribute.class)
     Object mCondition = "";

    @objid ("87a00f14-469b-404a-8631-d253dc474a06")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002659c6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("465f1c5f-8712-4f07-be9e-ab8eea3a4002")
        private static SmClass smClass = null;

        @objid ("e2e492a7-342c-43b1-b2a1-7eef9add14c0")
        private static SmAttribute ConditionAtt = null;

        @objid ("76423095-935f-47b1-89bb-27470cfa1d31")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnConditionalEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("07e0da23-bdfa-4732-b1d9-c50a6766a596")
        public static SmAttribute ConditionAtt() {
            if (ConditionAtt == null) {
            	ConditionAtt = classof().getAttributeDef("Condition");
            }
            return ConditionAtt;
        }

        @objid ("5184d977-6557-4564-a594-8e35ace0bdeb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dae1621c-bac5-47f8-a0b7-315d58d51d1b")
        public static SmAttribute getConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionAtt;
        }

        @objid ("00269b2a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("33b776f6-1ab6-4d05-b674-9c353c2f1b01")
            public ISmObjectData createData() {
                return new BpmnConditionalEventDefinitionData();
            }

            @objid ("2d4bd046-1bc1-44f6-9150-7bf6a59db0cd")
            public SmObjectImpl createImpl() {
                return new BpmnConditionalEventDefinitionImpl();
            }

        }

        @objid ("0026fbd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConditionSmAttribute extends SmAttribute {
            @objid ("1528e84a-6495-45cd-b029-356ccf2b3c60")
            public Object getValue(ISmObjectData data) {
                return ((BpmnConditionalEventDefinitionData) data).mCondition;
            }

            @objid ("ab2cb087-b25e-41b7-8c2f-294b8ad9fbe3")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnConditionalEventDefinitionData) data).mCondition = value;
            }

        }

    }

}
