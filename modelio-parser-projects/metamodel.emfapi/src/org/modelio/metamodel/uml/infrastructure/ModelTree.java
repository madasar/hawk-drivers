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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("00891e1c-c4be-1fd8-97fe-001ec947cd2a")
public interface ModelTree extends ModelElement {
    @objid ("15cf3a9d-a2f0-44ca-a6c5-3795599e6a6d")
    ModelTree getOwner();

    @objid ("3377a62c-1572-4109-b4df-70070584d885")
    void setOwner(ModelTree value);

    @objid ("03a67e7f-c684-4afb-8b93-b2a91415fad0")
    EList<ModelTree> getOwnedElement();

    @objid ("8ca35cf5-7c76-4bc6-8226-48dcb1d24617")
    <T extends ModelTree> List<T> getOwnedElement(java.lang.Class<T> filterClass);

}
