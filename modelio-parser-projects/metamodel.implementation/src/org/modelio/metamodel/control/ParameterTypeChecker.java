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
                                    

package org.modelio.metamodel.control;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Implements type checking for the Parameter.Type meta-association.
 */
@objid ("526ea6d0-ec3b-11e1-91c5-002564c97630")
public class ParameterTypeChecker extends AbstractDependencyTypeChecker {
    @objid ("02fe415a-f027-11e1-8bdc-002564c97630")
    private final SmClass enumerationID = SmClass.getClass(Enumeration.class);

    @objid ("02fe4160-f027-11e1-8bdc-002564c97630")
    private final SmClass templateParameterID = SmClass.getClass(TemplateParameter.class);

    @objid ("02fe4156-f027-11e1-8bdc-002564c97630")
    private final SmClass dataTypeID = SmClass.getClass(DataType.class);

    @objid ("02fe415e-f027-11e1-8bdc-002564c97630")
    private final SmClass componentID = SmClass.getClass(Component.class);

    @objid ("02fe415c-f027-11e1-8bdc-002564c97630")
    private final SmClass classID = SmClass.getClass(Class.class);

    @objid ("02fe4158-f027-11e1-8bdc-002564c97630")
    private final SmClass interfaceID = SmClass.getClass(Interface.class);

    @objid ("cd955be1-ec4a-11e1-91c5-002564c97630")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        if (value != null) {
            SmClass valueTypeID = value.getClassOf();
        
            // A Parameter type must be to a Class, a Component, an Interface, a
            // DataType, a TemplateParameter or an Enumeration.
            return (valueTypeID == this.classID 
                    || valueTypeID == this.componentID 
                    || valueTypeID == this.interfaceID
                    || valueTypeID == this.enumerationID 
                    || valueTypeID == this.dataTypeID 
                    || valueTypeID == this.templateParameterID) ? ControlErrorCodes.NO_ERROR
                    : ControlErrorCodes.PARAMETER_INVALID_TYPE;
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("cd955bea-ec4a-11e1-91c5-002564c97630")
    @Override
    public void register() {
        register("Parameter", "Type");
        new GeneralClassOccurenceChecker(this).register();
    }

    /**
     * Implements type checking for the GeneralClass.Occurence meta-association.
     */
    @objid ("5eef1750-ec3b-11e1-91c5-002564c97630")
    static class GeneralClassOccurenceChecker extends AbstractDependencyTypeChecker {
        @objid ("cd955bef-ec4a-11e1-91c5-002564c97630")
         ParameterTypeChecker symetricChecker;

        @objid ("cd955bf0-ec4a-11e1-91c5-002564c97630")
        public GeneralClassOccurenceChecker(ParameterTypeChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("cd955bf3-ec4a-11e1-91c5-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("cd955bfc-ec4a-11e1-91c5-002564c97630")
        @Override
        public void register() {
            register("GeneralClass", "Occurence");
        }

    }

}
