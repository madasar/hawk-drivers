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
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.api.model.IUMLTypes;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.StringConverter;
import org.modelio.xmi.util.XMILogs;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8fc2ec1e-92d8-4b52-a8c3-1f24dc43fc71")
public class OAttributeLink extends OModelElement {
    @objid ("4cad3c36-5b02-4fd2-9d92-1415b33c1717")
    private AttributeLink objingElement = null;

    @objid ("b7904d8d-26de-402e-bc6d-f24f15eb1653")
    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        return UMLFactory.eINSTANCE.createSlot();
    }

    @objid ("2ef10730-2330-4592-8ed0-008257942105")
    public OAttributeLink(AttributeLink element) {
        super(element);
        this.objingElement = element;
    }

    @objid ("67e25991-9834-456d-99a9-e743cc87af12")
    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        Instance objOwner = this.objingElement.getAttributed();
        org.eclipse.uml2.uml.Element temp = GenerationProperties.getInstance().getMappedElement(objOwner);
        
        if (temp instanceof InstanceSpecification){
            InstanceSpecification ecoreOwner = (InstanceSpecification) temp;
            ecoreOwner.getSlots().add((org.eclipse.uml2.uml.Slot)ecoreElt);
        }
    }

    @objid ("09de2635-81d4-4651-993a-c72a787819f3")
    @Override
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        
        setDefiningFeature((org.eclipse.uml2.uml.Slot)ecoreElt);
        setExpressionOfValue((org.eclipse.uml2.uml.Slot)ecoreElt);
        
        if ( GenerationProperties.getInstance().isRoundtripEnabled()){
            setEAnnotationValue(ecoreElt);
            
            ObjingEAnnotation.setAttributeLink(ecoreElt, true);
         
            Instance objOwner =  this.objingElement.getAttributed();
            ObjingEAnnotation.setOwner(ecoreElt, objOwner.getUuid().toString());
        }
    }

    @objid ("84a7d5b4-a55c-4d4e-bf42-a4c1bc213d4b")
    private void setDefiningFeature(org.eclipse.uml2.uml.Slot slot) {
        Attribute objingFeature = this.objingElement.getBase();
        
        if (objingFeature != null) {
        
            org.eclipse.uml2.uml.Element ecoreFeature =
                   GenerationProperties.getInstance().getMappedElement(objingFeature);
        
            if (ecoreFeature instanceof org.eclipse.uml2.uml.StructuralFeature) {
                slot.setDefiningFeature((org.eclipse.uml2.uml.StructuralFeature)ecoreFeature);
            }
        }
    }

    @objid ("5ed11a74-ac93-4495-a785-6bd682227710")
    private void setEAnnotationValue(org.eclipse.uml2.uml.Element ecoreElt) {
        ObjingEAnnotation.setValue(ecoreElt, this.objingElement.getValue());
    }


    @objid ("dccf83aa-511f-4eea-81cc-42dd0e04f69c")
    private void setExpression(final org.eclipse.uml2.uml.Slot slot, final String value) {
        org.eclipse.uml2.uml.Expression expr = UMLFactory.eINSTANCE.createExpression();
         org.eclipse.uml2.uml.ValueSpecification result = slot.createValue(null, null, expr.eClass());
        ((org.eclipse.uml2.uml.Expression)result).setSymbol(value);
    }

    @objid ("99cf5c4d-2030-44aa-88ba-7c68de1191de")
    private void setExpressionOfValue(final org.eclipse.uml2.uml.Slot slot) {
        if (AbstractObjingModelNavigation.haveInstanceValue(this.objingElement)){
            InstanceValue value = UMLFactory.eINSTANCE.createInstanceValue();
            InstanceSpecification inst = (InstanceSpecification) GenerationProperties.getInstance().getMappedElement(
                    AbstractObjingModelNavigation.getInstanceValue(this.objingElement));
            value.setInstance(inst);
            slot.getValues().add(value);
        }else{
            Attribute attribut =  this.objingElement.getBase();
            if (attribut != null){
                GeneralClass type = attribut.getType();
                String value = this.objingElement.getValue();
                GeneralClass objingType = attribut.getType();
        
                // If objingValue is "" then we don't set a default value for the UML2
        
                if (!"".equals(value) ) {
        
                    if (objingType != null) {
                        
                        IUMLTypes umlTypes = GenerationProperties.getInstance().getModelioTypes();
                
                        if ((AbstractObjingModelNavigation.OBJING_NULL_VALUE != null) 
                                && (AbstractObjingModelNavigation.OBJING_NULL_VALUE.equals(value.toLowerCase())
                                        && (type instanceof DataType))){
        
                            org.eclipse.uml2.uml.LiteralNull literalNull = UMLFactory.eINSTANCE.createLiteralNull();
                             org.eclipse.uml2.uml.ValueSpecification result = slot.createValue(null, null, literalNull.eClass());
                            try{
                                ((org.eclipse.uml2.uml.LiteralUnlimitedNatural)result).setValue(Integer.valueOf(value.toString()));
                            }catch(NumberFormatException e){
        
                                literalNull.destroy();
                                setExpression(slot, value);
                            }
        
                        }else if ((umlTypes.getBOOLEAN() != null) && (umlTypes.getBOOLEAN().equals(objingType))) { //Boolean Case
                            // If the attribute is a Dynamic org.eclipse.uml2.uml.Dependency, we don't enable
                            Boolean bool = StringConverter
                            .getBoolean(value);
                        if (bool != null){
                            org.eclipse.uml2.uml.LiteralBoolean literalBoolean = UMLFactory.eINSTANCE.createLiteralBoolean();
                             org.eclipse.uml2.uml.ValueSpecification result = slot.createValue(null, null, literalBoolean.eClass());
                            ((org.eclipse.uml2.uml.LiteralBoolean)result).setValue(bool);
                        }else {
                            setExpression(slot, value);
        
                            XMILogs logs = XMILogs.getInstance();
                            String contextualMsg = Xmi.I18N.getMessage(
                                    "logFile.exception.stringConverter.defaultValue", 
                                    this.objingElement.getName(),
                                    "AttributeLink"
                                    );
        
                            String message = Xmi.I18N.getMessage(
                                    "logFile.exception.stringConverter.defaultMsg",
                                    "String", "\"" + value + "\"",
                                    "Boolean");
                            logs.writelnInLog(message);
                            //GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement,  message);
        
        
                        }
                        }else if ((umlTypes.getINTEGER() != null) && (umlTypes.getINTEGER().equals(objingType))) {  //INTEGER case
                            // If the attribute is a Dynamic org.eclipse.uml2.uml.Dependency, we don't enable
                            // string filters:
                            try{
                                int intValue = Integer.valueOf(value);
                                if (intValue >= 0){
                                    org.eclipse.uml2.uml.LiteralUnlimitedNatural literalUnlimited = UMLFactory.eINSTANCE.createLiteralUnlimitedNatural();
                                     org.eclipse.uml2.uml.ValueSpecification result = slot.createValue(null, null, literalUnlimited.eClass());
                                    ((org.eclipse.uml2.uml.LiteralUnlimitedNatural)result).setValue(intValue);
                                }else{
                                    org.eclipse.uml2.uml.LiteralInteger literalInteger = UMLFactory.eINSTANCE.createLiteralInteger();
                                     org.eclipse.uml2.uml.ValueSpecification result = slot.createValue(null, null, literalInteger.eClass());
                                    ((org.eclipse.uml2.uml.LiteralInteger)result).setValue(intValue);
                                }
        
        
                            }catch(NumberFormatException e){
                                setExpression(slot, value);
        
                                XMILogs logs = XMILogs.getInstance();
                                String contextualMsg = Xmi.I18N.getMessage(
                                        "logFile.exception.stringConverter.defaultValue",
                                        this.objingElement.getName(),
                                        "AttributeLink"  );
        
                                String message = Xmi.I18N.getMessage("logFile.exception.stringConverter.defaultMsg",
                                        "String", "\"" + value + "\"",
                                        "Integer");
                                logs.writelnInLog(message);
                                //GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement,  message);
        
                            }
                        } else if (((umlTypes.getCHAR() != null) && (umlTypes.getCHAR().equals(objingType)))
                                || ((umlTypes.getSTRING() != null) && (umlTypes.getSTRING().equals(objingType)))){//CHAR and STRING case
        
                            org.eclipse.uml2.uml.LiteralString literalstring= UMLFactory.eINSTANCE.createLiteralString();
                             org.eclipse.uml2.uml.ValueSpecification result = slot.createValue(null, null, literalstring.eClass());
                            ((org.eclipse.uml2.uml.LiteralString)result).setValue(value);
        
                        } else if (objingType instanceof Enumeration){ //Enumeration case
        
                            if  (AbstractObjingModelNavigation.isEnumerationliteral((Enumeration) objingType, value)){
        
                                InstanceValue instValue = UMLFactory.eINSTANCE.createInstanceValue();
        
                                InstanceValue result = (InstanceValue) slot.createValue(null, null, instValue.eClass());
        
                                Object ecoreType = GenerationProperties.getInstance().getMappedElement(objingType);
                                if (ecoreType instanceof org.eclipse.uml2.uml.Type){
                                    result.setType( (org.eclipse.uml2.uml.Type) ecoreType);
                                }
        
                                Object ecoreInstance = GenerationProperties.getInstance().getMappedElement(AbstractObjingModelNavigation.getEnumerationliteral((Enumeration)objingType, value));
                                if (ecoreInstance instanceof InstanceSpecification){
                                    result.setInstance((InstanceSpecification) ecoreInstance);
                                }
        
                            }else{
                                XMILogs logs = XMILogs.getInstance();
                                String contextualMsg = Xmi.I18N.getMessage(
                                        "logFile.warning.wrongLiteral", value,  objingType.getName());                                
        
                                logs.writelnInLog(contextualMsg);
                                //GenerationProperties.getInstance().getReportModel().addInfo(contextualMsg, this.objingElement);
        
                                 org.eclipse.uml2.uml.OpaqueExpression opaqueExpr = UMLFactory.eINSTANCE.createOpaqueExpression();
                                 org.eclipse.uml2.uml.ValueSpecification result = slot.createValue(null, null, opaqueExpr.eClass());
                                ((org.eclipse.uml2.uml.OpaqueExpression)result).getBodies().add(value);
                            }
        
                        } else{ // No possible mapping.
                            setExpression(slot, value);
                        }
        
                    } else{ // No type
        
                         org.eclipse.uml2.uml.OpaqueExpression opaqueExpr = UMLFactory.eINSTANCE.createOpaqueExpression();
                         org.eclipse.uml2.uml.ValueSpecification result = slot.createValue(null, null, opaqueExpr.eClass());
                        ((org.eclipse.uml2.uml.OpaqueExpression)result).getBodies().add(value);
                    }
                }
            }
        }
    }

}
