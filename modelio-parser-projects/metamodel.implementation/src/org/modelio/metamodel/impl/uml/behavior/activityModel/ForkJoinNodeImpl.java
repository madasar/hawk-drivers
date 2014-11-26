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
import org.modelio.metamodel.data.uml.behavior.activityModel.ForkJoinNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0033e794-c4bf-1fd8-97fe-001ec947cd2a")
public class ForkJoinNodeImpl extends ControlNodeImpl implements ForkJoinNode {
    @objid ("89c3d540-2ff8-48ce-9171-4f0556bb4cf9")
    @Override
    public boolean isIsCombineDuplicate() {
        return (Boolean) getAttVal(ForkJoinNodeData.Metadata.IsCombineDuplicateAtt());
    }

    @objid ("77bfc5f1-93dc-440b-8e1f-499a97b3ea12")
    @Override
    public void setIsCombineDuplicate(boolean value) {
        setAttVal(ForkJoinNodeData.Metadata.IsCombineDuplicateAtt(), value);
    }

    @objid ("cfbc8cc7-94b0-4bb3-a0fb-1974b116c1bf")
    @Override
    public String getJoinSpec() {
        return (String) getAttVal(ForkJoinNodeData.Metadata.JoinSpecAtt());
    }

    @objid ("8db636ac-2725-41cf-827e-417e5f8aaf64")
    @Override
    public void setJoinSpec(String value) {
        setAttVal(ForkJoinNodeData.Metadata.JoinSpecAtt(), value);
    }

    @objid ("1d6940f7-e667-4ef4-9b93-a9285e555162")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("cd8817d9-0185-4703-8b78-1538d184c893")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("10220297-e3ee-4a6c-8882-e509966a2b41")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitForkJoinNode(this);
        else
          return null;
    }

}
