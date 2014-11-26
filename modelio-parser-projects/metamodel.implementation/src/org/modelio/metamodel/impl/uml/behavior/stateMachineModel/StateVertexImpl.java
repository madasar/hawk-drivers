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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateVertexData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0054c0ea-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class StateVertexImpl extends ModelElementImpl implements StateVertex {
    @objid ("07c3442f-87dc-44a4-84b6-fdb76802462e")
    @Override
    public EList<Transition> getOutGoing() {
        return new SmList<>(this, StateVertexData.Metadata.OutGoingDep());
    }

    @objid ("67580a32-6cc3-4ee1-816c-2dee5e747870")
    @Override
    public <T extends Transition> List<T> getOutGoing(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getOutGoing()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("76b70060-d696-45e0-8487-c5b10e02b08d")
    @Override
    public EList<Transition> getIncoming() {
        return new SmList<>(this, StateVertexData.Metadata.IncomingDep());
    }

    @objid ("01d1b57a-62e4-43b2-ad0c-cf5bdb22a536")
    @Override
    public <T extends Transition> List<T> getIncoming(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getIncoming()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5a7fff64-8d07-4c63-851e-d8f1ce271855")
    @Override
    public Region getParent() {
        return (Region) getDepVal(StateVertexData.Metadata.ParentDep());
    }

    @objid ("273b0d19-d988-4383-b1b8-57952f1c27aa")
    @Override
    public void setParent(Region value) {
        appendDepVal(StateVertexData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("10ecc4fa-190c-4196-b0a7-733ec3c40e2f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StateVertexData.Metadata.ParentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7c8c7e52-9fc5-46f9-a5ad-157137d40530")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StateVertexData.Metadata.ParentDep());
        if (obj != null)
          return new SmDepVal(StateVertexData.Metadata.ParentDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("6b5d7826-c337-4675-a984-3b97063f86c6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateVertex(this);
        else
          return null;
    }

}
