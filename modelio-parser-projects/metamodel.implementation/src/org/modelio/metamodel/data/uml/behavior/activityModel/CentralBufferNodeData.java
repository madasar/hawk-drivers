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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.CentralBufferNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.CentralBufferNode;
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

@objid ("002c7f7c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CentralBufferNode.class, factory=CentralBufferNodeData.Metadata.ObjectFactory.class)
public class CentralBufferNodeData extends ObjectNodeData {
    @objid ("07b839d0-1052-430c-a9c6-7de68c7e7b47")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001ebcd4-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a8382fe4-e0c0-4768-8d0a-68691b8325c1")
        private static SmClass smClass = null;

        @objid ("504a0e2b-b543-4389-a732-e090169ed0c8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CentralBufferNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("26c5d2e8-2d14-43d8-85fb-f206744f9964")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001efe24-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c9642722-6b15-479d-b445-70177115844d")
            public ISmObjectData createData() {
                return new CentralBufferNodeData();
            }

            @objid ("dc8cb53d-a339-4fee-b02b-54b882e9ae13")
            public SmObjectImpl createImpl() {
                return new CentralBufferNodeImpl();
            }

        }

    }

}
