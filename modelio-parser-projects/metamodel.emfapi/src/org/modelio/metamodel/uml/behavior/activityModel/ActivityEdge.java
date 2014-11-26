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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00270a1a-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityEdge extends ModelElement {
    @objid ("1ba51d6d-af61-404c-8279-50b544f250e3")
    String getGuard();

    @objid ("802e03a2-8684-409b-9361-a72f745002ea")
    void setGuard(String value);

    @objid ("eef0fba4-a315-4e7c-acc7-58ebb5df35ec")
    String getWeight();

    @objid ("4e9ca325-df2c-43f2-ad4c-8c58f6487672")
    void setWeight(String value);

    @objid ("70e6a5cc-6df2-402d-a79c-97038c376cc2")
    ActivityNode getTarget();

    @objid ("d3a335b7-f361-4d5e-a13d-7d710766f6c2")
    void setTarget(ActivityNode value);

    @objid ("e66db25d-6d58-4c5c-bd32-5558965726da")
    ActivityNode getSource();

    @objid ("528996e0-f129-4f3a-9444-edb128e4643d")
    void setSource(ActivityNode value);

    @objid ("b385cf3e-46ff-41ec-982f-1901798b7f48")
    InterruptibleActivityRegion getInterrupts();

    @objid ("02a44404-30d7-48ca-8799-3511885392dc")
    void setInterrupts(InterruptibleActivityRegion value);

    @objid ("1f070666-fc29-4995-9b72-f77c1fce0862")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("67c82c3b-9329-4590-9c6a-8326f5cff5f0")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
