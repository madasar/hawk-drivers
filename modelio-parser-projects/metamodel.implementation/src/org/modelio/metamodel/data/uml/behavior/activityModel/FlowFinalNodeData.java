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
import org.modelio.metamodel.impl.uml.behavior.activityModel.FlowFinalNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.FlowFinalNode;
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

@objid ("00337692-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=FlowFinalNode.class, factory=FlowFinalNodeData.Metadata.ObjectFactory.class)
public class FlowFinalNodeData extends FinalNodeData {
    @objid ("db12cbc4-5d81-44ce-be56-cbcfb2a21feb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0072be60-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("72adb2e5-55ca-4c88-975b-3e8b06868745")
        private static SmClass smClass = null;

        @objid ("90204c7c-2306-40ad-99d7-4b1f6974665e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FlowFinalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("64f524b4-155c-41d2-9841-4f035a97c94d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007300a0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6ca5ba5c-aeec-4ed7-b693-1dbdd31fe325")
            public ISmObjectData createData() {
                return new FlowFinalNodeData();
            }

            @objid ("d6b9dfb6-3b03-4f5f-8c25-3dd4748c8a07")
            public SmObjectImpl createImpl() {
                return new FlowFinalNodeImpl();
            }

        }

    }

}
