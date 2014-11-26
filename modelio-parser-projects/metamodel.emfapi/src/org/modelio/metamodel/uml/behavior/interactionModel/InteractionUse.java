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
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;

@objid ("00482c5e-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionUse extends InteractionFragment {
    @objid ("94774764-859f-44ef-8573-0c574f752090")
    int getEndLineNumber();

    @objid ("5b0e8711-8e04-47d3-ae34-56c202b45df2")
    void setEndLineNumber(int value);

    @objid ("2f41c2e8-f3d6-492c-92f7-a52228ee78eb")
    EList<Gate> getActualGate();

    @objid ("a4576be8-8f42-4cb5-8c2e-f0b768f37508")
    <T extends Gate> List<T> getActualGate(java.lang.Class<T> filterClass);

    @objid ("12881451-5a14-4bc8-ae9c-8249d1ade95a")
    Interaction getRefersTo();

    @objid ("93b8c59d-0071-4a9d-8e33-05b3c96886b5")
    void setRefersTo(Interaction value);

}
