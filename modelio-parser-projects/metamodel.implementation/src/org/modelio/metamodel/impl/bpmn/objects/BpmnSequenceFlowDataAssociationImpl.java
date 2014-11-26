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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.data.bpmn.objects.BpmnSequenceFlowDataAssociationData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00054970-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnSequenceFlowDataAssociationImpl extends BpmnBaseElementImpl implements BpmnSequenceFlowDataAssociation {
    @objid ("bff52759-5d06-468d-8713-cdd1488ac15e")
    @Override
    public BpmnSequenceFlow getConnected() {
        return (BpmnSequenceFlow) getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
    }

    @objid ("a6bf337e-2da6-47f5-a10a-f8165c7103a4")
    @Override
    public void setConnected(BpmnSequenceFlow value) {
        appendDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep(), (SmObjectImpl)value);
    }

    @objid ("b50c247f-0352-4532-9048-2a4d849c536a")
    @Override
    public EList<BpmnDataAssociation> getDataAssociation() {
        return new SmList<>(this, BpmnSequenceFlowDataAssociationData.Metadata.DataAssociationDep());
    }

    @objid ("faab8d07-6a4f-46e5-8ea7-f9c8868d0b95")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getDataAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bd3fa011-0a7b-4a30-ae0d-d6818c0e7663")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c47aa737-2bc4-4def-aedd-5a2243e7de0f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
        if (obj != null)
          return new SmDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("df2eb2f4-b8da-4084-9568-2c6ef1563bba")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSequenceFlowDataAssociation(this);
        else
          return null;
    }

}
