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
package org.modelio.metamodel.data.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.OpaqueBehaviorImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.OpaqueBehavior;
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

@objid ("0041e20e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=OpaqueBehavior.class, factory=OpaqueBehaviorData.Metadata.ObjectFactory.class, cmsnode=true)
public class OpaqueBehaviorData extends BehaviorData {
    @objid ("5142f56b-190f-4c52-a0b7-d38abaddd9c2")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("ce10cf02-c588-4349-b363-e7bc9362680b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006d3b7a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("06e70b57-ec19-48eb-9eb4-022d6de0f36a")
        private static SmClass smClass = null;

        @objid ("6371b574-bdac-490c-939e-9a0c25cac0c1")
        private static SmAttribute BodyAtt = null;

        @objid ("c0138e7b-7b48-47e1-af97-6f089fac7304")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OpaqueBehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ac10add3-3886-4a47-9f38-36d0c06b550d")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("02e0501d-21e8-4e1c-96ec-6516d2bd257f")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("cd67e728-2eb2-483a-9f8f-257d1d004b1d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("006d7d56-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("be23559a-8214-483e-b12a-9055c30c849d")
            public ISmObjectData createData() {
                return new OpaqueBehaviorData();
            }

            @objid ("284afa5f-6d92-414c-beec-e46ebb3a8e7a")
            public SmObjectImpl createImpl() {
                return new OpaqueBehaviorImpl();
            }

        }

        @objid ("006ddfb2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("f3d14226-7046-44c9-91c7-abfd1759622c")
            public Object getValue(ISmObjectData data) {
                return ((OpaqueBehaviorData) data).mBody;
            }

            @objid ("62ed0de2-6f29-4fcd-afe6-e524c7d4dcad")
            public void setValue(ISmObjectData data, Object value) {
                ((OpaqueBehaviorData) data).mBody = value;
            }

        }

    }

}
