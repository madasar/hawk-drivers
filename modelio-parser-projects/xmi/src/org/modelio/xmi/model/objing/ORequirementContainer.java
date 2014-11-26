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

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.NotFoundException;
import org.modelio.xmi.util.ObjingEAnnotation;

@objid ("671ff6e3-3200-467a-bc73-371931b0c143")
public class ORequirementContainer extends OElement implements IOElement {
    @Override
    @objid ("558d7344-7c0c-48cc-a640-c2e4241e31e8")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        Package result  = UMLFactory.eINSTANCE.createPackage();
        ObjingEAnnotation.setRequirementContainer(result, true);
        return result;
    }

    @objid ("926ff7e1-5467-455d-b774-3faef836e128")
    public ORequirementContainer(RequirementContainer param) {
        super(param);
    }

    @Override
    @objid ("bfd8885e-b0a9-44f1-b6af-265a805ccec1")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        MObject objingOwner = ((RequirementContainer)getObjingElement()).getCompositionOwner();
                
        if (objingOwner != null) {// else : case of the root package
            org.eclipse.uml2.uml.Element ecoreOwner = GenerationProperties.getInstance().getMappedElement(objingOwner);
                
            if (ecoreOwner != null) {
                if (ecoreOwner instanceof Package) {
                    Package ownerIsPkg = (Package) ecoreOwner;
                    ownerIsPkg.getPackagedElements().add((PackageableElement)ecoreElt);
                } else if (ecoreOwner instanceof Component) {
                    Component ownerIsCmpnt = (org.eclipse.uml2.uml.Component) ecoreOwner;
                    ownerIsCmpnt.getPackagedElements().add((PackageableElement)ecoreElt);
                }
                else {
                    ecoreElt.destroy();
                    throw new NotFoundException("Owner Class ("
                            + ecoreOwner.getClass().getSimpleName()
                            + ") Not Found");
                }
            }
        }
    }

    @Override
    @objid ("17ec34e6-b0c5-4f85-87fa-3b2c899da839")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        this.setName((Package) ecoreElt);
    }

    @objid ("644523e0-1da7-4a66-8906-c5c90c90bd4f")
    private void setName(final Package ecoreElt) {
        String name = ((RequirementContainer)getObjingElement()).getName();
        if (AbstractObjingModelNavigation.isNotNullOrEmpty(name))
            ecoreElt.setName(name);
    }

}
