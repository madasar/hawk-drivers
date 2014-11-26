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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ChoicePseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ChoicePseudoState;
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

@objid ("004e106a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ChoicePseudoState.class, factory=ChoicePseudoStateData.Metadata.ObjectFactory.class)
public class ChoicePseudoStateData extends AbstractPseudoStateData {
    @objid ("4f67ea17-9704-48df-83ea-bb40022ef995")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0077c680-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("97ade74a-c605-4e00-bb3d-01e5d9d131a7")
        private static SmClass smClass = null;

        @objid ("836b4dbc-e50e-4882-a144-8d574dbf1cd7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ChoicePseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6444bbcb-c1c2-4de4-ab64-a967d13f524a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00780834-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("abdc7394-6742-4642-9213-9c066660462a")
            public ISmObjectData createData() {
                return new ChoicePseudoStateData();
            }

            @objid ("df9fcb70-2712-40e3-b868-417a88c27247")
            public SmObjectImpl createImpl() {
                return new ChoicePseudoStateImpl();
            }

        }

    }

}
