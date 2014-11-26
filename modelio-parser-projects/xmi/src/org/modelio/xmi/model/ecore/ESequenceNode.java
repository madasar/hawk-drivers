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
                                    

package org.modelio.xmi.model.ecore;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.factory.ElementNotUniqueException;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.util.modelermodule.IModelerModuleStereotypes;

@objid ("93e7f010-1359-4f7c-9084-105c13ad6c10")
public class ESequenceNode extends EStructuredActivityNode {
    @objid ("502974cd-192f-4e4d-a62d-019aca1f388c")
    @Override
    public Element createObjingElt() {
        IMModelServices mmServices = ReverseProperties.getInstance().getMModelServices();
        
        StructuredActivityNode result =  mmServices.getModelFactory()
                .createStructuredActivityNode();
        
        try {
            result.getExtension().add(mmServices.getStereotype(
                    IModelerModuleStereotypes.UML2SEQUENCENODE, result.getMClass()));
        } catch (ElementNotUniqueException e) {
            Xmi.LOG.warning(e);
        }
        return result;
    }

    @objid ("43849c82-ef42-4b95-9864-ba3309503a10")
    public ESequenceNode(org.eclipse.uml2.uml.SequenceNode element) {
        super(element);
    }

}
