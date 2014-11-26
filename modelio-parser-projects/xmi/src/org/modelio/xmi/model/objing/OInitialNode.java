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
                                    

package org.modelio.xmi.model.objing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.behavior.activityModel.InitialNode;

@objid ("e245b0c4-f441-4ad9-b5c2-1ba86a2f4b3e")
public class OInitialNode extends OActivityNode {
    @Override
    @objid ("6e1921a9-07ef-47ee-8fed-eb8597626204")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        return UMLFactory.eINSTANCE.createInitialNode();
    }

    @objid ("51e41f08-bc6e-4de4-b7ac-3a065a3166a2")
    public OInitialNode(InitialNode element) {
        super(element);
    }

    @Override
    @objid ("7f6eb275-1ecb-4f73-b001-9affe9126338")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        super.attach(ecoreElt);
    }

    @Override
    @objid ("1cf02213-7a55-47ef-8d73-98f9cf3333d9")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
    }

}
