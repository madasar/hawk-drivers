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
import org.modelio.metamodel.data.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataOutputData;
import org.modelio.metamodel.data.uml.behavior.activityModel.PinData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorParameterData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.statik.ParameterImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.ParameterEffectKind;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.PassingMode;
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

@objid ("0018552e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Parameter.class, factory=ParameterData.Metadata.ObjectFactory.class)
public class ParameterData extends ModelElementData {
    @objid ("f08a6610-1c66-4159-a0a7-0e6b0a559dde")
    @SmaMetaAttribute(metaName="ParameterPassing", type=PassingMode.class, smAttributeClass=Metadata.ParameterPassingSmAttribute.class)
     Object mParameterPassing = PassingMode.IN;

    @objid ("dc7ed468-7111-4372-b118-9e3838e7f930")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "1";

    @objid ("f1bfacb1-2b55-422c-a4a1-98988f92e4fc")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("9f668785-5d55-4a61-8007-6f37ca223e28")
    @SmaMetaAttribute(metaName="TypeConstraint", type=String.class, smAttributeClass=Metadata.TypeConstraintSmAttribute.class)
     Object mTypeConstraint = "";

    @objid ("6ca22942-03f9-4d68-9a23-1f0c1e38f06e")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("cfe16bca-6da4-4f2f-a718-7e300a8b6d4e")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("61360f41-c5ec-4345-9ac6-2961b03e1c93")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("1de3d9ea-7e40-4ea1-a099-bb5f4fea41f1")
    @SmaMetaAttribute(metaName="IsException", type=Boolean.class, smAttributeClass=Metadata.IsExceptionSmAttribute.class)
     Object mIsException = false;

    @objid ("831217e1-9aef-4eb0-aea2-54ebfcc28513")
    @SmaMetaAttribute(metaName="IsStream", type=Boolean.class, smAttributeClass=Metadata.IsStreamSmAttribute.class)
     Object mIsStream = false;

    @objid ("ecc88005-bf0b-4305-83bf-9a5d5fb34918")
    @SmaMetaAttribute(metaName="Effect", type=ParameterEffectKind.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = ParameterEffectKind.READEFFECT;

    @objid ("f646b99a-9548-42a7-8a18-7c534057d8ef")
    @SmaMetaAssociation(metaName="BpmnRepresentingDataInput", typeDataClass=BpmnDataInputData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentingDataInputSmDependency.class)
     List<SmObjectImpl> mBpmnRepresentingDataInput = null;

    @objid ("056aeaf8-13b4-467b-9b41-d3fa41358202")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("6deb6481-128c-4484-b028-7d649f53bd27")
    @SmaMetaAssociation(metaName="Composed", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ComposedSmDependency.class)
     SmObjectImpl mComposed;

    @objid ("2f3f64a9-e17d-4bf8-88a8-41fc4b579bbe")
    @SmaMetaAssociation(metaName="Matching", typeDataClass=PinData.class, min=0, max=-1, smAssociationClass=Metadata.MatchingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mMatching = null;

    @objid ("7a4d7d62-6008-4f09-8d08-21d0d130a10a")
    @SmaMetaAssociation(metaName="BpmnRepresentingDataOutput", typeDataClass=BpmnDataOutputData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentingDataOutputSmDependency.class)
     List<SmObjectImpl> mBpmnRepresentingDataOutput = null;

    @objid ("e70b83a4-ab78-4dce-bb64-5ad57b86e5cd")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("64944bf8-1034-4ec6-ab55-d7af718e8bb9")
    @SmaMetaAssociation(metaName="Returned", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ReturnedSmDependency.class)
     SmObjectImpl mReturned;

    @objid ("c1a6bb9d-7306-4286-bcb0-c61260ee38d5")
    @SmaMetaAssociation(metaName="BehaviorParam", typeDataClass=BehaviorParameterData.class, min=0, max=-1, smAssociationClass=Metadata.BehaviorParamSmDependency.class, istodelete = true)
     List<SmObjectImpl> mBehaviorParam = null;

    @objid ("7782a9c7-b51c-4213-bb25-69ef881ffb44")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00834ec4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("dd7bd61a-ac24-4310-9b83-9f490ac81560")
        private static SmClass smClass = null;

        @objid ("de7f4f54-2c50-4327-b094-29540971da62")
        private static SmAttribute ParameterPassingAtt = null;

        @objid ("e55f1cbb-b95f-4dae-9e68-7afa93b6b974")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("f69d7ea1-26fa-45cf-8500-07fdaaa46917")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("977dc466-91b1-4acb-a524-4e27d8cd72b2")
        private static SmAttribute TypeConstraintAtt = null;

        @objid ("2ebe7c89-7dcb-4dd0-98fa-bcd806466909")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("8d214974-e530-4789-a554-34bc87b00d28")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("b0258498-79c4-4f18-b143-e8c9b856373a")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("fc7d96c6-672c-4997-ae1c-a6f2858e8934")
        private static SmAttribute IsExceptionAtt = null;

        @objid ("de278378-7fa4-4de0-ab25-c6dea865b093")
        private static SmAttribute IsStreamAtt = null;

        @objid ("e75ac8ba-fe22-4598-9eb6-81a01fdf7174")
        private static SmAttribute EffectAtt = null;

        @objid ("7a943c33-9ef6-4a20-b5d9-0e613ddb871e")
        private static SmDependency BpmnRepresentingDataInputDep = null;

        @objid ("dbc8e29d-7c02-4530-b7f1-35dc6008766f")
        private static SmDependency TypeDep = null;

        @objid ("2ff81dac-9e4c-4a8b-bfce-887d3b614ad0")
        private static SmDependency ComposedDep = null;

        @objid ("d4debfd1-8945-4eca-b87d-04c64a3c7f2c")
        private static SmDependency MatchingDep = null;

        @objid ("7ec132d4-2350-421c-a751-fdb6e51262f4")
        private static SmDependency BpmnRepresentingDataOutputDep = null;

        @objid ("7900de85-04ea-4624-958e-3bd4886b8487")
        private static SmDependency SRepresentationDep = null;

        @objid ("3df6a923-6547-43f8-a4d0-9a68f6100589")
        private static SmDependency ReturnedDep = null;

        @objid ("2ebc8b67-9daf-4b20-88f7-46f350e5fcf4")
        private static SmDependency BehaviorParamDep = null;

        @objid ("4995603e-91b7-4d2e-8f1f-4bfbd4eb8ea8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c2fbd784-7be8-4957-a966-37f64777de6e")
        public static SmAttribute ParameterPassingAtt() {
            if (ParameterPassingAtt == null) {
            	ParameterPassingAtt = classof().getAttributeDef("ParameterPassing");
            }
            return ParameterPassingAtt;
        }

        @objid ("e659773c-0145-45bd-8561-590b0d7e0359")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("9bfa8b1f-9d3d-4b71-a112-59bd0754a883")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("b1debce8-aae3-4533-99ff-3aee0114090f")
        public static SmAttribute TypeConstraintAtt() {
            if (TypeConstraintAtt == null) {
            	TypeConstraintAtt = classof().getAttributeDef("TypeConstraint");
            }
            return TypeConstraintAtt;
        }

        @objid ("6b4df664-397f-4e13-9ce1-39c0b94c7122")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("45a919a7-9706-4ce5-b442-4ba9cfe424db")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("0cdbaa6a-d29d-4171-a830-2b0cfc0fcd5e")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("4692b384-b284-443c-81ce-8f3ae29d3171")
        public static SmAttribute IsExceptionAtt() {
            if (IsExceptionAtt == null) {
            	IsExceptionAtt = classof().getAttributeDef("IsException");
            }
            return IsExceptionAtt;
        }

        @objid ("257a6200-5cf3-49de-8c63-50613e4eba18")
        public static SmAttribute IsStreamAtt() {
            if (IsStreamAtt == null) {
            	IsStreamAtt = classof().getAttributeDef("IsStream");
            }
            return IsStreamAtt;
        }

        @objid ("99fb1966-5c51-48bd-8f90-56d29becb3e2")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("42132f10-fbd6-4ced-8ec1-f71a77959401")
        public static SmDependency BpmnRepresentingDataInputDep() {
            if (BpmnRepresentingDataInputDep == null) {
            	BpmnRepresentingDataInputDep = classof().getDependencyDef("BpmnRepresentingDataInput");
            }
            return BpmnRepresentingDataInputDep;
        }

        @objid ("71275812-5582-4bd8-ade0-8db616f3151d")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("ece0e611-6a91-456b-bf6f-0ef10e7d8bbe")
        public static SmDependency ComposedDep() {
            if (ComposedDep == null) {
            	ComposedDep = classof().getDependencyDef("Composed");
            }
            return ComposedDep;
        }

        @objid ("c68f4767-c7ee-4646-aa10-027d3bde8ddc")
        public static SmDependency MatchingDep() {
            if (MatchingDep == null) {
            	MatchingDep = classof().getDependencyDef("Matching");
            }
            return MatchingDep;
        }

        @objid ("47340286-8e49-4bbb-a759-19c3d6980aa3")
        public static SmDependency BpmnRepresentingDataOutputDep() {
            if (BpmnRepresentingDataOutputDep == null) {
            	BpmnRepresentingDataOutputDep = classof().getDependencyDef("BpmnRepresentingDataOutput");
            }
            return BpmnRepresentingDataOutputDep;
        }

        @objid ("4651aba8-ef07-4187-a01d-39761a5b239e")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("238e9989-a482-40e3-814a-abefbe7fb033")
        public static SmDependency ReturnedDep() {
            if (ReturnedDep == null) {
            	ReturnedDep = classof().getDependencyDef("Returned");
            }
            return ReturnedDep;
        }

        @objid ("9bcff3a5-91f3-4863-b201-13b23e7ff9ba")
        public static SmDependency BehaviorParamDep() {
            if (BehaviorParamDep == null) {
            	BehaviorParamDep = classof().getDependencyDef("BehaviorParam");
            }
            return BehaviorParamDep;
        }

        @objid ("ea0290e4-251a-477c-925b-62c4461b51c8")
        public static SmDependency getBpmnRepresentingDataOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentingDataOutputDep;
        }

        @objid ("43accaea-5330-46f3-b75c-2629ce3f76a0")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("554302e6-1462-43d9-a7f6-6dcd71f0e7e7")
        public static SmAttribute getTypeConstraintAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeConstraintAtt;
        }

        @objid ("fe19f6fc-a133-480b-a6bb-6f849aa40674")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("a4ec0405-dfbf-4bb4-8e1c-d9abb7788067")
        public static SmDependency getComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComposedDep;
        }

        @objid ("1596f923-e676-424a-86a3-8b5999a4261f")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("f2798130-6e62-4653-966d-98ff13466c00")
        public static SmDependency getBpmnRepresentingDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentingDataInputDep;
        }

        @objid ("f8858192-529a-4d11-8d49-a954df451933")
        public static SmDependency getBehaviorParamDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorParamDep;
        }

        @objid ("c2a5cfd0-50c0-4f4e-8b83-c85d4731f483")
        public static SmAttribute getIsExceptionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExceptionAtt;
        }

        @objid ("bccd597d-4217-4369-a67c-9ce01c325a57")
        public static SmAttribute getIsStreamAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsStreamAtt;
        }

        @objid ("0b12a832-12a5-4d1c-9916-842ceef03615")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("283e48e3-d1fc-4bd8-a801-249ecadabd20")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("5b31fd17-229f-4e87-ae50-e69ffad188bd")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("09c4a00c-9812-493a-90f0-af160d224a9e")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("a64c1d9b-68b6-432c-9824-1fd772df6d09")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("60457f51-b5b8-4ad5-9b5a-4771c7925f92")
        public static SmAttribute getParameterPassingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterPassingAtt;
        }

        @objid ("d55b80e4-71b5-4641-8ab4-cbe333f0729e")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("a808034c-fb6f-4e95-b2da-aa5191fd7d9a")
        public static SmDependency getMatchingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatchingDep;
        }

        @objid ("f596529b-5376-407d-8f0f-fcb1ef50a232")
        public static SmDependency getReturnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReturnedDep;
        }

        @objid ("00839032-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c2784883-430f-4b91-a4a8-5820a0d75616")
            public ISmObjectData createData() {
                return new ParameterData();
            }

            @objid ("1839fb80-9cce-4631-a4e4-62ee3db92e50")
            public SmObjectImpl createImpl() {
                return new ParameterImpl();
            }

        }

        @objid ("0083f360-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParameterPassingSmAttribute extends SmAttribute {
            @objid ("629d4100-af7c-4c85-8a97-7aa27662ae99")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mParameterPassing;
            }

            @objid ("0f39870a-1717-4428-b24a-96d15e4f1719")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mParameterPassing = value;
            }

        }

        @objid ("008454d6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("9bb99e64-2c90-4d8c-af38-33f352a101bf")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mMultiplicityMin;
            }

            @objid ("4d06a134-0c73-4380-8428-d18211332303")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mMultiplicityMin = value;
            }

        }

        @objid ("0084b660-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("715ef9a0-31cd-46e4-ba5e-a3b3fc86a1d6")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mMultiplicityMax;
            }

            @objid ("bc8271dd-a68d-40f4-b431-db5854aeb883")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mMultiplicityMax = value;
            }

        }

        @objid ("00852528-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeConstraintSmAttribute extends SmAttribute {
            @objid ("4e5bdf8d-de39-4f52-91c3-213773ab8b68")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mTypeConstraint;
            }

            @objid ("3aa7f44e-1d81-4041-9978-31f9db836c41")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mTypeConstraint = value;
            }

        }

        @objid ("008589f0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("e590f7ca-c626-4729-bc3c-4c30e0273f90")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mDefaultValue;
            }

            @objid ("56dd0701-750b-4d02-b86f-1192a7074e4d")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mDefaultValue = value;
            }

        }

        @objid ("0085ed64-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("5bd683f1-5337-4fa6-908e-53eb5ca3e75c")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsOrdered;
            }

            @objid ("f662c06d-fdb7-40f3-b48d-f89c0cd8ed26")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsOrdered = value;
            }

        }

        @objid ("008658d0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("45af75dc-964b-484e-b244-d2f0e0a6ec73")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsUnique;
            }

            @objid ("b971ca06-4cd3-4eb3-8e44-baf67fa29a29")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsUnique = value;
            }

        }

        @objid ("0086beec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsExceptionSmAttribute extends SmAttribute {
            @objid ("71e88b4c-5ea7-4455-a720-2ef53d064ea8")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsException;
            }

            @objid ("e514f4a4-7cd1-42a3-be0c-adb9249341a2")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsException = value;
            }

        }

        @objid ("00872436-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsStreamSmAttribute extends SmAttribute {
            @objid ("609904d3-3170-4eb8-8a99-d192289c2f2e")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsStream;
            }

            @objid ("09544a23-0e6a-4c0f-9d66-d6c15decaf76")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsStream = value;
            }

        }

        @objid ("008790d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("809c6c79-39bc-4a46-ba1e-7ec49057360d")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mEffect;
            }

            @objid ("0979d86a-cff9-4a79-9d05-7eff49a4b2bb")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mEffect = value;
            }

        }

        @objid ("0087fba4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MatchingSmDependency extends SmMultipleDependency {
            @objid ("a76edc97-f0e4-49bd-9ecb-ec8bd6a0ae0e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mMatching != null)? ((ParameterData)data).mMatching:SmMultipleDependency.EMPTY;
            }

            @objid ("9082e260-98ab-4fe3-90f2-a9dba439d0ae")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mMatching = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mMatching;
            }

            @objid ("f842a87a-ee3c-451a-942d-b4b64b1591dd")
            @Override
            public SmDependency getSymetric() {
                return PinData.Metadata.MatchedDep();
            }

        }

        @objid ("00886512-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("a0cd45c1-6742-4d6c-8d79-47c7fe7da9be")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mSRepresentation != null)? ((ParameterData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("bde26c7d-aab2-4a96-b24c-e7592a3251b1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mSRepresentation;
            }

            @objid ("e6d7ee99-392d-4032-8d27-01ec2b97d130")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.PBaseDep();
            }

        }

        @objid ("0088cee4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("27a9bcb2-7a56-45be-9952-21ebf1f2f20e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mType;
            }

            @objid ("8963e6b6-8d92-4ca8-b1d6-59641fbe3e18")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mType = value;
            }

            @objid ("861f2ad3-5203-496b-9358-6bb1a27c53c7")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceDep();
            }

        }

        @objid ("00894b12-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BehaviorParamSmDependency extends SmMultipleDependency {
            @objid ("230fbc07-5e48-46c0-be28-0ba7646e2be5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBehaviorParam != null)? ((ParameterData)data).mBehaviorParam:SmMultipleDependency.EMPTY;
            }

            @objid ("05154f1c-1b6b-4549-8eb1-a06c4963aa51")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBehaviorParam = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBehaviorParam;
            }

            @objid ("90626cae-3810-4130-a8cd-46588f8bb472")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.MappedDep();
            }

        }

        @objid ("0089b516-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ComposedSmDependency extends SmSingleDependency {
            @objid ("c2dbd4ff-19ff-428f-8cf8-7e3ba5f482cd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mComposed;
            }

            @objid ("3f679daa-8c20-4ccb-b04f-6612cd9517fd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mComposed = value;
            }

            @objid ("23433139-076e-4f78-8f74-011dfb8b4b45")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.IODep();
            }

        }

        @objid ("008a3360-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReturnedSmDependency extends SmSingleDependency {
            @objid ("c7b5b7e0-b66b-4b02-a04f-e4b03bad3128")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mReturned;
            }

            @objid ("3fcb42a3-d96d-489e-8078-15d4a9bfac4a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mReturned = value;
            }

            @objid ("fd9fda27-f51f-4a40-829c-2f243428415d")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ReturnDep();
            }

        }

        @objid ("008ab18c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentingDataOutputSmDependency extends SmMultipleDependency {
            @objid ("f6b1bff5-059b-4229-8247-030d93e10378")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBpmnRepresentingDataOutput != null)? ((ParameterData)data).mBpmnRepresentingDataOutput:SmMultipleDependency.EMPTY;
            }

            @objid ("b137695f-42f6-44b8-ae56-cdcdc8cc5c85")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBpmnRepresentingDataOutput = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBpmnRepresentingDataOutput;
            }

            @objid ("8b40c396-fb45-4e95-9048-5a57e1174b45")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.RepresentedParameterDep();
            }

        }

        @objid ("008b1dc0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentingDataInputSmDependency extends SmMultipleDependency {
            @objid ("c4eb1dcb-eb1a-4923-a939-da096cefeb3c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBpmnRepresentingDataInput != null)? ((ParameterData)data).mBpmnRepresentingDataInput:SmMultipleDependency.EMPTY;
            }

            @objid ("fdb37f5f-43a5-4c9e-99b0-ecce38d205e2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBpmnRepresentingDataInput = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBpmnRepresentingDataInput;
            }

            @objid ("df65c000-534a-4858-8a81-a407da38fab6")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.RepresentedParameterDep();
            }

        }

    }

}
