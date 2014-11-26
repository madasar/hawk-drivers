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
package org.modelio.metamodel.mda;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;

@objid ("006602e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface Project extends ModelElement {
    @objid ("958c671f-b021-4824-8c4d-358ab8771a30")
    String getProjectContext();

    @objid ("04f8e58b-10cf-40b0-96fa-73252eed8ea2")
    void setProjectContext(String value);

    @objid ("61d3c004-627a-497e-a23d-ccab50c1fef5")
    String getProjectDescr();

    @objid ("73825e76-6f24-477c-a9bc-1ff7e2f29135")
    void setProjectDescr(String value);

    @objid ("2f64dc01-18d6-4249-8519-a4fe8032fd2a")
    DiagramSet getDiagramRoot();

    @objid ("637de21e-6b49-4fde-8a71-0c5c37b9c6d2")
    void setDiagramRoot(DiagramSet value);

    @objid ("82bd7ca7-aeeb-400d-8e62-d160aeda9d03")
    Package getModel();

    @objid ("6c5021c2-a172-4403-b43f-871b61a87c82")
    void setModel(Package value);

}
