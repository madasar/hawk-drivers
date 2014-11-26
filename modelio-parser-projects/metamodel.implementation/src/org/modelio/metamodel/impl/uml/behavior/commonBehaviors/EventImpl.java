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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0042b3fa-c4bf-1fd8-97fe-001ec947cd2a")
public class EventImpl extends ModelElementImpl implements Event {
    @objid ("08ce7ab8-e47d-4f3a-8b81-ac292fee9774")
    @Override
    public String getExpression() {
        return (String) getAttVal(EventData.Metadata.ExpressionAtt());
    }

    @objid ("e6037fe7-9ee5-4885-87ea-916360bf90bb")
    @Override
    public void setExpression(String value) {
        setAttVal(EventData.Metadata.ExpressionAtt(), value);
    }

    @objid ("f3267e90-41bf-4805-a4ea-704b3a42d039")
    @Override
    public EventType getKind() {
        return (EventType) getAttVal(EventData.Metadata.KindAtt());
    }

    @objid ("4f70745c-0b9a-4011-9890-541dfb855885")
    @Override
    public void setKind(EventType value) {
        setAttVal(EventData.Metadata.KindAtt(), value);
    }

    @objid ("323c180b-06af-401d-893b-3b53fcadcd70")
    @Override
    public EList<Transition> getTriggered() {
        return new SmList<>(this, EventData.Metadata.TriggeredDep());
    }

    @objid ("febb08de-b9a8-461d-9495-02eada6327ce")
    @Override
    public <T extends Transition> List<T> getTriggered(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getTriggered()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("593deefe-9703-4ca8-a777-ac7b77ad67c2")
    @Override
    public Signal getModel() {
        return (Signal) getDepVal(EventData.Metadata.ModelDep());
    }

    @objid ("19606c23-f714-4572-a014-041a1c901754")
    @Override
    public void setModel(Signal value) {
        appendDepVal(EventData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("7a2f4682-ad11-4c1d-8711-6da1335c9d97")
    @Override
    public EList<State> getOrigin() {
        return new SmList<>(this, EventData.Metadata.OriginDep());
    }

    @objid ("74a39e8c-f097-4c0a-86db-827058c815df")
    @Override
    public <T extends State> List<T> getOrigin(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final State element : getOrigin()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9a96b2d7-9d05-41e8-b2f6-fec768e893d3")
    @Override
    public Operation getCalled() {
        return (Operation) getDepVal(EventData.Metadata.CalledDep());
    }

    @objid ("b4f60bed-7b3b-4ab7-bf09-2a88edc46395")
    @Override
    public void setCalled(Operation value) {
        appendDepVal(EventData.Metadata.CalledDep(), (SmObjectImpl)value);
    }

    @objid ("9f517199-539c-400e-b2b3-0039dbae498d")
    @Override
    public Behavior getComposed() {
        return (Behavior) getDepVal(EventData.Metadata.ComposedDep());
    }

    @objid ("b4efdb8d-d225-47ef-b9ad-b3b6aad9de4f")
    @Override
    public void setComposed(Behavior value) {
        appendDepVal(EventData.Metadata.ComposedDep(), (SmObjectImpl)value);
    }

    @objid ("b67d7da3-b07d-4560-b65e-30d8077a4acf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EventData.Metadata.ComposedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("832d2cdb-d8b0-41e5-b2fe-d65bb8f3a954")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EventData.Metadata.ComposedDep());
        if (obj != null)
          return new SmDepVal(EventData.Metadata.ComposedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b62232a6-ceb7-4935-8d2e-a3c54d77db5b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEvent(this);
        else
          return null;
    }

}
