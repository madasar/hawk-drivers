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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;

@objid ("004683fe-c4bf-1fd8-97fe-001ec947cd2a")
public interface Interaction extends Behavior {
    @objid ("5e5bc5e6-7bf6-454c-89a2-1fa9ea894819")
    EList<Gate> getFormalGate();

    @objid ("52dd298e-a99e-458c-8275-8b7409a0afcb")
    <T extends Gate> List<T> getFormalGate(java.lang.Class<T> filterClass);

    @objid ("e5c20087-4e67-4acf-b098-4a2749853dc2")
    EList<InteractionFragment> getFragment();

    @objid ("60664096-94e4-4e7d-bee4-afa8bd2842d2")
    <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass);

    @objid ("b0427da0-f2e5-4432-81d8-a51e375e27d3")
    EList<Lifeline> getOwnedLine();

    @objid ("180af8c0-527e-45ea-91f9-9588aa5cb4df")
    <T extends Lifeline> List<T> getOwnedLine(java.lang.Class<T> filterClass);

    @objid ("1ef42405-383e-49e4-b36f-c184102beeaf")
    EList<InteractionUse> getReferedUse();

    @objid ("411a89e8-ae50-4685-b4b4-3f089f60553a")
    <T extends InteractionUse> List<T> getReferedUse(java.lang.Class<T> filterClass);

}
