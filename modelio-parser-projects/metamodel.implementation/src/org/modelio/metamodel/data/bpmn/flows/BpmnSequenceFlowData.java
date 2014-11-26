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
package org.modelio.metamodel.data.bpmn.flows;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.data.bpmn.gateways.BpmnComplexGatewayData;
import org.modelio.metamodel.data.bpmn.gateways.BpmnExclusiveGatewayData;
import org.modelio.metamodel.data.bpmn.gateways.BpmnInclusiveGatewayData;
import org.modelio.metamodel.data.bpmn.objects.BpmnSequenceFlowDataAssociationData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.impl.bpmn.flows.BpmnSequenceFlowImpl;
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

@objid ("007d254e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnSequenceFlow.class, factory=BpmnSequenceFlowData.Metadata.ObjectFactory.class)
public class BpmnSequenceFlowData extends BpmnFlowElementData {
    @objid ("9713cd0c-5e1d-4852-a8ef-a765c5555632")
    @SmaMetaAttribute(metaName="IsImmediate", type=Boolean.class, smAttributeClass=Metadata.IsImmediateSmAttribute.class)
     Object mIsImmediate = false;

    @objid ("048c80bb-277b-49a0-9165-47d618907a99")
    @SmaMetaAttribute(metaName="ConditionExpression", type=String.class, smAttributeClass=Metadata.ConditionExpressionSmAttribute.class)
     Object mConditionExpression = "";

    @objid ("ff9b7f55-adc1-43bb-ab06-54086a78311e")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnFlowNodeData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("946cc6c1-4820-48ff-8836-4830865c3e8d")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnFlowNodeData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("f5d8444d-7f37-40a5-84c0-19c6ebc9d8da")
    @SmaMetaAssociation(metaName="DefaultOfInclusive", typeDataClass=BpmnInclusiveGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfInclusiveSmDependency.class)
     SmObjectImpl mDefaultOfInclusive;

    @objid ("3bbbd4dc-6fda-493c-b869-404ef6eb6b9e")
    @SmaMetaAssociation(metaName="DefaultFrom", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFromSmDependency.class)
     SmObjectImpl mDefaultFrom;

    @objid ("b7c5b7ee-2c85-4dc5-aa6e-61c242d064c0")
    @SmaMetaAssociation(metaName="DefaultOfExclusive", typeDataClass=BpmnExclusiveGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfExclusiveSmDependency.class)
     SmObjectImpl mDefaultOfExclusive;

    @objid ("743a90e2-59cf-4203-9663-461c3614f345")
    @SmaMetaAssociation(metaName="Connector", typeDataClass=BpmnSequenceFlowDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectorSmDependency.class, component = true)
     List<SmObjectImpl> mConnector = null;

    @objid ("d81c8be3-6282-4a2d-87cc-3ec90e4bd4b6")
    @SmaMetaAssociation(metaName="DefaultOfComplex", typeDataClass=BpmnComplexGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfComplexSmDependency.class)
     SmObjectImpl mDefaultOfComplex;

    @objid ("9ddd0882-44ac-4912-b582-458dfecc1a58")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078e0a6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("03737995-7d7f-40e9-bf9a-71fe033e5393")
        private static SmClass smClass = null;

        @objid ("2f35244a-9ff4-4ede-a1b7-e4c56baf0ef8")
        private static SmAttribute IsImmediateAtt = null;

        @objid ("3977fef5-cd28-4b5f-8380-03c2c3809ff2")
        private static SmAttribute ConditionExpressionAtt = null;

        @objid ("2a11a820-89a9-47cb-b0c2-32244bbe0260")
        private static SmDependency SourceRefDep = null;

        @objid ("0d4d9777-7af3-400e-a929-7e7b5a70fd42")
        private static SmDependency TargetRefDep = null;

        @objid ("afa3eb50-e58e-43cc-ab83-08873a51a1b2")
        private static SmDependency DefaultOfInclusiveDep = null;

        @objid ("0ab8bed5-69ca-4b6b-a08b-c6e2d659786f")
        private static SmDependency DefaultFromDep = null;

        @objid ("86da5b1e-d42e-492a-8bdf-770e35a841ef")
        private static SmDependency DefaultOfExclusiveDep = null;

        @objid ("c63daf08-2ae1-4a80-8c83-04f4ea4db540")
        private static SmDependency ConnectorDep = null;

        @objid ("5c66c73f-af60-4fe5-8a1a-2c7c4802f10a")
        private static SmDependency DefaultOfComplexDep = null;

        @objid ("d30000eb-ddf7-4119-ae03-679d0c205cc1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSequenceFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("51b5bfa6-8eb0-4847-8bf6-33380f84ba16")
        public static SmAttribute IsImmediateAtt() {
            if (IsImmediateAtt == null) {
            	IsImmediateAtt = classof().getAttributeDef("IsImmediate");
            }
            return IsImmediateAtt;
        }

        @objid ("60323610-ded6-45d5-9d59-9acc5f6e9b97")
        public static SmAttribute ConditionExpressionAtt() {
            if (ConditionExpressionAtt == null) {
            	ConditionExpressionAtt = classof().getAttributeDef("ConditionExpression");
            }
            return ConditionExpressionAtt;
        }

        @objid ("730a3d56-acd5-411b-a5c3-34ecc731c3ec")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("11a73f81-1f5d-43e0-87ce-e171072aee99")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("39fef42e-0140-4bf0-9d18-9380aeba1176")
        public static SmDependency DefaultOfInclusiveDep() {
            if (DefaultOfInclusiveDep == null) {
            	DefaultOfInclusiveDep = classof().getDependencyDef("DefaultOfInclusive");
            }
            return DefaultOfInclusiveDep;
        }

        @objid ("e80598f0-e457-48a0-b08f-696810e5e388")
        public static SmDependency DefaultFromDep() {
            if (DefaultFromDep == null) {
            	DefaultFromDep = classof().getDependencyDef("DefaultFrom");
            }
            return DefaultFromDep;
        }

        @objid ("b29cb01d-a776-4ede-b7df-dbf699a4b5b7")
        public static SmDependency DefaultOfExclusiveDep() {
            if (DefaultOfExclusiveDep == null) {
            	DefaultOfExclusiveDep = classof().getDependencyDef("DefaultOfExclusive");
            }
            return DefaultOfExclusiveDep;
        }

        @objid ("cbc7c8e9-5a0c-455c-8324-028ec99113b3")
        public static SmDependency ConnectorDep() {
            if (ConnectorDep == null) {
            	ConnectorDep = classof().getDependencyDef("Connector");
            }
            return ConnectorDep;
        }

        @objid ("99e3c93e-c5e1-46c8-b162-a01ae3324395")
        public static SmDependency DefaultOfComplexDep() {
            if (DefaultOfComplexDep == null) {
            	DefaultOfComplexDep = classof().getDependencyDef("DefaultOfComplex");
            }
            return DefaultOfComplexDep;
        }

        @objid ("60bc3261-46d6-4e29-bff8-f0f891f2a7c9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6140098a-15b1-4ce5-a52a-81353e2df275")
        public static SmDependency getDefaultOfInclusiveDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfInclusiveDep;
        }

        @objid ("9ca98f5b-4bab-446b-a927-a9656214597b")
        public static SmDependency getDefaultOfExclusiveDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfExclusiveDep;
        }

        @objid ("ad4d73fe-c671-419d-afc4-86d3fb78d8eb")
        public static SmDependency getConnectorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorDep;
        }

        @objid ("69f9f9b9-8a09-429b-8b10-4b22caa91f1c")
        public static SmAttribute getIsImmediateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsImmediateAtt;
        }

        @objid ("800ba9c6-4244-408c-9155-f6a9e1e47d1e")
        public static SmAttribute getConditionExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionExpressionAtt;
        }

        @objid ("e9315d7b-f482-4e4b-92a5-d8d01a348490")
        public static SmDependency getDefaultFromDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFromDep;
        }

        @objid ("db5e748c-cf28-49f6-82cb-2eb0b521e883")
        public static SmDependency getDefaultOfComplexDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfComplexDep;
        }

        @objid ("1de716fb-7583-4fe4-998c-659c15e8813e")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("efe4c707-dea0-4cc9-81ab-8310e5b22ffa")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("00793592-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("98332eaa-b43e-4ee4-8c2f-6b382bedcacd")
            public ISmObjectData createData() {
                return new BpmnSequenceFlowData();
            }

            @objid ("ad4047eb-e103-4f87-b7a0-271c30f72c51")
            public SmObjectImpl createImpl() {
                return new BpmnSequenceFlowImpl();
            }

        }

        @objid ("0079a8c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsImmediateSmAttribute extends SmAttribute {
            @objid ("d64132b8-e8ed-4631-b3cd-6068431355f3")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mIsImmediate;
            }

            @objid ("0c2bde73-11c8-49a3-817a-3e6d398be889")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSequenceFlowData) data).mIsImmediate = value;
            }

        }

        @objid ("007a1c0a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConditionExpressionSmAttribute extends SmAttribute {
            @objid ("88cc952c-97f4-4622-b0df-4dc52c151a96")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mConditionExpression;
            }

            @objid ("26a8eab1-1b07-4b1e-aac8-d58d803e3f76")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSequenceFlowData) data).mConditionExpression = value;
            }

        }

        @objid ("007a90ae-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("ebbfac25-9917-4835-857a-8392b749e324")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mSourceRef;
            }

            @objid ("bce426ce-968b-4492-b079-f3bc6876e810")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mSourceRef = value;
            }

            @objid ("cb6d7e5d-4bb2-48e4-8339-bbf74c935c28")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.OutgoingDep();
            }

        }

        @objid ("007b1ede-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("8ca5aa3d-a247-42bd-bbad-e737812538a9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mTargetRef;
            }

            @objid ("24da6d5c-2a46-4cde-b464-9bd1d4a7c9e2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mTargetRef = value;
            }

            @objid ("17123c48-0ff5-4617-ac36-6d616085a2cc")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.IncomingDep();
            }

        }

        @objid ("007ba75a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectorSmDependency extends SmMultipleDependency {
            @objid ("624b0cf0-0cc8-4f47-80f7-d1be63ae32a1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSequenceFlowData)data).mConnector != null)? ((BpmnSequenceFlowData)data).mConnector:SmMultipleDependency.EMPTY;
            }

            @objid ("51f8bbc0-7dc4-4db8-a4c7-98a2bdd47483")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSequenceFlowData) data).mConnector = new ArrayList<>(initialCapacity);
                return ((BpmnSequenceFlowData) data).mConnector;
            }

            @objid ("845ac307-b3cc-45ee-9274-6376a5b3c492")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep();
            }

        }

        @objid ("007c1f28-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultFromSmDependency extends SmSingleDependency {
            @objid ("f215555a-6d9b-46c1-b7d6-ecf7f144e0df")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultFrom;
            }

            @objid ("a9b8dcad-5318-4328-8b30-282bdda39692")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultFrom = value;
            }

            @objid ("2d40b5b4-9b86-46c4-a355-1c59f177dd69")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007ca9c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfExclusiveSmDependency extends SmSingleDependency {
            @objid ("ffc39873-5f1c-4104-ad8b-2ecb2f4073e2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfExclusive;
            }

            @objid ("6a98ab37-ab00-401c-99a3-93fc1bd40aac")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfExclusive = value;
            }

            @objid ("5ee23028-aa95-4201-9239-9e32dfb59c1d")
            @Override
            public SmDependency getSymetric() {
                return BpmnExclusiveGatewayData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007d3408-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfInclusiveSmDependency extends SmSingleDependency {
            @objid ("85fc7af6-7730-4092-b24b-ba5dad0c451e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfInclusive;
            }

            @objid ("48074a6a-d28d-48d6-aeb3-3a28894754e6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfInclusive = value;
            }

            @objid ("f3a99b96-73bc-4e6f-b89d-ea5344490662")
            @Override
            public SmDependency getSymetric() {
                return BpmnInclusiveGatewayData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007dbdd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfComplexSmDependency extends SmSingleDependency {
            @objid ("c1b2d203-9e05-46ab-ae64-9089841b8435")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfComplex;
            }

            @objid ("1413bfe0-a482-4796-b8b2-316171f4c370")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfComplex = value;
            }

            @objid ("24865f91-45bf-4046-945d-12f38c35be5f")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexGatewayData.Metadata.DefaultFlowDep();
            }

        }

    }

}
