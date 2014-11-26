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
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("0005b81a-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataOutput extends BpmnItemAwareElement {
    @objid ("9e453ae7-dfcd-4a27-bc20-eb7f93707a44")
    Parameter getRepresentedParameter();

    @objid ("b8a7d434-35d6-436a-afe4-a269d4db2e11")
    void setRepresentedParameter(Parameter value);

    @objid ("fb0b00b3-3cdc-4c10-9795-31a0d1c88889")
    BpmnActivity getOwnerActivity();

    @objid ("c62205f7-826f-41e9-9544-3afd06c6c062")
    void setOwnerActivity(BpmnActivity value);

    @objid ("0b281532-d461-41d1-b6b9-01f5d6a2c118")
    BpmnCatchEvent getCatched();

    @objid ("950c7991-7b2c-4cd1-be7d-d3a23681e177")
    void setCatched(BpmnCatchEvent value);

    @objid ("9c5f5bf6-1fcf-487c-a257-408d119f519d")
    BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics();

    @objid ("f4070f87-dea2-4921-b6f8-8780f112c326")
    void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value);

}
