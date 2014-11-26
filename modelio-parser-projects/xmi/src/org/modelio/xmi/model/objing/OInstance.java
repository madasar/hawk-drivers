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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.EcoreTypes;
import org.modelio.xmi.util.EcoreUMLTypes;
import org.modelio.xmi.util.ModelioPrimitiveTypeMapper;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.StringConverter;
import org.modelio.xmi.util.XMILogs;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This classe manages the export of Instance elements
 * @author ebrosse
 */
@objid ("b23f9e0a-4246-4328-ab70-4ac3244dfc0d")
public class OInstance extends OModelElement {
    @objid ("4b9ac946-ccbf-4564-a3f0-5edaa89fa44e")
    private Instance objingElement = null;

    @objid ("f5eecbd6-9526-474f-b0bf-fbc49609e25c")
    private MObject root = null;

    @Override
    @objid ("e8538978-5a72-4e7d-87a0-6aee43ed02c0")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        if (! (this.objingElement instanceof BindableInstance)){
            if (this.objingElement.getCompositionOwner() instanceof Package)
                return UMLFactory.eINSTANCE.createInstanceSpecification();

            if (this.root instanceof Instance){
                return UMLFactory.eINSTANCE.createSlot();
            }

            Property part =  UMLFactory.eINSTANCE.createProperty();        
            part.setIsComposite(true);
            return part;
        }
        return null;
    }

    /**
     * @param element : The exported Instance
     */
    @objid ("e5ed492d-d9d3-474e-8e91-43107e5e7c26")
    public OInstance(final Instance element) {
        super(element);
        this.objingElement = element;
        this.root = this.objingElement.getOwner();
    }

    @objid ("c0f8acdb-1551-4aea-a6b4-b1a613685d4d")
    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        if (ecoreElt instanceof InstanceSpecification){

            attachInstanceSpecification((InstanceSpecification)ecoreElt);

        }else if (! (this.objingElement instanceof Port)){

            if (ecoreElt instanceof org.eclipse.uml2.uml.Slot){
                attachSlot((org.eclipse.uml2.uml.Slot)ecoreElt);
            }else if (ecoreElt instanceof Property ){
                attachProperty((Property)ecoreElt);
            }else 
                ecoreElt.destroy();
        }
    }

    @objid ("5cc0bb95-bdb1-4d5c-87b4-e0172fefa33e")
    @Override
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        if (ecoreElt instanceof InstanceSpecification){
            setInstanceSpecificationProperties((InstanceSpecification)ecoreElt);
        }else if (ecoreElt instanceof Property){
            setName((org.eclipse.uml2.uml.NamedElement) ecoreElt);
            setBase((Property) ecoreElt);
            setMin((Property) ecoreElt);
            setMax((Property) ecoreElt);
            setExpressionOfValue((Property) ecoreElt);
        }else if (ecoreElt instanceof org.eclipse.uml2.uml.Slot){
            setValue((org.eclipse.uml2.uml.Slot) ecoreElt);
        }
    }

    @objid ("e965c29c-daaa-438d-a63d-9b7b80453500")
    private void setName(InstanceSpecification specification) {
        String eltName = this.objingElement.getName();
        if (AbstractObjingModelNavigation.isNotNullOrEmpty(eltName))
            specification.setName(eltName);
    }

    @objid ("35eca0e5-c66a-40b7-9d0f-24f327c070f5")
    private void setClassifier(InstanceSpecification ecoreElement) {
        NameSpace objingRepresented = this.objingElement.getBase();

        if (objingRepresented != null) {
            GenerationProperties genProp = GenerationProperties.getInstance();

            org.eclipse.uml2.uml.Element ecoreRepresented = genProp.getMappedElement(objingRepresented);

            if (ecoreRepresented instanceof org.eclipse.uml2.uml.Classifier) {
                ecoreElement.getClassifiers().add( (org.eclipse.uml2.uml.Classifier)ecoreRepresented);
            }else if ((objingRepresented instanceof GeneralClass) 
                    && (ModelioPrimitiveTypeMapper.isPredefinedType((GeneralClass)objingRepresented))
                    && genProp.isRoundtripEnabled()){
                ObjingEAnnotation.setType(ecoreElement, objingRepresented.getName());
            }else{
                XMILogs xmilogs = XMILogs.getInstance();
                String ecoreClassName = ecoreRepresented.getClass().getSimpleName();

                String message = Xmi.I18N.getMessage("logFile.warning.export.unsupportedRelation.wrongEcoreType.title", "Classifier");

                String description = Xmi.I18N.getMessage("logFile.warning.export.unsupportedRelation.wrongEcoreType.description",
                        "Classifier",
                        this.objingElement.getName(), 
                        "Classifier or GeneralClass",
                        ecoreClassName.substring(0, ecoreClassName.length() - 4));
                xmilogs.writelnInLog(message);
//                //genProp.getReportModel().addWarning(message, this.objingElement, description);
            }
        }
    }

    @objid ("4640e40a-4e47-4631-b9f8-67a2e6f1ef6b")
    private void setIsConstant(org.eclipse.uml2.uml.Element ecoreElt) {
        ObjingEAnnotation.setConstant(ecoreElt, this.objingElement.isIsConstant());
    }

    @objid ("af9f72e1-31da-40a9-9c14-8e915eb9f1d0")
    private void setMultiMax(org.eclipse.uml2.uml.Element ecoreElt) {
        ObjingEAnnotation.setMultiMax(ecoreElt, this.objingElement.getMultiplicityMax());
    }

    @objid ("db55ab50-6ed1-4df9-bd75-b63210303541")
    private void setValue(org.eclipse.uml2.uml.Element ecoreElt) {
        String value = this.objingElement.getValue();
        if ((value != null ) && (!value.equals(""))){
            NameSpace base  = this.objingElement.getBase();
            if (ecoreElt instanceof InstanceSpecification){
                InstanceSpecification spec = (InstanceSpecification) ecoreElt;
                addValueSpecification(base, this.objingElement.getValue(), spec);
            }else
                ObjingEAnnotation.setValue(ecoreElt, this.objingElement.getValue());
        }
    }

    @objid ("0c0580b2-a91c-4ee7-bfcf-82e257cd1405")
    private void addValueSpecification(final NameSpace objType, Object value, final InstanceSpecification spec) {
        if (AbstractObjingModelNavigation.haveInstanceValue(this.objingElement)){
            InstanceValue instValue = UMLFactory.eINSTANCE.createInstanceValue();
            InstanceSpecification inst = (InstanceSpecification) GenerationProperties.getInstance().getMappedElement(
                    AbstractObjingModelNavigation.getInstanceValue(this.objingElement));
            instValue.setInstance(inst);
            spec.setSpecification(instValue);
        }else {

            org.eclipse.uml2.uml.Type type = null;
            GenerationProperties genProp = GenerationProperties.getInstance();
            if (objType != null){
                Object temp = genProp.getMappedElement(objType);
                if (temp instanceof org.eclipse.uml2.uml.Type)
                    type =  (org.eclipse.uml2.uml.Type) temp;
            }

            if (type != null){
                org.eclipse.uml2.uml.ValueSpecification result = null;
                EcoreUMLTypes umlTypes = genProp.getEcoreUMLTypes();
                EcoreTypes ecoreTypes = genProp.getEcoreTypes();

                if(type.equals(umlTypes.getInteger())){
                    org.eclipse.uml2.uml.LiteralInteger literalInteger = UMLFactory.eINSTANCE.createLiteralInteger();
                    result = spec.createSpecification(null, type, literalInteger.eClass());
                    try{
                        ((org.eclipse.uml2.uml.LiteralInteger)result).setValue(Integer.valueOf(value.toString()));
                    }catch(NumberFormatException e){
                        literalInteger.destroy();
                        org.eclipse.uml2.uml.Expression expr = UMLFactory.eINSTANCE.createExpression();
                        result = spec.createSpecification(null, type, expr.eClass());
                        ((org.eclipse.uml2.uml.Expression)result).setSymbol(value.toString());

                        XMILogs logs = XMILogs.getInstance();
                        String contextualMsg = Xmi.I18N.getMessage(
                                "logFile.exception.stringConverter.defaultValue",
                                this.objingElement.getName(),
                                "AttributeLink" );

                        String message = Xmi.I18N.getMessage("logFile.exception.stringConverter.defaultMsg",
                                "String", "\"" + value + "\"",
                                "Integer", contextualMsg);
                        logs.writelnInLog(message);
//                        //GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement,  message);

                    }

                }else if(type.equals(umlTypes.getUnlimitedNatural())){
                    org.eclipse.uml2.uml.LiteralUnlimitedNatural literalUnlimitedNatural = UMLFactory.eINSTANCE.createLiteralUnlimitedNatural();
                    result = spec.createSpecification(null, type, literalUnlimitedNatural.eClass());
                    try{
                        ((org.eclipse.uml2.uml.LiteralUnlimitedNatural)result).setValue(Integer.valueOf(value.toString()));
                    }catch(NumberFormatException e){
                        literalUnlimitedNatural.destroy();
                        org.eclipse.uml2.uml.Expression expr = UMLFactory.eINSTANCE.createExpression();
                        result = spec.createSpecification(null, type, expr.eClass());
                        ((org.eclipse.uml2.uml.Expression)result).setSymbol(value.toString());
                    }
                }

                else if(type.equals(umlTypes.getBoolean())){
                    org.eclipse.uml2.uml.LiteralBoolean literalBoolean = UMLFactory.eINSTANCE.createLiteralBoolean();
                    result = spec.createSpecification(null, type, literalBoolean.eClass());
                    try{
                        ((org.eclipse.uml2.uml.LiteralBoolean)result).setValue(Boolean.valueOf(value.toString()));
                    }catch(Exception e){
                        XMILogs logs = XMILogs.getInstance();
                        String contextualMsg = Xmi.I18N.getMessage(
                                "logFile.exception.stringConverter.defaultValue",
                                this.objingElement.getName(),
                                "AttributeLink" );

                        String message = Xmi.I18N.getMessage(
                                "logFile.exception.stringConverter.defaultMsg",
                                "String", "\"" + value + "\"",
                                "Boolean", contextualMsg);
                        logs.writelnInLog(message);
////                        ////                        //GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement,  message);
                    }
                }

                else if(type.equals(umlTypes.getString()) 
                        || type.equals(ecoreTypes.getChar())){
                    org.eclipse.uml2.uml.LiteralString literalString = UMLFactory.eINSTANCE.createLiteralString();
                    result = spec.createSpecification(null, type, literalString.eClass());
                    ((org.eclipse.uml2.uml.LiteralString)result).setValue(value.toString());

                }else {
                    org.eclipse.uml2.uml.OpaqueExpression opaqueExpr = UMLFactory.eINSTANCE.createOpaqueExpression();
                    result = spec.createSpecification(null, type, opaqueExpr.eClass());
                    ((org.eclipse.uml2.uml.OpaqueExpression)result).getBodies().add(value.toString());
                }
            }else {
                org.eclipse.uml2.uml.OpaqueExpression opaqueExpr = UMLFactory.eINSTANCE.createOpaqueExpression();
                org.eclipse.uml2.uml.ValueSpecification result = spec.createSpecification(null, type, opaqueExpr.eClass());
                ((org.eclipse.uml2.uml.OpaqueExpression)result).getBodies().add(value.toString());
            }
        }
    }

    @objid ("4ed60b23-73d9-48b4-ae90-67e159ac2cb7")
    private void setMultiMin(org.eclipse.uml2.uml.Element ecoreElt) {
        ObjingEAnnotation.setMultiMin(ecoreElt, this.objingElement.getMultiplicityMin());
    }

    @objid ("e3e762ab-7139-49c0-b509-82c75f09f552")
    private void attachProperty(Property ecoreElt) {
        MObject objOwner = this.objingElement.getCompositionOwner();
        org.eclipse.uml2.uml.Element ecoreOwner = null;

        if (objOwner instanceof BindableInstance){
            setOwnerEAnnotation(ecoreElt, objOwner);
        }

        ecoreOwner = GenerationProperties.getInstance().getMappedElement(this.root);

        if (ecoreOwner instanceof org.eclipse.uml2.uml.StructuredClassifier)    
            ((org.eclipse.uml2.uml.StructuredClassifier)ecoreOwner).getOwnedAttributes().add(ecoreElt);
        else if (ecoreOwner instanceof  org.eclipse.uml2.uml.Collaboration)
            ( (org.eclipse.uml2.uml.Collaboration)ecoreOwner).getCollaborationRoles().add(ecoreElt);
        else
            ecoreElt.destroy();
    }

    @objid ("7e18cdff-4671-4dd2-ac7d-8bd7e6af6891")
    public void setOwnerEAnnotation(org.eclipse.uml2.uml.Element element, MObject owner) {
        ObjingEAnnotation.setOwner(element, String.valueOf(owner.getUuid().toString()));
    }

    @objid ("c823fb66-7c49-4c76-9402-d1f50c8b9329")
    private void attachSlot(org.eclipse.uml2.uml.Slot ecoreElt) {
        MObject objingOwner = this.objingElement.getCompositionOwner();

        if (objingOwner instanceof BindableInstance){
            setOwnerEAnnotation(ecoreElt, objingOwner);
        }

        org.eclipse.uml2.uml.Element ecoreOwner = GenerationProperties.getInstance().getMappedElement(objingOwner);

        if (ecoreOwner != null) {
            if (ecoreOwner instanceof InstanceSpecification) {    
                ((InstanceSpecification) ecoreOwner).getSlots().add(ecoreElt);
            }else{
                ecoreElt.destroy();
                XMILogs logs = XMILogs.getInstance();
                String message = Xmi.I18N.getMessage(
                        "logFile.exception.stringConverter.haveNotOwner",
                        ecoreElt.getClass().toString());
                logs.writelnInLog(message);
                //GenerationProperties.getInstance().getReportModel().addWarning(message, this.objingElement);
            }


            if (( GenerationProperties.getInstance().isRoundtripEnabled()) && (!(this.objingElement instanceof Port)))
                ObjingEAnnotation.setBindableInstance(ecoreElt, true);
        }
    }

    @objid ("e18238d1-655f-478d-aeb8-61b2737bab83")
    private void attachInstanceSpecification(InstanceSpecification ecoreElt) {
        GenerationProperties genProp = GenerationProperties.getInstance();

        MObject objingOwner = this.objingElement.getCompositionOwner();
        org.eclipse.uml2.uml.Element ecoreOwner = genProp.getMappedElement(objingOwner);

        if (ecoreOwner != null) {
            if (ecoreOwner instanceof org.eclipse.uml2.uml.Package) {
                org.eclipse.uml2.uml.Package ownerIsPkg = (org.eclipse.uml2.uml.Package) ecoreOwner;
                ownerIsPkg.getPackagedElements().add(ecoreElt);

            } else if (ecoreOwner instanceof org.eclipse.uml2.uml.Component) {
                org.eclipse.uml2.uml.Component ownerIsCmpnt = (org.eclipse.uml2.uml.Component) ecoreOwner;
                ownerIsCmpnt.getPackagedElements().add(ecoreElt);
            } else if (objingOwner instanceof ModelTree) {
                org.eclipse.uml2.uml.Package ownerIsPkg = (org.eclipse.uml2.uml.Package) genProp.getMappedElement(
                        AbstractObjingModelNavigation.getNearestPackage((ModelTree) objingOwner));
                ownerIsPkg.getPackagedElements().add(ecoreElt);

                if (!(objingOwner.equals(ownerIsPkg))){
                    XMILogs logs = XMILogs.getInstance();
                    String message = Xmi.I18N.getMessage(
                            "logFile.warning.ownerChange",
                            this.objingElement.getName(),
                            this.objingElement.getClass().getSimpleName().substring(2),
                            ((ModelTree) objingOwner).getName(),
                            ownerIsPkg.getName());
                    logs.writelnInLog(message);
                    ////genProp.getReportModel().addWarning(message, this.objingElement);
                }
            }else{
                XMILogs logs = XMILogs.getInstance();
                String message = Xmi.I18N.getMessage(
                        "logFile.exception.stringConverter.haveNotOwner",
                        ecoreElt.getClass().toString());
                logs.writelnInLog(message);
                ////genProp.getReportModel().addWarning(message, this.objingElement);
            }

        }
    }

    @objid ("cb91c900-adfd-4818-858a-22539da80d0d")
    private void setInstanceSpecificationProperties(InstanceSpecification ecoreElt) {
        GenerationProperties genProp = GenerationProperties.getInstance();

        setName(ecoreElt);
        setClassifier(ecoreElt);

        if (genProp.isRoundtripEnabled()){
            setIsConstant(ecoreElt);
            setMultiMax(ecoreElt);
            setMultiMin(ecoreElt);            
        }

        setValue(ecoreElt);
    }

    @objid ("46f5f19d-aed5-446a-8a90-2825d83a70d0")
    protected void setName(org.eclipse.uml2.uml.NamedElement ecoreElt) {
        if (AbstractObjingModelNavigation.isNotNullOrEmpty(this.objingElement.getName()))
            ecoreElt.setName(this.objingElement.getName());
    }

    @objid ("c1ea47c7-a515-401a-880a-1824d2aa4e50")
    protected void setBase(Property ecoreElt) {
        Element base = this.objingElement.getBase();
        if ( base != null) {
            org.eclipse.uml2.uml.Element type =  GenerationProperties.getInstance().getMappedElement(base);

            if (type instanceof org.eclipse.uml2.uml.Type)
                ecoreElt.setType( (org.eclipse.uml2.uml.Type)type);
            else{
                XMILogs xmiLogs = XMILogs.getInstance();
                String message = Xmi.I18N.getMessage("logFile.warning.unsupportedTypeExport", 
                        this.objingElement.getName(), this.objingElement.getClass().getSimpleName());
                xmiLogs.writelnInLog(message);
                //GenerationProperties.getInstance().getReportModel().addWarning(message, this.objingElement);
            }

        }
    }

    @objid ("f63b2083-f503-44ef-bdc6-58750dc85db4")
    protected void setMin(Property ecoreProp) {
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

    @objid ("70135b94-0fc0-4609-a64a-aa4183dc797a")
    protected void setMax(Property ecoreProp) {
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


    @objid ("0df5bc73-6086-4e2f-821c-c4e1796f2225")
    protected void setExpressionOfValue(final Property ecoreProp) {
        if (AbstractObjingModelNavigation.haveInstanceValue(this.objingElement)){
            InstanceValue value = UMLFactory.eINSTANCE.createInstanceValue();
            InstanceSpecification inst = (InstanceSpecification) GenerationProperties.getInstance().getMappedElement(
                    AbstractObjingModelNavigation.getInstanceValue(this.objingElement));
            value.setInstance(inst);
            ecoreProp.setDefaultValue(value);

        }else{
            String objingDefaultValue = this.objingElement.getValue();
            NameSpace objingType = this.objingElement.getBase();

            // If objingValue is "" then we don't set a default value for the UML2
            if (AbstractObjingModelNavigation.haveInstanceValue(this.objingElement)){
                InstanceValue instValue = UMLFactory.eINSTANCE.createInstanceValue();
                InstanceSpecification inst = (InstanceSpecification) GenerationProperties.getInstance().getMappedElement(
                        AbstractObjingModelNavigation.getInstanceValue(this.objingElement));
                instValue.setInstance(inst);
                ecoreProp.setDefaultValue(instValue);
            }else {
                if (!"".equals(objingDefaultValue) ) {

                    if (objingType != null) {
                        
                        IUMLTypes umlTypes = GenerationProperties.getInstance().getModelioTypes();

                        if ((AbstractObjingModelNavigation.OBJING_NULL_VALUE != null) 
                                && (AbstractObjingModelNavigation.OBJING_NULL_VALUE.equals(objingDefaultValue.toLowerCase())))

                            ecoreProp.setNullDefaultValue();

                        else if ((umlTypes.getBOOLEAN() != null) && (umlTypes.getBOOLEAN().equals(objingType))) { //Boolean Case
                            // If the attribute is a Dynamic org.eclipse.uml2.uml.Dependency, we don't enable
                            StringConverter.setFilterEnabled(false);
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
                                //GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement,  message);

                                org.eclipse.uml2.uml.Expression value = UMLFactory.eINSTANCE.createExpression();
                                value.setSymbol(objingDefaultValue);
                                ecoreProp.setDefaultValue(value);
                            }
                        }else if ((umlTypes.getINTEGER() != null) && (umlTypes.getINTEGER().equals(objingType))) {  //INTEGER case
                            // If the attribute is a Dynamic org.eclipse.uml2.uml.Dependency, we don't enable
                            // string filters:
                            StringConverter.setFilterEnabled(false);
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
        }
    }

    @objid ("7949fbae-7031-4173-b13a-fa0017f614fc")
    protected void setValue(final org.eclipse.uml2.uml.Slot ecoreElt) {
        if (AbstractObjingModelNavigation.haveInstanceValue(this.objingElement)){
            InstanceValue value = UMLFactory.eINSTANCE.createInstanceValue();
            InstanceSpecification inst = (InstanceSpecification) GenerationProperties.getInstance().getMappedElement(
                    AbstractObjingModelNavigation.getInstanceValue(this.objingElement));
            value.setInstance(inst);
            ecoreElt.getValues().add(value);

        }else{
            String value = this.objingElement.getValue();
            if ((value != null ) && (!value.equals(""))){
                NameSpace base  = this.objingElement.getBase();
                setValueSpecification(base, this.objingElement.getValue(), ecoreElt);
            }
        }
    }

    @objid ("f16ae7ab-0ae2-4186-a6b6-f53b22715c0d")
    protected void setValueSpecification(final NameSpace objType, final Object value, final org.eclipse.uml2.uml.Slot slot) {
        org.eclipse.uml2.uml.Type type = null;
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        if (objType != null){
            Object temp = genProp.getMappedElement(objType);
            if (temp instanceof org.eclipse.uml2.uml.Type)
                type =  (org.eclipse.uml2.uml.Type) temp;
        }

        if (type != null){
            org.eclipse.uml2.uml.ValueSpecification result = null;
            EcoreUMLTypes ecoreUmlTypes = genProp.getEcoreUMLTypes();
            EcoreTypes ecoreTypes = genProp.getEcoreTypes();
            
            if(type.equals(ecoreUmlTypes.getInteger())){
                org.eclipse.uml2.uml.LiteralInteger literalInteger = UMLFactory.eINSTANCE.createLiteralInteger();
                result = slot.createValue(null, type, literalInteger.eClass());
                try{
                    ((org.eclipse.uml2.uml.LiteralInteger)result).setValue(Integer.valueOf(value.toString()));
                }catch(NumberFormatException e){
                    literalInteger.destroy();
                    org.eclipse.uml2.uml.Expression expr = UMLFactory.eINSTANCE.createExpression();
                    result = slot.createValue(null, type, expr.eClass());
                    ((org.eclipse.uml2.uml.Expression)result).setSymbol(value.toString());

                    XMILogs logs = XMILogs.getInstance();
                    String contextualMsg = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.defaultValue",
                            this.objingElement.getName(),
                            "AttributeLink" );

                    String message = Xmi.I18N.getMessage("logFile.exception.stringConverter.defaultMsg",
                            "String", "\"" + value + "\"",
                            "Integer", contextualMsg);
                    logs.writelnInLog(message);
                    //GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement,  message);

                }

            }else if(type.equals(ecoreUmlTypes.getUnlimitedNatural())){
                org.eclipse.uml2.uml.LiteralUnlimitedNatural literalUnlimitedNatural = UMLFactory.eINSTANCE.createLiteralUnlimitedNatural();
                result = slot.createValue(null, type, literalUnlimitedNatural.eClass());
                try{
                    ((org.eclipse.uml2.uml.LiteralUnlimitedNatural)result).setValue(Integer.valueOf(value.toString()));
                }catch(NumberFormatException e){
                    literalUnlimitedNatural.destroy();
                    org.eclipse.uml2.uml.Expression expr = UMLFactory.eINSTANCE.createExpression();
                    result = slot.createValue(null, type, expr.eClass());
                    ((org.eclipse.uml2.uml.Expression)result).setSymbol(value.toString());
                }
            }else if(type.equals(ecoreUmlTypes.getBoolean())){
                org.eclipse.uml2.uml.LiteralBoolean literalBoolean = UMLFactory.eINSTANCE.createLiteralBoolean();
                result = slot.createValue(null, type, literalBoolean.eClass());
                try{
                    ((org.eclipse.uml2.uml.LiteralBoolean)result).setValue(Boolean.valueOf(value.toString()));
                }catch(Exception e){
                    XMILogs logs = XMILogs.getInstance();
                    String contextualMsg = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.defaultValue",
                            this.objingElement.getName(),
                            "AttributeLink");

                    String message = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.defaultMsg",
                            "String", "\"" + value + "\"",
                            "Boolean", contextualMsg);
                    logs.writelnInLog(message);
                    //GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement,  message);
                }
            }else if(type.equals(ecoreUmlTypes.getString()) 
                    || type.equals(ecoreTypes.getChar())){
                org.eclipse.uml2.uml.LiteralString literalString = UMLFactory.eINSTANCE.createLiteralString();
                result = slot.createValue(null, type, literalString.eClass());
                ((org.eclipse.uml2.uml.LiteralString)result).setValue(value.toString());


            }else{
                org.eclipse.uml2.uml.OpaqueExpression opaqueExpr = UMLFactory.eINSTANCE.createOpaqueExpression();
                result = slot.createValue(null, type, opaqueExpr.eClass());
                ((org.eclipse.uml2.uml.OpaqueExpression)result).getBodies().add(value.toString());
            }
        }else {
            org.eclipse.uml2.uml.OpaqueExpression opaqueExpr = UMLFactory.eINSTANCE.createOpaqueExpression();
            org.eclipse.uml2.uml.ValueSpecification result = slot.createValue(null, type, opaqueExpr.eClass());
            ((org.eclipse.uml2.uml.OpaqueExpression)result).getBodies().add(value.toString());
        }
    }

}
