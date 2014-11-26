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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.data.bpmn.activities.BpmnComplexBehaviorDefinitionData;
import org.modelio.metamodel.impl.bpmn.events.BpmnImplicitThrowEventImpl;
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

@objid ("008e6250-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnImplicitThrowEvent.class, factory=BpmnImplicitThrowEventData.Metadata.ObjectFactory.class)
public class BpmnImplicitThrowEventData extends BpmnThrowEventData {
    @objid ("8f0d8866-01f9-41a5-a351-9bf96407a396")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnComplexBehaviorDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("eb0ad7f2-f1a7-40c4-b1c0-4e41eee43957")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0064aa00-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("acd43bd0-610f-4e95-8272-1e1357b1baa8")
        private static SmClass smClass = null;

        @objid ("0baa8b4f-7b01-495b-8439-ab495e73c6d5")
        private static SmDependency OwnerDep = null;

        @objid ("a95a8ef8-bd5e-46f7-b57c-49c23a69d05b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnImplicitThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("88089ded-832b-4e64-8e4e-dd237f74c3be")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("02991617-3a97-4798-9c7b-ab566984efc2")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("303e9ecb-e2e5-4661-8b36-46fa002aae3d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0064e9d4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c9e5d653-7b9b-4fc1-bbd8-709442805705")
            public ISmObjectData createData() {
                return new BpmnImplicitThrowEventData();
            }

            @objid ("effde7d2-7de8-4469-86a1-5172d45d0ebe")
            public SmObjectImpl createImpl() {
                return new BpmnImplicitThrowEventImpl();
            }

        }

        @objid ("00655784-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("2e2975d5-ae03-42e7-b457-321eaca211e1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnImplicitThrowEventData) data).mOwner;
            }

            @objid ("cf9fefa3-08ed-46b1-9aca-cb2fb5afbb29")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnImplicitThrowEventData) data).mOwner = value;
            }

            @objid ("8077f62f-cba5-4d44-bd7b-2cfe444d2a99")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexBehaviorDefinitionData.Metadata.EventDep();
            }

        }

    }

}
