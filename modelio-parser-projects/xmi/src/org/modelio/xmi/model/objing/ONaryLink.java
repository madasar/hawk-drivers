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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.NotFoundException;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.XMILogs;


public class ONaryLink extends OModelElement {

    private NaryLink objingElement = null;

    private Element linkOwner = null;

    private MObject connectorOwner = null;


    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        if (this.connectorOwner != null ){
            return UMLFactory.eINSTANCE.createConnector();
        }else if (this.linkOwner != null){
            return UMLFactory.eINSTANCE.createInstanceSpecification();
        }
        
        XMILogs xmilogs = XMILogs.getInstance();
        xmilogs.writelnInLog(Xmi.I18N.getMessage("logFile.warning.unsupportedExport", 
                this.objingElement.getName(), 
                this.objingElement.getClass().getName()));
        return null;
    }


    public ONaryLink(NaryLink element) {
        super(element);
        this.objingElement = element;
        this.linkOwner = AbstractObjingModelNavigation.getNaryLinkOwner(element);
        this.connectorOwner = AbstractObjingModelNavigation.getNaryConnectorOwner(element);
    }


    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        if (ecoreElt != null){
            if (ecoreElt instanceof org.eclipse.uml2.uml.Connector){
                attachConnector((org.eclipse.uml2.uml.Connector)ecoreElt);
            }else if (ecoreElt instanceof InstanceSpecification){
                attachInstanceSpecification((InstanceSpecification)ecoreElt);
            }
        }
    }


    @Override
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        if (ecoreElt instanceof org.eclipse.uml2.uml.Connector){
            setConnectorProperties((org.eclipse.uml2.uml.Connector) ecoreElt);
        }else if (ecoreElt instanceof InstanceSpecification){
            setName((InstanceSpecification)ecoreElt);
            setBase((InstanceSpecification)ecoreElt);
            if (GenerationProperties.getInstance().isRoundtripEnabled())
                ObjingEAnnotation.isLink(ecoreElt);
        }
    }


    private void setName(InstanceSpecification connector) {
        String eltName = this.objingElement.getName();
        if (AbstractObjingModelNavigation.isNotNullOrEmpty(eltName))
            connector.setName(eltName);
    }


    private void setBase(InstanceSpecification connector) {
        NaryAssociation base = this.objingElement.getModel();
        
        if (base != null){
            org.eclipse.uml2.uml.Element type = GenerationProperties.getInstance().getMappedElement(base);
            if (type instanceof org.eclipse.uml2.uml.Classifier)
                connector.getClassifiers().add( (org.eclipse.uml2.uml.Classifier) type);
        }
    }


    private void attachConnector(org.eclipse.uml2.uml.Connector ecoreElt) {
        org.eclipse.uml2.uml.Element ecoreOwner =  GenerationProperties.getInstance().getMappedElement(this.connectorOwner);
        if (ecoreOwner != null) {
            // Components and Nodes are handled as Class
            // (they inherit from Class)
        
            // Class, Component, Node
            if (ecoreOwner instanceof org.eclipse.uml2.uml.StructuredClassifier) {
                org.eclipse.uml2.uml.StructuredClassifier ownerIsClass = (org.eclipse.uml2.uml.StructuredClassifier) ecoreOwner;
                ownerIsClass.getOwnedConnectors().add(ecoreElt);
            } else {
                ecoreElt.destroy();
                throw new NotFoundException("Owner Class ("
                        + ecoreOwner.getClass().getSimpleName()
                        + ") Not Found");
            }
        }
    }

  
    private void attachInstanceSpecification(InstanceSpecification ecoreElt) {
        org.eclipse.uml2.uml.Element ecoreOwner = GenerationProperties.getInstance().getMappedElement(this.linkOwner);
        
        
        if (ecoreOwner != null) {
            if (ecoreOwner instanceof org.eclipse.uml2.uml.Package) {
                org.eclipse.uml2.uml.Package ownerIsPkg = (org.eclipse.uml2.uml.Package) ecoreOwner;
                ownerIsPkg.getPackagedElements().add(ecoreElt);
        
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Component) {
                org.eclipse.uml2.uml.Component ownerIsCmpnt = (org.eclipse.uml2.uml.Component) ecoreOwner;
                ownerIsCmpnt.getPackagedElements().add(ecoreElt);
            }else{
                XMILogs logs = XMILogs.getInstance();
                String message = Xmi.I18N.getMessage(
                        "logFile.exception.stringConverter.haveNotOwner",
                        ecoreElt.getClass().toString());
                logs.writelnInLog(message);
//                GenerationProperties.getInstance().getReportModel().addWarning(message, this.objingElement);
            }
        }
    }

    private void setConnectorProperties(org.eclipse.uml2.uml.Connector ecoreElt) {
        setBase(ecoreElt);
        setKind(ecoreElt);
    }


    private void setBase(org.eclipse.uml2.uml.Connector ecoreElt) {
        Element temp = this.objingElement.getModel();
        if (temp != null){
            org.eclipse.uml2.uml.Element ecoreType = GenerationProperties.getInstance().getMappedElement(temp);
            if (ecoreType instanceof org.eclipse.uml2.uml.Association)
                ecoreElt.setType((org.eclipse.uml2.uml.Association) ecoreType);
        
        }
    }


    private void setKind(org.eclipse.uml2.uml.Connector ecoreElt) {
         ecoreElt.setKind(org.eclipse.uml2.uml.ConnectorKind.DELEGATION_LITERAL);
    }

}
