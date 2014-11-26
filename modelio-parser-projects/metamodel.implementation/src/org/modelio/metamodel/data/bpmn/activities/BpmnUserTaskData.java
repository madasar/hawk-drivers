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
import org.modelio.metamodel.bpmn.activities.BpmnUserTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnUserTaskImpl;
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

@objid ("0086919c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnUserTask.class, factory=BpmnUserTaskData.Metadata.ObjectFactory.class)
public class BpmnUserTaskData extends BpmnTaskData {
    @objid ("d09a4c53-c056-4886-bcd8-4044dd956ea1")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("4ccf6e1c-2573-4800-9587-3056f75cbeed")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00923290-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("90c1021e-4421-48cf-a3b8-e7e68631ba40")
        private static SmClass smClass = null;

        @objid ("6ff76d94-0d27-4eae-ade5-0e575909a733")
        private static SmAttribute ImplementationAtt = null;

        @objid ("e51830a3-2725-42f9-a485-96530052967b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnUserTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("996f215a-e3bd-409c-9dbc-c3697d400b96")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("abb4b621-0a7c-4a5d-bcf0-1555882881bf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0f8c43d2-4416-409f-90ea-e720bb4f2cc8")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("00927fb6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dd8598bd-67f2-4bb0-a727-8df64924b934")
            public ISmObjectData createData() {
                return new BpmnUserTaskData();
            }

            @objid ("0e8b7d1a-23ec-42a0-a0af-15a32eb86cf8")
            public SmObjectImpl createImpl() {
                return new BpmnUserTaskImpl();
            }

        }

        @objid ("0092e366-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("3b2d8723-1cc2-433b-8f38-7a11aa052d00")
            public Object getValue(ISmObjectData data) {
                return ((BpmnUserTaskData) data).mImplementation;
            }

            @objid ("eea7baa4-5336-44c4-a089-a078443ee0c8")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnUserTaskData) data).mImplementation = value;
            }

        }

    }

}
