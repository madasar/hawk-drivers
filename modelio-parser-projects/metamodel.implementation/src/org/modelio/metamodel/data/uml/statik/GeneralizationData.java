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
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.statik.GeneralizationImpl;
import org.modelio.metamodel.uml.statik.Generalization;
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

@objid ("000cfae4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Generalization.class, factory=GeneralizationData.Metadata.ObjectFactory.class)
public class GeneralizationData extends ModelElementData {
    @objid ("e7fbc0f1-c043-4399-b5af-e642adaf45b5")
    @SmaMetaAttribute(metaName="Discriminator", type=String.class, smAttributeClass=Metadata.DiscriminatorSmAttribute.class)
     Object mDiscriminator = "";

    @objid ("24c4d877-882f-44f9-9dc2-e1cb705bce1a")
    @SmaMetaAssociation(metaName="SuperType", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.SuperTypeSmDependency.class, partof = true)
     SmObjectImpl mSuperType;

    @objid ("bd9cca57-7ce6-4e25-9857-ea513de38047")
    @SmaMetaAssociation(metaName="SubType", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.SubTypeSmDependency.class)
     SmObjectImpl mSubType;

    @objid ("848a4b0a-accd-4caa-a0d9-98032cf6ef3e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003cd9da-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("01ee1536-18ed-490a-a5f1-3126dd855a3f")
        private static SmClass smClass = null;

        @objid ("e5f46d2e-2bd8-4e3d-aafb-f725f011822b")
        private static SmAttribute DiscriminatorAtt = null;

        @objid ("1288dcb5-2d2b-4635-b475-d0bef207c57c")
        private static SmDependency SuperTypeDep = null;

        @objid ("5d06885e-8e0b-4f81-b082-f91c0c64a13f")
        private static SmDependency SubTypeDep = null;

        @objid ("70e675ea-89c1-44d4-8181-c55de4001305")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("85f4cff2-ea40-42f6-aa2b-62a86ce4a2fd")
        public static SmAttribute DiscriminatorAtt() {
            if (DiscriminatorAtt == null) {
            	DiscriminatorAtt = classof().getAttributeDef("Discriminator");
            }
            return DiscriminatorAtt;
        }

        @objid ("7d9fe2c4-bbb6-4499-acbc-145fcf9fb842")
        public static SmDependency SuperTypeDep() {
            if (SuperTypeDep == null) {
            	SuperTypeDep = classof().getDependencyDef("SuperType");
            }
            return SuperTypeDep;
        }

        @objid ("6a3e69c9-72b3-4499-9e40-a5f66ab81b6e")
        public static SmDependency SubTypeDep() {
            if (SubTypeDep == null) {
            	SubTypeDep = classof().getDependencyDef("SubType");
            }
            return SubTypeDep;
        }

        @objid ("f3a2b59c-3992-4e90-b2cd-321db01cd748")
        public static SmDependency getSubTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubTypeDep;
        }

        @objid ("689e23f1-1923-408a-afee-f132e0ef769f")
        public static SmAttribute getDiscriminatorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiscriminatorAtt;
        }

        @objid ("813f5fa9-39c5-420b-ac4f-aa1a91da4fd4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("aaf01953-e429-441c-b6e1-8fced1909739")
        public static SmDependency getSuperTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SuperTypeDep;
        }

        @objid ("003d264c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e9097527-3e51-483d-a7fa-5024f02acb12")
            public ISmObjectData createData() {
                return new GeneralizationData();
            }

            @objid ("5e5e6b68-919d-445e-8298-1cbf0dc3829b")
            public SmObjectImpl createImpl() {
                return new GeneralizationImpl();
            }

        }

        @objid ("003d9316-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DiscriminatorSmAttribute extends SmAttribute {
            @objid ("dc02adc0-c943-48ad-808b-80433d912fe5")
            public Object getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mDiscriminator;
            }

            @objid ("cfde55be-27be-4b4e-a9ae-3c61a24ac50f")
            public void setValue(ISmObjectData data, Object value) {
                ((GeneralizationData) data).mDiscriminator = value;
            }

        }

        @objid ("003e00c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubTypeSmDependency extends SmSingleDependency {
            @objid ("a2e4316c-62f8-4c47-9c57-a7879a38c766")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mSubType;
            }

            @objid ("ba815796-9a6b-4787-96eb-21a4b34691c5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralizationData) data).mSubType = value;
            }

            @objid ("15855f6c-d4f3-461e-9a0a-80174dcca604")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ParentDep();
            }

        }

        @objid ("003e81c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SuperTypeSmDependency extends SmSingleDependency {
            @objid ("66c0851b-6565-4c61-9b9d-4ad432eca6be")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mSuperType;
            }

            @objid ("996e41fa-f6bf-4150-b52f-c5c8e3f9244a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralizationData) data).mSuperType = value;
            }

            @objid ("ec6c081e-f71d-4c83-abaa-7378f1576179")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.SpecializationDep();
            }

        }

    }

}
