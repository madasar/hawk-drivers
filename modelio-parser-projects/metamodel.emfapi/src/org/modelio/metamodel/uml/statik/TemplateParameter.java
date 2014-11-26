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
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;

@objid ("001d18e8-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateParameter extends GeneralClass {
    @objid ("f43cdf90-6f11-4188-ab5c-635a262610a9")
    String getDefaultValue();

    @objid ("e366ed3d-fcac-4195-83d1-59a8ee57f954")
    void setDefaultValue(String value);

    @objid ("b4ffebb2-2000-4406-8575-9fa9e2a98613")
    boolean isIsValueParameter();

    @objid ("eea2f987-2529-4e6f-aa9f-f963a249adc4")
    void setIsValueParameter(boolean value);

    @objid ("7873461c-10d0-4198-b19a-eca0bd4192f4")
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    @objid ("6ddfc164-800a-4bf5-b0d3-423c0d2a75b7")
    <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass);

    @objid ("0eb6e289-0c24-49d7-a14e-cf72c6e0309f")
    ModelElement getType();

    @objid ("5fb5fc68-7303-4dad-90fb-e8bec9f15595")
    void setType(ModelElement value);

    @objid ("3519ff0e-ed1a-4744-91d2-15b9f35b89e8")
    NameSpace getParameterized();

    @objid ("21b24aa1-f632-42bc-a8fc-680ebc237148")
    void setParameterized(NameSpace value);

    @objid ("071e69fd-9d34-4167-a326-7ccd0f19c3d2")
    ModelElement getOwnedParameterElement();

    @objid ("4895041d-0abb-40eb-88d8-d1608c6c5b86")
    void setOwnedParameterElement(ModelElement value);

    @objid ("8437a92c-1651-4fcb-ab21-8b59846074be")
    ModelElement getDefaultType();

    @objid ("a86a2b1c-6366-4e6b-acea-aa644dbd03b8")
    void setDefaultType(ModelElement value);

    @objid ("b93d240e-08f2-4ad6-9264-e650f3bcc0d2")
    Operation getParameterizedOperation();

    @objid ("e061a360-ef49-404a-9d10-7ae72fce7bdc")
    void setParameterizedOperation(Operation value);

}
