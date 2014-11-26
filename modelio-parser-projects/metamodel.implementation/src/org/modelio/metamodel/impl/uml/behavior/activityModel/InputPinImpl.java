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
import org.modelio.metamodel.data.uml.behavior.activityModel.InputPinData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00353996-c4bf-1fd8-97fe-001ec947cd2a")
public class InputPinImpl extends PinImpl implements InputPin {
    @objid ("d1b2e685-0eeb-4448-83a2-2b58601772a4")
    @Override
    public boolean isIsSelf() {
        return (Boolean) getAttVal(InputPinData.Metadata.IsSelfAtt());
    }

    @objid ("8db701f8-eaec-4c46-b9d9-64c334af5726")
    @Override
    public void setIsSelf(boolean value) {
        setAttVal(InputPinData.Metadata.IsSelfAtt(), value);
    }

    @objid ("c7546618-0425-41e1-a594-a952de589e0c")
    @Override
    public EList<ExceptionHandler> getHandler() {
        return new SmList<>(this, InputPinData.Metadata.HandlerDep());
    }

    @objid ("ae56395f-6f3f-420b-9fe6-58e14149b5dd")
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

    @objid ("a1d9ed36-5421-45fa-b7a9-f048acb5a077")
    @Override
    public ActivityAction getInputing() {
        return (ActivityAction) getDepVal(InputPinData.Metadata.InputingDep());
    }

    @objid ("5c38ddbc-7e9f-438b-b072-ecdbd3464461")
    @Override
    public void setInputing(ActivityAction value) {
        appendDepVal(InputPinData.Metadata.InputingDep(), (SmObjectImpl)value);
    }

    @objid ("dff16a5b-b926-4dd7-8087-b847c16e0150")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InputPinData.Metadata.InputingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2344f240-282d-4206-a932-4ce350150d47")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InputPinData.Metadata.InputingDep());
        if (obj != null)
          return new SmDepVal(InputPinData.Metadata.InputingDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ac61040f-0692-41aa-bda4-6f7d66869871")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInputPin(this);
        else
          return null;
    }

}
