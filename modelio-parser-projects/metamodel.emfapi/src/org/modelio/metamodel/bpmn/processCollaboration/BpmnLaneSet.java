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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("0074fd92-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLaneSet extends BpmnBaseElement {
    @objid ("ac577771-b37d-46c4-a3fe-78244f1d57a9")
    EList<BpmnLane> getLane();

    @objid ("ca80f80a-8bae-4a7e-a472-1df32f9daefe")
    <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass);

    @objid ("dffc5168-710b-4ff0-85e0-3cf534c0330c")
    BpmnProcess getProcess();

    @objid ("01b5a1b3-1140-4a5a-9bb6-2e3c65b36176")
    void setProcess(BpmnProcess value);

    @objid ("4a06963c-3fd6-4429-99fe-acccbc5c02fa")
    BpmnLane getParentLane();

    @objid ("38a54e8a-3936-478b-bd94-8387edad6ced")
    void setParentLane(BpmnLane value);

    @objid ("2da9bd23-7cff-4732-8432-60b9109374ec")
    BpmnSubProcess getSubProcess();

    @objid ("de06842e-877d-4523-a180-ea6e56730c2c")
    void setSubProcess(BpmnSubProcess value);

}
