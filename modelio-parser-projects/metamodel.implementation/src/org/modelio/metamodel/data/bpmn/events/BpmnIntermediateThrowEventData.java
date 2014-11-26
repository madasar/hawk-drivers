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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnIntermediateThrowEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnIntermediateThrowEventImpl;
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

@objid ("008fcfb4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnIntermediateThrowEvent.class, factory=BpmnIntermediateThrowEventData.Metadata.ObjectFactory.class)
public class BpmnIntermediateThrowEventData extends BpmnThrowEventData {
    @objid ("2d59d0ea-ec60-479e-86bf-b9c040c8c8f3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0076bab0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("03dbb306-28d6-4619-a08b-d2eae01c9100")
        private static SmClass smClass = null;

        @objid ("7bf8cc81-72f1-49a2-bd33-695891b5998e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnIntermediateThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c132f493-7d54-4b25-b32b-3cd3ea92d1fc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0077d8a0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e9cda036-3e49-4ece-bd2c-dd24a7d7b13a")
            public ISmObjectData createData() {
                return new BpmnIntermediateThrowEventData();
            }

            @objid ("b5b716bc-6613-44bf-a524-efe38d55d855")
            public SmObjectImpl createImpl() {
                return new BpmnIntermediateThrowEventImpl();
            }

        }

    }

}
