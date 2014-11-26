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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.data.bpmn.activities.BpmnCallActivityData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTaskImpl;
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

@objid ("00852208-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnTask.class, factory=BpmnTaskData.Metadata.ObjectFactory.class)
public class BpmnTaskData extends BpmnActivityData {
    @objid ("653d9904-0257-47d1-92d3-2ad87d637dc6")
    @SmaMetaAttribute(metaName="IsGlobal", type=Boolean.class, smAttributeClass=Metadata.IsGlobalSmAttribute.class)
     Object mIsGlobal = false;

    @objid ("3669bd67-31d3-4c61-aaff-6b2dbdb5ff8d")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("7ef53bad-3341-4706-9ca2-f2640875ee25")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00537ac8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4a004c4c-45bf-42ae-99e7-b543e879b358")
        private static SmClass smClass = null;

        @objid ("ce337022-f43c-46e4-b929-f82c5aa73dc7")
        private static SmAttribute IsGlobalAtt = null;

        @objid ("05cc9372-eacb-4b2f-a5a9-d879640c8c71")
        private static SmDependency CallerDep = null;

        @objid ("ac718dbc-6f2f-44bc-91a3-94200ceca26a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0a35563e-7e06-4a6d-b407-5de9491b4285")
        public static SmAttribute IsGlobalAtt() {
            if (IsGlobalAtt == null) {
            	IsGlobalAtt = classof().getAttributeDef("IsGlobal");
            }
            return IsGlobalAtt;
        }

        @objid ("c86160f2-2b1e-4d49-9eb5-7b6f2d3976e0")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("ee0866ed-2890-4a33-a570-669cce4e9599")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("57b6062b-d9d7-46cf-ad45-fd696cdfff95")
        public static SmAttribute getIsGlobalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsGlobalAtt;
        }

        @objid ("f59a47aa-4a48-4462-a69b-f09a15ccc40f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0053bae2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4f6e77b9-8fdd-45cc-a8f2-0e5ea579c694")
            public ISmObjectData createData() {
                return new BpmnTaskData();
            }

            @objid ("8c443263-1b2c-427e-a582-a6bebc961ef9")
            public SmObjectImpl createImpl() {
                return new BpmnTaskImpl();
            }

        }

        @objid ("00541f32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsGlobalSmAttribute extends SmAttribute {
            @objid ("655a6690-1d06-4a0b-834b-c2b9f802de58")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTaskData) data).mIsGlobal;
            }

            @objid ("afc8f2fc-8830-4a3d-b74f-815076189766")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTaskData) data).mIsGlobal = value;
            }

        }

        @objid ("005492c8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("b059ec8e-87e6-46c5-bd8e-dc5d0f82de7b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnTaskData)data).mCaller != null)? ((BpmnTaskData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("7cfe041b-3b3f-4241-8c9c-e9c94654629d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnTaskData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnTaskData) data).mCaller;
            }

            @objid ("3e5fb257-4e4b-48e8-b178-302773a58034")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledGlobalTaskDep();
            }

        }

    }

}
