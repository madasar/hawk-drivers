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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.CollaborationData;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00041fdc-c4bf-1fd8-97fe-001ec947cd2a")
public class CollaborationImpl extends NameSpaceImpl implements Collaboration {
    @objid ("ea50913b-49a3-4123-8d98-aad6df1798cb")
    @Override
    public boolean isIsConcurrent() {
        return (Boolean) getAttVal(CollaborationData.Metadata.IsConcurrentAtt());
    }

    @objid ("7e1ff7e7-cd2b-479e-a7bf-5c3800301a42")
    @Override
    public void setIsConcurrent(boolean value) {
        setAttVal(CollaborationData.Metadata.IsConcurrentAtt(), value);
    }

    @objid ("9a6e3bdf-b9cf-47b7-8d5f-bb9ab74caeb8")
    @Override
    public Operation getORepresented() {
        return (Operation) getDepVal(CollaborationData.Metadata.ORepresentedDep());
    }

    @objid ("0759c333-d1b0-46f0-88f9-ed33b4a17373")
    @Override
    public void setORepresented(Operation value) {
        appendDepVal(CollaborationData.Metadata.ORepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("0e29257c-5920-4d42-92de-3e83a3bd12d0")
    @Override
    public Behavior getBRepresented() {
        return (Behavior) getDepVal(CollaborationData.Metadata.BRepresentedDep());
    }

    @objid ("e2a3e438-ade7-4a3d-99ca-06f66554b19c")
    @Override
    public void setBRepresented(Behavior value) {
        appendDepVal(CollaborationData.Metadata.BRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("2fcdb6ef-06e0-4a61-83dd-a920963abb04")
    @Override
    public EList<CollaborationUse> getOccurrence() {
        return new SmList<>(this, CollaborationData.Metadata.OccurrenceDep());
    }

    @objid ("8810f689-66e7-4893-9587-11cb469cd129")
    @Override
    public <T extends CollaborationUse> List<T> getOccurrence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CollaborationUse element : getOccurrence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c56d4ff5-544d-4dfd-ba02-de4941fe0a52")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationData.Metadata.ORepresentedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationData.Metadata.BRepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e52fcd02-2b39-4cd6-bb14-4cbf9def35aa")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationData.Metadata.ORepresentedDep());
        if (obj != null)
          return new SmDepVal(CollaborationData.Metadata.ORepresentedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(CollaborationData.Metadata.BRepresentedDep());
        if (obj != null)
          return new SmDepVal(CollaborationData.Metadata.BRepresentedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("755b93a4-72a5-4f57-b6bc-894db5fc7804")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCollaboration(this);
        else
          return null;
    }

}
