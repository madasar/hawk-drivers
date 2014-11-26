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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00157246-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageImpl extends NameSpaceImpl implements Package {
    @objid ("e0ee9b09-7eb3-42ff-82d0-01c5a6794ec8")
    @Override
    public boolean isIsInstantiable() {
        return (Boolean) getAttVal(PackageData.Metadata.IsInstantiableAtt());
    }

    @objid ("a8c8d8eb-be8a-4ec8-9fe4-b068b524184e")
    @Override
    public void setIsInstantiable(boolean value) {
        setAttVal(PackageData.Metadata.IsInstantiableAtt(), value);
    }

    @objid ("3368485e-7576-4a07-809b-ae27abd12b3b")
    @Override
    public EList<BpmnParticipant> getBpmnRepresents() {
        return new SmList<>(this, PackageData.Metadata.BpmnRepresentsDep());
    }

    @objid ("1ece9dbc-c720-4915-9c14-0c51b42c0fda")
    @Override
    public <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnParticipant element : getBpmnRepresents()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0751802e-4feb-4bba-a64c-0c970621e3f6")
    @Override
    public EList<PackageMerge> getReceivingMerge() {
        return new SmList<>(this, PackageData.Metadata.ReceivingMergeDep());
    }

    @objid ("416cf79f-ef22-4101-81ea-83fddd90c125")
    @Override
    public <T extends PackageMerge> List<T> getReceivingMerge(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PackageMerge element : getReceivingMerge()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1d09ea9e-c2f4-44f6-b804-403facb2f467")
    @Override
    public Project getRepresented() {
        return (Project) getDepVal(PackageData.Metadata.RepresentedDep());
    }

    @objid ("5e776ff6-d907-4ee2-a837-9cff6deee7d6")
    @Override
    public void setRepresented(Project value) {
        appendDepVal(PackageData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("60c2cb92-9f18-4915-88f1-aa89a5e66f3d")
    @Override
    public EList<PackageMerge> getMerge() {
        return new SmList<>(this, PackageData.Metadata.MergeDep());
    }

    @objid ("bcda8a8d-d12a-4856-9688-7b5d8f5770f1")
    @Override
    public <T extends PackageMerge> List<T> getMerge(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PackageMerge element : getMerge()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("303b67fc-1a97-40ef-902a-3e5743633aa3")
    @Override
    public EList<PackageImport> getPackageImporting() {
        return new SmList<>(this, PackageData.Metadata.PackageImportingDep());
    }

    @objid ("0b159f30-fb1f-40c0-9d63-bfa0ade04fe8")
    @Override
    public <T extends PackageImport> List<T> getPackageImporting(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PackageImport element : getPackageImporting()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2e25c705-6c63-4452-b66d-6328a12e3d92")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageData.Metadata.RepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("db23f37e-8363-477e-8025-a36dbf0d74ff")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageData.Metadata.RepresentedDep());
        if (obj != null)
          return new SmDepVal(PackageData.Metadata.RepresentedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("49bdeae0-90c1-477b-ab5e-bcd164ba74f0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackage(this);
        else
          return null;
    }

}
