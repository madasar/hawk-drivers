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

@objid ("008180d0-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnReceiveTask extends BpmnTask {
    @objid ("5c50bce8-0133-4474-953b-b1e6cd8c1a61")
    String getImplementation();

    @objid ("65f1637e-5567-4436-a245-22357367fe80")
    void setImplementation(String value);

    @objid ("12756f3c-d0b2-47fc-8853-cff5d0360041")
    boolean isInstanciate();

    @objid ("35a3386b-22b6-4894-8cf5-d6ee5d5b0183")
    void setInstanciate(boolean value);

    @objid ("73ea29e3-2032-4bc9-a59f-19672d847cfc")
    BpmnMessage getMessageRef();

    @objid ("7ea76bbd-5f91-4f39-bc43-f9a9cabc4add")
    void setMessageRef(BpmnMessage value);

    @objid ("80817116-efe5-4c94-94a6-5496431e4096")
    BpmnOperation getOperationRef();

    @objid ("08a75c29-79fa-4837-9a9c-1b924011691c")
    void setOperationRef(BpmnOperation value);

    @objid ("f9e40fd3-7de3-4323-866e-81424c7c2567")
    Operation getCalledOperation();

    @objid ("a24a9c70-5bcc-4edb-bd46-d324f4be0c65")
    void setCalledOperation(Operation value);

}
