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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
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

@objid ("0064a19a-ec87-1098-b22e-001ec947cd2a")
public class PropertyDefinitionImpl extends ModelElementImpl implements PropertyDefinition {
    @objid ("0a92fffd-86d3-4cf2-9a68-43aade1393ea")
    @Override
    public boolean isIsEditable() {
        return (Boolean) getAttVal(PropertyDefinitionData.Metadata.IsEditableAtt());
    }

    @objid ("f230d316-fc33-4940-aae1-07390abf7feb")
    @Override
    public void setIsEditable(boolean value) {
        setAttVal(PropertyDefinitionData.Metadata.IsEditableAtt(), value);
    }

    @objid ("96b0d047-d35d-4d14-9e6f-87a82cff426b")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(PropertyDefinitionData.Metadata.DefaultValueAtt());
    }

    @objid ("1861ac03-9128-4c4b-a648-777aa86897b4")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(PropertyDefinitionData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("774b4992-cb12-443f-a371-9de589aa2afe")
    @Override
    public PropertyType getType() {
        return (PropertyType) getDepVal(PropertyDefinitionData.Metadata.TypeDep());
    }

    @objid ("14e4d8ba-2d32-4509-aabc-f5af2d2667ef")
    @Override
    public void setType(PropertyType value) {
        appendDepVal(PropertyDefinitionData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("2a58b28b-e0d7-4d28-bf55-32cb823bce59")
    @Override
    public PropertyTableDefinition getOwner() {
        return (PropertyTableDefinition) getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
    }

    @objid ("f3958b04-2799-458f-85cb-41a794c72fde")
    @Override
    public void setOwner(PropertyTableDefinition value) {
        appendDepVal(PropertyDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("024ab184-b6ce-45b9-a6bf-c50d9da35a7d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("faac015a-3fea-4fe7-a903-b0e51344dd90")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("25d6ab34-2af3-4941-8b15-b564c4875847")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyDefinition(this);
        else
          return null;
    }

}
