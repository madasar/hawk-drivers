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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;

@objid ("00843028-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSubProcess extends BpmnActivity {
    @objid ("dcf76919-ec55-4d77-ba89-5704eed87d3e")
    boolean isTriggeredByEvent();

    @objid ("e6d4e845-d2fb-4ea6-ad98-77722f9d35bb")
    void setTriggeredByEvent(boolean value);

    @objid ("b12c877f-f9e3-40bf-997c-e6209e8937db")
    EList<BpmnArtifact> getArtifact();

    @objid ("46c1d5bc-b311-4d3c-8167-4a43de3ab226")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("ec6cf17a-8d3c-414b-8635-482e1ec5f45a")
    EList<BpmnFlowElement> getFlowElement();

    @objid ("228a8807-376d-42b2-ab13-159721544c03")
    <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass);

    @objid ("5c4fdced-30d9-4681-b21d-af3512ac8ea8")
    EList<BpmnLaneSet> getLaneSet();

    @objid ("bbe572b1-5188-4233-807c-9f7538737e4f")
    <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass);

}
