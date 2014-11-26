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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.xmi.api.FormatExport;
import org.modelio.xmi.generation.GenerationProperties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class made the mapping between Modelio predefined type and Ecore org.eclipse.uml2.uml.DataType
 * @author ebrosse
 */
@objid ("c95fbb47-4279-43e8-9246-e58e1eea8df2")
public class EcoreTypes {
    
    private FormatExport formatExport = null;
    
    @objid ("952c3a04-ffc4-471b-8a04-762e207b7fb5")
    private final String byteEcoreName = "EByte";

    @objid ("201b22c2-3d35-4c4b-aacd-e908d6395572")
    private final String charEcoreName = "EChar";

    @objid ("72882c99-8b24-4c8a-99d7-d4f6d8e00c00")
    private final String dateEcoreName = "EDate";

    @objid ("313eafe8-9704-4f29-b6cf-4940dbf14f5a")
    private final String doubleEcoreName = "EDouble";

    @objid ("02eb97ce-ca85-4e18-847c-1c1ab96622fc")
    private final String floatEcoreName = "EFloat";

    @objid ("b2dc5b5d-ca1c-4c44-a0a9-9867312243a9")
    private final String longEcoreName = "ELong";

    @objid ("9ef70033-a28d-4e4d-b521-d0e162574fc4")
    private final String shortEcoreName = "EShort";

    @objid ("ea81f12d-fe85-4953-9cf7-a6e2ecb953a2")
    private final String eStringEcoreName = "EString";

    @objid ("652a94e7-9949-418a-885d-5c013fc36be1")
    private List<org.eclipse.uml2.uml.PrimitiveType> predefinedType = new ArrayList<>();

    @objid ("2f6ac003-73f4-449b-a322-742e2e1d9553")
    private org.eclipse.uml2.uml.PrimitiveType BYTE = null;
    
    private org.eclipse.uml2.uml.PrimitiveType ESTRING = null;

    @objid ("e836709e-8f2c-43b7-b6f6-69c5adeedec1")
    private org.eclipse.uml2.uml.PrimitiveType CHAR = null;

    @objid ("df3028d3-2308-4fff-8a06-f23f64f4b197")
    private org.eclipse.uml2.uml.PrimitiveType DATE = null;

    @objid ("fd7a0c02-f4dd-4ca1-8852-173e81858a14")
    private org.eclipse.uml2.uml.PrimitiveType DOUBLE = null;

    @objid ("c268c1d4-12ca-4182-803c-5b21f3eaf860")
    private org.eclipse.uml2.uml.PrimitiveType FLOAT = null;

    @objid ("b1ec4208-51f6-437c-b0cb-80807ceca4bb")
    private org.eclipse.uml2.uml.PrimitiveType LONG = null;

    @objid ("19050c46-42ff-4007-94b4-963605c24aa8")
    private org.eclipse.uml2.uml.PrimitiveType SHORT = null;

    @objid ("345156ef-4d29-4bc0-b38d-999c4219140d")
    private org.eclipse.uml2.uml.PrimitiveType UNDEFINED = null;

