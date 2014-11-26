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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.GenericAnalystElement;

@objid ("57374567-a655-4223-8606-596d9088326b")
public interface GenericAnalystContainer extends AnalystContainer {
    @objid ("257ec2b8-e7ce-487e-9693-ecbcaac8c56f")
    EList<GenericAnalystElement> getOwnedElement();

    @objid ("66961bf9-1913-4ef3-bb0f-7108505629a0")
    <T extends GenericAnalystElement> List<T> getOwnedElement(java.lang.Class<T> filterClass);

    @objid ("7a722b47-3b36-4bf0-917b-916ac5d999b1")
    GenericAnalystContainer getOwnerContainer();

    @objid ("c5df3d8f-5003-4e39-8865-d93e11219af0")
    void setOwnerContainer(GenericAnalystContainer value);

    @objid ("2f09a779-6166-4135-895d-b06b023acc8f")
    EList<GenericAnalystContainer> getOwnedContainer();

    @objid ("89f85fad-20aa-417e-9dbc-7d1c2afb0b17")
    <T extends GenericAnalystContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("faba4e7e-5282-4b10-85c8-fc4d8b2cfc50")
    AnalystProject getOwnerProject();

    @objid ("dd9c115f-cc54-4efa-9d17-058381127d90")
    void setOwnerProject(AnalystProject value);

}
