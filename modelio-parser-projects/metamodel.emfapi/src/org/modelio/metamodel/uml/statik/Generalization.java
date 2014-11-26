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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("000c7bb4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Generalization extends ModelElement {
    @objid ("715f94ef-9caf-496f-ad83-cac7487b87b3")
    String getDiscriminator();

    @objid ("accc7a2b-2f27-4b50-9b89-cde7405ea13a")
    void setDiscriminator(String value);

    @objid ("f7fb175d-4b5b-435d-ad3a-8c34b0d5b440")
    NameSpace getSuperType();

    @objid ("b2c55985-8cc5-4754-a974-04667ab189d4")
    void setSuperType(NameSpace value);

    @objid ("f7be7a60-4da5-4005-a51a-efb92bab89d1")
    NameSpace getSubType();

    @objid ("0571b2e8-6225-4b61-8925-c3aae8dbb105")
    void setSubType(NameSpace value);

}
