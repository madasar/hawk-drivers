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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ProfileData;
import org.modelio.metamodel.impl.uml.statik.PackageImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008caa50-c4be-1fd8-97fe-001ec947cd2a")
public class ProfileImpl extends PackageImpl implements Profile {
    @objid ("0ac8622f-a64c-4c26-880d-dfc405974140")
    @Override
    public String getJCode() {
        return (String) getAttVal(ProfileData.Metadata.JCodeAtt());
    }

    @objid ("b50dba06-1038-4c83-9a6e-eaa1c2e3ef78")
    @Override
    public void setJCode(String value) {
        setAttVal(ProfileData.Metadata.JCodeAtt(), value);
    }

    @objid ("6cc8a98f-c87e-4bde-9622-35034b8429dc")
    @Override
    public EList<Stereotype> getDefinedStereotype() {
        return new SmList<>(this, ProfileData.Metadata.DefinedStereotypeDep());
    }

    @objid ("d9c75cb5-df60-48ef-ab50-0bec042f2ab5")
    @Override
    public <T extends Stereotype> List<T> getDefinedStereotype(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Stereotype element : getDefinedStereotype()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("860ec0c1-7560-4e89-b8e6-b622dccb638d")
    @Override
    public ModuleComponent getOwnerModule() {
        return (ModuleComponent) getDepVal(ProfileData.Metadata.OwnerModuleDep());
    }

    @objid ("1b446931-29ce-4a60-90b7-095d206e37d0")
    @Override
    public void setOwnerModule(ModuleComponent value) {
        appendDepVal(ProfileData.Metadata.OwnerModuleDep(), (SmObjectImpl)value);
    }

    @objid ("19ebeaac-d7ea-4ec3-aa08-742aabd4a3c4")
    @Override
    public EList<MetaclassReference> getOwnedReference() {
        return new SmList<>(this, ProfileData.Metadata.OwnedReferenceDep());
    }

    @objid ("6ef733b6-7c87-4b2a-88f0-41b1cc055448")
    @Override
    public <T extends MetaclassReference> List<T> getOwnedReference(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final MetaclassReference element : getOwnedReference()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("16af6a8a-9f17-4c60-bb94-c8ea91853d6e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProfileData.Metadata.OwnerModuleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b8550a4c-fdf0-415f-893f-17e185fd01b6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProfileData.Metadata.OwnerModuleDep());
        if (obj != null)
          return new SmDepVal(ProfileData.Metadata.OwnerModuleDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a8e347c2-cc7e-42e9-9c45-e5968fe5f1cf")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProfile(this);
        else
          return null;
    }

}
