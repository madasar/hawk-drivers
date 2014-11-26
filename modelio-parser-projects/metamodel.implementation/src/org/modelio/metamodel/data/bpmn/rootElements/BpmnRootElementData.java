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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBehaviorData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
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

@objid ("007b00b6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnRootElement.class, factory=BpmnRootElementData.Metadata.ObjectFactory.class)
public abstract class BpmnRootElementData extends BpmnBaseElementData {
    @objid ("dcbcbe87-7c28-44ac-94a1-b698dc10aee2")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnBehaviorData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("a15d44dc-e986-4acc-ad3f-241b78442bef")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001b9b6c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cc217ca2-6866-4c45-b0a2-40b0fff45755")
        private static SmClass smClass = null;

        @objid ("ca8112a9-bffa-414c-9fa5-1c18cb97fcb2")
        private static SmDependency OwnerDep = null;

        @objid ("5581d1db-49e6-47dd-ab67-62f078374ec1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnRootElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8b9c46db-8774-4ea8-9775-b9f34130ead0")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("85e5cd4c-9640-41fd-9c05-331e0e85a02a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("85dd2f43-36ad-4531-a197-a195d3c85585")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("001be7c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("14bc5a28-c534-45da-878c-6db7eb31dd87")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("0ee1efee-9058-424c-ac4c-803a410e3d31")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("001c4f26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("bf04f493-9fad-4a1d-b702-ad60e3c5366d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnRootElementData) data).mOwner;
            }

            @objid ("99883df5-d9a6-4fbd-965c-ee7f636258cb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnRootElementData) data).mOwner = value;
            }

            @objid ("0d7d1886-eef0-4f89-8731-3254595fcb79")
            @Override
            public SmDependency getSymetric() {
                return BpmnBehaviorData.Metadata.RootElementDep();
            }

        }

    }

}
