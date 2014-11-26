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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneData;
import org.modelio.metamodel.data.diagrams.AbstractDiagramData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityPartitionData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ConstraintData;
import org.modelio.metamodel.data.uml.infrastructure.DependencyData;
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentData;
import org.modelio.metamodel.data.uml.infrastructure.NoteData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.data.uml.infrastructure.TaggedValueData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.LocalPropertyTableData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableData;
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
import org.modelio.metamodel.data.uml.statik.BindingData;
import org.modelio.metamodel.data.uml.statik.ConnectorEndData;
import org.modelio.metamodel.data.uml.statik.ManifestationData;
import org.modelio.metamodel.data.uml.statik.NaryConnectorData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterSubstitutionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
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

@objid ("0088dbfa-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ModelElement.class, factory=ModelElementData.Metadata.ObjectFactory.class)
public abstract class ModelElementData extends ElementData {
    @objid ("4232ea72-ea06-455f-bfe7-641d35158871")
    @SmaMetaAttribute(metaName="Name", type=String.class, smAttributeClass=Metadata.NameSmAttribute.class)
     Object mName = "";

    @objid ("f360ee5f-e24f-4aea-9371-c3075320f8d7")
    @SmaMetaAssociation(metaName="LocalProperties", typeDataClass=LocalPropertyTableData.class, min=0, max=1, smAssociationClass=Metadata.LocalPropertiesSmDependency.class, istodelete = true)
     SmObjectImpl mLocalProperties;

    @objid ("665ec5b4-a9bd-4a87-8edb-02933d60c887")
    @SmaMetaAssociation(metaName="TemplateSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSubstitutionSmDependency.class)
     List<SmObjectImpl> mTemplateSubstitution = null;

    @objid ("ddce188e-45bd-4678-8396-15ee7f3fa107")
    @SmaMetaAssociation(metaName="BpmnLaneRefs", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnLaneRefsSmDependency.class)
     List<SmObjectImpl> mBpmnLaneRefs = null;

    @objid ("8ee1b24e-a7d3-4888-b3ab-206b8e236108")
    @SmaMetaAssociation(metaName="Extension", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.ExtensionSmDependency.class, partof = true)
     List<SmObjectImpl> mExtension = null;

    @objid ("6f0dad28-6b3b-4fef-9026-e086bb2b42a1")
    @SmaMetaAssociation(metaName="DependsOnDependency", typeDataClass=DependencyData.class, min=0, max=-1, smAssociationClass=Metadata.DependsOnDependencySmDependency.class, component = true)
     List<SmObjectImpl> mDependsOnDependency = null;

    @objid ("24f2fa92-3feb-4687-82f6-303687dbd741")
    @SmaMetaAssociation(metaName="DefaultParametering", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.DefaultParameteringSmDependency.class)
     List<SmObjectImpl> mDefaultParametering = null;

    @objid ("d5e6b6b3-bc95-4419-943b-06a241dca69a")
    @SmaMetaAssociation(metaName="Represents", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentsSmDependency.class)
     List<SmObjectImpl> mRepresents = null;

    @objid ("1317ca1c-4b35-40f8-82e9-430c5efbb77a")
    @SmaMetaAssociation(metaName="Document", typeDataClass=ExternDocumentData.class, min=0, max=-1, smAssociationClass=Metadata.DocumentSmDependency.class, component = true)
     List<SmObjectImpl> mDocument = null;

    @objid ("84597e73-0a2e-44e2-aa33-6f287f20aa01")
    @SmaMetaAssociation(metaName="Tag", typeDataClass=TaggedValueData.class, min=0, max=-1, smAssociationClass=Metadata.TagSmDependency.class, component = true)
     List<SmObjectImpl> mTag = null;

    @objid ("df8aaaa6-87e4-4332-bd3f-e5a2384daf93")
    @SmaMetaAssociation(metaName="OwnerTemplateParameter", typeDataClass=TemplateParameterData.class, min=0, max=1, smAssociationClass=Metadata.OwnerTemplateParameterSmDependency.class)
     SmObjectImpl mOwnerTemplateParameter;

    @objid ("ce66590f-0de4-461e-a67f-fb5e3ec23b48")
    @SmaMetaAssociation(metaName="ImpactedDependency", typeDataClass=DependencyData.class, min=0, max=-1, smAssociationClass=Metadata.ImpactedDependencySmDependency.class, istodelete = true)
     List<SmObjectImpl> mImpactedDependency = null;

    @objid ("cd6c1c36-0e7a-459a-a1ec-66089bedeeae")
    @SmaMetaAssociation(metaName="RepresentingEnd", typeDataClass=ConnectorEndData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingEndSmDependency.class)
     List<SmObjectImpl> mRepresentingEnd = null;

    @objid ("97d2c58a-2af0-424e-b86b-5d7c61b66896")
    @SmaMetaAssociation(metaName="RepresentingPartition", typeDataClass=ActivityPartitionData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingPartitionSmDependency.class)
     List<SmObjectImpl> mRepresentingPartition = null;

    @objid ("1c2154c4-5d9e-40fe-843f-dbe020a3afa7")
    @SmaMetaAssociation(metaName="ConstraintDefinition", typeDataClass=ConstraintData.class, min=0, max=-1, smAssociationClass=Metadata.ConstraintDefinitionSmDependency.class, sharedComponent = true, istodelete = true)
     List<SmObjectImpl> mConstraintDefinition = null;

    @objid ("f7d7fd52-05a0-4ac3-bcc8-22bc6a538d17")
    @SmaMetaAssociation(metaName="TypingParameter", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TypingParameterSmDependency.class)
     List<SmObjectImpl> mTypingParameter = null;

    @objid ("6201dc52-40eb-4a70-ba2f-405a903a6a1d")
    @SmaMetaAssociation(metaName="Manifesting", typeDataClass=ManifestationData.class, min=0, max=-1, smAssociationClass=Metadata.ManifestingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mManifesting = null;

    @objid ("9c13c67f-3d36-4f49-8838-2e840cc76eab")
    @SmaMetaAssociation(metaName="Properties", typeDataClass=PropertyTableData.class, min=0, max=-1, smAssociationClass=Metadata.PropertiesSmDependency.class, component = true)
     List<SmObjectImpl> mProperties = null;

    @objid ("7f2c1634-dae6-4633-9360-0d471a48b92a")
    @SmaMetaAssociation(metaName="Product", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.ProductSmDependency.class, component = true)
     List<SmObjectImpl> mProduct = null;

    @objid ("0b41e690-0892-4c16-9289-37c67f21a6e5")
    @SmaMetaAssociation(metaName="RepresentingInstance", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingInstanceSmDependency.class)
     List<SmObjectImpl> mRepresentingInstance = null;

    @objid ("34cb50a5-281e-475e-b0c2-e1fa03c42926")
    @SmaMetaAssociation(metaName="ReceivedInfo", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivedInfoSmDependency.class)
     List<SmObjectImpl> mReceivedInfo = null;

    @objid ("5401c796-3a0a-4897-bebd-b66378b6edc3")
    @SmaMetaAssociation(metaName="SentInfo", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentInfoSmDependency.class)
     List<SmObjectImpl> mSentInfo = null;

    @objid ("7ab6a258-4af9-466e-8bb3-3007a3cf7c14")
    @SmaMetaAssociation(metaName="Descriptor", typeDataClass=NoteData.class, min=0, max=-1, smAssociationClass=Metadata.DescriptorSmDependency.class, component = true)
     List<SmObjectImpl> mDescriptor = null;

    @objid ("531b13c0-b30d-4ab6-8b45-8f1a60f27899")
    @SmaMetaAssociation(metaName="RepresentingConnector", typeDataClass=NaryConnectorData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingConnectorSmDependency.class)
     List<SmObjectImpl> mRepresentingConnector = null;

    @objid ("4970d409-a465-4385-a85f-2aed4ea2451c")
    @SmaMetaAssociation(metaName="Matrix", typeDataClass=MatrixDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.MatrixSmDependency.class, component = true)
     List<SmObjectImpl> mMatrix = null;

    @objid ("eeefe881-b07a-4011-9365-397e20bead1d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0027fe8e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8ef3448b-3cf9-4393-91a7-42471b7bb038")
        private static SmClass smClass = null;

        @objid ("e9a2af6b-d8e7-43f3-bad7-a6f93e065910")
        private static SmAttribute NameAtt = null;

        @objid ("39f2f790-810b-434e-b212-15861475e8d7")
        private static SmDependency LocalPropertiesDep = null;

        @objid ("250e10a3-8dd5-4ab5-8b2b-f81f90f10771")
        private static SmDependency TemplateSubstitutionDep = null;

        @objid ("a45be334-095c-47e2-be02-d2fab6771b29")
        private static SmDependency BpmnLaneRefsDep = null;

        @objid ("d0d0749b-e258-4cad-9f73-0e49ba6e59ad")
        private static SmDependency ExtensionDep = null;

        @objid ("41f5ff16-f517-4cce-8730-df5bd0c7649a")
        private static SmDependency DependsOnDependencyDep = null;

        @objid ("7f05e65c-1360-4277-a7fa-d970f6d5c9ba")
        private static SmDependency DefaultParameteringDep = null;

        @objid ("74334859-48f5-4af0-8f88-8f76e4b6c135")
        private static SmDependency RepresentsDep = null;

        @objid ("ad61204b-385c-4c66-8972-326e21bb74a5")
        private static SmDependency DocumentDep = null;

        @objid ("09144148-83aa-429a-b9c2-bd954c85defe")
        private static SmDependency TagDep = null;

        @objid ("7ffc17c7-3d94-4a09-bf76-4d81548996ad")
        private static SmDependency OwnerTemplateParameterDep = null;

        @objid ("739d95f1-9c27-47ac-a374-02f24511afef")
        private static SmDependency ImpactedDependencyDep = null;

        @objid ("f99ec734-918c-4e23-a8a1-4f97fddd00bc")
        private static SmDependency RepresentingEndDep = null;

        @objid ("ca203ac9-54c2-4267-a425-91afb6c0d95f")
        private static SmDependency RepresentingPartitionDep = null;

        @objid ("844000cd-4387-43dd-9dd3-8c8830dcfaf1")
        private static SmDependency ConstraintDefinitionDep = null;

        @objid ("d1c503b2-0998-4289-b0bb-e47304ad5a31")
        private static SmDependency TypingParameterDep = null;

        @objid ("8b8d4774-36b6-4907-a544-8feb1a76849e")
        private static SmDependency ManifestingDep = null;

        @objid ("4dea9d54-a1df-49ee-9ad7-11edae5827f1")
        private static SmDependency PropertiesDep = null;

        @objid ("e55fe11c-f9ed-4216-9df3-0402fc420668")
        private static SmDependency ProductDep = null;

        @objid ("5b4f212a-9d06-4b57-af00-b597628c1f9b")
        private static SmDependency RepresentingInstanceDep = null;

        @objid ("2db90997-aaa4-4995-9ac9-3222009d68d7")
        private static SmDependency ReceivedInfoDep = null;

        @objid ("37a83e2d-5198-405b-a431-b9cb7d80d2c6")
        private static SmDependency SentInfoDep = null;

        @objid ("85888c18-93b4-4caa-993a-3b58f15c270d")
        private static SmDependency DescriptorDep = null;

        @objid ("0afe74d7-d37a-470c-8843-0f5319933bc4")
        private static SmDependency RepresentingConnectorDep = null;

        @objid ("4e6eca4a-d7d1-4d02-abff-a720be423c1b")
        private static SmDependency MatrixDep = null;

        @objid ("6bb421f8-7ce8-4b0c-8d0c-8512732ec492")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModelElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d9d730ff-ce3e-454f-8a95-9d73dea88cd2")
        public static SmAttribute NameAtt() {
            if (NameAtt == null) {
            	NameAtt = classof().getAttributeDef("Name");
            }
            return NameAtt;
        }

        @objid ("341b425c-ede1-46d9-938d-f7b6356532e2")
        public static SmDependency LocalPropertiesDep() {
            if (LocalPropertiesDep == null) {
            	LocalPropertiesDep = classof().getDependencyDef("LocalProperties");
            }
            return LocalPropertiesDep;
        }

        @objid ("36e6b753-5051-49a2-90f2-917304ea611d")
        public static SmDependency TemplateSubstitutionDep() {
            if (TemplateSubstitutionDep == null) {
            	TemplateSubstitutionDep = classof().getDependencyDef("TemplateSubstitution");
            }
            return TemplateSubstitutionDep;
        }

        @objid ("a3295c31-e77f-41bd-8780-dd7acd368a8d")
        public static SmDependency BpmnLaneRefsDep() {
            if (BpmnLaneRefsDep == null) {
            	BpmnLaneRefsDep = classof().getDependencyDef("BpmnLaneRefs");
            }
            return BpmnLaneRefsDep;
        }

        @objid ("96dddf11-6c6b-40a9-98c9-41b1afd75b3a")
        public static SmDependency ExtensionDep() {
            if (ExtensionDep == null) {
            	ExtensionDep = classof().getDependencyDef("Extension");
            }
            return ExtensionDep;
        }

        @objid ("f2a6daab-8df8-46c2-b395-402c1d3f96ad")
        public static SmDependency DependsOnDependencyDep() {
            if (DependsOnDependencyDep == null) {
            	DependsOnDependencyDep = classof().getDependencyDef("DependsOnDependency");
            }
            return DependsOnDependencyDep;
        }

        @objid ("cef0b852-2008-4c0e-82a4-959d77a9d14e")
        public static SmDependency DefaultParameteringDep() {
            if (DefaultParameteringDep == null) {
            	DefaultParameteringDep = classof().getDependencyDef("DefaultParametering");
            }
            return DefaultParameteringDep;
        }

        @objid ("64da1cf8-f2e6-4d13-9dd8-a5df08af2b6a")
        public static SmDependency RepresentsDep() {
            if (RepresentsDep == null) {
            	RepresentsDep = classof().getDependencyDef("Represents");
            }
            return RepresentsDep;
        }

        @objid ("5df32a78-b0cb-4699-89f2-7a1c9edae2cb")
        public static SmDependency DocumentDep() {
            if (DocumentDep == null) {
            	DocumentDep = classof().getDependencyDef("Document");
            }
            return DocumentDep;
        }

        @objid ("786d2845-b201-4a2b-abd8-78f8543eca9b")
        public static SmDependency TagDep() {
            if (TagDep == null) {
            	TagDep = classof().getDependencyDef("Tag");
            }
            return TagDep;
        }

        @objid ("74166fbc-a2a4-49b5-a50d-7483c0b7ee65")
        public static SmDependency OwnerTemplateParameterDep() {
            if (OwnerTemplateParameterDep == null) {
            	OwnerTemplateParameterDep = classof().getDependencyDef("OwnerTemplateParameter");
            }
            return OwnerTemplateParameterDep;
        }

        @objid ("25845c40-3f15-47b3-980a-ca1d9968bc44")
        public static SmDependency ImpactedDependencyDep() {
            if (ImpactedDependencyDep == null) {
            	ImpactedDependencyDep = classof().getDependencyDef("ImpactedDependency");
            }
            return ImpactedDependencyDep;
        }

        @objid ("25687247-96e1-445b-8582-36a49466e4fc")
        public static SmDependency RepresentingEndDep() {
            if (RepresentingEndDep == null) {
            	RepresentingEndDep = classof().getDependencyDef("RepresentingEnd");
            }
            return RepresentingEndDep;
        }

        @objid ("903ea671-39c2-4fd2-a87b-dc934470258e")
        public static SmDependency RepresentingPartitionDep() {
            if (RepresentingPartitionDep == null) {
            	RepresentingPartitionDep = classof().getDependencyDef("RepresentingPartition");
            }
            return RepresentingPartitionDep;
        }

        @objid ("f7c59a36-e918-410a-aead-57476a01dccc")
        public static SmDependency ConstraintDefinitionDep() {
            if (ConstraintDefinitionDep == null) {
            	ConstraintDefinitionDep = classof().getDependencyDef("ConstraintDefinition");
            }
            return ConstraintDefinitionDep;
        }

        @objid ("7cc702a9-9186-40d8-b54f-e5b2e8c55635")
        public static SmDependency TypingParameterDep() {
            if (TypingParameterDep == null) {
            	TypingParameterDep = classof().getDependencyDef("TypingParameter");
            }
            return TypingParameterDep;
        }

        @objid ("b4750222-3623-4a4c-8345-a4b56ce8cc7b")
        public static SmDependency ManifestingDep() {
            if (ManifestingDep == null) {
            	ManifestingDep = classof().getDependencyDef("Manifesting");
            }
            return ManifestingDep;
        }

        @objid ("a10414e5-df5b-45df-8f86-85a9a16fdad7")
        public static SmDependency PropertiesDep() {
            if (PropertiesDep == null) {
            	PropertiesDep = classof().getDependencyDef("Properties");
            }
            return PropertiesDep;
        }

        @objid ("0781bad9-6e4c-42f4-b5bc-8dbfa5824cdb")
        public static SmDependency ProductDep() {
            if (ProductDep == null) {
            	ProductDep = classof().getDependencyDef("Product");
            }
            return ProductDep;
        }

        @objid ("1ee5dc42-fb82-4231-a94e-e3ad871ee05d")
        public static SmDependency RepresentingInstanceDep() {
            if (RepresentingInstanceDep == null) {
            	RepresentingInstanceDep = classof().getDependencyDef("RepresentingInstance");
            }
            return RepresentingInstanceDep;
        }

        @objid ("4875459c-98fa-4673-9aed-09e85c1fc69c")
        public static SmDependency ReceivedInfoDep() {
            if (ReceivedInfoDep == null) {
            	ReceivedInfoDep = classof().getDependencyDef("ReceivedInfo");
            }
            return ReceivedInfoDep;
        }

        @objid ("a9299509-d846-4101-80d3-29390ff72f2d")
        public static SmDependency SentInfoDep() {
            if (SentInfoDep == null) {
            	SentInfoDep = classof().getDependencyDef("SentInfo");
            }
            return SentInfoDep;
        }

        @objid ("5c7f0e8e-809d-4b95-8cc3-826575ed7e8f")
        public static SmDependency DescriptorDep() {
            if (DescriptorDep == null) {
            	DescriptorDep = classof().getDependencyDef("Descriptor");
            }
            return DescriptorDep;
        }

        @objid ("65dff448-c9e2-4d1a-b68e-7c09bf74f8c9")
        public static SmDependency RepresentingConnectorDep() {
            if (RepresentingConnectorDep == null) {
            	RepresentingConnectorDep = classof().getDependencyDef("RepresentingConnector");
            }
            return RepresentingConnectorDep;
        }

        @objid ("044b2f22-b266-4781-8afb-205a79c4c1ec")
        public static SmDependency MatrixDep() {
            if (MatrixDep == null) {
            	MatrixDep = classof().getDependencyDef("Matrix");
            }
            return MatrixDep;
        }

        @objid ("ab7fb8eb-5046-43c6-a6c1-7e93410b69c0")
        public static SmDependency getDefaultParameteringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultParameteringDep;
        }

        @objid ("074049b6-553b-44db-80f6-e8171d523bd0")
        public static SmDependency getTemplateSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateSubstitutionDep;
        }

        @objid ("aa0ff8eb-46b0-40d6-a2d0-43c4b6f53e96")
        public static SmDependency getRepresentingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingEndDep;
        }

        @objid ("49a3929a-7573-4c47-b42b-b9a78a3e3928")
        public static SmDependency getRepresentingConnectorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingConnectorDep;
        }

        @objid ("de22b001-804b-495f-949c-49699bf9d308")
        public static SmDependency getDocumentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DocumentDep;
        }

        @objid ("07c1002a-dccd-40a9-aecb-4b7eb99538f0")
        public static SmDependency getRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentsDep;
        }

        @objid ("4d05b65d-4232-492a-8198-459f97ea4e19")
        public static SmDependency getOwnerTemplateParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerTemplateParameterDep;
        }

        @objid ("b14ac6cd-3077-4a99-baf6-d0ea84fb673a")
        public static SmDependency getSentInfoDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentInfoDep;
        }

        @objid ("0041db0c-af64-4e78-9889-72656ea9ca04")
        public static SmDependency getMatrixDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatrixDep;
        }

        @objid ("15fcb6df-8dcd-4f7c-ab59-406188e43a6d")
        public static SmDependency getProductDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProductDep;
        }

        @objid ("55f62165-0585-4696-a6c5-9d375868e6d9")
        public static SmDependency getLocalPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalPropertiesDep;
        }

        @objid ("319eec96-3ddb-4323-9c71-47e03f924a26")
        public static SmDependency getDescriptorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DescriptorDep;
        }

        @objid ("6bf2eda7-acce-4da1-a7b6-b32a887fd205")
        public static SmDependency getPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PropertiesDep;
        }

        @objid ("1666350b-b8ea-4164-b5a2-10fa65729c6e")
        public static SmDependency getConstraintDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConstraintDefinitionDep;
        }

        @objid ("de921e53-13e1-4c2c-ac00-e05470d27da6")
        public static SmDependency getRepresentingPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingPartitionDep;
        }

        @objid ("e911fd92-7dce-4a12-bcf1-9f08f87b29cb")
        public static SmDependency getManifestingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ManifestingDep;
        }

        @objid ("c4a20357-8e6d-4b83-b86e-81b2f465ddb4")
        public static SmDependency getRepresentingInstanceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingInstanceDep;
        }

        @objid ("3d50f972-96ce-4679-9064-455f188141bb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c2f6fbdf-8907-4aa6-a324-27b472e65bb5")
        public static SmDependency getTagDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TagDep;
        }

        @objid ("2200b0d5-22f8-49c8-aef5-eafe7748bf27")
        public static SmDependency getExtensionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtensionDep;
        }

        @objid ("a4bdf24d-99b7-42b9-ae8e-8e74f865ecc6")
        public static SmAttribute getNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NameAtt;
        }

        @objid ("7871bf35-629f-4a59-a99e-ed0ec82eb936")
        public static SmDependency getDependsOnDependencyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDependencyDep;
        }

        @objid ("29e4837d-2df4-43d9-8424-af6da186bc44")
        public static SmDependency getBpmnLaneRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnLaneRefsDep;
        }

        @objid ("8e61d958-182b-4984-832b-fd4126dccf0f")
        public static SmDependency getImpactedDependencyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDependencyDep;
        }

        @objid ("fccebd8c-9145-4a65-a772-7e186d67e1cf")
        public static SmDependency getReceivedInfoDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedInfoDep;
        }

        @objid ("06e816e8-5e2d-48fa-84c6-ad98469d226d")
        public static SmDependency getTypingParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypingParameterDep;
        }

        @objid ("00284a10-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a8a1b151-3924-4162-b233-c4f95174d3d8")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("46c51c32-2483-4cd0-a1ef-3c080d36e65c")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0028abf4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class NameSmAttribute extends SmAttribute {
            @objid ("8588718d-4a6c-4bbe-9dc8-7c015fb74c91")
            public Object getValue(ISmObjectData data) {
                return ((ModelElementData) data).mName;
            }

            @objid ("a6c067ad-5d6e-44be-809a-4bbe2f3e1e0b")
            public void setValue(ISmObjectData data, Object value) {
                ((ModelElementData) data).mName = value;
            }

        }

        @objid ("00291256-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentsSmDependency extends SmMultipleDependency {
            @objid ("e29e6f6c-5674-4868-85bb-eb55ccb22f22")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresents != null)? ((ModelElementData)data).mRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("57b83c35-aad7-45f2-92d4-2c23e4036b60")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresents = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresents;
            }

            @objid ("8f7ab9d4-b469-42fc-8b8b-5f81940eefdc")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("00297476-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConstraintDefinitionSmDependency extends SmMultipleDependency {
            @objid ("9cd732b0-6136-4d14-9bb2-e32128a70a2f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mConstraintDefinition != null)? ((ModelElementData)data).mConstraintDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("a18b041c-431c-48ad-aaee-493ff225d3a1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mConstraintDefinition = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mConstraintDefinition;
            }

            @objid ("b247b704-35a8-4e7a-96c0-46b73113dc41")
            @Override
            public SmDependency getSymetric() {
                return ConstraintData.Metadata.ConstrainedElementDep();
            }

        }

        @objid ("0029d98e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DependsOnDependencySmDependency extends SmMultipleDependency {
            @objid ("bfcb09fd-164a-4de4-a63f-6cd679ef46fb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDependsOnDependency != null)? ((ModelElementData)data).mDependsOnDependency:SmMultipleDependency.EMPTY;
            }

            @objid ("18cf7395-bd55-4444-9143-162a60c60020")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDependsOnDependency = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDependsOnDependency;
            }

            @objid ("f136e5bc-11b2-4976-acb9-e20c0f599266")
            @Override
            public SmDependency getSymetric() {
                return DependencyData.Metadata.ImpactedDep();
            }

        }

        @objid ("002a3d3e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImpactedDependencySmDependency extends SmMultipleDependency {
            @objid ("21581158-dd39-4b37-8033-ec00f8171492")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mImpactedDependency != null)? ((ModelElementData)data).mImpactedDependency:SmMultipleDependency.EMPTY;
            }

            @objid ("3dcfd65e-0372-4aeb-9090-0c45bf1c578a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mImpactedDependency = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mImpactedDependency;
            }

            @objid ("b91caf13-9acf-4f57-8989-4eab020a314d")
            @Override
            public SmDependency getSymetric() {
                return DependencyData.Metadata.DependsOnDep();
            }

        }

        @objid ("002aa0b2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProductSmDependency extends SmMultipleDependency {
            @objid ("e2a769f1-05b8-4e86-a32f-335f4267fd1a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mProduct != null)? ((ModelElementData)data).mProduct:SmMultipleDependency.EMPTY;
            }

            @objid ("71502966-a7a1-4a2e-91e2-bbdcab46c56c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mProduct = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mProduct;
            }

            @objid ("cf03f47c-e4d2-4aa2-93c0-438dbb0c1f48")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.OriginDep();
            }

        }

        @objid ("002bd220-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ManifestingSmDependency extends SmMultipleDependency {
            @objid ("14433e52-50aa-4052-8be4-ba92ba2ba64e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mManifesting != null)? ((ModelElementData)data).mManifesting:SmMultipleDependency.EMPTY;
            }

            @objid ("2eb83f50-2d74-48dc-91d9-716d9cc4e64b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mManifesting = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mManifesting;
            }

            @objid ("ee392cc1-db07-47b0-a216-57ecc6c18ec7")
            @Override
            public SmDependency getSymetric() {
                return ManifestationData.Metadata.UtilizedElementDep();
            }

        }

        @objid ("002c3986-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultParameteringSmDependency extends SmMultipleDependency {
            @objid ("fb05ff4a-3716-4aa8-ae28-d2b431dbc367")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDefaultParametering != null)? ((ModelElementData)data).mDefaultParametering:SmMultipleDependency.EMPTY;
            }

            @objid ("1126d5e9-32f7-49b5-89ea-d6520f2cd53b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDefaultParametering = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDefaultParametering;
            }

            @objid ("17f36e8f-db94-49fd-a061-ae7238f38762")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.DefaultTypeDep();
            }

        }

        @objid ("002ca196-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerTemplateParameterSmDependency extends SmSingleDependency {
            @objid ("714a518e-8cf6-489b-a708-ec5f0228e0c3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelElementData) data).mOwnerTemplateParameter;
            }

            @objid ("e2a87a31-1fe0-406f-9945-31d986f5da36")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelElementData) data).mOwnerTemplateParameter = value;
            }

            @objid ("0971b56f-3c8c-4298-bf00-f8898828415d")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.OwnedParameterElementDep();
            }

        }

        @objid ("002d1a54-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DescriptorSmDependency extends SmMultipleDependency {
            @objid ("ef8264f2-9156-4a4d-a6aa-4f26f5124afe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDescriptor != null)? ((ModelElementData)data).mDescriptor:SmMultipleDependency.EMPTY;
            }

            @objid ("59cd4a48-5f34-49b0-8b98-ec48b9ae7c28")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDescriptor = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDescriptor;
            }

            @objid ("09f79c69-38de-4767-b31b-a62bfa54ee2d")
            @Override
            public SmDependency getSymetric() {
                return NoteData.Metadata.SubjectDep();
            }

        }

        @objid ("002d88fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExtensionSmDependency extends SmMultipleDependency {
            @objid ("10d9e190-1b57-4404-b0fd-cb0a58781ef1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mExtension != null)? ((ModelElementData)data).mExtension:SmMultipleDependency.EMPTY;
            }

            @objid ("82475c1d-3323-43ff-91d1-b2d0b0f2bba3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mExtension = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mExtension;
            }

            @objid ("2e19a5d5-2c62-4280-a6f8-fdd7a845bec5")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ExtendedElementDep();
            }

        }

        @objid ("002df21c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TagSmDependency extends SmMultipleDependency {
            @objid ("56326962-7810-4a60-bce5-f30c56c28147")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTag != null)? ((ModelElementData)data).mTag:SmMultipleDependency.EMPTY;
            }

            @objid ("71d70997-3c9e-46f7-857b-73e67748fed7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTag = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTag;
            }

            @objid ("198b53a2-7d03-45d6-869e-d51b3779371d")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.AnnotedDep();
            }

        }

        @objid ("002e5acc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DocumentSmDependency extends SmMultipleDependency {
            @objid ("421f0b83-7789-43fa-b6f9-3d61be6f3164")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDocument != null)? ((ModelElementData)data).mDocument:SmMultipleDependency.EMPTY;
            }

            @objid ("2e2c77fb-465b-4a73-a671-e0645511b4e7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDocument = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDocument;
            }

            @objid ("188da9c9-4de8-4f5e-84bb-fde6f7cb94cd")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentData.Metadata.SubjectDep();
            }

        }

        @objid ("002ec6f6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TemplateSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("bcec1ba1-ec00-427e-87b0-b7568ac81087")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTemplateSubstitution != null)? ((ModelElementData)data).mTemplateSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("0f5e888c-4d0d-433d-84fa-86cb19cdc45b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTemplateSubstitution = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTemplateSubstitution;
            }

            @objid ("306c5a37-2259-47bd-932e-51b41d45683e")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.ActualDep();
            }

        }

        @objid ("002f3208-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypingParameterSmDependency extends SmMultipleDependency {
            @objid ("6f0e90ae-afaf-485a-9c52-4de3c69583ed")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTypingParameter != null)? ((ModelElementData)data).mTypingParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("fe462d41-1575-4439-9d1c-7d1eb5bdb40f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTypingParameter = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTypingParameter;
            }

            @objid ("dcf75e33-faa1-4be8-8bb0-b39cc1932f9f")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.TypeDep();
            }

        }

        @objid ("002f9d92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingInstanceSmDependency extends SmMultipleDependency {
            @objid ("971a2cee-3b84-47c7-ab61-5512c7b01a05")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingInstance != null)? ((ModelElementData)data).mRepresentingInstance:SmMultipleDependency.EMPTY;
            }

            @objid ("386e8a0c-797c-4f85-8a71-f7af204542b0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingInstance = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingInstance;
            }

            @objid ("bd6655bf-798e-4b59-ac30-3bc3a5ed031f")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("0030195c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingConnectorSmDependency extends SmMultipleDependency {
            @objid ("2d39c0cc-d064-4e33-bbbf-dd93c4019eff")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingConnector != null)? ((ModelElementData)data).mRepresentingConnector:SmMultipleDependency.EMPTY;
            }

            @objid ("43c5c931-0d46-4f80-b257-4373dc872257")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingConnector = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingConnector;
            }

            @objid ("32836df1-7e46-4cce-96be-9aeeabacd3f8")
            @Override
            public SmDependency getSymetric() {
                return NaryConnectorData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("00308ee6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingEndSmDependency extends SmMultipleDependency {
            @objid ("d87c5d43-f3a5-43df-be18-edc41b789e0a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingEnd != null)? ((ModelElementData)data).mRepresentingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("520df7b5-785e-4d44-a94f-eddcb6935251")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingEnd = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingEnd;
            }

            @objid ("dd42557b-873d-408f-903a-ae8a76cbbd95")
            @Override
            public SmDependency getSymetric() {
                return ConnectorEndData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("0030fe80-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingPartitionSmDependency extends SmMultipleDependency {
            @objid ("75f12e00-4c30-4e40-ba33-e612809750e7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingPartition != null)? ((ModelElementData)data).mRepresentingPartition:SmMultipleDependency.EMPTY;
            }

            @objid ("941939eb-87d1-42f7-b74d-28b5d8049ae0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingPartition = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingPartition;
            }

            @objid ("54887132-ac3d-48e2-b6de-ed0abca8aa31")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.RepresentedDep();
            }

        }

        @objid ("00317496-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceivedInfoSmDependency extends SmMultipleDependency {
            @objid ("7b26ee25-d4d2-4e23-8bfd-55f32b99b635")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mReceivedInfo != null)? ((ModelElementData)data).mReceivedInfo:SmMultipleDependency.EMPTY;
            }

            @objid ("ea7ce6e6-4e48-4900-9be6-7dd4cbe83f6c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mReceivedInfo = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mReceivedInfo;
            }

            @objid ("213d6429-a285-43a1-a954-b151aaa30939")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.InformationTargetDep();
            }

        }

        @objid ("0031e23c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SentInfoSmDependency extends SmMultipleDependency {
            @objid ("3d5a355b-480a-4b6a-997e-0337e4eecf96")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mSentInfo != null)? ((ModelElementData)data).mSentInfo:SmMultipleDependency.EMPTY;
            }

            @objid ("59011aec-3961-40e2-a2ff-a9db2b8db656")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mSentInfo = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mSentInfo;
            }

            @objid ("d7262332-e56d-44a9-bd9f-895e6c2995f3")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.InformationSourceDep();
            }

        }

        @objid ("0032573a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnLaneRefsSmDependency extends SmMultipleDependency {
            @objid ("dfddbefa-a935-4d63-b423-57af91ed4184")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mBpmnLaneRefs != null)? ((ModelElementData)data).mBpmnLaneRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("4122e826-609c-44ee-bd13-f1353211617a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mBpmnLaneRefs = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mBpmnLaneRefs;
            }

            @objid ("a6c4fddc-3962-4ae4-a7cc-197db5689fd3")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.PartitionElementDep();
            }

        }

        @objid ("0061ca56-ec98-1098-b22e-001ec947cd2a")
        public static class LocalPropertiesSmDependency extends SmSingleDependency {
            @objid ("5758f0b4-239d-46a2-bc78-b2127b2a4d2f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelElementData) data).mLocalProperties;
            }

            @objid ("404deaff-6c3c-44e7-98fd-4cfdffed454f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelElementData) data).mLocalProperties = value;
            }

            @objid ("1b4cc163-f628-479a-bb58-1d8267117c77")
            @Override
            public SmDependency getSymetric() {
                return LocalPropertyTableData.Metadata.LocalAnnotedDep();
            }

        }

        @objid ("006a066c-ec98-1098-b22e-001ec947cd2a")
        public static class PropertiesSmDependency extends SmMultipleDependency {
            @objid ("d75c49a0-acb5-4c01-bc65-c6b5a2983e75")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mProperties != null)? ((ModelElementData)data).mProperties:SmMultipleDependency.EMPTY;
            }

            @objid ("397c5a86-148d-4229-b812-f083cc1fa422")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mProperties = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mProperties;
            }

            @objid ("3e5d4144-cab7-4d90-a32b-a878a2a46d32")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableData.Metadata.OwnerDep();
            }

        }

        @objid ("637e21a6-97ca-432b-9e33-a1ea619eecf0")
        public static class MatrixSmDependency extends SmMultipleDependency {
            @objid ("a3caac16-48b2-4ddf-889f-de5717936c42")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mMatrix != null)? ((ModelElementData)data).mMatrix:SmMultipleDependency.EMPTY;
            }

            @objid ("55608c7b-db73-40ab-b595-bde313f63b0f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mMatrix = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mMatrix;
            }

            @objid ("e8792541-794a-4ca8-816e-44f7d16e3b97")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.OwnerDep();
            }

        }

    }

}
