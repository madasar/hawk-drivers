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
package org.modelio.metamodel.uml.informationFlow;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("00645dc0-c4bf-1fd8-97fe-001ec947cd2a")
public interface DataFlow extends ModelElement {
    @objid ("9e3bf562-1b47-4958-8e4f-b1946adaee31")
    NameSpace getDestination();

    @objid ("b93ff9d8-f24b-4d36-99e4-f68619352ded")
    void setDestination(NameSpace value);

    @objid ("99a86386-fac0-4d83-8272-03aec92a304d")
    NameSpace getOrigin();

    @objid ("03ae111f-42c6-4bdf-8003-4efe6ae06d1f")
    void setOrigin(NameSpace value);

    @objid ("121e23aa-f934-4080-9284-13f98a24fc38")
    NameSpace getOwner();

    @objid ("a1a6558c-64b6-43b7-ad42-da15870f24d5")
    void setOwner(NameSpace value);

    @objid ("4ef302df-bbf1-4039-a915-3ea1dfc8008b")
    Signal getSModel();

    @objid ("32efd0ac-578a-48ff-acd2-446099de0836")
    void setSModel(Signal value);

}
