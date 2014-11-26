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
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationNodeData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("005ab766-c4bf-1fd8-97fe-001ec947cd2a")
public class CommunicationNodeImpl extends ModelElementImpl implements CommunicationNode {
    @objid ("8a7df48c-48b1-42a7-bcc7-9bda3cc6bced")
    @Override
    public String getSelector() {
        return (String) getAttVal(CommunicationNodeData.Metadata.SelectorAtt());
    }

    @objid ("d55dfddd-8166-449c-8a7e-a4f231999464")
    @Override
    public void setSelector(String value) {
        setAttVal(CommunicationNodeData.Metadata.SelectorAtt(), value);
    }

    @objid ("a2ca9dc1-90d2-4b76-878a-98520ba16427")
    @Override
    public CommunicationInteraction getOwner() {
        return (CommunicationInteraction) getDepVal(CommunicationNodeData.Metadata.OwnerDep());
    }

    @objid ("9b6d51ee-877e-40bc-be55-8c27b8b492b6")
    @Override
    public void setOwner(CommunicationInteraction value) {
        appendDepVal(CommunicationNodeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("1276e2da-e64a-4672-9e71-2167bdf97d8a")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(CommunicationNodeData.Metadata.RepresentedDep());
    }

    @objid ("dea1efc1-4b3f-4ab0-a606-7bee52ad92eb")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(CommunicationNodeData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("ef44248a-e7bf-458a-b3c1-344d0f6a6093")
    @Override
    public EList<CommunicationChannel> getStarted() {
        return new SmList<>(this, CommunicationNodeData.Metadata.StartedDep());
    }

    @objid ("aec353e4-866b-448f-92ea-8e64ecfdef8c")
    @Override
    public <T extends CommunicationChannel> List<T> getStarted(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationChannel element : getStarted()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cd47942f-63c4-4e7f-84ca-894f25ea559d")
    @Override
    public EList<CommunicationChannel> getEnded() {
        return new SmList<>(this, CommunicationNodeData.Metadata.EndedDep());
    }

    @objid ("463eaf2e-dd83-43f3-b873-bb5f91df70c2")
    @Override
    public <T extends CommunicationChannel> List<T> getEnded(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationChannel element : getEnded()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("616caa79-3f52-4db4-8386-43a1512f134c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationNodeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b9dcfe25-81d7-445d-8f59-080d46fe59d8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationNodeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(CommunicationNodeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f82e551b-b107-450b-aefc-6f9e89dc748b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationNode(this);
        else
          return null;
    }

}
