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
                                    

package org.modelio.xmi.util;

import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.xmi.generation.GenerationProperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class made the mapping between Modelio predefined type and Ecore org.eclipse.uml2.uml.DataType
 * @author ebrosse
 */
@objid ("c95fbb47-4279-43e8-9246-e58e1eea8df2")
public class ModelioPrimitiveTypeMapper {
  


    /**
     * This method returns the Ecore org.eclipse.uml2.uml.Type corresponding to a given Modelio Predefined org.eclipse.uml2.uml.Type
     * @param objingPredefinedType : the given Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the matching Ecore org.eclipse.uml2.uml.Type
     */
    @objid ("911b792f-5c8d-4d8f-83a2-42e2f813117c")
    public static org.eclipse.uml2.uml.Type getEcoreType(DataType objingPredefinedType) {
        
        org.eclipse.uml2.uml.PrimitiveType primitiveType = null;
        
        ModelioTypes modelioTypes = GenerationProperties.getInstance().getModelioTypes();
        EcoreTypes ecoreTypes = GenerationProperties.getInstance().getEcoreTypes();
        EcoreUMLTypes ecoreUmlTypes = GenerationProperties.getInstance().getEcoreUMLTypes();
        
        if ((modelioTypes.getBOOLEAN() != null) && (modelioTypes.getBOOLEAN() .equals(objingPredefinedType))) {
            primitiveType = ecoreUmlTypes.getBoolean();
        }else if ((modelioTypes.getBYTE() != null) &&  (modelioTypes.getBYTE().equals(objingPredefinedType))) {
            primitiveType = ecoreTypes.getByte();
        } else if ((modelioTypes.getCHAR() != null) &&  (modelioTypes.getCHAR().equals(objingPredefinedType))) {
            primitiveType = ecoreTypes.getChar();
        }else if ((modelioTypes.getDOUBLE() != null) &&  modelioTypes.getDOUBLE().equals(objingPredefinedType)) {
            primitiveType = ecoreTypes.getDouble();
        }else if ((modelioTypes.getFLOAT() != null) &&  modelioTypes.getFLOAT().equals(objingPredefinedType)) {
            primitiveType = ecoreTypes.getFloat();
        }else if ((modelioTypes.getLONG() != null) &&  modelioTypes.getLONG().equals(objingPredefinedType)) {
            primitiveType = ecoreTypes.getLong();
        }else if ((modelioTypes.getSHORT() != null) &&  modelioTypes.getSHORT().equals(objingPredefinedType)) {
            primitiveType = ecoreTypes.getShort();
        } else if ((modelioTypes.getINTEGER() != null) &&  modelioTypes.getINTEGER().equals(objingPredefinedType)){
            primitiveType = ecoreUmlTypes.getInteger();
        }else if ((modelioTypes.getDATE() != null) &&  modelioTypes.getDATE().equals(objingPredefinedType)) {
            primitiveType = ecoreTypes.getDate();
        } else if ((modelioTypes.getSTRING() != null) &&  modelioTypes.getSTRING().equals(objingPredefinedType)){
            primitiveType = ecoreUmlTypes.getString();
        }else if ((modelioTypes.getUNDEFINED() != null) && modelioTypes.getUNDEFINED().equals(objingPredefinedType)) {      
            primitiveType = ecoreTypes.getUndefined();
        }
        return primitiveType;
    }

