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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Implements type checking for the ConnectorEnd.RepresentedFeature meta-association.
 */
@objid ("ea2282eb-ec70-11e1-91c5-002564c97630")
public class ConnectorEndRepresentedFeatureChecker extends AbstractDependencyTypeChecker {
    @objid ("02f826c3-f027-11e1-8bdc-002564c97630")
    private final SmClass associationEndID = SmClass.getClass(AssociationEnd.class);

    @objid ("02f826c1-f027-11e1-8bdc-002564c97630")
    private final SmClass attributeID = SmClass.getClass(Attribute.class);

    @objid ("02f826c5-f027-11e1-8bdc-002564c97630")
    private final SmClass linkEndID = SmClass.getClass(LinkEnd.class);

    @objid ("ea2282f0-ec70-11e1-91c5-002564c97630")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        if (value != null) {
            SmClass valueTypeID = value.getClassOf();
        
            // A ConnectorEnd type must represent an Attribute, an
            // AssociationEnd or a LinkEnd
            return (valueTypeID == this.attributeID || valueTypeID == this.associationEndID || valueTypeID == this.linkEndID) ? ControlErrorCodes.NO_ERROR
                    : ControlErrorCodes.CONNECTOREND_INVALID_REPRESENTEDFEATURE;
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("ea2282f1-ec70-11e1-91c5-002564c97630")
    @Override
    public void register() {
        register("ConnectorEnd", "RepresentedFeature");
        new ModelElementRepresentedEndChecker(this).register();
    }

    /**
     * Implements type checking for the ModelElement.RepresentedEnd meta-association.
     */
    @objid ("ea2282ec-ec70-11e1-91c5-002564c97630")
    static class ModelElementRepresentedEndChecker extends AbstractDependencyTypeChecker {
        @objid ("ea2282ed-ec70-11e1-91c5-002564c97630")
         ConnectorEndRepresentedFeatureChecker symetricChecker;

        @objid ("ea2282f2-ec70-11e1-91c5-002564c97630")
        public ModelElementRepresentedEndChecker(ConnectorEndRepresentedFeatureChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("ea2282f3-ec70-11e1-91c5-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("ea2282f4-ec70-11e1-91c5-002564c97630")
        @Override
        public void register() {
            register("ModelElement", "RepresentingEnd");
        }

    }

}
