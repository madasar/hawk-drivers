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
import org.modelio.metamodel.uml.behavior.activityModel.Clause;

@objid ("002d52f8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConditionalNode extends StructuredActivityNode {
    @objid ("4e010692-b4f6-4783-b58c-87f0967ecba9")
    boolean isIsDeterminate();

    @objid ("0be0cade-c7da-4878-a060-c9a2f5b9a845")
    void setIsDeterminate(boolean value);

    @objid ("d21e8f87-c858-4592-9918-bd8e7b893db1")
    boolean isIsAssured();

    @objid ("72a9d40a-9341-4c2d-94d1-2f6f5cb1d0ef")
    void setIsAssured(boolean value);

    @objid ("4096ac6e-2d1b-4e1e-ace9-4cddaa57e0d5")
    EList<Clause> getOwnedClause();

    @objid ("8924981d-2171-4358-bbe3-e3fc20faf640")
    <T extends Clause> List<T> getOwnedClause(java.lang.Class<T> filterClass);

}
