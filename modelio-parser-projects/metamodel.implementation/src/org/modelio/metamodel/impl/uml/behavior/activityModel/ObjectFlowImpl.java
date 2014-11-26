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
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectFlowData;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0038c502-c4bf-1fd8-97fe-001ec947cd2a")
public class ObjectFlowImpl extends ActivityEdgeImpl implements ObjectFlow {
    @objid ("a769e63a-27a9-41e6-9a11-2cf77ca75680")
    @Override
    public String getTransformationBehavior() {
        return (String) getAttVal(ObjectFlowData.Metadata.TransformationBehaviorAtt());
    }

    @objid ("18dfecdd-d54c-47d8-9dc1-a318f7b59471")
    @Override
    public void setTransformationBehavior(String value) {
        setAttVal(ObjectFlowData.Metadata.TransformationBehaviorAtt(), value);
    }

    @objid ("78d6a875-d1a7-42ba-b1a2-6fc4dd752697")
    @Override
    public String getSelectionBehavior() {
        return (String) getAttVal(ObjectFlowData.Metadata.SelectionBehaviorAtt());
    }

    @objid ("885fbe7a-6d9b-48b5-8e35-365a65ac3f24")
    @Override
    public void setSelectionBehavior(String value) {
        setAttVal(ObjectFlowData.Metadata.SelectionBehaviorAtt(), value);
    }

    @objid ("ed62ef8a-069e-438d-a956-b5d0933997df")
    @Override
    public boolean isIsMultiCast() {
        return (Boolean) getAttVal(ObjectFlowData.Metadata.IsMultiCastAtt());
    }

    @objid ("8338c936-db2c-4fbf-bb5d-1816c24e3176")
    @Override
    public void setIsMultiCast(boolean value) {
        setAttVal(ObjectFlowData.Metadata.IsMultiCastAtt(), value);
    }

    @objid ("5c6ebd7f-3e29-44ea-b527-803d2febb564")
    @Override
    public boolean isIsMultiReceive() {
        return (Boolean) getAttVal(ObjectFlowData.Metadata.IsMultiReceiveAtt());
    }

    @objid ("de37dfad-ee13-4afb-a5fa-6419eb589a2c")
    @Override
    public void setIsMultiReceive(boolean value) {
        setAttVal(ObjectFlowData.Metadata.IsMultiReceiveAtt(), value);
    }

    @objid ("bbb77acd-7c3f-4cd9-90f8-6ba861d1c583")
    @Override
    public ObjectFlowEffectKind getEffect() {
        return (ObjectFlowEffectKind) getAttVal(ObjectFlowData.Metadata.EffectAtt());
    }

    @objid ("1a3fd911-7ac5-4864-a732-ddbfc18f3492")
    @Override
    public void setEffect(ObjectFlowEffectKind value) {
        setAttVal(ObjectFlowData.Metadata.EffectAtt(), value);
    }

    @objid ("52d254ab-7408-46e4-bd85-169576125871")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("177e7ec2-7035-4ea8-be1e-ecbf85b0670c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("5153900c-454f-4dba-af3d-6861ff01e581")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitObjectFlow(this);
        else
          return null;
    }

}
