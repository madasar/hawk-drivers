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
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.statik.AttributeLinkImpl;
import org.modelio.metamodel.uml.statik.AttributeLink;
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

@objid ("00006a72-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AttributeLink.class, factory=AttributeLinkData.Metadata.ObjectFactory.class)
public class AttributeLinkData extends ModelElementData {
    @objid ("15631d5c-4172-4e9d-8566-e93877791e49")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("294e97f9-4e01-451c-8d3c-dc4fefcc6be8")
    @SmaMetaAssociation(metaName="Attributed", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.AttributedSmDependency.class)
     SmObjectImpl mAttributed;

    @objid ("ff5fa14d-b17c-469d-87f4-94fbcc5d508e")
    @SmaMetaAssociation(metaName="Base", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("7b6ecee3-2d01-47ed-91df-79e439fc8cd2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00454566-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0f0218af-aa85-4f43-ba5f-7543e6fb6279")
        private static SmClass smClass = null;

        @objid ("f5a174ab-81c0-4310-82fb-eb6568a5172a")
        private static SmAttribute ValueAtt = null;

        @objid ("3b580b88-1811-418a-8028-7adcfdf1a809")
        private static SmDependency AttributedDep = null;

        @objid ("f9d8620a-83a1-4f95-b6b1-e08074c1bddb")
        private static SmDependency BaseDep = null;

        @objid ("67610b2c-a8ef-447f-9ae6-30e7074fa99d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AttributeLinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("165a0123-33c6-4f7a-8fe3-3568e4a940ad")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("a0e15853-433f-4add-8acd-ac04dcaa9b6a")
        public static SmDependency AttributedDep() {
            if (AttributedDep == null) {
            	AttributedDep = classof().getDependencyDef("Attributed");
            }
            return AttributedDep;
        }

        @objid ("f0e04712-3701-41ad-976b-eb4dcfd7012a")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("3b1613d1-8262-4ad2-8afe-0037b5f32f1b")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("688ff730-b044-422e-acc1-af06499b4a8d")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("db40606e-c56b-48b1-b963-9bd42b0c3944")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6bac0aab-7d4d-4b0e-bd5f-c2bcb9b6a421")
        public static SmDependency getAttributedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AttributedDep;
        }

        @objid ("0045a18c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("078bd570-5d3d-4bcc-b9d6-19231ace239b")
            public ISmObjectData createData() {
                return new AttributeLinkData();
            }

            @objid ("af127bb7-68da-40a6-978b-d35d795662d8")
            public SmObjectImpl createImpl() {
                return new AttributeLinkImpl();
            }

        }

        @objid ("00460528-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("8365f4f2-a3a2-48f6-9813-a97ada670629")
            public Object getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mValue;
            }

            @objid ("fdcd3cf8-09df-42a3-ace5-b6e7530b3da8")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeLinkData) data).mValue = value;
            }

        }

        @objid ("004666da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("28195f8e-5271-434d-b05c-b1fafc31b3c0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mBase;
            }

            @objid ("3921a58c-5970-4640-800e-6713d03a4344")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeLinkData) data).mBase = value;
            }

            @objid ("d2481455-3ba7-4851-93e9-91e68ff6fa4c")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.OccurenceDep();
            }

        }

        @objid ("0046db2e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AttributedSmDependency extends SmSingleDependency {
            @objid ("948bd558-5ed3-49e8-8322-9996bf90702f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mAttributed;
            }

            @objid ("ffef87c2-971c-452c-b76d-c8c9312b97a4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeLinkData) data).mAttributed = value;
            }

            @objid ("1989b9fd-2cb8-49eb-a7d7-1d8e0f8283fa")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.SlotDep();
            }

        }

    }

}
