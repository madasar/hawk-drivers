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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("00867d60-c4be-1fd8-97fe-001ec947cd2a")
public interface Element extends EObject, MObject {
    @objid ("b7064783-df65-4b6b-af0a-1474256dd661")
    EList<AbstractDiagram> getDiagramElement();

    @objid ("de604c31-b702-49cd-83b0-481cccbdcb96")
    <T extends AbstractDiagram> List<T> getDiagramElement(java.lang.Class<T> filterClass);

    @objid ("9117c3dd-685c-4b2c-8fa7-24c32512c3ef")
    EList<NamespaceUse> getCausing();

    @objid ("86f07024-db9e-4ee9-9aa0-6691e7d70791")
    <T extends NamespaceUse> List<T> getCausing(java.lang.Class<T> filterClass);

    @objid ("482ef09e-6141-4b2b-ad15-dd8515d832b8")
    EList<QueryDefinition> getAddedToQuery();

    @objid ("596d2bb2-6984-4942-9488-289f55abfa4f")
    <T extends QueryDefinition> List<T> getAddedToQuery(java.lang.Class<T> filterClass);

}
