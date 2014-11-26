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
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("0097ec08-c4be-1fd8-97fe-001ec947cd2a")
public interface Attribute extends StructuralFeature {
    @objid ("bb7c37cd-6c0c-4786-b2f3-4303bf122c05")
    String getTypeConstraint();

    @objid ("6fd8c953-74a9-4b91-bc3a-af54933ac422")
    void setTypeConstraint(String value);

    @objid ("b52c4276-1dfc-4d9e-8753-0cefb49a59f7")
    String getValue();

    @objid ("e9a77024-e0a2-48a1-97f0-75279dac2d9c")
    void setValue(String value);

    @objid ("60b31e35-0f77-4f5f-8841-82a1f8461ee8")
    boolean isTargetIsClass();

    @objid ("759bdf9a-c1a9-4237-ad5b-01cfff142d84")
    void setTargetIsClass(boolean value);

    @objid ("239c533e-46b6-4725-bbde-5d8b04974cff")
    GeneralClass getType();

    @objid ("14c6f784-01c4-4803-9b35-bd3681a2538a")
    void setType(GeneralClass value);

    @objid ("bf284bae-effa-45e1-a749-420bc6adf948")
    Classifier getOwner();

    @objid ("f33e2380-f18c-45b2-ab67-1680f8466e46")
    void setOwner(Classifier value);

    @objid ("d9a2f969-ff5f-4998-a386-15ab9fe20cf9")
    EList<AttributeLink> getOccurence();

    @objid ("f8dff8e6-bc43-4d69-b628-34d78909817c")
    <T extends AttributeLink> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("345441bc-6248-42dc-b759-1255b2b8f00f")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("2a9e792b-bfd7-45f0-ba84-cc58bf5619b8")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

    @objid ("a244975f-e87d-49c9-9d01-a5d97a4d4f7d")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("8db235b6-d4ea-4554-88de-e10c2a92225e")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("d9cc17c8-dd2a-4e62-9b83-482a3d24f5fb")
    AssociationEnd getQualified();

    @objid ("f62bb6ea-050e-4303-80db-5a928aed0bd2")
    void setQualified(AssociationEnd value);

}
