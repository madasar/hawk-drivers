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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageFlowData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnAssociationData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
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

@objid ("00783e94-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnBaseElement.class, factory=BpmnBaseElementData.Metadata.ObjectFactory.class)
public abstract class BpmnBaseElementData extends ModelElementData {
    @objid ("afdd7c86-c8bf-44ab-9859-c6e7fd4008d8")
    @SmaMetaAssociation(metaName="OutgoingAssoc", typeDataClass=BpmnAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingAssocSmDependency.class)
     List<SmObjectImpl> mOutgoingAssoc = null;

    @objid ("279b8bf6-baa1-4677-8909-fe209ace3d74")
    @SmaMetaAssociation(metaName="IncomingAssoc", typeDataClass=BpmnAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingAssocSmDependency.class)
     List<SmObjectImpl> mIncomingAssoc = null;

    @objid ("f1ca7be0-946b-4ff2-aa86-7646bbf64d5b")
    @SmaMetaAssociation(metaName="IncomingFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingFlowSmDependency.class)
     List<SmObjectImpl> mIncomingFlow = null;

    @objid ("907c48d6-186e-480e-a49a-1e17430ddf49")
    @SmaMetaAssociation(metaName="OutgoingFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingFlowSmDependency.class)
     List<SmObjectImpl> mOutgoingFlow = null;

    @objid ("1bc13f47-a79a-4d34-b7a0-7bc269b3a8ec")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004c525c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e27245c1-61e1-4334-ba06-d2568e31c7ec")
        private static SmClass smClass = null;

        @objid ("057d6b3b-8742-4a16-99d2-5c3e53e50f6b")
        private static SmDependency OutgoingAssocDep = null;

        @objid ("3c4892ca-3e8b-4c18-9502-6520dce08dc3")
        private static SmDependency IncomingAssocDep = null;

        @objid ("99896c9e-0fd7-48e5-9a91-c21ec28ab514")
        private static SmDependency IncomingFlowDep = null;

        @objid ("c09a56fc-d71a-42c3-b1c3-d89aa51184f5")
        private static SmDependency OutgoingFlowDep = null;

        @objid ("1f9aa3c0-598e-413d-bcba-40dbb284f93a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBaseElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("010882c5-94d2-4bc2-8d8b-3a02d583c3d8")
        public static SmDependency OutgoingAssocDep() {
            if (OutgoingAssocDep == null) {
            	OutgoingAssocDep = classof().getDependencyDef("OutgoingAssoc");
            }
            return OutgoingAssocDep;
        }

        @objid ("50b2610e-4c5d-46d6-bb89-5e68dcb1551c")
        public static SmDependency IncomingAssocDep() {
            if (IncomingAssocDep == null) {
            	IncomingAssocDep = classof().getDependencyDef("IncomingAssoc");
            }
            return IncomingAssocDep;
        }

        @objid ("9d108ad0-7ead-497d-9d7f-29b7bed83d7a")
        public static SmDependency IncomingFlowDep() {
            if (IncomingFlowDep == null) {
            	IncomingFlowDep = classof().getDependencyDef("IncomingFlow");
            }
            return IncomingFlowDep;
        }

        @objid ("0056c415-5f2a-4a48-8f37-2a3d92dc3f57")
        public static SmDependency OutgoingFlowDep() {
            if (OutgoingFlowDep == null) {
            	OutgoingFlowDep = classof().getDependencyDef("OutgoingFlow");
            }
            return OutgoingFlowDep;
        }

        @objid ("e8397b9d-e57a-4c1d-ae67-95196b3b4375")
        public static SmDependency getIncomingFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingFlowDep;
        }

        @objid ("db35760f-f280-4508-8938-7080cfa791ed")
        public static SmDependency getOutgoingAssocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingAssocDep;
        }

        @objid ("b0385774-cdf9-4775-ac5c-13125a3ba839")
        public static SmDependency getOutgoingFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingFlowDep;
        }

        @objid ("c013e971-6430-4430-b8f7-fefdeee770b2")
        public static SmDependency getIncomingAssocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingAssocDep;
        }

        @objid ("1cac0a55-8f72-4b24-9a51-bfdb1d1bbcc0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004c926c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("39325075-fcd1-41e8-8739-1c19e451ff16")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("b8735a02-df42-44d4-9606-5ae9f7745550")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004cf446-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutgoingAssocSmDependency extends SmMultipleDependency {
            @objid ("8019f3a0-d11a-48f5-829d-907528f5644a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mOutgoingAssoc != null)? ((BpmnBaseElementData)data).mOutgoingAssoc:SmMultipleDependency.EMPTY;
            }

            @objid ("6628117f-017c-49e6-8a6e-cd313ebfbe1b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mOutgoingAssoc = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mOutgoingAssoc;
            }

            @objid ("e69d2646-5c37-4c11-89fe-9d8bb53f81e9")
            @Override
            public SmDependency getSymetric() {
                return BpmnAssociationData.Metadata.SourceRefDep();
            }

        }

        @objid ("004d5530-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingAssocSmDependency extends SmMultipleDependency {
            @objid ("e424f6dd-b337-4cd8-a473-c3c44a06fc48")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mIncomingAssoc != null)? ((BpmnBaseElementData)data).mIncomingAssoc:SmMultipleDependency.EMPTY;
            }

            @objid ("9dca4522-03de-43b1-9856-aec7b5224d7c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mIncomingAssoc = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mIncomingAssoc;
            }

            @objid ("08995a0d-cd93-443c-aabe-129087edb04e")
            @Override
            public SmDependency getSymetric() {
                return BpmnAssociationData.Metadata.TargetRefDep();
            }

        }

        @objid ("004db6ec-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingFlowSmDependency extends SmMultipleDependency {
            @objid ("888dcf82-e11d-477e-8628-a650711e43d2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mIncomingFlow != null)? ((BpmnBaseElementData)data).mIncomingFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("83943646-e2a4-44aa-bec3-1404170e2e78")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mIncomingFlow = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mIncomingFlow;
            }

            @objid ("0b814e4e-c008-4ffa-a13b-fd11d433d400")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.TargetRefDep();
            }

        }

        @objid ("004e2366-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutgoingFlowSmDependency extends SmMultipleDependency {
            @objid ("93562a69-39bf-468c-92bd-f7dc73ae116e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mOutgoingFlow != null)? ((BpmnBaseElementData)data).mOutgoingFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("30bac708-3772-46fb-b3ac-44ba8a942c1b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mOutgoingFlow = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mOutgoingFlow;
            }

            @objid ("21159a57-17e9-411c-b600-aed6320e5288")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.SourceRefDep();
            }

        }

    }

}
