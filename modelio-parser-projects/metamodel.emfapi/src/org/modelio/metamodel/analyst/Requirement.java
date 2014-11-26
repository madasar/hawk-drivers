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
import org.modelio.metamodel.analyst.RequirementContainer;

@objid ("2a1baa12-05dd-4955-bc67-2839831d9bb9")
public interface Requirement extends AnalystElement {
    @objid ("25438924-f141-4259-b5e9-913c5969e3d5")
    EList<Requirement> getSubRequirement();

    @objid ("a4bfd9df-9522-4121-b835-d4b2ee659ed0")
    <T extends Requirement> List<T> getSubRequirement(java.lang.Class<T> filterClass);

    @objid ("b1bfd6e5-02e4-43f1-90c2-8bbf82dc79ed")
    RequirementContainer getOwnerContainer();

    @objid ("92c1328a-7748-4d30-aba2-f920bcd0ca5b")
    void setOwnerContainer(RequirementContainer value);

    @objid ("ef3e4427-e20f-4e23-8392-679ded1c4eee")
    Requirement getParentRequirement();

    @objid ("68343a5b-9124-4243-bb96-790ca93ead84")
    void setParentRequirement(Requirement value);

    @objid ("e49caf1b-4989-4ed6-ac2f-6f42e9f6b6ed")
    EList<Requirement> getArchivedRequirementVersion();

    @objid ("d0af6771-35dd-4b33-8c5f-b0be82e9ed20")
    <T extends Requirement> List<T> getArchivedRequirementVersion(java.lang.Class<T> filterClass);

    @objid ("9d93c209-5e04-4e3b-93a5-b26edea55cea")
    Requirement getLastRequirementVersion();

    @objid ("d1d209b2-bb60-4700-b9c3-8f063dc101de")
    void setLastRequirementVersion(Requirement value);

}
