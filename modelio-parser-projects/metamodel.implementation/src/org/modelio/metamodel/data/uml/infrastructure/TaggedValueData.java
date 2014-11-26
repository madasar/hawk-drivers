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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.TagParameterData;
import org.modelio.metamodel.data.uml.infrastructure.TagTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.TaggedValueImpl;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
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

@objid ("00907a4a-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TaggedValue.class, factory=TaggedValueData.Metadata.ObjectFactory.class)
public class TaggedValueData extends ModelElementData {
    @objid ("7d627ed6-66ee-42e5-9905-e9d572794ac8")
    @SmaMetaAssociation(metaName="Annoted", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.AnnotedSmDependency.class)
     SmObjectImpl mAnnoted;

    @objid ("420c0a57-653b-454d-9742-bfab5f00b2d0")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=TagParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ActualSmDependency.class, component = true)
     List<SmObjectImpl> mActual = null;

    @objid ("3b8ccab4-ada9-41f1-94c9-30c2ae7fcc63")
    @SmaMetaAssociation(metaName="Qualifier", typeDataClass=TagParameterData.class, min=0, max=1, smAssociationClass=Metadata.QualifierSmDependency.class, component = true)
     SmObjectImpl mQualifier;

    @objid ("d292c128-eab9-409a-9fbe-491b587d965f")
    @SmaMetaAssociation(metaName="Definition", typeDataClass=TagTypeData.class, min=1, max=1, smAssociationClass=Metadata.DefinitionSmDependency.class, partof = true)
     SmObjectImpl mDefinition;

    @objid ("2cb3ba11-28f3-489f-9307-57dcbbbaa4f5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00818b0c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("65c7c6cf-93be-4c12-9b6d-591176fae9bb")
        private static SmClass smClass = null;

        @objid ("3ac948d4-2eda-4327-9ec3-6229ac49bdc0")
        private static SmDependency AnnotedDep = null;

        @objid ("164000d7-3ffa-47d0-9a5c-0e7be4d89368")
        private static SmDependency ActualDep = null;

        @objid ("154e62f6-f7ec-4836-bba1-56b44b884a61")
        private static SmDependency QualifierDep = null;

        @objid ("dc0cade5-380d-4ce4-9d8b-b2e3a93dab13")
        private static SmDependency DefinitionDep = null;

        @objid ("64979c03-7da9-4083-b710-d1841d38edf9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TaggedValueData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("99a888ed-c71f-4074-9680-07308306c8b5")
        public static SmDependency AnnotedDep() {
            if (AnnotedDep == null) {
            	AnnotedDep = classof().getDependencyDef("Annoted");
            }
            return AnnotedDep;
        }

        @objid ("4e894545-8a36-40f0-ae3f-fcc599a611a3")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("38207d88-c8f1-496b-9bd2-5bb2eb5a54b1")
        public static SmDependency QualifierDep() {
            if (QualifierDep == null) {
            	QualifierDep = classof().getDependencyDef("Qualifier");
            }
            return QualifierDep;
        }

        @objid ("d326ac8a-c700-4c09-b484-ff109081bf41")
        public static SmDependency DefinitionDep() {
            if (DefinitionDep == null) {
            	DefinitionDep = classof().getDependencyDef("Definition");
            }
            return DefinitionDep;
        }

        @objid ("334982cb-841e-47b1-bbc8-4426f3d9a280")
        public static SmDependency getDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinitionDep;
        }

        @objid ("40cd7e14-37ad-4109-aabc-ade011e883d0")
        public static SmDependency getAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotedDep;
        }

        @objid ("41c9cf4a-421a-401d-bdf5-2fa50cc657ff")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("1143361e-fa3d-4a78-ae69-916d6d4aa206")
        public static SmDependency getQualifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifierDep;
        }

        @objid ("eaa9e250-8ae3-4484-81b5-8dca05d56fa6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0081cc2a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cec17159-d375-4b3c-b123-f8844cae38ba")
            public ISmObjectData createData() {
                return new TaggedValueData();
            }

            @objid ("76477cb6-4e38-40f1-bfa8-a435d09d3c5b")
            public SmObjectImpl createImpl() {
                return new TaggedValueImpl();
            }

        }

        @objid ("00822eae-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AnnotedSmDependency extends SmSingleDependency {
            @objid ("bbb0fa67-dc68-46ea-a369-3aa577c122d1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mAnnoted;
            }

            @objid ("e0fc299d-3269-4626-b899-4a3cadc9569e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mAnnoted = value;
            }

            @objid ("5d106d7a-77da-4dbf-bf08-dba392208d98")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TagDep();
            }

        }

        @objid ("0082a2b2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmMultipleDependency {
            @objid ("e84bf8aa-9f08-4d3e-aa85-2d2768c6f69e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TaggedValueData)data).mActual != null)? ((TaggedValueData)data).mActual:SmMultipleDependency.EMPTY;
            }

            @objid ("0fb67682-429a-46c9-89a5-6a8fdc482d0b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TaggedValueData) data).mActual = new ArrayList<>(initialCapacity);
                return ((TaggedValueData) data).mActual;
            }

            @objid ("b6617a0e-2368-4ddd-b74d-48a7112ab136")
            @Override
            public SmDependency getSymetric() {
                return TagParameterData.Metadata.AnnotedDep();
            }

        }

        @objid ("008305c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class QualifierSmDependency extends SmSingleDependency {
            @objid ("d03dcec6-d41d-4877-9725-45b3febf73fb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mQualifier;
            }

            @objid ("d2aaec3c-ab6d-4ab4-8b2a-0f8f1242f368")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mQualifier = value;
            }

            @objid ("61cdb196-1a6e-4dac-a4c1-be234e21df50")
            @Override
            public SmDependency getSymetric() {
                return TagParameterData.Metadata.QualifiedDep();
            }

        }

        @objid ("00837bc4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinitionSmDependency extends SmSingleDependency {
            @objid ("b25ab989-d025-41ef-a32c-60862231a79f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mDefinition;
            }

            @objid ("dc389d26-701f-44bb-93ea-8846b5097f45")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mDefinition = value;
            }

            @objid ("d9317030-35f3-4de6-9fc2-64ab0c7cf456")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.TagOccurenceDep();
            }

        }

    }

}
