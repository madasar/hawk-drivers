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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;

@objid ("00223b3e-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryLink extends ModelElement {
    @objid ("1ea56f9b-104d-49c2-b373-a21ee055edaf")
    EList<NaryLinkEnd> getNaryLinkEnd();

    @objid ("28335039-0f33-4c99-a502-3c894f3577b5")
    <T extends NaryLinkEnd> List<T> getNaryLinkEnd(java.lang.Class<T> filterClass);

    @objid ("9d20c19d-14cf-4567-abeb-4df0b4cd20e3")
    NaryAssociation getModel();

    @objid ("d9dc525e-9c3e-425b-bac7-53cea5837395")
    void setModel(NaryAssociation value);

    @objid ("009941cf-6768-4f09-97f2-96b7ec827e2f")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("b3890a92-10f2-43f7-a6e1-acf54d4f6b8a")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("6789a780-c664-4443-8fd6-d287f05b1092")
    EList<CommunicationChannel> getSent();

    @objid ("f2745744-bf1d-467e-b8d6-6320980a2fa5")
    <T extends CommunicationChannel> List<T> getSent(java.lang.Class<T> filterClass);

}
