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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TerminatePseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.TerminatePseudoState;
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

@objid ("0055823c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TerminatePseudoState.class, factory=TerminatePseudoStateData.Metadata.ObjectFactory.class)
public class TerminatePseudoStateData extends AbstractPseudoStateData {
    @objid ("99b78db7-ff41-40af-8519-503aee31fdf5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e38d0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d7419db9-dfe7-4b1b-b1ea-6be2f7c82c30")
        private static SmClass smClass = null;

        @objid ("20b464b3-5064-4b11-a32a-aa827ba989ca")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TerminatePseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a1fff26c-2dde-40d7-b95d-0a756f3ece38")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007e8ca4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a1380460-92b3-490c-b61e-272a14c6d8e0")
            public ISmObjectData createData() {
                return new TerminatePseudoStateData();
            }

            @objid ("3cc337e7-4931-46fe-828a-2b0c951e8d3b")
            public SmObjectImpl createImpl() {
                return new TerminatePseudoStateImpl();
            }

        }

    }

}
