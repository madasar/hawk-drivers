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
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataOutputData;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0005e9a2-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataOutputImpl extends BpmnItemAwareElementImpl implements BpmnDataOutput {
    @objid ("377b6dd0-55e8-4f27-b087-8d7a5543ad73")
    @Override
    public Parameter getRepresentedParameter() {
        return (Parameter) getDepVal(BpmnDataOutputData.Metadata.RepresentedParameterDep());
    }

    @objid ("0d44eb49-af71-4a1c-b664-a4e7d6199057")
    @Override
    public void setRepresentedParameter(Parameter value) {
        appendDepVal(BpmnDataOutputData.Metadata.RepresentedParameterDep(), (SmObjectImpl)value);
    }

    @objid ("85f6f484-11d3-4d14-8a85-8f667a1b07b7")
    @Override
    public BpmnActivity getOwnerActivity() {
        return (BpmnActivity) getDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep());
    }

    @objid ("cd9e3f7a-95d7-4816-b04c-47f172f8de83")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("a6f5d88b-14f3-42de-a642-cb2f086e43e5")
    @Override
    public BpmnCatchEvent getCatched() {
        return (BpmnCatchEvent) getDepVal(BpmnDataOutputData.Metadata.CatchedDep());
    }

    @objid ("b9bd32d9-4ef1-4daa-b1c6-4de22a2f0669")
    @Override
    public void setCatched(BpmnCatchEvent value) {
        appendDepVal(BpmnDataOutputData.Metadata.CatchedDep(), (SmObjectImpl)value);
    }

    @objid ("329087b5-2502-467e-8ffe-0d61391969da")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep());
    }

    @objid ("e86bdf3b-029c-457e-a128-ce3f55030385")
    @Override
    public void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("0750f299-399d-41a7-a547-0234f3d378d3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.CatchedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7b7743b5-9eef-4c44-8026-1543a2efe3ea")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep());
        if (obj != null)
          return new SmDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.CatchedDep());
        if (obj != null)
          return new SmDepVal(BpmnDataOutputData.Metadata.CatchedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep());
        if (obj != null)
          return new SmDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b01d44ce-7264-4aa5-9c61-97819ea3ec29")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataOutput(this);
        else
          return null;
    }

}
