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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000ab8a6-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceRoleImpl extends BpmnBaseElementImpl implements BpmnResourceRole {
    @objid ("42799e83-c381-411e-9065-bb35b12ca794")
    @Override
    public BpmnResource getResourceRef() {
        return (BpmnResource) getDepVal(BpmnResourceRoleData.Metadata.ResourceRefDep());
    }

    @objid ("32d267e9-922b-4631-b131-a256d85dade9")
    @Override
    public void setResourceRef(BpmnResource value) {
        appendDepVal(BpmnResourceRoleData.Metadata.ResourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("c04ecd67-5a06-4050-8124-dc85f663e45d")
    @Override
    public BpmnFlowNode getAnnotated() {
        return (BpmnFlowNode) getDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep());
    }

    @objid ("93f46a01-3371-4758-8225-6d45d6156493")
    @Override
    public void setAnnotated(BpmnFlowNode value) {
        appendDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep(), (SmObjectImpl)value);
    }

    @objid ("06c7ac06-4e93-4418-a4e0-e03357eaa0f5")
    @Override
    public EList<BpmnResourceParameterBinding> getResourceParameterBinding() {
        return new SmList<>(this, BpmnResourceRoleData.Metadata.ResourceParameterBindingDep());
    }

    @objid ("00ed427a-b9da-4a1c-8b94-c12aee7b4781")
    @Override
    public <T extends BpmnResourceParameterBinding> List<T> getResourceParameterBinding(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceParameterBinding element : getResourceParameterBinding()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cbee5f9e-80e5-4687-83b3-8a861fa95ab6")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnResourceRoleData.Metadata.ProcessDep());
    }

    @objid ("6d359ffe-327a-4997-987b-2d226fbbfce9")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnResourceRoleData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("85943ac6-0d11-4dd4-a863-f7b281d41a6e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceRoleData.Metadata.ProcessDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ea554811-3b31-4d91-a0ab-aa14aa4ff111")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceRoleData.Metadata.ProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceRoleData.Metadata.ProcessDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2e3d37aa-0a63-4432-b88b-43f695062618")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceRole(this);
        else
          return null;
    }

}
