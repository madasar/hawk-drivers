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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.NaryConnector;

@objid ("00015824-c4bf-1fd8-97fe-001ec947cd2a")
public interface Binding extends ModelElement {
    @objid ("a2bd75c7-9317-4809-b1bb-2c080d3f4615")
    ConnectorEnd getConnectorEndRole();

    @objid ("dc1b8c01-d000-4770-8c0a-eccec54373fb")
    void setConnectorEndRole(ConnectorEnd value);

    @objid ("8e5a9e24-4774-4f1e-9f74-5a9fcbdce23e")
    NaryConnector getConnectorRole();

    @objid ("2747e942-672d-410e-98e9-a3ba95ecff89")
    void setConnectorRole(NaryConnector value);

    @objid ("f6aa2687-dcdd-47ec-bb8e-8a587afff596")
    BindableInstance getRole();

    @objid ("db5cfad2-6864-4ab8-b444-030ffd41c38a")
    void setRole(BindableInstance value);

    @objid ("23e90b6b-e677-4a3a-88b9-fb1bcd59975a")
    ModelElement getRepresentedFeature();

    @objid ("02446299-58de-4813-b824-ca6324f076fd")
    void setRepresentedFeature(ModelElement value);

    @objid ("9bd50626-eb8e-4e35-8787-4ce62ef98eec")
    CollaborationUse getOwner();

    @objid ("cc58b932-f3d1-4f2b-870d-d96445d58074")
    void setOwner(CollaborationUse value);

}
