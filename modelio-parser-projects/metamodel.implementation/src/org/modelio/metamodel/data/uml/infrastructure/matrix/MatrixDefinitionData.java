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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixValueDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixDefinitionImpl;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
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

@objid ("efa02e20-bfde-4080-8f8e-4890ce002c4f")
@SmaMetaClass(mmClass=MatrixDefinition.class, factory=MatrixDefinitionData.Metadata.ObjectFactory.class)
public class MatrixDefinitionData extends ModelElementData {
    @objid ("61967e2e-e62d-4e5d-9d23-f76954fed7bc")
    @SmaMetaAssociation(metaName="LinesDefinition", typeDataClass=QueryDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.LinesDefinitionSmDependency.class, component = true)
     SmObjectImpl mLinesDefinition;

    @objid ("7c018e07-c890-46f6-94d9-06e7c8bf5218")
    @SmaMetaAssociation(metaName="ColumnsDefinition", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ColumnsDefinitionSmDependency.class, component = true)
     SmObjectImpl mColumnsDefinition;

    @objid ("8804341e-7347-46da-859c-2fdb5539d087")
    @SmaMetaAssociation(metaName="ValuesDefinition", typeDataClass=MatrixValueDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.ValuesDefinitionSmDependency.class, component = true)
     SmObjectImpl mValuesDefinition;

    @objid ("043b5380-9be1-44d7-b635-41c751eea553")
    @SmaMetaAssociation(metaName="DepthDefinition", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.DepthDefinitionSmDependency.class, component = true)
     SmObjectImpl mDepthDefinition;

    @objid ("70d70cf4-905c-4f94-bf24-4cb3b7553ea8")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("2c1a6ce4-603b-459d-b21e-b842eef2c3f9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("4b1b51aa-c196-45b4-a123-80cf044667a3")
    public static class Metadata {
        @objid ("b4dc7fa9-b5ef-4a7a-b00b-56c2bd8f8571")
        private static SmClass smClass = null;

        @objid ("87b1c0b1-8fb6-4943-94b6-3b9f707e288e")
        private static SmDependency LinesDefinitionDep = null;

        @objid ("18570b1e-6827-42d3-a2c7-22c30cd4bbae")
        private static SmDependency ColumnsDefinitionDep = null;

        @objid ("8c729c98-ff94-4c85-b1e0-2cfab6f36f04")
        private static SmDependency ValuesDefinitionDep = null;

        @objid ("67cea1db-83fe-4961-ab2e-e1331fa9aff5")
        private static SmDependency DepthDefinitionDep = null;

        @objid ("fc8912d7-df53-4be7-9f52-0fbb0682da31")
        private static SmDependency OwnerDep = null;

        @objid ("478c2ae3-c63c-487c-9599-421a12f7590f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MatrixDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1619bb06-2694-4178-854e-609b395c1c9a")
        public static SmDependency LinesDefinitionDep() {
            if (LinesDefinitionDep == null) {
            	LinesDefinitionDep = classof().getDependencyDef("LinesDefinition");
            }
            return LinesDefinitionDep;
        }

        @objid ("19e9c1e6-8813-46dc-9dd5-358496ce23ba")
        public static SmDependency ColumnsDefinitionDep() {
            if (ColumnsDefinitionDep == null) {
            	ColumnsDefinitionDep = classof().getDependencyDef("ColumnsDefinition");
            }
            return ColumnsDefinitionDep;
        }

        @objid ("83cc3ad1-81df-4c39-8d7d-dea2b7d7da0f")
        public static SmDependency ValuesDefinitionDep() {
            if (ValuesDefinitionDep == null) {
            	ValuesDefinitionDep = classof().getDependencyDef("ValuesDefinition");
            }
            return ValuesDefinitionDep;
        }

        @objid ("666d25fc-2e76-47e1-8983-ab173fab95b2")
        public static SmDependency DepthDefinitionDep() {
            if (DepthDefinitionDep == null) {
            	DepthDefinitionDep = classof().getDependencyDef("DepthDefinition");
            }
            return DepthDefinitionDep;
        }

        @objid ("297ce178-dc6c-489d-8ebe-835c6e5ac5c2")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("4b72c0cf-5a39-486e-a0ef-55f761792b9a")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("c2564f56-3d87-49c8-9294-a0b3b0283aae")
        public static SmDependency getValuesDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValuesDefinitionDep;
        }

        @objid ("9196f2bb-842b-43ec-8c66-f9211bb3cac7")
        public static SmDependency getLinesDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinesDefinitionDep;
        }

