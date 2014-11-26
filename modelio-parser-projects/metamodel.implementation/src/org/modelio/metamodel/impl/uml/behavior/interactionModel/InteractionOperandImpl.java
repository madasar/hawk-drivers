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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionOperandData;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0047c124-c4bf-1fd8-97fe-001ec947cd2a")
public class InteractionOperandImpl extends InteractionFragmentImpl implements InteractionOperand {
    @objid ("7e47f090-8300-40c7-bb9a-073ae2a61e75")
    @Override
    public String getGuard() {
        return (String) getAttVal(InteractionOperandData.Metadata.GuardAtt());
    }

    @objid ("7ff46fdb-c8fa-4ec5-93c8-87872f9fb37e")
    @Override
    public void setGuard(String value) {
        setAttVal(InteractionOperandData.Metadata.GuardAtt(), value);
    }

    @objid ("6d41d666-ac50-40dc-b4d0-3f7c5f4856aa")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(InteractionOperandData.Metadata.EndLineNumberAtt());
    }

    @objid ("dcd203a9-02ff-4d6b-9db8-5d32f8860860")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(InteractionOperandData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("fd5a49ff-ee3c-4c9b-bb19-8658ed3484bc")
    @Override
    public EList<InteractionFragment> getFragment() {
        return new SmList<>(this, InteractionOperandData.Metadata.FragmentDep());
    }

    @objid ("6469b3c6-07c6-46f8-b78a-746cd3030c6b")
    @Override
    public <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InteractionFragment element : getFragment()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("71ee9be5-78e4-4059-843f-c268099058ee")
    @Override
    public CombinedFragment getOwnerFragment() {
        return (CombinedFragment) getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
    }

    @objid ("2f1f29b4-3a75-456b-baf4-fd5dceea283d")
    @Override
    public void setOwnerFragment(CombinedFragment value) {
        appendDepVal(InteractionOperandData.Metadata.OwnerFragmentDep(), (SmObjectImpl)value);
    }

    @objid ("7736479b-9103-400c-8058-97e873a54c4e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ae6a54f4-51ba-48ba-afd2-f1d9ff9eadeb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return new SmDepVal(InteractionOperandData.Metadata.OwnerFragmentDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f5c06812-37c4-48c0-99ae-3796b36500c5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionOperand(this);
        else
          return null;
    }

}
