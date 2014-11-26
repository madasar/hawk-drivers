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
package org.modelio.metamodel.impl.uml.informationFlow;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.informationFlow.DataFlowData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00648264-c4bf-1fd8-97fe-001ec947cd2a")
public class DataFlowImpl extends ModelElementImpl implements DataFlow {
    @objid ("8e934655-b127-40fd-b088-00b51aa7ea4b")
    @Override
    public NameSpace getDestination() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.DestinationDep());
    }

    @objid ("2727ae7e-13d7-462b-be95-f7915fdf3dd9")
    @Override
    public void setDestination(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.DestinationDep(), (SmObjectImpl)value);
    }

    @objid ("28c0738d-ad53-43cf-bccb-8257e3dd00ad")
    @Override
    public NameSpace getOrigin() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.OriginDep());
    }

    @objid ("34ba68d7-3cd4-48a0-9633-5b4f4334a802")
    @Override
    public void setOrigin(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("bd503147-dec9-4f2d-9ee3-5cd018fb2355")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.OwnerDep());
    }

    @objid ("084d1551-5cc5-4034-b9a5-d67bc7544b36")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("cea21efa-4214-44b6-843d-36e5daf39ac0")
    @Override
    public Signal getSModel() {
        return (Signal) getDepVal(DataFlowData.Metadata.SModelDep());
    }

    @objid ("0bbeddae-edaa-443e-8d8c-d769556cfc7e")
    @Override
    public void setSModel(Signal value) {
        appendDepVal(DataFlowData.Metadata.SModelDep(), (SmObjectImpl)value);
    }

    @objid ("dd9020a7-4753-4d39-92c0-becb4da4b58a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DataFlowData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8b6ec414-32db-4e95-8184-2085dd2363e1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DataFlowData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(DataFlowData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c786447f-a122-4a4a-8cc4-9bb60a50e06d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDataFlow(this);
        else
          return null;
    }

}
