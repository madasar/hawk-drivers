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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnErrorEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnErrorEventDefinitionImpl;
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

@objid ("008ba8e4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnErrorEventDefinition.class, factory=BpmnErrorEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnErrorEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("5d310bde-95c0-4d41-93dc-15fee17f1ea9")
    @SmaMetaAttribute(metaName="ErrorCode", type=String.class, smAttributeClass=Metadata.ErrorCodeSmAttribute.class)
     Object mErrorCode = "";

    @objid ("5244e7ef-39cb-4731-bdc8-efee515d5e5d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0014bd06-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("62a555b5-b523-4291-bb7a-211b80f7096f")
        private static SmClass smClass = null;

        @objid ("a7a102ee-28f6-48f5-a1d8-72ea1e4fcfc1")
        private static SmAttribute ErrorCodeAtt = null;

        @objid ("7757e6b0-9ffe-4135-ae47-7056c2dc3795")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnErrorEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1f160412-aaf1-4236-83a5-8020bb7d110e")
        public static SmAttribute ErrorCodeAtt() {
            if (ErrorCodeAtt == null) {
            	ErrorCodeAtt = classof().getAttributeDef("ErrorCode");
            }
            return ErrorCodeAtt;
        }

        @objid ("1f60ee31-5ba7-470d-a59f-e4996d683d54")
        public static SmAttribute getErrorCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ErrorCodeAtt;
        }

        @objid ("24a53d0f-ddbf-48fd-b79d-4ac54f88bc63")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0014ff6e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bfbb4ecd-a39c-44fd-8955-254a3f99a1a2")
            public ISmObjectData createData() {
                return new BpmnErrorEventDefinitionData();
            }

            @objid ("4dd2c725-549b-4322-bddc-9e03f71f96d9")
            public SmObjectImpl createImpl() {
                return new BpmnErrorEventDefinitionImpl();
            }

        }

        @objid ("0015644a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ErrorCodeSmAttribute extends SmAttribute {
            @objid ("727667ce-dcd3-4c3a-864a-c9a8976b67cf")
            public Object getValue(ISmObjectData data) {
                return ((BpmnErrorEventDefinitionData) data).mErrorCode;
            }

            @objid ("afdaab5b-f197-4d2b-8f48-f6bad26ec848")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnErrorEventDefinitionData) data).mErrorCode = value;
            }

        }

    }

}
