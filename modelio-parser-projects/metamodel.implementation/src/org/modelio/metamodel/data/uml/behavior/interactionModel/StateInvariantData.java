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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.StateInvariantImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
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

@objid ("004be470-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StateInvariant.class, factory=StateInvariantData.Metadata.ObjectFactory.class)
public class StateInvariantData extends OccurrenceSpecificationData {
    @objid ("89fca15d-343e-4734-8cdc-cddf6e86d5b4")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("5540507f-3c9f-4f04-a521-f0e24b72a1f6")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("40394a76-8d82-4680-9d46-cfc38db65484")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0075111a-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1075cbd5-9714-44e8-97f6-be53763317fc")
        private static SmClass smClass = null;

        @objid ("d6961763-1ad1-4143-b0da-e2c7ce098592")
        private static SmAttribute BodyAtt = null;

        @objid ("716e5354-19c6-4bc3-9f60-df4f845fc4c1")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("0107b500-684b-46f9-8683-1d82b3f58928")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateInvariantData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("36fc1093-2959-47d1-8f4f-d6a90b7f909f")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("9d255c47-5c36-498d-bde1-187b2b7ce59f")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("5445dea7-80b2-4a70-b836-94fd5a982db7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5f35e7e1-417f-4506-9d91-9504c9cf1cf5")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("a6e45daf-a39c-4b1a-bda1-1707879611e3")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("00756e76-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("65ed6bd3-c900-4633-9d1b-36495afd2c88")
            public ISmObjectData createData() {
                return new StateInvariantData();
            }

            @objid ("515792fc-d534-49bc-9528-322e703357fd")
            public SmObjectImpl createImpl() {
                return new StateInvariantImpl();
            }

        }

        @objid ("0075e2d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("dc6148cc-b408-4ba2-9b9f-5a2a57bfd640")
            public Object getValue(ISmObjectData data) {
                return ((StateInvariantData) data).mBody;
            }

            @objid ("a3c364f6-9f14-437f-a1f0-b9f8c182ada7")
            public void setValue(ISmObjectData data, Object value) {
                ((StateInvariantData) data).mBody = value;
            }

        }

        @objid ("00765660-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("3144cb2f-4e13-49ac-a563-c1fcfcd85149")
            public Object getValue(ISmObjectData data) {
                return ((StateInvariantData) data).mEndLineNumber;
            }

            @objid ("eb2cebe0-787d-47f7-8263-135eae243d36")
            public void setValue(ISmObjectData data, Object value) {
                ((StateInvariantData) data).mEndLineNumber = value;
            }

        }

    }

}
