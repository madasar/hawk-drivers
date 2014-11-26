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
import org.modelio.metamodel.data.uml.behavior.interactionModel.StateInvariantData;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("004bb34c-c4bf-1fd8-97fe-001ec947cd2a")
public class StateInvariantImpl extends OccurrenceSpecificationImpl implements StateInvariant {
    @objid ("3efc0d35-c58f-4295-b163-0f47c418f808")
    @Override
    public String getBody() {
        return (String) getAttVal(StateInvariantData.Metadata.BodyAtt());
    }

    @objid ("589cc076-1652-48b6-a6c7-c6fffb8152cb")
    @Override
    public void setBody(String value) {
        setAttVal(StateInvariantData.Metadata.BodyAtt(), value);
    }

    @objid ("ec38b2b2-b368-4aa3-8154-245f990e9fc3")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(StateInvariantData.Metadata.EndLineNumberAtt());
    }

    @objid ("735a9e22-c4c5-4d43-912f-34801616398b")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(StateInvariantData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("65d65be3-d29b-47d4-918c-02346187cf4c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c1a16585-c77a-4828-9e9c-c4de1cb9e243")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4bd1cd93-fbbf-4a4d-8168-cca11a951a1b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateInvariant(this);
        else
          return null;
    }

}
