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
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperator;

@objid ("00435a1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface CombinedFragment extends InteractionFragment {
    @objid ("033f39b5-423f-499a-be1d-a49d262f882c")
    InteractionOperator getOperator();

    @objid ("dfad0eda-9e8a-426f-913d-90fc944c48ca")
    void setOperator(InteractionOperator value);

    @objid ("3678ef21-f572-4001-b2d8-b2eae9b2d340")
    EList<InteractionOperand> getOperand();

    @objid ("9849213c-a1e2-4244-b704-5883a3f7edbd")
    <T extends InteractionOperand> List<T> getOperand(java.lang.Class<T> filterClass);

    @objid ("bba432ed-3832-4de1-8dbc-5ee028c1b56e")
    EList<Gate> getFragmentGate();

    @objid ("f5796bb1-63ee-4206-8437-84dacb795e52")
    <T extends Gate> List<T> getFragmentGate(java.lang.Class<T> filterClass);

}
