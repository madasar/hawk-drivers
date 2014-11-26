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
import org.modelio.metamodel.impl.uml.behavior.activityModel.InstanceNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.InstanceNode;
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

@objid ("00362dba-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InstanceNode.class, factory=InstanceNodeData.Metadata.ObjectFactory.class)
public class InstanceNodeData extends ObjectNodeData {
    @objid ("0469074b-7665-490e-88bf-3f6c1e031eaa")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e12ba-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b31d0691-9db6-4cd5-95d2-ade844fc28e0")
        private static SmClass smClass = null;

        @objid ("e06f05f2-f898-4631-b11a-a2fc99dca25c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InstanceNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("afaf4b38-1c20-4940-93c7-6c7945a07bc6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007e54b4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("339d7bba-8158-471f-9bc2-3dd636b4650c")
            public ISmObjectData createData() {
                return new InstanceNodeData();
            }

            @objid ("28627108-de0e-4bbc-b606-d930e35e9419")
            public SmObjectImpl createImpl() {
                return new InstanceNodeImpl();
            }

        }

    }

}
