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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTypeData;
import org.modelio.metamodel.impl.analyst.PropertyContainerImpl;
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

@objid ("00633774-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyContainer.class, factory=PropertyContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class PropertyContainerData extends ModelElementData {
    @objid ("8182e539-1fbb-417b-a529-8987e43d61ef")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTable = null;

    @objid ("a377cddf-7cc6-49d4-b7ee-26b0f7059111")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=1, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("15275369-22fe-495c-8ecc-1b652334f1ff")
    @SmaMetaAssociation(metaName="DefinedType", typeDataClass=PropertyTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedType = null;

    @objid ("85beca3b-547f-45b5-9c3f-a947cdf01037")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0022b5be-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a6806308-231a-4277-95e2-87d3cf8ad302")
        private static SmClass smClass = null;

        @objid ("37a9ad9a-54a4-4d8c-9eaa-550e0b6484f8")
        private static SmDependency DefinedTableDep = null;

        @objid ("5141035d-840e-4bc1-a328-671aee6562e7")
        private static SmDependency OwnerProjectDep = null;

        @objid ("50bf10e1-94b5-42b7-a34b-5d27af925192")
        private static SmDependency DefinedTypeDep = null;

        @objid ("1ceeed81-a2ab-49e3-9edd-3ee7dc6c5805")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9468daec-6658-4123-9168-915afb2230a7")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("8c469049-996d-4277-88a9-85d7eaf5e46c")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("bb98443e-1f2f-46fa-b57b-06dff219fffc")
        public static SmDependency DefinedTypeDep() {
            if (DefinedTypeDep == null) {
            	DefinedTypeDep = classof().getDependencyDef("DefinedType");
            }
            return DefinedTypeDep;
        }

        @objid ("03a737e7-7c7f-43d0-8eda-6e61223b2976")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("fe87befe-1087-4c5c-98d2-568ffffaedf0")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("553a5eb4-500e-4625-93a0-599acf8bc37b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("da925fe4-9d6b-41f8-89a7-0c97115d8be4")
        public static SmDependency getDefinedTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTypeDep;
        }

        @objid ("0022f772-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4686f333-e016-48ea-b86d-3309ecec2a1e")
            public ISmObjectData createData() {
                return new PropertyContainerData();
            }

            @objid ("fa59616b-55f4-4eb9-b952-881020c92796")
            public SmObjectImpl createImpl() {
                return new PropertyContainerImpl();
            }

        }

        @objid ("0024357e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefinedTypeSmDependency extends SmMultipleDependency {
            @objid ("a381456f-b77c-4577-ae47-49a9b7d2b856")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyContainerData)data).mDefinedType != null)? ((PropertyContainerData)data).mDefinedType:SmMultipleDependency.EMPTY;
            }

            @objid ("d90c54b6-44ba-4b15-b74c-181522266d4a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyContainerData) data).mDefinedType = new ArrayList<>(initialCapacity);
                return ((PropertyContainerData) data).mDefinedType;
            }

            @objid ("bc15b613-2dee-49f7-bd3c-cac8c73715f1")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.AnalystOwnerDep();
            }

        }

        @objid ("0056f23e-ec97-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmMultipleDependency {
            @objid ("cbf0d7ce-1495-4122-9cb2-1451386dcb42")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyContainerData)data).mDefinedTable != null)? ((PropertyContainerData)data).mDefinedTable:SmMultipleDependency.EMPTY;
            }

            @objid ("d9d5eaa2-6b34-4b2d-aac5-daf411998a14")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyContainerData) data).mDefinedTable = new ArrayList<>(initialCapacity);
                return ((PropertyContainerData) data).mDefinedTable;
            }

            @objid ("9a9fe1f8-d30c-4cd1-990b-7b18fbd4a13f")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerDep();
            }

        }

        @objid ("29a02661-f07f-4f9f-b5ba-270e0e1a234d")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("808fc95d-6bcf-483e-a256-7e4ac71d8b33")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyContainerData) data).mOwnerProject;
            }

            @objid ("e1d551ea-b2e9-48e1-a20a-47fb7e728e4c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyContainerData) data).mOwnerProject = value;
            }

            @objid ("25e59d56-4e04-4d47-b8c2-a964113cce9e")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.PropertyRootDep();
            }

        }

    }

}
