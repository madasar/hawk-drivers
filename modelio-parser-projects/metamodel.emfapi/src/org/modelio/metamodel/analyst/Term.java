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
import org.modelio.metamodel.analyst.Dictionary;

@objid ("006241a2-c4bf-1fd8-97fe-001ec947cd2a")
public interface Term extends AnalystElement {
    @objid ("70f9b6d5-4e44-449f-b701-c170c44eafee")
    Dictionary getOwnerDictionary();

    @objid ("ddb499de-3727-4582-a7af-9ea294ffa491")
    void setOwnerDictionary(Dictionary value);

    @objid ("90fb61a2-5b63-47ff-9d83-c04ab4b2a1e4")
    EList<Term> getArchivedTermVersion();

    @objid ("0f8e1586-e99f-46a2-8fc5-b8cc8e80a6b5")
    <T extends Term> List<T> getArchivedTermVersion(java.lang.Class<T> filterClass);

    @objid ("fa3bed7d-295f-4f30-a0f9-ffa3ae046381")
    Term getLastTermVersion();

    @objid ("44a2a937-c7d4-4d8f-85a3-ed02cdc802b0")
    void setLastTermVersion(Term value);

}
