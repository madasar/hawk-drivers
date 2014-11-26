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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.util.EcoreModelNavigation;
import org.modelio.xmi.util.modelermodule.IModelerModuleStereotypes;

@objid ("1af368db-230a-4aa4-9366-022c76eec9db")
public class ECommunicationPath extends ENamedElement {
    @objid ("dce6c23e-e9d5-4c88-8a56-91a5d28db052")
    @Override
    public Element createObjingElt() {
        Association objingAssoc = null;
        
        int endNumber = EcoreModelNavigation.getValidEndNumber((org.eclipse.uml2.uml.CommunicationPath)getEcoreElement());
        
        if (endNumber == 2){
        
        
            IMModelServices mmServices = ReverseProperties.getInstance().getMModelServices();
            objingAssoc = mmServices.getModelFactory().createAssociation();
        
            try {
                objingAssoc.getExtension().add(mmServices
                        .getStereotype( IModelerModuleStereotypes.UML2COMMUNICATIONPATH, objingAssoc.getMClass()));
            } catch (ElementNotUniqueException e) {
                Xmi.LOG.warning(e);
            }
        
        }
        return objingAssoc;
    }

    @objid ("2fa5c192-a78c-4cad-8262-125b1f8036f8")
    public ECommunicationPath(org.eclipse.uml2.uml.CommunicationPath element) {
        super(element);
    }

}
