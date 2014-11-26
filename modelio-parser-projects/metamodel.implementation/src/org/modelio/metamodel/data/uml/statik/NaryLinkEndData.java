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
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.data.uml.statik.NaryLinkData;
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.statik.NaryLinkEndImpl;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
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

@objid ("00768072-17e8-10a1-88a0-001ec947cd2a")
@SmaMetaClass(mmClass=NaryLinkEnd.class, factory=NaryLinkEndData.Metadata.ObjectFactory.class)
public class NaryLinkEndData extends ModelElementData {
    @objid ("7261ec53-c881-4b81-aefd-e3e3b8deeb17")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("586877e1-575c-4dcd-a2b8-b54f235cebb8")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("a8d6c7dd-2d82-445a-b1f3-4715c7a65ce3")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("c7f43819-9cc8-4659-b747-1e33fed21e8a")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("9052fc2d-254b-4459-b9ad-50d7ffe95c08")
    @SmaMetaAssociation(metaName="Source", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("db8052cb-e5df-4bbe-a8e1-f93fc72b4247")
    @SmaMetaAssociation(metaName="NaryLink", typeDataClass=NaryLinkData.class, min=0, max=1, smAssociationClass=Metadata.NaryLinkSmDependency.class, sharedComponent = true)
     SmObjectImpl mNaryLink;

    @objid ("011638a4-56d5-4425-b58c-27635e3b984e")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=RequiredInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ConsumerSmDependency.class, partof = true)
     SmObjectImpl mConsumer;

