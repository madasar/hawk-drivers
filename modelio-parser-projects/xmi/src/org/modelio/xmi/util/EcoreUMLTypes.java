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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This class made the mapping between Modelio predefined type and Ecore org.eclipse.uml2.uml.DataType
 * @author ebrosse
 */
@objid ("c95fbb47-4279-43e8-9246-e58e1eea8df2")
public class EcoreUMLTypes {
    
    @objid ("9737a4ec-7ae5-4296-97f6-902da70b9161")
    private final String booleanEcoreName = "Boolean";

    @objid ("1c315c73-caa1-4a06-942f-0737c265e0dc")
    private final String integerEcoreName = "Integer";

    @objid ("20649c74-1e3f-4608-821a-0fac82d7b801")
    private final String stringEcoreName = "String";

    @objid ("47fc370e-7906-46d9-a95a-aa0bfd4ecf28")
    private final String unlimitedNaturalName = "UnlimitedNatural";


    @objid ("c23dc734-9c2c-49e9-9645-ca43ed54375e")
    private org.eclipse.uml2.uml.PrimitiveType BOOLEAN = null;

    @objid ("e2801d2a-b7ed-440b-8418-f2d6d3307d34")
    private org.eclipse.uml2.uml.PrimitiveType STRING = null;

    @objid ("53390db0-c195-45e1-8f53-55a0ecb7ac83")
    private org.eclipse.uml2.uml.PrimitiveType INTEGER = null;

    @objid ("1c2de596-f2fd-4ea3-9089-437009856f8f")
    private org.eclipse.uml2.uml.PrimitiveType UNLIMITED = null;
    
    
    public EcoreUMLTypes(){
    }
    
    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the String Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'String' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("05cfa059-696c-4710-97b8-875e02279080")
    public org.eclipse.uml2.uml.PrimitiveType getString() {
        if (this.STRING == null){        
            this.STRING = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getUMLLibrary().getOwnedType(this.stringEcoreName);
        }
        return this.STRING;
    }

    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Boolean Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Boolean' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("a070dc3e-82a5-4c32-b1f2-4fea1d490c64")
    public org.eclipse.uml2.uml.PrimitiveType getBoolean() {
        if (this.BOOLEAN == null){
            this.BOOLEAN = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getUMLLibrary().getOwnedType(this.booleanEcoreName);
        }
        return this.BOOLEAN;
    }

    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Integer Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Integer' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("807a7431-bcf6-406f-af1d-d03c2d7322d8")
    public org.eclipse.uml2.uml.PrimitiveType getInteger() {
        if (this.INTEGER == null){
            this.INTEGER = (org.eclipse.uml2.uml.PrimitiveType) UMLMetamodel.getInstance().getUMLLibrary().getOwnedType(this.integerEcoreName);
        }
        return this.INTEGER;
    }

    /**
     * This methods return the Ecore org.eclipse.uml2.uml.PrimitiveType associated to the Unlimited Modelio Predefined org.eclipse.uml2.uml.Type
     * @return the 'Unlimited' Ecore org.eclipse.uml2.uml.PrimitiveType
     */
    @objid ("f3c7fba2-57bb-46d4-bbf0-af6cccf94686")
    public org.eclipse.uml2.uml.PrimitiveType getUnlimitedNatural() {
        if (this.UNLIMITED == null){
            this.UNLIMITED = (org.eclipse.uml2.uml.PrimitiveType ) UMLMetamodel.getInstance().getUMLLibrary().getOwnedType(this.unlimitedNaturalName);
        }
        return this.UNLIMITED;
    }
    


}
