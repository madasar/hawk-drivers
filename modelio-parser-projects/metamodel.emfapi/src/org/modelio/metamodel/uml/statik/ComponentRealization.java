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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Component;

@objid ("62efa8ac-4b66-4ce6-bc08-86fd413905ce")
public interface ComponentRealization extends ModelElement {
    @objid ("338a8ffd-a5b9-4ec5-81a1-f608af2de145")
    Classifier getRealizingClassifier();

    @objid ("6f1a85f2-e576-492e-8860-37478ee7250b")
    void setRealizingClassifier(Classifier value);

    @objid ("93645278-dc29-4325-8d63-5a6e13ed0bc9")
    Component getAbstraction();

    @objid ("1cf25af5-1144-456d-80e8-b52c509cfd05")
    void setAbstraction(Component value);

}
