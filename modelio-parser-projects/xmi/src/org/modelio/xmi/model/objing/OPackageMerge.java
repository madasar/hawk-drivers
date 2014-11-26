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

import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.xmi.generation.GenerationProperties;

@objid ("b0c7b668-6720-4843-8a9b-7ad87b401039")
public class OPackageMerge extends OModelElement {
    @objid ("077370a0-2498-43d5-9613-c1a37b3d0d06")
    private PackageMerge objingElement;

   
    @Override
    @objid ("7db12ed8-568e-4611-a7d4-25994efae8b7")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        return UMLFactory.eINSTANCE.createPackageMerge();
    }

    @objid ("895906fa-ac90-4b32-a6a8-d26cf35d77c2")
    public OPackageMerge(PackageMerge element) {
        super(element);
        this.objingElement = element;
    }

    @Override
    @objid ("94749249-9679-4613-8b11-8ba2c96e297d")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        org.eclipse.uml2.uml.PackageMerge ecorePkgMerge = (org.eclipse.uml2.uml.PackageMerge) ecoreElt;
                
        org.modelio.metamodel.uml.statik.Package objingMergedPackage = this.objingElement.getMergedPackage();
        org.modelio.metamodel.uml.statik.Package objingReceivingPackage = this.objingElement.getReceivingPackage();
                
        if (objingMergedPackage != null && objingReceivingPackage != null) {
            // Gets or creates the ecore merged Package:
            Package ecoreMergedPackage = (Package) genProp
                    .getMappedElement(objingMergedPackage);
                
            // Gets or creates the ecore receiving Package:
            Package ecoreReceivingPackage = (Package) genProp
                    .getMappedElement(objingReceivingPackage);
                
            if (ecoreMergedPackage != null && ecoreReceivingPackage != null) {
                ecorePkgMerge.setMergedPackage(ecoreMergedPackage);
                ecorePkgMerge.setReceivingPackage(ecoreReceivingPackage);
                ecoreReceivingPackage.getPackageMerges().add((org.eclipse.uml2.uml.PackageMerge)ecoreElt);
            }
        }
    }

}
