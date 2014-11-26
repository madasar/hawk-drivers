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
import org.modelio.metamodel.data.uml.behavior.activityModel.DecisionMergeNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionMergeNode;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionNodeKind;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("002ff30a-c4bf-1fd8-97fe-001ec947cd2a")
public class DecisionMergeNodeImpl extends ControlNodeImpl implements DecisionMergeNode {
    @objid ("30c694da-18d2-48ce-b323-14cdd5d0b0dd")
    @Override
    public DecisionNodeKind getDecisionKind() {
        return (DecisionNodeKind) getAttVal(DecisionMergeNodeData.Metadata.DecisionKindAtt());
    }

    @objid ("ca744ba2-a898-4e1e-98b4-b34c6c3e5b2f")
    @Override
    public void setDecisionKind(DecisionNodeKind value) {
        setAttVal(DecisionMergeNodeData.Metadata.DecisionKindAtt(), value);
    }

    @objid ("2afdeaae-a48c-4cec-a873-54b63fc04349")
    @Override
    public String getDecisionInputBehavior() {
        return (String) getAttVal(DecisionMergeNodeData.Metadata.DecisionInputBehaviorAtt());
    }

    @objid ("a6522a3e-714e-49ec-a5b1-ca3171acc604")
    @Override
    public void setDecisionInputBehavior(String value) {
        setAttVal(DecisionMergeNodeData.Metadata.DecisionInputBehaviorAtt(), value);
    }

    @objid ("4b138b5a-495e-40c3-82a8-f71f41901002")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("0016e98f-7488-44d3-bfd4-7ac5cf0d08ee")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2c263620-dad8-47de-a663-771ebd738487")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDecisionMergeNode(this);
        else
          return null;
    }

}
