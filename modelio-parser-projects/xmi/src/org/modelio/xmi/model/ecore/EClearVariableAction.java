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
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.util.modelermodule.IModelerModuleStereotypes;

@objid ("d471ac82-b1fd-4f60-af1e-435eeba21abd")
public class EClearVariableAction extends EActivityNode {
    @objid ("dbe25f1e-857c-42b1-8625-924928b23558")
    @Override
    public Element createObjingElt() {
        IMModelServices mmService = ReverseProperties.getInstance().getMModelServices();
        
        OpaqueAction element = mmService.getModelFactory()
                .createOpaqueAction();
        
        try {
            element.getExtension().add(mmService
                    .getStereotype(IModelerModuleStereotypes.UML2CLEARVARIABLEACTION, element.getMClass()));
        } catch (ElementNotUniqueException e) {
            Xmi.LOG.warning(e);
        }
        return element;
    }

    @objid ("7fb45c6a-f017-4be6-8e9a-13c6ff0a67d5")
    public EClearVariableAction(org.eclipse.uml2.uml.ClearVariableAction element) {
        super(element);
    }

}
