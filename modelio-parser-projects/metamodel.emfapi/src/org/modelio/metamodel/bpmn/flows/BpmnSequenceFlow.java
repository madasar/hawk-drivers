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
package org.modelio.metamodel.bpmn.flows;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

@objid ("007cd986-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSequenceFlow extends BpmnFlowElement {
    @objid ("50b76666-b544-4aea-b980-4d8a787b211b")
    boolean isIsImmediate();

    @objid ("3670326f-64f5-476e-b259-2184734f4622")
    void setIsImmediate(boolean value);

    @objid ("503c08b2-b2fd-4d82-993b-0f870597b87f")
    String getConditionExpression();

    @objid ("51f6d8d4-9c02-4916-a836-124ebb7be9f0")
    void setConditionExpression(String value);

    @objid ("cc323067-328e-4bfb-88f3-7949bf6effe4")
    BpmnFlowNode getSourceRef();

    @objid ("dfc0a632-6eb8-444f-9949-49d769139c63")
    void setSourceRef(BpmnFlowNode value);

    @objid ("7c376332-93e1-4457-af71-19a707e5d98e")
    BpmnFlowNode getTargetRef();

    @objid ("6484e2b9-4994-4203-a79b-18025f8544bf")
    void setTargetRef(BpmnFlowNode value);

    @objid ("363feddb-75d8-46a9-9028-433b90a3f215")
    BpmnInclusiveGateway getDefaultOfInclusive();

    @objid ("f5598ae3-b3f4-4a89-9980-920b8c7eca90")
    void setDefaultOfInclusive(BpmnInclusiveGateway value);

    @objid ("4ab5eb5f-c695-41e9-8ae3-3e96e84b2c74")
    BpmnActivity getDefaultFrom();

    @objid ("06b9e380-eb6b-4d93-8b82-cb75297bf24d")
    void setDefaultFrom(BpmnActivity value);

    @objid ("1d24c5d5-cf7e-49a0-a87d-95b4d441b23c")
    BpmnExclusiveGateway getDefaultOfExclusive();

    @objid ("3f2732b4-ea16-43d9-9945-b048ecf6aac8")
    void setDefaultOfExclusive(BpmnExclusiveGateway value);

    @objid ("e239a3bb-6e01-4456-91db-5255ad2a0ad4")
    EList<BpmnSequenceFlowDataAssociation> getConnector();

    @objid ("3d52865b-692c-465d-a85c-0d09caddccd5")
    <T extends BpmnSequenceFlowDataAssociation> List<T> getConnector(java.lang.Class<T> filterClass);

    @objid ("3460af1d-c408-4f93-aec0-31fadf5f5b79")
    BpmnComplexGateway getDefaultOfComplex();

    @objid ("ae057fcb-24ea-4566-8459-6dc9bba119b8")
    void setDefaultOfComplex(BpmnComplexGateway value);

}
