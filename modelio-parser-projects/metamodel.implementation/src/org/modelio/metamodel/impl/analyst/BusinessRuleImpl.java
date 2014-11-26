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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.data.analyst.BusinessRuleData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("ae140aec-516f-4136-b9e7-def1d1a327ec")
public class BusinessRuleImpl extends AnalystElementImpl implements BusinessRule {
    @objid ("c345cb1d-864f-4e35-ad5a-082c13c66c0c")
    @Override
    public AnalystElement getLastVersion() {
        return getLastRuleVersion();
    }

    @objid ("639b83a4-95b1-465c-a5db-de9b091c1dee")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedRuleVersion();
    }

    @objid ("de7612d7-e104-4786-87eb-63868de4af2c")
    @Override
    public EList<BusinessRule> getSubRule() {
        return new SmList<>(this, BusinessRuleData.Metadata.SubRuleDep());
    }

    @objid ("811291db-656d-472c-9e41-5481050fb6ae")
    @Override
    public <T extends BusinessRule> List<T> getSubRule(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BusinessRule element : getSubRule()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("21ac3495-1bf1-423f-af13-52e52bcd2db2")
    @Override
    public BusinessRuleContainer getOwnerContainer() {
        return (BusinessRuleContainer) getDepVal(BusinessRuleData.Metadata.OwnerContainerDep());
    }

    @objid ("97df955d-2ff2-45c2-b05c-9f08785ee71d")
    @Override
    public void setOwnerContainer(BusinessRuleContainer value) {
        appendDepVal(BusinessRuleData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("378b1ed5-45d6-42bb-a3b3-aa0410e84d7b")
    @Override
    public BusinessRule getParentRule() {
        return (BusinessRule) getDepVal(BusinessRuleData.Metadata.ParentRuleDep());
    }

    @objid ("540d1e4f-0df5-4a5d-a2f0-0da69dad1a02")
    @Override
    public void setParentRule(BusinessRule value) {
        appendDepVal(BusinessRuleData.Metadata.ParentRuleDep(), (SmObjectImpl)value);
    }

    @objid ("9b869adf-3f2c-40df-9664-d99da72db873")
    @Override
    public BusinessRule getLastRuleVersion() {
        return (BusinessRule) getDepVal(BusinessRuleData.Metadata.LastRuleVersionDep());
    }

    @objid ("2b5abedf-36c2-4341-bc72-21dae6916a6c")
    @Override
    public void setLastRuleVersion(BusinessRule value) {
        appendDepVal(BusinessRuleData.Metadata.LastRuleVersionDep(), (SmObjectImpl)value);
    }

    @objid ("dd2f1829-fef2-4113-9e29-b5f43db1292d")
    @Override
    public EList<BusinessRule> getArchivedRuleVersion() {
        return new SmList<>(this, BusinessRuleData.Metadata.ArchivedRuleVersionDep());
    }

    @objid ("eaaaa008-1ccc-462c-a616-9b7efa6dc222")
    @Override
    public <T extends BusinessRule> List<T> getArchivedRuleVersion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BusinessRule element : getArchivedRuleVersion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7df1fac2-c699-455f-8c80-a72e258380cf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.ParentRuleDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.LastRuleVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b4c8f594-3ddf-405c-ba0b-10b5e01b073d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.ParentRuleDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleData.Metadata.ParentRuleDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.LastRuleVersionDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleData.Metadata.LastRuleVersionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7f081d1b-868b-45b6-9d30-bf73a648aa3e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBusinessRule(this);
        else
          return null;
    }

}
