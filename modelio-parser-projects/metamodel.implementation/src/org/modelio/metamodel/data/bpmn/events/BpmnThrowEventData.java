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
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.impl.bpmn.events.BpmnThrowEventImpl;
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

@objid ("009614d2-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnThrowEvent.class, factory=BpmnThrowEventData.Metadata.ObjectFactory.class)
public abstract class BpmnThrowEventData extends BpmnEventData {
    @objid ("bd82cf06-5ee4-4019-a772-721d1c87ccfe")
    @SmaMetaAssociation(metaName="DataInputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataInputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataInputAssociation = null;

    @objid ("92d6c641-0def-43f0-ac7d-4bca542809a1")
    @SmaMetaAssociation(metaName="DataInput", typeDataClass=BpmnDataInputData.class, min=0, max=1, smAssociationClass=Metadata.DataInputSmDependency.class, component = true)
     SmObjectImpl mDataInput;

    @objid ("62559566-6fb0-4e6a-bbaa-246948b2e005")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00038720-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b0cb168b-82b0-4ee1-8108-1e5e57181f5a")
        private static SmClass smClass = null;

        @objid ("6b653ed7-4845-43f5-b305-2d75c4877b13")
        private static SmDependency DataInputAssociationDep = null;

        @objid ("9b5f5109-7710-4872-b339-b68f63c5ada0")
        private static SmDependency DataInputDep = null;

        @objid ("7a8db795-fcb5-4be3-a17b-389cd49ac261")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("af3ce99b-69c7-4bc4-aece-428c067a43ac")
        public static SmDependency DataInputAssociationDep() {
            if (DataInputAssociationDep == null) {
            	DataInputAssociationDep = classof().getDependencyDef("DataInputAssociation");
            }
            return DataInputAssociationDep;
        }

        @objid ("e264f91d-9304-4f1f-b512-3925d34dd6d6")
        public static SmDependency DataInputDep() {
            if (DataInputDep == null) {
            	DataInputDep = classof().getDependencyDef("DataInput");
            }
            return DataInputDep;
        }

        @objid ("535e4361-1544-4d7f-9230-3b8b4cc0732e")
        public static SmDependency getDataInputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputAssociationDep;
        }

        @objid ("c37bcb1c-548f-4608-996c-941254b0fd55")
        public static SmDependency getDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputDep;
        }

        @objid ("cfb95f76-0295-45c3-8b16-15933f4d91a3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0003cbfe-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("501c1d0b-d5e3-4b74-8497-de07bb75e5b1")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("c24e5156-fcc0-4626-86a8-9618866dbce7")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00042f0e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataInputSmDependency extends SmSingleDependency {
            @objid ("bf241940-d74d-4e2d-aee8-97c575497c46")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnThrowEventData) data).mDataInput;
            }

            @objid ("ac37afe5-ce51-45e3-a773-54318ff7662f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnThrowEventData) data).mDataInput = value;
            }

            @objid ("8f67ede5-5242-48b9-9fc7-b618c1f94c6d")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerThrowEventDep();
            }

        }

        @objid ("0004a3b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataInputAssociationSmDependency extends SmMultipleDependency {
            @objid ("014a4527-6d78-47b2-938f-5108196c19b4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnThrowEventData)data).mDataInputAssociation != null)? ((BpmnThrowEventData)data).mDataInputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("370a1443-d5bc-4200-a0d9-73fc650df459")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnThrowEventData) data).mDataInputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnThrowEventData) data).mDataInputAssociation;
            }

            @objid ("e05e393b-aea4-41b9-91d1-0feb22fd0360")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.StartingEventDep();
            }

        }

    }

}
