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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.TaggedValueData;
import org.modelio.metamodel.impl.uml.infrastructure.TagParameterImpl;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
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

@objid ("008f0606-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TagParameter.class, factory=TagParameterData.Metadata.ObjectFactory.class)
public class TagParameterData extends ElementData {
    @objid ("1df5344c-b9e4-48d7-b611-104ddb3d9c51")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("e78936ff-0097-4926-9ed6-f1dfc5a81164")
    @SmaMetaAssociation(metaName="Annoted", typeDataClass=TaggedValueData.class, min=0, max=1, smAssociationClass=Metadata.AnnotedSmDependency.class)
     SmObjectImpl mAnnoted;

    @objid ("b26824b5-14f3-48c0-8a59-5cce28b93cb6")
    @SmaMetaAssociation(metaName="Qualified", typeDataClass=TaggedValueData.class, min=0, max=1, smAssociationClass=Metadata.QualifiedSmDependency.class)
     SmObjectImpl mQualified;

    @objid ("d1e44fcc-c692-46fc-8dc0-c5c29fe173ac")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004595ac-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fe5e37e0-77d7-40a2-a58d-6fa90782ff77")
        private static SmClass smClass = null;

        @objid ("7df9f1e1-0530-4f63-aa3b-bc00eff0714e")
        private static SmAttribute ValueAtt = null;

        @objid ("115ffebc-2e80-4356-8f05-4e8098fbb699")
        private static SmDependency AnnotedDep = null;

        @objid ("3fbddf2a-15fd-43f7-af08-fadbdea0490f")
        private static SmDependency QualifiedDep = null;

        @objid ("60807e16-6c7c-4ab7-87be-37a20ba5033f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TagParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1e09fc4e-decc-4c2a-b49d-cf6c83852682")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("b74dac4a-8104-472b-a272-de0f42c8b72c")
        public static SmDependency AnnotedDep() {
            if (AnnotedDep == null) {
            	AnnotedDep = classof().getDependencyDef("Annoted");
            }
            return AnnotedDep;
        }

        @objid ("3965a326-29fe-41c2-ba88-6ef8a8ff7bd9")
        public static SmDependency QualifiedDep() {
            if (QualifiedDep == null) {
            	QualifiedDep = classof().getDependencyDef("Qualified");
            }
            return QualifiedDep;
        }

        @objid ("9906bf61-59ab-4549-baed-a0b73b0c3887")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d395661f-1a29-4cf4-81bd-4923f8949a66")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("78681e50-6fa2-4d8c-98d4-f50f4f7ef45d")
        public static SmDependency getAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotedDep;
        }

        @objid ("e9387c5f-026b-4857-bb85-0bfff077d80c")
        public static SmDependency getQualifiedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifiedDep;
        }

        @objid ("0045d6fc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bf12bc01-930d-4343-8d39-748fa3915324")
            public ISmObjectData createData() {
                return new TagParameterData();
            }

            @objid ("bb4a63f4-37fa-4197-8d1e-2abefb6a3593")
            public SmObjectImpl createImpl() {
                return new TagParameterImpl();
            }

        }

        @objid ("00463818-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("d3a68c34-b3b1-4d64-8436-e53c8f74ec63")
            public Object getValue(ISmObjectData data) {
                return ((TagParameterData) data).mValue;
            }

            @objid ("9addd6c4-3b11-4cd9-821a-d3604ad001da")
            public void setValue(ISmObjectData data, Object value) {
                ((TagParameterData) data).mValue = value;
            }

        }

        @objid ("00469bc8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AnnotedSmDependency extends SmSingleDependency {
            @objid ("aa9ceb4c-7244-4192-a0c4-e241d7543561")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagParameterData) data).mAnnoted;
            }

            @objid ("22eea464-4bac-4481-9759-b4d0c55f77f8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagParameterData) data).mAnnoted = value;
            }

            @objid ("d9a35466-5d84-49ea-9a87-ca42bd827b12")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.ActualDep();
            }

        }

        @objid ("0047126a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class QualifiedSmDependency extends SmSingleDependency {
            @objid ("89402657-e82d-4f88-8bc4-9320ce7cf015")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagParameterData) data).mQualified;
            }

            @objid ("060bf442-905a-4add-8681-5f7afed78dd2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagParameterData) data).mQualified = value;
            }

            @objid ("04b01120-0f13-4e48-8c94-c10c06d9ffcc")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.QualifierDep();
            }

        }

    }

}
