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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionUseImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
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

@objid ("0048846a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InteractionUse.class, factory=InteractionUseData.Metadata.ObjectFactory.class)
public class InteractionUseData extends InteractionFragmentData {
    @objid ("6e66fdf0-3548-48ea-9895-26eb35f594d1")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("91db0dc0-c622-4f71-8335-a0d365abae5f")
    @SmaMetaAssociation(metaName="ActualGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.ActualGateSmDependency.class, component = true)
     List<SmObjectImpl> mActualGate = null;

    @objid ("52274df1-40ce-43db-b873-260db8759118")
    @SmaMetaAssociation(metaName="RefersTo", typeDataClass=InteractionData.class, min=1, max=1, smAssociationClass=Metadata.RefersToSmDependency.class, partof = true)
     SmObjectImpl mRefersTo;

    @objid ("6af40371-533e-478e-81a1-7dd7cceeccaa")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0075f526-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3f873215-363c-49dc-bef3-bd78dfcec66f")
        private static SmClass smClass = null;

        @objid ("8983e436-1a02-4e3f-8c49-a1d34ad7432a")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("353a7430-e974-4551-b771-f70449a653f6")
        private static SmDependency ActualGateDep = null;

        @objid ("7acf2267-f609-40cd-906b-ef77526be55d")
        private static SmDependency RefersToDep = null;

        @objid ("3d3e76ed-e80c-4657-9cb1-1cfdf5187a0a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("69018a33-38b2-45ea-b046-0edbf521c007")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("4db6f4a0-dd0c-42a4-ab13-b736ca89ffef")
        public static SmDependency ActualGateDep() {
            if (ActualGateDep == null) {
            	ActualGateDep = classof().getDependencyDef("ActualGate");
            }
            return ActualGateDep;
        }

        @objid ("be8e6f69-7a83-4174-aa71-ad8489814436")
        public static SmDependency RefersToDep() {
            if (RefersToDep == null) {
            	RefersToDep = classof().getDependencyDef("RefersTo");
            }
            return RefersToDep;
        }

        @objid ("b7be366f-757f-4de9-b92a-d3b10f6c6ae1")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("3b65ee49-01c7-4b6a-a0f2-cbc1e543fc23")
        public static SmDependency getActualGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualGateDep;
        }

        @objid ("1b6a5b2d-fa09-4df3-bd04-c3d47e76e8fa")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a7f66aa7-074f-42a0-97b8-104a5c2a3775")
        public static SmDependency getRefersToDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RefersToDep;
        }

        @objid ("00763720-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f870cf8b-6e38-4d9e-9e2b-32dc2878c76e")
            public ISmObjectData createData() {
                return new InteractionUseData();
            }

            @objid ("8877958b-4680-4705-b9c0-6d8013a4671b")
            public SmObjectImpl createImpl() {
                return new InteractionUseImpl();
            }

        }

        @objid ("007699c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("1acd89b4-ae64-4f12-bc30-045cf6241dc9")
            public Object getValue(ISmObjectData data) {
                return ((InteractionUseData) data).mEndLineNumber;
            }

            @objid ("02f4fe79-06c4-4e05-9b45-24fb949fc47e")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionUseData) data).mEndLineNumber = value;
            }

        }

        @objid ("0076fce6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RefersToSmDependency extends SmSingleDependency {
            @objid ("90fe1c8e-15e4-4b67-9893-81558484bb2c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionUseData) data).mRefersTo;
            }

            @objid ("eece7e89-737f-4e0c-8f88-de99d2a51e73")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionUseData) data).mRefersTo = value;
            }

            @objid ("db8483bd-d1b9-4909-8ba8-726255fab552")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.ReferedUseDep();
            }

        }

        @objid ("007773ce-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActualGateSmDependency extends SmMultipleDependency {
            @objid ("5e1fa06e-b227-47d3-8325-1bada355d7da")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionUseData)data).mActualGate != null)? ((InteractionUseData)data).mActualGate:SmMultipleDependency.EMPTY;
            }

            @objid ("fa28a3be-a60e-4bfb-b04b-3c64bef71b72")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionUseData) data).mActualGate = new ArrayList<>(initialCapacity);
                return ((InteractionUseData) data).mActualGate;
            }

            @objid ("77286f39-e45d-44c9-840f-0a36eb4872b6")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerUseDep();
            }

        }

    }

}
