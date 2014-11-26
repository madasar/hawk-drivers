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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.data.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.data.bpmn.events.BpmnEventData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionImpl;
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

@objid ("008db116-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEventDefinition.class, factory=BpmnEventDefinitionData.Metadata.ObjectFactory.class)
public abstract class BpmnEventDefinitionData extends BpmnBaseElementData {
    @objid ("8c1ec4db-b226-43f2-88fe-c88ff6102953")
    @SmaMetaAssociation(metaName="Defined", typeDataClass=BpmnEventData.class, min=0, max=1, smAssociationClass=Metadata.DefinedSmDependency.class)
     SmObjectImpl mDefined;

    @objid ("68ce57f5-f59c-42d2-b209-2c0feb8a4049")
    @SmaMetaAssociation(metaName="LoopRef", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=-1, smAssociationClass=Metadata.LoopRefSmDependency.class)
     List<SmObjectImpl> mLoopRef = null;

    @objid ("126aea1d-42bd-4054-a425-d28d1b511a25")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0090d9e0-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("57d13536-cd76-4f71-a2b1-210391c6c5d8")
        private static SmClass smClass = null;

        @objid ("f5f54887-ef80-4956-91eb-e20cf3285f43")
        private static SmDependency DefinedDep = null;

        @objid ("3b94b5b1-f1ff-4f47-8031-2ad592bd7a2e")
        private static SmDependency LoopRefDep = null;

        @objid ("e4fc11bb-da6d-418b-bf7b-1363725739a4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e03b64ed-6d24-433d-8c2d-c6cc7d1c79a5")
        public static SmDependency DefinedDep() {
            if (DefinedDep == null) {
            	DefinedDep = classof().getDependencyDef("Defined");
            }
            return DefinedDep;
        }

        @objid ("6cfa5f1e-cb45-453a-8497-f9446d755f07")
        public static SmDependency LoopRefDep() {
            if (LoopRefDep == null) {
            	LoopRefDep = classof().getDependencyDef("LoopRef");
            }
            return LoopRefDep;
        }

        @objid ("8d923a64-1eb5-4f95-a80d-7de8c4bf9e90")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("81fe0f4f-1b55-413e-979c-f0b5b2759843")
        public static SmDependency getDefinedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedDep;
        }

        @objid ("3da22d7e-a220-4301-9d70-87b420d44e60")
        public static SmDependency getLoopRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopRefDep;
        }

        @objid ("009130ca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3beef82a-99ee-4ca0-9446-fdad8994eb7d")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("d08ab719-b84c-4b27-ad9b-ef1df334de28")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0091a442-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopRefSmDependency extends SmMultipleDependency {
            @objid ("f9ec30c6-8a23-4d7c-be77-7cecf29b5ab1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEventDefinitionData)data).mLoopRef != null)? ((BpmnEventDefinitionData)data).mLoopRef:SmMultipleDependency.EMPTY;
            }

            @objid ("ec2e0b1a-8023-4889-95f4-db4d5fbe3ded")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEventDefinitionData) data).mLoopRef = new ArrayList<>(initialCapacity);
                return ((BpmnEventDefinitionData) data).mLoopRef;
            }

            @objid ("9caf4740-c93e-40a3-aba6-be2e0654a45a")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep();
            }

        }

        @objid ("00921ada-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedSmDependency extends SmSingleDependency {
            @objid ("c97c238b-d6d8-4312-a031-50049a6bec34")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnEventDefinitionData) data).mDefined;
            }

            @objid ("5e253ecb-4451-467a-b862-ff140894af56")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnEventDefinitionData) data).mDefined = value;
            }

            @objid ("a89c176a-c009-4cca-87b4-e850f8386b1e")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventData.Metadata.EventDefinitionsDep();
            }

        }

    }

}
