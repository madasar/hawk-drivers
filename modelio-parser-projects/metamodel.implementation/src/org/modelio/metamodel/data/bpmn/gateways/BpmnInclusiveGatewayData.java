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
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnInclusiveGatewayImpl;
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

@objid ("00020c38-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnInclusiveGateway.class, factory=BpmnInclusiveGatewayData.Metadata.ObjectFactory.class)
public class BpmnInclusiveGatewayData extends BpmnGatewayData {
    @objid ("cc9f498b-d154-4cca-b73a-e4be79507e9a")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("b0d87b7e-3f4e-4c36-91b1-087fb65b36d8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007ea626-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2c199d77-e4f4-4d79-9e3f-1cb8bdb263f8")
        private static SmClass smClass = null;

        @objid ("ef9a57b9-533b-4527-a2bc-827f738c6a9e")
        private static SmDependency DefaultFlowDep = null;

        @objid ("a5d00aa1-17ee-42ae-9be5-fe1a19b12ba3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnInclusiveGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b8e14616-e2b3-491d-a540-7eb8a341b071")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("687ec4aa-919f-469d-8e57-b7e39c2aaea4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("40a43de4-291a-451c-8b86-60b46e1223bb")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("007ef2f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d5c30538-f699-416b-88db-b5c2678f0289")
            public ISmObjectData createData() {
                return new BpmnInclusiveGatewayData();
            }

            @objid ("3c866480-5ccc-470a-af86-61ee1a5ee271")
            public SmObjectImpl createImpl() {
                return new BpmnInclusiveGatewayImpl();
            }

        }

        @objid ("007f57e2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("2c42fa3d-284a-42d5-a836-e6cf15ef7fe9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnInclusiveGatewayData) data).mDefaultFlow;
            }

            @objid ("203da62d-07d5-45c7-89a2-385260f49a83")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnInclusiveGatewayData) data).mDefaultFlow = value;
            }

            @objid ("faed1e42-ef0c-4f81-86a1-85417df54835")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep();
            }

        }

    }

}
