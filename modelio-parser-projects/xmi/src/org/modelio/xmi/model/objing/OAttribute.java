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
import org.modelio.api.model.IUMLTypes;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.KindOfAccess;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.ModelioPrimitiveTypeMapper;
import org.modelio.xmi.util.NotFoundException;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.StringConverter;
import org.modelio.xmi.util.XMILogs;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class manages the export of Attribute elements
 * @author ebrosse
 */
@objid ("8a117eab-0dee-4c84-9743-afede724bc1f")
public class OAttribute extends OFeature {
    @objid ("189ee88b-a3fd-42b6-84fa-df31cf0b50d9")
    private Attribute objingElement = null;

    @objid ("2769fed4-866a-461f-b576-9278c35c0b43")
    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        return UMLFactory.eINSTANCE.createProperty();
    }

    /**
     * Constructor of OAttribute.
     * @param element : the exported Attribute
     */
    @objid ("323c27ef-98e2-410d-b5c3-20d0306b8591")
    public OAttribute(final Attribute element) {
        super(element);
        this.objingElement = element;
    }

    @objid ("10b5f732-9ba7-4983-99d1-8d2444eb22a5")
    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        GenerationProperties genProp = GenerationProperties.getInstance();

        org.eclipse.uml2.uml.Element ecoreOwner = null;

        // In case of a Qualified org.eclipse.uml2.uml.Association, the Attribute has no Owner but a
        // Qualified AssociationEnd:
        AssociationEnd qualifiedAssocEnd = this.objingElement.getQualified();

        if (qualifiedAssocEnd != null) {
            ecoreOwner = genProp.getMappedElement(qualifiedAssocEnd);
            if ((ecoreOwner != null) && (ecoreOwner instanceof Property)) {
                ((Property) ecoreOwner).getQualifiers().add((Property) ecoreElt);
            }
        } else {
            Classifier objingOwner = this.objingElement.getOwner();
            ecoreOwner = genProp.getMappedElement(objingOwner);

            if (ecoreOwner != null) {
                if (ecoreOwner instanceof org.eclipse.uml2.uml.Component) {
                    org.eclipse.uml2.uml.Component ownerIsComponent = (org.eclipse.uml2.uml.Component) ecoreOwner;
                    ownerIsComponent.getOwnedAttributes().add((Property)ecoreElt);
                } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Node) {
                    org.eclipse.uml2.uml.Node ownerIsNode = (org.eclipse.uml2.uml.Node) ecoreOwner;
                    ownerIsNode.getOwnedAttributes().add((Property)ecoreElt);
                } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Class) {
                    org.eclipse.uml2.uml.Class ownerIsClass =  (org.eclipse.uml2.uml.Class) ecoreOwner;
                    ownerIsClass.getOwnedAttributes().add((Property)ecoreElt);
                }else if (ecoreOwner instanceof org.eclipse.uml2.uml.Interface) {
                    org.eclipse.uml2.uml.Interface ownerIsInterface = (org.eclipse.uml2.uml.Interface) ecoreOwner;
                    ownerIsInterface.getOwnedAttributes().add((Property)ecoreElt);
                } else if (ecoreOwner instanceof org.eclipse.uml2.uml.DataType) {
                    org.eclipse.uml2.uml.DataType ownerIsDataType = (org.eclipse.uml2.uml.DataType) ecoreOwner;
                    ownerIsDataType.getOwnedAttributes().add((Property)ecoreElt);
                }else if (ecoreOwner instanceof Property) {
                    Property ownerIsProperty = (Property) ecoreOwner;
                    ownerIsProperty.getQualifiers().add((Property)ecoreElt);
                } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Artifact) {
                    org.eclipse.uml2.uml.Artifact ownerIsArtifact = (org.eclipse.uml2.uml.Artifact) ecoreOwner;
                    ownerIsArtifact.getOwnedAttributes().add((Property)ecoreElt);
                } else if (ecoreOwner instanceof  org.eclipse.uml2.uml.Signal) {
                    org.eclipse.uml2.uml.Signal ownerIsSignal =  (org.eclipse.uml2.uml.Signal) ecoreOwner;
                    ownerIsSignal.getOwnedAttributes().add((Property)ecoreElt);
                } else
                    // Attributes defined on org.eclipse.uml2.uml.Actor and org.eclipse.uml2.uml.UseCase are not exported in UML2.
                    // They are
                    // added into an EAnnotation:
                    if (ecoreOwner instanceof org.eclipse.uml2.uml.Actor || ecoreOwner instanceof org.eclipse.uml2.uml.UseCase) {

                        AbstractObjingModelNavigation.infoOfUnsupportedOwnedWithEMF(
                                this.objingElement.getOwner(), this.objingElement, ecoreElt);
                    } else {
                        ecoreElt.destroy();
                        throw new NotFoundException("Owner Class ("
                                + ecoreOwner.getClass().getSimpleName() + ") Not Found");
                    }
            }else
                ecoreElt.destroy();
        }
    }

    @objid ("adba72d0-3e25-446e-b519-b55ff845a718")
    @Override
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        setType((Property) ecoreElt);
        setStatic((Property) ecoreElt);       
        setReadOnly((Property) ecoreElt);
        setExpressionOfValue((Property) ecoreElt);
        setMin((Property) ecoreElt);
        setMax((Property) ecoreElt);

        setOrdered((Property) ecoreElt);
        setUnique((Property) ecoreElt);

        if (GenerationProperties.getInstance().isRoundtripEnabled()){
            setTypeConstraintEAnnotation((Property) ecoreElt);
            setAccessModeEAnnotation((Property) ecoreElt);
            setTargetIsClassEAnnotation((Property) ecoreElt);
            setDynamicDependencyEAnnotation((Property) ecoreElt);
            setAbstractEAnnotation(ecoreElt);
        }
    }

    @objid ("efdde145-14d9-4c63-8bb6-2403a647ea59")
    private void setStatic(Property ecoreProp) {
        ecoreProp.setIsStatic(this.objingElement.isIsClass());
    }

    @objid ("7db0eb51-34b7-4bdf-aad8-61175c36f4e1")
    private void setTypeConstraintEAnnotation(Property ecoreProp) {
        ObjingEAnnotation.setTypeConstraint(ecoreProp, this.objingElement
                .getTypeConstraint());
    }

    @objid ("01eb650d-3944-48de-b087-d04adb67ef66")
    private void setAbstractEAnnotation(final org.eclipse.uml2.uml.Element ecoreElt) {
        ObjingEAnnotation.setAbstract(ecoreElt, ((Feature)getObjingElement()).isIsAbstract());
    }

    @objid ("ac8d1111-1930-4c08-978e-fc635130fcf5")
    private void setExpressionOfValue(Property ecoreProp) {
        String objingDefaultValue = this.objingElement.getValue();
        GeneralClass objingType = this.objingElement.getType();

        // If objingValue is "" then we don't set a default value for the UML2

        if (AbstractObjingModelNavigation.haveInstanceValue(this.objingElement)){
            InstanceValue value = UMLFactory.eINSTANCE.createInstanceValue();
            InstanceSpecification inst = (InstanceSpecification) GenerationProperties.getInstance().getMappedElement(
                    AbstractObjingModelNavigation.getInstanceValue(this.objingElement));
            value.setInstance(inst);
            ecoreProp.setDefaultValue(value);
        }else if (!"".equals(objingDefaultValue) ) {

            if (objingType != null) {

                boolean isDynamicDependency = this.objingElement.isIsDerived();

                IUMLTypes umlTypes = GenerationProperties.getInstance().getModelioTypes();

                if ((AbstractObjingModelNavigation.OBJING_NULL_VALUE != null) 
                        && (AbstractObjingModelNavigation.OBJING_NULL_VALUE.equals(objingDefaultValue.toLowerCase())))

                    ecoreProp.setNullDefaultValue();

                else if ((umlTypes.getBOOLEAN() != null) && (umlTypes.getBOOLEAN().equals(objingType))) { //Boolean Case
                    // If the attribute is a Dynamic org.eclipse.uml2.uml.Dependency, we don't enable
                    StringConverter.setFilterEnabled(!isDynamicDependency);
                    Boolean bool = StringConverter
                            .getBoolean(objingDefaultValue);
                    if (bool != null)
                        ecoreProp.setBooleanDefaultValue(bool);
                    else {
                        XMILogs logs = XMILogs.getInstance();
                        String contextualMsg = Xmi.I18N.getMessage(
                                "logFile.exception.stringConverter.defaultValue",
                                this.objingElement.getName(),
                                "Attribute" );

                        String message = Xmi.I18N.getMessage(
                                "logFile.exception.stringConverter.defaultMsg",
                                "String", "\"" + objingDefaultValue + "\"",
                                "Boolean");
                        logs.writelnInLog(message);
                        ////GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement,  message);

                        org.eclipse.uml2.uml.Expression value = UMLFactory.eINSTANCE.createExpression();
                        value.setSymbol(objingDefaultValue);
                        ecoreProp.setDefaultValue(value);
                    }
                }else if ((umlTypes.getINTEGER() != null) && (umlTypes.getINTEGER().equals(objingType))) {  //INTEGER case
                    // If the attribute is a Dynamic org.eclipse.uml2.uml.Dependency, we don't enable
                    // string filters:
                    StringConverter.setFilterEnabled(!isDynamicDependency);
                    Integer objingIntValue = StringConverter
                            .getInteger(objingDefaultValue);

                    if (objingIntValue != null) {
                        if (objingIntValue >= 0)
                            ecoreProp
                            .setUnlimitedNaturalDefaultValue(objingIntValue);
                        else
                            ecoreProp.setIntegerDefaultValue(objingIntValue);
                    } else {
                        XMILogs logs = XMILogs.getInstance();
                        String contextualMsg = Xmi.I18N.getMessage(
                                "logFile.exception.stringConverter.defaultValue",
                                this.objingElement.getName(),
                                "Attribute" );

                        String message = Xmi.I18N.getMessage("logFile.exception.stringConverter.defaultMsg",
                                "String", "\"" + objingDefaultValue + "\"",
                                "Integer");
                        logs.writelnInLog(message);
                        //GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement,  message);

                        org.eclipse.uml2.uml.Expression value = UMLFactory.eINSTANCE.createExpression();
                        value.setSymbol(objingDefaultValue);
                        ecoreProp.setDefaultValue(value);
                    }
                } else if (((umlTypes.getCHAR() != null) && (umlTypes.getCHAR().equals(objingType)))
                        || ((umlTypes.getSTRING() != null) && (umlTypes.getSTRING().equals(objingType)))){//CHAR and STRING case

                    ecoreProp.setStringDefaultValue(objingDefaultValue);

                } else if (objingType instanceof Enumeration){ //Enumeration case

                    if  (AbstractObjingModelNavigation.isEnumerationliteral((Enumeration) objingType, objingDefaultValue)){

                        InstanceValue value = UMLFactory.eINSTANCE.createInstanceValue();

                        Object ecoreType = GenerationProperties.getInstance().getMappedElement(objingType);
                        if (ecoreType instanceof org.eclipse.uml2.uml.Type){
                            value.setType( (org.eclipse.uml2.uml.Type) ecoreType);
                        }

                        Object ecoreInstance = GenerationProperties.getInstance().getMappedElement(AbstractObjingModelNavigation.getEnumerationliteral((Enumeration)objingType, objingDefaultValue));
                        if (ecoreInstance instanceof InstanceSpecification){
                            value.setInstance((InstanceSpecification) ecoreInstance);
                        }

                        ecoreProp.setDefaultValue(value);

                    }else{
                        XMILogs logs = XMILogs.getInstance();
                        String contextualMsg = Xmi.I18N.getMessage(
                                "logFile.warning.wrongLiteral", objingDefaultValue,  objingType.getName());                                

                        logs.writelnInLog(contextualMsg);
                        //GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement);

                        org.eclipse.uml2.uml.OpaqueExpression value = UMLFactory.eINSTANCE.createOpaqueExpression();
                        value.getBodies().add(objingDefaultValue);
                        ecoreProp.setDefaultValue(value);
                    }

                } else{ // No possible mapping.

                    org.eclipse.uml2.uml.Expression value = UMLFactory.eINSTANCE.createExpression();
                    value.setSymbol(objingDefaultValue);
                    ecoreProp.setDefaultValue(value);
                }

            } else{ // No type
                org.eclipse.uml2.uml.OpaqueExpression value = UMLFactory.eINSTANCE.createOpaqueExpression();
                value.getBodies().add(objingDefaultValue);
                ecoreProp.setDefaultValue(value);
            }
        }
    }

    @objid ("aff6fb2a-7ffc-4648-b739-91edd2fabd54")
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
                    //else it is the default value
                }else {
                    XMILogs logs = XMILogs.getInstance();
                    String contextualMsg =Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.multiplicityMinWithName",
                            "Attribute", ecoreProp.getName());
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

    @objid ("fbe7b79f-be43-4bfc-94bb-865cb4c747ad")
    private void setDynamicDependencyEAnnotation(Property ecoreProp) {
        ObjingEAnnotation.setDynamicDependency(ecoreProp, this.objingElement
                .isIsDerived());
    }

    @objid ("3d11aee0-db11-4531-aa27-79da274fed3e")
    private void setOrdered(Property ecoreProp) {
        ecoreProp.setIsOrdered(this.objingElement.isIsOrdered());
    }

    @objid ("a1c3bd53-7b4c-4a26-a7c2-9a5d373e84db")
    private void setUnique(Property ecoreProp) {
        ecoreProp.setIsUnique(this.objingElement.isIsUnique());
    }

    @objid ("63e98eb0-9d08-44ab-9fa6-a512f0edcecb")
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
            ObjingEAnnotation.setAccessMode(ecoreProp,
                    ObjingEAnnotation.ACCESS_NONE_VALUE);
            break;
        }
    }

    @objid ("e9e5e2b1-6c04-4dd0-b5a2-ec9e912d60e6")
    private void setType(Property ecoreProp) {
        // Getting type of the Attribute:
        GeneralClass objingType = this.objingElement.getType();
        if (objingType != null) {
            if (ModelioPrimitiveTypeMapper.isPredefinedType(objingType)) {
                ModelioPrimitiveTypeMapper.setEcorePredefinedType(ecoreProp, (DataType) objingType);
            } else {
                GenerationProperties genProp = GenerationProperties.getInstance();

                org.eclipse.uml2.uml.Element ecoreElt = genProp.getMappedElement(objingType);

                if ((ecoreElt != null) && (ecoreElt instanceof org.eclipse.uml2.uml.Type)){
                    ecoreProp.setType( (org.eclipse.uml2.uml.Type) ecoreElt);
                }else{
                    XMILogs xmiLogs = XMILogs.getInstance();
                    String message = Xmi.I18N.getMessage("logFile.warning.unsupportedTypeExport", 
                            this.objingElement.getName(), this.objingElement.getClass().getName());
                    xmiLogs.writelnInLog(message);
                    //genProp.getReportModel().addWarning(message, this.objingElement);
                }
            }
        }else {
            ObjingEAnnotation.setNoType(ecoreProp, true);
        }
    }

    @objid ("ab718013-6d03-4d80-bb30-27f2a3c8c661")
    private void setTargetIsClassEAnnotation(Property property) {
        ObjingEAnnotation.setTargetIsClass(property, this.objingElement
                .isTargetIsClass());
    }

    @objid ("f4f212a1-333e-41c3-bb59-0fbef5c16194")
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
                    //else it is the default value
                }else {
                    XMILogs logs = XMILogs.getInstance();
                    String contextualMsg = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.multiplicityMaxWithName",
                            "Attribute", ecoreProp.getName());
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

    @objid ("ca806276-80b1-4400-a035-0df7e8c79b26")
    private void setReadOnly(Property ecoreProp) {
        ecoreProp.setIsReadOnly(this.objingElement.getChangeable().equals(KindOfAccess.READ));
    }

}
