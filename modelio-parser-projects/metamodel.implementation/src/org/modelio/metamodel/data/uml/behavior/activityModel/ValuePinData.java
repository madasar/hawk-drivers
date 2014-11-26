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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ValuePinImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ValuePin;
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

@objid ("003f561a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ValuePin.class, factory=ValuePinData.Metadata.ObjectFactory.class)
public class ValuePinData extends InputPinData {
    @objid ("0453c543-5d71-49bd-babc-90f7f369373b")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("d599db14-10eb-4d0f-bdcc-38e37c39005c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0012639e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3b80685f-9037-42d1-b136-2f5fe350f283")
        private static SmClass smClass = null;

        @objid ("27b3ef07-100a-4adb-848e-2f3183a512a0")
        private static SmAttribute ValueAtt = null;

        @objid ("3edcae50-b6c6-4ab3-8674-acdb363ce366")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ValuePinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("74e3e44f-6bc2-4665-af7f-dfd74ec23d60")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("2bacd2b5-f6d4-47d9-9a14-3544b5326941")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("2bc663db-69ee-434c-b8a1-3c6019250be1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0012a5ac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1416999d-4943-4697-82f1-50519fee97ee")
            public ISmObjectData createData() {
                return new ValuePinData();
            }

            @objid ("12b1cce2-02a7-4d53-97f0-129ebef1de76")
            public SmObjectImpl createImpl() {
                return new ValuePinImpl();
            }

        }

        @objid ("0013061e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("20d791b7-f505-4515-9ec8-e0db24d4fc8f")
            public Object getValue(ISmObjectData data) {
                return ((ValuePinData) data).mValue;
            }

            @objid ("bd51a5b9-271e-4ea1-821d-6cc262737e33")
            public void setValue(ISmObjectData data, Object value) {
                ((ValuePinData) data).mValue = value;
            }

        }

    }

}
