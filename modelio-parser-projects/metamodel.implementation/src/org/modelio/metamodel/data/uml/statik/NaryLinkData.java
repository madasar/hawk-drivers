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
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.NaryAssociationData;
import org.modelio.metamodel.data.uml.statik.NaryLinkEndData;
import org.modelio.metamodel.impl.uml.statik.NaryLinkImpl;
import org.modelio.metamodel.uml.statik.NaryLink;
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

@objid ("0022bc4e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NaryLink.class, factory=NaryLinkData.Metadata.ObjectFactory.class)
public class NaryLinkData extends ModelElementData {
    @objid ("faeb0ff9-4544-455c-aec6-a556b86b1d8b")
    @SmaMetaAssociation(metaName="NaryLinkEnd", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryLinkEndSmDependency.class, sharedComponent = true)
     List<SmObjectImpl> mNaryLinkEnd = null;

    @objid ("ce57f4a3-3ac5-46d2-bc25-2f3c53471da8")
    @SmaMetaAssociation(metaName="Model", typeDataClass=NaryAssociationData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("140ef8f4-9ace-4f3b-806c-b5399b39c9f2")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("d27ec294-260d-4731-995d-db20a0c35377")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class)
     List<SmObjectImpl> mSent = null;

    @objid ("7d4071ed-e155-440b-8494-b00b1d16e814")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008ef2c4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d7d6f2ce-ce28-4262-9fa2-370d2d3d2b83")
        private static SmClass smClass = null;

        @objid ("9abc97ef-7f82-4406-97f5-0ba8ecd80b25")
        private static SmDependency NaryLinkEndDep = null;

        @objid ("6ac3806c-2cb0-4026-86d0-3363ff278c44")
        private static SmDependency ModelDep = null;

        @objid ("6d551874-5c24-42c2-aa5b-2df43f9bb2d3")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("ccc15389-92a7-4279-b1c6-a0f2278e468f")
        private static SmDependency SentDep = null;

        @objid ("6b03309a-4177-4033-b278-2ab8d0fa15e0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryLinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("31c00912-8310-41bb-914d-862fdb9f75fe")
        public static SmDependency NaryLinkEndDep() {
            if (NaryLinkEndDep == null) {
            	NaryLinkEndDep = classof().getDependencyDef("NaryLinkEnd");
            }
            return NaryLinkEndDep;
        }

        @objid ("0c701acd-4ac4-46c0-87b2-535923558d64")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("342977c1-055e-41c3-bfd3-1dc5066e2a6d")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("ea752956-050e-4c60-b4fe-8e478de75a1b")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("323795c6-8a5c-435c-a5c8-e79fb90b38ca")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("94b911fe-f438-4c7c-9f3f-d4356fe4e163")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("9ef6a456-c5d4-47d1-b0a2-2914426776fb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("47f24a33-2cde-45c5-b9e0-3a7bf9185aed")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("ba4fada5-f855-41ce-a66f-9f3f0653b8d4")
        public static SmDependency getNaryLinkEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryLinkEndDep;
        }

        @objid ("008f3284-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e941c45c-2feb-4e5f-9d0b-981b620df31a")
            public ISmObjectData createData() {
                return new NaryLinkData();
            }

            @objid ("fd625fec-7a6f-4fd5-b935-db1f13bbe2e1")
            public SmObjectImpl createImpl() {
                return new NaryLinkImpl();
            }

        }

        @objid ("008f94ea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NaryLinkEndSmDependency extends SmMultipleDependency {
            @objid ("5aa99f7e-994b-4e2c-8350-cb9f3e1b085b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mNaryLinkEnd != null)? ((NaryLinkData)data).mNaryLinkEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("fb00a3fc-64c5-472a-a530-ad518bf918b6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mNaryLinkEnd = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mNaryLinkEnd;
            }

            @objid ("edff0615-6fb1-4af6-a6bc-e3a0662d928f")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.NaryLinkDep();
            }

        }

        @objid ("008ff64c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("eb1b9868-8ee6-4fd7-8390-8e473e2c7b7f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkData) data).mModel;
            }

            @objid ("1066b713-8b01-40d5-a553-50126605af36")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkData) data).mModel = value;
            }

            @objid ("1ae0faa0-99f2-4c0a-a93d-bd9482659862")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.OccurenceDep();
            }

        }

        @objid ("00551928-17f4-10a1-88a0-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("0dc2874d-4871-4c69-8e25-4b883691d20b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mSent != null)? ((NaryLinkData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("ce3e91c4-f2cb-4e28-b012-88f425291bbf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mSent = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mSent;
            }

            @objid ("46df75e2-4da5-4705-96c4-6c9dc6a7cd2e")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.NaryChannelDep();
            }

        }

        @objid ("0055c3e6-17f4-10a1-88a0-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("1b6cb8fa-00c6-4b6b-af8c-b02006bf1099")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mRealizedInformationFlow != null)? ((NaryLinkData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("77e38fca-eeee-49d4-b96f-af59215b054a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mRealizedInformationFlow;
            }

            @objid ("3733ea90-fbfe-49e2-80f4-6ce58df0f1fa")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingNaryLinkDep();
            }

        }

    }

}
