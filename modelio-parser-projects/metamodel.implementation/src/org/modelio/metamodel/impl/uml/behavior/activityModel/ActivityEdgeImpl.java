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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityEdgeData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("002733be-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityEdgeImpl extends ModelElementImpl implements ActivityEdge {
    @objid ("981a6276-afb8-49c0-af13-c2f9a054e29e")
    @Override
    public String getGuard() {
        return (String) getAttVal(ActivityEdgeData.Metadata.GuardAtt());
    }

    @objid ("730bfdc0-4762-4a1e-839f-37ccf5969c49")
    @Override
    public void setGuard(String value) {
        setAttVal(ActivityEdgeData.Metadata.GuardAtt(), value);
    }

    @objid ("ec2d48f7-3dd7-426f-8358-b9684bc8f389")
    @Override
    public String getWeight() {
        return (String) getAttVal(ActivityEdgeData.Metadata.WeightAtt());
    }

    @objid ("8a55caf7-3b42-4950-8343-0a41025c91a7")
    @Override
    public void setWeight(String value) {
        setAttVal(ActivityEdgeData.Metadata.WeightAtt(), value);
    }

    @objid ("7e336455-b563-425a-bc23-8200080ec93b")
    @Override
    public ActivityNode getTarget() {
        return (ActivityNode) getDepVal(ActivityEdgeData.Metadata.TargetDep());
    }

    @objid ("65111f37-c5b4-4a4c-b0c1-9e274395c810")
    @Override
    public void setTarget(ActivityNode value) {
        appendDepVal(ActivityEdgeData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("3fd1b8cb-65df-4136-a278-636cbe7b2c9f")
    @Override
    public ActivityNode getSource() {
        return (ActivityNode) getDepVal(ActivityEdgeData.Metadata.SourceDep());
    }

    @objid ("1334983c-14a3-46c3-bc87-7f3d9118bfb5")
    @Override
    public void setSource(ActivityNode value) {
        appendDepVal(ActivityEdgeData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("92d968ef-3e97-4017-89e7-c05f8cf08e3b")
    @Override
    public InterruptibleActivityRegion getInterrupts() {
        return (InterruptibleActivityRegion) getDepVal(ActivityEdgeData.Metadata.InterruptsDep());
    }

    @objid ("c6341c0f-2950-498a-a302-54eff03a2f6a")
    @Override
    public void setInterrupts(InterruptibleActivityRegion value) {
        appendDepVal(ActivityEdgeData.Metadata.InterruptsDep(), (SmObjectImpl)value);
    }

    @objid ("5d6a0434-8d36-444e-88fc-5bd166119d74")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, ActivityEdgeData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("e1c9ae0b-f998-4022-8e21-ae2ac4a9dd17")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getRealizedInformationFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("00ad2e11-8fb0-436b-9ff0-ff2b276cde12")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityEdgeData.Metadata.SourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("234c41f8-55eb-4e9f-849b-226c4917b720")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityEdgeData.Metadata.SourceDep());
        if (obj != null)
          return new SmDepVal(ActivityEdgeData.Metadata.SourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8d73f98b-c548-4ec3-830b-9b92ca2dd001")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityEdge(this);
        else
          return null;
    }

}
