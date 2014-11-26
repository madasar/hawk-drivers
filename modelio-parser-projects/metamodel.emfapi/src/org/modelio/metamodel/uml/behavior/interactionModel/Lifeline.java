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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("0048b5b6-c4bf-1fd8-97fe-001ec947cd2a")
public interface Lifeline extends ModelElement {
    @objid ("74df436c-38dd-4899-9861-3c18a51fb9bd")
    String getSelector();

    @objid ("608bc37d-3b5e-41a0-a82b-5fc77fffdb8a")
    void setSelector(String value);

    @objid ("1dbaa825-9897-4cbc-bf5a-89383347b2b9")
    EList<InteractionFragment> getCoveredBy();

    @objid ("16ee8285-22ea-4d1e-8f1b-4ca1385382ae")
    <T extends InteractionFragment> List<T> getCoveredBy(java.lang.Class<T> filterClass);

    @objid ("a41b675d-7365-446c-8182-9c4bab65efb3")
    PartDecomposition getDecomposedAs();

    @objid ("f211449e-1a47-486d-ab2d-0f9a11a5d16e")
    void setDecomposedAs(PartDecomposition value);

    @objid ("ee6d58f1-8fca-4588-81bb-6216f5c9a4a9")
    Interaction getOwner();

    @objid ("d92ab1e5-bfef-43d9-87c8-0ddf34d73f88")
    void setOwner(Interaction value);

    @objid ("4054642f-6827-40f1-a39e-b5113dae1ad8")
    Instance getRepresented();

    @objid ("08482c27-bcb9-484b-8e25-7dc7363eaecb")
    void setRepresented(Instance value);

}
