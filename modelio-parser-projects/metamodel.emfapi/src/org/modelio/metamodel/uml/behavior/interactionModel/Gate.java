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
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;

@objid ("004545ca-c4bf-1fd8-97fe-001ec947cd2a")
public interface Gate extends MessageEnd {
    @objid ("d0d988f8-f9c1-4c67-b86c-0d30cb310f92")
    InteractionUse getOwnerUse();

    @objid ("1a930322-6ab5-40b9-bf7b-0a826dd61258")
    void setOwnerUse(InteractionUse value);

    @objid ("eec10608-5700-4128-ae01-0d42b4475e1d")
    EList<Gate> getActual();

    @objid ("64fe183f-c51d-405e-bf75-c7e258561904")
    <T extends Gate> List<T> getActual(java.lang.Class<T> filterClass);

    @objid ("a1093df4-f9e2-4fdb-87c9-70de3095b6c9")
    Interaction getOwnerInteraction();

    @objid ("dbac7e01-ff00-46ea-9c3d-35d3da5453b9")
    void setOwnerInteraction(Interaction value);

    @objid ("df312755-bdbc-40ed-bef9-f7dd00b3589c")
    CombinedFragment getOwnerFragment();

    @objid ("0abf1d51-c355-4a19-bbc3-57b1f0acb11c")
    void setOwnerFragment(CombinedFragment value);

    @objid ("014b727b-4f7a-4d3a-803c-dddcee553817")
    Gate getFormal();

    @objid ("fc17cf52-727f-456d-b19d-743364d46bf8")
    void setFormal(Gate value);

}
