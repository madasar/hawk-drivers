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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("006ef8c0-ec87-1098-b22e-001ec947cd2a")
public class PropertyTypeImpl extends ModelElementImpl implements PropertyType {
    @objid ("00210b27-046b-4f75-9bd7-dafad0ec5d34")
    @Override
    public PropertyBaseType getBaseType() {
        return (PropertyBaseType) getAttVal(PropertyTypeData.Metadata.BaseTypeAtt());
    }

    @objid ("39943790-9d54-40de-a8e4-6d542b380cb7")
    @Override
    public void setBaseType(PropertyBaseType value) {
        setAttVal(PropertyTypeData.Metadata.BaseTypeAtt(), value);
    }

    @objid ("2c0d2245-d2cb-4b94-88cc-838bbe9b57a9")
    @Override
    public PropertyContainer getAnalystOwner() {
        return (PropertyContainer) getDepVal(PropertyTypeData.Metadata.AnalystOwnerDep());
    }

    @objid ("75aaae40-c298-47c2-9ae5-a2eaab97be7d")
    @Override
    public void setAnalystOwner(PropertyContainer value) {
        appendDepVal(PropertyTypeData.Metadata.AnalystOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("41deb052-25be-4ba3-bbfd-d47d84a12680")
    @Override
    public EList<PropertyDefinition> getTyped() {
        return new SmList<>(this, PropertyTypeData.Metadata.TypedDep());
    }

    @objid ("19ff0bd7-1036-4a6e-8ce0-d0ee28fc509b")
    @Override
    public <T extends PropertyDefinition> List<T> getTyped(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyDefinition element : getTyped()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8dccf485-ecfe-4218-8003-584129d5aa66")
    @Override
    public ModuleComponent getModuleOwner() {
        return (ModuleComponent) getDepVal(PropertyTypeData.Metadata.ModuleOwnerDep());
    }

    @objid ("00758b11-c8cf-4318-8cc5-c13834a93f33")
    @Override
    public void setModuleOwner(ModuleComponent value) {
        appendDepVal(PropertyTypeData.Metadata.ModuleOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("a8dd67da-8f27-4d74-916c-b36b7f2ad6eb")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTypeData.Metadata.AnalystOwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTypeData.Metadata.ModuleOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a8172c6d-76b8-49d0-94f7-71b74858ff1c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTypeData.Metadata.AnalystOwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyTypeData.Metadata.AnalystOwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PropertyTypeData.Metadata.ModuleOwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyTypeData.Metadata.ModuleOwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7e16b4cc-bb2c-441e-ad74-4cec41b634df")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyType(this);
        else
          return null;
    }

}
