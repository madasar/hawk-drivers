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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("000b28b8-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceParameterBinding extends BpmnBaseElement {
    @objid ("50a3476f-1ef7-4a43-bc78-7c26dd74eabe")
    String getExpression();

    @objid ("5f16b8ee-13fa-463b-b658-1eb1f51df225")
    void setExpression(String value);

    @objid ("a207adea-9f93-472f-8182-f24ff272dc80")
    BpmnResourceRole getResourceRole();

    @objid ("0bc7d747-ddd3-4e92-b604-09ec2bfd7cc0")
    void setResourceRole(BpmnResourceRole value);

    @objid ("482b5a2b-675f-49ab-b597-92ada6a369fb")
    BpmnResourceParameter getParameterRef();

    @objid ("ce2cc0da-2fdf-4ca6-9752-b93d5da035c8")
    void setParameterRef(BpmnResourceParameter value);

}
