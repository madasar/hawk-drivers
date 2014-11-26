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
import org.modelio.metamodel.analyst.Term;

@objid ("005b9e06-c4bf-1fd8-97fe-001ec947cd2a")
public interface Dictionary extends AnalystContainer {
    @objid ("95248266-3596-42cd-a25b-c9355f702500")
    EList<Dictionary> getOwnedDictionary();

    @objid ("9b9609bb-613b-46c8-9999-bfaf53279cf1")
    <T extends Dictionary> List<T> getOwnedDictionary(java.lang.Class<T> filterClass);

    @objid ("8abf8315-2e11-4e2a-ac95-12e588426cad")
    Dictionary getOwnerDictionary();

    @objid ("ba90d017-b879-4d5e-905d-b12231709884")
    void setOwnerDictionary(Dictionary value);

    @objid ("cad6c36e-2bcc-470a-8930-c128f910b8ba")
    AnalystProject getOwnerProject();

    @objid ("bb818052-421f-4ab5-b7c6-f3ab48597e06")
    void setOwnerProject(AnalystProject value);

    @objid ("9af7eebb-a349-48d4-8aca-195094302cdd")
    EList<Term> getOwnedTerm();

    @objid ("4f77861d-80a6-462f-8b34-e828c9d3f5b8")
    <T extends Term> List<T> getOwnedTerm(java.lang.Class<T> filterClass);

}
