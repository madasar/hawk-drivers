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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

@objid ("8a02f9a1-ae38-48d8-8f92-04ce8b6edc5c")
public interface MatrixDefinition extends ModelElement {
    @objid ("6df2ee44-0507-4019-bf2c-a8108a032bba")
    QueryDefinition getLinesDefinition();

    @objid ("4e6b18ed-401c-4d44-9ffe-7deb691f4aea")
    void setLinesDefinition(QueryDefinition value);

    @objid ("66af4a35-257e-49b7-ace8-0e34e97e51d6")
    QueryDefinition getColumnsDefinition();

    @objid ("22a55363-a970-4193-8d59-fbbebe8a8ce0")
    void setColumnsDefinition(QueryDefinition value);

    @objid ("66c6280b-8d62-4052-a002-633df518828d")
    MatrixValueDefinition getValuesDefinition();

    @objid ("db5bdf37-1ced-4d56-b527-cd39a8353905")
    void setValuesDefinition(MatrixValueDefinition value);

    @objid ("98d8be3f-d97a-4a55-be4c-64d79a591dcc")
    QueryDefinition getDepthDefinition();

    @objid ("0ed30aa3-45dc-4348-8a79-2a8b0335086c")
    void setDepthDefinition(QueryDefinition value);

    @objid ("5206aba2-a4ab-4dd7-b245-974cb0875558")
    ModelElement getOwner();

    @objid ("ec8d044b-8fea-4cc6-bcde-947d76c9c652")
    void setOwner(ModelElement value);

}
