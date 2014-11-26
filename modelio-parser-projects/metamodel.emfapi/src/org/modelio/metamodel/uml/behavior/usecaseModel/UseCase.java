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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("00588716-c4bf-1fd8-97fe-001ec947cd2a")
public interface UseCase extends GeneralClass {
    @objid ("df9b1614-579a-400b-90a5-f53e0f0cc035")
    EList<UseCaseDependency> getUsed();

    @objid ("7e8f79ac-4b3c-46b1-855f-2d78230b079b")
    <T extends UseCaseDependency> List<T> getUsed(java.lang.Class<T> filterClass);

    @objid ("56ff6998-c765-478b-bd26-b4bf67f51406")
    EList<ExtensionPoint> getOwnedExtension();

    @objid ("dc5e947f-ba7f-4bfa-bdfe-df01895c168f")
    <T extends ExtensionPoint> List<T> getOwnedExtension(java.lang.Class<T> filterClass);

    @objid ("319d4138-e760-422d-b1d0-c69dacf279b7")
    EList<UseCaseDependency> getUser();

    @objid ("d36c28a3-88a1-4049-a951-782e8c7d3d7a")
    <T extends UseCaseDependency> List<T> getUser(java.lang.Class<T> filterClass);

}
