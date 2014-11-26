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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityPartitionData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.MessageFlowImpl;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
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

@objid ("00384dac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=MessageFlow.class, factory=MessageFlowData.Metadata.ObjectFactory.class)
public class MessageFlowData extends ActivityEdgeData {
    @objid ("d15abfa1-ddc6-4ff4-bb05-e64d7eb160ce")
    @SmaMetaAssociation(metaName="TargetPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.TargetPartitionSmDependency.class, partof = true)
     SmObjectImpl mTargetPartition;

    @objid ("74fbd5ed-b935-4ae7-aa02-1dc680f9f22f")
    @SmaMetaAssociation(metaName="SourcePartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.SourcePartitionSmDependency.class)
     SmObjectImpl mSourcePartition;

    @objid ("cbc8d3b3-5175-4ed8-baf0-b218eda0967b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00678cf2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b42b9b81-da9e-41e7-93d4-adf73e939b89")
        private static SmClass smClass = null;

        @objid ("4b31d036-95fd-46b8-becd-5c8ff792bb5c")
        private static SmDependency TargetPartitionDep = null;

        @objid ("cf74ca98-aea9-46a6-ad78-e377a172b3c7")
        private static SmDependency SourcePartitionDep = null;

        @objid ("43a63a9b-1525-41f4-a173-75436562b6ce")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5499ca33-e4b6-43ad-bf0d-cdbfab8b17ee")
        public static SmDependency TargetPartitionDep() {
            if (TargetPartitionDep == null) {
            	TargetPartitionDep = classof().getDependencyDef("TargetPartition");
            }
            return TargetPartitionDep;
        }

        @objid ("172416aa-c720-4824-a67c-dc43e77d5376")
        public static SmDependency SourcePartitionDep() {
            if (SourcePartitionDep == null) {
            	SourcePartitionDep = classof().getDependencyDef("SourcePartition");
            }
            return SourcePartitionDep;
        }

        @objid ("306ac139-8ff3-432d-8e47-dae0aafdf396")
        public static SmDependency getTargetPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetPartitionDep;
        }

        @objid ("8cbfc9dd-a27f-4f87-b3b8-8a520cb71fa6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ab53294e-5994-4a67-959e-d2287cf57e64")
        public static SmDependency getSourcePartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourcePartitionDep;
        }

        @objid ("0067ce7e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("18cfac12-4efe-427b-95f4-9332d85a1c40")
            public ISmObjectData createData() {
                return new MessageFlowData();
            }

            @objid ("59523d2c-36a1-415a-80ea-eb5d51d49d23")
            public SmObjectImpl createImpl() {
                return new MessageFlowImpl();
            }

        }

        @objid ("006830b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourcePartitionSmDependency extends SmSingleDependency {
            @objid ("85adf5d4-1586-4670-9149-c9d104b89dfe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageFlowData) data).mSourcePartition;
            }

            @objid ("427e683a-a25a-4a27-9867-73ffa3cbcfe8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageFlowData) data).mSourcePartition = value;
            }

            @objid ("4aef68c2-0a34-4f13-9108-735785d3b9e2")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.OutgoingDep();
            }

        }

        @objid ("0068a51a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetPartitionSmDependency extends SmSingleDependency {
            @objid ("b4125f91-edb4-42bb-b9c8-4b6b813629dc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageFlowData) data).mTargetPartition;
            }

            @objid ("937f4cdb-42ec-4a4a-bd1f-3b5f084c317c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageFlowData) data).mTargetPartition = value;
            }

            @objid ("8210b719-3def-4180-8df7-1e8acbf09dcb")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.IncomingDep();
            }

        }

    }

}
