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
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;

@objid ("00792098-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnFlowElement extends BpmnBaseElement {
    @objid ("3c92ebea-ba36-4bbe-84dd-e855657316dc")
    EList<BpmnGroup> getGroups();

    @objid ("3dfe4d22-a607-4df8-b2fc-349d9cfa95d7")
    <T extends BpmnGroup> List<T> getGroups(java.lang.Class<T> filterClass);

    @objid ("c86f17cd-017f-4e2e-895f-754e62614647")
    BpmnSubProcess getSubProcess();

    @objid ("85f52324-eb2d-449a-b668-64dd3d0e66e2")
    void setSubProcess(BpmnSubProcess value);

    @objid ("323f8f18-056c-4e88-8e8d-aa572fa500c0")
    EList<BpmnLane> getLane();

    @objid ("75710187-2ffc-4643-b7dc-fe22fe22e047")
    <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass);

    @objid ("58ccc853-67b6-4def-980c-96310b65dc81")
    BpmnProcess getContainer();

    @objid ("869e82f3-c0b8-42ae-8d75-02e03f96ab3f")
    void setContainer(BpmnProcess value);

}
