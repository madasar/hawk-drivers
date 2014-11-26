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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageKind;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00493ff4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Message extends ModelElement {
    @objid ("026fd6e7-9809-4d5f-8003-edfac2b682d0")
    String getArgument();

    @objid ("3ab28179-e74e-43f2-96c5-330af0be35a3")
    void setArgument(String value);

    @objid ("c4777f21-bba3-43a5-8bce-e48751aa61d5")
    MessageKind getKindOfMessage();

    @objid ("711ad683-9c87-4098-86ed-581c391db801")
    void setKindOfMessage(MessageKind value);

    @objid ("f061eb6a-5a26-4718-b725-d6a1304ee951")
    MessageSort getSortOfMessage();

    @objid ("e85f7b6b-e22e-4ea3-ae8a-38c7ed67b308")
    void setSortOfMessage(MessageSort value);

    @objid ("d4d550e5-9796-4616-86dd-c3045438943e")
    Signal getSignalSignature();

    @objid ("f4f6118f-af5f-4547-ba82-88413cddd445")
    void setSignalSignature(Signal value);

    @objid ("bec5aac7-20a0-4cf4-90c0-e4197879483e")
    MessageEnd getReceiveEvent();

    @objid ("3ae3f556-a0cd-449a-a47d-8267287daabd")
    void setReceiveEvent(MessageEnd value);

    @objid ("b24c0a80-d42e-49a1-9391-1c5c5ce3cd82")
    MessageEnd getSendEvent();

    @objid ("d249bb68-6f16-4867-bba1-d89a7ae87475")
    void setSendEvent(MessageEnd value);

    @objid ("2763d786-6120-4a2d-8d46-6748831d527d")
    Operation getInvoked();

    @objid ("48c421e7-693c-49c4-8de7-2c981f31852e")
    void setInvoked(Operation value);

    @objid ("a3c5c236-5b2d-44b5-8cdf-18c20053a03f")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("52d145ce-17ca-4f5d-a0d2-d77c1e548988")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
