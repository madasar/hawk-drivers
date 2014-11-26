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

import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNodeOrderingKind;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.util.XMILogs;

@objid ("bd8cad09-829a-4450-a166-810d875ea6ce")
public class EOutputPin extends EPin {
    @objid ("4a082cf2-b05b-4e63-b19d-f7766ce1a27d")
    private org.eclipse.uml2.uml.OutputPin ecoreElement = null;

    @objid ("d0fda3a7-ab62-4b84-b65b-499e8e4e9089")
    @Override
    public Element createObjingElt() {
        return  ReverseProperties.getInstance().getMModelServices().getModelFactory()
                .createOutputPin();
    }

    @objid ("262c60ac-aedf-4f7d-9ee1-7b565ea44506")
    public EOutputPin(org.eclipse.uml2.uml.OutputPin element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("e76388ab-d56c-449f-988c-28a407e27e5e")
    @Override
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        // Properties defined on ObjectNode
        setControlType((OutputPin) objingElt);
        setOrdering((OutputPin) objingElt);
        setSelectionBehavior((OutputPin) objingElt);
        setType((OutputPin) objingElt);
        setState((OutputPin) objingElt);
    }

    @objid ("d8979ab3-693b-4620-be37-bdc2303c9f99")
    private void attachToAction(Element objingElt) {
        org.eclipse.uml2.uml.Action ecoreAction =  (org.eclipse.uml2.uml.Action) getEcoreElement().getOwner();
        
        Object objingAction = ReverseProperties.getInstance().getMappedElement(ecoreAction);
        if (objingAction instanceof ActivityAction) 
            ((OutputPin) objingElt).setOutputing((ActivityAction) objingAction);
        else{
            XMILogs.getInstance().writelnInLog("owner of outputpin was " + objingAction.getClass().getSimpleName());
            objingElt.delete();
        }
    }

    @objid ("1682a770-1a35-41fa-aa7d-ac27193b3143")
    private void setControlType(OutputPin pin) {
        pin.setIsControlType(this.ecoreElement.isControlType());
    }

    @objid ("dee7f947-3ad7-4466-b689-b911efdd82c2")
    private void setOrdering(OutputPin pin) {
        switch (this.ecoreElement.getOrdering().getValue()) {
        case org.eclipse.uml2.uml.ObjectNodeOrderingKind.FIFO:
            pin.setOrdering(ObjectNodeOrderingKind.FIFO);
            break;
        case org.eclipse.uml2.uml.ObjectNodeOrderingKind.LIFO:
            pin.setOrdering(ObjectNodeOrderingKind.LIFO);
            break;
        case org.eclipse.uml2.uml.ObjectNodeOrderingKind.ORDERED:
            pin.setOrdering(ObjectNodeOrderingKind.ORDERED);
            break;
        case org.eclipse.uml2.uml.ObjectNodeOrderingKind.UNORDERED:
            pin.setOrdering(ObjectNodeOrderingKind.UNORDERED);
            break;
        default:
            pin.setOrdering(ObjectNodeOrderingKind.FIFO);
        }
    }

    @objid ("7a18bcaf-0ee1-4c40-9b4f-a597b79170b5")
    private void setSelectionBehavior(OutputPin pin) {
        org.eclipse.uml2.uml. Behavior ecoreBehavior = this.ecoreElement.getSelection();
        if (ecoreBehavior instanceof org.eclipse.uml2.uml.OpaqueBehavior) {
            String objingBehavior = "";
            for (Object body : ((org.eclipse.uml2.uml.OpaqueBehavior) ecoreBehavior).getBodies()) {
                objingBehavior = objingBehavior.concat((String) body);
            }
            pin.setSelectionBehavior(objingBehavior);
        } else if (ecoreBehavior != null) {
            String behaviorName = ecoreBehavior.getName();
            if (behaviorName != null)
                pin.setSelectionBehavior(behaviorName);
        }
    }

    @objid ("70c1035c-f251-47a2-8847-f57bded0181f")
    private void setType(OutputPin pin) {
        org.eclipse.uml2.uml.Type ecoreType = this.ecoreElement.getType();
        if (ecoreType != null) {
            Object objingType = ReverseProperties.getInstance().getMappedElement(ecoreType);
            if (objingType instanceof GeneralClass)
                pin.setType((GeneralClass) objingType);
        }
    }

    @objid ("7153c12c-3e46-4c48-9bbc-0e35d3093cd9")
    private void setState(OutputPin pin) {
        EList<?> ecoreStates = this.ecoreElement.getInStates();
        if (ecoreStates != null && ecoreStates.size() > 0) {
            org.eclipse.uml2.uml.State ecoreState = (org.eclipse.uml2.uml.State) ecoreStates.get(0);
            if (ecoreState != null) {
                Object objingState = ReverseProperties.getInstance().getMappedElement(ecoreState);
                if (objingState instanceof State)
                    pin.setInState((State) objingState);
            }
        }
    }

}
