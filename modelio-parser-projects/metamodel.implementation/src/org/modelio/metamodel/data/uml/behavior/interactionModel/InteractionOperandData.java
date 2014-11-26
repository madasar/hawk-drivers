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
import org.modelio.metamodel.data.uml.behavior.interactionModel.CombinedFragmentData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionFragmentData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionOperandImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
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

@objid ("0047edde-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InteractionOperand.class, factory=InteractionOperandData.Metadata.ObjectFactory.class)
public class InteractionOperandData extends InteractionFragmentData {
    @objid ("99e9bc3d-6296-42fc-bcfe-9293f34929f6")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("4dd1012a-b638-4ae3-8769-5ebab8ba6b40")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("a5557781-09fa-48a8-9318-c5798ebc94c1")
    @SmaMetaAssociation(metaName="Fragment", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentSmDependency.class, component = true)
     List<SmObjectImpl> mFragment = null;

    @objid ("d339ff30-55b3-4f63-939a-40e6a10a0890")
    @SmaMetaAssociation(metaName="OwnerFragment", typeDataClass=CombinedFragmentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerFragmentSmDependency.class)
     SmObjectImpl mOwnerFragment;

    @objid ("913d0ac0-8b84-4c7f-9200-f47a068685f6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00473d80-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8589fdb7-022b-4f4c-9125-ed41daa29e64")
        private static SmClass smClass = null;

        @objid ("b8226aae-f4ed-4e87-b2e2-6a428e9b93f8")
        private static SmAttribute GuardAtt = null;

        @objid ("d2b0fb3d-25f1-431c-ab4e-a2a4dfafdf7c")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("74e816da-cdde-42f0-8261-16bc510c281b")
        private static SmDependency FragmentDep = null;

        @objid ("9ab31ffe-e751-4fad-a8a2-98e791cf17a7")
        private static SmDependency OwnerFragmentDep = null;

        @objid ("aba19d9b-16d3-4c88-99ed-ceea37fbdb64")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionOperandData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("004a996c-1709-41ef-8487-8a5a19d3c640")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("036850bd-5838-4107-80da-1488a09e6ed8")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("539a7014-32c4-4e8c-811b-2fbe5f658de6")
        public static SmDependency FragmentDep() {
            if (FragmentDep == null) {
            	FragmentDep = classof().getDependencyDef("Fragment");
            }
            return FragmentDep;
        }

        @objid ("050df2e6-7141-4314-9326-8c306960cec7")
        public static SmDependency OwnerFragmentDep() {
            if (OwnerFragmentDep == null) {
            	OwnerFragmentDep = classof().getDependencyDef("OwnerFragment");
            }
            return OwnerFragmentDep;
        }

        @objid ("093c29bb-41f8-4567-99e4-05cdbc781810")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("f6fe8934-7e10-47ad-8cbc-e7ba6bc17b9b")
        public static SmDependency getFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentDep;
        }

        @objid ("6e74a911-6e4e-4974-8483-453f5a4fd9aa")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("7a3fa925-d167-42eb-a2bf-7f1d02862d4f")
        public static SmDependency getOwnerFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerFragmentDep;
        }

        @objid ("608759ca-4606-43f6-8609-97e6999de670")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00477e94-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5d0bfd34-b8f1-4d57-9ead-60bf3f262235")
            public ISmObjectData createData() {
                return new InteractionOperandData();
            }

            @objid ("cb1da7ab-ae21-4dd4-b0dc-003a3949a732")
            public SmObjectImpl createImpl() {
                return new InteractionOperandImpl();
            }

        }

        @objid ("0047e032-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("653da3b4-2641-40d4-b5fb-dbfff7ec3e50")
            public Object getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mGuard;
            }

            @objid ("799e0c24-5ec6-4bf5-84d1-f7344cd7001d")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionOperandData) data).mGuard = value;
            }

        }

        @objid ("004849c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("54222d69-bf64-4707-95cc-89cfd87369ce")
            public Object getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mEndLineNumber;
            }

            @objid ("ebc9720a-0b8c-4426-8074-2db787a2071d")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionOperandData) data).mEndLineNumber = value;
            }

        }

        @objid ("0048add2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerFragmentSmDependency extends SmSingleDependency {
            @objid ("33f7b1e3-4e82-48af-b8fe-5b8e189b9ac6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mOwnerFragment;
            }

            @objid ("5784ace0-b897-4fff-833c-0abe24465335")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionOperandData) data).mOwnerFragment = value;
            }

            @objid ("f0c1aab6-bf95-445b-86f3-a68540d35a21")
            @Override
            public SmDependency getSymetric() {
                return CombinedFragmentData.Metadata.OperandDep();
            }

        }

        @objid ("00492398-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FragmentSmDependency extends SmMultipleDependency {
            @objid ("4a34b87b-ccef-4761-bed6-86ad9188e643")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionOperandData)data).mFragment != null)? ((InteractionOperandData)data).mFragment:SmMultipleDependency.EMPTY;
            }

            @objid ("9a033c3b-9e68-482a-9180-b7c22ad07da8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionOperandData) data).mFragment = new ArrayList<>(initialCapacity);
                return ((InteractionOperandData) data).mFragment;
            }

            @objid ("c3c37e21-ac17-4e12-9713-a5aa14820e29")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.EnclosingOperandDep();
            }

        }

    }

}
