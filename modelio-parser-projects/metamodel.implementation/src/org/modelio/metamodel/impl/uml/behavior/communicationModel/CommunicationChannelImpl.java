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
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("3d66beff-bc9e-42aa-84dd-28f34e3a9a10")
public class CommunicationChannelImpl extends ModelElementImpl implements CommunicationChannel {
    @objid ("015508fb-c250-4dd1-a38b-a99e209a5737")
    @Override
    public EList<CommunicationMessage> getStartToEndMessage() {
        return new SmList<>(this, CommunicationChannelData.Metadata.StartToEndMessageDep());
    }

    @objid ("1dcd1ba3-8feb-49b1-b2af-f760bed0c552")
    @Override
    public <T extends CommunicationMessage> List<T> getStartToEndMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationMessage element : getStartToEndMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("dc657ab9-02d0-49a7-b29b-675ae925ce5f")
    @Override
    public Link getChannel() {
        return (Link) getDepVal(CommunicationChannelData.Metadata.ChannelDep());
    }

    @objid ("1905dec6-dd03-415e-bcc3-ef88df013a58")
    @Override
    public void setChannel(Link value) {
        appendDepVal(CommunicationChannelData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("3fda1ed6-d4cd-4b09-a152-4f65dfa2660b")
    @Override
    public CommunicationNode getStart() {
        return (CommunicationNode) getDepVal(CommunicationChannelData.Metadata.StartDep());
    }

    @objid ("974f066e-f0ff-4558-ba06-68bc34605954")
    @Override
    public void setStart(CommunicationNode value) {
        appendDepVal(CommunicationChannelData.Metadata.StartDep(), (SmObjectImpl)value);
    }

    @objid ("cb3de03b-ec83-4c7a-a78a-e115b3e3674f")
    @Override
    public NaryLink getNaryChannel() {
        return (NaryLink) getDepVal(CommunicationChannelData.Metadata.NaryChannelDep());
    }

    @objid ("7f3e2e77-2eba-42aa-bdc5-287374e940d3")
    @Override
    public void setNaryChannel(NaryLink value) {
        appendDepVal(CommunicationChannelData.Metadata.NaryChannelDep(), (SmObjectImpl)value);
    }

    @objid ("1e296c3b-8946-47ef-827d-019616029371")
    @Override
    public EList<CommunicationMessage> getEndToStartMessage() {
        return new SmList<>(this, CommunicationChannelData.Metadata.EndToStartMessageDep());
    }

    @objid ("e25590c2-fba4-46f1-ab5a-f17d5ac2fc8a")
    @Override
    public <T extends CommunicationMessage> List<T> getEndToStartMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationMessage element : getEndToStartMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ab390f70-e8f9-4378-93ed-c67e8e438fc6")
    @Override
    public CommunicationNode getEnd() {
        return (CommunicationNode) getDepVal(CommunicationChannelData.Metadata.EndDep());
    }

    @objid ("e73810eb-e785-46fa-8d8c-c212f7360195")
    @Override
    public void setEnd(CommunicationNode value) {
        appendDepVal(CommunicationChannelData.Metadata.EndDep(), (SmObjectImpl)value);
    }

    @objid ("1b92c9de-aa99-430f-b8af-1a039a459f6e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationChannelData.Metadata.StartDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0b594e2a-c3ed-4180-b48e-0c484f31bbf4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationChannelData.Metadata.StartDep());
        if (obj != null)
          return new SmDepVal(CommunicationChannelData.Metadata.StartDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("73bbe6f2-2764-4a96-a4a4-792b58d80225")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationChannel(this);
        else
          return null;
    }

}
