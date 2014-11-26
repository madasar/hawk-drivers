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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionUseData;
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

@objid ("00485742-c4bf-1fd8-97fe-001ec947cd2a")
public class InteractionUseImpl extends InteractionFragmentImpl implements InteractionUse {
    @objid ("f223c2ee-800e-4a05-be44-3c61816e4dfc")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(InteractionUseData.Metadata.EndLineNumberAtt());
    }

    @objid ("9d040c57-1833-4caa-91ea-75bde3ed921c")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(InteractionUseData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("cc782529-0346-4a83-918a-15d46933fcbd")
    @Override
    public EList<Gate> getActualGate() {
        return new SmList<>(this, InteractionUseData.Metadata.ActualGateDep());
    }

    @objid ("df608e4d-e78f-42ae-8169-60596c74c2c9")
    @Override
    public <T extends Gate> List<T> getActualGate(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Gate element : getActualGate()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("30718e70-9020-4fee-a25e-d4ec11c3fec9")
    @Override
    public Interaction getRefersTo() {
        return (Interaction) getDepVal(InteractionUseData.Metadata.RefersToDep());
    }

    @objid ("f5972a77-7f3b-4023-88f7-9a18e73d8e5a")
    @Override
    public void setRefersTo(Interaction value) {
        appendDepVal(InteractionUseData.Metadata.RefersToDep(), (SmObjectImpl)value);
    }

    @objid ("e2fbeea9-81c5-49e1-8a0c-20c65b2401bd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("968ea891-f612-461f-a2df-49434a4bf248")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("20347121-fc15-46a6-85e0-37544575f27b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionUse(this);
        else
          return null;
    }

}
