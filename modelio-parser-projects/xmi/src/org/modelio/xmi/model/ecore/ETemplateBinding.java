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
                                    

package org.modelio.xmi.model.ecore;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.xmi.reverse.ReverseProperties;

@objid ("5272e161-6544-4dfa-b5cf-87977e2e575f")
public class ETemplateBinding extends EElement {
    @objid ("9861852a-852f-4268-a786-8b6e01f2246d")
    @Override
    public Element createObjingElt() {
        return ReverseProperties.getInstance().getMModelServices().getModelFactory().createTemplateBinding();
    }

    @objid ("2f8a7a64-fccf-459f-afc6-e547997bdf73")
    public ETemplateBinding(org.eclipse.uml2.uml.TemplateBinding element) {
        super(element);
    }

    @objid ("1f471d31-4b38-4a39-b3a8-74089e81e2cd")
    @Override
    public void attach(Element objingElt) {
        Element objOwner = (Element) ReverseProperties.getInstance().getMappedElement(getEcoreElement().getOwner());
                
        if (objOwner instanceof Operation){
            ((TemplateBinding)objingElt).setBoundOperation(((Operation) objOwner));
        }else if (objOwner instanceof NameSpace){
            ((TemplateBinding)objingElt).setBoundElement(((NameSpace) objOwner));
        }else{
            objingElt.delete();
        }
    }

    @objid ("bdbc3947-4a46-4681-b59e-866102932dc0")
    private void setTemplate(Element objingElt) {
        org.eclipse.uml2.uml.TemplateSignature signature = ((org.eclipse.uml2.uml.TemplateBinding) getEcoreElement()).getSignature();
        if (signature != null){
            org.eclipse.uml2.uml.Element template = signature.getTemplate();
            if (template != null){
                Element objTemplate = (Element) ReverseProperties.getInstance().getMappedElement(template);
                if (objTemplate instanceof Operation){
                    ((TemplateBinding) objingElt).setInstanciatedTemplateOperation((Operation) objTemplate);
                }else if (objTemplate instanceof NameSpace){
                    ((TemplateBinding) objingElt).setInstanciatedTemplate((NameSpace) objTemplate);
                }
                
            }
        }
    }

}
