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
package org.modelio.metamodel.bpmn.bpmnService;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("000d4990-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnOperation extends BpmnBaseElement {
    @objid ("90f7c9bd-7049-4fe4-8cf0-1172a9856dbb")
    EList<BpmnSendTask> getSender();

    @objid ("a3622c1f-2b34-4470-b554-4b8b157ae28f")
    <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("350faeeb-c0e5-4a3c-b9bc-b8dbf8ff9318")
    BpmnMessage getInMessageRef();

    @objid ("63df3922-cbce-400e-ae90-20e09bac10a3")
    void setInMessageRef(BpmnMessage value);

    @objid ("6e9c5e5d-baa0-477a-9048-11e76174a8ad")
    EList<BpmnServiceTask> getCaller();

    @objid ("4cb4fab6-42e8-4044-a79b-0b089bdfde69")
    <T extends BpmnServiceTask> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("62ae22de-4e54-4553-9141-1eac06426f17")
    BpmnMessage getOutMessageRef();

    @objid ("ceb6612d-7147-437c-a0a9-b6d9828ecdf0")
    void setOutMessageRef(BpmnMessage value);

    @objid ("1a4e6b0b-c2fe-4568-ac65-dc44c59d25a0")
    EList<BpmnMessageEventDefinition> getEventDefinition();

    @objid ("fb4f0816-d1bf-43a0-94dd-640447c160a3")
    <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass);

    @objid ("aadcd02c-c49a-4769-a8c1-e253273b6f73")
    Operation getImplementationRef();

    @objid ("f699884e-0890-49d0-834f-ff5035d13d26")
    void setImplementationRef(Operation value);

    @objid ("b67dc37f-b75c-4d13-b373-c4262bd9c908")
    BpmnInterface getBpmnInterfaceRef();

    @objid ("fae277b5-1f98-4fe3-8b43-2159cc83154e")
    void setBpmnInterfaceRef(BpmnInterface value);

    @objid ("b7746127-416c-4263-99fc-64cd490a7fa7")
    EList<BpmnReceiveTask> getReceiver();

    @objid ("ec74b099-6971-4aa2-bd91-09d5148de49e")
    <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass);

}
