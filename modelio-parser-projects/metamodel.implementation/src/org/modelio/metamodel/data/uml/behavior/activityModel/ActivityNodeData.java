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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityEdgeData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityPartitionData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ClauseData;
import org.modelio.metamodel.data.uml.behavior.activityModel.StructuredActivityNodeData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
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

@objid ("00290914-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityNode.class, factory=ActivityNodeData.Metadata.ObjectFactory.class)
public abstract class ActivityNodeData extends ModelElementData {
    @objid ("b68f7cb5-ec92-4c43-bc0e-c1d21401f202")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("f3a9ba6a-b330-4f4e-943c-57c59b952bed")
    @SmaMetaAssociation(metaName="OwnerPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerPartitionSmDependency.class)
     SmObjectImpl mOwnerPartition;

    @objid ("614fd167-ad19-4b94-ab8a-c6a538f05f6d")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("5edf7079-9376-4d7e-8c82-961499f3e60e")
    @SmaMetaAssociation(metaName="OwnerClause", typeDataClass=ClauseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerClauseSmDependency.class)
     SmObjectImpl mOwnerClause;

    @objid ("a6b460d4-cda5-439c-a792-b118a444c3f7")
    @SmaMetaAssociation(metaName="OwnerNode", typeDataClass=StructuredActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerNodeSmDependency.class)
     SmObjectImpl mOwnerNode;

    @objid ("d6290cd1-795d-4a37-9d60-14855d714a09")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("bf5a6b90-352a-4b40-bba3-3a0d1019a044")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000044ca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f2c2be29-7bab-4246-a2a8-71c1d4d6c401")
        private static SmClass smClass = null;

        @objid ("9db4bfc2-6834-4293-ba13-f411735b0cbe")
        private static SmDependency OwnerDep = null;

        @objid ("695c6801-41db-4c64-8599-41c606eb0655")
        private static SmDependency OwnerPartitionDep = null;

        @objid ("a20fdf47-87e7-4879-9822-116883df3f5f")
        private static SmDependency IncomingDep = null;

        @objid ("5d81b122-c393-41dc-9dd1-dc3e997c91f7")
        private static SmDependency OwnerClauseDep = null;

        @objid ("d9277608-12a6-43a1-afeb-0d357acc2c45")
        private static SmDependency OwnerNodeDep = null;

        @objid ("316be999-b2d2-48c2-94a7-51044db71975")
        private static SmDependency OutgoingDep = null;

        @objid ("d9f74a99-c6ab-43b8-9a00-e31eb846b283")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0bb7a240-16c2-4ae2-a824-39cb8cfeaec9")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("5269478c-5c33-44d0-9f63-81093205d34d")
        public static SmDependency OwnerPartitionDep() {
            if (OwnerPartitionDep == null) {
            	OwnerPartitionDep = classof().getDependencyDef("OwnerPartition");
            }
            return OwnerPartitionDep;
        }

        @objid ("1e46d0b3-0981-4d15-8d4a-2a8627c5b17c")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("a5238e5c-9ea4-49be-acc1-c80336da5aa6")
        public static SmDependency OwnerClauseDep() {
            if (OwnerClauseDep == null) {
            	OwnerClauseDep = classof().getDependencyDef("OwnerClause");
            }
            return OwnerClauseDep;
        }

        @objid ("3b934c14-a4db-402e-8042-476dfc0b6062")
        public static SmDependency OwnerNodeDep() {
            if (OwnerNodeDep == null) {
            	OwnerNodeDep = classof().getDependencyDef("OwnerNode");
            }
            return OwnerNodeDep;
        }

        @objid ("6c94cd36-808f-4628-9296-ebfb797d778a")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("cf8c3b62-d1e3-43f7-a6c9-489ce9681a65")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("017002b4-736d-40a7-91c3-d0f248826dce")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("24e125a0-f6ce-4b05-90d4-4214570722de")
        public static SmDependency getOwnerClauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerClauseDep;
        }

        @objid ("bf806bd9-7e29-4979-bf05-507f50249dff")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1b09f43f-91ab-4285-af06-563436fbc0cb")
        public static SmDependency getOwnerNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerNodeDep;
        }

        @objid ("52ff4fc5-e325-426d-b0c7-d3a9c8a5db76")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("9ce022f7-ce22-45fa-9422-78ed7e8fbb26")
        public static SmDependency getOwnerPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerPartitionDep;
        }

        @objid ("0000922c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dd3669f0-e71a-4b74-b4ab-5d753ea5df18")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("d0809434-07c9-49de-90b1-dc0b16f4b69f")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00010108-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("d2eca681-da25-4919-b7fb-97068e4a7ad6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityNodeData)data).mIncoming != null)? ((ActivityNodeData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("33634ead-2e7b-4355-85cf-6deaf1d1fa37")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityNodeData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((ActivityNodeData) data).mIncoming;
            }

            @objid ("71349257-0d95-4a9f-a937-9d926caff763")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.TargetDep();
            }

        }

        @objid ("0001732c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("36621efa-7e40-4d15-9ad0-22901fa40d83")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityNodeData)data).mOutgoing != null)? ((ActivityNodeData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("c9766f1f-d1ec-443b-a987-bce7a50cbb67")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityNodeData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((ActivityNodeData) data).mOutgoing;
            }

            @objid ("e1949e6b-9bc4-4dc8-ac45-c0c2752113af")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.SourceDep();
            }

        }

        @objid ("0001ec12-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("3359becd-710e-4b00-b501-53ad04d13107")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwner;
            }

            @objid ("77b1cfb1-5f13-4be6-8820-852710a7d660")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwner = value;
            }

            @objid ("56383654-806d-4769-b47e-f61f7fe9ad56")
            @Override
            public SmDependency getSymetric() {
                return ActivityData.Metadata.OwnedNodeDep();
            }

        }

        @objid ("000263b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerNodeSmDependency extends SmSingleDependency {
            @objid ("130f2147-71ee-4b6a-ac2c-ea5a22b8c192")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerNode;
            }

            @objid ("303379ee-e6d5-4cec-b133-3a2933c019a0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerNode = value;
            }

            @objid ("62b2a6b8-95be-4697-b23d-fa02de958b50")
            @Override
            public SmDependency getSymetric() {
                return StructuredActivityNodeData.Metadata.BodyDep();
            }

        }

        @objid ("0002dce4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerClauseSmDependency extends SmSingleDependency {
            @objid ("5bdbd52b-9b48-4031-9e83-3ba5b925be94")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerClause;
            }

            @objid ("def509a9-5f35-4232-9c5f-e75ba910c035")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerClause = value;
            }

            @objid ("ed09d0d0-70b6-46dd-8306-40b70ba5b805")
            @Override
            public SmDependency getSymetric() {
                return ClauseData.Metadata.BodyDep();
            }

        }

        @objid ("000354da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerPartitionSmDependency extends SmSingleDependency {
            @objid ("bcadc242-eb73-4045-8d6b-c57c5eddf15b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerPartition;
            }

            @objid ("69f31643-9d47-4fde-ab8d-8fbf0d89bb99")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerPartition = value;
            }

            @objid ("2027ecc3-b090-4ab1-b2b3-46381350aecd")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.ContainedNodeDep();
            }

        }

    }

}
