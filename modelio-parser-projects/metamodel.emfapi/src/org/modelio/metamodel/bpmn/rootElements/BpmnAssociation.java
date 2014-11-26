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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("00772770-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnAssociation extends BpmnArtifact {
    @objid ("e9969ef0-2335-42e6-a31d-012d69c3ec05")
    BpmnAssociationDirection getAssociationDirection();

    @objid ("9d77a92a-7f47-4b50-8838-dff2fc0252e4")
    void setAssociationDirection(BpmnAssociationDirection value);

    @objid ("392dee37-b000-4a87-8719-9d58a0f9dda2")
    BpmnBaseElement getTargetRef();

    @objid ("cb188292-4601-43bf-b9d5-e07129e33619")
    void setTargetRef(BpmnBaseElement value);

    @objid ("b8d4de90-a298-4058-a897-6e667003b1e0")
    BpmnBaseElement getSourceRef();

    @objid ("393e05b1-cb14-4a9b-a660-2da1ddfc859e")
    void setSourceRef(BpmnBaseElement value);

}
