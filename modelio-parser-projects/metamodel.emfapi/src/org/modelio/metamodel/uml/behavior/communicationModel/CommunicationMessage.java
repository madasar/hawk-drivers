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
package org.modelio.metamodel.uml.behavior.communicationModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("005b08f6-c4bf-1fd8-97fe-001ec947cd2a")
public interface CommunicationMessage extends ModelElement {
    @objid ("55534d0a-6700-4712-859b-f63c3b1af82b")
    String getArgument();

    @objid ("5c83c3e2-47da-4b90-80cf-fe0283454d8d")
    void setArgument(String value);

    @objid ("b641e8c0-ac0e-4daa-96fa-c7e22a1d48de")
    String getSequence();

    @objid ("543eadf0-b93d-4b11-b6b0-70f3c2ef62be")
    void setSequence(String value);

    @objid ("0b81cbac-f736-4a39-b5a0-6a3e30d22ec3")
    MessageSort getSortOfMessage();

    @objid ("0705e61d-3d33-4c0e-9de9-4230947fd32d")
    void setSortOfMessage(MessageSort value);

    @objid ("d663487a-c8b4-45d2-99e9-7111d1019209")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("61ecfec7-4915-4016-8746-2d2aeca872e5")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("2f843656-fb8c-4c7e-8710-adfa412d7a6a")
    CommunicationChannel getChannel();

    @objid ("3ba68ce6-c468-4014-af60-d49904989d91")
    void setChannel(CommunicationChannel value);

    @objid ("a5bc0216-5555-471b-90ea-7e8c8a23652d")
    CommunicationChannel getInvertedChannel();

    @objid ("fdd9b118-0538-4376-abdc-985d39baac61")
    void setInvertedChannel(CommunicationChannel value);

    @objid ("849608cb-0967-4ed1-849d-b2fd4abe93b4")
    Operation getInvoked();

    @objid ("fc16c444-18ed-4bad-a4c5-6a185b197a02")
    void setInvoked(Operation value);

    @objid ("b81f2fc0-a6a2-4b2b-97b6-894188b5c2a4")
    Signal getSignalSignature();

    @objid ("620866be-ab1f-4df8-8dc9-ab55bcc76e40")
    void setSignalSignature(Signal value);

}
