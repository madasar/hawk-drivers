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
import org.modelio.metamodel.impl.uml.behavior.activityModel.LoopNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.LoopNode;
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

@objid ("00379c9a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=LoopNode.class, factory=LoopNodeData.Metadata.ObjectFactory.class)
public class LoopNodeData extends StructuredActivityNodeData {
    @objid ("78f1a9d9-6165-4d15-aeed-8b90bb65dcf2")
    @SmaMetaAttribute(metaName="IsTestedFirst", type=Boolean.class, smAttributeClass=Metadata.IsTestedFirstSmAttribute.class)
     Object mIsTestedFirst = false;

    @objid ("d523da16-1408-4db7-85c5-65e87f8178eb")
    @SmaMetaAttribute(metaName="Setup", type=String.class, smAttributeClass=Metadata.SetupSmAttribute.class)
     Object mSetup = "";

    @objid ("c28fd913-9370-430e-80e6-56c0973070b5")
    @SmaMetaAttribute(metaName="Test", type=String.class, smAttributeClass=Metadata.TestSmAttribute.class)
     Object mTest = "";

    @objid ("4f9f3053-08a4-4b6a-b017-04fe5599b53b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003bf510-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f7b0baf7-cf97-49c6-ac54-e2ef6f9e8bbf")
        private static SmClass smClass = null;

        @objid ("5dfa55b2-b652-4b27-8177-0f73e9a86bf8")
        private static SmAttribute IsTestedFirstAtt = null;

        @objid ("cef0ad0e-4bc6-4328-9fb2-704dc5deaf69")
        private static SmAttribute SetupAtt = null;

        @objid ("74608bf9-d9c4-4d42-a234-66d982d5bf12")
        private static SmAttribute TestAtt = null;

        @objid ("b7e2fb3c-ce39-46c9-816d-43d84ed58df5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LoopNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f813f2d1-8a95-4d3b-80ef-0ebd52eb73d7")
        public static SmAttribute IsTestedFirstAtt() {
            if (IsTestedFirstAtt == null) {
            	IsTestedFirstAtt = classof().getAttributeDef("IsTestedFirst");
            }
            return IsTestedFirstAtt;
        }

        @objid ("e938d5cf-f299-4c76-93e1-eb4713773526")
        public static SmAttribute SetupAtt() {
            if (SetupAtt == null) {
            	SetupAtt = classof().getAttributeDef("Setup");
            }
            return SetupAtt;
        }

        @objid ("3e061c05-415e-482e-afc0-3a416f7d6cb5")
        public static SmAttribute TestAtt() {
            if (TestAtt == null) {
            	TestAtt = classof().getAttributeDef("Test");
            }
            return TestAtt;
        }

        @objid ("c3538b02-f605-42b4-83de-42a36a4d6aa8")
        public static SmAttribute getIsTestedFirstAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsTestedFirstAtt;
        }

        @objid ("6f1121c7-f4cc-4357-8d2e-010e8c0ca2bf")
        public static SmAttribute getSetupAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SetupAtt;
        }

        @objid ("2f5a83f2-7d63-4216-915e-c2e877398553")
        public static SmAttribute getTestAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestAtt;
        }

        @objid ("3203eaf3-3c40-4932-a3dc-ede355857102")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003c37f0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("86e2f5a0-8a49-4308-af9b-a470d141b61a")
            public ISmObjectData createData() {
                return new LoopNodeData();
            }

            @objid ("bef8d126-13ac-4a2d-8119-748109b540dc")
            public SmObjectImpl createImpl() {
                return new LoopNodeImpl();
            }

        }

        @objid ("003c9b6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsTestedFirstSmAttribute extends SmAttribute {
            @objid ("e4f69e79-16c0-4160-8791-02e8b565db2a")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mIsTestedFirst;
            }

            @objid ("64357a01-33db-4956-91b4-9ced12313ac9")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mIsTestedFirst = value;
            }

        }

        @objid ("003cfe10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SetupSmAttribute extends SmAttribute {
            @objid ("842f1aec-3426-434d-9f6f-ac4821035dec")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mSetup;
            }

            @objid ("514014b2-4088-45e7-8af6-fa93d01983af")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mSetup = value;
            }

        }

        @objid ("003d62c4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TestSmAttribute extends SmAttribute {
            @objid ("9a09cda7-26b9-4094-94a6-961bdf09ac61")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mTest;
            }

            @objid ("e150df7a-a7e0-4362-9223-6447154520fa")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mTest = value;
            }

        }

    }

}
