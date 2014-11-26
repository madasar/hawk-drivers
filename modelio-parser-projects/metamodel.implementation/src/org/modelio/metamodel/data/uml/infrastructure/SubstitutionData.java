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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.impl.uml.infrastructure.SubstitutionImpl;
import org.modelio.metamodel.uml.infrastructure.Substitution;
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

@objid ("008e4b26-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Substitution.class, factory=SubstitutionData.Metadata.ObjectFactory.class)
public class SubstitutionData extends ModelElementData {
    @objid ("16cc9fe0-d1f2-4604-8c7c-6d08a220c581")
    @SmaMetaAssociation(metaName="Contract", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.ContractSmDependency.class, partof = true)
     SmObjectImpl mContract;

    @objid ("94a68406-1d2b-4226-8d85-b3256c6c2d6d")
    @SmaMetaAssociation(metaName="SubstitutingClassifier", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.SubstitutingClassifierSmDependency.class)
     SmObjectImpl mSubstitutingClassifier;

    @objid ("ece9c9f8-947a-4fbc-89e7-9e5b63ae84ee")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004975f0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("44a5c4bc-f315-45f1-8084-280bd8664e05")
        private static SmClass smClass = null;

        @objid ("8bb96b56-7d54-45cb-95fa-6424df460b7b")
        private static SmDependency ContractDep = null;

        @objid ("ee8c1ca3-11e5-497b-aab2-e6b31e8e2b0c")
        private static SmDependency SubstitutingClassifierDep = null;

        @objid ("8382420d-c187-42c0-8bce-6ba403814740")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SubstitutionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("46d0697d-324b-47d9-b010-8dfdd8dabc7b")
        public static SmDependency ContractDep() {
            if (ContractDep == null) {
            	ContractDep = classof().getDependencyDef("Contract");
            }
            return ContractDep;
        }

        @objid ("d257b772-025a-45b5-9c9e-80b7a9270cc7")
        public static SmDependency SubstitutingClassifierDep() {
            if (SubstitutingClassifierDep == null) {
            	SubstitutingClassifierDep = classof().getDependencyDef("SubstitutingClassifier");
            }
            return SubstitutingClassifierDep;
        }

        @objid ("c3305639-6515-4c5a-bc92-a45cd4a528ea")
        public static SmDependency getSubstitutingClassifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubstitutingClassifierDep;
        }

        @objid ("391c9af4-e632-460d-a56a-dbf7741ce065")
        public static SmDependency getContractDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContractDep;
        }

        @objid ("8f6e007f-93bb-4c16-a523-6f9620733b1f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0049b5c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("28be9460-c520-43ec-807b-55c82696e995")
            public ISmObjectData createData() {
                return new SubstitutionData();
            }

            @objid ("fb0ba980-0d75-4e81-b8eb-b1dad1f5945e")
            public SmObjectImpl createImpl() {
                return new SubstitutionImpl();
            }

        }

        @objid ("004a16f4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubstitutingClassifierSmDependency extends SmSingleDependency {
            @objid ("87fa7af4-50f4-4b76-aedd-547938b8fafd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SubstitutionData) data).mSubstitutingClassifier;
            }

            @objid ("a878a108-806c-4658-9cf1-3d618523cede")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SubstitutionData) data).mSubstitutingClassifier = value;
            }

            @objid ("d018f760-83d4-46c7-bafb-0371a071e74c")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.SubstituedDep();
            }

        }

        @objid ("004a8fda-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ContractSmDependency extends SmSingleDependency {
            @objid ("28ba7258-2db4-4b10-88ba-83c37866ec15")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SubstitutionData) data).mContract;
            }

            @objid ("263bf7df-c169-4ece-9414-c48a3d588ead")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SubstitutionData) data).mContract = value;
            }

            @objid ("2c231a30-6e49-4a5f-b6e8-68eb4d295acf")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.SubstitutingSubstitutionDep();
            }

        }

    }

}
