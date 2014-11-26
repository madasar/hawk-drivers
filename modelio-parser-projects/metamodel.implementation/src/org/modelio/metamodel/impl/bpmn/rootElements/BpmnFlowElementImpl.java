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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0079514e-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnFlowElementImpl extends BpmnBaseElementImpl implements BpmnFlowElement {
    @objid ("a3339a03-7628-49c4-8524-025860e9c6ec")
    @Override
    public EList<BpmnGroup> getGroups() {
        return new SmList<>(this, BpmnFlowElementData.Metadata.GroupsDep());
    }

    @objid ("d5f2cc7e-78ca-4641-94a4-7af764cc33a4")
    @Override
    public <T extends BpmnGroup> List<T> getGroups(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnGroup element : getGroups()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4eef3e17-a203-4971-a205-93b9097bfaf1")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnFlowElementData.Metadata.SubProcessDep());
    }

    @objid ("fca6cc82-52d9-44b9-b7c6-35db537bd7c2")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnFlowElementData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("726c8ea1-9f36-43e8-bc8b-bbd3bd5b3184")
    @Override
    public EList<BpmnLane> getLane() {
        return new SmList<>(this, BpmnFlowElementData.Metadata.LaneDep());
    }

    @objid ("3fe961bc-ebf4-445f-b114-8db722346359")
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

    @objid ("a8f51058-f293-4fb6-b49b-9e7fc514d5dd")
    @Override
    public BpmnProcess getContainer() {
        return (BpmnProcess) getDepVal(BpmnFlowElementData.Metadata.ContainerDep());
    }

    @objid ("674ee48f-2331-4f64-9d5f-d638b235f3a2")
    @Override
    public void setContainer(BpmnProcess value) {
        appendDepVal(BpmnFlowElementData.Metadata.ContainerDep(), (SmObjectImpl)value);
    }

    @objid ("2de8e291-a237-494e-8176-fbd28709729e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnFlowElementData.Metadata.SubProcessDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnFlowElementData.Metadata.ContainerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ab2583d7-ac06-4fed-ab18-09bdfbbd8307")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnFlowElementData.Metadata.SubProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnFlowElementData.Metadata.SubProcessDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnFlowElementData.Metadata.ContainerDep());
        if (obj != null)
          return new SmDepVal(BpmnFlowElementData.Metadata.ContainerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("970b8e5f-cd13-474b-9271-ea76c523cc41")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnFlowElement(this);
        else
          return null;
    }

}
