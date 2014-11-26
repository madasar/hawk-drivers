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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.BusinessRule;

@objid ("26a924f1-2881-4dea-bc77-f6f2a6d7406b")
public interface BusinessRuleContainer extends AnalystContainer {
    @objid ("76f96939-efdc-4669-89a9-f686fd0cb063")
    EList<BusinessRule> getOwnedRule();

    @objid ("2c559032-72a9-4ace-a2e9-009eda96f545")
    <T extends BusinessRule> List<T> getOwnedRule(java.lang.Class<T> filterClass);

    @objid ("e6480c43-31bb-4df6-81e6-8fe82a285567")
    BusinessRuleContainer getOwnerContainer();

    @objid ("c485d54c-a6e5-486f-ac0d-d36ebdce9fcb")
    void setOwnerContainer(BusinessRuleContainer value);

    @objid ("71cd32d7-0605-4e58-88dd-0493d5d17ac4")
    EList<BusinessRuleContainer> getOwnedContainer();

    @objid ("da9557e1-3831-4510-b507-c5df6cdf511f")
    <T extends BusinessRuleContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("486fec9b-957c-47fa-9ceb-3c5672ed6150")
    AnalystProject getOwnerProject();

    @objid ("7373a357-6d9f-4466-a0c4-eb446111e7cc")
    void setOwnerProject(AnalystProject value);

}
