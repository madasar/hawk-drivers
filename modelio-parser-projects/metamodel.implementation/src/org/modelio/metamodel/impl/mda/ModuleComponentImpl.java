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
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.mda.ModuleComponentData;
import org.modelio.metamodel.impl.uml.statik.ComponentImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleState;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("43f4fe7e-e0f5-4fc1-a14f-737f4dfc2ee6")
public class ModuleComponentImpl extends ComponentImpl implements ModuleComponent {
    @objid ("7f2c43d3-fc6a-448e-b3df-2627ef306eae")
    @Override
    public int getLicenseKey() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.LicenseKeyAtt());
    }

    @objid ("1c505d5f-f4c1-4618-a133-75d7f7521fc2")
    @Override
    public void setLicenseKey(int value) {
        setAttVal(ModuleComponentData.Metadata.LicenseKeyAtt(), value);
    }

    @objid ("b10ba14a-79f8-4702-b957-48fd7b81eb40")
    @Override
    public int getMajVersion() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.MajVersionAtt());
    }

    @objid ("0226cce7-3e98-44e6-b342-3927f5fdea2e")
    @Override
    public void setMajVersion(int value) {
        setAttVal(ModuleComponentData.Metadata.MajVersionAtt(), value);
    }

    @objid ("0354cea5-f64a-40f4-a06f-d3a6c4210393")
    @Override
    public int getMinVersion() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.MinVersionAtt());
    }

    @objid ("e72d18ef-1968-405a-a1b9-c8bd082ff72e")
    @Override
    public void setMinVersion(int value) {
        setAttVal(ModuleComponentData.Metadata.MinVersionAtt(), value);
    }

    @objid ("54e49aec-616c-4398-914a-08c3ccaa8890")
    @Override
    public String getMinMinVersion() {
        return (String) getAttVal(ModuleComponentData.Metadata.MinMinVersionAtt());
    }

    @objid ("0de350d0-e54a-463c-8fa2-292f3471a845")
    @Override
    public void setMinMinVersion(String value) {
        setAttVal(ModuleComponentData.Metadata.MinMinVersionAtt(), value);
    }

    @objid ("e4fcb6e5-adef-470a-a3e3-63f2cd71dcb4")
    @Override
    public String getMinBinVersionCompatibility() {
        return (String) getAttVal(ModuleComponentData.Metadata.MinBinVersionCompatibilityAtt());
    }

    @objid ("4bdf660b-13fd-41fc-a116-e636317c0981")
    @Override
    public void setMinBinVersionCompatibility(String value) {
        setAttVal(ModuleComponentData.Metadata.MinBinVersionCompatibilityAtt(), value);
    }

    @objid ("fb8f3ef5-589b-4b05-8333-c49196177d24")
    @Override
    public String getJavaClassName() {
        return (String) getAttVal(ModuleComponentData.Metadata.JavaClassNameAtt());
    }

    @objid ("8a33ff27-bbb1-4d62-aa85-0e9d486423f6")
    @Override
    public void setJavaClassName(String value) {
        setAttVal(ModuleComponentData.Metadata.JavaClassNameAtt(), value);
    }

    @objid ("2fbeb5d7-913e-4d76-8716-6edd7ef25856")
    @Override
    public ModuleState getState() {
        return (ModuleState) getAttVal(ModuleComponentData.Metadata.StateAtt());
    }

    @objid ("140508ea-9b2d-4f93-9a36-362d140cc3c2")
    @Override
    public void setState(ModuleState value) {
        setAttVal(ModuleComponentData.Metadata.StateAtt(), value);
    }

    @objid ("ce6f62fe-ceed-457d-aa34-62fe6f1aef8a")
    @Override
    public EList<PropertyType> getDefinedPropertyType() {
        return new SmList<>(this, ModuleComponentData.Metadata.DefinedPropertyTypeDep());
    }

    @objid ("85213d4f-007f-4be1-a5f4-0156692e1776")
    @Override
    public <T extends PropertyType> List<T> getDefinedPropertyType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyType element : getDefinedPropertyType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d1a4d73b-0f20-4d4c-9955-f1ee03b55055")
    @Override
    public EList<Profile> getOwnedProfile() {
        return new SmList<>(this, ModuleComponentData.Metadata.OwnedProfileDep());
    }

    @objid ("df2de95a-8ef8-4647-8fcf-8269c0c34196")
    @Override
    public <T extends Profile> List<T> getOwnedProfile(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Profile element : getOwnedProfile()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f7579ffb-3ad6-4574-8519-6e87afd37a8c")
    @Override
    public EList<ModuleParameter> getModuleParameter() {
        return new SmList<>(this, ModuleComponentData.Metadata.ModuleParameterDep());
    }

    @objid ("09d028ce-7427-4972-9547-8257c93e1b22")
    @Override
    public <T extends ModuleParameter> List<T> getModuleParameter(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModuleParameter element : getModuleParameter()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("969b1655-0b74-492a-95ef-bec947cf37b9")
    @Override
    public EList<ModuleComponent> getDependsOn() {
        return new SmList<>(this, ModuleComponentData.Metadata.DependsOnDep());
    }

    @objid ("33da6a20-f244-45fe-8157-c9dec1916afb")
    @Override
    public <T extends ModuleComponent> List<T> getDependsOn(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModuleComponent element : getDependsOn()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a4b1ba5d-c49c-46e2-a07f-ed0f01701c9b")
    @Override
    public EList<ModuleComponent> getImpacted() {
        return new SmList<>(this, ModuleComponentData.Metadata.ImpactedDep());
    }

    @objid ("4c37264b-f32f-4675-8120-a19966de2d81")
    @Override
    public <T extends ModuleComponent> List<T> getImpacted(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModuleComponent element : getImpacted()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("81fb0024-a8d2-4656-b524-9db0f5ddd74e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("39d159d7-32bd-42c8-8ead-72f383a1db83")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("92801f42-8d06-4e11-ba78-54b64c44e333")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModuleComponent(this);
        else
          return null;
    }

}
