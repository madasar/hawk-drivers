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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.TemplateBindingData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterSubstitutionImpl;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
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

@objid ("001e961e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TemplateParameterSubstitution.class, factory=TemplateParameterSubstitutionData.Metadata.ObjectFactory.class)
public class TemplateParameterSubstitutionData extends ModelElementData {
    @objid ("cd7a0566-2cda-4b72-b5b0-f94b5f96769b")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("d893e078-d72e-4647-958a-87fa323e8c7f")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=TemplateBindingData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("86d4fd07-008b-42e3-8f24-eb2fa0adb56b")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.ActualSmDependency.class, partof = true)
     SmObjectImpl mActual;

    @objid ("394e810d-acb1-46a0-88ba-0389c5582603")
    @SmaMetaAssociation(metaName="FormalParameter", typeDataClass=TemplateParameterData.class, min=1, max=1, smAssociationClass=Metadata.FormalParameterSmDependency.class, partof = true)
     SmObjectImpl mFormalParameter;

    @objid ("cebf8c66-ffe1-4c74-8ec2-ea56a3416b3c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00653eca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8b88afc6-ba51-4f80-874a-9b36fce63ea5")
        private static SmClass smClass = null;

        @objid ("b9427f10-9ef5-4404-affb-9c8408a49c46")
        private static SmAttribute ValueAtt = null;

        @objid ("1d8961a8-7803-4bef-8770-e2a0ae0433bb")
        private static SmDependency OwnerDep = null;

        @objid ("95d726a5-8b9f-487e-9d90-6b9d9c6d96eb")
        private static SmDependency ActualDep = null;

        @objid ("cab0b40b-ab26-400b-b9b8-cd0d1e41e56b")
        private static SmDependency FormalParameterDep = null;

        @objid ("95de3f17-903d-4813-a25e-5ba9ef4faf83")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateParameterSubstitutionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6bdd1091-6248-4217-b480-3e05a375e22d")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("ae3b4030-73fd-48a2-af8b-0adb684f3cbb")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("3ef43ff8-e5f5-427a-b7b5-a3244b086ebf")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("0215371f-7dd8-4d3c-a2c9-95f79bf8bc5a")
        public static SmDependency FormalParameterDep() {
            if (FormalParameterDep == null) {
            	FormalParameterDep = classof().getDependencyDef("FormalParameter");
            }
            return FormalParameterDep;
        }

        @objid ("ae60f8fa-b1ba-4f80-b6dc-11343c2792b6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4cf0d2eb-1a67-4885-8c51-7716492c90bc")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("a2506d3d-59c9-4df4-adaa-d609d62ac208")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("6a7070b9-1945-4bd0-8d38-532c0f58eeec")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("48b8d39f-1a9f-4c9a-ad1c-be0994cf3087")
        public static SmDependency getFormalParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalParameterDep;
        }

        @objid ("00657ef8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("132da363-e5da-41af-80dc-514613900c3f")
            public ISmObjectData createData() {
                return new TemplateParameterSubstitutionData();
            }

            @objid ("50e1a99f-588b-41af-828c-b90e8018298f")
            public SmObjectImpl createImpl() {
                return new TemplateParameterSubstitutionImpl();
            }

        }

        @objid ("0065df7e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("8b720b71-047a-4825-9328-d49e3bf26838")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mValue;
            }

            @objid ("a4b6bb36-aa85-4e63-84f3-de16ad67d0b4")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterSubstitutionData) data).mValue = value;
            }

        }

        @objid ("00664158-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmSingleDependency {
            @objid ("f9ea8688-3385-4197-ba4f-da89de14b880")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mActual;
            }

            @objid ("6cf5b4fa-8d7c-4811-a35a-0111d0094e39")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mActual = value;
            }

            @objid ("b06fb942-225e-480b-9806-fb1f5637c4e1")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TemplateSubstitutionDep();
            }

        }

        @objid ("0066b5de-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("12de4d98-9aef-4e8f-b9bd-2d7acc5ce718")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mOwner;
            }

            @objid ("271fd547-c9a1-436c-8db8-a76ec9a89de0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mOwner = value;
            }

            @objid ("711f9458-d7ba-4afb-9c73-32940119b756")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.ParameterSubstitutionDep();
            }

        }

        @objid ("00672a46-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FormalParameterSmDependency extends SmSingleDependency {
            @objid ("3d18ab31-d0b1-4c0c-9ee4-2403054f45d8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mFormalParameter;
            }

            @objid ("3022f725-9372-47bc-a3d2-28548ec9e8c3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mFormalParameter = value;
            }

            @objid ("7087f706-976b-4bf0-8210-2d148b11f1dc")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterSubstitutionDep();
            }

        }

    }

}
