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
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorParameterData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNodeOrderingKind;
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

@objid ("0039b58e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ObjectNode.class, factory=ObjectNodeData.Metadata.ObjectFactory.class)
public abstract class ObjectNodeData extends ActivityNodeData {
    @objid ("91d6937b-8aaa-4ad6-9bb5-f47db243115d")
    @SmaMetaAttribute(metaName="IsControlType", type=Boolean.class, smAttributeClass=Metadata.IsControlTypeSmAttribute.class)
     Object mIsControlType = false;

    @objid ("ad596ec8-7bab-4e2b-a82d-bdb9fb59b1c0")
    @SmaMetaAttribute(metaName="Ordering", type=ObjectNodeOrderingKind.class, smAttributeClass=Metadata.OrderingSmAttribute.class)
     Object mOrdering = ObjectNodeOrderingKind.FIFO;

    @objid ("bd70a630-21d2-455f-a595-84963d5b1c27")
    @SmaMetaAttribute(metaName="SelectionBehavior", type=String.class, smAttributeClass=Metadata.SelectionBehaviorSmAttribute.class)
     Object mSelectionBehavior = "";

    @objid ("f0a70042-7d3a-46fd-bd05-d81c812625f3")
    @SmaMetaAttribute(metaName="UpperBound", type=String.class, smAttributeClass=Metadata.UpperBoundSmAttribute.class)
     Object mUpperBound = "1";

    @objid ("0d8ebedf-4d9b-4880-bda9-cda09a05d9b0")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("c3bf7ae2-b067-419e-9e27-d817e159045d")
    @SmaMetaAssociation(metaName="RepresentedRealParameter", typeDataClass=BehaviorParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedRealParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedRealParameter;

    @objid ("dba3d4e9-8f4e-470a-8571-3759a764e2b6")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("0b2ecb2f-497d-416b-aac8-3f64f6e8f451")
    @SmaMetaAssociation(metaName="RepresentedRole", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedRoleSmDependency.class, partof = true)
     SmObjectImpl mRepresentedRole;

    @objid ("6f6fd6e2-d359-480b-8c74-ab015d5d47bb")
    @SmaMetaAssociation(metaName="RepresentedAttribute", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAttributeSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAttribute;

    @objid ("5e386dda-7ea1-439b-b1c4-b2bd764964ed")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("37477438-77e0-4265-be42-fac42ff8cd42")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00932934-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0946fcc4-c1ad-417f-9b3a-f286fbaaaac3")
        private static SmClass smClass = null;

        @objid ("ea377e22-2143-4402-8ec7-13551d5f8693")
        private static SmAttribute IsControlTypeAtt = null;

        @objid ("aa42d3ad-7e01-4f3b-b343-f4908dfcc365")
        private static SmAttribute OrderingAtt = null;

        @objid ("579f4b0a-4095-4657-a494-30cf1eef7498")
        private static SmAttribute SelectionBehaviorAtt = null;

        @objid ("4cd52dbc-263a-4525-9008-56d3caab06fd")
        private static SmAttribute UpperBoundAtt = null;

        @objid ("46735431-572a-4384-ad53-ddd7ba569c2f")
        private static SmDependency RepresentedDep = null;

        @objid ("7c774aea-ef8b-43e6-bd7b-39c5b710640b")
        private static SmDependency RepresentedRealParameterDep = null;

        @objid ("f32dbf94-b09d-4abd-8771-8332cbc46675")
        private static SmDependency TypeDep = null;

        @objid ("10315c14-097e-4dd4-a2d8-d4314cde3e75")
        private static SmDependency RepresentedRoleDep = null;

        @objid ("11d0581e-32c1-4b72-bd6b-c4779b7b04de")
        private static SmDependency RepresentedAttributeDep = null;

        @objid ("70f1f229-28d1-4629-a4fb-58000b6b1a31")
        private static SmDependency InStateDep = null;

        @objid ("c1667ab9-154d-4af3-9cdd-77942600e805")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1b2b13be-38cd-4db1-983c-7f27147bf637")
        public static SmAttribute IsControlTypeAtt() {
            if (IsControlTypeAtt == null) {
            	IsControlTypeAtt = classof().getAttributeDef("IsControlType");
            }
            return IsControlTypeAtt;
        }

        @objid ("bbd91e79-e857-4f29-961c-7f6efcf2b0af")
        public static SmAttribute OrderingAtt() {
            if (OrderingAtt == null) {
            	OrderingAtt = classof().getAttributeDef("Ordering");
            }
            return OrderingAtt;
        }

        @objid ("fd588ebf-a857-4def-98ef-c46e225d17dc")
        public static SmAttribute SelectionBehaviorAtt() {
            if (SelectionBehaviorAtt == null) {
            	SelectionBehaviorAtt = classof().getAttributeDef("SelectionBehavior");
            }
            return SelectionBehaviorAtt;
        }

        @objid ("308bedc3-cfe8-4bb2-977f-b8ea04642f7b")
        public static SmAttribute UpperBoundAtt() {
            if (UpperBoundAtt == null) {
            	UpperBoundAtt = classof().getAttributeDef("UpperBound");
            }
            return UpperBoundAtt;
        }

        @objid ("ea308a0c-45e3-48df-8d5f-b7e8026a5a13")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("042fdaba-8fe8-4504-b347-f4e5084f0812")
        public static SmDependency RepresentedRealParameterDep() {
            if (RepresentedRealParameterDep == null) {
            	RepresentedRealParameterDep = classof().getDependencyDef("RepresentedRealParameter");
            }
            return RepresentedRealParameterDep;
        }

        @objid ("d6c1024b-e4e9-4d51-8af9-6a66a7fef874")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("9e93711c-806d-4f63-b81f-4b10de38a5e8")
        public static SmDependency RepresentedRoleDep() {
            if (RepresentedRoleDep == null) {
            	RepresentedRoleDep = classof().getDependencyDef("RepresentedRole");
            }
            return RepresentedRoleDep;
        }

        @objid ("880ec6fd-2aa0-4713-8d91-571869f7db25")
        public static SmDependency RepresentedAttributeDep() {
            if (RepresentedAttributeDep == null) {
            	RepresentedAttributeDep = classof().getDependencyDef("RepresentedAttribute");
            }
            return RepresentedAttributeDep;
        }

        @objid ("ef68dd83-c074-4215-b5fb-b0e9d7a88ed0")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("1f09f1db-3d1f-4f2f-b3d8-c9c5e2dbe593")
        public static SmAttribute getIsControlTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsControlTypeAtt;
        }

        @objid ("47852ec9-2e8a-4771-8ed5-5f449ed0de78")
        public static SmAttribute getUpperBoundAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UpperBoundAtt;
        }

        @objid ("e0c51d44-12be-4276-8f26-0f673ec9acaa")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("5b477da2-a51d-49ea-aeca-c0f08aca8e3b")
        public static SmDependency getRepresentedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAttributeDep;
        }

        @objid ("91bd59b1-86dc-4ca3-a42a-b384d2e89fac")
        public static SmDependency getRepresentedRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedRoleDep;
        }

        @objid ("6e773e8e-bc15-47aa-86bc-e8228a551a91")
        public static SmAttribute getOrderingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OrderingAtt;
        }

        @objid ("8154783c-e7bc-4b67-be62-c3d64bbec231")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("29c389ca-e1d9-4879-bab3-fc5ab25f159e")
        public static SmDependency getRepresentedRealParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedRealParameterDep;
        }

        @objid ("9ef6b961-fd2e-48d1-b2c7-f041ea957703")
        public static SmAttribute getSelectionBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectionBehaviorAtt;
        }

        @objid ("acd363d9-5846-44c3-ab88-f1d9407aba9c")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("c4b38859-a0e0-44bb-864d-d1285235f8e3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00936b06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("71654f16-5e17-4ec6-972f-0a24c124a223")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("9dc365ba-fd7b-4364-be7f-78d8abec89c8")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0093d00a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsControlTypeSmAttribute extends SmAttribute {
            @objid ("e0eefde9-5944-4477-9c20-d691ad6e29a1")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mIsControlType;
            }

            @objid ("67fb1186-4a7f-4a03-81fd-ad9b346649f7")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mIsControlType = value;
            }

        }

        @objid ("009432b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OrderingSmAttribute extends SmAttribute {
            @objid ("c6dda9c8-8919-4bd3-90b9-12d9f8cc1c0b")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mOrdering;
            }

            @objid ("bbccdae4-e821-48ca-9748-e65ac17ebcf0")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mOrdering = value;
            }

        }

        @objid ("00949634-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SelectionBehaviorSmAttribute extends SmAttribute {
            @objid ("917f1a72-643a-48fe-8fb0-3fac20db30b5")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mSelectionBehavior;
            }

            @objid ("1f4837d3-6d33-49f2-aafa-dfb623bdfc05")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mSelectionBehavior = value;
            }

        }

        @objid ("0094fa98-c4c2-1fd8-97fe-001ec947cd2a")
        public static class UpperBoundSmAttribute extends SmAttribute {
            @objid ("bdfab0f1-1178-4798-a126-c940631382e8")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mUpperBound;
            }

            @objid ("d1f50b10-5842-4bc2-b7a1-8fe83e745b5c")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mUpperBound = value;
            }

        }

        @objid ("0095615e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("b42968bf-c481-4759-bd5d-534cd24b6edf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mType;
            }

            @objid ("c9f8c09a-a9a3-46c7-bfc9-13ee9988fecd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mType = value;
            }

            @objid ("3689fdf0-3154-4a73-b094-70bcc3e60895")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceObjectNodeDep();
            }

        }

        @objid ("0095d940-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("c313d66d-c301-4563-8b4f-b2b57fc3ab13")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mInState;
            }

            @objid ("6e4dd612-304e-4c6c-94dc-1e01c54ddfe4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mInState = value;
            }

            @objid ("fc834533-1330-4238-b82c-2fb13c1d1b76")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfDep();
            }

        }

        @objid ("009652c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("87265b44-78d5-4c50-b516-a326028a1c0a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresented;
            }

            @objid ("8934adf3-2f0b-4e0c-8b94-682fcd7278aa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresented = value;
            }

            @objid ("7bf0d0cb-32a5-4ec6-abb9-26e6664a9588")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0096cbf2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAttributeSmDependency extends SmSingleDependency {
            @objid ("5d4a5cbc-0f83-45c2-b4c5-fa0250419eff")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedAttribute;
            }

            @objid ("c1f983af-76ec-4e81-b67e-7dc46c4cfd70")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedAttribute = value;
            }

            @objid ("4e5f6b48-14f1-443a-b832-53f678caffd8")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0097464a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedRoleSmDependency extends SmSingleDependency {
            @objid ("fc6cddbf-bf54-4d1b-aa5c-4f4f7446e7ec")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedRole;
            }

            @objid ("e37e707e-de75-4ed2-a504-9bd8fa5707d0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedRole = value;
            }

            @objid ("3fd98beb-338d-46cc-b920-0f791e3683db")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0097c372-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedRealParameterSmDependency extends SmSingleDependency {
            @objid ("dabd0083-1dc6-40d2-a11a-4c4a7fe0865a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedRealParameter;
            }

            @objid ("c3848e42-129f-43ff-a6d9-e8fbca1277bc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedRealParameter = value;
            }

            @objid ("ce00aa9e-efed-41e2-b72c-489a900cd2aa")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.RepresentingObjectNodeDep();
            }

        }

    }

}
