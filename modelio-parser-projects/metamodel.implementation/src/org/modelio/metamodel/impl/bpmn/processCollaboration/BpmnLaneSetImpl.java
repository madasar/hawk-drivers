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
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneSetData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0075254c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnLaneSetImpl extends BpmnBaseElementImpl implements BpmnLaneSet {
    @objid ("f3db1557-e4bd-4c91-8858-9a44ee41f204")
    @Override
    public EList<BpmnLane> getLane() {
        return new SmList<>(this, BpmnLaneSetData.Metadata.LaneDep());
    }

    @objid ("836491d1-1a08-48c5-85dc-df11bb31bfd3")
    @Override
    public <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnLane element : getLane()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fb07bafc-5d5f-4fa9-8781-828ff026a300")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnLaneSetData.Metadata.ProcessDep());
    }

    @objid ("edcc07eb-a7e9-4daf-9547-bc8aaf85eb20")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnLaneSetData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("e2dbf72a-1a34-4eb6-b446-12d817cca1aa")
    @Override
    public BpmnLane getParentLane() {
        return (BpmnLane) getDepVal(BpmnLaneSetData.Metadata.ParentLaneDep());
    }

    @objid ("10e96148-7da9-44ee-9031-c1736382f819")
    @Override
    public void setParentLane(BpmnLane value) {
        appendDepVal(BpmnLaneSetData.Metadata.ParentLaneDep(), (SmObjectImpl)value);
    }

    @objid ("78374361-b8b9-4fa5-98ca-c939df3e4917")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnLaneSetData.Metadata.SubProcessDep());
    }

    @objid ("a8cec213-f7af-428c-b67f-bddb33d67b96")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnLaneSetData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("326230bf-2455-4ef7-8926-f5cbb2cfced0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.ProcessDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.ParentLaneDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.SubProcessDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0fa4c6f2-d839-4bca-b58c-4a4bcab4ec6a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.ProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnLaneSetData.Metadata.ProcessDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.ParentLaneDep());
        if (obj != null)
          return new SmDepVal(BpmnLaneSetData.Metadata.ParentLaneDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.SubProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnLaneSetData.Metadata.SubProcessDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e6c3fc0c-b89e-4d71-8219-c0f901fe883c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLaneSet(this);
        else
          return null;
    }

}
