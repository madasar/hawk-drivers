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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;

@objid ("0090006a-c4be-1fd8-97fe-001ec947cd2a")
public interface TaggedValue extends ModelElement {
    @objid ("aba1b2e9-c9d5-4ca5-8f50-e55e19524322")
    ModelElement getAnnoted();

    @objid ("bfe4d0c7-baef-49ec-af86-77964ed62d8d")
    void setAnnoted(ModelElement value);

    @objid ("d118c11c-9025-4181-8b2e-59bcffeda2de")
    EList<TagParameter> getActual();

    @objid ("e5e63fe4-49fd-47a8-8ba2-45c15f8ebcc6")
    <T extends TagParameter> List<T> getActual(java.lang.Class<T> filterClass);

    @objid ("dc3c1d2d-0532-4aa7-8865-cdd2f8f4a526")
    TagParameter getQualifier();

    @objid ("5ac6de8d-b8ed-4cf6-b0bf-c43044c85a7f")
    void setQualifier(TagParameter value);

    @objid ("df3fc4a3-c1ef-4b19-a0dc-360bdd6effca")
    TagType getDefinition();

    @objid ("7c329c0f-8feb-4470-b6e5-d976a8e787dc")
    void setDefinition(TagType value);

}
