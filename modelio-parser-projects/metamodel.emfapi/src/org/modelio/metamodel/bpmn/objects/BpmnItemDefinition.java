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
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemKind;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("0007a24c-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnItemDefinition extends BpmnRootElement {
    @objid ("c7c6ac39-0829-48f3-86d9-5cd35ad488c6")
    BpmnItemKind getItemKind();

    @objid ("06cbfe34-d580-410c-86a7-87f154f8f83d")
    void setItemKind(BpmnItemKind value);

    @objid ("9b34bcbf-0319-4388-9cc8-7bb949dc5f5b")
    boolean isIsCollection();

    @objid ("036dc62f-de34-4c4d-b197-23099fc75e26")
    void setIsCollection(boolean value);

    @objid ("794a54e0-af36-4e41-9adb-a4ef7472ef39")
    GeneralClass getStructureRef();

    @objid ("c778193f-3cbd-4711-9bb2-2604903ae4ce")
    void setStructureRef(GeneralClass value);

    @objid ("8c3e1977-c9c9-4412-a7d7-d0694b08dd17")
    EList<BpmnMessage> getTypedMessage();

    @objid ("962d13bb-8bc8-4047-b6c5-5c7108cea395")
    <T extends BpmnMessage> List<T> getTypedMessage(java.lang.Class<T> filterClass);

    @objid ("5f1378cb-da08-4637-a7d6-d3c488205d8e")
    EList<BpmnItemAwareElement> getTypedItem();

    @objid ("b8fc6a7b-6ed6-41a6-a2c3-b310a121f558")
    <T extends BpmnItemAwareElement> List<T> getTypedItem(java.lang.Class<T> filterClass);

    @objid ("1e5b61d8-1ccc-430a-a197-fcf099ac724f")
    EList<BpmnResourceParameter> getTypedResourceParameter();

    @objid ("d3340643-e6d9-40fd-aecf-1829bec8366c")
    <T extends BpmnResourceParameter> List<T> getTypedResourceParameter(java.lang.Class<T> filterClass);

}
