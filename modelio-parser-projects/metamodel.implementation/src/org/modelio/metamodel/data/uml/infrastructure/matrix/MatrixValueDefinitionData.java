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
package org.modelio.metamodel.data.uml.infrastructure.matrix;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.infrastructure.ExternProcessorData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixValueDefinitionImpl;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
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

@objid ("f8547119-965d-492b-818a-83746a647c78")
@SmaMetaClass(mmClass=MatrixValueDefinition.class, factory=MatrixValueDefinitionData.Metadata.ObjectFactory.class)
public class MatrixValueDefinitionData extends ElementData {
    @objid ("1ceffe24-873a-42ef-b6db-e2e8d24cca40")
    @SmaMetaAssociation(metaName="Processor", typeDataClass=ExternProcessorData.class, min=1, max=1, smAssociationClass=Metadata.ProcessorSmDependency.class, component = true)
     SmObjectImpl mProcessor;

    @objid ("5a9946bb-7499-44cf-9770-7342186431af")
    @SmaMetaAssociation(metaName="Parameters", typeDataClass=PropertyTableData.class, min=1, max=1, smAssociationClass=Metadata.ParametersSmDependency.class, component = true)
     SmObjectImpl mParameters;

    @objid ("ea0294ca-4d8e-40c2-b042-95c1d3c397ae")
    @SmaMetaAssociation(metaName="Matrix", typeDataClass=MatrixDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.MatrixSmDependency.class)
     SmObjectImpl mMatrix;

    @objid ("3e4749c6-d2b7-43ad-b6ed-356a699805b8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("3158f254-b1ee-46ad-8292-8d24135be062")
    public static class Metadata {
        @objid ("f416c8d4-239a-48cd-9d69-369efb203300")
        private static SmClass smClass = null;

        @objid ("ab9d0725-ed7b-4f3d-a6b9-761b8cee1ceb")
        private static SmDependency ProcessorDep = null;

        @objid ("88e2548e-2ab5-44eb-b882-493a2aba1ee8")
        private static SmDependency ParametersDep = null;

        @objid ("f38ed145-e032-464f-b96a-4ffdaedeff5e")
        private static SmDependency MatrixDep = null;

        @objid ("e8cde589-2b05-431a-89d8-2a3e2eb5de4f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MatrixValueDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f5db9fb8-b9bc-4ee6-93b9-de0d474c167d")
        public static SmDependency ProcessorDep() {
            if (ProcessorDep == null) {
            	ProcessorDep = classof().getDependencyDef("Processor");
            }
            return ProcessorDep;
        }

        @objid ("f34ea548-797a-4ff1-8b13-1fb12792b17f")
        public static SmDependency ParametersDep() {
            if (ParametersDep == null) {
            	ParametersDep = classof().getDependencyDef("Parameters");
            }
            return ParametersDep;
        }

        @objid ("ebe6e43c-323a-48f2-a826-6370f8b9a412")
        public static SmDependency MatrixDep() {
            if (MatrixDep == null) {
            	MatrixDep = classof().getDependencyDef("Matrix");
            }
            return MatrixDep;
        }

        @objid ("4867da5a-8065-427a-8d4a-0f6f12f08c1e")
        public static SmDependency getMatrixDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatrixDep;
        }

        @objid ("90bbeb05-682e-46b8-ab41-ae62c86d6d5f")
        public static SmDependency getParametersDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParametersDep;
        }

        @objid ("3b22868a-4d00-44c1-b87f-81b18214a842")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("afab82ed-8bfb-4a30-a2fb-3018a52624aa")
        public static SmDependency getProcessorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessorDep;
        }

        @objid ("b7c061ff-1453-44df-ad09-48683dfdbb0a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("753bb9fc-4f7a-4046-8509-1abbea403396")
            public ISmObjectData createData() {
                return new MatrixValueDefinitionData();
            }

            @objid ("c39e89f4-8b28-41c0-ab4d-ab445a488548")
            public SmObjectImpl createImpl() {
                return new MatrixValueDefinitionImpl();
            }

        }

        @objid ("8256c3c4-63bf-473a-87b6-ac5f01cf6d1c")
        public static class ProcessorSmDependency extends SmSingleDependency {
            @objid ("a085a18d-8ed8-4432-bae9-4ce8394158e5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixValueDefinitionData) data).mProcessor;
            }

            @objid ("1969686e-024c-4516-a89a-9c7c2b288b5e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixValueDefinitionData) data).mProcessor = value;
            }

            @objid ("b325a7fc-0788-4633-b5a1-558fceaa9a8d")
            @Override
            public SmDependency getSymetric() {
                return ExternProcessorData.Metadata.OwnerValDefDep();
            }

        }

        @objid ("3b95ac5c-fc97-4565-b47c-d5d912e3d695")
        public static class ParametersSmDependency extends SmSingleDependency {
            @objid ("84406f33-5ef5-43d2-8af7-6938a232c3d0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixValueDefinitionData) data).mParameters;
            }

            @objid ("adbff74c-d71f-4f7b-90da-c6676f03a1a0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixValueDefinitionData) data).mParameters = value;
            }

            @objid ("c995de71-dadb-496d-a5e8-b4c9611d1af6")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableData.Metadata.OwnerValDefDep();
            }

        }

        @objid ("d6462794-1201-4292-90c3-9f2057f46ae8")
        public static class MatrixSmDependency extends SmSingleDependency {
            @objid ("f78da56b-a218-4d0a-8c71-a2ad2a32bc64")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixValueDefinitionData) data).mMatrix;
            }

            @objid ("0769c3ef-d628-44ae-9639-3caf39024070")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixValueDefinitionData) data).mMatrix = value;
            }

            @objid ("f91ef4e6-d8e4-489f-9972-86f2b9cdf33e")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.ValuesDefinitionDep();
            }

        }

    }

}
