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
import org.modelio.metamodel.data.uml.behavior.activityModel.ExceptionHandlerData;
import org.modelio.metamodel.data.uml.behavior.activityModel.InputPinData;
import org.modelio.metamodel.data.uml.behavior.activityModel.OutputPinData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
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

@objid ("0026da86-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityAction.class, factory=ActivityActionData.Metadata.ObjectFactory.class)
public abstract class ActivityActionData extends ActivityNodeData {
    @objid ("ac57cee8-3093-47ef-8ff7-5f4acf48576e")
    @SmaMetaAttribute(metaName="IsMultipleInstance", type=Boolean.class, smAttributeClass=Metadata.IsMultipleInstanceSmAttribute.class)
     Object mIsMultipleInstance = false;

    @objid ("f0eada14-2138-4c03-97be-fd1c1db03c64")
    @SmaMetaAttribute(metaName="IsCompensation", type=Boolean.class, smAttributeClass=Metadata.IsCompensationSmAttribute.class)
     Object mIsCompensation = false;

    @objid ("21b37bb9-013c-43c0-9624-f858f90c27ee")
    @SmaMetaAssociation(metaName="Output", typeDataClass=OutputPinData.class, min=0, max=-1, smAssociationClass=Metadata.OutputSmDependency.class, component = true)
     List<SmObjectImpl> mOutput = null;

    @objid ("1ae1ec2e-e602-487b-9b35-fd3ed01b0394")
    @SmaMetaAssociation(metaName="Input", typeDataClass=InputPinData.class, min=0, max=-1, smAssociationClass=Metadata.InputSmDependency.class, component = true)
     List<SmObjectImpl> mInput = null;

    @objid ("43ade20b-5c73-4af7-8864-2c0e7d1378f2")
    @SmaMetaAssociation(metaName="Handler", typeDataClass=ExceptionHandlerData.class, min=0, max=-1, smAssociationClass=Metadata.HandlerSmDependency.class, component = true)
     List<SmObjectImpl> mHandler = null;

    @objid ("be4492a0-68a5-4847-aed1-6a0cc345875f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007b796a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("75921672-21f4-4d8b-89f1-980e07cb55f0")
        private static SmClass smClass = null;

        @objid ("6b471b34-0942-41c2-9481-14411e7ba015")
        private static SmAttribute IsMultipleInstanceAtt = null;

        @objid ("2ddc0b01-df2d-4fe3-bf90-25b8efd036a3")
        private static SmAttribute IsCompensationAtt = null;

        @objid ("7a097eba-f9f7-40f6-b1e0-bbc8e7828352")
        private static SmDependency OutputDep = null;

        @objid ("8d4fc45d-8399-4701-8d38-743853bdce08")
        private static SmDependency InputDep = null;

        @objid ("89878519-9146-4508-970c-2d966b492338")
        private static SmDependency HandlerDep = null;

        @objid ("afe38808-e912-4d0b-b4cf-538cb8a3e025")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8bf6064d-5d96-4290-9049-6f52b4aa26a9")
        public static SmAttribute IsMultipleInstanceAtt() {
            if (IsMultipleInstanceAtt == null) {
            	IsMultipleInstanceAtt = classof().getAttributeDef("IsMultipleInstance");
            }
            return IsMultipleInstanceAtt;
        }

        @objid ("ee460b35-b0da-45a4-833e-f2c958c89a4f")
        public static SmAttribute IsCompensationAtt() {
            if (IsCompensationAtt == null) {
            	IsCompensationAtt = classof().getAttributeDef("IsCompensation");
            }
            return IsCompensationAtt;
        }

        @objid ("21ac308a-e089-4a21-9bcf-f47c63646b38")
        public static SmDependency OutputDep() {
            if (OutputDep == null) {
            	OutputDep = classof().getDependencyDef("Output");
            }
            return OutputDep;
        }

        @objid ("a99d9bbe-9333-4780-af04-ca912977c906")
        public static SmDependency InputDep() {
            if (InputDep == null) {
            	InputDep = classof().getDependencyDef("Input");
            }
            return InputDep;
        }

        @objid ("6ce4feaa-ae72-46a5-8a7d-9296b3afb4a3")
        public static SmDependency HandlerDep() {
            if (HandlerDep == null) {
            	HandlerDep = classof().getDependencyDef("Handler");
            }
            return HandlerDep;
        }

        @objid ("6f4f1c1e-a089-4b24-b080-e33e70351c84")
        public static SmDependency getHandlerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return HandlerDep;
        }

        @objid ("f13e1853-3865-43c3-8930-1b30edd7c2b6")
        public static SmDependency getOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputDep;
        }

        @objid ("b77757e5-4119-48fb-b289-02a89477b76e")
        public static SmAttribute getIsMultipleInstanceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultipleInstanceAtt;
        }

        @objid ("e60b26b0-c9c9-46a5-856e-afbac1548892")
        public static SmDependency getInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputDep;
        }

        @objid ("80826c5e-edec-4981-831c-8e4ed6d72802")
        public static SmAttribute getIsCompensationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCompensationAtt;
        }

        @objid ("74973b82-266c-4841-bb95-648834694f61")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007bbc7c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1c61daf4-2f40-4327-9b68-7380f3518deb")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("6242942f-4b04-4558-b4b2-1f3e40c99fdc")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("007c1fbe-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsMultipleInstanceSmAttribute extends SmAttribute {
            @objid ("d9511370-443d-4d26-9ad0-b3f440b04b0e")
            public Object getValue(ISmObjectData data) {
                return ((ActivityActionData) data).mIsMultipleInstance;
            }

            @objid ("6ec0db6d-eb32-4b90-b587-0d232cd32d5b")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityActionData) data).mIsMultipleInstance = value;
            }

        }

        @objid ("007c8e72-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsCompensationSmAttribute extends SmAttribute {
            @objid ("9694e198-7242-4974-a34b-d0e5edc7e153")
            public Object getValue(ISmObjectData data) {
                return ((ActivityActionData) data).mIsCompensation;
            }

            @objid ("d881314b-02c3-4a09-9e5f-431ea932aea4")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityActionData) data).mIsCompensation = value;
            }

        }

        @objid ("007cf4f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InputSmDependency extends SmMultipleDependency {
            @objid ("fc1b1ae1-08af-4b50-80ae-a2c20473364f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mInput != null)? ((ActivityActionData)data).mInput:SmMultipleDependency.EMPTY;
            }

            @objid ("c0e34040-16c0-4816-b19e-82c8a1929d89")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mInput = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mInput;
            }

            @objid ("d0eb8baf-d47a-4a93-a4dc-0b093ff0e0d2")
            @Override
            public SmDependency getSymetric() {
                return InputPinData.Metadata.InputingDep();
            }

        }

        @objid ("007d5a1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputSmDependency extends SmMultipleDependency {
            @objid ("9ffad936-0a60-452e-8f21-9fa00156ebdc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mOutput != null)? ((ActivityActionData)data).mOutput:SmMultipleDependency.EMPTY;
            }

            @objid ("5fbbb657-fd4d-4cdb-8158-399c6ca81484")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mOutput = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mOutput;
            }

            @objid ("a20cb876-f8bc-49bd-9bca-94701af6160b")
            @Override
            public SmDependency getSymetric() {
                return OutputPinData.Metadata.OutputingDep();
            }

        }

        @objid ("007dbf22-c4c3-1fd8-97fe-001ec947cd2a")
        public static class HandlerSmDependency extends SmMultipleDependency {
            @objid ("ff3b5213-3bab-411b-8565-1c118bbd2750")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mHandler != null)? ((ActivityActionData)data).mHandler:SmMultipleDependency.EMPTY;
            }

            @objid ("5e1561e3-39bc-465f-bc80-d3d97fd8de3e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mHandler = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mHandler;
            }

            @objid ("7d20a4be-3392-421d-ba4a-4d6ed06e1b61")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ProtectedNodeDep();
            }

        }

    }

}
