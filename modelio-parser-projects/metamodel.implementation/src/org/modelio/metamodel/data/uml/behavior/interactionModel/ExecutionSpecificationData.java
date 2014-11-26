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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.ExecutionOccurenceSpecificationData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.ExecutionSpecificationImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
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

@objid ("004518ac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExecutionSpecification.class, factory=ExecutionSpecificationData.Metadata.ObjectFactory.class)
public class ExecutionSpecificationData extends InteractionFragmentData {
    @objid ("340affb6-6f09-446e-a9bb-b34c103091eb")
    @SmaMetaAssociation(metaName="Finish", typeDataClass=ExecutionOccurenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.FinishSmDependency.class, partof = true)
     SmObjectImpl mFinish;

    @objid ("09ef7240-b594-47f8-923d-851c4a920f8c")
    @SmaMetaAssociation(metaName="Start", typeDataClass=ExecutionOccurenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.StartSmDependency.class)
     SmObjectImpl mStart;

    @objid ("c9cb68db-fb1e-4c08-a975-546c5a84a4eb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0048687c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("34fab113-c28f-4130-a087-c736613ea06d")
        private static SmClass smClass = null;

        @objid ("e423ff50-2813-4c68-afa7-1357bd093052")
        private static SmDependency FinishDep = null;

        @objid ("ac764533-aa1c-40e7-afcb-ac4c9fbbbd27")
        private static SmDependency StartDep = null;

        @objid ("6290f958-24c6-414c-b4aa-0a7f95b4fcf1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExecutionSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("19af408a-4065-4251-9b6b-eff040908e05")
        public static SmDependency FinishDep() {
            if (FinishDep == null) {
            	FinishDep = classof().getDependencyDef("Finish");
            }
            return FinishDep;
        }

        @objid ("0e71796a-4771-4530-aa3c-45f498d2df0b")
        public static SmDependency StartDep() {
            if (StartDep == null) {
            	StartDep = classof().getDependencyDef("Start");
            }
            return StartDep;
        }

        @objid ("3177c9e7-bd28-42d6-b0d8-6e44e189ad6c")
        public static SmDependency getFinishDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinishDep;
        }

        @objid ("8be5687d-0e69-45bb-92c3-92232d2a800b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("244ed398-935b-4bf3-ba53-e979960141ce")
        public static SmDependency getStartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartDep;
        }

        @objid ("0048ab02-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("de1cfeed-1c27-4355-a4c9-dcd6a1e128a2")
            public ISmObjectData createData() {
                return new ExecutionSpecificationData();
            }

            @objid ("211e4206-4613-461d-be63-d43579a87ef2")
            public SmObjectImpl createImpl() {
                return new ExecutionSpecificationImpl();
            }

        }

        @objid ("00490dae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class StartSmDependency extends SmSingleDependency {
            @objid ("da299f6e-5674-42c6-97e7-e39edc902c75")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionSpecificationData) data).mStart;
            }

            @objid ("d326ff15-b589-4110-a08b-376046cdfa4a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionSpecificationData) data).mStart = value;
            }

            @objid ("aef38dc6-71ba-4f08-adca-cb3cacb2401c")
            @Override
            public SmDependency getSymetric() {
                return ExecutionOccurenceSpecificationData.Metadata.StartedDep();
            }

        }

        @objid ("004983ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FinishSmDependency extends SmSingleDependency {
            @objid ("b11dcf04-ac40-4a4c-b7a0-adda6e409158")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionSpecificationData) data).mFinish;
            }

            @objid ("7ee2e09e-d1b3-4372-8b8f-e6cf8a31e1ea")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionSpecificationData) data).mFinish = value;
            }

            @objid ("7490a9f7-fcdd-4138-aabf-c0da659d7514")
            @Override
            public SmDependency getSymetric() {
                return ExecutionOccurenceSpecificationData.Metadata.FinishedDep();
            }

        }

    }

}
