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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityParameterNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityParameterNode;
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

@objid ("00299e56-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityParameterNode.class, factory=ActivityParameterNodeData.Metadata.ObjectFactory.class)
public class ActivityParameterNodeData extends ObjectNodeData {
    @objid ("12bede92-2a05-4417-80ad-feb013985e53")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e6706-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4ecefa2e-ad56-4223-8d63-354ec9da832c")
        private static SmClass smClass = null;

        @objid ("d66453c8-0d45-4833-bbb7-0424770091a1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityParameterNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d2826bce-007e-4987-b8b9-35c84ecbd20f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007eb346-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9cb862f6-c064-4d15-9fec-27ebd4ef9568")
            public ISmObjectData createData() {
                return new ActivityParameterNodeData();
            }

            @objid ("35774dd8-3d57-4bd9-bd37-2652a3be9ba3")
            public SmObjectImpl createImpl() {
                return new ActivityParameterNodeImpl();
            }

        }

    }

}