    public EcoreTypes(FormatExport formatExport){
        this.formatExport = formatExport;
    }
    
    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Byte Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Byte' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("db07f430-b3cf-4902-934b-6650b56b4350")
    public org.eclipse.uml2.uml.PrimitiveType getByte() {
        if (this.BYTE == null){
            if (this.formatExport.equals(FormatExport.EMF300)){
                this.BYTE = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getEcoreLibrary().getOwnedType(this.byteEcoreName);
            }else{
                this.BYTE = UMLFactory.eINSTANCE.createPrimitiveType();
                this.BYTE.setName(GenerationProperties.getInstance().getModelioTypes().getBYTE().getName());
                this.predefinedType.add(this.BYTE);
            }
        
        }
        return this.BYTE;
    }

    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Char Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Char' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("9c7385d9-ef96-4cad-a327-d5828d75b558")
    public org.eclipse.uml2.uml.PrimitiveType getChar() {
        if (this.CHAR == null){      
            if (this.formatExport.equals(FormatExport.EMF300)){
                this.CHAR = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getEcoreLibrary().getOwnedType(this.charEcoreName);
            }else{
                this.CHAR = UMLFactory.eINSTANCE.createPrimitiveType();
                this.CHAR.setName(GenerationProperties.getInstance().getModelioTypes().getCHAR().getName());
                this.predefinedType.add(this.CHAR);
            }
        }
        return this.CHAR;
    }

    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Date Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Date' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("e4f970c2-75bb-4cf2-bb0c-eee80c70ed01")
    public org.eclipse.uml2.uml.PrimitiveType getDate() {
        if (this.DATE == null){
            if (this.formatExport.equals(FormatExport.EMF300)){
                this.DATE = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getEcoreLibrary().getOwnedType(this.dateEcoreName);
            }else{
                this.DATE = UMLFactory.eINSTANCE.createPrimitiveType();
                this.DATE.setName(GenerationProperties.getInstance().getModelioTypes().getDATE().getName());
                this.predefinedType.add(this.DATE);
            }
        }
        return this.DATE;
    }

    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Double Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Double' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("01ddc61a-fc66-48bd-aa16-6e9c3029da6a")
    public org.eclipse.uml2.uml.PrimitiveType getDouble() {
        if (this.DOUBLE == null){
            if (this.formatExport.equals(FormatExport.EMF300)){
                this.DOUBLE = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getEcoreLibrary().getOwnedType(this.doubleEcoreName);
            }else{
                this.DOUBLE = UMLFactory.eINSTANCE.createPrimitiveType();
                this.DOUBLE.setName(GenerationProperties.getInstance().getModelioTypes().getDOUBLE().getName());
                this.predefinedType.add(this.DOUBLE);
            }
        }
        return this.DOUBLE;
    }

    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Float Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Float' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("67473aee-9a8e-4c2a-9352-eba81a7dc2c7")
    public org.eclipse.uml2.uml.PrimitiveType getFloat() {
        if (this.FLOAT == null){
            if (this.formatExport.equals(FormatExport.EMF300)){
                this. FLOAT = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getEcoreLibrary().getOwnedType(this.floatEcoreName);
            }else{
                this.FLOAT = UMLFactory.eINSTANCE.createPrimitiveType();
                this.FLOAT.setName(GenerationProperties.getInstance().getModelioTypes().getFLOAT().getName());
                this.predefinedType.add(this.FLOAT);
            }
        }
        return this.FLOAT;
    }

    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Long Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Long' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("5950840e-d409-4079-a796-70b5903e1c8e")
    public org.eclipse.uml2.uml.PrimitiveType getLong() {
        if (this.LONG == null){
            if (this.formatExport.equals(FormatExport.EMF300)){
                this.LONG = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getEcoreLibrary().getOwnedType(this.longEcoreName);
            }else{
                this.LONG = UMLFactory.eINSTANCE.createPrimitiveType();
                this.LONG.setName(GenerationProperties.getInstance().getModelioTypes().getLONG().getName());
                this.predefinedType.add(this.LONG);
            }
        }
        return this.LONG;
    }


    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Short Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Short' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("09d854ea-9f2a-484e-9d0b-5736fca74b1b")
    public org.eclipse.uml2.uml.PrimitiveType getShort() {
        if (this.SHORT == null){
            if (this.formatExport.equals(FormatExport.EMF300)){
                this.SHORT = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getEcoreLibrary().getOwnedType(this.shortEcoreName);
            }else{
                this. SHORT = UMLFactory.eINSTANCE.createPrimitiveType();
                this.SHORT.setName(GenerationProperties.getInstance().getModelioTypes().getSHORT().getName());
                this.predefinedType.add(this.SHORT);
            }
        }
        return this.SHORT;
    }

    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Undefined Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Undefined' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("d92d6b3e-e3e9-4546-b4c7-e95edfcd3d3e")
    public org.eclipse.uml2.uml.PrimitiveType getUndefined() {
        if (this.UNDEFINED == null){
            this.UNDEFINED = UMLFactory.eINSTANCE.createPrimitiveType();
            this.UNDEFINED.setName(GenerationProperties.getInstance().getModelioTypes().getUNDEFINED().getName());
            this.predefinedType.add(this.UNDEFINED);
        }
        return this.UNDEFINED;
    }

    /**
     * This method returns a list containing all Ecore Predefined org.eclipse.uml2.uml.Type
     * @return the list of all Ecore Predefined org.eclipse.uml2.uml.Type
     */
    @objid ("f92842c3-3787-4912-b382-76db01c42341")
    public List<org.eclipse.uml2.uml.PrimitiveType> getPredifinedTypeList() {
        return this.predefinedType;
    }

  

    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the String Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'String' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("be15c4e5-7396-465d-962b-e53d003cdc75")
    public org.eclipse.uml2.uml.PrimitiveType getEString() {
        if (this.ESTRING == null){        
            this.ESTRING = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getEcoreLibrary().getOwnedType(this.eStringEcoreName);
        }
        return this.ESTRING;
    }
    


}
