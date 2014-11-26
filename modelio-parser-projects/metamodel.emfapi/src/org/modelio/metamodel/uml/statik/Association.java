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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Link;

@objid ("28f7c9fd-bee9-46f0-8969-5c46572cec86")
public interface Association extends ModelElement {
    @objid ("a21832fa-415d-45ae-9997-578bd62e4ca4")
    EList<Link> getOccurence();

    @objid ("d044b040-f3d3-4f95-beb7-02fb5225a0ac")
    <T extends Link> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("546670d1-4f46-445c-a56a-d5908913ce56")
    EList<AssociationEnd> getEnd();

    @objid ("33e5847b-2866-4203-9f74-e1e63b0a65bc")
    <T extends AssociationEnd> List<T> getEnd(java.lang.Class<T> filterClass);

    @objid ("f177ff29-a9b6-41ee-ba03-af44bf4641c5")
    ClassAssociation getLinkToClass();

    @objid ("ab97b3d9-673b-478e-9d6d-a921f10e262d")
    void setLinkToClass(ClassAssociation value);

}
