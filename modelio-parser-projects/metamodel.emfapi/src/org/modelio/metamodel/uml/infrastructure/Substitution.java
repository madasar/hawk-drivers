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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.Classifier;

@objid ("008dd736-c4be-1fd8-97fe-001ec947cd2a")
public interface Substitution extends ModelElement {
    @objid ("cd0558ea-9e86-46e1-bbdb-6d380c286e26")
    Classifier getContract();

    @objid ("284aa14a-b40d-4822-9a80-eb6484dec095")
    void setContract(Classifier value);

    @objid ("4e8b74d6-07b2-44e3-9a87-34861a0b2172")
    Classifier getSubstitutingClassifier();

    @objid ("636f3c73-6fa6-464e-ac92-0ad55c166ba0")
    void setSubstitutingClassifier(Classifier value);

}
