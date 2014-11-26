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
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.TypedPropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableDefinitionImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
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

@objid ("0067b7c2-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyTableDefinition.class, factory=PropertyTableDefinitionData.Metadata.ObjectFactory.class, cmsnode=true)
public class PropertyTableDefinitionData extends ModelElementData {
    @objid ("831baedd-7bd2-428a-aff1-c27db0028f81")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("e69a2230-4b6c-4f85-ac40-295db3b216d7")
    @SmaMetaAssociation(metaName="TypedTable", typeDataClass=TypedPropertyTableData.class, min=0, max=-1, smAssociationClass=Metadata.TypedTableSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTypedTable = null;

    @objid ("7f06ec39-ad90-40d1-8652-535b1c03eac6")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("3134d3c8-38ef-4a9f-9659-878afa0f6042")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("3d66c39d-f340-419a-9a6e-cb88cc75cfc8")
    @SmaMetaAssociation(metaName="Owned", typeDataClass=PropertyDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedSmDependency.class, component = true)
     List<SmObjectImpl> mOwned = null;

    @objid ("19741560-1f51-443a-a5cd-4e9162644231")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078281e-ec96-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("0850576f-470d-4bac-8073-a6184617c2ed")
        private static SmClass smClass = null;

        @objid ("c0477192-b70c-4516-8ce0-035909eceff3")
        private static SmDependency OwnerDep = null;

        @objid ("ff47a341-866d-47cc-a6d9-7472eb25dd3e")
        private static SmDependency TypedTableDep = null;

        @objid ("dc0a4227-c181-476f-87b8-894e05881f89")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("b1b01a97-13df-41b9-94d5-d8fff082a30e")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("6db18dd0-a2ef-49d3-bc91-2c505489fcd4")
        private static SmDependency OwnedDep = null;

        @objid ("06ce7c25-80a9-431f-9123-9de24b775697")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTableDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("181d9e7e-552e-4991-abb7-6c829fb0e111")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("a7781d93-0c03-4c2a-be92-42d92a1af405")
        public static SmDependency TypedTableDep() {
            if (TypedTableDep == null) {
            	TypedTableDep = classof().getDependencyDef("TypedTable");
            }
            return TypedTableDep;
        }

        @objid ("9701c834-6dd0-48db-90f8-e536d2078610")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("5108033f-4bec-4048-9f7e-15d13d882acb")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("e2e59b23-cc2f-4d0e-895f-1bff82e0e35d")
        public static SmDependency OwnedDep() {
            if (OwnedDep == null) {
            	OwnedDep = classof().getDependencyDef("Owned");
            }
            return OwnedDep;
        }

        @objid ("40659fca-a207-4cdb-989f-dea472d1ce73")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("be27087d-c293-4e26-af4e-541c2abce3df")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ed2b5882-73f3-4d69-ae24-79605118136d")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("e18b15c2-6877-44be-86e1-84d670344ff4")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("24b09612-8322-472e-b00c-167c32f5d3c9")
        public static SmDependency getOwnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDep;
        }

        @objid ("67f797ff-96ff-49dc-b9d4-6d77075dab05")
        public static SmDependency getTypedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedTableDep;
        }

        @objid ("00788eda-ec96-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fe6e2547-1ec1-42b4-91ac-47b16231952b")
            public ISmObjectData createData() {
                return new PropertyTableDefinitionData();
            }

            @objid ("d92bcb0d-38f4-4a30-b99e-8162d67f27f0")
            public SmObjectImpl createImpl() {
                return new PropertyTableDefinitionImpl();
            }

        }

        @objid ("007bed14-ec96-1098-b22e-001ec947cd2a")
        public static class OwnedSmDependency extends SmMultipleDependency {
            @objid ("48a53a77-254f-4141-a597-a560c6ff9925")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTableDefinitionData)data).mOwned != null)? ((PropertyTableDefinitionData)data).mOwned:SmMultipleDependency.EMPTY;
            }

            @objid ("b21c01e2-1cb1-4473-9c43-cdbfe0c30c34")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTableDefinitionData) data).mOwned = new ArrayList<>(initialCapacity);
                return ((PropertyTableDefinitionData) data).mOwned;
            }

            @objid ("68d81cb1-3d19-4100-932a-b5899f37b2de")
            @Override
            public SmDependency getSymetric() {
                return PropertyDefinitionData.Metadata.OwnerDep();
            }

        }

        @objid ("007cd184-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("8bdd66e7-de4d-40a6-8914-dfed9602d5e7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwner;
            }

            @objid ("884de350-2d94-4cef-a708-8b5f2823acd6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwner = value;
            }

            @objid ("3aa6e5cf-30e7-4a24-b97b-ed93b2f49657")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.DefinedTableDep();
            }

        }

        @objid ("007e591e-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("7bf41f98-979d-45b5-b94c-dfd9ca69d3fc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwnerStereotype;
            }

            @objid ("3ce9b21a-b80d-44ff-bcc0-987a6d49478a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwnerStereotype = value;
            }

            @objid ("faf55f0a-4a01-4e0a-bb34-3833a2e39456")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedTableDep();
            }

        }

        @objid ("007f5cf6-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("d5bdce8e-95f7-4f44-9fd8-028f18b49a93")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwnerReference;
            }

            @objid ("9c7be0b4-859b-48c0-913c-84cd2dd421da")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwnerReference = value;
            }

            @objid ("571d8df4-4481-4ce0-b80c-5f456902d704")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedTableDep();
            }

        }

        @objid ("00805eb2-ec96-1098-b22e-001ec947cd2a")
        public static class TypedTableSmDependency extends SmMultipleDependency {
            @objid ("81f84141-8943-4a12-b5d1-6155af5326a9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTableDefinitionData)data).mTypedTable != null)? ((PropertyTableDefinitionData)data).mTypedTable:SmMultipleDependency.EMPTY;
            }

            @objid ("ce5e04a5-20a6-4633-8c79-8c99273e047f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTableDefinitionData) data).mTypedTable = new ArrayList<>(initialCapacity);
                return ((PropertyTableDefinitionData) data).mTypedTable;
            }

            @objid ("437bb454-556e-49af-ab6a-0ec341cc76dd")
            @Override
            public SmDependency getSymetric() {
                return TypedPropertyTableData.Metadata.TypeDep();
            }

        }

    }

}
