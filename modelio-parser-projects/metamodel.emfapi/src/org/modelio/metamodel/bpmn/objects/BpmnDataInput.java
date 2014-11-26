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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("00065874-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataInput extends BpmnItemAwareElement {
    @objid ("9bdbc122-b072-4759-bccd-8fde823a7456")
    Parameter getRepresentedParameter();

    @objid ("5c13e4eb-7ec8-4680-b5b8-8fe9ffafe0ac")
    void setRepresentedParameter(Parameter value);

    @objid ("8309cf95-6441-4e80-8a28-ebf153324d23")
    BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics();

    @objid ("07315e72-55f8-45bf-871b-505910fe307f")
    void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value);

    @objid ("e8be14b3-3525-46cf-a81f-b7961418a319")
    BpmnActivity getOwnerActivity();

    @objid ("1f8f9d94-91d8-4892-b36c-1e55cab49654")
    void setOwnerActivity(BpmnActivity value);

    @objid ("1d8b318c-0831-45e1-a317-7b3b5c983904")
    BpmnThrowEvent getOwnerThrowEvent();

    @objid ("757f40da-d3e7-45ca-8bf5-893eabf45b92")
    void setOwnerThrowEvent(BpmnThrowEvent value);

}
