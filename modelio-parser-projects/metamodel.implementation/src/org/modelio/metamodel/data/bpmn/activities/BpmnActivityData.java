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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.data.bpmn.activities.BpmnLoopCharacteristicsData;
import org.modelio.metamodel.data.bpmn.events.BpmnBoundaryEventData;
import org.modelio.metamodel.data.bpmn.events.BpmnCompensateEventDefinitionData;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataOutputData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivityImpl;
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

@objid ("007dc792-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnActivity.class, factory=BpmnActivityData.Metadata.ObjectFactory.class)
public class BpmnActivityData extends BpmnFlowNodeData {
    @objid ("c08bd3e0-2af1-4e11-aa82-4c0a4db4a86e")
    @SmaMetaAttribute(metaName="IsForCompensation", type=Boolean.class, smAttributeClass=Metadata.IsForCompensationSmAttribute.class)
     Object mIsForCompensation = false;

    @objid ("0414ea69-0f64-4d07-a49a-a14fdebe4aef")
    @SmaMetaAttribute(metaName="StartQuantity", type=Integer.class, smAttributeClass=Metadata.StartQuantitySmAttribute.class)
     Object mStartQuantity = 1;

    @objid ("5e44dc44-fc23-41b7-8bc1-2b78f70a8cc6")
    @SmaMetaAttribute(metaName="CompletionQuantity", type=Integer.class, smAttributeClass=Metadata.CompletionQuantitySmAttribute.class)
     Object mCompletionQuantity = 1;

    @objid ("80a26596-75f9-4a8f-bff8-1d98b0e906cc")
    @SmaMetaAssociation(metaName="CompensateEventDefinitions", typeDataClass=BpmnCompensateEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.CompensateEventDefinitionsSmDependency.class)
     List<SmObjectImpl> mCompensateEventDefinitions = null;

    @objid ("cd71f130-cce0-438a-9c13-c82b1c8ad65e")
    @SmaMetaAssociation(metaName="InputSpecification", typeDataClass=BpmnDataInputData.class, min=0, max=-1, smAssociationClass=Metadata.InputSpecificationSmDependency.class, component = true)
     List<SmObjectImpl> mInputSpecification = null;

    @objid ("8172202f-dfb6-4658-a199-d394bfda4ad6")
    @SmaMetaAssociation(metaName="DataInputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataInputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataInputAssociation = null;

    @objid ("e06cc268-8a6f-4892-9297-0a160bb6c1d3")
    @SmaMetaAssociation(metaName="OutputSpecification", typeDataClass=BpmnDataOutputData.class, min=0, max=-1, smAssociationClass=Metadata.OutputSpecificationSmDependency.class, component = true)
     List<SmObjectImpl> mOutputSpecification = null;

    @objid ("2ea174fb-f85a-4de4-b8dd-864bfaa31e1e")
    @SmaMetaAssociation(metaName="LoopCharacteristics", typeDataClass=BpmnLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.LoopCharacteristicsSmDependency.class, component = true)
     SmObjectImpl mLoopCharacteristics;

    @objid ("e15161b9-51ba-4ba3-90e1-819dbae00036")
    @SmaMetaAssociation(metaName="BoundaryEventRef", typeDataClass=BpmnBoundaryEventData.class, min=0, max=-1, smAssociationClass=Metadata.BoundaryEventRefSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mBoundaryEventRef = null;

    @objid ("bf11b207-cf77-4212-9eaa-1e863326d243")
    @SmaMetaAssociation(metaName="DataOutputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataOutputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataOutputAssociation = null;

    @objid ("b67355b6-d365-4fb7-9397-0a632f1c1913")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("cd038489-90ee-4a3b-99db-b1926cb1b024")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00214e9a-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d69e8b54-4bb0-4c93-8f4c-6173a7f8bc8f")
        private static SmClass smClass = null;

        @objid ("acf05d87-f466-4d69-a256-ef67797bc256")
        private static SmAttribute IsForCompensationAtt = null;

        @objid ("203b0395-d93c-4494-91bd-9b51c6ae3863")
        private static SmAttribute StartQuantityAtt = null;

        @objid ("df1fa6f1-3033-4b01-ac84-dd83f0180821")
        private static SmAttribute CompletionQuantityAtt = null;

        @objid ("2745f86e-0888-4dc4-965d-5b88a9724a60")
        private static SmDependency CompensateEventDefinitionsDep = null;

        @objid ("273d4738-b5dc-45e3-a4a6-26f46053386b")
        private static SmDependency InputSpecificationDep = null;

        @objid ("34b8beb2-282f-484f-b20e-736bc4fb8ae9")
        private static SmDependency DataInputAssociationDep = null;

        @objid ("76ac60f5-abd4-40fe-8074-7296cdfac911")
        private static SmDependency OutputSpecificationDep = null;

        @objid ("f53a182d-9e93-4aa5-856f-77332b1ebf8e")
        private static SmDependency LoopCharacteristicsDep = null;

        @objid ("70064fc3-5718-40bc-9d7d-0d52a97e6624")
        private static SmDependency BoundaryEventRefDep = null;

        @objid ("223f002c-8fb4-4c4b-af3c-b538c09a1aad")
        private static SmDependency DataOutputAssociationDep = null;

        @objid ("9512a1c3-af6b-4a08-a8f1-f1725d034657")
        private static SmDependency DefaultFlowDep = null;

        @objid ("e61284d4-fea6-4f4b-844e-a236412d72de")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e08d0a57-55b9-4542-b410-915d2c1b7ee3")
        public static SmAttribute IsForCompensationAtt() {
            if (IsForCompensationAtt == null) {
            	IsForCompensationAtt = classof().getAttributeDef("IsForCompensation");
            }
            return IsForCompensationAtt;
        }

        @objid ("ae1659a2-7ad5-479d-b1ff-e8d5dd822c21")
        public static SmAttribute StartQuantityAtt() {
            if (StartQuantityAtt == null) {
            	StartQuantityAtt = classof().getAttributeDef("StartQuantity");
            }
            return StartQuantityAtt;
        }

        @objid ("137d7f1b-82b9-423f-9478-cea94aa77385")
        public static SmAttribute CompletionQuantityAtt() {
            if (CompletionQuantityAtt == null) {
            	CompletionQuantityAtt = classof().getAttributeDef("CompletionQuantity");
            }
            return CompletionQuantityAtt;
        }

        @objid ("27f7654a-f387-4c58-8af7-6df292b9fa1b")
        public static SmDependency CompensateEventDefinitionsDep() {
            if (CompensateEventDefinitionsDep == null) {
            	CompensateEventDefinitionsDep = classof().getDependencyDef("CompensateEventDefinitions");
            }
            return CompensateEventDefinitionsDep;
        }

        @objid ("237fab2d-e35c-4147-abc4-fa491cf7501c")
        public static SmDependency InputSpecificationDep() {
            if (InputSpecificationDep == null) {
            	InputSpecificationDep = classof().getDependencyDef("InputSpecification");
            }
            return InputSpecificationDep;
        }

        @objid ("877200bd-95b1-49a2-a0a5-aca7417b1103")
        public static SmDependency DataInputAssociationDep() {
            if (DataInputAssociationDep == null) {
            	DataInputAssociationDep = classof().getDependencyDef("DataInputAssociation");
            }
            return DataInputAssociationDep;
        }

        @objid ("93751994-1ea2-4bb6-89a8-701a0eadfefe")
        public static SmDependency OutputSpecificationDep() {
            if (OutputSpecificationDep == null) {
            	OutputSpecificationDep = classof().getDependencyDef("OutputSpecification");
            }
            return OutputSpecificationDep;
        }

        @objid ("42973367-c630-4793-90a0-3db120b5a8dc")
        public static SmDependency LoopCharacteristicsDep() {
            if (LoopCharacteristicsDep == null) {
            	LoopCharacteristicsDep = classof().getDependencyDef("LoopCharacteristics");
            }
            return LoopCharacteristicsDep;
        }

        @objid ("11592c13-90ec-4716-acff-b5dffab4421f")
        public static SmDependency BoundaryEventRefDep() {
            if (BoundaryEventRefDep == null) {
            	BoundaryEventRefDep = classof().getDependencyDef("BoundaryEventRef");
            }
            return BoundaryEventRefDep;
        }

        @objid ("b890ca48-ad49-4bbd-8cae-2791c7c0d4a5")
        public static SmDependency DataOutputAssociationDep() {
            if (DataOutputAssociationDep == null) {
            	DataOutputAssociationDep = classof().getDependencyDef("DataOutputAssociation");
            }
            return DataOutputAssociationDep;
        }

        @objid ("1b59b258-de8a-4f02-879c-5f38f180413f")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("2f445442-6efc-4f5c-b87b-7fa0cb9f249a")
        public static SmDependency getLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopCharacteristicsDep;
        }

        @objid ("e27ba8d8-0d35-4c67-9a6d-0fbd9b981bcd")
        public static SmDependency getDataInputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputAssociationDep;
        }

        @objid ("5c42d676-d83f-4a07-9f19-5be5ad3cd167")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("35289a0b-5b39-46c6-9506-2bf999a244d5")
        public static SmAttribute getIsForCompensationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsForCompensationAtt;
        }

        @objid ("08e0cdef-dc40-4d16-9308-e299d24e2243")
        public static SmDependency getCompensateEventDefinitionsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompensateEventDefinitionsDep;
        }

        @objid ("032aac6b-682b-49be-8a5c-22c3502ffad9")
        public static SmDependency getInputSpecificationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputSpecificationDep;
        }

        @objid ("47d1fa84-f040-4567-b1ec-6dd50b1909da")
        public static SmDependency getBoundaryEventRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundaryEventRefDep;
        }

        @objid ("0cab0f83-e82c-44dc-a7b1-ac30ec6fcad4")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("fcb8e508-f2ac-44b3-8403-ef12a88e7d0b")
        public static SmDependency getOutputSpecificationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputSpecificationDep;
        }

        @objid ("3cef6c2a-2f50-406f-96dc-0a5b2d4a08db")
        public static SmAttribute getCompletionQuantityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionQuantityAtt;
        }

        @objid ("b63a71f1-9ffd-47b9-b3b2-c6da7fc5d91b")
        public static SmDependency getDataOutputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputAssociationDep;
        }

        @objid ("7f8b5bbc-8280-451e-8e6b-28a3ddbc0f3d")
        public static SmAttribute getStartQuantityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartQuantityAtt;
        }

        @objid ("00218eb4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1dd68525-4313-4019-8431-d6f72e5831b2")
            public ISmObjectData createData() {
                return new BpmnActivityData();
            }

            @objid ("f7f13eac-9cd5-41b7-9a65-4b6bbd1d56d7")
            public SmObjectImpl createImpl() {
                return new BpmnActivityImpl();
            }

        }

        @objid ("0021f002-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsForCompensationSmAttribute extends SmAttribute {
            @objid ("b3948259-027a-4b27-a594-199d5d5e2056")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mIsForCompensation;
            }

            @objid ("f5131dde-49d9-4bf0-9205-547349dc9511")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mIsForCompensation = value;
            }

        }

        @objid ("00225150-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StartQuantitySmAttribute extends SmAttribute {
            @objid ("0821d1bc-c991-4eb7-809f-bc168e4ca81f")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mStartQuantity;
            }

            @objid ("89a0024c-bbed-42cf-84ac-935cbc4894f9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mStartQuantity = value;
            }

        }

        @objid ("0022b1f4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CompletionQuantitySmAttribute extends SmAttribute {
            @objid ("bc7d8641-99ad-4a49-9b38-1e213a83b493")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mCompletionQuantity;
            }

            @objid ("d1a113d8-7cf2-4f81-ad46-99e4d8198e26")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mCompletionQuantity = value;
            }

        }

        @objid ("002315e0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InputSpecificationSmDependency extends SmMultipleDependency {
            @objid ("435c89f8-f91d-44d3-ae26-13298eafb4ba")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mInputSpecification != null)? ((BpmnActivityData)data).mInputSpecification:SmMultipleDependency.EMPTY;
            }

            @objid ("5c8c0e2b-4f97-488c-83ee-64752fa6b11f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mInputSpecification = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mInputSpecification;
            }

            @objid ("496ffbfe-73c5-4985-9c71-42f47c7fa9ab")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("00237af8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutputSpecificationSmDependency extends SmMultipleDependency {
            @objid ("91065c62-b10c-4df6-88b4-41f24606c95e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mOutputSpecification != null)? ((BpmnActivityData)data).mOutputSpecification:SmMultipleDependency.EMPTY;
            }

            @objid ("2cc10e31-6c1b-4fee-ac84-52143b6536f3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mOutputSpecification = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mOutputSpecification;
            }

            @objid ("29b802f5-8aa8-4892-8dc1-ddfdf12bf2f7")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("0023df48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BoundaryEventRefSmDependency extends SmMultipleDependency {
            @objid ("4e954ba3-ce3a-4712-a1f1-0c3ef2e9c379")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mBoundaryEventRef != null)? ((BpmnActivityData)data).mBoundaryEventRef:SmMultipleDependency.EMPTY;
            }

            @objid ("6c9b76d8-070b-4aab-9523-0ceee74af8c6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mBoundaryEventRef = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mBoundaryEventRef;
            }

            @objid ("6da9eb55-d3cb-4df7-9459-14108807ba74")
            @Override
            public SmDependency getSymetric() {
                return BpmnBoundaryEventData.Metadata.AttachedToRefDep();
            }

        }

        @objid ("00244528-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("e28eeb75-caf6-4459-bbeb-658f6c221187")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mDefaultFlow;
            }

            @objid ("0e1fe280-a050-4bcd-9111-76c7d24f51cc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnActivityData) data).mDefaultFlow = value;
            }

            @objid ("cf02878f-7176-48d0-ae01-b95d2c8390d1")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultFromDep();
            }

        }

        @objid ("0024bdc8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DataInputAssociationSmDependency extends SmMultipleDependency {
            @objid ("9ec63ac3-0223-4150-9f9e-a50629deef3c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mDataInputAssociation != null)? ((BpmnActivityData)data).mDataInputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("ca48e1c4-8960-4fda-8285-1a8eaa98887b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mDataInputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mDataInputAssociation;
            }

            @objid ("3122af68-a2c9-4cfd-a7e6-c19d68f2699b")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.StartingActivityDep();
            }

        }

        @objid ("0025242a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DataOutputAssociationSmDependency extends SmMultipleDependency {
            @objid ("5377d2b4-5063-4797-9afb-98ababed0111")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mDataOutputAssociation != null)? ((BpmnActivityData)data).mDataOutputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("90ed5e7d-f120-4bd9-b951-74a35f461eba")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mDataOutputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mDataOutputAssociation;
            }

            @objid ("d760c1b4-c98c-47e5-b548-3e51758869b7")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.EndingActivityDep();
            }

        }

        @objid ("00258a96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("e50dced0-82da-4782-97b6-16c7d6507074")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mLoopCharacteristics;
            }

            @objid ("efe075ce-e967-421b-b7bb-d54a6f9418ec")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnActivityData) data).mLoopCharacteristics = value;
            }

            @objid ("47883697-4600-4b8a-966b-0860b9fc1bf3")
            @Override
            public SmDependency getSymetric() {
                return BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("002605a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CompensateEventDefinitionsSmDependency extends SmMultipleDependency {
            @objid ("dffd8284-e8de-4e58-b663-882cc4f60801")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mCompensateEventDefinitions != null)? ((BpmnActivityData)data).mCompensateEventDefinitions:SmMultipleDependency.EMPTY;
            }

            @objid ("052c03c2-245c-4ac9-b7ad-5c26b666c69d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mCompensateEventDefinitions = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mCompensateEventDefinitions;
            }

            @objid ("07872f67-9f5e-42cd-ad60-f91f1bcd6001")
            @Override
            public SmDependency getSymetric() {
                return BpmnCompensateEventDefinitionData.Metadata.ActivityRefDep();
            }

        }

    }

}
