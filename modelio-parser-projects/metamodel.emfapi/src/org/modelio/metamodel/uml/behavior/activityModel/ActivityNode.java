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
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0028adde-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityNode extends ModelElement {
    @objid ("1c1c67ea-b224-4996-92c6-f032fa67d962")
    Activity getOwner();

    @objid ("4d6215b6-1d32-4eab-b421-3e8c74bda06b")
    void setOwner(Activity value);

    @objid ("bc8407de-3fb6-4c7f-9288-4b6edbc913b9")
    ActivityPartition getOwnerPartition();

    @objid ("b1392c25-d7f5-4d66-8169-38f3c21cc42e")
    void setOwnerPartition(ActivityPartition value);

    @objid ("49fc70f0-67ce-4261-9de5-9018aea35068")
    EList<ActivityEdge> getIncoming();

    @objid ("76a2eb4d-f237-4b56-b6cc-f8358fa999bf")
    <T extends ActivityEdge> List<T> getIncoming(java.lang.Class<T> filterClass);

    @objid ("fb875118-68f6-4c6d-badf-c195e9fba0e3")
    Clause getOwnerClause();

    @objid ("246361df-ccde-4e1c-8d99-996432334882")
    void setOwnerClause(Clause value);

    @objid ("ce5d8396-305c-4027-bb3c-98a0bde2b7d6")
    StructuredActivityNode getOwnerNode();

    @objid ("9e329c46-60a3-4ace-b405-e3374253b44c")
    void setOwnerNode(StructuredActivityNode value);

    @objid ("397f764f-98fa-4e60-9877-6bf596960478")
    EList<ActivityEdge> getOutgoing();

    @objid ("cae102f2-8ad3-4dfd-a27f-ba11c29d9703")
    <T extends ActivityEdge> List<T> getOutgoing(java.lang.Class<T> filterClass);

}
