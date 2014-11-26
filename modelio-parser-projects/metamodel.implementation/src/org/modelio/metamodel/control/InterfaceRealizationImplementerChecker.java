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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Implements type checking for the InterfaceRealization.Implementer meta-association.
 */
@objid ("00634156-5404-1fdf-a6ee-001ec947cd2a")
public class InterfaceRealizationImplementerChecker extends AbstractDependencyTypeChecker {
    @objid ("02fb340d-f027-11e1-8bdc-002564c97630")
    private final SmClass collaborationID = SmClass.getClass(Collaboration.class);

    @objid ("02fb340f-f027-11e1-8bdc-002564c97630")
    private final SmClass componentID = SmClass.getClass(Component.class);

    @objid ("02fb3411-f027-11e1-8bdc-002564c97630")
    private final SmClass enumerationID = SmClass.getClass(Enumeration.class);

    @objid ("02fb3413-f027-11e1-8bdc-002564c97630")
    private final SmClass classID = SmClass.getClass(Class.class);

    @objid ("00649664-5404-1fdf-a6ee-001ec947cd2a")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        if (value != null) {
            SmClass valueTypeID = value.getClassOf();
        
            // An InterfaceRealization must belong to a Class, a Collaboration,
            // an Enumeration or a Component.
            return (valueTypeID == this.classID 
                    || valueTypeID == this.collaborationID 
                    || valueTypeID == this.enumerationID 
                    || valueTypeID == this.componentID) 
                    ? ControlErrorCodes.NO_ERROR
                    : ControlErrorCodes.INTERFACEREALIZATION_INVALID_IMPLEMENTER;
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("0064efba-5404-1fdf-a6ee-001ec947cd2a")
    @Override
    public void register() {
        register("InterfaceRealization", "Implementer");
        new NameSpaceRealizedChecker(this).register();
    }

    /**
     * Implements type checking for the NameSpace.Realized meta-association.
     */
    @objid ("7ddd9bf1-ec3a-11e1-91c5-002564c97630")
    static class NameSpaceRealizedChecker extends AbstractDependencyTypeChecker {
        @objid ("7ddf2292-ec3a-11e1-91c5-002564c97630")
         InterfaceRealizationImplementerChecker symetricChecker;

        @objid ("7ddf2293-ec3a-11e1-91c5-002564c97630")
        public NameSpaceRealizedChecker(InterfaceRealizationImplementerChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("7ddf2296-ec3a-11e1-91c5-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("7ddf229f-ec3a-11e1-91c5-002564c97630")
        @Override
        public void register() {
            register("NameSpace", "Realized");
        }

    }

}
