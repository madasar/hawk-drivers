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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.mda.ModuleParameterData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleParameterType;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00650bb2-c4bf-1fd8-97fe-001ec947cd2a")
public class ModuleParameterImpl extends ModelElementImpl implements ModuleParameter {
    @objid ("151585d6-2a8a-4153-9e19-b18124649307")
    @Override
    public String getSetName() {
        return (String) getAttVal(ModuleParameterData.Metadata.SetNameAtt());
    }

    @objid ("8a647b76-12f2-4462-8574-8d51baf0f305")
    @Override
    public void setSetName(String value) {
        setAttVal(ModuleParameterData.Metadata.SetNameAtt(), value);
    }

    @objid ("cb8d9705-3847-461c-83e3-631e5670e4ef")
    @Override
    public ModuleParameterType getAssociatedType() {
        return (ModuleParameterType) getAttVal(ModuleParameterData.Metadata.AssociatedTypeAtt());
    }

    @objid ("9f446826-af78-4a8f-88f1-e4813ac77807")
    @Override
    public void setAssociatedType(ModuleParameterType value) {
        setAttVal(ModuleParameterData.Metadata.AssociatedTypeAtt(), value);
    }

    @objid ("13b7a9d7-12a1-4364-bb93-1c161ca3be72")
    @Override
    public boolean isIsUserRead() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsUserReadAtt());
    }

    @objid ("e4f1d812-e5bf-4ecf-9a0e-29f36d14d5ac")
    @Override
    public void setIsUserRead(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsUserReadAtt(), value);
    }

    @objid ("3a3fff7e-d663-49c6-a4c9-69d4cb196ee6")
    @Override
    public boolean isIsUserWrite() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsUserWriteAtt());
    }

    @objid ("8e9b4410-47b9-4b04-8eb6-103cf6bb9bef")
    @Override
    public void setIsUserWrite(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsUserWriteAtt(), value);
    }

    @objid ("6050696d-5dd1-4e16-b75f-dcf08e09385b")
    @Override
    public boolean isIsApiRead() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsApiReadAtt());
    }

    @objid ("bd407505-ac6d-4b8e-affc-a092db4167ad")
    @Override
    public void setIsApiRead(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsApiReadAtt(), value);
    }

    @objid ("86ea42c1-9ec7-4288-ad24-7a245f1ae4bf")
    @Override
    public boolean isIsApiWrite() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsApiWriteAtt());
    }

    @objid ("7b57af9a-7522-48d3-9c02-bb41099435dd")
    @Override
    public void setIsApiWrite(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsApiWriteAtt(), value);
    }

    @objid ("440a5cce-2031-4fdb-b7ed-6d88cd58908e")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ModuleParameterData.Metadata.TypeDep());
    }

    @objid ("9b4e236f-d59e-4af4-b417-f41325dc0d38")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ModuleParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("bedb75fd-79ad-4bdb-8eeb-b21f3bc14b04")
    @Override
    public ModuleComponent getOwner() {
        return (ModuleComponent) getDepVal(ModuleParameterData.Metadata.OwnerDep());
    }

    @objid ("8541c72f-e78f-4d9a-a2e1-0039772309ce")
    @Override
    public void setOwner(ModuleComponent value) {
        appendDepVal(ModuleParameterData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("8422557b-f322-4fd2-86cd-c129bf2cf937")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModuleParameterData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("72f70003-92fb-4a7b-8ca9-13b604963f73")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModuleParameterData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ModuleParameterData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("4c92b03c-98bf-44a2-bee6-cd895295c376")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModuleParameter(this);
        else
          return null;
    }

}
