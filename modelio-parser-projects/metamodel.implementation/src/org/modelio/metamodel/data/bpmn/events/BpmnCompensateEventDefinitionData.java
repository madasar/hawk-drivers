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
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.impl.bpmn.events.BpmnCompensateEventDefinitionImpl;
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

@objid ("0089ac74-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCompensateEventDefinition.class, factory=BpmnCompensateEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnCompensateEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("40bbaa73-7549-457b-a862-b9c7798ede06")
    @SmaMetaAssociation(metaName="ActivityRef", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.ActivityRefSmDependency.class, partof = true)
     SmObjectImpl mActivityRef;

    @objid ("98d3e30d-8412-404a-99a2-b8c79ba58d4c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008e31a4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e250ed71-8c09-4c48-be0a-02c6c3653e02")
        private static SmClass smClass = null;

        @objid ("0f9223e6-153c-4548-9c7c-55d1511fe721")
        private static SmDependency ActivityRefDep = null;

        @objid ("8466f6a5-6ede-4928-8f31-14d68fd5aa00")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCompensateEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0e430f6a-78ca-40a2-b80b-68ff68522685")
        public static SmDependency ActivityRefDep() {
            if (ActivityRefDep == null) {
            	ActivityRefDep = classof().getDependencyDef("ActivityRef");
            }
            return ActivityRefDep;
        }

        @objid ("1faaa202-65ee-4620-a1ef-6a62beb225fd")
        public static SmDependency getActivityRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActivityRefDep;
        }

        @objid ("e3229883-e23d-491c-82d8-e1835186fcad")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008e74e8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3c47cecb-d6bc-4bce-ae66-53482ef8993f")
            public ISmObjectData createData() {
                return new BpmnCompensateEventDefinitionData();
            }

            @objid ("c3442ffb-a9c1-4072-a45b-f7ce318fd87d")
            public SmObjectImpl createImpl() {
                return new BpmnCompensateEventDefinitionImpl();
            }

        }

        @objid ("008edb7c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActivityRefSmDependency extends SmSingleDependency {
            @objid ("5e693d43-c0ad-4dc8-9bbc-391ad492b5e7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCompensateEventDefinitionData) data).mActivityRef;
            }

            @objid ("bfed400e-9396-49e2-b921-1067a72dd679")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCompensateEventDefinitionData) data).mActivityRef = value;
            }

            @objid ("9042a88a-a08b-4ea6-9b20-6c3db7c1d534")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.CompensateEventDefinitionsDep();
            }

        }

    }

}
