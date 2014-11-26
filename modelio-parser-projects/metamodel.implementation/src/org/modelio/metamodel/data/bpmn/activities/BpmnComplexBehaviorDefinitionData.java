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
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.data.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.data.bpmn.events.BpmnImplicitThrowEventData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnComplexBehaviorDefinitionImpl;
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

@objid ("007fcaf6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnComplexBehaviorDefinition.class, factory=BpmnComplexBehaviorDefinitionData.Metadata.ObjectFactory.class)
public class BpmnComplexBehaviorDefinitionData extends BpmnBaseElementData {
    @objid ("944e001e-6ae1-431e-990c-fbf7b807284f")
    @SmaMetaAttribute(metaName="Condition", type=String.class, smAttributeClass=Metadata.ConditionSmAttribute.class)
     Object mCondition = "";

    @objid ("91d1af09-ba3d-4167-87f7-e7ca3ef76db6")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("a30b48e6-3d31-406a-b82e-56559cde573e")
    @SmaMetaAssociation(metaName="Event", typeDataClass=BpmnImplicitThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.EventSmDependency.class, component = true)
     SmObjectImpl mEvent;

    @objid ("912c9b07-57a8-4d63-a7f3-0f3adf3b8be6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00579914-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6fdee4b4-65d1-496e-8315-b07dee7b4104")
        private static SmClass smClass = null;

        @objid ("aa700af1-51c7-4200-ba2e-8b91aaea0f02")
        private static SmAttribute ConditionAtt = null;

        @objid ("ba21c892-1bf5-406d-b6c4-d1fba650c7dd")
        private static SmDependency OwnerDep = null;

        @objid ("d9c85064-9d8c-41ca-aa74-3dd3562a9eeb")
        private static SmDependency EventDep = null;

        @objid ("556f93b8-ef48-448c-81f6-5d2de23cdad7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnComplexBehaviorDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5d3d0beb-9389-43e0-90c0-6b5210984a63")
        public static SmAttribute ConditionAtt() {
            if (ConditionAtt == null) {
            	ConditionAtt = classof().getAttributeDef("Condition");
            }
            return ConditionAtt;
        }

        @objid ("ffca7c06-030c-423b-86da-ae113244a719")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("a3eef8a6-7b00-4ccc-b5e1-8fa1a62c17ef")
        public static SmDependency EventDep() {
            if (EventDep == null) {
            	EventDep = classof().getDependencyDef("Event");
            }
            return EventDep;
        }

        @objid ("0ffb63e9-b296-42a8-8fb4-a885c1133f08")
        public static SmAttribute getConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionAtt;
        }

        @objid ("63347d71-204a-43ec-bd66-2997cd95dbed")
        public static SmDependency getEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDep;
        }

        @objid ("c77175e4-ba10-45b0-bbc7-d52e6391920c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("645be573-aec0-410b-b903-542f83b5c4e5")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("0057e4be-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6f36debb-5a28-4082-921a-bbc5bc4cdc5a")
            public ISmObjectData createData() {
                return new BpmnComplexBehaviorDefinitionData();
            }

            @objid ("2a9b3062-7b48-4427-ac16-055d64dbe8d0")
            public SmObjectImpl createImpl() {
                return new BpmnComplexBehaviorDefinitionImpl();
            }

        }

        @objid ("005846f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConditionSmAttribute extends SmAttribute {
            @objid ("6994ed29-786d-4471-be75-42551a745f40")
            public Object getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mCondition;
            }

            @objid ("8d510aa9-3ccc-4dff-a3aa-3372f97664ab")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnComplexBehaviorDefinitionData) data).mCondition = value;
            }

        }

        @objid ("0058a908-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EventSmDependency extends SmSingleDependency {
            @objid ("74cfd69c-79fa-4c05-8f71-993e3823eb0f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mEvent;
            }

            @objid ("341b4928-3b25-41da-bf0f-3f386e146547")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexBehaviorDefinitionData) data).mEvent = value;
            }

            @objid ("e7614f6c-9034-4d9d-bac1-9af380997033")
            @Override
            public SmDependency getSymetric() {
                return BpmnImplicitThrowEventData.Metadata.OwnerDep();
            }

        }

        @objid ("005929dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("49bbe53f-2b6a-4223-baa3-f7197adf4d22")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mOwner;
            }

            @objid ("b002da2d-8cda-4536-9406-98b5f39cce13")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexBehaviorDefinitionData) data).mOwner = value;
            }

            @objid ("704ff33f-d92c-4d94-9b9d-dd11167e6a92")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.ComplexBehaviorDefinitionDep();
            }

        }

    }

}
