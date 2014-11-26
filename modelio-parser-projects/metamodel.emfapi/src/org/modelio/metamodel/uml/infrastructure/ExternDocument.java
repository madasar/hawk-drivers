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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00924014-c4be-1fd8-97fe-001ec947cd2a")
public interface ExternDocument extends ModelElement {
    @objid ("9a22b3dc-60b2-47e9-9f3e-1e1d9f919f19")
    String getMimeType();

    @objid ("8134138e-4d91-457b-acbb-3b879e03731b")
    void setMimeType(String value);

    @objid ("93eb042d-ca05-4eb4-b5bd-bcf0c713de53")
    String getPath();

    @objid ("071da3d8-98b7-42b0-8526-f03d1edf3dcf")
    void setPath(String value);

    @objid ("235296c5-35af-4fc9-8446-f759b8d99143")
    String getAbstract();

    @objid ("5e47d2b6-da19-48e1-a958-a7da2a19573e")
    void setAbstract(String value);

    @objid ("feb7ab92-159f-4f55-be49-a559e26d3c2f")
    ExternDocumentType getType();

    @objid ("1be5689b-3ec6-4e8e-8524-e5fbca4d5741")
    void setType(ExternDocumentType value);

    @objid ("45afa824-1f68-4be5-a005-43e46da6b865")
    ModelElement getSubject();

    @objid ("1b58ab8f-6b0c-4a04-a3ec-f5ba4e67f168")
    void setSubject(ModelElement value);

}
