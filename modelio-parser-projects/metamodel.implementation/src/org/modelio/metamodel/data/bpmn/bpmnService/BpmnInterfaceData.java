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
package org.modelio.metamodel.data.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnInterfaceImpl;
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

@objid ("000e4fac-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnInterface.class, factory=BpmnInterfaceData.Metadata.ObjectFactory.class)
public class BpmnInterfaceData extends BpmnRootElementData {
    @objid ("1f8976dd-fb01-4ed2-968f-0ad83c307972")
    @SmaMetaAssociation(metaName="ImplementationRef", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.ImplementationRefSmDependency.class, partof = true)
     SmObjectImpl mImplementationRef;

    @objid ("325eae8f-bd95-4269-bc6a-e7e32305a508")
    @SmaMetaAssociation(metaName="Operation", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.OperationSmDependency.class, component = true)
     List<SmObjectImpl> mOperation = null;

    @objid ("163ff8aa-a73e-4e5a-a960-304265b82c2d")
    @SmaMetaAssociation(metaName="ParticipantRef", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantRefSmDependency.class)
     List<SmObjectImpl> mParticipantRef = null;

    @objid ("ed8519ae-85c1-4e88-9b23-51558074b6fd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0001b468-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0bf06c27-068f-4d99-9777-5a1c64a1eac1")
        private static SmClass smClass = null;

        @objid ("61defc6b-d5a2-44e9-9e4b-ed1267a587b4")
        private static SmDependency ImplementationRefDep = null;

        @objid ("340eb1b8-0b34-4e01-ae27-e53c18358a7d")
        private static SmDependency OperationDep = null;

        @objid ("fdaf52e7-a516-4546-bffd-bd6720d885ab")
        private static SmDependency ParticipantRefDep = null;

        @objid ("bef66e84-3ab9-4914-93a2-71a593f143b9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4d2cd17d-7754-460d-adf6-f2ef71f25636")
        public static SmDependency ImplementationRefDep() {
            if (ImplementationRefDep == null) {
            	ImplementationRefDep = classof().getDependencyDef("ImplementationRef");
            }
            return ImplementationRefDep;
        }

        @objid ("61598cc3-e6d3-48a5-a86d-eb57868fc96e")
        public static SmDependency OperationDep() {
            if (OperationDep == null) {
            	OperationDep = classof().getDependencyDef("Operation");
            }
            return OperationDep;
        }

        @objid ("89b0ff1b-df80-4b85-b04d-0bdd35d9e7fa")
        public static SmDependency ParticipantRefDep() {
            if (ParticipantRefDep == null) {
            	ParticipantRefDep = classof().getDependencyDef("ParticipantRef");
            }
            return ParticipantRefDep;
        }

        @objid ("1317f221-72ab-445a-892a-72027f90c59f")
        public static SmDependency getParticipantRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantRefDep;
        }

        @objid ("a7ecd5b1-e3b4-4843-9453-c0ff006cbb8a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("57d1b4df-3851-4ece-a879-26ced9d4468d")
        public static SmDependency getOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationDep;
        }

        @objid ("5f299651-4951-4672-a187-830b476168ba")
        public static SmDependency getImplementationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationRefDep;
        }

        @objid ("0001f5cc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("31d02a09-3875-4c81-a73f-4506c37fdf72")
            public ISmObjectData createData() {
                return new BpmnInterfaceData();
            }

            @objid ("01a250cd-764a-4fb5-a74e-b3106cbe21d6")
            public SmObjectImpl createImpl() {
                return new BpmnInterfaceImpl();
            }

        }

        @objid ("0002581e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperationSmDependency extends SmMultipleDependency {
            @objid ("4b9b3902-042f-446a-9fdd-721510a672e4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnInterfaceData)data).mOperation != null)? ((BpmnInterfaceData)data).mOperation:SmMultipleDependency.EMPTY;
            }

            @objid ("8772d2cf-c608-43f6-ad56-a746a2f967eb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnInterfaceData) data).mOperation = new ArrayList<>(initialCapacity);
                return ((BpmnInterfaceData) data).mOperation;
            }

            @objid ("4d2037d9-5a4e-476f-9798-419d29883d28")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.BpmnInterfaceRefDep();
            }

        }

        @objid ("0002bffc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationRefSmDependency extends SmSingleDependency {
            @objid ("b2e74cb2-2ebf-47e2-af9b-6cd19d156d71")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnInterfaceData) data).mImplementationRef;
            }

            @objid ("b4338b9c-0ab2-4a30-a4c9-1e6982476549")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnInterfaceData) data).mImplementationRef = value;
            }

            @objid ("6db7ca3f-b9b1-4c5a-9758-4fb7f551672e")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnInterfaceRefsDep();
            }

        }

        @objid ("000335a4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParticipantRefSmDependency extends SmMultipleDependency {
            @objid ("fc4cf4f8-9cc0-41e2-b3a2-46fb417cef26")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnInterfaceData)data).mParticipantRef != null)? ((BpmnInterfaceData)data).mParticipantRef:SmMultipleDependency.EMPTY;
            }

            @objid ("1d0daf25-0c31-4c85-9982-5e566b6d90e2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnInterfaceData) data).mParticipantRef = new ArrayList<>(initialCapacity);
                return ((BpmnInterfaceData) data).mParticipantRef;
            }

            @objid ("e03638df-7c6d-448b-b16c-225077cd0b3a")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.InterfaceRefsDep();
            }

        }

    }

}
