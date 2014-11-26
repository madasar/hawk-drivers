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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

@objid ("008e8d34-c4be-1fd8-97fe-001ec947cd2a")
public interface TagParameter extends Element {
    @objid ("e83c8005-d061-4700-8723-f82a75db4b1b")
    String getValue();

    @objid ("36a7450d-5510-4762-bf8d-d56e4d4b7b56")
    void setValue(String value);

    @objid ("ab7b0e57-9569-481d-801d-293024871253")
    TaggedValue getAnnoted();

    @objid ("56696b11-30e8-481c-9558-42def720e887")
    void setAnnoted(TaggedValue value);

    @objid ("87b26100-1571-4f74-8365-702f211498cf")
    TaggedValue getQualified();

    @objid ("664471f2-bb8a-4e16-821c-56cb3fdfa937")
    void setQualified(TaggedValue value);

}
