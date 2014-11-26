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
package org.modelio.metamodel.data.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.analyst.PropertyContainerData;
import org.modelio.metamodel.data.mda.ModuleComponentData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTypeImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
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

@objid ("006f8eac-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyType.class, factory=PropertyTypeData.Metadata.ObjectFactory.class, cmsnode=true)
public class PropertyTypeData extends ModelElementData {
    @objid ("fbb043b0-e6f9-4307-94e9-a12e189eb108")
    @SmaMetaAttribute(metaName="BaseType", type=PropertyBaseType.class, smAttributeClass=Metadata.BaseTypeSmAttribute.class)
     Object mBaseType = PropertyBaseType.STRING;

    @objid ("b7dc7278-e1f7-43a2-9be1-ed873717ff71")
    @SmaMetaAssociation(metaName="AnalystOwner", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.AnalystOwnerSmDependency.class)
     SmObjectImpl mAnalystOwner;

    @objid ("79f5c387-e0fd-4ebc-88b8-c6f30d050ac4")
    @SmaMetaAssociation(metaName="Typed", typeDataClass=PropertyDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.TypedSmDependency.class)
     List<SmObjectImpl> mTyped = null;

    @objid ("d322c846-3c62-46ea-8d64-001988c77d74")
    @SmaMetaAssociation(metaName="ModuleOwner", typeDataClass=ModuleComponentData.class, min=1, max=1, smAssociationClass=Metadata.ModuleOwnerSmDependency.class)
     SmObjectImpl mModuleOwner;

    @objid ("a3a1b784-c846-4116-abef-8e5871c81872")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00499648-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("60e55954-1a3f-4da1-800e-1680b3834bbe")
        private static SmClass smClass = null;

        @objid ("07867c6c-b30e-458c-a36c-317a7d293699")
        private static SmAttribute BaseTypeAtt = null;

        @objid ("08844a68-9b32-4696-8f0b-c45456ba5466")
        private static SmDependency AnalystOwnerDep = null;

        @objid ("b56e9fd7-7f6a-43a1-981a-cfbf444f2330")
        private static SmDependency TypedDep = null;

        @objid ("ef8db69a-0888-4ec5-b4f5-73e2cd38e5e3")
        private static SmDependency ModuleOwnerDep = null;

        @objid ("07e87e94-765a-469c-a7d6-96f386b4ce95")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("82c7fb39-d811-4f6f-aaba-98d3e2121888")
        public static SmAttribute BaseTypeAtt() {
            if (BaseTypeAtt == null) {
            	BaseTypeAtt = classof().getAttributeDef("BaseType");
            }
            return BaseTypeAtt;
        }

        @objid ("4214b4e5-5b29-4225-9e0e-f8c9d4de4b81")
        public static SmDependency AnalystOwnerDep() {
            if (AnalystOwnerDep == null) {
            	AnalystOwnerDep = classof().getDependencyDef("AnalystOwner");
            }
            return AnalystOwnerDep;
        }

        @objid ("f0f2c254-9e75-46d8-bc0c-f411e592d37d")
        public static SmDependency TypedDep() {
            if (TypedDep == null) {
            	TypedDep = classof().getDependencyDef("Typed");
            }
            return TypedDep;
        }

        @objid ("a4df06e4-d204-45ac-b495-1672471e7d32")
        public static SmDependency ModuleOwnerDep() {
            if (ModuleOwnerDep == null) {
            	ModuleOwnerDep = classof().getDependencyDef("ModuleOwner");
            }
            return ModuleOwnerDep;
        }

        @objid ("c8f71cea-9b3e-4708-a4ad-d1447b533713")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0a942a8a-71a0-4e8a-9c71-383bfea41f60")
        public static SmDependency getTypedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedDep;
        }

        @objid ("cc54b3fa-c3bf-4f94-95c9-eeabc03bf039")
        public static SmDependency getAnalystOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystOwnerDep;
        }

        @objid ("5947cfb9-5d45-48b0-9724-a8906d850464")
        public static SmAttribute getBaseTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseTypeAtt;
        }

        @objid ("a212ff7f-f34f-4c61-867b-5583d224002a")
        public static SmDependency getModuleOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModuleOwnerDep;
        }

        @objid ("0049f962-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e44f5312-c012-4f6d-bfb6-d4bd0474c675")
            public ISmObjectData createData() {
                return new PropertyTypeData();
            }

            @objid ("3298ce10-80e0-48fb-b62f-29fa98765505")
            public SmObjectImpl createImpl() {
                return new PropertyTypeImpl();
            }

        }

        @objid ("004ad864-ec98-1098-b22e-001ec947cd2a")
        public static class TypedSmDependency extends SmMultipleDependency {
            @objid ("7cbe2518-4e00-4eca-bc08-bf31be12cdd0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTypeData)data).mTyped != null)? ((PropertyTypeData)data).mTyped:SmMultipleDependency.EMPTY;
            }

            @objid ("e0772c10-4664-4678-bc6e-ce1b647f37b0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTypeData) data).mTyped = new ArrayList<>(initialCapacity);
                return ((PropertyTypeData) data).mTyped;
            }

            @objid ("7c3ade45-9421-4cce-8ba0-fe2bb23e467c")
            @Override
            public SmDependency getSymetric() {
                return PropertyDefinitionData.Metadata.TypeDep();
            }

        }

        @objid ("099f04db-280e-11e2-b500-001ec947ccaf")
        public static class AnalystOwnerSmDependency extends SmSingleDependency {
            @objid ("5a79aa47-b0c1-4cad-ac39-af915ccfd227")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mAnalystOwner;
            }

            @objid ("ead55b71-0f21-47bd-b2a3-5a4c9841536b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTypeData) data).mAnalystOwner = value;
            }

            @objid ("c05e53af-3e9d-4ebb-b3cf-c604617441c4")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.DefinedTypeDep();
            }

        }

        @objid ("09a3c987-280e-11e2-b500-001ec947ccaf")
        public static class ModuleOwnerSmDependency extends SmSingleDependency {
            @objid ("1d9a4d7a-baf3-48fa-b23a-4cc3b0af17ed")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mModuleOwner;
            }

            @objid ("d3b43577-1384-41ff-8c1a-02ef05e27ce8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTypeData) data).mModuleOwner = value;
            }

            @objid ("7be0b90a-55da-4c83-b6bb-bab84a646110")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.DefinedPropertyTypeDep();
            }

        }

        @objid ("13c25e19-281f-11e2-bf07-001ec947ccaf")
        public static class BaseTypeSmAttribute extends SmAttribute {
            @objid ("11a72fce-092b-4b99-bba9-f0c617924331")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mBaseType;
            }

            @objid ("1c67da6f-6092-4912-a65b-33fa7d5b4cb6")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTypeData) data).mBaseType = value;
            }

        }

    }

}
