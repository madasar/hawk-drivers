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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;

@objid ("1b70521e-83b3-42a8-a6ca-a0b86b8dc3ea")
public interface QueryDefinition extends Element {
    @objid ("dbc93df9-010e-492c-8a7a-193bc3da4bb0")
    boolean isUsingAdditions();

    @objid ("6a94cbd7-1edd-4ea0-90cc-5a37f0c21f76")
    void setUsingAdditions(boolean value);

    @objid ("e749c94b-5d5e-462e-a8a2-5419510ae85b")
    EList<Element> getAdded();

    @objid ("4a6d7dd4-4fed-406c-8ce8-d06d53cbc700")
    <T extends Element> List<T> getAdded(java.lang.Class<T> filterClass);

    @objid ("6756b30b-4a16-405c-b30d-9e7ba88c7330")
    ExternProcessor getProcessor();

    @objid ("6fbe0a26-6eb0-47c1-866b-d2ad46aa4fc2")
    void setProcessor(ExternProcessor value);

    @objid ("8a9d4eb7-d8af-4736-bfb4-2338e16cad77")
    PropertyTable getParameters();

    @objid ("cfa5d6ec-4717-4126-a694-172cf96499d5")
    void setParameters(PropertyTable value);

    @objid ("9ac92c51-147e-47d8-a2d4-a6684014d4e3")
    MatrixDefinition getOwnerAsLine();

    @objid ("12e77092-0dec-4325-bbeb-f991a64d579b")
    void setOwnerAsLine(MatrixDefinition value);

    @objid ("8d7218c0-5468-4605-9aa8-6b48e07e84c5")
    MatrixDefinition getOwnerAsCol();

    @objid ("b8b3ce1b-9e5e-4d30-9dd7-9ca1418911fd")
    void setOwnerAsCol(MatrixDefinition value);

    @objid ("843636b6-5496-47f9-a2d5-37bb53026826")
    MatrixDefinition getOwnerAsDepth();

    @objid ("42f43816-2a91-4d89-a780-9a493c796ce2")
    void setOwnerAsDepth(MatrixDefinition value);

}
