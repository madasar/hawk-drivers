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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptSignalActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
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

@objid ("00255da0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AcceptSignalAction.class, factory=AcceptSignalActionData.Metadata.ObjectFactory.class)
public class AcceptSignalActionData extends ActivityActionData {
    @objid ("0d1173cd-e601-4402-acc0-59c9620cadf0")
    @SmaMetaAssociation(metaName="Accepted", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.AcceptedSmDependency.class, partof = true)
     List<SmObjectImpl> mAccepted = null;

    @objid ("3167672c-02db-4e1f-8fc6-28caf67a7590")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002cf362-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a05a6c2b-f440-40e9-a2cd-bb07299bdc88")
        private static SmClass smClass = null;

        @objid ("b62828de-90ff-4dd8-a699-3e59c50a9bbf")
        private static SmDependency AcceptedDep = null;

        @objid ("0854f2b8-a9cc-4c3e-8089-2746b8b22f91")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptSignalActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("61df70e4-8697-4fd9-85f9-2fd8b759b99c")
        public static SmDependency AcceptedDep() {
            if (AcceptedDep == null) {
            	AcceptedDep = classof().getDependencyDef("Accepted");
            }
            return AcceptedDep;
        }

        @objid ("fac2831c-f5f3-4934-8e6a-728368ce764d")
        public static SmDependency getAcceptedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AcceptedDep;
        }

        @objid ("7824f2c9-ecfa-4ada-affb-03d06b56e65c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002d38ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3f4f6d4b-46c5-478e-b9a9-b36e80be5e61")
            public ISmObjectData createData() {
                return new AcceptSignalActionData();
            }

            @objid ("76ec3c7f-d87b-4399-a62d-b9f8c50a5609")
            public SmObjectImpl createImpl() {
                return new AcceptSignalActionImpl();
            }

        }

        @objid ("002d9cd6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AcceptedSmDependency extends SmMultipleDependency {
            @objid ("1e7804e9-0858-4ff9-8c5d-82dca75d197d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AcceptSignalActionData)data).mAccepted != null)? ((AcceptSignalActionData)data).mAccepted:SmMultipleDependency.EMPTY;
            }

            @objid ("71157ecb-6ea6-42a6-9c53-4ed206e9d028")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AcceptSignalActionData) data).mAccepted = new ArrayList<>(initialCapacity);
                return ((AcceptSignalActionData) data).mAccepted;
            }

            @objid ("03413adf-2c91-4a3d-9ff5-ac788e829dab")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.ReceiverDep();
            }

        }

    }

}
