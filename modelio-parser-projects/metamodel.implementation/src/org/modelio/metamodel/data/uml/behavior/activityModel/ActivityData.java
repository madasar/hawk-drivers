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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityGroupData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityNodeData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
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

@objid ("002659ee-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Activity.class, factory=ActivityData.Metadata.ObjectFactory.class, cmsnode=true)
public class ActivityData extends BehaviorData {
    @objid ("4a9eca22-7e25-47bb-b43a-10410f55d744")
    @SmaMetaAttribute(metaName="IsSingleExecution", type=Boolean.class, smAttributeClass=Metadata.IsSingleExecutionSmAttribute.class)
     Object mIsSingleExecution = false;

    @objid ("a6a34780-018f-497e-95d7-292868581f61")
    @SmaMetaAttribute(metaName="IsReadOnly", type=Boolean.class, smAttributeClass=Metadata.IsReadOnlySmAttribute.class)
     Object mIsReadOnly = false;

    @objid ("f30c18de-89d7-4214-b77c-b08a4e982f8f")
    @SmaMetaAssociation(metaName="OwnedGroup", typeDataClass=ActivityGroupData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedGroupSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedGroup = null;

    @objid ("4f860c6a-7521-4f3c-8b27-abc3d22c61a2")
    @SmaMetaAssociation(metaName="OwnedNode", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNodeSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNode = null;

    @objid ("5bc0b12b-6c5e-4b21-a82e-b182ecd08cac")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0044107e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("985829c4-78c9-460f-8b92-25c743122d3d")
        private static SmClass smClass = null;

        @objid ("cfbd063b-4d87-4b42-ac72-095662c80b1d")
        private static SmAttribute IsSingleExecutionAtt = null;

        @objid ("432d8086-3190-4066-a5e3-256146e0e884")
        private static SmAttribute IsReadOnlyAtt = null;

        @objid ("24e41658-9d7b-4274-87d1-418fe3de4eb1")
        private static SmDependency OwnedGroupDep = null;

        @objid ("5e529578-4dab-4174-a8a6-014cbf7e5ca8")
        private static SmDependency OwnedNodeDep = null;

        @objid ("07c2ac8f-03b7-41bd-bf13-d97c42886d4b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7dcfa8d8-4e8c-42f2-9312-335cdf780ce7")
        public static SmAttribute IsSingleExecutionAtt() {
            if (IsSingleExecutionAtt == null) {
            	IsSingleExecutionAtt = classof().getAttributeDef("IsSingleExecution");
            }
            return IsSingleExecutionAtt;
        }

        @objid ("470fbc5d-fbf6-47b8-bb60-0a24ce1d641b")
        public static SmAttribute IsReadOnlyAtt() {
            if (IsReadOnlyAtt == null) {
            	IsReadOnlyAtt = classof().getAttributeDef("IsReadOnly");
            }
            return IsReadOnlyAtt;
        }

        @objid ("72e9a656-59ae-4389-a58e-a978dc15e397")
        public static SmDependency OwnedGroupDep() {
            if (OwnedGroupDep == null) {
            	OwnedGroupDep = classof().getDependencyDef("OwnedGroup");
            }
            return OwnedGroupDep;
        }

        @objid ("0265383f-a882-4baf-b14d-54136e7a29da")
        public static SmDependency OwnedNodeDep() {
            if (OwnedNodeDep == null) {
            	OwnedNodeDep = classof().getDependencyDef("OwnedNode");
            }
            return OwnedNodeDep;
        }

        @objid ("4f3d40da-43d2-4b6e-b6e5-1aeb19bf37d3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ae4d6029-3030-46bc-b452-04c9750b1a7d")
        public static SmAttribute getIsReadOnlyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsReadOnlyAtt;
        }

        @objid ("c40115dc-3287-422a-950e-5d05803c8cef")
        public static SmDependency getOwnedGroupDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedGroupDep;
        }

        @objid ("6d4199b5-f34b-43e2-81b2-27ff63b8b1d8")
        public static SmDependency getOwnedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNodeDep;
        }

        @objid ("2e561c86-50d0-4021-b6c0-217b8b1e440a")
        public static SmAttribute getIsSingleExecutionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSingleExecutionAtt;
        }

        @objid ("004450fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5b9e1bc7-3c0c-4d02-b877-3c919e3b59d8")
            public ISmObjectData createData() {
                return new ActivityData();
            }

            @objid ("5483e7cb-11e6-4aa6-bd31-1998640e5cea")
            public SmObjectImpl createImpl() {
                return new ActivityImpl();
            }

        }

        @objid ("0044b2fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSingleExecutionSmAttribute extends SmAttribute {
            @objid ("6ce55522-cc1b-43fe-b4bc-328d55a70351")
            public Object getValue(ISmObjectData data) {
                return ((ActivityData) data).mIsSingleExecution;
            }

            @objid ("a05b57c4-9b66-45a1-ae9a-b7cd9d4f5718")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityData) data).mIsSingleExecution = value;
            }

        }

        @objid ("004513a2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsReadOnlySmAttribute extends SmAttribute {
            @objid ("0762a2b4-61b7-4872-96b2-2fadd86e4c47")
            public Object getValue(ISmObjectData data) {
                return ((ActivityData) data).mIsReadOnly;
            }

            @objid ("d83e6a90-e6ce-4b5f-be68-16a8954f196a")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityData) data).mIsReadOnly = value;
            }

        }

        @objid ("004575d6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedNodeSmDependency extends SmMultipleDependency {
            @objid ("ff5a21c1-7f81-4f07-af1c-f93d7a2279ed")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityData)data).mOwnedNode != null)? ((ActivityData)data).mOwnedNode:SmMultipleDependency.EMPTY;
            }

            @objid ("9284a737-5cac-4dc8-9e40-36072b2e47a2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityData) data).mOwnedNode = new ArrayList<>(initialCapacity);
                return ((ActivityData) data).mOwnedNode;
            }

            @objid ("f0a30b83-0a76-4c22-b25a-14ce0c4cdd24")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerDep();
            }

        }

        @objid ("0045d922-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedGroupSmDependency extends SmMultipleDependency {
            @objid ("2309e110-382c-4649-937b-7764df1ddb80")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityData)data).mOwnedGroup != null)? ((ActivityData)data).mOwnedGroup:SmMultipleDependency.EMPTY;
            }

            @objid ("75d06e2c-404a-4ac5-8760-2cbbd7d33385")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityData) data).mOwnedGroup = new ArrayList<>(initialCapacity);
                return ((ActivityData) data).mOwnedGroup;
            }

            @objid ("72fb202f-c58d-411d-add1-5f47759e7592")
            @Override
            public SmDependency getSymetric() {
                return ActivityGroupData.Metadata.InActivityDep();
            }

        }

    }

}