    @objid ("6b44e73b-4aae-4a4f-825c-1f103a169da8")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=ProvidedInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ProviderSmDependency.class, partof = true)
     SmObjectImpl mProvider;

    @objid ("40ccd2d6-d2f3-44a0-9b2c-ad8942165311")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00278b02-17f2-10a1-88a0-001ec947cd2a")
    public static class Metadata {
        @objid ("f88a2462-3833-4696-9f16-36357f1ba65b")
        private static SmClass smClass = null;

        @objid ("7b81e8a5-6dee-409f-9c42-7bfc6e14026c")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("be728886-0224-410d-82bf-2de2dd47fddc")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("18fae995-a4d2-49b1-91c7-88bea5a00154")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("5516b0ce-fe78-48e7-9c02-36a3be6e5e13")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("d97c2c5e-63e1-4d0d-8c50-95e3ad7e1fa1")
        private static SmDependency SourceDep = null;

        @objid ("2dd5efda-7ce3-476e-848f-bfd805ff4347")
        private static SmDependency NaryLinkDep = null;

        @objid ("b2d73185-5dec-4d29-8284-40d166603b66")
        private static SmDependency ConsumerDep = null;

        @objid ("850e1dd8-901c-4eed-9ea4-50d8fd0e1976")
        private static SmDependency ProviderDep = null;

        @objid ("9a1e7869-6ef1-4eaa-8e91-4fa4a0e42c56")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryLinkEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("014025f9-96c0-4750-ab78-f37754da8753")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("18ca5fdb-fcac-4b4b-9273-62979cda2802")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("ca0b171f-7da3-4d49-96e7-b8080e726423")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("2b4abd14-5a05-4aa4-9000-306fddff8205")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("4f03664e-2816-4bb1-9672-4e20c98fa942")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("8332ac6c-272a-47dc-b521-1ce1bda099c5")
        public static SmDependency NaryLinkDep() {
            if (NaryLinkDep == null) {
            	NaryLinkDep = classof().getDependencyDef("NaryLink");
            }
            return NaryLinkDep;
        }

        @objid ("0c771324-3777-46bb-8a65-20040db160c9")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("1521ff21-c10d-42cf-9d1b-79b4804c17b8")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("bb40a4a9-a258-4d39-b0d1-698f63bcafba")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("949b829a-1994-4f5b-871c-e4eec196f4d6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("76e701a3-f80b-4db8-958c-271d4230d097")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("03200f75-1f0f-45bf-b41f-20b5bd3b346a")
        public static SmDependency getNaryLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryLinkDep;
        }

        @objid ("ca040ad3-d867-426f-ba8b-80c69777128e")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("0ce23231-edd0-4fee-aeed-839d90c3920a")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("b1defde9-6f69-48d0-84d9-3439588ee70f")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("b8cf8ad3-16b1-4731-bc87-3ecdb98b6a88")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("d4184f53-4dd0-4d23-84ca-3b4eed8cbff8")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("0027db5c-17f2-10a1-88a0-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6c6586e7-560e-4d1c-9d77-cd87a16a161f")
            public ISmObjectData createData() {
                return new NaryLinkEndData();
            }

            @objid ("27233328-3a4b-4f0a-905f-8813090ed6fe")
            public SmObjectImpl createImpl() {
                return new NaryLinkEndImpl();
            }

        }

        @objid ("00286748-17f2-10a1-88a0-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("5e837924-ce17-477e-947a-c94ff8a26314")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mIsOrdered;
            }

            @objid ("b898c904-f2e2-45d4-af86-877ae92ff7cc")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mIsOrdered = value;
            }

        }

        @objid ("0028f0aa-17f2-10a1-88a0-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("6bd7d2a2-b258-461d-8011-c939c8459a26")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mIsUnique;
            }

            @objid ("7e5097d5-2c50-4a97-b53c-155737e41921")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mIsUnique = value;
            }

        }

        @objid ("00297ad4-17f2-10a1-88a0-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("045fb8dc-6aca-4fd1-ac8c-440d967e551f")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mMultiplicityMax;
            }

            @objid ("d4c38a85-814d-45ac-97e8-1b5676b846ce")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mMultiplicityMax = value;
            }

        }

        @objid ("002a0530-17f2-10a1-88a0-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("3f1664d0-313d-4449-ba7f-188d85a7aab3")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mMultiplicityMin;
            }

            @objid ("6a1a892e-4d00-4a70-9609-22a08518368d")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mMultiplicityMin = value;
            }

        }

        @objid ("002a9194-17f2-10a1-88a0-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("ea99c5ca-d5e8-44cd-bed6-dd10dbc1f68a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mSource;
            }

            @objid ("128515f0-7969-4bfc-9826-e0b5ccd00424")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mSource = value;
            }

            @objid ("352f5f72-3d33-4cfd-afc3-bcbd489bd9f2")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnedNaryEndDep();
            }

        }

        @objid ("002b4bca-17f2-10a1-88a0-001ec947cd2a")
        public static class NaryLinkSmDependency extends SmSingleDependency {
            @objid ("a26237e9-107c-4175-92ab-240baec644a1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mNaryLink;
            }

            @objid ("4d839831-1089-4077-942e-46d3de540fe4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mNaryLink = value;
            }

            @objid ("30a7b5ff-36fa-4a7e-8caa-ec94c64debf8")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.NaryLinkEndDep();
            }

        }

        @objid ("ba7d51f6-e3d1-46bc-8d3a-43bdb5894c2e")
        public static class ConsumerSmDependency extends SmSingleDependency {
            @objid ("2f85ef14-b2cc-4ab7-b9ae-5e181b5d24d6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mConsumer;
            }

            @objid ("1f7a1505-2ef0-47a4-aef2-57c3600b578a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mConsumer = value;
            }

            @objid ("0a62dfc6-f6bb-4e4b-a157-132eb5a9a4b5")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.NaryProviderDep();
            }

        }

        @objid ("99c20131-c983-4eb7-8924-7e50c52eaee3")
        public static class ProviderSmDependency extends SmSingleDependency {
            @objid ("d437f05b-72b8-4715-9084-6610e0b42a77")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mProvider;
            }

            @objid ("760d89c5-b66e-4c9b-8f66-391614b1a402")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mProvider = value;
            }

            @objid ("20e6e978-d574-4658-9161-8e349ff1205b")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.NaryConsumerDep();
            }

        }

    }

}
