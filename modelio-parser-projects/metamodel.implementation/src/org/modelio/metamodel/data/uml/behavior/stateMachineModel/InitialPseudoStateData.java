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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.InitialPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InitialPseudoState;
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

@objid ("00512192-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InitialPseudoState.class, factory=InitialPseudoStateData.Metadata.ObjectFactory.class)
public class InitialPseudoStateData extends AbstractPseudoStateData {
    @objid ("91360bcd-d3ad-4d59-b2eb-7c898349c417")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0005be8c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("26796a12-1661-406a-b6d6-ac92e9b6a12d")
        private static SmClass smClass = null;

        @objid ("c4dfd0d3-e929-4555-957f-436233e50fe0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InitialPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("694edb6a-4bd8-460b-ba23-9d886d11525e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00061166-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6cfe716b-c4df-4881-b77c-cbf58d011991")
            public ISmObjectData createData() {
                return new InitialPseudoStateData();
            }

            @objid ("ed15652d-a7e0-4138-9ea7-e17545e2d60e")
            public SmObjectImpl createImpl() {
                return new InitialPseudoStateImpl();
            }

        }

    }

}
