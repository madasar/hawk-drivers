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
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNodeOrderingKind;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00397a06-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ObjectNodeImpl extends ActivityNodeImpl implements ObjectNode {
    @objid ("8ca5ec96-33d5-47bb-9f84-295b411353c7")
    @Override
    public boolean isIsControlType() {
        return (Boolean) getAttVal(ObjectNodeData.Metadata.IsControlTypeAtt());
    }

    @objid ("c679be39-cb88-463e-ac70-cadc6a9eac2f")
    @Override
    public void setIsControlType(boolean value) {
        setAttVal(ObjectNodeData.Metadata.IsControlTypeAtt(), value);
    }

    @objid ("c6e20617-a395-4ddf-a173-d96918476366")
    @Override
    public ObjectNodeOrderingKind getOrdering() {
        return (ObjectNodeOrderingKind) getAttVal(ObjectNodeData.Metadata.OrderingAtt());
    }

    @objid ("faa9ea7e-c510-410e-8085-0a3d70bff0bb")
    @Override
    public void setOrdering(ObjectNodeOrderingKind value) {
        setAttVal(ObjectNodeData.Metadata.OrderingAtt(), value);
    }

    @objid ("078fdb0a-3536-41f2-b800-ac98d79a9e15")
    @Override
    public String getSelectionBehavior() {
        return (String) getAttVal(ObjectNodeData.Metadata.SelectionBehaviorAtt());
    }

    @objid ("1e1df25a-546a-4c31-a8b2-39f38c9eb010")
    @Override
    public void setSelectionBehavior(String value) {
        setAttVal(ObjectNodeData.Metadata.SelectionBehaviorAtt(), value);
    }

    @objid ("517665d8-1d1e-4c2d-9773-d8a48a1f20e1")
    @Override
    public String getUpperBound() {
        return (String) getAttVal(ObjectNodeData.Metadata.UpperBoundAtt());
    }

    @objid ("8ab472a4-4e96-4905-aef6-cdb015a88041")
    @Override
    public void setUpperBound(String value) {
        setAttVal(ObjectNodeData.Metadata.UpperBoundAtt(), value);
    }

    @objid ("5644e752-c5f7-4d6b-8e61-4c2cdc9b0832")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(ObjectNodeData.Metadata.RepresentedDep());
    }

    @objid ("d67554ff-fb9c-40ef-8b79-55a4a451ba1e")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("02ef14e6-ab28-4969-8537-e890c03d4489")
    @Override
    public BehaviorParameter getRepresentedRealParameter() {
        return (BehaviorParameter) getDepVal(ObjectNodeData.Metadata.RepresentedRealParameterDep());
    }

    @objid ("f6e86639-fa1f-4cd6-9c4c-642311016a9a")
    @Override
    public void setRepresentedRealParameter(BehaviorParameter value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedRealParameterDep(), (SmObjectImpl)value);
    }

    @objid ("7b74281a-ab10-4b5e-96b7-7fde9a560812")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ObjectNodeData.Metadata.TypeDep());
    }

    @objid ("438df2d1-8356-49d0-b8f9-8c3588d9678c")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ObjectNodeData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("191f3179-78e7-421b-8c67-1ef3f2e21b7c")
    @Override
    public AssociationEnd getRepresentedRole() {
        return (AssociationEnd) getDepVal(ObjectNodeData.Metadata.RepresentedRoleDep());
    }

    @objid ("7fa39a7a-6e40-45d3-a480-f4fb0836f971")
    @Override
    public void setRepresentedRole(AssociationEnd value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedRoleDep(), (SmObjectImpl)value);
    }

    @objid ("34f4ca92-6014-4993-b869-1662f9abe28e")
    @Override
    public Attribute getRepresentedAttribute() {
        return (Attribute) getDepVal(ObjectNodeData.Metadata.RepresentedAttributeDep());
    }

    @objid ("b26b7860-e1f3-4eca-b9b5-25e48de19341")
    @Override
    public void setRepresentedAttribute(Attribute value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedAttributeDep(), (SmObjectImpl)value);
    }

    @objid ("928e2ed8-248b-4cc5-a747-b76cb8497e33")
    @Override
    public State getInState() {
        return (State) getDepVal(ObjectNodeData.Metadata.InStateDep());
    }

    @objid ("ed74d515-eba6-4a93-bb56-62b193c00b5e")
    @Override
    public void setInState(State value) {
        appendDepVal(ObjectNodeData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("97159acf-42ee-4874-a8e7-91e530438c41")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6f22e6ed-5efb-44f8-961e-50c34b15e9fc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("0cacf72d-1d63-4f9e-8f7b-20a1cc817abb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitObjectNode(this);
        else
          return null;
    }

}
