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
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0077d2a6-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnBaseElement extends ModelElement {
    @objid ("a0d06f0d-0074-44c9-9e2c-6bbdf1ad0dcf")
    EList<BpmnAssociation> getOutgoingAssoc();

    @objid ("55bd57c8-be37-47d8-a56c-cc2dd14e1cff")
    <T extends BpmnAssociation> List<T> getOutgoingAssoc(java.lang.Class<T> filterClass);

    @objid ("c72d0ee5-ae03-4f5c-ab75-4c3100a148de")
    EList<BpmnAssociation> getIncomingAssoc();

    @objid ("182df567-82af-4f6b-8da7-a4fd4b0717a4")
    <T extends BpmnAssociation> List<T> getIncomingAssoc(java.lang.Class<T> filterClass);

    @objid ("21358a98-8441-46b9-a72a-53dba84d9068")
    EList<BpmnMessageFlow> getIncomingFlow();

    @objid ("9751713f-e370-46c9-acea-7ae444b533ed")
    <T extends BpmnMessageFlow> List<T> getIncomingFlow(java.lang.Class<T> filterClass);

    @objid ("93dd5135-c5a4-40da-aa2e-6211ffacf2fa")
    EList<BpmnMessageFlow> getOutgoingFlow();

    @objid ("6f31da74-85c5-4607-813f-a908ab1fa2f4")
    <T extends BpmnMessageFlow> List<T> getOutgoingFlow(java.lang.Class<T> filterClass);

}
