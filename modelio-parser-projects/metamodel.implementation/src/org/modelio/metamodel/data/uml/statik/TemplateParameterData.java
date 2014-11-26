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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterSubstitutionData;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterImpl;
import org.modelio.metamodel.uml.statik.TemplateParameter;
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

@objid ("001da934-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TemplateParameter.class, factory=TemplateParameterData.Metadata.ObjectFactory.class)
public class TemplateParameterData extends GeneralClassData {
    @objid ("05e7ee85-3a9e-4303-bf37-fa87ddfd917b")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("e1a14fd6-048e-4bc5-a12a-9c042b588107")
    @SmaMetaAttribute(metaName="IsValueParameter", type=Boolean.class, smAttributeClass=Metadata.IsValueParameterSmAttribute.class)
     Object mIsValueParameter = false;

    @objid ("575c4e15-3ece-4c9a-bdd1-b80ada4ae8b6")
    @SmaMetaAssociation(metaName="ParameterSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSubstitutionSmDependency.class, istodelete = true)
     List<SmObjectImpl> mParameterSubstitution = null;

    @objid ("86a31f8a-226b-4959-a8b9-5e2aca421b28")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("0e41464e-7896-4d4b-95e4-f278813b2bce")
    @SmaMetaAssociation(metaName="Parameterized", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ParameterizedSmDependency.class)
     SmObjectImpl mParameterized;

    @objid ("7cba2e1a-32ab-485c-8ac6-3d8400e8357d")
    @SmaMetaAssociation(metaName="OwnedParameterElement", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OwnedParameterElementSmDependency.class, component = true)
     SmObjectImpl mOwnedParameterElement;

    @objid ("1d27a15a-3929-4812-b05a-359df46ed2dd")
    @SmaMetaAssociation(metaName="DefaultType", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.DefaultTypeSmDependency.class, partof = true)
     SmObjectImpl mDefaultType;

    @objid ("717ab0f0-d3ac-48d8-83ea-fb1d7926610a")
    @SmaMetaAssociation(metaName="ParameterizedOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ParameterizedOperationSmDependency.class)
     SmObjectImpl mParameterizedOperation;

    @objid ("ab4cd8db-91b2-49fb-b9d9-d8cbe9569624")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00343d02-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("665bdc2c-95fa-4f15-8f4a-a4905f17e98a")
        private static SmClass smClass = null;

        @objid ("760278b5-e770-46f0-8919-76ca00414d19")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("5eb94103-e9c8-48e2-826f-d3a0e80bca63")
        private static SmAttribute IsValueParameterAtt = null;

        @objid ("f2ec30ab-d632-47c2-bcf5-918b73c6f539")
        private static SmDependency ParameterSubstitutionDep = null;

        @objid ("4bdc2fbb-5d9a-4a20-9568-380ed92d3b93")
        private static SmDependency TypeDep = null;

        @objid ("ab070c05-1f82-4b11-93ef-6481b4140cb8")
        private static SmDependency ParameterizedDep = null;

        @objid ("40438616-c7a3-4c26-8278-050cc27776de")
        private static SmDependency OwnedParameterElementDep = null;

        @objid ("9f7e93d0-fffa-479f-a444-f089e54e263e")
        private static SmDependency DefaultTypeDep = null;

        @objid ("add879a6-8687-4eeb-be4d-814684776665")
        private static SmDependency ParameterizedOperationDep = null;

        @objid ("09dba5ea-19d6-4790-8090-151a94be1721")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4f2a5e0c-270b-490c-9918-70c089f6965e")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("10691923-050f-49e4-a424-7643aeb823ca")
        public static SmAttribute IsValueParameterAtt() {
            if (IsValueParameterAtt == null) {
            	IsValueParameterAtt = classof().getAttributeDef("IsValueParameter");
            }
            return IsValueParameterAtt;
        }

        @objid ("08a07b0a-88b1-49b7-b6b4-95d150bedcba")
        public static SmDependency ParameterSubstitutionDep() {
            if (ParameterSubstitutionDep == null) {
            	ParameterSubstitutionDep = classof().getDependencyDef("ParameterSubstitution");
            }
            return ParameterSubstitutionDep;
        }

        @objid ("29a2cabb-2b42-42f3-897b-4416679966c4")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("edeeb7e4-50fa-40bb-8010-4af94390060f")
        public static SmDependency ParameterizedDep() {
            if (ParameterizedDep == null) {
            	ParameterizedDep = classof().getDependencyDef("Parameterized");
            }
            return ParameterizedDep;
        }

        @objid ("52ca1a9b-c188-480c-bb87-b6e62e19c74b")
        public static SmDependency OwnedParameterElementDep() {
            if (OwnedParameterElementDep == null) {
            	OwnedParameterElementDep = classof().getDependencyDef("OwnedParameterElement");
            }
            return OwnedParameterElementDep;
        }

        @objid ("9bbfb24e-f267-490e-bb78-8792334ad30e")
        public static SmDependency DefaultTypeDep() {
            if (DefaultTypeDep == null) {
            	DefaultTypeDep = classof().getDependencyDef("DefaultType");
            }
            return DefaultTypeDep;
        }

        @objid ("5d74403b-c40f-40e0-9d70-1c963984607f")
        public static SmDependency ParameterizedOperationDep() {
            if (ParameterizedOperationDep == null) {
            	ParameterizedOperationDep = classof().getDependencyDef("ParameterizedOperation");
            }
            return ParameterizedOperationDep;
        }

        @objid ("626ea1de-194c-488b-895c-c6933684d118")
        public static SmDependency getParameterizedOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterizedOperationDep;
        }

        @objid ("689211b6-ee9d-4c05-8666-48e6bfc6d184")
        public static SmDependency getParameterSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterSubstitutionDep;
        }

        @objid ("e36ee8cb-8e8b-48d9-923e-bdf3281a4e36")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("6f435961-d051-4fa9-a308-de97f46476af")
        public static SmAttribute getIsValueParameterAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsValueParameterAtt;
        }

        @objid ("d6fcaaff-6c6f-402b-b4d7-aaf7943581bc")
        public static SmDependency getOwnedParameterElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedParameterElementDep;
        }

        @objid ("0f401cca-5a1b-44f4-8971-c32773af6518")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("bb60f847-4405-4140-8f9a-0b942cca5fee")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2091db9d-a7a3-42e8-8d07-520792909142")
        public static SmDependency getDefaultTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultTypeDep;
        }

        @objid ("e8a9b180-bdf9-4b63-8b1b-2025e00cd126")
        public static SmDependency getParameterizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterizedDep;
        }

        @objid ("00348046-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("86cf50a1-4ddb-4785-bac5-6077951cd648")
            public ISmObjectData createData() {
                return new TemplateParameterData();
            }

            @objid ("5ab700a3-a8a7-4b50-a881-b4cb5dbfc71a")
            public SmObjectImpl createImpl() {
                return new TemplateParameterImpl();
            }

        }

        @objid ("0034e27a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("5b52b740-e44e-4beb-afb5-ff8766a0fd58")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mDefaultValue;
            }

            @objid ("47113741-a623-4586-ac02-a13498881d72")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterData) data).mDefaultValue = value;
            }

        }

        @objid ("00354332-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsValueParameterSmAttribute extends SmAttribute {
            @objid ("174af7ad-b4fd-459f-ad1e-c881ddfa7974")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mIsValueParameter;
            }

            @objid ("32cefcdc-12d9-4c1f-ac45-225caaba35e3")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterData) data).mIsValueParameter = value;
            }

        }

        @objid ("0035a714-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterizedSmDependency extends SmSingleDependency {
            @objid ("7fd28bb8-3c96-4ef5-9eb5-b9b0c6b4b727")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mParameterized;
            }

            @objid ("295cb293-ce88-43c4-8b3c-885ed31b37b5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mParameterized = value;
            }

            @objid ("810a713b-9136-497b-bd40-39876a4771a2")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.TemplateDep();
            }

        }

        @objid ("00361e4c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterizedOperationSmDependency extends SmSingleDependency {
            @objid ("9bb002e1-d6a5-4416-9646-3ac1e954bbba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mParameterizedOperation;
            }

            @objid ("a368a353-cada-4c4d-93cd-8445b14cc119")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mParameterizedOperation = value;
            }

            @objid ("9030b764-3d75-4bce-9aa9-35e5044acf2e")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.TemplateDep();
            }

        }

        @objid ("00369412-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("714bd6a3-d211-45cd-861d-b62a68cd1b7c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TemplateParameterData)data).mParameterSubstitution != null)? ((TemplateParameterData)data).mParameterSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("af44af95-c8d0-4437-b183-7f169ecfaabe")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TemplateParameterData) data).mParameterSubstitution = new ArrayList<>(initialCapacity);
                return ((TemplateParameterData) data).mParameterSubstitution;
            }

            @objid ("bdf7ee47-11bc-4e7a-81b0-7a43a4a78f59")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.FormalParameterDep();
            }

        }

        @objid ("003701fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultTypeSmDependency extends SmSingleDependency {
            @objid ("51571463-ad33-4b4d-ab53-061b945e00b8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mDefaultType;
            }

            @objid ("a86d54ce-d5d4-414b-bfd9-e07fe345fb09")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mDefaultType = value;
            }

            @objid ("c872f41a-63ee-425e-9b52-b605abedc906")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DefaultParameteringDep();
            }

        }

        @objid ("003778dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedParameterElementSmDependency extends SmSingleDependency {
            @objid ("fe3c765e-b9cc-47c6-a33b-f0a65d8c2a4c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mOwnedParameterElement;
            }

            @objid ("4ca74f5b-4e38-4807-891d-5feae694dccb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mOwnedParameterElement = value;
            }

            @objid ("d2467782-bee5-4aa2-84bf-5959ab8d155a")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.OwnerTemplateParameterDep();
            }

        }

        @objid ("0037efd8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("df087ec6-f17d-4679-be48-72d660da09b3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mType;
            }

            @objid ("2cee38bf-32d0-4506-9d9c-812cd895f39d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mType = value;
            }

            @objid ("84d911f5-e4bd-4e50-ab54-f4795590704c")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TypingParameterDep();
            }

        }

    }

}
