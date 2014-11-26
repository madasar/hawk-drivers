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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;

@objid ("0073c9fe-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCollaboration extends BpmnRootElement {
    @objid ("21018e14-e315-4c34-950b-2895cdf01904")
    boolean isIsClosed();

    @objid ("e55817b3-80ba-4d24-8c0b-6940b4db6e09")
    void setIsClosed(boolean value);

    @objid ("387a7b3b-f52c-49ab-979a-870bae5733ad")
    EList<BpmnArtifact> getArtifact();

    @objid ("ec3269fc-20b5-4edd-a5c1-121bec806e51")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("f574535c-b35c-4f54-bc5a-ed4648b3d0f2")
    EList<BpmnMessageFlow> getMessageFlow();

    @objid ("b49d9ccc-9fa7-4b43-8d5b-8c1b9a45f65b")
    <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass);

    @objid ("5f8fb5c9-cec5-4cbe-b4b4-5dad27929669")
    EList<BpmnParticipant> getParticipants();

    @objid ("e3226453-629d-420c-b138-4eb143eba4da")
    <T extends BpmnParticipant> List<T> getParticipants(java.lang.Class<T> filterClass);

}
