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
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.data.analyst.GoalData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("760d4fa8-abc5-460f-898b-68d0f7d37134")
public class GoalImpl extends AnalystElementImpl implements Goal {
    @objid ("b5e26f4b-cd2f-419a-a868-ec3e6a85fb77")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedGoalVersion();
    }

    @objid ("02f9e32a-4617-429d-9174-c8b550a32032")
    @Override
    public AnalystElement getLastVersion() {
        return getLastGoalVersion();
    }

    @objid ("fceb6fde-e145-42ec-a39d-9401a4743249")
    @Override
    public EList<Goal> getSubGoal() {
        return new SmList<>(this, GoalData.Metadata.SubGoalDep());
    }

    @objid ("d6184194-e0f1-47a1-8493-e63ce178e1a6")
    @Override
    public <T extends Goal> List<T> getSubGoal(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Goal element : getSubGoal()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("77750fad-24a8-4cca-ad4f-7f4f90b76696")
    @Override
    public GoalContainer getOwnerContainer() {
        return (GoalContainer) getDepVal(GoalData.Metadata.OwnerContainerDep());
    }

    @objid ("f6c62cde-6798-411d-8c71-0c8df77f1edb")
    @Override
    public void setOwnerContainer(GoalContainer value) {
        appendDepVal(GoalData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("492b6d75-fe8a-4161-99a5-d6e93eaaa565")
    @Override
    public Goal getParentGoal() {
        return (Goal) getDepVal(GoalData.Metadata.ParentGoalDep());
    }

    @objid ("24fae837-5b92-4fd3-9daf-1e10aa8d33dd")
    @Override
    public void setParentGoal(Goal value) {
        appendDepVal(GoalData.Metadata.ParentGoalDep(), (SmObjectImpl)value);
    }

    @objid ("73a5798c-08e3-4f12-a868-1c8f6f5d62fa")
    @Override
    public Goal getLastGoalVersion() {
        return (Goal) getDepVal(GoalData.Metadata.LastGoalVersionDep());
    }

    @objid ("1926f4f3-3bb2-4ba5-b6e1-97b0f7412bd5")
    @Override
    public void setLastGoalVersion(Goal value) {
        appendDepVal(GoalData.Metadata.LastGoalVersionDep(), (SmObjectImpl)value);
    }

    @objid ("335d53d8-397c-4662-894e-c2278e6a4908")
    @Override
    public EList<Goal> getArchivedGoalVersion() {
        return new SmList<>(this, GoalData.Metadata.ArchivedGoalVersionDep());
    }

    @objid ("60211f78-af09-44d9-95ed-0002521fee56")
    @Override
    public <T extends Goal> List<T> getArchivedGoalVersion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Goal element : getArchivedGoalVersion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("99969bb0-fe84-4a0c-be11-3b25e3899e91")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.ParentGoalDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.LastGoalVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("50421234-0313-4024-96f8-1d926f9fb66a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(GoalData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.ParentGoalDep());
        if (obj != null)
          return new SmDepVal(GoalData.Metadata.ParentGoalDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.LastGoalVersionDep());
        if (obj != null)
          return new SmDepVal(GoalData.Metadata.LastGoalVersionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("eef1da2c-950b-4b1f-a342-bd59fe612ccf")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGoal(this);
        else
          return null;
    }

}
