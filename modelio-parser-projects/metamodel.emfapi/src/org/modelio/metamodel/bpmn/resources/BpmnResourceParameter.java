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
package org.modelio.metamodel.bpmn.resources;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("0009e2dc-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceParameter extends BpmnBaseElement {
    @objid ("a89c97a2-b3f4-48d9-b7d5-cc4873cf7202")
    boolean isIsRequired();

    @objid ("803af271-a0d8-4b90-ab5b-0caed5d3bdd3")
    void setIsRequired(boolean value);

    @objid ("c693a03a-7c5f-43a1-8961-dbeac4ff09b3")
    BpmnResource getResource();

    @objid ("0af35bc3-655d-485c-a960-f0a89e834ee0")
    void setResource(BpmnResource value);

    @objid ("1c7807af-3617-4665-ba18-7ff07a1a1056")
    BpmnItemDefinition getType();

    @objid ("173661bd-b17e-427f-aff0-cdcc25dd54dd")
    void setType(BpmnItemDefinition value);

    @objid ("c513e11c-0c2c-4c91-ae50-f5174574088a")
    EList<BpmnResourceParameterBinding> getParameterBindingRefs();

    @objid ("b08d799d-4505-428c-bbbf-42ea20ab2d0d")
    <T extends BpmnResourceParameterBinding> List<T> getParameterBindingRefs(java.lang.Class<T> filterClass);

}
