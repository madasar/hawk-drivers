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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Implements type checking for the CollaborationUse.NRepresented meta-association.
 */
@objid ("e0a86f22-ecfb-11e1-91c5-002564c97630")
public class CollaborationUseNRepresentedChecker extends AbstractDependencyTypeChecker {
    @objid ("02f6a02e-f027-11e1-8bdc-002564c97630")
    private final SmClass actorID = SmClass.getClass(Actor.class);

    @objid ("02f6a02c-f027-11e1-8bdc-002564c97630")
    private final SmClass useCaseID = SmClass.getClass(UseCase.class);

    @objid ("02f6a020-f027-11e1-8bdc-002564c97630")
    private final SmClass nodeID = SmClass.getClass(Node.class);

    @objid ("02f6a030-f027-11e1-8bdc-002564c97630")
    private final SmClass collaborationID = SmClass.getClass(Collaboration.class);

    @objid ("02f6a026-f027-11e1-8bdc-002564c97630")
    private final SmClass templateParameterID = SmClass.getClass(TemplateParameter.class);

    @objid ("02f6a022-f027-11e1-8bdc-002564c97630")
    private final SmClass classID = SmClass.getClass(Class.class);

    @objid ("02f6a02a-f027-11e1-8bdc-002564c97630")
    private final SmClass signalID = SmClass.getClass(Signal.class);

    @objid ("02f6a024-f027-11e1-8bdc-002564c97630")
    private final SmClass componentID = SmClass.getClass(Component.class);

    @objid ("02f6a028-f027-11e1-8bdc-002564c97630")
    private final SmClass packageID = SmClass.getClass(Package.class);

    @objid ("e4c440cc-ecfb-11e1-91c5-002564c97630")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        if (value != null) {
            SmClass valueTypeID = value.getClassOf();
        
            // A CollaborationUse must be owned by a node, a Class, a Component,
            // a TemplateParameter, a Package, a Signal, a useCase, an Actor or
            // a Collaboration.
            return (valueTypeID == this.packageID || valueTypeID == this.nodeID || valueTypeID == this.signalID
                    || valueTypeID == this.useCaseID || valueTypeID == this.actorID || valueTypeID == this.classID
                    || valueTypeID == this.componentID || valueTypeID == this.templateParameterID || valueTypeID == this.collaborationID) ? ControlErrorCodes.NO_ERROR
                    : ControlErrorCodes.COLLABORATIONUSE_INVALID_NREPRESENTED;
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("e4c5c76a-ecfb-11e1-91c5-002564c97630")
    @Override
    public void register() {
        register("CollaborationUse", "NRepresented");
        new NameSpaceOwnedCollaborationUseChecker(this).register();
    }

    /**
     * Implements type checking for the NameSpace.OwnedCollaborationUse meta-association.
     */
    @objid ("e4c5c76d-ecfb-11e1-91c5-002564c97630")
    static class NameSpaceOwnedCollaborationUseChecker extends AbstractDependencyTypeChecker {
        @objid ("e4c5c770-ecfb-11e1-91c5-002564c97630")
         CollaborationUseNRepresentedChecker symetricChecker;

        @objid ("e4c5c771-ecfb-11e1-91c5-002564c97630")
        public NameSpaceOwnedCollaborationUseChecker(CollaborationUseNRepresentedChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("e4c5c774-ecfb-11e1-91c5-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("e4c5c77d-ecfb-11e1-91c5-002564c97630")
        @Override
        public void register() {
            register("NameSpace", "OwnedCollaborationUse");
        }

    }

}
