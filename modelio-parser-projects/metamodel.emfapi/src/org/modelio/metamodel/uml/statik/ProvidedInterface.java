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
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;

@objid ("00198dea-c4bf-1fd8-97fe-001ec947cd2a")
public interface ProvidedInterface extends ModelElement {
    @objid ("34fa2f15-bd36-429b-860a-93072b86feed")
    EList<Interface> getProvidedElement();

    @objid ("2f08be39-9f66-4131-9091-8d063a4dd153")
    <T extends Interface> List<T> getProvidedElement(java.lang.Class<T> filterClass);

    @objid ("03789311-a393-4316-b35c-1a47c2750730")
    Port getProviding();

    @objid ("8336ab36-5986-4c54-a2e2-34642098e65c")
    void setProviding(Port value);

    @objid ("52828835-fdb3-4728-a0d9-ff6220f1a69c")
    EList<LinkEnd> getConsumer();

    @objid ("95e96879-55f3-4e20-a6fd-33139f0087f0")
    <T extends LinkEnd> List<T> getConsumer(java.lang.Class<T> filterClass);

    @objid ("9728c699-9a32-46da-a408-f8fd80f1f782")
    EList<NaryLinkEnd> getNaryConsumer();

    @objid ("1292e6a8-445c-4e1e-8c91-61ed57bff02a")
    <T extends NaryLinkEnd> List<T> getNaryConsumer(java.lang.Class<T> filterClass);

}
