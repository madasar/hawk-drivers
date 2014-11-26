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

import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.factory.ElementNotUniqueException;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.util.XMIProperties;
import org.modelio.xmi.util.modelermodule.IModelerModuleStereotypes;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class mandes the import of Ecore include elements
 * @author ebrosse
 */
@objid ("9cfe7a50-0cee-4032-97db-01c42b8cfddd")
public class EInclude extends ENamedElement {
    @objid ("694cb544-2058-46f1-8abe-9fb65d66a2fa")
    private org.eclipse.uml2.uml.Include ecoreElement = null;
    
    private  IMModelServices mModelServices = ReverseProperties.getInstance().getMModelServices();

    @objid ("cb30b753-0833-4e23-bee8-de7d979b4bd3")
    @Override
    public Element createObjingElt() {
       
        return this.mModelServices.getModelFactory()
                .createUseCaseDependency();
    }

    /**
     * EInclude constructor with the imported Ecore org.eclipse.uml2.uml.Include as parameter
     * @param element : the imported Ecore include
     */
    @objid ("2b5b5601-abee-4534-8153-6ab47fb5c355")
    public EInclude(final org.eclipse.uml2.uml.Include element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("48d924a7-e3c4-494a-8a92-8d59aedb9978")
    @Override
    public void attach(Element objingElt) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        org.eclipse.uml2.uml.UseCase ecoreTarget = this.ecoreElement.getAddition();
        org.eclipse.uml2.uml.UseCase ecoreOrigin = this.ecoreElement.getIncludingCase();
        UseCase objingTarget = (UseCase) revProp
                .getMappedElement(ecoreTarget);
        UseCase objingOrigin = (UseCase) revProp
                .getMappedElement(ecoreOrigin);
        
        if (objingTarget != null && objingOrigin != null) {
            UseCaseDependency objingUseCaseDependency = (UseCaseDependency) objingElt;
            objingUseCaseDependency.setOrigin(objingOrigin);
            objingUseCaseDependency.setTarget(objingTarget);
           
            try {
                objingUseCaseDependency.getExtension().add(this.mModelServices.getStereotype(
                        XMIProperties.modelerModuleName, IModelerModuleStereotypes.INCLUDE, 
                        objingUseCaseDependency.getMClass()));
            } catch (ElementNotUniqueException e) {
                Xmi.LOG.warning(e);
            }
        
        }
    }

}
