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
package org.modelio.metamodel.data.uml.behavior.usecaseModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.ActorImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
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

@objid ("00585d72-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Actor.class, factory=ActorData.Metadata.ObjectFactory.class, cmsnode=true)
public class ActorData extends GeneralClassData {
    @objid ("4b1e6313-881d-45b7-bc1f-d882b70200f8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ebffc-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("26be0f12-9bb8-4294-b88a-36253c438808")
        private static SmClass smClass = null;

        @objid ("f805b1e8-f583-4806-8d7f-c65ada2d30be")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("229ed868-c8f8-4b3f-896f-7709d576e2b5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003f0264-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7c4c2cfc-7a42-4785-a85f-8e5ed844d978")
            public ISmObjectData createData() {
                return new ActorData();
            }

            @objid ("2bee6e5f-6b24-43c0-ac98-ff6ecc69165c")
            public SmObjectImpl createImpl() {
                return new ActorImpl();
            }

        }

    }

}
