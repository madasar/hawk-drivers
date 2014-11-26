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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.infrastructure.ExternProcessorData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.QueryDefinitionImpl;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
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

@objid ("8fe79750-6ab9-4493-b4ef-2e199f7d4dea")
@SmaMetaClass(mmClass=QueryDefinition.class, factory=QueryDefinitionData.Metadata.ObjectFactory.class)
public class QueryDefinitionData extends ElementData {
    @objid ("eb511cb8-915f-46a2-8881-beb6eac3e5d8")
    @SmaMetaAttribute(metaName="UsingAdditions", type=Boolean.class, smAttributeClass=Metadata.UsingAdditionsSmAttribute.class)
     Object mUsingAdditions = true;

    @objid ("952e3d4d-1461-4734-ad5e-7ce97199f45c")
    @SmaMetaAssociation(metaName="Added", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.AddedSmDependency.class, partof = true)
     List<SmObjectImpl> mAdded = null;

    @objid ("fe3b4fb6-64a0-4c29-8e22-0c54f01f3e5d")
    @SmaMetaAssociation(metaName="Processor", typeDataClass=ExternProcessorData.class, min=1, max=1, smAssociationClass=Metadata.ProcessorSmDependency.class, component = true)
     SmObjectImpl mProcessor;

    @objid ("21d74093-c98b-4566-895d-b301ad7d9c9c")
    @SmaMetaAssociation(metaName="Parameters", typeDataClass=PropertyTableData.class, min=1, max=1, smAssociationClass=Metadata.ParametersSmDependency.class, component = true)
     SmObjectImpl mParameters;

    @objid ("c7dfc5a9-5c08-47e8-80eb-c4371c7a1084")
    @SmaMetaAssociation(metaName="OwnerAsLine", typeDataClass=MatrixDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerAsLineSmDependency.class)
     SmObjectImpl mOwnerAsLine;

    @objid ("50544e34-f23d-4670-bb34-aa1797bb4ad3")
    @SmaMetaAssociation(metaName="OwnerAsCol", typeDataClass=MatrixDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerAsColSmDependency.class)
     SmObjectImpl mOwnerAsCol;

    @objid ("5c18f09d-8654-45b1-b920-7d52ec9578b9")
    @SmaMetaAssociation(metaName="OwnerAsDepth", typeDataClass=MatrixDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerAsDepthSmDependency.class)
     SmObjectImpl mOwnerAsDepth;

    @objid ("9775b664-9835-4a6a-baf9-b0a62f17057e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("aa475d53-b639-4477-a156-b97734b6654b")
    public static class Metadata {
        @objid ("93f8557f-94a4-4ab7-9f59-e12ca921dcd8")
        private static SmClass smClass = null;

        @objid ("e1bb965e-34b6-422a-ab86-0e4c71c1a9f5")
        private static SmAttribute UsingAdditionsAtt = null;

        @objid ("afa62e43-42be-4f8d-b58a-a5718fe720eb")
        private static SmDependency AddedDep = null;

        @objid ("a42f98fe-1828-4aa9-b0a9-79e9549e785c")
        private static SmDependency ProcessorDep = null;

        @objid ("eb7a21e6-b0ab-48da-a908-26f3877a25cc")
        private static SmDependency ParametersDep = null;

        @objid ("7e1f0b61-3051-4626-aab7-7ab74b6892b1")
        private static SmDependency OwnerAsLineDep = null;

        @objid ("3f8ed58c-6abb-467c-8ab1-a939ef3f8f3d")
        private static SmDependency OwnerAsColDep = null;

        @objid ("44b9ac27-0853-4356-9d84-991210e10748")
        private static SmDependency OwnerAsDepthDep = null;

        @objid ("069b0389-cb89-43fb-b2e2-4cca19bcc6da")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(QueryDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e1b6a358-5eb7-49fd-8672-0cf940f9f4cb")
        public static SmAttribute UsingAdditionsAtt() {
            if (UsingAdditionsAtt == null) {
            	UsingAdditionsAtt = classof().getAttributeDef("UsingAdditions");
            }
            return UsingAdditionsAtt;
        }

        @objid ("4a8b25de-94bd-4bac-85cd-5ead3c7170ce")
        public static SmDependency AddedDep() {
            if (AddedDep == null) {
            	AddedDep = classof().getDependencyDef("Added");
            }
            return AddedDep;
        }

        @objid ("18f7f00c-a9b1-43d6-833b-bd684117b5e7")
        public static SmDependency ProcessorDep() {
            if (ProcessorDep == null) {
            	ProcessorDep = classof().getDependencyDef("Processor");
            }
            return ProcessorDep;
        }

        @objid ("de24cc37-ef59-4856-ab4f-791b428ca63c")
        public static SmDependency ParametersDep() {
            if (ParametersDep == null) {
            	ParametersDep = classof().getDependencyDef("Parameters");
            }
            return ParametersDep;
        }

        @objid ("a209d1bd-4f09-4d72-82b0-d846f3532d72")
        public static SmDependency OwnerAsLineDep() {
            if (OwnerAsLineDep == null) {
            	OwnerAsLineDep = classof().getDependencyDef("OwnerAsLine");
            }
            return OwnerAsLineDep;
        }

        @objid ("af211ede-4029-494f-b143-a71c5303c66c")
        public static SmDependency OwnerAsColDep() {
            if (OwnerAsColDep == null) {
            	OwnerAsColDep = classof().getDependencyDef("OwnerAsCol");
            }
            return OwnerAsColDep;
        }

        @objid ("0ced87ec-676f-4e39-9579-be829869762b")
        public static SmDependency OwnerAsDepthDep() {
            if (OwnerAsDepthDep == null) {
            	OwnerAsDepthDep = classof().getDependencyDef("OwnerAsDepth");
            }
            return OwnerAsDepthDep;
        }

        @objid ("dcf83d31-f957-46b0-8f57-1d7acab43fee")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("cd4e4a80-7122-4135-bb1c-92edbb41c6c9")
        public static SmDependency getOwnerAsColDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerAsColDep;
        }

        @objid ("24cbec7c-1b49-42b3-a8f1-129fe83a65e1")
        public static SmDependency getProcessorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessorDep;
        }

        @objid ("aa2319fb-81d2-4e9c-99c4-0413573b379d")
        public static SmAttribute getUsingAdditionsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsingAdditionsAtt;
        }

