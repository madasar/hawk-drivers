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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.bpmn.events.BpmnCatchEventData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0088d56a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnCatchEventImpl extends BpmnEventImpl implements BpmnCatchEvent {
    @objid ("e713ce22-6fea-4875-a381-c2e48781b2e7")
    @Override
    public boolean isParallelMultiple() {
        return (Boolean) getAttVal(BpmnCatchEventData.Metadata.ParallelMultipleAtt());
    }

    @objid ("e7440f08-4588-4260-b0cd-9da0b20d47ab")
    @Override
    public void setParallelMultiple(boolean value) {
        setAttVal(BpmnCatchEventData.Metadata.ParallelMultipleAtt(), value);
    }

    @objid ("567f23da-ca5f-4b1b-aa9c-de7d9721d308")
    @Override
    public EList<BpmnDataAssociation> getDataOutputAssociation() {
        return new SmList<>(this, BpmnCatchEventData.Metadata.DataOutputAssociationDep());
    }

    @objid ("1cb95c80-38eb-462f-a0b3-844e7159ec02")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getDataOutputAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e22406d8-4a1b-4fb3-83f6-459be58a6a53")
    @Override
    public BpmnDataOutput getDataOutput() {
        return (BpmnDataOutput) getDepVal(BpmnCatchEventData.Metadata.DataOutputDep());
    }

    @objid ("57798ac9-ae38-4cd4-a70d-4a8ac6629345")
    @Override
    public void setDataOutput(BpmnDataOutput value) {
        appendDepVal(BpmnCatchEventData.Metadata.DataOutputDep(), (SmObjectImpl)value);
    }

    @objid ("6ebca6d8-55e2-424f-bed5-ba84ddfd2e3b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("17e6116c-0a32-4780-94a6-73f34bf8a971")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4ad33717-9c4e-4776-ac54-2b9518198f07")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCatchEvent(this);
        else
          return null;
    }

}
