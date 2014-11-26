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


import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.NaryConnector;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.NotFoundException;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.XMILogs;


/**
 * This class manages the export of NaryConnector elements
 * @author ebrosse
 */

public class ONaryConnector extends ONaryLink {

    private NaryConnector objElt = null;

  
    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        MObject root = AbstractObjingModelNavigation.getNaryConnectorOwner(this.objElt);
        if (root != null){           
            return UMLFactory.eINSTANCE.createConnector();           
        }
        
        XMILogs xmilogs = XMILogs.getInstance();
        String message = Xmi.I18N.getMessage("logFile.warning.unsupportedExport", 
                this.objElt.getName(), 
                this.objElt.getClass().getSimpleName());
        String  description = Xmi.I18N.getMessage("logFile.warning.notOwner",
                this.objElt.getName());
        xmilogs.writelnInLog(message);
        //GenerationProperties.getInstance().getReportModel().addError(message, this.objElt, description);
        return null;
    }

    /**
     * Constructor
     * @param param : the exported Modelio Connector
     */

    public ONaryConnector(final NaryConnector param) {
        super(param);                
        this.objElt = param;
    }


    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        if ((ecoreElt != null) && (ecoreElt instanceof org.eclipse.uml2.uml.Connector)){
            attachConnector(ecoreElt);
        }
    }


    private void attachConnector(org.eclipse.uml2.uml.Element ecoreElt) {
        org.eclipse.uml2.uml.Element ecoreOwner = null;
        for (NaryLinkEnd linkEnd : this.objElt.getNaryLinkEnd()) {   
            if (ecoreOwner == null) {
                MObject objOwner = linkEnd.getNaryLink().getCompositionOwner();
                ecoreOwner =  GenerationProperties.getInstance().getMappedElement(objOwner);
                if (ecoreOwner != null) {
                    // Components and Nodes are handled as Class
                    // (they inherit from Class)
        
                    // Class, Component, Node
                    if (ecoreOwner instanceof org.eclipse.uml2.uml.StructuredClassifier) {
                        org.eclipse.uml2.uml.StructuredClassifier ownerIsClass = (org.eclipse.uml2.uml.StructuredClassifier) ecoreOwner;
                        ownerIsClass.getOwnedConnectors().add((org.eclipse.uml2.uml.Connector)ecoreElt);
                    } else if (objOwner instanceof BindableInstance) {
        
                        org.eclipse.uml2.uml.StructuredClassifier ownerIsClass = (org.eclipse.uml2.uml.StructuredClassifier)  GenerationProperties.getInstance().getMappedElement(AbstractObjingModelNavigation
                                .getBindableInstanceOwner((BindableInstance)objOwner));
                        ownerIsClass.getOwnedConnectors().add((org.eclipse.uml2.uml.Connector)ecoreElt);
                    } else {
                        ecoreElt.destroy();
                        throw new NotFoundException("Owner Class ("
                                + ecoreOwner.getClass().getSimpleName()
                                + ") Not Found");
                    }
                }
            }
        }
    }


    @Override
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        if (ecoreElt != null){
            super.setProperties(ecoreElt);
        
            if (GenerationProperties.getInstance().isRoundtripEnabled()
                    && (ecoreElt instanceof InstanceSpecification)
                    && (this.objElt instanceof Connector))
                ObjingEAnnotation.setConnector(ecoreElt, true);
        }
    }

}
