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
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.NaryLink;

@objid ("5451d474-f72f-46a9-b8b5-35997413d584")
public interface CommunicationChannel extends ModelElement {
    @objid ("95c8830c-c7d7-4a08-8f0f-90714b7207de")
    EList<CommunicationMessage> getStartToEndMessage();

    @objid ("b1e7f292-30af-4227-ac27-193c7f107c62")
    <T extends CommunicationMessage> List<T> getStartToEndMessage(java.lang.Class<T> filterClass);

    @objid ("5b0eabd6-7bd6-4721-a656-8592f13d2b4a")
    Link getChannel();

    @objid ("cf241c9d-514c-471f-b104-59e162a0e904")
    void setChannel(Link value);

    @objid ("5da740fc-7bc4-4af2-9350-5608f78c0f54")
    CommunicationNode getStart();

    @objid ("2687cfcf-c538-491f-8f79-cd7cc1cada2a")
    void setStart(CommunicationNode value);

    @objid ("b21681e1-b848-4b1a-8361-8cf8c5ee7fa1")
    NaryLink getNaryChannel();

    @objid ("dbddf6bf-d321-4d87-ada5-417d86c4ab17")
    void setNaryChannel(NaryLink value);

    @objid ("0e341d96-d013-4f08-a6f4-86278cddc2ca")
    EList<CommunicationMessage> getEndToStartMessage();

    @objid ("1adc0928-a593-4997-afbb-b59e73f4b452")
    <T extends CommunicationMessage> List<T> getEndToStartMessage(java.lang.Class<T> filterClass);

    @objid ("d5850b0c-c1d0-447a-be74-7457ff329b8b")
    CommunicationNode getEnd();

    @objid ("230288fe-c698-4235-8306-8ca3b5f16d8b")
    void setEnd(CommunicationNode value);

}
