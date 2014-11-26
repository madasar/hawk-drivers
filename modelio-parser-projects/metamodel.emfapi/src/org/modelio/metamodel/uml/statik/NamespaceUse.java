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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("0012264a-c4bf-1fd8-97fe-001ec947cd2a")
public interface NamespaceUse extends Element {
    @objid ("b8062200-c24d-4e43-829b-41e90a19671a")
    NameSpace getUser();

    @objid ("11abbbb0-9574-44a4-9a27-3faba5dc2e4b")
    void setUser(NameSpace value);

    @objid ("95e76a56-a637-490f-9211-41f6995e4851")
    NameSpace getUsed();

    @objid ("7182be0b-3e0f-4a8f-a31e-4ee2f1d941e1")
    void setUsed(NameSpace value);

    @objid ("f39c9d60-75e6-4757-8ac2-60a08742a9d2")
    EList<Element> getCause();

    @objid ("c766f8f9-d89a-4d97-90b0-0a92c76ce8f3")
    <T extends Element> List<T> getCause(java.lang.Class<T> filterClass);

}
