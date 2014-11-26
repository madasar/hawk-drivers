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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00047d6a-c4bf-1fd8-97fe-001ec947cd2a")
public interface CollaborationUse extends ModelElement {
    @objid ("7e8a50f9-04dd-4702-ada6-d0aca7a71e82")
    Collaboration getType();

    @objid ("d8d0858a-ec76-4b54-ab54-a7246ef410c1")
    void setType(Collaboration value);

    @objid ("31a3e059-6bce-449a-ad43-be59a47aeec4")
    NameSpace getNRepresented();

    @objid ("29e1b6b6-34ee-484e-908f-54d1c52967ef")
    void setNRepresented(NameSpace value);

    @objid ("9402a51e-fbb3-4d99-be80-5cf0295c47b4")
    Operation getORepresented();

    @objid ("9f923f3d-beb0-4ca6-9436-72709fe61740")
    void setORepresented(Operation value);

    @objid ("7c91adef-48c3-408b-87e5-cef1761b4057")
    EList<Binding> getRoleBinding();

    @objid ("bcc64777-9ef2-471a-b073-94c61f815602")
    <T extends Binding> List<T> getRoleBinding(java.lang.Class<T> filterClass);

}
