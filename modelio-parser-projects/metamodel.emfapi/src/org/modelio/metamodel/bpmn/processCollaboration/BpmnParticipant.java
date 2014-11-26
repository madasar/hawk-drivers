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
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Package;

@objid ("007577d6-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnParticipant extends BpmnBaseElement {
    @objid ("96443dbd-72f5-4ac0-b09b-10d53069c882")
    int getMultiplicityMin();

    @objid ("89ae594d-4266-4d1a-83fb-28f972d1b23f")
    void setMultiplicityMin(int value);

    @objid ("ce20d40f-5d45-4471-8ebe-6ce1274eb011")
    int getMultiplicityMax();

    @objid ("1a65229c-6f27-4daa-aabf-739b69816c2d")
    void setMultiplicityMax(int value);

    @objid ("ae1615b7-7702-494a-bd45-759d40626410")
    BpmnProcess getProcess();

    @objid ("08716c03-c512-4a2c-a44a-1a77beb50943")
    void setProcess(BpmnProcess value);

    @objid ("5836e8d8-885b-4e10-995f-591525cca387")
    BpmnCollaboration getContainer();

    @objid ("70ab32da-deb3-4610-9428-2fb25f30aa08")
    void setContainer(BpmnCollaboration value);

    @objid ("f6ae0c23-76c1-40d0-94a7-7319c7b8519f")
    Classifier getType();

    @objid ("6d35b075-f0fa-4cb8-bb65-f5c339b90267")
    void setType(Classifier value);

    @objid ("6ae69400-121f-44e2-83fa-3b33483afd8c")
    EList<BpmnEndPoint> getEndPointRefs();

    @objid ("b899b1c1-007d-45f5-870d-6c85c40a06ad")
    <T extends BpmnEndPoint> List<T> getEndPointRefs(java.lang.Class<T> filterClass);

    @objid ("7a19bbf2-6b63-4579-800b-1bfceb8ec1d8")
    EList<BpmnInterface> getInterfaceRefs();

    @objid ("3f587f29-fc2e-437c-abe4-780366ba4da5")
    <T extends BpmnInterface> List<T> getInterfaceRefs(java.lang.Class<T> filterClass);

    @objid ("d45af5ca-68fd-4619-8dd2-b043c4521fd1")
    Package getPackageRef();

    @objid ("c8b684f6-6523-4c4d-9d6a-b594f52fceae")
    void setPackageRef(Package value);

}
