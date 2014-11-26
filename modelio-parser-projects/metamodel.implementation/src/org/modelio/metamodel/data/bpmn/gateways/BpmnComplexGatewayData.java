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
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnComplexGatewayImpl;
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

@objid ("0097a93c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnComplexGateway.class, factory=BpmnComplexGatewayData.Metadata.ObjectFactory.class)
public class BpmnComplexGatewayData extends BpmnGatewayData {
    @objid ("f1d69f7f-e5aa-4026-9a0c-6d0391395da1")
    @SmaMetaAttribute(metaName="ActivationExpression", type=String.class, smAttributeClass=Metadata.ActivationExpressionSmAttribute.class)
     Object mActivationExpression = "";

    @objid ("cde94e56-dfb5-4c1f-b099-a6f742e584dd")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("88a09681-70f3-4418-8592-218acbefcb76")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000bc408-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f70f6cfc-3089-447a-9bce-6436918462f8")
        private static SmClass smClass = null;

        @objid ("1c3622e7-f18d-4477-b151-6d32ff18589e")
        private static SmAttribute ActivationExpressionAtt = null;

        @objid ("723874ee-a7b1-41c8-b60e-2e7e975ac069")
        private static SmDependency DefaultFlowDep = null;

        @objid ("134173d0-1195-4c8d-8ed6-e0ddd9489599")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnComplexGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("37d07213-ae00-455f-ab37-b7bb829a2d9b")
        public static SmAttribute ActivationExpressionAtt() {
            if (ActivationExpressionAtt == null) {
            	ActivationExpressionAtt = classof().getAttributeDef("ActivationExpression");
            }
            return ActivationExpressionAtt;
        }

        @objid ("efbd2f8b-4ce7-4c99-8855-ec32f00baf1b")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("f3248d3b-2e7c-45ae-ba0e-8a596ae242eb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2b7a99bd-ba29-4446-a0ce-8c4db3f038fc")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("c32c745a-5047-4bf9-9d96-d0e54b11b5f4")
        public static SmAttribute getActivationExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActivationExpressionAtt;
        }

        @objid ("000c053a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("45bc2e7b-1064-42cb-a274-587ad86bc5dc")
            public ISmObjectData createData() {
                return new BpmnComplexGatewayData();
            }

            @objid ("1a372b7a-1062-49a5-9149-94f8ee0ae1ab")
            public SmObjectImpl createImpl() {
                return new BpmnComplexGatewayImpl();
            }

        }

        @objid ("000c66d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ActivationExpressionSmAttribute extends SmAttribute {
            @objid ("3b61e8f7-9f8c-4517-a641-c635c6333a76")
            public Object getValue(ISmObjectData data) {
                return ((BpmnComplexGatewayData) data).mActivationExpression;
            }

            @objid ("aa4a5aed-ef67-4445-ba29-0ecdafeb2d33")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnComplexGatewayData) data).mActivationExpression = value;
            }

        }

        @objid ("000cc8f8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("a12a9e1f-ad27-437c-ab5a-83cad98683ba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexGatewayData) data).mDefaultFlow;
            }

            @objid ("27514d58-4d2d-4f63-9ade-7da6f96aa7c9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexGatewayData) data).mDefaultFlow = value;
            }

            @objid ("e9cbf547-718d-4d0c-ad3a-ba5131c3cb1e")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfComplexDep();
            }

        }

    }

}
