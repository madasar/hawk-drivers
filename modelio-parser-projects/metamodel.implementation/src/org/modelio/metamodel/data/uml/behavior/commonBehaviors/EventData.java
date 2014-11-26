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
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.EventImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
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

@objid ("0042dd58-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Event.class, factory=EventData.Metadata.ObjectFactory.class)
public class EventData extends ModelElementData {
    @objid ("18e3e23c-a9f9-412a-834b-4b61369eab74")
    @SmaMetaAttribute(metaName="Expression", type=String.class, smAttributeClass=Metadata.ExpressionSmAttribute.class)
     Object mExpression = "";

    @objid ("d0d163e8-d3c0-4a05-b005-3bcbe78b8d41")
    @SmaMetaAttribute(metaName="Kind", type=EventType.class, smAttributeClass=Metadata.KindSmAttribute.class)
     Object mKind = EventType.SIGNALEVENT;

    @objid ("4d58293f-49ce-41ea-9e82-1ebd4cd8396d")
    @SmaMetaAssociation(metaName="Triggered", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.TriggeredSmDependency.class)
     List<SmObjectImpl> mTriggered = null;

    @objid ("03f03ebc-cfd3-433d-b51b-4bfaa7a90913")
    @SmaMetaAssociation(metaName="Model", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("8798d08b-8db8-4af8-90b9-b9bddbabecf8")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=StateData.class, min=0, max=-1, smAssociationClass=Metadata.OriginSmDependency.class)
     List<SmObjectImpl> mOrigin = null;

    @objid ("904f9d8f-2558-4240-be76-c05ed0ab7d0a")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("f26eafbb-4472-42ac-b2ee-8d7f8c360fb4")
    @SmaMetaAssociation(metaName="Composed", typeDataClass=BehaviorData.class, min=1, max=1, smAssociationClass=Metadata.ComposedSmDependency.class)
     SmObjectImpl mComposed;

    @objid ("31f1eb0d-6c16-489d-bf85-db2062e7e2da")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00357d16-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6be9d900-cdbb-43f9-8f2c-1633e94ca2df")
        private static SmClass smClass = null;

        @objid ("2a3d66aa-6dbb-4de4-a568-82460121051f")
        private static SmAttribute ExpressionAtt = null;

        @objid ("62e73979-9c2b-487d-80c4-eb3645e432c9")
        private static SmAttribute KindAtt = null;

        @objid ("52e3ddf0-fd8f-4982-abd5-43620a10555d")
        private static SmDependency TriggeredDep = null;

        @objid ("38df4ec4-e687-482e-8c7e-0349b2c17a09")
        private static SmDependency ModelDep = null;

        @objid ("110c8ff1-e357-4cf7-815f-ce47172d3a60")
        private static SmDependency OriginDep = null;

        @objid ("6f3af0a7-9c1a-47cc-bac3-9b762bb37ca5")
        private static SmDependency CalledDep = null;

        @objid ("40e7265e-871b-40da-ab20-95a62881bcdb")
        private static SmDependency ComposedDep = null;

        @objid ("2f6fc6dd-6e89-4254-adf2-6205c923b891")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2ef819f8-d4ef-49da-9664-d7915a94f01b")
        public static SmAttribute ExpressionAtt() {
            if (ExpressionAtt == null) {
            	ExpressionAtt = classof().getAttributeDef("Expression");
            }
            return ExpressionAtt;
        }

        @objid ("2b212a5c-6c4e-4374-8dfe-70fe75424ff2")
        public static SmAttribute KindAtt() {
            if (KindAtt == null) {
            	KindAtt = classof().getAttributeDef("Kind");
            }
            return KindAtt;
        }

        @objid ("90fe39cf-868e-4d31-9c88-a2b563435f29")
        public static SmDependency TriggeredDep() {
            if (TriggeredDep == null) {
            	TriggeredDep = classof().getDependencyDef("Triggered");
            }
            return TriggeredDep;
        }

        @objid ("228816ff-2a37-43d1-b8c7-c49b206f2ecc")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("7f7bfa23-1800-4f06-9aed-827753ddc3a9")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("c630156b-44fb-4321-a8f3-8af057ff21a7")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("eded77e6-f471-4e7b-8c82-2ab68dfca3de")
        public static SmDependency ComposedDep() {
            if (ComposedDep == null) {
            	ComposedDep = classof().getDependencyDef("Composed");
            }
            return ComposedDep;
        }

        @objid ("cda948e3-d31c-4d2c-bfea-bb9e4c8a707a")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("c952b2d6-f5fe-4ede-a417-28c70de04562")
        public static SmDependency getComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComposedDep;
        }

        @objid ("b1f13e54-4c93-4c91-8bc8-4b92a831bf33")
        public static SmAttribute getKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindAtt;
        }

        @objid ("e4519a3f-3921-423b-89d9-8e3755d47cba")
        public static SmDependency getTriggeredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggeredDep;
        }

        @objid ("611cc8d6-ff48-44c9-a9aa-bb85693ee60b")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("8d32a300-c62b-46ad-89f5-61a4fc4cf10f")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("c9184c6e-65c8-4334-8cac-09415c844266")
        public static SmAttribute getExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExpressionAtt;
        }

        @objid ("3e1cba2b-f5ff-41bb-9234-76b6a8b79ad9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0035bf06-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("80daafe4-d97c-4fb4-9aac-2acf395b427c")
            public ISmObjectData createData() {
                return new EventData();
            }

            @objid ("ec2aeb2d-8f24-4484-86e8-128fc3e76369")
            public SmObjectImpl createImpl() {
                return new EventImpl();
            }

        }

        @objid ("00362338-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExpressionSmAttribute extends SmAttribute {
            @objid ("ff9be2b6-8dd7-4e63-9de1-0b6e810580d4")
            public Object getValue(ISmObjectData data) {
                return ((EventData) data).mExpression;
            }

            @objid ("fdf1976b-b457-4d8d-a7c1-58ff2adc9632")
            public void setValue(ISmObjectData data, Object value) {
                ((EventData) data).mExpression = value;
            }

        }

        @objid ("003684ae-c4c5-1fd8-97fe-001ec947cd2a")
        public static class KindSmAttribute extends SmAttribute {
            @objid ("da0968c1-b1d3-4b9c-bbf3-547577a6a5cd")
            public Object getValue(ISmObjectData data) {
                return ((EventData) data).mKind;
            }

            @objid ("90727103-5e64-4d92-b3f5-dbb31faf216b")
            public void setValue(ISmObjectData data, Object value) {
                ((EventData) data).mKind = value;
            }

        }

        @objid ("0036e750-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("3772acab-3b3a-4381-8dbb-c2b2990a7d2f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mCalled;
            }

            @objid ("2728a8c6-21bc-4301-aa77-7ad69807725f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mCalled = value;
            }

            @objid ("d1a441e7-dee4-4a67-b11b-ee4d33ed0826")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OccurenceDep();
            }

        }

        @objid ("00375ce4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ComposedSmDependency extends SmSingleDependency {
            @objid ("0a63d806-acfa-4898-8729-0fee8eb81eca")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mComposed;
            }

            @objid ("f16c1f9f-2064-4ff7-916a-31475b721948")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mComposed = value;
            }

            @objid ("a812e9cb-2915-4304-bb26-bbe5e7bc5515")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.EComponentDep();
            }

        }

        @objid ("0037d23c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("ca65e9ad-651e-4d39-bd2d-c75dab1d0eb0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mModel;
            }

            @objid ("f5f5ed63-60c5-4bb0-b59c-09fce0adce3a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mModel = value;
            }

            @objid ("e39deac2-72ae-4e98-ba43-3fbd9573b9bc")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.EOccurenceDep();
            }

        }

        @objid ("003848d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmMultipleDependency {
            @objid ("99fb3e30-b8f3-4d65-b9eb-4f58acf80cf0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EventData)data).mOrigin != null)? ((EventData)data).mOrigin:SmMultipleDependency.EMPTY;
            }

            @objid ("6cf38cf7-898f-4b2e-815f-d244dd4504e0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EventData) data).mOrigin = new ArrayList<>(initialCapacity);
                return ((EventData) data).mOrigin;
            }

            @objid ("976c94bf-f3a7-4d0b-93ae-5e1ba8199f54")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.DefferedDep();
            }

        }

        @objid ("0038ad74-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TriggeredSmDependency extends SmMultipleDependency {
            @objid ("c6a3eafe-9285-4d7d-8449-489a4b7eb623")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EventData)data).mTriggered != null)? ((EventData)data).mTriggered:SmMultipleDependency.EMPTY;
            }

            @objid ("67c01c10-f7eb-4fa1-822b-fa14352d8f1c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EventData) data).mTriggered = new ArrayList<>(initialCapacity);
                return ((EventData) data).mTriggered;
            }

            @objid ("c591cde7-c936-4745-8a1c-dfba5d56b181")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.TriggerDep();
            }

        }

    }

}
