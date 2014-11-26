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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnArtifactData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0078aed8-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnArtifactImpl extends BpmnBaseElementImpl implements BpmnArtifact {
    @objid ("1ee14e72-e581-499a-be1d-f02174405231")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnArtifactData.Metadata.SubProcessDep());
    }

    @objid ("6298fdee-cc91-4eb7-95ae-127f5a1b781f")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnArtifactData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("88f6676f-123c-4a73-afd0-a6f82ac7ee8f")
    @Override
    public BpmnCollaboration getCollaboration() {
        return (BpmnCollaboration) getDepVal(BpmnArtifactData.Metadata.CollaborationDep());
    }

    @objid ("8d52c1f5-b4b6-4a66-b7e3-bb0ce040bfdb")
    @Override
    public void setCollaboration(BpmnCollaboration value) {
        appendDepVal(BpmnArtifactData.Metadata.CollaborationDep(), (SmObjectImpl)value);
    }

    @objid ("4c68c40a-cf4d-41c9-a418-b94421259fc6")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnArtifactData.Metadata.ProcessDep());
    }

    @objid ("cc682069-c55c-41ad-93db-9c6f18c78089")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnArtifactData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("e51746fa-9a21-45a8-81e8-e8271fc6e069")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.SubProcessDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.CollaborationDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.ProcessDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b75b982e-44a5-499c-95bf-1c817497f34c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.SubProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnArtifactData.Metadata.SubProcessDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.CollaborationDep());
        if (obj != null)
          return new SmDepVal(BpmnArtifactData.Metadata.CollaborationDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.ProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnArtifactData.Metadata.ProcessDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("552acb62-e065-4501-8654-65868cf649c9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnArtifact(this);
        else
          return null;
    }

}
