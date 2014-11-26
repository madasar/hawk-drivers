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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("009893c4-c4be-1fd8-97fe-001ec947cd2a")
public interface AttributeLink extends ModelElement {
    @objid ("77b6df25-fa92-4bb2-84a6-91aade6d1492")
    String getValue();

    @objid ("89885c74-52b2-4c90-9885-b8f30f58523b")
    void setValue(String value);

    @objid ("225f77e4-efcd-400a-9235-9e3cf35d0246")
    Instance getAttributed();

    @objid ("08e0a5da-5610-4747-b017-75b125107de2")
    void setAttributed(Instance value);

    @objid ("150938a9-1038-44c4-a2c6-4a86b24276ff")
    Attribute getBase();

    @objid ("dc5677b7-062c-44b9-990c-5c4ec567591c")
    void setBase(Attribute value);

}
