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
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("003b6582-c4bf-1fd8-97fe-001ec947cd2a")
public interface Pin extends ObjectNode {
    @objid ("17471dd3-a870-4d74-95ec-25df584ffe1c")
    boolean isIsControl();

    @objid ("be6e5a0b-4386-4e6a-b5ee-873abb32a41d")
    void setIsControl(boolean value);

    @objid ("b85c9f52-564e-4388-943d-c403a2254a70")
    boolean isIsExpansion();

    @objid ("617e3d67-acc0-444d-9149-ec45f62cf5e3")
    void setIsExpansion(boolean value);

    @objid ("9f0c6249-e396-4f3f-a9d0-d3bc1226c3d8")
    Parameter getMatched();

    @objid ("bd7ff363-bd0d-4722-a71e-6b0582e8ab24")
    void setMatched(Parameter value);

}
