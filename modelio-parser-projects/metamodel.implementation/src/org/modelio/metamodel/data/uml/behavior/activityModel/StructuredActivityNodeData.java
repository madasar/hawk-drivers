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
import org.modelio.metamodel.impl.uml.behavior.activityModel.StructuredActivityNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
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

@objid ("003e80d2-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StructuredActivityNode.class, factory=StructuredActivityNodeData.Metadata.ObjectFactory.class)
public class StructuredActivityNodeData extends ActivityActionData {
    @objid ("d9dd9988-609f-4e79-8da8-1d207549e17f")
    @SmaMetaAttribute(metaName="MustIsolate", type=Boolean.class, smAttributeClass=Metadata.MustIsolateSmAttribute.class)
     Object mMustIsolate = false;

    @objid ("d37c9be4-607a-409c-a77a-6ddae6d84137")
    @SmaMetaAssociation(metaName="Body", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.BodySmDependency.class, component = true)
     List<SmObjectImpl> mBody = null;

    @objid ("ad220c94-172d-4adc-833a-01a70f8c9fa8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00564460-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5a7421b6-a2c5-42b4-a7db-0459d2ba7eb6")
        private static SmClass smClass = null;

        @objid ("8565aa69-a5a8-40ea-9736-3953009359f4")
        private static SmAttribute MustIsolateAtt = null;

        @objid ("e59e9fd1-065b-4d61-b8f1-50589a50226b")
        private static SmDependency BodyDep = null;

        @objid ("b1433b33-ea9a-44e0-a196-10748d334a59")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StructuredActivityNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("40e77d1c-c568-4c87-81a1-35b3cd538b4d")
        public static SmAttribute MustIsolateAtt() {
            if (MustIsolateAtt == null) {
            	MustIsolateAtt = classof().getAttributeDef("MustIsolate");
            }
            return MustIsolateAtt;
        }

        @objid ("fd19e958-0634-4874-9ca2-62385c9edf25")
        public static SmDependency BodyDep() {
            if (BodyDep == null) {
            	BodyDep = classof().getDependencyDef("Body");
            }
            return BodyDep;
        }

        @objid ("5955dc36-34cf-4c79-8f55-350d2c51f8b7")
        public static SmAttribute getMustIsolateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MustIsolateAtt;
        }

        @objid ("a2a8d208-9266-46c1-af10-e0b50a842eb7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d4480259-af7e-4263-a4c1-6ee7aa4a7cbb")
        public static SmDependency getBodyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyDep;
        }

        @objid ("0056863c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c3b4f0cf-b84b-44d8-b524-c0ce55508626")
            public ISmObjectData createData() {
                return new StructuredActivityNodeData();
            }

            @objid ("3e83e2e3-8dc1-4306-9548-ada32232f3e1")
            public SmObjectImpl createImpl() {
                return new StructuredActivityNodeImpl();
            }

        }

        @objid ("0056e8fc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MustIsolateSmAttribute extends SmAttribute {
            @objid ("5a9cd5bf-d973-45dd-84b5-11ac35fa1d82")
            public Object getValue(ISmObjectData data) {
                return ((StructuredActivityNodeData) data).mMustIsolate;
            }

            @objid ("63fd5466-a62b-4455-ab79-3b07625e05ad")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuredActivityNodeData) data).mMustIsolate = value;
            }

        }

        @objid ("00574c66-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmDependency extends SmMultipleDependency {
            @objid ("b4f29b0e-9281-42a4-84d7-96b536103d80")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StructuredActivityNodeData)data).mBody != null)? ((StructuredActivityNodeData)data).mBody:SmMultipleDependency.EMPTY;
            }

            @objid ("ab373aa5-d934-4d59-ad52-3f9026f9bc2e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StructuredActivityNodeData) data).mBody = new ArrayList<>(initialCapacity);
                return ((StructuredActivityNodeData) data).mBody;
            }

            @objid ("54fec939-7547-4bef-967e-552d5189fc57")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerNodeDep();
            }

        }

    }

}
