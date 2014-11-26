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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("002cb618-c4bf-1fd8-97fe-001ec947cd2a")
public interface Clause extends ModelElement {
    @objid ("2ae6a922-6b9e-42ed-915f-4dc68834812a")
    String getTest();

    @objid ("e44bbc74-8c9f-4020-8b79-a686443288dc")
    void setTest(String value);

    @objid ("7902a2e1-d648-4570-964d-11ddfef80f56")
    EList<ActivityNode> getBody();

    @objid ("a8750f83-ee0b-443d-b992-bbfaf03fdff0")
    <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass);

    @objid ("16113de8-fdef-4640-8407-33b1028a3975")
    ConditionalNode getOwner();

    @objid ("97847a5e-e6db-4805-a3d1-f69aa49485f1")
    void setOwner(ConditionalNode value);

}
