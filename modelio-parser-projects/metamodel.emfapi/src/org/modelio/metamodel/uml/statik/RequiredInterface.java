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
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;

@objid ("001b5224-c4bf-1fd8-97fe-001ec947cd2a")
public interface RequiredInterface extends ModelElement {
    @objid ("1a42f240-16f0-4789-8b16-9dbf8aed227e")
    EList<Interface> getRequiredElement();

    @objid ("6125ec78-8a11-4dba-b051-3e2423834afe")
    <T extends Interface> List<T> getRequiredElement(java.lang.Class<T> filterClass);

    @objid ("f1d7b575-6f55-4696-98a7-76227d43bd7c")
    EList<LinkEnd> getProvider();

    @objid ("a1322dc7-64c0-4e88-86fa-15e2bb1f4132")
    <T extends LinkEnd> List<T> getProvider(java.lang.Class<T> filterClass);

    @objid ("f4ec57f1-4672-4703-8e86-63dcb15a3145")
    Port getRequiring();

    @objid ("78bd9d56-aed7-473c-8216-5de3cfae2ede")
    void setRequiring(Port value);

    @objid ("a1783078-4785-4792-a5ba-bec4c5197c77")
    EList<NaryLinkEnd> getNaryProvider();

    @objid ("8c93a8ab-2234-4b6e-bd48-73e7b19ba99e")
    <T extends NaryLinkEnd> List<T> getNaryProvider(java.lang.Class<T> filterClass);

}
