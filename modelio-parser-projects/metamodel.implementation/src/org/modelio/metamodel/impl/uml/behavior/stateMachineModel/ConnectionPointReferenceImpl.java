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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ConnectionPointReferenceData;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("004e6c5e-c4bf-1fd8-97fe-001ec947cd2a")
public class ConnectionPointReferenceImpl extends StateVertexImpl implements ConnectionPointReference {
    @objid ("2ff70853-482f-464a-a55f-e8c2f1025350")
    @Override
    public ExitPointPseudoState getExit() {
        return (ExitPointPseudoState) getDepVal(ConnectionPointReferenceData.Metadata.ExitDep());
    }

    @objid ("c1793519-01c6-452c-b1b1-f13e49b420fc")
    @Override
    public void setExit(ExitPointPseudoState value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.ExitDep(), (SmObjectImpl)value);
    }

    @objid ("fa3cc36c-2bd9-4b72-9782-b7ffddbcd611")
    @Override
    public EntryPointPseudoState getEntry() {
        return (EntryPointPseudoState) getDepVal(ConnectionPointReferenceData.Metadata.EntryDep());
    }

    @objid ("d5a22a17-4e80-48e3-a6d5-59194bb08017")
    @Override
    public void setEntry(EntryPointPseudoState value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.EntryDep(), (SmObjectImpl)value);
    }

    @objid ("6d5e4849-cf1f-47d9-b7ea-8c3e422b2e21")
    @Override
    public State getOwnerState() {
        return (State) getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
    }

    @objid ("77c1684f-62f9-4993-a872-84f1cfbe721b")
    @Override
    public void setOwnerState(State value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep(), (SmObjectImpl)value);
    }

    @objid ("bbc8d3b4-fe3c-44cc-b5d5-93436bc2fb59")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5f0daa11-d009-4753-ac69-11cabf4b1412")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
        if (obj != null)
          return new SmDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("dfc2822e-86f1-411e-8f11-5fddc79339b2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConnectionPointReference(this);
        else
          return null;
    }

}
