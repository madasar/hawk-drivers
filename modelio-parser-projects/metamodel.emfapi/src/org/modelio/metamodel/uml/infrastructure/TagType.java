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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

@objid ("008f48d2-c4be-1fd8-97fe-001ec947cd2a")
public interface TagType extends ModelElement {
    @objid ("1bb2d0a1-acf1-4d78-85d4-08a7d74e0427")
    ModuleComponent getModule();

    @objid ("086c1ea7-0a7a-4bbf-9f2e-ee680bf468d5")
    String getParamNumber();

    @objid ("178aba5b-2f1f-4f14-8e69-4fbb0c57688c")
    void setParamNumber(String value);

    @objid ("fe1f9fb8-266d-444d-90b0-c999a47b8e38")
    boolean isIsQualified();

    @objid ("6234961e-ec10-41e5-8ed5-0b3e98d9ec5e")
    void setIsQualified(boolean value);

    @objid ("8af6a703-3f5a-4701-b7ab-40dc5ebba881")
    boolean isBelongToPrototype();

    @objid ("13e248e6-76ac-4d45-8c31-f2ff25047fed")
    void setBelongToPrototype(boolean value);

    @objid ("808de5af-6af3-4d16-8fbd-99d83c669690")
    boolean isIsHidden();

    @objid ("90913fc6-6a4d-4e58-bc15-403f8173451c")
    void setIsHidden(boolean value);

    @objid ("c1d3a6d4-f0bf-4bbc-9d05-72f8b6a7d450")
    String getLabelKey();

    @objid ("658f7810-e453-4a52-9efb-1f92bc1786a3")
    void setLabelKey(String value);

    @objid ("dd585e20-84fe-43c4-bfe7-617113a9d9d3")
    EList<TaggedValue> getTagOccurence();

    @objid ("9e4d53e7-d7a4-4e00-878a-44fee1392b52")
    <T extends TaggedValue> List<T> getTagOccurence(java.lang.Class<T> filterClass);

    @objid ("7e3658d3-678f-4613-afa2-882e3160157a")
    Stereotype getOwnerStereotype();

    @objid ("7cbece3b-b8e5-4b11-9b42-4384136192a8")
    void setOwnerStereotype(Stereotype value);

    @objid ("c368dda7-b2b2-40e2-98b0-5d443425971f")
    MetaclassReference getOwnerReference();

    @objid ("b7d78c63-1d05-4eb5-8dea-bbc04979536c")
    void setOwnerReference(MetaclassReference value);

}
