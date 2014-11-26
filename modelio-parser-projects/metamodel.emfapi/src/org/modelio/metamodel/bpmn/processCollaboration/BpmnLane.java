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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00746c56-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLane extends BpmnBaseElement {
    @objid ("79a0a0f0-c5d3-4ef3-8099-40c3c28606a0")
    BpmnLaneSet getChildLaneSet();

    @objid ("5fb90753-f116-4575-ae95-3081eb7ffe58")
    void setChildLaneSet(BpmnLaneSet value);

    @objid ("5e536475-a3fa-4b9e-a5ac-9e065fd7cbe4")
    ModelElement getPartitionElement();

    @objid ("6acf6a47-6aab-4eca-8b78-848de5b68dde")
    void setPartitionElement(ModelElement value);

    @objid ("0f152402-8c23-4efd-a605-6418354f4bae")
    EList<BpmnFlowElement> getFlowElementRef();

    @objid ("9fc148fc-fe4b-4267-bf43-61c9dc9987b5")
    <T extends BpmnFlowElement> List<T> getFlowElementRef(java.lang.Class<T> filterClass);

    @objid ("0f7401fc-3b0c-4c48-b890-c9ab7dce7b31")
    BpmnLaneSet getLaneSet();

    @objid ("0f222276-3174-4b49-b067-3ec9dc764343")
    void setLaneSet(BpmnLaneSet value);

}
