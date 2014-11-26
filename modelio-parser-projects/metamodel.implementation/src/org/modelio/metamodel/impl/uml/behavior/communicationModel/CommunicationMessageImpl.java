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
package org.modelio.metamodel.impl.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
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

@objid ("005b2ef8-c4bf-1fd8-97fe-001ec947cd2a")
public class CommunicationMessageImpl extends ModelElementImpl implements CommunicationMessage {
    @objid ("183370fd-f503-47e6-a4e5-85f698c4d9f2")
    @Override
    public String getArgument() {
        return (String) getAttVal(CommunicationMessageData.Metadata.ArgumentAtt());
    }

    @objid ("04eed6c8-9d34-4b49-b785-3caac455c9a2")
    @Override
    public void setArgument(String value) {
        setAttVal(CommunicationMessageData.Metadata.ArgumentAtt(), value);
    }

    @objid ("93734652-7cbe-4aef-8b3c-48d10e2b5366")
    @Override
    public String getSequence() {
        return (String) getAttVal(CommunicationMessageData.Metadata.SequenceAtt());
    }

    @objid ("877da5fa-8a5e-4b37-84e2-283eb2768860")
    @Override
    public void setSequence(String value) {
        setAttVal(CommunicationMessageData.Metadata.SequenceAtt(), value);
    }

    @objid ("2d73345d-c2cc-441c-bf4b-eacbae9878ba")
    @Override
    public MessageSort getSortOfMessage() {
        return (MessageSort) getAttVal(CommunicationMessageData.Metadata.SortOfMessageAtt());
    }

    @objid ("9e9c13ff-70e2-4057-a919-98124dd42229")
    @Override
    public void setSortOfMessage(MessageSort value) {
        setAttVal(CommunicationMessageData.Metadata.SortOfMessageAtt(), value);
    }

    @objid ("53a749dc-58a2-45c7-9baf-71682ed7a9d2")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, CommunicationMessageData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("ff8502ff-11fb-48f2-9f0e-456c6fef08a8")
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

    @objid ("1debf6a4-c187-4325-aa38-603045515682")
    @Override
    public CommunicationChannel getChannel() {
        return (CommunicationChannel) getDepVal(CommunicationMessageData.Metadata.ChannelDep());
    }

    @objid ("571ae8f2-8e7d-42df-8f96-5070cd298e62")
    @Override
    public void setChannel(CommunicationChannel value) {
        appendDepVal(CommunicationMessageData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("9b94cadb-90e2-4d79-9c05-c1e791aaf5b8")
    @Override
    public CommunicationChannel getInvertedChannel() {
        return (CommunicationChannel) getDepVal(CommunicationMessageData.Metadata.InvertedChannelDep());
    }

    @objid ("15ba4069-199a-4b8c-a515-a8eef2e1d076")
    @Override
    public void setInvertedChannel(CommunicationChannel value) {
        appendDepVal(CommunicationMessageData.Metadata.InvertedChannelDep(), (SmObjectImpl)value);
    }

    @objid ("6be6eeb3-ebe1-4924-9c59-e7194b9b33fa")
    @Override
    public Operation getInvoked() {
        return (Operation) getDepVal(CommunicationMessageData.Metadata.InvokedDep());
    }

    @objid ("afefc449-35a3-4fe4-930a-5b71ba1e3b02")
    @Override
    public void setInvoked(Operation value) {
        appendDepVal(CommunicationMessageData.Metadata.InvokedDep(), (SmObjectImpl)value);
    }

    @objid ("24f190f8-5a7e-446b-aaa1-8f6b47a021d9")
    @Override
    public Signal getSignalSignature() {
        return (Signal) getDepVal(CommunicationMessageData.Metadata.SignalSignatureDep());
    }

    @objid ("0de809e1-328c-4a07-8714-691e8956eeb2")
    @Override
    public void setSignalSignature(Signal value) {
        appendDepVal(CommunicationMessageData.Metadata.SignalSignatureDep(), (SmObjectImpl)value);
    }

    @objid ("3b77e540-a418-40b3-80e1-33a34d5c64b3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationMessageData.Metadata.ChannelDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationMessageData.Metadata.InvertedChannelDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d0f00e70-02a9-4896-9747-c993b2d5774a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationMessageData.Metadata.ChannelDep());
        if (obj != null)
          return new SmDepVal(CommunicationMessageData.Metadata.ChannelDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(CommunicationMessageData.Metadata.InvertedChannelDep());
        if (obj != null)
          return new SmDepVal(CommunicationMessageData.Metadata.InvertedChannelDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("6154fb68-b4ef-4ffc-b3eb-adfaf0b05a3e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationMessage(this);
        else
          return null;
    }

}
