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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;

@objid ("001dff92-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateParameterSubstitution extends ModelElement {
    @objid ("f46fa650-638e-4ab3-9614-aa2b2ff71c52")
    String getValue();

    @objid ("0a02bb64-1748-4671-9081-2f80c02a496a")
    void setValue(String value);

    @objid ("361f1893-3301-405e-a83f-0560f81b2dfe")
    TemplateBinding getOwner();

    @objid ("468f4d81-9a3a-4428-8a7f-ebfac16be925")
    void setOwner(TemplateBinding value);

    @objid ("d8a322da-9b72-42e4-9631-d403ba23a655")
    ModelElement getActual();

    @objid ("5778376a-204d-4672-a1e1-9781adc0937d")
    void setActual(ModelElement value);

    @objid ("6bfed020-9774-4ba6-8e3c-4aeaa4eab9ec")
    TemplateParameter getFormalParameter();

    @objid ("e28bf361-8e1d-4e1c-beac-28e53375a6eb")
    void setFormalParameter(TemplateParameter value);

}
