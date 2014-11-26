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
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

@objid ("e5bf50a8-5a3e-4c5c-9bf8-83310c530ee3")
public interface ExternProcessor extends ModelElement {
    @objid ("72a25470-068f-4ccf-8908-22b186465d42")
    String getClassName();

    @objid ("d1f1cca6-c6d9-4c3c-bbbe-902d81373d72")
    void setClassName(String value);

    @objid ("bda13814-f328-4c34-b39c-0b3278403102")
    QueryDefinition getOwnerQuery();

    @objid ("d750d4fb-b243-4a60-8a5c-f5ba5835a5fa")
    void setOwnerQuery(QueryDefinition value);

    @objid ("98655eea-9321-4565-960a-71ff93bf7f68")
    MatrixValueDefinition getOwnerValDef();

    @objid ("7d0fc770-c012-4566-b231-6e861c8e86f7")
    void setOwnerValDef(MatrixValueDefinition value);

}
