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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.CallBehaviorActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
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

@objid ("002b4f08-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CallBehaviorAction.class, factory=CallBehaviorActionData.Metadata.ObjectFactory.class)
public class CallBehaviorActionData extends CallActionData {
    @objid ("16172c0d-843e-4651-ac9b-adf5e1bee11a")
    @SmaMetaAssociation(metaName="Called", typeDataClass=BehaviorData.class, min=1, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("196b1636-b1f6-4c26-9c58-7f363e880055")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00274dc2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6844ab37-1426-4b69-92b5-beeca01086eb")
        private static SmClass smClass = null;

        @objid ("997796af-432e-4ed1-843b-28bb597d2a76")
        private static SmDependency CalledDep = null;

        @objid ("ee14e652-e7eb-4b5e-84c1-f900fda44cc8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallBehaviorActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9fcf0b83-6b5e-4a78-ac32-3b032e9e6fb0")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("d6f4a055-4214-4e7f-8bf6-7989db6d797a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("15ced2f0-0a52-4aa9-bfdb-901bf0abbd91")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("00278eb8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3d104c26-7eb7-4c1a-85c9-982b913f38fb")
            public ISmObjectData createData() {
                return new CallBehaviorActionData();
            }

            @objid ("ba09139d-07f2-4b20-a17f-3239b1e92523")
            public SmObjectImpl createImpl() {
                return new CallBehaviorActionImpl();
            }

        }

        @objid ("0027f0ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("e797646d-728b-4116-90fd-bb33bd4b5af1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CallBehaviorActionData) data).mCalled;
            }

            @objid ("57b5b5b5-2c4e-44e1-be69-8198687ffe7e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CallBehaviorActionData) data).mCalled = value;
            }

            @objid ("abba74ef-cf6e-4e0a-85f5-1e3bcff0358a")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.CallerDep();
            }

        }

    }

}
