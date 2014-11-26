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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00068a7e-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataInputImpl extends BpmnItemAwareElementImpl implements BpmnDataInput {
    @objid ("752a4ca8-adc6-4026-a6eb-4c4714c5b564")
    @Override
    public Parameter getRepresentedParameter() {
        return (Parameter) getDepVal(BpmnDataInputData.Metadata.RepresentedParameterDep());
    }

    @objid ("3892d1c2-b7b8-4958-82cb-06da4db596b5")
    @Override
    public void setRepresentedParameter(Parameter value) {
        appendDepVal(BpmnDataInputData.Metadata.RepresentedParameterDep(), (SmObjectImpl)value);
    }

    @objid ("6c8d2fa2-155a-4336-8014-0f3d4cd17cd7")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep());
    }

    @objid ("c6aa9412-647b-49b1-aaae-6edba94719a1")
    @Override
    public void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("0885149c-88b9-45e2-8862-1f072f97110b")
    @Override
    public BpmnActivity getOwnerActivity() {
        return (BpmnActivity) getDepVal(BpmnDataInputData.Metadata.OwnerActivityDep());
    }

    @objid ("c3727ebe-bb6f-4749-abb4-07427d149b01")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("425ee4b7-2b68-4e82-8fed-930202f47313")
    @Override
    public BpmnThrowEvent getOwnerThrowEvent() {
        return (BpmnThrowEvent) getDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep());
    }

    @objid ("b87bb650-d7e3-47f8-b2ff-469ed20535d1")
    @Override
    public void setOwnerThrowEvent(BpmnThrowEvent value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep(), (SmObjectImpl)value);
    }

    @objid ("386f6081-f731-45c8-a8b3-b1e7ef6cbc38")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerActivityDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("31073e7d-e8ba-40c6-9ccc-0fe82ff77074")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep());
        if (obj != null)
          return new SmDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerActivityDep());
        if (obj != null)
          return new SmDepVal(BpmnDataInputData.Metadata.OwnerActivityDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep());
        if (obj != null)
          return new SmDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e3b7e511-43a4-498a-a890-79a3538532f8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataInput(this);
        else
          return null;
    }

}
