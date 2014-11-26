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
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.LinkEnd;

@objid ("815acdf3-5af8-48c5-894b-85d62dbe2e9b")
public interface Link extends ModelElement {
    @objid ("6ebfb3f8-1d38-4170-8d7b-f27696552c34")
    Association getModel();

    @objid ("40cdfc64-35cd-4a53-9093-aca1c1148aaa")
    void setModel(Association value);

    @objid ("4ee1492f-0964-427b-a1e2-66e78306bcbe")
    EList<LinkEnd> getLinkEnd();

    @objid ("33abb122-f542-40d2-99e1-c8597ffa0133")
    <T extends LinkEnd> List<T> getLinkEnd(java.lang.Class<T> filterClass);

    @objid ("17e1e31a-f925-4501-9f34-d728addfb954")
    CommunicationChannel getSent();

    @objid ("c7002077-b059-4aac-bef0-299b8d2c37e9")
    void setSent(CommunicationChannel value);

}
