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
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;

@objid ("002688d8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityAction extends ActivityNode {
    @objid ("d1e3ac4b-8ef6-4fa3-82c5-86a8a40e2de7")
    boolean isIsMultipleInstance();

    @objid ("2ce1c63d-573b-487c-850d-fcde761dd146")
    void setIsMultipleInstance(boolean value);

    @objid ("1a74e3a0-2444-4836-ae22-285361534b4e")
    boolean isIsCompensation();

    @objid ("690e08a9-6db2-4b54-81bf-64ddc78fbffa")
    void setIsCompensation(boolean value);

    @objid ("332768e3-c785-4675-bbd3-3242971bf9aa")
    EList<OutputPin> getOutput();

    @objid ("6080408c-812e-43ee-9358-68bc73fd5156")
    <T extends OutputPin> List<T> getOutput(java.lang.Class<T> filterClass);

    @objid ("fbc18abd-fb27-49d2-ad9e-7355acc33fe1")
    EList<InputPin> getInput();

    @objid ("5376e689-1443-4ba6-8b3a-3ab1cee7d3ef")
    <T extends InputPin> List<T> getInput(java.lang.Class<T> filterClass);

    @objid ("a636dba6-399f-4b89-8bd8-2796b638ee36")
    EList<ExceptionHandler> getHandler();

    @objid ("73153f93-a37d-4ce0-81e5-1d12bc3d4de1")
    <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass);

}
