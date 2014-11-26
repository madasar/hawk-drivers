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

import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.xmi.reverse.ReverseProperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class made the mapping between Modelio predefined type and Ecore org.eclipse.uml2.uml.DataType
 * @author ebrosse
 */
@objid ("c95fbb47-4279-43e8-9246-e58e1eea8df2")
public class EcorePrimitiveTypeMapper {
  
    private static final String booleanEcoreName = "Boolean";

    private static final String byteEcoreName = "EByte";

    private static final String charEcoreName = "EChar";

    private static final String dateEcoreName = "EDate";

    private static final String doubleEcoreName = "EDouble";

    private static final String floatEcoreName = "EFloat";

    private static final String integerEcoreName = "Integer";

    private static final String longEcoreName = "ELong";

    private static final String shortEcoreName = "EShort";

    private static final String stringEcoreName = "String";

    private static final String unlimitedNaturalName = "UnlimitedNatural";

    private static final String eStringEcoreName = "EString";

    /**
     * provide the Modelio org.eclipse.uml2.uml.DataType cooresponding to a given Ecore org.eclipse.uml2.uml.Type
     * @param ecoreType : the given Ecore org.eclipse.uml2.uml.Type
     * @return the corresponding Modelio org.eclipse.uml2.uml.DataType
     */
    @objid ("fa5efca7-fdad-45b1-b130-7c8e5126a563")
    public static DataType getPredefinedType(final org.eclipse.uml2.uml.Type ecoreType) {
    
        
        ModelioTypes modelioTypes = ReverseProperties.getInstance().getModelioTypes();
        
        //Compute primitiveType name
        String currentEcoreTypeName = ecoreType.getName();
        
        if (currentEcoreTypeName == null) {
            if (ecoreType instanceof PrimitiveTypeImpl){
                currentEcoreTypeName = ((PrimitiveTypeImpl) ecoreType).eProxyURI().fragment();
            }else
                currentEcoreTypeName = ecoreType.eResource().getURI().fragment();
        }
        
       
        if ((ecoreType.eContainer() instanceof ModelImpl) 
                && ((ModelImpl) ecoreType.eContainer()).getName().equals("EcorePrimitiveTypes")){
            if (currentEcoreTypeName.equals(byteEcoreName)){
                return modelioTypes.getBYTE();
            }else if (currentEcoreTypeName.equals(dateEcoreName)){
                return modelioTypes.getDATE();
            }else if (currentEcoreTypeName.equals(doubleEcoreName)){
                return modelioTypes.getDOUBLE();
            }else if (currentEcoreTypeName.equals(floatEcoreName)){
                return modelioTypes.getFLOAT();
            }else if (currentEcoreTypeName.equals(longEcoreName)){
                return modelioTypes.getLONG();
            }else if (currentEcoreTypeName.equals(shortEcoreName)){
                return modelioTypes.getSHORT();
            }else if (currentEcoreTypeName.equals(charEcoreName)){
                return modelioTypes.getCHAR();
            }else if (currentEcoreTypeName.equals(eStringEcoreName)){
                return modelioTypes.getSTRING();
            }
        }
        
        if (currentEcoreTypeName != null) {
            currentEcoreTypeName = currentEcoreTypeName.toLowerCase();
            if (currentEcoreTypeName.equals(modelioTypes.getINTEGER().getName())){
                return modelioTypes.getINTEGER();
            }else if (currentEcoreTypeName.equals(modelioTypes.getBOOLEAN() .getName())){
                return modelioTypes.getBOOLEAN() ;
            }else if (currentEcoreTypeName.toLowerCase().equals(modelioTypes.getSTRING().getName())){
                return modelioTypes.getSTRING();
            }else if (currentEcoreTypeName.equals(modelioTypes.getBYTE().getName())){
                return modelioTypes.getBYTE();
            }else if (currentEcoreTypeName.equals(unlimitedNaturalName)){
                return modelioTypes.getINTEGER();
            }else if (currentEcoreTypeName.equals(modelioTypes.getDATE().getName())){
                return modelioTypes.getDATE();
            }else if (currentEcoreTypeName.equals(modelioTypes.getDOUBLE().getName())){
                return modelioTypes.getDOUBLE();
            }else if ((currentEcoreTypeName.equals(modelioTypes.getFLOAT().getName()))){
                return modelioTypes.getFLOAT();
            }else if (currentEcoreTypeName.equals(modelioTypes.getLONG().getName())){
                return modelioTypes.getLONG();
            }else if (currentEcoreTypeName.equals(modelioTypes.getSTRING().getName())){
                return modelioTypes.getSTRING();
            }else if (currentEcoreTypeName.equals(modelioTypes.getSHORT().getName())){
                return modelioTypes.getSHORT();
            }else if (currentEcoreTypeName.equals(modelioTypes.getCHAR().getName())){
                return modelioTypes.getCHAR();
            }else if (currentEcoreTypeName.equals(modelioTypes.getUNDEFINED().getName())){
                return modelioTypes.getUNDEFINED();
            }
        }
        return null;
    }
    
