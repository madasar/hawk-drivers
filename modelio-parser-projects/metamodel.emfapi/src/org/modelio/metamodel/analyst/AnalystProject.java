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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0061ba52-c4bf-1fd8-97fe-001ec947cd2a")
public interface AnalystProject extends ModelElement {
    @objid ("9e573ce6-9911-48d6-8263-eae998ced074")
    PropertyContainer getPropertyRoot();

    @objid ("a34aa1a1-3995-48ef-8bf6-a9afb1de9527")
    void setPropertyRoot(PropertyContainer value);

    @objid ("d495ba7e-75e6-41a7-bcc1-2c1052f55838")
    EList<GoalContainer> getGoalRoot();

    @objid ("d94dd23b-b33c-4648-a144-41bb7b2c159d")
    <T extends GoalContainer> List<T> getGoalRoot(java.lang.Class<T> filterClass);

    @objid ("91eb7447-049d-42c1-9ba5-1f45517f3ecf")
    EList<BusinessRuleContainer> getBusinessRuleRoot();

    @objid ("8410c920-529c-4d93-87be-5b1aaab56121")
    <T extends BusinessRuleContainer> List<T> getBusinessRuleRoot(java.lang.Class<T> filterClass);

    @objid ("71098e86-51b1-4ada-acdf-d4faa6430144")
    EList<Dictionary> getDictionaryRoot();

    @objid ("250945b1-6360-442c-a780-31f39bb7e721")
    <T extends Dictionary> List<T> getDictionaryRoot(java.lang.Class<T> filterClass);

    @objid ("8a534c45-7ac4-4592-b8c5-9184e717d211")
    EList<RequirementContainer> getRequirementRoot();

    @objid ("b7e63a08-0a3b-458e-862a-e01e7770382d")
    <T extends RequirementContainer> List<T> getRequirementRoot(java.lang.Class<T> filterClass);

    @objid ("e3c14e2b-b721-4848-b325-7cedc5785509")
    EList<GenericAnalystContainer> getGenericRoot();

    @objid ("892783a3-09d6-48da-929c-0ad9654c4511")
    <T extends GenericAnalystContainer> List<T> getGenericRoot(java.lang.Class<T> filterClass);

}
