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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Requirement;

@objid ("0ba1c716-f645-446a-a591-f70aa2d0071d")
public interface RequirementContainer extends AnalystContainer {
    @objid ("a4b4d7d6-b138-4396-96a7-2c6249ed282c")
    EList<Requirement> getOwnedRequirement();

    @objid ("f9c70f03-044f-4842-a854-a0d58cfb3f1a")
    <T extends Requirement> List<T> getOwnedRequirement(java.lang.Class<T> filterClass);

    @objid ("ca4dc09e-1ddc-4825-85a8-a68fddf09972")
    RequirementContainer getOwnerContainer();

    @objid ("c96a3a22-ffee-403d-98c8-602ed349601b")
    void setOwnerContainer(RequirementContainer value);

    @objid ("199816e7-7525-4244-a41a-10163ba464f5")
    EList<RequirementContainer> getOwnedContainer();

    @objid ("3f0f0b25-5dce-4cd7-a6d5-a75aa0798d59")
    <T extends RequirementContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("cd316196-7816-405e-b0d2-9e8770765ecc")
    AnalystProject getOwnerProject();

    @objid ("7ce8c956-b089-4b20-808b-ac51fdae8786")
    void setOwnerProject(AnalystProject value);

}
