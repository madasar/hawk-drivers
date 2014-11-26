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
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.data.analyst.GoalContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("3ab0ab80-0c60-4e6c-83f2-d2694ce30165")
public class GoalContainerImpl extends AnalystContainerImpl implements GoalContainer {
    @objid ("437d3c59-c6e2-4170-9579-9b522de59ec7")
    @Override
    public EList<Goal> getOwnedGoal() {
        return new SmList<>(this, GoalContainerData.Metadata.OwnedGoalDep());
    }

    @objid ("bbda2ab6-1353-4789-8f3c-780e3056032e")
    @Override
    public <T extends Goal> List<T> getOwnedGoal(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Goal element : getOwnedGoal()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("20792808-8097-413a-8b1b-dce11b82cbd5")
    @Override
    public GoalContainer getOwnerContainer() {
        return (GoalContainer) getDepVal(GoalContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("70226e4e-780f-474f-b811-395136f06b90")
    @Override
    public void setOwnerContainer(GoalContainer value) {
        appendDepVal(GoalContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("4e224990-3108-4a75-905b-1a7dbce0d69f")
    @Override
    public EList<GoalContainer> getOwnedContainer() {
        return new SmList<>(this, GoalContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("0e0fa436-3085-4edd-8bab-97ea537ab059")
    @Override
    public <T extends GoalContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GoalContainer element : getOwnedContainer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6107771c-db12-4c2b-a807-0bbbd0d7ac62")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(GoalContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("a694f15a-dda8-4b8c-b41c-76fcd5679e61")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(GoalContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("8506b104-ec56-4826-89cc-2781f6784ecb")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GoalContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GoalContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c9993ea5-8957-46a3-8e8e-b5d2756ec48b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GoalContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(GoalContainerData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GoalContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(GoalContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b3312327-6f03-4b35-8920-97fcd4c33a5a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGoalContainer(this);
        else
          return null;
    }

}
