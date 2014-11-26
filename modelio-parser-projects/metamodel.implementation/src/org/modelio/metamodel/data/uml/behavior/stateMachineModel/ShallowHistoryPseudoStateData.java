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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ShallowHistoryPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ShallowHistoryPseudoState;
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

@objid ("00534670-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ShallowHistoryPseudoState.class, factory=ShallowHistoryPseudoStateData.Metadata.ObjectFactory.class)
public class ShallowHistoryPseudoStateData extends AbstractPseudoStateData {
    @objid ("30976621-a849-4c7f-97f3-2d39cfb98d16")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007858ca-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("deb445c2-0808-4696-b4f2-cece18050047")
        private static SmClass smClass = null;

        @objid ("eea7e240-85a3-4ae5-a373-62039d2d4bb9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ShallowHistoryPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d99bef39-6bf3-4acc-8535-7595a0c3d995")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00789d62-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("472ee787-e0d0-4cdd-a3cb-ea87c92f90be")
            public ISmObjectData createData() {
                return new ShallowHistoryPseudoStateData();
            }

            @objid ("43275711-68ba-4031-8744-b2a6ede0e8dd")
            public SmObjectImpl createImpl() {
                return new ShallowHistoryPseudoStateImpl();
            }

        }

    }

}
