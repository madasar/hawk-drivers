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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.ComponentData;
import org.modelio.metamodel.impl.uml.statik.ComponentRealizationImpl;
import org.modelio.metamodel.uml.statik.ComponentRealization;
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

@objid ("085ab992-591c-4bfe-a9dd-e52568b31bc1")
@SmaMetaClass(mmClass=ComponentRealization.class, factory=ComponentRealizationData.Metadata.ObjectFactory.class)
public class ComponentRealizationData extends ModelElementData {
    @objid ("c1be1d1c-d972-4b0b-b808-2bf9d1bbca6d")
    @SmaMetaAssociation(metaName="RealizingClassifier", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.RealizingClassifierSmDependency.class, partof = true)
     SmObjectImpl mRealizingClassifier;

    @objid ("c9eb371e-a714-47a5-8bc9-cc7fa166eaf6")
    @SmaMetaAssociation(metaName="Abstraction", typeDataClass=ComponentData.class, min=1, max=1, smAssociationClass=Metadata.AbstractionSmDependency.class)
     SmObjectImpl mAbstraction;

    @objid ("149dc186-a26d-4393-8643-602621d64875")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("6e4ef81f-0098-42d8-bed7-74982373cf11")
    public static class Metadata {
        @objid ("96e6deef-e20b-4525-a7ea-b2e2d9249996")
        private static SmClass smClass = null;

        @objid ("34019f2b-06a3-4b73-8c53-2911fab5d4a7")
        private static SmDependency RealizingClassifierDep = null;

        @objid ("40965dcd-4fd7-44f6-80ee-f7e932272ca8")
        private static SmDependency AbstractionDep = null;

        @objid ("e092abe2-2d99-4d3c-96f6-88ef71b29106")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ComponentRealizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2be192c7-8c6d-4922-a22c-093a55e20780")
        public static SmDependency RealizingClassifierDep() {
            if (RealizingClassifierDep == null) {
            	RealizingClassifierDep = classof().getDependencyDef("RealizingClassifier");
            }
            return RealizingClassifierDep;
        }

        @objid ("04f880bc-313e-45c4-9df2-2e750b6020bf")
        public static SmDependency AbstractionDep() {
            if (AbstractionDep == null) {
            	AbstractionDep = classof().getDependencyDef("Abstraction");
            }
            return AbstractionDep;
        }

        @objid ("e72ecafb-6d31-4a57-9474-0755a36df797")
        public static SmDependency getAbstractionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AbstractionDep;
        }

        @objid ("2a5e08cd-8e37-4a85-a483-a97625c1722c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ee761b28-4478-4be8-bb93-61ef74ef9b21")
        public static SmDependency getRealizingClassifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingClassifierDep;
        }

        @objid ("1812942e-747f-496c-9e18-d01bd8796d2b")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d4321c06-68f6-4e17-aac9-85bd48e35c3d")
            public ISmObjectData createData() {
                return new ComponentRealizationData();
            }

            @objid ("78aa7f45-86d9-4918-b80e-199057d291af")
            public SmObjectImpl createImpl() {
                return new ComponentRealizationImpl();
            }

        }

        @objid ("36536f6f-8be8-4f9e-b8c9-c5edcf8e4fb7")
        public static class RealizingClassifierSmDependency extends SmSingleDependency {
            @objid ("e41df955-ac29-4000-a99c-617a60f890ed")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ComponentRealizationData) data).mRealizingClassifier;
            }

            @objid ("2139bfcf-515f-4735-a79c-5354023224a6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ComponentRealizationData) data).mRealizingClassifier = value;
            }

            @objid ("28159394-374b-41ce-bf15-e9bef6d650a8")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.RealizedComponentDep();
            }

        }

        @objid ("4f228a60-bd71-49f8-acd3-79bd06eba8d2")
        public static class AbstractionSmDependency extends SmSingleDependency {
            @objid ("e0854213-b3df-45c0-b37b-59dff4ca6e3f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ComponentRealizationData) data).mAbstraction;
            }

            @objid ("58f886b0-7435-4c75-a92e-fb6bc4a1e228")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ComponentRealizationData) data).mAbstraction = value;
            }

            @objid ("c67cc81c-b3a1-414b-a22f-6a5391659268")
            @Override
            public SmDependency getSymetric() {
                return ComponentData.Metadata.RealizationDep();
            }

        }

    }

}
