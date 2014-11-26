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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;

@objid ("0089d1ea-c4be-1fd8-97fe-001ec947cd2a")
public interface Note extends ModelElement {
    @objid ("1d06b5b2-fbb0-4a29-890d-6d136793715c")
    String getContent();

    @objid ("5de2187a-762f-4b8e-b4b5-b8c9d93aea2d")
    void setContent(String value);

    @objid ("1fc1deba-a4d9-48b6-996a-bb47e3b05c39")
    NoteType getModel();

    @objid ("93f1d9e8-8a7b-48a1-8e45-52bc56a5a5c9")
    void setModel(NoteType value);

    @objid ("67b2accd-e005-494a-8371-d4dc913bff00")
    ModelElement getSubject();

    @objid ("fdf619ca-ddac-4cd6-a1ad-e7810d34a29e")
    void setSubject(ModelElement value);

}
