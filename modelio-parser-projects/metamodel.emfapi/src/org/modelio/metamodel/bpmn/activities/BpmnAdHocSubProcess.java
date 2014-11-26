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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;

@objid ("007df21c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnAdHocSubProcess extends BpmnSubProcess {
    @objid ("6e952c40-3023-4fd9-9a55-054e2c6d8fa1")
    AdHocOrdering getOrdering();

    @objid ("1f95be79-1b4a-4dc0-b167-29e5a0915c39")
    void setOrdering(AdHocOrdering value);

    @objid ("1292fcfe-9e77-41c9-9de5-396b201b0445")
    boolean isCancelRemainingInstances();

    @objid ("beaa867c-28df-4533-bd70-4471b9769ef8")
    void setCancelRemainingInstances(boolean value);

    @objid ("38372bb2-cd1f-4897-a135-8082c35c8da7")
    String getCompletionCondition();

    @objid ("1f8fb25f-2b17-4033-bf79-3ed90d92893f")
    void setCompletionCondition(String value);

}
