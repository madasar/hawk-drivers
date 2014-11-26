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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionFragmentData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.PartDecompositionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.LifelineImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
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

@objid ("00490d86-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Lifeline.class, factory=LifelineData.Metadata.ObjectFactory.class)
public class LifelineData extends ModelElementData {
    @objid ("52be0206-8a02-469e-865c-4b3ca184a27e")
    @SmaMetaAttribute(metaName="Selector", type=String.class, smAttributeClass=Metadata.SelectorSmAttribute.class)
     Object mSelector = "";

    @objid ("8b3214ad-8474-4701-8dac-721705b1c00d")
    @SmaMetaAssociation(metaName="CoveredBy", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.CoveredBySmDependency.class)
     List<SmObjectImpl> mCoveredBy = null;

    @objid ("e82f0710-83f5-4110-92de-7e17f23f1cc3")
    @SmaMetaAssociation(metaName="DecomposedAs", typeDataClass=PartDecompositionData.class, min=0, max=1, smAssociationClass=Metadata.DecomposedAsSmDependency.class, component = true)
     SmObjectImpl mDecomposedAs;

    @objid ("430791f5-4eba-42a5-b9d6-d6fa47c2453c")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("0d78a3ce-940c-4e9e-b254-3287e382b997")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("67ce45cb-7a3d-4cdc-8091-db0c7aa186c2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0051c94e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f59777a4-c881-4f30-b7e3-7f7b70a48e33")
        private static SmClass smClass = null;

        @objid ("04c45d95-937e-43f5-a31f-30d59bf213a3")
        private static SmAttribute SelectorAtt = null;

        @objid ("5d85cde4-93ea-4928-af24-00114a86fe96")
        private static SmDependency CoveredByDep = null;

        @objid ("c87718d3-8527-4369-aeb6-91113e69467d")
        private static SmDependency DecomposedAsDep = null;

        @objid ("57e65ccc-4bbc-4d1a-bf70-f268dbbaa94c")
        private static SmDependency OwnerDep = null;

        @objid ("ac7afda4-7f1b-4052-a2b4-e51ebbbb9ec9")
        private static SmDependency RepresentedDep = null;

        @objid ("1e9c6395-6c6a-4741-86e5-ed156ac7010a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LifelineData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a30e0337-acdd-49a8-ba9f-65d966affbef")
        public static SmAttribute SelectorAtt() {
            if (SelectorAtt == null) {
            	SelectorAtt = classof().getAttributeDef("Selector");
            }
            return SelectorAtt;
        }

        @objid ("57fe0f4d-ddb5-4f22-8746-afbe406d4225")
        public static SmDependency CoveredByDep() {
            if (CoveredByDep == null) {
            	CoveredByDep = classof().getDependencyDef("CoveredBy");
            }
            return CoveredByDep;
        }

        @objid ("d2bbe57f-138e-4916-bdba-8983c5f5789e")
        public static SmDependency DecomposedAsDep() {
            if (DecomposedAsDep == null) {
            	DecomposedAsDep = classof().getDependencyDef("DecomposedAs");
            }
            return DecomposedAsDep;
        }

        @objid ("3767df17-6575-4c4e-ae5d-5280e4c73e72")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("2b1aca14-604f-43ba-b54f-a4c866eec4b8")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("9d711837-180a-4011-bebc-728d8792c765")
        public static SmAttribute getSelectorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectorAtt;
        }

        @objid ("b50713a4-4ea7-430f-95b3-a861a4c13ea4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7445d99d-0924-4980-9d42-a0d5c52df198")
        public static SmDependency getCoveredByDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CoveredByDep;
        }

        @objid ("a66af6ad-553f-447d-8126-aa4226a9212b")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("1a75ccc6-4baa-45c7-bcaa-691e2b93e6d9")
        public static SmDependency getDecomposedAsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecomposedAsDep;
        }

        @objid ("8e2d55b0-6072-4148-b226-a652c8d5c95d")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("00520b52-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fbe6c182-68dc-4963-9f27-a5bcca94ad80")
            public ISmObjectData createData() {
                return new LifelineData();
            }

            @objid ("53f63b24-46da-4b1f-9353-d793a17200cc")
            public SmObjectImpl createImpl() {
                return new LifelineImpl();
            }

        }

        @objid ("00526e30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SelectorSmAttribute extends SmAttribute {
            @objid ("3278d1e5-c982-4348-9cf0-852f63d1d687")
            public Object getValue(ISmObjectData data) {
                return ((LifelineData) data).mSelector;
            }

            @objid ("6bf770f3-9f97-4f4e-8d3f-8d3906658850")
            public void setValue(ISmObjectData data, Object value) {
                ((LifelineData) data).mSelector = value;
            }

        }

        @objid ("0052d1f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CoveredBySmDependency extends SmMultipleDependency {
            @objid ("6fa41456-1d78-47b2-b559-a592a6fb8d52")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LifelineData)data).mCoveredBy != null)? ((LifelineData)data).mCoveredBy:SmMultipleDependency.EMPTY;
            }

            @objid ("860eacf8-ae73-42d8-b56d-28ec3c5d3ab6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LifelineData) data).mCoveredBy = new ArrayList<>(initialCapacity);
                return ((LifelineData) data).mCoveredBy;
            }

            @objid ("6d049e1f-4f76-4023-a9b1-930acb7ecb4e")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.CoveredDep();
            }

        }

        @objid ("00533694-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecomposedAsSmDependency extends SmSingleDependency {
            @objid ("c3b791f8-5d68-4eff-a006-cdd15044d7e3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mDecomposedAs;
            }

            @objid ("ca307569-e552-41c8-ab75-0d49e8639d0b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mDecomposedAs = value;
            }

            @objid ("b1ebdd68-9b78-4af0-9308-8edd30a16051")
            @Override
            public SmDependency getSymetric() {
                return PartDecompositionData.Metadata.DecomposedDep();
            }

        }

        @objid ("0053adc2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("8aed581d-b664-423a-99b7-85b87820ae1d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mOwner;
            }

            @objid ("48982869-57f9-44ee-93d0-ad1581fad010")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mOwner = value;
            }

            @objid ("5030ced3-a56f-4138-9dbb-0d84fa32d9c3")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.OwnedLineDep();
            }

        }

        @objid ("005424aa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("045661d8-d1c3-41f3-90e4-d0ac2f42f34e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mRepresented;
            }

            @objid ("81e8a617-8d55-487c-8303-c51772f5a778")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mRepresented = value;
            }

            @objid ("7d2d0689-daa0-45dd-8a03-d1b22b8e5915")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentedLifeLineDep();
            }

        }

    }

}
