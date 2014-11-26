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
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnExclusiveGatewayImpl;
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

@objid ("000085b6-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnExclusiveGateway.class, factory=BpmnExclusiveGatewayData.Metadata.ObjectFactory.class)
public class BpmnExclusiveGatewayData extends BpmnGatewayData {
    @objid ("a98184ce-8bc9-49c6-8ac3-3f1f1cfbfc1b")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("48d7018e-fa05-40df-8b45-c7f3eab60407")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005831b2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1e8c61d2-0f07-4059-8eca-24a972aee5e0")
        private static SmClass smClass = null;

        @objid ("12077132-4315-4fa2-a5c5-ad7b13be5b7c")
        private static SmDependency DefaultFlowDep = null;

        @objid ("37af7525-3d82-4a18-8c52-9110211b07f1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnExclusiveGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5e4983dc-84ea-4d65-81dd-6bd254d6e8e4")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("5bc324a6-d539-429f-a958-e8f136fc02b0")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("60691444-db03-4a5f-91f5-078d46a933f7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00587e92-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("452b6fca-409f-49e2-a5f9-c5f18ca84e7a")
            public ISmObjectData createData() {
                return new BpmnExclusiveGatewayData();
            }

            @objid ("675f0e3f-57ee-4517-aec2-3ddad3a84570")
            public SmObjectImpl createImpl() {
                return new BpmnExclusiveGatewayImpl();
            }

        }

        @objid ("0058e29c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("6ac9d1ed-851e-4903-9cc7-87b8e4606171")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnExclusiveGatewayData) data).mDefaultFlow;
            }

            @objid ("fa23f5d3-108a-4ca9-b398-76b9251fb7eb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnExclusiveGatewayData) data).mDefaultFlow = value;
            }

            @objid ("69c3b1a2-3f98-4170-b768-bf29ccaf3722")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep();
            }

        }

    }

}
