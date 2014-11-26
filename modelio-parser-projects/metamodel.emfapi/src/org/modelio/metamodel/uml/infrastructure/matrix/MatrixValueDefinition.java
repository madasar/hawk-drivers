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
package org.modelio.metamodel.uml.infrastructure.matrix;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;

@objid ("6ae11939-6513-44a4-b535-1daf76e27f63")
public interface MatrixValueDefinition extends Element {
    @objid ("b13bd44e-a94b-429c-999e-0567b7c36ffa")
    ExternProcessor getProcessor();

    @objid ("7038a321-bf63-4ef2-a53f-c8e8436d7a55")
    void setProcessor(ExternProcessor value);

    @objid ("b1d31e89-9b36-49fe-9775-2e08aa9204ca")
    PropertyTable getParameters();

    @objid ("5ac7b5e7-9256-4559-ace8-86c1f4587e76")
    void setParameters(PropertyTable value);

    @objid ("7ad0bd59-b6a2-4e32-a08d-886ca53c9b62")
    MatrixDefinition getMatrix();

    @objid ("acce4758-2227-4c60-98b6-e8c0f769bc9e")
    void setMatrix(MatrixDefinition value);

}
