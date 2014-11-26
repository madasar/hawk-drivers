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
import org.modelio.metamodel.data.uml.behavior.activityModel.PinData;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("003cae42-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class PinImpl extends ObjectNodeImpl implements Pin {
    @objid ("c04af8ec-fd3d-4770-9e1f-935bf5bbdc29")
    @Override
    public boolean isIsControl() {
        return (Boolean) getAttVal(PinData.Metadata.IsControlAtt());
    }

    @objid ("2da37939-1f2f-4c6a-b03c-331825e13470")
    @Override
    public void setIsControl(boolean value) {
        setAttVal(PinData.Metadata.IsControlAtt(), value);
    }

    @objid ("1bfe5a90-5ddb-4baf-987c-1fd9f4128fb8")
    @Override
    public boolean isIsExpansion() {
        return (Boolean) getAttVal(PinData.Metadata.IsExpansionAtt());
    }

    @objid ("d8248465-e539-4749-94aa-7522d1e29ea6")
    @Override
    public void setIsExpansion(boolean value) {
        setAttVal(PinData.Metadata.IsExpansionAtt(), value);
    }

    @objid ("ca39d5f7-45b1-4611-8ef6-08a3d687c558")
    @Override
    public Parameter getMatched() {
        return (Parameter) getDepVal(PinData.Metadata.MatchedDep());
    }

    @objid ("aa25fb05-0500-42e8-8196-fe77a05bc4ff")
    @Override
    public void setMatched(Parameter value) {
        appendDepVal(PinData.Metadata.MatchedDep(), (SmObjectImpl)value);
    }

    @objid ("56e734e2-5651-45eb-a4f1-3fd9707e7786")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6c935b50-4cdd-4c6e-8abd-b6c5b7ff21fa")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1581949f-7ad1-488c-b252-865b933c0b00")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPin(this);
        else
          return null;
    }

}
