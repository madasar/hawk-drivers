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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorParameterData;
import org.modelio.metamodel.impl.uml.statik.ParameterImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00413f3e-c4bf-1fd8-97fe-001ec947cd2a")
public class BehaviorParameterImpl extends ParameterImpl implements BehaviorParameter {
    @objid ("e167db46-4dae-447b-8fd5-d15a2c2a279e")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, BehaviorParameterData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("13746046-26b5-4455-9e1e-e327a9bfa1cc")
    @Override
    public <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ObjectNode element : getRepresentingObjectNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bbe475ab-92fa-47cb-9131-ff910f294191")
    @Override
    public Behavior getOwner() {
        return (Behavior) getDepVal(BehaviorParameterData.Metadata.OwnerDep());
    }

    @objid ("93949a87-0db1-4ddf-b753-b29806866242")
    @Override
    public void setOwner(Behavior value) {
        appendDepVal(BehaviorParameterData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("bc03f0a2-4342-4078-9e96-9b6b12b0f0ff")
    @Override
    public Parameter getMapped() {
        return (Parameter) getDepVal(BehaviorParameterData.Metadata.MappedDep());
    }

    @objid ("cd4764dd-aca5-4ea9-a445-878edb6f12eb")
    @Override
    public void setMapped(Parameter value) {
        appendDepVal(BehaviorParameterData.Metadata.MappedDep(), (SmObjectImpl)value);
    }

    @objid ("09528deb-8da6-4a8e-8eb5-fe2a7b0ff670")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorParameterData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a8e7512f-4e5d-41b7-b2a3-bb59180f574c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorParameterData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BehaviorParameterData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("36441107-dcb4-4af7-a1dc-845c665ac5f5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBehaviorParameter(this);
        else
          return null;
    }

}
