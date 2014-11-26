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
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.data.analyst.GenericAnalystContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("2dcbabc7-1ffe-4eae-a040-8300156dfdc3")
public class GenericAnalystContainerImpl extends AnalystContainerImpl implements GenericAnalystContainer {
    @objid ("06885266-1266-4c24-98eb-ed86cc4d6a2e")
    @Override
    public EList<GenericAnalystElement> getOwnedElement() {
        return new SmList<>(this, GenericAnalystContainerData.Metadata.OwnedElementDep());
    }

    @objid ("60634c23-d2e8-4d42-a4a9-2fb8ae200c6f")
    @Override
    public <T extends GenericAnalystElement> List<T> getOwnedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GenericAnalystElement element : getOwnedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e5fe87c8-172b-461d-9f20-27ded244c725")
    @Override
    public GenericAnalystContainer getOwnerContainer() {
        return (GenericAnalystContainer) getDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("60dd3dee-f9db-4ae6-a00d-afe113edd482")
    @Override
    public void setOwnerContainer(GenericAnalystContainer value) {
        appendDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("0dd2994f-471b-460b-9b7a-f7d1fd0867b1")
    @Override
    public EList<GenericAnalystContainer> getOwnedContainer() {
        return new SmList<>(this, GenericAnalystContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("76ccb818-9242-420b-aac9-b0af6a83d5a3")
    @Override
    public <T extends GenericAnalystContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GenericAnalystContainer element : getOwnedContainer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1a67e989-a356-4294-8107-ad318f572c60")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("60c13ebb-7d2e-4565-a51e-17b46ea61427")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("0916bb76-daf3-4b3b-87c7-56d96cd8bfa7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("71588031-dcc6-4cb2-b2fb-22d6d3cfee98")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("09afe74f-800a-471b-b5e5-81c545f35523")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGenericAnalystContainer(this);
        else
          return null;
    }

}
