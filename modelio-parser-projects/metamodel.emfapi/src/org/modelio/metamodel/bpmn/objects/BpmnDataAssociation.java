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
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("00047c84-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataAssociation extends BpmnBaseElement {
    @objid ("cdc31eb3-d643-49a1-a467-f57fec8e3665")
    String getAssignment();

    @objid ("3cdbfc23-9114-49b3-b94d-a6c0d36a5c3f")
    void setAssignment(String value);

    @objid ("a6520c0b-d9e1-4c58-b56e-13d473bd78cd")
    String getTransfomation();

    @objid ("b1c379fb-2bb7-40a1-8ad3-c729cbe38a03")
    void setTransfomation(String value);

    @objid ("1516fb46-1188-458e-8eb0-c754c69805d9")
    String getLanguage();

    @objid ("0ad37cf4-7602-41c9-9e5a-9f119c7c5fb0")
    void setLanguage(String value);

    @objid ("a253702d-824d-4c15-bcff-233b548d4dfc")
    EList<BpmnItemAwareElement> getSourceRef();

    @objid ("a541b107-d9ba-4880-ba90-952c131a2a18")
    <T extends BpmnItemAwareElement> List<T> getSourceRef(java.lang.Class<T> filterClass);

    @objid ("ff9783f1-0480-426f-98cc-9994ac2840a2")
    BpmnItemAwareElement getTargetRef();

    @objid ("55b03725-4b3c-488e-b58d-9628646f8e97")
    void setTargetRef(BpmnItemAwareElement value);

    @objid ("14ab3970-bee1-4b83-a893-c952b01a041c")
    BpmnActivity getEndingActivity();

    @objid ("54d349e7-1852-4c7c-9630-0f1da3532670")
    void setEndingActivity(BpmnActivity value);

    @objid ("c4c00800-9542-4823-9862-07b6128172e5")
    BpmnActivity getStartingActivity();

    @objid ("5fdeb440-5ed6-42f8-9a54-7d140ff05124")
    void setStartingActivity(BpmnActivity value);

    @objid ("61bbbe59-2572-473f-aa43-8472344f2b77")
    BpmnThrowEvent getStartingEvent();

    @objid ("cf959674-282f-481b-810d-5a30cd5bf8ae")
    void setStartingEvent(BpmnThrowEvent value);

    @objid ("25ec1de4-e190-43e4-8368-0d6992be1198")
    EList<BpmnSequenceFlowDataAssociation> getVisualShortCut();

    @objid ("2a670556-6923-4dca-88d9-b5364bfd29f1")
    <T extends BpmnSequenceFlowDataAssociation> List<T> getVisualShortCut(java.lang.Class<T> filterClass);

    @objid ("65e217a8-c93b-48c8-9b80-ba7330291f77")
    BpmnCatchEvent getEndingEvent();

    @objid ("4df41213-d8af-4b3a-ad4d-b15bea876c20")
    void setEndingEvent(BpmnCatchEvent value);

}
