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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Implements type checking for the TemplateBinding.BoundElement meta-association.
 */
@objid ("e8769c63-ec50-11e1-91c5-002564c97630")
public class TemplateBindingBoundElementChecker extends AbstractDependencyTypeChecker {
    @objid ("0302d54e-f027-11e1-8bdc-002564c97630")
    private final SmClass nodeID = SmClass.getClass(Node.class);

    @objid ("0302d550-f027-11e1-8bdc-002564c97630")
    private final SmClass packageID = SmClass.getClass(Package.class);

    @objid ("0302d542-f027-11e1-8bdc-002564c97630")
    private final SmClass classID = SmClass.getClass(Class.class);

    @objid ("0302d544-f027-11e1-8bdc-002564c97630")
    private final SmClass collaborationID = SmClass.getClass(Collaboration.class);

    @objid ("0302d54c-f027-11e1-8bdc-002564c97630")
    private final SmClass interfaceID = SmClass.getClass(Interface.class);

    @objid ("0302d546-f027-11e1-8bdc-002564c97630")
    private final SmClass componentID = SmClass.getClass(Component.class);

    @objid ("0302d554-f027-11e1-8bdc-002564c97630")
    private final SmClass useCaseID = SmClass.getClass(UseCase.class);

    @objid ("0302d54a-f027-11e1-8bdc-002564c97630")
    private final SmClass enumerationID = SmClass.getClass(Enumeration.class);

    @objid ("0302d540-f027-11e1-8bdc-002564c97630")
    private final SmClass artifactID = SmClass.getClass(Artifact.class);

    @objid ("0302d548-f027-11e1-8bdc-002564c97630")
    private final SmClass dataTypeID = SmClass.getClass(DataType.class);

    @objid ("0302d552-f027-11e1-8bdc-002564c97630")
    private final SmClass signalID = SmClass.getClass(Signal.class);

    @objid ("ea01823a-ec50-11e1-91c5-002564c97630")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        if (value != null) {
            SmClass valueTypeID = value.getClassOf();
        
            // A TemplateBinding can only be part of a Package, a Collaboration,
            // a Node, a Signal, an Interface, an Enumeration, a DataType, a
            // Class, a Component, an Artifact or a UseCase.
            return (valueTypeID == this.packageID || valueTypeID == this.collaborationID || valueTypeID == this.nodeID
                    || valueTypeID == this.signalID || valueTypeID == this.interfaceID || valueTypeID == this.enumerationID
                    || valueTypeID == this.dataTypeID || valueTypeID == this.classID || valueTypeID == this.componentID
                    || valueTypeID == this.artifactID || valueTypeID == this.useCaseID) ? ControlErrorCodes.NO_ERROR
                    : ControlErrorCodes.TEMPLATEBINDING_INVALID_BOUNDELEMENT;
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("ea018243-ec50-11e1-91c5-002564c97630")
    @Override
    public void register() {
        register("TemplateBinding", "BoundElement");
        new NameSpaceDeclaredChecker(this).register();
    }

    /**
     * Implements type checking for the NameSpace.Declared meta-association.
     */
    @objid ("ea0308c4-ec50-11e1-91c5-002564c97630")
    static class NameSpaceDeclaredChecker extends AbstractDependencyTypeChecker {
        @objid ("ea0308c7-ec50-11e1-91c5-002564c97630")
         TemplateBindingBoundElementChecker symetricChecker;

        @objid ("ea0308c8-ec50-11e1-91c5-002564c97630")
        public NameSpaceDeclaredChecker(TemplateBindingBoundElementChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("ea0308cb-ec50-11e1-91c5-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("ea0308d4-ec50-11e1-91c5-002564c97630")
        @Override
        public void register() {
            register("NameSpace", "Declared");
        }

    }

}
