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

import java.util.ArrayList;
import java.util.List;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.reverse.PartialImportMap;
import org.modelio.xmi.reverse.ReverseProperties;
import org.modelio.xmi.reverse.TotalImportMap;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.XMILogs;

/**
 * This class manages the import of Ecore org.eclipse.uml2.uml.Generalization
 * @author ebrosse
 */
@objid ("1aee77f3-3ec1-460d-aba3-c352962f43b5")
public class EGeneralization extends EElement {
    @objid ("f10d7377-c3a2-4f2a-b7a4-f7fe9abfcc3f")
    private org.eclipse.uml2.uml.Generalization ecoreElement = null;

    @objid ("0799e11a-57aa-4fc8-bb23-355eb5464c3b")
    @Override
    public Element createObjingElt() {
        org.eclipse.uml2.uml.Classifier ecoreGeneral = this.ecoreElement.getGeneral();
        org.eclipse.uml2.uml.Classifier ecoreSpecific = this.ecoreElement.getSpecific();
        
        if ((ecoreGeneral != null) 
                && (ecoreSpecific != null)){
        
            Object objingGeneral = ReverseProperties.getInstance().getMappedElement(ecoreGeneral);
            Object objingSpecific = ReverseProperties.getInstance().getMappedElement(ecoreSpecific);
        
            if  ((ecoreGeneral instanceof org.eclipse.uml2.uml.Stereotype) 
                    && (ecoreSpecific instanceof org.eclipse.uml2.uml.Stereotype)){
        
                //Both Stereotypes
        
                if ((objingGeneral != null) 
                        && (objingSpecific != null)){
        
                    //Created during the import
        
                    List<Stereotype> objingGenerals = new ArrayList<>();
                    List<Stereotype> objingSpecifics = new ArrayList<>();
        
        
                    if (objingSpecific instanceof Stereotype)
                        objingSpecifics.add((Stereotype) objingSpecific);
                    else 
                        objingSpecifics = (ArrayList<Stereotype>) objingSpecific;
        
                    if (objingGeneral instanceof Stereotype)
                        objingGenerals.add((Stereotype) objingGeneral);
                    else 
                        objingGenerals = (ArrayList<Stereotype>) objingGeneral;
        
                    for (Stereotype currentSpecific : objingSpecifics){
                        for (Stereotype currentGeneral : objingGenerals){
                            if (currentSpecific.getBaseClassName().equals(currentGeneral.getBaseClassName())
                                    && currentSpecific.getStatus().isModifiable()){
                                currentSpecific.setParent(currentGeneral);
                                break;
                            }
                        }
        
                    }
                }
        
                // Stereotypes already exist
                return null;
        
            }else {
        
                //General case
                if ((objingGeneral != null) 
                        && (objingSpecific != null)){
        
                    if (objingGeneral instanceof NameSpace 
                            && objingSpecific instanceof NameSpace 
        //                            && (!PrimitiveTypeMapper.isPredefinedType(ecoreSpecific))
        //                            && (!PrimitiveTypeMapper.isPredefinedType(ecoreGeneral))
                            ){
        
                        return ReverseProperties.getInstance().getMModelServices().getModelFactory().createGeneralization();
        
                    }else{
        
                        String message = Xmi.I18N.getMessage("logFile.warning.unsupportedNamedEnds", " "
                                , "Generalization", ecoreGeneral.getName(), objingGeneral.getClass().getSimpleName(),  
                                ecoreSpecific.getName(),  ecoreSpecific.getClass().getSimpleName());
                        
                        XMILogs.getInstance().writelnInLog(message);
                        return null;
        
                    }
                }else{
        
                    String message = Xmi.I18N.getMessage("logFile.warning.unsupportedNamedEnds", ""
                            , "Generalization", ecoreGeneral.getName(), ecoreGeneral.getClass().getSimpleName(),  
                            ecoreSpecific.getName(), ecoreSpecific.getClass().getSimpleName());
        
                    XMILogs.getInstance().writelnInLog(message);
                    return null;
                }
        
            }
        
        
        } else{
            //Case Two ecore ends are needed
            String message = Xmi.I18N.getMessage("logFile.warning.needTwoEnds");
            XMILogs.getInstance().writelnInLog(message);
            return null;   
        }
    }

    /**
     * The EGeneralization constructor with the imported Ecore org.eclipse.uml2.uml.Generalization as parameter
     * @param element : the imported Ecore org.eclipse.uml2.uml.Generalization
     */
    @objid ("89655b78-47b1-43d3-9517-ec4da208023b")
    public EGeneralization(final org.eclipse.uml2.uml.Generalization element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("4a1ed6cd-77af-40cb-a4bb-cf78a903f7c7")
    @Override
    public void attach(Element objingElt) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        org.eclipse.uml2.uml.Classifier ecoreGeneral = this.ecoreElement.getGeneral();
        org.eclipse.uml2.uml.Classifier ecoreSpecific = this.ecoreElement.getSpecific();
        
        Element objingGeneral = (Element) revProp
                .getMappedElement(ecoreGeneral);
        Element objingSpecific = (Element) revProp
                .getMappedElement(ecoreSpecific);
        
        if (objingGeneral instanceof NameSpace
                && objingSpecific instanceof NameSpace
                && objingElt instanceof Generalization) {
            Generalization objingGen = (Generalization) objingElt;
            objingGen.setSuperType((NameSpace) objingGeneral);
            objingGen.setSubType((NameSpace) objingSpecific);
        } else {
            PartialImportMap.getInstance().remove(this.ecoreElement);
            TotalImportMap.getInstance().remove(this.ecoreElement);
            objingElt.delete();
        }
    }

    @objid ("9ca5e39c-5ef4-4676-8d6f-67012a88a1de")
    @Override
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        
        if (ReverseProperties.getInstance().isRoundtripEnabled())
            setDiscriminator((Generalization) objingElt);
    }

    @objid ("838bc89f-728a-4b1f-8142-c86216b37779")
    private void setDiscriminator(Generalization objingElt) {
        String discriminator = ObjingEAnnotation.getDiscriminator(this.ecoreElement);
        if (discriminator != null)
            objingElt.setDiscriminator(discriminator);
    }

}
