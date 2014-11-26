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
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageEndData;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0049f7c8-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class MessageEndImpl extends OccurrenceSpecificationImpl implements MessageEnd {
    @objid ("eca24a5e-ba80-4ec1-9a3c-77c0a7e0a7a4")
    @Override
    public Message getReceivedMessage() {
        return (Message) getDepVal(MessageEndData.Metadata.ReceivedMessageDep());
    }

    @objid ("bfa5ceb4-3d0a-42a9-8e74-30bcedc1fdd9")
    @Override
    public void setReceivedMessage(Message value) {
        appendDepVal(MessageEndData.Metadata.ReceivedMessageDep(), (SmObjectImpl)value);
    }

    @objid ("9ae64bb6-b07b-4acd-9125-c667feda9261")
    @Override
    public Message getSentMessage() {
        return (Message) getDepVal(MessageEndData.Metadata.SentMessageDep());
    }

    @objid ("d10b9911-7d17-4169-9f30-130a9d41c61f")
    @Override
    public void setSentMessage(Message value) {
        appendDepVal(MessageEndData.Metadata.SentMessageDep(), (SmObjectImpl)value);
    }

    @objid ("82e2006c-c77c-44de-b1e5-2f1dcc378be5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a5a49f47-c9ca-431a-bb55-193a8c70acb2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1c1e2253-56a1-4ee0-83f3-feb350283355")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessageEnd(this);
        else
          return null;
    }

}
