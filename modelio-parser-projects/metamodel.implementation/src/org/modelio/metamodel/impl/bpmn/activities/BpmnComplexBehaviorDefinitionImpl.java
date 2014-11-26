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
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.data.bpmn.activities.BpmnComplexBehaviorDefinitionData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007fa21a-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnComplexBehaviorDefinitionImpl extends BpmnBaseElementImpl implements BpmnComplexBehaviorDefinition {
    @objid ("227a763d-a507-4434-bfdd-3df1c88b5f10")
    @Override
    public String getCondition() {
        return (String) getAttVal(BpmnComplexBehaviorDefinitionData.Metadata.ConditionAtt());
    }

    @objid ("d0c03c78-5a86-43f5-b70d-1e31d76fb8f0")
    @Override
    public void setCondition(String value) {
        setAttVal(BpmnComplexBehaviorDefinitionData.Metadata.ConditionAtt(), value);
    }

    @objid ("520cf3e3-15c2-4661-847d-00c91b25bd63")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwner() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
    }

    @objid ("596e4a04-41be-4a40-a264-e7810f5cd502")
    @Override
    public void setOwner(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("41a14614-535e-46be-a8b6-b9527c16ab51")
    @Override
    public BpmnImplicitThrowEvent getEvent() {
        return (BpmnImplicitThrowEvent) getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.EventDep());
    }

    @objid ("0a4cd5e4-0009-4e7c-b531-ab40ba54c11e")
    @Override
    public void setEvent(BpmnImplicitThrowEvent value) {
        appendDepVal(BpmnComplexBehaviorDefinitionData.Metadata.EventDep(), (SmObjectImpl)value);
    }

    @objid ("9c51dae0-6ad8-46a4-92d0-c1029577889f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6b578e06-bcbe-42e4-8bdf-5e5aedbcc72e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("72641ebe-9440-4bd5-9d72-fa9828807bbb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnComplexBehaviorDefinition(this);
        else
          return null;
    }

}
