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
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("007f01c0-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCallActivity extends BpmnActivity {
    @objid ("a3ec37ef-c814-48b6-b61e-5edf65edacc1")
    BpmnTask getCalledGlobalTask();

    @objid ("61eae2bb-46d1-45ca-8996-78c318ab1c54")
    void setCalledGlobalTask(BpmnTask value);

    @objid ("26664036-61c4-4e3c-bda7-6f14e89b7e6e")
    BpmnProcess getCalledProcess();

    @objid ("843dfb48-cadb-4f76-b021-c4b97370da93")
    void setCalledProcess(BpmnProcess value);

    @objid ("729a1fa4-6023-42a7-b74c-95f1686f9e8d")
    Operation getCalledOperation();

    @objid ("27eb1a01-7e3f-44e2-abe5-3d3deda83dc7")
    void setCalledOperation(Operation value);

    @objid ("ba91459d-4281-4ae7-8bd8-df2a8557c929")
    Behavior getCalledBehavior();

    @objid ("543b2834-2b9b-457f-a564-95a4c8e0117b")
    void setCalledBehavior(Behavior value);

}
