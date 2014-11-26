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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataOutputData;
import org.modelio.metamodel.impl.bpmn.events.BpmnCatchEventImpl;
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

@objid ("008909ea-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCatchEvent.class, factory=BpmnCatchEventData.Metadata.ObjectFactory.class)
public abstract class BpmnCatchEventData extends BpmnEventData {
    @objid ("2945b43e-c6c9-4c39-92f4-5690b2c0d36c")
    @SmaMetaAttribute(metaName="ParallelMultiple", type=Boolean.class, smAttributeClass=Metadata.ParallelMultipleSmAttribute.class)
     Object mParallelMultiple = false;

    @objid ("c3311149-8c25-4c9e-a418-55494472559a")
    @SmaMetaAssociation(metaName="DataOutputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataOutputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataOutputAssociation = null;

    @objid ("14e4fe37-e83f-416b-99c0-2f84742b5bcd")
    @SmaMetaAssociation(metaName="DataOutput", typeDataClass=BpmnDataOutputData.class, min=0, max=1, smAssociationClass=Metadata.DataOutputSmDependency.class, component = true)
     SmObjectImpl mDataOutput;

    @objid ("1cdb3a9d-67d0-42c9-b555-77ae5151f079")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f0dda-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fe82342c-7343-44f7-a98d-d70c04abbe9f")
        private static SmClass smClass = null;

        @objid ("3ffc93a8-c02d-42c6-8fba-3e7a3e1102db")
        private static SmAttribute ParallelMultipleAtt = null;

        @objid ("cb7519f1-3d6e-4d49-b056-edae70148967")
        private static SmDependency DataOutputAssociationDep = null;

        @objid ("113671d9-4d1f-4880-a972-eea550d83500")
        private static SmDependency DataOutputDep = null;

        @objid ("6ea855ac-c539-4737-a807-f07744f6e4d9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCatchEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("151a833a-b002-4b77-8761-bedaa5a32a5e")
        public static SmAttribute ParallelMultipleAtt() {
            if (ParallelMultipleAtt == null) {
            	ParallelMultipleAtt = classof().getAttributeDef("ParallelMultiple");
            }
            return ParallelMultipleAtt;
        }

        @objid ("52a072d2-015c-4696-92e6-f755d390cf05")
        public static SmDependency DataOutputAssociationDep() {
            if (DataOutputAssociationDep == null) {
            	DataOutputAssociationDep = classof().getDependencyDef("DataOutputAssociation");
            }
            return DataOutputAssociationDep;
        }

        @objid ("f9ee3100-5723-496f-94ff-2989ffe3a639")
        public static SmDependency DataOutputDep() {
            if (DataOutputDep == null) {
            	DataOutputDep = classof().getDependencyDef("DataOutput");
            }
            return DataOutputDep;
        }

        @objid ("0d0b073f-08fa-436e-a6b2-b1f9e38021c5")
        public static SmDependency getDataOutputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputAssociationDep;
        }

        @objid ("88f30941-6145-4e37-8816-ef975bdb9028")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d76bb3d1-0352-4363-b182-9b4a865b089d")
        public static SmDependency getDataOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputDep;
        }

        @objid ("529b73d3-61b6-4904-9ed6-e3a5ef832ca6")
        public static SmAttribute getParallelMultipleAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParallelMultipleAtt;
        }

        @objid ("004f598e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3e10559b-0bf3-4ca1-bbc2-7954481ff464")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("56c314a5-5603-4deb-9855-57675c0c74c5")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004fcbf8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParallelMultipleSmAttribute extends SmAttribute {
            @objid ("a8d529e8-5e3d-4be6-b917-8631163725cf")
            public Object getValue(ISmObjectData data) {
                return ((BpmnCatchEventData) data).mParallelMultiple;
            }

            @objid ("22f1fa0d-ffcc-4c26-a6ae-228ba8ac25a9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnCatchEventData) data).mParallelMultiple = value;
            }

        }

        @objid ("005032be-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DataOutputSmDependency extends SmSingleDependency {
            @objid ("f5d5254a-eaa4-48b5-8568-29a007bae5fa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCatchEventData) data).mDataOutput;
            }

            @objid ("aa55e44f-c02d-4e05-83d9-346e3761ce4a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCatchEventData) data).mDataOutput = value;
            }

            @objid ("c730f432-6b73-4a5a-ab88-6feb26f7f560")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.CatchedDep();
            }

        }

        @objid ("0050aa64-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DataOutputAssociationSmDependency extends SmMultipleDependency {
            @objid ("80fd2e05-96fd-473b-9ab9-5d8798361389")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCatchEventData)data).mDataOutputAssociation != null)? ((BpmnCatchEventData)data).mDataOutputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("e8419533-d01b-49a4-bcbb-ab23189591e7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCatchEventData) data).mDataOutputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnCatchEventData) data).mDataOutputAssociation;
            }

            @objid ("5fd88e7c-8931-4a4c-9d5f-7e7409d2c27b")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.EndingEventDep();
            }

        }

    }

}
