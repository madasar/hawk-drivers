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
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.CallOperationActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
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

@objid ("002bdfb8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CallOperationAction.class, factory=CallOperationActionData.Metadata.ObjectFactory.class)
public class CallOperationActionData extends CallActionData {
    @objid ("a4fc3f7f-6f2f-43c2-a5f4-2c125aa899dc")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=1, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("9cff3e03-aadf-40b8-83ce-3ce5ce4bdc00")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003db472-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e9d92737-fcbd-4936-bcff-0f953113eedb")
        private static SmClass smClass = null;

        @objid ("73f96137-760b-454a-b731-717aeb613f28")
        private static SmDependency CalledDep = null;

        @objid ("412d0ab7-f9a1-4bc6-968f-ef7d383fea17")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallOperationActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("18ae6b14-0489-4b1e-9158-392a2d8f89ce")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("dcdf9a06-3d22-4634-9391-307ac98ec130")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("cd116349-d641-40ac-9152-0cd16068eb81")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("003df6ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("87333c4e-7ac1-41e5-a3f2-a3f04edf2cae")
            public ISmObjectData createData() {
                return new CallOperationActionData();
            }

            @objid ("4056f171-75ca-46d5-a3aa-5bd233b6d1c0")
            public SmObjectImpl createImpl() {
                return new CallOperationActionImpl();
            }

        }

        @objid ("003e5ba2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("e8560bce-22a1-44b6-9de0-978086abfd1b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CallOperationActionData) data).mCalled;
            }

            @objid ("8a2e4036-fdb5-47ae-b6ff-9cdb11163233")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CallOperationActionData) data).mCalled = value;
            }

            @objid ("b0c28a88-8527-4bf9-bcac-263644315620")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallingActionDep();
            }

        }

    }

}
