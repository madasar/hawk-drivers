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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageKind;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00496c04-c4bf-1fd8-97fe-001ec947cd2a")
public class MessageImpl extends ModelElementImpl implements Message {
    @objid ("10440e6c-594a-4b0d-b0dc-6d432be1c14c")
    @Override
    public String getArgument() {
        return (String) getAttVal(MessageData.Metadata.ArgumentAtt());
    }

    @objid ("6a154dd1-ab0b-4f39-8dbb-e5b092dc14f8")
    @Override
    public void setArgument(String value) {
        setAttVal(MessageData.Metadata.ArgumentAtt(), value);
    }

    @objid ("13436d0a-3249-4e86-9242-9829bca40763")
    @Override
    public MessageKind getKindOfMessage() {
        return (MessageKind) getAttVal(MessageData.Metadata.KindOfMessageAtt());
    }

    @objid ("125ce430-ef4c-4978-a2fa-697c1a9e78d7")
    @Override
    public void setKindOfMessage(MessageKind value) {
        setAttVal(MessageData.Metadata.KindOfMessageAtt(), value);
    }

    @objid ("09cd8e41-79ad-4f66-bb01-4a20c3bcb418")
    @Override
    public MessageSort getSortOfMessage() {
        return (MessageSort) getAttVal(MessageData.Metadata.SortOfMessageAtt());
    }

    @objid ("5d8a2613-f508-4ab4-a4ea-d9d06f602180")
    @Override
    public void setSortOfMessage(MessageSort value) {
        setAttVal(MessageData.Metadata.SortOfMessageAtt(), value);
    }

    @objid ("0f049eea-9ff6-429a-928d-b81fdc6c81a9")
    @Override
    public Signal getSignalSignature() {
        return (Signal) getDepVal(MessageData.Metadata.SignalSignatureDep());
    }

    @objid ("ab563c9a-e628-4e17-b99d-42facb11efa9")
    @Override
    public void setSignalSignature(Signal value) {
        appendDepVal(MessageData.Metadata.SignalSignatureDep(), (SmObjectImpl)value);
    }

    @objid ("d5eddbd7-0dc2-4558-838c-f72369596bfa")
    @Override
    public MessageEnd getReceiveEvent() {
        return (MessageEnd) getDepVal(MessageData.Metadata.ReceiveEventDep());
    }

    @objid ("83d6108a-5b9f-4ed3-94fd-2b626b4e6e15")
    @Override
    public void setReceiveEvent(MessageEnd value) {
        appendDepVal(MessageData.Metadata.ReceiveEventDep(), (SmObjectImpl)value);
    }

    @objid ("042af4e6-4d16-49fd-add0-faa99eddfe66")
    @Override
    public MessageEnd getSendEvent() {
        return (MessageEnd) getDepVal(MessageData.Metadata.SendEventDep());
    }

    @objid ("752c8da2-47ac-45a4-8761-98cfc353574a")
    @Override
    public void setSendEvent(MessageEnd value) {
        appendDepVal(MessageData.Metadata.SendEventDep(), (SmObjectImpl)value);
    }

    @objid ("3baf2aee-8a71-4e1a-a5ed-737b591f5bcb")
    @Override
    public Operation getInvoked() {
        return (Operation) getDepVal(MessageData.Metadata.InvokedDep());
    }

    @objid ("996215dd-941b-47d7-aefd-71aae6c2b590")
    @Override
    public void setInvoked(Operation value) {
        appendDepVal(MessageData.Metadata.InvokedDep(), (SmObjectImpl)value);
    }

    @objid ("3f423ab7-8f90-41d5-9a52-4accb9b90753")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, MessageData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("03d07e52-aedc-4a20-9571-ddecf8210b11")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getRealizedInformationFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3d9e4479-9ddb-42b6-95e4-42c34cc9bda5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageData.Metadata.SendEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("231f1ba5-ed7f-495a-8120-e6d8fa6e79e0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageData.Metadata.SendEventDep());
        if (obj != null)
          return new SmDepVal(MessageData.Metadata.SendEventDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a941bcfb-dfbd-4461-a2ae-b906c217d37c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessage(this);
        else
          return null;
    }

}
