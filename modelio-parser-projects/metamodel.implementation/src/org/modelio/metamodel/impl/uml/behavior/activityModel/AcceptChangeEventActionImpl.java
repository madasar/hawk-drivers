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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.AcceptChangeEventActionData;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptChangeEventAction;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0024ba8a-c4bf-1fd8-97fe-001ec947cd2a")
public class AcceptChangeEventActionImpl extends ActivityActionImpl implements AcceptChangeEventAction {
    @objid ("58c82c26-576f-4798-a8b3-3b530c7f2f95")
    @Override
    public String getChangeExpresion() {
        return (String) getAttVal(AcceptChangeEventActionData.Metadata.ChangeExpresionAtt());
    }

    @objid ("06f40289-27d5-4b3c-ad2e-acbeb1b9f8e3")
    @Override
    public void setChangeExpresion(String value) {
        setAttVal(AcceptChangeEventActionData.Metadata.ChangeExpresionAtt(), value);
    }

    @objid ("c1fb8a22-5613-4aa5-9fe3-a74b3c2315be")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3a0a0c45-db7d-4024-87f7-4b2bafa466f3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("771e7e5c-d503-49c3-9d4a-fa4082c098a0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAcceptChangeEventAction(this);
        else
          return null;
    }

}
