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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;

@objid ("0031bab4-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExpansionRegion extends StructuredActivityNode {
    @objid ("de684447-57a6-4b1d-8a1c-a0429f0c06fd")
    ExpansionKind getMode();

    @objid ("8ff5e564-87e8-4f3e-956c-52ee2d5b6a6b")
    void setMode(ExpansionKind value);

    @objid ("e9372ef8-b40a-4ffc-ae9a-d71025d39b7b")
    EList<ExpansionNode> getOutputElement();

    @objid ("73bc61de-41c0-457e-b9cc-35b7cc619b88")
    <T extends ExpansionNode> List<T> getOutputElement(java.lang.Class<T> filterClass);

    @objid ("cf5e72af-bd80-4334-bc85-682a793be1e9")
    EList<ExpansionNode> getInputElement();

    @objid ("99ecd80c-2674-464c-a2f2-534cb47d3ef3")
    <T extends ExpansionNode> List<T> getInputElement(java.lang.Class<T> filterClass);

}
