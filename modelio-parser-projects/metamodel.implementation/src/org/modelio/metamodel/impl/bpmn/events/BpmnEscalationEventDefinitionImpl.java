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
import org.modelio.metamodel.bpmn.events.BpmnEscalationEventDefinition;
import org.modelio.metamodel.data.bpmn.events.BpmnEscalationEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008c1a7c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnEscalationEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnEscalationEventDefinition {
    @objid ("6f6df0ab-caaf-44c0-91e9-42c0ce8d8940")
    @Override
    public String getEscalationCode() {
        return (String) getAttVal(BpmnEscalationEventDefinitionData.Metadata.EscalationCodeAtt());
    }

    @objid ("ab089daa-f318-4324-81d2-7188c2965e73")
    @Override
    public void setEscalationCode(String value) {
        setAttVal(BpmnEscalationEventDefinitionData.Metadata.EscalationCodeAtt(), value);
    }

    @objid ("e1c21f5a-937b-4891-b0de-ea2c865cad23")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("9b18c206-5721-4d05-9909-23d683e1c781")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("8eb7100f-d6b7-4655-b8cc-246493a21fd3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEscalationEventDefinition(this);
        else
          return null;
    }

}
