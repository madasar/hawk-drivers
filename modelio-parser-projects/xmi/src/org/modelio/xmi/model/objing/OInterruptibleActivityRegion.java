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

import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.util.NotFoundException;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("810daf79-5f94-4121-9b33-a585296e1dd9")
public class OInterruptibleActivityRegion extends OModelElement{
    @objid ("d146aa07-32d0-44cd-97ff-4dbd9104f97d")
    private InterruptibleActivityRegion objingElement = null;

    @Override
    @objid ("79742d82-b22d-4d3d-a2fc-ed124577b854")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        return UMLFactory.eINSTANCE.createInterruptibleActivityRegion();
    }

    @objid ("f6d07530-e479-400d-b821-c62a2e249879")
    public OInterruptibleActivityRegion(InterruptibleActivityRegion element) {
        super(element);
        this.objingElement = element;
    }

    @Override
    @objid ("fe82fb20-7d90-4c18-9c50-2a6463c945a2")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        MObject objingOwner = this.objingElement.getCompositionOwner();
        org.eclipse.uml2.uml.Element ecoreOwner = GenerationProperties.getInstance().getMappedElement(objingOwner);
                
        if (ecoreOwner != null && objingOwner instanceof Activity)
            attachToActivity(ecoreElt, ecoreOwner);
    }

    @Override
    @objid ("508867f5-a7f2-4a25-9f90-292ccccb704e")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        setInterrupts((org.eclipse.uml2.uml.InterruptibleActivityRegion) ecoreElt);
    }

    @objid ("19c488f6-174f-4282-9b2e-666aed57fb15")
    private void attachToActivity(org.eclipse.uml2.uml.Element ecoreElt, org.eclipse.uml2.uml.Element ecoreOwner) {
        if (ecoreOwner instanceof  org.eclipse.uml2.uml.Activity) {
             org.eclipse.uml2.uml.Activity owner = (org.eclipse.uml2.uml.Activity) ecoreOwner;
            owner.getGroups().add((org.eclipse.uml2.uml.ActivityGroup)ecoreElt);
        } else {
            ecoreElt.destroy();
            throw new NotFoundException("Owner Class ("
                    + ecoreOwner.getClass().getSimpleName() + ") Not Found");
        }
    }

    @objid ("1d547986-144d-48fe-aa22-ff9a2fd5c66a")
    private void setInterrupts(org.eclipse.uml2.uml.InterruptibleActivityRegion region) {
        for (ActivityEdge objingEdge : this.objingElement.getInterruptingEdge()) {
            org.eclipse.uml2.uml.Element ecoreEdge = GenerationProperties.getInstance().getMappedElement(objingEdge);
            if (ecoreEdge instanceof  org.eclipse.uml2.uml.ActivityEdge) {
                region.getInterruptingEdges().add((org.eclipse.uml2.uml.ActivityEdge)ecoreEdge);
            }
        }
    }


}
