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
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.data.bpmn.events.BpmnEventDefinitionData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventImpl;
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

@objid ("008cffbe-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEvent.class, factory=BpmnEventData.Metadata.ObjectFactory.class)
public abstract class BpmnEventData extends BpmnFlowNodeData {
    @objid ("4e5b7913-377e-43a5-8453-4e514a64f54b")
    @SmaMetaAssociation(metaName="EventDefinitions", typeDataClass=BpmnEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionsSmDependency.class, component = true)
     List<SmObjectImpl> mEventDefinitions = null;

    @objid ("d3e04c20-fd2f-449c-a390-16e672161f9f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007a7be6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e147dd08-1378-4e51-b077-47cc58abd76a")
        private static SmClass smClass = null;

        @objid ("0622d7b7-2162-4770-b76c-567dfd68fdbc")
        private static SmDependency EventDefinitionsDep = null;

        @objid ("49307db9-f99c-48f2-b2b6-863903375497")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9c46e0a3-a6c9-4a11-8ba8-35508ebabd4b")
        public static SmDependency EventDefinitionsDep() {
            if (EventDefinitionsDep == null) {
            	EventDefinitionsDep = classof().getDependencyDef("EventDefinitions");
            }
            return EventDefinitionsDep;
        }

        @objid ("1e051f14-888b-4ddf-8b4c-bc0fb4b166cd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8721d048-4375-4f81-b4ec-3273a726ceb9")
        public static SmDependency getEventDefinitionsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionsDep;
        }

        @objid ("007abd68-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8b2b3664-2bec-4e6a-a638-edaee828bf2c")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("44518c13-6179-4fb6-9864-b2c35a63f5a7")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("007b22b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionsSmDependency extends SmMultipleDependency {
            @objid ("8fc1fcc4-04ef-45f0-80ff-15c6663682d6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEventData)data).mEventDefinitions != null)? ((BpmnEventData)data).mEventDefinitions:SmMultipleDependency.EMPTY;
            }

            @objid ("ecc06114-d174-4919-b41b-979be51d0088")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEventData) data).mEventDefinitions = new ArrayList<>(initialCapacity);
                return ((BpmnEventData) data).mEventDefinitions;
            }

            @objid ("51555c84-0e9c-462f-ac84-e2c2c158ad6b")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventDefinitionData.Metadata.DefinedDep();
            }

        }

    }

}
