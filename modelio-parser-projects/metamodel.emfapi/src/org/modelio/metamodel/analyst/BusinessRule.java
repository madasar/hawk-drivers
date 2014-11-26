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

@objid ("5a95b6be-0c64-44a2-a18c-e3ca290c5245")
public interface BusinessRule extends AnalystElement {
    @objid ("56610330-c6cd-45cd-8ad2-5fb09bf9e188")
    EList<BusinessRule> getSubRule();

    @objid ("6da14e04-66a0-4727-b187-8adf70793750")
    <T extends BusinessRule> List<T> getSubRule(java.lang.Class<T> filterClass);

    @objid ("554000cf-f170-4f48-82d0-c0358d4044d9")
    BusinessRuleContainer getOwnerContainer();

    @objid ("0059f4b7-bc99-4634-b0ae-3cdb6552098e")
    void setOwnerContainer(BusinessRuleContainer value);

    @objid ("4ba86332-e323-4962-b468-4a9e8731b5ba")
    BusinessRule getParentRule();

    @objid ("b7998bc4-1274-4ec4-abc0-3a4a5bfc2bbd")
    void setParentRule(BusinessRule value);

    @objid ("64ab6b97-e56b-4db5-8cf7-cb7d5cf1b194")
    BusinessRule getLastRuleVersion();

    @objid ("12422455-6fbc-4661-8b4f-1827c898a9e7")
    void setLastRuleVersion(BusinessRule value);

    @objid ("31b287e7-2196-412a-bfc3-dec70a41d06f")
    EList<BusinessRule> getArchivedRuleVersion();

    @objid ("cd898477-ba80-45da-bafd-38ec177e7319")
    <T extends BusinessRule> List<T> getArchivedRuleVersion(java.lang.Class<T> filterClass);

}
