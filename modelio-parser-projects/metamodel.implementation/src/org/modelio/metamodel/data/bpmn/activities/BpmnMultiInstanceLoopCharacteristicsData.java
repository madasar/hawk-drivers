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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.MultiInstanceBehavior;
import org.modelio.metamodel.data.bpmn.activities.BpmnComplexBehaviorDefinitionData;
import org.modelio.metamodel.data.bpmn.events.BpmnEventDefinitionData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataOutputData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsImpl;
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

@objid ("00814890-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnMultiInstanceLoopCharacteristics.class, factory=BpmnMultiInstanceLoopCharacteristicsData.Metadata.ObjectFactory.class)
public class BpmnMultiInstanceLoopCharacteristicsData extends BpmnLoopCharacteristicsData {
    @objid ("88f55bb4-d2a5-4a37-8d7a-5ed4a4798118")
    @SmaMetaAttribute(metaName="IsSequencial", type=Boolean.class, smAttributeClass=Metadata.IsSequencialSmAttribute.class)
     Object mIsSequencial = false;

    @objid ("34bb6fe7-a6a0-4f3c-9e78-dcc1b78b6216")
    @SmaMetaAttribute(metaName="Behavior", type=MultiInstanceBehavior.class, smAttributeClass=Metadata.BehaviorSmAttribute.class)
     Object mBehavior = MultiInstanceBehavior.ALLBEHAVIOR;

    @objid ("0af1b809-ae09-4946-b388-4b002eeb023b")
    @SmaMetaAttribute(metaName="LoopCardinality", type=String.class, smAttributeClass=Metadata.LoopCardinalitySmAttribute.class)
     Object mLoopCardinality = "";

    @objid ("96796b20-2bc7-4f57-bbee-343e4b7e9873")
    @SmaMetaAttribute(metaName="CompletionCondition", type=String.class, smAttributeClass=Metadata.CompletionConditionSmAttribute.class)
     Object mCompletionCondition = "";

    @objid ("b94593d7-b662-4fa9-aa7c-02a978e9806b")
    @SmaMetaAssociation(metaName="LoopDataInput", typeDataClass=BpmnDataInputData.class, min=0, max=1, smAssociationClass=Metadata.LoopDataInputSmDependency.class, component = true)
     SmObjectImpl mLoopDataInput;

    @objid ("2eb17465-bb3f-4fd2-8681-157bdcc311f6")
    @SmaMetaAssociation(metaName="LoopDataOutputRef", typeDataClass=BpmnDataOutputData.class, min=0, max=1, smAssociationClass=Metadata.LoopDataOutputRefSmDependency.class, component = true)
     SmObjectImpl mLoopDataOutputRef;

    @objid ("19273650-f48a-45a8-9cfd-555e53c885c5")
    @SmaMetaAssociation(metaName="CompletionEventRef", typeDataClass=BpmnEventDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.CompletionEventRefSmDependency.class, partof = true)
     SmObjectImpl mCompletionEventRef;

    @objid ("64514089-57cd-4218-adf2-65db1b00cd03")
    @SmaMetaAssociation(metaName="ComplexBehaviorDefinition", typeDataClass=BpmnComplexBehaviorDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.ComplexBehaviorDefinitionSmDependency.class, component = true)
     List<SmObjectImpl> mComplexBehaviorDefinition = null;

    @objid ("adaf1212-80df-4ccf-b660-b16fb6d8abfa")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00403210-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("86c96849-de25-4623-84ae-4cb92759a190")
        private static SmClass smClass = null;

        @objid ("fad5bcc4-f646-4859-9298-300bedc2bfd2")
        private static SmAttribute IsSequencialAtt = null;

        @objid ("3fb444cf-2155-4033-b78c-c8ba3f749fd8")
        private static SmAttribute BehaviorAtt = null;

        @objid ("b5a09cf4-6fe6-407c-aa93-8978486de64f")
        private static SmAttribute LoopCardinalityAtt = null;

        @objid ("b54cbc3c-7205-4ac7-8b66-2a5e3a0fd6df")
        private static SmAttribute CompletionConditionAtt = null;

        @objid ("0c839bd5-d11f-408a-b53f-c055522adfc3")
        private static SmDependency LoopDataInputDep = null;

        @objid ("b6a492f6-7122-4210-b22f-38aa7052d4c7")
        private static SmDependency LoopDataOutputRefDep = null;

        @objid ("717e4516-076e-4698-a644-525815eb9735")
        private static SmDependency CompletionEventRefDep = null;

        @objid ("7309cee8-ed93-4c71-8189-3d638f0fecff")
        private static SmDependency ComplexBehaviorDefinitionDep = null;

        @objid ("01cffc89-4d1e-4420-b86e-b36ec3754640")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMultiInstanceLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6f1708d3-b5b8-4fa3-93d8-cb1eab797c42")
        public static SmAttribute IsSequencialAtt() {
            if (IsSequencialAtt == null) {
            	IsSequencialAtt = classof().getAttributeDef("IsSequencial");
            }
            return IsSequencialAtt;
        }

        @objid ("cbe411cc-edf4-46d2-8afe-4aa87ffb6f39")
        public static SmAttribute BehaviorAtt() {
            if (BehaviorAtt == null) {
            	BehaviorAtt = classof().getAttributeDef("Behavior");
            }
            return BehaviorAtt;
        }

        @objid ("a2143632-5dcb-4f65-a492-8ebb2ea91a93")
        public static SmAttribute LoopCardinalityAtt() {
            if (LoopCardinalityAtt == null) {
            	LoopCardinalityAtt = classof().getAttributeDef("LoopCardinality");
            }
            return LoopCardinalityAtt;
        }

        @objid ("d2a9c40f-1e50-4e6d-90dc-01daf0ac3a8f")
        public static SmAttribute CompletionConditionAtt() {
            if (CompletionConditionAtt == null) {
            	CompletionConditionAtt = classof().getAttributeDef("CompletionCondition");
            }
            return CompletionConditionAtt;
        }

        @objid ("edae74e7-92e1-4d59-a55d-99e3066a6f66")
        public static SmDependency LoopDataInputDep() {
            if (LoopDataInputDep == null) {
            	LoopDataInputDep = classof().getDependencyDef("LoopDataInput");
            }
            return LoopDataInputDep;
        }

        @objid ("79a66799-e81c-4b5c-8d80-78408924a97a")
        public static SmDependency LoopDataOutputRefDep() {
            if (LoopDataOutputRefDep == null) {
            	LoopDataOutputRefDep = classof().getDependencyDef("LoopDataOutputRef");
            }
            return LoopDataOutputRefDep;
        }

        @objid ("bf7c03c7-5318-403e-a139-bebf7c411a18")
        public static SmDependency CompletionEventRefDep() {
            if (CompletionEventRefDep == null) {
            	CompletionEventRefDep = classof().getDependencyDef("CompletionEventRef");
            }
            return CompletionEventRefDep;
        }

        @objid ("55063029-1740-49c6-89a6-1f7c9b8d716a")
        public static SmDependency ComplexBehaviorDefinitionDep() {
            if (ComplexBehaviorDefinitionDep == null) {
            	ComplexBehaviorDefinitionDep = classof().getDependencyDef("ComplexBehaviorDefinition");
            }
            return ComplexBehaviorDefinitionDep;
        }

        @objid ("a006d2e7-8bbd-4366-b86c-81156984b950")
        public static SmDependency getComplexBehaviorDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComplexBehaviorDefinitionDep;
        }

        @objid ("f4c1cbde-e596-4029-8e2b-20100ee3ae11")
        public static SmAttribute getBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorAtt;
        }

        @objid ("b791ef2e-304f-4249-b792-02221206ceda")
        public static SmDependency getLoopDataOutputRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopDataOutputRefDep;
        }

        @objid ("e944a426-7226-4f0f-b257-14d321dbde68")
        public static SmAttribute getCompletionConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionConditionAtt;
        }

        @objid ("be70f7b9-5eea-4dc7-bde2-5adf26c33c35")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f05af0b1-9a1a-4fb5-b6eb-2543a5573395")
        public static SmAttribute getLoopCardinalityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopCardinalityAtt;
        }

        @objid ("5a58d246-2e62-413b-9747-f5af19bff3b8")
        public static SmDependency getCompletionEventRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionEventRefDep;
        }

        @objid ("de03dc74-86ae-4608-a68c-4ce8a0ac03c0")
        public static SmAttribute getIsSequencialAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSequencialAtt;
        }

        @objid ("64bfbbd1-dcbc-4b5f-b6d8-1f589c410abe")
        public static SmDependency getLoopDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopDataInputDep;
        }

        @objid ("004071ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6bdb9e46-0549-486d-9e02-5665a367355d")
            public ISmObjectData createData() {
                return new BpmnMultiInstanceLoopCharacteristicsData();
            }

            @objid ("0494e034-d5d3-4025-bbde-b18ccee6d16d")
            public SmObjectImpl createImpl() {
                return new BpmnMultiInstanceLoopCharacteristicsImpl();
            }

        }

        @objid ("0040d2ba-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSequencialSmAttribute extends SmAttribute {
            @objid ("42be43e7-b815-4a94-b656-4d13075907cc")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mIsSequencial;
            }

            @objid ("c7abe18f-56c2-4ea2-9455-8942a8699f22")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mIsSequencial = value;
            }

        }

        @objid ("00413250-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BehaviorSmAttribute extends SmAttribute {
            @objid ("e176d9f2-c51e-45e1-b19d-00613083ffc7")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mBehavior;
            }

            @objid ("400dc3c8-240e-4ed8-a7be-e3b1f6f42d3c")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mBehavior = value;
            }

        }

        @objid ("00419272-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopCardinalitySmAttribute extends SmAttribute {
            @objid ("24c0bb12-2c1a-4f80-b83a-377ed57257c9")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopCardinality;
            }

            @objid ("0373eccd-dc58-4ab8-9406-c561d7d88777")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopCardinality = value;
            }

        }

        @objid ("0041f442-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CompletionConditionSmAttribute extends SmAttribute {
            @objid ("dbbed2e5-331b-4e05-8880-f61bbaae73bd")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionCondition;
            }

            @objid ("890879b2-057d-4613-b37e-bf85d2daccdc")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionCondition = value;
            }

        }

        @objid ("0042591e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopDataInputSmDependency extends SmSingleDependency {
            @objid ("ddbb37a7-9ae4-4726-b321-681a3adf7178")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataInput;
            }

            @objid ("9891d47f-95f4-493b-ab09-60bdf1e0be33")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataInput = value;
            }

            @objid ("7c669b85-67d6-4bc7-b1e8-45b379524317")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep();
            }

        }

        @objid ("0042d182-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopDataOutputRefSmDependency extends SmSingleDependency {
            @objid ("efbbee76-8b2d-40a2-b91c-1b8fd8208ec5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataOutputRef;
            }

            @objid ("79af5bcf-2fb0-49d4-af8a-4579d188f3be")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataOutputRef = value;
            }

            @objid ("bc687906-9af6-4966-a9e2-59095b6927a3")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep();
            }

        }

        @objid ("004347de-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CompletionEventRefSmDependency extends SmSingleDependency {
            @objid ("2e9519ec-0dcf-44cf-8f95-46b3d7ed95da")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionEventRef;
            }

            @objid ("c6a0a599-e200-44ce-9791-025f1268659d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionEventRef = value;
            }

            @objid ("0e2b46b0-65e1-4369-8be9-f5ff9cac2756")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventDefinitionData.Metadata.LoopRefDep();
            }

        }

        @objid ("0043be9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ComplexBehaviorDefinitionSmDependency extends SmMultipleDependency {
            @objid ("48f124bb-a5f3-4825-b461-90926dc1736e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMultiInstanceLoopCharacteristicsData)data).mComplexBehaviorDefinition != null)? ((BpmnMultiInstanceLoopCharacteristicsData)data).mComplexBehaviorDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("09ed279e-d350-4c78-82a2-b12d69ccc436")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mComplexBehaviorDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mComplexBehaviorDefinition;
            }

            @objid ("48e285ec-ac7c-420d-8a93-ca8dd4e17151")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep();
            }

        }

    }

}
