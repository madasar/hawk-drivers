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
 * Implements type checking for the RaisedException.ThrownType meta-association.
 */
@objid ("b273d66a-ec6f-11e1-91c5-002564c97630")
public class RaisedExceptionThrownTypeChecker extends AbstractDependencyTypeChecker {
    @objid ("02ffc7ee-f027-11e1-8bdc-002564c97630")
    private final SmClass enumerationID = SmClass.getClass(Enumeration.class);

    @objid ("02ffc7f4-f027-11e1-8bdc-002564c97630")
    private final SmClass templateParameterID = SmClass.getClass(TemplateParameter.class);

    @objid ("02ffc7ea-f027-11e1-8bdc-002564c97630")
    private final SmClass dataTypeID = SmClass.getClass(DataType.class);

    @objid ("02ffc7f2-f027-11e1-8bdc-002564c97630")
    private final SmClass componentID = SmClass.getClass(Component.class);

    @objid ("02ffc7f0-f027-11e1-8bdc-002564c97630")
    private final SmClass classID = SmClass.getClass(Class.class);

    @objid ("02ffc7ec-f027-11e1-8bdc-002564c97630")
    private final SmClass interfaceID = SmClass.getClass(Interface.class);

    @objid ("b3b12278-ec6f-11e1-91c5-002564c97630")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        if (value != null) {
            SmClass valueTypeID = value.getClassOf();
        
            // A RaisedException type must be to a Class, a Component, an
            // Interface, a DataType, a TemplateParameter or an Enumeration.
            return (valueTypeID == this.classID || valueTypeID == this.componentID || valueTypeID == this.interfaceID
                    || valueTypeID == this.enumerationID || valueTypeID == this.dataTypeID || valueTypeID == this.templateParameterID) ? ControlErrorCodes.NO_ERROR
                    : ControlErrorCodes.RAISEDEXCEPTION_INVALID_THROWNTYPE;
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("b3b12281-ec6f-11e1-91c5-002564c97630")
    @Override
    public void register() {
        register("RaisedException", "ThrownType");
        new ClassifierThrowingChecker(this).register();
    }

    /**
     * Implements type checking for the Classifier.Throwing meta-association.
     */
    @objid ("b3b12284-ec6f-11e1-91c5-002564c97630")
    static class ClassifierThrowingChecker extends AbstractDependencyTypeChecker {
        @objid ("b3b12287-ec6f-11e1-91c5-002564c97630")
         RaisedExceptionThrownTypeChecker symetricChecker;

        @objid ("b3b2a898-ec6f-11e1-91c5-002564c97630")
        public ClassifierThrowingChecker(RaisedExceptionThrownTypeChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("b3b2a89b-ec6f-11e1-91c5-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("b3b2a8a4-ec6f-11e1-91c5-002564c97630")
        @Override
        public void register() {
            register("Classifier", "Throwing");
        }

    }

}
