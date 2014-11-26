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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelTreeImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0011931a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class NameSpaceImpl extends ModelTreeImpl implements NameSpace {
    @objid ("8d7f89a1-203f-470e-8d15-be9bf496bcbc")
    @Override
    public boolean isIsAbstract() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsAbstractAtt());
    }

    @objid ("06a86a25-854d-45cc-80d0-fe8afc0e59ca")
    @Override
    public void setIsAbstract(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsAbstractAtt(), value);
    }

    @objid ("5d722f52-3ae4-4b45-8e9e-a0f5fff774a4")
    @Override
    public boolean isIsLeaf() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsLeafAtt());
    }

    @objid ("42bc5484-40e7-49dd-8f2c-9b268ee5bcac")
    @Override
    public void setIsLeaf(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsLeafAtt(), value);
    }

    @objid ("de80c2f2-db55-4f1d-ab14-5f4982b8cd4e")
    @Override
    public boolean isIsRoot() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsRootAtt());
    }

    @objid ("02a56cbc-e176-46ba-b31f-35dd5b4687bc")
    @Override
    public void setIsRoot(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsRootAtt(), value);
    }

    @objid ("00acb866-9f0f-4ae3-ba47-8f9c73a73f4b")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(NameSpaceData.Metadata.VisibilityAtt());
    }

    @objid ("fb4b7b66-2a79-4872-8079-868b6cdc31ad")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(NameSpaceData.Metadata.VisibilityAtt(), value);
    }

    @objid ("3f2a64be-54fb-4471-90e3-f90dd81ae72c")
    @Override
    public EList<Generalization> getParent() {
        return new SmList<>(this, NameSpaceData.Metadata.ParentDep());
    }

    @objid ("b77fcb39-e1e2-47f8-88f6-84459c511bb7")
    @Override
    public <T extends Generalization> List<T> getParent(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Generalization element : getParent()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a1d20cb9-b5af-4ed3-8f46-975072c07dba")
    @Override
    public EList<TemplateBinding> getTemplateInstanciation() {
        return new SmList<>(this, NameSpaceData.Metadata.TemplateInstanciationDep());
    }

    @objid ("6127bc2e-edb1-43c3-ad29-075148c21714")
    @Override
    public <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateBinding element : getTemplateInstanciation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5b807319-9c08-4bad-acf9-9563c0fc5fe9")
    @Override
    public EList<Instance> getRepresenting() {
        return new SmList<>(this, NameSpaceData.Metadata.RepresentingDep());
    }

    @objid ("46a585e3-35f6-435a-9283-2dcf3939cacd")
    @Override
    public <T extends Instance> List<T> getRepresenting(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Instance element : getRepresenting()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7dba1124-9b5a-4223-ad59-c67cd3318b3f")
    @Override
    public EList<Behavior> getOwnedBehavior() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedBehaviorDep());
    }

    @objid ("9e72d74f-89a5-477c-92b3-9d57a134086a")
    @Override
    public <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Behavior element : getOwnedBehavior()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b9bf10ed-6171-4cc6-9250-040c1b94f4e4")
    @Override
    public EList<DataFlow> getReceived() {
        return new SmList<>(this, NameSpaceData.Metadata.ReceivedDep());
    }

    @objid ("195ccbfd-e448-434d-9c5b-01ad7bebb398")
    @Override
    public <T extends DataFlow> List<T> getReceived(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DataFlow element : getReceived()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b037e1f9-80a6-41f8-8ea7-b1609bd2e60a")
    @Override
    public EList<NamespaceUse> getUsedNsu() {
        return new SmList<>(this, NameSpaceData.Metadata.UsedNsuDep());
    }

    @objid ("4484436f-abac-494e-ae77-4e3150e812d9")
    @Override
    public <T extends NamespaceUse> List<T> getUsedNsu(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NamespaceUse element : getUsedNsu()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fd51a16a-48a8-452c-8c9d-ed53ba1a307e")
    @Override
    public EList<InformationFlow> getOwnedInformationFlow() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedInformationFlowDep());
    }

    @objid ("29925ec1-7be1-4189-8be6-0d8393adcbe4")
    @Override
    public <T extends InformationFlow> List<T> getOwnedInformationFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getOwnedInformationFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f8a6740c-fe84-49ea-9656-b1c30cf64a96")
    @Override
    public EList<ElementImport> getImporting() {
        return new SmList<>(this, NameSpaceData.Metadata.ImportingDep());
    }

    @objid ("e7cf3b32-1b54-4f99-b51b-5d959c83c779")
    @Override
    public <T extends ElementImport> List<T> getImporting(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ElementImport element : getImporting()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("99e48d15-0589-4c21-a3b2-68358c881b0f")
    @Override
    public EList<DataFlow> getSent() {
        return new SmList<>(this, NameSpaceData.Metadata.SentDep());
    }

    @objid ("fbae972f-a102-42aa-866c-e399dd8b710c")
    @Override
    public <T extends DataFlow> List<T> getSent(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DataFlow element : getSent()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d12dcac7-200d-4053-ba90-10335fe8c811")
    @Override
    public EList<DataFlow> getOwnedDataFlow() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedDataFlowDep());
    }

    @objid ("8038650e-39d2-40e2-b215-f083d1659ab0")
    @Override
    public <T extends DataFlow> List<T> getOwnedDataFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DataFlow element : getOwnedDataFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("44d1eaad-d5a5-40d3-a024-381c00bf87ef")
    @Override
    public EList<CollaborationUse> getOwnedCollaborationUse() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedCollaborationUseDep());
    }

    @objid ("266f011a-d53a-480a-a77a-39953368c29b")
    @Override
    public <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CollaborationUse element : getOwnedCollaborationUse()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f1521e10-6fc7-4f4a-9d5c-a03450fb2e29")
    @Override
    public EList<PackageImport> getOwnedPackageImport() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedPackageImportDep());
    }

    @objid ("e955986d-0a88-4aef-a9b5-7b4d5fcb856b")
    @Override
    public <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PackageImport element : getOwnedPackageImport()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a7bed515-bf2a-4942-802b-b6e822b6e600")
    @Override
    public EList<TemplateParameter> getTemplate() {
        return new SmList<>(this, NameSpaceData.Metadata.TemplateDep());
    }

    @objid ("bf53e043-f396-4831-a077-9e2eff85292d")
    @Override
    public <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameter element : getTemplate()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4c879a14-5c65-425b-b1f4-af823081bd5e")
    @Override
    public EList<Generalization> getSpecialization() {
        return new SmList<>(this, NameSpaceData.Metadata.SpecializationDep());
    }

    @objid ("aee9c12e-3e00-4b1a-9cbb-7af1cd2bbef7")
    @Override
    public <T extends Generalization> List<T> getSpecialization(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Generalization element : getSpecialization()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5f230d0f-cb26-4b4a-9b8e-0502c41d7b7e")
    @Override
    public EList<InterfaceRealization> getRealized() {
        return new SmList<>(this, NameSpaceData.Metadata.RealizedDep());
    }

    @objid ("dd62010d-52e5-40c5-8f74-2b314c685e3c")
    @Override
    public <T extends InterfaceRealization> List<T> getRealized(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InterfaceRealization element : getRealized()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("816e2b3c-e7e0-44d0-95d7-284e6e50d6e1")
    @Override
    public EList<Instance> getDeclared() {
        return new SmList<>(this, NameSpaceData.Metadata.DeclaredDep());
    }

    @objid ("a13fed8b-1162-4e53-907f-dd03bbdfaa47")
    @Override
    public <T extends Instance> List<T> getDeclared(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Instance element : getDeclared()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("23feaaf3-bba0-428b-8f71-348b9520dee1")
    @Override
    public EList<TemplateBinding> getInstanciatingBinding() {
        return new SmList<>(this, NameSpaceData.Metadata.InstanciatingBindingDep());
    }

    @objid ("e7df8e87-6c27-4735-bc10-2dad39b56e19")
    @Override
    public <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateBinding element : getInstanciatingBinding()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("dc8886e6-cf31-42fd-853d-cf31bd44677e")
    @Override
    public EList<ElementImport> getOwnedImport() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedImportDep());
    }

    @objid ("24dcf1c1-0237-4c35-b326-fd8e640a8003")
    @Override
    public <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ElementImport element : getOwnedImport()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c89807a5-8368-4c44-a8d1-d43c97b4a99c")
    @Override
    public EList<NamespaceUse> getUserNsu() {
        return new SmList<>(this, NameSpaceData.Metadata.UserNsuDep());
    }

    @objid ("9a847ae8-e9be-4e25-993c-56682d0658b3")
    @Override
    public <T extends NamespaceUse> List<T> getUserNsu(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NamespaceUse element : getUserNsu()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("27f51675-f27a-4859-9f48-a4bad598bbd2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e14be3e2-9bcb-4721-bca3-16fa25e8ae6f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("668b24a8-6da6-404d-9748-002fdf33d04b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNameSpace(this);
        else
          return null;
    }

}
