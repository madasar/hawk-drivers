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
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.impl.uml.statik.LinkImpl;
import org.modelio.metamodel.uml.statik.Link;
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

@objid ("2eae30e5-5566-403a-a2fc-fb71b87360b4")
@SmaMetaClass(mmClass=Link.class, factory=LinkData.Metadata.ObjectFactory.class)
public class LinkData extends ModelElementData {
    @objid ("34f6270a-b770-425b-85c0-4d2e16507bf4")
    @SmaMetaAssociation(metaName="Model", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("6443c1e4-cbfa-48c1-bfc9-b6840b2a44b5")
    @SmaMetaAssociation(metaName="LinkEnd", typeDataClass=LinkEndData.class, min=2, max=2, smAssociationClass=Metadata.LinkEndSmDependency.class)
     List<SmObjectImpl> mLinkEnd = null;

    @objid ("dccc4330-f339-41d9-a5a8-cb18168951c8")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.SentSmDependency.class)
     SmObjectImpl mSent;

    @objid ("a84c4a09-4295-4b09-bde3-0b84ef017b30")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("7094e4fd-2afb-4b93-8f27-ba8b04f50a93")
    public static class Metadata {
        @objid ("97430309-8069-4cb9-82d8-59ee7db55134")
        private static SmClass smClass = null;

        @objid ("59374c7c-491f-49e9-92e8-7139bf851fdd")
        private static SmDependency ModelDep = null;

        @objid ("41de4143-a9e9-4074-82a6-62734cc60557")
        private static SmDependency LinkEndDep = null;

        @objid ("5e709b0a-2fea-406b-8dbb-054264fc66e3")
        private static SmDependency SentDep = null;

        @objid ("efb260a3-8931-40f4-9e48-f3168eb8ca5f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("45e44c73-a3b1-4929-9e5c-422a7126bc5e")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("bdc3793c-d6a4-4352-b54e-b58e8097ab64")
        public static SmDependency LinkEndDep() {
            if (LinkEndDep == null) {
            	LinkEndDep = classof().getDependencyDef("LinkEnd");
            }
            return LinkEndDep;
        }

        @objid ("922b4ab9-0c38-4a12-912b-72e3858aa3e6")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("6e5f6b4d-2b73-4278-95e3-fee5f197b2c6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9b6f6949-6495-49af-a978-acd453d97cf0")
        public static SmDependency getLinkEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkEndDep;
        }

        @objid ("5f6dc40e-f1ee-4a7d-b85f-9735c10c43a9")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("04a2abc7-dd1e-4c63-88e0-b0c0b1ca687d")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("8d98c367-8266-4168-b8a3-271093a7ee09")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1b2e8985-0f3f-4623-b82d-34265cf92f72")
            public ISmObjectData createData() {
                return new LinkData();
            }

            @objid ("c8ab808c-ece4-4095-adae-315d19be3fbe")
            public SmObjectImpl createImpl() {
                return new LinkImpl();
            }

        }

        @objid ("34799fbc-28e8-473c-8320-544cb526ece1")
        public static class LinkEndSmDependency extends SmMultipleDependency {
            @objid ("2eae9087-ed89-4c94-aa72-151e61c83d03")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LinkData)data).mLinkEnd != null)? ((LinkData)data).mLinkEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("2bf7e9a9-7764-4836-9cea-4a647fa3c7f4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LinkData) data).mLinkEnd = new ArrayList<>(initialCapacity);
                return ((LinkData) data).mLinkEnd;
            }

            @objid ("337a7796-2e0a-4ec1-a0df-c736d20022bb")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.LinkDep();
            }

        }

        @objid ("6fb40a60-29f0-4ac4-9d99-e5cb1a3b3713")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("c1b24350-1df0-4336-9135-5bad5431c2a1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkData) data).mModel;
            }

            @objid ("51919154-2d41-4e1d-beed-178b0452ffec")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkData) data).mModel = value;
            }

            @objid ("8feb7594-c788-4c22-9aa8-29bfbc90b435")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.OccurenceDep();
            }

        }

        @objid ("4e086983-d159-4675-aa67-c691b60873d6")
        public static class SentSmDependency extends SmSingleDependency {
            @objid ("1a141d1a-3a5c-454e-a864-82d04f828350")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkData) data).mSent;
            }

            @objid ("8a86f0a7-0059-4e93-a6ad-78ede561a8f6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkData) data).mSent = value;
            }

            @objid ("03a8aad6-76da-4e68-82d5-06d0e9e3a73f")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.ChannelDep();
            }

        }

    }

}
