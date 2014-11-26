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
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0085d9be-c4be-1fd8-97fe-001ec947cd2a")
public interface Dependency extends ModelElement {
    @objid ("42368975-e9d3-4c13-b6d8-a8c7295d798e")
    String getDependsOnId();

    @objid ("d5260722-7c1e-4cc0-9043-a2d3ddde72e8")
    void setDependsOnId(String value);

    @objid ("445e681e-f949-45f7-a371-57c4a610fd9f")
    String getDependsOnName();

    @objid ("490883db-c606-4863-9381-a8ce122bfcf9")
    void setDependsOnName(String value);

    @objid ("608e97e8-e4c3-46af-8a2d-a203c428d897")
    ModelElement getDependsOn();

    @objid ("25f96c0a-8ca9-414f-b7b9-7dfec0db54d5")
    void setDependsOn(ModelElement value);

    @objid ("af55fb28-bacd-4b42-8648-808d3ca558c1")
    ModelElement getImpacted();

    @objid ("b201045a-c177-4bbb-bce3-50d6b2694eb8")
    void setImpacted(ModelElement value);

}
