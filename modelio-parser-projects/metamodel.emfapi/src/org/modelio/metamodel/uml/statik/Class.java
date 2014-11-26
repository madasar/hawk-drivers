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
import org.modelio.metamodel.uml.statik.ClassAssociation;

@objid ("0002155c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Class extends GeneralClass {
    @objid ("83a2ef8f-204c-4232-b43a-392b615db6d0")
    boolean isIsActive();

    @objid ("6d9ddfd9-6e96-41f8-9f45-8f8f0c47e80c")
    void setIsActive(boolean value);

    @objid ("ddcedc4e-ab36-4851-aa83-53001d8b4669")
    boolean isIsMain();

    @objid ("38d589a1-6d71-4635-b8e9-22b099deb087")
    void setIsMain(boolean value);

    @objid ("e854c3ae-7f3f-44c0-b05b-6d005992faab")
    ClassAssociation getLinkToAssociation();

    @objid ("7cd054f5-f652-45ea-9be1-939c76b85906")
    void setLinkToAssociation(ClassAssociation value);

}
