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
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.data.analyst.RequirementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("6beac79a-2be8-48f3-a776-0b680b64164a")
public class RequirementImpl extends AnalystElementImpl implements Requirement {
    @objid ("d11678c4-158c-4606-9ef8-055602d0384b")
    @Override
    public AnalystElement getLastVersion() {
        return getLastRequirementVersion();
    }

    @objid ("e0d0f56f-6b6c-4906-877e-ae083c7e16b7")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedRequirementVersion();
    }

    @objid ("c60424df-722d-4c72-a1c7-ee65609ad5b9")
    @Override
    public EList<Requirement> getSubRequirement() {
        return new SmList<>(this, RequirementData.Metadata.SubRequirementDep());
    }

    @objid ("192c70da-fd68-443f-8c4b-cbc6edf39be7")
    @Override
    public <T extends Requirement> List<T> getSubRequirement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Requirement element : getSubRequirement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b8cbfcb6-7c24-45fd-94d4-133687aa5d60")
    @Override
    public RequirementContainer getOwnerContainer() {
        return (RequirementContainer) getDepVal(RequirementData.Metadata.OwnerContainerDep());
    }

    @objid ("2d30ee41-1511-45d8-832c-a912ec3568ff")
    @Override
    public void setOwnerContainer(RequirementContainer value) {
        appendDepVal(RequirementData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("65a0859e-9a7f-4781-9398-41fe387f7bff")
    @Override
    public Requirement getParentRequirement() {
        return (Requirement) getDepVal(RequirementData.Metadata.ParentRequirementDep());
    }

    @objid ("699733c7-aea1-4b1c-8c00-ecada3ed2096")
    @Override
    public void setParentRequirement(Requirement value) {
        appendDepVal(RequirementData.Metadata.ParentRequirementDep(), (SmObjectImpl)value);
    }

    @objid ("e6ec2138-f879-4463-90ee-846f74e2c0d7")
    @Override
    public EList<Requirement> getArchivedRequirementVersion() {
        return new SmList<>(this, RequirementData.Metadata.ArchivedRequirementVersionDep());
    }

    @objid ("2f32370e-f4c4-46f3-8ae1-f10d1bde4fcd")
    @Override
    public <T extends Requirement> List<T> getArchivedRequirementVersion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Requirement element : getArchivedRequirementVersion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fd242426-c29b-4afb-b5fe-b5da3e0d3921")
    @Override
    public Requirement getLastRequirementVersion() {
        return (Requirement) getDepVal(RequirementData.Metadata.LastRequirementVersionDep());
    }

    @objid ("5b967040-61d3-4586-a8c4-c0fa84a44385")
    @Override
    public void setLastRequirementVersion(Requirement value) {
        appendDepVal(RequirementData.Metadata.LastRequirementVersionDep(), (SmObjectImpl)value);
    }

    @objid ("01cdbc5c-2937-4f0a-96eb-234ec8ecc45e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.ParentRequirementDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.LastRequirementVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("fed61d4d-a75e-4975-997d-6dce1cbd5e8e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(RequirementData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.ParentRequirementDep());
        if (obj != null)
          return new SmDepVal(RequirementData.Metadata.ParentRequirementDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.LastRequirementVersionDep());
        if (obj != null)
          return new SmDepVal(RequirementData.Metadata.LastRequirementVersionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("392cc4af-0c4a-4c88-aafd-80d5670d8f60")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequirement(this);
        else
          return null;
    }

}
