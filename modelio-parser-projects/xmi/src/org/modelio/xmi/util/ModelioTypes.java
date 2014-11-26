package org.modelio.xmi.util;

import java.util.UUID;

import org.modelio.api.model.IUMLTypes;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * This class give access to UML types managed by Modelio.
 * 
 * <p>
 * The accessible types are boolean, char, integer, real, string, undefined.
 * </p>
 * 
 * <p>
 * undefined type is used to set a type to property when the real type of the property is not known. (A property should not be left
 * without type)
 * </p>
 * 
 */
public class ModelioTypes implements IUMLTypes{
     
    private IMModelServices mmServices = null;
    
    public ModelioTypes(IMModelServices mmServices){
        this.mmServices = mmServices;
    }
    
    
    @Override
    public DataType getBOOLEAN() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class), UUID.fromString("00000004-0000-0005-0000-000000000000"));
    }

 
    @Override
    public DataType getBYTE() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class), UUID.fromString("00000004-0000-0013-0000-000000000000"));
    }

    @Override
    public DataType getCHAR() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class), UUID.fromString("00000004-0000-0007-0000-000000000000"));
    }

  
    @Override
    public DataType getDATE() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class), UUID.fromString("00000004-0000-0014-0000-000000000000"));
    }

    @Override
    public DataType getDOUBLE() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class), UUID.fromString("00000004-0000-0010-0000-000000000000"));
    }

  
    @Override
    public DataType getFLOAT() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class), UUID.fromString("00000004-0000-000b-0000-000000000000"));
    }

   
    @Override
    public DataType getINTEGER() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class), UUID.fromString("00000004-0000-0009-0000-000000000000"));
    }


    @Override
    public DataType getLONG() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class), UUID.fromString("00000004-0000-0011-0000-000000000000"));
    }

 
    @Override
    public DataType getSHORT() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class),UUID.fromString("00000004-0000-0012-0000-000000000000"));
    }

    @Override
    public DataType getSTRING() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class), UUID.fromString("00000004-0000-000d-0000-000000000000"));
    }

    @Override
    public DataType getUNDEFINED() {
        return (DataType) this.mmServices.findById(SmClass.getClass(DataType.class), UUID.fromString("00000004-0000-000f-0000-000000000000"));
    }
    
   

}
