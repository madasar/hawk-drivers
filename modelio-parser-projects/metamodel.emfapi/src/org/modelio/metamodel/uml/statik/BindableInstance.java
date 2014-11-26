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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("0000aa6e-c4bf-1fd8-97fe-001ec947cd2a")
public interface BindableInstance extends Instance {
    @objid ("69472e0b-d115-4a38-8196-c125b58bb387")
    Instance getCluster();

    @objid ("b74409e7-f2f9-4d28-98c5-3a0bb2331e1c")
    void setCluster(Instance value);

    @objid ("a84f80e6-d709-43e0-b11f-230f703a82a7")
    Classifier getInternalOwner();

    @objid ("fdf406dd-7fa2-4d4d-b06b-a34cd958c782")
    void setInternalOwner(Classifier value);

    @objid ("d053db27-3e1c-4ac7-886c-5d128a9972aa")
    EList<Binding> getRepresentation();

    @objid ("2f713636-a70a-45fc-8d60-eb6335aa3c1c")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("edbbad5c-f203-4fb6-bb93-a42c57d3fc01")
    ModelElement getRepresentedFeature();

    @objid ("3b0585d5-08e0-4c90-b8fd-69a77a46575f")
    void setRepresentedFeature(ModelElement value);

}
