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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataStateImpl;
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

@objid ("0008b3d0-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataState.class, factory=BpmnDataStateData.Metadata.ObjectFactory.class)
public class BpmnDataStateData extends BpmnBaseElementData {
    @objid ("7e1d6e09-869b-4382-b59f-25c808e5554b")
    @SmaMetaAssociation(metaName="Item", typeDataClass=BpmnItemAwareElementData.class, min=1, max=1, smAssociationClass=Metadata.ItemSmDependency.class)
     SmObjectImpl mItem;

    @objid ("39d4c0aa-0148-45fd-943b-24da0bf72967")
    @SmaMetaAssociation(metaName="UmlState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.UmlStateSmDependency.class, partof = true)
     SmObjectImpl mUmlState;

    @objid ("ca630561-3c94-478b-84fc-52518f42cd94")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000a4880-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("44820919-4ee2-4c1d-913f-747b5eb1ed75")
        private static SmClass smClass = null;

        @objid ("fc64a799-3c4b-4f14-8282-cd262ec6dae6")
        private static SmDependency ItemDep = null;

        @objid ("24a32b55-417c-4fb9-bd74-bc5eea77cdd9")
        private static SmDependency UmlStateDep = null;

        @objid ("3a30197b-7d97-421b-aba6-c12b5a73be31")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2da5ce44-fc80-49c8-857a-ed8f56ab9860")
        public static SmDependency ItemDep() {
            if (ItemDep == null) {
            	ItemDep = classof().getDependencyDef("Item");
            }
            return ItemDep;
        }

        @objid ("530b73d2-1351-4ee1-a4ec-ab9e74cef2e0")
        public static SmDependency UmlStateDep() {
            if (UmlStateDep == null) {
            	UmlStateDep = classof().getDependencyDef("UmlState");
            }
            return UmlStateDep;
        }

        @objid ("2b0eaff6-00f7-468a-8e97-707274255bc7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("532abe9f-5de4-4ca9-878a-7c03ffd454e4")
        public static SmDependency getUmlStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UmlStateDep;
        }

        @objid ("f4560765-5112-4d37-82b5-a97a1a0c0f3b")
        public static SmDependency getItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemDep;
        }

        @objid ("000a898a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ec27a83e-3bca-4854-9fac-0a31e37d95c8")
            public ISmObjectData createData() {
                return new BpmnDataStateData();
            }

            @objid ("498d8518-f05e-4753-877f-0db8cb57172b")
            public SmObjectImpl createImpl() {
                return new BpmnDataStateImpl();
            }

        }

        @objid ("000aebb4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UmlStateSmDependency extends SmSingleDependency {
            @objid ("4c88e650-2f11-4cf0-aade-bd4946affb3c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataStateData) data).mUmlState;
            }

            @objid ("fb4b5500-558d-458e-9ad7-9b1fafae3fb5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataStateData) data).mUmlState = value;
            }

            @objid ("41bc601a-c42d-4c20-90aa-63d3d560b14b")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.BpmnDataStateRefsDep();
            }

        }

        @objid ("000b60b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemSmDependency extends SmSingleDependency {
            @objid ("31ef36a1-b48a-43c9-88ab-983c228c8916")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataStateData) data).mItem;
            }

            @objid ("1f75ed7e-4090-4b62-b796-2bc97e3e3adc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataStateData) data).mItem = value;
            }

            @objid ("b94513cf-f9b2-404e-8175-7c2c4a7f7c36")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.DataStateDep();
            }

        }

    }

}
