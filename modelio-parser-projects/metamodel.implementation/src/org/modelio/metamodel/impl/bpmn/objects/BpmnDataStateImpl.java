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
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataStateData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00087bf4-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataStateImpl extends BpmnBaseElementImpl implements BpmnDataState {
    @objid ("20946d46-922f-47da-ac77-0699b0cd0a00")
    @Override
    public BpmnItemAwareElement getItem() {
        return (BpmnItemAwareElement) getDepVal(BpmnDataStateData.Metadata.ItemDep());
    }

    @objid ("7e2c44c2-0f1d-4a85-96b2-ea1c7c5a6d12")
    @Override
    public void setItem(BpmnItemAwareElement value) {
        appendDepVal(BpmnDataStateData.Metadata.ItemDep(), (SmObjectImpl)value);
    }

    @objid ("29303335-2384-4824-9cba-228cd67f4ad0")
    @Override
    public State getUmlState() {
        return (State) getDepVal(BpmnDataStateData.Metadata.UmlStateDep());
    }

    @objid ("e6179c9e-623a-4c99-ac87-7ff91d1820c2")
    @Override
    public void setUmlState(State value) {
        appendDepVal(BpmnDataStateData.Metadata.UmlStateDep(), (SmObjectImpl)value);
    }

    @objid ("4b157705-bb64-44ce-8698-ac4398a67a87")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataStateData.Metadata.ItemDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b8e84fac-5b65-4528-a566-58404a1abb5b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataStateData.Metadata.ItemDep());
        if (obj != null)
          return new SmDepVal(BpmnDataStateData.Metadata.ItemDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("59276aa1-cd1e-4eb7-9dcf-7405a7137cba")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataState(this);
        else
          return null;
    }

}
