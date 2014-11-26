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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("ab041cd6-1250-48a8-9ddb-0a1064baf5c4")
public interface AnalystItem extends ModelElement {
    @objid ("4a05020f-b417-4701-9cdc-91add5254ea2")
    String getDefinition();

    @objid ("b212520a-2ebf-4731-ad7a-cdf1dfdd3d78")
    void setDefinition(String value);

    @objid ("ca2a7896-25ce-43bc-b80d-75b69ba99d8a")
    AnalystPropertyTable getAnalystProperties();

    @objid ("0472b408-cdd1-4c36-89ce-15680596619a")
    void setAnalystProperties(AnalystPropertyTable value);

}
