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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Implements type checking for the Instance.Owner meta-association.
 */
@objid ("c268ce02-ec4a-11e1-91c5-002564c97630")
public class InstanceOwnerChecker extends AbstractDependencyTypeChecker {
    @objid ("02fb340a-f027-11e1-8bdc-002564c97630")
    private final SmClass collaborationID = SmClass.getClass(Collaboration.class);

    @objid ("02fb3408-f027-11e1-8bdc-002564c97630")
    private final SmClass bindableInstanceID = SmClass.getClass(BindableInstance.class);

    @objid ("cac56259-ec4a-11e1-91c5-002564c97630")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        if (value != null) {
            SmClass valueTypeID = value.getClassOf();
        
            if (obj.getClassOf() == this.bindableInstanceID) {
                // A BindableInstance can only be part of a Collaboration with
                // the Owner relationship.
                return (valueTypeID == this.collaborationID) ? ControlErrorCodes.NO_ERROR : ControlErrorCodes.BINDABLEINSTANCE_INVALIDOWNER;
            }
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("cac56262-ec4a-11e1-91c5-002564c97630")
    @Override
    public void register() {
        register("Instance", "Owner");
        new NameSpaceDeclaredChecker(this).register();
    }

    /**
     * Implements type checking for the NameSpace.Declared meta-association.
     */
    @objid ("cac56265-ec4a-11e1-91c5-002564c97630")
    static class NameSpaceDeclaredChecker extends AbstractDependencyTypeChecker {
        @objid ("cac56268-ec4a-11e1-91c5-002564c97630")
         InstanceOwnerChecker symetricChecker;

        @objid ("cac56269-ec4a-11e1-91c5-002564c97630")
        public NameSpaceDeclaredChecker(InstanceOwnerChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("cac5626c-ec4a-11e1-91c5-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("cac56275-ec4a-11e1-91c5-002564c97630")
        @Override
        public void register() {
            register("NameSpace", "Declared");
        }

    }

}
