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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectFlowImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;
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

@objid ("0038ffd6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ObjectFlow.class, factory=ObjectFlowData.Metadata.ObjectFactory.class)
public class ObjectFlowData extends ActivityEdgeData {
    @objid ("116743c4-90c4-440a-b48e-db58fd59f92c")
    @SmaMetaAttribute(metaName="TransformationBehavior", type=String.class, smAttributeClass=Metadata.TransformationBehaviorSmAttribute.class)
     Object mTransformationBehavior = "";

    @objid ("ce95c3b5-597d-49d2-9afe-e0f562f28574")
    @SmaMetaAttribute(metaName="SelectionBehavior", type=String.class, smAttributeClass=Metadata.SelectionBehaviorSmAttribute.class)
     Object mSelectionBehavior = "";

    @objid ("d8bed3c1-b302-46ab-a169-efbcc4278d81")
    @SmaMetaAttribute(metaName="IsMultiCast", type=Boolean.class, smAttributeClass=Metadata.IsMultiCastSmAttribute.class)
     Object mIsMultiCast = false;

    @objid ("6456e9b8-4e1f-4800-8b1e-592ef8fb4c21")
    @SmaMetaAttribute(metaName="IsMultiReceive", type=Boolean.class, smAttributeClass=Metadata.IsMultiReceiveSmAttribute.class)
     Object mIsMultiReceive = false;

    @objid ("9354094a-8105-4389-8735-2e74dfea8e8d")
    @SmaMetaAttribute(metaName="Effect", type=ObjectFlowEffectKind.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = ObjectFlowEffectKind.READFLOW;

    @objid ("0bc51e17-b1ae-40f0-82e8-b56857b72d86")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006907f8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("40b52f02-cd14-4938-95ce-b502e796bd4f")
        private static SmClass smClass = null;

        @objid ("19a8e89f-54a7-4bb0-9d9b-8c25fbf2500f")
        private static SmAttribute TransformationBehaviorAtt = null;

        @objid ("b0f6eb78-42e2-4abc-9548-df4bbb13d7e8")
        private static SmAttribute SelectionBehaviorAtt = null;

        @objid ("1f48bbad-c140-43aa-81ef-05cfb3b42962")
        private static SmAttribute IsMultiCastAtt = null;

        @objid ("be643b8c-59bd-4381-b0a9-008d896b4496")
        private static SmAttribute IsMultiReceiveAtt = null;

        @objid ("f649354e-0580-4b60-b55b-34a2541699d4")
        private static SmAttribute EffectAtt = null;

        @objid ("c0427d8c-6a4b-417f-9678-abd8a7897436")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2ce845bd-35bc-4412-9208-b2fc97c88804")
        public static SmAttribute TransformationBehaviorAtt() {
            if (TransformationBehaviorAtt == null) {
            	TransformationBehaviorAtt = classof().getAttributeDef("TransformationBehavior");
            }
            return TransformationBehaviorAtt;
        }

        @objid ("79b05ce7-5a16-4ee1-a7b6-d7dc69192e0d")
        public static SmAttribute SelectionBehaviorAtt() {
            if (SelectionBehaviorAtt == null) {
            	SelectionBehaviorAtt = classof().getAttributeDef("SelectionBehavior");
            }
            return SelectionBehaviorAtt;
        }

        @objid ("a0eee545-69f1-4f60-a7f5-68952c25bc9e")
        public static SmAttribute IsMultiCastAtt() {
            if (IsMultiCastAtt == null) {
            	IsMultiCastAtt = classof().getAttributeDef("IsMultiCast");
            }
            return IsMultiCastAtt;
        }

        @objid ("fc58f017-bf31-4f7f-a324-cfa266b5095d")
        public static SmAttribute IsMultiReceiveAtt() {
            if (IsMultiReceiveAtt == null) {
            	IsMultiReceiveAtt = classof().getAttributeDef("IsMultiReceive");
            }
            return IsMultiReceiveAtt;
        }

        @objid ("828d3c5c-93de-4a18-93e3-e78df44e1cef")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("4cf402f7-8eb8-4fdd-86ff-6faed41b37aa")
        public static SmAttribute getIsMultiCastAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultiCastAtt;
        }

        @objid ("67e6e3f6-b129-4ef0-9139-441efda09f76")
        public static SmAttribute getSelectionBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectionBehaviorAtt;
        }

        @objid ("6797e2d5-5bb9-401e-b7b3-e6054c46b095")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("0afa8192-e5e6-45d1-b61a-57771de253d9")
        public static SmAttribute getIsMultiReceiveAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultiReceiveAtt;
        }

        @objid ("86010ad5-829b-4a75-a0a5-c58a5d3e9df1")
        public static SmAttribute getTransformationBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TransformationBehaviorAtt;
        }

        @objid ("acccb953-4914-4fe0-ab5e-8dc6ac7b49f9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00695320-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("36b62c28-878c-4a86-a884-dd688e0ed6bf")
            public ISmObjectData createData() {
                return new ObjectFlowData();
            }

            @objid ("dd5c1630-6f85-4e77-b81d-3acde46e02d8")
            public SmObjectImpl createImpl() {
                return new ObjectFlowImpl();
            }

        }

        @objid ("0069b5d6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TransformationBehaviorSmAttribute extends SmAttribute {
            @objid ("d665d40b-f86f-43fe-80f3-bedb5ce52bb6")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mTransformationBehavior;
            }

            @objid ("93ba59bd-2d7a-4825-9e38-182bcd705c73")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mTransformationBehavior = value;
            }

        }

        @objid ("006a1670-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SelectionBehaviorSmAttribute extends SmAttribute {
            @objid ("967303a3-2846-4a88-802b-1f8a810bbdcf")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mSelectionBehavior;
            }

            @objid ("159d3dd5-9465-464b-91d1-fe82ab798647")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mSelectionBehavior = value;
            }

        }

        @objid ("006a7854-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsMultiCastSmAttribute extends SmAttribute {
            @objid ("973c0824-f013-4d6e-b6b5-3977a83d23c0")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mIsMultiCast;
            }

            @objid ("38c51ff2-66bb-4cd4-963f-7e286a213827")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mIsMultiCast = value;
            }

        }

        @objid ("006ada56-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsMultiReceiveSmAttribute extends SmAttribute {
            @objid ("83e4d936-5929-4461-a488-1d3782c1d791")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mIsMultiReceive;
            }

            @objid ("1a6bfe04-69b6-4f44-8a76-328b09c376fd")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mIsMultiReceive = value;
            }

        }

        @objid ("006b3cf8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("68991a51-eadc-441f-bd06-1b42f1bf5d96")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mEffect;
            }

            @objid ("5443f7e8-6ac8-48d4-bc99-8b067a66cf18")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mEffect = value;
            }

        }

    }

}
