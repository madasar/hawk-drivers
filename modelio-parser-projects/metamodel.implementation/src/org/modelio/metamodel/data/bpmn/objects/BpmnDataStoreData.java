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
import org.modelio.metamodel.bpmn.objects.BpmnDataStore;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataStoreImpl;
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

@objid ("000442fa-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataStore.class, factory=BpmnDataStoreData.Metadata.ObjectFactory.class)
public class BpmnDataStoreData extends BpmnItemAwareElementData {
    @objid ("18c53f1e-2b65-4a0e-9344-3181cc19dce1")
    @SmaMetaAttribute(metaName="Capacity", type=Integer.class, smAttributeClass=Metadata.CapacitySmAttribute.class)
     Object mCapacity = 0;

    @objid ("5f3b12b8-1c49-4c0f-90df-3976f43a4646")
    @SmaMetaAttribute(metaName="IsUnlimited", type=Boolean.class, smAttributeClass=Metadata.IsUnlimitedSmAttribute.class)
     Object mIsUnlimited = false;

    @objid ("af901425-4e4d-4572-bd68-d5b01c0a3eca")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ea3a0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("afd32a75-4adb-4b62-a00c-59ef4a1f4a89")
        private static SmClass smClass = null;

        @objid ("9362ce5c-f397-4427-99b5-8e8ef8f265e1")
        private static SmAttribute CapacityAtt = null;

        @objid ("55ce405d-2f15-4420-9a24-4c431b698195")
        private static SmAttribute IsUnlimitedAtt = null;

        @objid ("4c344db1-a82b-4f8e-9f2a-89c007cbd92c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataStoreData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7c17ee19-8afe-4eb4-9cea-1015ce8dca67")
        public static SmAttribute CapacityAtt() {
            if (CapacityAtt == null) {
            	CapacityAtt = classof().getAttributeDef("Capacity");
            }
            return CapacityAtt;
        }

        @objid ("c51432c1-ea27-4ab5-8fb5-8faccfe256be")
        public static SmAttribute IsUnlimitedAtt() {
            if (IsUnlimitedAtt == null) {
            	IsUnlimitedAtt = classof().getAttributeDef("IsUnlimited");
            }
            return IsUnlimitedAtt;
        }

        @objid ("3ed25a81-1ef4-424b-8db7-46a35d297fc0")
        public static SmAttribute getCapacityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CapacityAtt;
        }

        @objid ("969d4b28-d8a1-4da2-973a-60d8fcafcccf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ed61017a-f539-4cd3-b306-78fa783a694e")
        public static SmAttribute getIsUnlimitedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUnlimitedAtt;
        }

        @objid ("003ee388-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1042eaed-a555-4cfd-b96d-ee7fea977efd")
            public ISmObjectData createData() {
                return new BpmnDataStoreData();
            }

            @objid ("01d22c09-3b82-4e08-973a-b14f3ddb1a8b")
            public SmObjectImpl createImpl() {
                return new BpmnDataStoreImpl();
            }

        }

        @objid ("003f4404-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CapacitySmAttribute extends SmAttribute {
            @objid ("98cc2e0b-8d15-460f-88e1-65c2fce37233")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataStoreData) data).mCapacity;
            }

            @objid ("936f8bdc-4772-4785-a763-d462cb0d4af8")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataStoreData) data).mCapacity = value;
            }

        }

        @objid ("003fa66a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsUnlimitedSmAttribute extends SmAttribute {
            @objid ("ce81d11d-70ae-42d1-beea-100458091346")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataStoreData) data).mIsUnlimited;
            }

            @objid ("66ac62d6-1d38-4e9f-aa56-96af7b74af5d")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataStoreData) data).mIsUnlimited = value;
            }

        }

    }

}
