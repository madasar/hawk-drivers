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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.FinalStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
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

@objid ("0056aa36-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=FinalState.class, factory=FinalStateData.Metadata.ObjectFactory.class)
public class FinalStateData extends StateData {
    @objid ("0dc7ed87-2340-4ae2-8d07-11ae2b5790f6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000d2c26-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fc72176a-002b-4622-bae5-7af883949452")
        private static SmClass smClass = null;

        @objid ("ef86c613-07f9-451c-8157-faf31ec0ff6e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FinalStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6f5f50cc-db21-419d-9e62-5a412ee2bf88")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000d6de4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("00c3ef83-73a1-4f0f-a985-9a4980b49392")
            public ISmObjectData createData() {
                return new FinalStateData();
            }

            @objid ("ad46ca1e-1334-46c3-b7f2-bc7d2470cc1e")
            public SmObjectImpl createImpl() {
                return new FinalStateImpl();
            }

        }

    }

}
