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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("000bbdb4-c4bf-1fd8-97fe-001ec947cd2a")
public interface GeneralClass extends Classifier {
    @objid ("5c89d769-8f5e-4d9a-94a1-99579058c5e9")
    boolean isIsElementary();

    @objid ("f704fcd2-8997-49a4-a037-6f2f959cadeb")
    void setIsElementary(boolean value);

    @objid ("9bbf7f52-23ed-4b43-863d-009ee0d22d14")
    EList<BpmnInterface> getBpmnInterfaceRefs();

    @objid ("1058ec6b-497b-45ae-9e94-dcf43af7336e")
    <T extends BpmnInterface> List<T> getBpmnInterfaceRefs(java.lang.Class<T> filterClass);

    @objid ("25e9774e-dac6-466f-a6a5-51e9cf6fcda8")
    EList<Parameter> getOccurence();

    @objid ("14c51c20-d5f3-4c3f-81b2-813eaaba5ee1")
    <T extends Parameter> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("fd1e0661-de12-4ab5-aac7-5d044dd56f0f")
    ExceptionHandler getExceptionInput();

    @objid ("390c81c0-af98-410d-a200-99231dda12ff")
    void setExceptionInput(ExceptionHandler value);

    @objid ("361ecac4-8303-4b02-b40f-b18d3357c8d3")
    EList<Attribute> getObject();

    @objid ("c3e2625c-ce6f-4b03-bae5-11622e709691")
    <T extends Attribute> List<T> getObject(java.lang.Class<T> filterClass);

    @objid ("66cf6d8c-9d22-4483-a18e-e62152e74c2a")
    EList<BpmnMessage> getBpmnMessageRefs();

    @objid ("b4cd9674-9485-4caa-800b-2b2b54fc0e69")
    <T extends BpmnMessage> List<T> getBpmnMessageRefs(java.lang.Class<T> filterClass);

    @objid ("2d77c014-fe4d-41f4-a380-816b50ed1ed3")
    EList<Signal> getSRepresentation();

    @objid ("801d0018-8405-46e6-8794-465faa1ceb75")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("8d293d25-d0e3-463d-8e51-60a47d3ed103")
    EList<BpmnItemDefinition> getBpmnItemDefinitionRefs();

    @objid ("cd8dba5f-a234-46f9-9d25-0202ffe19a31")
    <T extends BpmnItemDefinition> List<T> getBpmnItemDefinitionRefs(java.lang.Class<T> filterClass);

    @objid ("f3fa36ab-a5d2-45b3-bf9b-630e5fc2d5d8")
    EList<ObjectNode> getOccurenceObjectNode();

    @objid ("c7d69fc3-cba0-4956-b2ac-5fec378ff50a")
    <T extends ObjectNode> List<T> getOccurenceObjectNode(java.lang.Class<T> filterClass);

    @objid ("0eb7905f-00e2-43b0-84cb-5ad47d559c35")
    EList<BpmnItemAwareElement> getBpmnItemAwareRefs();

    @objid ("bdc54449-ceff-4fe8-b237-5bc91e6314b1")
    <T extends BpmnItemAwareElement> List<T> getBpmnItemAwareRefs(java.lang.Class<T> filterClass);

    @objid ("208eb26e-ef7e-4a9d-8858-ea3c5367bcef")
    EList<ModuleParameter> getOccurenceConfigParam();

    @objid ("4918834c-53c1-4ab3-a925-addf3d640994")
    <T extends ModuleParameter> List<T> getOccurenceConfigParam(java.lang.Class<T> filterClass);

}
