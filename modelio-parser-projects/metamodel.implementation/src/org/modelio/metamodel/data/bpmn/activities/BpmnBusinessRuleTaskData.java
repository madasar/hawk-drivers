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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnBusinessRuleTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnBusinessRuleTaskImpl;
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

@objid ("007ec354-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnBusinessRuleTask.class, factory=BpmnBusinessRuleTaskData.Metadata.ObjectFactory.class)
public class BpmnBusinessRuleTaskData extends BpmnTaskData {
    @objid ("56b272b2-e2e7-4a1b-abd2-4100b28746f9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00218e82-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("318d9c80-17fb-4ea9-994f-db4f47fe5437")
        private static SmClass smClass = null;

        @objid ("78dad10a-a01e-4b63-8336-3be2ad35c5c3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBusinessRuleTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3b364e69-4654-4d97-a8ee-c1a005e11710")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0022b5dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ab5f0527-d8ee-41d6-b74b-ca424fee23e1")
            public ISmObjectData createData() {
                return new BpmnBusinessRuleTaskData();
            }

            @objid ("dc2fcd2a-0dfe-42b3-bcb2-6852dfddde28")
            public SmObjectImpl createImpl() {
                return new BpmnBusinessRuleTaskImpl();
            }

        }

    }

}
