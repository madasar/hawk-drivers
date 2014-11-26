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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.data.bpmn.events.BpmnBoundaryEventData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008790d8-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnBoundaryEventImpl extends BpmnCatchEventImpl implements BpmnBoundaryEvent {
    @objid ("7b2707c5-d06a-4919-b7fc-4f481f3fe0c9")
    @Override
    public boolean isCancelActivity() {
        return (Boolean) getAttVal(BpmnBoundaryEventData.Metadata.CancelActivityAtt());
    }

    @objid ("d368f406-0b3e-4995-9980-6ebcdd15cb5c")
    @Override
    public void setCancelActivity(boolean value) {
        setAttVal(BpmnBoundaryEventData.Metadata.CancelActivityAtt(), value);
    }

    @objid ("ef15735e-0b67-4e6d-8825-904511a29939")
    @Override
    public BpmnActivity getAttachedToRef() {
        return (BpmnActivity) getDepVal(BpmnBoundaryEventData.Metadata.AttachedToRefDep());
    }

    @objid ("d7fc3a73-b6b3-470a-a417-2d4b4519b6ae")
    @Override
    public void setAttachedToRef(BpmnActivity value) {
        appendDepVal(BpmnBoundaryEventData.Metadata.AttachedToRefDep(), (SmObjectImpl)value);
    }

    @objid ("e4610a35-785d-4247-995f-a5ccceb343a7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("71819ec8-3959-4dbe-854c-6319ef6885aa")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("a101a316-286d-402d-b2b6-e6a140574e68")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnBoundaryEvent(this);
        else
          return null;
    }

}
