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
package org.modelio.metamodel.uml.informationFlow;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.StructuralFeature;

@objid ("0063764e-c4bf-1fd8-97fe-001ec947cd2a")
public interface InformationFlow extends ModelElement {
    @objid ("6972badb-aca8-4e0d-839e-13d72b14c664")
    NameSpace getOwner();

    @objid ("5b1dfa22-362d-4110-9c40-40f62337bf2c")
    void setOwner(NameSpace value);

    @objid ("1d0b9c07-6563-4e77-b28a-c5589e6d40cd")
    EList<ModelElement> getInformationSource();

    @objid ("69196c15-c1ac-4aea-b8ff-9415a9b9e093")
    <T extends ModelElement> List<T> getInformationSource(java.lang.Class<T> filterClass);

    @objid ("1e7d156e-e944-4e72-a047-463db07b0795")
    EList<ModelElement> getInformationTarget();

    @objid ("d095a5a6-d5b7-402b-9180-383dadf51ccc")
    <T extends ModelElement> List<T> getInformationTarget(java.lang.Class<T> filterClass);

    @objid ("c3950bb7-8bac-4db1-acd6-6ddecfa363f8")
    EList<ActivityEdge> getRealizingActivityEdge();

    @objid ("c0fb0aa3-a20a-4239-8999-4dc7ce7000eb")
    <T extends ActivityEdge> List<T> getRealizingActivityEdge(java.lang.Class<T> filterClass);

    @objid ("04d0c817-5061-4241-be3e-9ba30f02f723")
    EList<CommunicationMessage> getRealizingCommunicationMessage();

    @objid ("9ffe032f-06ab-4030-8dc5-018d7961e1f2")
    <T extends CommunicationMessage> List<T> getRealizingCommunicationMessage(java.lang.Class<T> filterClass);

    @objid ("2a12f0ea-c58b-4d94-80eb-26e1643827c4")
    EList<StructuralFeature> getRealizingFeature();

    @objid ("cae9970f-5ffa-4374-a3d6-a15f1190553e")
    <T extends StructuralFeature> List<T> getRealizingFeature(java.lang.Class<T> filterClass);

    @objid ("aded8370-f844-4e42-9eda-804e6b293e67")
    EList<LinkEnd> getRealizingLink();

    @objid ("2382ad44-e882-4bc1-b40a-f2d12f60a4bf")
    <T extends LinkEnd> List<T> getRealizingLink(java.lang.Class<T> filterClass);

    @objid ("07942eaf-312c-4bfb-b680-f6c733739846")
    EList<Message> getRealizingMessage();

    @objid ("e24a51a9-e095-43bf-aaa5-f841e7b5b9be")
    <T extends Message> List<T> getRealizingMessage(java.lang.Class<T> filterClass);

    @objid ("d43a4311-1034-46d5-a60e-2320370b736c")
    EList<NaryLink> getRealizingNaryLink();

    @objid ("e55439ae-176a-409b-8a0c-6aa7216dead1")
    <T extends NaryLink> List<T> getRealizingNaryLink(java.lang.Class<T> filterClass);

    @objid ("96dea6b8-e998-4c58-8094-423eb90df69e")
    EList<Classifier> getConveyed();

    @objid ("e9dbc8b7-391b-4280-a0a1-80911081f8aa")
    <T extends Classifier> List<T> getConveyed(java.lang.Class<T> filterClass);

    @objid ("e32b935f-37a7-4796-802c-209e55bc683b")
    AssociationEnd getChannel();

    @objid ("91472e05-5086-4abc-b45c-8671bf6d6d52")
    void setChannel(AssociationEnd value);

}
