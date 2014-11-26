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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityActionData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ExceptionHandlerData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.InputPinImpl;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
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

@objid ("003580cc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InputPin.class, factory=InputPinData.Metadata.ObjectFactory.class)
public class InputPinData extends PinData {
    @objid ("1e9eaba7-9c9b-4c11-b4f5-f841028d7595")
    @SmaMetaAttribute(metaName="IsSelf", type=Boolean.class, smAttributeClass=Metadata.IsSelfSmAttribute.class)
     Object mIsSelf = false;

    @objid ("1723bda3-a0c5-441a-8db2-7305ec99bf89")
    @SmaMetaAssociation(metaName="Handler", typeDataClass=ExceptionHandlerData.class, min=0, max=-1, smAssociationClass=Metadata.HandlerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mHandler = null;

    @objid ("9d768ef5-42c5-4410-87ee-cde3f046bdf6")
    @SmaMetaAssociation(metaName="Inputing", typeDataClass=ActivityActionData.class, min=0, max=1, smAssociationClass=Metadata.InputingSmDependency.class)
     SmObjectImpl mInputing;

    @objid ("99b57865-a24a-4526-985e-bd4a94c8fff6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00668f32-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("90e4c29e-0057-45ba-8674-c90b2ac8fe73")
        private static SmClass smClass = null;

        @objid ("fab82587-ffa8-4a7c-928d-031e00f5d4ba")
        private static SmAttribute IsSelfAtt = null;

        @objid ("63250ef9-f1b7-41d2-a659-3da793682db2")
        private static SmDependency HandlerDep = null;

        @objid ("7102c5f1-a9eb-4a56-be77-3e413b7a02c5")
        private static SmDependency InputingDep = null;

        @objid ("07c901b1-9494-4c56-af04-103ea7f3af07")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InputPinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2e0b5cf6-efff-4867-941d-d1d016b736eb")
        public static SmAttribute IsSelfAtt() {
            if (IsSelfAtt == null) {
            	IsSelfAtt = classof().getAttributeDef("IsSelf");
            }
            return IsSelfAtt;
        }

        @objid ("ee6fe0d7-52a9-4762-8055-1eace0546e92")
        public static SmDependency HandlerDep() {
            if (HandlerDep == null) {
            	HandlerDep = classof().getDependencyDef("Handler");
            }
            return HandlerDep;
        }

        @objid ("12eec9b5-6285-48d7-9117-04c79133ce1b")
        public static SmDependency InputingDep() {
            if (InputingDep == null) {
            	InputingDep = classof().getDependencyDef("Inputing");
            }
            return InputingDep;
        }

        @objid ("3111850c-46ee-4321-8acf-c90d43ee1c77")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4594a803-6278-4659-916f-f257acd0ea3c")
        public static SmAttribute getIsSelfAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSelfAtt;
        }

        @objid ("833c8b54-d5fd-45bc-846a-2a5d4798ed4f")
        public static SmDependency getHandlerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return HandlerDep;
        }

        @objid ("184ad7db-f4db-43b1-8ecc-f5990edc48a4")
        public static SmDependency getInputingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputingDep;
        }

        @objid ("0066d0d2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3e51f1d9-5443-48e3-bce1-a47f78e5a7a6")
            public ISmObjectData createData() {
                return new InputPinData();
            }

            @objid ("2055e7cc-bf43-47a0-a52c-3338cbae2f6f")
            public SmObjectImpl createImpl() {
                return new InputPinImpl();
            }

        }

        @objid ("00673324-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsSelfSmAttribute extends SmAttribute {
            @objid ("bbf4b68c-63b8-4734-b99b-f3f20f3dc880")
            public Object getValue(ISmObjectData data) {
                return ((InputPinData) data).mIsSelf;
            }

            @objid ("40a2d046-c931-46b8-a888-69277a179fc8")
            public void setValue(ISmObjectData data, Object value) {
                ((InputPinData) data).mIsSelf = value;
            }

        }

        @objid ("006795da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InputingSmDependency extends SmSingleDependency {
            @objid ("d55861ac-a0c1-49c3-be98-2ca3680d0e27")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InputPinData) data).mInputing;
            }

            @objid ("9e558b1d-aa30-4e0c-9fcf-aa4312db083c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InputPinData) data).mInputing = value;
            }

            @objid ("b5e4e4b4-cc76-4c90-a2c3-2649c37b24b1")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.InputDep();
            }

        }

        @objid ("00681136-c4c2-1fd8-97fe-001ec947cd2a")
        public static class HandlerSmDependency extends SmMultipleDependency {
            @objid ("89ec8500-a3e5-4524-9fa8-364e6d135279")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InputPinData)data).mHandler != null)? ((InputPinData)data).mHandler:SmMultipleDependency.EMPTY;
            }

            @objid ("a77109bc-eab0-45f5-8000-97140f35a6de")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InputPinData) data).mHandler = new ArrayList<>(initialCapacity);
                return ((InputPinData) data).mHandler;
            }

            @objid ("e74dd7bb-0ba0-45f0-a870-5fed69313a45")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ExceptionInputDep();
            }

        }

    }

}
