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
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceImpl;
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

@objid ("0009a7d6-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnResource.class, factory=BpmnResourceData.Metadata.ObjectFactory.class)
public class BpmnResourceData extends BpmnRootElementData {
    @objid ("909535e7-9084-4e4c-a5eb-b32914222be1")
    @SmaMetaAssociation(metaName="ResourceroleRefs", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceroleRefsSmDependency.class)
     List<SmObjectImpl> mResourceroleRefs = null;

    @objid ("2b9415c5-5ab3-4f82-b0ec-4eab1e3bfece")
    @SmaMetaAssociation(metaName="Parameter", typeDataClass=BpmnResourceParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSmDependency.class, component = true)
     List<SmObjectImpl> mParameter = null;

    @objid ("db8db317-2b4b-4e6d-bb5c-c7dbf83968c1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007c39ae-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("27bffc55-2719-45d1-a2ca-fe9ccdf452e8")
        private static SmClass smClass = null;

        @objid ("3ddeb0ef-eab1-43e6-a7c0-5cca4723d09e")
        private static SmDependency ResourceroleRefsDep = null;

        @objid ("9953aac5-8a08-4bbc-b2b2-764233f815f8")
        private static SmDependency ParameterDep = null;

        @objid ("1b5130d0-b735-4028-9ba1-34049767715f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("96603e0f-b100-41cc-8e8a-fca5e73ed173")
        public static SmDependency ResourceroleRefsDep() {
            if (ResourceroleRefsDep == null) {
            	ResourceroleRefsDep = classof().getDependencyDef("ResourceroleRefs");
            }
            return ResourceroleRefsDep;
        }

        @objid ("94c30482-d67c-4947-bc08-2fd321239176")
        public static SmDependency ParameterDep() {
            if (ParameterDep == null) {
            	ParameterDep = classof().getDependencyDef("Parameter");
            }
            return ParameterDep;
        }

        @objid ("0c5d9842-6f41-4e91-ad12-4d11cf1df09d")
        public static SmDependency getResourceroleRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceroleRefsDep;
        }

        @objid ("69f61731-0f80-47a5-a23f-c6e6f60817dd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("cd8f96ee-ae99-4c8f-8bc1-8b8193266a6f")
        public static SmDependency getParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterDep;
        }

        @objid ("007c7ac2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("631fde8c-4363-4b81-bbaf-ebffb5ff3dc9")
            public ISmObjectData createData() {
                return new BpmnResourceData();
            }

            @objid ("becee9b3-0b25-44b4-a44f-2908958dd758")
            public SmObjectImpl createImpl() {
                return new BpmnResourceImpl();
            }

        }

        @objid ("007cdca6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParameterSmDependency extends SmMultipleDependency {
            @objid ("8e974ccc-dbf3-4d08-9220-a0910049739a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceData)data).mParameter != null)? ((BpmnResourceData)data).mParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("26f87f9a-cd07-4b07-b749-11d5157b86b5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceData) data).mParameter = new ArrayList<>(initialCapacity);
                return ((BpmnResourceData) data).mParameter;
            }

            @objid ("12d7a7a6-1257-4970-a035-596b5c39d7ef")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.ResourceDep();
            }

        }

        @objid ("007d3f8e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceroleRefsSmDependency extends SmMultipleDependency {
            @objid ("da10b138-79de-47cb-95c0-273172651baa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceData)data).mResourceroleRefs != null)? ((BpmnResourceData)data).mResourceroleRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("ed30b275-10fe-43a2-834f-087674d79d43")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceData) data).mResourceroleRefs = new ArrayList<>(initialCapacity);
                return ((BpmnResourceData) data).mResourceroleRefs;
            }

            @objid ("3a1d5a64-8baa-41b4-b2c7-7cf0e3d8d40e")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ResourceRefDep();
            }

        }

    }

}
