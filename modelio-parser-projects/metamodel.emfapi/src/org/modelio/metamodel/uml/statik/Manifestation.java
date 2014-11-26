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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;

@objid ("00108470-c4bf-1fd8-97fe-001ec947cd2a")
public interface Manifestation extends ModelElement {
    @objid ("0ccd438c-1364-4b07-b04b-19908b1200c8")
    ModelElement getUtilizedElement();

    @objid ("7d6844c3-ef80-48f6-bbbd-c5b9ec1c12bf")
    void setUtilizedElement(ModelElement value);

    @objid ("b3cef651-c5a1-4048-8daf-0a89d3db01fb")
    Artifact getOwner();

    @objid ("dbff9867-b000-4775-b325-7578a137e20d")
    void setOwner(Artifact value);

}
