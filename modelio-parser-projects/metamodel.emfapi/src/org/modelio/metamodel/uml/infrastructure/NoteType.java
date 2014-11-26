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
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("008bb80c-c4be-1fd8-97fe-001ec947cd2a")
public interface NoteType extends ModelElement {
    @objid ("86c9b1d3-36e0-4281-ae56-13648e6465ec")
    ModuleComponent getModule();

    @objid ("eba6b8f2-3950-461f-b04c-874b79719bc4")
    boolean isIsHidden();

    @objid ("2395b181-80e5-49f5-a6c7-7431132447a2")
    void setIsHidden(boolean value);

    @objid ("8e6b92c4-3c7d-4709-ada7-60a5c78e219d")
    String getLabelKey();

    @objid ("75de9fca-81fe-40b4-8a59-8df53037a2ed")
    void setLabelKey(String value);

    @objid ("7093085b-192d-4af6-a380-df81ffde35ff")
    String getMimeType();

    @objid ("7623832a-1ebf-4685-853a-7167afde6832")
    void setMimeType(String value);

    @objid ("4671d793-a351-4eed-9794-ef4ffe8e13d2")
    EList<Note> getElement();

    @objid ("913460a2-be43-48a8-95ad-45e30c629461")
    <T extends Note> List<T> getElement(java.lang.Class<T> filterClass);

    @objid ("96ea6ab9-03f9-4520-9678-e2c2c0ecb8f7")
    Stereotype getOwnerStereotype();

    @objid ("f2f6296d-87cb-4945-9976-fad11ee05d30")
    void setOwnerStereotype(Stereotype value);

    @objid ("31bfc44c-0d27-4090-8e24-03848dcef67d")
    MetaclassReference getOwnerReference();

    @objid ("6e4f5c13-5c78-4f4c-915d-c6d10071e653")
    void setOwnerReference(MetaclassReference value);

}
