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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.NaryAssociation;

@objid ("0002bc78-c4bf-1fd8-97fe-001ec947cd2a")
public interface ClassAssociation extends ModelElement {
    @objid ("5e50240a-6cf6-4dce-bba0-f8c5981d1c7a")
    NaryAssociation getNaryAssociationPart();

    @objid ("f27bc7be-3bd9-4e7a-aa75-7020627aa85c")
    void setNaryAssociationPart(NaryAssociation value);

    @objid ("6ae0a927-8a5c-4966-97dd-b4d0f8f92924")
    Class getClassPart();

    @objid ("48f3605c-dbdb-48c1-8cdc-ba4dbe1de742")
    void setClassPart(Class value);

    @objid ("b50a33b9-4c2c-4b2c-8137-62b389098522")
    Association getAssociationPart();

    @objid ("9427f79f-f1f6-48a5-b501-17417155be26")
    void setAssociationPart(Association value);

}
