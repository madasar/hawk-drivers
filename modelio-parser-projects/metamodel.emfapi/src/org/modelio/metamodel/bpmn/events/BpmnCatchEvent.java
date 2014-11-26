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
package org.modelio.metamodel.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;

@objid ("00889ec4-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCatchEvent extends BpmnEvent {
    @objid ("ecc5fe1e-438f-4d41-9d90-268ca884d3ed")
    boolean isParallelMultiple();

    @objid ("90cc2570-c8eb-4d6d-a6cc-fa5173e1f76f")
    void setParallelMultiple(boolean value);

    @objid ("11bd2abd-701c-41ca-8cc0-d9eacf583633")
    EList<BpmnDataAssociation> getDataOutputAssociation();

    @objid ("06572da4-a1f4-4fc3-b29f-ad42c90e29d6")
    <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass);

    @objid ("0224e2fc-873b-4d70-b2f1-84da321ee88d")
    BpmnDataOutput getDataOutput();

    @objid ("fa271d4b-a319-4577-822c-a6a15d6ace36")
    void setDataOutput(BpmnDataOutput value);

}
