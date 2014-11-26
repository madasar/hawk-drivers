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
import org.modelio.metamodel.data.uml.behavior.interactionModel.ExecutionSpecificationData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.ExecutionOccurenceSpecificationImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
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

@objid ("00449c74-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExecutionOccurenceSpecification.class, factory=ExecutionOccurenceSpecificationData.Metadata.ObjectFactory.class)
public class ExecutionOccurenceSpecificationData extends MessageEndData {
    @objid ("ed3e90c8-6d53-45e4-9042-894aafab1f6f")
    @SmaMetaAssociation(metaName="Finished", typeDataClass=ExecutionSpecificationData.class, min=0, max=1, smAssociationClass=Metadata.FinishedSmDependency.class, istodelete = true)
     SmObjectImpl mFinished;

    @objid ("3907cf65-8ad1-40b9-a5cf-3f540e4b9939")
    @SmaMetaAssociation(metaName="Started", typeDataClass=ExecutionSpecificationData.class, min=0, max=1, smAssociationClass=Metadata.StartedSmDependency.class, partof = true, istodelete = true)
     SmObjectImpl mStarted;

    @objid ("eabeec08-1872-43fb-8f37-3e623e0b3510")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004d57e2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4d1390f7-d632-4305-be80-2a904bbc7b0a")
        private static SmClass smClass = null;

        @objid ("ba0907dc-5cd5-4fdd-92d1-03092bddeaea")
        private static SmDependency FinishedDep = null;

        @objid ("533a7795-14d6-4b0a-addb-c9ac5e5ea97e")
        private static SmDependency StartedDep = null;

        @objid ("ef54c424-fc0d-481c-b3ff-e06c7d031b6b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExecutionOccurenceSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2da5087e-ee8c-41a9-a5b6-905aeb1a7562")
        public static SmDependency FinishedDep() {
            if (FinishedDep == null) {
            	FinishedDep = classof().getDependencyDef("Finished");
            }
            return FinishedDep;
        }

        @objid ("033ff8c7-b9b9-489f-929c-f03ffa7cdfe2")
        public static SmDependency StartedDep() {
            if (StartedDep == null) {
            	StartedDep = classof().getDependencyDef("Started");
            }
            return StartedDep;
        }

        @objid ("8360aa21-171e-4900-8ab0-72d5574e82a9")
        public static SmDependency getFinishedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinishedDep;
        }

        @objid ("bfe17396-70e1-4dd6-82ae-af8ae0b7a2ee")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c8ef5aba-f9d7-4cc0-90da-60f7b73615e4")
        public static SmDependency getStartedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartedDep;
        }

        @objid ("004d99f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3bc72814-d65d-4159-9352-907c2f4a1e34")
            public ISmObjectData createData() {
                return new ExecutionOccurenceSpecificationData();
            }

            @objid ("c9c98691-e05e-49ec-b9b1-1e130057e14e")
            public SmObjectImpl createImpl() {
                return new ExecutionOccurenceSpecificationImpl();
            }

        }

        @objid ("004dfcba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StartedSmDependency extends SmSingleDependency {
            @objid ("73647a69-2977-4729-831b-1458b48a929c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionOccurenceSpecificationData) data).mStarted;
            }

            @objid ("23af3164-b92b-4437-9f76-30659c08c771")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionOccurenceSpecificationData) data).mStarted = value;
            }

            @objid ("ace18ee9-693b-4547-bbe0-e69ec86e09b3")
            @Override
            public SmDependency getSymetric() {
                return ExecutionSpecificationData.Metadata.StartDep();
            }

        }

        @objid ("004e7b90-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FinishedSmDependency extends SmSingleDependency {
            @objid ("6b648344-9af7-4592-b607-7578e1a56137")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionOccurenceSpecificationData) data).mFinished;
            }

            @objid ("e007c83a-40e0-48ed-83a6-405607d6844e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionOccurenceSpecificationData) data).mFinished = value;
            }

            @objid ("4cccb23c-71c9-4b66-b677-1655cb54f406")
            @Override
            public SmDependency getSymetric() {
                return ExecutionSpecificationData.Metadata.FinishDep();
            }

        }

    }

}
