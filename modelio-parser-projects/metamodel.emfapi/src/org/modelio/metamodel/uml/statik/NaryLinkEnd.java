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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("00749ece-17e8-10a1-88a0-001ec947cd2a")
public interface NaryLinkEnd extends ModelElement {
    @objid ("36ddfabd-baf3-4ccf-811c-ae7cd2ffccc0")
    boolean isIsOrdered();

    @objid ("ddca75ff-13ca-489c-9905-7b827a3d949b")
    void setIsOrdered(boolean value);

    @objid ("b2f0e8c7-db01-4bc4-b089-2142d3045d92")
    boolean isIsUnique();

    @objid ("96a2ecb3-b387-4c5b-9591-11d88e7b7387")
    void setIsUnique(boolean value);

    @objid ("0e018725-a545-441c-a98e-db75bf68ff61")
    String getMultiplicityMax();

    @objid ("91ada4f4-94fe-4e5e-8103-1bdea97cc601")
    void setMultiplicityMax(String value);

    @objid ("dffd92f4-00e6-4fe5-a89e-787962c416dd")
    String getMultiplicityMin();

    @objid ("9277bc94-a031-4918-aa28-11f023ac7b08")
    void setMultiplicityMin(String value);

    @objid ("fcd1218e-6f3b-43e4-9366-83901b616b4a")
    Instance getSource();

    @objid ("cd5ff3bd-2564-476b-8b76-054c60bec200")
    void setSource(Instance value);

    @objid ("b1135652-7ae9-43a6-92c4-fe27638c6e6c")
    NaryLink getNaryLink();

    @objid ("41ba8b4e-c51a-4f54-b290-496183bf13b3")
    void setNaryLink(NaryLink value);

    @objid ("6c955c86-6e04-4da7-bda7-b7c54d8adc8b")
    RequiredInterface getConsumer();

    @objid ("384627d0-b81c-44cd-866a-4d419b0f3a98")
    void setConsumer(RequiredInterface value);

    @objid ("9346a9cf-8d62-4f25-aa5f-3fdb0d252ef1")
    ProvidedInterface getProvider();

    @objid ("ef4d9c7a-25f2-4c22-9c03-54578315b824")
    void setProvider(ProvidedInterface value);

}
