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
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterBindingData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterImpl;
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

@objid ("000a49ca-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnResourceParameter.class, factory=BpmnResourceParameterData.Metadata.ObjectFactory.class)
public class BpmnResourceParameterData extends BpmnBaseElementData {
    @objid ("6042c7b8-924e-4f95-a60a-0eebe5cd6f86")
    @SmaMetaAttribute(metaName="IsRequired", type=Boolean.class, smAttributeClass=Metadata.IsRequiredSmAttribute.class)
     Object mIsRequired = false;

    @objid ("15edd15e-ad00-4817-ac87-45fe43d07472")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceData.class, min=1, max=1, smAssociationClass=Metadata.ResourceSmDependency.class)
     SmObjectImpl mResource;

    @objid ("8a2a1927-678e-47db-8f39-72addb76ac76")
    @SmaMetaAssociation(metaName="Type", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("6be55f5e-fa12-4128-8b4f-93c4bb0bd28e")
    @SmaMetaAssociation(metaName="ParameterBindingRefs", typeDataClass=BpmnResourceParameterBindingData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterBindingRefsSmDependency.class)
     List<SmObjectImpl> mParameterBindingRefs = null;

    @objid ("3bb0b93e-13e7-405e-bd8f-c0ba6768a790")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00160210-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("db0c77d4-6a72-402a-aaf2-08e24008468f")
        private static SmClass smClass = null;

        @objid ("b541586b-ce09-4f49-a8af-a002b56cefdb")
        private static SmAttribute IsRequiredAtt = null;

        @objid ("d9033e76-fe53-43a9-860e-80ab42621ffb")
        private static SmDependency ResourceDep = null;

        @objid ("b5178e63-b30f-4b16-999d-789172af4d72")
        private static SmDependency TypeDep = null;

        @objid ("9cea0ed5-d0b2-42ad-8167-e90c8c271ce1")
        private static SmDependency ParameterBindingRefsDep = null;

        @objid ("930f4417-9b37-4ef0-89c1-400963f9f4af")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("07d0c90d-6931-45aa-a05f-89b98f0253b6")
        public static SmAttribute IsRequiredAtt() {
            if (IsRequiredAtt == null) {
            	IsRequiredAtt = classof().getAttributeDef("IsRequired");
            }
            return IsRequiredAtt;
        }

        @objid ("739acad8-708e-41fc-82cf-43b232b91b98")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("009a693a-fb0c-4e43-81dc-8a12d6bd6706")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("d2443bf6-4f16-4768-ac15-780198975a96")
        public static SmDependency ParameterBindingRefsDep() {
            if (ParameterBindingRefsDep == null) {
            	ParameterBindingRefsDep = classof().getDependencyDef("ParameterBindingRefs");
            }
            return ParameterBindingRefsDep;
        }

        @objid ("e000af79-07b5-425d-8d66-f79977d9f0fc")
        public static SmDependency getParameterBindingRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterBindingRefsDep;
        }

        @objid ("a20fd4d7-c758-423a-a10f-5444a2d0bef2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d2011d81-48f1-4e17-ba94-383eb97272e7")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("741c4089-b4cd-4c2d-9f8c-198c762349ca")
        public static SmAttribute getIsRequiredAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsRequiredAtt;
        }

        @objid ("e8c13a8e-6469-48bc-b028-ac61afff58a7")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("00164a9a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9a65b06e-7dc3-4bab-8ff7-775a61947921")
            public ISmObjectData createData() {
                return new BpmnResourceParameterData();
            }

            @objid ("aa5325da-ee48-400f-880b-7019c0faf519")
            public SmObjectImpl createImpl() {
                return new BpmnResourceParameterImpl();
            }

        }

        @objid ("0016ac60-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsRequiredSmAttribute extends SmAttribute {
            @objid ("8f96a037-a339-4d77-9b36-a9df5c34da6e")
            public Object getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mIsRequired;
            }

            @objid ("80b6c726-64a6-4aa4-b222-33b4bd1e02f8")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnResourceParameterData) data).mIsRequired = value;
            }

        }

        @objid ("00170ee4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("842a9521-6c04-4d33-8ca3-d3e7f9c7d58a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mType;
            }

            @objid ("2a85a7d0-d4d4-4f2b-9e52-33a4c7569bf6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterData) data).mType = value;
            }

            @objid ("c04ee327-359a-4d62-89da-e89b4421a58c")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedResourceParameterDep();
            }

        }

        @objid ("00178a90-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmSingleDependency {
            @objid ("d70286fb-4043-4f4d-95fa-94cb2ed76e7f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mResource;
            }

            @objid ("47f88471-6fad-4453-a1ad-93357c347fed")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterData) data).mResource = value;
            }

            @objid ("1bf98753-3f03-47be-af0f-25e812e29ed4")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceData.Metadata.ParameterDep();
            }

        }

        @objid ("00180d26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParameterBindingRefsSmDependency extends SmMultipleDependency {
            @objid ("29f50768-4f86-49a5-b45e-c4cf8f147a2d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceParameterData)data).mParameterBindingRefs != null)? ((BpmnResourceParameterData)data).mParameterBindingRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("d6986c9b-83e6-4b73-a7be-63585d8ba78c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceParameterData) data).mParameterBindingRefs = new ArrayList<>(initialCapacity);
                return ((BpmnResourceParameterData) data).mParameterBindingRefs;
            }

            @objid ("00d97397-ef1d-468a-8fdc-e86edef70360")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterBindingData.Metadata.ParameterRefDep();
            }

        }

    }

}
