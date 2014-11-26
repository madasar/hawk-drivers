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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.informationFlow.DataFlowData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelTreeData;
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.data.uml.statik.ElementImportData;
import org.modelio.metamodel.data.uml.statik.GeneralizationData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.data.uml.statik.InterfaceRealizationData;
import org.modelio.metamodel.data.uml.statik.NamespaceUseData;
import org.modelio.metamodel.data.uml.statik.PackageImportData;
import org.modelio.metamodel.data.uml.statik.TemplateBindingData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.impl.uml.statik.NameSpaceImpl;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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

@objid ("0011d8de-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NameSpace.class, factory=NameSpaceData.Metadata.ObjectFactory.class)
public abstract class NameSpaceData extends ModelTreeData {
    @objid ("b33765e7-59eb-458a-a827-aa0123f9f83c")
    @SmaMetaAttribute(metaName="IsAbstract", type=Boolean.class, smAttributeClass=Metadata.IsAbstractSmAttribute.class)
     Object mIsAbstract = false;

    @objid ("48fc651d-1d70-4886-94c9-cf4b6e52484f")
    @SmaMetaAttribute(metaName="IsLeaf", type=Boolean.class, smAttributeClass=Metadata.IsLeafSmAttribute.class)
     Object mIsLeaf = false;

    @objid ("6089c939-07db-469a-936a-34fd009261a7")
    @SmaMetaAttribute(metaName="IsRoot", type=Boolean.class, smAttributeClass=Metadata.IsRootSmAttribute.class)
     Object mIsRoot = false;

    @objid ("e0d140bf-7aff-4e2a-a877-bfa35f70fda5")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("c9c25bd6-f41d-4206-9df2-68d58c67f1c2")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=GeneralizationData.class, min=0, max=-1, smAssociationClass=Metadata.ParentSmDependency.class, component = true)
     List<SmObjectImpl> mParent = null;

    @objid ("8e7b4b85-5b4f-4ac8-b651-e8f241e87b6a")
    @SmaMetaAssociation(metaName="TemplateInstanciation", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateInstanciationSmDependency.class, component = true)
     List<SmObjectImpl> mTemplateInstanciation = null;

    @objid ("23357738-c0fa-43d7-9b0c-75ebc12c7ccb")
    @SmaMetaAssociation(metaName="Representing", typeDataClass=InstanceData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mRepresenting = null;

    @objid ("f4f2716f-87af-4528-b6ca-e0c16617590b")
    @SmaMetaAssociation(metaName="OwnedBehavior", typeDataClass=BehaviorData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedBehaviorSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedBehavior = null;

    @objid ("31ab0c68-ce6b-4334-bc9e-2bcbdd68381d")
    @SmaMetaAssociation(metaName="Received", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivedSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mReceived = null;

    @objid ("f8ab9074-8ea5-490e-b081-fc803f673d5b")
    @SmaMetaAssociation(metaName="UsedNsu", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.UsedNsuSmDependency.class)
     List<SmObjectImpl> mUsedNsu = null;

    @objid ("b6d636c9-0ac0-4745-8fe2-413f4f8779e1")
    @SmaMetaAssociation(metaName="OwnedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedInformationFlowSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedInformationFlow = null;

    @objid ("c635875a-124d-4f19-8f74-02178bc7996e")
    @SmaMetaAssociation(metaName="Importing", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.ImportingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mImporting = null;

    @objid ("a06fcb84-a39a-4871-9f2f-cd4397dabce4")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mSent = null;

    @objid ("29280976-5ad6-4737-9eb3-5020545e5941")
    @SmaMetaAssociation(metaName="OwnedDataFlow", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedDataFlowSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedDataFlow = null;

    @objid ("6ea4d591-5ee6-4240-b643-6679147acd93")
    @SmaMetaAssociation(metaName="OwnedCollaborationUse", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationUseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaborationUse = null;

    @objid ("78ac0078-48a7-413c-b787-236b477301ae")
    @SmaMetaAssociation(metaName="OwnedPackageImport", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedPackageImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedPackageImport = null;

    @objid ("a197c9bd-c1a1-49a9-a91b-f4c04b747b50")
    @SmaMetaAssociation(metaName="Template", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSmDependency.class, component = true)
     List<SmObjectImpl> mTemplate = null;

    @objid ("21c2065f-245a-4806-bf0b-a8b03894c23e")
    @SmaMetaAssociation(metaName="Specialization", typeDataClass=GeneralizationData.class, min=0, max=-1, smAssociationClass=Metadata.SpecializationSmDependency.class, istodelete = true)
     List<SmObjectImpl> mSpecialization = null;

    @objid ("d2686746-8066-4dc4-bb61-8e380d0cf9c7")
    @SmaMetaAssociation(metaName="Realized", typeDataClass=InterfaceRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedSmDependency.class, component = true)
     List<SmObjectImpl> mRealized = null;

    @objid ("d1ee7a2a-16f2-492f-bbb2-2601d28c56a8")
    @SmaMetaAssociation(metaName="Declared", typeDataClass=InstanceData.class, min=0, max=-1, smAssociationClass=Metadata.DeclaredSmDependency.class, component = true)
     List<SmObjectImpl> mDeclared = null;

    @objid ("6874cc94-2388-49c5-ac92-1152232be51a")
    @SmaMetaAssociation(metaName="InstanciatingBinding", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.InstanciatingBindingSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mInstanciatingBinding = null;

    @objid ("15520d12-f50c-4175-b693-3577f1e4b777")
    @SmaMetaAssociation(metaName="OwnedImport", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedImport = null;

    @objid ("f90590b8-355c-4df1-b50f-749b57a7ea86")
    @SmaMetaAssociation(metaName="UserNsu", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.UserNsuSmDependency.class)
     List<SmObjectImpl> mUserNsu = null;

    @objid ("a357c4fa-f0da-4b38-875d-8872f1c172e5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00948996-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("43670a31-c5dc-44fd-aefe-5df3415e86ce")
        private static SmClass smClass = null;

        @objid ("ffae1462-b429-41d6-a8f9-bc575fb25842")
        private static SmAttribute IsAbstractAtt = null;

        @objid ("d1fa0e29-7abb-48c5-8ffd-cb962cb3d6c4")
        private static SmAttribute IsLeafAtt = null;

        @objid ("84cbee48-d6b0-45bd-a156-84d42fe32c04")
        private static SmAttribute IsRootAtt = null;

        @objid ("fc57bfad-85c3-48a3-bf45-2192d9675160")
        private static SmAttribute VisibilityAtt = null;

        @objid ("fb7357f2-dbcd-4264-ac85-55ecab26b5ce")
        private static SmDependency ParentDep = null;

        @objid ("0a9c55a5-24d8-41d6-bfd9-a7c3a761c537")
        private static SmDependency TemplateInstanciationDep = null;

        @objid ("44737e33-f0c1-41c9-850a-1ae1f31f3b73")
        private static SmDependency RepresentingDep = null;

        @objid ("e643f0a9-d231-4f95-9870-31382ee23be2")
        private static SmDependency OwnedBehaviorDep = null;

        @objid ("a5536969-a714-4975-8e90-57494a1ce151")
        private static SmDependency ReceivedDep = null;

        @objid ("aba0c2cc-ccc4-48a7-ab01-c7fc8d7cc228")
        private static SmDependency UsedNsuDep = null;

        @objid ("34742268-a17a-41d0-b86a-0295098ecd93")
        private static SmDependency OwnedInformationFlowDep = null;

        @objid ("9acc3692-a3ea-4f02-a513-b8e24aa5d31e")
        private static SmDependency ImportingDep = null;

        @objid ("d3b2f4e8-470a-4cd0-945e-8150b3d268c9")
        private static SmDependency SentDep = null;

        @objid ("d1c31a5f-9131-4136-8910-7b42b0d0ae1e")
        private static SmDependency OwnedDataFlowDep = null;

        @objid ("0c988754-a5c2-4ad8-b320-ffabfad5b089")
        private static SmDependency OwnedCollaborationUseDep = null;

        @objid ("92ab363b-301b-414a-b506-abe81cedb700")
        private static SmDependency OwnedPackageImportDep = null;

        @objid ("3978579a-9c0c-4d7e-a416-bb1b985dbfbe")
        private static SmDependency TemplateDep = null;

        @objid ("87e689e9-0a3b-4df5-a5c9-adf30481a147")
        private static SmDependency SpecializationDep = null;

        @objid ("797e619a-baae-41d4-ad9b-53e541bf5862")
        private static SmDependency RealizedDep = null;

        @objid ("af724fbb-bf43-4e38-b346-765f06d6c0e6")
        private static SmDependency DeclaredDep = null;

        @objid ("c20ae2e5-9381-4946-9632-0f5541fd12f7")
        private static SmDependency InstanciatingBindingDep = null;

        @objid ("123e3577-629a-4149-8089-2e109366b63b")
        private static SmDependency OwnedImportDep = null;

        @objid ("e802896f-9dde-4b35-a6dd-5413f1854310")
        private static SmDependency UserNsuDep = null;

        @objid ("954f5705-6721-4638-b6c1-281fa030ca01")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NameSpaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f069690b-2215-437e-bc13-8ca074e5dcf4")
        public static SmAttribute IsAbstractAtt() {
            if (IsAbstractAtt == null) {
            	IsAbstractAtt = classof().getAttributeDef("IsAbstract");
            }
            return IsAbstractAtt;
        }

        @objid ("b1782194-0ff6-4241-8d85-94f55af3dcbf")
        public static SmAttribute IsLeafAtt() {
            if (IsLeafAtt == null) {
            	IsLeafAtt = classof().getAttributeDef("IsLeaf");
            }
            return IsLeafAtt;
        }

        @objid ("0aac95d0-25c1-494b-9fd0-b0512165ea40")
        public static SmAttribute IsRootAtt() {
            if (IsRootAtt == null) {
            	IsRootAtt = classof().getAttributeDef("IsRoot");
            }
            return IsRootAtt;
        }

        @objid ("91dec772-61f5-4cbc-8d19-307f0de6e80b")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("1e7eb217-230a-43fd-ab7e-2c1827ccf07f")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("01adab7d-d6ff-4093-9a4c-930d710a5274")
        public static SmDependency TemplateInstanciationDep() {
            if (TemplateInstanciationDep == null) {
            	TemplateInstanciationDep = classof().getDependencyDef("TemplateInstanciation");
            }
            return TemplateInstanciationDep;
        }

        @objid ("29d417e8-42e4-41ac-91a8-4e73e7bd53dd")
        public static SmDependency RepresentingDep() {
            if (RepresentingDep == null) {
            	RepresentingDep = classof().getDependencyDef("Representing");
            }
            return RepresentingDep;
        }

        @objid ("6dfbe736-bcba-4762-b6e6-2e85a2ca8865")
        public static SmDependency OwnedBehaviorDep() {
            if (OwnedBehaviorDep == null) {
            	OwnedBehaviorDep = classof().getDependencyDef("OwnedBehavior");
            }
            return OwnedBehaviorDep;
        }

        @objid ("652ccea3-1b83-4e80-adec-2c8d0032d626")
        public static SmDependency ReceivedDep() {
            if (ReceivedDep == null) {
            	ReceivedDep = classof().getDependencyDef("Received");
            }
            return ReceivedDep;
        }

        @objid ("d15cbaab-156f-4e92-9d23-8552fa00abf5")
        public static SmDependency UsedNsuDep() {
            if (UsedNsuDep == null) {
            	UsedNsuDep = classof().getDependencyDef("UsedNsu");
            }
            return UsedNsuDep;
        }

        @objid ("3650b008-a0dc-4dc2-88df-a44efcfbd1cf")
        public static SmDependency OwnedInformationFlowDep() {
            if (OwnedInformationFlowDep == null) {
            	OwnedInformationFlowDep = classof().getDependencyDef("OwnedInformationFlow");
            }
            return OwnedInformationFlowDep;
        }

        @objid ("c3612b03-f742-49a1-b5ce-32a6630e6cc8")
        public static SmDependency ImportingDep() {
            if (ImportingDep == null) {
            	ImportingDep = classof().getDependencyDef("Importing");
            }
            return ImportingDep;
        }

        @objid ("170f87d3-cda5-4a22-b9bb-ec0f9819fd63")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("329f0580-e49a-4b60-98c3-98dc9eed50b7")
        public static SmDependency OwnedDataFlowDep() {
            if (OwnedDataFlowDep == null) {
            	OwnedDataFlowDep = classof().getDependencyDef("OwnedDataFlow");
            }
            return OwnedDataFlowDep;
        }

        @objid ("645eb467-b1db-4c2c-80bd-120096f63248")
        public static SmDependency OwnedCollaborationUseDep() {
            if (OwnedCollaborationUseDep == null) {
            	OwnedCollaborationUseDep = classof().getDependencyDef("OwnedCollaborationUse");
            }
            return OwnedCollaborationUseDep;
        }

        @objid ("7e9d0ea6-12ab-4128-b877-92a117f0db46")
        public static SmDependency OwnedPackageImportDep() {
            if (OwnedPackageImportDep == null) {
            	OwnedPackageImportDep = classof().getDependencyDef("OwnedPackageImport");
            }
            return OwnedPackageImportDep;
        }

        @objid ("49c979db-6fdc-49b7-aaa8-7ebdc5fa4473")
        public static SmDependency TemplateDep() {
            if (TemplateDep == null) {
            	TemplateDep = classof().getDependencyDef("Template");
            }
            return TemplateDep;
        }

        @objid ("08f653ca-3cc3-434f-9ea4-b6c526e52d7a")
        public static SmDependency SpecializationDep() {
            if (SpecializationDep == null) {
            	SpecializationDep = classof().getDependencyDef("Specialization");
            }
            return SpecializationDep;
        }

        @objid ("ceb2e5b3-53f0-445e-85a5-6dde0341e45b")
        public static SmDependency RealizedDep() {
            if (RealizedDep == null) {
            	RealizedDep = classof().getDependencyDef("Realized");
            }
            return RealizedDep;
        }

        @objid ("b6bda2e6-8502-486d-916f-e5078bcab29e")
        public static SmDependency DeclaredDep() {
            if (DeclaredDep == null) {
            	DeclaredDep = classof().getDependencyDef("Declared");
            }
            return DeclaredDep;
        }

        @objid ("2e395042-adbd-4cd7-b20a-02b440878425")
        public static SmDependency InstanciatingBindingDep() {
            if (InstanciatingBindingDep == null) {
            	InstanciatingBindingDep = classof().getDependencyDef("InstanciatingBinding");
            }
            return InstanciatingBindingDep;
        }

        @objid ("779a6dba-a5fb-468e-a2dc-2b171a0f4117")
        public static SmDependency OwnedImportDep() {
            if (OwnedImportDep == null) {
            	OwnedImportDep = classof().getDependencyDef("OwnedImport");
            }
            return OwnedImportDep;
        }

        @objid ("732e5244-818a-48bb-ae84-84c016baa2ca")
        public static SmDependency UserNsuDep() {
            if (UserNsuDep == null) {
            	UserNsuDep = classof().getDependencyDef("UserNsu");
            }
            return UserNsuDep;
        }

        @objid ("7db68ad9-bba0-41d7-a9cf-1e85215e5d8e")
        public static SmDependency getOwnedCollaborationUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationUseDep;
        }

        @objid ("42073234-821b-40e5-9b90-e4fc62caa683")
        public static SmDependency getOwnedImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedImportDep;
        }

        @objid ("4e66ab46-d2c1-4dcc-b9b2-6756b4069668")
        public static SmDependency getOwnedDataFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDataFlowDep;
        }

        @objid ("8b91d404-6026-4bbf-80ff-198b440979bc")
        public static SmDependency getRepresentingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingDep;
        }

        @objid ("532063f3-3f29-4e82-933f-53f6a54b8c38")
        public static SmDependency getRealizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedDep;
        }

        @objid ("f188dd53-96c5-4eb5-b5e0-22551dbbad85")
        public static SmDependency getReceivedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedDep;
        }

        @objid ("69ad96db-2496-43aa-9789-bc292258534c")
        public static SmDependency getSpecializationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SpecializationDep;
        }

        @objid ("feff945e-8c6d-4531-b7c5-e852057069ad")
        public static SmDependency getOwnedPackageImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedPackageImportDep;
        }

        @objid ("eda88fd8-b1bf-4e51-99a3-7d4287b780b0")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("0e1b9fab-f362-42cb-83f9-e9885079941e")
        public static SmDependency getDeclaredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DeclaredDep;
        }

        @objid ("faa2e76a-f6c5-4024-8c71-f7c75d7081a7")
        public static SmDependency getUsedNsuDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedNsuDep;
        }

        @objid ("49cdf87e-0db7-4ff2-8526-6e2420376c53")
        public static SmAttribute getIsRootAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsRootAtt;
        }

        @objid ("0565980c-5544-4905-a62c-b887a11d1de7")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("58f2cef7-db6c-47d7-978e-4dc082afe00d")
        public static SmDependency getTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateDep;
        }

        @objid ("14e837d4-a729-4986-b8fe-94d62bfe2833")
        public static SmDependency getOwnedBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedBehaviorDep;
        }

        @objid ("06c9ee12-e4d5-4398-b9a0-91f2a8deea17")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7399ade4-3d7d-4c60-afec-d4b4e09cc814")
        public static SmDependency getImportingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingDep;
        }

        @objid ("6e9164dc-2e4d-42ce-8c95-42793fe40076")
        public static SmDependency getUserNsuDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserNsuDep;
        }

        @objid ("8715da8c-19e0-400f-b9ae-f81193f53ace")
        public static SmDependency getOwnedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedInformationFlowDep;
        }

        @objid ("803a701d-4830-4773-a1bf-4b1b7a781b38")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("93069951-98f6-4f9d-8d85-0b901a9166f3")
        public static SmAttribute getIsLeafAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsLeafAtt;
        }

        @objid ("ef8b29e2-2bff-4483-93dd-84b0d1cbeba7")
        public static SmAttribute getIsAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAbstractAtt;
        }

        @objid ("1de5ecb9-8972-460e-92b6-ec0b8e5afd44")
        public static SmDependency getInstanciatingBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatingBindingDep;
        }

        @objid ("397822f0-c23f-49cf-9955-7a447cfaff63")
        public static SmDependency getTemplateInstanciationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateInstanciationDep;
        }

        @objid ("0094c9ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f6c9b068-6e85-4ca8-92a2-8610a8612c38")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("d5a648aa-d94e-4374-a27d-c7d1b3a59cec")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00952bd0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsAbstractSmAttribute extends SmAttribute {
            @objid ("a34c9ec1-cfc1-465e-afea-ebbf2fefa519")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsAbstract;
            }

            @objid ("f2c1fc77-31c4-47d8-aed4-0b9e2cbebbe5")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsAbstract = value;
            }

        }

        @objid ("00958c88-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsLeafSmAttribute extends SmAttribute {
            @objid ("1d7072a2-0715-4f8a-9c77-10e2bcc785a6")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsLeaf;
            }

            @objid ("17b2a814-db43-4434-ac8d-d57796897d49")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsLeaf = value;
            }

        }

        @objid ("0095ece6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsRootSmAttribute extends SmAttribute {
            @objid ("db2ccbc0-ac3c-4317-83af-aab8081306c1")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsRoot;
            }

            @objid ("2cc7530f-bb51-4722-83cd-3c5367892a87")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsRoot = value;
            }

        }

        @objid ("00964fb0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("ff4352fb-495a-49b5-ba38-d7a1e916697a")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mVisibility;
            }

            @objid ("92e018ff-a5f0-445d-bc8c-dd8b42ae45bb")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mVisibility = value;
            }

        }

        @objid ("0096b702-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationUseSmDependency extends SmMultipleDependency {
            @objid ("4b858661-da42-461b-8998-58df6c3177da")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedCollaborationUse != null)? ((NameSpaceData)data).mOwnedCollaborationUse:SmMultipleDependency.EMPTY;
            }

            @objid ("4421889c-ff58-42e0-b951-e89b94a1a59f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedCollaborationUse = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedCollaborationUse;
            }

            @objid ("0ac4e184-a2e3-40ed-a456-c70e8feb2478")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.NRepresentedDep();
            }

        }

        @objid ("00971efe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReceivedSmDependency extends SmMultipleDependency {
            @objid ("905ae4dc-71ae-4630-8816-1b93e2c6db61")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mReceived != null)? ((NameSpaceData)data).mReceived:SmMultipleDependency.EMPTY;
            }

            @objid ("1e1edd24-d19a-4998-a086-f8938b71272e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mReceived = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mReceived;
            }

            @objid ("8ab5a5bc-240e-4104-bddf-81b795833a73")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.DestinationDep();
            }

        }

        @objid ("009783ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("f1f09b3c-f5b3-43f6-8969-00bb2d6d4496")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mSent != null)? ((NameSpaceData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("61d87cb6-967c-4593-a00b-b955de665133")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mSent = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mSent;
            }

            @objid ("c176b98f-9e16-4628-90c9-aa1b6360e012")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.OriginDep();
            }

        }

        @objid ("0097e8b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedDataFlowSmDependency extends SmMultipleDependency {
            @objid ("c7ce1e29-0108-43fa-ad66-a693436c9e17")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedDataFlow != null)? ((NameSpaceData)data).mOwnedDataFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("837458a4-6acc-4a53-b81d-8f6031db9374")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedDataFlow = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedDataFlow;
            }

            @objid ("72e4474b-63ed-4906-afc3-128f68064974")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.OwnerDep();
            }

        }

        @objid ("00984de2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingSmDependency extends SmMultipleDependency {
            @objid ("f3afd0d4-0825-443c-b1f6-c600ef47d7a0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mImporting != null)? ((NameSpaceData)data).mImporting:SmMultipleDependency.EMPTY;
            }

            @objid ("18938e3a-3023-494a-a7c3-4cd523a78bef")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mImporting = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mImporting;
            }

            @objid ("80f880a4-8332-425f-bc8e-ee0f5e424a40")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportedElementDep();
            }

        }

        @objid ("0000df20-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedImportSmDependency extends SmMultipleDependency {
            @objid ("1c033f79-4223-4e9a-8c8c-1dc3e8532f99")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedImport != null)? ((NameSpaceData)data).mOwnedImport:SmMultipleDependency.EMPTY;
            }

            @objid ("877fbb3f-7cb9-4d6e-995b-acca6b70c21b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedImport = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedImport;
            }

            @objid ("2929b555-f6c2-4862-9e17-755ffbed5256")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportingNameSpaceDep();
            }

        }

        @objid ("000157d4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class SpecializationSmDependency extends SmMultipleDependency {
            @objid ("659c190b-6b4c-4740-9915-fc972b775fa7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mSpecialization != null)? ((NameSpaceData)data).mSpecialization:SmMultipleDependency.EMPTY;
            }

            @objid ("6fa2331c-da14-4cac-864f-7ea1b53af2ed")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mSpecialization = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mSpecialization;
            }

            @objid ("55af3026-ca52-474d-a00b-afd7f408818b")
            @Override
            public SmDependency getSymetric() {
                return GeneralizationData.Metadata.SuperTypeDep();
            }

        }

        @objid ("0001c052-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmMultipleDependency {
            @objid ("9c0c0545-cbc7-4bf9-81ee-372198565e40")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mParent != null)? ((NameSpaceData)data).mParent:SmMultipleDependency.EMPTY;
            }

            @objid ("ea53bb75-37bf-4cb3-9c86-58798e279d1b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mParent = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mParent;
            }

            @objid ("3e5f723d-ead9-4744-b09e-7eb5b741f656")
            @Override
            public SmDependency getSymetric() {
                return GeneralizationData.Metadata.SubTypeDep();
            }

        }

        @objid ("000228d0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RepresentingSmDependency extends SmMultipleDependency {
            @objid ("09e9c90a-bfb8-42cc-af7d-9849a69cf6e7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mRepresenting != null)? ((NameSpaceData)data).mRepresenting:SmMultipleDependency.EMPTY;
            }

            @objid ("8790a8dd-3bd5-45ab-aa25-7ec3953e929d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mRepresenting = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mRepresenting;
            }

            @objid ("29f08f20-0777-4403-9054-36c17c1789ce")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.BaseDep();
            }

        }

        @objid ("00029216-c4c6-1fd8-97fe-001ec947cd2a")
        public static class DeclaredSmDependency extends SmMultipleDependency {
            @objid ("98c45a34-7415-42bf-a61a-ec7d7dbf9e3f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mDeclared != null)? ((NameSpaceData)data).mDeclared:SmMultipleDependency.EMPTY;
            }

            @objid ("4268aca0-3db8-477d-9e9f-1f301e416e57")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mDeclared = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mDeclared;
            }

            @objid ("93e19fb9-6e3b-4c37-9cf6-8882ffd2f574")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnerDep();
            }

        }

        @objid ("0002fb2a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedBehaviorSmDependency extends SmMultipleDependency {
            @objid ("ca2c2a12-1d99-4339-a6da-f34bf8637051")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedBehavior != null)? ((NameSpaceData)data).mOwnedBehavior:SmMultipleDependency.EMPTY;
            }

            @objid ("93cd1718-0e25-49a8-8215-6747cc7711b9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedBehavior = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedBehavior;
            }

            @objid ("dd3c211a-fb0f-4cf7-a33d-6cc5f3b80f0a")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnerDep();
            }

        }

        @objid ("00036592-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RealizedSmDependency extends SmMultipleDependency {
            @objid ("0e58c323-4f45-4d4d-8101-8aaf447950c3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mRealized != null)? ((NameSpaceData)data).mRealized:SmMultipleDependency.EMPTY;
            }

            @objid ("b05c6916-3a16-470e-8f39-c2c2aa197c15")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mRealized = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mRealized;
            }

            @objid ("8ab9fbd6-2b63-49c1-910d-f89545cc5827")
            @Override
            public SmDependency getSymetric() {
                return InterfaceRealizationData.Metadata.ImplementerDep();
            }

        }

        @objid ("0003d022-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TemplateSmDependency extends SmMultipleDependency {
            @objid ("cc1a0140-775c-4218-a2cf-dd48b7d909bf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mTemplate != null)? ((NameSpaceData)data).mTemplate:SmMultipleDependency.EMPTY;
            }

            @objid ("6923dc94-a8b6-4ef1-945c-bdc545e3b82e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mTemplate = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mTemplate;
            }

            @objid ("01ed829a-4b3b-4dba-9206-0eaeff2d3f2c")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterizedDep();
            }

        }

        @objid ("00043ac6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class InstanciatingBindingSmDependency extends SmMultipleDependency {
            @objid ("9c1319ee-4efc-4f69-8bae-4c530616abb3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mInstanciatingBinding != null)? ((NameSpaceData)data).mInstanciatingBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("0b976e44-0549-4f6c-83ca-7979ba62b2aa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mInstanciatingBinding = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mInstanciatingBinding;
            }

            @objid ("bf8af0a4-ed6e-43df-8deb-0a9cc9d2d7f6")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.InstanciatedTemplateDep();
            }

        }

        @objid ("0004a650-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedPackageImportSmDependency extends SmMultipleDependency {
            @objid ("3325957b-f428-4c9b-b185-731449681ff4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedPackageImport != null)? ((NameSpaceData)data).mOwnedPackageImport:SmMultipleDependency.EMPTY;
            }

            @objid ("7eba3a25-2105-411c-a4d1-1c6e35954ae0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedPackageImport = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedPackageImport;
            }

            @objid ("c2674fec-a879-4f24-a894-889631ad8fd4")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportingNameSpaceDep();
            }

        }

        @objid ("00051310-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TemplateInstanciationSmDependency extends SmMultipleDependency {
            @objid ("208181e1-6163-4a40-935d-38eab5d3152e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mTemplateInstanciation != null)? ((NameSpaceData)data).mTemplateInstanciation:SmMultipleDependency.EMPTY;
            }

            @objid ("5b189600-2b6d-4448-b000-7e0d31e440d4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mTemplateInstanciation = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mTemplateInstanciation;
            }

            @objid ("473c3726-7a9e-40ce-a129-56a2836bab49")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.BoundElementDep();
            }

        }

        @objid ("00057f80-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UserNsuSmDependency extends SmMultipleDependency {
            @objid ("14ed78d9-9afd-46c7-a8a3-9b28ab969370")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mUserNsu != null)? ((NameSpaceData)data).mUserNsu:SmMultipleDependency.EMPTY;
            }

            @objid ("c014c2f1-9f37-48de-88bf-3c456fb31b3d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mUserNsu = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mUserNsu;
            }

            @objid ("585068f8-a616-40e4-a7bd-94463ed2711b")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.UsedDep();
            }

        }

        @objid ("0005ecd6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UsedNsuSmDependency extends SmMultipleDependency {
            @objid ("bf9ed919-8bec-4c6a-8e02-aeb2ce0a31d8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mUsedNsu != null)? ((NameSpaceData)data).mUsedNsu:SmMultipleDependency.EMPTY;
            }

            @objid ("b7edbff9-c062-4cdf-b1f9-c0210b122ecd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mUsedNsu = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mUsedNsu;
            }

            @objid ("ad46a837-faa7-4cb1-af72-345c68c0d64b")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.UserDep();
            }

        }

        @objid ("00065af4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("da26c4b5-9d21-4ec0-b550-1c60fd9f1606")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedInformationFlow != null)? ((NameSpaceData)data).mOwnedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("db51d97a-0ae8-40e1-a185-39147821de83")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedInformationFlow = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedInformationFlow;
            }

            @objid ("d597e02d-68d2-4d61-b261-98029dddaf51")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.OwnerDep();
            }

        }

    }

}
