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
import org.modelio.metamodel.data.uml.behavior.activityModel.ClauseData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
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

@objid ("002cec14-c4bf-1fd8-97fe-001ec947cd2a")
public class ClauseImpl extends ModelElementImpl implements Clause {
    @objid ("b069d9ab-e4aa-426d-a8e6-057b72e26833")
    @Override
    public String getTest() {
        return (String) getAttVal(ClauseData.Metadata.TestAtt());
    }

    @objid ("175e6836-05c0-4ee6-b0ec-e69505699b81")
    @Override
    public void setTest(String value) {
        setAttVal(ClauseData.Metadata.TestAtt(), value);
    }

    @objid ("05010d55-5947-4f49-a722-4e0d4cd70487")
    @Override
    public EList<ActivityNode> getBody() {
        return new SmList<>(this, ClauseData.Metadata.BodyDep());
    }

    @objid ("7729a0bb-dbb7-4ac6-9a3d-5f144653f597")
    @Override
    public <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityNode element : getBody()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8ab8b263-56c2-4dcf-b94b-a7d5f9defd90")
    @Override
    public ConditionalNode getOwner() {
        return (ConditionalNode) getDepVal(ClauseData.Metadata.OwnerDep());
    }

    @objid ("14d322d6-bfc7-4b26-9288-e78db45db1f6")
    @Override
    public void setOwner(ConditionalNode value) {
        appendDepVal(ClauseData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("5efc8ed0-5fe3-4ee1-869a-173dadf73d43")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClauseData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9d783e73-10e2-49ec-b8c4-1f24ad914ce1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClauseData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ClauseData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("dd3cd3eb-4c02-40ba-a283-fb9180e968ab")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClause(this);
        else
          return null;
    }

}
