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

import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.xmi.util.XMIProperties;
import org.modelio.xmi.util.modelermodule.IModelerModuleStereotypes;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2388b0d9-4df1-48fc-a15c-b82ecd8c97f8")
public class OStructuredActivityNode extends OActivityNode {
    @objid ("3549cfa7-e79c-4257-8e51-6ccc40c50f5c")
    private StructuredActivityNode objingElement;

    @Override
    @objid ("967f38c3-031f-4eba-b1a7-b1c60d07784f")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        if (((ModelElement)getObjingElement()).isStereotyped(XMIProperties.modelerModuleName, IModelerModuleStereotypes.UML2SEQUENCENODE))
            return UMLFactory.eINSTANCE.createSequenceNode();
        else
            return UMLFactory.eINSTANCE.createStructuredActivityNode();
    }

    @objid ("e11526d0-f90f-40cf-b529-2d26f1212ad7")
    public OStructuredActivityNode(StructuredActivityNode element) {
        super(element);
        this.objingElement = element;
    }

    @Override
    @objid ("8837d912-4356-49e5-834a-6e85a4a80e98")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        super.attach(ecoreElt);
    }

    @Override
    @objid ("48c31517-6765-45ef-b2de-2f6b9a702a2a")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        setMustIsolate((org.eclipse.uml2.uml.StructuredActivityNode) ecoreElt);
    }

    @objid ("f6d1fb15-a574-4d7e-97c3-11f718df0859")
    private void setMustIsolate(org.eclipse.uml2.uml.StructuredActivityNode node) {
        node.setMustIsolate(this.objingElement.isMustIsolate());
    }

}
