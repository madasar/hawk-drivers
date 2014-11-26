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
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnLoopCharacteristicsImpl;
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

@objid ("00804c1a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnLoopCharacteristics.class, factory=BpmnLoopCharacteristicsData.Metadata.ObjectFactory.class)
public abstract class BpmnLoopCharacteristicsData extends BpmnBaseElementData {
    @objid ("1824176e-9dc7-4a7c-8b66-8db10dc5f094")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=1, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("cffc3b18-6697-4492-83fe-b2965608a316")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00448e1e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f9a0067d-a267-4147-8ec9-be3f216926ef")
        private static SmClass smClass = null;

        @objid ("714cfba7-b24b-4a27-9972-5ea944504e17")
        private static SmDependency OwnerActivityDep = null;

        @objid ("3c337b48-715d-43f9-b721-ca92603dbbd1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("508ed8f1-c0ad-448c-a656-3ff26eceb204")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("41eb648b-b4c7-443f-9796-a1241a0f6003")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("98d3d2d8-54e8-434b-977e-bc6a73f9257e")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("0044cfd2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ca4829ac-3eff-413a-83bb-445dab805aac")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("bd9bd237-a7b5-42e5-86ce-a1a2f16171ac")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004531e8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("81d32439-1b50-47c6-8b9b-50742df950a4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLoopCharacteristicsData) data).mOwnerActivity;
            }

            @objid ("96db0abc-ddba-4f8d-a05c-0af5766fe3a7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLoopCharacteristicsData) data).mOwnerActivity = value;
            }

            @objid ("5c087e76-c13a-4afc-8edf-1a233c2aeac6")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.LoopCharacteristicsDep();
            }

        }

    }

}
