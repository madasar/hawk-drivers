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
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0067251e-ec87-1098-b22e-001ec947cd2a")
public class PropertyTableDefinitionImpl extends ModelElementImpl implements PropertyTableDefinition {
    @objid ("19595df7-7e41-4fa0-9630-000050b91bd9")
    @Override
    public PropertyContainer getOwner() {
        return (PropertyContainer) getDepVal(PropertyTableDefinitionData.Metadata.OwnerDep());
    }

    @objid ("836788d5-1788-410b-a2a9-0846e0c45bb6")
    @Override
    public void setOwner(PropertyContainer value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("af9cdae4-bcd2-42dd-9857-f4d5116e97c4")
    @Override
    public EList<TypedPropertyTable> getTypedTable() {
        return new SmList<>(this, PropertyTableDefinitionData.Metadata.TypedTableDep());
    }

    @objid ("d578c166-2105-400d-b9f9-6eb4cd80ee0f")
    @Override
    public <T extends TypedPropertyTable> List<T> getTypedTable(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TypedPropertyTable element : getTypedTable()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b89074f2-6188-4eb0-9806-4ffed6b71f46")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep());
    }

    @objid ("c3bce45f-832c-4cf0-9f7d-534af213f19c")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("28fabbaa-3e03-450b-9b2c-1e9dec312a38")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep());
    }

    @objid ("3f7e1c04-a07e-4b50-bd8e-33d16aec56fd")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("f4025f40-fcc4-4a3c-addf-86dbf4699f91")
    @Override
    public EList<PropertyDefinition> getOwned() {
        return new SmList<>(this, PropertyTableDefinitionData.Metadata.OwnedDep());
    }

    @objid ("fd48e276-4f7e-4cc4-a050-888db242eae7")
    @Override
    public <T extends PropertyDefinition> List<T> getOwned(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyDefinition element : getOwned()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f42292f7-13c6-4f4d-a9da-d53bbb8aa634")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e271b800-9041-474e-9284-db736fb5562e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyTableDefinitionData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return new SmDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return new SmDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("232ad713-50c3-4faa-9cbb-d66ce09be0be")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTableDefinition(this);
        else
          return null;
    }

}
