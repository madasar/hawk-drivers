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
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorParameterImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
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

@objid ("00416784-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BehaviorParameter.class, factory=BehaviorParameterData.Metadata.ObjectFactory.class)
public class BehaviorParameterData extends ParameterData {
    @objid ("d192fd97-4a56-4d04-85dc-f9b273fddbd3")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("87fa58c1-00bd-42b8-ac70-30d38501891d")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("be2f338a-f135-48a8-b854-6065971efb83")
    @SmaMetaAssociation(metaName="Mapped", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.MappedSmDependency.class, partof = true)
     SmObjectImpl mMapped;

    @objid ("2939d569-50fb-4d03-9320-aeca1aaf41ee")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002def06-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f927ae31-4e4a-417e-9825-72dbf28596a7")
        private static SmClass smClass = null;

        @objid ("d62968ae-6fb5-47e8-990b-b12c13c46783")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("04723473-5b32-43f0-942c-0fa5ef4000a9")
        private static SmDependency OwnerDep = null;

        @objid ("68d7c87c-1daa-4ff7-9221-71df15cc55c7")
        private static SmDependency MappedDep = null;

        @objid ("96949421-e032-43a0-97bc-631110f51949")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehaviorParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("954952f4-ea35-4f44-a708-d04a2abc75d3")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("f9935c82-881d-4534-beda-a4c69c87d3e5")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("5b0ba8af-aafa-4849-a930-6ffb4d78548e")
        public static SmDependency MappedDep() {
            if (MappedDep == null) {
            	MappedDep = classof().getDependencyDef("Mapped");
            }
            return MappedDep;
        }

        @objid ("9970a5c0-51df-4473-804c-3fd36e0a1084")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7ead04c5-9328-4271-9951-83e1b629c0a0")
        public static SmDependency getMappedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MappedDep;
        }

        @objid ("af87162b-b31c-4593-9478-367b83f30522")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("8bebc6ec-2452-453a-b01a-d74a1f0fdb7c")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("002e315a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c1bdbf5b-9156-4dba-acba-cce6baac80c7")
            public ISmObjectData createData() {
                return new BehaviorParameterData();
            }

            @objid ("eaaca978-b9f3-4e3b-9a2c-bbe1c1fd5bcc")
            public SmObjectImpl createImpl() {
                return new BehaviorParameterImpl();
            }

        }

        @objid ("002e9834-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("e0b9e25f-28ce-4b58-a349-48c279e17a88")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorParameterData) data).mOwner;
            }

            @objid ("46446c48-e178-49ca-b662-a93d32237455")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorParameterData) data).mOwner = value;
            }

            @objid ("e1d7bc97-c007-4d27-bddd-79f764908fc3")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.ParameterDep();
            }

        }

        @objid ("002f0ee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("00ea854a-96be-4d3b-8518-7e636cc0dacd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorParameterData)data).mRepresentingObjectNode != null)? ((BehaviorParameterData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("bd85684d-2d1e-42d4-8db6-b290eeebfee3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorParameterData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((BehaviorParameterData) data).mRepresentingObjectNode;
            }

            @objid ("acfc64fa-b7d6-4192-afe2-31bd55dce6b5")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedRealParameterDep();
            }

        }

        @objid ("002f7268-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MappedSmDependency extends SmSingleDependency {
            @objid ("b23f24ae-56c7-4fb3-b875-85d93553a62c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorParameterData) data).mMapped;
            }

            @objid ("608053af-4aa1-4d7d-bc36-bab73659ffde")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorParameterData) data).mMapped = value;
            }

            @objid ("dfad129e-f610-401c-95b7-d5df268bd28c")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BehaviorParamDep();
            }

        }

    }

}
