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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnTransaction;
import org.modelio.metamodel.bpmn.activities.TransactionMethod;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTransactionImpl;
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

@objid ("0085d32e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnTransaction.class, factory=BpmnTransactionData.Metadata.ObjectFactory.class)
public class BpmnTransactionData extends BpmnSubProcessData {
    @objid ("2d090c7b-7d26-4bbf-92be-a9942f807c2f")
    @SmaMetaAttribute(metaName="Protocol", type=String.class, smAttributeClass=Metadata.ProtocolSmAttribute.class)
     Object mProtocol = "";

    @objid ("5a422c28-c2af-4891-9b24-1ceea2f42201")
    @SmaMetaAttribute(metaName="Method", type=TransactionMethod.class, smAttributeClass=Metadata.MethodSmAttribute.class)
     Object mMethod = TransactionMethod.COMPENSATETRANSACTION;

    @objid ("e908d734-db2a-43b8-bbda-14338c30c050")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003853ce-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("63d142dd-28b9-4e6f-bf5c-635776f073e5")
        private static SmClass smClass = null;

        @objid ("553de2ee-f3f1-4b2d-ae22-c61c1c51bc59")
        private static SmAttribute ProtocolAtt = null;

        @objid ("295c306e-b701-491e-9cc4-59c2fbd142bb")
        private static SmAttribute MethodAtt = null;

        @objid ("ec0b4223-c6dc-45a0-8aa3-2f19cdeaf8b7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTransactionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7c7fd936-cfc9-451b-bb85-407d25d7f3fb")
        public static SmAttribute ProtocolAtt() {
            if (ProtocolAtt == null) {
            	ProtocolAtt = classof().getAttributeDef("Protocol");
            }
            return ProtocolAtt;
        }

        @objid ("020fe237-b232-4395-b561-3cc7e31fe86e")
        public static SmAttribute MethodAtt() {
            if (MethodAtt == null) {
            	MethodAtt = classof().getAttributeDef("Method");
            }
            return MethodAtt;
        }

        @objid ("ef432b3b-69a1-467e-8e5e-ba1d1885be5e")
        public static SmAttribute getMethodAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MethodAtt;
        }

        @objid ("6a6f2ef1-5208-4c9e-8793-f12d6179556e")
        public static SmAttribute getProtocolAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProtocolAtt;
        }

        @objid ("bba5d981-f1f8-40a4-9caa-53605a936aa8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003893b6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b82fb222-36f1-4771-a306-38d332499ad6")
            public ISmObjectData createData() {
                return new BpmnTransactionData();
            }

            @objid ("2d53f197-e5af-41eb-9e54-62e83a863dc8")
            public SmObjectImpl createImpl() {
                return new BpmnTransactionImpl();
            }

        }

        @objid ("0038f450-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProtocolSmAttribute extends SmAttribute {
            @objid ("7839d1db-dd79-47da-a4a3-e4e8210c437e")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTransactionData) data).mProtocol;
            }

            @objid ("651d2975-5273-4939-ae08-3e4be2d3900b")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTransactionData) data).mProtocol = value;
            }

        }

        @objid ("003953dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MethodSmAttribute extends SmAttribute {
            @objid ("69bb20d1-d934-468b-8a5c-e8081c47b0f6")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTransactionData) data).mMethod;
            }

            @objid ("51cbc76b-a229-447f-810e-794aa7a7330c")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTransactionData) data).mMethod = value;
            }

        }

    }

}
