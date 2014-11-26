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
import org.modelio.metamodel.bpmn.events.BpmnTimerEventDefinition;
import org.modelio.metamodel.data.bpmn.events.BpmnTimerEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00969aa6-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnTimerEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnTimerEventDefinition {
    @objid ("4e8e06d1-6c05-4829-bd80-d0fdabfda08d")
    @Override
    public String getTimeCycle() {
        return (String) getAttVal(BpmnTimerEventDefinitionData.Metadata.TimeCycleAtt());
    }

    @objid ("11872f1a-e647-4f83-93fe-aec44dc9fa02")
    @Override
    public void setTimeCycle(String value) {
        setAttVal(BpmnTimerEventDefinitionData.Metadata.TimeCycleAtt(), value);
    }

    @objid ("831fef76-6b62-464c-917b-cf951484fe40")
    @Override
    public String getTimeD() {
        return (String) getAttVal(BpmnTimerEventDefinitionData.Metadata.TimeDAtt());
    }

    @objid ("5b777286-da59-4290-b3f3-22ebfce74eb6")
    @Override
    public void setTimeD(String value) {
        setAttVal(BpmnTimerEventDefinitionData.Metadata.TimeDAtt(), value);
    }

    @objid ("c170a987-7599-4ed7-99d5-86279fc9dd82")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("cba41320-8062-426b-8de9-1764f771dd48")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("6279ae1d-e0b7-42d6-b298-40f95b8f3393")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTimerEventDefinition(this);
        else
          return null;
    }

}
