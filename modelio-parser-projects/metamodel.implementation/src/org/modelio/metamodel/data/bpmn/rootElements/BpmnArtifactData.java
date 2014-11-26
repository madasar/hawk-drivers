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
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.data.bpmn.activities.BpmnSubProcessData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnCollaborationData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnArtifactImpl;
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

@objid ("0078e650-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnArtifact.class, factory=BpmnArtifactData.Metadata.ObjectFactory.class)
public abstract class BpmnArtifactData extends BpmnBaseElementData {
    @objid ("eb83eb76-af66-40d0-9922-72fa36f17033")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("1f959e2c-2be4-4e79-9132-7429ea8df5ea")
    @SmaMetaAssociation(metaName="Collaboration", typeDataClass=BpmnCollaborationData.class, min=0, max=1, smAssociationClass=Metadata.CollaborationSmDependency.class)
     SmObjectImpl mCollaboration;

    @objid ("e658511d-41c8-4d19-92df-8f96dafb9207")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("f08bcc0f-7337-4b70-b6fc-c3adcf299122")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00752ab0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a6f66cf3-9df1-40aa-a7c8-e6bc3d5121f9")
        private static SmClass smClass = null;

        @objid ("39840f63-db0b-43ed-a9ae-774905db9f66")
        private static SmDependency SubProcessDep = null;

        @objid ("15246f33-22b9-464b-a31c-5a7f8b5c8b56")
        private static SmDependency CollaborationDep = null;

        @objid ("0a1570e8-aa23-4683-bb4d-803849b8a0f1")
        private static SmDependency ProcessDep = null;

        @objid ("35f66ea6-e249-4057-8242-35a3b4408edc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnArtifactData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2959f99d-424e-4075-8ba6-d688e338b0bf")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("73346880-6eae-48c5-8dba-e5fb0cd0eb65")
        public static SmDependency CollaborationDep() {
            if (CollaborationDep == null) {
            	CollaborationDep = classof().getDependencyDef("Collaboration");
            }
            return CollaborationDep;
        }

        @objid ("ac687bfa-26a8-4b44-936f-be39601226d6")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("aa5ef1ea-3300-4c8f-9712-9610b5b631b3")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("f09c49a7-3413-46e5-926c-614747e30841")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("31ed3d16-6014-49d7-bb63-2d0298f99665")
        public static SmDependency getCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CollaborationDep;
        }

        @objid ("66dd854a-9ec5-47ad-a750-ea24c376d1d7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00756c1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("46f5d97f-a69e-48ff-87c9-d63aa4ef0e9d")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("7031e143-df0a-4f2d-8bcb-b101bccca0cb")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0075cf10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CollaborationSmDependency extends SmSingleDependency {
            @objid ("04e835ff-550c-49c6-95eb-1722fef4cc01")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mCollaboration;
            }

            @objid ("61bbaa8a-bdaa-4e02-a924-35572189a7a6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mCollaboration = value;
            }

            @objid ("371ba899-17c0-4ceb-bf02-004d91b70338")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.ArtifactDep();
            }

        }

        @objid ("0076444a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("a7d66063-1ebb-4bc0-8e5f-6cd96f86eb26")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mSubProcess;
            }

            @objid ("0ef42dae-523d-4e0c-965b-f6239006d8b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mSubProcess = value;
            }

            @objid ("f0bb408a-b326-43bb-9955-de5166a584dd")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.ArtifactDep();
            }

        }

        @objid ("0076bf6a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("c0df8c2e-6c89-41f5-a54a-a6051a1d3656")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mProcess;
            }

            @objid ("cf133c79-059a-4895-9144-b6cd89123da9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mProcess = value;
            }

            @objid ("0eebebed-899d-4557-929d-87c7aeb32a0e")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ArtifactDep();
            }

        }

    }

}
