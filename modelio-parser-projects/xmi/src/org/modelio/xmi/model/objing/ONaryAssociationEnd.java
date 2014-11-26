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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
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
@objid ("98de104c-9a58-41f0-a08a-f2ede89dab8a")
public class ONaryAssociationEnd extends OFeature {
    @objid ("3dcf8b9a-0e45-4f29-8308-d023f82cf5e5")
    private boolean isLinkedToClassAssociation;

    @objid ("d65803ad-a01d-4076-8c00-051c346b0bff")
    private NaryAssociationEnd objingElement = null;

    @objid ("05f1806f-f60a-4dac-83dc-eca24622760d")
    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        NaryAssociation assoc = this.objingElement.getNaryAssociation();
        
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
            //genProp.getReportModel().addWarning(message, assoc);
        }
        return null;
    }

    /**
     * Constructor of OAssociationEnd.
     * It takes the exported Modelio AssociationEnd as parameter
     * @param element : the exported AssociationEnd
     */
    @objid ("a82d6b8c-f34b-4409-bb50-d9c6570da00a")
    public ONaryAssociationEnd(final NaryAssociationEnd element) {
        super(element);
        this.objingElement = element;
        if (AbstractObjingModelNavigation.isIsClassAssociation(this.objingElement))
            this.isLinkedToClassAssociation = true;
        else
            this.isLinkedToClassAssociation = false;
    }

    @objid ("fdae4d14-2096-4123-bc1d-054497824cdb")
    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        if (!this.isLinkedToClassAssociation)
            linkEcoreProperty((Property) ecoreElt);
        // If the Class representing the current ClassAssociation represents
        // other ClassAssociations, the ClassAssociation is not valid for export:
        else if (AbstractObjingModelNavigation.isRepresentedByAUniqueClass(this.objingElement.getNaryAssociation()
                .getLinkToClass()))
            linkEcorePropertyLinkedToAC((Property) ecoreElt);
        else
            ecoreElt.destroy();
    }

    @objid ("0f63ba34-44ca-4f3b-a8bc-b52458828588")
    @Override
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        Property ecoreProp = (Property) ecoreElt;
        // setAssociationName(); -> done in OAssociation class.
        
        setType(ecoreProp);
        setQuantity(ecoreProp);
        setReadOnly(ecoreProp);
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

    @objid ("7e4e51a5-e568-4a76-95c9-38e2db3ef902")
    private void setQuantity(Property ecoreElt) {
        setMin(ecoreElt);
        setMax(ecoreElt);
    }

    @objid ("b2b3cebe-8aae-460a-ad77-fd6e013035ad")
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

    @objid ("429df0c9-ef6f-484d-9510-abd2e9190013")
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

    @objid ("286a633e-26df-481c-b799-66a5090bef7a")
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

    @objid ("ed7ce84e-a58b-46d2-98e0-02242b6ff9e6")
    private void setAbstractEAnnotation(final org.eclipse.uml2.uml.Element ecoreElt) {
        ObjingEAnnotation.setAbstract(ecoreElt, ((Feature)getObjingElement()).isIsAbstract());
    }

    @objid ("ee28c9fd-2cf3-4bdb-ae21-d88f0265af04")
    private void setStatic(Property ecoreProp) {
        ecoreProp.setIsStatic(this.objingElement.isIsClass());
    }

    @objid ("42a4e447-2b6a-4ee6-8948-9bf23482082e")
    private void setOrdered(Property ecoreProp) {
        ecoreProp.setIsOrdered(this.objingElement.isIsOrdered());
    }

    @objid ("6882a573-4abd-437d-b553-5860082bf8cf")
    private void setUnique(Property ecoreProp) {
        if (this.objingElement.isIsUnique())
            ecoreProp.setIsUnique(true);
    }

    @objid ("e4b449f3-a662-437a-8337-8f3eaef0c6ef")
    private void linkEcoreProperty(Property ecoreProperty) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        // Link to the Ecore org.eclipse.uml2.uml.Association:
        NaryAssociation objingAssoc = this. objingElement.getNaryAssociation();
        org.eclipse.uml2.uml.Association ecoreAssoc = (org.eclipse.uml2.uml.Association) genProp.getMappedElement(objingAssoc);
        
        if (ecoreAssoc != null) {
            // Associates the ecore org.eclipse.uml2.uml.Association to the Property:
            ecoreProperty.setAssociation(ecoreAssoc);
        
            // Sets the org.eclipse.uml2.uml.Association as owner of the Property:
            if (!ecoreAssoc.getOwnedEnds().contains(ecoreProperty)){
                ecoreAssoc.getOwnedEnds().add(ecoreProperty);                    
            }
        }
    }

    @objid ("6fcff308-629b-4498-8ee3-56fbb5a03475")
    private void linkEcorePropertyLinkedToAC(Property ecoreProperty) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        // Link to the Ecore org.eclipse.uml2.uml.AssociationClass if it has already been created:
        NaryAssociation objingAssoc = this.objingElement.getNaryAssociation();
        org.eclipse.uml2.uml.AssociationClass ecoreAssocClass = (org.eclipse.uml2.uml.AssociationClass) genProp
                .getMappedElement(objingAssoc);
        
        if (ecoreAssocClass != null) {
            // Associates the ecore org.eclipse.uml2.uml.AssociationClass to the Property:
            ecoreProperty.setAssociation(ecoreAssocClass);
            //                        ecoreProperty.setIsNavigable(false);
            // Sets the org.eclipse.uml2.uml.Association as owner of the Property:
            if (!ecoreAssocClass.getOwnedEnds().contains(ecoreProperty))
                ecoreAssocClass.getOwnedEnds().add(ecoreProperty);
        }
    }

    @objid ("65bfbbc0-a897-47d2-8e2c-5752a389da75")
    private void setType(Property ecoreProperty) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        // Case of a N ary association: the type of the current Property
        // is given by its related org.eclipse.uml2.uml.Classifier 
        Classifier objingOwner = this.objingElement.getOwner();
        org.eclipse.uml2.uml.Type ecoreType =  (org.eclipse.uml2.uml.Type) genProp.getMappedElement(objingOwner);
        
        if (ecoreType != null) {
            ecoreProperty.setType(ecoreType);
        }
    }

    @objid ("c1ebd79e-1e05-4de4-98ec-6e7f8b9c8f9d")
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

    @objid ("ee0fa6d8-b4cb-44f0-9e80-823492422e3c")
    private void attachNavigableEndLinkedToAC(Property ecoreProperty) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        
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

    @objid ("076f6cf7-f6b5-43d2-8f15-415e7365a667")
    private void setReadOnly(Property ecoreProp) {
        switch (this.objingElement.getChangeable()) {
        case READ:
        
            ecoreProp.setIsReadOnly(true);
            break;
        default:
            break;
        }
    }

    @objid ("07dc8a61-aac0-4d46-a86e-ed0e3389c194")
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
