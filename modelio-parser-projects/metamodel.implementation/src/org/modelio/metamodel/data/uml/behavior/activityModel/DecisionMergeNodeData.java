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
import org.modelio.metamodel.impl.uml.behavior.activityModel.DecisionMergeNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionMergeNode;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionNodeKind;
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

@objid ("0030401c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DecisionMergeNode.class, factory=DecisionMergeNodeData.Metadata.ObjectFactory.class)
public class DecisionMergeNodeData extends ControlNodeData {
    @objid ("d4ee3ae1-1df5-44d3-a686-9005cc179b98")
    @SmaMetaAttribute(metaName="DecisionKind", type=DecisionNodeKind.class, smAttributeClass=Metadata.DecisionKindSmAttribute.class)
     Object mDecisionKind = DecisionNodeKind.EXCLUSIVEDECISION;

    @objid ("82a5a0b5-57bc-49e3-a944-90b238ead03f")
    @SmaMetaAttribute(metaName="DecisionInputBehavior", type=String.class, smAttributeClass=Metadata.DecisionInputBehaviorSmAttribute.class)
     Object mDecisionInputBehavior = "";

    @objid ("13aef6cb-9e5d-46ee-9b88-fd6a43a67427")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005bf8c4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3000a978-b8ab-4033-9382-f9b5176094a4")
        private static SmClass smClass = null;

        @objid ("e3028a10-9f16-4a6c-b526-b9673bc64796")
        private static SmAttribute DecisionKindAtt = null;

        @objid ("3b3d49f9-7ed9-41c8-b793-563bae90c4e2")
        private static SmAttribute DecisionInputBehaviorAtt = null;

        @objid ("0e2770f2-1bd3-4220-80f8-25afb789f108")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DecisionMergeNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("752b98b9-45ba-41c8-a655-f99b6cf919d8")
        public static SmAttribute DecisionKindAtt() {
            if (DecisionKindAtt == null) {
            	DecisionKindAtt = classof().getAttributeDef("DecisionKind");
            }
            return DecisionKindAtt;
        }

        @objid ("1a14137c-a650-469d-be16-b1fe19155998")
        public static SmAttribute DecisionInputBehaviorAtt() {
            if (DecisionInputBehaviorAtt == null) {
            	DecisionInputBehaviorAtt = classof().getAttributeDef("DecisionInputBehavior");
            }
            return DecisionInputBehaviorAtt;
        }

        @objid ("b43c33ea-133a-4628-ab71-3f59d4e1f31e")
        public static SmAttribute getDecisionKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecisionKindAtt;
        }

        @objid ("ac664fe6-2585-46b4-ab6f-6d80d510fc2f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6cda92e1-90ba-4fea-991a-4c1d0cc656a7")
        public static SmAttribute getDecisionInputBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecisionInputBehaviorAtt;
        }

        @objid ("005c3ad2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f2c0d85e-a1f7-420a-95ac-c9bd9b711b39")
            public ISmObjectData createData() {
                return new DecisionMergeNodeData();
            }

            @objid ("7a241a94-0070-4832-bf2c-aacc33237c5a")
            public SmObjectImpl createImpl() {
                return new DecisionMergeNodeImpl();
            }

        }

        @objid ("005c9d56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecisionKindSmAttribute extends SmAttribute {
            @objid ("18fb5aa2-d095-4552-a113-a291fbb0c39f")
            public Object getValue(ISmObjectData data) {
                return ((DecisionMergeNodeData) data).mDecisionKind;
            }

            @objid ("7edd07ff-edab-4455-87bd-fccef2c03472")
            public void setValue(ISmObjectData data, Object value) {
                ((DecisionMergeNodeData) data).mDecisionKind = value;
            }

        }

        @objid ("005f81b0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecisionInputBehaviorSmAttribute extends SmAttribute {
            @objid ("887fdd47-0e62-4238-8a12-e78ec7610e59")
            public Object getValue(ISmObjectData data) {
                return ((DecisionMergeNodeData) data).mDecisionInputBehavior;
            }

            @objid ("4b2569d6-6ffd-4340-939f-4e9c92ecdc9a")
            public void setValue(ISmObjectData data, Object value) {
                ((DecisionMergeNodeData) data).mDecisionInputBehavior = value;
            }

        }

    }

}
