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
package org.modelio.metamodel.data.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.activities.BpmnCallActivityData;
import org.modelio.metamodel.data.uml.behavior.activityModel.CallBehaviorActionData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorParameterData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.CollaborationData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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

@objid ("0040ed22-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Behavior.class, factory=BehaviorData.Metadata.ObjectFactory.class)
public abstract class BehaviorData extends ModelElementData {
    @objid ("db62ef03-e73f-419d-a441-55ab8a600dc4")
    @SmaMetaAttribute(metaName="IsReentrant", type=Boolean.class, smAttributeClass=Metadata.IsReentrantSmAttribute.class)
     Object mIsReentrant = false;

    @objid ("220b314c-c855-4834-b973-455e891a215a")
    @SmaMetaAssociation(metaName="BpmnCaller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnCallerSmDependency.class)
     List<SmObjectImpl> mBpmnCaller = null;

    @objid ("5161d94f-f41f-4070-9038-802201de70d6")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("3cd0456f-df2f-4280-90d8-85f9263f1661")
    @SmaMetaAssociation(metaName="Parameter", typeDataClass=BehaviorParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSmDependency.class, component = true)
     List<SmObjectImpl> mParameter = null;

    @objid ("d72229e7-17b9-4c61-99fd-58b4b179932d")
    @SmaMetaAssociation(metaName="OwnerOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.OwnerOperationSmDependency.class)
     SmObjectImpl mOwnerOperation;

    @objid ("344cc642-7124-434e-8b92-9e27bcb7a584")
    @SmaMetaAssociation(metaName="OwnedCollaboration", typeDataClass=CollaborationData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaboration = null;

    @objid ("64c079c3-36f0-43ff-b571-8009bd98ee0a")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=CallBehaviorActionData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("21637cfe-c602-4ff3-8812-8e92d3a86ee7")
    @SmaMetaAssociation(metaName="EComponent", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.EComponentSmDependency.class, component = true)
     List<SmObjectImpl> mEComponent = null;

    @objid ("593e62dc-6119-4a35-8348-75d7ae09b4e3")
    @SmaMetaAssociation(metaName="EffectOf", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.EffectOfSmDependency.class)
     List<SmObjectImpl> mEffectOf = null;

    @objid ("d2cb3e78-c071-496f-9328-acdf1e502a41")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002486a0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d4310763-ac3f-4edf-8980-49cfd2b8fa4e")
        private static SmClass smClass = null;

        @objid ("b6166728-c912-4653-9b74-2f438fe2e14b")
        private static SmAttribute IsReentrantAtt = null;

        @objid ("2c703501-f2cc-45ae-9d14-8e316bd433d5")
        private static SmDependency BpmnCallerDep = null;

        @objid ("50b1f15e-27f9-4e5b-bca5-5a712564d0f9")
        private static SmDependency OwnerDep = null;

        @objid ("d3dfd0ea-763f-48b3-bc58-630fa3dff592")
        private static SmDependency ParameterDep = null;

        @objid ("e01f4f87-e4cf-4a40-b27a-b0603c693376")
        private static SmDependency OwnerOperationDep = null;

        @objid ("fdc1de7e-68f3-48eb-bd79-6e989547cfdb")
        private static SmDependency OwnedCollaborationDep = null;

        @objid ("36547472-2af0-406b-9441-7470a4bfb80e")
        private static SmDependency CallerDep = null;

        @objid ("2fd61257-959a-4e2a-8313-57a85fe44ff1")
        private static SmDependency EComponentDep = null;

        @objid ("f6256aea-6d53-4c32-9ab0-fc2c56bc8046")
        private static SmDependency EffectOfDep = null;

        @objid ("1f738865-ada0-42ef-8edd-97cbf246798f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f8421741-8d62-4ec0-8fb9-9bdc5fc7f6e2")
        public static SmAttribute IsReentrantAtt() {
            if (IsReentrantAtt == null) {
            	IsReentrantAtt = classof().getAttributeDef("IsReentrant");
            }
            return IsReentrantAtt;
        }

        @objid ("abe1d061-dd94-41f1-833d-750c4a544c24")
        public static SmDependency BpmnCallerDep() {
            if (BpmnCallerDep == null) {
            	BpmnCallerDep = classof().getDependencyDef("BpmnCaller");
            }
            return BpmnCallerDep;
        }

        @objid ("b12a7a63-b3bc-42db-ba0a-1938a22910c5")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("8800706d-7c46-4e81-8d91-bd983c43a083")
        public static SmDependency ParameterDep() {
            if (ParameterDep == null) {
            	ParameterDep = classof().getDependencyDef("Parameter");
            }
            return ParameterDep;
        }

        @objid ("a2fc8159-23b7-4374-9ea2-88057b3d6a43")
        public static SmDependency OwnerOperationDep() {
            if (OwnerOperationDep == null) {
            	OwnerOperationDep = classof().getDependencyDef("OwnerOperation");
            }
            return OwnerOperationDep;
        }

        @objid ("c54ea6b6-a512-4160-b6d3-93c7354ae8ce")
        public static SmDependency OwnedCollaborationDep() {
            if (OwnedCollaborationDep == null) {
            	OwnedCollaborationDep = classof().getDependencyDef("OwnedCollaboration");
            }
            return OwnedCollaborationDep;
        }

        @objid ("75cc7ac1-bd88-48eb-aa83-480a852c240d")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("bb9c5805-271c-48cd-8c62-e808b6412ec4")
        public static SmDependency EComponentDep() {
            if (EComponentDep == null) {
            	EComponentDep = classof().getDependencyDef("EComponent");
            }
            return EComponentDep;
        }

        @objid ("a0750302-434c-4da1-8ecb-1b6cf228dbbb")
        public static SmDependency EffectOfDep() {
            if (EffectOfDep == null) {
            	EffectOfDep = classof().getDependencyDef("EffectOf");
            }
            return EffectOfDep;
        }

        @objid ("2272f228-4ef1-470d-a4c8-53c4667e0580")
        public static SmDependency getEffectOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectOfDep;
        }

        @objid ("22cf5570-18d4-4d15-be8d-78f735afc2ee")
        public static SmDependency getOwnerOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerOperationDep;
        }

        @objid ("0b0d7c6f-d39e-457d-be37-fbde8b6dd52b")
        public static SmDependency getBpmnCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnCallerDep;
        }

        @objid ("bfe29213-7999-40d4-b456-9be0e7dfc247")
        public static SmDependency getParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterDep;
        }

        @objid ("7dc7df0e-10d4-48e6-b908-a4983952e727")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("106af9d7-3e40-42f2-a8a4-3451fde564f1")
        public static SmAttribute getIsReentrantAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsReentrantAtt;
        }

        @objid ("e1429d15-e8f4-4e5c-ae62-a428f9211bca")
        public static SmDependency getEComponentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EComponentDep;
        }

        @objid ("29fa9d02-0758-467f-b4d7-fd9e011da761")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("5650f267-afcc-48ae-88bf-6d8193581e45")
        public static SmDependency getOwnedCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationDep;
        }

        @objid ("4088a765-852e-4144-9899-29f6ec8138d9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0024ce44-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a9ab8fde-e155-43ae-b50a-3603e507f171")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("c9b75760-19d0-4f23-ae48-4bacac46a2fd")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00253122-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsReentrantSmAttribute extends SmAttribute {
            @objid ("466e6b1d-cc6b-4810-af89-9c8a1b19ad99")
            public Object getValue(ISmObjectData data) {
                return ((BehaviorData) data).mIsReentrant;
            }

            @objid ("acf5ca46-b53c-418b-8987-ebeae22959b5")
            public void setValue(ISmObjectData data, Object value) {
                ((BehaviorData) data).mIsReentrant = value;
            }

        }

        @objid ("00259680-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("5ba2bd53-b2cc-423d-931a-a561dcc36123")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorData) data).mOwner;
            }

            @objid ("35fdf9ba-e743-44cf-9585-e1429392acd5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorData) data).mOwner = value;
            }

            @objid ("3a95616d-cccc-47d3-af83-dfbbae40d7c8")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedBehaviorDep();
            }

        }

        @objid ("00260ffc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerOperationSmDependency extends SmSingleDependency {
            @objid ("db4ab3b0-d158-42c6-8b84-9027862a98cb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorData) data).mOwnerOperation;
            }

            @objid ("2b2c9ae2-1799-4f6b-ab4f-54284fabc77b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorData) data).mOwnerOperation = value;
            }

            @objid ("c43e69e0-795d-4218-a852-e1a02f1cbcf6")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedBehaviorDep();
            }

        }

        @objid ("00268838-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("cf9a260a-f784-4b3e-bac4-708582794fb7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mCaller != null)? ((BehaviorData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("47b25a9d-1d9b-4d76-96f5-4a6147125f87")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mCaller;
            }

            @objid ("1a96fbce-b4f2-4f5a-a8ec-2f886c3e47f9")
            @Override
            public SmDependency getSymetric() {
                return CallBehaviorActionData.Metadata.CalledDep();
            }

        }

        @objid ("0026ecec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectOfSmDependency extends SmMultipleDependency {
            @objid ("fa93ed1b-cdfe-485d-a425-5802c6b2ff20")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mEffectOf != null)? ((BehaviorData)data).mEffectOf:SmMultipleDependency.EMPTY;
            }

            @objid ("13a1c7f0-48bf-4423-9792-9978dea5ec7c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mEffectOf = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mEffectOf;
            }

            @objid ("9623863f-6e40-4033-b745-19056831a46c")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.BehaviorEffectDep();
            }

        }

        @objid ("00275934-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParameterSmDependency extends SmMultipleDependency {
            @objid ("6207387d-4a93-4258-86a5-dc43d1159cca")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mParameter != null)? ((BehaviorData)data).mParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("0421f67b-c907-4fd0-b077-811c825e20ab")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mParameter = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mParameter;
            }

            @objid ("3d4de51c-d010-4954-82e8-9d440b3bd29e")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.OwnerDep();
            }

        }

        @objid ("0027c086-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EComponentSmDependency extends SmMultipleDependency {
            @objid ("43f5cd19-f24e-4b1e-b077-b643db36edd3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mEComponent != null)? ((BehaviorData)data).mEComponent:SmMultipleDependency.EMPTY;
            }

            @objid ("2e69e5ff-6087-4035-8461-64e5cce66f6e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mEComponent = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mEComponent;
            }

            @objid ("48678509-f56e-4dff-8b37-0abf506e89e9")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.ComposedDep();
            }

        }

        @objid ("002827d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationSmDependency extends SmMultipleDependency {
            @objid ("4e1a07ea-fcbc-4ecd-a079-f72ab6de2c2d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mOwnedCollaboration != null)? ((BehaviorData)data).mOwnedCollaboration:SmMultipleDependency.EMPTY;
            }

            @objid ("ce64dba0-cc2a-4fbd-9f89-1801130941f8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mOwnedCollaboration = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mOwnedCollaboration;
            }

            @objid ("bb663933-082d-4fdf-81aa-92085601ff5c")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.BRepresentedDep();
            }

        }

        @objid ("0028952e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnCallerSmDependency extends SmMultipleDependency {
            @objid ("482e545b-702f-42ed-ba03-97ec748a272d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mBpmnCaller != null)? ((BehaviorData)data).mBpmnCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("cea94a29-4460-4bde-83cd-af9804dc5262")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mBpmnCaller = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mBpmnCaller;
            }

            @objid ("997573bc-fd0d-4301-b214-367d27e9ff05")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledBehaviorDep();
            }

        }

    }

}
