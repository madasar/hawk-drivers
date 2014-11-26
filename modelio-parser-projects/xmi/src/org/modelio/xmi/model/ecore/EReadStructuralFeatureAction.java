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
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.util.XMIProperties;
import org.modelio.xmi.util.modelermodule.IModelerModuleStereotypes;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c6ddac9b-4a0c-464e-ba53-867bbdc45656")
public class EReadStructuralFeatureAction extends EActivityNode {
    @objid ("e7b4f4aa-7df1-4a1a-9818-b6509fdec0c1")
    private org.eclipse.uml2.uml.ReadStructuralFeatureAction ecoreElement = null;
    
    private IMModelServices mmServices = ReverseProperties.getInstance().getMModelServices();
    

    @objid ("bdd08c53-b632-4a94-a168-7d8a62f2e05b")
    @Override
    public Element createObjingElt() {
       
        OpaqueAction element = mmServices.getModelFactory()
                .createOpaqueAction();
        
        try {
            element.getExtension().add(mmServices
                    .getStereotype( IModelerModuleStereotypes.UML2READSTRUCTURALFEATUREACTION, element.getMClass()));
        } catch (ElementNotUniqueException e) {
            Xmi.LOG.warning(e);
        }
        return element;
    }

    @objid ("314e3281-a7b8-452e-bbf5-15ae30e79642")
    public EReadStructuralFeatureAction(org.eclipse.uml2.uml.ReadStructuralFeatureAction element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("b70ee92c-57e6-4212-8b14-bed7ab23af16")
    @Override
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setFeature((OpaqueAction) objingElt);
    }

    @objid ("0b878b15-814e-4ff5-8bfb-f2efc67c87aa")
    private void setFeature(OpaqueAction objingElt) {
        
        org.eclipse.uml2.uml.StructuralFeature feature = this.ecoreElement.getStructuralFeature();
        if (feature != null) {
            Object behavior = ReverseProperties.getInstance().getMappedElement(feature);
        
            ModelElement obBehavior = null;
        
            if (behavior instanceof ModelElement){
                obBehavior = (ModelElement) behavior;
                Dependency dependency =  this.mmServices.getModelFactory().createDependency();
        
                try {
                    dependency.getExtension().add(this.mmServices
                            .getStereotype(XMIProperties.modelerModuleName, IModelerModuleStereotypes.UML2STRUCTURALFEATUREREFERENCE, dependency.getMClass()));
                } catch (ElementNotUniqueException e) {
                   Xmi.LOG.warning(e);
                }
                dependency.setDependsOn(obBehavior);
                dependency.setImpacted(objingElt);
            }else{
                objingElt.delete();
            }
        }
    }

}
