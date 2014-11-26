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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.MessageFlowData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00381364-c4bf-1fd8-97fe-001ec947cd2a")
public class MessageFlowImpl extends ActivityEdgeImpl implements MessageFlow {
    @objid ("421429bd-4670-4720-9945-997da58e932a")
    @Override
    public ActivityPartition getTargetPartition() {
        return (ActivityPartition) getDepVal(MessageFlowData.Metadata.TargetPartitionDep());
    }

    @objid ("921bdb59-5892-41b2-abf7-49f23f11606f")
    @Override
    public void setTargetPartition(ActivityPartition value) {
        appendDepVal(MessageFlowData.Metadata.TargetPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("3c0250d1-5a3d-4111-b048-05abc5b24379")
    @Override
    public ActivityPartition getSourcePartition() {
        return (ActivityPartition) getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
    }

    @objid ("8ed739d0-a181-4770-885f-4d117a9bb27f")
    @Override
    public void setSourcePartition(ActivityPartition value) {
        appendDepVal(MessageFlowData.Metadata.SourcePartitionDep(), (SmObjectImpl)value);
    }

    @objid ("c7951f06-4b60-4d38-a36d-5b362967ce05")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9cc92290-c501-46f7-8701-47df0314c4f2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
        if (obj != null)
          return new SmDepVal(MessageFlowData.Metadata.SourcePartitionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("3d5ee157-4b24-46e0-b8d5-629f03a0dfe5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessageFlow(this);
        else
          return null;
    }

}
