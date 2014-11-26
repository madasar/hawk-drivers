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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GeneralOrderingData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("004610d6-c4bf-1fd8-97fe-001ec947cd2a")
public class GeneralOrderingImpl extends ElementImpl implements GeneralOrdering {
    @objid ("2341200e-566a-4f9c-a848-c429abf609e6")
    @Override
    public OccurrenceSpecification getBefore() {
        return (OccurrenceSpecification) getDepVal(GeneralOrderingData.Metadata.BeforeDep());
    }

    @objid ("34d7c7d5-beee-4b59-a6da-a643e083e028")
    @Override
    public void setBefore(OccurrenceSpecification value) {
        appendDepVal(GeneralOrderingData.Metadata.BeforeDep(), (SmObjectImpl)value);
    }

    @objid ("19c3713f-7201-4270-a77a-30358c4bbaee")
    @Override
    public OccurrenceSpecification getAfter() {
        return (OccurrenceSpecification) getDepVal(GeneralOrderingData.Metadata.AfterDep());
    }

    @objid ("5351b445-99e7-4fbd-bd69-272a28996783")
    @Override
    public void setAfter(OccurrenceSpecification value) {
        appendDepVal(GeneralOrderingData.Metadata.AfterDep(), (SmObjectImpl)value);
    }

    @objid ("1f29aea2-1587-452d-a846-7a5a4c94dcfd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralOrderingData.Metadata.BeforeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("aab90020-0f85-4126-a186-2af9df0bb568")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralOrderingData.Metadata.BeforeDep());
        if (obj != null)
          return new SmDepVal(GeneralOrderingData.Metadata.BeforeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("49318af5-f0f2-42d4-8604-1fa221aee336")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralOrdering(this);
        else
          return null;
    }

}
