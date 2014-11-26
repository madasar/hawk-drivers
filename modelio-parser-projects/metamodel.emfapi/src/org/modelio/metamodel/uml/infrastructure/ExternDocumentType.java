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
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("0092fefa-c4be-1fd8-97fe-001ec947cd2a")
public interface ExternDocumentType extends ModelElement {
    @objid ("1cb032b7-9ac9-46f1-b30f-f2f395b83488")
    ModuleComponent getModule();

    @objid ("f136ad62-1ab2-415d-981b-90d40a46d9d0")
    boolean isIsHidden();

    @objid ("1473eb50-ba6a-46ed-ac15-f961cf921c1a")
    void setIsHidden(boolean value);

    @objid ("1ea0e269-cda8-4d6b-b495-5fe71fd47c23")
    String getLabelKey();

    @objid ("80f9f2fb-fb9d-4e24-8c40-66d9ab0ac6e3")
    void setLabelKey(String value);

    @objid ("a63bcf87-b983-47de-99f3-04c0a3aeb4b4")
    String getIcon();

    @objid ("3ff06079-d847-41c7-90dd-1f119e7e4862")
    void setIcon(String value);

    @objid ("81ba9806-ccb5-4ba2-8c86-31eae97b6bd7")
    String getImage();

    @objid ("a8d44c48-2c52-42c6-9869-a2cdec7ae491")
    void setImage(String value);

    @objid ("57fa0730-0e9d-499f-b11c-1cc7b1165e1c")
    Stereotype getOwnerStereotype();

    @objid ("4788d324-8034-4bbb-b4f3-1051e2791228")
    void setOwnerStereotype(Stereotype value);

    @objid ("44dc00b4-103f-4b17-93e2-12c628cbc246")
    EList<ExternDocument> getTypedDoc();

    @objid ("4f348d32-5a87-4b0c-9177-3125250d916f")
    <T extends ExternDocument> List<T> getTypedDoc(java.lang.Class<T> filterClass);

    @objid ("1e52dfe4-61f8-4f04-bcc2-b1bdb21276f1")
    MetaclassReference getOwnerReference();

    @objid ("be0f7932-da04-4af6-be29-8052b2840bdd")
    void setOwnerReference(MetaclassReference value);

}
