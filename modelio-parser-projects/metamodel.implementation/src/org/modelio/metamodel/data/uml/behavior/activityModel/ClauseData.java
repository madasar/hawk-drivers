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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityNodeData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ConditionalNodeData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ClauseImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
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

@objid ("002d1d10-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Clause.class, factory=ClauseData.Metadata.ObjectFactory.class)
public class ClauseData extends ModelElementData {
    @objid ("44e74d42-377b-4962-a543-831010992976")
    @SmaMetaAttribute(metaName="Test", type=String.class, smAttributeClass=Metadata.TestSmAttribute.class)
     Object mTest = "";

    @objid ("0d14e9cc-3e12-41e3-ba26-faf3badd2cf8")
    @SmaMetaAssociation(metaName="Body", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.BodySmDependency.class, component = true)
     List<SmObjectImpl> mBody = null;

    @objid ("248a5137-bcfa-41c0-8031-6041d4c2d482")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ConditionalNodeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("40947854-10c5-4fb3-b56e-e00883599e66")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0039a526-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("29096c0f-4406-4816-8eb9-3303629d1489")
        private static SmClass smClass = null;

        @objid ("02545630-ae71-433d-a432-4d8617fc6330")
        private static SmAttribute TestAtt = null;

        @objid ("6b709ab8-8f30-4f86-8a11-2e588a63a00f")
        private static SmDependency BodyDep = null;

        @objid ("b9cf1264-11db-46a8-8532-f3c41e9b4eb3")
        private static SmDependency OwnerDep = null;

        @objid ("acbedff1-40bb-4525-9e9d-994f7592044c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClauseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("11cd6245-4ffa-413b-b8b4-81556185cf36")
        public static SmAttribute TestAtt() {
            if (TestAtt == null) {
            	TestAtt = classof().getAttributeDef("Test");
            }
            return TestAtt;
        }

        @objid ("c45916f5-d9e4-4efc-859f-99326d0ee0a2")
        public static SmDependency BodyDep() {
            if (BodyDep == null) {
            	BodyDep = classof().getDependencyDef("Body");
            }
            return BodyDep;
        }

        @objid ("ef1ee311-b324-4b88-97cd-2f253e4a81d9")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("f9937c7b-bfc7-456c-95d8-2292a1cf5006")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6ad7c4e9-0054-4479-a216-08c66064dd27")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("8bd0edbd-be36-4be1-990f-6355297c7531")
        public static SmDependency getBodyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyDep;
        }

        @objid ("677fa10b-924a-42ac-94dc-42448d636a9e")
        public static SmAttribute getTestAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestAtt;
        }

        @objid ("0039f350-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1198e38b-b839-464b-9eee-42df02185caa")
            public ISmObjectData createData() {
                return new ClauseData();
            }

            @objid ("00308b72-02a9-4006-a722-5acd8c30b499")
            public SmObjectImpl createImpl() {
                return new ClauseImpl();
            }

        }

        @objid ("003a5c64-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TestSmAttribute extends SmAttribute {
            @objid ("f022c660-722b-477a-823d-2416c83c5ca2")
            public Object getValue(ISmObjectData data) {
                return ((ClauseData) data).mTest;
            }

            @objid ("689f2606-3a4a-4596-ae87-e017efbe4af1")
            public void setValue(ISmObjectData data, Object value) {
                ((ClauseData) data).mTest = value;
            }

        }

        @objid ("003abfe2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("8dde3d2f-a601-40b8-aad8-43595e270959")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClauseData) data).mOwner;
            }

            @objid ("b447284b-e081-4d50-afde-a1c86ca3cf27")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClauseData) data).mOwner = value;
            }

            @objid ("650a63c7-85a0-45e1-952e-ae69e2e18250")
            @Override
            public SmDependency getSymetric() {
                return ConditionalNodeData.Metadata.OwnedClauseDep();
            }

        }

        @objid ("003b353a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BodySmDependency extends SmMultipleDependency {
            @objid ("5c870a78-9f7a-43dd-92e4-bd6e9d8a16e2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClauseData)data).mBody != null)? ((ClauseData)data).mBody:SmMultipleDependency.EMPTY;
            }

            @objid ("b37bb2e2-1eea-41f9-a7dd-807203d14ef1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClauseData) data).mBody = new ArrayList<>(initialCapacity);
                return ((ClauseData) data).mBody;
            }

            @objid ("a38f6816-11cd-4a95-9795-c1d34aa516e6")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerClauseDep();
            }

        }

    }

}
