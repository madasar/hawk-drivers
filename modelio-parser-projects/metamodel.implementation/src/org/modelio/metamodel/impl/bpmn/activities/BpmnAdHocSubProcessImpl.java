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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;
import org.modelio.metamodel.bpmn.activities.BpmnAdHocSubProcess;
import org.modelio.metamodel.data.bpmn.activities.BpmnAdHocSubProcessData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007e160c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnAdHocSubProcessImpl extends BpmnSubProcessImpl implements BpmnAdHocSubProcess {
    @objid ("9addc870-9218-4539-8cc4-5fdeb33ff197")
    @Override
    public AdHocOrdering getOrdering() {
        return (AdHocOrdering) getAttVal(BpmnAdHocSubProcessData.Metadata.OrderingAtt());
    }

    @objid ("fb489724-3113-4484-bc22-be17689e5479")
    @Override
    public void setOrdering(AdHocOrdering value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.OrderingAtt(), value);
    }

    @objid ("92ab3c41-ec37-4806-a2e1-ddba3a5c8e0b")
    @Override
    public boolean isCancelRemainingInstances() {
        return (Boolean) getAttVal(BpmnAdHocSubProcessData.Metadata.CancelRemainingInstancesAtt());
    }

    @objid ("19d20416-3f08-4302-923f-53bb3a38b65a")
    @Override
    public void setCancelRemainingInstances(boolean value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.CancelRemainingInstancesAtt(), value);
    }

    @objid ("46947603-0742-417c-b64f-d8b6bdf91202")
    @Override
    public String getCompletionCondition() {
        return (String) getAttVal(BpmnAdHocSubProcessData.Metadata.CompletionConditionAtt());
    }

    @objid ("af6a1d1c-9cb0-4bcf-a2ed-b6993482f956")
    @Override
    public void setCompletionCondition(String value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.CompletionConditionAtt(), value);
    }

    @objid ("a856e5c5-10bd-4451-9879-e1d70381f7b7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f871d6de-1327-48ae-8b73-3e1084e4a1cb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("3f9958c8-d1d2-4229-9b93-9663b2299f51")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnAdHocSubProcess(this);
        else
          return null;
    }

}
