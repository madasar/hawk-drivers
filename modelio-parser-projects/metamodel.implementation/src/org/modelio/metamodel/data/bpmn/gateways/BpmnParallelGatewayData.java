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
import org.modelio.metamodel.bpmn.gateways.BpmnParallelGateway;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnParallelGatewayImpl;
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

@objid ("0002addc-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnParallelGateway.class, factory=BpmnParallelGatewayData.Metadata.ObjectFactory.class)
public class BpmnParallelGatewayData extends BpmnGatewayData {
    @objid ("fa4fe5cf-7469-4484-95e5-513eb086be41")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008aaca0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bf46b9ae-6a48-4024-b378-2172917f0408")
        private static SmClass smClass = null;

        @objid ("765afd68-dceb-4ff2-a6e3-931eab483324")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnParallelGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c3b0a63b-8f2b-4ffe-825c-21c2228fcf53")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008afc46-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ab4c64d0-02a6-4a52-a704-31ec476a561f")
            public ISmObjectData createData() {
                return new BpmnParallelGatewayData();
            }

            @objid ("cc55f0f2-a416-43c0-9749-ed70d5ce0814")
            public SmObjectImpl createImpl() {
                return new BpmnParallelGatewayImpl();
            }

        }

    }

}
