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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;

@objid ("001c3784-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateBinding extends ModelElement {
    @objid ("a21eb61d-189a-4afa-896a-097af693d443")
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    @objid ("6b9245fb-af77-4717-af94-462dee04872c")
    <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass);

    @objid ("20b7f2a4-3064-491d-a1c6-acbcf9b4640d")
    Operation getBoundOperation();

    @objid ("0cc64a90-2b35-44c9-aa7c-9f0e389c8346")
    void setBoundOperation(Operation value);

    @objid ("574179ca-eabd-4f31-9b41-d949cf20ad6b")
    Operation getInstanciatedTemplateOperation();

    @objid ("c380cbae-dbf1-4aa3-890e-a81be1e6b963")
    void setInstanciatedTemplateOperation(Operation value);

    @objid ("21093758-22cf-4359-9d3c-6a159593e1dc")
    NameSpace getInstanciatedTemplate();

    @objid ("2de942a4-f725-4d9b-8188-5df15c53791f")
    void setInstanciatedTemplate(NameSpace value);

    @objid ("e92fa858-2928-4d69-8e2e-1f3ce391a410")
    NameSpace getBoundElement();

    @objid ("b6be36b9-f876-418a-9206-2e17b412cb25")
    void setBoundElement(NameSpace value);

}
