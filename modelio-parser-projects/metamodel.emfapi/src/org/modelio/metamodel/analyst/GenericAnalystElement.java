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
import org.modelio.metamodel.analyst.GenericAnalystContainer;

@objid ("b3e7a343-fe88-4eec-9078-87bfbbaaa3f0")
public interface GenericAnalystElement extends AnalystElement {
    @objid ("287563ca-728b-4aeb-a4d2-1f93b943a89c")
    EList<GenericAnalystElement> getSubElement();

    @objid ("8993c8e5-285a-4279-a048-8344a91f134c")
    <T extends GenericAnalystElement> List<T> getSubElement(java.lang.Class<T> filterClass);

    @objid ("0da08278-1d02-4657-994d-56c1bb6fc652")
    GenericAnalystContainer getOwnerContainer();

    @objid ("4085f87c-0eb9-498a-9300-881f73c8a36d")
    void setOwnerContainer(GenericAnalystContainer value);

    @objid ("fdb86f76-9c0f-4ba7-92cb-750513080b67")
    GenericAnalystElement getParentElement();

    @objid ("7a2f7115-91cc-47a1-8b6a-61745a5ac489")
    void setParentElement(GenericAnalystElement value);

    @objid ("63559d3a-0d8d-4fb6-874f-818f6fcbd8a3")
    GenericAnalystElement getLastElementVersion();

    @objid ("45f6d844-2775-449c-93bb-f57ad76397c5")
    void setLastElementVersion(GenericAnalystElement value);

    @objid ("1d704ab0-37b2-45a0-93eb-89e00dcd9516")
    EList<GenericAnalystElement> getArchivedElementVersion();

    @objid ("4e08ce58-09f6-4a75-bd0d-3ab6db3c1b77")
    <T extends GenericAnalystElement> List<T> getArchivedElementVersion(java.lang.Class<T> filterClass);

}
