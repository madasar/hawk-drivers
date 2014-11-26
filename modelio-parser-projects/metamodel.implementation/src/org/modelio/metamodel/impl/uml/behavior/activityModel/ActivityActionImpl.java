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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityActionData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0026b060-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityActionImpl extends ActivityNodeImpl implements ActivityAction {
    @objid ("43e0b122-79e0-418c-8873-42ae910fe11f")
    @Override
    public boolean isIsMultipleInstance() {
        return (Boolean) getAttVal(ActivityActionData.Metadata.IsMultipleInstanceAtt());
    }

    @objid ("20ad55e1-6f17-424b-b07f-e7b7f2e02542")
    @Override
    public void setIsMultipleInstance(boolean value) {
        setAttVal(ActivityActionData.Metadata.IsMultipleInstanceAtt(), value);
    }

    @objid ("2364f308-b027-4563-b646-1a4eccdb873a")
    @Override
    public boolean isIsCompensation() {
        return (Boolean) getAttVal(ActivityActionData.Metadata.IsCompensationAtt());
    }

    @objid ("d7a84351-ea8f-431e-baad-89889105d3ab")
    @Override
    public void setIsCompensation(boolean value) {
        setAttVal(ActivityActionData.Metadata.IsCompensationAtt(), value);
    }

    @objid ("ca72a2ac-4048-472c-aae7-8b3b261ce11b")
    @Override
    public EList<OutputPin> getOutput() {
        return new SmList<>(this, ActivityActionData.Metadata.OutputDep());
    }

    @objid ("2b273afd-6112-4aa0-817a-919af946bb9e")
    @Override
    public <T extends OutputPin> List<T> getOutput(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final OutputPin element : getOutput()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d8d071ec-f377-470c-9bd7-9fc4ff3324f3")
    @Override
    public EList<InputPin> getInput() {
        return new SmList<>(this, ActivityActionData.Metadata.InputDep());
    }

    @objid ("7ccbd123-306f-4c33-9dd4-49ca9a78acc0")
    @Override
    public <T extends InputPin> List<T> getInput(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InputPin element : getInput()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("aa292a76-1891-4679-b1e7-02ecb2aa1143")
    @Override
    public EList<ExceptionHandler> getHandler() {
        return new SmList<>(this, ActivityActionData.Metadata.HandlerDep());
    }

    @objid ("aa2d395b-20bb-45a8-aece-f29da53beea3")
    @Override
    public <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExceptionHandler element : getHandler()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("98a72151-71b4-4484-8f3b-28b865370288")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("252c4951-9f78-464a-806f-8161ecf25b2f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("6bcbe9aa-26cb-4ed8-b759-9021288a5b52")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityAction(this);
        else
          return null;
    }

}