    /**
     * This method types an Ecore org.eclipse.uml2.uml.TypedElement by a given Modelio org.eclipse.uml2.uml.DataType
     * @param typed : the Ecore org.eclipse.uml2.uml.TypedElement
     * @param objingPredefinedType : the Modelio org.eclipse.uml2.uml.DataType
     */
    @objid ("474628a9-2337-4d2f-ba3f-72db09d570a3")
    public static void setEcorePredefinedType(org.eclipse.uml2.uml.TypedElement typed, DataType objingPredefinedType) {
      
        org.eclipse.uml2.uml.PrimitiveType primitiveType = null;
        
        ModelioTypes modelioTypes = GenerationProperties.getInstance().getModelioTypes();
        EcoreTypes ecoreTypes = GenerationProperties.getInstance().getEcoreTypes();
        EcoreUMLTypes ecoreUmlTypes = GenerationProperties.getInstance().getEcoreUMLTypes();
        
        if ((modelioTypes.getBOOLEAN() != null) && modelioTypes.getBOOLEAN().equals(objingPredefinedType)) {
            primitiveType = ecoreUmlTypes.getBoolean();
        }else if ((modelioTypes.getBYTE() != null) &&  modelioTypes.getBYTE().equals(objingPredefinedType)) {
            // Stores the original Modelio predefined type: "byte"
            primitiveType = ecoreTypes.getByte();
        } else if ((modelioTypes.getCHAR() != null) &&  modelioTypes.getCHAR().equals(objingPredefinedType)) {
            // Stores the original Modelio predefined type: "char"
            primitiveType = ecoreTypes.getChar();
        }else if ((modelioTypes.getDOUBLE() != null) &&  modelioTypes.getDOUBLE().equals(objingPredefinedType)) {
            // Stores the original Modelio predefined type: "double"
            primitiveType = ecoreTypes.getDouble();
        }else if ((modelioTypes.getFLOAT() != null) &&  modelioTypes.getFLOAT().equals(objingPredefinedType)) {
            // Stores the original Modelio predefined type: "float"
            primitiveType = ecoreTypes.getFloat();
        }else if ((modelioTypes.getLONG() != null) &&  modelioTypes.getLONG().equals(objingPredefinedType)) {
            // Stores the original Modelio predefined type: "long"
            primitiveType = ecoreTypes.getLong();
        }else if ((modelioTypes.getSHORT() != null) &&  modelioTypes.getSHORT().equals(objingPredefinedType)) {
            // Stores the original Modelio predefined type: "short"
            primitiveType = ecoreTypes.getShort();
        } else if ((modelioTypes.getINTEGER() != null) &&  modelioTypes.getINTEGER().equals(objingPredefinedType)){
            primitiveType = ecoreUmlTypes.getInteger();
        }else if ((modelioTypes.getDATE() != null) &&  modelioTypes.getDATE().equals(objingPredefinedType)) {
            // Stores the original Modelio predefined type: "date"
            primitiveType = ecoreTypes.getDate();
        } else if ((modelioTypes.getSTRING() != null) &&  modelioTypes.getSTRING().equals(objingPredefinedType))
            primitiveType = ecoreUmlTypes.getString();
        else if ((modelioTypes.getUNDEFINED() != null) && modelioTypes.getUNDEFINED().equals(objingPredefinedType)) {
            // Stores the original Modelio predefined type: "undefined"
            primitiveType = ecoreTypes.getUndefined();
        }
        
        if (primitiveType != null)
            typed.setType(primitiveType);
    }

   
    
    /**
     * Test if a given GeneralClass is a Modelio Predefined org.eclipse.uml2.uml.Type
     * @param type : the tested GeneralClass
     * @return true if it is a Modelio Predefined org.eclipse.uml2.uml.Type
     */
    @objid ("7ac3cdb5-362c-4f82-b794-c1b9a22fdbfc")
    public static boolean isPredefinedType(final GeneralClass type) {
        if (type != null) {
            
            ModelioTypes modelioTypes = GenerationProperties.getInstance().getModelioTypes();
        
            if ((modelioTypes.getBOOLEAN()  != null) && (type.equals(modelioTypes.getBOOLEAN() )))
                return true;
            else if  ((modelioTypes.getCHAR() != null) &&(type.equals(modelioTypes.getCHAR())))
                return true;
            else if ((modelioTypes.getINTEGER() != null) && (type.equals(modelioTypes.getINTEGER())))
                return true;
            else if ((modelioTypes.getBYTE() != null) &&(type.equals(modelioTypes.getBYTE())))
                return true;
            else if ((modelioTypes.getDATE() != null) &&(type.equals(modelioTypes.getDATE())))
                return true;
            else if ((modelioTypes.getDOUBLE() != null) &&(type.equals(modelioTypes.getDOUBLE())))
                return true;
            else if ((modelioTypes.getFLOAT() != null) &&(type.equals(modelioTypes.getFLOAT())))
                return true;
            else if ((modelioTypes.getLONG() != null) &&(type.equals(modelioTypes.getLONG())))
                return true;
            else if ((modelioTypes.getSHORT() != null) &&(type.equals(modelioTypes.getSHORT())))
                return true;
            else if ((modelioTypes.getSTRING() != null) &&(type.equals(modelioTypes.getSTRING())))
                return true;
            else if ((modelioTypes.getUNDEFINED() != null) &&(type.equals(modelioTypes.getUNDEFINED())))
                return true;
        }
        return false;
    }

     


}
