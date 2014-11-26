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
import org.modelio.metamodel.bpmn.events.BpmnEscalationEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnEscalationEventDefinitionImpl;
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

@objid ("008c5122-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEscalationEventDefinition.class, factory=BpmnEscalationEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnEscalationEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("50d1756b-e9d2-4c42-95c7-520e9679d493")
    @SmaMetaAttribute(metaName="EscalationCode", type=String.class, smAttributeClass=Metadata.EscalationCodeSmAttribute.class)
     Object mEscalationCode = "";

    @objid ("f8bf26bb-2949-4765-b3a5-2b9946e1a188")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000c0f80-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("01e7b19b-01ba-4d9c-8ff7-93233db29afd")
        private static SmClass smClass = null;

        @objid ("86e0856f-b4fd-4e3d-86c3-2117b3fa22fa")
        private static SmAttribute EscalationCodeAtt = null;

        @objid ("da525cbf-c44b-492f-aa83-7c218f9e538d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEscalationEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ac6d0a5a-1ad5-4cdc-934f-21b823217d49")
        public static SmAttribute EscalationCodeAtt() {
            if (EscalationCodeAtt == null) {
            	EscalationCodeAtt = classof().getAttributeDef("EscalationCode");
            }
            return EscalationCodeAtt;
        }

        @objid ("1ba70b32-ab06-4025-af72-56c524746f66")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e67c4b4e-787f-44fa-9122-d31416ad0eef")
        public static SmAttribute getEscalationCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EscalationCodeAtt;
        }

        @objid ("000c5026-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3a066e9d-0b72-4156-84f7-7c0e053028f6")
            public ISmObjectData createData() {
                return new BpmnEscalationEventDefinitionData();
            }

            @objid ("33bb59b5-edb3-47cd-a499-7c73909eb8d7")
            public SmObjectImpl createImpl() {
                return new BpmnEscalationEventDefinitionImpl();
            }

        }

        @objid ("000cb07a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class EscalationCodeSmAttribute extends SmAttribute {
            @objid ("8c6c2a82-8f0b-455c-b37c-44b1d2bee5a1")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEscalationEventDefinitionData) data).mEscalationCode;
            }

            @objid ("3ef1da37-866c-4bf5-8541-fef0aac7f3a5")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEscalationEventDefinitionData) data).mEscalationCode = value;
            }

        }

    }

}
