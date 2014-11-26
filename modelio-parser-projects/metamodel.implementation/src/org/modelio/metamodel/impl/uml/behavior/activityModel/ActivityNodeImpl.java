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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityNodeData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0028d9f8-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityNodeImpl extends ModelElementImpl implements ActivityNode {
    @objid ("abd8aa27-8d90-4aad-929f-0ee1e20a1634")
    @Override
    public Activity getOwner() {
        return (Activity) getDepVal(ActivityNodeData.Metadata.OwnerDep());
    }

    @objid ("ce53e4f7-b7a3-4a64-a8cc-8dd7e0f5809c")
    @Override
    public void setOwner(Activity value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("dbe6883f-b53b-4b0c-820e-d8620fd378d5")
    @Override
    public ActivityPartition getOwnerPartition() {
        return (ActivityPartition) getDepVal(ActivityNodeData.Metadata.OwnerPartitionDep());
    }

    @objid ("96e98309-be87-4630-b81a-9985840fbbe9")
    @Override
    public void setOwnerPartition(ActivityPartition value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("35e5fbd5-5d81-4496-92bb-6ffde5397f36")
    @Override
    public EList<ActivityEdge> getIncoming() {
        return new SmList<>(this, ActivityNodeData.Metadata.IncomingDep());
    }

    @objid ("15d1268c-729e-4387-8a03-1005d875a07f")
    @Override
    public <T extends ActivityEdge> List<T> getIncoming(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityEdge element : getIncoming()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("18960ff8-683e-4268-a6d4-17977504d9dc")
    @Override
    public Clause getOwnerClause() {
        return (Clause) getDepVal(ActivityNodeData.Metadata.OwnerClauseDep());
    }

    @objid ("03a69ec2-6c20-42ce-b1c6-de66151c9fee")
    @Override
    public void setOwnerClause(Clause value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerClauseDep(), (SmObjectImpl)value);
    }

    @objid ("e7319b0b-5e9d-4204-ba4b-978ae1d0da11")
    @Override
    public StructuredActivityNode getOwnerNode() {
        return (StructuredActivityNode) getDepVal(ActivityNodeData.Metadata.OwnerNodeDep());
    }

    @objid ("50069e0a-802c-4b9c-b2a7-4983aa120d49")
    @Override
    public void setOwnerNode(StructuredActivityNode value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerNodeDep(), (SmObjectImpl)value);
    }

    @objid ("321a6ef3-c7d3-407c-a473-f9634870a2a1")
    @Override
    public EList<ActivityEdge> getOutgoing() {
        return new SmList<>(this, ActivityNodeData.Metadata.OutgoingDep());
    }

    @objid ("df4a611d-6f1f-460a-b3f6-032a1888b071")
    @Override
    public <T extends ActivityEdge> List<T> getOutgoing(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityEdge element : getOutgoing()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d69de9ca-3034-476f-ab2d-75ad2b84aba5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerPartitionDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerClauseDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerNodeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e2bba29e-0691-49a7-8f0a-d9a109b826a6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ActivityNodeData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerPartitionDep());
        if (obj != null)
          return new SmDepVal(ActivityNodeData.Metadata.OwnerPartitionDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerClauseDep());
        if (obj != null)
          return new SmDepVal(ActivityNodeData.Metadata.OwnerClauseDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerNodeDep());
        if (obj != null)
          return new SmDepVal(ActivityNodeData.Metadata.OwnerNodeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1cfe80d4-9c72-4815-bd23-f6a3ea0a0f2d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityNode(this);
        else
          return null;
    }

}
