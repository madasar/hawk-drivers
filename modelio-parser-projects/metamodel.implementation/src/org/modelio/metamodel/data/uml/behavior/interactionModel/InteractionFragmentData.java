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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionOperandData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionFragmentImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
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

@objid ("0047676a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InteractionFragment.class, factory=InteractionFragmentData.Metadata.ObjectFactory.class)
public abstract class InteractionFragmentData extends ModelElementData {
    @objid ("1b3096ef-b9e3-416c-b0e0-13bf266bf7b2")
    @SmaMetaAttribute(metaName="LineNumber", type=Integer.class, smAttributeClass=Metadata.LineNumberSmAttribute.class)
     Object mLineNumber = -1;

    @objid ("590f210a-a5ea-42d4-bfe7-bc1bb77efe2b")
    @SmaMetaAssociation(metaName="EnclosingOperand", typeDataClass=InteractionOperandData.class, min=0, max=1, smAssociationClass=Metadata.EnclosingOperandSmDependency.class)
     SmObjectImpl mEnclosingOperand;

    @objid ("dc46525a-7393-4fc2-9334-2612890a86eb")
    @SmaMetaAssociation(metaName="EnclosingInteraction", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.EnclosingInteractionSmDependency.class)
     SmObjectImpl mEnclosingInteraction;

    @objid ("f3d7d017-af73-41fb-9152-5c93d2bfd912")
    @SmaMetaAssociation(metaName="Covered", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.CoveredSmDependency.class, partof = true)
     List<SmObjectImpl> mCovered = null;

    @objid ("1e12d871-8c2c-42e3-99d7-bdd36ac228b3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0025b64c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d4f1c529-4ab1-4385-9bb1-3673544d8937")
        private static SmClass smClass = null;

        @objid ("91c4a375-060d-4255-a65c-7b4d1f1510de")
        private static SmAttribute LineNumberAtt = null;

        @objid ("a1edf37f-633a-414c-ad25-4ce4e71f8f73")
        private static SmDependency EnclosingOperandDep = null;

        @objid ("f27d8cff-7c2a-4fa7-8a24-2ba12debdcf6")
        private static SmDependency EnclosingInteractionDep = null;

        @objid ("8ef3f0d8-9fad-4c08-9504-41f9a663d0b2")
        private static SmDependency CoveredDep = null;

        @objid ("bea26472-79d9-44da-b04e-cb3d72ca6b19")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionFragmentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5515d211-07be-4807-bfe9-fe08afac2189")
        public static SmAttribute LineNumberAtt() {
            if (LineNumberAtt == null) {
            	LineNumberAtt = classof().getAttributeDef("LineNumber");
            }
            return LineNumberAtt;
        }

        @objid ("64da465f-116d-4cfd-94c5-25a4049e6c72")
        public static SmDependency EnclosingOperandDep() {
            if (EnclosingOperandDep == null) {
            	EnclosingOperandDep = classof().getDependencyDef("EnclosingOperand");
            }
            return EnclosingOperandDep;
        }

        @objid ("600767f1-cb06-4cf3-b9d0-a2c9d1d1afeb")
        public static SmDependency EnclosingInteractionDep() {
            if (EnclosingInteractionDep == null) {
            	EnclosingInteractionDep = classof().getDependencyDef("EnclosingInteraction");
            }
            return EnclosingInteractionDep;
        }

        @objid ("0db84add-0e3f-4f48-8220-e6c39cef319f")
        public static SmDependency CoveredDep() {
            if (CoveredDep == null) {
            	CoveredDep = classof().getDependencyDef("Covered");
            }
            return CoveredDep;
        }

        @objid ("7e29f6fc-8796-4904-addf-6bbeee4b8c6b")
        public static SmDependency getEnclosingInteractionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EnclosingInteractionDep;
        }

        @objid ("69f3421e-4d94-451a-aec9-497867686bad")
        public static SmAttribute getLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LineNumberAtt;
        }

        @objid ("9bea0b7e-ce94-40b8-93f7-35586832877e")
        public static SmDependency getCoveredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CoveredDep;
        }

        @objid ("35e407f6-91e2-4850-b21e-2cb463a7003c")
        public static SmDependency getEnclosingOperandDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EnclosingOperandDep;
        }

        @objid ("30111aab-7b56-4bb6-b426-ea2c6fc9c8f4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0025f990-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("33e774f2-0bb8-4918-bad5-a41d041f4f61")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("2697d0d7-484b-4257-8e26-3b2db2e66be3")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00265c32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LineNumberSmAttribute extends SmAttribute {
            @objid ("2e7b7629-e08d-42ee-ac70-3d9ff61a9234")
            public Object getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mLineNumber;
            }

            @objid ("7f8d08da-2023-4b3f-a9c5-ffa3932b278c")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionFragmentData) data).mLineNumber = value;
            }

        }

        @objid ("0026bf7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EnclosingInteractionSmDependency extends SmSingleDependency {
            @objid ("a19d282d-b7e6-4b53-9814-a993d7ea0b2c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mEnclosingInteraction;
            }

            @objid ("1fc4b447-af4b-4e6b-89b8-b34169dfef1f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionFragmentData) data).mEnclosingInteraction = value;
            }

            @objid ("0da901ff-122c-4c8f-9b23-d96c9225cf3c")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.FragmentDep();
            }

        }

        @objid ("00273756-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EnclosingOperandSmDependency extends SmSingleDependency {
            @objid ("6791529c-e9e8-4fd7-bad1-3e1182d9ce02")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mEnclosingOperand;
            }

            @objid ("27f2d239-e76a-4179-98df-ae339fd1e789")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionFragmentData) data).mEnclosingOperand = value;
            }

            @objid ("8f042ad2-f249-4d30-879c-40e127a788a6")
            @Override
            public SmDependency getSymetric() {
                return InteractionOperandData.Metadata.FragmentDep();
            }

        }

        @objid ("0027ad62-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CoveredSmDependency extends SmMultipleDependency {
            @objid ("6a91abad-412c-4884-a2ea-a104114a44fe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionFragmentData)data).mCovered != null)? ((InteractionFragmentData)data).mCovered:SmMultipleDependency.EMPTY;
            }

            @objid ("1097936f-9bef-4d5a-b30b-fff0aa3b4f67")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionFragmentData) data).mCovered = new ArrayList<>(initialCapacity);
                return ((InteractionFragmentData) data).mCovered;
            }

            @objid ("d8d58236-8817-460c-bbd1-e4991a949853")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.CoveredByDep();
            }

        }

    }

}
