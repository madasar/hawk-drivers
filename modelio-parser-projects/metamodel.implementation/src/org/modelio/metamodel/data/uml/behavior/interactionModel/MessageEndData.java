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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageEndImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
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

@objid ("004a25fe-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=MessageEnd.class, factory=MessageEndData.Metadata.ObjectFactory.class)
public abstract class MessageEndData extends OccurrenceSpecificationData {
    @objid ("f1e8aafe-d5c2-4f83-8e56-add926bd34f1")
    @SmaMetaAssociation(metaName="ReceivedMessage", typeDataClass=MessageData.class, min=0, max=1, smAssociationClass=Metadata.ReceivedMessageSmDependency.class, istodelete = true)
     SmObjectImpl mReceivedMessage;

    @objid ("e867d048-cc8c-466c-9c0a-6c6f92b2aaed")
    @SmaMetaAssociation(metaName="SentMessage", typeDataClass=MessageData.class, min=0, max=1, smAssociationClass=Metadata.SentMessageSmDependency.class, component = true, istodelete = true)
     SmObjectImpl mSentMessage;

    @objid ("dfaa10d5-0c37-4fc2-80f2-47b2744f0e01")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004ad490-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f79d0062-f612-4e4c-8d11-ebdbed4d700e")
        private static SmClass smClass = null;

        @objid ("783793a9-8863-4cee-aae8-50396de805b2")
        private static SmDependency ReceivedMessageDep = null;

        @objid ("be09a2de-41ea-482a-8e63-46c63bde36b2")
        private static SmDependency SentMessageDep = null;

        @objid ("277762b7-042f-4cb2-829f-49ff4e558ee6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b21349e7-29f0-46df-b9e0-df7a93cc750b")
        public static SmDependency ReceivedMessageDep() {
            if (ReceivedMessageDep == null) {
            	ReceivedMessageDep = classof().getDependencyDef("ReceivedMessage");
            }
            return ReceivedMessageDep;
        }

        @objid ("95ebe79f-2a7e-4e97-857a-8c9418c9e563")
        public static SmDependency SentMessageDep() {
            if (SentMessageDep == null) {
            	SentMessageDep = classof().getDependencyDef("SentMessage");
            }
            return SentMessageDep;
        }

        @objid ("4bbc4e51-b6e3-41d2-832f-071f8483e85f")
        public static SmDependency getSentMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentMessageDep;
        }

        @objid ("ceb1aff7-0236-46df-a9ce-9374a78aed07")
        public static SmDependency getReceivedMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedMessageDep;
        }

        @objid ("27008934-a4d2-4822-bc73-ebe769724530")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004b1676-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2f1fdcc1-ee35-4299-94fb-d6a2f7dabef2")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("c1194809-6906-46ad-9675-cf49bd08d207")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004b7850-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SentMessageSmDependency extends SmSingleDependency {
            @objid ("41a711da-3508-4522-af69-a34060d57f3c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageEndData) data).mSentMessage;
            }

            @objid ("4f423dab-b094-4b0d-b6cf-83ccf81e5678")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageEndData) data).mSentMessage = value;
            }

            @objid ("59e775eb-78e7-48e0-a47e-b19ddac50ed6")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.SendEventDep();
            }

        }

        @objid ("004beefc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceivedMessageSmDependency extends SmSingleDependency {
            @objid ("75d70af5-f700-451b-9c57-8e666cb52367")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageEndData) data).mReceivedMessage;
            }

            @objid ("b9c09637-b8bf-4985-98fc-d48cc1e302a4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageEndData) data).mReceivedMessage = value;
            }

            @objid ("9d6506af-2a0c-42a9-b95c-f9175bf5804a")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.ReceiveEventDep();
            }

        }

    }

}
