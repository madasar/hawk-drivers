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
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0058fd18-c4bf-1fd8-97fe-001ec947cd2a")
public interface UseCaseDependency extends ModelElement {
    @objid ("7518e9e4-a288-4f43-87c7-a12f81e7dc49")
    UseCase getOrigin();

    @objid ("9b97eab3-43e9-4e4c-af2d-0876557231f0")
    void setOrigin(UseCase value);

    @objid ("280f8dba-5506-48a0-9d0d-c881adc03c97")
    EList<ExtensionPoint> getExtensionLocation();

    @objid ("2088185c-4c8c-4616-b281-3a26b0d97754")
    <T extends ExtensionPoint> List<T> getExtensionLocation(java.lang.Class<T> filterClass);

    @objid ("dc4f68ea-e399-4dcf-bce9-35d24df2157b")
    UseCase getTarget();

    @objid ("1cbdbda0-9264-4b7d-ad86-1e0352150687")
    void setTarget(UseCase value);

}
