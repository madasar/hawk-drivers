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
import org.modelio.metamodel.impl.uml.behavior.activityModel.DataStoreNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.DataStoreNode;
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

@objid ("002f83c0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DataStoreNode.class, factory=DataStoreNodeData.Metadata.ObjectFactory.class)
public class DataStoreNodeData extends CentralBufferNodeData {
    @objid ("f17c06d6-44f7-4d0e-abdb-872ee646a349")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0076b844-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("59d7a7ab-f39f-442f-851f-28bb3be1fece")
        private static SmClass smClass = null;

        @objid ("cce67ac4-87dc-46c0-8171-c018c9f41b6a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataStoreNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0b0b9dd5-7463-4ba4-b003-0da0faa04ad9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007705a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("570aaf1d-9338-4f4b-9b17-57e201d96e98")
            public ISmObjectData createData() {
                return new DataStoreNodeData();
            }

            @objid ("a5220b16-f1e0-4c0f-9175-3e4946517fce")
            public SmObjectImpl createImpl() {
                return new DataStoreNodeImpl();
            }

        }

    }

}
