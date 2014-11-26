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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityPartitionData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("002a04ae-c4bf-1fd8-97fe-001ec947cd2a")
public class ActivityPartitionImpl extends ActivityGroupImpl implements ActivityPartition {
    @objid ("a0d280db-25ac-4109-b3dd-023abc433f37")
    @Override
    public boolean isIsDimension() {
        return (Boolean) getAttVal(ActivityPartitionData.Metadata.IsDimensionAtt());
    }

    @objid ("0c5d6fa7-df94-441e-a8f9-e9b17163e818")
    @Override
    public void setIsDimension(boolean value) {
        setAttVal(ActivityPartitionData.Metadata.IsDimensionAtt(), value);
    }

    @objid ("6677b623-a39d-4914-8ba0-8fb8dab680be")
    @Override
    public boolean isIsExternal() {
        return (Boolean) getAttVal(ActivityPartitionData.Metadata.IsExternalAtt());
    }

    @objid ("3b0d10fe-25b0-4d10-af20-e10410cdd612")
    @Override
    public void setIsExternal(boolean value) {
        setAttVal(ActivityPartitionData.Metadata.IsExternalAtt(), value);
    }

    @objid ("5d5caa96-6380-4b90-8ce0-1e78216c4468")
    @Override
    public ModelElement getRepresented() {
        return (ModelElement) getDepVal(ActivityPartitionData.Metadata.RepresentedDep());
    }

    @objid ("0c6b7206-c212-48a8-93f4-90567b5f03f0")
    @Override
    public void setRepresented(ModelElement value) {
        appendDepVal(ActivityPartitionData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("a38fb099-e99a-4106-9247-e96233d6abef")
    @Override
    public EList<ActivityNode> getContainedNode() {
        return new SmList<>(this, ActivityPartitionData.Metadata.ContainedNodeDep());
    }

    @objid ("53bf7501-8c09-45b0-9cf2-a0e0906ba464")
    @Override
    public <T extends ActivityNode> List<T> getContainedNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityNode element : getContainedNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3363efdf-b0b7-4f19-829b-c890c10a2fe5")
    @Override
    public EList<MessageFlow> getOutgoing() {
        return new SmList<>(this, ActivityPartitionData.Metadata.OutgoingDep());
    }

    @objid ("c085388a-c8be-42c5-be49-b1d52ad9db15")
    @Override
    public <T extends MessageFlow> List<T> getOutgoing(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final MessageFlow element : getOutgoing()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f07f6217-e59d-486b-8542-383bea04bdf1")
    @Override
    public ActivityPartition getSuperPartition() {
        return (ActivityPartition) getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
    }

    @objid ("cbe91f38-701b-4861-809b-eec182b7b2e7")
    @Override
    public void setSuperPartition(ActivityPartition value) {
        appendDepVal(ActivityPartitionData.Metadata.SuperPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("237a8ec0-3a39-418f-95e3-cc46e8afab12")
    @Override
    public EList<ActivityPartition> getSubPartition() {
        return new SmList<>(this, ActivityPartitionData.Metadata.SubPartitionDep());
    }

    @objid ("a7d89705-9896-4d40-9bd1-143a8e70fb79")
    @Override
    public <T extends ActivityPartition> List<T> getSubPartition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityPartition element : getSubPartition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("843e94c0-6038-4b23-acb5-a22e40f2b6e1")
    @Override
    public EList<MessageFlow> getIncoming() {
        return new SmList<>(this, ActivityPartitionData.Metadata.IncomingDep());
    }

    @objid ("be16465e-0767-44d5-9bff-e4b5ea00d329")
    @Override
    public <T extends MessageFlow> List<T> getIncoming(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final MessageFlow element : getIncoming()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("14f3fc85-334a-4f4c-9212-fa74aec05b01")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("86915f6c-ab9e-40c5-a560-33602c62d7da")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
        if (obj != null)
          return new SmDepVal(ActivityPartitionData.Metadata.SuperPartitionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("53948f89-8add-4230-862f-772359da5a9b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityPartition(this);
        else
          return null;
    }

}
