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
import org.modelio.metamodel.impl.uml.behavior.activityModel.OpaqueActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
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

@objid ("003a6c18-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=OpaqueAction.class, factory=OpaqueActionData.Metadata.ObjectFactory.class)
public class OpaqueActionData extends ActivityActionData {
    @objid ("07789287-4a7c-4f98-8546-24cd0fa82882")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("ff17f11d-a7e4-4dec-8c08-759f4f61ce4d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005b0374-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("67ec0ed2-f4ab-4664-8a34-c4401d611eab")
        private static SmClass smClass = null;

        @objid ("838bd662-b359-4ffd-a722-82d5735348c8")
        private static SmAttribute BodyAtt = null;

        @objid ("fea8d946-6939-4d5d-a7a6-47183a4a5075")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OpaqueActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5b8ef021-f858-40bf-aad0-c04848984013")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("64efc5ba-e4d6-4fc1-b223-b0c28a712c64")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("4c365963-689f-4e80-9e75-c80f11d5f784")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005b4564-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("58b0bb3a-ecf8-480c-afb6-f595aa750efc")
            public ISmObjectData createData() {
                return new OpaqueActionData();
            }

            @objid ("62d00052-fd3a-468d-b04a-11d9d1781341")
            public SmObjectImpl createImpl() {
                return new OpaqueActionImpl();
            }

        }

        @objid ("005ba810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("3fa52b84-a90f-4551-92fe-a4a00b5d3f03")
            public Object getValue(ISmObjectData data) {
                return ((OpaqueActionData) data).mBody;
            }

            @objid ("d1e89af2-92ef-4b5c-b1df-130d48e7ea8e")
            public void setValue(ISmObjectData data, Object value) {
                ((OpaqueActionData) data).mBody = value;
            }

        }

    }

}
