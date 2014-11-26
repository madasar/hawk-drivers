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
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.data.analyst.GenericAnalystElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("72a02698-fa7a-4f9d-af4c-5e7338f0ba44")
public class GenericAnalystElementImpl extends AnalystElementImpl implements GenericAnalystElement {
    @objid ("d233d1f6-7195-4412-ad3e-d9943a5acefb")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedElementVersion();
    }

    @objid ("5b2c6227-f20f-4231-9d1e-d63fa8394ee4")
    @Override
    public AnalystElement getLastVersion() {
        return getLastElementVersion();
    }

    @objid ("d66e9e52-de31-4668-8a97-5e91df414302")
    @Override
    public EList<GenericAnalystElement> getSubElement() {
        return new SmList<>(this, GenericAnalystElementData.Metadata.SubElementDep());
    }

    @objid ("bb437024-9d3a-437c-9fbb-f32aa2c52810")
    @Override
    public <T extends GenericAnalystElement> List<T> getSubElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GenericAnalystElement element : getSubElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f72af975-1397-47cb-a9ca-b550abdf0f46")
    @Override
    public GenericAnalystContainer getOwnerContainer() {
        return (GenericAnalystContainer) getDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep());
    }

    @objid ("062e7523-c565-4964-920c-4d39fad3cac9")
    @Override
    public void setOwnerContainer(GenericAnalystContainer value) {
        appendDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("d58ed5ee-b195-4e34-a411-fe6d7d45c0b3")
    @Override
    public GenericAnalystElement getParentElement() {
        return (GenericAnalystElement) getDepVal(GenericAnalystElementData.Metadata.ParentElementDep());
    }

    @objid ("35db92cb-d72b-494d-a6c6-8184e6c66633")
    @Override
    public void setParentElement(GenericAnalystElement value) {
        appendDepVal(GenericAnalystElementData.Metadata.ParentElementDep(), (SmObjectImpl)value);
    }

    @objid ("e76368ca-6c2e-44aa-a067-bcf7b4cf08a6")
    @Override
    public GenericAnalystElement getLastElementVersion() {
        return (GenericAnalystElement) getDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep());
    }

    @objid ("09aac9cb-2d2c-453b-95f9-a1db6b31ead5")
    @Override
    public void setLastElementVersion(GenericAnalystElement value) {
        appendDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep(), (SmObjectImpl)value);
    }

    @objid ("72e85161-9789-422f-baaf-3f9059972943")
    @Override
    public EList<GenericAnalystElement> getArchivedElementVersion() {
        return new SmList<>(this, GenericAnalystElementData.Metadata.ArchivedElementVersionDep());
    }

    @objid ("97edf8f0-a461-4227-ba97-133b021a194e")
    @Override
    public <T extends GenericAnalystElement> List<T> getArchivedElementVersion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GenericAnalystElement element : getArchivedElementVersion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e9f62864-1db1-42a5-916b-754020c738e2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.ParentElementDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("97c7ca68-568b-4a0b-9b01-6bfcbfb65ccd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.ParentElementDep());
        if (obj != null)
          return new SmDepVal(GenericAnalystElementData.Metadata.ParentElementDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep());
        if (obj != null)
          return new SmDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("eef52d78-fbfa-4e99-9dd9-b00fc5babce1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGenericAnalystElement(this);
        else
          return null;
    }

}
