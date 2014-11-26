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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.RaisedException;

@objid ("0003645c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Classifier extends NameSpace {
    @objid ("b1756b7d-3a6b-46c0-8470-9d3cb447d45f")
    EList<Operation> getOwnedOperation();

    @objid ("a026c486-ff03-448f-a225-8c80d3880994")
    <T extends Operation> List<T> getOwnedOperation(java.lang.Class<T> filterClass);

    @objid ("bf9db06e-654d-4d4b-8866-6fb97c84df42")
    EList<InformationItem> getRepresentation();

    @objid ("22457474-1cfe-4e8b-9bbd-945839004757")
    <T extends InformationItem> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("25fefd35-c1fb-4dd6-bbf4-8d29e36828f7")
    EList<Substitution> getSubstitued();

    @objid ("01fd5213-d59f-43dc-9ead-71238489985a")
    <T extends Substitution> List<T> getSubstitued(java.lang.Class<T> filterClass);

    @objid ("12d77c35-430e-4855-a3f4-c15b62718fba")
    EList<Attribute> getOwnedAttribute();

    @objid ("255093fc-a657-430f-b9a9-7163cff72abf")
    <T extends Attribute> List<T> getOwnedAttribute(java.lang.Class<T> filterClass);

    @objid ("1cdea2b4-d36b-4ad4-8cbf-778ee042ff0d")
    EList<NaryAssociationEnd> getOwnedNaryEnd();

    @objid ("2aec3e76-5a80-41dd-8523-d700238a5e7e")
    <T extends NaryAssociationEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass);

    @objid ("a4e602e4-b010-46f9-ab80-c69b84aa8007")
    EList<InformationFlow> getConveyer();

    @objid ("2907ab5c-a935-4d79-aadd-2ba7e18fdbe1")
    <T extends InformationFlow> List<T> getConveyer(java.lang.Class<T> filterClass);

    @objid ("ecbdc6c7-8132-4d40-b68b-28a6532e89e4")
    EList<Substitution> getSubstitutingSubstitution();

    @objid ("60e6e8a7-cba8-46e5-b36c-1bba6fc9c066")
    <T extends Substitution> List<T> getSubstitutingSubstitution(java.lang.Class<T> filterClass);

    @objid ("98891beb-6e58-42c4-8614-4ff90125b3ee")
    EList<AssociationEnd> getTargetingEnd();

    @objid ("c2ed7586-2f51-48f2-9aea-a2a25bd7f4a9")
    <T extends AssociationEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass);

    @objid ("97f1ab7c-aae5-4dee-926e-6a00bb255e33")
    EList<AssociationEnd> getOwnedEnd();

    @objid ("b69abdad-9755-45c2-9460-2a94ac758bf3")
    <T extends AssociationEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass);

    @objid ("98562a5e-72d5-4d90-8efa-3de07ba93a59")
    EList<BpmnParticipant> getBpmnRepresents();

    @objid ("902532ca-b62b-4a7a-8030-202868608dad")
    <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass);

    @objid ("4e0fa541-2fb1-4dad-ba1c-209d3a3d3e22")
    EList<RaisedException> getThrowing();

    @objid ("0f6502bf-6a7b-47fa-94d4-604765527f32")
    <T extends RaisedException> List<T> getThrowing(java.lang.Class<T> filterClass);

    @objid ("7a1b08c7-44cb-46fc-92fa-4899ee613fcd")
    EList<BindableInstance> getInternalStructure();

    @objid ("3c9f6b19-715e-419b-83d6-7684105206c0")
    <T extends BindableInstance> List<T> getInternalStructure(java.lang.Class<T> filterClass);

    @objid ("172d7acb-c4b4-4c10-bba6-966cda3a03c3")
    EList<ComponentRealization> getRealizedComponent();

    @objid ("e6035994-096b-4945-b7c0-f78bb75e40b5")
    <T extends ComponentRealization> List<T> getRealizedComponent(java.lang.Class<T> filterClass);

}
