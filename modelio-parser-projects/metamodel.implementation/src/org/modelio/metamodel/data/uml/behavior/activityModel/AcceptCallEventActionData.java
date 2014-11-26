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
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptCallEventActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
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

@objid ("00246896-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AcceptCallEventAction.class, factory=AcceptCallEventActionData.Metadata.ObjectFactory.class)
public class AcceptCallEventActionData extends ActivityActionData {
    @objid ("d0e6723c-67e2-44aa-a67e-20e1317cb8d7")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("92468a49-a532-44a2-8cd9-8d15554d1960")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00443982-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("931af354-489e-44d4-8f1d-6edebee38569")
        private static SmClass smClass = null;

        @objid ("96380da4-bba7-4d49-840e-872973da6860")
        private static SmDependency CalledDep = null;

        @objid ("9f1516c2-30d7-4d92-a78e-a78c6a0458fc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptCallEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6ad5af40-3e79-4848-ac1a-b4980c018301")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("81754a0b-1e2e-46ea-8d01-bf8cf333bf2c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1c691e1b-711b-40d3-8b62-ce7710472bb6")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("00447e10-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4eec1c0e-487a-4d89-ae14-0279c21b842b")
            public ISmObjectData createData() {
                return new AcceptCallEventActionData();
            }

            @objid ("0c22f50c-8d14-40b2-b89f-8d0e8fb3e9eb")
            public SmObjectImpl createImpl() {
                return new AcceptCallEventActionImpl();
            }

        }

        @objid ("0044e102-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("9329b816-abe3-41e0-8285-36a3198ec371")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AcceptCallEventActionData) data).mCalled;
            }

            @objid ("ac34b5db-dec6-4ad4-a550-3adfbe6c5f73")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AcceptCallEventActionData) data).mCalled = value;
            }

            @objid ("4fa4647f-1d13-4450-98cc-48e3fb6c9462")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.EntryPointActionDep();
            }

        }

    }

}
