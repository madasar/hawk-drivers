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
import org.modelio.metamodel.uml.statik.Operation;

@objid ("008313be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnServiceTask extends BpmnTask {
    @objid ("b9c30da0-d026-4ba2-aa83-5fe66f053deb")
    String getImplementation();

    @objid ("71e9cdea-8092-44bb-af91-d01d84518d2c")
    void setImplementation(String value);

    @objid ("65cc6a05-3255-457c-a93d-bbfb12f37158")
    Operation getCalledOperation();

    @objid ("46652863-52cb-4cc4-aa9c-5f3f7318279a")
    void setCalledOperation(Operation value);

    @objid ("9d2a6f1d-b7fc-4839-a308-71b6e0b1cab2")
    BpmnOperation getOperationRef();

    @objid ("53c3e269-c255-46a0-8b4d-76f6f5133849")
    void setOperationRef(BpmnOperation value);

}
