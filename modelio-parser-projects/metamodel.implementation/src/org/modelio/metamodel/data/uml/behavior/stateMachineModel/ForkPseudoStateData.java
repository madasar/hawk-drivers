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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ForkPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ForkPseudoState;
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

@objid ("00509d58-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ForkPseudoState.class, factory=ForkPseudoStateData.Metadata.ObjectFactory.class)
public class ForkPseudoStateData extends AbstractPseudoStateData {
    @objid ("58883d5c-45bb-4c94-aa14-44e327485ffb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0068642e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c5094fc9-9212-49f5-aa9e-87e5e737f357")
        private static SmClass smClass = null;

        @objid ("f14277d8-0e03-48ab-86ed-c8a7e17824d7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ForkPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("113a09cd-b5f8-4592-8374-772c6b6f794c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0068a5d8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("70c433fd-3228-44d1-a740-c81bf38a6070")
            public ISmObjectData createData() {
                return new ForkPseudoStateData();
            }

            @objid ("45904951-53a2-438d-ba6a-0eba2453d84b")
            public SmObjectImpl createImpl() {
                return new ForkPseudoStateImpl();
            }

        }

    }

}
