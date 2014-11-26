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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.data.bpmn.events.BpmnCatchEventData;
import org.modelio.metamodel.data.bpmn.events.BpmnThrowEventData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.bpmn.objects.BpmnSequenceFlowDataAssociationData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataAssociationImpl;
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

@objid ("0004de90-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataAssociation.class, factory=BpmnDataAssociationData.Metadata.ObjectFactory.class)
public class BpmnDataAssociationData extends BpmnBaseElementData {
    @objid ("30339b4a-60e5-40e4-8555-f69127701bdb")
    @SmaMetaAttribute(metaName="Assignment", type=String.class, smAttributeClass=Metadata.AssignmentSmAttribute.class)
     Object mAssignment = "";

    @objid ("5c2c37d9-c701-4e4a-8e8c-b3ffa867f75f")
    @SmaMetaAttribute(metaName="Transfomation", type=String.class, smAttributeClass=Metadata.TransfomationSmAttribute.class)
     Object mTransfomation = "";

    @objid ("86207453-1dfb-4d8d-a146-88247ba2f22f")
    @SmaMetaAttribute(metaName="Language", type=String.class, smAttributeClass=Metadata.LanguageSmAttribute.class)
     Object mLanguage = "";

    @objid ("ae99542b-2488-4d17-8bb2-a6f49a16b860")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     List<SmObjectImpl> mSourceRef = null;

    @objid ("e7b1075d-2557-44ef-b284-71eed6ecd6e1")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnItemAwareElementData.class, min=0, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("07b01989-95e1-4fec-b5d7-b84590cbd551")
    @SmaMetaAssociation(metaName="EndingActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.EndingActivitySmDependency.class)
     SmObjectImpl mEndingActivity;

    @objid ("003107a7-09a1-48d3-9426-7cda45295a95")
    @SmaMetaAssociation(metaName="StartingActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.StartingActivitySmDependency.class)
     SmObjectImpl mStartingActivity;

    @objid ("6ff319b3-7098-4a2e-b194-b146e665ad82")
    @SmaMetaAssociation(metaName="StartingEvent", typeDataClass=BpmnThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.StartingEventSmDependency.class)
     SmObjectImpl mStartingEvent;

    @objid ("b7f4b885-2138-4eae-a615-6a8b7c2edd48")
    @SmaMetaAssociation(metaName="VisualShortCut", typeDataClass=BpmnSequenceFlowDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.VisualShortCutSmDependency.class)
     List<SmObjectImpl> mVisualShortCut = null;

    @objid ("e22586fa-9cfb-43ee-8ae7-f26a1196cc68")
    @SmaMetaAssociation(metaName="EndingEvent", typeDataClass=BpmnCatchEventData.class, min=0, max=1, smAssociationClass=Metadata.EndingEventSmDependency.class)
     SmObjectImpl mEndingEvent;

    @objid ("daa67c69-ef50-49ec-bab7-d380a25fdcd6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0071e6de-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8557f7d7-9e55-40fd-9f02-604b9c72a6c4")
        private static SmClass smClass = null;

        @objid ("06ccf0ca-5608-4aac-a36e-fb4d1b521c93")
        private static SmAttribute AssignmentAtt = null;

        @objid ("a53002e7-8871-4083-a251-636878c5541e")
        private static SmAttribute TransfomationAtt = null;

        @objid ("5f27f641-5815-4032-82c4-f1454334ef1c")
        private static SmAttribute LanguageAtt = null;

        @objid ("441ee1ac-c923-4a06-b5b9-2b8b9ffb1b9d")
        private static SmDependency SourceRefDep = null;

        @objid ("34a33fde-2bde-4c5a-86c0-d4937148162e")
        private static SmDependency TargetRefDep = null;

        @objid ("75f2077b-7a82-4027-aea7-f60c7769203b")
        private static SmDependency EndingActivityDep = null;

        @objid ("f662f02a-4d19-4b91-b456-a817bde6c784")
        private static SmDependency StartingActivityDep = null;

        @objid ("44578c45-d7ac-4f51-90d9-69114a878567")
        private static SmDependency StartingEventDep = null;

        @objid ("ec41068a-70c2-4621-86b7-cedfa5130e61")
        private static SmDependency VisualShortCutDep = null;

        @objid ("8e619c39-4cf8-4837-8b67-d5c7111afa5e")
        private static SmDependency EndingEventDep = null;

        @objid ("5ebd19de-416a-4d27-95fe-6373507c25b7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f6e226dd-289a-4b04-995b-ea91e543cd48")
        public static SmAttribute AssignmentAtt() {
            if (AssignmentAtt == null) {
            	AssignmentAtt = classof().getAttributeDef("Assignment");
            }
            return AssignmentAtt;
        }

        @objid ("aa8622cd-8793-4095-920c-d34fc58b9d34")
        public static SmAttribute TransfomationAtt() {
            if (TransfomationAtt == null) {
            	TransfomationAtt = classof().getAttributeDef("Transfomation");
            }
            return TransfomationAtt;
        }

        @objid ("8666e059-a842-48ad-8b44-6552d5c1a50c")
        public static SmAttribute LanguageAtt() {
            if (LanguageAtt == null) {
            	LanguageAtt = classof().getAttributeDef("Language");
            }
            return LanguageAtt;
        }

        @objid ("50eda6a9-9d06-4b43-8ca4-0bcb74b8c98c")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("d7fffc62-d4d6-4954-8770-be89178319c9")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("6582ad26-c5c4-41e1-a066-ad526741aa31")
        public static SmDependency EndingActivityDep() {
            if (EndingActivityDep == null) {
            	EndingActivityDep = classof().getDependencyDef("EndingActivity");
            }
            return EndingActivityDep;
        }

        @objid ("7b3ddb87-f66e-40dc-be70-e3268b1f3aee")
        public static SmDependency StartingActivityDep() {
            if (StartingActivityDep == null) {
            	StartingActivityDep = classof().getDependencyDef("StartingActivity");
            }
            return StartingActivityDep;
        }

        @objid ("124a7d26-3bb6-42ec-9f5f-62087ff5f515")
        public static SmDependency StartingEventDep() {
            if (StartingEventDep == null) {
            	StartingEventDep = classof().getDependencyDef("StartingEvent");
            }
            return StartingEventDep;
        }

        @objid ("76428def-30fe-4f17-b453-4ad15976b362")
        public static SmDependency VisualShortCutDep() {
            if (VisualShortCutDep == null) {
            	VisualShortCutDep = classof().getDependencyDef("VisualShortCut");
            }
            return VisualShortCutDep;
        }

        @objid ("b49b46b6-7c63-4deb-9bd0-4f47e3d5bd53")
        public static SmDependency EndingEventDep() {
            if (EndingEventDep == null) {
            	EndingEventDep = classof().getDependencyDef("EndingEvent");
            }
            return EndingEventDep;
        }

        @objid ("5718b212-681b-4a69-847d-3ec47a9d3cec")
        public static SmDependency getVisualShortCutDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisualShortCutDep;
        }

        @objid ("9848aab7-fa46-402b-8335-3fa2eff72f22")
        public static SmDependency getStartingActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartingActivityDep;
        }

        @objid ("d12a45d2-34c5-4784-890a-c6324c71ad1b")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("542381fd-dee3-4364-95e2-f91c6e9289b7")
        public static SmDependency getEndingEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndingEventDep;
        }

        @objid ("b0e26cfb-d1d9-4758-92d1-485b0b9b6aca")
        public static SmAttribute getAssignmentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssignmentAtt;
        }

        @objid ("1252e727-1bce-4e00-ac39-85bb2601ecf6")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("ff01d271-7491-4ebd-9db0-e9da4ac42f41")
        public static SmDependency getEndingActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndingActivityDep;
        }

        @objid ("80c050bf-eebe-492e-8210-5aae4a01fb0f")
        public static SmDependency getStartingEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartingEventDep;
        }

        @objid ("22f7cbf3-fb2e-4b0e-9479-65a5feb6f39a")
        public static SmAttribute getLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LanguageAtt;
        }

        @objid ("0ab84e4d-4aa7-4dd1-a9f5-96f49246419d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("25ecebef-6755-41ad-a6da-ce81b7c921f5")
        public static SmAttribute getTransfomationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TransfomationAtt;
        }

        @objid ("00722784-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4958ff4d-bf1a-4634-9a3e-72ee2250375a")
            public ISmObjectData createData() {
                return new BpmnDataAssociationData();
            }

            @objid ("d5e41251-7415-41b1-a6b5-e8f3d28a7264")
            public SmObjectImpl createImpl() {
                return new BpmnDataAssociationImpl();
            }

        }

        @objid ("00728d5a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AssignmentSmAttribute extends SmAttribute {
            @objid ("30d084f7-026c-47eb-9efd-ea7cb94f3ec4")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mAssignment;
            }

            @objid ("c6c95cb5-2122-4086-b744-d3a08ac531a9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mAssignment = value;
            }

        }

        @objid ("0072ed90-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TransfomationSmAttribute extends SmAttribute {
            @objid ("c1249e89-ebc3-4d69-a1a5-dd839c149d8b")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mTransfomation;
            }

            @objid ("baf6eff4-81f6-4e61-ac82-d4162c7c4e61")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mTransfomation = value;
            }

        }

        @objid ("00734d62-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LanguageSmAttribute extends SmAttribute {
            @objid ("9396166c-0edb-4acb-9381-6b5e84c22ba2")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mLanguage;
            }

            @objid ("25fb99e2-26d5-4333-861e-112775b7b300")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mLanguage = value;
            }

        }

        @objid ("0073b0ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmMultipleDependency {
            @objid ("8bd1901f-df22-4def-a6fc-eb395d10a72e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnDataAssociationData)data).mSourceRef != null)? ((BpmnDataAssociationData)data).mSourceRef:SmMultipleDependency.EMPTY;
            }

            @objid ("e7839994-c6b3-49d1-91da-5a817015e9f5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnDataAssociationData) data).mSourceRef = new ArrayList<>(initialCapacity);
                return ((BpmnDataAssociationData) data).mSourceRef;
            }

            @objid ("b18ab5a9-98fc-4c2a-9247-46f534ba60a4")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.SourceOfDataAssociationDep();
            }

        }

        @objid ("00741418-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("7bd03311-ffcc-4c1d-b776-3b75bb0617cd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mTargetRef;
            }

            @objid ("8cb26ec1-902f-4cdc-94d5-1ab8bc3cb5fc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mTargetRef = value;
            }

            @objid ("90a8a086-86c8-411b-afc2-b14cb98db99c")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.TargetOfDataAssociationDep();
            }

        }

        @objid ("007488f8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class VisualShortCutSmDependency extends SmMultipleDependency {
            @objid ("794dbcda-c2a1-4653-940d-71130338aaeb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnDataAssociationData)data).mVisualShortCut != null)? ((BpmnDataAssociationData)data).mVisualShortCut:SmMultipleDependency.EMPTY;
            }

            @objid ("c2b2cae8-2f6b-499f-855a-25acf146a151")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnDataAssociationData) data).mVisualShortCut = new ArrayList<>(initialCapacity);
                return ((BpmnDataAssociationData) data).mVisualShortCut;
            }

            @objid ("7859d798-4b2c-4833-a1cd-4f4d6fd53734")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowDataAssociationData.Metadata.DataAssociationDep();
            }

        }

        @objid ("0074ed98-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartingActivitySmDependency extends SmSingleDependency {
            @objid ("ea500d4c-8b85-4b0e-90a5-1592afcdf387")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mStartingActivity;
            }

            @objid ("38726043-d045-42cb-8c7e-1263148284a5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mStartingActivity = value;
            }

            @objid ("6c7a9b36-9a49-45a8-b6d1-68004e07eec1")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DataInputAssociationDep();
            }

        }

        @objid ("007564c6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartingEventSmDependency extends SmSingleDependency {
            @objid ("bea09279-9709-4b4c-9bad-bf51837fd453")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mStartingEvent;
            }

            @objid ("25e57347-7671-436b-8b40-1eed0d0e1eda")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mStartingEvent = value;
            }

            @objid ("e558b4b7-46d5-4411-80e2-64d880b2236e")
            @Override
            public SmDependency getSymetric() {
                return BpmnThrowEventData.Metadata.DataInputAssociationDep();
            }

        }

        @objid ("0075dc80-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndingActivitySmDependency extends SmSingleDependency {
            @objid ("2144891d-d826-44bf-9558-d65d9a651ed3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mEndingActivity;
            }

            @objid ("09164f72-5e86-4b2a-92d7-8902580a2889")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mEndingActivity = value;
            }

            @objid ("3699b92a-0e72-47aa-a6c2-febc5afa0da4")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DataOutputAssociationDep();
            }

        }

        @objid ("00765412-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndingEventSmDependency extends SmSingleDependency {
            @objid ("e52164a6-c6fc-4cec-81fd-bed18298bf29")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mEndingEvent;
            }

            @objid ("a7992fb5-8e59-4235-8d0b-aed6919795d5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mEndingEvent = value;
            }

            @objid ("4481a2fc-7dbd-40e0-8028-d28168c9e763")
            @Override
            public SmDependency getSymetric() {
                return BpmnCatchEventData.Metadata.DataOutputAssociationDep();
            }

        }

    }

}
