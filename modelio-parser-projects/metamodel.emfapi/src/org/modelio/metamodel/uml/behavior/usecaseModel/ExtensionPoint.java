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
package org.modelio.metamodel.uml.behavior.usecaseModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("00598058-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExtensionPoint extends ModelElement {
    @objid ("97a5564e-e5bc-4708-93d9-6c780a3d0629")
    VisibilityMode getVisibility();

    @objid ("cb620f21-c37f-499b-a587-68f8dca90c48")
    void setVisibility(VisibilityMode value);

    @objid ("a43ff225-9fca-4ceb-9b57-a2188f2a6c8c")
    EList<UseCaseDependency> getExtended();

    @objid ("e5680fff-4277-4cb4-a3b8-2d9ab900540d")
    <T extends UseCaseDependency> List<T> getExtended(java.lang.Class<T> filterClass);

    @objid ("d424ac8d-866d-4ef4-925d-66acdaa2ad25")
    UseCase getOwner();

    @objid ("14994546-ecd2-4df7-ae33-59c0fad76472")
    void setOwner(UseCase value);

}
