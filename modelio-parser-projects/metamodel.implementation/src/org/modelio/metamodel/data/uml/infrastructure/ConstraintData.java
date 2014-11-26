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
import org.modelio.metamodel.impl.uml.infrastructure.ConstraintImpl;
import org.modelio.metamodel.uml.infrastructure.Constraint;
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

@objid ("00859e2c-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Constraint.class, factory=ConstraintData.Metadata.ObjectFactory.class)
public class ConstraintData extends ModelElementData {
    @objid ("a6a3c549-a51a-4dc2-93f2-28c78a5fc0ba")
    @SmaMetaAttribute(metaName="BaseClass", type=String.class, smAttributeClass=Metadata.BaseClassSmAttribute.class)
     Object mBaseClass = "";

    @objid ("72b3186e-e9ca-4302-a158-a1ba0bb9dc1c")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("4459a9b0-1e02-45d9-90a7-35ff755001e4")
    @SmaMetaAttribute(metaName="Language", type=String.class, smAttributeClass=Metadata.LanguageSmAttribute.class)
     Object mLanguage = "";

    @objid ("cc31958d-c426-4cb2-92d4-39f33fdda8a3")
    @SmaMetaAssociation(metaName="ConstrainedElement", typeDataClass=ModelElementData.class, min=0, max=-1, smAssociationClass=Metadata.ConstrainedElementSmDependency.class, partof = true)
     List<SmObjectImpl> mConstrainedElement = null;

    @objid ("48ccdd9d-641f-4261-8d98-24d715f6775a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00982a7e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cd5d2d74-b288-4ac7-a2bb-df3c9fb248db")
        private static SmClass smClass = null;

        @objid ("ed20a770-5f2f-42ac-82b0-35c6a5592c11")
        private static SmAttribute BaseClassAtt = null;

        @objid ("a940250a-df45-40c8-8b98-5bd800c57c7d")
        private static SmAttribute BodyAtt = null;

        @objid ("06fb018f-83bb-40f0-a478-3784cc2ef656")
        private static SmAttribute LanguageAtt = null;

        @objid ("98807467-6695-4ce5-9937-d62f3e20741f")
        private static SmDependency ConstrainedElementDep = null;

        @objid ("90072f83-261e-4356-b047-0c13861ef9ed")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConstraintData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f3ad558a-e480-4922-9f34-5efbf98f0b19")
        public static SmAttribute BaseClassAtt() {
            if (BaseClassAtt == null) {
            	BaseClassAtt = classof().getAttributeDef("BaseClass");
            }
            return BaseClassAtt;
        }

        @objid ("6fb19f12-db18-48c5-869b-cd120e532a1a")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("755e4afc-1ed3-44fe-87f2-abff6d962c14")
        public static SmAttribute LanguageAtt() {
            if (LanguageAtt == null) {
            	LanguageAtt = classof().getAttributeDef("Language");
            }
            return LanguageAtt;
        }

        @objid ("0ebe9502-45c4-442e-8288-a7d58ea4ed51")
        public static SmDependency ConstrainedElementDep() {
            if (ConstrainedElementDep == null) {
            	ConstrainedElementDep = classof().getDependencyDef("ConstrainedElement");
            }
            return ConstrainedElementDep;
        }

        @objid ("dd3cccf7-3535-491b-80e9-8e8bde4f1626")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2b78d2f8-1e91-4f06-a2dc-6919be20a60d")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("c984f819-9f7f-425c-9244-31ed8e074759")
        public static SmDependency getConstrainedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConstrainedElementDep;
        }

        @objid ("7456d9df-78d2-4b4a-9e3a-3b70e8bef082")
        public static SmAttribute getBaseClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseClassAtt;
        }

        @objid ("8bcb96a1-8862-417f-acde-2c399a1833e5")
        public static SmAttribute getLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LanguageAtt;
        }

        @objid ("00986bec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5b1afc24-c552-4cd7-bab8-201f9c12aba7")
            public ISmObjectData createData() {
                return new ConstraintData();
            }

            @objid ("8ca70936-60ba-42c2-86ce-b19af8fadf3d")
            public SmObjectImpl createImpl() {
                return new ConstraintImpl();
            }

        }

        @objid ("00003b10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BaseClassSmAttribute extends SmAttribute {
            @objid ("b764b06f-f0f1-4549-bbe3-55dae4d8e120")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mBaseClass;
            }

            @objid ("cd53b1cf-bb6a-4803-b082-3464283c1685")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mBaseClass = value;
            }

        }

        @objid ("00009cd6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("d8d09268-90ed-4985-b2f0-e302bc95c7bc")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mBody;
            }

            @objid ("85473504-6c7b-4614-8f7c-41248efeb7d5")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mBody = value;
            }

        }

        @objid ("0000fd98-c4c3-1fd8-97fe-001ec947cd2a")
        public static class LanguageSmAttribute extends SmAttribute {
            @objid ("3599949f-8895-4ac7-8b7c-27ad58013f52")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mLanguage;
            }

            @objid ("fe2e18dc-a30b-47cd-90f0-30ee7973ecab")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mLanguage = value;
            }

        }

        @objid ("00016238-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConstrainedElementSmDependency extends SmMultipleDependency {
            @objid ("352fd6a1-c03f-4e33-b05e-9695657a6de5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConstraintData)data).mConstrainedElement != null)? ((ConstraintData)data).mConstrainedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("e4893b77-25d8-4815-992a-f7efb9981a41")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConstraintData) data).mConstrainedElement = new ArrayList<>(initialCapacity);
                return ((ConstraintData) data).mConstrainedElement;
            }

            @objid ("98eb4813-28dd-48c4-ae12-f3e6d3b40721")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ConstraintDefinitionDep();
            }

        }

    }

}
