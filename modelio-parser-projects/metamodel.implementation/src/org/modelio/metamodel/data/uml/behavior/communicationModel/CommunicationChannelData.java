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
package org.modelio.metamodel.data.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationNodeData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.LinkData;
import org.modelio.metamodel.data.uml.statik.NaryLinkData;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationChannelImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
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

@objid ("67558b34-b4c9-476e-939c-3da1dcc447df")
@SmaMetaClass(mmClass=CommunicationChannel.class, factory=CommunicationChannelData.Metadata.ObjectFactory.class)
public class CommunicationChannelData extends ModelElementData {
    @objid ("c4451e77-466b-40c6-b715-6afae804fd55")
    @SmaMetaAssociation(metaName="StartToEndMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.StartToEndMessageSmDependency.class, component = true)
     List<SmObjectImpl> mStartToEndMessage = null;

    @objid ("433f3951-1717-4261-951d-c6e8e57eae2b")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=LinkData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class, partof = true)
     SmObjectImpl mChannel;

    @objid ("cc37c3e2-8e8c-4446-8ae5-d7a327c2df43")
    @SmaMetaAssociation(metaName="Start", typeDataClass=CommunicationNodeData.class, min=0, max=1, smAssociationClass=Metadata.StartSmDependency.class)
     SmObjectImpl mStart;

    @objid ("8731832a-aee7-4bcc-a79d-6b08d95932fa")
    @SmaMetaAssociation(metaName="NaryChannel", typeDataClass=NaryLinkData.class, min=0, max=1, smAssociationClass=Metadata.NaryChannelSmDependency.class, partof = true)
     SmObjectImpl mNaryChannel;

    @objid ("73aa8e0a-7ff7-491c-bc02-b4f94bb38f1d")
    @SmaMetaAssociation(metaName="EndToStartMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.EndToStartMessageSmDependency.class, component = true)
     List<SmObjectImpl> mEndToStartMessage = null;

    @objid ("b82e4ada-5950-4355-b49e-d6ade1db2e92")
    @SmaMetaAssociation(metaName="End", typeDataClass=CommunicationNodeData.class, min=0, max=1, smAssociationClass=Metadata.EndSmDependency.class, partof = true)
     SmObjectImpl mEnd;

    @objid ("98ba4625-adc5-4245-8d86-54daacc48fe0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0bcffcc0-9f6e-4a96-b0c1-227e45e2b687")
    public static class Metadata {
        @objid ("a69cb25c-865e-497d-b1f4-df54f882e791")
        private static SmClass smClass = null;

        @objid ("13dea4ae-2511-489a-bd50-72e70893e642")
        private static SmDependency StartToEndMessageDep = null;

        @objid ("535ddea3-fc8a-4f1c-801f-d8d849d02861")
        private static SmDependency ChannelDep = null;

        @objid ("a9f28588-637f-405b-ba5d-7e08a92133b3")
        private static SmDependency StartDep = null;

        @objid ("23820bf3-a32a-464b-a2a1-2d461e3f3e94")
        private static SmDependency NaryChannelDep = null;

        @objid ("12b79456-aa9c-405e-b2d0-b8ca00e92350")
        private static SmDependency EndToStartMessageDep = null;

        @objid ("a8d31aa4-2077-4377-b959-e2737d4fa726")
        private static SmDependency EndDep = null;

        @objid ("3dc4e086-a61c-466e-a906-1ad1ecd308c0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationChannelData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e788e01a-d6a9-4326-b532-d94b2a116641")
        public static SmDependency StartToEndMessageDep() {
            if (StartToEndMessageDep == null) {
            	StartToEndMessageDep = classof().getDependencyDef("StartToEndMessage");
            }
            return StartToEndMessageDep;
        }

        @objid ("5f64f93c-fafc-4031-80c6-a74788757962")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("b6428b13-d88f-486d-8c88-d9903d474694")
        public static SmDependency StartDep() {
            if (StartDep == null) {
            	StartDep = classof().getDependencyDef("Start");
            }
            return StartDep;
        }

        @objid ("ceb28f16-8e13-4e32-8e82-3b6abfe9dff4")
        public static SmDependency NaryChannelDep() {
            if (NaryChannelDep == null) {
            	NaryChannelDep = classof().getDependencyDef("NaryChannel");
            }
            return NaryChannelDep;
        }

        @objid ("0d60f384-b5c7-4168-a8d0-88a22d51affe")
        public static SmDependency EndToStartMessageDep() {
            if (EndToStartMessageDep == null) {
            	EndToStartMessageDep = classof().getDependencyDef("EndToStartMessage");
            }
            return EndToStartMessageDep;
        }

        @objid ("b9386cfe-d072-4fc5-b644-246edc6b1124")
        public static SmDependency EndDep() {
            if (EndDep == null) {
            	EndDep = classof().getDependencyDef("End");
            }
            return EndDep;
        }

        @objid ("ac72b773-d10a-40b5-b699-4c3cb5112b4e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8168d78a-71c3-47b5-b637-98445e2e32f0")
        public static SmDependency getStartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartDep;
        }

        @objid ("676d08bb-1f7b-4aa1-9bd1-c00e5edc6bc1")
        public static SmDependency getNaryChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryChannelDep;
        }

