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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

@objid ("007d712a-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnActivity extends BpmnFlowNode {
    @objid ("460a4849-ebd0-41a9-9004-1e2136f244de")
    boolean isIsForCompensation();

    @objid ("eee1415c-6e87-4497-97ac-86ad36e439a6")
    void setIsForCompensation(boolean value);

    @objid ("ac53c31d-c5c6-4cd9-a842-1acb0ae22b46")
    int getStartQuantity();

    @objid ("8c6837c6-c4d1-454e-995e-449c1d15b1cb")
    void setStartQuantity(int value);

    @objid ("da52faee-4b78-4768-ab6b-6b86e91727be")
    int getCompletionQuantity();

    @objid ("fdd35ba1-9a77-457b-af70-c3ad92e1fc91")
    void setCompletionQuantity(int value);

    @objid ("95f40dd6-8d5e-4882-9823-cd8c9f295521")
    EList<BpmnCompensateEventDefinition> getCompensateEventDefinitions();

    @objid ("7de05859-5260-4a26-8a44-bff8f964195b")
    <T extends BpmnCompensateEventDefinition> List<T> getCompensateEventDefinitions(java.lang.Class<T> filterClass);

    @objid ("0e06c941-b44e-4a64-b74c-951819d8b6ce")
    EList<BpmnDataInput> getInputSpecification();

    @objid ("35d978dd-b8d8-4be3-ae95-d657d3167a0c")
    <T extends BpmnDataInput> List<T> getInputSpecification(java.lang.Class<T> filterClass);

    @objid ("eb6754b1-0e9f-48ef-a0f2-1b64da19fab0")
    EList<BpmnDataAssociation> getDataInputAssociation();

    @objid ("669358dc-108a-4ef7-92da-5e374e5a3aea")
    <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass);

    @objid ("e0686225-aa75-4e73-aa9d-e28df31b2cc9")
    EList<BpmnDataOutput> getOutputSpecification();

    @objid ("15ac74be-dd62-4646-9bed-d4edd9e80e30")
    <T extends BpmnDataOutput> List<T> getOutputSpecification(java.lang.Class<T> filterClass);

    @objid ("5cc497b4-6c7a-44f1-9ead-92751ab56874")
    BpmnLoopCharacteristics getLoopCharacteristics();

    @objid ("cf3d90dd-1091-44df-89f1-6d5e93709e8c")
    void setLoopCharacteristics(BpmnLoopCharacteristics value);

    @objid ("d258a38c-a8b7-4078-9384-db0a2d6b04cf")
    EList<BpmnBoundaryEvent> getBoundaryEventRef();

    @objid ("30c956d6-0dd6-462c-b9c5-5f98acd8fd8f")
    <T extends BpmnBoundaryEvent> List<T> getBoundaryEventRef(java.lang.Class<T> filterClass);

    @objid ("e7a6faac-c838-42d9-bb34-3084b30fbb1d")
    EList<BpmnDataAssociation> getDataOutputAssociation();

    @objid ("8327c6a1-125a-4d9d-928c-2ee43eda46d3")
    <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass);

    @objid ("052b8efc-bb5c-465c-9ec0-cc1c70f094c9")
    BpmnSequenceFlow getDefaultFlow();

    @objid ("cc111a07-9f91-4fa0-aa5c-2f820a25cc7b")
    void setDefaultFlow(BpmnSequenceFlow value);

}
