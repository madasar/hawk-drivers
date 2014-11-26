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
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0061e540-c4bf-1fd8-97fe-001ec947cd2a")
public class AnalystProjectImpl extends ModelElementImpl implements AnalystProject {
    @objid ("ed98be99-9994-479b-b74c-5767677f89cf")
    @Override
    public PropertyContainer getPropertyRoot() {
        return (PropertyContainer) getDepVal(AnalystProjectData.Metadata.PropertyRootDep());
    }

    @objid ("a9b201cd-ef24-417d-94fc-d0fa4581befd")
    @Override
    public void setPropertyRoot(PropertyContainer value) {
        appendDepVal(AnalystProjectData.Metadata.PropertyRootDep(), (SmObjectImpl)value);
    }

    @objid ("2f11356b-2fa1-4346-a83e-3e62fd0c5e7a")
    @Override
    public EList<GoalContainer> getGoalRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.GoalRootDep());
    }

    @objid ("be3cd6c4-81a5-4fab-8d70-1fe6441d707e")
    @Override
    public <T extends GoalContainer> List<T> getGoalRoot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GoalContainer element : getGoalRoot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1d3786e3-ef77-4a81-90f8-98e333b0f530")
    @Override
    public EList<BusinessRuleContainer> getBusinessRuleRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.BusinessRuleRootDep());
    }

    @objid ("0d9ff951-057f-49a6-8e4c-6e7bb2db07a2")
    @Override
    public <T extends BusinessRuleContainer> List<T> getBusinessRuleRoot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BusinessRuleContainer element : getBusinessRuleRoot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("36806efc-d680-4568-9c0b-13b42bd1a4e1")
    @Override
    public EList<Dictionary> getDictionaryRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.DictionaryRootDep());
    }

    @objid ("e2a5eb04-9674-453c-a6b4-661331a1394e")
    @Override
    public <T extends Dictionary> List<T> getDictionaryRoot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Dictionary element : getDictionaryRoot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b0af5da9-0b76-48ca-8a01-2bd596e7474a")
    @Override
    public EList<RequirementContainer> getRequirementRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.RequirementRootDep());
    }

    @objid ("83a5df9f-db97-4fd3-94ed-8ca5e389a2e2")
    @Override
    public <T extends RequirementContainer> List<T> getRequirementRoot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RequirementContainer element : getRequirementRoot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5097a407-69d1-44cd-9344-5b1286d0e09c")
    @Override
    public EList<GenericAnalystContainer> getGenericRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.GenericRootDep());
    }

    @objid ("0930ffa5-9abf-43c0-bebe-72e03f21edeb")
    @Override
    public <T extends GenericAnalystContainer> List<T> getGenericRoot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GenericAnalystContainer element : getGenericRoot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("61e143fc-9d12-4ebc-8c00-2d180d38b6c7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("edbfaf75-a521-4749-b47c-0033f7f27028")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("657004e2-ad32-4b95-b012-747632ebe7cf")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystProject(this);
        else
          return null;
    }

}
