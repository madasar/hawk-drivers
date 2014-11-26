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
package org.modelio.metamodel.diagrams;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("006721c2-c4bf-1fd8-97fe-001ec947cd2a")
public interface AbstractDiagram extends ModelElement {
    @objid ("559442b4-431d-4dc3-a401-eee21dc8a938")
    int getUiDataVersion();

    @objid ("243fa6a4-a5e6-4610-8836-3e572295ba32")
    void setUiDataVersion(int value);

    @objid ("c1ddff6c-306c-4d37-9067-1b4af6e10360")
    String getUiData();

    @objid ("5b78aa75-aa64-404e-8c65-18e46eb445a8")
    void setUiData(String value);

    @objid ("ec48a0cc-1998-4b95-860a-228e9217211c")
    String getPdeProperties();

    @objid ("164b6152-6c12-4d31-bb00-2a27ac10e912")
    void setPdeProperties(String value);

    @objid ("97fce8ec-5203-40fe-b6a9-c4b59fdd6b84")
    ModelElement getOrigin();

    @objid ("58d5eb47-d0dc-43bd-a20c-63147a735172")
    void setOrigin(ModelElement value);

    @objid ("ee4b459e-aa0f-4cc5-9e4a-34250bc0f64e")
    EList<Element> getRepresented();

    @objid ("5b932398-6789-4b7e-9bfc-37cea3f913d3")
    <T extends Element> List<T> getRepresented(java.lang.Class<T> filterClass);

    @objid ("11fb9128-b2d7-4f64-85bd-184f96089286")
    EList<DiagramSet> getReferencingSet();

    @objid ("2aa6658b-9977-4128-b3f8-ffbdd0cc4667")
    <T extends DiagramSet> List<T> getReferencingSet(java.lang.Class<T> filterClass);

}
