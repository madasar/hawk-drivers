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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;

@objid ("00787d78-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnArtifact extends BpmnBaseElement {
    @objid ("85fba349-935d-47a1-b05d-bce08946aa85")
    BpmnSubProcess getSubProcess();

    @objid ("08f6bba7-18c4-4bf4-bcd9-21ce50639cac")
    void setSubProcess(BpmnSubProcess value);

    @objid ("51f586a9-249a-4aab-9f5d-fba671dbeb30")
    BpmnCollaboration getCollaboration();

    @objid ("c95380b5-194e-4619-a01f-23beb0dd0f25")
    void setCollaboration(BpmnCollaboration value);

    @objid ("07b2d0af-9b88-4631-9649-675abc953917")
    BpmnProcess getProcess();

    @objid ("bdcfb27e-5ee8-4696-a96e-ada7aff46246")
    void setProcess(BpmnProcess value);

}
