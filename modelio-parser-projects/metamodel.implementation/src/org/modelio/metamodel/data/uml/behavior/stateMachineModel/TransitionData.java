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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateVertexData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TransitionImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
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

@objid ("00561594-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Transition.class, factory=TransitionData.Metadata.ObjectFactory.class)
public class TransitionData extends ModelElementData {
    @objid ("be3da40d-f978-40fe-b60c-eb1638fb85d7")
    @SmaMetaAttribute(metaName="Effect", type=String.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = "";

    @objid ("192a58db-f354-43be-a6be-3ddd021143b9")
    @SmaMetaAttribute(metaName="ReceivedEvents", type=String.class, smAttributeClass=Metadata.ReceivedEventsSmAttribute.class)
     Object mReceivedEvents = "";

    @objid ("a384169a-9ebc-4c6b-b226-0c3eed69ca24")
    @SmaMetaAttribute(metaName="SentEvents", type=String.class, smAttributeClass=Metadata.SentEventsSmAttribute.class)
     Object mSentEvents = "";

    @objid ("8b6448f5-a38d-4850-a6d7-d8aec1d49982")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("403df84c-9c11-42e0-813a-429aac28b996")
    @SmaMetaAttribute(metaName="PostCondition", type=String.class, smAttributeClass=Metadata.PostConditionSmAttribute.class)
     Object mPostCondition = "";

    @objid ("1b2bb14d-b0f3-47d5-9923-991362056bd0")
    @SmaMetaAssociation(metaName="Processed", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ProcessedSmDependency.class, partof = true)
     SmObjectImpl mProcessed;

    @objid ("3bd2e2e5-ff82-4433-afc5-3969528eb599")
    @SmaMetaAssociation(metaName="Trigger", typeDataClass=EventData.class, min=0, max=1, smAssociationClass=Metadata.TriggerSmDependency.class, partof = true)
     SmObjectImpl mTrigger;

    @objid ("7d9e1a37-b739-4340-8129-2a9e85d799cc")
    @SmaMetaAssociation(metaName="BehaviorEffect", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.BehaviorEffectSmDependency.class, partof = true)
     SmObjectImpl mBehaviorEffect;

    @objid ("1a612ef2-3c12-451d-bc31-517d9c9e1b06")
    @SmaMetaAssociation(metaName="Target", typeDataClass=StateVertexData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("4018ece2-4f92-4d1f-9e7c-9b75b494cafd")
    @SmaMetaAssociation(metaName="Source", typeDataClass=StateVertexData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("f2d2bd9b-44ad-4302-9982-63b6371ebea8")
    @SmaMetaAssociation(metaName="Effects", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.EffectsSmDependency.class, partof = true)
     SmObjectImpl mEffects;

    @objid ("e8318ed8-7bd5-46dd-af74-d27ebcf77b72")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0060fff4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("31498e91-1a47-41b2-9b81-e4a81bee7556")
        private static SmClass smClass = null;

        @objid ("b3c5ab7a-2fd4-42c6-a477-fc3663871ece")
        private static SmAttribute EffectAtt = null;

        @objid ("ef8b8479-a4ab-4039-9a5d-2d9363d26770")
        private static SmAttribute ReceivedEventsAtt = null;

        @objid ("a03b6388-6adc-4af3-b476-1d01b518cbf7")
        private static SmAttribute SentEventsAtt = null;

        @objid ("eb678353-f763-462d-8120-943491ca70c6")
        private static SmAttribute GuardAtt = null;

        @objid ("50efbfc6-9e11-4e1c-b18d-62bd5f1e8ebd")
        private static SmAttribute PostConditionAtt = null;

        @objid ("0bfc17c2-96e1-4178-bf97-baaf7c93fb10")
        private static SmDependency ProcessedDep = null;

        @objid ("0849dde8-a08a-4075-9675-db76f063a290")
        private static SmDependency TriggerDep = null;

        @objid ("8e9857fb-2b03-4a14-9aba-7bf9b5732e89")
        private static SmDependency BehaviorEffectDep = null;

        @objid ("fe6047fe-125e-409c-960a-87ba325f5691")
        private static SmDependency TargetDep = null;

        @objid ("a2a2cb5e-53eb-4f88-877e-584a2a9cf1eb")
        private static SmDependency SourceDep = null;

        @objid ("6b535a13-e8b4-4317-a53f-bb2f161a8a3e")
        private static SmDependency EffectsDep = null;

        @objid ("460a6737-b44c-4185-a8c3-dfddb7a57b66")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TransitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("513d60aa-5fa9-43f6-9abf-223d8981c24b")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("d4d284b2-1587-4141-a7c8-dce7f4d05efb")
        public static SmAttribute ReceivedEventsAtt() {
            if (ReceivedEventsAtt == null) {
            	ReceivedEventsAtt = classof().getAttributeDef("ReceivedEvents");
            }
            return ReceivedEventsAtt;
        }

        @objid ("f0a94775-871c-4d8d-a246-1ed5985a088a")
        public static SmAttribute SentEventsAtt() {
            if (SentEventsAtt == null) {
            	SentEventsAtt = classof().getAttributeDef("SentEvents");
            }
            return SentEventsAtt;
        }

        @objid ("d52e6a26-e6e2-4925-b46b-b822d3e5daf6")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("f666c245-0142-4270-b1e1-287fb6b74b1e")
        public static SmAttribute PostConditionAtt() {
            if (PostConditionAtt == null) {
            	PostConditionAtt = classof().getAttributeDef("PostCondition");
            }
            return PostConditionAtt;
        }

        @objid ("1c1d8c06-4b23-4385-88dd-f3b38c27ea71")
        public static SmDependency ProcessedDep() {
            if (ProcessedDep == null) {
            	ProcessedDep = classof().getDependencyDef("Processed");
            }
            return ProcessedDep;
        }

        @objid ("75da8216-a442-4505-95f6-44dad980f26d")
        public static SmDependency TriggerDep() {
            if (TriggerDep == null) {
            	TriggerDep = classof().getDependencyDef("Trigger");
            }
            return TriggerDep;
        }

        @objid ("7442c70f-4ed6-4eb9-9f7d-4face27faff8")
        public static SmDependency BehaviorEffectDep() {
            if (BehaviorEffectDep == null) {
            	BehaviorEffectDep = classof().getDependencyDef("BehaviorEffect");
            }
            return BehaviorEffectDep;
        }

        @objid ("0818c08b-8baa-4b4f-a53c-31b2fdf96892")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("0db1a593-2064-427b-b526-9740bc17bad1")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("18137f69-9fe3-4621-b06a-c70cc0bfbdc5")
        public static SmDependency EffectsDep() {
            if (EffectsDep == null) {
            	EffectsDep = classof().getDependencyDef("Effects");
            }
            return EffectsDep;
        }

        @objid ("55b791d5-bfe8-43d8-9f2f-b5e371e951c2")
        public static SmDependency getTriggerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggerDep;
        }

        @objid ("d22d6d0a-9213-464a-b3c2-59f6160f40be")
        public static SmDependency getProcessedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessedDep;
        }

        @objid ("8c76af68-b683-4c73-a330-ed5fc52f7590")
        public static SmAttribute getPostConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PostConditionAtt;
        }

        @objid ("65788ca1-8389-4961-af74-9d6b32c07cbd")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("75f62ca8-3998-4a65-b45a-5c4d6edce687")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("016e7da9-3524-41a0-8459-e350eb459867")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("54631b00-229a-46bc-98c0-3913008a1fdf")
        public static SmAttribute getReceivedEventsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedEventsAtt;
        }

        @objid ("2c914d01-afbc-4277-8b91-a98db6b700d5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("36bfb150-7216-446d-81bd-d3ba251f883c")
        public static SmDependency getBehaviorEffectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorEffectDep;
        }

        @objid ("8078d1fa-42a0-4959-9aed-ccffc404b52f")
        public static SmDependency getEffectsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectsDep;
        }

        @objid ("fd01008a-ae47-4d90-944c-1ea2e8095a15")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("d3a61ba7-522d-4e87-968e-20edfb8897a8")
        public static SmAttribute getSentEventsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentEventsAtt;
        }

        @objid ("006142c0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ef16c275-d595-4153-906f-7dd6cb6c3423")
            public ISmObjectData createData() {
                return new TransitionData();
            }

            @objid ("7b4d99b6-85a2-4215-975a-bb74ff4be2ee")
            public SmObjectImpl createImpl() {
                return new TransitionImpl();
            }

        }

        @objid ("0061a56c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("b4bd51b2-e346-4cb7-8729-ffe40c60abde")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mEffect;
            }

            @objid ("336e24d7-bd26-4e6f-87e0-b1c20236df76")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mEffect = value;
            }

        }

        @objid ("00620872-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivedEventsSmAttribute extends SmAttribute {
            @objid ("0eed9f80-d037-43b5-a9e7-3b5b32740a54")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mReceivedEvents;
            }

            @objid ("12fa1a68-fa40-4fe6-a7ef-c7605631f9a1")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mReceivedEvents = value;
            }

        }

        @objid ("00626b32-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SentEventsSmAttribute extends SmAttribute {
            @objid ("e7ac17fb-e356-4387-aa1e-226ffb1ee7f7")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mSentEvents;
            }

            @objid ("0d64e10f-5373-4318-bcf6-c78c32f88eb2")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mSentEvents = value;
            }

        }

        @objid ("0062ce56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("d77ac551-e53f-4b58-acb7-46cd9d01b1a7")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mGuard;
            }

            @objid ("da2e23a5-658c-47c1-967e-31a9cee01e2b")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mGuard = value;
            }

        }

        @objid ("00633274-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PostConditionSmAttribute extends SmAttribute {
            @objid ("8c7d3c9a-ba9b-4d24-b5cb-831e9e643738")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mPostCondition;
            }

            @objid ("e19c7034-46f6-42ca-80d2-b428ed3ba3b9")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mPostCondition = value;
            }

        }

        @objid ("00639a84-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BehaviorEffectSmDependency extends SmSingleDependency {
            @objid ("ca0b1b30-7828-4fe4-8755-dc57567b506a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mBehaviorEffect;
            }

            @objid ("c5df56e4-e844-4c4d-a624-405a07ca0ec0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mBehaviorEffect = value;
            }

            @objid ("2abdf6a1-c4a4-4d16-9ff7-a8d383497be0")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.EffectOfDep();
            }

        }

        @objid ("006413ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectsSmDependency extends SmSingleDependency {
            @objid ("5b826a97-ba1c-41bd-b077-9ee38286cc5c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mEffects;
            }

            @objid ("89d0eeb4-8d8d-4ff9-b0c0-a8180524e22f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mEffects = value;
            }

            @objid ("0baf560c-f2c0-4e0c-b846-4b3641dceec0")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.SendsDep();
            }

        }

        @objid ("00648d86-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessedSmDependency extends SmSingleDependency {
            @objid ("f5ffe15b-aaea-4922-b64d-a1ff2f60a180")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mProcessed;
            }

            @objid ("38e61cba-389d-4cc6-b646-76b36b7dffc6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mProcessed = value;
            }

            @objid ("f3d89021-7ded-4e6c-8dfd-d3f0bcbd929d")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.InvokerDep();
            }

        }

        @objid ("0065072a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("5787da52-4f82-4d19-824c-0642d86e242b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mSource;
            }

            @objid ("71d6ce88-bdc8-440d-a0b1-dce4cd6b77e8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mSource = value;
            }

            @objid ("51bb99d6-a0a2-4082-af04-8a091855b378")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.OutGoingDep();
            }

        }

        @objid ("006581a0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("eb96629a-7225-4384-87d2-854945bde824")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mTarget;
            }

            @objid ("d658e229-d51e-4586-b923-9147f5b203bd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mTarget = value;
            }

            @objid ("a46afe41-7512-452f-b087-53fc58856504")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.IncomingDep();
            }

        }

        @objid ("0065fc48-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TriggerSmDependency extends SmSingleDependency {
            @objid ("a5f2ad29-f2bf-4577-978a-7cffe16d645d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mTrigger;
            }

            @objid ("cf2b10a8-9d3b-4102-b7ab-bf1e25634183")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mTrigger = value;
            }

            @objid ("c83170cf-10da-49b6-bd8a-6f31c8adeb61")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.TriggeredDep();
            }

        }

    }

}
