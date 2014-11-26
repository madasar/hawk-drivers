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
import org.modelio.metamodel.bpmn.gateways.BpmnGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnGatewayDirection;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnGatewayImpl;
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

@objid ("00015806-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnGateway.class, factory=BpmnGatewayData.Metadata.ObjectFactory.class)
public abstract class BpmnGatewayData extends BpmnFlowNodeData {
    @objid ("4df0c353-a9a9-4614-b2d6-dc016388739c")
    @SmaMetaAttribute(metaName="GatewayDirection", type=BpmnGatewayDirection.class, smAttributeClass=Metadata.GatewayDirectionSmAttribute.class)
     Object mGatewayDirection = BpmnGatewayDirection.UNSPECIFIEDDIRECTION;

    @objid ("87804b27-fddb-41aa-b9fe-7b5bd9493a6e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b7680-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9f86fde2-65b5-457d-823c-2a5b786ef7f5")
        private static SmClass smClass = null;

        @objid ("bcf1f10e-1d3c-41c4-92ab-0c5b7e52db71")
        private static SmAttribute GatewayDirectionAtt = null;

        @objid ("a7c3dfdd-0873-4a1c-944e-ba163fabce09")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("12b7de8f-d825-47e5-9137-bd1dc2e0f698")
        public static SmAttribute GatewayDirectionAtt() {
            if (GatewayDirectionAtt == null) {
            	GatewayDirectionAtt = classof().getAttributeDef("GatewayDirection");
            }
            return GatewayDirectionAtt;
        }

        @objid ("83e656f8-f37a-4c66-b99c-1f5ac24aca3f")
        public static SmAttribute getGatewayDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GatewayDirectionAtt;
        }

        @objid ("fb0855fa-45d8-452d-8dfc-55dd5a42d25e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008bb7b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("233f3be4-3ac5-40cc-86c5-d05847a4536b")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("24c8220f-6cb0-4db8-bbbd-31e57a900957")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("008c1a5e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class GatewayDirectionSmAttribute extends SmAttribute {
            @objid ("f7dd908c-e3f2-488f-800a-520b85e56399")
            public Object getValue(ISmObjectData data) {
                return ((BpmnGatewayData) data).mGatewayDirection;
            }

            @objid ("acdba377-16db-4d0a-90b0-a8474f6f0bac")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnGatewayData) data).mGatewayDirection = value;
            }

        }

    }

}
