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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBehaviorImpl;
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

@objid ("007b8856-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnBehavior.class, factory=BpmnBehaviorData.Metadata.ObjectFactory.class, cmsnode=true)
public class BpmnBehaviorData extends BehaviorData {
    @objid ("4dda3dd8-1b12-4f41-a07c-ad747fb80c85")
    @SmaMetaAssociation(metaName="RootElement", typeDataClass=BpmnRootElementData.class, min=0, max=-1, smAssociationClass=Metadata.RootElementSmDependency.class, component = true)
     List<SmObjectImpl> mRootElement = null;

    @objid ("71c5184e-5006-4c2d-a976-c12d4d11e4be")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006b8f00-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("624ed231-6a53-4ba6-a1a5-38141c8dcff3")
        private static SmClass smClass = null;

        @objid ("2803ff24-22c2-4ed5-a79c-a08e108394b9")
        private static SmDependency RootElementDep = null;

        @objid ("0dfa1d42-d90b-4b55-8885-47bd47d2baf1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("baece110-635d-4926-a01c-6453e3b0e3be")
        public static SmDependency RootElementDep() {
            if (RootElementDep == null) {
            	RootElementDep = classof().getDependencyDef("RootElement");
            }
            return RootElementDep;
        }

        @objid ("b2377aff-1455-4f49-9124-0fd5e2f7507e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4bbdb3e1-c0ce-4d08-9f9c-77415237d877")
        public static SmDependency getRootElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RootElementDep;
        }

        @objid ("006bced4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b944d155-5a5c-4520-8d6b-f68d8ff8b134")
            public ISmObjectData createData() {
                return new BpmnBehaviorData();
            }

            @objid ("ff76c6bb-63df-4518-b9b8-3bc02bfc3f07")
            public SmObjectImpl createImpl() {
                return new BpmnBehaviorImpl();
            }

        }

        @objid ("006c3086-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RootElementSmDependency extends SmMultipleDependency {
            @objid ("b68d968e-3452-4152-9503-bc7fe0fb2555")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBehaviorData)data).mRootElement != null)? ((BpmnBehaviorData)data).mRootElement:SmMultipleDependency.EMPTY;
            }

            @objid ("dae9f3a3-72f9-4c55-8a0c-4d3a02ce29de")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBehaviorData) data).mRootElement = new ArrayList<>(initialCapacity);
                return ((BpmnBehaviorData) data).mRootElement;
            }

            @objid ("e02a8591-ef00-4c63-81b0-6a61393fcc67")
            @Override
            public SmDependency getSymetric() {
                return BpmnRootElementData.Metadata.OwnerDep();
            }

        }

    }

}
