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
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("0008034a-c4bf-1fd8-97fe-001ec947cd2a")
public interface ElementImport extends ModelElement {
    @objid ("2ca5d0be-a6a1-44c6-81f1-7938fc76daf8")
    VisibilityMode getVisibility();

    @objid ("b45ca791-a9e0-48e6-8784-6484b63bde94")
    void setVisibility(VisibilityMode value);

    @objid ("f5464ac9-7f78-430e-8656-87ce744244d5")
    NameSpace getImportingNameSpace();

    @objid ("a8f246ff-4dab-4dd5-91f7-12fb7b7f539d")
    void setImportingNameSpace(NameSpace value);

    @objid ("ff7d1bc9-ea6a-4d73-b00b-0a5172e32f86")
    NameSpace getImportedElement();

    @objid ("34e874b6-b9da-4acb-9b36-be797d4bf4cd")
    void setImportedElement(NameSpace value);

    @objid ("ddf1b5a2-a7e2-41d3-8af4-9bfa6a22e6b5")
    Operation getImportingOperation();

    @objid ("5973888f-ed48-447b-9c76-a2fc7535c73f")
    void setImportingOperation(Operation value);

}
