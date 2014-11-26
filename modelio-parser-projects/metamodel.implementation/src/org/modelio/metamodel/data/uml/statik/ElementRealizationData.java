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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.AbstractionData;
import org.modelio.metamodel.impl.uml.statik.ElementRealizationImpl;
import org.modelio.metamodel.uml.statik.ElementRealization;
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

@objid ("00093b2a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ElementRealization.class, factory=ElementRealizationData.Metadata.ObjectFactory.class)
public class ElementRealizationData extends AbstractionData {
    @objid ("9b778416-bcda-4100-998c-1919d662e2ca")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000927de-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("836f8e0d-6422-42b6-8ba2-4ea1de71c374")
        private static SmClass smClass = null;

        @objid ("8faef939-0dfe-42d8-ae9f-2fdd2b27a00b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementRealizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5177c097-0f9b-456f-8128-0ba5ead98575")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000968b6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6f293b42-f8e4-41f6-82b3-6a0c2c724ea4")
            public ISmObjectData createData() {
                return new ElementRealizationData();
            }

            @objid ("73ec60d2-78de-424e-bc3f-61cea5cbf17d")
            public SmObjectImpl createImpl() {
                return new ElementRealizationImpl();
            }

        }

    }

}
