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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.TerminateSpecificationImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.TerminateSpecification;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("004c77aa-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TerminateSpecification.class, factory=TerminateSpecificationData.Metadata.ObjectFactory.class)
public class TerminateSpecificationData extends ExecutionOccurenceSpecificationData {
    @objid ("3b19430a-8d9a-4953-9eac-233b8ca35a33")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0087d138-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e8abf9fb-f9d4-4748-85c1-f0c82582de3d")
        private static SmClass smClass = null;

        @objid ("71415266-3c03-42bf-92a4-c89d32252bd9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TerminateSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c2c3a76a-19b9-49a7-8aed-1fa543c120f0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008811f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("25d37b82-1b00-4911-8cb6-163a414e74c8")
            public ISmObjectData createData() {
                return new TerminateSpecificationData();
            }

            @objid ("a11c8b4f-8aaa-42dc-83d8-e8babac74c22")
            public SmObjectImpl createImpl() {
                return new TerminateSpecificationImpl();
            }

        }

    }

}
