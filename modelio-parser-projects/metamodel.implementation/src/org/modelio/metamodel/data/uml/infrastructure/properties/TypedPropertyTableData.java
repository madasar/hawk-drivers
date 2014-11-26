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
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.TypedPropertyTableImpl;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
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

@objid ("006b9a7c-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=TypedPropertyTable.class, factory=TypedPropertyTableData.Metadata.ObjectFactory.class)
public class TypedPropertyTableData extends PropertyTableData {
    @objid ("d1d15dd9-fcc3-4460-a0a5-e9fc31308828")
    @SmaMetaAssociation(metaName="Type", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("84854d94-cc90-4c1f-b457-03328ef3c5f0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0051a4fa-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("d8c9d4b6-ba38-4ce7-a26f-aaa58ff3f40b")
        private static SmClass smClass = null;

        @objid ("b5b8c4dd-c2b5-40a7-aabc-8117f9eb5f8d")
        private static SmDependency TypeDep = null;

        @objid ("e3bc1dae-e6eb-42d9-aabc-3a0a2c3f1c07")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TypedPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("81f2ceee-1ef1-4968-880b-2943c620ae2c")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("8e6fe6f9-50ee-435f-837e-155fd6d27bed")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("6f8ca764-fcf3-4f00-bc30-f2ae42f8ed15")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0052059e-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bfb24fc9-af78-435a-9cbc-adab444a2ae5")
            public ISmObjectData createData() {
                return new TypedPropertyTableData();
            }

            @objid ("bb6772ef-0a9f-4164-803d-120611cd5c65")
            public SmObjectImpl createImpl() {
                return new TypedPropertyTableImpl();
            }

        }

        @objid ("0052e0ae-ec98-1098-b22e-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("7a73fd18-8859-4e52-868e-5c10dee2fa98")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TypedPropertyTableData) data).mType;
            }

            @objid ("99aa072f-141d-4fd9-928d-3bd131922ad7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TypedPropertyTableData) data).mType = value;
            }

            @objid ("1aba5518-aa17-4d70-bc29-1f1d812457a7")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.TypedTableDep();
            }

        }

    }

}