        @objid ("1b78411b-cda9-418d-b529-d6d8863abf14")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("69b243b6-26e3-4f73-8a80-effe69756b36")
        public static SmDependency getEndToStartMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndToStartMessageDep;
        }

        @objid ("43c3cecb-85e2-4c83-9c9f-74be9277f9d9")
        public static SmDependency getEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndDep;
        }

        @objid ("95e5511c-b46b-42d5-a14a-f8e404ec6ff6")
        public static SmDependency getStartToEndMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartToEndMessageDep;
        }

        @objid ("6c6b1c22-2b19-477a-9ccf-5f7155f7b19a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("387a5480-7c93-484c-88d4-f002b5d2e8d6")
            public ISmObjectData createData() {
                return new CommunicationChannelData();
            }

            @objid ("1de1fc97-9602-43ed-872e-a4fe07811720")
            public SmObjectImpl createImpl() {
                return new CommunicationChannelImpl();
            }

        }

        @objid ("fd848b1b-8395-4786-bc7c-3950420cdcb1")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("b2b6cb45-6623-4e03-9944-4cc14787511f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mChannel;
            }

            @objid ("c7318ed6-ade6-4764-bae1-deef34195ea6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mChannel = value;
            }

            @objid ("9adafb28-96d0-4b18-b7bd-88357b2c6ad1")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.SentDep();
            }

        }

        @objid ("8e157f6f-1fdc-40e6-b94e-ebdb55e2bddf")
        public static class StartSmDependency extends SmSingleDependency {
            @objid ("28cf08b9-f85f-445d-ac24-d1048246ce8e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mStart;
            }

            @objid ("cad6ede0-166b-4dd4-95af-57459171b0d8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mStart = value;
            }

            @objid ("0b5a53e6-8a0b-4c30-8741-180e9c5c2eb9")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.StartedDep();
            }

        }

        @objid ("8d1e7fe8-18d7-472b-9ab3-592265af84c0")
        public static class EndSmDependency extends SmSingleDependency {
            @objid ("17d6fb15-aec7-4c58-a4b1-f2fd7528f36a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mEnd;
            }

            @objid ("dc97c757-38af-4514-a107-a3a1165c8c0c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mEnd = value;
            }

            @objid ("975aa052-b29f-4383-a4d9-e168f5662eab")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.EndedDep();
            }

        }

        @objid ("bd83a1cb-e193-4b4e-9ed9-51dafd3cd692")
        public static class StartToEndMessageSmDependency extends SmMultipleDependency {
            @objid ("76909f1d-d70e-460a-bad5-b190df62770a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationChannelData)data).mStartToEndMessage != null)? ((CommunicationChannelData)data).mStartToEndMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("03e30515-13e3-4638-9e3e-be26c1e4aae3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationChannelData) data).mStartToEndMessage = new ArrayList<>(initialCapacity);
                return ((CommunicationChannelData) data).mStartToEndMessage;
            }

            @objid ("9533f889-0aba-4467-83fe-2bb2f05f300a")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.ChannelDep();
            }

        }

        @objid ("88bc8eba-68f4-4994-ad72-7a2adfc15f37")
        public static class EndToStartMessageSmDependency extends SmMultipleDependency {
            @objid ("9259f504-5366-4271-8ca9-a1b2b64e1e75")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationChannelData)data).mEndToStartMessage != null)? ((CommunicationChannelData)data).mEndToStartMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("df9d5da2-7091-4404-b577-155aca8e86af")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationChannelData) data).mEndToStartMessage = new ArrayList<>(initialCapacity);
                return ((CommunicationChannelData) data).mEndToStartMessage;
            }

            @objid ("7aaef4f8-fcfc-450a-9dc2-793d2d2ad137")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.InvertedChannelDep();
            }

        }

        @objid ("aba7d0f8-de32-4739-96cf-24ff1f384181")
        public static class NaryChannelSmDependency extends SmSingleDependency {
            @objid ("645f7699-5b6f-4994-b62a-e2f0b907758f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mNaryChannel;
            }

            @objid ("16d2e971-1c6a-4759-9475-be67bbf3992c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mNaryChannel = value;
            }

            @objid ("c161e98d-7738-4dfb-9bc6-ff17ec756dac")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.SentDep();
            }

        }

    }

}
