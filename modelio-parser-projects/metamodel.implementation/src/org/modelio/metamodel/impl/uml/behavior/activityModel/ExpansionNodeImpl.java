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
import org.modelio.metamodel.data.uml.behavior.activityModel.ExpansionNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00314c5a-c4bf-1fd8-97fe-001ec947cd2a")
public class ExpansionNodeImpl extends ObjectNodeImpl implements ExpansionNode {
    @objid ("f0af4eae-e6b4-40da-9ff6-c3e1efcf1a67")
    @Override
    public ExpansionRegion getRegionAsOutput() {
        return (ExpansionRegion) getDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep());
    }

    @objid ("5735c400-4777-494e-8004-927a2c675ecb")
    @Override
    public void setRegionAsOutput(ExpansionRegion value) {
        appendDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep(), (SmObjectImpl)value);
    }

    @objid ("a7cacb9c-fe98-4132-b458-16201debdd39")
    @Override
    public ExpansionRegion getRegionAsInput() {
        return (ExpansionRegion) getDepVal(ExpansionNodeData.Metadata.RegionAsInputDep());
    }

    @objid ("1537528a-42f0-4ac9-918d-3c79b0f83007")
    @Override
    public void setRegionAsInput(ExpansionRegion value) {
        appendDepVal(ExpansionNodeData.Metadata.RegionAsInputDep(), (SmObjectImpl)value);
    }

    @objid ("0e7707f7-70c3-47d7-9c17-c09adab07a9e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ExpansionNodeData.Metadata.RegionAsInputDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("180f20ac-880e-41eb-8757-372e69c187e5")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep());
        if (obj != null)
          return new SmDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ExpansionNodeData.Metadata.RegionAsInputDep());
        if (obj != null)
          return new SmDepVal(ExpansionNodeData.Metadata.RegionAsInputDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c6c481d8-d9e9-4a4d-8952-7ffb6182210f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExpansionNode(this);
        else
          return null;
    }

}
