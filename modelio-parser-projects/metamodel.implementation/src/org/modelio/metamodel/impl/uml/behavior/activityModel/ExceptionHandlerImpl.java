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
import org.modelio.metamodel.data.uml.behavior.activityModel.ExceptionHandlerData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0030ab7e-c4bf-1fd8-97fe-001ec947cd2a")
public class ExceptionHandlerImpl extends ModelElementImpl implements ExceptionHandler {
    @objid ("71429c68-7b9b-4cea-afc3-9b958257e9b0")
    @Override
    public String getGuard() {
        return (String) getAttVal(ExceptionHandlerData.Metadata.GuardAtt());
    }

    @objid ("54a60b26-a0ee-4506-91d4-4af6ecaf068b")
    @Override
    public void setGuard(String value) {
        setAttVal(ExceptionHandlerData.Metadata.GuardAtt(), value);
    }

    @objid ("a90a15a4-e366-40c8-a0bc-e23c9a8d9732")
    @Override
    public String getWeight() {
        return (String) getAttVal(ExceptionHandlerData.Metadata.WeightAtt());
    }

    @objid ("accaf99e-f9cf-48d1-be9e-07cdfca5a2a0")
    @Override
    public void setWeight(String value) {
        setAttVal(ExceptionHandlerData.Metadata.WeightAtt(), value);
    }

    @objid ("5523c00c-8ace-40b0-a07f-7e6898d48233")
    @Override
    public ActivityAction getProtectedNode() {
        return (ActivityAction) getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
    }

    @objid ("55fb6531-3cb8-4eab-8bdb-fd6a36047766")
    @Override
    public void setProtectedNode(ActivityAction value) {
        appendDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep(), (SmObjectImpl)value);
    }

    @objid ("a85a2c3c-314c-45e0-ad54-7091e4a93a10")
    @Override
    public InputPin getExceptionInput() {
        return (InputPin) getDepVal(ExceptionHandlerData.Metadata.ExceptionInputDep());
    }

    @objid ("ad8b4703-6a7b-41f7-8eb3-de038a3861eb")
    @Override
    public void setExceptionInput(InputPin value) {
        appendDepVal(ExceptionHandlerData.Metadata.ExceptionInputDep(), (SmObjectImpl)value);
    }

    @objid ("51b642ab-5d44-4937-9834-9c6a4ab6043a")
    @Override
    public EList<GeneralClass> getExceptionType() {
        return new SmList<>(this, ExceptionHandlerData.Metadata.ExceptionTypeDep());
    }

    @objid ("bc83f8a4-19af-4746-a9b6-005ca435b4ab")
    @Override
    public <T extends GeneralClass> List<T> getExceptionType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GeneralClass element : getExceptionType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2ccd03ea-7c52-4f5d-b076-7a104e4f0f48")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("766b2164-bcfa-4941-8700-299ec1178348")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
        if (obj != null)
          return new SmDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("125038e6-eae1-494a-8dd9-8c9d18ed783a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExceptionHandler(this);
        else
          return null;
    }

}
