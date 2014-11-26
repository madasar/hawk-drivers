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
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00828728-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSendTask extends BpmnTask {
    @objid ("aba2c1f5-5538-47a7-a80a-9a0fbf8af7c1")
    String getImplementation();

    @objid ("4ec9d29a-4888-4bc1-8597-a4523e3fd5f1")
    void setImplementation(String value);

    @objid ("f53ef757-9e7a-45d8-aaaf-0e5c0f8973c3")
    BpmnMessage getMessageRef();

    @objid ("6c488f37-91e6-496f-baac-79c3f7e80b65")
    void setMessageRef(BpmnMessage value);

    @objid ("a6d8b1ce-3699-4de7-b6f3-fe1b192a9c4c")
    BpmnOperation getOperationRef();

    @objid ("9cb2270d-0802-4a23-b46f-2effa1100c90")
    void setOperationRef(BpmnOperation value);

    @objid ("66cc6443-b38c-464e-b2b3-f776b9cb2e91")
    Operation getCalledOperation();

    @objid ("92eb121b-4eb2-4cc8-a3e5-bc15dd97afe3")
    void setCalledOperation(Operation value);

}
