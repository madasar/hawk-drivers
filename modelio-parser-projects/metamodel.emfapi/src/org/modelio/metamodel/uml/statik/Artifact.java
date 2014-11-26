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
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.Node;

@objid ("0093d3de-c4be-1fd8-97fe-001ec947cd2a")
public interface Artifact extends Classifier {
    @objid ("07a9eb35-7482-4fa8-9d87-69b8915bbd56")
    String getFileName();

    @objid ("ccfbcb70-8c35-4a37-9c84-eec772d2f9f9")
    void setFileName(String value);

    @objid ("d1b7e55c-3337-4f75-b72f-70a57cdde22c")
    EList<Manifestation> getUtilized();

    @objid ("c51340a8-390e-4faf-9641-984a042769a3")
    <T extends Manifestation> List<T> getUtilized(java.lang.Class<T> filterClass);

    @objid ("7f82dddd-ac3f-4bef-8591-9884d28cb9a4")
    EList<Node> getDeploymentLocation();

    @objid ("d5a5fc38-359a-40ec-959d-a39c0b5777f9")
    <T extends Node> List<T> getDeploymentLocation(java.lang.Class<T> filterClass);

}