    /**
     * Test if a given Ecore org.eclipse.uml2.uml.Type is a Modelio Predefined org.eclipse.uml2.uml.Type
     * @param ecoreType : the tested Ecore org.eclipse.uml2.uml.Type
     * @return true if the Ecore org.eclipse.uml2.uml.Type corresponds to a Modelio Predefined org.eclipse.uml2.uml.Type
     */
    @objid ("ad653adc-02cd-4ba0-8dc3-58a3c958013f")
    public static boolean isPredefinedType(final org.eclipse.uml2.uml.Type ecoreType) {
        String ecoreTypeName = ecoreType.getName();
        ModelioTypes modelioTypes = ReverseProperties.getInstance().getModelioTypes();
        String ecoreContainerName = "";
        
        if (ecoreType.getPackage() != null)
            ecoreContainerName = ecoreType.getPackage().getName();
        
        if (ecoreTypeName == null) {
            if (ecoreType instanceof PrimitiveTypeImpl){
                ecoreTypeName = ((PrimitiveTypeImpl) ecoreType).eProxyURI().fragment();
                ecoreContainerName = ((PrimitiveTypeImpl) ecoreType).eProxyURI().lastSegment();
            }else if (ecoreType.eResource() != null)
                ecoreTypeName = ecoreType.eResource().getURI().fragment();
        }
        
        if (ecoreTypeName != null) {
        
            if (ecoreContainerName.contains("EcorePrimitiveTypes")){
                if ((ecoreTypeName.equals(byteEcoreName)) 
                        || (ecoreTypeName.equals(dateEcoreName))
                        || (ecoreTypeName.equals(doubleEcoreName))
                        || (ecoreTypeName.equals(floatEcoreName)) 
                        || (ecoreTypeName.equals(longEcoreName))
                        || (ecoreTypeName.equals(shortEcoreName))
                        || (ecoreTypeName.equals(charEcoreName))
                        || (ecoreTypeName.equals(eStringEcoreName))){
                    return true;
                }
            }

            ecoreTypeName = ecoreTypeName.toLowerCase();
                     
            return  (((ecoreType instanceof org.eclipse.uml2.uml.PrimitiveType) || (ecoreType instanceof org.eclipse.uml2.uml.DataType) ) 
                    && ((ecoreTypeName.equals(modelioTypes.getBOOLEAN() .getName()))
                    || (ecoreTypeName.equals(modelioTypes.getBYTE().getName()))
                    || (ecoreTypeName.equals(modelioTypes.getDATE().getName()))
                    || (ecoreTypeName.equals(modelioTypes.getDOUBLE().getName()))
                    || (ecoreTypeName.equals(modelioTypes.getFLOAT().getName()))
                    || (ecoreTypeName.equals(modelioTypes.getLONG().getName()))
                    || (ecoreTypeName.equals(modelioTypes.getSHORT().getName()))
                    || (ecoreTypeName.equals(modelioTypes.getCHAR().getName()))
                    || (ecoreTypeName.equals(modelioTypes.getINTEGER().getName()))
                    || (ecoreTypeName.equals(modelioTypes.getSTRING().getName()))
                    || (ecoreTypeName.equals(modelioTypes.getUNDEFINED().getName()))
                    || (ecoreTypeName.equals(integerEcoreName))
                    || (ecoreTypeName.equals(booleanEcoreName))
                    || (ecoreTypeName.equals(stringEcoreName))
                    || (ecoreTypeName.equals(unlimitedNaturalName))));
        }
        return false;
    }

    /**
     * @param ecoreType : the tested org.eclipse.uml2.uml.Type
     * @return true if the test org.eclipse.uml2.uml.Type is the Boolean org.eclipse.uml2.uml.Type
     */
    @objid ("9df119ba-8681-438e-a40d-cf2d78191a4c")
    public static boolean isBoolean(final org.eclipse.uml2.uml.Type ecoreType) {
        if (isPredefinedType(ecoreType)){
            DataType obType = getPredefinedType(ecoreType);
            return  (obType.equals(ReverseProperties.getInstance().getModelioTypes().getBOOLEAN() ));
        }
        return false;
    }

    


}
