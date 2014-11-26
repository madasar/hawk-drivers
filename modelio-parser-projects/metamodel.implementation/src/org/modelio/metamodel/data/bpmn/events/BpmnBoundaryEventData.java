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
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.impl.bpmn.events.BpmnBoundaryEventImpl;
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

@objid ("0087c49a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnBoundaryEvent.class, factory=BpmnBoundaryEventData.Metadata.ObjectFactory.class)
public class BpmnBoundaryEventData extends BpmnCatchEventData {
    @objid ("6ed0bd8b-fcbc-4d5d-8753-cbfa1838833d")
    @SmaMetaAttribute(metaName="CancelActivity", type=Boolean.class, smAttributeClass=Metadata.CancelActivitySmAttribute.class)
     Object mCancelActivity = false;

    @objid ("180e5c86-b36d-4f9a-bdb6-89cc00b7858e")
    @SmaMetaAssociation(metaName="AttachedToRef", typeDataClass=BpmnActivityData.class, min=1, max=1, smAssociationClass=Metadata.AttachedToRefSmDependency.class)
     SmObjectImpl mAttachedToRef;

    @objid ("a3957815-a32e-4a99-b736-5520ba11da5f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003d5748-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("da1f8dc0-b050-4063-bbdc-fa779b2798c3")
        private static SmClass smClass = null;

        @objid ("0d3f6ab2-6e2f-4ca4-9003-5838f91397d3")
        private static SmAttribute CancelActivityAtt = null;

        @objid ("f23c0e16-7648-45ee-aa20-0cdd3e1f8ea6")
        private static SmDependency AttachedToRefDep = null;

        @objid ("63508097-878c-468e-bc83-13647a47677b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBoundaryEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f637acb8-ef2f-4ad5-98b8-0c810e620ea6")
        public static SmAttribute CancelActivityAtt() {
            if (CancelActivityAtt == null) {
            	CancelActivityAtt = classof().getAttributeDef("CancelActivity");
            }
            return CancelActivityAtt;
        }

        @objid ("1fc87289-2524-475c-82f0-7135457780e5")
        public static SmDependency AttachedToRefDep() {
            if (AttachedToRefDep == null) {
            	AttachedToRefDep = classof().getDependencyDef("AttachedToRef");
            }
            return AttachedToRefDep;
        }

        @objid ("748cfe49-3240-469f-95c0-fb8b51dbde67")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ef44ab3d-ad33-475a-908c-ef85200cf659")
        public static SmAttribute getCancelActivityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CancelActivityAtt;
        }

        @objid ("a9883ae6-8c36-4f61-bb54-efe7119f810e")
        public static SmDependency getAttachedToRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AttachedToRefDep;
        }

        @objid ("003d9726-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d9649a86-fcb7-480e-8307-d176435f44a9")
            public ISmObjectData createData() {
                return new BpmnBoundaryEventData();
            }

            @objid ("8f5580c2-311a-4d79-91b7-92447e2470eb")
            public SmObjectImpl createImpl() {
                return new BpmnBoundaryEventImpl();
            }

        }

        @objid ("003df752-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CancelActivitySmAttribute extends SmAttribute {
            @objid ("5d3325e2-a3bf-4981-b203-e45d59304492")
            public Object getValue(ISmObjectData data) {
                return ((BpmnBoundaryEventData) data).mCancelActivity;
            }

            @objid ("da3679b5-b243-4e11-847f-26ec6e8edb8e")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnBoundaryEventData) data).mCancelActivity = value;
            }

        }

        @objid ("003e58f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AttachedToRefSmDependency extends SmSingleDependency {
            @objid ("9e241926-01fe-404d-a1d6-2576b5886763")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnBoundaryEventData) data).mAttachedToRef;
            }

            @objid ("de54e872-ab63-4543-b4e6-aa5d3a58adcd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnBoundaryEventData) data).mAttachedToRef = value;
            }

            @objid ("1893be8d-8edc-4609-9f92-6df01f802136")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.BoundaryEventRefDep();
            }

        }

    }

}
