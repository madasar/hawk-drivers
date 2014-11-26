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
                                    

package org.modelio.xmi.model.objing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.statik.ElementRealization;

@objid ("3945dc93-ef2d-4938-a4d7-7df7608661ea")
public class OElementRealization extends OAbstraction {
    @objid ("2e3e364b-113d-480b-864a-9cf98fe46ce0")
     ElementRealization objingElement = null;

    @objid ("839accc6-f551-46c8-9403-9e6f0c9348fb")
    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        return UMLFactory.eINSTANCE.createRealization();
    }

    @objid ("ac33c6cd-eb42-4bc5-8001-f260790e8a45")
    public OElementRealization(ElementRealization element) {
        super(element);
        this.objingElement = element;
    }

}
