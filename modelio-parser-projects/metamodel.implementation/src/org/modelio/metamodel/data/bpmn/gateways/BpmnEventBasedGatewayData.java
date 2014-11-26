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
package org.modelio.metamodel.data.bpmn.gateways;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnEventBasedGatewayImpl;
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

@objid ("00985c10-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEventBasedGateway.class, factory=BpmnEventBasedGatewayData.Metadata.ObjectFactory.class)
public class BpmnEventBasedGatewayData extends BpmnGatewayData {
    @objid ("31bf68b2-1d21-402d-a299-4f17ce18d578")
    @SmaMetaAttribute(metaName="Instanciate", type=Boolean.class, smAttributeClass=Metadata.InstanciateSmAttribute.class)
     Object mInstanciate = false;

    @objid ("bea47412-7866-4690-8a8d-a44c4dcb745d")
    @SmaMetaAttribute(metaName="EventGatewayType", type=BpmnEventBasedGatewayType.class, smAttributeClass=Metadata.EventGatewayTypeSmAttribute.class)
     Object mEventGatewayType = BpmnEventBasedGatewayType.EXCLUSIVEGATEWAY;

    @objid ("18d2093e-06bf-4837-b278-f2538aad2b44")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00099124-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("13c3b71e-3a18-45ae-8a24-eb1fcb2e9021")
        private static SmClass smClass = null;

        @objid ("e1dcab4f-cc6d-47ef-bc3f-0bd6a1330db2")
        private static SmAttribute InstanciateAtt = null;

        @objid ("e2725ded-bcd1-4009-9be9-9f3cdec4153f")
        private static SmAttribute EventGatewayTypeAtt = null;

        @objid ("26a76464-38a9-4e2c-b328-f742842d5d6d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventBasedGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7d17ddb8-e7d3-404c-8270-f46afd37c1b4")
        public static SmAttribute InstanciateAtt() {
            if (InstanciateAtt == null) {
            	InstanciateAtt = classof().getAttributeDef("Instanciate");
            }
            return InstanciateAtt;
        }

        @objid ("a05ca2db-7d04-4eff-bd54-45aab23a811e")
        public static SmAttribute EventGatewayTypeAtt() {
            if (EventGatewayTypeAtt == null) {
            	EventGatewayTypeAtt = classof().getAttributeDef("EventGatewayType");
            }
            return EventGatewayTypeAtt;
        }

        @objid ("2fade05f-1b06-41fe-ba1d-47f3fbdeb269")
        public static SmAttribute getInstanciateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciateAtt;
        }

        @objid ("f2fd38b7-d413-463b-a723-e97f43040960")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ffef8f0f-f204-441b-ba00-501b2ed35d8f")
        public static SmAttribute getEventGatewayTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventGatewayTypeAtt;
        }

        @objid ("0009e34a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("315cefa8-9826-4666-8077-4abd8b9aca54")
            public ISmObjectData createData() {
                return new BpmnEventBasedGatewayData();
            }

            @objid ("75bd2500-48be-48c8-ae5a-c5684ff64f27")
            public SmObjectImpl createImpl() {
                return new BpmnEventBasedGatewayImpl();
            }

        }

        @objid ("000a5870-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciateSmAttribute extends SmAttribute {
            @objid ("60357312-8dd6-4e61-9967-0091bbbcaae5")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEventBasedGatewayData) data).mInstanciate;
            }

            @objid ("8971bc5c-fa73-4b65-8db0-73b5a5655407")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEventBasedGatewayData) data).mInstanciate = value;
            }

        }

        @objid ("000acbc0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EventGatewayTypeSmAttribute extends SmAttribute {
            @objid ("3b3082c2-edf3-431a-a537-1aa7ef9f6c0c")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEventBasedGatewayData) data).mEventGatewayType;
            }

            @objid ("29713810-7846-42c7-97f0-474a9f36bd43")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEventBasedGatewayData) data).mEventGatewayType = value;
            }

        }

    }

}
