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
import org.modelio.metamodel.uml.behavior.activityModel.InstanceNode;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.util.ObjingEAnnotation;

@objid ("5d28bcaf-8bf3-4f7a-a979-304c72d24ea2")
public class OInstanceNode extends OObjectNode {
    @Override
    @objid ("51ec6e35-afde-4f19-a135-517a3dc17129")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        org.eclipse.uml2.uml.Element ecoreElt = UMLFactory.eINSTANCE.createCentralBufferNode();
        if (GenerationProperties.getInstance().isRoundtripEnabled()){
            ObjingEAnnotation.setType(ecoreElt, "InstanceNode");
        }
        return ecoreElt;
    }

    @objid ("7222e6b6-66ba-479c-a437-39fcfd8581d1")
    public OInstanceNode(InstanceNode element) {
        super(element);
    }


}
