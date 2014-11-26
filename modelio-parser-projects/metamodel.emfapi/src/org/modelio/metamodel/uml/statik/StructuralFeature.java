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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.KindOfAccess;

@objid ("001ee9c0-c4bf-1fd8-97fe-001ec947cd2a")
public interface StructuralFeature extends Feature {
    @objid ("002d2f85-b3f4-4ce1-9d77-33d7da1f7386")
    KindOfAccess getChangeable();

    @objid ("04a4f95f-14a6-4e89-9688-5ca2681cea2b")
    void setChangeable(KindOfAccess value);

    @objid ("867b0b6f-a501-4de6-9de8-7fe4ea120e0b")
    boolean isIsDerived();

    @objid ("1476aed8-a04a-45fe-836e-b4ad1d3c6885")
    void setIsDerived(boolean value);

    @objid ("b91f435c-11ee-4bf7-8db5-1bff7bb9197d")
    boolean isIsOrdered();

    @objid ("ef32b2c7-e0f0-402c-b6fc-92370861780d")
    void setIsOrdered(boolean value);

    @objid ("c78b238f-b5ce-4a1c-af5d-d5038f590a52")
    boolean isIsUnique();

    @objid ("31dbb0ad-2261-436d-b335-10ebcd889ff6")
    void setIsUnique(boolean value);

    @objid ("7b4e6448-ac43-4bcc-ae1b-178151ba3a71")
    String getMultiplicityMin();

    @objid ("0503d54c-fe06-4cdb-9e8d-85361c969a6c")
    void setMultiplicityMin(String value);

    @objid ("41d0b5c7-fccb-4a16-8116-9e338834c487")
    String getMultiplicityMax();

    @objid ("5a4a3891-86ed-4aff-9476-ddaf02a87381")
    void setMultiplicityMax(String value);

    @objid ("9e56670f-6160-4e89-aa12-6c75cda62718")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("2dc85b89-0526-4749-8cbb-a2c15bdd437d")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
