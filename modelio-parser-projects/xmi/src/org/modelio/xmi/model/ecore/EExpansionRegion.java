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

import org.modelio.api.model.IModelingSession;
import org.modelio.api.model.IUmlModel;
import org.modelio.api.modelio.Modelio;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.util.XMIProperties;
import org.modelio.xmi.util.modelermodule.IModelerModuleTagTypes;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("efbb2549-baa0-4451-bdf9-3e164680df8e")
public class EExpansionRegion extends EActivityNode {
    @objid ("711a6e6a-78c8-444b-a70c-5e45a89b0834")
    private org.eclipse.uml2.uml.ExpansionRegion ecoreElement = null;
    
    private IMModelServices mmServices = ReverseProperties.getInstance().getMModelServices();

    @objid ("a5f137b8-8438-412a-b629-eda039109305")
    @Override
    public Element createObjingElt() {
        return  this.mmServices.getModelFactory()
        .createExpansionRegion();
    }

    @objid ("b599def2-8dcb-4732-a69d-40d2c44dd247")
    public EExpansionRegion(org.eclipse.uml2.uml.ExpansionRegion element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("6a6f756a-836a-43f5-ad76-31de4cc7ada1")
    @Override
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setMode((StructuredActivityNode) objingElt);
    }

    @objid ("5949b51f-c81e-4883-9f2e-6cea7edbab27")
    private void setMode(StructuredActivityNode objingElt) {
        String mode =  this.ecoreElement.getMode().getName();
        
        if ((mode != null) && (!mode.equals("")))
            try{               
                TaggedValue objTag = this.mmServices.getModelFactory().createTaggedValue();        
                objTag.setAnnoted(objingElt);
                objTag.setDefinition(this.mmServices.getTagType(XMIProperties.modelerModuleName, IModelerModuleTagTypes.UML2EXPANSIONREGION_MODE,
                        objingElt.getMClass()));
                TagParameter value = this.mmServices.getModelFactory().createTagParameter(mode, objTag);
                objTag.getActual().add(value);
            }catch(Exception e){
                Xmi.LOG.error(e);
            }
    }

}
