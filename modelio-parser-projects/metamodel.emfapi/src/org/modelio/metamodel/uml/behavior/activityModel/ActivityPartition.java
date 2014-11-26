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
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0029d8f8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityPartition extends ActivityGroup {
    @objid ("8b86bd17-8e32-4e17-81ac-41aa460a9a22")
    boolean isIsDimension();

    @objid ("0a805444-a100-4643-a8f4-cd925f60ac84")
    void setIsDimension(boolean value);

    @objid ("aa67b672-f4ad-4c6e-8d5e-c8ffd535b47f")
    boolean isIsExternal();

    @objid ("21b00749-da65-4dbd-81e9-f0538bebbb25")
    void setIsExternal(boolean value);

    @objid ("2aeb4390-a618-43bc-97d0-a751473aa265")
    ModelElement getRepresented();

    @objid ("7affd595-5b83-438e-890e-acb23acbc651")
    void setRepresented(ModelElement value);

    @objid ("19ccc9e3-5a79-45c1-94be-b91011d5cdf7")
    EList<ActivityNode> getContainedNode();

    @objid ("00a08d0d-53dd-4bec-923c-f35e310e27c4")
    <T extends ActivityNode> List<T> getContainedNode(java.lang.Class<T> filterClass);

    @objid ("21ba1c4a-d7b8-4f01-9db9-6f3a6b76ca27")
    EList<MessageFlow> getOutgoing();

    @objid ("9cd7f791-76c2-47e9-8188-4feb4fafd7c4")
    <T extends MessageFlow> List<T> getOutgoing(java.lang.Class<T> filterClass);

    @objid ("b89d41db-16a4-46b1-8c06-81c5f4a4d777")
    ActivityPartition getSuperPartition();

    @objid ("2fef0143-23b3-44f5-a681-d24f47ad042f")
    void setSuperPartition(ActivityPartition value);

    @objid ("17b8d684-4917-4685-80d9-7c060408d84b")
    EList<ActivityPartition> getSubPartition();

    @objid ("2d874452-f73a-4219-b153-f4a810a13a97")
    <T extends ActivityPartition> List<T> getSubPartition(java.lang.Class<T> filterClass);

    @objid ("add4de31-1198-4fdd-93c5-a73e3c10e1dd")
    EList<MessageFlow> getIncoming();

    @objid ("c3f0856e-d68a-4d58-ba27-ed79616bdf9b")
    <T extends MessageFlow> List<T> getIncoming(java.lang.Class<T> filterClass);

}
