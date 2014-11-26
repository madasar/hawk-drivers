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
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.RegionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0057164c-c4bf-1fd8-97fe-001ec947cd2a")
public class RegionImpl extends ModelElementImpl implements Region {
    @objid ("6818159b-32e1-4551-b1b7-32a3100bc75d")
    @Override
    public State getParent() {
        return (State) getDepVal(RegionData.Metadata.ParentDep());
    }

    @objid ("084cd6b9-8e06-4f5c-adcc-334389a342dc")
    @Override
    public void setParent(State value) {
        appendDepVal(RegionData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("b4b55aca-4717-4d7e-ab08-1ede61d2fd1c")
    @Override
    public StateMachine getRepresented() {
        return (StateMachine) getDepVal(RegionData.Metadata.RepresentedDep());
    }

    @objid ("bad91afc-ff43-4605-a2b6-7093c5ce698f")
    @Override
    public void setRepresented(StateMachine value) {
        appendDepVal(RegionData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("c29b38f4-1f46-480e-be98-022ec8fccaff")
    @Override
    public EList<StateVertex> getSub() {
        return new SmList<>(this, RegionData.Metadata.SubDep());
    }

    @objid ("4ddfcad7-776f-49d8-a326-2eb1d5b47b48")
    @Override
    public <T extends StateVertex> List<T> getSub(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final StateVertex element : getSub()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3d1e0cf4-41f4-4bc3-86a0-af2d757f7875")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RegionData.Metadata.ParentDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(RegionData.Metadata.RepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f522103e-d0ba-42b2-b304-5d0b47cdf42d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RegionData.Metadata.ParentDep());
        if (obj != null)
          return new SmDepVal(RegionData.Metadata.ParentDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(RegionData.Metadata.RepresentedDep());
        if (obj != null)
          return new SmDepVal(RegionData.Metadata.RepresentedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0c2bf36b-76b6-47b0-83bd-c6bfc7be0684")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRegion(this);
        else
          return null;
    }

}
