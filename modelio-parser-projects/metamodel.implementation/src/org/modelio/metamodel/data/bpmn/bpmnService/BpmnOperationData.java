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
package org.modelio.metamodel.data.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.data.bpmn.activities.BpmnReceiveTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnSendTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnServiceTaskData;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnInterfaceData;
import org.modelio.metamodel.data.bpmn.events.BpmnMessageEventDefinitionData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnOperationImpl;
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

@objid ("000daf70-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnOperation.class, factory=BpmnOperationData.Metadata.ObjectFactory.class)
public class BpmnOperationData extends BpmnBaseElementData {
    @objid ("92f02351-a628-4912-b868-77f6e42c572b")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("4b7b5d2a-b850-4004-a872-f8d5e5f000bf")
    @SmaMetaAssociation(metaName="InMessageRef", typeDataClass=BpmnMessageData.class, min=1, max=1, smAssociationClass=Metadata.InMessageRefSmDependency.class, partof = true)
     SmObjectImpl mInMessageRef;

    @objid ("ad8626ba-fbdd-4a20-8a04-11f504bdfec3")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnServiceTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("eb963db8-17ad-43d3-be28-63803c2cc6c2")
    @SmaMetaAssociation(metaName="OutMessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.OutMessageRefSmDependency.class, partof = true)
     SmObjectImpl mOutMessageRef;

    @objid ("b070d63b-f1e1-4146-bbcc-0a9e81b0ac12")
    @SmaMetaAssociation(metaName="EventDefinition", typeDataClass=BpmnMessageEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionSmDependency.class)
     List<SmObjectImpl> mEventDefinition = null;

    @objid ("5f28523c-03fb-4efa-9182-7db9196524ba")
    @SmaMetaAssociation(metaName="ImplementationRef", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImplementationRefSmDependency.class, partof = true)
     SmObjectImpl mImplementationRef;

    @objid ("23f561f1-278b-4ccb-822e-4dc1030ef580")
    @SmaMetaAssociation(metaName="BpmnInterfaceRef", typeDataClass=BpmnInterfaceData.class, min=1, max=1, smAssociationClass=Metadata.BpmnInterfaceRefSmDependency.class)
     SmObjectImpl mBpmnInterfaceRef;

    @objid ("5344f0f8-4831-4b9e-8b9e-a42e31849558")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("3a545e98-5842-44c7-b4e3-c83d55db1803")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00831efe-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c6899ff7-b178-4718-b2f0-68a86898bb9f")
        private static SmClass smClass = null;

        @objid ("130edd79-a74d-4ca5-9ca3-50c384163a70")
        private static SmDependency SenderDep = null;

        @objid ("17b9ca31-c0d1-4a41-a797-429a8b3baf71")
        private static SmDependency InMessageRefDep = null;

        @objid ("1ca14f08-b8f2-4fef-8e7d-d3eefaa274fb")
        private static SmDependency CallerDep = null;

        @objid ("23efda27-c12f-42bf-9106-882f62c338f8")
        private static SmDependency OutMessageRefDep = null;

        @objid ("7a8f133d-1d35-4be7-b3d0-0b3f4c5a33d2")
        private static SmDependency EventDefinitionDep = null;

        @objid ("b73458de-8fc1-486e-afb2-986b23698962")
        private static SmDependency ImplementationRefDep = null;

        @objid ("1a6c9e61-e350-46ca-9463-e07d55883ca6")
        private static SmDependency BpmnInterfaceRefDep = null;

        @objid ("40a9503f-b488-47c6-b364-1ad60c8d1544")
        private static SmDependency ReceiverDep = null;

        @objid ("85a51341-a7a9-4af2-9afd-f957142a3c94")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnOperationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c6d1950f-8456-4a67-9b5e-6b89b6a5dfdd")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("358f305e-faa7-4836-a4e0-94d5ca3bc25b")
        public static SmDependency InMessageRefDep() {
            if (InMessageRefDep == null) {
            	InMessageRefDep = classof().getDependencyDef("InMessageRef");
            }
            return InMessageRefDep;
        }

        @objid ("7815d296-14d3-408c-a585-11095b0f8f84")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("1c983a0e-c793-411e-bc79-a9fbbd5734cf")
        public static SmDependency OutMessageRefDep() {
            if (OutMessageRefDep == null) {
            	OutMessageRefDep = classof().getDependencyDef("OutMessageRef");
            }
            return OutMessageRefDep;
        }

        @objid ("99d983dd-5d6c-4ba5-bb9a-a567c70d8399")
        public static SmDependency EventDefinitionDep() {
            if (EventDefinitionDep == null) {
            	EventDefinitionDep = classof().getDependencyDef("EventDefinition");
            }
            return EventDefinitionDep;
        }

        @objid ("7590ed3f-af91-4495-a939-8bf59b5c1107")
        public static SmDependency ImplementationRefDep() {
            if (ImplementationRefDep == null) {
            	ImplementationRefDep = classof().getDependencyDef("ImplementationRef");
            }
            return ImplementationRefDep;
        }

        @objid ("bec0fda0-1432-4463-9533-e0f549fe17da")
        public static SmDependency BpmnInterfaceRefDep() {
            if (BpmnInterfaceRefDep == null) {
            	BpmnInterfaceRefDep = classof().getDependencyDef("BpmnInterfaceRef");
            }
            return BpmnInterfaceRefDep;
        }

        @objid ("eb770e95-e261-4d84-9861-d3bc62adedc1")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("74ab2514-b4ae-4fc3-ac74-e5ccdf11199c")
        public static SmDependency getInMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InMessageRefDep;
        }

        @objid ("12e6e1dc-0bb2-4aae-88d0-9e342fc92c74")
        public static SmDependency getEventDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionDep;
        }

        @objid ("8b5c55ce-f78b-4ef7-90b5-2b5edbf3bddb")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("4a9328e6-c5bc-4d49-9c88-ade404efc053")
        public static SmDependency getOutMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutMessageRefDep;
        }

        @objid ("48f3803a-82e9-4f1f-8114-039f6f13b667")
        public static SmDependency getImplementationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationRefDep;
        }

        @objid ("aaaaf1b2-a9e9-4031-958d-f3c5f29b4504")
        public static SmDependency getBpmnInterfaceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnInterfaceRefDep;
        }

        @objid ("f29d37d6-ce8d-4676-917e-41156604d6f0")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("5be2e137-4fea-439b-8d82-6b60726b9c5c")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("dc585f14-debe-452e-bbc7-e2174c978ffb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00837048-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("86cca49d-078a-4559-9081-1ff23b70d497")
            public ISmObjectData createData() {
                return new BpmnOperationData();
            }

            @objid ("7357c9c2-c96d-4a68-ace2-42faf7ae2ec5")
            public SmObjectImpl createImpl() {
                return new BpmnOperationImpl();
            }

        }

        @objid ("0083e3c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InMessageRefSmDependency extends SmSingleDependency {
            @objid ("247eba2d-97df-4894-ba5c-ccef193c3669")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mInMessageRef;
            }

            @objid ("d8a7c092-429b-4c50-a215-ba973b4dea16")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mInMessageRef = value;
            }

            @objid ("ae848d80-33ed-4ce2-a362-4a2c61f842ff")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.InputMessageDep();
            }

        }

        @objid ("0084d53c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutMessageRefSmDependency extends SmSingleDependency {
            @objid ("02d8c50b-f8b4-4d72-8d9f-04378d6a927d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mOutMessageRef;
            }

            @objid ("e98bdbf3-2e37-43db-b6a5-91b335692f6c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mOutMessageRef = value;
            }

            @objid ("98d6b029-dd26-4f4c-932f-101553b6109d")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.OutputMessageDep();
            }

        }

        @objid ("00856308-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImplementationRefSmDependency extends SmSingleDependency {
            @objid ("e2cdd242-a043-402c-86ac-ab57753d63d2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mImplementationRef;
            }

            @objid ("6d1ce98e-d6f7-4da9-bc43-1547bd074e8a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mImplementationRef = value;
            }

            @objid ("6de1839d-a398-4864-bd63-15c4fb571d4c")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.BpmnOperationRefDep();
            }

        }

        @objid ("0085ecce-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("7b675d0c-0b81-4a70-ac0c-2d41da12444d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mReceiver != null)? ((BpmnOperationData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("b91992b6-58e2-4bec-ab65-78e8c2d84fe4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mReceiver;
            }

            @objid ("452c5f31-967e-45e5-9986-ea0d79176f4e")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.OperationRefDep();
            }

        }

        @objid ("00866474-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("dd1616f9-50d6-4d32-9da0-7d080bddab5a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mCaller != null)? ((BpmnOperationData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("a8d91072-33cf-45f5-abb3-55766240c444")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mCaller;
            }

            @objid ("a29cd8d0-0b7b-4ffe-bbbb-ba08439eba16")
            @Override
            public SmDependency getSymetric() {
                return BpmnServiceTaskData.Metadata.OperationRefDep();
            }

        }

        @objid ("0086dabc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BpmnInterfaceRefSmDependency extends SmSingleDependency {
            @objid ("40c034d7-cdf8-4562-b9d2-616de7053ab0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mBpmnInterfaceRef;
            }

            @objid ("f6413427-443e-49ea-96b7-60805608c160")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mBpmnInterfaceRef = value;
            }

            @objid ("85b26492-99e0-4594-9795-c5487deb2ced")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.OperationDep();
            }

        }

        @objid ("008769f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionSmDependency extends SmMultipleDependency {
            @objid ("e5c14b98-cff9-4ad4-a7a2-2d9fb7f507f2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mEventDefinition != null)? ((BpmnOperationData)data).mEventDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("46394db5-4724-41b6-b666-155b2d9175cf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mEventDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mEventDefinition;
            }

            @objid ("aa069749-c9b1-4149-abd7-75a19b0ac532")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageEventDefinitionData.Metadata.OperationRefDep();
            }

        }

        @objid ("008807ca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("7741390e-ee97-4287-9998-cfdaae2a08d3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mSender != null)? ((BpmnOperationData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("cde50e00-139e-4082-b72f-bf8c2575b879")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mSender = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mSender;
            }

            @objid ("a08204a7-cfc4-401e-95ce-b73aad4f207d")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.OperationRefDep();
            }

        }

    }

}
