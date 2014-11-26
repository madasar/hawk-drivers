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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.ObjingEAnnotation;

@objid ("41f10e59-7437-40f9-9d86-4728b40c14fd")
public class OElementImport extends OModelElement {
    @objid ("b6fce071-8ed0-4a28-b69c-2c049dff1653")
    private ElementImport objingElement = null;

    @Override
    @objid ("e10edbe9-51b5-4232-8758-9d3b4bf299a6")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        return UMLFactory.eINSTANCE.createElementImport();
    }

    @objid ("90b9243a-c22b-4bd2-aece-b4d5f1816100")
    public OElementImport(ElementImport element) {
        super(element);
        this.objingElement = element;
    }

    @Override
    @objid ("f2a57055-37e3-499c-8143-f1cbb2be25cb")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
      
        org.eclipse.uml2.uml.ElementImport ecoreEltImport = (org.eclipse.uml2.uml.ElementImport) ecoreElt;
                
        ModelElement objingImportingElt = AbstractObjingModelNavigation
                .getImportingElement(this.objingElement);
        NameSpace objingImportedElt = this.objingElement.getImportedElement();
                
        if ((objingImportingElt != null) && (objingImportedElt != null)) {
            GenerationProperties genProp = GenerationProperties.getInstance();
                
            // Gets or creates the ecore importing element (the "owner"):
            org.eclipse.uml2.uml.Element ecoreImportingElt = genProp.getMappedElement(objingImportingElt);
                
            // Gets or creates the ecore imported element (the element to
            // import):
            org.eclipse.uml2.uml.Element ecoreImportedElt = genProp.getMappedElement(objingImportedElt);
                
            if (ecoreImportingElt != null && ecoreImportedElt != null) {
                ((org.eclipse.uml2.uml.Namespace) ecoreImportingElt).getElementImports().add(
                        (org.eclipse.uml2.uml.ElementImport)ecoreElt);
                
                // In UML2, an element import is defined as a directed
                // relationship between an
                // importing namespace and a packageable element.
                if (ecoreImportedElt instanceof org.eclipse.uml2.uml.PackageableElement) {
                    ecoreEltImport
                            .setImportingNamespace((org.eclipse.uml2.uml.Namespace) ecoreImportingElt);
                    ecoreEltImport
                            .setImportedElement((org.eclipse.uml2.uml.PackageableElement) ecoreImportedElt);
                } else if (ecoreImportedElt instanceof org.eclipse.uml2.uml.NamedElement) {
                    ObjingEAnnotation.setImportedElement(ecoreImportingElt,
                            ((org.eclipse.uml2.uml.NamedElement) ecoreImportedElt)
                                    .getQualifiedName());
                }
            }
        }
    }

}
