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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.JunctionPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JunctionPseudoState;
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

@objid ("0052b73c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=JunctionPseudoState.class, factory=JunctionPseudoStateData.Metadata.ObjectFactory.class)
public class JunctionPseudoStateData extends AbstractPseudoStateData {
    @objid ("74345bc3-28a8-44cb-8f13-191ee5e0433f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001ea3d4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4460c189-32a8-4d97-a6ee-9a6876de8db4")
        private static SmClass smClass = null;

        @objid ("948bdabe-3685-4cba-8ef4-06781375d38a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(JunctionPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("65679e11-4560-485c-87df-3ee0dc986fb9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001ee8da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e092a2c3-7952-45ef-ae05-0c3634ce12b0")
            public ISmObjectData createData() {
                return new JunctionPseudoStateData();
            }

            @objid ("0ef9075b-aac1-4bdf-9d71-ef1494c7038c")
            public SmObjectImpl createImpl() {
                return new JunctionPseudoStateImpl();
            }

        }

    }

}
