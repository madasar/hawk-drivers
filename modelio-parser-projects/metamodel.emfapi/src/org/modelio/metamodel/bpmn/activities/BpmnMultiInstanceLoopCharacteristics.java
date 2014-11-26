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
package org.modelio.metamodel.bpmn.activities;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.MultiInstanceBehavior;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;

@objid ("0080f732-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMultiInstanceLoopCharacteristics extends BpmnLoopCharacteristics {
    @objid ("2c3ffc0a-0934-4e09-9011-3bed630e3142")
    boolean isIsSequencial();

    @objid ("5dd0160d-b96c-4042-a44c-fc4b72b302ae")
    void setIsSequencial(boolean value);

    @objid ("6edbcb1a-2a28-4cc6-a588-0472a1a8936c")
    MultiInstanceBehavior getBehavior();

    @objid ("4998c7f4-93de-4e29-b790-c26f407af6c0")
    void setBehavior(MultiInstanceBehavior value);

    @objid ("271e4459-4b93-4624-aad8-03229c9e05c7")
    String getLoopCardinality();

    @objid ("b6fab7fb-6968-4181-b5be-580ab3b62779")
    void setLoopCardinality(String value);

    @objid ("aac1c9e7-4d91-4b8c-8be0-e944d02ac8b9")
    String getCompletionCondition();

    @objid ("163893e0-969b-4a24-ad33-e7f553a6661a")
    void setCompletionCondition(String value);

    @objid ("7115a3c1-21dd-4cb5-aa90-09013f464299")
    BpmnDataInput getLoopDataInput();

    @objid ("7b419dcf-8dd6-4b7d-85e6-c1fd769f7c27")
    void setLoopDataInput(BpmnDataInput value);

    @objid ("4c688bc6-950f-43d7-a07c-d049ec550ae1")
    BpmnDataOutput getLoopDataOutputRef();

    @objid ("32b91b44-db2a-4314-a361-141f7104938d")
    void setLoopDataOutputRef(BpmnDataOutput value);

    @objid ("7e2e08f5-9be7-438d-ad5a-bf90eb903c1e")
    BpmnEventDefinition getCompletionEventRef();

    @objid ("8e1f162d-9aba-49f1-b978-935b11649fcc")
    void setCompletionEventRef(BpmnEventDefinition value);

    @objid ("64abb2be-c864-47a3-bd49-684e4644eea7")
    EList<BpmnComplexBehaviorDefinition> getComplexBehaviorDefinition();

    @objid ("7ee26999-38f4-4bec-8139-73f9e037e9ea")
    <T extends BpmnComplexBehaviorDefinition> List<T> getComplexBehaviorDefinition(java.lang.Class<T> filterClass);

}
