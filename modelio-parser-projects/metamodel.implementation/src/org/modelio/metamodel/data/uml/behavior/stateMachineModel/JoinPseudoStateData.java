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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.JoinPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JoinPseudoState;
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

@objid ("00522f1a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=JoinPseudoState.class, factory=JoinPseudoStateData.Metadata.ObjectFactory.class)
public class JoinPseudoStateData extends AbstractPseudoStateData {
    @objid ("05173eac-864c-417d-8217-9346ca1234c6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00606c60-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a6dd1883-cdb4-4966-b9e3-3371daf550b7")
        private static SmClass smClass = null;

        @objid ("c3ecae60-2428-4bdf-9708-9c8acd13cf70")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(JoinPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6af40124-3ec4-44eb-9c3c-f7866c0769cb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0060af36-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d6dde967-6bd1-4e38-ab39-1916b1566990")
            public ISmObjectData createData() {
                return new JoinPseudoStateData();
            }

            @objid ("c2102223-e5d0-459b-86d7-7b0d1b9c0636")
            public SmObjectImpl createImpl() {
                return new JoinPseudoStateImpl();
            }

        }

    }

}
