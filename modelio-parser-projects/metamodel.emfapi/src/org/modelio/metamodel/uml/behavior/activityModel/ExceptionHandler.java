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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("00307956-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExceptionHandler extends ModelElement {
    @objid ("a62dbeb4-28fb-442c-aab8-ed41b8a5f844")
    String getGuard();

    @objid ("30e34787-b8bc-4f0b-816e-7949f5e4a2dc")
    void setGuard(String value);

    @objid ("612e8f1c-bd82-4823-bc85-290ff4deef49")
    String getWeight();

    @objid ("7db05ce9-f8e2-4643-83d3-89f855a2a01c")
    void setWeight(String value);

    @objid ("3b26466d-5c3a-4292-81ea-6ccca060c1d2")
    ActivityAction getProtectedNode();

    @objid ("fae03c69-a8f3-4939-bdca-186eb5fc3d2f")
    void setProtectedNode(ActivityAction value);

    @objid ("054ccc7c-d3c8-49a0-94dc-1587188b11df")
    InputPin getExceptionInput();

    @objid ("08574791-9da2-49fb-ab01-0d874d3c6ba6")
    void setExceptionInput(InputPin value);

    @objid ("63092c3e-9046-40f6-b973-90f4c7d4713d")
    EList<GeneralClass> getExceptionType();

    @objid ("24504ff4-e1a9-4f81-ba69-7ece4211f109")
    <T extends GeneralClass> List<T> getExceptionType(java.lang.Class<T> filterClass);

}
