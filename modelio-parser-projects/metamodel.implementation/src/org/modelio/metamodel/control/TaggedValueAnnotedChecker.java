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
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Implements type checking for the TaggedValue.Annoted meta-association.
 */
@objid ("9470eb65-f025-11e1-8bdc-002564c97630")
public class TaggedValueAnnotedChecker extends AbstractDependencyTypeChecker {
    @objid ("03014eac-f027-11e1-8bdc-002564c97630")
    @Override
    public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
        TaggedValue TaggedValue = (TaggedValue) obj;
        
        if (value != null) {
            SmClass cls = value.getClassOf();
            TagType type = TaggedValue.getDefinition();
            if (type != null && !type.isShell()) {
                SmClass steClass = getBaseClass(type.getOwnerReference(), type.getOwnerStereotype());
        
                return (cls.hasBase(steClass)) ? ControlErrorCodes.NO_ERROR : ControlErrorCodes.TAGGEDVALUE_INCOMPATIBLE_METACLASS;
            }
        }
        return ControlErrorCodes.NO_ERROR;
    }

    @objid ("03014eb5-f027-11e1-8bdc-002564c97630")
    private static SmClass getBaseClass(MetaclassReference classRef, Stereotype ste) {
        if (ste != null) {
            return SmClass.getClass(ste.getBaseClassName());
        } else {
            return SmClass.getClass(classRef.getReferencedClassName());
        }
    }

    @objid ("03014ec1-f027-11e1-8bdc-002564c97630")
    @Override
    public void register() {
        register("TaggedValue", "Annoted");
        new ModelElementTagChecker(this).register();
    }

    /**
     * Implements type checking for the ModelElement.Tag meta-association.
     */
    @objid ("03014ec4-f027-11e1-8bdc-002564c97630")
    static class ModelElementTagChecker extends AbstractDependencyTypeChecker {
        @objid ("0302d530-f027-11e1-8bdc-002564c97630")
         TaggedValueAnnotedChecker symetricChecker;

        @objid ("0302d531-f027-11e1-8bdc-002564c97630")
        public ModelElementTagChecker(TaggedValueAnnotedChecker symetricChecker) {
            this.symetricChecker = symetricChecker;
        }

        @objid ("0302d534-f027-11e1-8bdc-002564c97630")
        @Override
        public int doCheck(final SmObjectImpl obj, final SmObjectImpl value) {
            return this.symetricChecker.doCheck(value, obj);
        }

        @objid ("0302d53d-f027-11e1-8bdc-002564c97630")
        @Override
        public void register() {
            register("ModelElement", "Tag");
        }

    }

}
