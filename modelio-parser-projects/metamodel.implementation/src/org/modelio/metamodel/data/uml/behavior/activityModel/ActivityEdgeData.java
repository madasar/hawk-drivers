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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityNodeData;
import org.modelio.metamodel.data.uml.behavior.activityModel.InterruptibleActivityRegionData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityEdgeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
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

@objid ("00275f10-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityEdge.class, factory=ActivityEdgeData.Metadata.ObjectFactory.class)
public abstract class ActivityEdgeData extends ModelElementData {
    @objid ("e4da06ee-3086-4563-b1f8-554f755ec614")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("12c84421-d0a9-4e10-acb4-309a31621ce1")
    @SmaMetaAttribute(metaName="Weight", type=String.class, smAttributeClass=Metadata.WeightSmAttribute.class)
     Object mWeight = "1";

    @objid ("bd2b34bb-fa6f-43df-be7c-487d5ed5e7a4")
    @SmaMetaAssociation(metaName="Target", typeDataClass=ActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("43b6fd06-10e7-4ac9-b25c-1d0ecbd15316")
    @SmaMetaAssociation(metaName="Source", typeDataClass=ActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("629ebf62-488e-44a9-badb-a9742cbb154b")
    @SmaMetaAssociation(metaName="Interrupts", typeDataClass=InterruptibleActivityRegionData.class, min=0, max=1, smAssociationClass=Metadata.InterruptsSmDependency.class)
     SmObjectImpl mInterrupts;

    @objid ("2e6cd184-1c65-4599-b81d-8ff55e9dd421")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("c043e3b3-4066-40d5-9bca-6f345849bc90")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b5eca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2c4a445d-5873-4e8b-bd4b-6e595455752c")
        private static SmClass smClass = null;

        @objid ("9128f600-267a-4b29-994b-544e83a6741e")
        private static SmAttribute GuardAtt = null;

        @objid ("7b0460db-6647-4e61-89ee-a86dc1880caf")
        private static SmAttribute WeightAtt = null;

        @objid ("19413f18-cdea-4b41-833b-6267fec1d65d")
        private static SmDependency TargetDep = null;

        @objid ("3f68f03e-f67b-407c-a8b2-1c4adc6c358a")
        private static SmDependency SourceDep = null;

        @objid ("277fcd78-a5ec-45be-8a6d-11895326d42d")
        private static SmDependency InterruptsDep = null;

        @objid ("b77db8c3-3a4d-45eb-810a-fdaf597aa978")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("2fd2b252-8133-45ad-9d7d-2d63b343a8f0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityEdgeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("11069876-db36-49b8-9f18-9e9c5de13fcc")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("a25d60fe-74ec-4892-8272-bd06b1b24b7b")
        public static SmAttribute WeightAtt() {
            if (WeightAtt == null) {
            	WeightAtt = classof().getAttributeDef("Weight");
            }
            return WeightAtt;
        }

        @objid ("28dc86d7-1ec9-4bd6-8fe0-7c23f178dc14")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("00dac991-18e7-4c3c-a21b-973338985e8f")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("2a589216-6672-4ccc-98a0-52132153cf51")
        public static SmDependency InterruptsDep() {
            if (InterruptsDep == null) {
            	InterruptsDep = classof().getDependencyDef("Interrupts");
            }
            return InterruptsDep;
        }

        @objid ("d1fea5fe-3285-4c0d-88d1-7eef2342f971")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("4dda1aeb-8d5a-4bfe-88cc-3e89bd2ee050")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("27b2258c-e208-4339-9025-93c05b556725")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("513ab1ea-4b47-46fd-afe0-28b90a34c4e2")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("c4000d26-38ca-4308-b80f-16b8517c69ee")
        public static SmAttribute getWeightAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return WeightAtt;
        }

        @objid ("4f17bcbb-8739-4aec-ac23-e12c2b3ff516")
        public static SmDependency getInterruptsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterruptsDep;
        }

        @objid ("2845d50d-b245-4217-a82f-b7666ccd4d37")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b6ff2ce7-2f86-45b9-be04-b400a9576f3a")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("008bb0f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e7efac99-e7e0-451a-9a11-fd8d1e2f2b85")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("10195a6c-4251-4ff5-840f-9804869f0f7d")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("008c23a0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("775c33c7-fc66-435e-b358-c8bf20aa4959")
            public Object getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mGuard;
            }

            @objid ("5282f7e9-5111-4efb-9c52-b4cf901b70d4")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityEdgeData) data).mGuard = value;
            }

        }

        @objid ("008c984e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class WeightSmAttribute extends SmAttribute {
            @objid ("b3c34345-3267-46e4-ad41-cf8de1fb1757")
            public Object getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mWeight;
            }

            @objid ("db670767-fa80-4860-b403-f5abd5484c51")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityEdgeData) data).mWeight = value;
            }

        }

        @objid ("008d0de2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("f8f407f7-319e-4a19-8d12-1a0f955471b7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mTarget;
            }

            @objid ("263c36d0-49f9-4b24-bbce-c2238d188e7b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mTarget = value;
            }

            @objid ("4a18c35b-c0bb-474d-b5f9-2911bc95ca04")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.IncomingDep();
            }

        }

        @objid ("008d973a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("aad63adc-46e8-45ed-91e7-6338830d013a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mSource;
            }

            @objid ("15d21fc6-7084-45a1-bb8c-c1bc94c16b05")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mSource = value;
            }

            @objid ("0956fc6b-42fb-402c-b8cc-fd9cb33c7fd7")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OutgoingDep();
            }

        }

        @objid ("008e209c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InterruptsSmDependency extends SmSingleDependency {
            @objid ("c572ffc7-9721-4dc4-a054-0c298b57daf0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mInterrupts;
            }

            @objid ("1daa2058-242b-4734-a4bf-94fb1e63d242")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mInterrupts = value;
            }

            @objid ("7a493a48-1731-4306-a08a-a95f447b56da")
            @Override
            public SmDependency getSymetric() {
                return InterruptibleActivityRegionData.Metadata.InterruptingEdgeDep();
            }

        }

        @objid ("008e9f54-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("331ff9f4-e77f-47c3-9f65-053744fca8b6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityEdgeData)data).mRealizedInformationFlow != null)? ((ActivityEdgeData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("82c8a548-c772-4087-a667-6c18186a2cf6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityEdgeData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((ActivityEdgeData) data).mRealizedInformationFlow;
            }

            @objid ("db967737-498e-42c1-8067-1eedd7a418af")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingActivityEdgeDep();
            }

        }

    }

}
