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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("007f7bdc-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnComplexBehaviorDefinition extends BpmnBaseElement {
    @objid ("01c73e02-82c6-4198-be5d-3f3a659d25f0")
    String getCondition();

    @objid ("9c202dcc-0029-4e37-89e4-39b3cf098b1c")
    void setCondition(String value);

    @objid ("4d22cc53-023a-4179-8c1c-53133c0fdc2a")
    BpmnMultiInstanceLoopCharacteristics getOwner();

    @objid ("36be173c-b3a6-4de0-b891-28588e843cf7")
    void setOwner(BpmnMultiInstanceLoopCharacteristics value);

    @objid ("9969d510-7d6c-4550-8f26-288ccc0f49f4")
    BpmnImplicitThrowEvent getEvent();

    @objid ("31ee75c6-7b95-4a4c-9aff-761195ab56b7")
    void setEvent(BpmnImplicitThrowEvent value);

}
