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
import org.modelio.metamodel.bpmn.events.BpmnCancelEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnCancelEventDefinitionImpl;
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

@objid ("00886378-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCancelEventDefinition.class, factory=BpmnCancelEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnCancelEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("31acc384-dfad-4991-bc38-923d8f2839c1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0028ea1a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cc3db43b-d21c-4430-82ca-7a490bb367fe")
        private static SmClass smClass = null;

        @objid ("468ad92a-93c7-4f2a-959f-4a5872b941e9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCancelEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a2168b98-d74d-49bc-b34f-975ad0db562e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00292b74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("72ea98ad-e3a7-4d89-9ea0-046c9a899888")
            public ISmObjectData createData() {
                return new BpmnCancelEventDefinitionData();
            }

            @objid ("17e29968-7a36-43a1-ab9c-00c5afc981ca")
            public SmObjectImpl createImpl() {
                return new BpmnCancelEventDefinitionImpl();
            }

        }

    }

}
