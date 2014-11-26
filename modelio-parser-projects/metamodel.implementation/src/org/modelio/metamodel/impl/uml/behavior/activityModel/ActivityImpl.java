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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00263040-c4bf-1fd8-97fe-001ec947cd2a")
public class ActivityImpl extends BehaviorImpl implements Activity {
    @objid ("2eb250db-222f-4956-b1a1-3e827c938e02")
    @Override
    public boolean isIsSingleExecution() {
        return (Boolean) getAttVal(ActivityData.Metadata.IsSingleExecutionAtt());
    }

    @objid ("0c2937b6-ba2b-43ca-bb58-fc86f49d9367")
    @Override
    public void setIsSingleExecution(boolean value) {
        setAttVal(ActivityData.Metadata.IsSingleExecutionAtt(), value);
    }

    @objid ("2562a2de-7aa5-4669-8f08-58d9725656f3")
    @Override
    public boolean isIsReadOnly() {
        return (Boolean) getAttVal(ActivityData.Metadata.IsReadOnlyAtt());
    }

    @objid ("550e406c-9597-4c59-b395-785af9444e8e")
    @Override
    public void setIsReadOnly(boolean value) {
        setAttVal(ActivityData.Metadata.IsReadOnlyAtt(), value);
    }

    @objid ("60fce3a7-785f-4698-adb2-7bbfe61ae256")
    @Override
    public EList<ActivityGroup> getOwnedGroup() {
        return new SmList<>(this, ActivityData.Metadata.OwnedGroupDep());
    }

    @objid ("ffaa4d04-b4a0-4fd4-b0d0-86b49a3f0f37")
    @Override
    public <T extends ActivityGroup> List<T> getOwnedGroup(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityGroup element : getOwnedGroup()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fb158262-12fb-4041-88f5-9a97950fb82f")
    @Override
    public EList<ActivityNode> getOwnedNode() {
        return new SmList<>(this, ActivityData.Metadata.OwnedNodeDep());
    }

    @objid ("2fefa627-effc-4e62-99b7-652e1b1e5934")
    @Override
    public <T extends ActivityNode> List<T> getOwnedNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityNode element : getOwnedNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2cb1f72d-8d7a-4865-b2e0-2b0336095e5c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("0272a96f-c68e-4f13-9ed5-9ea718828b0e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("c83b1f63-2951-4d29-bd6d-1a3b8d331928")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivity(this);
        else
          return null;
    }

}
