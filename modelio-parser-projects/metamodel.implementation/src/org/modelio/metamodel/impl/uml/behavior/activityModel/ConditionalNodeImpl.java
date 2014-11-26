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
import org.modelio.metamodel.data.uml.behavior.activityModel.ConditionalNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("002d81b0-c4bf-1fd8-97fe-001ec947cd2a")
public class ConditionalNodeImpl extends StructuredActivityNodeImpl implements ConditionalNode {
    @objid ("7fce2640-f3ee-480b-860c-4ca292d4da54")
    @Override
    public boolean isIsDeterminate() {
        return (Boolean) getAttVal(ConditionalNodeData.Metadata.IsDeterminateAtt());
    }

    @objid ("7ab80180-1c68-4c4d-9708-87a4254b6148")
    @Override
    public void setIsDeterminate(boolean value) {
        setAttVal(ConditionalNodeData.Metadata.IsDeterminateAtt(), value);
    }

    @objid ("dac82e28-beb1-4388-a57a-26209ea0e381")
    @Override
    public boolean isIsAssured() {
        return (Boolean) getAttVal(ConditionalNodeData.Metadata.IsAssuredAtt());
    }

    @objid ("17e38775-30ae-44ba-9352-88ccdfa93f47")
    @Override
    public void setIsAssured(boolean value) {
        setAttVal(ConditionalNodeData.Metadata.IsAssuredAtt(), value);
    }

    @objid ("170ec8a9-3e9c-4610-963c-f35e40d4a680")
    @Override
    public EList<Clause> getOwnedClause() {
        return new SmList<>(this, ConditionalNodeData.Metadata.OwnedClauseDep());
    }

    @objid ("c3835018-a7aa-4552-a37c-6a0924067b4f")
    @Override
    public <T extends Clause> List<T> getOwnedClause(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Clause element : getOwnedClause()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("efea2a24-0757-41d7-ac4c-0280c5118d8f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("497301f8-59a8-4e77-960c-c0565d38b5af")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("028be81c-5845-4c56-8eaa-bedbb3060aea")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConditionalNode(this);
        else
          return null;
    }

}
