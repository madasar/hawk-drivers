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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("004713c8-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionFragment extends ModelElement {
    @objid ("47e81e15-efeb-4a9e-be11-c5f77303245f")
    int getLineNumber();

    @objid ("ffdf75cc-a959-4ca3-9c78-1bb3ebe13e1d")
    void setLineNumber(int value);

    @objid ("a7e9307f-49a4-49aa-9ce9-e51ba2d3982d")
    InteractionOperand getEnclosingOperand();

    @objid ("9dcca2aa-a82f-43c3-8fc0-8e2f15d2dcaa")
    void setEnclosingOperand(InteractionOperand value);

    @objid ("fd549653-d8a3-4a64-839b-3f067b1b98f7")
    Interaction getEnclosingInteraction();

    @objid ("72a58ae6-5df3-40d2-8705-c0ec6656e88e")
    void setEnclosingInteraction(Interaction value);

    @objid ("2ce6accd-0c67-4247-9197-46bf8748a861")
    EList<Lifeline> getCovered();

    @objid ("3a41ba8f-37f5-45e7-a397-0603399aa5ce")
    <T extends Lifeline> List<T> getCovered(java.lang.Class<T> filterClass);

}
