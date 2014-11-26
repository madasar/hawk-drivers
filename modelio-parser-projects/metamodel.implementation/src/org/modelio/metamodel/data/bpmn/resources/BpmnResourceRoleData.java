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
package org.modelio.metamodel.data.bpmn.resources;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterBindingData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceRoleImpl;
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

@objid ("000aeda8-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnResourceRole.class, factory=BpmnResourceRoleData.Metadata.ObjectFactory.class)
public class BpmnResourceRoleData extends BpmnBaseElementData {
    @objid ("1cd9e623-74ff-415c-ac9c-74db8b2f43bd")
    @SmaMetaAssociation(metaName="ResourceRef", typeDataClass=BpmnResourceData.class, min=1, max=1, smAssociationClass=Metadata.ResourceRefSmDependency.class, partof = true)
     SmObjectImpl mResourceRef;

    @objid ("a61667a8-c021-4581-b760-e992878a0f91")
    @SmaMetaAssociation(metaName="Annotated", typeDataClass=BpmnFlowNodeData.class, min=0, max=1, smAssociationClass=Metadata.AnnotatedSmDependency.class)
     SmObjectImpl mAnnotated;

    @objid ("943dcaa3-5da3-4e3c-8ef4-0efcdebc9704")
    @SmaMetaAssociation(metaName="ResourceParameterBinding", typeDataClass=BpmnResourceParameterBindingData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceParameterBindingSmDependency.class, component = true)
     List<SmObjectImpl> mResourceParameterBinding = null;

    @objid ("059a2774-f749-4b42-9f92-360281acd866")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("3cd05945-43ee-4549-b7f6-7ef19153cfe0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0083df92-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cc13f6a0-e157-4b8a-ae9e-948716edbbb1")
        private static SmClass smClass = null;

        @objid ("080359eb-19b7-4e1b-9b61-2a4647aa3c63")
        private static SmDependency ResourceRefDep = null;

        @objid ("c6367f5c-befd-49b1-a88f-51c9222cab9b")
        private static SmDependency AnnotatedDep = null;

        @objid ("357f3d07-20f2-40d6-86ce-4ea97383f6c6")
        private static SmDependency ResourceParameterBindingDep = null;

        @objid ("1f925647-a45d-4470-8c47-e45ed380fb49")
        private static SmDependency ProcessDep = null;

        @objid ("96c6c0cf-3c63-4706-94c8-60fd441ee584")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceRoleData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("95eb8226-9041-48f8-8e23-563abbaa9626")
        public static SmDependency ResourceRefDep() {
            if (ResourceRefDep == null) {
            	ResourceRefDep = classof().getDependencyDef("ResourceRef");
            }
            return ResourceRefDep;
        }

        @objid ("4872815c-b75e-4d89-9597-8e8989742c81")
        public static SmDependency AnnotatedDep() {
            if (AnnotatedDep == null) {
            	AnnotatedDep = classof().getDependencyDef("Annotated");
            }
            return AnnotatedDep;
        }

        @objid ("481b0c40-5ff5-48ba-9ccf-1f4de37234d5")
        public static SmDependency ResourceParameterBindingDep() {
            if (ResourceParameterBindingDep == null) {
            	ResourceParameterBindingDep = classof().getDependencyDef("ResourceParameterBinding");
            }
            return ResourceParameterBindingDep;
        }

        @objid ("bf8685d7-42d3-462c-be3b-d99a6afa1651")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("336b5f13-08c8-458d-bf58-130bf2666f28")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("3902c44e-5e55-4ca4-ab6c-ce70ddd57706")
        public static SmDependency getResourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceRefDep;
        }

        @objid ("9551f0a9-5ae5-4a91-865a-aab2fb9f543a")
        public static SmDependency getAnnotatedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotatedDep;
        }

        @objid ("7695ff6b-07fd-40dd-960f-7baed821d363")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8a10cdf5-bd9f-4216-827a-416f15af15d7")
        public static SmDependency getResourceParameterBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceParameterBindingDep;
        }

        @objid ("008420a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("630c251a-7837-4914-a525-6fcdac7a2512")
            public ISmObjectData createData() {
                return new BpmnResourceRoleData();
            }

            @objid ("d6c2add1-c835-4c69-8527-2c6ca7b195c4")
            public SmObjectImpl createImpl() {
                return new BpmnResourceRoleImpl();
            }

        }

        @objid ("008483ca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceParameterBindingSmDependency extends SmMultipleDependency {
            @objid ("3ff88c1b-db14-42a4-be4f-6d3765de82ea")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceRoleData)data).mResourceParameterBinding != null)? ((BpmnResourceRoleData)data).mResourceParameterBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("bad23077-17ef-40aa-8edf-fa649d27bf6f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceRoleData) data).mResourceParameterBinding = new ArrayList<>(initialCapacity);
                return ((BpmnResourceRoleData) data).mResourceParameterBinding;
            }

            @objid ("450d438c-97e4-472a-b779-262ac4d7f268")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterBindingData.Metadata.ResourceRoleDep();
            }

        }

        @objid ("0084e680-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceRefSmDependency extends SmSingleDependency {
            @objid ("9eb028f3-902c-41d5-8a56-d72174a22c93")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mResourceRef;
            }

            @objid ("053a47e7-efb5-42fa-8ac5-f82bf36d9941")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mResourceRef = value;
            }

            @objid ("dd4c171c-d84a-4ac3-8af3-96ecdc9de221")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceData.Metadata.ResourceroleRefsDep();
            }

        }

        @objid ("00855b88-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("d1387df3-2d76-42c2-8571-499fd3ac4637")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mProcess;
            }

            @objid ("b6763d6e-c3c6-4339-982b-eff9c3841ecf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mProcess = value;
            }

            @objid ("498638af-76ab-4f33-8a4e-77a18d801d5d")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ResourceDep();
            }

        }

        @objid ("0085d0f4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AnnotatedSmDependency extends SmSingleDependency {
            @objid ("1484613b-1bb1-4d47-8354-1b0790de1baf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mAnnotated;
            }

            @objid ("2cb5c7f8-3184-4b6c-9127-5a585437a32c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mAnnotated = value;
            }

            @objid ("30c440dc-9d4f-4781-860f-cc4bb194b30a")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.ResourceDep();
            }

        }

    }

}
