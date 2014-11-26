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
package org.modelio.metamodel.data.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationNodeData;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationInteractionImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
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

@objid ("005a6928-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CommunicationInteraction.class, factory=CommunicationInteractionData.Metadata.ObjectFactory.class, cmsnode=true)
public class CommunicationInteractionData extends BehaviorData {
    @objid ("e0b395b9-9a74-4a7f-9e33-cd67350777d5")
    @SmaMetaAssociation(metaName="Owned", typeDataClass=CommunicationNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedSmDependency.class, component = true)
     List<SmObjectImpl> mOwned = null;

    @objid ("c889d930-b687-43c7-b131-67a8d5368afc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001108b4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5db094d3-edf4-460a-a443-b1bd90ab8bd8")
        private static SmClass smClass = null;

        @objid ("c68424b8-2f5a-45e1-b775-7357e08dce73")
        private static SmDependency OwnedDep = null;

        @objid ("3889a1f3-be5b-4799-aed0-76b824ad598b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationInteractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("41bbc4c2-6122-4e3a-8fb5-7f7821eff74e")
        public static SmDependency OwnedDep() {
            if (OwnedDep == null) {
            	OwnedDep = classof().getDependencyDef("Owned");
            }
            return OwnedDep;
        }

        @objid ("c4a5f0ba-23dc-472d-8527-b8ddbadb9dc3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7aec53eb-935c-483f-8ad8-eaf1d8001826")
        public static SmDependency getOwnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDep;
        }

        @objid ("00114ad6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fc5ea761-0d97-475f-bec1-2df3c460e44b")
            public ISmObjectData createData() {
                return new CommunicationInteractionData();
            }

            @objid ("0391a0ab-072d-4e35-9a3c-b744057a5aba")
            public SmObjectImpl createImpl() {
                return new CommunicationInteractionImpl();
            }

        }

        @objid ("0011ad6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedSmDependency extends SmMultipleDependency {
            @objid ("6ed9e97c-57d0-4d66-888e-17fa23b57b21")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationInteractionData)data).mOwned != null)? ((CommunicationInteractionData)data).mOwned:SmMultipleDependency.EMPTY;
            }

            @objid ("45eb5e36-0b9d-469c-9172-0d9ee07edfb8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationInteractionData) data).mOwned = new ArrayList<>(initialCapacity);
                return ((CommunicationInteractionData) data).mOwned;
            }

            @objid ("6c9fef90-ef64-4a57-be5b-3a44dce0a609")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.OwnerDep();
            }

        }

    }

}