        @objid ("59f61098-58ac-4760-8be0-2619a6902a57")
        public static SmDependency getOwnerAsDepthDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerAsDepthDep;
        }

        @objid ("d123a148-63d6-475f-8aed-ca63536a6c79")
        public static SmDependency getParametersDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParametersDep;
        }

        @objid ("bb26d0a8-5a62-465b-867f-8a472cd30f88")
        public static SmDependency getAddedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AddedDep;
        }

        @objid ("a8e9b034-b00f-42b5-bb39-57b00b696a9f")
        public static SmDependency getOwnerAsLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerAsLineDep;
        }

        @objid ("1a1d705f-9fbf-40ed-ac01-67e8a1917fbe")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5abf43b4-adff-4c33-bd91-b33edf0262f6")
            public ISmObjectData createData() {
                return new QueryDefinitionData();
            }

            @objid ("d120bd1e-75cc-4008-b14b-89648e9a2bf0")
            public SmObjectImpl createImpl() {
                return new QueryDefinitionImpl();
            }

        }

        @objid ("c8767896-f9f7-44cb-8ce7-89da9b8856ec")
        public static class AddedSmDependency extends SmMultipleDependency {
            @objid ("c372a828-07aa-4269-9479-98835092e0ee")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((QueryDefinitionData)data).mAdded != null)? ((QueryDefinitionData)data).mAdded:SmMultipleDependency.EMPTY;
            }

            @objid ("f59771c8-b678-4221-aa40-bcf937c1aefe")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((QueryDefinitionData) data).mAdded = new ArrayList<>(initialCapacity);
                return ((QueryDefinitionData) data).mAdded;
            }

            @objid ("1d91e819-1c60-404f-a855-83f8a01317b9")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.AddedToQueryDep();
            }

        }

        @objid ("5147b9ae-0d6d-4326-828c-6879c8eea331")
        public static class ProcessorSmDependency extends SmSingleDependency {
            @objid ("4aa70c4b-fc3c-49da-aabc-d211d99f7bec")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mProcessor;
            }

            @objid ("b0bc101e-617f-4396-a816-ffc6d4081918")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mProcessor = value;
            }

            @objid ("aa839d53-4ec8-4230-b3f6-793daa998434")
            @Override
            public SmDependency getSymetric() {
                return ExternProcessorData.Metadata.OwnerQueryDep();
            }

        }

        @objid ("45d924c9-eb1c-40f0-9383-4db844a25a3b")
        public static class ParametersSmDependency extends SmSingleDependency {
            @objid ("9a426cdf-c55b-44f3-901c-c979199bd27f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mParameters;
            }

            @objid ("d3d91bf6-b529-40ca-b810-479cd54808c9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mParameters = value;
            }

            @objid ("372a6b48-225f-41ba-b429-b5ded4ea67f0")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableData.Metadata.OwnerQueryDep();
            }

        }

        @objid ("f7a493f1-3d47-46c6-b183-9150bfac354c")
        public static class OwnerAsLineSmDependency extends SmSingleDependency {
            @objid ("e02365f8-5504-4528-b19a-a9e81d1fc8ba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mOwnerAsLine;
            }

            @objid ("96996100-029d-41ef-ada6-52166fd5718e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mOwnerAsLine = value;
            }

            @objid ("e1619c7e-45cc-4530-a556-7e773e9fd402")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.LinesDefinitionDep();
            }

        }

        @objid ("13d860d6-f226-4d6b-ae74-e4d241b245d5")
        public static class OwnerAsColSmDependency extends SmSingleDependency {
            @objid ("4547987c-bba9-4039-b904-fd2639f73b2e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mOwnerAsCol;
            }

            @objid ("12a18411-6037-4d09-91d7-252b64a94f3b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mOwnerAsCol = value;
            }

            @objid ("624daf7f-02ef-4a6f-99f4-1f60dcb15692")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.ColumnsDefinitionDep();
            }

        }

        @objid ("9e961b61-f020-49c7-8a82-b690787bb142")
        public static class OwnerAsDepthSmDependency extends SmSingleDependency {
            @objid ("9598bfcc-3a45-41fb-b38e-70793e7a848c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mOwnerAsDepth;
            }

            @objid ("5fdc0adf-c161-42fe-a4ba-509a81a9581f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mOwnerAsDepth = value;
            }

            @objid ("f381fa2f-5ce0-4b03-9122-fed4a3cea3e0")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.DepthDefinitionDep();
            }

        }

        @objid ("77ab59ce-66fe-4adb-a6ed-e5749003f0bd")
        public static class UsingAdditionsSmAttribute extends SmAttribute {
            @objid ("789aa1d9-ae1a-4b06-8817-fbbd7ffc9eae")
            public Object getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mUsingAdditions;
            }

            @objid ("f230a5e1-2c97-4117-8f53-1bbb40bee454")
            public void setValue(ISmObjectData data, Object value) {
                ((QueryDefinitionData) data).mUsingAdditions = value;
            }

        }

    }

}
