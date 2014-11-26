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

import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.util.AbstractObjingModelNavigation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ecb68916-5730-4d6a-9688-81d8b5952fa2")
public class OPackageImport extends OModelElement {
    @objid ("779469fc-5cd2-4e30-a99b-bcf0cac28ef0")
    private PackageImport objingElement;

    @Override
    @objid ("588e27c8-aa95-4822-9934-e464a64fb18e")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        org.eclipse.uml2.uml.PackageImport ecorePI = UMLFactory.eINSTANCE.createPackageImport();
        return ecorePI;
    }

    @objid ("8f0fd497-7b9e-4036-9df5-cccc72ec6b30")
    public OPackageImport(PackageImport element) {
        super(element);
        this.objingElement = element;
    }

    @Override
    @objid ("47305cbc-383d-4ed9-bd42-d5085f145ebe")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        org.eclipse.uml2.uml.PackageImport ecorePkgImport = (org.eclipse.uml2.uml.PackageImport) ecoreElt;
                
        ModelElement objingImportingElt = AbstractObjingModelNavigation
                .getImportingElement(this.objingElement);
        org.modelio.metamodel.uml.statik.Package objingImportedPkg = this.objingElement.getImportedPackage();
                
        if (objingImportingElt != null && objingImportedPkg != null) {
                
            // Gets or creates the ecore importing element (the "owner"):
            org.eclipse.uml2.uml.Element ecoreImportingElt = genProp
                    .getMappedElement(objingImportingElt);
                
            // Gets or creates the ecore imported Package (the Package to
            // import):
            Package ecoreImportedPkg = (Package) genProp
                    .getMappedElement(objingImportedPkg);
                
            if (ecoreImportingElt != null && ecoreImportedPkg != null) {
                ((org.eclipse.uml2.uml.Namespace) ecoreImportingElt).getPackageImports().add(
                        (org.eclipse.uml2.uml.PackageImport)ecoreElt);
                
                // In UML2, a Package import is defined as a directed
                // relationship between an
                // importing namespace and a Package.
                if (ecoreImportingElt instanceof org.eclipse.uml2.uml.Namespace) {
                    ecorePkgImport
                            .setImportingNamespace((org.eclipse.uml2.uml.Namespace) ecoreImportingElt);
                    ecorePkgImport.setImportedPackage(ecoreImportedPkg);
                }
            }
        }
    }

    @Override
    @objid ("6aaf2418-0da6-40e2-b6f6-8c3ba7c6d417")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
    }

}
