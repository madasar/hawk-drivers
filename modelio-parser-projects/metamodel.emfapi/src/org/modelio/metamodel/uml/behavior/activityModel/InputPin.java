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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;

@objid ("003503ea-c4bf-1fd8-97fe-001ec947cd2a")
public interface InputPin extends Pin {
    @objid ("bf2ebd17-d3ec-4971-8e51-24692ead928b")
    boolean isIsSelf();

    @objid ("335bdb18-80fe-4eef-a595-97b066b06177")
    void setIsSelf(boolean value);

    @objid ("395d2149-df8b-4dc3-8c65-d8751031cb33")
    EList<ExceptionHandler> getHandler();

    @objid ("00863399-3651-410d-ac7b-5e06a8d88a6b")
    <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass);

    @objid ("fa68f646-a05e-4be0-ad4c-73698be951b7")
    ActivityAction getInputing();

    @objid ("7c7a388f-1e66-4c90-866e-b898daf6acac")
    void setInputing(ActivityAction value);

}
