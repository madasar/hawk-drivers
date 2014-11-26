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
package org.modelio.metamodel.bpmn.bpmnService;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("000de92c-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnInterface extends BpmnRootElement {
    @objid ("d833b728-c3f9-4118-9717-264fa5114ec3")
    GeneralClass getImplementationRef();

    @objid ("d8b0a412-631d-4e5e-9ea1-158083b12f03")
    void setImplementationRef(GeneralClass value);

    @objid ("6e165708-7669-4e21-bc0c-e2896a1c4f37")
    EList<BpmnOperation> getOperation();

    @objid ("335db24c-18b6-417c-8b8d-7390c908ae2b")
    <T extends BpmnOperation> List<T> getOperation(java.lang.Class<T> filterClass);

    @objid ("510fbf49-3dbf-4665-8f9c-b0a2b5ccd2a4")
    EList<BpmnParticipant> getParticipantRef();

    @objid ("43f13e8d-90ac-44d7-b79c-ce4df4190438")
    <T extends BpmnParticipant> List<T> getParticipantRef(java.lang.Class<T> filterClass);

}
