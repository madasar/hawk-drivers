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
package org.modelio.metamodel.impl.bpmn.flows;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageFlowData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007c895e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMessageFlowImpl extends BpmnBaseElementImpl implements BpmnMessageFlow {
    @objid ("a1101b4b-c843-4a9f-8628-c8032306853f")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnMessageFlowData.Metadata.MessageRefDep());
    }

    @objid ("22c9f40b-80c5-4b8f-a17a-46374195673d")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnMessageFlowData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("b0d0875c-b89f-449a-b536-7c30f8c8c99d")
    @Override
    public BpmnBaseElement getSourceRef() {
        return (BpmnBaseElement) getDepVal(BpmnMessageFlowData.Metadata.SourceRefDep());
    }

    @objid ("3acb3dfa-ebf2-41b3-8f35-a875e561e4f8")
    @Override
    public void setSourceRef(BpmnBaseElement value) {
        appendDepVal(BpmnMessageFlowData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("d594b425-a177-4ec9-84c9-137e3b43f44d")
    @Override
    public BpmnBaseElement getTargetRef() {
        return (BpmnBaseElement) getDepVal(BpmnMessageFlowData.Metadata.TargetRefDep());
    }

    @objid ("ce834c66-2a19-4ed7-9918-e7a3d283db28")
    @Override
    public void setTargetRef(BpmnBaseElement value) {
        appendDepVal(BpmnMessageFlowData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("b0701714-f63a-4886-a5a9-903a4e9ba133")
    @Override
    public BpmnCollaboration getCollaboration() {
        return (BpmnCollaboration) getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
    }

    @objid ("d3507d3b-7b5d-4397-9715-3414ce14c272")
    @Override
    public void setCollaboration(BpmnCollaboration value) {
        appendDepVal(BpmnMessageFlowData.Metadata.CollaborationDep(), (SmObjectImpl)value);
    }

    @objid ("aabc9e9c-9007-4476-8493-350a1fb86cbf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("84d2b1af-dbde-4ca9-a5c8-1f5f3b59fa11")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
        if (obj != null)
          return new SmDepVal(BpmnMessageFlowData.Metadata.CollaborationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8f84ceea-9445-4d32-a7fa-7166aed84990")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessageFlow(this);
        else
          return null;
    }

}
