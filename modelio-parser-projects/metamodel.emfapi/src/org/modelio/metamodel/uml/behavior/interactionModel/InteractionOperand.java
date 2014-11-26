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
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;

@objid ("00479758-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionOperand extends InteractionFragment {
    @objid ("4cbb0d97-e23a-4b64-aded-3e4cf4f55cf9")
    String getGuard();

    @objid ("01fe0858-9872-4402-ab6b-6bf1adc8604d")
    void setGuard(String value);

    @objid ("2f83f179-7a4b-4e91-aca8-72cca8a7676c")
    int getEndLineNumber();

    @objid ("71316928-8695-410a-b87c-15f42284785c")
    void setEndLineNumber(int value);

    @objid ("a9f6ef76-d5e1-4363-906b-689e220493cc")
    EList<InteractionFragment> getFragment();

    @objid ("65601b14-f962-4940-9c29-7102607bd77e")
    <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass);

    @objid ("00c8e008-424f-4544-9bf3-00aa6cf9378f")
    CombinedFragment getOwnerFragment();

    @objid ("4bf95308-3752-4ecb-93b1-666af99fd817")
    void setOwnerFragment(CombinedFragment value);

}
