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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;

@objid ("0026094e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Activity extends Behavior {
    @objid ("a3a7f064-e3c9-42b7-abf9-660c8e71a0a9")
    boolean isIsSingleExecution();

    @objid ("bbeced1e-f541-4aad-8187-d62c9f810704")
    void setIsSingleExecution(boolean value);

    @objid ("0da750d4-aa62-478b-87bc-0420ca2c5de8")
    boolean isIsReadOnly();

    @objid ("2aca1198-5cba-46c6-b181-32f3abf55452")
    void setIsReadOnly(boolean value);

    @objid ("c76f0a88-a958-4ad4-81b0-198686ad6f02")
    EList<ActivityGroup> getOwnedGroup();

    @objid ("0f909f5c-d6be-4bf3-b26e-f0326f75675e")
    <T extends ActivityGroup> List<T> getOwnedGroup(java.lang.Class<T> filterClass);

    @objid ("54963cea-2e73-43b4-935f-c6bd33590412")
    EList<ActivityNode> getOwnedNode();

    @objid ("6aaf7a1e-33c7-4a07-9a27-60aed073253e")
    <T extends ActivityNode> List<T> getOwnedNode(java.lang.Class<T> filterClass);

}