        @objid ("2fdcc4d4-397b-4525-8a7f-a72383598e5d")
        public static SmDependency getColumnsDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ColumnsDefinitionDep;
        }

        @objid ("0d3e2a1b-2005-4bf9-aa26-b59eb1d51519")
        public static SmDependency getDepthDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DepthDefinitionDep;
        }

        @objid ("6b2fd7cb-0bd1-4523-ab6c-e342e5257a7a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("353e49f4-e6ba-442b-b348-551f0f3991ee")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4c0b2937-3620-4b4f-9a39-5a8128a5c218")
            public ISmObjectData createData() {
                return new MatrixDefinitionData();
            }

            @objid ("87ed67af-612b-4e12-b8d3-eb903ba08209")
            public SmObjectImpl createImpl() {
                return new MatrixDefinitionImpl();
            }

        }

        @objid ("312268ab-8ce0-4d47-90d0-a97cbca8adca")
        public static class LinesDefinitionSmDependency extends SmSingleDependency {
            @objid ("eb1b27e1-3486-4ddb-81e1-282515caf970")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mLinesDefinition;
            }

            @objid ("3dda228b-12b2-4bf4-b7b9-7f2309fb0360")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mLinesDefinition = value;
            }

            @objid ("654e790c-b79c-4d52-9478-3fb577554084")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.OwnerAsLineDep();
            }

        }

        @objid ("c3a35f5a-6379-417c-af79-50498ad3df45")
        public static class ColumnsDefinitionSmDependency extends SmSingleDependency {
            @objid ("45698e4e-c38e-4852-81d8-649b299e54a6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mColumnsDefinition;
            }

            @objid ("5ed53bda-855b-4963-a75d-451178c464ee")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mColumnsDefinition = value;
            }

            @objid ("fea10925-691c-49ac-beda-978562c42588")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.OwnerAsColDep();
            }

        }

        @objid ("06bf0d03-447d-4f15-8333-edc44face5af")
        public static class ValuesDefinitionSmDependency extends SmSingleDependency {
            @objid ("47e5173c-0dd0-483a-ac03-9200ba5efe60")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mValuesDefinition;
            }

            @objid ("4b9cb286-c0cf-471e-83fb-2c7b5d9894ae")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mValuesDefinition = value;
            }

            @objid ("21cfee54-1c83-417c-a2c2-d249bdcc7933")
            @Override
            public SmDependency getSymetric() {
                return MatrixValueDefinitionData.Metadata.MatrixDep();
            }

        }

        @objid ("f06d0a77-a0ef-46ad-ae4a-f028f49d5f9e")
        public static class DepthDefinitionSmDependency extends SmSingleDependency {
            @objid ("d0a8d60e-f095-4982-85b9-af8fcdacb92f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mDepthDefinition;
            }

            @objid ("c0827580-9842-43ab-aaf0-2f1611598eaa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mDepthDefinition = value;
            }

            @objid ("ac2aaa56-ab3d-4c03-bfae-464d74e6dd95")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.OwnerAsDepthDep();
            }

        }

        @objid ("7b02d436-855a-4d70-8808-3284764c5f6d")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("2f59a9b9-abba-4dba-b0fa-b3a7fa2bc8bb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mOwner;
            }

            @objid ("ebdb886b-669a-451a-ba65-4fb05a3cff66")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mOwner = value;
            }

            @objid ("ca99e9f8-e2eb-4e11-8a0f-3fc7a2b3a83a")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.MatrixDep();
            }

        }

    }

}
