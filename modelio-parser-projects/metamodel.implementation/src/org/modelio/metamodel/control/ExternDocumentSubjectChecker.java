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
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Implements type checking for the ExternDocument.Subject meta-association.
 */
@objid ("8aa662b9-f025-11e1-8bdc-002564c97630")
public class ExternDocumentSubjectChecker extends AbstractDependencyTypeChecker {
    @objid ("02f392e6-f027-11e1-8bdc-002564c97630")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        ExternDocument externDocument = (ExternDocument) obj;
        
        if (value != null) {
            SmClass cls = value.getClassOf();
            ExternDocumentType type = externDocument.getType();
            if (type != null && !type.isShell()) {
                SmClass steClass = getBaseClass(type.getOwnerReference(), type.getOwnerStereotype());
        
                return (cls.hasBase(steClass)) ? ControlErrorCodes.NO_ERROR
                        : ControlErrorCodes.EXTERNDOCUMENT_INCOMPATIBLE_METACLASS;
            }
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("02f392ef-f027-11e1-8bdc-002564c97630")
    private static SmClass getBaseClass(MetaclassReference classRef, Stereotype ste) {
        if (ste != null) {
            return SmClass.getClass(ste.getBaseClassName());
        } else {
            return SmClass.getClass(classRef.getReferencedClassName());
        }
    }

    @objid ("02f51983-f027-11e1-8bdc-002564c97630")
    @Override
    public void register() {
        register("ExternDocument", "Subject");
        new ModelElementDocumentChecker(this).register();
    }

    /**
     * Implements type checking for the ModelElement.Document meta-association.
     */
    @objid ("02f51986-f027-11e1-8bdc-002564c97630")
    static class ModelElementDocumentChecker extends AbstractDependencyTypeChecker {
        @objid ("02f51989-f027-11e1-8bdc-002564c97630")
         ExternDocumentSubjectChecker symetricChecker;

        @objid ("02f5198a-f027-11e1-8bdc-002564c97630")
        public ModelElementDocumentChecker(ExternDocumentSubjectChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("02f5198d-f027-11e1-8bdc-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("02f51996-f027-11e1-8bdc-002564c97630")
        @Override
        public void register() {
            register("ModelElement", "Document");
        }

    }

}
