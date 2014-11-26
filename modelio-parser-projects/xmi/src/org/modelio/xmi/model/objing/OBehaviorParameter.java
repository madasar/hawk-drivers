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

import org.eclipse.uml2.uml.ParameterEffectKind;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.xmi.generation.GenerationProperties;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.AbstractObjingModelNavigation;
import org.modelio.xmi.util.ModelioPrimitiveTypeMapper;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.StringConverter;
import org.modelio.xmi.util.XMILogs;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class manages the export of BehaviorParameter elements
 * @author ebrosse
 */
@objid ("a668b0c1-ab70-4c10-b8d0-7e50a7f787cb")
public class OBehaviorParameter extends OElement implements IOElement {
    @objid ("aa5b5bc3-76c8-42db-868b-ff3f669ec1dc")
    private BehaviorParameter objingElement = null;

    @objid ("55c37cdb-a296-424a-8ef4-b04e4db87452")
    @Override
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        return UMLFactory.eINSTANCE.createParameter();
    }

    /**
     * OBehaviorParameter constructor
     * @param element : the exported Modelio BehaviorParameter
     */
    @objid ("ead147ad-15d4-4f7b-aa27-910f34ebaa1b")
    public OBehaviorParameter(final BehaviorParameter element) {
        super(element);
        this.objingElement = element;
    }

    @objid ("174c36e0-a115-42db-b512-41b2aa57fc91")
    @Override
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        MObject objingParent = this.objingElement.getCompositionOwner();
        org.eclipse.uml2.uml.Element ecoreParent = GenerationProperties.getInstance().getMappedElement(objingParent);
        
        if ((ecoreParent != null) && ( ecoreParent instanceof org.eclipse.uml2.uml. Behavior)) {
            ((org.eclipse.uml2.uml.Behavior) ecoreParent).getOwnedParameters().add((org.eclipse.uml2.uml.Parameter)ecoreElt);
        }
    }

    @objid ("c64e42a7-4d22-48cc-a37f-5fb3e5edfa23")
    @Override
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        setException((org.eclipse.uml2.uml.Parameter) ecoreElt);
        setStream((org.eclipse.uml2.uml.Parameter) ecoreElt);
        setEffect((org.eclipse.uml2.uml.Parameter) ecoreElt);
        setMax((org.eclipse.uml2.uml.Parameter) ecoreElt);
        setMin((org.eclipse.uml2.uml.Parameter) ecoreElt);
        setClass((org.eclipse.uml2.uml.Parameter) ecoreElt);
    }

    @objid ("1c18dd74-49f6-4318-b09f-90f1d6c87724")
    private void setEffect(org.eclipse.uml2.uml.Parameter ecoreElt) {
        switch (this.objingElement.getEffect().getValue())
        {
        case ParameterEffectKind.CREATE :
            ecoreElt.setEffect(org.eclipse.uml2.uml.ParameterEffectKind.CREATE_LITERAL);
            break;
        case ParameterEffectKind.DELETE :
            ecoreElt.setEffect(org.eclipse.uml2.uml.ParameterEffectKind.DELETE_LITERAL);
            break;
        case ParameterEffectKind.READ :
            ecoreElt.setEffect(org.eclipse.uml2.uml.ParameterEffectKind.READ_LITERAL);
            break;
        case ParameterEffectKind.UPDATE :
            ecoreElt.setEffect(org.eclipse.uml2.uml.ParameterEffectKind.UPDATE_LITERAL);
            break;
        default:
            ecoreElt.setEffect(org.eclipse.uml2.uml.ParameterEffectKind.CREATE_LITERAL);
        }
    }

    @objid ("dd0b3c7c-4d5e-47bc-aef6-fcbaf9a0a997")
    private void setStream(org.eclipse.uml2.uml.Parameter ecoreElt) {
        ecoreElt.setIsStream(this.objingElement.isIsStream());
    }

    @objid ("ba6c4830-0d93-4198-96f1-41484f934d93")
    private void setException(org.eclipse.uml2.uml.Parameter ecoreElt) {
        ecoreElt.setIsException(this.objingElement.isIsException());
    }

    @objid ("c793c47f-e4c5-471d-9533-f74e7153b441")
    private void setMin(org.eclipse.uml2.uml.Parameter ecoreElt) {
        String objingMultMin = this.objingElement.getMultiplicityMin();
        
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
                    String contextualMsg = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.multiplicityMinWithName",
                            "Parameter",ecoreElt.getName());
                    String message = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.defaultMsg",
                            "String", "\"" + objingMultMin + "\"", "Integer",
                            contextualMsg);
                    logs.writelnInLog(message);
                   // GenerationProperties.getInstance().getReportModel().addInfo(message, this.objingElement);
                }
            }
        }
    }

    @objid ("c3dad748-2c43-4553-b0cf-c108a0ac25d8")
    private void setMax(org.eclipse.uml2.uml.Parameter ecoreElt) {
        String objingMultMax = this.objingElement.getMultiplicityMax();
        
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
                    String contextualMsg = Xmi.I18N.getMessage(
                            "logFile.exception.stringConverter.multiplicityMaxWithName",
                            "Parameter",ecoreElt.getName());
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

    @objid ("b801ac4c-4ec3-4033-8044-f509654445d3")
    private void setClass(org.eclipse.uml2.uml.Parameter ecoreElt) {
        GenerationProperties genProp = GenerationProperties.getInstance();
        
        // Getting type of the org.eclipse.uml2.uml.Parameter:
        GeneralClass objingType = this.objingElement.getType();
        if (objingType != null) {
            if (ModelioPrimitiveTypeMapper.isPredefinedType(objingType)) {
                ModelioPrimitiveTypeMapper.setEcorePredefinedType(ecoreElt, (DataType) objingType);
            } else {
        
                if (objingType instanceof TemplateParameter) {
                    return;
        
                } else {
                    org.eclipse.uml2.uml.Element ecoreEltType = genProp.getMappedElement(objingType);
        
                    if (ecoreEltType instanceof org.eclipse.uml2.uml.Type)
                        setType(ecoreElt,  (org.eclipse.uml2.uml.Type) ecoreEltType);
                }
            }
        }else {
            ObjingEAnnotation.setNoType(ecoreElt, true);
        }
    }

    @objid ("bcb46fac-b71f-48fb-83b1-1165afb33c5c")
    private void setType(org.eclipse.uml2.uml.Parameter ecoreParam, org.eclipse.uml2.uml.Type type) {
        ecoreParam.setType(type);
    }

}
