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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("007c58ee-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessageFlow extends BpmnBaseElement {
    @objid ("ffea21cc-455e-4142-b1ca-c7dcfd2bba22")
    BpmnMessage getMessageRef();

    @objid ("7afcb0ec-ef1e-4a50-b2fd-a9c2dffa55c4")
    void setMessageRef(BpmnMessage value);

    @objid ("f8cb7d84-dc06-4c22-9aca-6764e2919263")
    BpmnBaseElement getSourceRef();

    @objid ("ed76e239-82d6-4965-bc19-be6a88863779")
    void setSourceRef(BpmnBaseElement value);

    @objid ("ce699582-7b6a-4652-9aaf-c76f3b59410d")
    BpmnBaseElement getTargetRef();

    @objid ("8e573cd1-6171-4a5d-b3bb-e1d1ff834b53")
    void setTargetRef(BpmnBaseElement value);

    @objid ("a14185bf-1498-43a7-907c-9144997f8851")
    BpmnCollaboration getCollaboration();

    @objid ("132ae888-52cf-4a6e-beea-940d358046a4")
    void setCollaboration(BpmnCollaboration value);

}
