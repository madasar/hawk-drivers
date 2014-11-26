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
package org.modelio.metamodel.impl.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00749e92-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnLaneImpl extends BpmnBaseElementImpl implements BpmnLane {
    @objid ("5e2d0445-0f93-49bb-a3a0-4d9445a46d85")
    @Override
    public BpmnLaneSet getChildLaneSet() {
        return (BpmnLaneSet) getDepVal(BpmnLaneData.Metadata.ChildLaneSetDep());
    }

    @objid ("9442cddb-b0f9-468c-93ea-a01e97b97aa1")
    @Override
    public void setChildLaneSet(BpmnLaneSet value) {
        appendDepVal(BpmnLaneData.Metadata.ChildLaneSetDep(), (SmObjectImpl)value);
    }

    @objid ("53369256-0689-49a0-8d5e-f47f22f69471")
    @Override
    public ModelElement getPartitionElement() {
        return (ModelElement) getDepVal(BpmnLaneData.Metadata.PartitionElementDep());
    }

    @objid ("f36ec3f0-826a-45c6-99ee-67623782cc9d")
    @Override
    public void setPartitionElement(ModelElement value) {
        appendDepVal(BpmnLaneData.Metadata.PartitionElementDep(), (SmObjectImpl)value);
    }

    @objid ("027bac6c-a21f-43ca-8000-dec961c2adcd")
    @Override
    public EList<BpmnFlowElement> getFlowElementRef() {
        return new SmList<>(this, BpmnLaneData.Metadata.FlowElementRefDep());
    }

    @objid ("8d8eeb36-97a9-4e3b-8dbb-0232ae93fc37")
    @Override
    public <T extends BpmnFlowElement> List<T> getFlowElementRef(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnFlowElement element : getFlowElementRef()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("80f434f5-d48a-4d3a-a541-59a324d7740f")
    @Override
    public BpmnLaneSet getLaneSet() {
        return (BpmnLaneSet) getDepVal(BpmnLaneData.Metadata.LaneSetDep());
    }

    @objid ("980d047f-c6c6-47d3-8658-80c2744e4e66")
    @Override
    public void setLaneSet(BpmnLaneSet value) {
        appendDepVal(BpmnLaneData.Metadata.LaneSetDep(), (SmObjectImpl)value);
    }

    @objid ("77a2281a-a127-4bce-a4b1-46abccd246e8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneData.Metadata.LaneSetDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3d9b68b2-e3a9-45b2-a5e3-c8fcc5294301")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneData.Metadata.LaneSetDep());
        if (obj != null)
          return new SmDepVal(BpmnLaneData.Metadata.LaneSetDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("549ca68d-5029-4469-92e2-5ff9ee051da4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLane(this);
        else
          return null;
    }

}
