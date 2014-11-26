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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GateData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionOperandData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.CombinedFragmentImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperator;
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

@objid ("0043a60c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CombinedFragment.class, factory=CombinedFragmentData.Metadata.ObjectFactory.class)
public class CombinedFragmentData extends InteractionFragmentData {
    @objid ("f77e3f31-7ce2-42bf-891c-639c1c3746e9")
    @SmaMetaAttribute(metaName="Operator", type=InteractionOperator.class, smAttributeClass=Metadata.OperatorSmAttribute.class)
     Object mOperator = InteractionOperator.SEQOP;

    @objid ("96d6809c-d5c2-4cd1-a4fd-2a60e41f7b0c")
    @SmaMetaAssociation(metaName="Operand", typeDataClass=InteractionOperandData.class, min=1, max=-1, smAssociationClass=Metadata.OperandSmDependency.class, component = true)
     List<SmObjectImpl> mOperand = null;

    @objid ("dec3f98f-3a16-488c-9809-91d6496084e4")
    @SmaMetaAssociation(metaName="FragmentGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentGateSmDependency.class, component = true)
     List<SmObjectImpl> mFragmentGate = null;

    @objid ("ea0d0efb-9a37-48d2-bc7e-28ae34b2fb69")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0073515e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a8b4abc2-060d-485c-b5c7-1d4f31dc981c")
        private static SmClass smClass = null;

        @objid ("5d183be7-3c9b-4878-b603-da1be7c22820")
        private static SmAttribute OperatorAtt = null;

        @objid ("9477319d-5fc4-466a-b29b-2d016229a4b4")
        private static SmDependency OperandDep = null;

        @objid ("b140b809-4368-4853-912d-0a1c5608a75a")
        private static SmDependency FragmentGateDep = null;

        @objid ("6852589f-723b-4777-93e4-fb8b24230339")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CombinedFragmentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8a8ca401-9b12-45fa-b49e-a2891e4ab90d")
        public static SmAttribute OperatorAtt() {
            if (OperatorAtt == null) {
            	OperatorAtt = classof().getAttributeDef("Operator");
            }
            return OperatorAtt;
        }

        @objid ("29c42007-75c6-41bc-88b5-ca5c1068236b")
        public static SmDependency OperandDep() {
            if (OperandDep == null) {
            	OperandDep = classof().getDependencyDef("Operand");
            }
            return OperandDep;
        }

        @objid ("e46b2b93-0066-47cf-8aa8-e8b7381fd53c")
        public static SmDependency FragmentGateDep() {
            if (FragmentGateDep == null) {
            	FragmentGateDep = classof().getDependencyDef("FragmentGate");
            }
            return FragmentGateDep;
        }

        @objid ("f08a7cce-2416-4ae0-ac21-cdf6cf5e6dfb")
        public static SmAttribute getOperatorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperatorAtt;
        }

        @objid ("03b4e725-2d78-4b1a-8387-81496fa089cc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c6141d46-7aa5-4cbc-8d92-54e4d75bb746")
        public static SmDependency getOperandDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperandDep;
        }

        @objid ("e25f3c1e-d3ff-4079-bbc6-3701147850f5")
        public static SmDependency getFragmentGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentGateDep;
        }

        @objid ("0073940c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fff8f804-f0fd-4eb1-bfda-9e300f271257")
            public ISmObjectData createData() {
                return new CombinedFragmentData();
            }

            @objid ("64ea65ea-aad5-4ac6-82c6-0a403e044bce")
            public SmObjectImpl createImpl() {
                return new CombinedFragmentImpl();
            }

        }

        @objid ("00740b62-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperatorSmAttribute extends SmAttribute {
            @objid ("3a6f026a-5153-4093-8aeb-36ec6cae5906")
            public Object getValue(ISmObjectData data) {
                return ((CombinedFragmentData) data).mOperator;
            }

            @objid ("ea122d81-b849-41d8-8dc8-82e54084d334")
            public void setValue(ISmObjectData data, Object value) {
                ((CombinedFragmentData) data).mOperator = value;
            }

        }

        @objid ("007473f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FragmentGateSmDependency extends SmMultipleDependency {
            @objid ("167da48f-e75f-4626-842d-738dd4a68c98")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CombinedFragmentData)data).mFragmentGate != null)? ((CombinedFragmentData)data).mFragmentGate:SmMultipleDependency.EMPTY;
            }

            @objid ("674a5e48-322b-4af4-aed2-1b075bf7ce51")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CombinedFragmentData) data).mFragmentGate = new ArrayList<>(initialCapacity);
                return ((CombinedFragmentData) data).mFragmentGate;
            }

            @objid ("893d1929-9dda-4caf-9fb7-d127ca78faad")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerFragmentDep();
            }

        }

        @objid ("0074d880-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperandSmDependency extends SmMultipleDependency {
            @objid ("d1fd59f3-1ff9-4c91-bd8f-fc6c9be98941")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CombinedFragmentData)data).mOperand != null)? ((CombinedFragmentData)data).mOperand:SmMultipleDependency.EMPTY;
            }

            @objid ("fd062e7a-e99b-430a-aaf5-193fbf1dc97c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CombinedFragmentData) data).mOperand = new ArrayList<>(initialCapacity);
                return ((CombinedFragmentData) data).mOperand;
            }

            @objid ("20dcd889-40fe-4971-917d-aeaead397d10")
            @Override
            public SmDependency getSymetric() {
                return InteractionOperandData.Metadata.OwnerFragmentDep();
            }

        }

    }

}
