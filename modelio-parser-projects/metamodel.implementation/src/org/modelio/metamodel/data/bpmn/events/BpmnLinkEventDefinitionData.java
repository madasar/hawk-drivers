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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnLinkEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnLinkEventDefinitionImpl;
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

@objid ("009084b8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnLinkEventDefinition.class, factory=BpmnLinkEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnLinkEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("4f1a34fd-2734-4567-b7a1-0e0697be5554")
    @SmaMetaAssociation(metaName="Source", typeDataClass=BpmnLinkEventDefinitionData.class, min=1, max=-1, smAssociationClass=Metadata.SourceSmDependency.class)
     List<SmObjectImpl> mSource = null;

    @objid ("fcfe8aa7-3ecf-418e-8b8a-1789ab5603e8")
    @SmaMetaAssociation(metaName="Target", typeDataClass=BpmnLinkEventDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("7c813795-80eb-4719-9ea5-2eebb156520a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00790e28-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ca54a9a7-0807-477e-9b63-268f7f51fc45")
        private static SmClass smClass = null;

        @objid ("9f4a510d-cd73-4a5c-9f81-eae218a10501")
        private static SmDependency SourceDep = null;

        @objid ("8eba035c-513f-4988-bf99-089841b8f39f")
        private static SmDependency TargetDep = null;

        @objid ("748ea100-4141-4c48-ac27-fd7d27d56d75")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLinkEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("14155ae0-83c8-4343-9638-00a839b94e6d")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("19961f4f-d0b9-47a2-afaa-01028b448899")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("5558449a-38d0-4554-9404-c79970401516")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("0d4bc8f0-4076-4abc-a5f6-fc6c41bfe555")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("bd111b8e-4bc0-4bd1-a00e-c286b9ff84c0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00794fc8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("01fd13c7-367f-4a1d-b219-78f5fab0e5de")
            public ISmObjectData createData() {
                return new BpmnLinkEventDefinitionData();
            }

            @objid ("6291e535-d595-4e49-9291-dd54147de135")
            public SmObjectImpl createImpl() {
                return new BpmnLinkEventDefinitionImpl();
            }

        }

        @objid ("0079b292-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("861d7af8-b653-40fe-84b9-b66eb9902265")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLinkEventDefinitionData) data).mTarget;
            }

            @objid ("fe87abd3-3d0e-424a-8171-538beaf8da1e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLinkEventDefinitionData) data).mTarget = value;
            }

            @objid ("9795684e-5b4d-4999-910b-f8e22f050451")
            @Override
            public SmDependency getSymetric() {
                return BpmnLinkEventDefinitionData.Metadata.SourceDep();
            }

        }

        @objid ("007a2966-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmMultipleDependency {
            @objid ("fe589bd7-6d32-49f6-867c-1d056f2c290d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLinkEventDefinitionData)data).mSource != null)? ((BpmnLinkEventDefinitionData)data).mSource:SmMultipleDependency.EMPTY;
            }

            @objid ("9e3f15e6-1869-4556-ad2c-d55118a569d1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLinkEventDefinitionData) data).mSource = new ArrayList<>(initialCapacity);
                return ((BpmnLinkEventDefinitionData) data).mSource;
            }

            @objid ("7c484d0e-8080-4ea2-9a6e-32830407c434")
            @Override
            public SmDependency getSymetric() {
                return BpmnLinkEventDefinitionData.Metadata.TargetDep();
            }

        }

    }

}
