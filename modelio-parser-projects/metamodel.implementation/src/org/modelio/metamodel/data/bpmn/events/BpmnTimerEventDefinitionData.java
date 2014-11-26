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
import org.modelio.metamodel.bpmn.events.BpmnTimerEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnTimerEventDefinitionImpl;
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

@objid ("0096dd72-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnTimerEventDefinition.class, factory=BpmnTimerEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnTimerEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("2faa64f2-d06b-471e-a0a0-1c4505abf99f")
    @SmaMetaAttribute(metaName="TimeCycle", type=String.class, smAttributeClass=Metadata.TimeCycleSmAttribute.class)
     Object mTimeCycle = "";

    @objid ("4fcf44ef-97fa-4a65-b30b-ccac395a4a25")
    @SmaMetaAttribute(metaName="TimeD", type=String.class, smAttributeClass=Metadata.TimeDSmAttribute.class)
     Object mTimeD = "";

    @objid ("f89302e4-1f41-4a15-887c-204a785cf1bf")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001cb3bc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("36925e47-fcdb-4818-a666-5e8ee6f3dc47")
        private static SmClass smClass = null;

        @objid ("9c9bb15b-233c-49eb-8de8-839ea0370c67")
        private static SmAttribute TimeCycleAtt = null;

        @objid ("bc9dbc59-68be-4a06-9866-9a53abe1f602")
        private static SmAttribute TimeDAtt = null;

        @objid ("47b88e17-fa3b-455a-919e-2281c40d8e21")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTimerEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("618cb1d4-755d-4801-8e26-1770d10fbeab")
        public static SmAttribute TimeCycleAtt() {
            if (TimeCycleAtt == null) {
            	TimeCycleAtt = classof().getAttributeDef("TimeCycle");
            }
            return TimeCycleAtt;
        }

        @objid ("76133985-4d17-46e8-9e5e-75ea61866e0f")
        public static SmAttribute TimeDAtt() {
            if (TimeDAtt == null) {
            	TimeDAtt = classof().getAttributeDef("TimeD");
            }
            return TimeDAtt;
        }

        @objid ("e189200d-8052-4316-ad3b-5d5f8e7dd925")
        public static SmAttribute getTimeDAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeDAtt;
        }

        @objid ("3f66b2fd-a555-453a-9369-211590706897")
        public static SmAttribute getTimeCycleAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeCycleAtt;
        }

        @objid ("7773283a-203d-4808-8da9-d4b12c9c879a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001cf3b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1ebc558e-f88e-4758-9436-9dee68b77e9e")
            public ISmObjectData createData() {
                return new BpmnTimerEventDefinitionData();
            }

            @objid ("979b1bb5-ee72-4cd6-b888-7f04ce5e7b36")
            public SmObjectImpl createImpl() {
                return new BpmnTimerEventDefinitionImpl();
            }

        }

        @objid ("001d60d2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TimeCycleSmAttribute extends SmAttribute {
            @objid ("1ad8673a-da0d-4dad-acb8-65ab7d1cebfc")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTimerEventDefinitionData) data).mTimeCycle;
            }

            @objid ("c11e87c4-9ff8-4a43-81f6-484fa8f67d28")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTimerEventDefinitionData) data).mTimeCycle = value;
            }

        }

        @objid ("001dc2d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TimeDSmAttribute extends SmAttribute {
            @objid ("477aeba4-74e0-47d3-9ca9-a9d8f994ac33")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTimerEventDefinitionData) data).mTimeD;
            }

            @objid ("c89ee69d-5910-4c10-9e11-1bfe84acd04f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTimerEventDefinitionData) data).mTimeD = value;
            }

        }

    }

}
