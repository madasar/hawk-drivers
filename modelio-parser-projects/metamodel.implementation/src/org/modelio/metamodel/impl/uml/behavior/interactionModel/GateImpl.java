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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GateData;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00456c76-c4bf-1fd8-97fe-001ec947cd2a")
public class GateImpl extends MessageEndImpl implements Gate {
    @objid ("44dc8d4d-2c4a-4f33-9066-c79fb7e58113")
    @Override
    public InteractionUse getOwnerUse() {
        return (InteractionUse) getDepVal(GateData.Metadata.OwnerUseDep());
    }

    @objid ("264249b2-59b4-4ebe-9e36-13b0ac52ed98")
    @Override
    public void setOwnerUse(InteractionUse value) {
        appendDepVal(GateData.Metadata.OwnerUseDep(), (SmObjectImpl)value);
    }

    @objid ("978cffe0-e1b7-4a9a-aae3-2eb9e4bdddfc")
    @Override
    public EList<Gate> getActual() {
        return new SmList<>(this, GateData.Metadata.ActualDep());
    }

    @objid ("c90005a9-e649-4c46-92fb-e97c4c00331b")
    @Override
    public <T extends Gate> List<T> getActual(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Gate element : getActual()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9746aaed-5c39-41d3-b3b1-db4c249fc2ed")
    @Override
    public Interaction getOwnerInteraction() {
        return (Interaction) getDepVal(GateData.Metadata.OwnerInteractionDep());
    }

    @objid ("b156da5d-ff16-4228-bbe4-72ea45b2f64f")
    @Override
    public void setOwnerInteraction(Interaction value) {
        appendDepVal(GateData.Metadata.OwnerInteractionDep(), (SmObjectImpl)value);
    }

    @objid ("1ae982b9-dd48-4a31-a2c3-fdf2b6b413d7")
    @Override
    public CombinedFragment getOwnerFragment() {
        return (CombinedFragment) getDepVal(GateData.Metadata.OwnerFragmentDep());
    }

    @objid ("e6c7453d-bf10-4f74-bc7f-ec69b5c9e8a6")
    @Override
    public void setOwnerFragment(CombinedFragment value) {
        appendDepVal(GateData.Metadata.OwnerFragmentDep(), (SmObjectImpl)value);
    }

    @objid ("0e3a8d6b-6b7a-4fa7-bec9-b6ed53656f88")
    @Override
    public Gate getFormal() {
        return (Gate) getDepVal(GateData.Metadata.FormalDep());
    }

    @objid ("4d6fbae1-77ef-4eae-8811-39aceb5822c9")
    @Override
    public void setFormal(Gate value) {
        appendDepVal(GateData.Metadata.FormalDep(), (SmObjectImpl)value);
    }

    @objid ("42fe0def-e384-4eb5-8368-55dbcce94c25")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerUseDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerInteractionDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e19a9421-9a71-4bbb-9046-846129386cca")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerUseDep());
        if (obj != null)
          return new SmDepVal(GateData.Metadata.OwnerUseDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerInteractionDep());
        if (obj != null)
          return new SmDepVal(GateData.Metadata.OwnerInteractionDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return new SmDepVal(GateData.Metadata.OwnerFragmentDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("17df45bf-bd60-4897-84b8-da61804b19a7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGate(this);
        else
          return null;
    }

}
