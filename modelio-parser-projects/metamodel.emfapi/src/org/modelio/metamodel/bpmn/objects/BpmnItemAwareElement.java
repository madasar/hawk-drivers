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
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("0006fc34-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnItemAwareElement extends BpmnFlowElement {
    @objid ("2ffd605e-f86d-40e2-96d3-60845874414f")
    GeneralClass getType();

    @objid ("6a214086-e5fd-404c-bc52-8cc5ed3f3058")
    void setType(GeneralClass value);

    @objid ("76526c45-ff2c-4590-a721-2cf230b27fd6")
    EList<BpmnDataAssociation> getTargetOfDataAssociation();

    @objid ("d9a4d528-bccd-416d-9ff0-89a31b8575cc")
    <T extends BpmnDataAssociation> List<T> getTargetOfDataAssociation(java.lang.Class<T> filterClass);

    @objid ("83fdd226-ec55-4c0e-aaff-36692ed62def")
    BpmnItemDefinition getItemSubjectRef();

    @objid ("e65201b3-cee0-4a84-a29f-c84bcb5c1e57")
    void setItemSubjectRef(BpmnItemDefinition value);

    @objid ("a261a2ca-20db-4b1c-b8de-2db96a8f8db0")
    State getInState();

    @objid ("648e69a2-8e17-4272-9563-30480adadb31")
    void setInState(State value);

    @objid ("30a2886a-8f87-4400-922c-b9cc5e053cf0")
    AssociationEnd getRepresentedAssociationEnd();

    @objid ("846fc5e6-48bd-429a-8f9c-4b495a4a6103")
    void setRepresentedAssociationEnd(AssociationEnd value);

    @objid ("d94ae364-df33-4018-ae7e-f6e4c0aaf1e3")
    BpmnDataState getDataState();

    @objid ("c7688cc0-6036-48f7-8fd6-522d3a38e424")
    void setDataState(BpmnDataState value);

    @objid ("066831a5-2f46-4137-821b-6c9fcd78a888")
    EList<BpmnDataAssociation> getSourceOfDataAssociation();

    @objid ("6b833644-7cfe-46c6-b57d-0f4930928e24")
    <T extends BpmnDataAssociation> List<T> getSourceOfDataAssociation(java.lang.Class<T> filterClass);

    @objid ("860c85e1-9153-4217-a94a-655432f24736")
    Attribute getRepresentedAttribute();

    @objid ("d7d92ebb-84b1-4dfa-8ae5-b13a74f4ff29")
    void setRepresentedAttribute(Attribute value);

    @objid ("a6b50f38-4c72-48b9-9936-69ff13041d88")
    Instance getRepresentedInstance();

    @objid ("a738e84a-51b2-4610-b62e-55b2ffa0f503")
    void setRepresentedInstance(Instance value);

}
