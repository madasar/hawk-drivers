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

@objid ("00839f78-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnStandardLoopCharacteristics extends BpmnLoopCharacteristics {
    @objid ("e671a565-11cc-4b00-adb4-b9ccf4468c34")
    boolean isTestBefore();

    @objid ("2c9ce418-4982-4809-a56f-a6fa80376245")
    void setTestBefore(boolean value);

    @objid ("6bc0977a-40f6-459e-b498-cc4f59b24cc5")
    String getLoopCondition();

    @objid ("91f79511-14a1-41e8-ba23-a87b1570c788")
    void setLoopCondition(String value);

    @objid ("f70d0235-0442-43df-99f8-844e6ee0232a")
    String getLoopMaximum();

    @objid ("f3790ced-0eff-480f-9651-17696105d894")
    void setLoopMaximum(String value);

}
