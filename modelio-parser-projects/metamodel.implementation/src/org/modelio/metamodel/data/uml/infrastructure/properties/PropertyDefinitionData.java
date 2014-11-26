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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyDefinitionImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
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

@objid ("00653092-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyDefinition.class, factory=PropertyDefinitionData.Metadata.ObjectFactory.class)
public class PropertyDefinitionData extends ModelElementData {
    @objid ("e19860ef-e84d-42d9-8692-c6e3b4733c42")
    @SmaMetaAttribute(metaName="IsEditable", type=Boolean.class, smAttributeClass=Metadata.IsEditableSmAttribute.class)
     Object mIsEditable = true;

    @objid ("779635e7-083b-4def-a2fa-682f7521c81e")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("228d0bda-32dd-475e-b5a0-a2f8fb606188")
    @SmaMetaAssociation(metaName="Type", typeDataClass=PropertyTypeData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("04c76c68-1e05-4226-bfab-ba477629029c")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("ff93cffe-f952-445d-a2fa-45a04ea6918a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002cbc58-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("cd71f1be-1390-450a-8240-6a8cdbdc3d3a")
        private static SmClass smClass = null;

        @objid ("f4049bb2-9581-456e-b8f9-4affa035482c")
        private static SmAttribute IsEditableAtt = null;

        @objid ("d2ce7557-945c-4c80-8178-645f83d3cf61")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("32fa0842-4be6-475c-b195-3bb18e0bd8fa")
        private static SmDependency TypeDep = null;

        @objid ("16192ce8-2b23-450c-805f-719176db33d3")
        private static SmDependency OwnerDep = null;

        @objid ("480bd772-5362-4326-8b39-5e9f3ea86d78")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("356af599-8ae7-438a-9246-5d407dd92602")
        public static SmAttribute IsEditableAtt() {
            if (IsEditableAtt == null) {
            	IsEditableAtt = classof().getAttributeDef("IsEditable");
            }
            return IsEditableAtt;
        }

        @objid ("87e24159-7442-408d-b90c-ddcec244d5e2")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("767be55a-1445-4ea7-8e15-342b317debc1")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("4848ac0d-19cc-4675-b9e6-65543800ccc9")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("6f0a26ee-70d7-4f5f-911b-f835acef6499")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3f5a48d4-7d87-4f4a-9f93-f0c0379ffb5e")
        public static SmAttribute getIsEditableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsEditableAtt;
        }

        @objid ("cf7e798e-9d39-44df-a142-5fc30ce2b436")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("890b1428-4cb1-4e7d-98e4-69108c87f172")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("bd394048-a638-4e84-8783-5c3c84b6c8fc")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("002d1cde-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d1bab8f5-7e29-4545-80ef-c5fc89c91ba4")
            public ISmObjectData createData() {
                return new PropertyDefinitionData();
            }

            @objid ("f0ea7bbf-1342-4eb8-a913-c06c21a05aba")
            public SmObjectImpl createImpl() {
                return new PropertyDefinitionImpl();
            }

        }

        @objid ("002dfb54-ec98-1098-b22e-001ec947cd2a")
        public static class IsEditableSmAttribute extends SmAttribute {
            @objid ("e90c6c1c-3e15-4252-9fbf-a64dba28b725")
            public Object getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mIsEditable;
            }

            @objid ("611e2dee-467c-4d4f-a495-67ceafb36bd3")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyDefinitionData) data).mIsEditable = value;
            }

        }

        @objid ("002f3528-ec98-1098-b22e-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("dda84ff9-2737-422b-bcf6-9698dec593d1")
            public Object getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mDefaultValue;
            }

            @objid ("11b4648c-e8ae-47c2-b84f-f74607c93fc7")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyDefinitionData) data).mDefaultValue = value;
            }

        }

        @objid ("0030124a-ec98-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("85835f68-fb29-4c95-b7e6-7a8b4022c4b9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mOwner;
            }

            @objid ("e950666d-287c-4a66-b7fb-e291dffeccbf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyDefinitionData) data).mOwner = value;
            }

            @objid ("408ae043-10c3-412e-83e6-f2c3c7bfe375")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnedDep();
            }

        }

        @objid ("00310a92-ec98-1098-b22e-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("2190e14c-ba0b-4eaa-9a69-f0f840367b2d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mType;
            }

            @objid ("fa6bae3d-8c6f-4f4f-a295-1eddbfce1e2e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyDefinitionData) data).mType = value;
            }

            @objid ("4febd659-f604-4591-8429-6bbb143af78a")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.TypedDep();
            }

        }

    }

}
