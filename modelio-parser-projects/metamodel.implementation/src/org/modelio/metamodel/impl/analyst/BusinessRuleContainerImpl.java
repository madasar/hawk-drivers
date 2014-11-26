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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.data.analyst.BusinessRuleContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("c569fea9-fad8-4e72-ac57-6326c88e45b6")
public class BusinessRuleContainerImpl extends AnalystContainerImpl implements BusinessRuleContainer {
    @objid ("311bff0d-6f89-4e7e-9a78-6f4e7058ad87")
    @Override
    public EList<BusinessRule> getOwnedRule() {
        return new SmList<>(this, BusinessRuleContainerData.Metadata.OwnedRuleDep());
    }

    @objid ("e5f52152-9eb8-483e-969f-5a30401ebdd7")
    @Override
    public <T extends BusinessRule> List<T> getOwnedRule(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BusinessRule element : getOwnedRule()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("62719416-f05d-402c-a272-ed8556793a3d")
    @Override
    public BusinessRuleContainer getOwnerContainer() {
        return (BusinessRuleContainer) getDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("edc4edda-b470-4620-844d-13e3a9da3bc1")
    @Override
    public void setOwnerContainer(BusinessRuleContainer value) {
        appendDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("a47606de-844f-4f70-9904-e1dce5f3c383")
    @Override
    public EList<BusinessRuleContainer> getOwnedContainer() {
        return new SmList<>(this, BusinessRuleContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("279002f4-3fc9-45ee-9a69-d8b2d81b47bf")
    @Override
    public <T extends BusinessRuleContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BusinessRuleContainer element : getOwnedContainer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c344eea3-0ca3-4ce8-a912-d085c494e719")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("957b4d09-245e-4608-8f7d-c7fe4a90c7a6")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("21a883ec-f513-48af-9ed3-de09beb0f30b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("cf00704a-02c3-4610-b457-0e0014db6c30")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c8bc2df3-48ce-47b8-891e-c034c6c8e73e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBusinessRuleContainer(this);
        else
          return null;
    }

}
