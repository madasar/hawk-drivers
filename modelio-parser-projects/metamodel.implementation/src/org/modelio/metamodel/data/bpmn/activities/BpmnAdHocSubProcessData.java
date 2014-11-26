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
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;
import org.modelio.metamodel.bpmn.activities.BpmnAdHocSubProcess;
import org.modelio.metamodel.impl.bpmn.activities.BpmnAdHocSubProcessImpl;
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

@objid ("007e3c68-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnAdHocSubProcess.class, factory=BpmnAdHocSubProcessData.Metadata.ObjectFactory.class)
public class BpmnAdHocSubProcessData extends BpmnSubProcessData {
    @objid ("08dbab52-88eb-41dd-ab3c-b2a3938491f8")
    @SmaMetaAttribute(metaName="Ordering", type=AdHocOrdering.class, smAttributeClass=Metadata.OrderingSmAttribute.class)
     Object mOrdering = AdHocOrdering.PARALLELORDERING;

    @objid ("6b4a8a5d-4955-48f5-9447-19cace0fd32d")
    @SmaMetaAttribute(metaName="CancelRemainingInstances", type=Boolean.class, smAttributeClass=Metadata.CancelRemainingInstancesSmAttribute.class)
     Object mCancelRemainingInstances = true;

    @objid ("1039458b-4b77-42b8-8a39-c307d7916569")
    @SmaMetaAttribute(metaName="CompletionCondition", type=String.class, smAttributeClass=Metadata.CompletionConditionSmAttribute.class)
     Object mCompletionCondition = "";

    @objid ("e069d286-053b-4b35-974e-270722d885fc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000dc9a6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c692d02f-3703-4c10-a893-6be6f3bfdc09")
        private static SmClass smClass = null;

        @objid ("ad3ad578-6645-465c-a46c-9d31ac3bfde7")
        private static SmAttribute OrderingAtt = null;

        @objid ("cacdab64-58ea-4d47-93b4-c6fa450f22bf")
        private static SmAttribute CancelRemainingInstancesAtt = null;

        @objid ("64542917-ebe8-4e07-95d0-4576a02f5d34")
        private static SmAttribute CompletionConditionAtt = null;

        @objid ("20638c24-e2f4-485f-9bfe-223904988533")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnAdHocSubProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("eca341f7-e359-4b52-94b2-77047f0343eb")
        public static SmAttribute OrderingAtt() {
            if (OrderingAtt == null) {
            	OrderingAtt = classof().getAttributeDef("Ordering");
            }
            return OrderingAtt;
        }

        @objid ("fd1df197-4050-44b6-84a1-174e220ba8f6")
        public static SmAttribute CancelRemainingInstancesAtt() {
            if (CancelRemainingInstancesAtt == null) {
            	CancelRemainingInstancesAtt = classof().getAttributeDef("CancelRemainingInstances");
            }
            return CancelRemainingInstancesAtt;
        }

        @objid ("dec2453d-f380-439f-89a7-9358f80ee557")
        public static SmAttribute CompletionConditionAtt() {
            if (CompletionConditionAtt == null) {
            	CompletionConditionAtt = classof().getAttributeDef("CompletionCondition");
            }
            return CompletionConditionAtt;
        }

        @objid ("9d2b5a8c-ea26-45b9-b7c8-fd2309ed7b07")
        public static SmAttribute getOrderingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OrderingAtt;
        }

        @objid ("07061fde-222e-4d2d-8b98-bf1d03507354")
        public static SmAttribute getCompletionConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionConditionAtt;
        }

        @objid ("3ee6b1e6-2c49-4a3c-8cce-2e5a4fb3ef8a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("51563398-533d-4e28-9fd7-2802edb6627d")
        public static SmAttribute getCancelRemainingInstancesAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CancelRemainingInstancesAtt;
        }

        @objid ("000e0b1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("208a1e5e-b954-41b3-b061-1fb48059e85e")
            public ISmObjectData createData() {
                return new BpmnAdHocSubProcessData();
            }

            @objid ("5ea32469-7817-43c7-b1d8-d69441e8cfe5")
            public SmObjectImpl createImpl() {
                return new BpmnAdHocSubProcessImpl();
            }

        }

        @objid ("000e6c76-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OrderingSmAttribute extends SmAttribute {
            @objid ("c94a0168-ecd9-446f-9fb5-c0b2bf8d46a1")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mOrdering;
            }

            @objid ("a077758f-a79b-4733-9be5-42f6a915ee41")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mOrdering = value;
            }

        }

        @objid ("000ece6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CancelRemainingInstancesSmAttribute extends SmAttribute {
            @objid ("8ee54302-4006-4ff7-a70f-ff9b0bc3e78f")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mCancelRemainingInstances;
            }

            @objid ("d9cf63d5-c55e-4b8d-b467-0d3e01ec963b")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mCancelRemainingInstances = value;
            }

        }

        @objid ("000f3020-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CompletionConditionSmAttribute extends SmAttribute {
            @objid ("3f0f83e3-b3a0-4c26-ae58-021f93301a0c")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mCompletionCondition;
            }

            @objid ("8f6fbda2-f499-4333-a617-a896a3d1b817")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mCompletionCondition = value;
            }

        }

    }

}
