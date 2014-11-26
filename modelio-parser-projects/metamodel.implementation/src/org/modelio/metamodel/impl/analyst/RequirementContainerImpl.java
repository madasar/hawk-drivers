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
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.data.analyst.RequirementContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("41b13368-1afd-46b7-a5b0-17463a4f640a")
public class RequirementContainerImpl extends AnalystContainerImpl implements RequirementContainer {
    @objid ("e6e96ce1-7d29-4ac1-9fbf-8f794c2cac4f")
    @Override
    public EList<Requirement> getOwnedRequirement() {
        return new SmList<>(this, RequirementContainerData.Metadata.OwnedRequirementDep());
    }

    @objid ("31df0e70-92ce-43f8-b681-d4869f352fef")
    @Override
    public <T extends Requirement> List<T> getOwnedRequirement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Requirement element : getOwnedRequirement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("610a0e48-70ae-4914-9cea-0c8795a728a7")
    @Override
    public RequirementContainer getOwnerContainer() {
        return (RequirementContainer) getDepVal(RequirementContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("dc33af1d-8917-4f34-a169-f592d53e85ba")
    @Override
    public void setOwnerContainer(RequirementContainer value) {
        appendDepVal(RequirementContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("6734f653-3a34-4880-950d-68ab271936f5")
    @Override
    public EList<RequirementContainer> getOwnedContainer() {
        return new SmList<>(this, RequirementContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("d725ac98-3d44-48c2-8228-5c7f585a4170")
    @Override
    public <T extends RequirementContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RequirementContainer element : getOwnedContainer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("10f86f73-586e-432f-bb97-10db04984abb")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(RequirementContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("ec9f3325-d006-4aa5-b40b-6d6bcbd1f2a9")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(RequirementContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("7a38cce5-cd0d-42d1-8660-bbae989ba82d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("14aa292f-3003-4e34-a366-3e40bcad08af")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(RequirementContainerData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(RequirementContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(RequirementContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bc0ceae6-9225-4cf0-b902-c408314f83b8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequirementContainer(this);
        else
          return null;
    }

}
