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
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("005a9290-c4bf-1fd8-97fe-001ec947cd2a")
public interface CommunicationNode extends ModelElement {
    @objid ("5cc07f40-1132-45c6-9f20-c17df2e98047")
    String getSelector();

    @objid ("daeefde8-5418-4ce7-b7e7-4b271cd331d7")
    void setSelector(String value);

    @objid ("6afc95dd-b6f0-4719-9173-099b1ff03ee8")
    CommunicationInteraction getOwner();

    @objid ("597c4bba-d791-469e-8e71-6de823924103")
    void setOwner(CommunicationInteraction value);

    @objid ("a76e27c3-ffc7-479c-bf7a-9d47ca457f3f")
    Instance getRepresented();

    @objid ("40da44dc-bb62-408b-accb-c6bd8d1ccd7a")
    void setRepresented(Instance value);

    @objid ("ce3c20e3-478a-4d3f-8e18-c2ee6166c10a")
    EList<CommunicationChannel> getStarted();

    @objid ("d63ff380-2858-40d5-af52-cd3708afcfe0")
    <T extends CommunicationChannel> List<T> getStarted(java.lang.Class<T> filterClass);

    @objid ("e58b05f3-d527-4e14-a3ab-5cefb9388409")
    EList<CommunicationChannel> getEnded();

    @objid ("b6a7b1b8-f8d2-4003-866a-49ab8673218c")
    <T extends CommunicationChannel> List<T> getEnded(java.lang.Class<T> filterClass);

}
