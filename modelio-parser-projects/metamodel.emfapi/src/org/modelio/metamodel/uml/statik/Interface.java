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
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("000e151e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Interface extends GeneralClass {
    @objid ("ebf113eb-343c-4ec5-a589-2b8573091014")
    EList<RequiredInterface> getRequiring();

    @objid ("f3e970f4-c213-46dd-9656-45c3d31ddba3")
    <T extends RequiredInterface> List<T> getRequiring(java.lang.Class<T> filterClass);

    @objid ("aa76ed70-16d1-472f-ba30-941eea1fd996")
    EList<InterfaceRealization> getImplementedLink();

    @objid ("8f77ae0c-def9-497e-9e20-80256c72aebd")
    <T extends InterfaceRealization> List<T> getImplementedLink(java.lang.Class<T> filterClass);

    @objid ("0ddad09b-c951-4ab1-8cac-2e59af43761e")
    EList<ProvidedInterface> getProviding();

    @objid ("adba7b56-b948-4785-a0bf-1e742a04d19b")
    <T extends ProvidedInterface> List<T> getProviding(java.lang.Class<T> filterClass);

}
