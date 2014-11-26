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
package org.modelio.metamodel.diagrams;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("006e175c-c4bf-1fd8-97fe-001ec947cd2a")
public interface DiagramSet extends ModelElement {
    @objid ("3e2dec86-ad89-4b2b-b5b4-fafc31298ceb")
    EList<DiagramSet> getSub();

    @objid ("9c7a7be3-b3ab-4d76-b0a7-a02551c0225c")
    <T extends DiagramSet> List<T> getSub(java.lang.Class<T> filterClass);

    @objid ("ada6f110-7a78-4ea8-9500-2b35e957eca8")
    DiagramSet getParent();

    @objid ("8bb98286-ccc3-457f-a4d1-e603785c788e")
    void setParent(DiagramSet value);

    @objid ("0acde750-9a96-42bd-84af-a90aaffd7f14")
    EList<AbstractDiagram> getReferencedDiagram();

    @objid ("7d83cc25-d98f-4b89-8f56-80e0b4c694b2")
    <T extends AbstractDiagram> List<T> getReferencedDiagram(java.lang.Class<T> filterClass);

    @objid ("86c64914-6ddd-4adf-b267-3eb4b93e907a")
    Project getOwner();

    @objid ("b89fd568-fb76-4fa9-a10a-53ebe5ee1584")
    void setOwner(Project value);

}
