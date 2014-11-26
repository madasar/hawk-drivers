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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("004119be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BehaviorParameter extends Parameter {
    @objid ("99e14b81-1700-4b50-a9ff-3e026c651ea4")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("d48adfa2-5c55-43ce-aa53-d57aa8ddde5b")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("c7a7f3e6-ea80-414c-a2d8-81e1c20b72ee")
    Behavior getOwner();

    @objid ("485fb2f3-8100-4078-af8b-34e67f6874b2")
    void setOwner(Behavior value);

    @objid ("0fe914b1-ff94-40de-8531-0fa912930dfc")
    Parameter getMapped();

    @objid ("33caeebb-423d-4d5d-b5ad-e28ba3d49981")
    void setMapped(Parameter value);

}
