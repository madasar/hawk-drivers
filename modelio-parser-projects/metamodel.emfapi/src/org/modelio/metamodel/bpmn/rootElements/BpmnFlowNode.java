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
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;

@objid ("0079b594-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnFlowNode extends BpmnFlowElement {
    @objid ("94156ac1-940f-4ac0-bfee-c0abb9567f26")
    EList<BpmnSequenceFlow> getOutgoing();

    @objid ("e6e264e3-85e7-41da-be8d-d55302407e50")
    <T extends BpmnSequenceFlow> List<T> getOutgoing(java.lang.Class<T> filterClass);

    @objid ("8255d0fe-424d-4f64-9de4-0719e32e82c6")
    EList<BpmnResourceRole> getResource();

    @objid ("75d51733-6e45-4105-a162-71229da28995")
    <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass);

    @objid ("30e92959-3c81-4290-8cb5-dab969a0bcf0")
    EList<BpmnSequenceFlow> getIncoming();

    @objid ("daca27d2-e749-495e-b406-2dbe06e9b049")
    <T extends BpmnSequenceFlow> List<T> getIncoming(java.lang.Class<T> filterClass);

}
