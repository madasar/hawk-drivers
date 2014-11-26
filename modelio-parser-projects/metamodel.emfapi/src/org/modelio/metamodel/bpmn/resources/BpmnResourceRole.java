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
package org.modelio.metamodel.bpmn.resources;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

@objid ("000a8606-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceRole extends BpmnBaseElement {
    @objid ("1a75ce93-db35-4bdb-bb2c-bb8f64ec73a3")
    BpmnResource getResourceRef();

    @objid ("8812e722-bdbf-4509-a315-cb6b5bfcf631")
    void setResourceRef(BpmnResource value);

    @objid ("25350c41-5cba-4cd2-9491-961a3edf17a4")
    BpmnFlowNode getAnnotated();

    @objid ("8d70ae59-fccd-4df8-b422-9477fd5487d3")
    void setAnnotated(BpmnFlowNode value);

    @objid ("27565264-fba3-414b-868c-19f8853469e9")
    EList<BpmnResourceParameterBinding> getResourceParameterBinding();

    @objid ("0def1636-ac69-4315-a7ab-b63a94385792")
    <T extends BpmnResourceParameterBinding> List<T> getResourceParameterBinding(java.lang.Class<T> filterClass);

    @objid ("01611958-84cc-4fef-88c0-cc73ac22a34d")
    BpmnProcess getProcess();

    @objid ("853fe433-092f-4c22-bdf4-2a74c2fc974a")
    void setProcess(BpmnProcess value);

}
