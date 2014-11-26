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

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.ModelUtils;
import org.modelio.xmi.util.NotFoundException;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.StringConverter;
import org.modelio.xmi.util.XMILogs;
import org.modelio.xmi.util.XMIProperties;
import org.modelio.xmi.util.modelermodule.IModelerModuleStereotypes;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class manages the export of AssociationEnd elements
 * @author ebrosse
 */
@objid ("39b0857a-26a7-47c7-8494-ccdbe9882543")
public class OAssociationEnd extends OFeature {
    @objid ("d12d17a9-7eca-4e87-8906-d45c59718c15")
    private boolean isLinkedToClassAssociation;

    @objid ("d3d6c03d-7cdb-42fb-814c-1e12d500d7d3")
    private AssociationEnd objingElement = null;

    @objid ("8a35cd63-5157-43ae-93fc-c45265723b0a")
    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        Association assoc = this.objingElement.getAssociation();
        
        if (! AbstractObjingModelNavigation.isOwnedByActor(assoc)) {
            if (this.objingElement.isStereotyped(XMIProperties.modelerModuleName, IModelerModuleStereotypes.UML2EXTENSIONEND)){
                return  UMLFactory.eINSTANCE.createExtensionEnd();
            }
            return UMLFactory.eINSTANCE.createProperty();
        
        }else{ 
            String message = Xmi.I18N.getMessage("error.export.assocBetweenActors",
                    assoc.getName());
            XMILogs.getInstance().writelnInLog(message);
        
            GenerationProperties genProp = GenerationProperties.getInstance();
          //  genProp.getReportModel().addWarning(message, assoc);
        }
        return null;
    }

    /**
     * Constructor of OAssociationEnd.
     * It takes the exported Modelio AssociationEnd as parameter
     * @param element : the exported AssociationEnd
     */
    @objid ("d1d36f06-cad9-4a90-9e14-bec68e3cd9f7")
    public OAssociationEnd(final AssociationEnd element) {
        super(element);
        this.objingElement = element;
        if (AbstractObjingModelNavigation.isIsClassAssociation(this.objingElement))
            this.isLinkedToClassAssociation = true;
        else
            this.isLinkedToClassAssociation = false;
    }

    @objid ("547d5682-c42f-42ff-a72c-895206773f60")
    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        if (!this.isLinkedToClassAssociation)
            linkEcoreProperty((Property) ecoreElt);
        // If the Class representing the current ClassAssociation represents
        // other ClassAssociations, the ClassAssociation is not valid for export:
        else if (AbstractObjingModelNavigation.isRepresentedByAUniqueClass(this.objingElement.getAssociation()
                .getLinkToClass()))
            linkEcorePropertyLinkedToAC((Property) ecoreElt);
        else
            ecoreElt.destroy();
    }

    @objid ("98756edd-9b90-473a-8bfc-bb6771d35f6a")
    @Override
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        Property ecoreProp = (Property) ecoreElt;
        // setAssociationName(); -> done in OAssociation class.
        
        setType(ecoreProp);
        setQuantity(ecoreProp);
        setAssociationKind(ecoreProp);
        setReadOnly(ecoreProp);
        setNavigeable(ecoreProp);
        // setNavigable(); -> the navigation is particular in UML2: When a
        // property is owned by
        // an association, it represents a non-navigable end of the association.
        // In this case, the
        // property does not appear in the namespace of any of the associated
        // classifiers. When
        // a property at an end of an association is owned by one of the
        // associated classifiers,
        // it represents a navigable end of the association. In this case, the
        // property is also an
        // attribute of the associated classifier. Only binary associations may
        // have navigable ends.
        
        if (GenerationProperties.getInstance().isRoundtripEnabled()){
            setAccessModeEAnnotation(ecoreProp); 
            setAbstractEAnnotation(ecoreElt);
        }
        
        setStatic(ecoreProp);
        setOrdered(ecoreProp);
        setUnique(ecoreProp);
    }

    @objid ("2e333b5d-1e0e-4538-b6e7-58210288b6b0")
    private void setQuantity(Property ecoreElt) {
        setMin(ecoreElt);
        setMax(ecoreElt);
    }

    @objid ("42c0d571-268e-4044-8435-c441dd4fcc5f")
    private void setMin(Property ecoreProp) {
        String objingMultMin = this.objingElement.getMultiplicityMin();
        
        // If objingMultMin is "" then we don't set a lower multiplicity for the
        // UML2 element.
        if (!"".equals(objingMultMin)) {
            if (AbstractObjingModelNavigation.OBJING_UNLIMITED_VALUE
                    .equals(objingMultMin))
                ecoreProp.setLower(org.eclipse.uml2.uml.LiteralUnlimitedNatural.UNLIMITED);
            else {
                StringConverter.setFilterEnabled(true);
                Integer min = StringConverter.getInteger(objingMultMin);
                if (min != null){ 
                    if (min != 1)
                        ecoreProp.setLower(min);
                }else {
                    XMILogs logs = XMILogs.getInstance();
        
                    String contextualMsg = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.multiplicityMinWithName",
                            "AssociationEnd", ecoreProp.getName());
        
                    String message = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.defaultMsg",
                            "String", "\"" + objingMultMin + "\"", "Integer",
                            contextualMsg);
                    logs.writelnInLog(message);
                    //GenerationProperties.getInstance().getReportModel().addInfo(message, this.objingElement);
                }
            }
        }
    }

    @objid ("259602d5-08e4-4e96-b0ff-ea39e305cc7e")
    private void setMax(Property ecoreProp) {
        String objingMultMax = this.objingElement.getMultiplicityMax();
        
        // If objingMultMax is "" then we don't set an upper multiplicity for
        // the UML2 element.
        if (!"".equals(objingMultMax)) {
            if (AbstractObjingModelNavigation.OBJING_UNLIMITED_VALUE
                    .equals(objingMultMax))
                ecoreProp.setUpper(org.eclipse.uml2.uml.LiteralUnlimitedNatural.UNLIMITED);
            else {
                StringConverter.setFilterEnabled(true);
                Integer max = StringConverter.getInteger(objingMultMax);
                if (max != null){ 
                    if (max != 1)
                        ecoreProp.setUpper(max);
                }else {
                    XMILogs logs = XMILogs.getInstance();
                    String contextualMsg = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.multiplicityMaxWithName",
                            "AssociationEnd",ecoreProp.getName());
        
                    String message = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.defaultMsg",
                            "String", "\"" + objingMultMax + "\"", "Integer",
                            contextualMsg);
                    logs.writelnInLog(message);
        
                    //GenerationProperties.getInstance().getReportModel().addInfo(message, this.objingElement);
                }
            }
        }
    }

    @objid ("1b5a59aa-50a7-4016-8046-3f542e1798d3")
    private void setAssociationKind(Property ecoreProp) {
        switch (this.objingElement.getAggregation()) {
        case KINDISASSOCIATION:
            ecoreProp.setAggregation(org.eclipse.uml2.uml.AggregationKind.NONE_LITERAL);
            break;
        case KINDISAGGREGATION:
            ecoreProp.setAggregation(org.eclipse.uml2.uml.AggregationKind.SHARED_LITERAL);
            break;
        case KINDISCOMPOSITION:
            ecoreProp.setAggregation(org.eclipse.uml2.uml.AggregationKind.COMPOSITE_LITERAL);
            break;
        default:
            break;
        }
    }

    @objid ("b9ce8eba-a54a-4777-88f8-f7c1306544cb")
    private void setAccessModeEAnnotation(Property ecoreProp) {
        switch (this.objingElement.getChangeable()) {
        case READ:
            ObjingEAnnotation.setAccessMode(ecoreProp,
                    ObjingEAnnotation.READ_VALUE);
            break;
        case WRITE:
            ObjingEAnnotation.setAccessMode(ecoreProp,
                    ObjingEAnnotation.WRITE_VALUE);
            break;
        case READWRITE:
            ObjingEAnnotation.setAccessMode(ecoreProp,
                    ObjingEAnnotation.READ_WRITE_VALUE);
            break;
        case ACCESNONE:
            ObjingEAnnotation.setAccessMode(ecoreProp,
                    ObjingEAnnotation.ACCESS_NONE_VALUE);
            break;
        default:
            break;
        }
    }

    @objid ("128d153f-e012-4909-84fa-271068264a06")
    private void setAbstractEAnnotation(final org.eclipse.uml2.uml.Element ecoreElt) {
        ObjingEAnnotation.setAbstract(ecoreElt, ((Feature)getObjingElement()).isIsAbstract());
    }

    @objid ("5c0a1eff-232b-4106-8770-3a805565ea83")
    private void setStatic(Property ecoreProp) {
        ecoreProp.setIsStatic(this.objingElement.isIsClass());
    }

    @objid ("32b75935-9c92-4b17-a3b2-b808eeb79dfb")
    private void setOrdered(Property ecoreProp) {
        ecoreProp.setIsOrdered(this.objingElement.isIsOrdered());
    }

    @objid ("d113f182-0eaa-42ea-88a4-dc7cd673da9e")
    private void setUnique(Property ecoreProp) {
        if (this.objingElement.isIsUnique())
            ecoreProp.setIsUnique(true);
    }

    @objid ("5cb8f4ed-17c9-4e3d-922a-a3ee93dcb160")
    private void linkEcoreProperty(Property ecoreProperty) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        
        // Link to the Ecore org.eclipse.uml2.uml.Association:
        Association objingAssoc = this. objingElement.getAssociation();
        org.eclipse.uml2.uml.Association ecoreAssoc = (org.eclipse.uml2.uml.Association) genProp.getMappedElement(objingAssoc);
        
        if (ecoreAssoc != null) {
            // Associates the ecore org.eclipse.uml2.uml.Association to the Property:
            ecoreProperty.setAssociation(ecoreAssoc);
        
            // If the role is navigable: the property is owned by the classifier
            // (the ecore classifier must have already been created => if not:
            // call on the visitor on it).
        
            if (ModelUtils.isOwnedByClassifier(this.objingElement)){
                attachClassifierEnd(ecoreProperty, ecoreAssoc);
            }else{
                if (this.objingElement.isNavigable()) {   
                    attachNavigableEnd(ecoreProperty, ecoreAssoc, this.objingElement); 
                } else {   
        
                    // If the role is not navigable: the property is owned by the
                    // association (if the ecore association has not been created
                    // yet, the ownership relation will be handled during the visit
                    // of the association).
                    //                        ecoreProperty.setIsNavigable(false);  
                    ecoreProperty.setIsNavigable(this.objingElement.isNavigable()); 
                    // Sets the org.eclipse.uml2.uml.Association as owner of the Property:
                    if (!ecoreAssoc.getOwnedEnds().contains(ecoreProperty)){
                        ecoreAssoc.getOwnedEnds().add(ecoreProperty);                    
                    }
                }
            }
        }
    }

    @objid ("623bbce6-8454-4b8c-8a1e-c2c5cd9eb6ef")
    private void linkEcorePropertyLinkedToAC(Property ecoreProperty) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        // Link to the Ecore org.eclipse.uml2.uml.AssociationClass if it has already been created:
        Association objingAssoc = this.objingElement.getAssociation();
        org.eclipse.uml2.uml.AssociationClass ecoreAssocClass = (org.eclipse.uml2.uml.AssociationClass) genProp
                .getMappedElement(objingAssoc);
        
        if (ecoreAssocClass != null) {
            // Associates the ecore org.eclipse.uml2.uml.AssociationClass to the Property:
            ecoreProperty.setAssociation(ecoreAssocClass);
        
            // If the role is navigable: the property is owned by the classifier
            // (the ecore classifier must
            // have already been created => if not: call on the visitor on it).
            if (this.objingElement.isNavigable()) {
                attachNavigableEndLinkedToAC(ecoreProperty);
            } else {
                // If the role is not navigable: the property is owned by the
                // org.eclipse.uml2.uml.AssociationClass (if the ecore org.eclipse.uml2.uml.AssociationClass has not been
                // created yet, the ownership relation will be handled during
                // the visit of the org.eclipse.uml2.uml.AssociationClass).
                ecoreProperty.setIsNavigable(this.objingElement.isNavigable());
                //                        ecoreProperty.setIsNavigable(false);
                // Sets the org.eclipse.uml2.uml.Association as owner of the Property:
                if (!ecoreAssocClass.getOwnedEnds().contains(ecoreProperty))
                    ecoreAssocClass.getOwnedEnds().add(ecoreProperty);
        
            }
        }
    }

    @objid ("20687905-bdcf-45bc-a633-7cb70318c44a")
    private void setType(Property ecoreProperty) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        
        // Case of a binary association: the type of the current Property
        // is given by the opposite org.eclipse.uml2.uml.Classifier
        AssociationEnd oppositeEnd = this.objingElement.getOpposite();
        Classifier owner = oppositeEnd.getOwner();
        if (owner != null){
        
            org.eclipse.uml2.uml.Type ecorePropertyType =  (org.eclipse.uml2.uml.Type) genProp.getMappedElement(owner);
        
            // org.eclipse.uml2.uml.Types the Property with the org.eclipse.uml2.uml.Classifier:
            if (ecorePropertyType != null)
                ecoreProperty.setType(ecorePropertyType);
        
        }
    }

    @objid ("d3a2ec24-1ebc-4d69-9485-674bb55e2ac5")
    private void attachNavigableEnd(Property ecoreProperty, org.eclipse.uml2.uml.Association ecoreAssoc, AssociationEnd objAssocEnd) {
        ecoreProperty.setIsNavigable(objAssocEnd.isNavigable());
        
        ecoreAssoc.getMemberEnds().add(ecoreProperty);
        
        Classifier objingOwner = objAssocEnd.getOwner();
        org.eclipse.uml2.uml.Element ecoreOwner = GenerationProperties.getInstance().getMappedElement(objingOwner);
        
        if (ecoreOwner != null) {
            // Link to its owner org.eclipse.uml2.uml.Classifier:
            // Class, Component, Node
            if (ecoreOwner instanceof org.eclipse.uml2.uml.StructuredClassifier) {
                org.eclipse.uml2.uml.StructuredClassifier ownerIsSC = (org.eclipse.uml2.uml.StructuredClassifier) ecoreOwner;
                ownerIsSC.getOwnedAttributes().add(ecoreProperty);
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Interface) {// org.eclipse.uml2.uml.Interface
                org.eclipse.uml2.uml.Interface ownerIsInterface = (org.eclipse.uml2.uml.Interface) ecoreOwner;
                ownerIsInterface.getOwnedAttributes().add(ecoreProperty);
            } else if (ecoreOwner instanceof  org.eclipse.uml2.uml.Signal) {//  org.eclipse.uml2.uml.Signal
                org.eclipse.uml2.uml.Signal ownerIsSignal =  (org.eclipse.uml2.uml.Signal) ecoreOwner;
                ownerIsSignal.getOwnedAttributes().add(ecoreProperty);
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.UseCase) {// org.eclipse.uml2.uml.UseCase
                org.eclipse.uml2.uml.UseCase ownerIsUseCase = (org.eclipse.uml2.uml.UseCase) ecoreOwner;
                EList<Property> attributes = ownerIsUseCase.getAttributes();
                try {
                    if (!attributes.contains(ecoreProperty))
                        attributes.add(ecoreProperty);
                } catch (UnsupportedOperationException e) {
                    ecoreAssoc.getOwnedEnds().add(ecoreProperty);
                }
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Actor) {// org.eclipse.uml2.uml.Actor
                ecoreAssoc.getOwnedEnds().add(ecoreProperty);
        
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.DataType) {// org.eclipse.uml2.uml.DataType
                org.eclipse.uml2.uml.DataType ownerIsDataType = (org.eclipse.uml2.uml.DataType) ecoreOwner;
                EList<Property> attributes = ownerIsDataType.getOwnedAttributes();
                if (!attributes.contains(ecoreProperty))
                    attributes.add(ecoreProperty);
        
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Classifier) {
                org.eclipse.uml2.uml.Classifier ownerIsClassifier =  (org.eclipse.uml2.uml.Classifier) ecoreOwner;
                try {
                    ownerIsClassifier.getAttributes().add(ecoreProperty);
                } catch (UnsupportedOperationException e) {
                    Xmi.LOG.error(e);
                }
            } else {
                ecoreProperty.destroy();
                throw new NotFoundException("Owner Class (" + ecoreOwner.getClass().getSimpleName() + ") Not Found");
            }
        }
    }

    @objid ("b325ae57-f51b-4208-a958-c2a53f856092")
    private void attachNavigableEndLinkedToAC(Property ecoreProperty) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        ecoreProperty.setIsNavigable(this.objingElement.isNavigable());
        
        Classifier objingOwner = this.objingElement.getOwner();
        org.eclipse.uml2.uml.Element ecoreOwner = genProp.getMappedElement(objingOwner);
        
        if (ecoreOwner != null) {
            // Link to its owner org.eclipse.uml2.uml.Classifier:
            if (ecoreOwner instanceof org.eclipse.uml2.uml.StructuredClassifier) {
                org.eclipse.uml2.uml.StructuredClassifier ownerIsSC = (org.eclipse.uml2.uml.StructuredClassifier) ecoreOwner;
                ownerIsSC.getOwnedAttributes().add(ecoreProperty);
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Interface) {
                org.eclipse.uml2.uml.Interface ownerIsInterface = (org.eclipse.uml2.uml.Interface) ecoreOwner;
                ownerIsInterface.getOwnedAttributes().add(ecoreProperty);
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.DataType) {
                org.eclipse.uml2.uml.DataType ownerIsDataType = (org.eclipse.uml2.uml.DataType) ecoreOwner;
                ownerIsDataType.getOwnedAttributes().add(ecoreProperty);
            } else if (ecoreOwner instanceof  org.eclipse.uml2.uml.Signal) {
                org.eclipse.uml2.uml.Signal ownerIsSignal =  (org.eclipse.uml2.uml.Signal) ecoreOwner;
                ownerIsSignal.getOwnedAttributes().add(ecoreProperty);
            }
            else {
                ecoreProperty.destroy();
                throw new NotFoundException("Owner Class ("
                        + ecoreOwner.getClass().getSimpleName() + ") Not Found");
            }
        }
    }

    @objid ("05bd4013-eaef-4e95-bdc2-2ba1cb5d2c85")
    private void setReadOnly(Property ecoreProp) {
        switch (this.objingElement.getChangeable()) {
        case READ:
            if (this.objingElement.isNavigable())
                ecoreProp.setIsReadOnly(true);
            break;
        default:
            break;
        }
    }

    @objid ("e16b6500-5983-4dad-bf34-0ac829c248cc")
    private void setNavigeable(final Property ecoreProp) {
        try {
            ecoreProp.setIsNavigable(this.objingElement.isNavigable());
        }catch (IllegalStateException e){
            Xmi.LOG.error(e);
        }
        org.eclipse.uml2.uml.Association association = ecoreProp.getAssociation();
        if ((association != null) && (ecoreProp.getOwner().equals(association)) && (this.objingElement.isNavigable())){
            association.getNavigableOwnedEnds().add(ecoreProp);
        }
    }

    @objid ("18a2018f-6f3e-42b3-a36a-3ce4becbc823")
    private void attachClassifierEnd(final Property ecoreProperty, final org.eclipse.uml2.uml.Association ecoreAssoc) {
        ecoreAssoc.getMemberEnds().add(ecoreProperty);
        
        Classifier objingOwner = this.objingElement.getOwner();
        org.eclipse.uml2.uml.Element ecoreOwner = GenerationProperties.getInstance().getMappedElement(objingOwner);
        
        if (ecoreOwner != null) {
            // Link to its owner org.eclipse.uml2.uml.Classifier:
            // Class, Component, Node
            if (ecoreOwner instanceof org.eclipse.uml2.uml.StructuredClassifier) {
                org.eclipse.uml2.uml.StructuredClassifier ownerIsSC = (org.eclipse.uml2.uml.StructuredClassifier) ecoreOwner;
                ownerIsSC.getOwnedAttributes().add(ecoreProperty);
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Interface) {// org.eclipse.uml2.uml.Interface
                org.eclipse.uml2.uml.Interface ownerIsInterface = (org.eclipse.uml2.uml.Interface) ecoreOwner;
                ownerIsInterface.getOwnedAttributes().add(ecoreProperty);
            } else if (ecoreOwner instanceof  org.eclipse.uml2.uml.Signal) {//  org.eclipse.uml2.uml.Signal
                org.eclipse.uml2.uml.Signal ownerIsSignal =  (org.eclipse.uml2.uml.Signal) ecoreOwner;
                ownerIsSignal.getOwnedAttributes().add(ecoreProperty);
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.UseCase)  {// org.eclipse.uml2.uml.UseCase
                org.eclipse.uml2.uml.UseCase ownerIsUseCase = (org.eclipse.uml2.uml.UseCase) ecoreOwner;
                EList<Property> attributes=  ownerIsUseCase.getAttributes();
                try{
                    if (!attributes.contains(ecoreProperty))
                        attributes.add(ecoreProperty);
                }catch(UnsupportedOperationException e){
                    ecoreAssoc.getOwnedEnds().add(ecoreProperty);
                }
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Actor) {// org.eclipse.uml2.uml.Actor
                ecoreAssoc.getOwnedEnds().add(ecoreProperty);
        
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.DataType) {// org.eclipse.uml2.uml.DataType
                org.eclipse.uml2.uml.DataType ownerIsDataType = (org.eclipse.uml2.uml.DataType) ecoreOwner;
                EList<Property> attributes=  ownerIsDataType.getOwnedAttributes();
                if (!attributes.contains(ecoreProperty))
                    attributes.add(ecoreProperty);
        
            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Classifier) {
                org.eclipse.uml2.uml.Classifier ownerIsClassifier =  (org.eclipse.uml2.uml.Classifier) ecoreOwner;
                try  {
                    ownerIsClassifier.getAttributes().add(ecoreProperty);
                }catch (UnsupportedOperationException e) {
                    Xmi.LOG.error(e);
                }
            } else {
                ecoreProperty.destroy();
                throw new NotFoundException("Owner Class ("
                        + ecoreOwner.getClass().getSimpleName() + ") Not Found");
            }
        }
    }

}
