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
 * Implements type checking for the Attribute.Type meta-association.
 */
@objid ("a2ef7f9d-ec6f-11e1-91c5-002564c97630")
public class AttributeTypeChecker extends AbstractDependencyTypeChecker {
    @objid ("02f0859a-f027-11e1-8bdc-002564c97630")
    private final SmClass enumerationID = SmClass.getClass(Enumeration.class);

    @objid ("02f085a0-f027-11e1-8bdc-002564c97630")
    private final SmClass templateParameterID = SmClass.getClass(TemplateParameter.class);

    @objid ("02f08596-f027-11e1-8bdc-002564c97630")
    private final SmClass dataTypeID = SmClass.getClass(DataType.class);

    @objid ("02f0859e-f027-11e1-8bdc-002564c97630")
    private final SmClass componentID = SmClass.getClass(Component.class);

    @objid ("02f0859c-f027-11e1-8bdc-002564c97630")
    private final SmClass classID = SmClass.getClass(Class.class);

    @objid ("02f08598-f027-11e1-8bdc-002564c97630")
    private final SmClass interfaceID = SmClass.getClass(Interface.class);

    /**
     * C'tor
     */
    @objid ("a4aa2123-ec6f-11e1-91c5-002564c97630")
    public AttributeTypeChecker() {
    }

    @objid ("a4aa2125-ec6f-11e1-91c5-002564c97630")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        if (value != null) {
            SmClass valueTypeID = value.getClassOf();
        
            // A Attribute type must be to a Class, a Component, an Interface, a
            // DataType, a TemplateParameter or an Enumeration.
            return (valueTypeID == this.classID || valueTypeID == this.componentID || valueTypeID == this.interfaceID
                    || valueTypeID == this.enumerationID || valueTypeID == this.dataTypeID || valueTypeID == this.templateParameterID) ? ControlErrorCodes.NO_ERROR
                    : ControlErrorCodes.ATTRIBUTE_INVALID_TYPE;
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("a4aa212e-ec6f-11e1-91c5-002564c97630")
    @Override
    public void register() {
        register("Attribute", "Type");
        new GeneralClassObjectChecker(this).register();
    }

    /**
     * Implements type checking for the GeneralClass.Object meta-association.
     */
    @objid ("a4aa2131-ec6f-11e1-91c5-002564c97630")
    static class GeneralClassObjectChecker extends AbstractDependencyTypeChecker {
        @objid ("a4aa2134-ec6f-11e1-91c5-002564c97630")
         AttributeTypeChecker symetricChecker;

        @objid ("a4aa2135-ec6f-11e1-91c5-002564c97630")
        public GeneralClassObjectChecker(AttributeTypeChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("a4aa2138-ec6f-11e1-91c5-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("a4aba741-ec6f-11e1-91c5-002564c97630")
        @Override
        public void register() {
            register("GeneralClass", "Object");
        }

    }

}
