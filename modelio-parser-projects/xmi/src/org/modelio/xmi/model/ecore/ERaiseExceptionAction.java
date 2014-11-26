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

@objid ("432b78e9-17fb-494b-9567-dbb2ebb699d7")
public class ERaiseExceptionAction extends EActivityNode {
    @objid ("f70c5030-25a4-4d6f-8aaa-83eb4f77b172")
    @Override
    public Element createObjingElt() {
        IMModelServices mmServices = ReverseProperties.getInstance().getMModelServices();
        
        OpaqueAction element = mmServices.getModelFactory()
                .createOpaqueAction();
        
        try {
            element.getExtension().add(mmServices
                    .getStereotype( IModelerModuleStereotypes.UML2RAISEEXCEPTIONACTION, element.getMClass()));
        } catch (ElementNotUniqueException e) {
           Xmi.LOG.warning(e);
        }
        return element;
    }

    @objid ("544f9ef9-1853-4028-a275-af342aaa4cb7")
    public ERaiseExceptionAction(org.eclipse.uml2.uml.RaiseExceptionAction element) {
        super(element);
    }

}
