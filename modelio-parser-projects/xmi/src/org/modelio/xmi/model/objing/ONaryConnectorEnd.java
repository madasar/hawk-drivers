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
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.NaryConnectorEnd;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.StringConverter;
import org.modelio.xmi.util.XMILogs;



public class ONaryConnectorEnd extends ONaryLinkEnd{

    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        org.eclipse.uml2.uml.Element connector = null;
        
        if (this.objElt.getNaryLink() != null)
            connector = GenerationProperties.getInstance().getMappedElement(this.objElt.getNaryLink());
        
        
        if (connector != null){
            if (connector instanceof org.eclipse.uml2.uml.Connector){
                return UMLFactory.eINSTANCE.createConnectorEnd();            
            }else if (connector instanceof InstanceSpecification){
                return UMLFactory.eINSTANCE.createSlot();
            }
        }
        
        String message = Xmi.I18N.getMessage("logFile.warning.unsupportedExport", 
                this.objElt.getName(), 
                this.objElt.getClass().getSimpleName());
        String  description = Xmi.I18N.getMessage("logFile.warning.unexportedConnector");
        XMILogs xmilogs = XMILogs.getInstance();
        xmilogs.writelnInLog(message);
        //GenerationProperties.getInstance().getReportModel().addError(message, this.objElt, description);
        return null;
    }

  
    public ONaryConnectorEnd(NaryConnectorEnd param) {
        super(param);
        this.objElt = param;
    }

    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        if (ecoreElt != null){
            if (ecoreElt instanceof org.eclipse.uml2.uml.ConnectorEnd)
                attachConnectorEnd((org.eclipse.uml2.uml.ConnectorEnd) ecoreElt);
            else if (ecoreElt instanceof org.eclipse.uml2.uml.Slot)
                attachSlot((org.eclipse.uml2.uml.Slot) ecoreElt);
        }
    }

    @Override
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        
        if (ecoreElt != null){
            if (ecoreElt instanceof org.eclipse.uml2.uml.Slot){
                setLinked((org.eclipse.uml2.uml.Slot) ecoreElt);
                setDefiningFeature((org.eclipse.uml2.uml.Slot) ecoreElt);           
            }else if (ecoreElt instanceof org.eclipse.uml2.uml.ConnectorEnd){
                setIsOrdered((org.eclipse.uml2.uml.ConnectorEnd)ecoreElt);
                setIsUnique((org.eclipse.uml2.uml.ConnectorEnd)ecoreElt);
                setMax((org.eclipse.uml2.uml.ConnectorEnd)ecoreElt);
                setMin((org.eclipse.uml2.uml.ConnectorEnd)ecoreElt);
                setRole((org.eclipse.uml2.uml.ConnectorEnd)ecoreElt);
                setPartWithPort((org.eclipse.uml2.uml.ConnectorEnd)ecoreElt);
                ordered((org.eclipse.uml2.uml.ConnectorEnd) ecoreElt);
            }
        }
    }

    private void attachConnectorEnd(org.eclipse.uml2.uml.ConnectorEnd connectorEnd) {
        org.eclipse.uml2.uml.Element owner = GenerationProperties.getInstance().getMappedElement(this.objElt.getNaryLink());
        if (owner instanceof org.eclipse.uml2.uml.Connector)
            ((org.eclipse.uml2.uml.Connector) owner).getEnds().add(connectorEnd);
        
        org.eclipse.uml2.uml.Element role = GenerationProperties.getInstance().getMappedElement(this.objElt.getSource());
        if (role instanceof org.eclipse.uml2.uml.ConnectableElement)
            connectorEnd.setRole((org.eclipse.uml2.uml.ConnectableElement) role);
    }

    private void attachSlot(org.eclipse.uml2.uml.Slot slot) {
        org.eclipse.uml2.uml.Element owner = GenerationProperties.getInstance().getMappedElement(this.objElt.getNaryLink());
        if (owner instanceof InstanceSpecification)
            ((InstanceSpecification)owner).getSlots().add(slot);
    }

    private void setLinked(org.eclipse.uml2.uml.Slot ecoreElt) {
        org.eclipse.uml2.uml.Element inst = GenerationProperties.getInstance().getMappedElement(this.objElt.getSource());
        
        if ((inst instanceof org.eclipse.uml2.uml.Slot) && (((org.eclipse.uml2.uml.Slot)inst).getValues().size() == 0)){        
        
            org.eclipse.uml2.uml.Slot slot = (org.eclipse.uml2.uml.Slot) inst;
            InstanceValue instanceValue = UMLFactory.eINSTANCE.createInstanceValue();
             org.eclipse.uml2.uml.ValueSpecification result = ecoreElt.createValue(null, null, instanceValue.eClass());
            ((InstanceValue)result).setInstance(slot.getOwningInstance());
            slot.getValues().add(result);
        
            if (AbstractObjingModelNavigation.isNotNullOrEmpty(this.objElt.getName()))
                ((InstanceValue)result).setName(this.objElt.getName());
        
        }
        
        ObjingEAnnotation.setOwner(ecoreElt, String.valueOf(this.objElt.getSource().getUuid().toString()));
    }

    private void ordered(org.eclipse.uml2.uml.ConnectorEnd ecoreElt) {
        org.eclipse.uml2.uml.Connector connector = (org.eclipse.uml2.uml.Connector) GenerationProperties.getInstance().getMappedElement(this.objElt.getSource());
        if ((connector.getKind() != null) 
                &&(connector.getKind().equals(org.eclipse.uml2.uml.ConnectorKind.DELEGATION_LITERAL))){
           
                connector.getEnds().remove(ecoreElt);                
                connector.getEnds().add(connector.getEnds().size(), ecoreElt);
           
        }
    }

    private void setDefiningFeature(final org.eclipse.uml2.uml.Slot ecoreElt) {
        Instance instanceOwner = this.objElt.getSource();
        NaryLink link = this.objElt.getNaryLink();
        if ((instanceOwner != null ) && (link != null)){
            NaryAssociation assoc = link.getModel();
            NameSpace namespace = instanceOwner.getBase();
            if ((assoc != null ) && (namespace != null)){
                for (NaryAssociationEnd assocEnd : assoc.getNaryEnd()){
                    if (assocEnd.getOwner().equals(namespace)){
                        org.eclipse.uml2.uml.Element ecoreProp =  GenerationProperties.getInstance().getMappedElement(assocEnd);
                        if (ecoreProp instanceof org.eclipse.uml2.uml.StructuralFeature){
                            ecoreElt.setDefiningFeature((org.eclipse.uml2.uml.StructuralFeature)ecoreProp);
                        }
                    }
                }
            }
        }
    }


    private void setIsOrdered(org.eclipse.uml2.uml.ConnectorEnd ecoreElt) {
        ecoreElt.setIsOrdered(this.objElt.isIsOrdered());
    }

    private void setIsUnique(org.eclipse.uml2.uml.ConnectorEnd ecoreElt) {
        ecoreElt.setIsUnique(this.objElt.isIsUnique());
    }

    private void setMin(org.eclipse.uml2.uml.ConnectorEnd ecoreElt) {
        String objingMultMin = this.objElt.getMultiplicityMin();
        
        // If objingMultMin is "" then we don't set a lower multiplicity for the
        // UML2 element.
        if (!"".equals(objingMultMin)) {
            if (AbstractObjingModelNavigation.OBJING_UNLIMITED_VALUE
                    .equals(objingMultMin))
                ecoreElt.setLower(org.eclipse.uml2.uml.LiteralUnlimitedNatural.UNLIMITED);
            else {
                StringConverter.setFilterEnabled(true);
                Integer min = StringConverter.getInteger(objingMultMin);
                if (min != null)
                    ecoreElt.setLower(min);
                else {
                    XMILogs logs = XMILogs.getInstance();
                    String contextualMsg =  Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.multiplicityMin",
                            "Connector end");
        
                    String message =  Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.defaultMsg",
                            "String", "\"" + objingMultMin + "\"", "Integer",
                            contextualMsg);
                    logs.writelnInLog(message);
                    //GenerationProperties.getInstance().getReportModel().addInfo(message, this.objElt);
                }
            }
        }
    }

    private void setMax(org.eclipse.uml2.uml.ConnectorEnd ecoreElt) {
        String objingMultMax = this.objElt.getMultiplicityMax();
        
        // If objingMultMax is "" then we don't set an upper multiplicity for
        // the UML2 element.
        if (!"".equals(objingMultMax)) {
            if (AbstractObjingModelNavigation.OBJING_UNLIMITED_VALUE
                    .equals(objingMultMax))
                ecoreElt.setUpper(org.eclipse.uml2.uml.LiteralUnlimitedNatural.UNLIMITED);
            else {
                StringConverter.setFilterEnabled(true);
                Integer max = StringConverter.getInteger(objingMultMax);
                if (max != null)
                    ecoreElt.setUpper(max);
                else {
                    XMILogs logs = XMILogs.getInstance();
                    String contextualMsg =  Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.multiplicityMax",
                            "Connector end");
        
                    String message = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.defaultMsg",
                            "String", "\"" + objingMultMax + "\"", "Integer",
                            contextualMsg);
                    logs.writelnInLog(message);
                    //GenerationProperties.getInstance().getReportModel().addInfo(message, this.objElt);
                }
            }
        }
    }

    private void setRole(org.eclipse.uml2.uml.ConnectorEnd ecoreElt) {
        org.eclipse.uml2.uml.Element role = GenerationProperties.getInstance().getMappedElement(this.objElt.getSource());
        if (role instanceof org.eclipse.uml2.uml.ConnectableElement)
            ecoreElt.setRole((org.eclipse.uml2.uml.ConnectableElement) role);
    }

    private void setPartWithPort(org.eclipse.uml2.uml.ConnectorEnd ecoreElt) {
        MObject linked = this.objElt.getCompositionOwner();
        if (linked instanceof Port){
            MObject  portOwner = linked.getCompositionOwner();
            org.eclipse.uml2.uml.Element part = GenerationProperties.getInstance().getMappedElement(portOwner);
            if (part instanceof Property){
                ecoreElt.setPartWithPort((Property) part);
            }
        
        }
    }

}
