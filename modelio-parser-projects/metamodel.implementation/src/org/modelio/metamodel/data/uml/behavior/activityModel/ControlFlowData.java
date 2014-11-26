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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ControlFlowImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ControlFlow;
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

@objid ("002e4dac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ControlFlow.class, factory=ControlFlowData.Metadata.ObjectFactory.class)
public class ControlFlowData extends ActivityEdgeData {
    @objid ("c5fada13-a50b-445e-b820-7f6bccfd152a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00415adc-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ac9255d9-f3bc-4ab3-82d5-ede7b14af6d8")
        private static SmClass smClass = null;

        @objid ("8a30a6b1-5aeb-4398-9ddc-97ad85dd468c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ControlFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("99801029-dfb1-4943-a107-e94a156b253e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0041a870-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fb420cf2-bead-4139-a59a-5d73dfa32cae")
            public ISmObjectData createData() {
                return new ControlFlowData();
            }

            @objid ("f5ac1613-4a1c-423b-aaa6-45d9ce33b6f3")
            public SmObjectImpl createImpl() {
                return new ControlFlowImpl();
            }

        }

    }

}
