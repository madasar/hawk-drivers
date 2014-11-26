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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixValueDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ExternProcessorImpl;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
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

@objid ("9bf75d8b-a1fe-4551-b3ea-8285c1a28683")
@SmaMetaClass(mmClass=ExternProcessor.class, factory=ExternProcessorData.Metadata.ObjectFactory.class)
public class ExternProcessorData extends ModelElementData {
    @objid ("8a1686e3-92d1-491f-b089-35db154e9129")
    @SmaMetaAttribute(metaName="ClassName", type=String.class, smAttributeClass=Metadata.ClassNameSmAttribute.class)
     Object mClassName = "";

    @objid ("2a587f3b-38f1-40ff-991a-270102ee3df7")
    @SmaMetaAssociation(metaName="OwnerQuery", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerQuerySmDependency.class)
     SmObjectImpl mOwnerQuery;

    @objid ("1ba507d3-cf46-46a0-bfc1-dfee1541d205")
    @SmaMetaAssociation(metaName="OwnerValDef", typeDataClass=MatrixValueDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerValDefSmDependency.class)
     SmObjectImpl mOwnerValDef;

    @objid ("c1eea76b-8727-48c9-8e45-1563a2f096ed")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("87b8e284-b2bf-4b90-9639-d885c0fa7e79")
    public static class Metadata {
        @objid ("7592567e-3c43-4efc-877a-48ae16b12277")
        private static SmClass smClass = null;

        @objid ("758a128b-0aa1-4ddf-9911-fd9793380303")
        private static SmAttribute ClassNameAtt = null;

        @objid ("a4f1e974-0604-4885-a47b-54bb94fd7b33")
        private static SmDependency OwnerQueryDep = null;

        @objid ("a7858df4-eb83-49d3-a35e-76183243f608")
        private static SmDependency OwnerValDefDep = null;

        @objid ("4a7f36d1-db10-4646-b0b0-412ce512b659")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternProcessorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9c35beed-de28-41bc-a303-f5e1ecef96b1")
        public static SmAttribute ClassNameAtt() {
            if (ClassNameAtt == null) {
            	ClassNameAtt = classof().getAttributeDef("ClassName");
            }
            return ClassNameAtt;
        }

        @objid ("3fbe349b-8768-47a4-9117-bca119dfca11")
        public static SmDependency OwnerQueryDep() {
            if (OwnerQueryDep == null) {
            	OwnerQueryDep = classof().getDependencyDef("OwnerQuery");
            }
            return OwnerQueryDep;
        }

        @objid ("4b312d27-5965-4aa5-a8d2-53b2aef0bb54")
        public static SmDependency OwnerValDefDep() {
            if (OwnerValDefDep == null) {
            	OwnerValDefDep = classof().getDependencyDef("OwnerValDef");
            }
            return OwnerValDefDep;
        }

        @objid ("dd751982-efa8-4736-8990-98f890b4b9cb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7cebf204-65b4-4325-ac60-b3d0031db207")
        public static SmDependency getOwnerQueryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerQueryDep;
        }

        @objid ("ede96885-f249-496f-b050-ef4db6aae15b")
        public static SmAttribute getClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClassNameAtt;
        }

        @objid ("381fa38c-99d0-4162-8db9-a2357bfd1081")
        public static SmDependency getOwnerValDefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerValDefDep;
        }

        @objid ("39ab5dc2-26c9-44a6-a9c5-33fd5b5db60a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79bb6470-d3b1-4680-a0f4-444442f2f7b9")
            public ISmObjectData createData() {
                return new ExternProcessorData();
            }

            @objid ("658ec2e5-105b-4baf-97c4-dc36c9560128")
            public SmObjectImpl createImpl() {
                return new ExternProcessorImpl();
            }

        }

        @objid ("adb0b02e-fff8-4898-b495-aedcdd744710")
        public static class ClassNameSmAttribute extends SmAttribute {
            @objid ("3d8991ba-b53d-4d12-b94c-a612df0fa916")
            public Object getValue(ISmObjectData data) {
                return ((ExternProcessorData) data).mClassName;
            }

            @objid ("96150487-4e10-41eb-9600-baa5114235f2")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternProcessorData) data).mClassName = value;
            }

        }

        @objid ("d19c493d-5f55-4ba4-ae34-f0f778dedbb8")
        public static class OwnerQuerySmDependency extends SmSingleDependency {
            @objid ("e140b4b3-33e3-4cd5-9894-56cdb4b9316d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternProcessorData) data).mOwnerQuery;
            }

            @objid ("a05c63b1-dc69-4bba-b650-e5caa20fcc4a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternProcessorData) data).mOwnerQuery = value;
            }

            @objid ("e935eefc-df5a-436a-973a-849c64b86176")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.ProcessorDep();
            }

        }

        @objid ("181612bc-0201-42f4-8b08-226bc4392f01")
        public static class OwnerValDefSmDependency extends SmSingleDependency {
            @objid ("d55e8391-db96-4c7e-8491-421dbc16ae64")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternProcessorData) data).mOwnerValDef;
            }

            @objid ("f0ca83d9-ca73-4d68-87a6-c980cd416d52")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternProcessorData) data).mOwnerValDef = value;
            }

            @objid ("d3b85715-dcd6-489a-bf9b-5519c1b6a6ce")
            @Override
            public SmDependency getSymetric() {
                return MatrixValueDefinitionData.Metadata.ProcessorDep();
            }

        }

    }

}
