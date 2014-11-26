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

import java.util.List;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.xmi.reverse.PartialImportMap;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.reverse.TotalImportMap;
import org.modelio.xmi.util.EcoreModelNavigation;

@objid ("9b93fb70-8e60-4274-99c6-bb78998bf7d7")
public class EConstraint extends ENamedElement {
    @objid ("4dfd8361-a964-4a12-b40d-f5f9a7d7f5cb")
    private org.eclipse.uml2.uml.Constraint ecoreElement = null;

    @objid ("9db609af-4b48-4dd6-974f-af74b58a4426")
    @Override
    public Element createObjingElt() {
        if ((! EcoreModelNavigation.isCondition(this.ecoreElement)) 
                && ((this.ecoreElement.getConstrainedElements().size() > 0))){
            return ReverseProperties.getInstance().getMModelServices().getModelFactory()
                    .createConstraint();
        }
        return null;
    }

    @objid ("8db133e8-3167-48f5-931c-63a2b67bcae3")
    public EConstraint(org.eclipse.uml2.uml.Constraint element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("c9e3ba3e-c263-46e6-9cd9-7de7bde00722")
    @Override
    public void attach(Element objingElt) {
        if (objingElt instanceof Constraint)
            attachConstraint((Constraint) objingElt);
    }

    @objid ("2fe3b922-1d44-4f5d-892b-22337c43d1ad")
    @Override
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        
        if (objingElt instanceof Constraint) {
            setBody((Constraint) objingElt);
        }
    }

    @objid ("6e173c08-8158-4e23-86e4-d99eb83ea0fb")
    private void setBody(Constraint objingElt) {
        org.eclipse.uml2.uml.ValueSpecification specification = this.ecoreElement.getSpecification();
        if (specification != null) {
            String body = specification.stringValue();
            if (body != null)
                objingElt.setBody(body);
        }
    }

    @objid ("1a8fa557-f28f-499c-a0e2-c0d87bcd6a0e")
    private void attachConstraint(Constraint constraint) {
        EList<org.eclipse.uml2.uml.Element> ecoreConstrainedElts = this.ecoreElement.getConstrainedElements();
        boolean attached = false;
        
        for (org.eclipse.uml2.uml.Element ecoreConstrainedElt : ecoreConstrainedElts) {
        
            Object object = ReverseProperties.getInstance().getMappedElement(ecoreConstrainedElt);
        
            if (object instanceof ModelElement){
                ModelElement objingConstrainedElt = (ModelElement) object;
                constraint.getConstrainedElement().add(objingConstrainedElt);
                attached = true;
        
            }else if (object instanceof List){
                List<ModelElement> list = (List<ModelElement>) object;
                for (ModelElement objingConstrainedElt : list){
                    constraint.getConstrainedElement().add(objingConstrainedElt);
                    attached = true;
                }
            }
        }
        
        if (!attached){
            PartialImportMap.getInstance().remove(this.ecoreElement);
            TotalImportMap.getInstance().remove(this.ecoreElement);
            constraint.delete();
        }
    }

}
