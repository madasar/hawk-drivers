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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.data.analyst.PropertyContainerData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00630880-c4bf-1fd8-97fe-001ec947cd2a")
public class PropertyContainerImpl extends ModelElementImpl implements PropertyContainer {
    @objid ("73f3ec01-fe2b-4c65-a42a-f4dcc3c35058")
    @Override
    public EList<PropertyTableDefinition> getDefinedTable() {
        return new SmList<>(this, PropertyContainerData.Metadata.DefinedTableDep());
    }

    @objid ("08c12e2d-f6b4-4033-add5-be5523d54939")
    @Override
    public <T extends PropertyTableDefinition> List<T> getDefinedTable(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyTableDefinition element : getDefinedTable()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("47119060-1d5b-4d2e-9d8d-9dd392596c27")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("9c084362-4969-47d5-9301-46c327d2dc06")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(PropertyContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("c338f2af-e0ff-412f-ba03-a92100a68a19")
    @Override
    public EList<PropertyType> getDefinedType() {
        return new SmList<>(this, PropertyContainerData.Metadata.DefinedTypeDep());
    }

    @objid ("373524ca-265d-437d-813e-68f459890fd5")
    @Override
    public <T extends PropertyType> List<T> getDefinedType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyType element : getDefinedType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1b8613c8-62cd-4243-ad53-f35d3ffb78fe")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6d58af2d-4f27-4d19-afc5-beef7b1e3672")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(PropertyContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("fe58f800-3290-458f-aad9-9dd84d0f3504")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyContainer(this);
        else
          return null;
    }

}
