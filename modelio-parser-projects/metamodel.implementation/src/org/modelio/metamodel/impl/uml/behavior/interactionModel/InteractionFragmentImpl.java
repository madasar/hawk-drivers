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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionFragmentData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00473c54-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class InteractionFragmentImpl extends ModelElementImpl implements InteractionFragment {
    @objid ("eb60dcbb-afeb-4de5-94d2-e77ba1422254")
    @Override
    public int getLineNumber() {
        return (Integer) getAttVal(InteractionFragmentData.Metadata.LineNumberAtt());
    }

    @objid ("103ef8ab-9c5c-44ed-8c85-07d54d084fa6")
    @Override
    public void setLineNumber(int value) {
        setAttVal(InteractionFragmentData.Metadata.LineNumberAtt(), value);
    }

    @objid ("aa0c41f6-bd8c-4ec9-b4d5-7b1d12dc6a62")
    @Override
    public InteractionOperand getEnclosingOperand() {
        return (InteractionOperand) getDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep());
    }

    @objid ("59c7dd1f-a942-4100-acb1-bd2ac91bc8d3")
    @Override
    public void setEnclosingOperand(InteractionOperand value) {
        appendDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep(), (SmObjectImpl)value);
    }

    @objid ("38a6ef64-60dc-40b4-a9e2-7bf2fbc62017")
    @Override
    public Interaction getEnclosingInteraction() {
        return (Interaction) getDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep());
    }

    @objid ("481b8e60-5ec1-4cd8-b37e-9d79d58c5533")
    @Override
    public void setEnclosingInteraction(Interaction value) {
        appendDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep(), (SmObjectImpl)value);
    }

    @objid ("17ceb230-3499-4940-8a30-d1740b049b9f")
    @Override
    public EList<Lifeline> getCovered() {
        return new SmList<>(this, InteractionFragmentData.Metadata.CoveredDep());
    }

    @objid ("b7535d79-d68b-4dd1-a713-6c5b4bbe7da1")
    @Override
    public <T extends Lifeline> List<T> getCovered(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Lifeline element : getCovered()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1c787229-f58e-42fb-8ee8-fcecf6314b64")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0697278e-10f5-43f8-9055-f9cc856da8ce")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep());
        if (obj != null)
          return new SmDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep());
        if (obj != null)
          return new SmDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0abf8651-a3f6-4734-8159-f939253f206c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionFragment(this);
        else
          return null;
    }

}
