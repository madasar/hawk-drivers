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
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;

@objid ("00388c90-c4bf-1fd8-97fe-001ec947cd2a")
public interface ObjectFlow extends ActivityEdge {
    @objid ("61b57485-a24a-41ef-b621-3a608c8e5477")
    String getTransformationBehavior();

    @objid ("3b9709d0-219c-4fac-bd63-b2db24eb0a28")
    void setTransformationBehavior(String value);

    @objid ("0c59b171-9282-4854-927d-b16a7c8719e1")
    String getSelectionBehavior();

    @objid ("598dd60c-14ae-4023-9a0e-349292b8118e")
    void setSelectionBehavior(String value);

    @objid ("4137139b-f08f-4691-ada7-856b5826eab7")
    boolean isIsMultiCast();

    @objid ("6e797217-5a39-46eb-9b78-30761758f093")
    void setIsMultiCast(boolean value);

    @objid ("63c10279-c5d9-4e5f-86a5-6b241a51c6a0")
    boolean isIsMultiReceive();

    @objid ("d28bf484-4b15-4722-88b9-ff1e64fb40a4")
    void setIsMultiReceive(boolean value);

    @objid ("e90d8da0-4aa5-40bd-a1d6-e346ecc35f22")
    ObjectFlowEffectKind getEffect();

    @objid ("797cead2-d443-4ce4-8d03-d60025b12505")
    void setEffect(ObjectFlowEffectKind value);

}
