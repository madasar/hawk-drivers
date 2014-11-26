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
 * Implements type checking for the TemplateParameter.Parametrized meta-association.
 */
@objid ("b707a46a-ec6f-11e1-91c5-002564c97630")
public class TemplateParameterParametrizedChecker extends AbstractDependencyTypeChecker {
    @objid ("0305e27a-f027-11e1-8bdc-002564c97630")
    private final SmClass nodeID = SmClass.getClass(Node.class);

    @objid ("0305e27c-f027-11e1-8bdc-002564c97630")
    private final SmClass packageID = SmClass.getClass(Package.class);

    @objid ("03045bd3-f027-11e1-8bdc-002564c97630")
    private final SmClass classID = SmClass.getClass(Class.class);

    @objid ("03045bd5-f027-11e1-8bdc-002564c97630")
    private final SmClass collaborationID = SmClass.getClass(Collaboration.class);

    @objid ("0305e278-f027-11e1-8bdc-002564c97630")
    private final SmClass interfaceID = SmClass.getClass(Interface.class);

    @objid ("0305e272-f027-11e1-8bdc-002564c97630")
    private final SmClass componentID = SmClass.getClass(Component.class);

    @objid ("0305e280-f027-11e1-8bdc-002564c97630")
    private final SmClass useCaseID = SmClass.getClass(UseCase.class);

    @objid ("0305e276-f027-11e1-8bdc-002564c97630")
    private final SmClass enumerationID = SmClass.getClass(Enumeration.class);

    @objid ("03045bd1-f027-11e1-8bdc-002564c97630")
    private final SmClass artifactID = SmClass.getClass(Artifact.class);

    @objid ("0305e274-f027-11e1-8bdc-002564c97630")
    private final SmClass dataTypeID = SmClass.getClass(DataType.class);

    @objid ("0305e27e-f027-11e1-8bdc-002564c97630")
    private final SmClass signalID = SmClass.getClass(Signal.class);

    @objid ("b9ca795a-ec6f-11e1-91c5-002564c97630")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        if (value != null) {
            SmClass valueTypeID = value.getClassOf();
        
            // A TemplateParameter can only be part of a Package, a
            // Collaboration, a Node, a Signal, an Interface, an Enumeration, a
            // DataType, a Class, a Component, an Artifact or a UseCase.
            return (valueTypeID == this.packageID || valueTypeID == this.collaborationID || valueTypeID == this.nodeID
                    || valueTypeID == this.signalID || valueTypeID == this.interfaceID || valueTypeID == this.enumerationID
                    || valueTypeID == this.dataTypeID || valueTypeID == this.classID || valueTypeID == this.componentID
                    || valueTypeID == this.artifactID || valueTypeID == this.useCaseID) ? ControlErrorCodes.NO_ERROR
                    : ControlErrorCodes.TEMPLATEPARAMETER_INVALID_PARAMETRIZED;
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("b9ca7963-ec6f-11e1-91c5-002564c97630")
    @Override
    public void register() {
        register("TemplateParameter", "Parameterized");
        new NameSpaceTemplateChecker(this).register();
    }

    /**
     * Implements type checking for the NameSpace.Template meta-association.
     */
    @objid ("b9ca7966-ec6f-11e1-91c5-002564c97630")
    static class NameSpaceTemplateChecker extends AbstractDependencyTypeChecker {
        @objid ("b9ca7969-ec6f-11e1-91c5-002564c97630")
         TemplateParameterParametrizedChecker symetricChecker;

        @objid ("b9ca796a-ec6f-11e1-91c5-002564c97630")
        public NameSpaceTemplateChecker(TemplateParameterParametrizedChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("b9ca796d-ec6f-11e1-91c5-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("b9ca7976-ec6f-11e1-91c5-002564c97630")
        @Override
        public void register() {
            register("NameSpace", "Template");
        }

    }

}
